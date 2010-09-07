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

import java.util.ArrayList;
import java.util.Iterator;

import fr.imag.adele.cadse.core.GenContext;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.var.ContextVariable;

public class ItemLinkIterable extends ItemIterable {
	Item _next = null;
	private Iterator<Link> _linkIterator;
	
	public ItemLinkIterable(Item currentItem, LinkType linkID) {
		ArrayList<Link> arrayList = new ArrayList<Link>(currentItem.getOutgoingLinks(linkID));
		_linkIterator = arrayList.iterator();
	}
	
	public ItemLinkIterable() {
	}

	@Override
	public Item next() {
		return _next;
	}
	
	@Override
	public void beginAll(Item currentItem,
			ContextVariable context) {
		if (_linkIterator != null)
			return;
		ArrayList<Link> arrayList = new ArrayList<Link>(currentItem.getOutgoingLinks());
		_linkIterator = arrayList.iterator();
	}
	
	@Override
	public boolean hasNext() {
		_next = null;
		while (_linkIterator.hasNext()) {
			Link link = (Link) _linkIterator.next();
			if (link != null && link.isLinkResolved()) {
				_next = link.getDestination();
				break;
			}
		}
		return _next != null;
	}
}
