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
package fr.imag.adele.cadse.core.key;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.INamed;
import fr.imag.adele.cadse.core.INamedUUID;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * 
 * @author chomats
 */
public interface KeyDefinition extends INamedUUID, INamed {

	public IAttributeType<?>[] getKeyElements();

	public KeyDefinition getParentKey();

	public Key computeKey(Key parentKey, Object... key_attributes) throws CadseException;

	public Key computeKey(Item item) throws CadseException;

	public void getQualifiedString(Key key, StringBuilder sb);

	public ItemType getItemType();

	public String getName(Key key);

    public int hashNameAttribute();
    
    public String convertName(String name);
}
