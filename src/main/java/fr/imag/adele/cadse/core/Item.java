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
/*
 * Adele/LIG/ Grenoble University, France
 * 2006-2008
 */
package fr.imag.adele.cadse.core;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import fr.imag.adele.cadse.core.attribute.DelegateValue;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.build.Exporter;
import fr.imag.adele.cadse.core.build.FacetteBuild;
import fr.imag.adele.cadse.core.content.ContentItem;
import fr.imag.adele.cadse.core.internal.InternalItem;
import fr.imag.adele.cadse.core.key.Key;
import fr.imag.adele.cadse.core.transaction.delta.ImmutableWorkspaceDelta;
import fr.imag.adele.cadse.core.ui.Pages;
import fr.imag.adele.cadse.core.ui.view.FilterContext;
import fr.imag.adele.cadse.core.ui.view.NewContext;

/**
 * An item is an object of logical workspace. It has attributes composed by a
 * pair of attribute type and of value. attribute types has a name in form of a
 * string, and value is a serialized object. Each item has a type called an
 * ItemType. Item has outgoing and incoming links to others items.
 * 
 */

public interface Item extends IAttributable, INamedUUID, INamed, IItemAttributableType, InternalItem, FacetteBuild {

	/**
	 * TODO version dec 2009 remove this lines
	 * 
	 * @deprecated use {@link CadseGCST#ITEM_TYPE_at_QUALIFIED_NAME_}
	 */
	@Deprecated
	public static final String	ATTR_LONG_NAME							= "ws::private::name";					;

	/** The Constant NO_VALUE_STRING. */
	public static final String	NO_VALUE_STRING							= "<no value>";

	/**
	 * 
	 */
	public static final String	IS_VALID_KEY							= "#is-valid";

	/**
	 * @deprecated use {@link CadseGCST#ITEM_TYPE_at_READ_ONLY_}
	 */
	@Deprecated
	public static final String	IS_READ_ONLY_KEY						= "#is-read-only";
	public static final String	IS_MODIFIED_KEY							= "#is-modified";

	@Deprecated
	public static final String	VERSION_KEY								= "#version-key";
	public static final String	LINK_INDEX_KEY							= "#link-index";
	@Deprecated
	public static final String	HIDDEN_ATTRIBUTE						= "#hidden";
	// public static final String DEFAULT_CONTENT_ATTRIBUTE_KEY =
	// "#default-content";

	public static final int		CAN_BE_UNDEFINED						= 0x00000001;
	public static final int		MUST_BE_INITIALIZED_AT_CREATION_TIME	= 0x00000002;
	public static final int		FINAL									= 0x00000004;
	public static final int		HIDDEN_IN_COMPUTED_PAGES				= 0x00000008;

	public static final int		NATIF									= 0x00000010;
	public static final int		TRANSIENT								= 0x00000020;
	// free to other kind
	public static final int		ATTRIBUTE_HEAD							= 0x00000040;
	public static final int		PERSISTENCE_CACHE						= 0x00000080;

	public static final int		NOT_EMPTY								= 0x00000100;
	public static final int		PERSISTENCE_CACHE_LOADED				= 0x00000200;
	public static final int		ABSTRACT								= 0x00000400;
	public static final int		HAS_CONTENT								= 0x00000800;

	public static final int		UNRESOLVED								= 0x00001000;
	public static final int		READONLY								= 0x00002000;
	public static final int		WORKING_COPY							= 0x00004000;

	// 1

	public static final int		EVOL_REQUIRER_NEW_REV					= 0x00010000;
	public static final int		EVOL_REV_MODIFIED						= 0x00020000;
	public static final int		EVOL_LINK_TYPE_COUPLED					= 0x00040000;

	// 1

	public static final int		UI_VSCROLL								= 0x00100000;
	public static final int		UI_HSCROLL								= 0x00200000;
	// 3

	public static final int		UI_TEXT_MULTI_LINE						= 0x01000000;
	public static final int		UI_TEXT_WRAP_LINE						= 0x02000000;
	public static final int		UI_NO_BORDER							= 0x04000000;
	public static final int		UI_RUNNING								= 0x08000000;

	public static final int		IS_MODIFIED								= 0x10000000;
	public static final int		IS_HIDDEN								= 0x20000000;
	public static final int		IS_RUNTIME								= 0x40000000;
	public static final int		DEFAULT_FLAG							= 0x80000000;

