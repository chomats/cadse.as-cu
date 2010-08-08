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
import fr.imag.adele.cadse.core.Item;

/**
 * This class manages the contents of an eclipse resources associated with an
 * item in order to perform at the eclipse resource level the actions
 * corresponding to the logical composition.
 * 
 * @author vega
 */
public abstract class Exporter {

	/** The content manager. */
	final private Item			_owerItem;

	/** The exporter types. */
	final private String[]			exporterTypes;

	/**
	 * Instantiates a new exporter.
	 * 
	 * @param contentManager
	 *            the content manager
	 * @param exporterTypes
	 *            the exporter types
	 */
	protected Exporter(Item owerItem, String... exporterTypes) {
		this._owerItem = owerItem;
		this.exporterTypes = exporterTypes;
	}

	/**
	 * Gets the item associated with this composer.
	 * 
	 * @return the item
	 */
	public Item getItem() {
		return _owerItem;
	}

	/**
	 * Gets the exporter types.
	 * 
	 * @return the exporter types
	 */
	public String[] getExporterTypes() {
		return exporterTypes;
	}

	/**
	 * Contains exporter type.
	 * 
	 * @param type
	 *            the type
	 * 
	 * @return true, if successful
	 */
	public boolean containsExporterType(String type) {
		for (String exporterType : exporterTypes) {
			if (exporterType.equals(type)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Packages the contents of the specified item, in order to be able to copy
	 * and compose it in other composite items.
	 * 
	 * @param context
	 *            the context
	 * @param target
	 *            the target
	 * @param exporterType
	 *            the exporter type
	 * @param fullExport
	 *            the full export
	 * 
	 * @return the i exported content
	 * 
	 * @throws CadseException
	 */
	public IExportedContent exportItem(IBuildingContext context, IExporterTarget target, String exporterType,
			boolean fullExport) throws CadseException {
		return null;
	}

}
