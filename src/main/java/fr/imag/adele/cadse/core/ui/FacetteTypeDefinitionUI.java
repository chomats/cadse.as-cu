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

import fr.imag.adele.cadse.core.attribute.GroupOfAttributes;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * 
 * @author chomats
 */
public interface FacetteTypeDefinitionUI {
	/**
	 * Gets the creation page.
	 * 
	 * @return the creation page
	 */
	public abstract IPage[] getCreationPage();

	/**
	 * Gets the modification page.
	 * 
	 * @return the modification page
	 */
	public abstract IPage[] getModificationPage();

	/**
	 * Adds the creation pages.
	 * 
	 * @param creationPages
	 *            the creation pages
	 */
	public void addCreationPages(IPage... creationPages);

	/**
	 * Adds the modification pages.
	 * 
	 * @param modificationPages
	 *            the modification pages
	 */
	public void addModificationPages(IPage... modificationPages);

	public abstract UIField findField(IAttributeType<?> att);

	/**
	 * Creates the default modification action.
	 * 
	 * @param node
	 *            the node
	 * 
	 * @return the i action page
	 */

	public void addValidators(UIValidator v);

	public void addField(UIField v);

	public void addGroupOfAttributes(GroupOfAttributes g);

	public GroupOfAttributes[] getGroupOfAttributes();
}
