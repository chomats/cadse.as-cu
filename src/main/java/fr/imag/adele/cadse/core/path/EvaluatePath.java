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
 */

package fr.imag.adele.cadse.core.path;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.LogicalWorkspace;
import fr.imag.adele.cadse.core.TypeDefinition;

/**
 * The Class EvaluatePath.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class EvaluatePath extends AbstractParsePath {

	/** The source. */
	private final Item			source;

	/** The dest. */
	private TypeDefinition		dest;

	/** The result. */
	private Set<Item>			result;

	/** The model type. */
	private LogicalWorkspace	modelType;

	/** The find type. */
	private TypeDefinition		findType;

	/**
	 * Instantiates a new evaluate path.
	 * 
	 * @param source
	 *            the source
	 * @param lt
	 *            the lt
	 * @param path
	 *            the path
	 */
	public EvaluatePath(Item source, LinkType lt, String path) {
		super(path);
		this.dest = lt.getDestination();
		this.source = source;
		this.modelType = source.getLogicalWorkspace();
		this.error = null;
		parse(path, false);
	}

	/**
	 * Gets the source.
	 * 
	 * @return the source
	 */
	public Item getSource() {
		return source;
	}

	/**
	 * Gets the destination.
	 * 
	 * @return the destination
	 */
	public TypeDefinition getDestination() {
		return dest;
	}

	/**
	 * Gets the result.
	 * 
	 * @return the result
	 */
	public Set<Item> getResult() {
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.AbstractParsePath#beginParse()
	 */
	@Override
	protected void beginParse() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.AbstractParsePath#endParse(boolean)
	 */
	@Override
	protected void endParse(boolean partiel) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.path.AbstractParsePath#parseIncomingLink(java.lang
	 * .String, boolean)
	 */
	@Override
	protected void parseIncomingLink(String s, boolean closure) {
		LinkType fLinkType = findType.getIncomingLinkType(s);
		if (fLinkType == null) {
			error = "Cannot find link type " + s;
			return;
		}
		result = getIncomingItems(result, fLinkType);
		if (result.size() == 0) {
			error = "Empty set";
		}
		findType = fLinkType.getSource();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.path.AbstractParsePath#parseOutgoingLink(java.lang
	 * .String, boolean)
	 */
	@Override
	protected void parseOutgoingLink(String s, boolean closure) {

		LinkType fLinkType = findType.getOutgoingLinkType(s);
		if (fLinkType == null) {
			error = "Cannot find link type " + s;
			return;
		}

		HashSet<Item> ret = new HashSet<Item>();
		if (closure) {
			ret.addAll(result);
			Set<Item> secondpass = result;
			while (secondpass.size() > 0) {
				Set<Item> newsecondpass = new HashSet<Item>();
				for (Item source : secondpass) {
					for (Link l : source.getOutgoingLinks()) {
						if (l.getLinkType().getName().equals(s) && l.isLinkResolved()) {
							Item dest = l.getResolvedDestination();
							if (!ret.contains(dest)) {
								ret.add(dest);
								newsecondpass.add(dest);
							}
						}
					}
				}
				secondpass = newsecondpass;
			}
		} else {
			for (Item source : result) {
				for (Link l : source.getOutgoingLinks()) {
					if (l.getLinkType().getName().equals(s) && l.isLinkResolved()) {
						Item dest = l.getResolvedDestination();
						ret.add(dest);
					}
				}
			}
		}
		result = ret;
		if (result.size() == 0) {
			error = "Empty set";
		}
		findType = fLinkType.getDestination();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.path.AbstractParsePath#parseParent(java.lang.String
	 * , boolean)
	 */
	@Override
	protected void parseParent(String s, boolean closure) {
		ItemType fParentType = modelType.getItemTypeByName(s);
		if (fParentType == null) {
			error = "Cannot find type " + s;
			return;
		}
		findType = fParentType;
		if (closure) {
			if (result.size() == 1) {
				Item parent = result.iterator().next().getPartParentByName(fParentType.getName());
				if (parent != null) {
					result = Collections.singleton(parent);
					return;
				}
				error = "Empty set";
				return;
			}
			HashSet<Item> ret = new HashSet<Item>();
			for (Item source : result) {
				Item parent = source.getPartParent((ItemType) findType);
				if (parent != null)
					ret.add(parent);
			}
			result = ret;

		} else {
			if (result.size() == 1) {
				Item parent = result.iterator().next().getPartParent();
				if (parent != null && parent.getType() == fParentType) {
					result = Collections.singleton(parent);
					return;
				}
				error = "Empty set";
				return;
			}
			HashSet<Item> ret = new HashSet<Item>();
			for (Item source : result) {
				Item parent = source.getPartParent();
				if (parent != null && parent.getType() == fParentType)
					ret.add(parent);
			}
			result = ret;
		}

		if (result.size() == 0) {
			error = "Empty set";
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.AbstractParsePath#parseSelf()
	 */
	@Override
	protected void parseSelf() {
		result = Collections.singleton(source);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.path.AbstractParsePath#parseType(java.lang.String,
	 * boolean)
	 */
	@Override
	protected void parseType(String s, boolean closure) {
		findType = modelType.getItemTypeByName(s);
		if (findType == null) {
			error = "Cannot find type " + s;
			return;
		}
		HashSet<Item> ret = new HashSet<Item>();
		if (closure) {
			evaluateSubType((ItemType) findType, ret);
		} else
			ret.addAll(findType.getItems());
		result = ret;
		if (result.size() == 0) {
			error = "Empty set";
		}
	}

	/**
	 * Evaluate sub type.
	 * 
	 * @param subit
	 *            the subit
	 * @param ret
	 *            the ret
	 */
	private static void evaluateSubType(ItemType subit, HashSet<Item> ret) {
		ret.addAll(subit.getItems());
		EList<fr.imag.adele.emf.cadse.ccore.ItemType> its = subit.getSubTypes();
		for (fr.imag.adele.emf.cadse.ccore.ItemType subit2 : its) {
			evaluateSubType((ItemType) subit2, ret);
		}
	}

	/**
	 * Gets the incoming items.
	 * 
	 * @param sources
	 *            the sources
	 * @param fLinkType
	 *            the f link type
	 * 
	 * @return the incoming items
	 */
	private static HashSet<Item> getIncomingItems(Set<Item> sources, LinkType fLinkType) {
		// source est de type fLinkType.getDestination()
		HashSet<Item> ret = new HashSet<Item>();
		for (Item source : sources) {
			for (Link l : source.getIncomingLinks()) {
				if (l.getLinkType().getName().equals(fLinkType.getName())) {
					ret.add(l.getSource());
				}
			}
		}
		return ret;
	}

	/**
	 * Incoming closure.
	 * 
	 * @param sources
	 *            the sources
	 * @param linkId
	 *            the link id
	 * 
	 * @return the collection< item>
	 */
	static Collection<Item> incomingClosure(Set<Item> sources, String linkId) {
		HashSet<Item> closure = new HashSet<Item>();
		List<Item> stack = new ArrayList<Item>();
		stack.addAll(sources);
		while (stack.size() != 0) {
			Item theItem = stack.remove(stack.size() - 1);
			if (closure.contains(theItem))
				continue;
			closure.add(theItem);
			for (Link l : theItem.getIncomingLinks()) {
				if (!l.getLinkType().getName().equals(linkId))
					continue;
				stack.add(l.getSource());
			}
		}
		return closure;
	}
}