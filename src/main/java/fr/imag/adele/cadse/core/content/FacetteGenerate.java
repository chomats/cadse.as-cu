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
package fr.imag.adele.cadse.core.content;

import java.util.Set;

import fr.imag.adele.cadse.core.GenContext;
import fr.imag.adele.cadse.core.GenStringBuilder;

/**
 * 
 * @author chomats
 */
public interface FacetteGenerate {

	/**
	 * Generates a string content represented by this item.
	 * 
	 * @param sb
	 *            string builder used to generate string content
	 * @param type
	 *            generation type
	 * @param kind
	 *            generation kind (multiple kinds per generation type)
	 * @param imports
	 *            set of imports used for the generation
	 * @param context
	 *            generation context which contains configuration properties
	 */
	public void generate(GenStringBuilder sb, String type, String kind, Set<String> imports, GenContext context);

	/**
	 * Generates string content represented by all children (destination items
	 * of outgoing part links) of the logical item associated to this item.
	 * 
	 * @param sb
	 *            string builder used to generate string content
	 * @param type
	 *            generation type
	 * @param kind
	 *            generation kind (multiple kinds per generation type)
	 * @param imports
	 *            set of imports used for the generation
	 * @param context
	 *            generation context which contains configuration properties
	 */
	public void generateParts(GenStringBuilder sb, String type, String kind, Set<String> imports, GenContext context);

	/**
	 * Generates string content represented by one child (destination item of
	 * one outgoing link of specified type) of the logical item associated to
	 * this item.
	 * 
	 * @param linkTypeName
	 *            link type name
	 * @param sb
	 *            string builder used to generate string content
	 * @param type
	 *            generation type
	 * @param kind
	 *            generation kind (multiple kinds per generation type)
	 * @param imports
	 *            set of imports used for the generation
	 * @param context
	 *            generation context which contains configuration properties
	 */
	public void generatePart(String linkTypeName, GenStringBuilder sb, String type, String kind, Set<String> imports,
			GenContext context);

	/**
	 * Generates string content represented by all children (destination items
	 * of outgoing links of specified type) of the logical item associated to
	 * this item.
	 * 
	 * @param linkTypeName
	 *            link type name
	 * @param sb
	 *            string builder used to generate string content
	 * @param type
	 *            generation type
	 * @param kind
	 *            generation kind (multiple kinds per generation type)
	 * @param imports
	 *            set of imports used for the generation
	 * @param context
	 *            generation context which contains configuration properties
	 */
	public void generateParts(String linkTypeName, GenStringBuilder sb, String type, String kind, Set<String> imports,
			GenContext context);

}
