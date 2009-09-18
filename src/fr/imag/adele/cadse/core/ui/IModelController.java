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

package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;

/**
 * obtenir une valeur � partir du context.
 * 
 * @author chomats
 */
public interface IModelController extends IEventListener, IValidateContributor, Item {

	/** The Constant FIELD_MANADATORY_ERROR_MESSAGE_KEY. */
	public static final String	FIELD_MANADATORY_ERROR_MESSAGE_KEY	= "field-manadatory-error-message";

	/** The Constant FIELD_MANDATORY_KEY. */
	public static final String	FIELD_MANDATORY_KEY					= "field-mandatory";

	/**
	 * Sets the uI field.
	 * 
	 * @param ui
	 *            the new uI field
	 */
	void setUIField(UIField ui);

	/**
	 * Gets the uI field.
	 * 
	 * @return the uI field
	 */
	UIField getUIField();

	/**
	 * Inits the.
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	void init() throws CadseException;

	/**
	 * Inits the after ui.
	 */
	void initAfterUI();

	/**
	 * Dispose.
	 */
	void dispose();

	/**
	 * Gets the value.
	 * 
	 * @return the value
	 */
	Object getValue();

	/**
	 * Default value.
	 * 
	 * @return the object
	 */
	Object defaultValue();

	public boolean isAnonymous();
}
