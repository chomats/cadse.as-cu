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
package fr.imag.adele.cadse.core.ui;

import java.util.List;
import java.util.Set;

import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.attribute.GroupOfAttributes;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.ui.view.NewContext;

public interface Pages {

	/**
	 * Gets the page.
	 * 
	 * @param index
	 *            the index
	 * 
	 * @return the page
	 */
	abstract IPage getPage(int index);

	/**
	 * Gets the pages.
	 * 
	 * @return the pages
	 */
	abstract IPage[] getPages();

	/**
	 * Gets the page.
	 * 
	 * @param pageid
	 *            the pageid
	 * 
	 * @return the page
	 */
	abstract IPage getPage(String pageid);

	boolean isModificationPages();

	abstract UIField getUIField(IAttributeType<?> at);

	abstract List<UIRunningValidator> getUIValidators();

	abstract IActionPage getAction();

	abstract void setUIField(IAttributeType<?> key, UIField field);

	abstract void addPage(IPage page);

	abstract void setAction(IActionPage newAction);

	abstract void addUIValidator(UIRunningValidator v);

	abstract NewContext getContext();

	public Set<GroupOfAttributes> getGroupOfAttributes();
	
	public Set<IAttributeType<?>> getReadOnlyAttributes();
	
	public ItemType getMainType();
}