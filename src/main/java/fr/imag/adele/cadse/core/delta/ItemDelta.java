package fr.imag.adele.cadse.core.delta;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import fr.imag.adele.cadse.core.CadseException;
import java.util.UUID;
import fr.imag.adele.cadse.core.ContentChangeInfo;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemDescriptionRef;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.LogicalWorkspace;
import fr.imag.adele.cadse.core.attribute.BooleanAttributeType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.attribute.IntegerAttributeType;
import fr.imag.adele.cadse.core.attribute.StringAttributeType;
import fr.imag.adele.cadse.core.attribute.URLAttributeType;
import fr.imag.adele.cadse.core.internal.delta.InternalItemDelta;
import fr.imag.adele.cadse.core.key.ISpaceKey;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;

/**
 * It is a virtual item (not in logical workspace) representing all operations
 * performed on an item (eventually created in this transaciton) by a
 * transaction.
 */
public interface ItemDelta extends Item, ItemOrLinkDelta, InternalItemDelta {

	public void addMappingOperaion(MappingOperation mappingOperation) throws CadseException;

	public LinkDelta addOutgoingItem(LinkType lt, Item destination) throws CadseException;

	/**
	 * si added -> nothing si deleted -> remove deleted operation sinon add
	 * creation operation
	 */
	public LinkDelta createLink(LinkType lt, Item destination) throws CadseException;

	/**
	 * Migrate part link.
	 * 
	 * @param newPartParent
	 *            the new part parent
	 * @param lt
	 *            the lt
	 * @throws CadseException
	 */
	public void migratePartLink(Item newPartParent, LinkType lt) throws CadseException;

	public void delete(DeleteOperation operation, int flag) throws CadseException;

	public void doubleClick();

	public Collection<LinkDelta> getAddedLinks();

	public <T> T getAttribute(IAttributeType<T> att, boolean returnDefault);

	/**
	 * 
	 * @return return the base item in the workspace logique or null if not
	 *         exist
	 */
	public Item getBaseItem();

	public boolean getBooleanAttribut(BooleanAttributeType key, boolean defaultValue);

	public Collection<LinkDelta> getDeletedLinks();

	public Collection<ItemDelta> getIncomingItems(boolean acceptDelete, boolean acceptAdd);

	public Collection<ItemDelta> getIncomingItems(LinkType lt, boolean acceptDelete, boolean acceptAdd);

	public List<LinkDelta> getIncomingLinkOperations();

	public List<LinkDelta> getIncomingLinks(boolean acceptDelete, boolean acceptAdd);

	public int getIntAttribut(IntegerAttributeType key, int defaultValue);

	public UUID getItemTypeId();

	public <T extends MappingOperation> T getMappingOperation(Class<T> clazz);

	public MappingOperation[] getMappings();

	public LogicalWorkspace getModel();

	public List<Item> getOpenCompositeParent();

	public <T extends MappingOperation> T getorCreateMappingOperation(Class<T> clazz);

	public List<OrderOperation> getOrdersOperation();

	public List<OrderOperation> getOrdersOperation(LinkType lt);

	public Collection<ItemDelta> getOutgoingItems(boolean acceptDeletedLink, boolean resovledOnly);

	public Collection<ItemDelta> getOutgoingItems(boolean acceptDeletedLink, LinkType lt, boolean resovledOnly);

