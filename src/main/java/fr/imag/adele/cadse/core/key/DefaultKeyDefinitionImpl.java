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
package fr.imag.adele.cadse.core.key;

import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.CadseGCST;
import fr.imag.adele.cadse.core.INamed;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * The Class SpaceKeyType.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class DefaultKeyDefinitionImpl implements KeyDefinition {

	/** The space key type. */
	final protected KeyDefinition	_parentKeyDefinition;
	private UUID					_uuid;
	private final int				_objectId;
	private String					_name;
	protected IAttributeType<?>[]	_elts	= null;
	private ItemType _itemType;

	/**
	 * Instantiates a new space key type.
	 * 
	 * @param itemType
	 *            the item type
	 * @param parentItemType
	 *            the space key type
	 */
	public DefaultKeyDefinitionImpl(ItemType childType, UUID uuid, int objectId, KeyDefinition parentKeyDef,
			IAttributeType<?>... elts) {
		_uuid = uuid;
		_objectId = objectId;
		_parentKeyDefinition = parentKeyDef;
		_elts = elts;
		_itemType = childType;
	}
	
	public DefaultKeyDefinitionImpl(ItemType childType, ItemType parentType) {
		this(childType, parentType, CadseGCST.ITEM_at_NAME_);
	}
	
	public DefaultKeyDefinitionImpl(ItemType childType, ItemType parentType, IAttributeType<?>... elts) {
		this(childType, null, -1, parentType == null ? null : parentType.getKeyDefinition(), elts);
	}

	/**
	 * Gets the parent space key types.
	 * 
	 * @return the parent space key types
	 */
	final public KeyDefinition getParentSpaceKeyTypes() {
		return _parentKeyDefinition;
	}

	@Override
	public UUID getId() {
		return _uuid;
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public IAttributeType<?>[] getKeyElements() {
		return _elts;
	}

	@Override
	public int getObjectId() {
		return _objectId;
	}

	@Override
	public KeyDefinition getParentKey() {
		return _parentKeyDefinition;
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
	@Override
	public Key computeKey(Item item) throws CadseException {
		Key parentKey = null;
		if (_parentKeyDefinition != null) {
			parentKey = getParentSpaceKeyFromItem(item);
			if (parentKey == DefaultKeyImpl.INVALID) {
				return DefaultKeyImpl.INVALID;
			}
		}
		return createKey(item, parentKey);
	}

    @Override
    public int hashNameAttribute() {
       for (int i = 0; i < _elts.length; i++) {
			if (CadseGCST.ITEM_at_NAME_ == _elts[i])
                return i;
		}
       return -1;
    }



	protected Key createKey(Item item, Key parentKey) throws CadseException {
		Object[] values = new Object[_elts.length];
		for (int i = 0; i < values.length; i++) {
			if (_elts[i] instanceof LinkType) {
				Item lt_item = item.getOutgoingItem((LinkType) _elts[i], true);
				assert lt_item != item;

				Key lt_key = DefaultKeyImpl.INVALID;
				if (lt_item != null && lt_item.isResolved()) {
					lt_key = lt_item.getKey();

				}
				if (lt_key == null || lt_key == DefaultKeyImpl.INVALID) {
					return DefaultKeyImpl.INVALID;
				}
				values[i] = lt_key;
			} else if (CadseGCST.ITEM_at_NAME_ == _elts[i])
				values[i] = convertName(getName(item));
			else
				values[i] = item.getAttribute(_elts[i]);
		}
		return new DefaultKeyImpl(this, parentKey, values);
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
	@Override
	public Key computeKey(Key parentKey, Object... values) throws CadseException {
		if (values.length != _elts.length)
			return DefaultKeyImpl.INVALID;

		if (parentKey == DefaultKeyImpl.INVALID) {
			return DefaultKeyImpl.INVALID;
		}
		return createKey(parentKey, values);
	}

	protected Key getParentKeyFromParentItem(Item parentItem) {
		Key parentKey = null;
		if (_parentKeyDefinition != null) {
			parentKey = getParentSpaceKeyFromItem(parentItem);
		}
		return parentKey;
	}

	protected Key createKey(Key parentKey, Object... values) {

		if (values.length != _elts.length)
			return DefaultKeyImpl.INVALID;
		for (int i = 0; i < values.length; i++) {
			if (_elts[i] instanceof LinkType) {
				if (values[i] instanceof Key) {
					if (values[i] == DefaultKeyImpl.INVALID)
						return DefaultKeyImpl.INVALID;
					continue;
				}
				if (values[i] instanceof Item) {
					values[i] = ((Item) values[1]).getKey();
					if (values[i] == DefaultKeyImpl.INVALID)
						return DefaultKeyImpl.INVALID;
					continue;
				}
				return DefaultKeyImpl.INVALID;
			} else if (CadseGCST.ITEM_at_NAME_ == _elts[i])
				values[i] = convertName((String) values[i]);
		}
		return new DefaultKeyImpl(this, parentKey, values);
	}

	public String convertName(String name) {
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
	protected Key getParentSpaceKeyFromItem(Item item) {
		Item partparent = item.getPartParent(_parentKeyDefinition.getItemType());
		if (partparent == null) {
			Logger.getLogger("fr.imag.adele.cadse.key").log(Level.SEVERE,
					"Cannot find the parent item for " + item.getType().getName() + "::" + item.getDisplayName());
			return DefaultKeyImpl.INVALID;
		}
		Key key = partparent.getKey();
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
	@Override
	public void getQualifiedString(Key key, StringBuilder sb) {

		Key parentKey = key.getParentKey();
		if (parentKey != null) {
			parentKey.getQualifiedString(sb);
			sb.append("::");
		}

		sb.append(((INamed) key).getName());

	}

	@Override
	public ItemType getItemType() {
		return _itemType;
	}

	@Override
	public String getName(Key key) {
		for (int i = 0; i < _elts.length; i++) {
			if (CadseGCST.ITEM_at_NAME_ == _elts[i]) {
				return key.getValue(i);
			}
		}
		return Item.NO_VALUE_STRING;
	}

    @Override
    public void setUUID(long itemMsb, long itemLsb) {
        _uuid = new UUID(itemMsb, itemLsb);
    }

	@Override
	public void setUUID(UUID uuid) {
		_uuid = uuid;
	}
}
