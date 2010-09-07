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
package fr.imag.adele.cadse.core.internal;

import fr.imag.adele.cadse.core.CFactory;
import fr.imag.adele.cadse.core.CPackage;
import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.TypeDefinition;

public class CFactoryImpl implements CFactory {

	@Override
	public TypeDefinition createEClass(int typeInPackage, CPackage cPackage,
			int idInPackage, long itemMsb, long itemLsb, String qname,
			String name) throws CadseException {
		TypeDefinition ret = (TypeDefinition) create(typeInPackage);
		ret.setName(name);
		ret.setQualifiedName(qname);
		ret.setUUID(itemMsb, itemLsb);
		ret.setIdInPackage(idInPackage);
		cPackage.addTypeDefintion(ret);
		return ret;
	}

	public Item create(int eClassIdInPackage) {
		return null;
	}

	@Override
	public Item create(ItemType attributeTypeId) {
		return create(attributeTypeId.getIdInPackage());
	}
	
	protected Item getDefaultImplementation() {
		// TODO Auto-generated method stub
		return null;
	}
}
