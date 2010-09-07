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
package fr.imag.adele.cadse.core.internal.attribute;

import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.attribute.SetAttrVal;

/**
 * Default implementation of an attribute assignment description. It is an
 * immutable object.
 * 
 * @author Thomas
 * 
 */
public class SetAttrValImpl<T> implements SetAttrVal<T> {

	private IAttributeType<T>	_attrType;
	private String				_attrName;
	private T					_attrVal;

	public SetAttrValImpl(IAttributeType<T> attrType, T val) {
		this(attrType.getName(), val);
		_attrType = attrType;
	}

	public SetAttrValImpl(String attrName, T val) {
		_attrName = attrName;
		_attrVal = val;
	}

	public IAttributeType<T> getAttrDef() {
		return _attrType;
	}

	public String getAttrName() {
		return _attrName;
	}

	public T getValue() {
		return _attrVal;
	}

}
