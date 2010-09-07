/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * 
 * Copyright (C) 2006-2010 Adele Team/LIG/Grenoble University, France
 */
package fr.imag.adele.cadse.core.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import fr.imag.adele.cadse.core.LogicalWorkspace;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.Link;


/**
 * Implementation of a sort algorithm for computing the project order. This
 * algorithm handles cycles in the project reference graph in a reasonable way.
 * 
 * @since 2.1
 */
public class ComputeElementOrder {

	/*
	 * Prevent class from being instantiated.
	 */
	/**
	 * Instantiates a new compute item order.
	 */
	private ComputeElementOrder() {
		// not allowed
	}

	/**
	 * A directed graph. Once the vertexes and edges of the graph have been
	 * defined, the graph can be queried for the depth-first finish time of each
	 * vertex.
	 * <p>
	 * Ref: Cormen, Leiserson, and Rivest <it>Introduction to Algorithms</it>,
	 * McGraw-Hill, 1990. The depth-first search algorithm is in section 23.3.
	 * </p>
	 */
	public static class Digraph<T> {
		
		/**
		 * struct-like object for representing a vertex along with various
		 * values computed during depth-first search (DFS).
		 */
		public static class Vertex<T> {
			
			/** White is for marking vertexes as unvisited. */
			public static final String WHITE = "white"; //$NON-NLS-1$

			/**
			 * Grey is for marking vertexes as discovered but visit not yet
			 * finished.
			 */
			public static final String GREY = "grey"; //$NON-NLS-1$

			/** Black is for marking vertexes as visited. */
			public static final String BLACK = "black"; //$NON-NLS-1$

			/**
			 * Color of the vertex. One of <code>WHITE</code> (unvisited),
			 * <code>GREY</code> (visit in progress), or <code>BLACK</code>
			 * (visit finished). <code>WHITE</code> initially.
			 */
			public String color = WHITE;

			/**
			 * The DFS predecessor vertex, or <code>null</code> if there is no
			 * predecessor. <code>null</code> initially.
			 */
			public Vertex<T> predecessor = null;

			/**
			 * Timestamp indicating when the vertex was finished (became BLACK)
			 * in the DFS. Finish times are between 1 and the number of
			 * vertexes.
			 */
			public int finishTime;

			/** The id of this vertex. */
			public T id;

			/**
			 * Ordered list of adjacent vertexes. In other words, "this" is the
			 * "from" vertex and the elements of this list are all "to"
			 * vertexes. Element type: <code>Vertex</code>
			 */
			public List<Vertex<T>> adjacent = new ArrayList<Vertex<T>>(3);

			/**
			 * Creates a new vertex with the given id.
			 * 
			 * @param id
			 *            the vertex id
			 */
			public Vertex(T id) {
				this.id = id;
			}
		}

		/**
		 * Ordered list of all vertexes in this graph. Element type:
		 * <code>Vertex</code>
		 */
		private List<Vertex<T>> vertexList = new ArrayList<Vertex<T>>(100);

		/**
		 * Map from id to vertex. Key type: <code>Object</code>; value type:
		 * <code>Vertex</code>
		 */
		private Map<T,Vertex<T>> vertexMap = new HashMap<T,Vertex<T>>(100);

		/** DFS visit time. Non-negative. */
		private int time;

		/**
		 * Indicates whether the graph has been initialized. Initially
		 * <code>false</code>.
		 */
		private boolean initialized = false;

		/**
		 * Indicates whether the graph contains cycles. Initially
		 * <code>false</code>.
		 */
		private boolean cycles = false;

		/**
		 * Creates a new empty directed graph object.
		 * <p>
		 * After this graph's vertexes and edges are defined with
		 * <code>addVertex</code> and <code>addEdge</code>, call
		 * <code>freeze</code> to indicate that the graph is all there, and
		 * then call <code>idsByDFSFinishTime</code> to read off the vertexes
		 * ordered by DFS finish time.
		 * </p>
		 */
		public Digraph() {
			super();
		}