	public static final int		DEFAULT_FLAG_VALUE						= EVOL_REQUIRER_NEW_REV | DEFAULT_FLAG;

	/**
	 * Returns the immutable universally unique identifier of this item. Item
	 * has same Id for all its life.
	 * 
	 * @return an immutable universally unique identifier of this item.
	 */
	public UUID getId();

	/**
	 * @deprecated use getName()
	 * 
	 * @return item name.
	 */
	@Deprecated
	public String getShortName();

	/**
	 * Returns item name. It is a symbolic name. It may change and it is not
	 * unique. It should be unique for all items of a same type inside a logical
	 * workspace.
	 * 
	 * @return item name.
	 */
	@Override
	public String getName();

	/**
	 * Returns item qualified name. It is a symbolic name. It may change and it
	 * is not unique. It should be unique inside a logical workspace. When
	 * unique name is defined with a pattern, computation is done at item
	 * creation time.
	 * 
	 * @return item qualified name.
	 */
	public String getQualifiedName();

	/**
	 * Returns item qualified name. It is a symbolic name. It may change and it
	 * is not unique. It should be unique inside a logical workspace. If unique
	 * name is defined with a pattern and <code>recompute</code> is true, unique
	 * name computation is forced.
	 * 
	 * @param recompute
	 *            if true, force computation of unique name from unique name
	 *            pattern
	 * @return item qualified name.
	 * @throws CadseException
	 */
	public String getQualifiedName(boolean recompute) throws CadseException;

	/**
	 * Returns display name. Display name is the item name (human readable)
	 * shown in CADSE views. It is used to differentiate this item from all
	 * items of same type. Default implementation returns short name.
	 * 
	 * @return display name.
	 */
	public String getDisplayName();

	/**
	 * Returns qualified display name. Display name is the item name (human
	 * readable) shown in CADSE views. It is used to differentiate this item
	 * from all others. Default implementation returns unique name.
	 * 
	 * @return qualified display name.
	 */
	public String getQualifiedDisplayName();

	/**
	 * Sets qualified name. It is a symbolic name. It may change and it is not
	 * unique. It should be unique inside a logical workspace.
	 * 
	 * @param qualifiedName
	 *            item qualified name
	 * @throws CadseException 
	 * 
	 * @throws CadseException
	 */
	public void setQualifiedName(String qualifiedName) throws CadseException ;

	/**
	 * Sets name.
	 * 
	 * @param name
	 *            item name
	 * @throws CadseException 
	 * @throws CadseException
	 */
	public void setName(String name) throws CadseException;

	/**
	 * Return the cadse where is stored this item. It's can be null. But for an
	 * type definition (an item type or an extended type), it cannot be null. A
	 * cadse is in it-self.
	 * 
	 * @return a cadse or null.
	 */
	public CadseRuntime getCadse();
	

	public UUID getCadseId();

	/**
	 * Set the cadse of this item
	 * 
	 * @param cr
	 */
	public void setCadse(CadseRuntime cr);

	/**
	 * Returns true if this item is associated to a content (one or many eclipse
	 * resources).
	 * 
	 * @return true, if this item is associated to a content.
	 */
	public boolean itemHasContent();

	/**
	 * Returns true if <code>it</code> is type or an ancestor type of this item.
	 * 
	 * @param it
	 *            an item type
	 * 
	 * @return true if <code>it</code> is type or an ancestor type of this item.
	 */
	public boolean isInstanceOf(TypeDefinition it);

	/**
	 * Returns item type.
	 * 
	 * @return item type.
	 */
	public ItemType getType();

	/**
	 * Returns item type.
	 * 
	 * @return item type.
	 */
	public ItemType[] getTypes();

	/**
	 * Returns state of this item.
	 * 
	 * @return state of this item.
	 */
	public ItemState getState();

	/**
	 * Returns an unmodifiable list of all <tt>outgoing</tt> links. Outgoing
	 * links are links coming from this item.
	 * 
	 * @return an unmodifiable list of all <tt>outgoing</tt> links.
	 */
	public List<Link> getOutgoingLinks();
	
	/**
	 * Returns the link types defined in this types and all hierarchical
	 * @return not null list of all LinkType can accept this instance
	 */
	public List<LinkType> getLocalOutgoingLinkTypes();
	

