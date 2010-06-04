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

package fr.imag.adele.cadse.core;

import fr.imag.adele.cadse.core.var.ContextVariable;

/**
 * If a content item implements this interface, a generate action named "Generate <item name>" 
 * is added on associated logical item. Click on this action calls corresponding generate method.
 */
public interface IGenerateContent {
	
	/**
	 * Represents a model of the content to generate.
	 * 
	 * Content item implementations should subclass it.
	 */
	public class GenerateModel {
		
	}
	
	/**
	 * Generates the content.
	 * 
	 * @param cxt a generation context
	 */
	public void generate(ContextVariable cxt);
	
	/**
	 * Returns a model of the content to generate.
	 * Call this method don't produce generated content.
	 * 
	 * @return a model of the content to generate.
	 */
	public GenerateModel getGenerateModel();
	
}
