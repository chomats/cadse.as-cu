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

import java.io.IOException;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/**
 * A CADSE event representing an atomic CADSE operation is composed of - a
 * ChangeID mask - arguments Number and type of arguments depend on ChangeID
 * mask.
 */
public enum ChangeID {

	/**
	 * Represents an event corresponding to a create item operation. Arguments
	 * are in order:
	 * <ul>
	 * <li>created item</li>
	 * </ul>
	 */
	CREATE_ITEM {
		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_create_item, objects[0]);
		}

		/**
		 * Returns created object.
		 * 
		 * @param objects
		 *            event arguments
		 * @return created object.
		 */
		@Override
		public Item item(Object... objects) {
			return (Item) objects[0];
		}
	},

	/**
	 * Represents an event corresponding to an addition outgoing link operation.
	 * Arguments are in order:
	 * <ul>
	 * <li>created link</li>
	 * </ul>
	 */
	CREATE_OUTGOING_LINK {
		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_create_outgoing_link, CommonMethods.toStringLink2((Link) objects[0]));
		}

		/**
		 * Returns created link.
		 * 
		 * @param objects
		 *            event arguments
		 * @return created link.
		 */
		@Override
		public Item item(Object... objects) {
			return ((Link) objects[0]).getSource();
		}
	},

	/**
	 * Represents an event corresponding to resolution of an incoming link due
	 * to loading or addition of a link. Arguments are in order:
	 * <ul>
	 * <li>destination item</li>
	 * <li>resolved link</li>
	 * </ul>
	 */
	RESOLVE_INCOMING_LINK {
		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_resolve_incoming_link, objects[0], objects[1]);
		}

		/**
		 * Returns resolved destination item of resolved link.
		 * 
		 * @param objects
		 *            event arguments
		 * @return resolved destination item of resolved link.
		 */
		@Override
		public Item item(Object... objects) {
			return (Item) objects[0];
		}
	},

	/**
	 * Represents an event corresponding to an incoming link which becomes no
	 * more resolved due to unloading or deletion of a link. Arguments are in
	 * order:
	 * <ul>
	 * <li>destination item</li>
	 * <li>unresolved link</li>
	 * </ul>
	 */
	UNRESOLVE_INCOMING_LINK {
		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_unresolve_incoming_link, objects[0], objects[1]);
		}

		/**
		 * Returns unresolved destination item of unresolved link.
		 * 
		 * @param objects
		 *            event arguments
		 * @return unresolved destination item of unresolved link.
		 */
		@Override
		public Item item(Object... objects) {
			return (Item) objects[0];
		}
	},

	/**
	 * Represents an event corresponding to deletion of a link. Arguments are in
	 * order:
	 * <ul>
	 * <li>deleted link</li>
	 * </ul>
	 */
	DELETE_OUTGOING_LINK {
		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_delete_outgoing_link, CommonMethods.toStringLink2((Link) objects[0]));
		}

		/**
		 * Returns source item of deleted link.
		 * 
		 * @param objects
		 *            event arguments
		 * @return source item of deleted link.
		 */
		@Override
		public Item item(Object... objects) {
			return ((Link) objects[0]).getSource();
		}
	},

	/**
	 * Represents an event corresponding to a set item attribute value
	 * operation. Arguments are in order:
	 * <ul>
	 * <li>item</li>
	 * <li>attribute definition</li>
	 * <li>old value</li>
	 * <li>new value</li>
	 * </ul>
	 */
	SET_ATTRIBUTE {
		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_set_attribute, objects[0], objects[1], objects[3], objects[2]);
		}

		/**
		 * Returns modified item.
		 * 
		 * @param objects
		 *            event arguments
		 * @return modified item.
		 */
		@Override
		public Item item(Object... objects) {
			return (Item) objects[0];
		}
	},

	/**
	 * Represents an event corresponding to a set link attribute value
	 * operation. Arguments are in order:
	 * <ul>
	 * <li>link</li>
	 * <li>attribute definition</li>
	 * <li>old value</li>
	 * <li>new value</li>
	 * </ul>
	 */
	SET_LINK_ATTRIBUTE {
		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_set_attribute, objects[0], objects[1], objects[3], objects[2]);
		}

		/**
		 * Returns source item of modified link.
		 * 
		 * @param objects
		 *            event arguments
		 * @return source item of modified link.
		 */
		@Override
		public Item item(Object... objects) {
			return ((Link) objects[0]).getSource();
		}
	},

	/**
	 * Represents an event corresponding to a set item valid state operation.
	 * Arguments are in order:
	 * <ul>
	 * <li>item</li>
	 * <li>old value</li>
	 * <li>new value</li>
	 * </ul>
	 */
	VALID {
		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_valid, objects[0], objects[2], objects[1]);
		}

		/**
		 * Returns modified item.
		 * 
		 * @param objects
		 *            event arguments
		 * @return modified item.
		 */
		@Override
		public Item item(Object... objects) {
			return (Item) objects[0];
		}
	},

	/**
	 * Represents an event corresponding to a delete item operation. Arguments
	 * are in order:
	 * <ul>
	 * <li>deleted item</li>
	 * </ul>
	 */
	DELETE_ITEM {
		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_delete_item, objects[0]);
		}

		/**
		 * Returns deleted item.
		 * 
		 * @param objects
		 *            event arguments
		 * @return deleted item.
		 */
		@Override
		public Item item(Object... objects) {
			return (Item) objects[0];
		}
	},

	/**
	 * Represents an event corresponding to a set item state operation.
	 * Arguments are in order:
	 * <ul>
	 * <li>item</li>
	 * <li>old state</li>
	 * <li>new state</li>
	 * </ul>
	 */
	STATE {
		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_state, objects[0], objects[1], objects[2]);
		}

		/**
		 * Returns modified item.
		 * 
		 * @param objects
		 *            event arguments
		 * @return modified item.
		 */
		@Override
		public Item item(Object... objects) {
			return (Item) objects[0];
		}
	},

	/**
	 * Represents an event corresponding to a set CADSE model state operation.
	 * Arguments are in order:
	 * <ul>
	 * <li>logical workspace</li>
	 * <li>old state</li>
	 * <li>new state</li>
	 * </ul>
	 */
	MODEL_STATE {
		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_model_state, objects[0], objects[1], objects[2]);
		}

		/**
		 * Returns null.
		 * 
		 * @param objects
		 *            event arguments
		 * @return null.
		 */
		@Override
		public Item item(Object... objects) {
			return null;
		}
	},

	/**
	 * Represents an event corresponding to addition of a component to a
	 * composite item operation. Arguments are in order:
	 * <ul>
	 * <li>composite item</li>
	 * <li>added component items</li>
	 * </ul>
	 */
	ADD_COMPONENT {
		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_add_composant, objects[0]);
			List<Item> l = (List<Item>) objects[1];
			try {
				a.append(" <");
				for (Item il : l) {
					a.append(" ");
					a.append(il.getId().toString());

				}
				a.append(">");
				a.append("\n\t <<");
				Item item = (Item) objects[0];
				for (Item link : item.getComponents()) {
					a.append(" ");
					a.append(link.toString());
				}
				a.append(" >>");
			} catch (IOException e) {
			}
		}

		/**
		 * Returns composite item which contains new component items. In other
		 * words, new composition outgoing links have been added to the
		 * composite item.
		 * 
		 * @param objects
		 *            event arguments
		 * @return composite item which contains new component items.
		 */
		@Override
		public Item item(Object... objects) {
			return (Item) objects[0];
		}
	},

	/**
	 * Represents an event corresponding to removal of a component to a
	 * composite item operation. Arguments are in order:
	 * <ul>
	 * <li>composite item</li>
	 * <li>removed component items</li>
	 * </ul>
	 */
	REMOVE_COMPONENT {

		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_remove_composant, objects[0]);
			List<Item> l = (List<Item>) objects[1];
			try {
				a.append(" <");
				for (Item il : l) {
					a.append(" ");
					a.append(il.getId().toString());

				}
				a.append(">");
				a.append("\n\t <<");
				Item item = (Item) objects[0];
				for (Item link : item.getComponents()) {
					a.append(" ");
					a.append(link.toString());
				}
				a.append(" >>");
			} catch (IOException e) {
			}
		}

		/**
		 * Returns composite item which no more contains component items. In
		 * other words, a sub set of composition outgoing links have been
		 * removed to the composite item.
		 * 
		 * @param objects
		 *            event arguments
		 * @return composite item.
		 */
		@Override
		public Item item(Object... objects) {
			return (Item) objects[0];
		}
	},

	/**
	 * Represents an event corresponding to reordering of outgoing links of an
	 * item operation. Arguments are in order:
	 * <ul>
	 * <li>item</li>
	 * <li>first link</li>
	 * <li>second link</li>
	 * <li>order way ...</li>
	 * </ul>
	 * 
	 */
	ORDER_OUTGOING_LINK {

		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_order_outgoing_link, objects[0], objects[1], objects[2], objects[3]);
		}

		/**
		 * Returns null.
		 * 
		 * @param objects
		 *            event arguments
		 * @return null.
		 */
		@Override
		public Item item(Object... objects) {
			return null;
		}
	},

	/**
	 * Represents an event corresponding to loading of a set of items operation.
	 * Arguments are in order:
	 * <ul>
	 * <li>logical workspace</li>
	 * <li>all just loading items</li>
	 * </ul>
	 */
	LOAD_ITEMS {

		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_load_items, objects[0], ((List<Item>) objects[1]).size());
		}

		/**
		 * Returns null.
		 * 
		 * @param objects
		 *            event arguments
		 * @return null.
		 */
		@Override
		public Item item(Object... objects) {
			return null;
		}

	},

	/**
	 * Represents an event corresponding to force persist item (not in team
	 * repository but only in the current workspace) operation. <br>
	 * Arguments are in order:
	 * <ul>
	 * <li>saved item</li>
	 * </ul>
	 */
	FORCE_SAVE {
		/**
		 * Appends a description of this event to specify appendable object.
		 * 
		 * @param objects
		 *            event arguments
		 */
		@Override
		public void print(Appendable a, Object... objects) {
			sprintf(a, Messages.event_id_FORCE_SAVE, objects[0]);
		}

		/**
		 * Returns saved item.
		 * 
		 * @param objects
		 *            event arguments
		 * @return saved item.
		 */
		@Override
		public Item item(Object... objects) {
			return (Item) objects[0];
		}
	};

	/**
	 * Appends a description of this event to specify appendable object.
	 * 
	 * @param objects
	 *            event arguments
	 */
	public abstract void print(Appendable a, Object... objects);

	public abstract Item item(Object... objects);

	/**
	 * Prints the specified objects on the standard output channel.
	 * 
	 * @param objects
	 *            objects
	 */
	public void print(Object... objects) {
		print(System.out, objects);
		System.out.println();
	}

	public String toString(Object... objects) {
		StringBuilder sb = new StringBuilder();
		print(sb, objects);
		return sb.toString();
	}

	/**
	 * Appends specified message to the appendable object.
	 * 
	 * @param a
	 *            appendable object
	 * @param format
	 *            message
	 * @param args
	 *            arguments used to format the message
	 */
	public static void sprintf(Appendable a, String format, Object... args) {
		Formatter formatter = new Formatter(a);
		formatter.format(Locale.getDefault(), format, args);
	}

	/**
	 * Returns ChangeID mask corresponding to union of all specified event type.
	 * 
	 * @param ids
	 *            ChangeID types
	 * @return ChangeID mask corresponding to union of all specified event type.
	 */
	public static int toFilter(ChangeID... ids) {
		int ret = 0;
		for (int i = 0; i < ids.length; i++) {
			ret |= 1 << ids[i].ordinal();
		}

		return ret;
	}

	/**
	 * Returns ChangeID mask corresponding to union of <code>f</code> with
	 * <code>id</code> event types.
	 * 
	 * @param f
	 *            ChangeID mask
	 * @param id
	 *            ChangeID type
	 * @return ChangeID mask corresponding to union of <code>f</code> with
	 *         <code>id</code> event types.
	 */
	public static int toFilter(int f, ChangeID id) {
		return f | 1 << id.ordinal();
	}

	/**
	 * Returns true if ChangeID mak <code>filter</code> includes event type
	 * <code>id</code>.
	 * 
	 * @param id
	 *            ChangeID type
	 * @param filter
	 *            ChangeID mask
	 * @return true if ChangeID mak <code>filter</code> includes event type
	 *         <code>id</code>.
	 */
	public static boolean filter(ChangeID id, int filter) {
		return (filter & (1 << id.ordinal())) != 0;
	}

	/**
	 * Return ChangeID mask corresponding to union of all resolution operations.
	 * 
	 * @return ChangeID mask corresponding to union of all resolution
	 *         operations.
	 */
	public static int resolvedUnresoldedChangeID() {
		return toFilter(RESOLVE_INCOMING_LINK, UNRESOLVE_INCOMING_LINK);
	}

}