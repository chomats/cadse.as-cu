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

import java.util.Collection;

import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.internal.delta.InternalItemOrLinkDelta;

public interface ItemOrLinkDelta extends WLWCOperation, InternalItemOrLinkDelta {

	public abstract CreateOperation getCreateOperation();

	public abstract DeleteOperation getDeleteOperation();

	public abstract boolean isAdded();

	public abstract boolean isDeleted();

	public Collection<SetAttributeOperation> getSetAttributeOperation();

	<T> T getAttribute(IAttributeType<T> key);

	<T> T getAttribute(IAttributeType<T> key, boolean returnDefault);

	/**
	 * Gets an attribute value by its type (definition).
	 * 
	 * @param att
	 *            definition of the attribute we want to search
	 * @param defaultValue
	 *            returned value if the value of the attribute definition we
	 *            want to search is null
	 * 
	 * @return the value of the attribute definition or the defaultValue, if
	 *         null
	 */
	public abstract <T> T getAttributeWithDefaultValue(IAttributeType<T> att, T defaultValue);

	SetAttributeOperation getSetAttributeOperation(IAttributeType<?> key);

}