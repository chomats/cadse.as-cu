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
package fr.imag.adele.cadse.core.util;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.transaction.delta.ItemDelta;
import fr.imag.adele.cadse.core.transaction.delta.SetAttributeOperation;
import fr.imag.adele.cadse.core.transaction.AbstractLogicalWorkspaceTransactionListener;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;

public class ComputedAttributeWLWCListener extends AbstractLogicalWorkspaceTransactionListener {
	ItemType[]			itemTypes;
	IAttributeType<?>[]	attributes;

	public class ComplexAttributeState {
		Item[]	items;
	}

	public ComputedAttributeWLWCListener(ItemType[] itemTypes, IAttributeType<?>[] attributes) {
		super();
		this.itemTypes = itemTypes;
		this.attributes = attributes;

		for (ItemType type : itemTypes) {
			type.addLogicalWorkspaceTransactionListener(this);
		}
	}

	@Override
	public void notifyChangeAttribute(LogicalWorkspaceTransaction wc, ItemDelta item,
			SetAttributeOperation attOperation) throws CadseException {

		// Item goodItem = foundGoodItem(item, attOperation, att, at)
	}

	Item foundGoodItem(ItemDelta item, SetAttributeOperation attOperation, ItemType it, IAttributeType<?> at) {
		return null;
	}

}
