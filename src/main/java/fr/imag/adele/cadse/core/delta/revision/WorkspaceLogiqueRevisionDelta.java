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
package fr.imag.adele.cadse.core.delta.revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.logging.Logger;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.CadseGCST;
import java.util.UUID;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemDescriptionRef;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkDescription;
import fr.imag.adele.cadse.core.LogicalWorkspace;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.internal.ILoggableAction;
import fr.imag.adele.cadse.core.transaction.FacetteLWTransaction;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;
import fr.imag.adele.cadse.core.transaction.delta.ItemDelta;
import fr.imag.adele.cadse.core.transaction.delta.LinkDelta;
import fr.imag.adele.cadse.core.transaction.delta.WLWCOperationImpl;
import fr.imag.adele.cadse.util.IProgressMonitor;

public class WorkspaceLogiqueRevisionDelta {

	private final class LogCUAction implements ILoggableAction {
		private final Logger	logger;

		private LogCUAction(Logger logger) {
			this.logger = logger;
		}

		public <T> void actionAddAttribute(UUID itemId, IAttributeType<T> key, T value) throws CadseException {
			logger.info("add-attribute itemId=" + itemId + " key=" + key + " value=" + value);
		}

		public <T> void actionAddAttribute(LinkDescription linkDescription, IAttributeType<T> key, T value)
				throws CadseException {
			logger.info("add-attribute linkDescription=(" + linkDescription.getSource().getId() + ","
					+ linkDescription.getType() + "," + linkDescription.getDestination().getId() + ")" + " key=" + key
					+ " value=" + value);
		}

		public void actionAddItem(ItemDescriptionRef itemDescriptionRef) throws CadseException {
			logger.info("add-item itemDescriptionRef=(" + itemDescriptionRef.getName() + ","
					+ itemDescriptionRef.getType() + "," + itemDescriptionRef.getQualifiedName() + ")");

		}

		public void actionAddLink(LinkDescription linkDescription) throws CadseException {
			logger.info("add-link  linkDescription=(" + linkDescription.getSource().getId() + ","
					+ linkDescription.getType() + "," + linkDescription.getDestination().getId() + ")");
		}

		public <T> void actionChangeAttribute(UUID itemId, IAttributeType<T> key, T value) throws CadseException {
			logger.info("change-attribute itemId=" + itemId + " key=" + key + " value=" + value);
		}

		public <T> void actionChangeAttribute(LinkDescription linkDescription, IAttributeType<T> key, T value)
				throws CadseException {
			logger.info("change-attribute linkDescription=(" + linkDescription.getSource().getId() + ","
					+ linkDescription.getType() + "," + linkDescription.getDestination().getId() + ") key=" + key
					+ " value=" + value);

		}

		public <T> void actionRemoveAttribute(UUID itemId, IAttributeType<T> key) throws CadseException {
			logger.info("remove-attribute itemId=" + itemId + " key=" + key);

		}

		public <T> void actionRemoveAttribute(LinkDescription linkDescription, IAttributeType<T> key)
				throws CadseException {
			logger.info("remove-attribute  linkDescription=(" + linkDescription.getSource().getId() + ","
					+ linkDescription.getType() + "," + linkDescription.getDestination().getId() + ") key=" + key);
		}

		public void actionRemoveItem(ItemDescriptionRef itemDescriptionRef) throws CadseException {
			logger.info("remove-item itemDescriptionRef=(" + itemDescriptionRef.getName() + ","
					+ itemDescriptionRef.getType() + "," + itemDescriptionRef.getQualifiedName() + ")");

		}

		public void actionRemoveLink(LinkDescription linkDescription) throws CadseException {
			logger.info("remove-link  linkDescription=(" + linkDescription.getSource().getId() + ","
					+ linkDescription.getType() + "," + linkDescription.getDestination().getId() + ")");

		}

		public void actionAddOperation(WLWCOperationImpl operation) {
			// TODO Auto-generated method stub

		}

		public void actionRemoveOperation(WLWCOperationImpl operation) {
			// TODO Auto-generated method stub

		}
	}

