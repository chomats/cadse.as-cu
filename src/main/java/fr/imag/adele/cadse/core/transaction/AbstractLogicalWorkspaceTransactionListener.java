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
package fr.imag.adele.cadse.core.transaction;

import java.util.List;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.ContentChangeInfo;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.transaction.delta.ItemDelta;
import fr.imag.adele.cadse.core.transaction.delta.LinkDelta;
import fr.imag.adele.cadse.core.transaction.delta.MappingOperation;
import fr.imag.adele.cadse.core.transaction.delta.OrderOperation;
import fr.imag.adele.cadse.core.transaction.delta.SetAttributeOperation;

/**
 * The default implementation for
 */
public class AbstractLogicalWorkspaceTransactionListener implements LogicalWorkspaceTransactionListener {

	// TODO move in fede.workspace.domain.delta
	public void notifyCancelCreatedItem(LogicalWorkspaceTransaction wc, ItemDelta item) throws CadseException {
	}

	public void notifyCancelCreatedLink(LogicalWorkspaceTransaction wc, LinkDelta link) throws CadseException {
	}

	public void notifyChangeAttribute(LogicalWorkspaceTransaction wc, ItemDelta item, SetAttributeOperation attOperation)
			throws CadseException {
	}

	public void notifyChangeAttribute(LogicalWorkspaceTransaction wc, LinkDelta link, SetAttributeOperation attOperation)
			throws CadseException {
	}

	public void notifyChangeLinkOrder(LogicalWorkspaceTransaction wc, LinkDelta link, OrderOperation orderOperation)
			throws CadseException {
	}

	public void notifyCreatedItem(LogicalWorkspaceTransaction wc, ItemDelta item) throws CadseException {
	}

	public void notifyCreatedLink(LogicalWorkspaceTransaction wc, LinkDelta link) throws CadseException {
	}

	public void notifyDeletedItem(LogicalWorkspaceTransaction wc, ItemDelta item) throws CadseException {
	}

	public void notifyDeletedLink(LogicalWorkspaceTransaction wc, LinkDelta link) throws CadseException {
	}

	public void notifyLoadedItem(LogicalWorkspaceTransaction workspaceLogiqueWorkingCopy, List<ItemDelta> loadedItems) {
	}

	public void validateCancelCreatedItem(LogicalWorkspaceTransaction wc, ItemDelta item) throws CadseException {
		// do nothing
	}

	public void validateCancelCreatedLink(LogicalWorkspaceTransaction wc, LinkDelta link) throws CadseException {
		// do nothing
	}

	public void validateChangeAttribute(LogicalWorkspaceTransaction wc, ItemDelta item,
			SetAttributeOperation attOperation) throws CadseException {
		// do nothing
	}

	public void validateChangeAttribute(LogicalWorkspaceTransaction wc, LinkDelta link,
			SetAttributeOperation attOperation) throws CadseException {
		// do nothing
	}

	public void validateChangeLinkOrder(LogicalWorkspaceTransaction wc, LinkDelta link, OrderOperation orderOperation)
			throws CadseException {
		// do nothing
	}

	public void validateCreatedLink(LogicalWorkspaceTransaction wc, LinkDelta link) throws CadseException {
		// do nothing
	}

	public void validateDeletedItem(LogicalWorkspaceTransaction wc, ItemDelta item) throws CadseException {
		// do nothing
	}

	public void validateDeletedLink(LogicalWorkspaceTransaction wc, LinkDelta link) throws CadseException {
		// do nothing
	}

	public void validateCreatedItem(LogicalWorkspaceTransaction wc, ItemDelta item) throws CadseException {
		// do nothing
	}

	public void notifyDoubleClick(LogicalWorkspaceTransaction wc, ItemDelta item) {
		// do nothing
	}

	public void notifyAddMappingOperation(LogicalWorkspaceTransaction workspaceLogiqueWorkingCopy, ItemDelta item,
			MappingOperation mappingOperation) {
		// do nothing
	}

	public void notifyChangedContent(LogicalWorkspaceTransaction workspaceLogiqueWorkingCopy, ItemDelta item,
			ContentChangeInfo[] change) {
		// do nothing

	}

	public void notifyAbortTransaction(LogicalWorkspaceTransaction wc) throws CadseException {
	}

	public void notifyBeginTransaction(LogicalWorkspaceTransaction wc) throws CadseException {
	}

	public void notifyCommitTransaction(LogicalWorkspaceTransaction wc) throws CadseException {
	}

	public void notifyMigratePartLink(LogicalWorkspaceTransaction wc, ItemDelta childItem, ItemDelta newPartParent,
			LinkType lt, LinkDelta newPartLink, LinkDelta oldPartLink) throws CadseException {

	}
}
