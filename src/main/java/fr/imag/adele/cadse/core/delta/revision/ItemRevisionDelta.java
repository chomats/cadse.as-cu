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
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.CadseGCST;
import java.util.UUID;
import fr.imag.adele.cadse.core.DerivedLinkDescription;
import fr.imag.adele.cadse.core.ItemDescriptionRef;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;

public class ItemRevisionDelta extends ObjectTeamChange implements ICommitable, ITeamChangeObject {

	/** The id. */
	private UUID												id;

	/** The type. */
	private UUID												type;

	/** The links. */
	final List<LinkRevisionDelta>									links;

	/** The attributes. */
	private final Map<IAttributeType<?>, AttributeRevisionDelta<?>>	attributes;

	/** The derived. */
	private final HashSet<DerivedLinkDescription>					derived;

	/** The composants. */
	private final HashSet<ItemDescriptionRef>						composants;

	private WorkspaceLogiqueRevisionDelta							parent;

	/**
	 * Instantiates a new item description.
	 * 
	 * @param id
	 *            the id
	 * @param type
	 *            the type
	 * @param uniquename
	 *            the uniquename
	 * @param shortname
	 *            the shortname
	 */
	ItemRevisionDelta(WorkspaceLogiqueRevisionDelta parent, UUID id, UUID type) {
		this.id = id;
		this.type = type;
		attributes = new HashMap<IAttributeType<?>, AttributeRevisionDelta<?>>();
		derived = new HashSet<DerivedLinkDescription>();
		composants = new HashSet<ItemDescriptionRef>();
		links = new ArrayList<LinkRevisionDelta>();
		this.parent = parent;
	}

	/**
	 * Gets the composants.
	 * 
	 * @return the composants
	 */
	public Set<ItemDescriptionRef> getComposants() {
		return composants;
	}

	/**
	 * Gets the derived.
	 * 
	 * @return the derived
	 */
	public Set<DerivedLinkDescription> getDerived() {
		return derived;
	}

	/**
	 * Adds the attribute.
	 * 
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	public void addAttribute(AttributeRevisionDelta value) {
		attributes.put(value.getKey(), value);
	}

	/**
	 * Adds the derived link.
	 * 
	 * @param l
	 *            the l
	 */
	public void addDerivedLink(DerivedLinkDescription l) {
		derived.add(l);
	}

	/**
	 * Adds the componants link.
	 * 
	 * @param ref
	 *            the ref
	 */
	public void addComponantsLink(ItemDescriptionRef ref) {
		composants.add(ref);
	}

	/**
	 * Gets the links.
	 * 
	 * @return the links
	 */
	public List<LinkRevisionDelta> getLinks() {
		return Collections.unmodifiableList(links);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ItemDescriptionRef#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id: ").append(getId()).append("\n");
		sb.append("type: ").append(getType()).append("\n");
		if (links != null && links.size() > 0) {
			sb.append("links:\n");

			for (LinkRevisionDelta l : links) {
				sb.append(" - (").append(l.getType()).append(") > ").append(l.getDestination().getQualifiedName());
				sb.append("\n");
			}
		}
		return sb.toString();
	}

	public String getDisplayOneLine() {
		return getDisplaytype() + " " + getUniqueName();
	}

	private String getDisplaytype() {
		ItemType it = parent.getLogicalWorkspace().getItemType(type);
		if (it != null) {
			return it.getName();
		}
		return type.toString();
	}

	public UUID getHeadParentID() {
		return null;
	}

	public LinkType getHeadParentLinkType() {
		return null;
	}

	public UUID getLocalParentID() {
		return null;
	}

	public LinkType getLocalParentLinkType() {
		return null;
	}

	/**
	 * Gets the type.
	 * 
	 * @return the type
	 */
	public ItemType getType() {
		return this.parent.getType(type);
	}

