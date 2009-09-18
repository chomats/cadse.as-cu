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
package fr.imag.adele.cadse.core.transaction;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.List;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.CadseRuntime;
import fr.imag.adele.cadse.core.CompactUUID;
import fr.imag.adele.cadse.core.EventFilter;
import fr.imag.adele.cadse.core.IItemManager;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemDescriptionRef;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.LogicalWorkspace;
import fr.imag.adele.cadse.core.ProjectAssociation;
import fr.imag.adele.cadse.core.WorkspaceListener;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.attribute.SetAttrVal;
import fr.imag.adele.cadse.core.delta.ImmutableWorkspaceDelta;
import fr.imag.adele.cadse.core.delta.ItemDelta;
import fr.imag.adele.cadse.core.delta.LinkDelta;
import fr.imag.adele.cadse.core.internal.NotNull;
import fr.imag.adele.cadse.core.internal.Nullable;
import fr.imag.adele.cadse.core.internal.delta.InternalLogicalWorkspaceTransaction;
import fr.imag.adele.cadse.core.var.ContextVariable;

/**
 * Represents a transaction on the CADSE logical workspace. Imbricated
 * transactions are not supported by CADSE.
 * 
 * Example code of use: LogicalWorkspace lws = ... LogicalWorkspaceTransaction t =
 * lws.createTransaction(); ... some stuff like t.createItem(...) ...
 * t.commit();
 * 
 * @author Thomas
 * 
 */
public interface LogicalWorkspaceTransaction extends LogicalWorkspace, InternalLogicalWorkspaceTransaction {

	/**
	 * DO NOT USE IT.
	 * 
	 * Imbricated transactions are not supported by CADSE. User cannot create a
	 * transaction of another transaction. Throws an
	 * UnsupportedOperationException exception.
	 * 
	 * @return Throws an UnsupportedOperationException exception.
	 * @throws UnsupportedOperationException
	 *             always.
	 */
	public LogicalWorkspaceTransaction createTransaction();

	/**
	 * It commits all changes (item creation, deletion, modification...) made on
	 * this transaction to the CADSE logical workspace.
	 * 
	 * @throws CadseException
	 *             if commit fails
	 */
	public void commit() throws CadseException;

	/**
	 * Rollback (abort) this transaction. All changes (item creation, deletion,
	 * modification...) made on this transaction to the CADSE logical workspace
	 * will be lost.
	 */
	public void rollback();

	/**
	 * DO NOT USE IT.
	 * 
	 * If you want to create an item type in a transaction, please use one of
	 * createItem(...) methods.
	 * 
	 * Throws an UnsupportedOperationException exception.
	 */
	@Deprecated
	public ItemType createItemType(ItemType itemTypeType, CadseRuntime cadseName, @Nullable
	ItemType superType, int intID, @NotNull
	CompactUUID id, @NotNull
	String shortName, @Nullable
	String displayName, boolean hasContent, boolean isAbstract, @NotNull
	IItemManager manager);

	/**
	 * Creates and returns an item. If <code>parent</code> is not null,
	 * <code>partLinkType</code> must be defined.
	 * 
	 * @param itemType
	 *            type of the item to create
	 * @param parent
	 *            parent item (can be null if no parent)
	 * @param partLinkType
	 *            part link type used to define the parent (can be null if no
	 *            parent)
	 * @return created item.
	 * 
	 * @throws CadseException
	 *             if creation fails.
	 */
	public ItemDelta createItem(ItemType itemType, Item parent, LinkType partLinkType) throws CadseException;

	/**
	 * Creates and returns an item. If <code>parent</code> is not null,
	 * <code>partLinkType</code> must be defined.
	 * 
	 * Example code to generate an id: CompactUUID generatedId =
	 * CompactUUID.randomUUID();
	 * 
	 * @param itemType
	 *            type of the item to create
	 * @param parent
	 *            parent item (can be null if no parent)
	 * @param partLinkType
	 *            part link type used to define the parent (can be null if no
	 *            parent)
	 * @param id
	 *            item id (must be different of existing item ids and not null)
	 * @param uniqueName
	 *            item unique name
	 * @param shortName
	 *            item short name
	 * @return created item.
	 * 
	 * @throws CadseException
	 *             if creation fails.
	 */
	public ItemDelta createItem(ItemType itemType, Item parent, LinkType lt, CompactUUID id, String uniqueName,
			String shortName) throws CadseException;

	/**
	 * Returns a delta representing all operations performed by this transaction
	 * on the item with specified id. Returns null, if there is no item with
	 * specified id in logical workspace and no item creation operation has been
	 * performed for this item in this transaction.
	 * 
	 * @return a delta representing all operations performed by this transaction
	 *         on the item with specified id.
	 */
	public ItemDelta getItem(CompactUUID id);

