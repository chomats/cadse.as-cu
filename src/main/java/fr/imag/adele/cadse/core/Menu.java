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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Represents a contextual menu action.
 * 
 * @author chomats
 */
public class Menu extends IMenuAction {

	/** The id. */
	private String				_menuid;

	/** The children. */
	private List<IMenuAction>	_children;

	/** The label. */
	private String				_label;

	/** The icon. */
	private String				_icon;

	/**
	 * Instantiates a new menu.
	 * 
	 * @param id
	 *            the id
	 * @param label
	 *            the label
	 * @param icon
	 *            the icon
	 * @param children
	 *            the children
	 */
	public Menu(String id, String label, String icon, List<IMenuAction> children) {
		this._menuid = id;
		this._children = children;
		this._label = label;
		this._icon = icon;
	}

	/**
	 * Instantiates a new menu.
	 * 
	 * @param id
	 *            the id
	 * @param label
	 *            the label
	 * @param icon
	 *            the icon
	 */
	public Menu(String id, String label, String icon) {
		this._menuid = id;
		this._children = new ArrayList<IMenuAction>();
		this._label = label;
		this._icon = icon;
	}

	/**
	 * Instantiates a new menu.
	 */
	public Menu() {
		this._menuid = null;
		this._children = new ArrayList<IMenuAction>();
		this._label = null;
		this._icon = null;
	}

	/**
	 * Instantiates a new menu.
	 * 
	 * @param id
	 *            the id
	 * @param label
	 *            the label
	 * @param icon
	 *            the icon
	 * @param children
	 *            the children
	 */
	public Menu(String id, String label, String icon, IMenuAction[] children) {
		this._menuid = id;
		this._children = new ArrayList(Arrays.asList(children));
		this._label = label;
		this._icon = icon;
	}

	public void clear() {
		this._children.clear();
	}

	/**
	 * Adds the to group.
	 * 
	 * @param groupName
	 *            the group name
	 * @param item
	 *            the item
	 * @param append
	 *            the append
	 */
	public void addToGroup(String groupName, IMenuAction item, boolean append) {
		int i;
		Iterator items = _children.iterator();
		for (i = 0; items.hasNext(); i++) {
			IMenuAction o = (IMenuAction) items.next();
			if (o.isGroup()) {
				String id = o.getId();
				if (id != null && id.equalsIgnoreCase(groupName)) {
					i++;
					if (append) {
						for (; items.hasNext(); i++) {
							IMenuAction ci = (IMenuAction) items.next();
							if (ci.isGroup()) {
								break;
							}
						}
					}

					_children.add(i, item);
					return;
				}
			}
		}
		throw new IllegalArgumentException("Group not found: " + groupName);//$NON-NLS-1$
	}

	/**
	 * Insert.
	 * 
	 * @param path
	 *            the path
	 * @param a
	 *            the a
	 * @param append
	 *            the append
	 */
	public void insert(String path, IMenuAction a, boolean append) {
		List<IMenuAction> l = getList();
		if (path == null) {
			if (append) {
				l.add(a);
			} else {
				l.add(0, a);
			}
			return;
		}
		int separator = path.indexOf('/');
		String id;
		String rest = null;
		if (separator != -1) {
			id = path.substring(0, separator);
			rest = path.substring(separator + 1);
		} else {
			id = path;
		}

		IMenuAction fa = find(id);
		if (fa == null) {
			return;
		}

		if (fa instanceof Menu) {
			((Menu) fa).insert(rest, a, append);
			return;
		} else if (fa.isGroup()) {
			addToGroup(id, a, append);
		}

	}

	/*
	 * (non-Javadoc) Method declared on IContributionManager.
	 */
	/**
	 * Find.
	 * 
	 * @param id
	 *            the id
	 * 
	 * @return the i menu action
	 */
	public IMenuAction find(String id) {
		Iterator e = _children.iterator();
		while (e.hasNext()) {
			IMenuAction item = (IMenuAction) e.next();
			String itemId = item.getId();
			if (itemId != null && itemId.equalsIgnoreCase(id)) {
				return item;
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getIcon()
	 */
	@Override
	public String getImage() {
		return _icon;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getLabel()
	 */
	@Override
	public String getLabel() {
		return _label;
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
		return _menuid;
	}

	/**
	 * Gets the list.
	 * 
	 * @return the list
	 */
	public List<IMenuAction> getList() {
		return _children;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#isMenu()
	 */
	@Override
	public boolean isMenu() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getChildren()
	 */
	@Override
	public IMenuAction[] getChildren() {
		return (_children).toArray(new IMenuAction[(_children).size()]);
	}

	/**
	 * To string.
	 * 
	 * @param sb
	 *            the sb
	 * @param tab
	 *            the tab
	 */
	public void toString(StringBuilder sb, String tab) {
		sb.append(tab).append("Menu ");
		if (getLabel() != null) {
			sb.append(getLabel());
		}
		sb.append("\n");
		tab = tab + " ";
		for (IMenuAction ma : _children) {
			if (ma instanceof Menu) {
				((Menu) ma).toString(sb, tab);
			} else {
				sb.append(tab).append(ma.toString()).append("\n");
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, "");
		return sb.toString();
	}

	public Menu getMenu(String newMenuId) {
		for (IMenuAction ma : _children) {
			if (ma instanceof Menu) {
				if (ma.getId().equals(newMenuId))
					return (Menu) ma;
			} 
		}
		return null;
	}

}