	/**
	 * Returns an unmodifiable list of all <tt>outgoing</tt> links of
	 * <code>linkType</code> link type. Outgoing links are links coming from
	 * this item.
	 * 
	 * @param linkType
	 *            a link type
	 * @return an unmodifiable list of all <tt>outgoing</tt> links of
	 *         <code>linkType</code> link type.
	 * @exception IllegalArgumentException
	 *                if <code>linkType</code> is null.
	 */
	public List<Link> getOutgoingLinks(LinkType linkType);

	/**
	 * Returns the link of <code>linkType</code> type coming from this item.
	 * Link type maximum cardinality must be equal to one. Returns null if link
	 * does not exist.
	 * 
	 * @param linkType
	 *            a link type
	 * 
	 * @return the link of <code>linkType</code> type coming from this item.
	 * 
	 * @throws CadseException
	 *             if the max cardinality of <code>linkType</code> link type is
	 *             not equal to one.
	 */
	public Link getOutgoingLink(LinkType linkType);

	/**
	 * Returns one of its outgoing links pointing to destination item. If there
	 * is no link pointing to destination item, returns null.
	 * 
	 * @param destItem
	 *            an item
	 * 
	 * @return one of its outgoing links.
	 */
	public Link getOutgoingLink(Item destItem);

	/**
	 * Returns one of its outgoing links of specified type pointing to
	 * destination item. If there is no corresponding link, returns null.
	 * 
	 * @param linkType
	 *            a link type
	 * @param destId
	 *            destination item id
	 * 
	 * @return one of its outgoing links of specified type pointing to
	 *         destination item.
	 */
	public Link getOutgoingLink(LinkType lt, UUID destId);

	/**
	 * Returns destination of its outgoing links of specified type pointing to
	 * destination item. If there is no corresponding link, returns null.
	 * 
	 * @param linkType
	 *            a link type
	 * @param destId
	 *            destination item id
	 * 
	 * @return one of its outgoing links of specified type pointing to
	 *         destination item.
	 */
	public Item getOutgoingItem(String linkTypeName, UUID itemId, boolean resolvedOnly);

	/**
	 * Gets the outgoing item.
	 * 
	 * @param lt
	 *            the lt
	 * @param resovledOnly
	 *            the resovled only
	 * 
	 * @return the outgoing item
	 */
	public Collection<Item> getOutgoingItems(LinkType lt, boolean resolvedOnly);

	/**
	 * Gets the outgoing item.
	 * 
	 * @param resovledOnly
	 *            the resovled only
	 * 
	 * @return the outgoing item
	 */
	public Collection<Item> getOutgoingItems(boolean resolvedOnly);

	/**
	 * Gets the outgoing item.
	 * 
	 * @param types_link
	 *            the types_link
	 * @param resovledOnly
	 *            the resovled only
	 * 
	 * @return the outgoing item
	 */
	public Collection<Item> getOutgoingItems(String types_link, boolean resolvedOnly);

	/**
	 * Gets the outgoing item one.
	 * 
	 * @param lt
	 *            the lt
	 * @param resovledOnly
	 *            the resovled only
	 * 
	 * @return the outgoing item one
	 */
	public Item getOutgoingItem(LinkType lt, boolean resolvedOnly);

	/**
	 * Gets the outgoing item one.
	 * 
	 * @param linkTypeName
	 *            link type name
	 * @param resovledOnly
	 *            the resovled only
	 * 
	 * @return the outgoing item one
	 */
	public Item getOutgoingItem(String linkTypeName, boolean resolvedOnly);

	/**
	 * Sets the outgoing item one.
	 * 
	 * @param linkType
	 *            the link type
	 * @param dest
	 *            the dest
	 * 
	 * @return the link
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	public Link setOutgoingItem(LinkType linkType, Item dest) throws CadseException;

	/**
	 * Sets the outgoing item.
	 * 
	 * @param linkType
	 *            the link id
	 * @param value
	 *            the value
	 * 
	 * @return the collection< link>
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	public Collection<Link> setOutgoingItems(LinkType linkType, Collection<Item> value) throws CadseException;

	/**
	 * Adds the outgoing item.
	 * 
	 * @param linkType
	 *            the link id
	 * @param value
	 *            the value
	 * 
	 * @return the link
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	public Link addOutgoingItem(LinkType linkType, Item destination) throws CadseException;

	/**
	 * Removes the outgoing item.
	 * 
	 * @param linkType
	 *            the link id
	 * @param value
	 *            the value
	 * 
	 * @return the link
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	public Link removeOutgoingItem(LinkType linkType, Item destination) throws CadseException;

	/**
	 * Returns true if link <tt>l</tt> is an outgoing link of this item.
	 * 
	 * @param l
	 *            a link
	 * 
	 * @return true if link <tt>l</tt> is an outgoing link of this item.
	 */
	public boolean isInOutgoingLinks(Link l);

