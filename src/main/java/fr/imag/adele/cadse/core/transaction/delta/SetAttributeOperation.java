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

import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.internal.delta.InternalSetAttributeOperation;

public interface SetAttributeOperation extends WLWCOperation, InternalSetAttributeOperation {

	/**
	 * Return name of changed attribute.
	 * 
	 * @return name of changed attribute.
	 */
	String getAttributeName();

	/**
	 * Return current value of attribute. Null it the value is deleted
	 * (undefined)
	 * 
	 * @return current value of attribute.
	 */
	Object getCurrentValue();

	/**
	 * Return old value of attribute in the workspace logique or null if the
	 * value operation is new
	 * 
	 * @return old value of attribute.
	 */
	Object getOldValue();

	/**
	 * Return true if attribute and its value have just been added to the item.
	 * 
	 * @return true if attribute and its value have just been added to the item.
	 */
	boolean isAdded();

	/**
	 * Return true if old attribute value and new one are considered as not
	 * equals.
	 * 
	 * @return true if old attribute value and new one are considered as not
	 *         equals.
	 */
	boolean isChanged();

	/**
	 * Return true if attribute and its value have just been removed to the
	 * item.
	 * 
	 * @return true if attribute and its value have just been removed to the
	 *         item.
	 */
	boolean isRemoved();

	IAttributeType<?> getAttributeDefinition();

	/**
	 * 
	 * @return the precedent current value or the old value at the first time
	 */
	Object getPrecCurrentValue();

}