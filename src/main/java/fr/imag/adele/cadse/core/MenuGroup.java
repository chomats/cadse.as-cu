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

import java.net.URL;

/**
 * Represents an anchor in a menu where sub menus and actions can be attached.
 * 
 * @author chomats
 */
final public class MenuGroup extends IMenuAction {

	/** The id. */
	private String	_id;

	/** The has separator. */
	private boolean	_hasSeparator;

	/**
	 * Creates a new menu group.
	 * 
	 * @param id group id which is used to refer to its group
	 * @param hasSeparator if true, a separator is added at before its group in the menu
	 */
	public MenuGroup(String id, boolean hasSeparator) {
		this._id = id;
		this._hasSeparator = hasSeparator;
	}

	/**
	 * Creates a new menu group.
	 * 
	 * @param id group id which is used to refer to its group
	 */
	public MenuGroup(String id) {
		this(id, true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getId()
	 */
	@Override
	public String getId() {
		return _id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getIcon()
	 */
	@Override
	public String getImage() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getLabel()
	 */
	@Override
	public String getLabel() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#isSeparator()
	 */
	@Override
	public boolean isSeparator() {
		return _hasSeparator;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#isGroup()
	 */
	@Override
	public boolean isGroup() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#run(fede.workspace.domain.IItemNode[])
	 */
	@Override
	public void run(IItemNode[] selection) throws CadseException {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Group " + _id + " sep " + _hasSeparator;
	}

}
