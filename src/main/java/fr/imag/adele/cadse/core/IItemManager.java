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

package fr.imag.adele.cadse.core;

import java.net.URL;
import java.util.List;

import fr.imag.adele.cadse.core.content.ContentItem;
import fr.imag.adele.cadse.core.ui.IActionContributor;

/**
 * An ItemManager is a controller to manage items of a specific type. It
 * provides:
 * <ul>
 * <li>getter and setter methods to attributes and links</li>
 * <li>methods to manage errors on items</li>
 * <li>methods to control associated content</li>
 * <li>manage notifications about modification on items on this type</li>
 * </ul>
 * 
 * All canXXX methods are callback methods called only by the CADSE runtime when
 * an operation is related to an item or its ougtoing links of item type managed
 * by it.
 * 
 * @author Stephane Chomat
 * @version 2.0
 */
public interface IItemManager extends ContributionToMenuAction {

	/**
	 * Sets the type of items managed by it.
	 * 
	 * @param itemType
	 *            an item type
	 */
	public void setItemType(ItemType itemType);

	/**
	 * Returns the type of items managed by it. If no type has been defined,
	 * returns null.
	 * 
	 * @return the type of items managed by it.
	 */
	public ItemType getItemType();

	

	/**
	 * Returns display name of <code>item</code> item.
	 * 
	 * @param item
	 *            an item of managed type.
	 * 
	 * @return display name of <code>item</code> item.
	 */
	public String getDisplayName(Item item);

	/**
	 * Returns qualified display name of <code>item</code> item.
	 * 
	 * @param item
	 *            an item of managed type.
	 * 
	 * @return qualified display name of <code>item</code> item.
	 */
	public String getQualifiedDisplayName(Item item);

	/**
	 * DON'T USE IT.
	 * 
	 * Returns false.
	 * 
	 * @param parent
	 *            an item
	 * @param type
	 *            a link type
	 * 
	 * @return false.
	 */
	@Deprecated
	public boolean isAbstract(Item parent, LinkType type);

	/**
	 * Returns true if each item can have a different icon.
	 * 
	 * @return true if each item can have a different icon.
	 */
	public boolean hasImageByItem();

	/**
	 * Returns URL of image of <code>item</code> item. If no image is
	 * specified, returns null.
	 * 
	 * @param iteml
	 *            an item (must not be null)
	 * @return URL of image of <code>item</code> item.
	 */
	public String getImage(Item item);

	/**
	 * Returns an error message if specified short name cannot be set to
	 * <code>item</code> item (It does not follow name pattern defined by this
	 * manager). If there is no error, returns null.
	 * 
	 * @param item
	 *            an item
	 * @param shortName
	 *            short name to check
	 * 
	 * @return an error message if specified short name cannot be set to
	 *         <code>item</code> item else null.
	 */
	public String validateShortName(Item item, String shortName);

	/**
	 * Returns computed unique name of specified item.
	 * 
	 * @param item
	 *            an item
	 * @param shortName
	 *            short name of specified item
	 * @param parent
	 *            parent of specified item (use null if no parent)
	 * @param linkType
	 *            type of part link used to link parent item to
	 *            <code>item</code> item
	 * 
	 * @return computed unique name of specified item.
	 */
	public String computeQualifiedName(Item item, String shortName, Item parent, LinkType linkType);

	/**
	 * Returns default short name for a newly item managed by this manager.
	 * 
	 * @return default short name for a newly item managed by this manager.
	 */
	@Deprecated
	public String getDefaultShortName();

	/**
	 * @see {@link ContributionToMenuAction Deprecated. Use
	 *      {@link IActionContributor} or cadesg editor
	 */
	@Deprecated
	public void contributeMenuNewAction(Menu menu, Item parent);

	

	@Deprecated
	public boolean hasNotification();

	

	/**
	 * Returns an error message if creation of a child item (using a part link
	 * of <code>linkType</code> type) of <code>parent</code> item is
	 * disallowed. If creation is allowed, returns null.
	 * 
	 * @param parent
	 *            parent item
	 * @param linkType
	 *            type of part link used to link parent item to items of
	 *            <code>childType</code> type
	 * @param childType
	 *            type of children items
	 * 
	 * @return an error message if creation of a child item (using a part link
	 *         of <code>linkType</code> type) of <code>parent</code> item is
	 *         disallowed.
	 */
	public String canCreateChildItem(Item parent, LinkType linkType, ItemType childType);

