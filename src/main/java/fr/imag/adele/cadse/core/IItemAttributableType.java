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
import java.util.UUID;

import fr.imag.adele.cadse.core.attribute.IAttributeType;


/**
 * An item has attribute definitions and their values.
 * Attribute definitions are defined by item type (and its super types) of an item 
 * and may be from other sources.
 * Attribute definitions defined by item type are called local.
 * 
 */
public interface IItemAttributableType {

	/**
	 * Returns attribute definition of local attribute with specified name.
	 * Attribute definitions defined by item type (and its super types) are called local.
	 * If there is no local attribute with specified name, returns null.
	 * 
	 * @param attrName attribute name
	 * 
	 * @return attribute definition of local attribute with specified name.
	 */
	public IAttributeType<?> getLocalAttributeType(String attrName);

	/**
	 * Returns attribute definition of local attribute with specified name.
	 * Attribute definitions defined by item type (and its super types) are called local.
	 * If there is no local attribute with specified name, returns null.
	 * 
	 * @param attrName attribute name
	 * 
	 * @return attribute definition of local attribute with specified name.
	 */
	public IAttributeType<?> getLocalAttributeType(UUID attrName);

	
	/**
	 * Adds all local attribute definitions to specified list.
	 * Attribute definitions defined by item type (and its super types) are called local.
	 * 
	 * @param allLocalAttrDefs list which will contain all local attribute definitions<br>
	 *                         should be an empty list
	 */
	public void getLocalAllAttributeTypes(List<IAttributeType<?>> allLocalAttrDefs);
	
	/**
	 * Adds all local attribute definitions to specified map.
	 * Attribute definitions defined by item type (and its super types) are called local.
	 * 
	 * @param allLocalAttrDefs  map <attribute name, attribute definition> which will 
	 *                          contain all local attribute definitions<br>
	 *                          should be an empty list
	 * @param keepLastAttribute if two attribute definitions defined in different types 
	 *                          have same name then if (<code>keepLastAttribute</code> is true)
	 *                          list will contain only the lower type in hierarchy one 
	 *                          else it will contain the two different definitions  
	 */
	public void getLocalAllAttributeTypes(
			Map<String, IAttributeType<?>> allLocalAttrDefs, boolean keepLastAttribute);
	
	/**
	 * Adds all local attribute definitions to specified list.
	 * Attribute definitions defined by item type (and its super types) are called local.
	 * 
	 * @param allLocalAttrDefs list which will contain all local attribute definitions<br>
	 *                         should be an empty list
	 * @param filter           a filter used to ignore (not add) specific attribute definitions
	 */
	public void getLocalAllAttributeTypes(
			List<IAttributeType<?>> allLocalAttrDefs,  ItemFilter filter);
	
	/**
	 * Returns all local attribute definitions.
	 * Attribute definitions defined by item type (and its super types) are called local.
	 * 
	 * @return all local attribute definitions.
	 */
	public IAttributeType<?>[] getLocalAllAttributeTypes();
	
	/**
	 * Adds all local attribute definitions to specified map.
	 * Attribute definitions defined by item type (and its super types) are called local.
	 * 
	 * @param allLocalAttrDefs  map <attribute name, attribute definition> which will 
	 *                          contain all local attribute definitions<br>
	 *                          should be an empty list
	 * @param keepLastAttribute if two attribute definitions defined in different types 
	 *                          have same name then if (<code>keepLastAttribute</code> is true)
	 *                          list will contain only the lower type in hierarchy one 
	 *                          else it will contain the two different definitions 
	 * @param filter            a filter used to ignore (not add) specific attribute definitions
	 */
	public void getLocalAllAttributeTypes(
			Map<String, IAttributeType<?>> allLocalAttrDefs, boolean keepLastAttribute, ItemFilter filter);
	
	/**
	 * Adds all local attribute definitions to specified list.
	 * Attribute definitions defined by item type (and its super types) are called local.
	 * 
	 * @param allLocalAttrDefs a set <String> of local attribute name which will 
	 *                         contain all local attribute names<br>
	 *                         should be an empty list
	 * @param filter           a filter used to ignore (not add) specific attribute definitions
	 */
	public void getLocalAllAttributeTypesKeys(
			Set<String> allLocalAttrDefs, ItemFilter filter);
}
