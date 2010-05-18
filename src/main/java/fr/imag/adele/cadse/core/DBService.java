package fr.imag.adele.cadse.core;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import fr.imag.adele.cadse.core.attribute.GroupOfAttributes;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.content.ContentItem;
import fr.imag.adele.cadse.core.key.DefaultKeyDefinitionImpl;
import fr.imag.adele.cadse.core.key.Key;
import fr.imag.adele.cadse.core.ui.IActionContributor;
import fr.imag.adele.cadse.core.ui.IActionPage;
import fr.imag.adele.cadse.core.ui.IPage;
import fr.imag.adele.cadse.core.ui.UIField;
import fr.imag.adele.cadse.core.ui.UIValidator;

public interface DBService {

	public interface EltFactory {
		public <T> T newElt(Class<T> clazz, int id);
	}

	TypeDefinition[] getRootItemType() throws CadseException;

	TypeDefinition[] getItemType(int viewId) throws CadseException;

	public <T> T getValue(IAttributeType<T> attr, INamedUUID object) throws CadseException;

	public <T> void setValue(IAttributeType<T> attr, INamedUUID object, T v) throws CadseException;

	TypeDefinition getType(INamedUUID object) throws CadseException;

	TypeDefinition[] getTypes(INamedUUID object) throws CadseException;

	TypeDefinition[] getAllTypes(INamedUUID object) throws CadseException;

	/**
	 * Returns item name. It is a symbolic name. It may change and it is not
	 * unique. It should be unique for all items of a same type inside a logical
	 * workspace.
	 * 
	 * @return item name.
	 */
	public String getName(INamedUUID object) throws CadseException;

	/**
	 * Returns item qualified name. It is a symbolic name. It may change and it
	 * is not unique. It should be unique inside a logical workspace. When
	 * unique name is defined with a pattern, computation is done at item
	 * creation time.
	 * 
	 * @return item qualified name.
	 */
	public String getQualifiedName(INamedUUID object) throws CadseException;

	/**
	 * Returns display name. Display name is the item name (human readable)
	 * shown in CADSE views. It is used to differentiate this item from all
	 * items of same type. Default implementation returns short name.
	 * 
	 * @return display name.
	 */
	public String getDisplayName(INamedUUID object) throws CadseException;

	/**
	 * Sets qualified name. It is a symbolic name. It may change and it is not
	 * unique. It should be unique inside a logical workspace.
	 * 
	 * @param qualifiedName
	 *            item qualified name
	 * 
	 * @throws CadseException
	 */
	public void setQualifiedName(INamedUUID object, String qualifiedName) throws CadseException;

	/**
	 * Sets name.
	 * 
	 * @param name
	 *            item name
	 * @throws CadseException
	 */
	public void setName(INamedUUID object, String name) throws CadseException;

	/**
	 * Return the cadse where is stored this item. It's can be null. But for an
	 * type definition (an item type or an extended type), it cannot be null. A
	 * cadse is in it-self.
	 * 
	 * @return a cadse or null.
	 */
	public CadseRuntime getCadse(INamedUUID object) throws CadseException;

	/**
	 * Set the cadse of this item
	 * 
	 * @param cr
	 */
	public void setCadse(INamedUUID object, CadseRuntime cr) throws CadseException;

	/**
	 * Returns true if this item is associated to a content (one or many eclipse
	 * resources).
	 * 
	 * @return true, if this item is associated to a content.
	 */
	public boolean itemHasContent(INamedUUID object) throws CadseException;

	/**
	 * Returns true if <code>it</code> is type or an ancestor type of this item.
	 * 
	 * @param it
	 *            an item type
	 * 
	 * @return true if <code>it</code> is type or an ancestor type of this item.
	 */
	public boolean isInstanceOf(INamedUUID object, TypeDefinition it) throws CadseException;

	/**
	 * Returns state of this item.
	 * 
	 * @return state of this item.
	 */
	public ItemState getState(INamedUUID object) throws CadseException;

	/**
	 * Returns an unmodifiable list of all <tt>outgoing</tt> links. Outgoing
	 * links are links coming from this item.
	 * 
	 * @return an unmodifiable list of all <tt>outgoing</tt> links.
	 */
	public List<Link> getOutgoingLinks(INamedUUID object) throws CadseException;

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
	public List<Link> getOutgoingLinks(INamedUUID object, LinkType linkType) throws CadseException;

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
	public Link getOutgoingLink(INamedUUID object, LinkType linkType) throws CadseException;

	/**
	 * Returns one of its outgoing links pointing to destination item. If there
	 * is no link pointing to destination item, returns null.
	 * 
	 * @param destItem
	 *            an item
	 * 
	 * @return one of its outgoing links.
	 */
	public Link getOutgoingLink(INamedUUID object, INamedUUID destItem) throws CadseException;

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
	public Link getOutgoingLink(INamedUUID object, LinkType lt, UUID destId) throws CadseException;

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
	public Collection<Item> getOutgoingItems(INamedUUID object, LinkType lt, boolean resolvedOnly)
			throws CadseException;