	public final static int				BASE_PRESENT			= 0x0001;
	public final static int				BASE_NOT_PRESENT		= 0x0002;
	public final static int				CURRENT_PRESENT			= 0x0004;
	public final static int				CURRENT_NOT_PRESENT		= 0x0008;
	public final static int				HEAD_PRESENT			= 0x0010;
	public final static int				HEAD_NOT_PRESENT		= 0x0020;

	public final static int				LOCAL_CHANGE_ADD		= 0x0100;
	public final static int				LOCAL_CHANGE_REMOVE		= 0x0200;
	public final static int				LOCAL_CHANGE_MODIFIED	= 0x0400;
	public final static int				REMOTE_CHANGE_ADD		= 0x0800;
	public final static int				REMOTE_CHANGE_REMOVE	= 0x1000;
	public final static int				REMOTE_CHANGE_MODIFIED	= 0x2000;

	public final static int				CHANGE_MASQUE			= 0x3F00;

	public final static int				CONFLICT				= 0x8000;

	public final static int				ACCEPT_REMOTE			= 0x10000;
	public final static int				REFUSE_REMOTE			= 0x20000;
	public final static int				ACCEPT_LOCAL			= 0x40000;
	public final static int				REFUSE_LOCAL			= 0x80000;

	public final static int				HAS_LOCAL_CHANGE		= LOCAL_CHANGE_ADD + LOCAL_CHANGE_REMOVE
																		+ LOCAL_CHANGE_MODIFIED;

	public final static int				HAS_REMOTE_CHANGE		= REMOTE_CHANGE_ADD + REMOTE_CHANGE_REMOVE
																		+ REMOTE_CHANGE_MODIFIED;

	public final static int				HAS_CHANGE				= HAS_LOCAL_CHANGE + HAS_REMOTE_CHANGE;

	public static final int				REMOTE_ADD				= BASE_NOT_PRESENT + HEAD_PRESENT;
	public static final int				REMOTE_DELETE			= BASE_PRESENT + HEAD_NOT_PRESENT;

	public static final int				LOCAL_ADD				= BASE_NOT_PRESENT + CURRENT_PRESENT;
	public static final int				LOCAL_DELETE			= BASE_PRESENT + CURRENT_NOT_PRESENT;

	private LogicalWorkspaceTransaction	transaction;
	LogicalWorkspace					workspaceLogique;
	Map<UUID, ItemRevisionDelta>	items;
	Map<String, ItemRevisionDelta>		headUniqueName;

	public WorkspaceLogiqueRevisionDelta(LogicalWorkspace wl) {
		this.workspaceLogique = wl;
		this.items = new HashMap<UUID, ItemRevisionDelta>();
		this.headUniqueName = new HashMap<String, ItemRevisionDelta>();

	}

	public void compute(ITeamRevisionService revisionService, Item root, IProgressMonitor monitor) {
		ItemRevisionDelta delta = mergeItem(revisionService, root, root.getId(), monitor);
		Stack<ItemRevisionDelta> stack = new Stack<ItemRevisionDelta>();
		stack.push(delta);
		while (!stack.isEmpty()) {
			delta = stack.pop();
			for (LinkRevisionDelta lrd : delta.getLinks()) {
				UUID destId = lrd.getDestination().getId();
				ObjectTeamChange destDelta = items.get(destId);
				if (destDelta != null) {
					continue;
				}
				stack.push(mergeItem(revisionService, workspaceLogique.getItem(destId), destId, monitor));

			}
			;
		}
	}

	public ItemRevisionDelta mergeItem(ITeamRevisionService revisionService, Item anItem, UUID id,
			IProgressMonitor monitor) {

		assert id != null;

		ItemDelta base = revisionService.getBase(transaction, id, monitor);
		ItemDelta head = revisionService.getHead(transaction, id, monitor);

		if (anItem != null && !anItem.isResolved()) {
			anItem = null;
		}
		ItemDelta working = null;
		if (anItem != null) {
			working = (ItemDelta) transaction.getItem(anItem);
		}
		ItemRevisionDelta delta = merge(working, base, head);
		items.put(base.getId(), delta);

		return delta;

	}

