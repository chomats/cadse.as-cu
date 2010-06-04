package fr.imag.adele.cadse.core.internal.delta;

import java.util.Collection;

import fr.imag.adele.cadse.core.CadseException;
import java.util.UUID;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemDescriptionRef;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkDescription;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.ProjectAssociation;
import fr.imag.adele.cadse.core.TypeDefinition;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.internal.ILoggableAction;
import fr.imag.adele.cadse.core.internal.IWorkspaceNotifier;
import fr.imag.adele.cadse.core.key.Key;
import fr.imag.adele.cadse.core.transaction.delta.ItemDelta;
import fr.imag.adele.cadse.core.transaction.delta.LinkDelta;
import fr.imag.adele.cadse.core.transaction.delta.MappingOperation;
import fr.imag.adele.cadse.core.transaction.delta.OrderOperation;
import fr.imag.adele.cadse.core.transaction.delta.SetAttributeOperation;
import fr.imag.adele.cadse.core.transaction.delta.WLWCOperationImpl;
import fr.imag.adele.cadse.core.util.ElementsOrder;

public interface InternalLogicalWorkspaceTransaction {
	void actionAdd(ItemDelta item) throws CadseException;

	public abstract <T> void actionAddAttribute(UUID itemId, IAttributeType<T> key, T value)
			throws CadseException, CadseException;

	public abstract <T> void actionAddAttribute(LinkDescription linkDescription, IAttributeType<T> key, T value)
			throws CadseException;

	ItemDelta actionAddItem(ItemDescriptionRef itemDescriptionRef, UUID parent, LinkType lt)
			throws CadseException;

	public abstract void actionAddLink(LinkDescription linkDescription) throws CadseException;

	public abstract void actionAddOperation(WLWCOperationImpl operation);

	public abstract <T> void actionChangeAttribute(UUID itemId, IAttributeType<T> key, T value)
			throws CadseException, CadseException;

	public abstract <T> void actionChangeAttribute(LinkDescription linkDescription, IAttributeType<T> key, T value)
			throws CadseException;

	void actionDelete(ItemDelta item);

	public abstract <T> void actionRemoveAttribute(UUID itemId, IAttributeType<T> key) throws CadseException;

	public abstract <T> void actionRemoveAttribute(LinkDescription linkDescription, IAttributeType<T> key)
			throws CadseException, CadseException;

	public abstract void actionRemoveItem(ItemDescriptionRef itemDescriptionRef) throws CadseException, CadseException;

	public abstract void actionRemoveLink(LinkDescription linkDescription) throws CadseException;

	public abstract void actionRemoveOperation(WLWCOperationImpl operation);

	void addLoadedItem(Item item);

	boolean containsSpaceKey(Key key);

	boolean containsUniqueName(String un);

	Item getBaseItem(UUID id);

	TypeDefinition getTypeDefinition(UUID cadseId, UUID id, boolean createUnresolvedType);

	ItemType getItemType(UUID cadseId, UUID id, boolean createUnresolvedType);

	ILoggableAction getLog();

	ElementsOrder<MappingOperation> getMappingOrder();

	IWorkspaceNotifier getNotifier();

	Collection<WLWCOperationImpl> getOperations();

	ItemDelta getOrCreateItemOperation(UUID id) throws CadseException;

	ItemDelta getOrCreateItemOperation(UUID id, UUID type) throws CadseException;

	ItemDelta getOrCreateItemOperation(UUID id, UUID type, boolean add) throws CadseException,
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

	public void validateDeleteLink(LinkDelta link) throws CadseException;

}