	/**
	 * Gets the outgoing item.
	 * 
	 * @param resovledOnly
	 *            the resovled only
	 * 
	 * @return the outgoing item
	 */
	public Collection<Item> getOutgoingItems(INamedUUID object, boolean resolvedOnly) throws CadseException;

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
	public Item getOutgoingItem(INamedUUID object, LinkType lt, boolean resolvedOnly) throws CadseException;

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
	public Link setOutgoingItem(INamedUUID object, LinkType linkType, INamedUUID dest) throws CadseException;

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
	public Collection<Link> setOutgoingItems(INamedUUID object, LinkType linkType, Collection<INamedUUID> value)
			throws CadseException;

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
	public Link addOutgoingItem(INamedUUID object, LinkType linkType, INamedUUID destination) throws CadseException;

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
	public Link removeOutgoingItem(INamedUUID object, LinkType linkType, INamedUUID destination) throws CadseException;

	/**
	 * Returns true if link <tt>l</tt> is an outgoing link of this item.
	 * 
	 * @param l
	 *            a link
	 * 
	 * @return true if link <tt>l</tt> is an outgoing link of this item.
	 */
	public boolean isInOutgoingLinks(INamedUUID object, Link l) throws CadseException;

	/**
	 * Returns an unmodifiable list of all <tt>incoming</tt> links. Incoming
	 * links are links pointing to this item.
	 * 
	 * @return an unmodifiable list of all <tt>incoming</tt> links.
	 */
	public List<Link> getIncomingLinks(INamedUUID object) throws CadseException;

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
	public List<Link> getIncomingLinks(INamedUUID object, LinkType linkType) throws CadseException;

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
	public Link getIncomingLink(INamedUUID object, LinkType linkType, UUID srcId) throws CadseException;

	/**
	 * Returns all source items of links of <code>linkType</code> type pointing
	 * to this item.
	 * 
	 * @param linkType
	 *            a link type
	 * @return all source items of links of <code>linkType</code> type pointing
	 *         to this item.
	 */
	public Collection<Item> getIncomingItems(INamedUUID object, LinkType linkType) throws CadseException;

	/**
	 * Returns all source items of links pointing to this item.
	 * 
	 * @return all source items of links pointing to this item.
	 */
	public Collection<Item> getIncomingItems(INamedUUID object) throws CadseException;

	/**
	 * Returns source item of the link of <code>linkType</code> type pointing to
	 * this item. Returns null if link does not exist.
	 * 
	 * @param linkType
	 *            a link type
	 * @return source item of the link of <code>linkType</code> type pointing to
	 *         this item.
	 */
	public Item getIncomingItem(INamedUUID object, LinkType linkType) throws CadseException;

	/**
	 * Returns an unmodifiable list of all outgoing aggregation links.
	 * 
	 * @return an unmodifiable list of list all outgoing aggregation links.
	 */
	public List<Link> getAggregations(INamedUUID object) throws CadseException;

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
	public Link createLink(INamedUUID object, LinkType linkType, INamedUUID destItem) throws CadseException;

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
	public void delete(INamedUUID object) throws CadseException;

	/**
	 * Remove from logical workspace this item but keep it in resolved state.
	 * Before remove it, CADSE runtime saves it in persistence. All outgoing
	 * links are deleted and incoming links become unresolved (pointing to a
	 * description of this item).
	 * 
	 * @throws CadseException
	 */
	public void unresolves(INamedUUID object) throws CadseException;

	/**
	 * Sets valid status for this item. An invalid item is TODO.
	 * 
	 * @param isValid
	 *            true if this item is now considered as a valid item
	 */
	public void setValid(INamedUUID object, boolean isValid) throws CadseException;

	/*
	 * Composition links mamanegement
	 */

	/**
	 * Returns true if it is a composite. A composite item has at least one
	 * outgoing composition link.
	 * 
	 * @return true, if it is composite.
	 */
	public boolean isComposite(INamedUUID object) throws CadseException;

	/**
	 * Returns all items which have composition links pointing to this item.
	 * 
	 * @return all items which have composition links pointing to this item.
	 */
	public List<Item> getCompositeParent(INamedUUID object) throws CadseException;

	/**
	 * Returns true if this item is an orphan. In this case, the logical
	 * workspace does not reference it. Most of time, orphans are used during
	 * create item process.
	 * 
	 * @return true if this item is an orphan.
	 */
	public boolean isOrphan(INamedUUID object) throws CadseException;

	/**
	 * Returns true if this item is considered by CADSE as valid.
	 * 
	 * @return true if this item is considered by CADSE as valid.
	 */
	public boolean isValid(INamedUUID object) throws CadseException;

