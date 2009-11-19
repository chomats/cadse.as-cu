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


/**
 * The Interface IActionPage.
 */
public interface IActionPage {
	public abstract String getTypeId() ;
	
	/**
	 * Inits the.
	 * 
	 * @param pageObject
	 *            the page object
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	void init(IPageObject pageObject) throws CadseException;
	
	/**
	 * Do finish.
	 * 
	 * @param monitor
	 *            the monitor
	 * 
	 * @throws Exception
	 *             the exception
	 */
	void doFinish(Object monitor) throws Exception;
	
	/**
	 * Do cancel.
	 * 
	 * @param monitor
	 *            the monitor
	 */
	void doCancel(Object monitor);
	
	
	/**
	 * Do next page action.
	 * 
	 * @param monitor
	 *            the monitor
	 * @param pages
	 *            the pages
	 * @param currentPage
	 *            the current page
	 * 
	 * @throws Exception
	 *             the exception
	 */
	void doNextPageAction(Object monitor, Pages pages, int currentPage) throws Exception;
	
	/**
	 * Do prev page action.
	 * 
	 * @param monitor
	 *            the monitor
	 * @param pages
	 *            the pages
	 * @param currentPage
	 *            the current page
	 * 
	 * @throws Exception
	 *             the exception
	 */
	void doPrevPageAction(Object monitor, Pages pages, int currentPage) throws Exception;
	
	/**
	 * Gets the next page index.
	 * 
	 * @param pages
	 *            the pages
	 * @param currentPage
	 *            the current page
	 * 
	 * @return the next page index
	 * 
	 * @throws Exception
	 *             the exception
	 */
	int getNextPageIndex(Pages pages, int currentPage) throws Exception;
	
	/**
	 * Gets the prev page index.
	 * 
	 * @param pages
	 *            the pages
	 * @param currentPage
	 *            the current page
	 * 
	 * @return the prev page index
	 * 
	 * @throws Exception
	 *             the exception
	 */
	int getPrevPageIndex(Pages pages, int currentPage) throws Exception;
	
	
	/**
	 * Dispose.
	 */
	void dispose();

	void initAfterUI();
}
