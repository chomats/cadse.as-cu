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

import java.io.Serializable;

import fr.imag.adele.cadse.core.transaction.delta.ItemDelta;
import java.util.UUID;

/**
 * Represents a reference of an item. It does not describe state, attribute
 * values... This description includes: - item id - item short name - item
 * unique name - item type id
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class ItemDescriptionRef implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -177950843243113310L;

	/** The id. */
	private UUID			_id;

	/** The type. */
	private ItemType			_type;

	/** The qualifiedName. */
	private String				_qualifiedName;

	/** The shortname. */
	private String				_name;

	/**
	 * Instantiates a new item description ref.
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
	public ItemDescriptionRef(UUID id, ItemType type, String qualifiedName, String name) {
		this._id = id;
		this._type = type;
		this._qualifiedName = qualifiedName;
		this._name = name;
	}

	/**
	 * Instantiates a new item description ref.
	 * 
	 * @param id
	 *            the id
	 * @param type
	 *            the type
	 */
	public ItemDescriptionRef(UUID id, ItemType type) {
		this._id = id;
		this._type = type;
	}

	/**
	 * Instantiates a new item description ref.
	 * 
	 * @param item
	 *            the item
	 */
	public ItemDescriptionRef(Item item) {
		this._id = item.getId();
		this._type = item.getType();
		this._qualifiedName = item.getQualifiedName();
		this._name = item.getName();

	}

	/**
	 * Instantiates a new item description ref.
	 * 
	 * @param item
	 *            the item
	 */
	public ItemDescriptionRef(ItemDelta item) {
		this._id = item.getId();
		this._type = item.getType();
		this._qualifiedName = item.getQualifiedName();
		this._name = item.getName();

	}

	/**
	 * Instantiates a new item description ref.
	 * 
	 * @param newid
	 *            the newid
	 * @param item
	 *            the item
	 */
	public ItemDescriptionRef(UUID newid, ItemDescription item) {
		this._id = newid;
		this._type = item.getTypeObject();
		this._qualifiedName = item.getQualifiedName();
		this._name = item.getName();
	}

	/**
	 * Gets the type.
	 * 
	 * @return the type
	 */
	public UUID getType() {
		return _type.getId();
	}

	/**
	 * Gets the type.
	 * 
	 * @return the type
	 */
	public ItemType getTypeObject() {
		return _type;
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public UUID getId() {
		return _id;
	}

	/**
	 * Gets the unique name.
	 * 
	 * @return the unique name
	 */
	public String getQualifiedName() {
		return _qualifiedName;
	}

	/**
	 * Gets the short name.
	 * 
	 * @return the short name
	 */
	public String getName() {
		return _name;
	}

	/**
	 * Sets the unique name.
	 * 
	 * @param uniquename
	 *            the new unique name
	 */
	public void setUniqueName(String uniquename) {
		this._qualifiedName = uniquename;
	}

	/**
	 * Sets the shortname.
	 * 
	 * @param shortname
	 *            the new shortname
	 */
	public void setShortname(String shortname) {
		this._name = shortname;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            the new id
	 */
	public void setId(UUID id) {
		this._id = id;
	}

	/**
	 * Sets the type.
	 * 
	 * @param type
	 *            the new type
	 */
	public void setType(ItemType type) {
		this._type = type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id: ").append(_id).append("\n");
		sb.append("uniquename: ").append(_qualifiedName).append("\n");
		sb.append("shortname: ").append(_name).append("\n");
		sb.append("type: ").append(_type).append("\n");
		return sb.toString();
	}

}
