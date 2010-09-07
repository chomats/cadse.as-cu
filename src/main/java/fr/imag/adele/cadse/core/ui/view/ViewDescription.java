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

import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.LogicalWorkspace;

/**
 * ebauche d'un description de view
 * 
 * @author chomats
 * 
 */
public interface ViewDescription {

	/**
	 * 
	 * @return the first item type which instances items must be showed
	 */
	public ItemType[] getFirstItemType();

	/**
	 * sous eclipse retourn un IShellProvider
	 * 
	 * @return
	 */
	public Object getWindowProvider();

	/**
	 * 
	 * @return null if no filter or an array of Viewfilter
	 */
	public ViewFilter[] getFilters();

	/**
	 * Add a filter to this view
	 * 
	 * @param f
	 *            a filter
	 */

	public void addFilter(ViewFilter f);

	/**
	 * Remove a filter
	 * 
	 * @param f
	 *            a filter
	 */
	public void removeFilter(ViewFilter f);

	public boolean filterNew(NewContext context);

	public LogicalWorkspace getCadseModel();

	public String getNewLabel(NewContext context);

	public boolean canCreateDestination(LinkType lt);

	public ItemType[] getCreatableItemType();
	
	public abstract boolean isAggregationLink(Link link);
}
