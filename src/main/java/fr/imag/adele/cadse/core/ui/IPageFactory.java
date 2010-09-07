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
package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.IItemNode;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.TypeDefinition;

/**
 * This factory can create a IPage object when it's necessary
 * 
 * @author chomats
 * 
 */
public interface IPageFactory {

	/**
	 * cas 1 :creation page (type, lt) cas 2 :creation page (item source, lt,
	 * destination?) cas 3 :property page (item) cas 4 :property view (item,
	 * node) cas 5 :property page (link) cas 6 :property view (link, node).
	 */
	public static final int	PAGE_CREATION_ITEM		= 1;
	/** The Constant PAGE_CREATION_LINK. */
	public static final int	PAGE_CREATION_LINK		= 2;
	/** The Constant PAGE_PROPERTY_ITEM. */
	public static final int	PAGE_PROPERTY_ITEM		= 3;
	/** The Constant PAGE_PROPERTY_VIEW_ITEM. */
	public static final int	PAGE_PROPERTY_VIEW_ITEM	= 4;
	/** The Constant PAGE_PROPERTY_LINK. */
	public static final int	PAGE_PROPERTY_LINK		= 5;
	/** The Constant PAGE_PROPERTY_VIEW_LINK. */
	public static final int	PAGE_PROPERTY_VIEW_LINK	= 6;
	/** The Constant page empty. */
	public static final int	PAGE_EMPTY				= 999;

	/**
	 * Gets the id.
	 * 
	 * @return the string id of this page
	 */
	public abstract String getName();

	/**
	 * cas 1 :creation page (type, lt) cas 2 :creation page (item source, lt,
	 * destination?) cas 3 :property page (item) cas 4 :property view (item,
	 * node) cas 5 :property page (link) cas 6 :property view (link, node).
	 * 
	 * @param item
	 *            the item
	 * @param node
	 *            the node
	 * @param type
	 *            the type
	 * @param lt
	 *            the lt
	 * @param cas
	 *            the cas
	 * @param l
	 *            the l
	 * 
	 * @return the i page
	 */
	public abstract IPage createPage(int cas, Link l, Item item, IItemNode node, TypeDefinition type, LinkType lt);

	/**
	 * Checks if is empty page.
	 * 
	 * @return true, if is empty page
	 */
	public abstract boolean isEmptyPage();

	/**
	 * 
	 * @return the itemtype which contains this pages
	 */
	public abstract ItemType getType();

	/**
	 * Internal method
	 * 
	 * @param parent
	 *            the parent TODO
	 * @param lt
	 *            suivant ce type de lien (linktype)
	 */
	public abstract void setParent(Item parent, LinkType lt);

	/**
	 * 
	 * @return the title of this page
	 */
	public String getTitle();

	/**
	 * Internal method
	 * 
	 * @param title
	 */
	public void setTitle(String title);

}