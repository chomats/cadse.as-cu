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

package fr.imag.adele.cadse.core.delta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.imag.adele.cadse.core.CadseDomain;
import fr.imag.adele.cadse.core.ChangeID;
import fr.imag.adele.cadse.core.EventsManager;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemState;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.WSEvent;
import fr.imag.adele.cadse.core.WSModelState;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * This class represents delta between two workspace logic states (from one
 * timsetamp to a more recent one).
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class ImmutableWorkspaceDelta {

	/**
	 * Recorded events which represent all performed actions on the workspace
	 * from previous workspace logic state.
	 */
	public ArrayList<WSEvent>						_events		= new ArrayList<WSEvent>();

	/**
	 * All items related to performed actions.
	 */
	private Map<Item, ImmutableItemDelta>			_items;

	/**
	 * More recent workspace logic state.
	 */
	private WSModelState							_modelstate;

	/**
	 * All item types related to performed actions.
	 */
	private Map<ItemType, ImmutableItemTypeDelta>	_itembytypes;

	/**
	 * Event manager which create this workspace delta. It is responsible of
	 * dispatching CADSE events.
	 */
	private EventsManager							_eventsManager;

	/**
	 * Workspace domain which is root access for all workspace logic handle.
	 */
	private CadseDomain								_wsdomain;

	/**
	 * All items which have been loaded between these two states.
	 */
	private ArrayList<Item>							_loadedItems;

	/**
	 * Identifier of this delta. Its value is equal to creation time.
	 */
	private long									_id;

	/**
	 * This bit set defines listened event types.
	 * 
	 * @see fr.imag.adele.cadse.core.ChangeID
	 */
	private int										_filters	= 0;

	/**
	 * Instantiates a new workspace delta.
	 * 
	 * @param wsdomain
	 *            the workspace domain
	 * @param manager
	 *            event manager which create this workspace delta
	 */
	public ImmutableWorkspaceDelta(CadseDomain wsdomain, EventsManager manager) {
		_eventsManager = manager;
		_wsdomain = wsdomain;
		_id = System.currentTimeMillis();
	}

	/**
	 * Get the workspace delta id.
	 * 
	 * @return the workspace delta id (long).
	 */
	public long getId() {
		return _id;
	}

	/**
	 * Returns the bit set which defines listened event types.
	 * 
	 * @see fr.imag.adele.cadse.core.ChangeID
	 * 
	 * @return the bit set which defines listened event types.
	 */
	public int getFilters() {
		return _filters;
	}

	/**
	 * Adds a CADSE event.
	 * 
	 * @param event
	 *            a CADSE event
	 */
	public void addEvent(WSEvent event) {
		ChangeID eventType = event.getEventTypeId();
		Object[] objects = event.getOperationArgs();

		_events.add(event);
		_filters = ChangeID.toFilter(_filters, eventType);

		switch (eventType) {
			case STATE: {
				getItemOrCreate((Item) objects[0], event).changeState((ItemState) objects[1], (ItemState) objects[2]);
				break;
			}
			case CREATE_ITEM: {
				getItemOrCreate((Item) objects[0], event).created();
				break;
			}
			case CREATE_OUTGOING_LINK: {
				Link l = (Link) objects[0];
				getItemOrCreate(l.getSource(), event).addOutgoingLink(l);
				break;
			}
			case RESOLVE_INCOMING_LINK: {
				Item dest = (Item) objects[0];
				Link l = (Link) objects[1];
				getItemOrCreate(l.getSource(), event).addResovleOutgoingLink(l);
				getItemOrCreate(dest, event).addResolveIncomingLink(l);
				break;
			}
			case UNRESOLVE_INCOMING_LINK: {
				Item dest = (Item) objects[0];
				Link l = (Link) objects[1];
				getItemOrCreate(l.getSource(), event).addUnresovleOutgoingLink(l);
				getItemOrCreate(dest, event).addUnresolveIncomingLink(l);
				break;
			}
			case DELETE_OUTGOING_LINK: {
				Link l = (Link) objects[0];
				Item dest = l.getDestination(false);

				getItemOrCreate(l.getSource(), event).removeOutgoingLink(l);
				getItemOrCreate(dest, event).removeIncomingLink(l);
				break;
			}
			case SET_ATTRIBUTE: {
				getItemOrCreate((Item) objects[0], event).setAttribute((IAttributeType<?>) objects[1], objects[2],
						objects[3]);
				break;
			}

			case DELETE_ITEM: {
				getItemOrCreate((Item) objects[0], event).deleted();
				break;
			}
			case ADD_COMPONENT: {
				getItemOrCreate((Item) objects[0], event).addComposants((List<Item>) objects[1]);
				break;
			}
			case REMOVE_COMPONENT: {
				getItemOrCreate((Item) objects[0], event).removeComposants((List<Item>) objects[1]);
				break;
			}
			case MODEL_STATE: {
				_modelstate = (WSModelState) objects[2];
				break;
			}
			case ORDER_OUTGOING_LINK: {
				getItemOrCreate((Item) objects[0], event).setOrderOutgoingLinkChanged();
				break;
			}
			case LOAD_ITEMS: {
				// WSModel model = (WSModel) objects[0];
				addLoadedItems((List<Item>) objects[1]);
				break;
			}

			default:
				break;
		}
	}

	/**
	 * Adds items which have been just loaded.
	 * 
	 * @param items
	 *            items which have been loaded
	 */
	private void addLoadedItems(List<Item> items) {
		if (_loadedItems == null) {
			_loadedItems = new ArrayList<Item>();
		}
		_loadedItems.addAll(items);
	}

	/**
	 * Returns the item delta which represents all operations performed on this
	 * item and take into account the item operation related to specified event.
	 * 
	 * @param item
	 *            item related to specified event
	 * @param event
	 *            an event representing an item operation
	 * 
	 * @return the item delta which represents all operations performed on this
	 *         item.
	 */
	protected ImmutableItemDelta getItemOrCreate(Item item, WSEvent event) {
		if (_itembytypes == null) {
			_itembytypes = new HashMap<ItemType, ImmutableItemTypeDelta>();
		}
		ImmutableItemTypeDelta itemTypeDelta = _itembytypes.get(item.getType());

		ImmutableItemDelta itemDelta = getItem(item);
		if (itemDelta == null) {
			if (itemTypeDelta == null) {
				itemTypeDelta = new ImmutableItemTypeDelta(item.getType());
				_itembytypes.put(item.getType(), itemTypeDelta);
			}

			itemDelta = new ImmutableItemDelta(item);
			itemDelta.setItemtypedelta(itemTypeDelta);

			if (_items == null) {
				_items = new HashMap<Item, ImmutableItemDelta>();
			}

			_items.put(item, itemDelta);
			itemTypeDelta.add(itemDelta);
		}
		itemTypeDelta.add(event);
		itemDelta.addWSEvent(event);

		return itemDelta;
	}

	/**
	 * Returns the item delta which represents all operations performed on this
	 * item. If item is null then return null.
	 * 
	 * @param item
	 *            an item
	 * 
	 * @return the item delta which represents all operations performed on this
	 *         item.
	 */
	public ImmutableItemDelta getItem(Item item) {
		if (_items == null) {
			return null;
		}
		return _items.get(item);
	}

	/**
	 * Returns true if the last workspace logic state managed by this delta is
	 * equal to specified state. Returns false if the two states are equal.
	 * 
	 * @param state
	 *            expected workspace logic state (no modification operation have
	 *            been performed).
	 * 
	 * @return true if the last workspace logic state managed by this delta is
	 *         equal to specified state.
	 */
	public boolean currentModelHasState(WSModelState state) {
		return _modelstate != null && _modelstate == state;
	}

	/**
	 * Returns new workspace logic state. If there is no recorded modification,
	 * returns null.
	 * 
	 * @see #currentModelHasState(WSModelState)
	 * 
	 * @return new workspace logic state.
	 */
	public WSModelState getModelstate() {
		return _modelstate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (_modelstate != null) {
			sb.append("workspace logique state  : ").append(_modelstate).append("\n");
		}
		if (_items != null) {
			for (ImmutableItemDelta id : _items.values()) {
				sb.append(id.toString());
			}
		}
		if (_events.size() != 0) {
			sb.append("events:\n");
		}
		for (WSEvent we : _events) {
			sb.append("  - ").append(we.toString());
			sb.append("\n");
		}
		return sb.toString();
	}

	/**
	 * Returns loaded items during the represented period.
	 * 
	 * @return loaded items during the represented period.
	 */
	public List<Item> getLoadedItems() {
		return _loadedItems;
	}

	/**
	 * Returns all recorded events which represent all operations performed on
	 * the workspace logic during the represented period.
	 * 
	 * @return all recorded events which represent all operations performed on
	 *         the workspace logic during the represented period.
	 */
	public List<WSEvent> getEvents() {
		return _events;
	}

	/**
	 * Returns the workspace domain.
	 * 
	 * @return the workspace domain
	 */
	public CadseDomain getCadseDomain() {
		return _wsdomain;
	}

	public Collection<ImmutableItemDelta> getItems() {
		if (_items == null) {
			return Collections.emptyList();
		}
		return _items.values();
	}
	
	public Collection<ImmutableItemDelta> getItems(ItemType it) {
		if (_itembytypes == null) {
			return Collections.emptyList();
		}
		ImmutableItemTypeDelta ret = _itembytypes.get(it);
		if (ret == null)
			return Collections.emptyList();
		return ret.getItems();
	}

	public Collection<ImmutableItemTypeDelta> getItemTypes() {
		if (_itembytypes == null) {
			return Collections.emptyList();
		}
		return _itembytypes.values();
	}

	public EventsManager getEventsManager() {
		return _eventsManager;
	}

}
