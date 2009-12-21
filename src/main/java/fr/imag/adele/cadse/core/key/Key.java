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

package fr.imag.adele.cadse.core.key;

import fr.imag.adele.cadse.core.INamedUUID;

/**
 * The Interface ISpaceKey.
 */
public interface Key extends INamedUUID {

	/**
	 * Gets the type.
	 * 
	 * @return the type
	 */
	public KeyDefinition getType();

	/**
	 * Gets the parent space key.
	 * 
	 * @return the parent space key
	 */
	public Key getParentKey();

	/**
	 * Gets the name.
	 * 
	 * @param i
	 *            index of attribute defintion in key definition.
	 * 
	 * @return the name
	 */
	public <T> T getValue(int i);

	/**
	 * Equals.
	 * 
	 * @param obj
	 *            the obj
	 * 
	 * @return true, if successful
	 */
	public boolean equals(Key obj);

	/**
	 * [uuid du type]sn {sn, sn, sn, ...}
	 * 
	 * @return the string
	 */
	@Override
	public String toString();

	/**
	 * Gets the qualified string.
	 * 
	 * @param sb
	 *            the sb
	 * 
	 * @return the qualified string
	 */
	public void getQualifiedString(StringBuilder sb);

	public String getQualifiedString();

	/**
	 * To string.
	 * 
	 * @param sb
	 *            the sb
	 */
	public void toString(StringBuilder sb);

	public void dispose();

	public Key[] getChildrenKey();

    public void setName(String name);

}