	/**
	 * Returns a delta representing all operations performed by this transaction
	 * on the item with specified id. Returns null, if there is no item with
	 * specified id in logical workspace and no item creation operation has been
	 * performed for this item in this transaction.
	 * 
	 * @return a delta representing all operations performed by this transaction
	 *         on the item with specified id.
	 * @deprecated prefers using getItem(CompactUUID) method.
	 */
	@Deprecated
	public ItemDelta getItemOperation(CompactUUID id);

	/**
	 * Returns a delta representing all operations performed by this transaction
	 * on the item with specified id. Returns null, if there is no item with
	 * specified id in logical workspace and no item creation operation has been
	 * performed for this item in this transaction. If
	 * <code>showDeleteItem</code> is false and the item with
	 * <code>itemId</code> id has been deleted in this transaction, returns
	 * null.
	 * 
	 * @param showDeleteItem
	 *            if false and the item with <code>itemId</code> id has been
	 *            deleted in this transaction, returns null
	 * @return a delta representing all operations performed by this transaction
	 *         on the item with specified id.
	 */
	public ItemDelta getItem(CompactUUID itemId, boolean showDeleteItem);

	public ItemDelta getItem(Item item);

	/**
	 * Loads from persistence the item represented by specified reference and
	 * returns it. A load operation is composed of - an item create operation
	 * and - many set attribute operations - many create link operations
	 * Transaction listeners are not notified of this load operation until
	 * method loadItems is called and are not notified about these set attribute
	 * and create link operations.
	 * 
	 * @param itemRef
	 *            a description of the item to load
	 * 
	 * @return the loaded item.
	 * 
	 * @throws CadseException
	 */
	public ItemDelta loadItem(ItemDescriptionRef itemRef) throws CadseException;

	/**
	 * Loads from persistence an item and returns it. A load operation is
	 * composed of - an item create operation and - many set attribute
	 * operations - many create link operations Transaction listeners are not
	 * notified of this load operation until method loadItems(...) is called and
	 * are not notified about these set attribute and create link operations.
	 * 
	 * @param id
	 *            id of the item to load
	 * @param type
	 *            item type id
	 * 
	 * @return the loaded item.
	 * 
	 * @throws CadseException
	 */
	public ItemDelta loadItem(CompactUUID id, CompactUUID type) throws CadseException;

	// TODO
	public void loadItems(Collection<URL> itemdescription) throws CadseException, IOException;

	/**
	 * Commits this transaction and returns all items loaded in it. This method
	 * notify all transaction listeners and the no of all load item operations
	 * done in this transaction.
	 * 
	 * @param update
	 *            use false, not implemented
	 * @param forceToSave
	 *            this method save in persistence all loaded items
	 * @param forceLoad
	 *            if true, all load operation are performed else if a load
	 *            operation fails, all others are not executed
	 * @param projectAssociationSet
	 * @return all items loaded in this transaction.
	 * @throws CadseException
	 * @throws IOException
	 */
	public Collection<Item> commit(boolean update, boolean forceToSave, boolean forceLoad,
			Collection<ProjectAssociation> projectAssociationSet) throws CadseException, IOException;

	// TODO
	public void load();

	public boolean isCommitted();

	/**
	 * Creates an item if it does not already exist, or returns existing item.
	 * 
	 * @param uniqueName
	 *            can be null
	 * @param shortname
	 *            the short name
	 * @param it
	 *            the type
	 * @param parent
	 *            the parent can be null if the item type has no part incoming
	 *            link type
	 * @param lt
	 *            the link type between parent.getType() and it, can be null if
	 *            the item type has no par incoming link type or if there is one
	 *            link type between parent.getType() and it
	 * @param attributes
	 *            the attributes : it's a pair of objects which types can be :
	 *            (linktype, item) or (String, item) or (String, Object).
	 * 
	 * @return a new item or find item
	 * 
	 * 
	 * @param uniqueName
	 *            item unique name
	 * @param shortName
	 *            item short name
	 * @param itemType
	 *            type of the item to create
	 * @param parent
	 *            parent item (can be null if no parent)
	 * @param partLinkType
	 *            part link type used to define the parent (can be null if no
	 *            parent)
	 * @param attributes
	 *            pair of attribute name and value
	 * @return created item or found item.
	 */
	public ItemDelta createItemIfNeed(String uniqueName, String shortname, ItemType itemType, Item parent,
			LinkType partLinkType, Object... attributes) throws CadseException;