	/**
	 * Returns true if this item can be a parent item. In other words, tests if
	 * its type has outgoing part link types.
	 * 
	 * @return true if this item can be a parent item.
	 */
	public boolean isPartItem(INamedUUID object) throws CadseException;

	/**
	 * Returns true if this item can not be modified anymore. Static items are
	 * items (mostly ItemTypes) which are defined in a CADSE definition model.
	 * 
	 * @return true if this item can not be modified anymore.
	 */
	public boolean isStatic(INamedUUID object) throws CadseException;

	/**
	 * Returns parent of this item. An item has at most one parent. The parent
	 * item is the only item which has an outgoing part link pointing to this
	 * item. If it has no parent, returns null.
	 * 
	 * @return parent of this item.
	 */
	public Item getPartParent(INamedUUID object) throws CadseException;

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
	 * @return parent of this item if used part link type is specified one.
	 */
	public Item getPartParent(INamedUUID object, LinkType linkType) throws CadseException;

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
	public Item getPartParent(INamedUUID object, TypeDefinition itemType) throws CadseException;

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
	public Item getPartParentByName(INamedUUID object, String typeName) throws CadseException;

	/**
	 * Returns an unmodifiable list of all destination items of part links
	 * coming from this item.
	 * 
	 * @return an unmodifiable list of all destination items of part links
	 *         coming from this item.
	 */
	public Collection<Item> getPartChildren(INamedUUID object) throws CadseException;

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
	public Collection<Item> getPartChildren(INamedUUID object, LinkType linkType) throws CadseException;

	/**
	 * Returns true if link <tt>l</tt> is an incoming link of this item.
	 * 
	 * @param l
	 *            a link
	 * 
	 * @return true if link <tt>l</tt> is an incoming link of this item.
	 */
	public boolean isInIncomingLinks(INamedUUID object, Link l) throws CadseException;

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
	public void setReadOnly(INamedUUID object, boolean readOnly) throws CadseException;

	/**
	 * Returns true if this item is hidden. An hidden item is not visible in
	 * CADSE views if hidden filter is enable.
	 * 
	 * @return true if this item is hidden.
	 */
	public boolean isHidden(INamedUUID object) throws CadseException;

	/**
	 * Returns true if it is read only. Add outgoing links or modify attribute
	 * values of read only is disallowed.
	 * 
	 * @return true if it is read only.
	 */
	public boolean isReadOnly(INamedUUID object) throws CadseException;

	/**
	 * Sets the composants.
	 * 
	 * @param comp
	 *            the new composants
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 * @Deprecated User workspace logique copy and ItemOperation
	 */
	public void setComponents(Set<ItemDescriptionRef> comp) throws CadseException;

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
	public boolean isAncestorOf(INamedUUID object, INamedUUID item) throws CadseException;

	public boolean isMemberOf(INamedUUID object, INamedUUID item) throws CadseException;

	public GroupType getGroup(INamedUUID object) throws CadseException;

	public boolean isMember(INamedUUID object) throws CadseException;

	/**
	 * Returns all destination items of outgoing composition links from this
	 * item.
	 * 
	 * @return all destination items of outgoing composition links from this
	 *         item.
	 */
	public Set<Item> getComponents(INamedUUID object) throws CadseException;

	/**
	 * Returns true if there is one destination item with same id of an outgoing
	 * composition link from this item.
	 * 
	 * @param itemId
	 *            a component item id
	 * 
	 * @return true if there is one destination item with same id of an outgoing
	 *         composition link from this item.
	 */
	public boolean containsComponent(INamedUUID object, INamedUUID itemId) throws CadseException;

	/**
	 * Returns destination item with same id of an outgoing composition link
	 * from this item if it exists else returns null.
	 * 
	 * @param itemId
	 *            a component item id
	 * 
	 * @return destination item with same id of an outgoing composition link
	 *         from this item if it exists else returns null.
	 */
	public Item getComponentInfo(INamedUUID object, INamedUUID itemId) throws CadseException;

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
	public boolean containsPartChild(INamedUUID object, INamedUUID item) throws CadseException;

	/**
	 * Returns true if it is resolved. A resolved item is an item which is
	 * contained in the logical workspace. An unresolved one is a virtual item
	 * which represents a reference to the actual one (In fact, contains the
	 * item id).
	 * 
	 * @return true, if is resolved.
	 */
	public boolean isResolved(INamedUUID object) throws CadseException;

	/**
	 * Returns type of the incoming part link coming from its parent. If it has
	 * no parent, returns null.
	 * 
	 * @return type of the incoming part link coming from its parent.
	 */
	public LinkType getPartParentLinkType(INamedUUID object) throws CadseException;

	/**
	 * Returns the content item representing the associated content. If it has a
	 * content and content item does not exist, creates and returns it. If it
	 * has no content, returns null.
	 * 
	 * @return the content item representing the associated content.
	 */
	public ContentItem getContentItem(INamedUUID object) throws CadseException;

