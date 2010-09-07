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

import fr.imag.adele.cadse.core.CadseException;
import java.util.UUID;
import fr.imag.adele.cadse.core.ItemDescriptionRef;
import fr.imag.adele.cadse.core.LinkDescription;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.transaction.delta.WLWCOperationImpl;

public interface ILoggableAction {

	void actionAddItem(ItemDescriptionRef itemDescriptionRef) throws CadseException;

	void actionRemoveItem(ItemDescriptionRef itemDescriptionRef) throws CadseException;

	void actionAddLink(LinkDescription linkDescription) throws CadseException;

	void actionRemoveLink(LinkDescription linkDescription) throws CadseException;

	<T> void actionAddAttribute(UUID itemId, IAttributeType<T> key, T value) throws CadseException;

	<T> void actionChangeAttribute(UUID itemId, IAttributeType<T> key, T value) throws CadseException;

	<T> void actionRemoveAttribute(UUID itemId, IAttributeType<T> key) throws CadseException;

	<T> void actionAddAttribute(LinkDescription linkDescription, IAttributeType<T> key, T value) throws CadseException;

	<T> void actionChangeAttribute(LinkDescription linkDescription, IAttributeType<T> key, T value)
			throws CadseException;

	<T> void actionRemoveAttribute(LinkDescription linkDescription, IAttributeType<T> key) throws CadseException;

	void actionRemoveOperation(WLWCOperationImpl operation);

	void actionAddOperation(WLWCOperationImpl operation);
}
