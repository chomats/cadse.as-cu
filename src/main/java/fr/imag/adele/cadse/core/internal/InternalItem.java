package fr.imag.adele.cadse.core.internal;

import java.util.Iterator;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemState;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.content.ContentItem;
import fr.imag.adele.cadse.core.transaction.delta.ItemDelta;
import fr.imag.adele.cadse.core.util.IErrorCollector;
import fr.imag.adele.cadse.util.OrderWay;

/**
 * Internal methods used by the CADSE runtime. Users MUST NOT USE these methods.
 * 
 * 
 * @author Thomas
 * 
 */
public interface InternalItem {


	/**
	 * Sets the type of this item.
	 * 
	 * @param itemType
	 *            type of this item
	 */
	public void setType(ItemType itemType);

	/**
	 * Deletes incoming link <code>link</code> of this item from logical
	 * workspace. If link source is not this item, the method has no effect.
	 * 
	 * @param link
	 *            a link
	 * @param notify
	 *            if false, no event is send for this operation
	 */
	public void removeIncomingLink(Link link, boolean notify);

	/**
	 * Deletes outgoing link <code>link</code> of this item from logical
	 * workspace. If link destination is not this item, the method has no
	 * effect.
	 * 
	 * @param link
	 *            a link
	 * @param notify
	 *            if false, no event is send for this operation
	 */
	public void removeOutgoingLink(Link link, boolean notify);

	/**
	 * Add incoming link <code>link</code> to this item. If link source is not
	 * this item, the method has no effect.
	 * 
	 * @param link
	 *            a link
	 * @param notify
	 *            if false, no event is send for this operation
	 */
	public void addIncomingLink(Link link, boolean notify);

	public <T> T internalGetOwnerAttribute(IAttributeType<T> type);

	public <T> T internalGetGenericOwnerAttribute(IAttributeType<T> type);

	public boolean commitSetAttribute(IAttributeType<?> type, Object value);

	public Link commitLoadCreateLink(LinkType lt, Item destination) throws CadseException;

	public void loadItem(IWorkingLoadingItems wl, ItemDelta itemOperation, IErrorCollector errorCollector)
			throws CadseException;

	public boolean commitMove(OrderWay kind, Link l1, Link l2) throws CadseException;

	public Iterator<Item> propagateValue(IAttributeType<?> type);

	public Iterator<Item> propagateValue(String key);

	//public void loadContent(UUID id);

	public void setParent(Item parent, LinkType lt);

	public boolean setFlag(int f, boolean flag);

	public void setVersion(int version);

	/**
	 * change the state of this item. Be carreful !!!
	 * 
	 * @param state
	 *            the state
	 */
	public void forceState(ItemState state);

	/**
	 * Refresh the vertical. Refreshes the content of the eclipse resource
	 * associated with an item
	 */
	public void refresh();

	/**
	 * If <code>isRuntime</code> is equal to true, this item becomes read only
	 * until this item becomes not in runtime. No contents object.
	 * 
	 * @param isRuntime
	 *            runtime flag
	 */
	public void setIsRuntime(boolean isRuntime);

	/**
	 * Compute attribute.
	 * 
	 * @param attributeName
	 *            the attribute name
	 * @param theirsValue
	 *            the theirs value
	 * @param baseValue
	 *            the base value
	 * @param mineValue
	 *            the mine value
	 */
	@Deprecated
	public void computeAttribute(String attributeName, Object theirsValue, Object baseValue, Object mineValue);

	public void computeAttributes();

	public ContentItem _getContentItem();

	/**
	 * INTERNAL method.
	 */
	public void update(IWorkingLoadingItems items, ItemDelta desc, IWorkspaceNotifier notifie);
}