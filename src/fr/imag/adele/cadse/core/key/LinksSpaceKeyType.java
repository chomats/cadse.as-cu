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

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.CadseGCST;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * The Class LinksSpaceKeyType.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class LinksSpaceKeyType extends SpaceKeyType {

	/** The lt. */
	private final LinkType	lt;

	/**
	 * Instantiates a new links space key type.
	 * 
	 * @param itemType
	 *            the item type
	 * @param spaceKeyType
	 *            the space key type
	 * @param lt
	 *            the lt
	 */
	public LinksSpaceKeyType(ItemType itemType, ItemType spaceKeyType, LinkType lt) {
		super(itemType, spaceKeyType);
		this.lt = lt;
	}

	/**
	 * Gets the lt.
	 * 
	 * @return the lt
	 */
	public LinkType getLt() {
		return lt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.key.SpaceKeyType#computeKey(fede.workspace.domain.Item)
	 */
	@Override
	public ISpaceKey computeKey(Item item) throws CadseException {
		ISpaceKey parentKey = null;
		if (parentSpaceKeyType != null) {
			parentKey = getParentSpaceKeyFromItem(item);
			if (parentKey == AbstractSpaceKey.INVALID)
				return AbstractSpaceKey.INVALID;
		}
		Item lt_item = item.getOutgoingItem(lt, true);
		assert lt_item != item;

		ISpaceKey lt_key = AbstractSpaceKey.INVALID;
		if (lt_item != null) {
			lt_key = lt_item.getKey();
			
		}
		if (lt_key == null || lt_key == AbstractSpaceKey.INVALID) {
			return AbstractSpaceKey.INVALID;
		}
		return new LinksSpaceKey(this, item.getName(), parentKey, lt_key);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.key.SpaceKeyType#computeKey(java.lang.String,
	 *      fede.workspace.domain.Item, java.lang.Object[])
	 */
	@Override
	public SpaceKey computeKey(String name, Item parentItem, Object... key_attributes) throws CadseException {
		ISpaceKey parentKey = null;
		if (parentSpaceKeyType != null) {
			parentKey = parentItem != null ? parentItem.getKey() : AbstractSpaceKey.INVALID;
		}
		assert key_attributes.length == 1 && key_attributes[0] instanceof Item;

		return new LinksSpaceKey(this, name, parentKey, ((Item) key_attributes[0]).getKey());
	}
	
	public IAttributeType<?>[] getAttributeTypes() {
		return new IAttributeType<?>[] { CadseGCST.ITEM_at_NAME_, lt };
	}
}
