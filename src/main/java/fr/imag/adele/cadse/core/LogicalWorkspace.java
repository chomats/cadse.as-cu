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

import java.util.Collection;
import java.util.List;

import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.delta.ImmutableWorkspaceDelta;
import fr.imag.adele.cadse.core.internal.NotNull;
import fr.imag.adele.cadse.core.internal.Nullable;
import fr.imag.adele.cadse.core.key.ISpaceKey;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransactionBroadcaster;
import fr.imag.adele.cadse.core.ui.view.FilterContext;
import fr.imag.adele.cadse.core.ui.view.NewContext;
import fr.imag.adele.cadse.core.var.ContextVariable;

/**
 * Represents the CADSE workspace. A CADSE workspace is IDE workspace extended
 * by model elements (with items and item types...). This interface allows you
 * to manipulate models managed by executed CADSEs.
 */
public interface LogicalWorkspace extends LogicalWorkspaceTransactionBroadcaster {

	public NewContext[] getNewContextFrom(FilterContext context);

	/**
	 * Returns item type with specified id. Returns null if no item type exists
	 * in the logical workspace with this id.
	 * 
	 * @param itemTypeId
	 *            item type id
	 * 
	 * @return item type with specified id.
	 */
	public ItemType getItemType(CompactUUID itemTypeId);

	/**
	 * Returns item type with specified short name. Returns null if no item type
	 * exists in the logical workspace with this short name.
	 * 
	 * @param shortName
	 *            item type short name
	 * 
	 * @return item type with specified short name.
	 */
	public ItemType getItemTypeByName(String shortName);

	/**
	 * Returns all item types available in this logical workspace.
	 * 
	 * @return all item types available in this logical workspace.
	 */
	public Collection<ItemType> getItemTypes();

	/**
	 * Creates and returns an item type. If <code>itemTypeType</code> is null,
	 * default item type type is used (MetaItemType).
	 * 
	 * @param itemTypeType
	 *            type of the item type to create
	 * @param cadseName
	 *            CADSE providing this item type definition
	 * @param superType
	 *            super type
	 * @param id
	 *            item type id
	 * @param shortName
	 *            item type short name
	 * @param displayName
	 *            item type display name
	 * @param hasContent
	 *            if true, items of this type can have an associated content
	 * @param isAbstract
	 *            if true, creation of items of this type is disallowed but
	 *            creation of items of one of its sub types may be allowed
	 * @param manager
	 *            manager used to manage items of this type
	 * @return created item type.
	 * 
	 * @throws IllegalArgumentException
	 *             if Id is null or empty or this item type already exists.
	 */
	public ItemType createItemType(ItemType metaType, @NotNull CadseRuntime cadseName, @Nullable ItemType superType,
			int intID, @NotNull CompactUUID id, @NotNull String shortName, @Nullable String displayName,
			boolean hasContent, boolean isAbstract, @NotNull IItemManager manager);

	/**
	 * Returns state of this logical workspace.
	 * 
	 * @return state of this logical workspace.
	 */
	public WSModelState getState();

	/**
	 * Sets the state.
	 * 
	 * @param state
	 *            the new state
	 */
	public void setState(WSModelState state);

	/**
	 * Get item by id.
	 * 
	 * @param id
	 *            the id
	 * 
	 * @return an item if found, null if not found.
	 */
	public Item getItem(CompactUUID id);

	/**
	 * Get item by qualified name.
	 * 
	 * @param qualifiedName
	 *            the qualified name
	 * 
	 * @return an item if found, null if not found.
	 */
	public Item getItem(String qualifiedName);

	/**
	 * Gets the item by type and name. Use key to search it.
	 * 
	 * @param type
	 *            the type
	 * @param name
	 *            the name
	 * 
	 * @return the item or null if not found or if has an error
	 */
	public Item getItemByShortName(ItemType type, String name);

	/**
	 * Gets the item.
	 * 
	 * @param key
	 *            the key
	 * 
	 * @return the item
	 */
	public Item getItem(ISpaceKey key);

	/**
	 * Get the items by item type.
	 * 
	 * @param it
	 *            : the name of the item type to seek.
	 * 
	 * @return a list of items.
	 */
	public List<Item> getItems(String it);

	/**
	 * Get the items by item type.
	 * 
	 * @param it
	 *            : item type to seek.
	 * 
	 * @return a list of items.
	 */
	public List<Item> getItems(ItemType it);

	/**
	 * Get all items.
	 * 
	 * @return the items
	 */
	public Collection<Item> getItems();