	/**
	 * Returns an error message if creation of a destination item and a link of
	 * <code>linkType</code> type from <code>source</code> item is
	 * disallowed. If creation is allowed, returns null.
	 * 
	 * @param source
	 *            source item
	 * @param linkType
	 *            type of link used to link source item to an item of
	 *            <code>destType</code> type
	 * @param destType
	 *            type of destination item
	 * 
	 * @return an error message if creation of a destination item and a link of
	 *         <code>linkType</code> type from <code>source</code> item is
	 *         disallowed.
	 */
	public String canCreateMeItem(Item source, LinkType linkType, ItemType destType);

	/**
	 * Returns an error message if deletion of specified item is disallowed. If
	 * deletion is allowed, returns null.
	 * 
	 * @param item
	 *            an item
	 * 
	 * @return an error message if deletion of specified item is disallowed.
	 */
	public String canDeleteItem(Item item);


	/**
	 * Returns an error message if rename specified item is disallowed. Rename
	 * an item corresponds to modify its unique name and/or its short name. If
	 * rename is allowed, returns null.
	 * 
	 * @param item
	 *            an item
	 * 
	 * @return an error message if rename specified item is disallowed.
	 */
	public String canRenameItem(Item item);

	/**
	 * Returns an error message if creation of a link of <code>lt</code> type
	 * from <code>source</code> to <code>dest</code> is disallowed. If it is
	 * allowed, returns null.
	 * 
	 * @param source
	 *            source item
	 * @param dest
	 *            destination item
	 * @param lt
	 *            link type
	 * 
	 * @return an error message if creation of a link of <code>lt</code> type
	 *         from <code>source</code> to <code>dest</code> is disallowed.
	 */
	public String canCreateLink(Item source, Item dest, LinkType lt);

	/**
	 * Returns an error message if deletion of specified link is disallowed. If
	 * it is allowed, returns null.
	 * 
	 * @param link
	 *            a link of ougtgoing link type managed by this manager
	 * 
	 * @return an error message if deletion of specified link is disallowed.
	 */
	public String canDeleteLink(Link link);


	/**
	 * DON'T USE IT, always return true.
	 * 
	 * Returns true if specified item has an associated content.
	 * 
	 * @param item
	 *            an item
	 * 
	 * @return true if specified item has an associated content.
	 */
	@Deprecated
	public boolean hasContent(Item item);


	/**
	 * DON'T USE IT, always return true.
	 * 
	 * Returns true if outgoing links must be sorted.
	 * 
	 * @return true, if outgoing links must be sorted.
	 */
	@Deprecated
	public boolean isOutgoingLinkSorted();

	/**
	 * Sets error message shown if validation of unique name of an item of type
	 * managed by this manager fails.
	 * 
	 * @param invalidNameErrorMsg
	 *            error message for a unique name validation fail
	 */
	public void setErrorValidId(String invalidNameErrorMsg);

	/**
	 * Sets unique name pattern used to validate renaming and creation of item
	 * of type managed by this manager.
	 * 
	 * @param uniqueNamePattern
	 *            unique name pattern
	 */
	public void setPatternValidId(String uniqueNamePattern);

	/**
	 * Sets pattern used to generate item unique name from a short name.
	 * 
	 * @param uniqueNamePattern
	 *            unique name pattern
	 */
	public void setPatternId(String uniqueNamePattern);

	/**
	 * Returns name shown when ask to create an item of type managed by it. In
	 * CADSE graphical contextual menu, it is the name of sub menu element of
	 * New. Returns <code>null</code> if uses default name (=
	 * destItemType.getDisplayName()).
	 * 
	 * @param lt
	 *            link type
	 * @param destItemType
	 *            type of destination items
	 * @return
	 */
	public String getDisplayCreate(LinkType lt, ItemType destItemType);

	/**
	 * Double click.
	 * 
	 * @param item
	 *            the item
	 */
	@Deprecated
	public void doubleClick(Item item);
	
}
