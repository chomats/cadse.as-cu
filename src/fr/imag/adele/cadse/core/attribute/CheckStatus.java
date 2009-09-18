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
package fr.imag.adele.cadse.core.attribute;

/**
 * Represents errors attached to an object.
 * 
 * @author chomats
 *
 *    <b>IPageController.NONE = 0</b> : Typically this indicates that the message should be shown without an icon and no check<p/>
 *    <b>IPageController.INFORMATION</b> : Constant for an info message (value 1).<p/>
 *    <b>IPageController.WARNING</b> : Constant for a warning message (value 2).<p/>
 *    <b>IPageController.ERROR</b> : Constant for an error message (value 3). (cannot finish transaction or dialog process)<p/>
 *
 */
public class CheckStatus {
	
	public final int _type;
	public final String _message;
	
	/**
	 * Create an object status representing errors attached to an object.
	 * 
	 * @param type IPageController.* error types
	 * @param msg  message explaining this status
	 */
	public CheckStatus(int type, String msg) {
		this._type = type; 
		this._message = msg;
	}
}