	/**
	 * Creates an item if it does not already exist, or returns existing item.
	 * 
	 * @param uniqueName
	 *            can be null
	 * @param shortname
	 *            the short name
	 * @param it
	 *            the type
	 * @param parent
	 *            the parent can be null if the item type has no part incoming
	 *            link type
	 * @param lt
	 *            the link type between parent.getType() and it, can be null if
	 *            the item type has no par incoming link type or if there is one
	 *            link type between parent.getType() and it
	 * @param attributes
	 *            the attributes : it's a pair of objects which types can be :
	 *            (linktype, item) or (String, item) or (String, Object).
	 * 
	 * @return a new item or find item
	 * 
	 * 
	 * @param uniqueName
	 *            item unique name
	 * @param shortName
	 *            item short name
	 * @param itemType
	 *            type of the item to create
	 * @param parent
	 *            parent item (can be null if no parent)
	 * @param partLinkType
	 *            part link type used to define the parent (can be null if no
	 *            parent)
	 * @param attributes
	 *            pair of attribute name and value
	 * @return created item or found item.
	 */
	public ItemDelta createItemIfNeed(ItemType itemType, Item parent, LinkType partLinkType, String uniqueName,
			String shortName, SetAttrVal<?>... attributes) throws CadseException;

	/**
	 * Returns a delta representing creation operation of a link of type
	 * <code>linkType</code> coming from <code>source</code> and pointing to
	 * <code>destination</code>.
	 * 
	 * @param source
	 *            source item of link to create
	 * @param dest
	 *            destination item of link to create
	 * @param linkType
	 *            type of link to create
	 * @return a delta representing creation operation of a link of type
	 *         <code>linkType</code> coming from <code>source</code> and
	 *         pointing to <code>destination</code>.
	 * @throws CadseException
	 */
	public LinkDelta createLinkIfNeed(ItemDelta source, Item dest, LinkType linkType) throws CadseException;

	/**
	 * Throws an exception if no more operation is allowed on this transaction.
	 * In this case, the transaction has been committed or aborted.
	 * 
	 * @throws IllegalStateException
	 *             if this transaction is read only (already committed or
	 *             aborted), no more operation on it is allowed.
	 */
	public void check_write();

	/**
	 * Returns true if an operation which modifies the logical workspace has
	 * been performed in this transaction.
	 * 
	 * @return true if an operation which modifies the logical workspace has
	 *         been performed in this transaction.
	 */
	public boolean isModified();

	/**
	 * NOT IMPLEMENTED, DO NOT USE IT.
	 * 
	 * @return false.
	 */
	public boolean isUpdate();

	/**
	 * Returns deltas (one for each item) representing all operations performed
	 * by this transaction.
	 * 
	 * @return deltas (one for each item) representing all operations performed
	 *         by this transaction.
	 */
	public Collection<ItemDelta> getItemOperations();

	/**
	 * DO NOT USE IT.
	 * 
	 * Throws an UnsupportedOperationException exception.
	 */
	@Deprecated
	public void addListener(WorkspaceListener l, int eventFilter);

	/**
	 * DO NOT USE IT.
	 * 
	 * Throws an UnsupportedOperationException exception.
	 */
	@Deprecated
	public void addListener(WorkspaceListener l, EventFilter eventFilter);

	/**
	 * DO NOT USE IT.
	 * 
	 * Throws an UnsupportedOperationException exception.
	 */
	@Deprecated
	public List<WorkspaceListener> filter(int filters, ImmutableWorkspaceDelta workspaceDelta);

	/**
	 * DO NOT USE IT.
	 * 
	 * Throws an UnsupportedOperationException exception.
	 */
	@Deprecated
	public void removeListener(WorkspaceListener l);

	/**
	 * DO NOT USE IT.
	 * 
	 * Throws an UnsupportedOperationException exception.
	 */
	@Deprecated
	public void clear() throws CadseException;

	/**
	 * DO NOT USE IT.
	 * 
	 * Throws an UnsupportedOperationException exception.
	 */
	@Deprecated
	public void loadCadseModel(String qualifiedCadseModelName);

	/**
	 * DO NOT USE IT.
	 * 
	 * Throws an UnsupportedOperationException exception.
	 */
	@Deprecated
	public void setAttribute(Item item, String key, Object value);

	/**
	 * DO NOT USE IT.
	 * 
	 * Throws an UnsupportedOperationException exception.
	 */
	@Deprecated
	public void setAttribute(Item item, IAttributeType<?> key, Object value);

	/**
	 * DO NOT USE IT.
	 * 
	 * Throws an UnsupportedOperationException exception.
	 */
	@Deprecated
	public CadseRuntime createCadseRuntime(String name, CompactUUID runtimeId, CompactUUID definitionId);

	/**
	 * DO NOT USE IT.
	 * 
	 * Throws an UnsupportedOperationException exception.
	 */
	@Deprecated
	public <T> T getAttribute(Item source, IAttributeType<T> type, boolean ownerOnly);

	/**
	 * DO NOT USE IT.
	 * 
	 * Throws an UnsupportedOperationException exception.
	 */
	@Deprecated
	public <T> T getAttribute(Item source, String key, boolean ownerOnly);

	public ContextVariable getOldContext();

	public ContextVariable getNewContext();

	/**
	 * 
	 * @param link
	 * @return
	 * @throws CadseException
	 *             if the link is not found
	 */
	public LinkDelta getLink(Link link) throws CadseException;
}
