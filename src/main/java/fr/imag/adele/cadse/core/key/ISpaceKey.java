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


/**
 * The Interface ISpaceKey.
 */
public interface ISpaceKey {

	/**
	 * Gets the type.
	 * 
	 * @return the type
	 */
	public SpaceKeyType getType();

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName();

	/**
	 * Gets the parent space key.
	 * 
	 * @return the parent space key
	 */
	public ISpaceKey getParentSpaceKey();

	/**
	 * Equals.
	 * 
	 * @param obj
	 *            the obj
	 * 
	 * @return true, if successful
	 */
	public boolean equals(Object obj);

	/**
	 * Hash code.
	 * 
	 * @return the int
	 */
	public int hashCode();

	/**
	 * [uuid du type]sn {sn, sn, sn, ...}
	 * 
	 * @return the string
	 */
	public String toString();

	/**
	 * Sets the name.
	 * 
	 * @param shortName
	 *            the new name
	 */
	public void setName(String shortName);

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

	public void addChild(ISpaceKey child);

	public ISpaceKey[] getChildrenKey();

}