	/**
	 * Returns an unmodifiable list of all <tt>incoming</tt> links. Incoming
	 * links are links pointing to this item.
	 * 
	 * @return an unmodifiable list of all <tt>incoming</tt> links.
	 */
	public List<Link> getIncomingLinks();

	/**
	 * Returns an unmodifiable list of all <tt>incoming</tt> links of
	 * <code>linkType</code> link type. Incoming links are links pointing to
	 * this item.
	 * 
	 * @param linkType
	 *            a link type
	 * @return an unmodifiable list of all <tt>incoming</tt> links of
	 *         <code>linkType</code> link type.
	 * @exception IllegalArgumentException
	 *                if <code>linkType</code> is null.
	 */
	public List<Link> getIncomingLinks(LinkType linkType);

	/**
	 * Returns the link of <code>linkType</code> type coming from item with
	 * <code>srcId</code> Id and pointing to this item. Returns null if link
	 * does not exist.
	 * 
	 * @param linkType
	 *            a link type
	 * @param srcId
	 *            source of link to find
	 * @return the link of <code>linkType</code> type coming from item with
	 *         <code>srcId</code> Id and pointing to this item.
	 */
	public Link getIncomingLink(LinkType linkType, UUID srcId);

	/**
	 * Returns all source items of links of <code>linkType</code> type pointing
	 * to this item.
	 * 
	 * @param linkType
	 *            a link type
	 * @return all source items of links of <code>linkType</code> type pointing
	 *         to this item.
	 */
	public Collection<Item> getIncomingItems(LinkType linkType);

	/**
	 * Returns all source items of links pointing to this item.
	 * 
	 * @return all source items of links pointing to this item.
	 */
	public Collection<Item> getIncomingItems();

	/**
	 * Returns source item of the link of <code>linkType</code> type pointing to
	 * this item. Returns null if link does not exist.
	 * 
	 * @param linkType
	 *            a link type
	 * @return source item of the link of <code>linkType</code> type pointing to
	 *         this item.
	 */
	public Item getIncomingItem(LinkType linkType);

	/**
	 * Returns an unmodifiable list of all outgoing aggregation links.
	 * 
	 * @return an unmodifiable list of list all outgoing aggregation links.
	 */
	public List<Link> getAggregations();

	/**
	 * Creates an outgoing link from this item to <code>destItemId</code> and
	 * returns it.
	 * 
	 * @param linkType
	 *            a link type
	 * @param destItem
	 *            destination item
	 * 
	 * @return created link.
	 * 
	 * @throws CadseException
	 *             if destination item does not exist or <code>linkType</code>
	 *             is null or if linkType is composition kind and creation of
	 *             this link leads to a composition link cycle or if linkType is
	 *             part kind or this link already exists.
	 */
	public Link createLink(LinkType linkType, Item destItem) throws CadseException;

	/**
	 * Returns true if specified link can be created (link creation operation
	 * will not fail).
	 * 
	 * @param linkType
	 *            a link type
	 * @param destItemId
	 *            id of destination item
	 * 
	 * @return true if specified link can be created.
	 */
	public boolean canCreateLink(LinkType linkType, UUID destItemId);

	/**
	 * Deletes this item. This method deletes all <tt>incoming</tt> and
	 * <tt>outgoing</tt> links of this item. If <code>deleteContent</code> is
	 * true, delete all contents (IDE resources) associated to this item. After
	 * this operation, logical workspace has no more reference on this item.
	 * 
	 * @param deleteContent
	 *            if true, delete all contents (IDE resources) associated to
	 *            this item
	 * 
	 * @throws CadseException
	 */
	public void delete(boolean deleteContent) throws CadseException;

	/**
	 * Remove from logical workspace this item but keep it in persistence.
	 * Before remove it, CADSE runtime saves it in persistence. All outgoing
	 * links are deleted and incoming links become unresolved (pointing to a
	 * description of this item). All associated IDE resources will be visible
	 * in the workspace but are no more attached to this item until it is
	 * reloaded.
	 * 
	 * @throws CadseException
	 */
	public void unload() throws CadseException;

