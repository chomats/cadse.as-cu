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
import fr.imag.adele.cadse.core.Menu;
import fr.imag.adele.cadse.core.ui.view.ViewDescription;


/**
 * The Class GenericActionContributor.
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class GenericActionContributor implements IActionContributor {
	
	/**
	 * The Class DescriptionMenu.
	 */
	static class DescriptionMenu extends Menu {
		
		/** The path. */
		private String path;
		/**
		 * Instantiates a new description menu.
		 * 
		 * @param id
		 *            the id
		 * @param label
		 *            the label
		 * @param path
		 *            the path
		 * @param icon
		 *            the icon
		 */
		public DescriptionMenu(String id, String label, String path, URL icon) {
			super(id, label, icon);
			this.path = path;
		}
		
		/* (non-Javadoc)
		 * @see fede.workspace.domain.IMenuAction.Menu#getMenuPath()
		 */
		@Override
		public String getMenuPath() {
			return path;
		}
			
	}
	
	/** The actions. */
	IMenuAction[] actions ;
	
	/**
	 * Instantiates a new generic action contributor.
	 * 
	 * @param actions
	 *            the actions
	 */
	public GenericActionContributor(IMenuAction[] actions) {
		this.actions = actions;
	}
	
	/* (non-Javadoc)
	 * @see fede.workspace.domain.ui.IActionContributor#contributeMenuAction(fede.workspace.domain.IMenuAction.Menu, fede.workspace.domain.IItemNode[])
	 */
	public void contributeMenuAction(ViewDescription viewDescription, Menu menu, IItemNode[] selection) {
		for (IMenuAction a : actions) {
			if (a instanceof DescriptionMenu) {
				((DescriptionMenu)a).clear();
				menu.insert(a.getMenuPath(), a, true);
				continue;
			}
			if (a.isEnable(selection)) {
				a.setViewDescription(viewDescription);
				menu.insert(a.getMenuPath(), a, true);
			}
		}
	}
	
	
	/**
	 * Creates the menu.
	 * 
	 * @param id
	 *            the id
	 * @param label
	 *            the label
	 * @param path
	 *            the path
	 * @param icon
	 *            the icon
	 * 
	 * @return the i menu action
	 */
	public static IMenuAction createMenu(String id, String label, String path, URL icon) {
		return new DescriptionMenu(id, label, path, icon);
	}

}
