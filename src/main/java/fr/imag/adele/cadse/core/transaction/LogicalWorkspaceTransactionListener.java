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
package fr.imag.adele.cadse.core.transaction;

import java.util.List;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.ContentChangeInfo;
import fr.imag.adele.cadse.core.IItemManager;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.transaction.delta.ItemDelta;
import fr.imag.adele.cadse.core.transaction.delta.LinkDelta;
import fr.imag.adele.cadse.core.transaction.delta.MappingOperation;
import fr.imag.adele.cadse.core.transaction.delta.OrderOperation;
import fr.imag.adele.cadse.core.transaction.delta.SetAttributeOperation;

/**
 * This class should be extended to implement a listener which can modify the
 * logical workspace. Use it when you want to be notified of logical workspace
 * state change synchronously or you want to manage transaction process. These
 * listeners can abort current transaction. The time when this kind of listener
 * is called is not specified.
 * 
 * It is most of time used to update views managed by another technology than
 * CADSE view one.
 * 
 * Please, use init() method in an item manager to add a listener.
 * 
 * @see IItemManager#init()
 * 
 * @author chomats
 * 
 */
public interface LogicalWorkspaceTransactionListener {

	static public int notifyAbortTransaction = 1;
	static public int notifyAddMappingOperation = 2;
	static public int notifyBeginTransaction = 3;
	static public int notifyCancelCreatedItem = 1;
	static public int notifyCancelCreatedLink = 1;
	static public int notifyChangeAttribute = 1;
	static public int notifyCreatedItem = 1;
	static public int notifyChangedContent = 1;
	static public int notifyChangeLinkOrder = 1;
	
	/*
	 * Global transaction management methods.
	 */

	/**
	 * This method is called when a new transaction is started (a logical
	 * workspace copy has just been created).
	 * 
	 * @param wc
	 *            the workspace copy representing begined transaction
	 */
	public void notifyBeginTransaction(LogicalWorkspaceTransaction wc) throws CadseException;

	/**
	 * This method is called when a transaction is committed.
	 * 
	 * @param wc
	 *            the workspace copy representing committed transaction
	 */
	public void notifyCommitTransaction(LogicalWorkspaceTransaction wc) throws CadseException;

	/**
	 * This method is called when a transaction is aborted.
	 * 
	 * @param wc
	 *            the workspace copy representing aborted transaction
	 */
	public void notifyAbortTransaction(LogicalWorkspaceTransaction wc) throws CadseException;

	/*
	 * Transaction management methods for each logical workspace operation.
	 */

	/**
	 * This method is called before a create item operation. If a CadseException
	 * is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param itemOp
	 *            operation which will be performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void validateCreatedItem(LogicalWorkspaceTransaction wc, ItemDelta itemOp) throws CadseException;

	/**
	 * This method is called before a delete item operation. If a CadseException
	 * is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param itemOp
	 *            operation which will be performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void validateDeletedItem(LogicalWorkspaceTransaction wc, ItemDelta itemOp) throws CadseException;

	/**
	 * This method is called before a delete item operation considered as a
	 * creation cancel one. A delete item operation is considered as a cancel
	 * create item one if creation of this item has been performed during this
	 * transaction. If a CadseException is thrown then the transaction is
	 * aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param itemOp
	 *            operation which will be performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void validateCancelCreatedItem(LogicalWorkspaceTransaction wc, ItemDelta itemOp) throws CadseException;

	/**
	 * This method is called before an item attribute value set operation. Be
	 * careful, new attribute value may be equal to old value. If a
	 * CadseException is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param item
	 *            item on which the operation will be performed
	 * @param attOp
	 *            operation which will be performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void validateChangeAttribute(LogicalWorkspaceTransaction wc, ItemDelta item, SetAttributeOperation attOp)
			throws CadseException;

	/**
	 * This method is called before a create link operation. If a CadseException
	 * is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param linkOp
	 *            operation which will be performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void validateCreatedLink(LogicalWorkspaceTransaction wc, LinkDelta linkOp) throws CadseException;

	/**
	 * This method is called before a delete link operation. If a CadseException
	 * is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param linkOp
	 *            operation which will be performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void validateDeletedLink(LogicalWorkspaceTransaction wc, LinkDelta linkOp) throws CadseException;

	/**
	 * This method is called before a delete link operation as a creation cancel
	 * one. A delete link operation is considered as a cancel create link one if
	 * creation of this link has been performed during this transaction. If a
	 * CadseException is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param linkOp
	 *            operation which will be performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void validateCancelCreatedLink(LogicalWorkspaceTransaction wc, LinkDelta linkOp) throws CadseException;

	/**
	 * This method is called before a link attribute value set operation.
	 * Currently, link attributes (today, only version) cannot be added. Be
	 * careful, new attribute value may be equal to old value. If a
	 * CadseException is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param link
	 *            link on which the operation will be performed
	 * @param attOp
	 *            operation which will be performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void validateChangeAttribute(LogicalWorkspaceTransaction wc, LinkDelta link, SetAttributeOperation attOp)
			throws CadseException;

	/**
	 * This method is called before a change link order operation. If a
	 * CadseException is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param link
	 *            link which will be moved
	 * @param orderOp
	 *            operation which will be performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void validateChangeLinkOrder(LogicalWorkspaceTransaction wc, LinkDelta link, OrderOperation orderOp)
			throws CadseException;

	/*
	 * Callback methods for each operation on logical workspace.
	 */

