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
package fr.imag.adele.cadse.core.content;

/**
 * 
 * @author chomats
 */
public interface FacetteItemContent {
	interface Internal {
		/**
		 * 
		 * @return the content item
		 */
		public ContentItem _getContentItem();
	}

	/**
	 * Returns the content item representing the associated content. If it has a
	 * content and content item does not exist, creates and returns it. If it
	 * has no content, returns null.
	 * 
	 * @return the content item representing the associated content.
	 */
	public ContentItem getContentItem();

	/**
	 * Return true if the content associated to this item is loaded. A content
	 * is loaded if content item representing the associated content exists. If
	 * it has no content, returns false.
	 * 
	 * @return true if the content associated to this item is loaded.
	 */
	public boolean contentIsLoaded();

	/**
	 * INTERNAL method.
	 * 
	 * Deletes content item which represents associated content.
	 */
	public void removeContentItem();
}
