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
package fr.imag.adele.cadse.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * A utility class used to - navigate through links - find item by name
 * 
 */
public class CadseUtil {

	/**
	 * Returns all items (including specified one) on way when navigating
	 * incoming links of one of specified <code>linkTypes</code> types from
	 * specified item.
	 * 
	 * @param item
	 *            an item
	 * @param linkTypes
	 *            link types
	 * 
	 * @return all items (including specified one) on way when navigating
	 *         incoming links of one of specified <code>linkTypes</code> types
	 *         from specified item.
	 */
	public final static Collection<Item> incomingClosure(Item item, LinkType... linkTypes) {
		HashSet<Item> closure = new HashSet<Item>();
		HashSet<LinkType> linkTypeSet = new HashSet<LinkType>(Arrays.asList(linkTypes));
		List<Item> stack = new ArrayList<Item>();
		stack.add(item);
		while (stack.size() != 0) {
			Item theItem = stack.remove(stack.size() - 1);
			if (closure.contains(theItem))
				continue;
			closure.add(theItem);
			for (Link l : theItem.getIncomingLinks()) {
				if (!linkTypeSet.contains(l.getLinkType()))
					continue;
				stack.add(l.getSource());
			}
		}
		return closure;
	}

	/**
	 * Returns all items (including specified one) on way when navigating
	 * outgoing links of one of specified <code>linkTypes</code> types from
	 * specified item.
	 * 
	 * @param item
	 *            an item
	 * @param linkTypes
	 *            link types
	 * 
	 * @return all items (including specified one) on way when navigating
	 *         outgoing links of one of specified <code>linkTypes</code> types
	 *         from specified item.
	 */
	public final static Collection<Item> outgoingClosure(Item item, LinkType... linkTypes) {
		HashSet<Item> closure = new HashSet<Item>();
		HashSet<LinkType> linkTypeSet = new HashSet<LinkType>(Arrays.asList(linkTypes));
		List<Item> stack = new ArrayList<Item>();
		stack.add(item);
		while (stack.size() != 0) {
			Item theItem = stack.remove(stack.size() - 1);
			if (closure.contains(theItem))
				continue;
			closure.add(theItem);
			for (Link l : theItem.getOutgoingLinks()) {
				if (!linkTypeSet.contains(l.getLinkType()))
					continue;
				stack.add(l.getSource());
			}
		}
		return closure;
	}

	/**
	 * Returns an item with specified short name contained in specified list. If
	 * there is no item with same short name, returns null.
	 * 
	 * @param items
	 *            a list of item
	 * @param shotname
	 *            item short name to find
	 * @return an item with specified short name contained in specified list.
	 */
	public final static Item getItemByName(Collection<Item> items, String shotname) {
		for (Item anItem : items) {
			if (anItem.getName().equals(shotname))
				return anItem;
		}
		return null;
	}

	/**
	 * Returns all item types where their items (instance of these types) which
	 * can be parent of items of specified item type.
	 * 
	 * @param type
	 *            an item type
	 * @return all item types where their items (instance of these types) which
	 *         can be parent of items of specified item type.
	 */
	public static ItemType[] getIncomingPartsType(ItemType type) {
		HashSet<ItemType> ret = new HashSet<ItemType>();
		for (LinkType lt : type.getIncomingLinkTypes()) {
			if (lt.isPart()) {
				TypeDefinition sourceType = lt.getSource();
				if (sourceType.isMainType())
					ret.add((ItemType) sourceType);
			}
		}
		return ret.toArray(new ItemType[ret.size()]);
	}
}
