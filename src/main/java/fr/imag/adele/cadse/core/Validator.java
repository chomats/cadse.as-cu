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
package fr.imag.adele.cadse.core;

import java.util.List;

import fr.imag.adele.cadse.objectadapter.ObjectAdapter;



public abstract class Validator extends ObjectAdapter<Validator>{
	/**
	 * Represents errors on items.
	 */
	public interface ProblemReporter {

		/** The Constant CODE_OK. */
		public static final int	CODE_OK	= 0;

		/**
		 * Reports an error for specified item.
		 * 
		 * @param item
		 *            item in error
		 * @param errorCode
		 *            error code
		 * @param description
		 *            error message
		 * @param parameters
		 *            arguments used to format error message
		 */
		public void report(Item item, int errorCode, String description, Object... parameters);

		/**
		 * Reports a warning for specified item.
		 * 
		 * @param item
		 *            item in error
		 * @param errorCode
		 *            warning code
		 * @param description
		 *            warning message
		 * @param parameters
		 *            arguments used to format warning message
		 */
		public void warning(Item item, int errorCode, String description, Object... parameters);

		/**
		 * Reports an information for specified item.
		 * 
		 * @param item
		 *            item related to this information
		 * @param errorCode
		 *            information code
		 * @param description
		 *            information message
		 * @param parameters
		 *            arguments used to format information message
		 */
		public void info(Item item, int errorCode, String description, Object... parameters);

		/**
		 * Reports an error for specified item.
		 * 
		 * @param item
		 *            item in error
		 * @param errorCode
		 *            error code
		 * @param description
		 *            error message
		 * @param parameters
		 *            arguments used to format error message
		 */
		public void error(Item item, int errorCode, String description, Object... parameters);
	}
	
	/**
	 * This method should not be override by a user.
	 * 
	 * Returns set of items for which any modification can impact the validation
	 * of specified item. Default validation checks:
	 * <ul>
	 * <li>If it has a parent, he must be present.</li>
	 * <li>If it requires other items (require outgoing links exist), they must
	 * be present.</li>
	 * <li>Cardinality for each outgoing relationships must be conformed.</li>
	 * </ul>
	 * All errors are published in specified reporter.
	 * 
	 * @param item
	 *            item to validate
	 * @param reporter
	 *            issue reporter
	 * 
	 * @return set of items for which any modification can impact the validation
	 *         of specified item.
	 */
	public abstract List<Item> validate(Item item, ProblemReporter reporter);


	@Override
	public Class<Validator> getClassAdapt() {
		return Validator.class;
	}

}