	/**
	 * Remove from logical workspace this item but keep it in a cache. Before
	 * remove it, CADSE runtime saves it in cache. All outgoing links are
	 * deleted and incoming links become unresolved (pointing to a description
	 * of this item). All associated IDE resources will be visible in the
	 * workspace but are no more attached to this item until it is reloaded. If
	 * <code>deleteContent</code> is true, delete all contents (IDE resources)
	 * associated to this item after saving them into a cache.
	 * 
	 * @param deleteContent
	 *            delete all contents (IDE resources) associated to this item
	 *            after saving them into a cache
	 * 
	 * @throws CadseException
	 */
	public void shadow(boolean deleteContent) throws CadseException;

	/**
	 * Returns true if set <code>value</code> value for <code>attrName</code>
	 * attribute will not fail. For example, value of a final attribute cannot
	 * be changed.
	 * 
	 * @param attrName
	 *            name of attribute to set
	 * @param value
	 *            attribute value
	 * 
	 * @return if set <code>value</code> value for <code>attrName</code>
	 *         attribute will not fail.
	 */
	@Deprecated
	public boolean canSetAttribute(String attrName, Object value);

	/**
	 * Sets valid status for this item. An invalid item is TODO.
	 * 
	 * @param isValid
	 *            true if this item is now considered as a valid item
	 */
	public void setValid(boolean isValid);

	/*
	 * Composition links mamanegement
	 */

	/**
	 * Returns true if it is a composite. A composite item has at least one
	 * outgoing composition link.
	 * 
	 * @return true, if it is composite.
	 */
	public boolean isComposite();

	/**
	 * Builds this item. This operation launch all CADSE builders (composers and
	 * exporters) of this item and of its component ones. After this operation,
	 * all IDE resources associated to this item and to its component ones will
	 * be built.
	 * 
	 * @throws CadseException
	 */
	public void buildComposite() throws CadseException;

//	/**
//	 * Returns all items which have composition links pointing to this item.
//	 * 
//	 * @return all items which have composition links pointing to this item.
//	 */
//	public List<Item> getCompositeParent();

	/**
	 * Returns true if this item is an orphan. In this case, the logical
	 * workspace does not reference it. Most of time, orphans are used during
	 * create item process.
	 * 
	 * @return true if this item is an orphan.
	 */
	public boolean isOrphan();

	/**
	 * Returns true if this item is considered by CADSE as valid.
	 * 
	 * @return true if this item is considered by CADSE as valid.
	 */
	public boolean isValid();

	/**
	 * Returns true if this item can be a parent item. In other words, tests if
	 * its type has outgoing part link types.
	 * 
	 * @return true if this item can be a parent item.
	 */
	public boolean isPartItem();

	/**
	 * Returns true if this item can not be modified anymore. Runtime items are
	 * items (mostly ItemTypes) which are defined in a CADSE definition model. 
	 * There are no content.
	 * 
	 * @return true if this item can not be modified anymore.
	 */
	public boolean isRuntime();

	/**
	 * Returns its parent item. An item has at most one parent. The parent item
	 * is the only item which has an outgoing part link pointing to this item.
	 * If it has no parent and <code>attemptToRecreate</code> is true, try to
	 * recreate one else returns null.
	 * 
	 * @param attemptToRecreate
	 *            if true, attempts to create link if is missing
	 * @return its parent item.
	 */
	public Item getPartParent(boolean attemptToRecreate);

	/**
	 * Returns parent of this item. An item has at most one parent. The parent
	 * item is the only item which has an outgoing part link pointing to this
	 * item. If it has no parent, returns null.
	 * 
	 * @return parent of this item.
	 */
	public Item getPartParent();

	/**
	 * Returns parent of this item if used part link type is specified one. An
	 * item has at most one parent. The parent item is the only item which has
	 * an outgoing part link pointing to this item. If it has no parent or used
	 * part link type is not specified one, returns null.
	 * 
	 * @param linkType
	 *            a part link type
	 * @return parent of this item if used part link type is specified one.
	 */
	public Item getPartParent(LinkType linkType);

	/**
	 * Returns parent of this item if used part link type is specified one. An
	 * item has at most one parent. The parent item is the only item which has
	 * an outgoing part link pointing to this item. If it has no parent or used
	 * part link type is not specified one, returns null. If it has no parent
	 * and and <code>attemptToRecreate</code> is true, try to recreate a parent
	 * item.
	 * 
	 * @param linkType
	 *            a part link type
	 * @param attemptToRecreate
	 *            if true, attempts to create link if is missing
	 * @return parent of this item if used part link type is specified one.
	 */
	public Item getPartParent(LinkType linkType, boolean attemptToRecreate) throws CadseException;

