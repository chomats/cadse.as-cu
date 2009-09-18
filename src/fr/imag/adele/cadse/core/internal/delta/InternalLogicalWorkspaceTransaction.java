package fr.imag.adele.cadse.core.internal.delta;

import java.util.Collection;
import java.util.List;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.CompactUUID;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemDescriptionRef;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkDescription;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.ProjectAssociation;
import fr.imag.adele.cadse.core.delta.ItemDelta;
import fr.imag.adele.cadse.core.delta.LinkDelta;
import fr.imag.adele.cadse.core.delta.MappingOperation;
import fr.imag.adele.cadse.core.delta.OrderOperation;
import fr.imag.adele.cadse.core.delta.SetAttributeOperation;
import fr.imag.adele.cadse.core.delta.WLWCOperationImpl;
import fr.imag.adele.cadse.core.internal.ILoggableAction;
import fr.imag.adele.cadse.core.internal.IWorkspaceNotifier;
import fr.imag.adele.cadse.core.key.ISpaceKey;
import fr.imag.adele.cadse.core.util.ElementsOrder;

public interface InternalLogicalWorkspaceTransaction {
	void actionAdd(ItemDelta item) throws CadseException;

	public abstract void actionAddAttribute(CompactUUID itemId, String key, Object value) throws CadseException,
			CadseException;

	public abstract void actionAddAttribute(LinkDescription linkDescription, String key, Object value)
			throws CadseException;

	ItemDelta actionAddItem(ItemDescriptionRef itemDescriptionRef, CompactUUID parent, LinkType lt)
			throws CadseException;

	public abstract void actionAddLink(LinkDescription linkDescription) throws CadseException;

	public abstract void actionAddOperation(WLWCOperationImpl operation) throws CadseException;

	// <T> void actionAddAttribute(CompactUUID itemId, IAttributeType<T> key, T
	// value) throws CadseException;
	public abstract void actionChangeAttribute(CompactUUID itemId, String key, Object value) throws CadseException,
			CadseException;

	// <T> void actionAddAttribute(LinkDescription linkDescription,
	// IAttributeType<T> key, T value) throws CadseException;
	public abstract void actionChangeAttribute(LinkDescription linkDescription, String key, Object value)
			throws CadseException;

	// <T> void actionRemoveAttribute(CompactUUID itemId, IAttributeType<T> key)
	// throws CadseException;

	void actionDelete(ItemDelta item);

	// <T> void actionChangeAttribute(CompactUUID itemId, IAttributeType<T> key,
	// T value) throws CadseException;
	public abstract void actionRemoveAttribute(CompactUUID itemId, String key) throws CadseException;

	// <T> void actionChangeAttribute(LinkDescription linkDescription,
	// IAttributeType<T> key, T value) throws CadseException;
	public abstract void actionRemoveAttribute(LinkDescription linkDescription, String key) throws CadseException,
			CadseException;

	// <T> void actionRemoveAttribute(LinkDescription linkDescription,
	// IAttributeType<T> key) throws CadseException;

	public abstract void actionRemoveItem(ItemDescriptionRef itemDescriptionRef) throws CadseException, CadseException;

	public abstract void actionRemoveLink(LinkDescription linkDescription) throws CadseException;

	public abstract void actionRemoveOperation(WLWCOperationImpl operation);

	void addLoadedItem(Item item);

	boolean containsSpaceKey(ISpaceKey key);

	boolean containsUniqueName(String un);

	Item getBaseItem(CompactUUID id);

	Collection<Item> getIncomingItem(ItemDelta itemOperation, boolean acceptDelete, boolean acceptAdd);

	Collection<Item> getIncomingItem(ItemDelta itemOperation, LinkType lt, boolean acceptDelete, boolean acceptAdd);

	List<LinkDelta> getIncomingLinkOperations(ItemDelta itemOperation);

	List<LinkDelta> getIncomingLinks(ItemDelta itemOperation, boolean acceptDelete, boolean acceptAdd);

	/**
	 * Return the incomings link of itemOperation (added link, not deleted link)
	 * which type is lt
	 * 
	 * @param itemOperation
	 *            the item which get the incoming links
	 * @param lt
	 *            the type of the link which get
	 * @return the incomings links of type lt or empty list
	 */
	List<Link> getIncomingLinks(ItemDelta itemOperation, LinkType lt, boolean acceptDelete, boolean acceptAdd);

	ItemType getItemType(CompactUUID id, boolean createUnresolvedType);

	ILoggableAction getLog();

	ElementsOrder<MappingOperation> getMappingOrder();

	IWorkspaceNotifier getNotifier();

	Collection<WLWCOperationImpl> getOperations();

	ItemDelta getOrCreateItemOperation(CompactUUID id) throws CadseException;

	ItemDelta getOrCreateItemOperation(CompactUUID id, CompactUUID type) throws CadseException;

	ItemDelta getOrCreateItemOperation(CompactUUID id, CompactUUID type, boolean add) throws CadseException,
			CadseException;

	ItemDelta getOrCreateItemOperation(Item itembase) throws CadseException;

	Collection<ProjectAssociation> getProjectAssociationSet();

	boolean isForcetoLoad();

	boolean isForceToSave();

	void notifyAddMappingOperation(ItemDelta item, MappingOperation mappingOperation);

	void notifyCancelCreatedItem(ItemDelta item) throws CadseException;

	void notifyCancelCreatedLink(LinkDelta link) throws CadseException;

	void notifyChangeAttribute(ItemDelta item, SetAttributeOperation attOperation) throws CadseException,
			CadseException;

	void notifyChangeAttribute(LinkDelta link, SetAttributeOperation attOperation) throws CadseException,
			CadseException;

	void notifyChangeLinkOrder(LinkDelta link, OrderOperation orderOperation) throws CadseException, CadseException;

	void notifyCreatedItem(ItemDelta item) throws CadseException;

	void notifyCreatedLink(LinkDelta link) throws CadseException;

	void notifyDeletedItem(ItemDelta item) throws CadseException;

	void notifyDeletedLink(LinkDelta link) throws CadseException;

	void notifyDoubleClick(ItemDelta item) throws CadseException;

	void remove(ItemDelta itemOperation);

	void setLog(ILoggableAction log);

}