	/**
	 * INTERNAL method.
	 * 
	 * Deletes content item which represents associated content.
	 */
	public void removeContentItem(INamedUUID object) throws CadseException;

	/**
	 * TODO
	 * 
	 * @return the key
	 */
	public Key getKey(INamedUUID object, DefaultKeyDefinitionImpl keyDefinition) throws CadseException;

	/**
	 * INTERNAL method.
	 * 
	 * Sets state of this item.
	 * 
	 * @param newState
	 *            new item state
	 */
	public void setState(INamedUUID object, ItemState newState) throws CadseException;

	/**
	 * Returns order number of specified link. Outgoing links of a same type are
	 * ordered.
	 * 
	 * @param link
	 *            an outgoing link
	 * @return order number of specified link.
	 */
	public int indexOf(INamedUUID object, Link link) throws CadseException;

	/**
	 * Returns version of this item.
	 * 
	 * @return version of this item.
	 */
	public int getVersion(INamedUUID object) throws CadseException;

	/**
	 * Returns revision number of last version available in the repository.
	 * Returns 0 if this item does not exist in the repository. Returns -1 if
	 * the repository is not available and accessible.
	 * 
	 * @return revision number of last version available in the repository.
	 */
	public int getLastVersion() throws CadseException;

	/**
	 * Returns true if it is considered as modified by versionning system and
	 * that commit this item will create a new revision of it in the repository.
	 * 
	 * @return true if it is considered as modified by versionning system and
	 *         that commit this item will create a new revision of it in the
	 *         repository.
	 */
	public boolean isRequierNewRev(INamedUUID object) throws CadseException;

	/**
	 * Returns true if it is considered as modified by versionning system.
	 * 
	 * @return true if it is considered as modified by versionning system.
	 */
	public boolean isRevModified(INamedUUID object) throws CadseException;

	public boolean exists(INamedUUID object) throws CadseException;

	// type
	/**
	 * It's an ItemType ?
	 * 
	 * @return
	 */
	boolean isObject(INamedUUID object) throws CadseException;

	/**
	 * It's an ItemType ?
	 * 
	 * @return
	 */
	boolean isLink(INamedUUID object) throws CadseException;

	/**
	 * It's an ItemType ?
	 * 
	 * @return
	 */
	boolean isLinkType(INamedUUID object) throws CadseException;

	/**
	 * It's an ItemType ?
	 * 
	 * @return
	 */
	boolean isMainType(INamedUUID object) throws CadseException;

	/**
	 * It's an Extended Type ?
	 * 
	 * @return
	 */
	boolean isExtendedType(INamedUUID object) throws CadseException;

	// Link type

	/**
	 * Create a link type. <br/>
	 * <br/>
	 * 
	 * Pr�conditions: <br/>
	 * - 1. <tt>name</tt> cannot be null.<br/>
	 * - 2. <tt>name</tt> cannot be empty. - 3. <tt>destination</tt> cannot be
	 * null.<br/>
	 * - 4. <tt>name</tt> muqt be unique.<br/>
	 * - 5. <tt>destination</tt> cannot be type workspace.<br/>
	 * - 6. <tt>min</tt> must greater or equal 0; <tt>max</tt> either equal -1
	 * (means the instance's number of this link type is undefined), or either
	 * greater than <tt>min</tt>.
	 * 
	 * @param id
	 *            runtime id define in cadseg
	 * @param intID
	 *            the int id
	 * @param name
	 *            the name
	 * @param kind
	 *            : kind of link type, can be a Aggregation, or a Contaiment, or
	 *            Other.
	 * @param min
	 *            : the minimum instances of this link type that we want create.
	 * @param max
	 *            : the maximum instances of this link type that we want create.
	 * @param selection
	 *            the selection
	 * @param inverse
	 *            the inverse
	 * 
	 * @return the link type
	 * @throws CadseException
	 * 
	 * @OCL: pre: name <> null pre: id <> '' pre: destination <> null pre:
	 *       self.to->forAll(rt | rt.name <> id) -- id must be unique. pre: not
	 *       destination.oclIsTypeOf(WorkspaceType) -- destination cannot be a
	 *       Workspace Type. pre: ((max>=min)||(max==-1))&&(min>=0)) <br/>
	 * @exception IllegalArgumentException
	 *                : Invalid assignment, <tt>name</tt> can not be null.<br/>
	 *                IllegalArgumentException: Invalid assignment,
	 *                <tt>name</tt> can not be empty.<br/>
	 *                IllegalArgumentException: Invalid assignment, item type
	 *                <tt>$name</tt> can not be null.<br/>
	 *                IllegalArgumentException: Invalid assignment, this link
	 *                type <tt>destination</tt> already exist.<br/>
	 *                IllegalArgumentException: Invalid assignment, you can not
	 *                create a link type whose destination is an object of
	 *                WorkspaceType.<br/>
	 *                IllegalArgumentException: Invalid assignment, verify the
	 *                values min and max.<br/>
	 * <br/>
	 */
	public abstract LinkType createLinkType(INamedUUID object, UUID id, int intID, String name, int min,
			int max, String selection, LinkType inverse) throws CadseException;

