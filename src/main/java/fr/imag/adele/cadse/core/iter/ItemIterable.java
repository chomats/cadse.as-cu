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
package fr.imag.adele.cadse.core.iter;

import java.util.Iterator;

import fr.imag.adele.cadse.core.CadseError;
import fr.imag.adele.cadse.core.CadseIllegalArgumentException;
import fr.imag.adele.cadse.core.GenContext;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.var.ContextVariable;
import fr.imag.adele.cadse.objectadapter.ObjectAdapter;

public class ItemIterable extends ObjectAdapter<ItemIterable> implements Iterable<Item>, Iterator<Item> {

	
	public void beginAll(Item currentItem,
			ContextVariable context) {
		
	}

	
	public void endAll(Item currentItem,
			ContextVariable context) {
		
	}

	@Override
	public Iterator<Item> iterator() {
		return this;
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Item next() {
		return null;
	}

	@Override
	public void remove() {
		
	}

	@Override
	public Class<ItemIterable> getClassAdapt() {
		return ItemIterable.class;
	}


	public ItemIterable cloneIter() {
		try {
			return this.getClass().newInstance();
		} catch (InstantiationException e) {
			throw new CadseIllegalArgumentException("Cannot clone iter "+getClass(), e);
		} catch (IllegalAccessException e) {
			throw new CadseIllegalArgumentException("Cannot clone iter "+getClass(), e);
		}
	}

}