		/**
		 * Freezes this graph. No more vertexes or edges can be added to this
		 * graph after this method is called. Has no effect if the graph is
		 * already frozen.
		 */
		public void freeze() {
			if (!initialized) {
				initialized = true;
				// only perform depth-first-search once
				DFS();
			}
		}

		/**
		 * Defines a new vertex with the given id. The depth-first search is
		 * performed in the relative order in which vertexes were added to the
		 * graph.
		 * 
		 * @param id
		 *            the id of the vertex
		 * 
		 * @throws IllegalArgumentException
		 *             the illegal argument exception
		 * 
		 * @exception IllegalArgumentException
		 *                if the vertex id is already defined or if the graph is
		 *                frozen
		 */
		public void addVertex(T id) throws IllegalArgumentException {
			if (initialized) {
				throw new IllegalArgumentException();
			}
			Vertex<T> vertex = new Vertex<T>(id);
			Vertex<T> existing = vertexMap.put(id, vertex);
			// nip problems with duplicate vertexes in the bud
			if (existing != null) {
				throw new IllegalArgumentException();
			}
			vertexList.add(vertex);
		}

		/**
		 * Adds a new directed edge between the vertexes with the given ids.
		 * Vertexes for the given ids must be defined beforehand with
		 * <code>addVertex</code>. The depth-first search is performed in the
		 * relative order in which adjacent "to" vertexes were added to a given
		 * "from" index.
		 * 
		 * @param fromId
		 *            the id of the "from" vertex
		 * @param toId
		 *            the id of the "to" vertex
		 * 
		 * @throws IllegalArgumentException
		 *             the illegal argument exception
		 * 
		 * @exception IllegalArgumentException
		 *                if either vertex is undefined or if the graph is
		 *                frozen
		 */
		public void addEdge(T fromId, T toId) throws IllegalArgumentException {
			if (initialized) {
				throw new IllegalArgumentException();
			}
			Vertex<T> fromVertex = vertexMap.get(fromId);
			Vertex<T> toVertex = vertexMap.get(toId);
			// nip problems with bogus vertexes in the bud
			if (fromVertex == null) {
				throw new IllegalArgumentException();
			}
			if (toVertex == null) {
				throw new IllegalArgumentException();
			}
			fromVertex.adjacent.add(toVertex);
		}

		/**
		 * Returns the ids of the vertexes in this graph ordered by depth-first
		 * search finish time. The graph must be frozen.
		 * 
		 * @param increasing
		 *            <code>true</code> if objects are to be arranged into
		 *            increasing order of depth-first search finish time, and
		 *            <code>false</code> if objects are to be arranged into
		 *            decreasing order of depth-first search finish time
		 * 
		 * @return the list of ids ordered by depth-first search finish time
		 *         (element type: <code>Object</code>)
		 * 
		 * @exception IllegalArgumentException
		 *                if the graph is not frozen
		 */
		@SuppressWarnings("unchecked")
		public List<T> idsByDFSFinishTime(boolean increasing) {
			if (!initialized) {
				throw new IllegalArgumentException();
			}
			int len = vertexList.size();
			T[] r = (T[]) new Object[len];
			for (Vertex<T> vertex : vertexList) {
				int f = vertex.finishTime;
				// note that finish times start at 1, not 0
				if (increasing) {
					r[f - 1] = vertex.id;
				} else {
					r[len - f] = vertex.id;
				}
			}
			return Arrays.asList(r);
		}

		/**
		 * Returns whether the graph contains cycles. The graph must be frozen.
		 * 
		 * @return <code>true</code> if this graph contains at least one
		 *         cycle, and <code>false</code> if this graph is cycle free
		 * 
		 * @exception IllegalArgumentException
		 *                if the graph is not frozen
		 */
		public boolean containsCycles() {
			if (!initialized) {
				throw new IllegalArgumentException();
			}
			return cycles;
		}