	/**
	 * Creates the link type.
	 * 
	 * @param id
	 *            runtime id define in cadseg
	 * @param intID
	 *            the int id (not used) gave 0
	 * @param name
	 *            the name
	 * @param kind
	 *            the kind
	 * @param min
	 *            the min
	 * @param max
	 *            the max
	 * @param selection
	 *            the selection
	 * @param destination
	 *            the destination
	 * 
	 * @return the link type
	 * @throws CadseException
	 */
	public abstract LinkType createLinkType(INamedUUID object, UUID id, String name, int kind, int min, int max,
			String selection, TypeDefinition destination) throws CadseException;

	/**
	 * Get an outgoing link type by id.
	 * 
	 * @param name
	 *            the name
	 * 
	 * @return a link type if found; null if not found.
	 */
	public abstract LinkType getOutgoingLinkType(INamedUUID object, LinkType lt) throws CadseException;

	/**
	 * Gets the outgoing link type.
	 * 
	 * @param destination
	 *            the destination
	 * @param name
	 *            the name
	 * 
	 * @return the outgoing link type
	 */
	public abstract LinkType getOutgoingLinkType(INamedUUID object, TypeDefinition destination, LinkType lt)
			throws CadseException;

	/**
	 * Gets the outgoing link type.
	 * 
	 * @param destination
	 *            the destination
	 * @param kind
	 *            the kind
	 * 
	 * @return the outgoing link type
	 */
	public abstract LinkType getOutgoingLinkType(INamedUUID object, TypeDefinition destination, int kind)
			throws CadseException;

	/**
	 * Get an incoming link type by id.
	 * 
	 * @param name
	 *            the name
	 * 
	 * @return a link type if found; null if not found.
	 */
	public abstract LinkType getIncomingLinkType(INamedUUID object, LinkType lt) throws CadseException;

	/**
	 * Get all hierarchical outgoing link types.
	 * 
	 * @return an unmodifiable list all hierarchical outgoing link types.
	 */
	public abstract List<LinkType> getOutgoingLinkTypes(INamedUUID object) throws CadseException;

	/**
	 * Get all owned outgoing link types, not hierarchical.
	 * 
	 * @return an unmodifiable list all owned outgoing link types.
	 */
	public List<LinkType> getOwnerOutgoingLinkTypes(INamedUUID object) throws CadseException;

	/**
	 * Get all incoming link types.
	 * 
	 * @return an unmodifiable list all incoming link types.
	 */
	public abstract List<LinkType> getIncomingLinkTypes(INamedUUID object) throws CadseException;

	// * INSTANCE

	/**
	 * Gets the items.
	 * 
	 * @return the items
	 */
	public abstract List<Item> getItems(INamedUUID object) throws CadseException;

	// MENU ACTION

	/**
	 * Gets the action contribution.
	 * 
	 * @return the action contribution
	 */
	public IActionContributor[] getActionContribution(INamedUUID object) throws CadseException;

	/**
	 * Adds the action contributeur.
	 * 
	 * @param contributor
	 *            the contributor
	 */
	public void addActionContributeur(INamedUUID object, IActionContributor contributor) throws CadseException;

	// *PAGE*/

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.imag.adele.cadse.core.ItemType#getCreationPage()
	 */
	public abstract IPage[] getCreationPage(INamedUUID object) throws CadseException;

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.imag.adele.cadse.core.ItemType#getModificationPage()
	 */
	public abstract IPage[] getModificationPage(INamedUUID object) throws CadseException;

	public abstract void getAllAttributeTypes(INamedUUID object, List<IAttributeType<?>> all, ItemFilter filter)
			throws CadseException;

	public abstract UIField findField(INamedUUID object, IAttributeType<?> att) throws CadseException;

	/**
	 * Adds the creation pages.
	 * 
	 * @param creationPages
	 *            the creation pages
	 */
	public void addCreationPages(INamedUUID object, List<IPage> creationPages) throws CadseException;

	/**
	 * Adds the modification pages.
	 * 
	 * @param modificationPages
	 *            the modification pages
	 */
	public void addModificationPages(INamedUUID object, List<IPage> modificationPages) throws CadseException;

	/**
	 * Creates the default modification action.
	 * 
	 * @param node
	 *            the node
	 * 
	 * @return the i action page
	 */

	public void addValidators(INamedUUID object, UIValidator v) throws CadseException;

	public void addField(INamedUUID object, UIField v) throws CadseException;

	public void addGroupOfAttributes(INamedUUID object, GroupOfAttributes g) throws CadseException;

	public GroupOfAttributes[] getGroupOfAttributes(INamedUUID object) throws CadseException;

