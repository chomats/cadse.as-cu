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
 * The Interface IPageController.
 */
public interface IPageController {

	/**
	 * Constant for a regular message (value 0).
	 * <p>
	 * Typically this indicates that the message should be shown without an
	 * icon.
	 * </p>
	 */
	public final static int	NONE		= 0;

	/** Constant for an info message (value 1). */
	public final static int	INFORMATION	= 1;

	/** Constant for a warning message (value 2). */
	public final static int	WARNING		= 2;

	/** Constant for an error message (value 3). */
	public final static int	ERROR		= 3;

	/**
	 * Returns the current message for this message provider.
	 * <p>
	 * A message provides instruction or information to the user.
	 * </p>
	 * 
	 * @return the message, or <code>null</code> if none
	 */
	public String getMessage();

	/**
	 * Returns a value indicating if the message is a an information message, a
	 * warning message, or an error message.
	 * <p>
	 * Returns one of <code>NONE</code>,<code>INFORMATION</code>,
	 * <code>WARNING</code>, or <code>ERROR</code>.
	 * </p>
	 * 
	 * @return the message type
	 */
	public int getMessageType();

	/**
	 * Sets the message for this page with an indication of what type of message
	 * it is.
	 * <p>
	 * The valid message types are one of <code>NONE</code>,
	 * <code>INFORMATION</code>,<code>WARNING</code>, or
	 * <code>ERROR</code>.
	 * </p>
	 * 
	 * @param newMessage
	 *            the message, or <code>null</code> to clear the message
	 * @param newType
	 *            the message type
	 * 
	 */
	public void setMessage(String newMessage, int newType);

	/**
	 * Broadcast this field has changed.
	 * 
	 * @param fd
	 *            the fd
	 */
	public void broadcastThisFieldHasChanged(UIField fd);

	/**
	 * Broadcast value deleted.
	 * 
	 * @param field
	 *            the field
	 * @param oldvalue
	 *            the oldvalue
	 * @return true if error
	 */
	public boolean broadcastValueDeleted(UIField field, Object oldvalue);

	/**
	 * Broadcast value changed.
	 * 
	 * @param field
	 *            the field
	 * @param value
	 *            the value
	 * @return true if error
	 */
	public boolean broadcastValueChanged(UIField field, Object value);

	/**
	 * Broadcast sub value added.
	 * 
	 * @param field
	 *            the field
	 * @param added
	 *            the added
	 * @return true if error
	 */
	public boolean broadcastSubValueAdded(UIField field, Object added);

	/**
	 * Broadcast sub value removed.
	 * 
	 * @param field
	 *            the field
	 * @param removed
	 *            the removed
	 * @return true if error
	 */
	public boolean broadcastSubValueRemoved(UIField field, Object removed);
}
