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
 * Represents a separator in a contextual menu.
 * 
 * @author chomats
 */
final public class Separator extends IMenuAction {

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
	 * @see fede.workspace.domain.IMenuAction#getMenuPath()
	 */
	@Override
	public String getMenuPath() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getId()
	 */
	@Override
	public String getId() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#isGroup()
	 */
	@Override
	public boolean isGroup() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Action " + getLabel();
	}

}