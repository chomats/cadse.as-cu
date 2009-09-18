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

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.var.ContextVariable;

/**
 * Represents a context for a generation. It is a collection of
 * configuration properties.
 * 
 * Generation contexts can be organized hierarchically.
 * A child generation context inherit all configuration properties of its parent.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class GenContext extends ContextVariable implements IAttributable {

	/** The Constant REMOVE_VALUE. */
	public final static Object	REMOVE_VALUE	= new Object();

	/** The parent. */
	protected GenContext					_parent;

	/** The values. */
	protected Map<String, Object>			_values;

	/**
	 * Creates a new generation context.
	 * If it has no parent, specify a null parent.
	 * 
	 * @param parent parent of newly generation context
	 */
	public GenContext(GenContext parent) {
		_parent = parent;
		_values = new HashMap<String, Object>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IAttributable#getAttribute(java.lang.String,
	 *      java.lang.Object)
	 */
	public <T> T getAttributeWithDefaultValue(String key, T defaultValue) {
		T ret = null;
		if (_values != null) {
			ret = (T) _values.get(key);
			if (ret != null) {
				return ret;
			}
		}
		if (_parent != null) {
			return _parent.getAttributeWithDefaultValue(key, defaultValue);
		}
		return defaultValue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IAttributable#getAttribute(java.lang.String)
	 */
	public <T> T getAttribute(String key) {
		return (T) getAttributeWithDefaultValue(key, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IAttributable#getAttributeKeys()
	 */
	public String[] getAttributeKeys() {
		Set<String> keys = _values.keySet();
		return keys.toArray(new String[keys.size()]);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IAttributable#setAttribute(java.lang.String,
	 *      java.lang.Object)
	 */
	public void setAttribute(String key, Object value) {

		if (_values == null) {
			if (value == REMOVE_VALUE) {
				return;
			}

			_values = new HashMap<String, Object>();
		}
		if (value == REMOVE_VALUE) {
			_values.remove(key);
		} else {
			_values.put(key, value);
		}
	}

	public <T> T getAttributeH(String key, boolean fromSuperIfNull) {
		return (T) getAttributeWithDefaultValue(key, null);
	}

	public boolean isTWAttributeModified(IAttributeType<?> att) {
		return false;
	}

	public <T> T getAttribute(IAttributeType<T> att) {
		return (T) getAttribute(att.getName());
	}

	public <T> T getAttributeOwner(IAttributeType<T> att) {
		return (T) getAttribute(att.getName());
	}

	public <T> T getAttributeWithDefaultValue(IAttributeType<T> att, T defaultValue) {
		return getAttributeWithDefaultValue(att.getName(), defaultValue);
	}

	public void setAttribute(IAttributeType<?> att, Object value) throws CadseException {
		setAttribute(att.getName(), value);
	}
}
