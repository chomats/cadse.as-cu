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

import java.text.MessageFormat;

/**
 * Represents an exception thrown by CADSE runtime.
 * 
 * @author Thomas
 * 
 */
public class CadseException extends Exception {

	private Exception[]			_causes;
	private String				_msg;
	private Object[]			_args;

	private static final long	serialVersionUID	= 5834317729883854022L;

	/**
	 * Creates a CADSE exception.
	 */
	public CadseException() {
		super();

	}

	/**
	 * Creates a CADSE exception.
	 * 
	 * @param message
	 *            error message
	 * @param cause
	 *            cause of this error
	 */
	public CadseException(String message, Throwable cause) {
		super(message, cause);
		_msg = message;
	}

	/**
	 * Creates a CADSE exception.
	 * 
	 * @param message
	 *            error message
	 */
	public CadseException(String message) {
		super(message);
		_msg = message;
	}

	/**
	 * Creates a CADSE exception.
	 * 
	 * @param cause
	 *            cause of this error
	 */
	public CadseException(Throwable cause) {
		super(cause);
	}

	/**
	 * Creates a CADSE exception.
	 * 
	 * @param message
	 *            error message
	 * @param cause
	 *            cause of this error
	 * @param args
	 *            arguments used to format error message
	 */
	public CadseException(String msg, Throwable cause, Object... args) {
		super(MessageFormat.format(msg, args), cause);
		_msg = msg;
		_args = args;
	}

	/**
	 * Creates a CADSE exception.
	 * 
	 * @param message
	 *            error message
	 * @param args
	 *            arguments used to format error message
	 */
	public CadseException(String msg, Object... args) {
		super(MessageFormat.format(msg, args));
		_msg = msg;
		_args = args;
	}

	/**
	 * Attach all causes of this error. Previous attached causes are removed. If
	 * there is no cause, sets null.
	 * 
	 * @param causes
	 *            error causes
	 */
	public void setCauses(Exception... causes) {
		this._causes = causes;
	}

	/**
	 * Returns all causes of this error. If there is no cause, returns null.
	 * 
	 * @return all causes of this error.
	 */
	public Exception[] getCauses() {
		return _causes;
	}

	public Object[] getArgs() {
		return _args;
	}

	public String getMsg() {
		return _msg;
	}
}
