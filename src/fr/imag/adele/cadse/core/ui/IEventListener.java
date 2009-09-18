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

package fr.imag.adele.cadse.core.ui;

/**
 * The listener interface for receiving IEvent events. The class that is
 * interested in processing a IEvent event implements this interface, and the
 * object created with that class is registered with a component using the
 * component's <code>addIEventListener<code> method. When
 * the IEvent event occurs, that object's appropriate
 * method is invoked.
 * 
 * @see IEventEvent
 */
public interface IEventListener {

	/** The Constant CHANGED_ACTION. */
	public static final int	CHANGED_ACTION	= 0x0001;

	/** The Constant ADDED_ACTION. */
	public static final int	ADDED_ACTION	= 0x0002;

	/** The Constant REMOVED_ACTION. */
	public static final int	REMOVED_ACTION	= 0x0004;

	/** The Constant DELETED_ACTION. */
	public static final int	DELETED_ACTION	= 0x0008;

	/**
	 * Inits the.
	 * 
	 * @param field
	 *            the field
	 */
	public void init(UIField field);

	/**
	 * Notifie value deleted.
	 * 
	 * @param field
	 *            the field
	 * @param oldvalue
	 *            the oldvalue
	 */
	public void notifieValueDeleted(UIField field, Object oldvalue);

	/**
	 * Notifie value changed.
	 * 
	 * @param field
	 *            the field
	 * @param value
	 *            the value
	 */
	public void notifieValueChanged(UIField field, Object value);

	/**
	 * Notifie sub value added.
	 * 
	 * @param field
	 *            the field
	 * @param added
	 *            the added
	 */
	public void notifieSubValueAdded(UIField field, Object added);

	/**
	 * Notifie sub value removed.
	 * 
	 * @param field
	 *            the field
	 * @param removed
	 *            the removed
	 */
	public void notifieSubValueRemoved(UIField field, Object removed);

}