	public ItemRevisionDelta merge(ItemDelta workingItem, ItemDelta base, ItemDelta head) {
		assert workingItem != null || base != null || head != null;

		UUID id = null;
		UUID type = null;
		if (workingItem != null) {
			id = workingItem.getId();
			type = workingItem.getItemTypeId();
		} else if (base != null) {
			id = base.getId();
			type = base.getItemTypeId();
		} else {
			id = head.getId();
			type = head.getItemTypeId();
		}

		ItemRevisionDelta delta = new ItemRevisionDelta(this, id, type);

		if (workingItem != null) {
			delta.change |= CURRENT_PRESENT;
		} else {
			delta.change |= CURRENT_NOT_PRESENT;
		}

		if (base != null) {
			delta.change |= BASE_PRESENT;
		} else {
			delta.change |= BASE_NOT_PRESENT;
		}

		if (head != null) {
			delta.change |= HEAD_PRESENT;
		} else {
			delta.change |= HEAD_NOT_PRESENT;
		}

		if (delta.isSet(WorkspaceLogiqueRevisionDelta.REMOTE_ADD)) {
			delta.change |= REMOTE_CHANGE_ADD;
		}
		if (delta.isSet(WorkspaceLogiqueRevisionDelta.REMOTE_DELETE)) {
			delta.change |= REMOTE_CHANGE_REMOVE;
		}
		if (delta.isSet(WorkspaceLogiqueRevisionDelta.LOCAL_ADD)) {
			delta.change |= LOCAL_CHANGE_ADD;
		}
		if (delta.isSet(WorkspaceLogiqueRevisionDelta.LOCAL_DELETE)) {
			delta.change |= LOCAL_CHANGE_REMOVE;
		}

		// merge des links

		Map<String, LinkDelta> baseLinks = new HashMap<String, LinkDelta>();
		Map<String, LinkDelta> headLinks = new HashMap<String, LinkDelta>();
		Map<String, LinkDelta> workingLinks = new HashMap<String, LinkDelta>();

		toLinks(baseLinks, base);
		toLinks(headLinks, head);
		toLinks(workingLinks, workingItem);

		// compute all link keys
		HashSet<String> keys = new HashSet<String>();
		keys.addAll(headLinks.keySet());
		keys.addAll(baseLinks.keySet());
		keys.addAll(workingLinks.keySet());

		// // compute merge links
		// for (String k : keys) {
		// LinkDelta baseLD = baseLinks.get(k);
		// LinkDelta headLD = headLinks.get(k);
		// LinkDelta workingLD = workingLinks.get(k);
		//
		// LinkRevisionDelta linkRevisionDelta = new
		// LinkRevisionDelta(workspaceLogique, delta, workingLD, baseLD,
		// headLD);
		// delta.addLinks(linkRevisionDelta);
		// }
		//
		// // merge des attributes;
		//
		// HashSet<String> attributesKey = new HashSet<String>();
		// if (workingItem != null) {
		// attributesKey.addAll(workingItem.getAttributes().keySet());
		// }
		// if (base != null) {
		// attributesKey.addAll(base.getAttributes().keySet());
		// }
		// if (head != null) {
		// attributesKey.addAll(head.getAttributes().keySet());
		// }
		Object currentValue = null;
		Object baseValue = null;
		Object headValue = null;
		// for (String key : attributesKey) {
		// if ("##WS:private:version".equals(key)) {
		// continue;
		// }
		// currentValue = AttributeRevisionDelta.NOT_PRESENT;
		// baseValue = AttributeRevisionDelta.NOT_PRESENT;
		// headValue = AttributeRevisionDelta.NOT_PRESENT;
		// if (workingItem != null) {
		// currentValue = workingItem.getAttributes().get(key);
		// }
		// if (base != null) {
		// baseValue = base.getAttributes().get(key);
		// }
		// if (head != null) {
		// headValue = head.getAttributes().get(key);
		// }
		// delta.addAttribute(new AttributeRevisionDelta(delta, key, baseValue,
		// headValue, currentValue));
		// }

		// merge des attributs specifiques

		// uniquename
		currentValue = AttributeRevisionDelta.NOT_PRESENT;
		baseValue = AttributeRevisionDelta.NOT_PRESENT;
		headValue = AttributeRevisionDelta.NOT_PRESENT;
		if (workingItem != null) {
			currentValue = workingItem.getQualifiedName();
		}
		if (base != null) {
			baseValue = base.getQualifiedName();
		}
		if (head != null) {
			headValue = head.getQualifiedName();
		}
		AttributeRevisionDelta uniqueAttribute = new AttributeRevisionDelta(delta, CadseGCST.ITEM_at_QUALIFIED_NAME_,
				baseValue, headValue, currentValue);
		if (!uniqueAttribute.currentValueEqualsHeadValue()) {
			if (headValue != null && headValue != AttributeRevisionDelta.NOT_PRESENT) {
				this.headUniqueName.put((String) headValue, delta);
			}
		}
		delta.addAttribute(uniqueAttribute);

		// shortname
		currentValue = AttributeRevisionDelta.NOT_PRESENT;
		baseValue = AttributeRevisionDelta.NOT_PRESENT;
		headValue = AttributeRevisionDelta.NOT_PRESENT;
		if (workingItem != null) {
			currentValue = workingItem.getName();
		}
		if (base != null) {
			baseValue = base.getName();
		}
		if (head != null) {
			headValue = head.getName();
		}
		delta.addAttribute(new AttributeRevisionDelta(delta, CadseGCST.ITEM_at_NAME_, baseValue, headValue,
				currentValue));

		// is ReadOnly
		currentValue = AttributeRevisionDelta.NOT_PRESENT;
		baseValue = AttributeRevisionDelta.NOT_PRESENT;
		headValue = AttributeRevisionDelta.NOT_PRESENT;
		if (workingItem != null) {
			currentValue = Boolean.toString(workingItem.isReadOnly());
		}
		if (base != null) {
			baseValue = Boolean.toString(base.isReadOnly());
		}
		if (head != null) {
			headValue = Boolean.toString(head.isReadOnly());
		}
		delta.addAttribute(new AttributeRevisionDelta(delta, CadseGCST.ITEM_at_ITEM_READONLY_, baseValue, headValue,
				currentValue));

		// is Valid
		currentValue = AttributeRevisionDelta.NOT_PRESENT;
		baseValue = AttributeRevisionDelta.NOT_PRESENT;
		headValue = AttributeRevisionDelta.NOT_PRESENT;
		if (workingItem != null) {
			currentValue = Boolean.toString(workingItem.isValid());
		}
		if (base != null) {
			baseValue = Boolean.toString(base.isValid());
		}
		if (head != null) {
			headValue = Boolean.toString(head.isValid());
		}
		delta.addAttribute(new AttributeRevisionDelta(delta, CadseGCST.ITEM_at_ISVALID_, baseValue, headValue,
				currentValue));

		return delta;
	}

