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
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.util.ArraysUtil;

public class AbstractSpaceKey implements ISpaceKey {

	private static final class PrivateSpaceKey implements ISpaceKey {

		final String	_name;

		PrivateSpaceKey(String name) {
			_name = name;
		}

		public boolean equals(ISpaceKey obj) {
			return obj == this;
		}

		public String getName() {
			return _name;
		}

		public ISpaceKey getParentSpaceKey() {
			return null;
		}

		public SpaceKeyType getType() {
			return null;
		}

		public void setName(String shortName) {
			throw new UnsupportedOperationException();
		}

		public void getQualifiedString(StringBuilder sb) {
			sb.append(getName());
		}

		public void toString(StringBuilder sb) {
			sb.append(getName());
		}

		public String getQualifiedString() {
			return getName();
		}

		public void addChild(ISpaceKey child) {
			throw new UnsupportedOperationException();
		}

		public void dispose() {
			throw new UnsupportedOperationException();
		}

		public ISpaceKey[] getChildrenKey() {
			return null;
		}

		public ISpaceKey clone(IAttributeType<?> attributeType, Object currentValue) {
			throw new UnsupportedOperationException();
		}
	}

	/** The type. */
	protected final SpaceKeyType	type;
	/** The parent key. */
	protected final ISpaceKey		parentKey;
	/** The source. */
	protected Item					source;

	protected int					_h			= 0;
	private ISpaceKey[]				_children;

	/** The Constant NO_INIT_KEY. */
	public static final ISpaceKey	NO_INIT_KEY	= new PrivateSpaceKey("<no init key>");
	/** The Constant INVALID. */
	public static final ISpaceKey	INVALID		= new PrivateSpaceKey("<invalid key>");

	public AbstractSpaceKey(Item source, SpaceKeyType type, ISpaceKey parentKey) {
		this.type = type;
		this.parentKey = parentKey;
		if (parentKey != null) {
			parentKey.addChild(this);
		}
		this.source = source;
	}

	public final SpaceKeyType getType() {
		return type;
	}

	public final ISpaceKey getParentSpaceKey() {
		return parentKey;
	}

	public final ISpaceKey[] getChildrenKey() {
		return _children;
	}

	@Override
	public final String toString() {
		return getQualifiedString();
	}

	/**
	 * sn{sn{sn}}.
	 * 
	 * @param sb
	 *            the sb
	 */
	public final void toString(StringBuilder sb) {
		getQualifiedString(sb);

	}

	/**
	 * sn{sn{sn}}.
	 * 
	 * @param sb
	 *            the sb
	 */
	public void getQualifiedString(StringBuilder sb) {
		type.getQualifiedString(this, sb);
	}

	/**
	 * sn{sn{sn}}.
	 * 
	 * @return the qualified string
	 */
	public String getQualifiedString() {
		return type.getQualifiedString(this);

	}

	/**
	 * Gets the source.
	 * 
	 * @return the source
	 */
	public Item getSource() {
		return source;
	}

	public String getName() {
		return null;
	}

	public void setName(String shortName) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.key.ISpaceKey#hashCode()
	 */
	@Override
	public int hashCode() {
		if (_h == 0) {
			_h = computeHashCode();
		}

		return _h;
	}

	protected int computeHashCode() {
		return 0;
	}

	public void addChild(ISpaceKey child) {
		_children = ArraysUtil.add(ISpaceKey.class, _children, child);
	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

}