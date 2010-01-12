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

package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.CompactUUID;
import fr.imag.adele.cadse.core.IItemNode;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkType;

/**
 * A factory for creating Page objects.
 */
public abstract class PageFactory implements IPageFactory {

	/** The _id. */
	private final String	shortName;
	private String			_title;

	/**
	 * Instantiates a new page factory.
	 * 
	 * @param id
	 *            the id
	 */
	public PageFactory(CompactUUID id, String shortname) {
		// super(id);
		shortName = shortname;
	}

	/**
	 * Instantiates a new page factory.
	 * 
	 * @param id
	 *            the id
	 * 
	 */
	public PageFactory(String shortname) {
		// super(CompactUUID.randomUUID());
		shortName = shortname;
	}

	/**
	 * @see fr.imag.adele.cadse.core.ui.IPageFactory#getName()
	 */
	public String getName() {
		return shortName;
	}

	/**
	 * @see fr.imag.adele.cadse.core.ui.IPageFactory#createPage(int,
	 *      fr.imag.adele.cadse.core.Link, fr.imag.adele.cadse.core.Item,
	 *      fr.imag.adele.cadse.core.IItemNode, fr.imag.adele.cadse.core.ItemType,
	 *      fr.imag.adele.cadse.core.LinkType)
	 */
	public abstract IPage createPage(int cas, Link l, Item item, IItemNode node, ItemType type, LinkType lt);

	/**
	 * @see fr.imag.adele.cadse.core.ui.IPageFactory#isEmptyPage()
	 */
	public boolean isEmptyPage() {
		return false;
	}

	/**
	 * @see fr.imag.adele.cadse.core.ui.IPageFactory#getType()
	 */
	public ItemType getType() {
		return null;
	}

	/**
	 * @see fr.imag.adele.cadse.core.ui.IPageFactory#setParent(fr.imag.adele.cadse.core.Item,
	 *      LinkType)
	 */
	public void setParent(Item parent, LinkType lt) {

	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}
}
