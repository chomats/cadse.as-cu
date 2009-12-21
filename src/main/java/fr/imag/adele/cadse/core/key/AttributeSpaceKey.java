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

import fr.imag.adele.cadse.core.Item;

public class AttributeSpaceKey extends AbstractSpaceKey {

	private Object[]	value;

	protected AttributeSpaceKey(Item source, AttributesSpaceKeyType type, ISpaceKey parentKey, Object... value) {
		super(source, type, parentKey);
		this.value = value;
	}

	public Object[] getValue() {
		return value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.key.ISpaceKey#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof AttributeSpaceKey) {
			return equals((AttributeSpaceKey) obj);
		}
		return super.equals(obj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.key.ISpaceKey#equals(fede.workspace.domain.key.SpaceKey)
	 */
	final protected boolean equals(AttributeSpaceKey obj) {
		if (obj.getType().equals(type)
				&& ((parentKey == null && obj.getParentSpaceKey() == null) || (parentKey
						.equals(obj.getParentSpaceKey())))) {
			Object[] v = obj.value;
			for (int i = 0; i < v.length; i++) {
				if (!(v[i].equals(value[i]))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	@Override
	protected int computeHashCode() {
		int h = type.getItemType().hashCode();
		if (parentKey != null) {
			h ^= parentKey.hashCode();
		}
		for (int i = 0; i < value.length; i++) {
			h ^= value[i].hashCode();
		}
		return h;
	}
}