	// type type

	/**
	 * Gets the sub types.
	 * 
	 * @return the sub types (non null array, if no sub type, return an empty
	 *         array)
	 */
	public ItemType[] getSubTypes(INamedUUID object) throws CadseException;

	/**
	 * Gets the super type.
	 * 
	 * @return the super type
	 */
	public ItemType getSuperType(INamedUUID object) throws CadseException;

	/**
	 * Gets the super type.
	 * 
	 * @return the super type
	 */
	public ItemType[] getSuperTypes(INamedUUID object) throws CadseException;

	/**
	 * Returns true if this item type is super type (an ancestor) of
	 * <code>it</code>.
	 * 
	 * @param it
	 *            an item type
	 * 
	 * @return true if this item type is super type of <code>it</code>.
	 */
	public boolean isSuperTypeOf(INamedUUID object, INamedUUID it) throws CadseException;

	public ExtendedType[] getExtendedType(INamedUUID object) throws CadseException;

	/**
	 * Return true si ce type a un contenu (file, folder, project, ...).
	 * 
	 * @return true, if checks for content
	 */

	public abstract boolean hasContent(INamedUUID object) throws CadseException;

	/**
	 * Change the default value.
	 * 
	 * @param val
	 *            the val
	 */
	public void setRootElement(INamedUUID object, boolean val) throws CadseException;

	/**
	 * Checks if is root element.
	 * 
	 * @return true if is a root item type : les item de ce type sont montr�e au
	 *         premier niveau.
	 */
	public boolean isRootElement(INamedUUID object) throws CadseException;

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.Item#isComposite()
	 */
	public boolean isCompositeType(INamedUUID object) throws CadseException;

	/**
	 * Sets the checks for unique name attribute.
	 * 
	 * @param val
	 *            the new checks for unique name attribute
	 */
	public void setHasQualifiedNameAttribute(INamedUUID object, boolean val) throws CadseException;

	/**
	 * Checks for unique name attribute.
	 * 
	 * @return true, if successful
	 */
	public boolean hasQualifiedNameAttribute(INamedUUID object) throws CadseException;

	/**
	 * Sets the checks for short name attribute.
	 * 
	 * @param val
	 *            the new checks for short name attribute
	 */
	public void setHasNameAttribute(INamedUUID object, boolean val) throws CadseException;

	/**
	 * Checks for short name attribute.
	 * 
	 * @return true, if successful
	 */
	public boolean hasShortNameAttribute(INamedUUID object) throws CadseException;

	/**
	 * Checks if is abstract.
	 * 
	 * @return true, if is abstract
	 */
	public boolean isAbstract(INamedUUID object) throws CadseException;

	/**
	 * Checks if is part type.
	 * 
	 * @return true if this itemtype has an incoming linktype of type PART.
	 */
	public abstract boolean isPartType(INamedUUID object) throws CadseException;

	/**
	 * if this item type is a partType, return the incoming linktype.
	 * 
	 * @param typeParent
	 *            the type parent
	 * 
	 * @return the linktype of type PART
	 */
	public LinkType getIncomingPart(INamedUUID object, ItemType typeParent) throws CadseException;

	/**
	 * Checks for incoming parts.
	 * 
	 * @return true, if successful
	 */
	public boolean hasIncomingParts(INamedUUID object) throws CadseException;

	/**
	 * Gets the incoming one.
	 * 
	 * @param type
	 *            the type
	 * 
	 * @return the incoming one if found or null if none or more one.
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	public LinkType getIncomingOne(INamedUUID object, ItemType type) throws CadseException;

	/**
	 * Sets the creation action.
	 * 
	 * @param clazz
	 *            the clazz
	 * @param defaultShortName
	 *            the default short name
	 */
	public void setCreationAction(INamedUUID object, Class<? extends IActionPage> clazz, String defaultShortName)
			throws CadseException;

	public String getDefaultInstanceName(INamedUUID object);

	/**
	 * Gets the all action contribution.
	 * 
	 * @return the all action contribution
	 */
	public IActionContributor[] getAllActionContribution(INamedUUID object) throws CadseException;

	/**
	 * Sets the icon.
	 * 
	 * @param url
	 *            the new icon
	 */
	public void setIcon(INamedUUID object, String url) throws CadseException;

	/**
	 * Gets the icon.
	 * 
	 * @return the icon
	 */
	public String getIcon(INamedUUID object) throws CadseException;

	/**
	 * set the package attribute
	 * 
	 * @param packageName
	 *            the java qualified string or empty string for no package
	 */
	public void setPackageName(INamedUUID object, String packageName) throws CadseException;

	/**
	 * get the package attribute
	 * 
	 * @return the package name attribute
	 */
	public String getPackageName(INamedUUID object) throws CadseException;