	/**
	 * Returns the first ancestor which is instance of <code>itemType</code>
	 * type. Part links are transitive, so a parent of a parent of an item is
	 * also considered as its parent (an ancestor).
	 * 
	 * @param itemType
	 *            an item type
	 * 
	 * @return the first ancestor which is instance of <code>itemType</code>
	 *         type.
	 */
	public Item getPartParent(ItemType itemType);

	/**
	 * Returns the first ancestor with specified type name. Part links are
	 * transitive, so a parent of a parent of an item is also considered as its
	 * parent (an ancestor).
	 * 
	 * @param typeName
	 *            name of an item type
	 * 
	 * @return the first ancestor with specified type name.
	 */
	public Item getPartParentByName(String typeName);

	/**
	 * Returns destination item with <code>destItemId</code> Id of the part link
	 * coming from this item. Returns null if link does not exist.
	 * 
	 * @param destItemId
	 *            an item Id
	 * 
	 * @return destination item with <code>destItemId</code> Id of the part link
	 *         coming from this item.
	 */
	public Item getPartChild(UUID destItemId);

	/**
	 * Returns an unmodifiable list of all destination items of part links
	 * coming from this item.
	 * 
	 * @return an unmodifiable list of all destination items of part links
	 *         coming from this item.
	 */
	public Collection<Item> getPartChildren();

	/**
	 * Returns all children (following outgoing links of specified type) of this
	 * item. Children items are destinations of outgoing part links of this
	 * item. Return an empty collection if this item has no child.
	 * 
	 * @param linkType
	 *            a link type
	 * 
	 * @return all children (following outgoing links of specified type) of this
	 *         item.
	 */
	public Collection<Item> getPartChildren(LinkType linkType);

	/**
	 * Returns true if link <tt>l</tt> is an incoming link of this item.
	 * 
	 * @param l
	 *            a link
	 * 
	 * @return true if link <tt>l</tt> is an incoming link of this item.
	 */
	public boolean isInIncomingLinks(Link l);

	/**
	 * Returns Java files representing root IDE resources associated to this
	 * item. For example, if this item is related to a Java project, returns
	 * root directory of this project.
	 * 
	 * TODO should returns a set of file.
	 * 
	 * @return Java files representing root IDE resources associated to this
	 *         item.
	 * @throws if it is not implemented
	 * @deprecated prefers getMainMappingContent(...) to have references on
	 *             resources
	 */
	@Deprecated
	public File getLocation();

	/**
	 * Returns the main associated mapping content (IDE resource...) of this
	 * item. In case of IDE resources, main mapping is root resource
	 * (containing) of all resources represented by this item. If there is no
	 * corresponding associated contents, returns null.
	 * 
	 * @param clazz
	 *            a class
	 * 
	 * @return the main associated mapping content (IDE resource...) of this
	 *         item.
	 */
	public <T> T getMainMappingContent(Class<T> clazz);

	/**
	 * Returns the associated mapping contents (IDE resources...) which are
	 * instances of <code>clazz</code> class of this item. If there is no
	 * corresponding associated contents, returns null or an empty list.
	 * 
	 * @param clazz
	 *            a class
	 * 
	 * @return the associated mapping contents (IDE resources...) which are
	 *         instances of <code>clazz</code> class of this item.
	 */
	public <T> List<T> getMappingContents(Class<T> clazz);

	/**
	 * Returns the associated mapping contents (IDE resources...) of this item.
	 * If there is no corresponding associated contents, returns null or an
	 * empty list.
	 * 
	 * @return the associated mapping contents (IDE resources...) of this item.
	 */
	public List<?> getMappingContents();

	/**
	 * Returns true if IDE resource with relative path equal to
	 * <code>slashedPath</code> is editable. Note that relative path must begin
	 * with a slash (/).
	 * 
	 * @param slashedPath
	 *            relative path to IDE resource to test
	 * 
	 * @return true if IDE resource with relative path equal to
	 *         <code>slashedPath</code> is editable.
	 */
	public boolean canEditContent(String slashedPath);

