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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkDescription;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.LogicalWorkspace;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;
import fr.imag.adele.cadse.core.transaction.delta.ItemDelta;
import fr.imag.adele.cadse.core.transaction.delta.LinkDelta;

public class LinkRevisionDelta extends ObjectTeamChange implements ITeamChangeObject {
	final private ItemRevisionDelta								parent;

	/** The type. */
	private String												type;

	private LinkType											typeObject;

	/** The destination. */
	private ItemDelta											destination;

	/** The state. */
	private int													state;

	/** The attributes. */
	private Map<IAttributeType<?>, AttributeRevisionDelta<?>>	attributes;

	// int change;

	public LinkRevisionDelta(LogicalWorkspace wl, ItemRevisionDelta parent, LinkDelta workingValue,
			LinkDelta baseValue, LinkDelta headValue) {
		assert baseValue != null || headValue != null || workingValue != null;

		this.parent = parent;
		LinkDelta ref = baseValue;
		if (ref == null) {
			ref = headValue;
		}
		if (ref == null) {
			ref = workingValue;
		}

		destination = ref.getDestination();
		type = ref.getLinkTypeName();

		if (wl != null) {
			ItemType it = wl.getItemType(ref.getSource().getItemTypeId());
			if (it != null) {
				typeObject = it.getOutgoingLinkType(type);
				if (typeObject != null) {
					state = (typeObject.isAggregation() ? LinkDescription.AGGREGATION : 0)
							+ (typeObject.isComposition() ? LinkDescription.ANNOTATION : 0)
							+ (typeObject.isAnnotation() ? LinkDescription.COMPOSITION : 0)
							+ (typeObject.isPart() ? LinkDescription.PART : 0)
							+ (typeObject.isRequire() ? LinkDescription.REQUIRE : 0)
							+ (typeObject.isDerived() ? LinkDescription.DERIBED : 0);

				}
			}
		}

		change = 0;
		if (baseValue == null) {
			change |= WorkspaceLogiqueRevisionDelta.BASE_NOT_PRESENT;
		} else {
			change += WorkspaceLogiqueRevisionDelta.BASE_PRESENT;
		}

		if (workingValue == null) {
			change |= WorkspaceLogiqueRevisionDelta.CURRENT_NOT_PRESENT;
		} else {
			change += WorkspaceLogiqueRevisionDelta.CURRENT_PRESENT;
		}

		if (headValue == null) {
			change |= WorkspaceLogiqueRevisionDelta.HEAD_NOT_PRESENT;
		} else {
			change += WorkspaceLogiqueRevisionDelta.HEAD_PRESENT;
		}

		if (isSet(WorkspaceLogiqueRevisionDelta.BASE_NOT_PRESENT | WorkspaceLogiqueRevisionDelta.CURRENT_PRESENT)) {
			change |= WorkspaceLogiqueRevisionDelta.LOCAL_CHANGE_ADD;
		}

		if (isSet(WorkspaceLogiqueRevisionDelta.BASE_PRESENT | WorkspaceLogiqueRevisionDelta.CURRENT_NOT_PRESENT)) {
			change |= WorkspaceLogiqueRevisionDelta.LOCAL_CHANGE_REMOVE;
		}

		if (isSet(WorkspaceLogiqueRevisionDelta.BASE_NOT_PRESENT | WorkspaceLogiqueRevisionDelta.HEAD_PRESENT)) {
			change |= WorkspaceLogiqueRevisionDelta.REMOTE_CHANGE_ADD;
		}

		if (isSet(WorkspaceLogiqueRevisionDelta.BASE_PRESENT | WorkspaceLogiqueRevisionDelta.HEAD_NOT_PRESENT)) {
			change |= WorkspaceLogiqueRevisionDelta.REMOTE_CHANGE_REMOVE;
		}
	}

	public LinkRevisionDelta(ItemRevisionDelta parent, Link l) {
		this.parent = parent;
		type = l.getLinkType().getName();
		typeObject = l.getLinkType();
		change = WorkspaceLogiqueRevisionDelta.BASE_NOT_PRESENT + WorkspaceLogiqueRevisionDelta.HEAD_NOT_PRESENT
				+ WorkspaceLogiqueRevisionDelta.CURRENT_PRESENT + WorkspaceLogiqueRevisionDelta.LOCAL_CHANGE_ADD;
		destination = null;// new ItemDescriptionRef(l.getDestination());
		state = (l.isAggregation() ? LinkDescription.AGGREGATION : 0)
				+ (l.isComposition() ? LinkDescription.ANNOTATION : 0)
				+ (l.isAnnotation() ? LinkDescription.COMPOSITION : 0)
				+ (l.getLinkType().isPart() ? LinkDescription.PART : 0) + (l.isRequire() ? LinkDescription.REQUIRE : 0)
				+ (l.isDerived() ? LinkDescription.DERIBED : 0) + (l.isHidden() ? LinkDescription.HIDDEN : 0)
				+ (l.isReadOnly() ? LinkDescription.READ_ONLY : 0);

	}

