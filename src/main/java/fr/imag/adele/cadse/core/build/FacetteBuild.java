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
package fr.imag.adele.cadse.core.build;

/**
 * 
 * @author chomats
 */
public interface FacetteBuild {

	/** The Constant NO_COMPOSER. */
	public static final Composer[]	NO_COMPOSER	= new Composer[0];
	/** The Constant NO_EXPORTER. */
	public static final Exporter[]	NO_EXPORTER	= new Exporter[0];

	/**
	 * Removes all resources, objects and items generated by builders associated
	 * to this item. If <code>componentsContent</code> is true, clean also all
	 * content of components. Components are destination items of all outgoing
	 * composition links.
	 * 
	 * @param context
	 *            building context
	 * @param componentsContent
	 *            if true, also cleans component contents
	 */
	public void clean(IBuildingContext context, boolean componentsContent);

	/**
	 * Builds this content. Building can produce new resources, modify existing
	 * resources, generates or modify objects and items.
	 * 
	 * Note that clean action is not performed before each build but only on
	 * demand. Builder is considered as incremental by default.
	 * 
	 * @param context
	 *            building context
	 */
	public void build(IBuildingContext context);

	/**
	 * Calls all composers associated to this item. A composer is in charge of
	 * computation based on component exported contents (exported contents are
	 * retrieved from exporters of the components) which leads to generate or
	 * modify resources, objects or items associated to this item.
	 * 
	 * Note that clean action is not performed before each compose action but
	 * only on demand. Composer is considered as incremental by default.
	 * 
	 * @param context
	 *            building context
	 */
	public void compose(IBuildingContext context);

	

	/**
	 * Returns all exporters managing specified type of exported content.
	 * 
	 * @param exportedContentType
	 *            content type
	 * 
	 * @return the exporter managing specified type of exported content.
	 */
	public Exporter[] getExporter(String exportedContentType);

	
	/**
	 * Sets the exporters.
	 * 
	 * @param exporters
	 *            content exporters
	 */
	public void setExporters(Exporter... exporters);


	/**
	 * Sets the composers.
	 * 
	 * @param composers
	 *            composers
	 */
	public void setComposers(Composer... composers);
	
	public Composer[] getComposers();
}
