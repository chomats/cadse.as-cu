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
package fr.imag.adele.cadse.core.var;

import java.util.HashMap;
import java.util.Map;

import fr.imag.adele.cadse.core.CadseGCST;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * Represents a context. It is a collection of configuration properties per
 * item.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class ContextVariableImpl implements ContextVariable {

	/** The Constant DEFAULT. */
	public static final ContextVariableImpl	DEFAULT	= new ContextVariableImpl() {
													@Override
													public void putValue(Item item, IAttributeType<String> key,
															String value) {
														throw new IllegalArgumentException("It's a readonly context");
													};
												};

	/** The values. */
	protected Map<String, String>		_values	= new HashMap<String, String>();

	public ContextVariableImpl(boolean b) {
		_generated = b;
	}

	public ContextVariableImpl() {
	}

	/**
	 * Returns <code>att</code> attribute value of <code>item</code> item
	 * defined in this context. If it is not defined in this context, return
	 * <code>att</code> attribute value of <code>item</code> item in
	 * corresponding logical workspace.
	 * 
	 * @param item
	 *            an item
	 * @param att
	 *            an item attribute definition
	 * @return <code>att</code> attribute value of <code>item</code> item
	 *         defined in this context.
	 */
	public String getAttribute(Item item, IAttributeType<String> att) {
		String ret = _values.get(item.getId().toString() + att.getId());
		if (ret != null) {
			return ret;
		}
		return item.getAttribute(att);
	}

	/**
	 * Returns <code>attrName</code> attribute value of <code>item</code> item
	 * defined in this context. If it is not defined in this context, return
	 * <code>attrName</code> attribute value of <code>item</code> item in
	 * corresponding logical workspace.
	 * 
	 * @param item
	 *            an item
	 * @param attrName
	 *            name of an item attribute
	 * @return <code>attrName</code> attribute value of <code>item</code> item
	 *         defined in this context.
	 */
	public String getValue(Item item, IAttributeType<String> key) {
		String ret = _values.get(item.getId().toString() + key.getId());
		if (ret != null) {
			return ret;
		}
		return item.getAttribute(key);
	}

	/**
	 * Defines <code>attr</code> attribute value of <code>item</code> item.
	 * 
	 * @param item
	 *            an item
	 * @param attr
	 *            an item attribute definition
	 * @param value
	 *            attribute value
	 */
	public void putValue(Item item, IAttributeType<String> attr, String value) {
		_values.put(item.getId() + attr.getName(), value);
	}

	/**
	 * Returns short name of <code>item</code> item defined in this context. If
	 * it is not defined in this context, return short name of <code>item</code>
	 * item in corresponding logical workspace.
	 * 
	 * @param item
	 *            an item
	 * @return short name of <code>item</code> item defined in this context.
	 */
	public String getName(Item item) {
		String ret = _values.get(item.getId().toString() + CadseGCST.ITEM_at_NAME);
		if (ret != null) {
			return ret;
		}
		return item.getName();
	}

	/**
	 * Returns unique name of <code>item</code> item defined in this context. If
	 * it is not defined in this context, return unique name of
	 * <code>item</code> item in corresponding logical workspace.
	 * 
	 * @param item
	 *            an item
	 * @return unique name of <code>item</code> item defined in this context.
	 */

	public String getQualifiedName(Item item) {
		String ret = _values.get(item.getId().toString() + CadseGCST.ITEM_at_NAME);
		if (ret != null) {
			return ret;
		}
		return item.getQualifiedName();
	}

	boolean	_generated	= true;

	public boolean isGenerated() {
		return _generated;
	}

	public void setGenerated(boolean generated) {
		_generated = generated;
	}

}
