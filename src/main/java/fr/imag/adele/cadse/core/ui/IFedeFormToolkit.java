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





/**
 * The Interface IFedeFormToolkit.
 */
public interface IFedeFormToolkit {

	/**
	 * Creates the button.
	 * 
	 * @param container
	 *            the container
	 * @param string
	 *            the string
	 * @param push
	 *            the push
	 * 
	 * @return the object
	 */
	Object createButton(Object container, String string, int push);

	/**
	 * Creates the text.
	 * 
	 * @param ocontainer
	 *            the ocontainer
	 * @param defaultValue
	 *            the default value
	 * @param style
	 *            the style
	 * 
	 * @return the object
	 */
	Object createText(Object ocontainer, String defaultValue, int style);
	
	Object createGroup(Object container, String label);

}
