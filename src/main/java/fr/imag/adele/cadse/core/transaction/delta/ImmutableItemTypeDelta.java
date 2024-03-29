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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.imag.adele.cadse.core.ChangeID;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.WSEvent;

public class ImmutableItemTypeDelta {
	ItemType					it;
	List<ImmutableItemDelta>	items	= new ArrayList<ImmutableItemDelta>();
	int							filters;
	Set<WSEvent>				events	= new HashSet<WSEvent>();

	public ImmutableItemTypeDelta(ItemType it) {
		this.it = it;
		this.filters = 0;
	}

	void add(ImmutableItemDelta id) {
		items.add(id);
	}

	void add(WSEvent e) {
		events.add(e);
		filters = ChangeID.toFilter(filters, e.getEventTypeId());
	}

	public Set<WSEvent> getEvents() {
		return events;
	}

	public int getFilters() {
		return filters;
	}

	public List<ImmutableItemDelta> getItems() {
		return items;
	}

	public ItemType getItemType() {
		return it;
	}

}
