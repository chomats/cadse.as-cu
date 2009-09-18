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

import fr.imag.adele.cadse.core.ui.view.ViewDescription;

/**
 * Represents a contextual menu action.
 * 
 * @author chomats
 */
public abstract class IMenuAction {

	/** 
	 * constant used to specify that a menu action has no children menu. 
	 */
	private static final IMenuAction[]	NO_CHILDREN		= new IMenuAction[0];

	/** 
	 * Menu contexts are places where menu actions are show.
	 * They are separated from each other by a separator.
	 * Higher context are shown under a lower one.
	 */
	public static final String			CONTEXT_1_MENU	= "context1";

	/** 
	 * Menu contexts are places where menu actions are show.
	 * They are separated from each other by a separator.
	 * Higher context are shown under a lower one.
	 */
	public static final String			CONTEXT_2_MENU	= "context2";

	/** 
	 * Menu contexts are places where menu actions are show.
	 * They are separated from each other by a separator.
	 * Higher context are shown under a lower one.
	 */
	public static final String			CONTEXT_3_MENU	= "context3";

	/** 
	 * Menu contexts are places where menu actions are show.
	 * They are separated from each other by a separator.
	 * Higher context are shown under a lower one.
	 */
	public static final String			CONTEXT_4_MENU	= "context4";

	/** 
	 * Menu contexts are places where menu actions are show.
	 * They are separated from each other by a separator.
	 * Higher context are shown under a lower one.
	 */
	public static final String			CONTEXT_5_MENU	= "context5";

	/** 
	 * Menu contexts are places where menu actions are show.
	 * They are separated from each other by a separator.
	 * Higher context are shown under a lower one.
	 */
	public static final String			CONTEXT_6_MENU	= "context6";

	/** 
	 * Menu contexts are places where menu actions are show.
	 * They are separated from each other by a separator.
	 * Higher context are shown under a lower one.
	 */
	public static final String			NEW_MENU		= CONTEXT_1_MENU + "/new";

	/** 
	 * Represents a separator of menu actions.
	 */
	public final static IMenuAction		SEPARATOR		= new Separator();

	/**
	 * Description of current view which show this menu action.
	 */
	private ViewDescription				_viewDescription;

	/**
	 * Returns action id.
	 * 
	 * @return action id.
	 */
	public String getId() {
		return null;
	}

	/**
	 * Returns the action label.
	 * 
	 * @return the action label.
	 */
	public abstract String getLabel();

	/**
	 * Returns the action image.
	 * If no image is specified, returns null.
	 * 
	 * @return the action image.
	 */
	public abstract URL getImage();

	/**
	 * Returns the action description show in a tool tip.
	 * 
	 * @return the action description show in a tool tip.
	 */
	public String getToolTip() {
		return getLabel();
	}

	/**
	 * Returns descriptor of action image when the action is disabled.
	 * 
	 * @return descriptor of action image when the action is disabled.
	 */
	public Object getDisabledImageDescriptor() {
		return null;
	}

	/**
	 * Returns descriptor of action image when the action is enabled.
	 * 
	 * @return descriptor of action image when the action is enabled.
	 */
	public Object getImageDescriptor() {
		return null;
	}

	/**
	 * Returns descriptor of action image when mouse pointer hovers on this action.
	 * 
	 * @return descriptor of action image when mouse pointer hovers on this action.
	 */
	public Object getHoverImageDescriptor() {
		return null;
	}

	/**
	 * Returns the menu path of this action.
	 * A menu path is concatenation of menu names and action names separated by a slash.
	 * For example, rootMenu/subMenu2/action4.
	 * 
	 * @return the menu path of this action.
	 */
	public String getMenuPath() {
		return null;
	}

	/**
	 * Execute this action.
	 * 
	 * @param selection selected nodes in the CADSE view
	 *
	 * @throws CadseException
	 */
	public abstract void run(IItemNode[] selection) throws CadseException;

	/**
	 * Returns true if it is separator.
	 * 
	 * @return true if it is separator.
	 */
	public boolean isSeparator() {
		return false;
	}

	/**
	 * Returns true if it is a group.
	 * A group is a list of menu actions which will be shown in the same order.
	 * 
	 * @return true if it is a group.
	 */
	public boolean isGroup() {
		return false;
	}

	/**
	 * Returns true if it is a menu.
	 * 
	 * @return true, if is menu
	 */
	public boolean isMenu() {
		return false;
	}

	/**
	 * Returns children of this menu action.
	 * Children are shown as submenu from this menu aciton.
	 * 
	 * @return children of this menu action.
	 */
	public IMenuAction[] getChildren() {
		return NO_CHILDREN;
	}

	/**
	 * Returns true if it is enable.
	 * 
	 * @param selection selected nodes in the CADSE view
	 * 
	 * @return true if it is enable.
	 */
	public boolean isEnable(IItemNode[] selection) {
		return true;
	}

	/**
	 * Load.
	 * 
	 * @param id
	 *            the id
	 * @param label
	 *            the label
	 * @param path
	 *            the path
	 * @param forNb
	 *            the for nb
	 * @param icon
	 *            the icon
	 */
	public void init(String id, String label, String path, int forNb, URL icon) {
		
	}

	/**
	 * Set description of current CADSE view.
	 * 
	 * @param viewDescription description of current CADSE view
	 */
	public void setViewDescription(ViewDescription viewDescription) {
		this._viewDescription = viewDescription;
	}

	/**
	 * Returns description of current CADSE view.
	 * 
	 * @return description of current CADSE view.
	 */
	public ViewDescription getViewDescription() {
		return _viewDescription;
	}
}