	public ItemDelta getDestination() {
		return destination;
	}

	public String getType() {
		return type;
	}

	/**
	 * Checks if is aggregation.
	 * 
	 * @return true, if is aggregation
	 */
	public boolean isAggregation() {
		return (state & LinkDescription.AGGREGATION) == LinkDescription.AGGREGATION;
	}

	/**
	 * Checks if is annotation.
	 * 
	 * @return true, if is annotation
	 */
	public boolean isAnnotation() {
		return (state & LinkDescription.ANNOTATION) == LinkDescription.ANNOTATION;
	}

	/**
	 * Checks if is composition.
	 * 
	 * @return true, if is composition
	 */
	public boolean isComposition() {
		return (state & LinkDescription.COMPOSITION) == LinkDescription.COMPOSITION;
	}

	/**
	 * Checks if is derived.
	 * 
	 * @return true, if is derived
	 */
	public boolean isDerived() {
		return (state & LinkDescription.DERIBED) == LinkDescription.DERIBED;
	}

	/**
	 * Checks if is hidden.
	 * 
	 * @return true, if is hidden
	 */
	public boolean isHidden() {
		return (state & LinkDescription.HIDDEN) == LinkDescription.HIDDEN;
	}

	/**
	 * Checks if is modified.
	 * 
	 * @return true, if is modified
	 */
	public boolean isModified() {
		return (state & LinkDescription.MODIFIED) == LinkDescription.MODIFIED;
	}

	/**
	 * Checks if is other.
	 * 
	 * @return true, if is other
	 */
	public boolean isOther() {
		return (state & LinkDescription.OTHER) == LinkDescription.OTHER;
	}

	/**
	 * Checks if is part.
	 * 
	 * @return true, if is part
	 */
	public boolean isPart() {
		return (state & LinkDescription.PART) == LinkDescription.PART;
	}

	/**
	 * Checks if is read only.
	 * 
	 * @return true, if is read only
	 */
	public boolean isReadOnly() {
		return (state & LinkDescription.READ_ONLY) == LinkDescription.READ_ONLY;
	}

	/**
	 * Checks if is require.
	 * 
	 * @return true, if is require
	 */
	public boolean isRequire() {
		return (state & LinkDescription.REQUIRE) == LinkDescription.REQUIRE;
	}

	/**
	 * Adds the attribute.
	 * 
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	public void addAttribute(AttributeRevisionDelta<?> value) {
		if (attributes == null) {
			attributes = new HashMap<IAttributeType<?>, AttributeRevisionDelta<?>>();
		}
		attributes.put(value.getKey(), value);
	}

	/**
	 * Gets the attributes.
	 * 
	 * @return the attributes
	 */
	public Map<IAttributeType<?>, AttributeRevisionDelta<?>> getAttributes() {
		if (attributes == null) {
			return Collections.emptyMap();
		}
		return Collections.unmodifiableMap(attributes);
	}

	public boolean hasAttributeRemoteChange() {
		if (attributes == null) {
			return false;
		}
		for (ITeamChangeObject ard : attributes.values()) {
			if (ard.hasRemoteChange()) {
				return true;
			}
		}
		return false;
	}

	public boolean hasAttributeLocalChange() {
		if (attributes == null) {
			return false;
		}
		for (ITeamChangeObject ard : attributes.values()) {
			if (ard.hasLocalChange()) {
				return true;
			}
		}
		return false;
	}

	public boolean commitAcceptHeadChanges(ITeamRevisionService ser, LogicalWorkspaceTransaction copy)
			throws CadseException {
		if (!hasRealRemoteChange()) {
			return false;
		}

		boolean dirty = false;
		if (isRemoteAdded()) {
			if (!hasAcceptRemoteChange()) {
				return false;
			}
			copy.actionAddLink(toDesc());
			dirty = true;
		} else if (isRemoteDeleted()) {
			if (!hasAcceptRemoteChange()) {
				return false;
			}
			copy.actionRemoveLink(toDesc());
			return true;
		}
		if (isLocalAdded() || isLocalDeleted()) {
			if (hasRefuseLocalChange()) {
				return true;
			}
		}

		if (attributes == null) {
			return dirty;
		}

		for (AttributeRevisionDelta delta : attributes.values()) {
			if (delta.commitAcceptHeadChanges(ser, copy)) {
				dirty = true;
			}
			;
		}
		return dirty;
	}