		/**
		 * Returns the non-trivial components of this graph. A non-trivial
		 * component is a set of 2 or more vertexes that were traversed
		 * together. The graph must be frozen.
		 * 
		 * @return the possibly empty list of non-trivial components, where each
		 *         component is an array of ids (element type:
		 *         <code>Object[]</code>)
		 * 
		 * @exception IllegalArgumentException
		 *                if the graph is not frozen
		 */
		@SuppressWarnings("unchecked")
		public List<T[]> nonTrivialComponents() {
			if (!initialized) {
				throw new IllegalArgumentException();
			}
			// find the roots of each component
			// Map<Vertex,List<Object>> components
			Map<Vertex<T>,List<T>> components = new HashMap<Vertex<T>,List<T>>();
			for (Vertex<T> vertex : vertexList) {
				if (vertex.predecessor == null) {
					// this vertex is the root of a component
					// if component is non-trivial we will hit a child
				} else {
					// find the root ancestor of this vertex
					Vertex<T> root = vertex;
					while (root.predecessor != null) {
						root = root.predecessor;
					}
					List<T> component = components.get(root);
					if (component == null) {
						component = new ArrayList<T>(2);
						component.add(root.id);
						components.put(root, component);
					}
					component.add(vertex.id);
				}
			}
			List<T[]> result = new ArrayList<T[]>(components.size());
			for (List<T> component: components.values()) {
				if (component.size() > 1) {
					result.add((T[])component.toArray());
				}
			}
			return result;
		}

		/**
		 * Performs a depth-first search of this graph and records interesting
		 * info with each vertex, including DFS finish time. Does not employ
		 * recursion.
		 */
		
		@SuppressWarnings("unchecked")
		private void DFS() {
			// state machine rendition of the standard recursive DFS algorithm
			int state;
			final int NEXT_VERTEX = 1;
			final int START_DFS_VISIT = 2;
			final int NEXT_ADJACENT = 3;
			final int AFTER_NEXTED_DFS_VISIT = 4;
			// use precomputed objects to avoid garbage
			final Integer NEXT_VERTEX_OBJECT = new Integer(NEXT_VERTEX);
			final Integer AFTER_NEXTED_DFS_VISIT_OBJECT = new Integer(AFTER_NEXTED_DFS_VISIT);
			// initialize 
			// all vertex.color initially Vertex.WHITE;
			// all vertex.predecessor initially null;
			time = 0;
			// for a stack, append to the end of an array-based list
			List<Object> stack = new ArrayList<Object>(Math.max(1, vertexList.size()));
			Iterator<Vertex<T>> allAdjacent = null;
			Vertex<T> vertex = null;
			Iterator<Vertex<T>> allV = vertexList.iterator();
			state = NEXT_VERTEX;
			nextStateLoop: while (true) {
				switch (state) {
					case NEXT_VERTEX :
						// on entry, "allV" contains vertexes yet to be visited
						if (!allV.hasNext()) {
							// all done
							break nextStateLoop;
						}
						Vertex<T> nextVertex = allV.next();
						if (nextVertex.color == Vertex.WHITE) {
							stack.add(NEXT_VERTEX_OBJECT);
							vertex = nextVertex;
							state = START_DFS_VISIT;
							continue nextStateLoop;
						}
						//else
						state = NEXT_VERTEX;
						continue nextStateLoop;
					case START_DFS_VISIT :
						// on entry, "vertex" contains the vertex to be visited
						// top of stack is return code
						// mark the vertex as discovered
						vertex.color = Vertex.GREY;
						allAdjacent = vertex.adjacent.iterator();
						state = NEXT_ADJACENT;
						continue nextStateLoop;
					case NEXT_ADJACENT :
						// on entry, "allAdjacent" contains adjacent vertexes to
						// be visited; "vertex" contains vertex being visited
						if (allAdjacent.hasNext()) {
							Vertex<T> adjVertex = allAdjacent.next();
							if (adjVertex.color == Vertex.WHITE) {
								// explore edge from vertex to adjVertex
								adjVertex.predecessor = vertex;
								stack.add(allAdjacent);
								stack.add(vertex);
								stack.add(AFTER_NEXTED_DFS_VISIT_OBJECT);
								vertex = adjVertex;
								state = START_DFS_VISIT;
								continue nextStateLoop;
							}
							if (adjVertex.color == Vertex.GREY) {
								// back edge (grey means visit in progress)
								cycles = true;
							}
							state = NEXT_ADJACENT;
							continue nextStateLoop;
						}
						//else done exploring vertex
						vertex.color = Vertex.BLACK;
						time++;
						vertex.finishTime = time;
						state = ((Integer) stack.remove(stack.size() - 1)).intValue();
						continue nextStateLoop;
					case AFTER_NEXTED_DFS_VISIT :
						// on entry, stack contains "vertex" and "allAjacent"
						vertex = (Vertex<T>) stack.remove(stack.size() - 1);
						allAdjacent = (Iterator<Vertex<T>>) stack.remove(stack.size() - 1);
						state = NEXT_ADJACENT;
						continue nextStateLoop;
				}
			}
		}

	}

