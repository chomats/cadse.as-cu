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

import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * Can get and set attribute value for an object. An {@link Item} is IAttributable.
 */
public interface IAttributable {

	/**
	 * Gets an attribute value by its type (definition).
	 * 
	 * @param att
	 *            definition of the attribute we want to search
	 * @param defaultValue
	 *            returned value if the value of the attribute definition we
	 *            want to search is null
	 * 
	 * @return the value of the attribute definition or the defaultValue, if
	 *         null
	 */
	public abstract <T> T getAttributeWithDefaultValue(IAttributeType<T> att, T defaultValue);

	/**
	 * Gets an attribute value by its type (definition).
	 * 
	 * @param att
	 *            definition of the attribute we want to search
	 * 
	 * @return the value of the attribute definition or null, if no value
	 */
	public abstract <T> T getAttribute(IAttributeType<T> att);

	/**
	 * Gets an attribute value by its type (definition). Search only into the
	 * owned attributes of this object. Doesn't looks for inherited or
	 * propagated attributes value.
	 * 
	 * @param att
	 *            definition of the attribute we want to search
	 * 
	 * @return the value of the attribute definition or null, if no value
	 */
	public abstract <T> T getAttributeOwner(IAttributeType<T> att);

	/**
	 * Return true if the value of the attribute definition given into parameter
	 * is considered as modified by the versioning system.
	 * 
	 * @param att
	 *            attribute definition
	 * @return a boolean
	 */
	public abstract boolean isTWAttributeModified(IAttributeType<?> att);

	/**
	 * Sets a value into this object for the attribute definition given into
	 * parameter.
	 * 
	 * @param att
	 *            the attribute definition we want to set
	 * @param value
	 *            the new value
	 * @throws CadseException
	 */
	public abstract void setAttribute(IAttributeType<?> att, Object value) throws CadseException;

	/**
	 * Gets an attribute value by its type (definition).
	 * 
	 * @param att
	 *            the attribute name we want to search
	 * @param defaultValue
	 *            returned value if the value of the attribute definition we
	 *            want to search is null
	 * 
	 * @return the value of the attribute definition or the defaultValue, if
	 *         null
	 */
	@Deprecated
	public abstract <T> T getAttributeWithDefaultValue(String att, T defaultValue);

	/**
	 * Gets an attribute value by its type (definition).
	 * 
	 * @param att
	 *            the attribute name we want to search
	 * 
	 * @return the value of the attribute definition or null, if no value
	 */
	@Deprecated
	public abstract <T> T getAttribute(String att);

	/**
	 * Gets all the attribute definition names.
	 * 
	 * @return all the attribute definition names
	 */
	@Deprecated
	public abstract String[] getAttributeKeys();

	/**
	 * Sets a value into this object for the attribute definition given into
	 * parameter.
	 * 
	 * @param att
	 *            the attribute name we want to set
	 * @param value
	 *            the new value
	 * @throws CadseException
	 */
	@Deprecated
	public abstract void setAttribute(String att, Object value) throws CadseException;

	/**
	 * Get an attribute value by att.
	 * 
	 * @param att :
	 *            att of attribute we want search.
	 * @param fromSuperIfNull :
	 *            if the attribute value doesn't exist in this item, try to get
	 *            form "super items"
	 * 
	 * @return attribute value.
	 */
	@Deprecated
	public abstract <T> T getAttributeH(String att, boolean fromSuperIfNull);

}