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

import java.util.HashSet;
import java.util.List;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.TypeDefinition;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * The Class IPage. Represente une page graphique. Elle contient UIField,
 * eventuellement une action page
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public interface IPage extends Item {

	public static final IAttributeType<?>[]	EMPTY_UIFIELD	= new IAttributeType<?>[0];

	IPage[] getOverwritePage();

	
	abstract IAttributeType<?>[] getHiddenAttributes();
	
	abstract void addHiddenAttributes(IAttributeType<?>... attr);
	
	public void addOverridePage(IPage... pages) ;
	
	/**
	 * Return the attributs which be readonly in this pages and other pages
	 * @return a not null array. If no attribut, return an empty array.
	 */
	abstract IAttributeType<?>[]  getReadOnlyAttributes();

	/**
	 * Add readonly attributes
	 * @param attr
	 */
	abstract void addReadOnlyAttributes(IAttributeType<?>... attr);
	
	/**
	 * Gets owner the fields.
	 * 
	 * @return the fields
	 */
	abstract IAttributeType<?>[] getAttributes();
	 
	abstract void addLast(IAttributeType<?>... attr);

	void addLast(List<IAttributeType<?>> attrs);

	abstract void addBefore(IAttributeType<?> beforeAttr, IAttributeType<?> attributeToInsert);

	abstract void addAfter(IAttributeType<?> afterAttr, IAttributeType<?> attributeToInsert);

	/**
	 * Gets the action page.
	 * 
	 * @return the action page
	 */
	abstract IActionPage getActionPage();

	/**
	 * Gets the label.
	 * 
	 * @return the label
	 */
	abstract String getLabel();
	
	/**
	 * Change the label of this page
	 * 
	 * @param label
	 */
	void setLabel(String label);
	
	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	abstract String getTitle();
	
	/**
	 * change the title of this page.
	 * 
	 * @param title
	 */
	public void setTitle(String title);
	
	/**
	 * Gets the description.
	 * 
	 * @return the description
	 */
	abstract String getDescription();

	abstract TypeDefinition getParentItemType();

	abstract boolean isModificationPage();

	boolean isEmptyPage();

	boolean isLast(IAttributeType<?> attributeDefinition);

	void getAllAttributes(HashSet<IAttributeType<?>> allAttributes);


	

	
}