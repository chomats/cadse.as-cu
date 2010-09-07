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
import fr.imag.adele.cadse.core.LogicalWorkspace;
import fr.imag.adele.cadse.core.oper.annotation.OperParameter;
import fr.imag.adele.cadse.core.oper.annotation.OperTest;
import fr.imag.adele.cadse.core.oper.annotation.ParameterKind;

@OperTest(testMustBeStopped = false)
public class WSCheckItem extends WSCheckOperation {
	@OperParameter(constructorPosition = 0, type = ParameterKind.wl)
	LogicalWorkspace	wl;
	@OperParameter(constructorPosition = 1, type = ParameterKind.string_value)
	String				handleIdentifier;

	public WSCheckItem(Item item) throws CadseException {
		wl = item.getLogicalWorkspace();
		// handleIdentifier = item.getHandleIdentifier();
	}

	public WSCheckItem(LogicalWorkspace wl, String handleIdentifier) {
		super();
		this.wl = wl;
		this.handleIdentifier = handleIdentifier;
	}

	@Override
	protected void excecuteImpl() throws Throwable {
		throw new CadseException("Cannot found Item with handle identifier : " + handleIdentifier);
	}

	public String getHandleIdentifier() {
		return handleIdentifier;
	}

	@Override
	public String getDiplayComment() {
		return "check item with internal identifier " + handleIdentifier;
	}
}
