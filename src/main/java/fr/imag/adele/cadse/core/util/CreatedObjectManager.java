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

import java.util.HashMap;
import java.util.Map;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
public abstract class CreatedObjectManager {
	static public JavaCreatedObject DEFAULTObjectMANAGER = new JavaCreatedObject(null);
	
	static private Map<Class<?>, CreatedObject>		PLATFORME_;	
	
	static public CreatedObject getManager(Item desc, Class platform) {
		CreatedObject ret = PLATFORME_.get(platform);
		if (ret == null)
			ret = DEFAULTObjectMANAGER;
		return ret;
	}
	
	static public <T> void defaultregister(ItemType it, Class<T> clazz) {
		DEFAULTObjectMANAGER.register(it, clazz);
	}
	
	static public <T> void registerPlatform(Class<T> clazz, CreatedObject manager) {
		if (PLATFORME_ == null) {
			PLATFORME_	= new HashMap<Class<?>, CreatedObject>();	
			PLATFORME_.put(CreatedObjectManager.class, DEFAULTObjectMANAGER);
		}
		PLATFORME_.put(clazz, manager);
	}

	public static Item register(CreatedObject platform, Item item, Class<?> clazz) {
		if (platform != null)
			platform.register(item, clazz);
		else
			DEFAULTObjectMANAGER.register(item, clazz);
		return item;
	}
	
	public static Item register(CreatedObject platform, ItemType item, Class<?> clazz) {
		if (platform != null)
			platform.register(item, clazz);
		else
			DEFAULTObjectMANAGER.register(item, clazz);
		return item;
	}
}