	/**
	 * Sorts the given list of T in a manner that honors the given
	 * T reference relationships. That is, if A references 
	 * B, then the resulting order will list B before A if possible. For graphs
	 * that do not contain cycles, the result is the same as a conventional
	 * topological sort. For graphs containing cycles, the order is based on
	 * ordering the strongly connected components of the graph. This has the
	 * effect of keeping each knot of projects together without otherwise
	 * affecting the order of projects not involved in a cycle. For a graph G,
	 * the algorithm performs in O(|G|) space and time.
	 * <p>
	 * When there is an arbitrary choice, vertexes are ordered as supplied.
	 * Arranged projects in descending alphabetical order generally results in
	 * an order that builds "A" before "Z" when there are no other constraints.
	 * </p>
	 * <p>
	 * Ref: Cormen, Leiserson, and Rivest <it>Introduction to Algorithms</it>,
	 * McGraw-Hill, 1990. The strongly-connected-components algorithm is in
	 * section 23.5.
	 * </p>
	 * 
	 * @param references
	 *            a list of T references [A,B] meaning that A references B ==> B must be before A
	 *            (element type: <code>T[]</code>)
	 * @param _items
	 *            the items
	 * 
	 * @return an object describing the resulting project order
	 */
	public static <T> ElementsOrder<T> computeElementOrder(Class<T> clazz, Collection<T> elements, List<T[]> references) {

		// Step 1: Create the graph object.
		final Digraph<T> g1 = new Digraph<T>();
		// add vertexes
		for (T item : elements) {
			g1.addVertex(item);
		}
		// add edges
		for (Iterator<T[]> it = references.iterator(); it.hasNext();) {
			T[] ref = it.next();
			T p = ref[0];
			T q = ref[1];
			// p has a project reference to q
			// therefore create an edge from q to p
			// to cause q to come before p in eventual result
			g1.addEdge(q, p);
		}
		g1.freeze();

		// Step 2: Create the transposed graph. This time, define the vertexes
		// in decreasing order of depth-first finish time in g1
		// interchange "to" and "from" to reverse edges from g1
		final Digraph<T> g2 = new Digraph<T>();
		// add vertexes
		List<T> resortedVertexes = g1.idsByDFSFinishTime(false);
		for (T item : resortedVertexes) {
			g2.addVertex(item);
		}
		//		 add edges
		for (Iterator<T[]> it = references.iterator(); it.hasNext();) {
			T[] ref = it.next();
			T p = ref[0];
			T q = ref[1];
			// p has a project reference to q
			// therefore create an edge from p to q
			// N.B. this is the reverse of step 1
			g2.addEdge(p, q);
		}
		g2.freeze();

		// Step 3: Return the vertexes in increasing order of depth-first finish
		// time in g2
		List<T> sortedProjectList = g2.idsByDFSFinishTime(true);
		T[] orderedProjects = (T[]) Array.newInstance(clazz, sortedProjectList.size());
		sortedProjectList.toArray(orderedProjects);
		T[][] knots;
		boolean hasCycles = g2.containsCycles();
		if (hasCycles) {
			List<T[]> knotList = g2.nonTrivialComponents();
			knots = (T[][]) Array.newInstance(clazz, knotList.size(), 0);
			// cannot use knotList.toArray(knots) because each knot is Object[]
			// and we need each to be an IProject[]
			int k = 0;
			for (Iterator<T[]> it = knotList.iterator(); it.hasNext();) {
				T[] knot = it.next();
				T[] knotCopy = (T[]) Array.newInstance(clazz, knot.length);
				for (int i = 0; i < knot.length; i++) {
					knotCopy[i] = knot[i];
				}
				knots[k] = knotCopy;
				k++;
			}
		} else {
			knots = (T[][]) Array.newInstance(clazz, 0, 0);
		}
		return new ElementsOrder<T>(orderedProjects, hasCycles, knots);
	}
	
