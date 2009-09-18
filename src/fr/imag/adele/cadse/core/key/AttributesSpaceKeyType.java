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
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

public class AttributesSpaceKeyType extends SpaceKeyType {

	private IAttributeType<?>[]	attributeTypes;

	public AttributesSpaceKeyType(ItemType itemType, ItemType parentItemType, IAttributeType<?>... attributeTypes) {
		super(itemType, parentItemType);
		this.attributeTypes = attributeTypes;
	}

	@Override
	protected ISpaceKey createKey(Item item, ISpaceKey parentKey) throws CadseException {
		Object[] values = new Object[attributeTypes.length];
		for (int i = 0; i < values.length; i++) {
			values[i] = item.getAttribute(attributeTypes[i]);
			if (values[i] == null) {
				throw new CadseException("Invalid key : value for key " + attributeTypes[i].getName() + " is null");
			}
		}
		return new AttributeSpaceKey(item, this, parentKey, values);
	}

	@Override
	public void getQualifiedString(AbstractSpaceKey key, StringBuilder sb) {
		int pos = 0;
		ISpaceKey parentKey = key.getParentSpaceKey();
		if (parentKey != null) {
			parentKey.getQualifiedString(sb);
			sb.append("::");
		}

		for (Object v : ((AttributeSpaceKey) key).getValue()) {
			if (sb.length() != pos) {
				pos = sb.length();
				sb.append("::");
			}
			sb.append(v);
		}
	}

	@Override
	public IAttributeType<?>[] getAttributeTypes() {
		return attributeTypes;
	}
}