	private void toLinks(Map<String, LinkDelta> baseLinks, ItemDelta base) {
		if (base == null) {
			return;
		}
		for (LinkDelta ld : base.getOutgoingLinkOperations()) {
			if (ld.isDerived()) {
				continue;
			}
			baseLinks.put(ld.getSource().getId().toString() + ld.getLinkTypeName()
					+ ld.getDestination().getId().toString(), ld);
		}
	}

	public LogicalWorkspace getLogicalWorkspace() {
		return workspaceLogique;
	}

	public Map<UUID, ItemRevisionDelta> getItems() {
		return items;
	}

	public void update(ITeamRevisionService ser, IProgressMonitor monitor) throws CadseException {
		update(new ArrayList<ItemRevisionDelta>(items.values()), ser, monitor);
	}

	public void update(List<ItemRevisionDelta> items, ITeamRevisionService ser, IProgressMonitor monitor)
			throws CadseException {
		//
		ser.disablePersistence();
		try {
			HashSet<ItemRevisionDelta> toReMerge = new HashSet<ItemRevisionDelta>();

			// List<ItemRevisionDelta> remoteChangeItems = new
			// ArrayList<ItemRevisionDelta>();
			List<ItemRevisionDelta> remoteAddRefusedChangeItems = new ArrayList<ItemRevisionDelta>();
			for (ItemRevisionDelta ird : items) {
				if (ird.hasRefuseRemoteChange() && ird.isRemoteAdded()) {
					remoteAddRefusedChangeItems.add(ird);
				} // else if (ird.hasHeriachicalRemoteChange(false, false)) {
				// remoteChangeItems.add(ird);
				// }
			}
			LogicalWorkspaceTransaction copy = commitAcceptHeadChanges(ser, items, toReMerge);

			revertLocalChanges(copy, ser, new ArrayList<ItemRevisionDelta>(items), toReMerge);

			ser.teamRevert(items, monitor);
			ser.teamUpdate(items, monitor);
			// remoteChangeItems.removeAll(remoteAddRefusedChangeItems);
			copy.load();
			ser.enablePersistance();
			ser.save(toReMerge);
			ser.teamDelete(remoteAddRefusedChangeItems, monitor);

			for (ItemRevisionDelta delta : remoteAddRefusedChangeItems) {
				System.out.println("re-merge delete for " + delta.getDisplayName() + " - " + delta.getId());
				this.items.remove(delta.getId());
			}

			for (ItemRevisionDelta delta : toReMerge) {
				if (delta.isRemoteDeleted()) {
					System.out.println("re-merge delete for " + delta.getDisplayName() + " - " + delta.getId());
					this.items.remove(delta.getId());
				} else {
					System.out.println("re-merge for " + delta.getDisplayName() + " - " + delta.getId());
					ItemDelta base = ser.getBase(transaction, delta.getId(), monitor);
					Item item = workspaceLogique.getItem(delta.getId());
					ItemDelta workingItem = null;
					if (item != null) {
						workingItem = (ItemDelta) transaction.getItem(item);
					} else {
						System.out.println("Error: not found item in workspace " + delta.getId());
					}
					merge(workingItem, base, base);
				}
			}
		} finally {
			ser.enablePersistance();
		}

	}