	/** The Constant STATE_REQUIRE. */
	public final static int STATE_REQUIRE = 1;
	
	/** The Constant STATE_COMPOSITION. */
	public final static int STATE_COMPOSITION = 2;
	
	/**
	 * Computes the global total ordering of all open projects in the workspace
	 * based on project references. If an existing and open project P references
	 * another existing and open project Q also included in the list, then Q
	 * should come before P in the resulting ordering. Closed and non- existent
	 * projects are ignored, and will not appear in the result. References to
	 * non-existent or closed projects are also ignored, as are any self-
	 * references.
	 * <p>
	 * When there are choices, the choice is made in a reasonably stable way.
	 * For example, given an arbitrary choice between two projects, the one with
	 * the lower collating project name is usually selected.
	 * </p>
	 * <p>
	 * When the project reference graph contains cyclic references, it is
	 * impossible to honor all of the relationships. In this case, the result
	 * ignores as few relationships as possible. For example, if P2 references
	 * P1, P4 references P3, and P2 and P3 reference each other, then exactly
	 * one of the relationships between P2 and P3 will have to be ignored. The
	 * outcome will be either [P1, P2, P3, P4] or [P1, P3, P2, P4]. The result
	 * also contains complete details of any cycles present.
	 * </p>
	 * 
	 * @param model
	 *            the model
	 * @param state
	 *            the state
	 * 
	 * @return result describing the global project order
	 * 
	 * @since 2.1
	 */
	static ElementsOrder<Item> computeFullItemOrder(LogicalWorkspace model, int state) {

		// determine the full set of accessible projects in the workspace
		// order the set in descending alphabetical order of project name
		SortedSet<Item> allAccessibleProjects = new TreeSet<Item>(new Comparator<Item>() {
			public int compare(Item px, Item py) {
				return py.getId().compareTo(px.getId());
			}
		});
		Collection<Item> items = model.getItems();
		Item[] allItems = items.toArray(new Item[items.size()]);
		// List<IProject[]> edges
		List<Item[]> edges = new ArrayList<Item[]>(allItems.length);
		for (int i = 0; i < allItems.length; i++) {
			Item anItem = allItems[i];
			// ignore projects that are not accessible
			if (!anItem.isAccessible())
				continue;
			//ProjectDescription desc = project.internalGetDescription();
			//if (desc == null)
			//	continue;
			//obtain both static and dynamic project references
			for(Link l : anItem.getOutgoingLinks()) {
				if (!l.isLinkResolved()) {
					continue;
				}
				Item ref = l.getResolvedDestination();
				if (!ref.isAccessible())
					continue;
				if (ref.equals(anItem))
					continue;
				if (!l.isRequire() && !l.isComposition())
					continue;
				if (l.isRequire() && ((state & STATE_REQUIRE)==0)) {
					continue;
				}
				if (l.isComposition() && ((state & STATE_COMPOSITION)==0)) {
					continue;
				}
				edges.add(new Item[] {anItem, ref});
			}
		}

		ElementsOrder<Item> fullProjectOrder = computeElementOrder(Item.class, allAccessibleProjects, edges);
		return fullProjectOrder;
	}
	
