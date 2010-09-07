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
package fr.imag.adele.cadse.core.transaction.delta;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.LogicalWorkspace;
import fr.imag.adele.cadse.util.ArraysUtil;

public abstract class MappingOperation extends WLWCOperationImpl {
	MappingOperation[]	beforeOperation	= null;

	public MappingOperation(ItemDelta parent) throws CadseException {
		super(OperationTypeCst.MAPPING_OPERATION, parent);
		parent.addMappingOperaion(this);
	}

	/**
	 * Ajoute les operation qui doivent etre commiter avent celle-ci
	 * 
	 * @param mappingOperation
	 */
	public void addBeforeMappingOperation(MappingOperation mappingOperation) {
		this.beforeOperation = ArraysUtil.add(MappingOperation.class, this.beforeOperation, mappingOperation);
	}

	public MappingOperation[] getBeforeOperation() {
		return beforeOperation;
	}

	public abstract void commit(LogicalWorkspace wl, Item goodItem);

	public void toStringShort(StringBuilder sb) {
		sb.append("mapping-operation ").append(getLabel());
	}

	@Override
	public ItemDelta getParentOperDelta() {
		return (ItemDelta) super.getParentOperDelta();
	}

	abstract protected String getLabel();
}
