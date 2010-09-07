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

/**
 * Represents a tree node which may correspond to an item, an item type, a link,
 * a link type or anything you want.
 */
public interface IItemNode {

	/*
	 * Kinds.
	 */

	/**
	 * Kind for representation of an outgoing link type.
	 */
	public static final int	LINK_TYPE_OUTGOING		= 1;

	/**
	 * Kind for representation of an incoming link type.
	 */
	public static final int	INCOMING_LINK_NAME		= 2;

	/**
	 * Kind for representation of an outgoing link.
	 */
	public static final int	LINK_OUTGOING			= 3;

	/**
	 * Kind for representation of an incoming link.
	 */
	public static final int	LINK_INCOMING			= 4;

	/**
	 * Kind for representation of a logical workspace.
	 */
	public static final int	WS						= 5;

	/**
	 * Kind for representation of an item type.
	 */
	public static final int	ITEM_TYPE				= 6;

	/**
	 * Kind for representation of a root item.
	 */
	public static final int	ROOT					= 7;

	/**
	 * Kind for representation of a list of element.
	 */
	public static final int	LIST					= 8;

	/**
	 * Kind for representation of an item.
	 */
	public static final int	ITEM					= 9;

	/**
	 * Kind for representation of an item reference (item id).
	 */
	public static final int	ITEM_DESCRIPTION_REF	= 10;

	/**
	 * Kind for representation of a category.
	 */
	public static final int	CATEGORY				= 11;

	/**
	 * Kind for representation of any other not managed kind.
	 */
	public static final int	OTHER					= 12;

	/*
	 * Select states.
	 */

	/**
	 * Select state representing a deselected tree node.
	 */
	public static final int	DESELECTED				= 0;

	/**
	 * Select state representing a gray selected tree node.
	 */
	public static final int	GRAY_SELECTED			= 1;

	/**
	 * Select state representing a selected tree node.
	 */
	public static final int	SELECTED				= 2;

	/*
	 * ???
	 */

	/**
	 * TODO ???
	 */
	public static final int	SHOW_RELATION_OUTGOING	= 1;

	/**
	 * If kind is <code>ITEM</code>, returns the item represented by this
	 * tree node. Other cases are not specified.
	 * 
	 * @return the item represented by this tree node.
	 */
	public Item getItem();

	/**
	 * If kind is <code>LINK_OUTGOING</code> or <code>LINK_INCOMING</code>,
	 * returns the link represented by this tree node. Other cases are not
	 * specified.
	 * 
	 * @return the link represented by this tree node.
	 */
	public Link getLink();

	/**
	 * If kind is <code>LINK_TYPE_OUTGOING</code> or
	 * <code>INCOMING_LINK_NAME</code>, returns the link type represented by
	 * this tree node. Other cases are not specified.
	 * 
	 * @return the link type represented by this tree node.
	 */
	public LinkType getLinkType();

	/**
	 * Returns the element represented by this tree node.
	 * 
	 * @return the element represented by this tree node.
	 */
	public Object getElementModel();

	/**
	 * Returns parent of it. If it has no parent (it is root), returns
	 * <code>null</code>.
	 * 
	 * @return parent of it.
	 */
	public IItemNode getParent();

	/**
	 * Returns all children of it. Call this method force computation of
	 * children.
	 * 
	 * @return all children of it.
	 */
	public IItemNode[] getChildren();

	/**
	 * Returns kind of element which are represented by it.
	 * 
	 * @return kind of element which are represented by it.
	 */
	public int getKind();

	/**
	 * TODO it is not expandable flag.
	 * 
	 * @return
	 */
	public boolean isOpen();
	
	public void close();
	public void open();

	/**
	 * Return select state of this node. By default, return
	 * <code>DESELECTED</code>.
	 * 
	 * @return {@link #DESELECTED}, {@link #GRAY_SELECTED}, {@link #SELECTED}
	 */
	public int isSelected();

	/**
	 * Sets select state of this node. By default, select state is
	 * <code>DESELECTED</code>.
	 * 
	 * @param state
	 *            one of {@link #DESELECTED}, {@link #GRAY_SELECTED},
	 *            {@link #SELECTED}
	 */
	public void setSelected(int state);

	/**
	 * remove this node this the tree view and all children
	 * 
	 */
	public void delete();

	public boolean hasChildren();
}
