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
package fr.imag.adele.cadse.core.oper;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.oper.annotation.OperParameter;
import fr.imag.adele.cadse.core.oper.annotation.OperTest;
import fr.imag.adele.cadse.core.oper.annotation.ParameterKind;

@OperTest(testMustBeStopped = true)
public class WSOSetAttribute extends WSOperation {

	@OperParameter(constructorPosition = 0, type = ParameterKind.item_ref)
	private Item		item;
	@OperParameter(constructorPosition = 1, type = ParameterKind.string_value)
	private String		key;

	IAttributeType<?>	_attribute_type;

	@OperParameter(constructorPosition = 2, type = ParameterKind.object_value)
	private Object		value;

	public WSOSetAttribute(Item item, String key, Object value) {
		this.item = item;
		this.key = key;

		this.value = value;
	}

	public WSOSetAttribute(Item item, IAttributeType<?> key, Object value) {
		this.item = item;
		this.key = key.getName();
		_attribute_type = key;
		this.value = value;
	}

	@Override
	protected void excecuteImpl() throws Throwable {
		if (_attribute_type != null) {
			item.setAttribute(_attribute_type, value);
		} else {
			item.setAttribute(key, value);
		}
	}

	@Override
	public String getDiplayComment() {
		return "SetAttribute " + key + " in " + item.getDisplayName();
	}

	public Item getItem() {
		return item;
	}

	public String getKey() {
		return key;
	}

	public Object getValue() {
		return value;
	}

}