	public boolean revertLocalChanges(ITeamRevisionService ser, LogicalWorkspaceTransaction copy) throws CadseException {
		if (!hasRealLocalChange()) {
			return false;
		}

		LinkDescription linkDesc = toDesc();

		if (!hasRefuseLocalChange()) {
			return false;
		}
		if (hasRemoteChange() && hasAcceptRemoteChange()) {
			return false;
		}

		if (isLocalAdded()) {
			copy.actionRemoveLink(linkDesc);
			return true;
		} else if (isLocalDeleted()) {
			copy.actionAddLink(linkDesc);
			if (attributes == null) {
				return true;
			}
			for (AttributeRevisionDelta delta : attributes.values()) {
				Object headValue = delta.getHeadValue();
				if (headValue == AttributeRevisionDelta.NOT_PRESENT) {
					continue;
				}
				copy.actionAddAttribute(linkDesc, delta.getKey(), headValue);
			}
			return true;
		}
		if (attributes == null) {
			return false;
		}
		boolean dirty = false;
		for (AttributeRevisionDelta delta : attributes.values()) {
			if (delta.revertLocalChanges(ser, copy)) {
				dirty = true;
			}
		}
		return dirty;
	}

	static public final int	L	= 0;
	static public final int	R	= 1;
	static public final int	C	= 2;
	static public final int	AL	= 3;
	static public final int	AR	= 4;

	public String getStatus() {
		char[] statusItem = new char[5];
		statusItem[L] = statusItem[R] = statusItem[C] = ' ';
		statusItem[AL] = ' ';
		statusItem[AR] = ' ';

		// ItemDescription mergeItem = new ItemDescription(delta.getId(),
		// delta.getType());
		if (isSet(WorkspaceLogiqueRevisionDelta.LOCAL_CHANGE_ADD)) {
			statusItem[L] = 'a';
		}
		if (isSet(WorkspaceLogiqueRevisionDelta.LOCAL_CHANGE_REMOVE)) {
			statusItem[L] = 'd';
		}
		if (isSet(WorkspaceLogiqueRevisionDelta.REMOTE_CHANGE_ADD)) {
			statusItem[R] = 'A';
		}
		if (isSet(WorkspaceLogiqueRevisionDelta.REMOTE_CHANGE_REMOVE)) {
			statusItem[R] = 'D';
		}
		if (hasConflict()) {
			statusItem[C] = 'C';
		}
		if (hasAcceptLocalChange()) {
			statusItem[AL] = 'a';
		} else if (hasRefuseLocalChange()) {
			statusItem[AL] = 'r';
		}
		if (hasAcceptRemoteChange()) {
			statusItem[AR] = 'A';
		} else if (hasRefuseRemoteChange()) {
			statusItem[AR] = 'R';
		}

		// //AL DL AR DR C * AL
		// for (LinkRevisionDelta lrd : links) {
		// if (lrd.hasConflict())
		// return true;
		// }

		return new String(statusItem);
	}

	private boolean hasRealRemoteChange() {
		if (hasAttributeRemoteChange()) {
			return true;
		}
		if (!hasRemoteChange()) {
			return false;
		}
		if (isRemoteAdded() && isLocalAdded()) {
			return false;
		}
		if (isRemoteDeleted() && isLocalDeleted()) {
			return false;
		}
		return true;
	}

	private boolean hasRealLocalChange() {
		if (hasAttributeLocalChange()) {
			return true;
		}
		if (!hasLocalChange()) {
			return false;
		}
		if (isRemoteAdded() && isLocalAdded()) {
			return false;
		}
		if (isRemoteDeleted() && isLocalDeleted()) {
			return false;
		}
		return true;
	}

	public LinkDescription toDesc() {
		return null;
		// new LinkDescription(parent.toDesc(), this.type, destination);
	}

	public boolean hasConflict() {
		return (isLocalAdded() && isRemoteDeleted()) || (isLocalDeleted() && isRemoteAdded());
	}

	public String getDisplayOneLine() {
		return type + " --> " + destination.getQualifiedName();
	}

	@Override
	public String toString() {
		return type + " --> " + destination.getQualifiedName();
	}

	public int getHStatus() {
		int s = change;
		if (attributes == null) {
			return s;
		}
		for (AttributeRevisionDelta delta : attributes.values()) {
			s |= delta.getHStatus();
		}
		return s;
	}

}
