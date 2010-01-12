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
package fr.imag.adele.cadse.core.internal;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.CompactUUID;
import fr.imag.adele.cadse.core.ItemDescriptionRef;
import fr.imag.adele.cadse.core.LinkDescription;
import fr.imag.adele.cadse.core.delta.WLWCOperationImpl;

public interface ILoggableAction {

	
	void actionAddItem(ItemDescriptionRef itemDescriptionRef) throws CadseException;
	
	void actionRemoveItem(ItemDescriptionRef itemDescriptionRef) throws CadseException;
	
	void actionAddLink(LinkDescription linkDescription) throws CadseException;
	void actionRemoveLink(LinkDescription linkDescription) throws CadseException;
	
	void actionAddAttribute(CompactUUID itemId, String key, Object value) throws CadseException;
	//<T> void actionAddAttribute(CompactUUID itemId, IAttributeType<T> key, T value) throws CadseException;
	void actionChangeAttribute(CompactUUID itemId, String key, Object value) throws CadseException;
	//<T> void actionChangeAttribute(CompactUUID itemId, IAttributeType<T> key, T value) throws CadseException;
	void actionRemoveAttribute(CompactUUID itemId, String key) throws CadseException;
	//<T> void actionRemoveAttribute(CompactUUID itemId, IAttributeType<T> key) throws CadseException;
	
	void actionAddAttribute(LinkDescription linkDescription, String key, Object value) throws CadseException;
	//<T> void actionAddAttribute(LinkDescription linkDescription, IAttributeType<T> key, T value) throws CadseException;
	void actionChangeAttribute(LinkDescription linkDescription, String key, Object value) throws CadseException;
	//<T> void actionChangeAttribute(LinkDescription linkDescription, IAttributeType<T> key, T value) throws CadseException;
	void actionRemoveAttribute(LinkDescription linkDescription, String key) throws CadseException;
	//<T> void actionRemoveAttribute(LinkDescription linkDescription, IAttributeType<T> key) throws CadseException;

	void actionRemoveOperation(WLWCOperationImpl operation);
	void actionAddOperation(WLWCOperationImpl operation);
}
