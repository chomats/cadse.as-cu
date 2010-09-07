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
package fr.imag.adele.cadse.core.ui.view;

import java.util.List;
import java.util.Set;

import fr.imag.adele.cadse.core.Item;

public abstract class ViewFilter {
	public abstract boolean isPositifFilter();

	public abstract boolean isNegatifFilter();

	public void acceptSelect(FilterContext context, Set<Item> result) {
	}

	public void filterSelect(FilterContext context, Set<Item> result) {
	}

	public void acceptNew(FilterContext context, List<NewMenuAction> result) {
	}
	
	public boolean acceptNew(FilterContext context) {
		return true;
	}

	public void filterNew(FilterContext context, List<NewMenuAction> result) {
	}
	
	public boolean filterNew(FilterContext context) {
		return false;
	}
}