	/**
	 * Sets the space key type.
	 * 
	 * @param spaceKeytype
	 *            the new space key type
	 */
	public void setSpaceKeyType(INamedUUID object, DefaultKeyDefinitionImpl spaceKeytype) throws CadseException;

	/**
	 * Gets the space key type.
	 * 
	 * @return the space key type
	 */
	public DefaultKeyDefinitionImpl getSpaceKeyType(INamedUUID object) throws CadseException;

	public <T> T getApdapter(INamedUUID object, Class<T> clazz) throws CadseException;

	/**
	 * Returns factory used to create item of this type.
	 * 
	 * @return factory used to create item of this type.
	 */
	public String getItemFactory(INamedUUID object) throws CadseException;

	/**
	 * Sets factory used to create item of this type.
	 * 
	 * @param factory
	 *            an item factory
	 */
	public void setItemFactory(INamedUUID object, String factory) throws CadseException;

	/*
	 * return the implemented class of the manager
	 */
	public String getItemManagerClass(INamedUUID object) throws CadseException;

	public String getCSTName(INamedUUID object) throws CadseException;

	public boolean isMemberType(INamedUUID object) throws CadseException;

	public boolean isGroupHead(INamedUUID object) throws CadseException;

	// linktype
	/**
	 * Returns maximum number of links of this type from a same item.
	 * 
	 * @return maximum number of links of this type from a same item.
	 */
	public int getMax(INamedUUID object) throws CadseException;

	/**
	 * Returns minimum number of links of this type from a same item.
	 * 
	 * @return minimum number of links of this type from a same item.
	 */
	public int getMin(INamedUUID object) throws CadseException;

	/**
	 * Returns the destination type (an Item type). It is never null.
	 * 
	 * @return the destination type.
	 */
	public TypeDefinition getDestinationType(INamedUUID object) throws CadseException;

	/**
	 * Returns the source type (an Item type). It is never null.
	 * 
	 * @return the source type.
	 */
	public TypeDefinition getSourceType(INamedUUID object) throws CadseException;

	/**
	 * Returns bit set representing flags of this link type (including all
	 * annotations, for example, aggregation one and so on).
	 * 
	 * @return bit set representing flags of this link type.
	 */
	public int getLinkTypeKind(INamedUUID object) throws CadseException;

	/**
	 * Returns true if it is the reverse link type from Destination type to
	 * source type of a part link type.
	 * 
	 * @return true if it is the reverse link type from Destination type to
	 *         source type of a part link type.
	 */
	public boolean isInversePart(INamedUUID object) throws CadseException;

	/**
	 * Returns true if links of this type are ordered. Reorder not ordered links
	 * of this type is not considered as a modification operation.
	 * 
	 * @return true if links of this type are ordered.
	 */
	public boolean isOrdered(INamedUUID object) throws CadseException;

	/**
	 * Returns true if link creation operation forbids create a cycle by
	 * following links of this type. For example, composition links are not
	 * circular.
	 * 
	 * @return true if link creation operation forbids create a cycle by
	 *         following links of this type.
	 */
	public boolean isNonCircular(INamedUUID object) throws CadseException;

	/**
	 * Returns link type representing the reverse link type from Destination
	 * type to source type. Deleting a link also delete inverse link if it
	 * exists.
	 * 
	 * @return link type representing the reverse link type from Destination
	 *         type to source type.
	 */
	public LinkType getInverse(INamedUUID object) throws CadseException;

	/**
	 * Returns all destination items of links from specified source item. This
	 * method is equivalent to source.getOutgoingItem(this, true).
	 * 
	 * TODO not sure returns only resolved destinations
	 * 
	 * @param source
	 *            source item
	 * 
	 * @return all destination items of links from specified source item.
	 */
	public Collection<Item> getSelectingDestination(INamedUUID object, Item source) throws CadseException;

	/**
	 * Returns the link type manager. It is never null.
	 * 
	 * @return the link type manager.
	 */
	public String getManager(INamedUUID object) throws CadseException;

	/**
	 * Sets the link type manager.
	 * 
	 * @param manager
	 *            the link type manager
	 */
	public void setManager(INamedUUID object, String manager) throws CadseException;

	/**
	 * Returns definition of this link type attribute named
	 * <code>attrName</code>.
	 * 
	 * @param attrName
	 *            attribute name
	 * @return definition of this link type attribute named
	 *         <code>attrName</code>.
	 */
	public IAttributeType<?> getLinkTypeAttributeType(INamedUUID object, String attrName) throws CadseException;

	/**
	 * Defines specified link type as reverse link type of it.
	 * 
	 * @param lt
	 *            a link type
	 */
	public void setInverseLinkType(INamedUUID object, LinkType lt) throws CadseException;

	/**
	 * Returns true if it is used for annotations. This flag is inherited from
	 * its link type. If a destination of an annotation link is deleted, then
	 * link source is also deleted.
	 * 
	 * @return true if it is used for annotations.
	 */
	public boolean isAnnotation(INamedUUID object) throws CadseException;

