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

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;

/**
 * The Interface IPageObject.
 */
public interface IPageObject {

	/**
	 * Gets the parent.
	 * 
	 * @return the parent
	 */
	IPageObject getParent();

	/**
	 * Gets the field.
	 * 
	 * @param fieldid
	 *            the fieldid
	 * 
	 * @return the field
	 */
	UIField getField(String fieldid);

	/**
	 * Gets the page controller.
	 * 
	 * @return the page controller
	 */
	public IPageController getPageController();

	/**
	 * Put local.
	 * 
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	public void putLocal(String key, Object value);

	/**
	 * Gets the local.
	 * 
	 * @param key
	 *            the key
	 * 
	 * @return the local
	 */
	public <T> T getLocal(String key);

	/**
	 * Gets the local.
	 * 
	 * @param key
	 *            the key
	 * @param d
	 *            the d
	 * 
	 * @return the local
	 */
	public <T> T getLocal(String key, T d);

	/**
	 * Gets the.
	 * 
	 * @param key
	 *            the key
	 * 
	 * @return the t
	 */
	public <T> T get(String key);

	/**
	 * Gets the.
	 * 
	 * @param key
	 *            the key
	 * @param d
	 *            the d
	 * 
	 * @return the t
	 */
	public <T> T get(String key, T d);

	public LogicalWorkspaceTransaction getCopy();

	Item getItem();

	void setItem(String key, Item item);
}