	/**
	 * Computes a total ordering of the given projects based on both static and
	 * dynamic project references. If an existing and open project P references
	 * another existing and open project Q also included in the list, then Q
	 * should come before P in the resulting ordering. Closed and non-existent
	 * projects are ignored, and will not appear in the result. References to
	 * non-existent or closed projects are also ignored, as are any
	 * self-references. The total ordering is always consistent with the global
	 * total ordering of all open projects in the workspace.
	 * <p>
	 * When there are choices, the choice is made in a reasonably stable way.
	 * For example, given an arbitrary choice between two projects, the one with
	 * the lower collating project name is usually selected.
	 * </p>
	 * <p>
	 * When the project reference graph contains cyclic references, it is
	 * impossible to honor all of the relationships. In this case, the result
	 * ignores as few relationships as possible. For example, if P2 references
	 * P1, P4 references P3, and P2 and P3 reference each other, then exactly
	 * one of the relationships between P2 and P3 will have to be ignored. The
	 * outcome will be either [P1, P2, P3, P4] or [P1, P3, P2, P4]. The result
	 * also contains complete details of any cycles present.
	 * </p>
	 * <p>
	 * This method is time-consuming and should not be called unnecessarily.
	 * There are a very limited set of changes to a workspace that could affect
	 * the outcome: creating, renaming, or deleting a project; opening or
	 * closing a project; adding or removing a project reference.
	 * </p>
	 * 
	 * @param projects
	 *            the projects to order
	 * @param model
	 *            the model
	 * @param state
	 *            the state
	 * 
	 * @return result describing the project order
	 * 
	 * @since 2.1
	 */
	static public ElementsOrder<Item> computeItemOrder(LogicalWorkspace model, int state, Item[] projects) {

		// compute the full project order for all accessible projects
		ElementsOrder<Item> fullProjectOrder = computeFullItemOrder(model, state);

		// "fullProjectOrder.projects" contains no inaccessible projects
		// but might contain accessible projects omitted from "projects"
		// optimize common case where "projects" includes everything
		int accessibleCount = 0;
		for (int i = 0; i < projects.length; i++) {
			if (projects[i].isAccessible()) {
				accessibleCount++;
			}
		}
		// no filtering required if the subset accounts for the full list
		if (accessibleCount == fullProjectOrder.elements.length) {
			return fullProjectOrder;
		}

		// otherwise we need to eliminate mention of other projects...
		// ... from "fullProjectOrder.projects"...		
		// Set<IProject> keepers
		Set<Item> keepers = new HashSet<Item>(Arrays.asList(projects));
		// List<IProject> projects
		List<Item> reducedProjects = new ArrayList<Item>(fullProjectOrder.elements.length);
		for (int i = 0; i < fullProjectOrder.elements.length; i++) {
			Item anItem = fullProjectOrder.elements[i];
			if (keepers.contains(anItem)) {
				// remove projects not in the initial subset
				reducedProjects.add(anItem);
			}
		}
		Item[] p1 = new Item[reducedProjects.size()];
		reducedProjects.toArray(p1);

		// ... and from "fullProjectOrder.knots"		
		// List<IProject[]> knots
		List<Item[]> reducedKnots = new ArrayList<Item[]>(fullProjectOrder.knots.length);
		for (int i = 0; i < fullProjectOrder.knots.length; i++) {
			Item[] knot = fullProjectOrder.knots[i];
			List<Item> x = new ArrayList<Item>(knot.length);
			for (int j = 0; j < knot.length; j++) {
				Item project = knot[j];
				if (keepers.contains(project)) {
					x.add(project);
				}
			}
			// keep knots containing 2 or more projects in the specified subset
			if (x.size() > 1) {
				reducedKnots.add(x.toArray(new Item[x.size()]));
			}
		}
		Item[][] k1 = new Item[reducedKnots.size()][];
		// okay to use toArray here because reducedKnots elements are IProject[]
		reducedKnots.toArray(k1);
		return new ElementsOrder<Item>(p1, (k1.length > 0), k1);
	}
}