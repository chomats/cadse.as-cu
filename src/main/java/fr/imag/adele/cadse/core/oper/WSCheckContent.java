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
package fr.imag.adele.cadse.core.oper;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.content.ContentItem;
import fr.imag.adele.cadse.core.content.FacetteItemContent;
import fr.imag.adele.cadse.core.oper.annotation.OperParameter;
import fr.imag.adele.cadse.core.oper.annotation.OperTest;
import fr.imag.adele.cadse.core.oper.annotation.ParameterKind;

@OperTest(testMustBeStopped = false)
public class WSCheckContent extends WSCheckOperation {
	@OperParameter(constructorPosition = 0, type = ParameterKind.item_ref)
	Item	item;
	@OperParameter(constructorPosition = 1, type = ParameterKind.string_value)
	String	qualifiedClassName;

	public WSCheckContent(Item item, String qualifiedClassName) {
		super();
		this.item = item;
		this.qualifiedClassName = qualifiedClassName;
	}

	@Override
	protected void excecuteImpl() throws Throwable {
		ContentItem cm = item.getContentItem();
		if (!isEquals(cm)) {
			throw new CadseException("content_not_equals", "Content not equal in {0}", null, item
					.getQualifiedDisplayName());
		}
	}

	private boolean isEquals(ContentItem cm) {
		if (cm == null && qualifiedClassName == null)
			return true;
		if (cm != null)
			return cm.getClass().getName().equals(qualifiedClassName);
		return false;
	}

	public Item getItem() {
		return item;
	}

	public String getQualifiedClassName() {
		return qualifiedClassName;
	}

	@Override
	public String getDiplayComment() {
		return "check content for " + item.getDisplayName();
	}
}
