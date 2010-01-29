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
package fr.imag.adele.cadse.core;

/**
 * The Interface ErrorReporter.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public interface ErrorReporter {

	/** The Constant CODE_OK. */
	public static final int	CODE_OK	= 0;

	/**
	 * Report error.
	 * 
	 * @param item
	 *            the item
	 * @param errorCode
	 *            the error code
	 * @param exception
	 *            the exception
	 * @param description
	 *            the description
	 * @param parameters
	 *            the parameters
	 */
	public void reportError(Item item, int errorCode, Throwable exception, String description, Object... parameters);

	/**
	 * Report info.
	 * 
	 * @param item
	 *            the item
	 * @param errorCode
	 *            the error code
	 * @param exception
	 *            the exception
	 * @param description
	 *            the description
	 * @param parameters
	 *            the parameters
	 */
	public void reportInfo(Item item, int errorCode, Throwable exception, String description, Object... parameters);

	/**
	 * Report problem.
	 * 
	 * @param item
	 *            the item
	 * @param errorCode
	 *            the error code
	 * @param exception
	 *            the exception
	 * @param description
	 *            the description
	 * @param parameters
	 *            the parameters
	 */
	public void reportProblem(Item item, int errorCode, Throwable exception, String description, Object... parameters);

	/**
	 * Cancel.
	 */
	public void cancel();
}