	/**
	 * Defines this as read only. Add outgoing links or modify attribute values
	 * of read only is disallowed.
	 * 
	 * @param readOnly
	 *            if true, this item will be read only
	 * @throws CadseException
	 * @Deprecated prefers using IWorkspaceLogiqueWorkingCopy to encapsulate a
	 *             modification in a transaction.
	 */
	public void setReadOnly(boolean readOnly) throws CadseException;

	/**
	 * Returns true if this item is hidden. An hidden item is not visible in
	 * CADSE views if hidden filter is enable.
	 * 
	 * @return true if this item is hidden.
	 */
	public boolean isHidden();

	/**
	 * Returns true if it is read only. Add outgoing links or modify attribute
	 * values of read only is disallowed.
	 * 
	 * @return true if it is read only.
	 */
	public boolean isReadOnly();

	/**
	 * Returns true if a way exists from this item to specified one by following
	 * part and aggregation outgoing links.
	 * 
	 * @param item
	 *            an item
	 * 
	 * @return true if a way exists from this item to specified one by following
	 *         part and aggregation outgoing links.
	 */
	public boolean isAncestorOf(Item item);

	public boolean isMemberOf(Item item);

	public ItemType getGroup();

	public boolean isMember();

	/**
	 * Returns CADSE domain. CADSE Domain is root entry to the current logical
	 * workspace.
	 * 
	 * @return CADSE domain.
	 */
	public CadseDomain getCadseDomain();

//	/**
//	 * Returns all destination items of outgoing composition links from this
//	 * item.
//	 * 
//	 * @return all destination items of outgoing composition links from this
//	 *         item.
//	 */
//	public Set<Item> getComponents();
//
//	/**
//	 * Returns all destination item ids of outgoing composition links from this
//	 * item.
//	 * 
//	 * @return all destination item ids of outgoing composition links from this
//	 *         item.
//	 */
//	public Set<UUID> getComponentIds();
//
//	/**
//	 * Returns true if there is one destination item with same id of an outgoing
//	 * composition link from this item.
//	 * 
//	 * @param itemId
//	 *            a component item id
//	 * 
//	 * @return true if there is one destination item with same id of an outgoing
//	 *         composition link from this item.
//	 */
//	public boolean containsComponent(UUID itemId);
//
//	/**
//	 * Returns destination item with same id of an outgoing composition link
//	 * from this item if it exists else returns null.
//	 * 
//	 * @param itemId
//	 *            a component item id
//	 * 
//	 * @return destination item with same id of an outgoing composition link
//	 *         from this item if it exists else returns null.
//	 */
//	public Item getComponentInfo(UUID itemId);

	/**
	 * Returns current logical workspace.
	 * 
	 * @return current logical workspace.
	 */
	public LogicalWorkspace getLogicalWorkspace();

	/**
	 * Returns true if specified item is destination of an outgoing part link
	 * from this item.
	 * 
	 * @param item
	 *            an item
	 * 
	 * @return true if specified item is destination of an outgoing part link
	 *         from this item.
	 */
	public boolean containsPartChild(Item item);

	/**
	 * Returns true if it is resolved. A resolved item is an item which is
	 * contained in the logical workspace. An unresolved one is a virtual item
	 * which represents a reference to the actual one (In fact, contains the
	 * item id).
	 * 
	 * @return true, if is resolved.
	 */
	public boolean isResolved();

	/**
	 * Returns type of the incoming part link coming from its parent. If it has
	 * no parent, returns null.
	 * 
	 * @return type of the incoming part link coming from its parent.
	 * @deprecated Use {@link #getPartParentLinkType()} instead
	 */
	@Deprecated
	public LinkType getPartParentLink();

	/**
	 * Returns type of the incoming part link coming from its parent. If it has
	 * no parent, returns null.
	 * 
	 * @return type of the incoming part link coming from its parent.
	 */
	public LinkType getPartParentLinkType();

	/**
	 * Returns the content item representing the associated content. If it has a
	 * content and content item does not exist, creates and returns it. If it
	 * has no content, returns null.
	 * 
	 * @return the content item representing the associated content.
	 */
	public ContentItem getContentItem();

	/**
	 * Returns content item which allow to get content manager.
	 * 
	 * @deprecated Use {@link #getContentItem()} instead
	 * @return content item which allow to get content manager.
	 */
	@Deprecated
	public ContentItem getAndCreateContentManager();

	/**
	 * Return true if the content associated to this item is loaded. A content
	 * is loaded if content item representing the associated content exists. If
	 * it has no content, returns false.
	 * 
	 * @return true if the content associated to this item is loaded.
	 */
	public boolean contentIsLoaded();

