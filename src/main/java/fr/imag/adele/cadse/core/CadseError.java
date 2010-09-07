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

import fr.imag.adele.cadse.util.NLS;

/**
 * Represents an exception thrown by CADSE runtime.
 * 
 * @author Thomas
 * 
 */
public class CadseError {

	private String		_msg;
	private Object[]	_args;

	/*
	 * type : warning (can commit) error (can commit) fail (cannot commit)
	 */

	/**
	 * Creates a CADSE error.
	 * 
	 * @param message
	 *            error message
	 * @param args
	 *            arguments used to format error message
	 */
	public CadseError(String msg, Object... args) {
		_msg = msg;
		_args = args;
	}

	public Object[] getArgs() {
		return _args;
	}

	public String getMsg() {
		return _msg;
	}

	public String getMessage() {
		return NLS.bind(_msg, _args);
	}
}