	/**
	 * Returns true if it is an aggregation link. This flag is inherited from
	 * its link type. Aggregation annotations are used to structure CADSE views.
	 * 
	 * @return true if it is an aggregation link.
	 */
	public boolean isAggregation(INamedUUID object) throws CadseException;

	/**
	 * Returns true if it is a part link. This flag is inherited from its link
	 * type. If a source of a part link is deleted, then link destination is
	 * also deleted.
	 * 
	 * @return true if it is a part link.
	 */
	public boolean isPart(INamedUUID object) throws CadseException;

	/**
	 * Returns true if it is a composition link. This flag is inherited from its
	 * link type. Composition annotations are used to transfer data from
	 * destination to source for builders.
	 * 
	 * @return true if it is a composition link.
	 */
	public boolean isComposition(INamedUUID object) throws CadseException;

	/**
	 * Returns true if it is a require link. This flag is inherited from its
	 * link type. If a source of a require link is imported, then link
	 * destination is also imported.
	 * 
	 * @return true if it is a require link.
	 */
	public boolean isRequire(INamedUUID object) throws CadseException;

	public void setIsGroup(INamedUUID object, boolean b) throws CadseException;

	public boolean isGroup(INamedUUID object) throws CadseException;

	public IAttributeType<?>[] getLinkTypeAttributeTypes(INamedUUID object) throws CadseException;

	// link

	/**
	 * Returns the link type. Link Type is never null.
	 * 
	 * @return link type.
	 */
	public LinkType getLinkType(INamedUUID object) throws CadseException;

	/**
	 * Returns source element of this link (an Item). Source is never null.
	 * 
	 * @return source of this link.
	 */
	public Item getSource(INamedUUID object) throws CadseException;

	/**
	 * 
	 * @return true if getSourceCadseId() not equal to getDestinationCadseId()
	 */
	public boolean isInterCadseLink(INamedUUID object) throws CadseException;

	/**
	 * Returns source item id. It is never null.
	 * 
	 * @return source item id.
	 */
	public UUID getSourceID(INamedUUID object) throws CadseException;

	/**
	 * Returns source cadse id. It can be null.
	 * 
	 * @return source cadse id.
	 */
	public UUID getSourceCadseID(INamedUUID object) throws CadseException;

	/**
	 * Returns the resolved destination (an Item). Destination may not exist in
	 * the logical workspace. In this case, link is not resolved and returns a
	 * virtual item which represents the unresolved destination. To distinguish
	 * virtual items, use isResolved() method.
	 * 
	 * @return destination of this link.
	 */
	public Item getDestination(INamedUUID object) throws CadseException;

	/**
	 * Set this link as hidden. A hidden link is not shown in CADSE views if
	 * related view filter (Hidden item) is active.
	 * 
	 * @param hidden
	 *            hidden flag
	 */
	public void setHidden(INamedUUID object, boolean hidden) throws CadseException;

	/**
	 * Returns true if this link is derived. A derived link is created by CADSE
	 * runtime. They cannot be created and modified by users.
	 * 
	 * @return true if this link is derived.
	 */
	public boolean isDerived(INamedUUID object) throws CadseException;

	/**
	 * Returns true if destination is resolved (destination exists in the
	 * logical wrokspace).
	 * 
	 * @return true if destination is resolved.
	 */
	public boolean isLinkResolved(INamedUUID object) throws CadseException;

	/**
	 * Returns order index of this link from its source. Considered links are
	 * only ones with same link type.
	 * 
	 * @return order index of this link from its source.
	 */
	public int getIndex(INamedUUID object) throws CadseException;

	/**
	 * Sets destination version. Note that destination item version is not
	 * modified but only the reference owns by the link.
	 * 
	 * @param version
	 *            destination version.
	 */
	public void setVersion(INamedUUID object, int version) throws CadseException;

	/**
	 * Return all destination versions compatible with the source item.
	 * 
	 * @return all destination versions compatible with the source item.
	 */
	public int[] getCompatibleVersions(INamedUUID object) throws CadseException;

	/**
	 * After call, any destination version is considered as not compatible with
	 * source item.
	 */
	public void clearCompatibleVersions(INamedUUID object) throws CadseException;

	/**
	 * Add many destination versions as compatible with source item.
	 * 
	 * @param versions
	 *            destination versions considered compatible with source item
	 */
	public void addCompatibleVersions(INamedUUID object, int... versions) throws CadseException;

	public <T> T getLinkAttributeOwner(INamedUUID object, IAttributeType<T> attDef) throws CadseException;

	// extension
	public abstract ItemType[] getExendsItemType(INamedUUID object) throws CadseException;

	public abstract void addBindExendsItemType(INamedUUID typeId, ItemType extType) throws CadseException;

	public abstract void removeBindExendsItemType(INamedUUID object, ItemType exendsItemType) throws CadseException;

}
