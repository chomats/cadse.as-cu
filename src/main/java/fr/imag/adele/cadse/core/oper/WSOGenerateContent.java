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

import fr.imag.adele.cadse.core.IGenerateContent;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.content.FacetteItemContent;
import fr.imag.adele.cadse.core.oper.annotation.OperParameter;
import fr.imag.adele.cadse.core.oper.annotation.OperTest;
import fr.imag.adele.cadse.core.oper.annotation.ParameterKind;
import fr.imag.adele.cadse.core.var.ContextVariableImpl;

@OperTest(testMustBeStopped = true)
public class WSOGenerateContent extends WSOperation {
	@OperParameter(constructorPosition = 0, type = ParameterKind.item_ref)
	Item	item;

	public WSOGenerateContent(Item item) {
		super();
		this.item = item;
	}

	@Override
	protected void excecuteImpl() throws Throwable {
		((IGenerateContent) item.getContentItem()).generate(ContextVariableImpl.DEFAULT);
	}

	@Override
	public String getDiplayComment() {
		return "Generate content " + item.getDisplayName();
	}

	public Item getItem() {
		return item;
	}
}