	/**
	 * INTERNAL method.
	 * 
	 * Deletes content item which represents associated content.
	 */
	public void removeContentItem();

	/**
	 * Returns false if it is unresolved.
	 * 
	 * @return false if it is unresolved.
	 */
	@Deprecated
	public boolean isAccessible();

	/**
	 * TODO
	 * 
	 * @return the key
	 */
	public Key getKey();

	/**
	 * Adds a listener for modification, deletion about this item.
	 * 
	 * @see fr.imag.adele.cadse.core.ChangeID
	 * 
	 * @param listener
	 *            a listener for modification, deletion about this item.
	 * @param eventFilter
	 *            ChangeID event mask
	 */
	public void addListener(WorkspaceListener listener, int eventFilter);

	/**
	 * Adds a listener for modification, deletion about this item.
	 * 
	 * @param listener
	 *            a listener for modification, deletion about this item.
	 * @param eventFilter
	 *            an event filter
	 */
	public void addListener(WorkspaceListener listener, EventFilter eventFilter);

	/**
	 * Removes a listener on this item.
	 * 
	 * @param listener
	 *            a listener for modification, deletion about this item.
	 */
	public void removeListener(WorkspaceListener listener);

	/**
	 * Returns all listeners for modification, deletion about this item which
	 * are interested in operations specified by eventFilter on logical
	 * workspace delta.
	 * 
	 * @see fr.imag.adele.cadse.core.ChangeID
	 * 
	 * @param eventFilter
	 *            ChangeID event mask
	 * @param delta
	 *            a logical workspace delta
	 * @return all listeners for modification, deletion about this item which
	 *         are interested in operations specified by eventFilter on logical
	 *         workspace delta.
	 */
	public List<WorkspaceListener> filter(int eventFilter, ImmutableWorkspaceDelta delta);

	/**
	 * INTERNAL method.
	 * 
	 * Sets state of this item.
	 * 
	 * @param newState
	 *            new item state
	 */
	public void setState(ItemState newState);

	/**
	 * INTERNAL method.
	 */
	public void finishLoad();

	/**
	 * Sets item key.
	 * 
	 * @param newkey
	 *            new item key.
	 * @throws CadseException
	 */
	public void setKey(Key newkey) throws CadseException;

	/**
	 * Returns order number of specified link. Outgoing links of a same type are
	 * ordered.
	 * 
	 * @param link
	 *            an outgoing link
	 * @return order number of specified link.
	 */
	public int indexOf(Link link);

	/**
	 * Returns version of this item.
	 * 
	 * @return version of this item.
	 */
	public int getVersion();

	/**
	 * Returns revision number of last version available in the repository.
	 * Returns 0 if this item does not exist in the repository. Returns -1 if
	 * the repository is not available and accessible.
	 * 
	 * @return revision number of last version available in the repository.
	 */
	public int getLastVersion();

	/**
	 * Returns true if it is considered as modified by versionning system and
	 * that commit this item will create a new revision of it in the repository.
	 * 
	 * @return true if it is considered as modified by versionning system and
	 *         that commit this item will create a new revision of it in the
	 *         repository.
	 */
	public boolean isRequireNewRev();

	/**
	 * Returns true if it is considered as modified by versionning system.
	 * 
	 * @return true if it is considered as modified by versionning system.
	 */
	public boolean isRevModified();

	/**
	 * return the base item or this if no
	 * 
	 * @return
	 */
	public Item getBaseItem();

	public boolean exists();


	/**
	 * Gets the good creation page.
	 * 
	 * @param parent
	 *            the parent
	 * @param type
	 *            the type
	 * @param lt
	 *            the lt
	 * 
	 * @return the good creation page
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	public Pages getCreationPages(NewContext context) throws CadseException;
	
	public Pages getModificationPages(FilterContext context);

	// PackageFacette
	
	int getIdInPackage();
	
	void setIdInPackage(int idInPackage);

	public Exporter[] getExporter(String exporterType);

	public boolean containsComponent(UUID itemIdentification);

	Set<Item> getComponents();

	Set<UUID> getComponentIds();

	Item getComponentInfo(UUID id);

	// Delegation value
	
	DelegateValue getDelegateValue(IAttributeType<?> attr);
	
	boolean canInstantiateValue(IAttributeType<?> attr);

	public boolean isDelegatedValue(IAttributeType<?> attr);
	

}