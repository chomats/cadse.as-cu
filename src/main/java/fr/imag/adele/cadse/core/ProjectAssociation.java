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

import java.net.URL;
import java.util.HashMap;


/**
 * Represents a mapping between an item and an IDE project.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class ProjectAssociation {

	/** The item reference. */
	private final UUID _itemRef;
	
	/** The project name. */
	private final String _projectName;
	
	/** The content entries. */
	private HashMap<String, URL> _contentEntries;
	
	/**
	 * Instantiates a new project to item association.
	 * 
	 * @param itemRef     item id which references the item to attach to a project
	 * @param projectName the project name
	 */
	public ProjectAssociation(UUID itemRef, String projectName) {
		super();
		this._itemRef = itemRef;
		this._projectName = projectName;
	}

	/**
	 * Returns the item reference (its Id).
	 * 
	 * @return the item reference (its Id).
	 */
	public UUID getItemref() {
		return _itemRef;
	}
	
	/**
	 * Returns the project name.
	 * 
	 * @return the project name
	 */
	public String getProjectName() {
		return _projectName;
	}
	
	/**
	 * Adds a content entry.
	 * 
	 * @param path the content path
	 * @param url  the content URL
	 */
	public void addContentEntry(String path, URL url) {
		if (_contentEntries == null)
			_contentEntries = new HashMap<String, URL>();
		_contentEntries.put(path,url);
	}
	
	/**
	 * Returns the content entries.
	 * 
	 * @return the content entries
	 */
	public HashMap<String, URL> getContentEntries() {
		return _contentEntries;
	}
}
