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
 */
/*
 * Adele/LIG/ Grenoble University, France
 * 2006-2008
 */
package fr.imag.adele.cadse.core.build;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.CompactUUID;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.Link;

/**
 * The Interface IExportedContent.
 */
public interface IExportedContent {

	/**
	 * return true if has at least one children.
	 * 
	 * @return true, if checks for children
	 */
	public boolean hasChildren();

	/**
	 * return children.
	 * 
	 * @return the children
	 */
	public IExportedContent[] getChildren();

	/**
	 * exported type associated.
	 * 
	 * @return the exporter type
	 */
	public Class<?> getExporterType();

	/**
	 * Id of item associated.
	 * 
	 * @return the item identification
	 */
	public CompactUUID getItemIdentification();

	/**
	 * Gets the item.
	 * 
	 * @return the item
	 */
	public Item getItem();

	/**
	 * Gets the item display name.
	 * 
	 * @return the item display name
	 */
	public String getItemDisplayName();

	/**
	 * Delete.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	void delete(IBuildingContext context) throws CadseException;

	/**
	 * 
	 * @param l
	 */
	void setLink(Link l);
}
