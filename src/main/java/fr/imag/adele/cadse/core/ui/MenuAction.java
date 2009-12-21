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

import java.net.URL;

import fr.imag.adele.cadse.core.IItemNode;
import fr.imag.adele.cadse.core.IMenuAction;

/**
 * The Class MenuAction.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public abstract class MenuAction extends IMenuAction {

	/** The label. */
	private String	label;

	/** The icon. */
	private URL		icon;

	/** The id. */
	String			id;

	/** The menupath. */
	private String	menupath;

	/** The for nb. */
	int				forNb;

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getIcon()
	 */
	@Override
	public URL getImage() {
		return icon;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getLabel()
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#load(java.lang.String,
	 *      java.lang.String, java.lang.String, int, java.net.URL)
	 */
	@Override
	public void init(String id, String label, String path, int forNb, URL icon) {
		this.id = id;
		this.menupath = path;
		this.icon = icon;
		this.label = label;
		this.forNb = forNb;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getId()
	 */
	@Override
	public String getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getMenuPath()
	 */
	@Override
	public String getMenuPath() {
		return menupath;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#isEnable(fede.workspace.domain.IItemNode[])
	 */
	@Override
	public boolean isEnable(IItemNode[] selection) {
		if (forNb != -1 && selection != null) {
			return selection.length == forNb;
		}
		return true;
	}

}