	/**
	 * Gets the type.
	 * 
	 * @return the type
	 */
	public UUID getTypeId() {
		return type;
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            the new id
	 */
	public void setId(UUID id) {
		this.id = id;
	}

	/**
	 * Sets the type.
	 * 
	 * @param type
	 *            the new type
	 */
	public void setType(UUID type) {
		this.type = type;
	}

	public void addLinks(LinkRevisionDelta linkRevisionDelta) {
		this.links.add(linkRevisionDelta);
	}

	public boolean hasHeriachicalChange() {
		for (LinkRevisionDelta lrd : links) {
			if (lrd.hasChange()) {
				return true;
			}
		}
		for (ITeamChangeObject ard : attributes.values()) {
			if (ard.hasChange()) {
				return true;
			}
		}

		return false;
	}

	public boolean hasHeriachicalLocalChange(boolean excludeAdd, boolean excludeRemove) {
		for (LinkRevisionDelta lrd : links) {
			if (excludeAdd && lrd.isLocalAdded()) {
				continue;
			}
			if (excludeRemove && lrd.isLocalDeleted()) {
				continue;
			}

			if (lrd.hasLocalChange()) {
				return true;
			}
		}
		for (AttributeRevisionDelta ard : attributes.values()) {
			if (excludeAdd && ard.isLocalAdded()) {
				continue;
			}
			if (excludeRemove && ard.isLocalDeleted()) {
				continue;
			}
			if (ard.hasLocalChange()) {
				return true;
			}
		}

		return false;
	}

	public boolean hasHeriachicalRemoteChange(boolean excludeAdd, boolean excludeRemove) {
		if (hasRemoteChange()) {
			return true;
		}

		for (LinkRevisionDelta lrd : links) {
			if (excludeAdd && lrd.isRemoteAdded()) {
				continue;
			}
			if (excludeRemove && lrd.isRemoteDeleted()) {
				continue;
			}

			if (lrd.hasRemoteChange()) {
				return true;
			}
		}
		for (ITeamChangeObject ard : attributes.values()) {
			if (excludeAdd && ard.isRemoteAdded()) {
				continue;
			}
			if (excludeRemove && ard.isRemoteDeleted()) {
				continue;
			}

			if (ard.hasRemoteChange()) {
				return true;
			}
		}

		return false;
	}

	public boolean hasHeriachicalConflict() {
		for (LinkRevisionDelta lrd : links) {
			if (lrd.hasConflict()) {
				return true;
			}
		}
		for (ITeamChangeObject ard : attributes.values()) {
			if (ard.hasConflict()) {
				return true;
			}
		}

		return false;
	}

	public ItemDescriptionRef toHeadDesc() {
		ItemDescriptionRef ret = new ItemDescriptionRef(id, getType());
		String shortName = getHeadAttributeValue(String.class, CadseGCST.ITEM_at_NAME);
		if (shortName != null) {
			ret.setShortname(shortName);
		}
		String uniqueName = getHeadAttributeValue(String.class, CadseGCST.ITEM_at_QUALIFIED_NAME);
		if (uniqueName != null) {
			ret.setUniqueName(uniqueName);
		}
		return ret;
	}

	public <T> T getHeadAttributeValue(Class<T> clazz, String key) {
		AttributeRevisionDelta delta = attributes.get(key);
		if (delta == null) {
			return null;
		}

		Object headValue = delta.getHeadValue();
		if (headValue == null) {
			return null;
		}
		if (headValue.getClass().isAssignableFrom(clazz)) {
			return (T) headValue;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.delta.revision.ICommitable#commitAcceptHeadChanges
	 * (fede.workspace.domain.delta.revision.IRevisionService,
	 * fede.workspace.domain.IWorkspaceLogiqueCopy)
	 */
	public boolean commitAcceptHeadChanges(ITeamRevisionService ser, LogicalWorkspaceTransaction copy)
			throws CadseException {
		if (isRemoteDeleted() && hasAcceptRemoteChange()) {
			copy.actionRemoveItem(toDesc());
			return true;
		}
		boolean dirty = false;
		if (isRemoteAdded()) {
			if (!hasAcceptRemoteChange()) {
				return false;
			}
			try {
				if (!isLocalAdded()) {
					copy.actionAddItem(toHeadDesc(), getHeadParentID(), getHeadParentLinkType());
				}
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			dirty = true;
		}

		for (AttributeRevisionDelta delta : attributes.values()) {
			if (delta.commitAcceptHeadChanges(ser, copy)) {
				dirty = true;
			}
		}
		for (LinkRevisionDelta delta : links) {
			if (delta.commitAcceptHeadChanges(ser, copy)) {
				dirty = true;
			}
		}
		return dirty;
	}

	public boolean revertLocalChanges(ITeamRevisionService ser, LogicalWorkspaceTransaction copy) throws CadseException {
		if (isRemoteDeleted()) {
			return false;
		}
		boolean dirty = false;
		if (isLocalAdded() && !isRemoteAdded()) {
			if (hasRefuseLocalChange()) {
				copy.actionRemoveItem(toDesc());
				return true;
			}
			for (AttributeRevisionDelta delta : attributes.values()) {
				if (delta.revertLocalChanges(ser, copy)) {
					dirty = true;
				}
			}
			for (LinkRevisionDelta delta : links) {
				if (delta.revertLocalChanges(ser, copy)) {
					dirty = true;
				}
			}
		}
		if (isLocalDeleted()) {
			if (hasRefuseLocalChange()) {
				copy.actionAddItem(toDesc(), getLocalParentID(), getLocalParentLinkType());
				for (AttributeRevisionDelta delta : attributes.values()) {
					delta.refuseLocalChange();
					delta.revertLocalChanges(ser, copy);
				}
				for (LinkRevisionDelta delta : links) {
					delta.revertLocalChanges(ser, copy);
				}
			}
			return true;
		}

		for (AttributeRevisionDelta delta : attributes.values()) {
			if (delta.revertLocalChanges(ser, copy)) {
				dirty = true;
			}
		}
		for (LinkRevisionDelta delta : links) {
			if (delta.revertLocalChanges(ser, copy)) {
				dirty = true;
			}
		}
		return dirty;
	}

	public ItemDescriptionRef toDesc() {
		return new ItemDescriptionRef(id, getType(), getUniqueName(), getShortName());
	}

	public Collection<AttributeRevisionDelta<?>> getAttributes() {
		return this.attributes.values();
	}

	public String getUniqueName() {
		AttributeRevisionDelta delta = attributes.get(CadseGCST.ITEM_at_QUALIFIED_NAME);
		if (delta.getCurrentValue() != null && delta.getCurrentValue() != AttributeRevisionDelta.NOT_PRESENT) {
			return (String) delta.getCurrentValue();
		}
		if (delta.getHeadValue() != null && delta.getHeadValue() != AttributeRevisionDelta.NOT_PRESENT) {
			return (String) delta.getHeadValue();
		}
		if (delta.getBaseValue() != null && delta.getBaseValue() != AttributeRevisionDelta.NOT_PRESENT) {
			return (String) delta.getBaseValue();
		}
		return null;
	}

	public String getShortName() {
		AttributeRevisionDelta delta = attributes.get(CadseGCST.ITEM_at_NAME);
		if (delta.getCurrentValue() != null && delta.getCurrentValue() != AttributeRevisionDelta.NOT_PRESENT) {
			return (String) delta.getCurrentValue();
		}
		if (delta.getHeadValue() != null && delta.getHeadValue() != AttributeRevisionDelta.NOT_PRESENT) {
			return (String) delta.getHeadValue();
		}
		if (delta.getBaseValue() != null && delta.getBaseValue() != AttributeRevisionDelta.NOT_PRESENT) {
			return (String) delta.getBaseValue();
		}
		return null;
	}

	public boolean hasConflict() {
		// TODO Auto-generated method stub
		return false;
	}

	static public final int	ITEM_LOCAL		= 0;
	static public final int	ITEM_REMOTE		= 1;
	static public final int	ITEM_LOCAL_M	= 2;
	static public final int	ITEM_REMOTE_M	= 3;
	static public final int	ITEM_CONFICT	= 4;
	static public final int	AL				= 5;
	static public final int	AR				= 6;

	public int getHStatus() {
		int s = change;
		if (attributes != null) {
			for (AttributeRevisionDelta delta : attributes.values()) {
				s |= delta.getHStatus();
			}
		}
		if (links != null) {
			for (LinkRevisionDelta delta : links) {
				s |= delta.getHStatus();
			}
		}

		return s;
	}

	public String getStatus() {
		char[] statusItem = new char[7];
		statusItem[ITEM_LOCAL] = statusItem[ITEM_REMOTE] = statusItem[ITEM_CONFICT] = statusItem[ITEM_LOCAL_M] = statusItem[ITEM_REMOTE_M] = ' ';
		statusItem[AL] = ' ';
		statusItem[AR] = ' ';

		// ItemDescription mergeItem = new ItemDescription(delta.getId(),
		// delta.getType());
		if (isLocalAdded()) {
			statusItem[ITEM_LOCAL] = 'a';
		}
		if (isLocalDeleted()) {
			statusItem[ITEM_LOCAL] = 'd';
		}
		if (isRemoteAdded()) {
			statusItem[ITEM_REMOTE] = 'A';
		}
		if (isRemoteDeleted()) {
			statusItem[ITEM_REMOTE] = 'D';
		}
		if (hasHeriachicalLocalChange(statusItem[ITEM_LOCAL] == 'a', statusItem[ITEM_LOCAL] == 'd')) {
			statusItem[ITEM_LOCAL_M] = 'm';
		}
		if (hasHeriachicalRemoteChange(statusItem[ITEM_REMOTE] == 'A', statusItem[ITEM_REMOTE] == 'D')) {
			statusItem[ITEM_REMOTE_M] = 'M';
		}
		if (hasHeriachicalConflict()) {
			statusItem[ITEM_CONFICT] = 'C';
		}

		if (hasAcceptLocalChange()) {
			statusItem[AL] = 'A';
		} else if (hasRefuseLocalChange()) {
			statusItem[AL] = 'R';
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

	public String getDisplayName() {
		String un = getUniqueName();
		if (un != null) {
			return un;
		}
		String sn = getShortName();
		if (sn != null) {
			return sn;
		}

		return getId().toString();
	}

}
