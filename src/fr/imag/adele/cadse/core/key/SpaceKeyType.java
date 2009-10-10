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

package fr.imag.adele.cadse.core.key;

import java.util.logging.Level;
import java.util.logging.Logger;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.CadseGCST;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * The Class SpaceKeyType.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class SpaceKeyType {

	/** The item type. */
	final private ItemType		itemType;

	/** The space key type. */
	final protected ItemType	parentSpaceKeyType;

	/**
	 * Instantiates a new space key type.
	 * 
	 * @param itemType
	 *            the item type
	 * @param parentItemType
	 *            the space key type
	 */
	public SpaceKeyType(final ItemType itemType, final ItemType parentItemType) {
		super();
		this.itemType = itemType;
		this.parentSpaceKeyType = parentItemType;
	}

	/**
	 * Gets the item type.
	 * 
	 * @return the item type
	 */
	final public ItemType getItemType() {
		return itemType;
	}

	/**
	 * Gets the parent space key types.
	 * 
	 * @return the parent space key types
	 */
	final public SpaceKeyType getParentSpaceKeyTypes() {
		return parentSpaceKeyType == null ? null : parentSpaceKeyType.getSpaceKeyType();
	}

	/**
	 * Compute key.
	 * 
	 * @param item
	 *            the item
	 * 
	 * @return the space key
	 * @throws CadseException
	 */
	public ISpaceKey computeKey(Item item) throws CadseException {
		ISpaceKey parentKey = null;
		if (parentSpaceKeyType != null) {
			parentKey = getParentSpaceKeyFromItem(item);
			if (parentKey == AbstractSpaceKey.INVALID)
				return AbstractSpaceKey.INVALID;
		}
		return createKey(item, parentKey);
	}

	protected ISpaceKey createKey(Item item, ISpaceKey parentKey) throws CadseException {
		return new SpaceKey(item, this, getName(item), parentKey);
	}

	protected String getName(Item item) {
		return item.getName();
	}

	/**
	 * Compute key.
	 * 
	 * @param name
	 *            the name
	 * @param parentItem
	 *            the parent item
	 * @param key_attributes
	 *            the key_attributes
	 * 
	 * @return the space key
	 * @throws CadseException
	 */
	public ISpaceKey computeKey(String name, Item parentItem, Object... key_attributes) throws CadseException {
		ISpaceKey parentKey = null;
		if (parentSpaceKeyType != null) {
			parentKey = parentItem != null ? parentItem.getKey() : AbstractSpaceKey.INVALID;
		}
		return createKey(convertName(name), parentKey, key_attributes);
	}

	protected ISpaceKey createKey(String name, ISpaceKey parentKey, Object... key_attributes) {
		return new SpaceKey(null, this, convertName(name), parentKey);
	}

	protected String convertName(String name) {
		return name;
	}

	/**
	 * Gets the parent space key from item.
	 * 
	 * @param item
	 *            the item
	 * 
	 * @return the parent space key from item
	 */
	protected ISpaceKey getParentSpaceKeyFromItem(Item item) {
		Item partparent = item.getPartParent(parentSpaceKeyType);
		if (partparent == null) {
			Logger.getLogger("fr.imag.adele.cadse.key").log(Level.SEVERE, 
					"Cannot find the parent item for "+item.getType().getName() + "::"+item.getDisplayName());
			return AbstractSpaceKey.INVALID;
		}
		ISpaceKey key = partparent.getKey();
		assert key != null;
		return key;
	}

	/**
	 * Retourn une chaine humainenement lisible indiquant la porter de la cl�.
	 * 
	 * @param key
	 *            the key
	 * @param sb
	 *            the sb
	 */
	public void getQualifiedString(AbstractSpaceKey key, StringBuilder sb) {

		ISpaceKey parentKey = key.getParentSpaceKey();
		if (parentKey != null) {
			parentKey.getQualifiedString(sb);
			sb.append("::");
		}

		sb.append(((SpaceKey) key).getName());

	}

	/**
	 * Retourn une chaine humainenement lisible indiquant la porter de la cl�.
	 * 
	 * @param key
	 *            the key
	 * 
	 * @return the qualified string
	 */
	public String getQualifiedString(AbstractSpaceKey key) {
		StringBuilder sb = new StringBuilder();
		sb.append(getItemType().getName()).append(" ");
		getQualifiedString(key, sb);
		return sb.toString();
	}

	public IAttributeType<?>[] getAttributeTypes() {
		return new IAttributeType<?>[] { CadseGCST.ITEM_at_NAME_ };
	}
}
