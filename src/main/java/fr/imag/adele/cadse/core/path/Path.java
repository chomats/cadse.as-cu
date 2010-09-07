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
package fr.imag.adele.cadse.core.path;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.TypeDefinition;

/**
 * The Class Path.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class Path implements IPath {

	/** The Constant SELF. */
	private static final String		SELF		= "self";

	/** The segments. */
	private String[]				segments;

	/** Constant value indicating no segments. */
	private static final String[]	NO_SEGMENTS	= new String[0];

	/**
	 * Instantiates a new path.
	 * 
	 * @param newSegments
	 *            the new segments
	 */
	public Path(String... newSegments) {
		segments = newSegments;
		if (segments.length >= 1 && (segments[0].equals(SELF) || segments[0].equals("this"))) {
			segments[0] = SELF;
		}
		if (segments.length == 0) {
			segments = NO_SEGMENTS;
		}
	}

	// /**
	// * Constructs a new path from the given string path.
	// * The string path must represent a valid file system path
	// * on the local file system.
	// * The path is canonicalized and double slashes are removed
	// * except at the beginning. (to handle UNC paths). All forward
	// * slashes ('/') are treated as segment delimiters, and any
	// * segment and device delimiters for the local file system are
	// * also respected (such as colon (':') and backslash ('\') on some file
	// systems).
	// *
	// * @param fullPath the string path
	// * @see #isValidPath(String)
	// */
	// public Path(String fullPath) {
	// initialize(fullPath);
	// }
	//
	// String parse(char[] path, int[] posref) {
	// skip(path, posref);
	// int pos = posref[0];
	// if( pos >= path.length)
	// return null;
	// if (path.length > pos+5
	// && path[pos]=='s' && path[pos+1]=='e'&& path[pos+2]=='l'&&
	// path[pos+3]=='f'&& path[pos+4]=='.') {
	// posref[0]+=5;
	// return SELF;
	// }
	// if (path.length > pos+5
	// && path[pos]=='t' && path[pos+1]=='h'&& path[pos+2]=='i'&&
	// path[pos+3]=='s'&& path[pos+4]=='.') {
	// posref[0]+=5;
	// return SELF;
	// }
	// if (Character.isLetter(path[pos])) {
	// int i = posref[0];
	// for (; i < path.length; i++) {
	// if (path[i] != '.') {
	// break;
	// }
	// }
	// String ret = new String(path,pos,i-pos);
	// posref[0] = i;
	// return ret;
	// }
	// return null;
	// }
	//
	// private void skip(char[] path, int[] posref) {
	// int i = posref[0];
	// for (; i < path.length; i++) {
	// if (path[i] != '.' || path[i] != ' ') {
	// break;
	// }
	// }
	// posref[0] = i;
	// }
	// /**
	// * Removes duplicate slashes from the given path, with the exception
	// * of leading double slash which represents a UNC path.
	// */
	// private String collapseSlashes(String path) {
	// int length = path.length();
	// // if the path is only 0, 1 or 2 chars long then it could not possibly
	// have illegal
	// // duplicate slashes.
	// if (length < 1)
	// return "";
	//
	//
	// // We found an occurrence of // in the path so do the slow collapse.
	// char[] result = new char[path.length()];
	// int count = 0;
	// boolean hasPrevious = false;
	// boolean hasString = false;
	// char[] characters = path.toCharArray();
	// for (int index = 0; index < characters.length; index++) {
	// char c = characters[index];
	// if (c == SEPARATOR) {
	// if (hasPrevious) {
	//
	// } else {
	// hasPrevious = true;
	// result[count] = c;
	// count++;
	// }
	// } else {
	// hasPrevious = false;
	// result[count] = c;
	// count++;
	// }
	// }
	// return new String(result, 0, count);
	// }
	// /*
	// * Initialize the current path with the given string.
	// */
	// private void initialize(String path) {
	// char[] _path = path.toCharArray();
	// int[] pos = new int[1];
	// pos[0] = 0;
	//
	// assert (path != null);
	//
	// path = collapseSlashes(path);
	// int len = path.length();
	//
	// //compute the separators array
	// if (len < 2) {
	// if (len == 1 && path.charAt(0) == SEPARATOR) {
	// this.separators = HAS_LEADING;
	// } else {
	// this.separators = 0;
	// }
	// } else {
	// boolean hasLeading = path.charAt(0) == SEPARATOR;
	// boolean isUNC = hasLeading && path.charAt(1) == SEPARATOR;
	// //UNC path of length two has no trailing separator
	// boolean hasTrailing = !(isUNC && len == 2) && path.charAt(len - 1) ==
	// SEPARATOR;
	// separators = hasLeading ? HAS_LEADING : 0;
	// if (isUNC)
	// separators |= IS_UNC;
	// if (hasTrailing)
	// separators |= HAS_TRAILING;
	// }
	// //compute segments and ensure canonical form
	// segments = computeSegments(path);
	// if (!canonicalize()) {
	// //compute hash now because canonicalize didn't need to do it
	// separators = (separators & ALL_SEPARATORS) | (computeHashCode() << 3);
	// }
	// return ;
	// }

	/**
	 * The Class ExpValue.
	 * 
	 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
	 */
	static class ExpValue {

		/** The items. */
		Set<Item>		items;

		/** The itemtype. */
		TypeDefinition	itemtype;

		/** The singleton. */
		boolean			singleton;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.IPath#getItem(fede.workspace.domain.Item)
	 */
	public Item getItem(Item from) throws UnsupportedOperationException {
		if (segments == NO_SEGMENTS) {
			return null;
		}
		ExpValue ev = new ExpValue();
		ev.items = new HashSet<Item>();

		if (segments[0] == SELF) {
			// it's relafif path
			ev.items.add(from);
			ev.itemtype = from.getType();
			ev.singleton = true;
		} else {
			ev.itemtype = from.getLogicalWorkspace().getItemTypeByName(segments[0]);
			if (ev.itemtype == null) {
				throw new IllegalArgumentException("Cannot find the itemtype " + segments[0]);
			}
			ev.items.addAll(ev.itemtype.getItems());
			ev.singleton = false;
		}
		for (int i = 1; i < segments.length; i++) {
			compute(segments[i], ev);
		}
		if (ev.items.size() == 1) {
			return ev.items.iterator().next();
		}
		return null;
	}

	/**
	 * Compute.
	 * 
	 * @param experssion
	 *            the experssion
	 * @param ev
	 *            the ev
	 */
	private void compute(String experssion, ExpValue ev) {
		Set<Item> ret = new HashSet<Item>();
		boolean closure = experssion.endsWith("*");
		if (closure) {
			experssion = experssion.substring(0, experssion.length() - 1);
		}
		LinkType lt = ev.itemtype.getOutgoingLinkType(experssion);
		if (lt == null) {
			throw new IllegalArgumentException("Cannot find the linktype " + experssion + " in itemtype " + ev.itemtype);
		}
		if (closure) {
			Set<Item> compute = new HashSet<Item>();
			compute.addAll(ev.items);
			if (!ev.itemtype.equals(lt.getDestination())) {
				throw new IllegalArgumentException("Error closure operator on " + lt);
			}
			ret.addAll(compute);
			while (compute.size() > 0) {
				Set<Item> compute2 = new HashSet<Item>();
				for (Item item : compute) {
					Collection<Item> find = item.getOutgoingItems(lt, false);
					for (Item findItem : find) {
						if (ret.contains(findItem)) {
							continue;
						}
						ret.add(findItem);
						compute2.add(findItem);
					}
				}
				compute = compute2;
			}
		} else {
			for (Item item : ev.items) {
				ret.addAll(item.getOutgoingItems(lt, false));
			}
		}
		ev.items = ret;
		ev.itemtype = lt.getDestination();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.path.IPath#getItems(fede.workspace.domain.Item)
	 */
	public Set<Item> getItems(Item from) throws UnsupportedOperationException {
		if (segments == NO_SEGMENTS) {
			return null;
		}
		ExpValue ev = new ExpValue();
		ev.items = new HashSet<Item>();

		if (segments[0] == SELF) {
			// it's relafif path
			ev.items.add(from);
			ev.itemtype = from.getType();
			ev.singleton = true;
		} else {
			ev.itemtype = from.getLogicalWorkspace().getItemTypeByName(segments[0]);
			if (ev.itemtype == null) {
				throw new IllegalArgumentException("Cannot find the itemtype " + segments[0]);
			}
			ev.items.addAll(ev.itemtype.getItems());
			ev.singleton = false;
		}
		for (int i = 1; i < segments.length; i++) {
			compute(segments[i], ev);
		}
		return ev.items;
	}

	/*
	 * (Intentionally not included in javadoc)
	 * 
	 * @see IPath#isEmpty
	 */
	/**
	 * Checks if is empty.
	 * 
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		// true if no segments and no leading prefix
		return segments.length == 0;
	}

	/*
	 * (Intentionally not included in javadoc)
	 * 
	 * @see IPath#segment(int)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.IPath#segment(int)
	 */
	public String segment(int index) {
		if (index >= segments.length) {
			return null;
		}
		return segments[index];
	}

	/*
	 * (Intentionally not included in javadoc)
	 * 
	 * @see IPath#segmentCount()
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.IPath#segmentCount()
	 */
	public int segmentCount() {
		return segments.length;
	}

	/*
	 * (Intentionally not included in javadoc)
	 * 
	 * @see IPath#segments()
	 */
	/**
	 * Segments.
	 * 
	 * @return the string[]
	 */
	public String[] segments() {
		String[] segmentCopy = new String[segments.length];
		System.arraycopy(segments, 0, segmentCopy, 0, segments.length);
		return segmentCopy;
	}

}