	public Collection<ItemDelta> getOutgoingItems(boolean acceptDeletedLink, String linkType, boolean resovledOnly);

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.Item#getOutgoingItemOne(fede.workspace.domain.LinkType,
	 *      boolean)
	 */
	public ItemDelta getOutgoingItem(LinkType lt, boolean resovledOnly);

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.Item#getOutgoingItemOne(java.lang.String,
	 *      boolean)
	 */
	public ItemDelta getOutgoingItem(String linkNameID, boolean resovledOnly);

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.Item#getOutgoingLink(fede.workspace.domain.Item)
	 */
	public LinkDelta getOutgoingLink(Item item);

	/**
	 * Returns the link of <code>linkType</code> type coming from this item.
	 * Link type maximum cardinality must be equal to one. Returns null if link
	 * does not exist.
	 * 
	 * @param linkType
	 *            a link type
	 * 
	 * @return the link delta of <code>linkType</code> type coming from this item.
	 * 
	 * @throws CadseException
	 *             if the max cardinality of <code>linkType</code> link type
	 *             is not equal to one.
	 */
	public LinkDelta getOutgoingLink(LinkType linkType);

	public LinkDelta getOutgoingLink(LinkType lt, UUID destId);

	public LinkDelta getOutgoingLink(String lt, UUID destId);

	public LinkDelta getOutgoingLinkOperation(Link l) throws CadseException;

	/**
	 * Cherche un link operation.
	 * 
	 * @param type
	 *            le nom du type de lien
	 * @param destination
	 *            la description (id, nom) de la destination
	 * @return un link sur le quel on peut appliquer des operations futur. Null
	 *         si le lien n'estiste pas.
	 */
	public LinkDelta getOutgoingLinkOperation(String type, ItemDescriptionRef destination);

	/**
	 * Return all outgoing links ( modified, added, deleted, or present in wl)
	 * 
	 * @return
	 */
	public Collection<LinkDelta> getOutgoingLinkOperations();

	public List<LinkDelta> getOutgoingLinkOperations(UUID destId);

	public List<LinkDelta> getOutgoingLinkOperations(LinkType linkType);

	public List<LinkDelta> getOutgoingLinks(boolean acceptDeleted);

	public List<LinkDelta> getOutgoingLinks(UUID destId);

	/**
	 * Gets the parent in storage.
	 * 
	 * @return the parent in storage
	 * @throws CadseException
	 */
	public ItemDelta getParentInStorage() throws CadseException;

	/**
	 * Gets the parent in storage.
	 * 
	 * @return the parent in storage
	 * @throws CadseException
	 */
	public ItemDelta getParentInStorage(LinkType lt);

	/**
	 * Gets the parent link type in storage.
	 * 
	 * @param parent
	 *            the parent
	 * 
	 * @return the parent link type in storage
	 */
	public LinkType getParentLinkTypeInStorage(Item parent);

	/**
	 * Gets the part link parent.
	 * 
	 * @return the part link parent
	 */
	public Link getPartLinkParent(boolean acceptDelete, boolean acceptAdd);

	public ItemDelta getPartParent();

	public ItemDelta getPartParent(boolean attemptToRecreate);

	public ItemDelta getPartParent(boolean attemptToRecreate, boolean acceptDeleted);

	public ItemDelta getPartParent(LinkType lt);

	public ItemDelta getPartParent(LinkType lt, boolean attemptToRecreate);

	public SetAttributeOperation getSetAttributeOperation(String key, boolean create);

	public String getStringAttribut(StringAttributeType key, String defaultValue);

	public ItemType getType(boolean createUnresolvedType);

	public URL getURLAttribut(URLAttributeType key) throws MalformedURLException;

	public List<Item> getWhyReadOnly();

	public boolean isDoubleClick();

	public boolean isFinishLoad();

	public boolean isUpdate();

	public void loadAttribute(IAttributeType<?> key, Object value) throws CadseException;

	public void loadAttribute(String key, Object value) throws CadseException;

	public void loadContent();

	public void loadDerivedLink(String linkType, ItemDelta dest, boolean isAggregation, boolean isRequire,
			String link_info, String originLinkTypeID, UUID uuidOriginLinkSourceTypeID,
			UUID uuidOriginLinkDestinationTypeID, int version);

	public LinkDelta loadLink(String linkType, ItemDelta destItem) throws CadseException;

	public boolean moveAfter(LinkDelta linkOne, Link linkTwo_) throws CadseException;

	public boolean moveBefore(LinkDelta linkOne, Link linkTwo_) throws CadseException;

	/**
	 * This method is called when the content is changed. Do not call this
	 * method.
	 * 
	 * @param change
	 *            the change info.
	 */
	public void notifieChangedContent(ContentChangeInfo[] change);

	public Iterator<Item> propagateValue(IAttributeType<?> type);

	public Iterator<Item> propagateValue(String key);

	public void setKey(ISpaceKey newkey) throws CadseException;

	public void refresh();


	public void resetContentIsChanged();

	public void setAttribute(IAttributeType<?> key, String attributeName, Object newCurrentValue, boolean loaded)
			throws CadseException;

	public void setModified(boolean value) throws CadseException;

	public void setModified(boolean value, boolean loaded) throws CadseException;

	/**
	 */

	
	public void setReadOnly(boolean readOnly, boolean loaded) throws CadseException;

	@Deprecated
	public void setShortName(String shortname, boolean loaded) throws CadseException;

	@Deprecated
	public void setUniqueName(String uniqueName, boolean loaded) throws CadseException;

	public void setName(String shortname, boolean loaded) throws CadseException;

	public void setQualifiedName(String uniqueName, boolean loaded) throws CadseException;

	public void setUpdate(boolean update);

	public void setValid(boolean valid, boolean loaded);

	public void syncOutgoingLinks();

	public String toString();

	public void toString(StringBuilder sb, String tab);

	public void toStringShort(StringBuilder sb);
	
	public <T> T getAdapter(Class<T> clazz);

	public void setParent(ItemDelta parent, LinkType lt, boolean createLinkIfNeed,
			boolean notify) throws CadseException;

	
	public LogicalWorkspaceTransaction getCopy();

}