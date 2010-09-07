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
package fr.imag.adele.cadse.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * Can get and set attribute definition of an object.
 * 
 * @author CADSE Team
 * @version 2.2.1
 */
public interface IAttributableType {

	/**
	 * Gets an attribute definition by its name.
	 * 
	 * @param name
	 *            the name of the attribute definition
	 * 
	 * @return the attribute definition, null if not found
	 * @since 2.0
	 */
	public IAttributeType<?> getAttributeType(String name);

//	/**
//	 * Gets an attribute definition by its name. If the attribute definition is
//	 * not found, a new attribute definition set as unresolved can be created.
//	 * 
//	 * @param name
//	 *            the name of the attribute definition
//	 * @param createUnresolvedDefinition
//	 *            if true, create an unresolved definition if the attribute
//	 *            definition is not found
//	 * @return the attribute definition, or null if createUnresolvedDefinition
//	 *         is false and the attribute definition is not found
//	 * @since 2.2.1
//	 */
//	public IAttributeType<?> getAttributeType(String name, boolean createUnresolvedDefinition);

	/**
	 * Adds all the attribute definition into the list given into parameter.
	 * Follows the hierarchy links and returns all the definitions even
	 * duplicates one.
	 * 
	 * @param all
	 *            a list
	 * @since 2.0
	 */
	public void getAllAttributeTypes(List<IAttributeType<?>> all);

	/**
	 * Adds all the attribute definition into the list given into parameter.
	 * Follows the hierarchy links and returns only one definition for
	 * duplicates one.
	 * 
	 * @param all :
	 *            a given map where put the result
	 * @param keepLastAttribute
	 *            If true, keep the last definition (on the sub-type). Else keep
	 *            the definition on the super-type
	 * @since 2.0
	 */
	public void getAllAttributeTypes(Map<String, IAttributeType<?>> all, boolean keepLastAttribute);

	/**
	 * Adds all the attribute definition into the list given into parameter.
	 * Follows the hierarchy links and returns all the definitions even
	 * duplicates one. Only attributes matching filter are added.
	 * 
	 * @param all
	 *            a given list where to put the result
	 * @param filter
	 *            A filter to select attribute definition
	 * @since 2.0
	 */
	public void getAllAttributeTypes(List<IAttributeType<?>> all, ItemFilter<IAttributeType<?>>  filter);

	/**
	 * Returns all the attribute definition. Follows the hierarchy links and
	 * returns the last definition (on the sub-type).
	 * 
	 * @return a possibly empty list with all the attribute definition
	 * @since 2.0
	 */
	public IAttributeType<?>[] getAllAttributeTypes();

	/**
	 * Adds all the attribute definition into the map given into parameter.
	 * Follows the hierarchy links and returns only one definition for
	 * duplicates one. Only attributes matching filter are added.
	 * 
	 * @param all :
	 *            a given map where to put the result
	 * @param keepLastAttribute
	 *            If true, keep the last definition (on the sub-type). Else keep
	 *            the definition on the super-type
	 * @param filter
	 *            A filter to select attribute definition
	 * @since 2.0
	 */
	public void getAllAttributeTypes(Map<String, IAttributeType<?>> all, boolean keepLastAttribute,
			ItemFilter<IAttributeType<?>> filter);

	/**
	 * Add all the attribute definition names to the Set given into parameter.
	 * Only attributes matching filter are added.
	 * 
	 * @param all
	 *            a given set where to put the result
	 * @param filter
	 *            A filter to select attribute definition
	 */
	public void getAllAttributeTypesKeys(Set<String> all, ItemFilter<IAttributeType<?>> filter);

	/**
	 * Returns a list with all the attribute definition names.
	 * 
	 * @return a possibly empty list with all the attribute definition names.
	 * @since 2.0
	 */
	public String[] getAttributeTypeIds();

	/**
	 * Adds an attribute definition to this object.
	 * 
	 * @param type
	 *            the attribute definition to add
	 * @since 2.0
	 */
	public <T> Link addAttributeType(IAttributeType<T> type);

}
