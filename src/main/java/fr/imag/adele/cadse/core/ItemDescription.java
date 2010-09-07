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
package fr.imag.adele.cadse.core;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.util.Convert;
import java.util.UUID;

/**
 * Represents an item. From this description, this item can be loaded (restored)
 * in a logical workspace. This description includes:
 * <ul>
 * <li>item id</li>
 * <li>item short name</li>
 * <li>item unique name</li>
 * <li>item type id</li>
 * <li>outgoing links</li>
 * <li>outgoing derived links</li>
 * <li>state (isReadOnly, isValid...)</li>
 * <li>attributes and their values</li>
 * </ul>
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class ItemDescription extends ItemDescriptionRef implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long						serialVersionUID	= -7647378997698818591L;

	/** The links. */
	final List<LinkDescription>						links;

	/** The attributes. */
	private final Map<IAttributeType<?>, Object>	attributes;

	/** The is valid. */
	private boolean									isValid				= true;					// by
	// default
	// is
	// true
	// at
	// fisrt
	// time.

	/** The is read only. */
	private boolean									isReadOnly			= false;

	/** The is recompute componants and derived link. */
	private boolean									isRecomputeComponantsAndDerivedLink;

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
	public ItemDescription(UUID id, ItemType type, String uniquename, String shortname) {
		super(id, type, uniquename, shortname);
		attributes = new HashMap<IAttributeType<?>, Object>();
		links = new ArrayList<LinkDescription>();
	}

	/**
	 * Instantiates a new item description.
	 * 
	 * @param id
	 *            the id
	 * @param type
	 *            the type
	 */
	public ItemDescription(UUID id, ItemType type) {
		super(id, type);
		attributes = new HashMap<IAttributeType<?>, Object>();
		links = new ArrayList<LinkDescription>();
	}

	/**
	 * Instantiates a new item description.
	 * 
	 * @param item
	 *            the item
	 */
	public ItemDescription(Item item) {
		super(item);
		attributes = new HashMap<IAttributeType<?>, Object>();
		links = new ArrayList<LinkDescription>();
		IAttributeType<?>[] keys = item.getLocalAllAttributeTypes();
		for (int i = 0; i < keys.length; i++) {
			IAttributeType<?> k = keys[i];

			Object value = item.getAttribute(k);
			if (value == null) {
				continue;
			}
			value = clone(value);
			attributes.put(k, value);
		}

		for (Link l : item.getOutgoingLinks()) {
			links.add(new LinkDescription(l));
		}

		this.isValid = item.isValid();
		this.isReadOnly = item.isReadOnly();
	}

	/**
	 * Instantiates a new item description.
	 * 
	 * @param newid
	 *            the newid
	 * @param item
	 *            the item
	 */
	public ItemDescription(UUID newid, ItemDescription item) {
		super(newid, item);
		attributes = new HashMap<IAttributeType<?>, Object>();
		links = new ArrayList<LinkDescription>();
		for (Map.Entry<IAttributeType<?>, Object> e : item.attributes.entrySet()) {
			Object value = e.getValue();
			if (value == null) {
				continue;
			}
			value = clone(value);
			attributes.put(e.getKey(), value);
		}

		for (LinkDescription ld : item.getLinks()) {
			if (ld instanceof DerivedLinkDescription) {
				links.add(new DerivedLinkDescription(this, (DerivedLinkDescription) ld));
				continue;
			}
			links.add(new LinkDescription(this, ld, false));
		}
		setReadOnly(item.isReadOnly());
		setValid(item.isValid());

	}

	/**
	 * Clone.
	 * 
	 * @param value
	 *            the value
	 * 
	 * @return the object
	 */
	@SuppressWarnings("unchecked")
	private Object clone(Object value) {
		Class clazz = value.getClass();
		if (clazz.isPrimitive()) {
			return value;
		}
		if (clazz == String.class) {
			return value;
		}
		if (value instanceof List) {
			ArrayList<Object> ret = new ArrayList<Object>();
			List<Object> arrayvalue = (List<Object>) value;
			for (Object o : arrayvalue) {
				ret.add(clone(o));
			}
			return ret;
		}
		if (value instanceof Map) {
			Map<Object, Object> ret = new HashMap<Object, Object>();
			Map<Object, Object> mapvalue = (Map<Object, Object>) value;
			for (Map.Entry<Object, Object> e : mapvalue.entrySet()) {
				ret.put(clone(e.getKey()), clone(e.getValue()));
			}
			return ret;
		}

		return value;
	}

	/**
	 * Gets the attributes.
	 * 
	 * @return the attributes
	 */
	public Map<IAttributeType<?>, Object> getAttributes() {
		return attributes;
	}

	/**
	 * Adds the attribute.
	 * 
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	public void addAttribute(IAttributeType<?> key, Object value) {
		attributes.put(key, value);
	}

	/**
	 * Gets the links.
	 * 
	 * @return the links
	 */
	public List<LinkDescription> getLinks() {
		return Collections.unmodifiableList(links);
	}

	/**
	 * Checks if is read only.
	 * 
	 * @return true, if is read only
	 */
	public boolean isReadOnly() {
		return isReadOnly;
	}

	/**
	 * Sets the read only.
	 * 
	 * @param isReadOnly
	 *            the new read only
	 */
	public void setReadOnly(boolean isReadOnly) {
		this.isReadOnly = isReadOnly;
	}

	/**
	 * Checks if is valid.
	 * 
	 * @return true, if is valid
	 */
	public boolean isValid() {
		return isValid;
	}

	/**
	 * Sets the valid.
	 * 
	 * @param isValid
	 *            the new valid
	 */
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	/**
	 * Checks if is recompute componants and derived link.
	 * 
	 * @return true, if is recompute componants and derived link
	 */
	public boolean isRecomputeComponantsAndDerivedLink() {
		return isRecomputeComponantsAndDerivedLink;
	}

	/**
	 * Sets the recompute componants and derived link.
	 * 
	 * @param isRecomputeComponantsAndDerivedLink
	 *            the new recompute componants and derived link
	 */
	public void setRecomputeComponantsAndDerivedLink(boolean isRecomputeComponantsAndDerivedLink) {
		this.isRecomputeComponantsAndDerivedLink = isRecomputeComponantsAndDerivedLink;
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
		sb.append("uniquename: ").append(getQualifiedName()).append("\n");
		sb.append("shortname: ").append(getName()).append("\n");
		sb.append("type: ").append(getType()).append("\n");
		if (links != null && links.size() > 0) {
			sb.append("links:\n");
			for (LinkDescription l : links) {
				sb.append(" - (").append(l.getType()).append(") > ").append(l.getDestination().getQualifiedName());
				sb.append("\n");
			}
		}
		if (attributes != null && attributes.size() > 0) {
			sb.append("attributes:\n");
			for (IAttributeType<?> k : attributes.keySet()) {
				sb.append(" - ").append(k).append("=").append(attributes.get(k));
				sb.append("\n");
			}
		}
		return sb.toString();
	}

	/**
	 * Removes the.
	 * 
	 * @param removeld
	 *            the removeld
	 */
	public void remove(LinkDescription removeld) {
		if (links != null) {
			links.remove(removeld);
		}
	}

	public void addLink(LinkDescription link) {
		links.add(link);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ItemDescription) {
			ItemDescription other = (ItemDescription) obj;
			if (!other.getId().equals(getId())) {
				return false;
			}
			if (!other.getType().equals(getType())) {
				return false;
			}
			if (!other.getQualifiedName().equals(getQualifiedName())) {
				return false;
			}
			if (!other.getName().equals(getName())) {
				return false;
			}
			if (links != null && links.size() > 0) {
				if (!links.equals(other.links)) {
					return false;
				}
			} else if (other.links != null && other.links.size() != 0) {
				return false;
			}
			if (attributes != null && attributes.size() > 0) {
				if (!attributes.equals(other.attributes)) {
					return false;
				}
			} else if (other.attributes != null && other.attributes.size() != 0) {
				return false;
			}
			return true;
		}
		return super.equals(obj);
	}

	public boolean getBooleanAttribut(String key, boolean defaultValue) {
		if (attributes != null) {
			Object value = attributes.get(key);
			if (value != null) {
				return Convert.toBoolean(value);
			}
		}
		return defaultValue;
	}

	public String getStringAttribut(String key, String defaultValue) {
		if (attributes != null) {
			Object value = attributes.get(key);
			if (value != null) {
				return Convert.toString(value);
			}
		}
		return defaultValue;
	}

	public int getIntAttribut(String key, int defaultValue) {
		if (attributes != null) {
			Object value = attributes.get(key);
			if (value != null) {
				return Convert.toInteger(value);
			}
		}
		return defaultValue;
	}

	// public Item getLinkDest(IWorkingLoadingItems wl, LinkType lt) throws
	// CadseException {
	// for (LinkDescription ldesc : links) {
	// if (ldesc.getType().equals(lt.getShortName())) {
	// return wl.loadItem(ldesc.getDestination());
	// }
	// }
	// return null;
	// }
	//
	// public <T extends Item> List<T> getLinksDest(IWorkingLoadingItems wl,
	// LinkType lt, ItemType type)
	// throws CadseException {
	// List<T> ret = new ArrayList<T>();
	// for (LinkDescription ldesc : links) {
	// if (ldesc.getType().equals(lt.getShortName())) {
	// T findItem = (T) wl.loadItem(ldesc.getDestination());
	// if (findItem == null || !findItem.isResolved()) {
	// continue;
	// }
	// if (findItem.isInstanceOf(type)) {
	// ret.add(findItem);
	// }
	// }
	// }
	// return ret;
	// }

	public URL getURLAttribut(String key) throws MalformedURLException {
		if (attributes != null) {
			Object value = attributes.get(key);
			if (value != null) {
				return Convert.toURL(value);
			}
		}
		return null;
	}

}
