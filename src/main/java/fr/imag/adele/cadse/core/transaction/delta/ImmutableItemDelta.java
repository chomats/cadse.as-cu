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
 *
 * Copyright (C) 2006-2010 Adele Team/LIG/Grenoble University, France
 */
package fr.imag.adele.cadse.core.transaction.delta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.imag.adele.cadse.core.ChangeID;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemState;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.WSEvent;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * The Class ItemDelta.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class ImmutableItemDelta {

	/** The Constant KCREATED. */
	private static final int					KCREATED						= 1;

	/** The Constant KDELETED. */
	private static final int					KDELETED						= 8;

	/** The Constant KLOAD. */
	private static final int					KLOAD							= 16;

	/** The Constant KORDER_OUTGOING_LINK_CHANGED. */
	private static final int					KORDER_OUTGOING_LINK_CHANGED	= 32;

	/** The item. */
	private Item								item;

	/** The kind. */
	private int									kind;

	/** The attributes. */
	private Map<IAttributeType<?>, Object[]>	attributes;

	/** The components added. */
	private List<Item>							componentsAdded;

	/** The components removed. */
	private List<Item>							componentsRemoved;

	/** The links added. */
	private List<Link>							linksAdded;

	/** The links removed. */
	private List<Link>							linksRemoved;

	/** The links revolded incoming removed. */
	private List<Link>							linksRevoldedIncomingRemoved;

	/** The links revolded incoming added. */
	private List<Link>							linksRevoldedIncomingAdded;

	/** The links revolded outgoing removed. */
	private List<Link>							linksRevoldedOutgoingRemoved;

	/** The links revolded outgoing added. */
	private List<Link>							linksRevoldedOutgoingAdded;

	/** The old state. */
	private ItemState							oldState;

	/** The new state. */
	private ItemState							newState;

	private List<WSEvent>						_events							= new ArrayList<WSEvent>();
	private int									_filters						= 0;

	private ImmutableItemTypeDelta				_itemtypedelta;

	private boolean								doubleClick;

	/**
	 * Instantiates a new item delta.
	 * 
	 * @param item
	 *            the item
	 */
	ImmutableItemDelta(Item item) {
		this.item = item;
	}

	/**
	 * Gets the item.
	 * 
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * Adds the composants.
	 * 
	 * @param composants
	 *            the composants
	 */
	void addComposants(List<Item> composants) {
		if (componentsAdded == null) {
			componentsAdded = new ArrayList<Item>();
		}

		componentsAdded.addAll(composants);
		if (componentsRemoved != null) {
			componentsRemoved.removeAll(composants);
		}
	}

	/**
	 * Removes the composants.
	 * 
	 * @param composants
	 *            the composants
	 */
	public void removeComposants(List<Item> composants) {
		if (componentsRemoved == null) {
			componentsRemoved = new ArrayList<Item>();
		}

		componentsRemoved.addAll(composants);
		if (componentsAdded != null) {
			componentsAdded.removeAll(composants);
		}
	}

	/**
	 * Created.
	 */
	void created() {
		kind |= KCREATED;
	}

	/**
	 * Adds the outgoing link.
	 * 
	 * @param l
	 *            the l
	 */
	void addOutgoingLink(Link l) {
		if (isRemovedOutgoingLink(l)) {
			linksRemoved.remove(l);
		} else {
			if (linksAdded == null) {
				linksAdded = new ArrayList<Link>();
			}
			linksAdded.add(l);
		}
	}

	/**
	 * Removes the outgoing link.
	 * 
	 * @param l
	 *            the l
	 */
	void removeOutgoingLink(Link l) {
		if (isCreatedOutgoingLink(l)) {
			linksAdded.remove(l);
		} else {
			if (linksRemoved == null) {
				linksRemoved = new ArrayList<Link>();
			}
			linksRemoved.add(l);
		}
		if (linksRevoldedOutgoingAdded != null) {
			linksRevoldedOutgoingAdded.remove(l);
		}
		if (linksRevoldedOutgoingRemoved != null) {
			linksRevoldedOutgoingRemoved.remove(l);
		}
	}

	/**
	 * Checks if is created outgoing link.
	 * 
	 * @param l
	 *            the l
	 * 
	 * @return true, if is created outgoing link
	 */
	public boolean isCreatedOutgoingLink(Link l) {
		return linksAdded != null && linksAdded.contains(l);
	}

	/**
	 * Checks if is removed outgoing link.
	 * 
	 * @param l
	 *            the l
	 * 
	 * @return true, if is removed outgoing link
	 */
	public boolean isRemovedOutgoingLink(Link l) {
		return linksRemoved != null && linksRemoved.contains(l);
	}

	/**
	 * Adds the resolve incoming link.
	 * 
	 * @param l
	 *            the l
	 */
	void addResolveIncomingLink(Link l) {

		if (linksRevoldedIncomingAdded == null) {
			linksRevoldedIncomingAdded = new ArrayList<Link>();
		}

		linksRevoldedIncomingAdded.add(l);
		if (linksRevoldedIncomingRemoved != null) {
			linksRevoldedIncomingRemoved.remove(l);
		}
	}

	/**
	 * Adds the resovle outgoing link.
	 * 
	 * @param l
	 *            the l
	 */
	void addResovleOutgoingLink(Link l) {
		if (isRemovedOutgoingLink(l)) {
			throw new IllegalArgumentException();
		}
		if (linksRevoldedOutgoingAdded == null) {
			linksRevoldedOutgoingAdded = new ArrayList<Link>();
		}

		linksRevoldedOutgoingAdded.add(l);
		if (linksRevoldedOutgoingRemoved != null) {
			linksRevoldedOutgoingRemoved.remove(l);
		}
	}

	/**
	 * Adds the unresolve incoming link.
	 * 
	 * @param l
	 *            the l
	 */
	void addUnresolveIncomingLink(Link l) {
		if (linksRevoldedIncomingRemoved == null) {
			linksRevoldedIncomingRemoved = new ArrayList<Link>();
		}

		linksRevoldedIncomingRemoved.add(l);
		if (linksRevoldedIncomingAdded != null) {
			linksRevoldedIncomingAdded.remove(l);
		}
	}

	/**
	 * Adds the unresovle outgoing link.
	 * 
	 * @param l
	 *            the l
	 */
	void addUnresovleOutgoingLink(Link l) {
		if (linksRevoldedOutgoingRemoved == null) {
			linksRevoldedOutgoingRemoved = new ArrayList<Link>();
		}

		linksRevoldedOutgoingRemoved.add(l);
		if (linksRevoldedOutgoingAdded != null) {
			linksRevoldedOutgoingAdded.remove(l);
		}
	}

	/**
	 * Removes the incoming link.
	 * 
	 * @param l
	 *            the l
	 */
	void removeIncomingLink(Link l) {
		if (linksRevoldedIncomingAdded != null) {
			linksRevoldedIncomingAdded.remove(l);
		}
		if (linksRevoldedIncomingRemoved != null) {
			linksRevoldedIncomingRemoved.remove(l);
		}
	}

	/**
	 * Sets the attribute.
	 * 
	 * @param attributeType
	 *            the key
	 * @param oldvalue
	 *            the oldvalue
	 * @param newvalue
	 *            the newvalue
	 */
	void setAttribute(IAttributeType<?> attributeType, Object oldvalue, Object newvalue) {
		if (attributes != null) {
			Object[] values = attributes.get(attributeType);
			if (values != null) {
				values[1] = newvalue;
			}
		}
		if (attributes == null) {
			attributes = new HashMap<IAttributeType<?>, Object[]>();
		}

		attributes.put(attributeType, new Object[] { oldvalue, newvalue });
	}

	/**
	 * Load.
	 */
	void load() {
		kind |= KLOAD;
	}

	/**
	 * Deleted.
	 */
	void deleted() {
		kind = KDELETED;
		attributes = null;
		componentsAdded = null;
		componentsRemoved = null;
		linksAdded = null;
		linksRemoved = null;
		linksRevoldedIncomingAdded = null;
		linksRevoldedIncomingRemoved = null;
		linksRevoldedOutgoingAdded = null;
		linksRevoldedOutgoingRemoved = null;
	}

	/**
	 * Checks if is deleted.
	 * 
	 * @return true, if is deleted
	 */
	public boolean isDeleted() {
		return (kind & KDELETED) != 0;
	}

	/**
	 * Checks if is created.
	 * 
	 * @return true, if is created
	 */
	public boolean isCreated() {
		return (kind & KCREATED) != 0;
	}

	/**
	 * Checks if is loaded.
	 * 
	 * @return true, if is loaded
	 */
	public boolean isLoaded() {
		return (kind & KLOAD) != 0;
	}

	/**
	 * Checks for set attributes.
	 * 
	 * @return true, if successful
	 */
	public boolean hasSetAttributes() {
		return this.attributes != null && attributes.size() > 0;
	}

	/**
	 * Checks for resolved incoming link.
	 * 
	 * @return true, if successful
	 */
	public boolean hasResolvedIncomingLink() {
		return linksRevoldedIncomingAdded != null && linksRevoldedIncomingAdded.size() > 0;
	}

	/**
	 * Checks for unresolved incoming link.
	 * 
	 * @return true, if successful
	 */
	public boolean hasUnresolvedIncomingLink() {
		return linksRevoldedIncomingRemoved != null && linksRevoldedIncomingRemoved.size() > 0;
	}

	/**
	 * Checks for resolved outgoing link.
	 * 
	 * @return true, if successful
	 */
	public boolean hasResolvedOutgoingLink() {
		return linksRevoldedOutgoingAdded != null && linksRevoldedOutgoingAdded.size() > 0;
	}

	/**
	 * Checks for unresolved outgoing link.
	 * 
	 * @return true, if successful
	 */
	public boolean hasUnresolvedOutgoingLink() {
		return linksRevoldedOutgoingRemoved != null && linksRevoldedOutgoingRemoved.size() > 0;
	}

	/**
	 * Checks for removed outgoing link.
	 * 
	 * @return true, if successful
	 */
	public boolean hasRemovedOutgoingLink() {
		return linksRemoved != null && linksRemoved.size() > 0;
	}

	/**
	 * Checks for added outgoing link.
	 * 
	 * @return true, if successful
	 */
	public boolean hasAddedOutgoingLink() {
		return linksAdded != null && linksAdded.size() > 0;
	}

	/**
	 * Change state.
	 * 
	 * @param oldState
	 *            the old state
	 * @param newState
	 *            the new state
	 */
	void changeState(ItemState oldState, ItemState newState) {
		this.newState = newState;
		if (this.oldState == null) {
			this.oldState = oldState;
		}
	}

	/**
	 * Checks for changed state.
	 * 
	 * @return true, if successful
	 */
	public boolean hasChangedState() {
		return this.oldState != null;
	}

	/**
	 * Gets the old state.
	 * 
	 * @return the old state
	 */
	public ItemState getOldState() {
		return oldState;
	}

	/**
	 * Gets the new state.
	 * 
	 * @return the new state
	 */
	public ItemState getNewState() {
		return newState;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getItem().getQualifiedName());
		sb.append("\n").append(getItem().getName());
		sb.append("\n").append(this.item.getId()).append("\n");
		if (isCreated()) {
			sb.append(" created");
		}
		if (isLoaded()) {
			sb.append(" loaded");
		}
		if (isDeleted()) {
			sb.append(" deleted");
		}
		sb.append("\n");
		if (hasChangedState()) {
			sb.append("change state ").append(getOldState());
			sb.append(" to ").append(getNewState()).append("\n");
		}
		toStringLinks(sb, linksAdded, "links added:");
		toStringLinks(sb, linksRemoved, "links removed:");
		toStringLinks(sb, linksRevoldedIncomingAdded, "links incoming resolved:");
		toStringLinks(sb, linksRevoldedIncomingRemoved, "links incoming unresolved:");
		toStringLinks(sb, linksRevoldedOutgoingAdded, "links outgoing resolved:");
		toStringLinks(sb, linksRevoldedOutgoingRemoved, "links outgoing unresolved:");

		if (hasSetAttributes()) {
			sb.append("attributes changed:");
			for (Map.Entry<IAttributeType<?>, Object[]> entry : getSetAttributes().entrySet()) {
				sb.append("  - ").append(entry.getKey()).append(" ");
				Object[] values = entry.getValue();
				sb.append(values[0]).append(" --> ").append(values[1]).append("\n");
			}
		}
		toStringComponents(sb, componentsAdded, "components added:");
		toStringComponents(sb, componentsRemoved, "components added:");
		sb.append("\n");
		return sb.toString();
	}

	/**
	 * Gets the sets the attributes.
	 * 
	 * @return the sets the attributes
	 */
	public Map<IAttributeType<?>, Object[]> getSetAttributes() {
		if (attributes == null) {
			return Collections.emptyMap();
		}
		return attributes;
	}

	/**
	 * Gets the links added.
	 * 
	 * @return the links added
	 */
	public List<Link> getLinksAdded() {
		if (linksAdded == null) {
			return Collections.emptyList();
		}
		return linksAdded;
	}

	/**
	 * Gets the links removed.
	 * 
	 * @return the links removed
	 */
	public List<Link> getLinksRemoved() {
		if (linksRemoved == null) {
			return Collections.emptyList();
		}
		return linksRemoved;
	}

	/**
	 * Gets the resolved incoming links.
	 * 
	 * @return the resolved incoming links
	 */
	public List<Link> getResolvedIncomingLinks() {
		if (linksRevoldedIncomingAdded == null) {
			return Collections.emptyList();
		}
		return linksRevoldedIncomingAdded;
	}

	/**
	 * Gets the unresolved incoming links.
	 * 
	 * @return the unresolved incoming links
	 */
	public List<Link> getUnresolvedIncomingLinks() {
		if (linksRevoldedIncomingRemoved == null) {
			return Collections.emptyList();
		}
		return linksRevoldedIncomingRemoved;
	}

	/**
	 * Gets the resolved outgoing links.
	 * 
	 * @return the resolved outgoing links
	 */
	public List<Link> getResolvedOutgoingLinks() {
		if (linksRevoldedOutgoingAdded == null) {
			return Collections.emptyList();
		}
		return linksRevoldedOutgoingAdded;
	}

	/**
	 * Gets the unresolved outgoing links.
	 * 
	 * @return the unresolved outgoing links
	 */
	public List<Link> getUnresolvedOutgoingLinks() {
		if (linksRevoldedOutgoingRemoved == null) {
			return Collections.emptyList();
		}
		return linksRevoldedOutgoingRemoved;
	}

	/**
	 * Gets the components added.
	 * 
	 * @return the components added
	 */
	public List<Item> getComponentsAdded() {
		if (componentsAdded == null) {
			return Collections.emptyList();
		}
		return componentsAdded;
	}

	/**
	 * Gets the components removed.
	 * 
	 * @return the components removed
	 */
	public List<Item> getComponentsRemoved() {
		if (componentsRemoved == null) {
			return Collections.emptyList();
		}
		return componentsRemoved;
	}

	/**
	 * To string links.
	 * 
	 * @param sb
	 *            the sb
	 * @param links
	 *            the links
	 * @param title
	 *            the title
	 */
	static private void toStringLinks(StringBuilder sb, List<Link> links, String title) {
		if (links != null && links.size() > 0) {
			sb.append(title).append("\n");
			for (Link l : links) {
				sb.append(" - ").append(l.toString()).append("\n");
			}
		}
	}

	/**
	 * To string components.
	 * 
	 * @param sb
	 *            the sb
	 * @param links
	 *            the links
	 * @param title
	 *            the title
	 */
	static private void toStringComponents(StringBuilder sb, List<Item> links, String title) {
		if (links != null && links.size() > 0) {
			sb.append(title).append("\n");
			for (Item l : links) {
				sb.append(" - ").append(l.toString()).append("\n");
			}
		}
	}

	/**
	 * Sets the order outgoing link changed.
	 */
	void setOrderOutgoingLinkChanged() {
		kind |= KORDER_OUTGOING_LINK_CHANGED;
	}

	/**
	 * Checks for order outgoing link changed.
	 * 
	 * @return true, if successful
	 */
	public boolean hasOrderOutgoingLinkChanged() {
		return (kind & KORDER_OUTGOING_LINK_CHANGED) != 0;
	}

	/**
	 * Checks for set attributes.
	 * 
	 * @param attributeKey
	 *            the attribute key
	 * 
	 * @return true, if successful
	 */
	public boolean hasSetAttributes(IAttributeType<?> attributeKey) {
		return attributes != null && attributes.containsKey(attributeKey);
	}

	void addWSEvent(WSEvent e) {
		_events.add(e);
		_filters = ChangeID.toFilter(_filters, e.getEventTypeId());
	}

	public List<WSEvent> getEvents() {
		return _events;
	}

	public int getFilters() {
		return _filters;
	}

	public ImmutableItemTypeDelta getItemTypeDelta() {
		return this._itemtypedelta;
	}

	public void setItemtypedelta(ImmutableItemTypeDelta itemtypedelta) {
		this._itemtypedelta = itemtypedelta;
	}

	public boolean hasModifiedAttribute(IAttributeType<?> att) {
		return hasSetAttributes(att);

	}

}
