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

import java.util.List;


import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.WorkspaceListener;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.attribute.ListAttributeType;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransactionListener;

/**
 * The Interface IPageController.
 */
public interface UIPlatform {

	/**
	 * Constant for a regular message (value 0).
	 * <p>
	 * Typically this indicates that the message should be shown without an
	 * icon.
	 * </p>
	 */
	public final static int NONE = 0;

	/** Constant for an info message (value 1). */
	public final static int INFORMATION = 1;

	/** Constant for a warning message (value 2). */
	public final static int WARNING = 2;

	/** Constant for an error message (value 3). */
	public final static int ERROR = 3;

	public void addListener(Item item,
			WorkspaceListener itemLinkTypeWorkspaceListener, int i);

	public void addLogicalWorkspaceTransactionListener(
			LogicalWorkspaceTransactionListener logicalWorkspaceTransactionListener);

	/**
	 * Broadcast sub value added.
	 * 
	 * @param field
	 *            the field
	 * @param added
	 *            the added
	 * @return true if error
	 */
	public boolean broadcastSubValueAdded(IPage page, UIField field,
			Object added);

	/**
	 * Broadcast sub value removed.
	 * 
	 * @param field
	 *            the field
	 * @param removed
	 *            the removed
	 * @return true if error
	 */
	public boolean broadcastSubValueRemoved(IPage page, UIField field,
			Object removed);

	/**
	 * Broadcast this field has changed.
	 * 
	 * @param fd
	 *            the fd
	 */
	public void broadcastThisFieldHasChanged(UIField fd);

	/**
	 * Broadcast value changed.
	 * 
	 * @param field
	 *            the field
	 * @param value
	 *            the value
	 * @return true if error
	 */
	public boolean broadcastValueChanged(IPage page, UIField field, Object value);

	/**
	 * Broadcast value deleted.
	 * 
	 * @param field
	 *            the field
	 * @param oldvalue
	 *            the oldvalue
	 * @return true if error
	 */
	public boolean broadcastValueDeleted(IPage page, UIField field,
			Object oldvalue);

	public void doCancel(Object monitor);

	/**
	 * Do finish.
	 * 
	 * @param monitor
	 *            the monitor
	 * 
	 * @throws Exception
	 *             the exception
	 */
	abstract boolean doFinish(Object monitor) throws Exception;

	/**
	 * Do next page action.
	 * 
	 * @param monitor
	 *            the monitor
	 * @param pages
	 *            the pages
	 * @param currentPage
	 *            the current page
	 * 
	 * @throws Exception
	 *             the exception
	 */
	abstract void doNextPageAction(Object monitor, int currentPage) throws Exception;

	/**
	 * Do prev page action.
	 * 
	 * @param monitor
	 *            the monitor
	 * @param pages
	 *            the pages
	 * @param currentPage
	 *            the current page
	 * 
	 * @throws Exception
	 *             the exception
	 */
	abstract void doPrevPageAction(Object monitor, int currentPage) throws Exception;

	


	public LogicalWorkspaceTransaction getCopy();

	public Item getItem(UIField fromField);

	public Item getItem();


	/**
	 * Gets the next page index.
	 * 
	 * @param pages
	 *            the pages
	 * @param currentPage
	 *            the current page
	 * 
	 * @return the next page index
	 * 
	 * @throws Exception
	 *             the exception
	 */
	abstract int getNextPageIndex(int currentPage) throws Exception;

	public Pages getPages();

	/**
	 * Gets the prev page index.
	 * 
	 * @param pages
	 *            the pages
	 * @param currentPage
	 *            the current page
	 * 
	 * @return the prev page index
	 * 
	 * @throws Exception
	 *             the exception
	 */
	abstract int getPrevPageIndex(int currentPage) throws Exception;

	public Object getValueForVisual(UIField field);

	public Object getModelValue(UIField uiField);
	public Object getVisualValue(UIField uiField);

	public boolean isDisposed();

	public boolean isModification();

	public void log(String msg, Throwable e);

	public void resetVisualValue(UIField uiField);

	public void sendChangedValue(UIField field, Object visualValue);



	public void setEnabled(UIField uiField, boolean b);
	
	public void setEnabled(IAttributeType<?> att, boolean b);
	
	public void setEditable(UIField uiField, boolean b);
	
	public void setEditable(IAttributeType<?> att, boolean b);

	/**
	 * Sets the message for this page with an indication of what type of message
	 * it is.
	 * <p>
	 * The valid message types are one of <code>NONE</code>,
	 * <code>INFORMATION</code>,<code>WARNING</code>, or <code>ERROR</code>.
	 * </p>
	 * 
	 * @param newMessage
	 *            the message, or <code>null</code> to clear the message
	 * @param newType
	 *            the message type
	 * 
	 */
	public void setMessage(String newMessage, int newType);
	
	public void setMessageError(String string);



	public void setTextLabel(UIField uiField, String format);

	public void setVariable(String varName, Object value);

	public void setVisible(UIField uiField, boolean b);

	public void setVisualField(IAttributeType<?> attr, Object visualValue);



	public void setVisualValue(IAttributeType<?> attributeDefinition,
			Object currentValue, boolean b);

	

	/**
	 * Validate fields.
	 * 
	 * @param currentField
	 *            the current field
	 * @param currentPage
	 *            the current page
	 * 
	 * @return true if error
	 */
	abstract boolean validateFields(UIField currentField, IPage currentPage);

	public boolean validateValueChanged(UIField field, Object visualValue);

	

	public UIField getField(IAttributeType<?> att);

	
}
