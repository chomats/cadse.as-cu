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

import fr.imag.adele.cadse.core.ItemDescription;
import fr.imag.adele.cadse.core.oper.annotation.OperParameter;
import fr.imag.adele.cadse.core.oper.annotation.OperTest;
import fr.imag.adele.cadse.core.oper.annotation.ParameterKind;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;

@OperTest(testMustBeStopped = true, name = "WSCreateItem")
public class WSOCommitItem extends WSOperation {
	private LogicalWorkspaceTransaction	copy;

	@OperParameter(constructorPosition = 0, type = ParameterKind.item_desc)
	private ItemDescription				desc;

	public WSOCommitItem(LogicalWorkspaceTransaction copy) {
		this.copy = copy;
		// copy.getite
		// this.desc = new ItemDescription(anItem);
	}

	@Override
	protected void excecuteImpl() throws Throwable {
		copy.commit();
	}

	public ItemDescription getItem() {
		return desc;
	}

	public ItemDescription getDesc() {
		return desc;
	}

	public Class<?> getType() {
		return WSOCommitItem.class;
	}

	@Override
	public String getDiplayComment() {
		return "an modification of wokspace";
		// return
		// "create item "+anItem.getShortName()+" of "+anItem.getType().getShortName();
	}
}