	private LogicalWorkspaceTransaction commitAcceptHeadChanges(ITeamRevisionService ser,
			List<ItemRevisionDelta> remoteChangeItems, HashSet<ItemRevisionDelta> toReMerge) throws CadseException,
			CadseException {
		final Logger logger = Logger.getLogger("CU.Workspace.revisiondelta");

		LogicalWorkspaceTransaction copy = workspaceLogique.createTransaction();
		copy.setLog(new LogCUAction(logger));
		for (ItemRevisionDelta itemRevisionDelta : remoteChangeItems) {
			logger.info("prepare commit for " + itemRevisionDelta.getDisplayName() + " - " + itemRevisionDelta.getId());
			if (itemRevisionDelta.commitAcceptHeadChanges(ser, copy)) {
				toReMerge.add(itemRevisionDelta);
			}
		}
		return copy;
	}

	private void revertLocalChanges(LogicalWorkspaceTransaction copy, ITeamRevisionService ser,
			List<ItemRevisionDelta> remoteChangeItems, Set<ItemRevisionDelta> toReMerge) throws CadseException,
			CadseException {

		final Logger logger = Logger.getLogger("CU.Workspace.revisiondelta");

		for (ItemRevisionDelta itemRevisionDelta : remoteChangeItems) {
			logger.info("prepare revert for " + itemRevisionDelta.getDisplayName() + " - " + itemRevisionDelta.getId());
			if (itemRevisionDelta.revertLocalChanges(ser, copy)) {
				toReMerge.add(itemRevisionDelta);
			}
		}
	}

	public ItemType getType(UUID type) {
		return this.workspaceLogique.getItemType(type);
	}

	public void setTransaction(LogicalWorkspaceTransaction transaction) {
		this.transaction = transaction;
	}

	public LogicalWorkspaceTransaction getTransaction() {
		return transaction;
	}

}
