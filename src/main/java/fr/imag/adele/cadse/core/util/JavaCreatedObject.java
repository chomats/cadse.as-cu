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
import java.util.logging.Level;
import java.util.logging.Logger;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;

final public class JavaCreatedObject implements CreatedObject {
	private Map<ItemType, Class<?>>				ITEMTYPE_TO_RUNNING_IMPL	= new HashMap<ItemType, Class<?>>();	
	private Map<Item, Class<?>>				ITEM_TO_RUNNING_IMPL	= new HashMap<Item, Class<?>>();	
	CreatedObject _superCreate =  null;
	
	public JavaCreatedObject(CreatedObject superCreate) {
		_superCreate = superCreate;
	}
	
	public <T> void register(ItemType it, Class<T> clazz) {
		ITEMTYPE_TO_RUNNING_IMPL.put(it, clazz);
	}
	
	public <T> T create(Item item) {
		Class<?> clazz = ITEM_TO_RUNNING_IMPL.get(item);
		
		if (clazz == null)
			clazz = ITEMTYPE_TO_RUNNING_IMPL.get(item.getType());
		
		if (clazz == null) {
			if (_superCreate != null)
				return (T) _superCreate.create(item);
			return null;
		}
		try {
			return (T) clazz.newInstance();
		} catch (SecurityException e) {
			log("Cannot create instance of " + clazz, e);
		} catch (IllegalArgumentException e) {
			log("Cannot create instance of " + clazz, e);
		} catch (InstantiationException e) {
			log("Cannot create instance of " + clazz, e);
		} catch (IllegalAccessException e) {
			log("Cannot create instance of " + clazz, e);
		}
		return null;
	}
	
	public void log(String msg, Throwable e) {
		Logger.getLogger("uiPlatform").log(Level.SEVERE, msg, e);
	}

	public <T> void register(Item item, Class<T> clazz) {
		ITEM_TO_RUNNING_IMPL.put(item, clazz);
	}
}