	/**
	 * Create an item.
	 * 
	 * NOTE: After initializing a new item, a link between parent and this item
	 * will be created.
	 * 
	 * @param it
	 *            : item type.
	 * @param parent
	 *            : item's parent.
	 * @param lt
	 *            : link type.
	 * 
	 * @return new item.
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 * 
	 * @OCL<br> context: Workspace::createItem(String id, ItemType it) : Item<br>
	 *          1. pre: id <> null <br/>
	 *          2. pre: id <> '' <br/>
	 *          3. pre: it <> null <br/>
	 *          4. pre: parent <> null <br/>
	 *          5. pre: lt <> null <br/>
	 *          6. pre: items->forAll(item | item.id <> id )<br/>
	 *          7. pre: self.type.selectedItemtype->include(it) <br/>
	 *          8. pre: parent.type = lt.source and it = lt.dest<br/>
	 * @exception IllegalArgumentException
	 *                : Id can not be null. IllegalArgumentException : Id can
	 *                not be empty. IllegalArgumentException : Parent can not be
	 *                null. IllegalArgumentException : Link type can not be
	 *                null. IllegalArgumentException : Invalid assignment, this
	 *                item <tt>$id</tt> already exist.<br/>
	 *                IllegalArgumentException : Invalid assignment, type of
	 *                this item is not supported for this kind of workspace.<br/>
	 *                IllegalArgumentException : Link type is not correct.
	 * @deprecated use
	 *             {@link LogicalWorkspaceTransaction#createItem(ItemType, Item, LinkType)}
	 */
	@Deprecated
	public Item createItem(ItemType it, Item parent, LinkType lt) throws CadseException;

	/**
	 * Creates the item.
	 * 
	 * @param it
	 *            the it
	 * @param parent
	 *            the parent
	 * @param lt
	 *            the lt
	 * @param id
	 *            the id
	 * @param uniqueName
	 *            the unique name
	 * @param shortName
	 *            the short name
	 * 
	 * @return the item
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 * @deprecated use
	 *             {@link LogicalWorkspaceTransaction#createItem(ItemType, Item, LinkType, CompactUUID, String, String)}
	 */
	@Deprecated
	public Item createItem(ItemType it, Item parent, LinkType lt, CompactUUID id, String uniqueName, String shortName)
			throws CadseException;

	/**
	 * Load item. Internal method for unresolved refrence
	 * 
	 * @param ref
	 *            the ref
	 * 
	 * @return the item
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	public Item loadItem(ItemDescriptionRef ref) throws CadseException;

	/**
	 * Test if an item exists by key or by qualified name. This id can be an
	 * compostant of a closed composite
	 * 
	 * @param item
	 *            the item
	 * 
	 * @return true an item if found, false if not found. Found item is not the
	 *         parameter item.
	 */

	public boolean existsItem(Item item);

	/**
	 * Exists item.
	 * 
	 * @param item
	 *            the item
	 * @param shortName
	 *            the short name
	 * 
	 * @return true, if successful
	 * @throws CadseException
	 */
	public boolean existsItem(Item item, String shortName) throws CadseException;

	/**
	 * Gets the unresolved links.
	 * 
	 * @return the unresolved links
	 */
	public List<Link> getUnresolvedLinks();

	/**
	 * Gets the unresolved link.
	 * 
	 * @param id
	 *            the id
	 * 
	 * @return the unresolved link
	 */
	public List<Link> getUnresolvedLink(CompactUUID id);

	/**
	 * Get all destination ids of all unresolved links in workspace.
	 * 
	 * @return the unresolved item
	 */
	public List<Item> getUnresolvedItem();

	/**
	 * Gets the cadse domain.
	 * 
	 * @return the cadse domain
	 */
	CadseDomain getCadseDomain();

	/**
	 * Can delete link.
	 * 
	 * @param link
	 *            the link
	 * 
	 * @return true, if successful
	 */
	public boolean canDeleteLink(Link link);

	/**
	 * Can delete inverse link.
	 * 
	 * @param link
	 *            the link
	 * 
	 * @return true, if successful
	 */
	public boolean canDeleteInverseLink(Link link);

	/**
	 * Gets the cadse name.
	 * 
	 * @return the cadse name
	 */
	public String[] getCadseName();

	/**
	 * Gets the cadse version.
	 * 
	 * @return the cadse version
	 */
	public int[] getCadseVersion();

	/**
	 * Return all cadse runtime (running or not)
	 * 
	 * @return an array of cadse runtime or null if no cadse loaded
	 */
	public CadseRuntime[] getCadseRuntime();

	/**
	 * INTERNAL method
	 * 
	 * @param name
	 *            the cadse name
	 * @param runtimeId
	 *            the cadse id
	 * @param definitionId
	 *            the definition id
	 * @return a new cadse runtime ...
	 */
	public CadseRuntime createCadseRuntime(String name, CompactUUID runtimeId, CompactUUID definitionId);

	/**
	 * 
	 * @return create new transaction of this logical workspace
	 */
	public LogicalWorkspaceTransaction createTransaction();

	public void addListener(WorkspaceListener l, int eventFilter);

	public void addListener(WorkspaceListener l, EventFilter eventFilter);

	public void removeListener(WorkspaceListener l);

	public List<WorkspaceListener> filter(int filters, ImmutableWorkspaceDelta workspaceDelta);

	public void clear() throws CadseException;

	public void loadCadseModel(String qualifiedCadseModelName) throws CadseException;

	public void setAttribute(Item item, IAttributeType<?> key, Object value) throws CadseException;

	@Deprecated
	public void setAttribute(Item item, String key, Object value) throws CadseException;

	public LinkType createUnresolvedLinkType(String linkTypeName, ItemType sourceType, ItemType destType);

	public <T> T getAttribute(Item source, String key, boolean ownerOnly);

	public <T> T getAttribute(Item source, IAttributeType<T> type, boolean ownerOnly);

	public ContextVariable getContext();

}
