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

package fr.imag.adele.cadse.core;

/**
 * Represents an item content change description.
 * A content may be a project, a file or a directory or simply a small part of a file...
 */
public interface ContentChangeInfo {

	/** 
	 * Represents resource addition. 
	 */
	public static final int	ADDED_RESOURCE		= 1;

	/** 
	 * Represents resource deletion. 
	 */
	public static final int	REMOVED_RESOURCE	= 2;

	/** 
	 * Represents resource modification.
	 * For a file, it corresponds to file rename or file content modification. 
	 */
	public static final int	CHANGED_RESOURCE	= 4;

	/** 
	 * Represents resource move. 
	 */
	public static final int	MOVED_FROM_RESOURCE	= 8;

	/** 
	 * Represents resource move. 
	 */
	public static final int	MOVED_TO_RESOURCE	= 16;

	/**
	 * Returns type of content change.
	 * 
	 * @return type of content change.
	 */
	int getKind();

	/**
	 * Returns the old path of element.
	 * 
	 * @return the old path of element
	 */
	public String getOldPathOfElement();

	/**
	 * Returns the path of element.
	 * 
	 * @return the path of element
	 */
	public String getPathOfElement();
}