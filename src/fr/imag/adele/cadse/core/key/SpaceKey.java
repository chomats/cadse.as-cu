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

/**
 * The Class SpaceKey.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class SpaceKey extends AbstractSpaceKey implements ISpaceKey {

	/** The name. */
	protected String	name;
	int					_h	= 0;

	/**
	 * Instantiates a new space key.
	 * 
	 * @param source
	 *            the source
	 * @param type
	 *            the type
	 * @param name
	 *            the name
	 * @param parentKey
	 *            the parent key
	 */
	protected SpaceKey(Item source, SpaceKeyType type, String name, ISpaceKey parentKey) {
		super(source, type, parentKey);
		if (name == null) {
			throw new NullPointerException("name is null");
		}
		if (type == null) {
			throw new NullPointerException("space key type is null");
		}
		if (type.getItemType() == null) {
			throw new NullPointerException("type of space key type is null");
		}

		this.name = name;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.key.ISpaceKey#getName()
	 */
	@Override
	final public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.key.ISpaceKey#equals(fede.workspace.domain.key.SpaceKey)
	 */
	final protected boolean equals(ISpaceKey obj) {
		return obj.getType().equals(type)
				&& obj.getName().equals(name)
				&& ((parentKey == null && obj.getParentSpaceKey() == null) || (parentKey
						.equals(obj.getParentSpaceKey())));
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
		if (obj instanceof SpaceKey) {
			return equals((SpaceKey) obj);
		}
		return super.equals(obj);
	}

	@Override
	protected int computeHashCode() {
		int h = name.hashCode() ^ type.getItemType().hashCode();
		if (parentKey != null) {
			h ^= parentKey.hashCode();
		}
		return h;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.key.ISpaceKey#setName(java.lang.String)
	 */
	@Override
	public void setName(String shortName) {
		this.name = shortName;
	}

}