	/**
	 * This method is called after a create item operation. If a CadseException
	 * is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param itemOp
	 *            operation which has been performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void notifyCreatedItem(LogicalWorkspaceTransaction wc, ItemDelta itemOp) throws CadseException;

	/**
	 * This method is called after a delete item operation. If a CadseException
	 * is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param itemOp
	 *            operation which has been performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void notifyDeletedItem(LogicalWorkspaceTransaction wc, ItemDelta itemOp) throws CadseException;

	/**
	 * This method is called after a delete item operation considered as a
	 * creation cancel one. A delete item operation is considered as a cancel
	 * create item one if creation of this item has been performed during this
	 * transaction. If a CadseException is thrown then the transaction is
	 * aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param itemOp
	 *            operation which has been performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void notifyCancelCreatedItem(LogicalWorkspaceTransaction wc, ItemDelta itemOp) throws CadseException;

	/**
	 * This method is called after an item attribute value set operation. Be
	 * careful, new attribute value may be equal to old value. If a
	 * CadseException is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param item
	 *            item on which the operation has been performed
	 * @param attOp
	 *            operation which has been performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void notifyChangeAttribute(LogicalWorkspaceTransaction wc, ItemDelta item, SetAttributeOperation attOp)
			throws CadseException;

	/**
	 * This method is called after a create link operation. If a CadseException
	 * is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param linkOp
	 *            operation which has been performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void notifyCreatedLink(LogicalWorkspaceTransaction wc, LinkDelta linkOp) throws CadseException;

	/**
	 * This method is called after a delete link operation. If a CadseException
	 * is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param linkOp
	 *            operation which has been performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void notifyDeletedLink(LogicalWorkspaceTransaction wc, LinkDelta linkOp) throws CadseException;

	/**
	 * This method is called after a delete link operation as a creation cancel
	 * one. A delete link operation is considered as a cancel create link one if
	 * creation of this link has been performed during this transaction. If a
	 * CadseException is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param linkOp
	 *            operation which has been performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void notifyCancelCreatedLink(LogicalWorkspaceTransaction wc, LinkDelta linkOp) throws CadseException;

	/**
	 * This method is called after a link attribute value set operation.
	 * Currently, link attributes (today, only version) cannot be added. Be
	 * careful, new attribute value may be equal to old value. If a
	 * CadseException is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param link
	 *            link on which the operation has been performed
	 * @param attOp
	 *            operation which has been performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void notifyChangeAttribute(LogicalWorkspaceTransaction wc, LinkDelta link, SetAttributeOperation attOp)
			throws CadseException;

	/**
	 * This method is called after a change link order operation. If a
	 * CadseException is thrown then the transaction is aborted.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param link
	 *            link which has been moved
	 * @param orderOp
	 *            operation which has been performed
	 * @throws CadseException
	 *             if transaction must be aborted
	 */
	public void notifyChangeLinkOrder(LogicalWorkspaceTransaction wc, LinkDelta link, OrderOperation orderOp)
			throws CadseException;

	/**
	 * This method is called after a load items operation. Be careful, this
	 * callback can be called multiple times for same loaded items. In specific
	 * cases, this callback is only called at the end of the transaction.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param loadedItemsOps
	 *            list of operations which has been performed
	 */
	public void notifyLoadedItem(LogicalWorkspaceTransaction wc, List<ItemDelta> loadedItemsOps);

	/**
	 * This method is called after a double click on an item.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param itemOp
	 *            operation which has been performed
	 */
	public void notifyDoubleClick(LogicalWorkspaceTransaction wc, ItemDelta itemOp);

	/**
	 * This method is called after an add mapping operation operation. A mapping
	 * operation is an operation that is performed when the transaction is asked
	 * to be committed.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param item
	 *            item related to the mapping operation
	 * @param mappingOp
	 *            operation which has been added
	 */
	public void notifyAddMappingOperation(LogicalWorkspaceTransaction wc, ItemDelta item, MappingOperation mappingOp);

	/**
	 * This method is called when one or many resources (file or directory or
	 * project...) are changed.
	 * 
	 * @param wc
	 *            logical workspace used by this transaction
	 * @param item
	 *            item related to changed resources
	 * @param changeOps
	 *            list of operations which have been performed on resources
	 */
	public void notifyChangedContent(LogicalWorkspaceTransaction wc, ItemDelta item, ContentChangeInfo[] changeOps);

	public void notifyMigratePartLink(LogicalWorkspaceTransaction wc, ItemDelta childItem, ItemDelta newPartParent,
			LinkType lt, LinkDelta newPartLink, LinkDelta oldPartLink) throws CadseException;
}
