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

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.oper.annotation.OperParameter;
import fr.imag.adele.cadse.core.oper.annotation.OperTest;
import fr.imag.adele.cadse.core.oper.annotation.ParameterKind;

@OperTest(testMustBeStopped=false)
public class WSCheckAttribute extends WSCheckOperation {
	@OperParameter(constructorPosition=0, type = ParameterKind.item_ref)
	Item item;
	@OperParameter(constructorPosition=1, type = ParameterKind.string_value)
	String key;	
	@OperParameter(constructorPosition=2, type = ParameterKind.object_value, required=false)
	Object value;
	
	public WSCheckAttribute(Item item, String attributeName, Object value) {
		super();
		this.item = item;
		this.key = attributeName;
		this.value = value;
	}

	public WSCheckAttribute(Item item, String attributeName) {
		this.item = item;
		this.key = attributeName;
		this.value = item.getAttribute(key);
	}

	@Override
	protected void excecuteImpl() throws Throwable {
		Object attributeValue = item.getAttribute(key);
		if (!equals(attributeValue, value)) {
			throw new CadseException("attribute_not_equals","Attribute {0} not equal in {1}", null, key, item.getQualifiedDisplayName() );
		}
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
	
	@Override
	public String getDiplayComment() {
		return "check attribute "+key+" in "+item.getDisplayName();
	}
}
