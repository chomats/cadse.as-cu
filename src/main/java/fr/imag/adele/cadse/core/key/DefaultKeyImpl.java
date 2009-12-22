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

import fr.imag.adele.cadse.core.CadseIllegalArgumentException;
import java.util.UUID;

import java.util.UUID;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.util.Convert;

public class DefaultKeyImpl implements Key {

	private static final class PrivateSpaceKey implements Key {

		final String	_name;

		PrivateSpaceKey(String name) {
			_name = name;
		}

		public boolean equals(Key obj) {
			return obj == this;
		}

		public String getName() {
			return _name;
		}

		public Key getParentSpaceKey() {
			return null;
		}

		public KeyDefinition getType() {
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

		public void addChild(Key child) {
			throw new UnsupportedOperationException();
		}

		public void dispose() {
			throw new UnsupportedOperationException();
		}

		public Key[] getChildrenKey() {
			return null;
		}

		public Key clone(IAttributeType<?> attributeType, Object currentValue) {
			throw new UnsupportedOperationException();
		}

		@Override
		public Key getParentKey() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public <T> T getValue(int i) {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public UUID getId() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

        @Override
        public int getObjectId() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

		@Override
		public void setUUID(long uuidMsb, long uuidLsb) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setUUID(UUID uuid) {
			// TODO Auto-generated method stub
			
		}

	}

	public static FacetteLWKey					_lw;
	/** The type. */
	protected final KeyDefinition	_keydefinition;
	/** The parent key. */
	protected final Key				_parentKey;

	protected UUID					_uuid;
	protected int					_objectid;
	protected Object[]				_values;
	private int						_h;

	/** The Constant NO_INIT_KEY. */
	public static final Key			NO_INIT_KEY	= new PrivateSpaceKey("<no init key>");
	/** The Constant INVALID. */
	public static final Key			INVALID		= new PrivateSpaceKey("<invalid key>");

	public DefaultKeyImpl(KeyDefinition keydefinition, Key parentKey, Object... values) {
		this._keydefinition = keydefinition;
		this._parentKey = parentKey;

	}

	public final KeyDefinition getType() {
		return _keydefinition;
	}

	public final Key getParentKey() {
		return _parentKey;
	}

	public final Key[] getChildrenKey() {
		return _lw.getChildrenKey(this);
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
		_keydefinition.getQualifiedString(this, sb);
	}

	/**
	 * sn{sn{sn}}.
	 * 
	 * @return the qualified string
	 */
	public String getQualifiedString() {
		StringBuilder sb = new StringBuilder();
		_keydefinition.getQualifiedString(this, sb);
		return sb.toString();

	}

	@Override
	public <T> T getValue(int i) {
		return (T) _values[i];
	}

    @Override
    public void setName(String name) {
        int index = _keydefinition.hashNameAttribute();
        if (index == -1) throw  new CadseIllegalArgumentException("Cannot set name : not supported.");
        _values[index] = name;
    }



	@Override
	public boolean equals(Key k) {
		if (getType() == k.getType()) {
			for (int i = 0; i < _values.length; i++) {
				Object v = _values[i];
				if (!Convert.equals(v, k.getValue(i)))
					return false;
			}
			return true;
		}
		return false;
	}

	@Override
	public UUID getId() {
		return _uuid;
	}

	@Override
	public int getObjectId() {
		return _objectid;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.key.Key#hashCode()
	 */
	@Override
	public int hashCode() {
		if (_h == 0) {
			computeHashCode();
		}

		return _h;
	}

	protected int computeHashCode() {
		_h = 0;
		if (_parentKey != null)
			_h = _parentKey.hashCode();
		for (int i = 0; i < _values.length; i++) {
			_h = _h ^ (_values[i] == null ? -1 : _values[i].hashCode());

		}
		return _h;
	}

	public void dispose() {
	}
        
    @Override
    public void setUUID(long itemMsb, long itemLsb) {
        _uuid = new UUID(itemMsb, itemLsb);
    }

	@Override
	public void setUUID(UUID uuid) {
		_uuid = uuid;
		
	}

	@Override
	public String getName() {
		return _keydefinition.getName(this);
	}
}