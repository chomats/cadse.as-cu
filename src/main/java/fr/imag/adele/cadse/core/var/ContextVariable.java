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
package fr.imag.adele.cadse.core.var;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * Represents a context. It is a collection of configuration properties per
 * item.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public interface ContextVariable {

	/**
	 * Returns <code>att</code> attribute value of <code>item</code> item
	 * defined in this context. If it is not defined in this context, return
	 * <code>att</code> attribute value of <code>item</code> item in
	 * corresponding logical workspace.
	 * 
	 * @param item
	 *            an item
	 * @param att
	 *            an item attribute definition
	 * @return <code>att</code> attribute value of <code>item</code> item
	 *         defined in this context.
	 */
	public String getAttribute(Item item, IAttributeType<String> att);

	/**
	 * Returns <code>attrName</code> attribute value of <code>item</code> item
	 * defined in this context. If it is not defined in this context, return
	 * <code>attrName</code> attribute value of <code>item</code> item in
	 * corresponding logical workspace.
	 * 
	 * @param item
	 *            an item
	 * @param attrName
	 *            name of an item attribute
	 * @return <code>attrName</code> attribute value of <code>item</code> item
	 *         defined in this context.
	 */
	public String getValue(Item item, IAttributeType<String> key);

	/**
	 * Defines <code>attr</code> attribute value of <code>item</code> item.
	 * 
	 * @param item
	 *            an item
	 * @param attr
	 *            an item attribute definition
	 * @param value
	 *            attribute value
	 */
	public void putValue(Item item, IAttributeType<String> attr, String value);

	/**
	 * Returns short name of <code>item</code> item defined in this context. If
	 * it is not defined in this context, return short name of <code>item</code>
	 * item in corresponding logical workspace.
	 * 
	 * @param item
	 *            an item
	 * @return short name of <code>item</code> item defined in this context.
	 */
	public String getName(Item item);

	/**
	 * Returns unique name of <code>item</code> item defined in this context. If
	 * it is not defined in this context, return unique name of
	 * <code>item</code> item in corresponding logical workspace.
	 * 
	 * @param item
	 *            an item
	 * @return unique name of <code>item</code> item defined in this context.
	 */

	public String getQualifiedName(Item item);

	public boolean isGenerated();

	public void setGenerated(boolean generated);

}
