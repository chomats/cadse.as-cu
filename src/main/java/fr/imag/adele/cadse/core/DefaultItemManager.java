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

import java.lang.reflect.Method;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.imag.adele.cadse.core.Validator.ProblemReporter;
import fr.imag.adele.cadse.core.content.ContentItem;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;
import fr.imag.adele.cadse.core.transaction.delta.ImmutableWorkspaceDelta;
import fr.imag.adele.cadse.core.transaction.delta.ItemDelta;

public class DefaultItemManager implements IItemManager {
	public static final String	CANNOT_RENAME		= "Cannot rename";
	public static final String	CANNOT_DELETE		= "Cannot delete";

	private ItemType			_itemType;
	private String				_id_pattern;
	private Matcher				_valid_pattern		= null;
	private String				_errorMessage;
	private boolean				_init_notification	= false;
	private boolean				_notification		= false;

	public DefaultItemManager() {
	}

	public boolean hasNotification() {
		if (!_init_notification) {
			try {
				Method m = getClass().getMethod("notifie", Item.class, ImmutableWorkspaceDelta.class);
				_notification = m.getDeclaringClass() != DefaultItemManager.class;
			} catch (SecurityException e) {
			} catch (NoSuchMethodException e) {
			}
			_init_notification = true;
		}
		return _notification;
	}

	final public ItemType getItemType() {
		return _itemType;
	}

	final public void setItemType(ItemType it) {
		this._itemType = it;
	}

	public String getQualifiedDisplayName(Item item) {
		return item.getType().getDisplayName() + " " + item.getDisplayName();
	}

	// // item id
	//
	// public String getQualifiedName(Item item) {
	// return item.getShortName();
	// }

	public String validateShortName(Item futurItem, String shortName) {
		if (_valid_pattern != null && !validId(shortName, _valid_pattern)) {
			if (_errorMessage == null || _errorMessage.length() == 0) {
				return "Invalid name : " + _valid_pattern.pattern();
			}
			return _errorMessage;
		}
		return null;
	}

	/**
	 * 0: item-name 1: parent-id 2: parent-name 3: parent-type-name 4:
	 * item-type-name 5: lynk-type 6: item-id
	 */
	public String computeQualifiedName(Item item, String shortid, Item parent, LinkType lt) {
		String parent_id = "";
		String parent_name = "";
		String parent_type = "";
		String link_type_name = "";
		if (parent != null) {
			parent_id = parent.getQualifiedName();
			parent_name = parent.getName();
			parent_type = parent.getType().getName();
		}
		if (lt != null) {
			link_type_name = lt.getName();
		}
		if (_id_pattern == null) {
			throw new NullPointerException("The qualified name template is null for " + item.getType().getDisplayName());
		}
		return MessageFormat.format(_id_pattern, shortid, parent_id, parent_name, parent_type, item.getType()
				.getDisplayName(), link_type_name);
	}

	protected boolean validId(String id, Matcher pattern) {
		pattern.reset(id);
		return pattern.matches();
	}

	public String canCreateLink(Item source, Item dest, LinkType lt) {
		return null;
	}

	public String canDeleteLink(Link link) {
		return null;
	}

	public String canCreateChildItem(Item itemParent, LinkType lt, ItemType destType) {
		if (itemParent.isRuntime())
			return "cannot change static item";
		return null;
	}

	public String canCreateMeItem(Item itemParent, LinkType lt, ItemType destType) {
		// TODO Auto-generated method stub
		return null;
	}

	public String canDeleteItem(Item item) {
		if (item.isRuntime())
			return "cannot change static item";
		return null;
	}
	
	public boolean hasImageByItem() {
		return false;
	}

	public String getDisplayName(Item item) {
		return item.getName();
	}

	public void setErrorValidId(String error_valid_id) {
		if (error_valid_id != null && error_valid_id.length() == 0) {
			error_valid_id = null;
		}
		this._errorMessage = error_valid_id;
	}

	public void setPatternId(String pattern_id) {
		this._id_pattern = pattern_id;
	}

	public void setPatternValidId(String pattern_valid_id) {
		this._valid_pattern = Pattern.compile(pattern_valid_id).matcher("");
	}

	@Deprecated
	public String getDefaultShortName() {
		return null;
	}

	public String getImage(Item item) {
		return null;
	}

	public boolean isAbstract(Item parent, LinkType type) {
		return false;
	}

	

	@Deprecated
	public boolean hasContent(Item item) {
		return true;
	}

	@Deprecated
	public void doubleClick(Item item) {
		LogicalWorkspaceTransaction copy = item.getLogicalWorkspace().createTransaction();
		ItemDelta oper = copy.getItem(item.getId());
		if (oper == null) {
			copy.rollback();
		} else {
			oper.doubleClick();
			try {
				copy.commit();
			} catch (CadseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public String canRenameItem(Item item) {
		return null;
	}

	@Deprecated
	public boolean isOutgoingLinkSorted() {
		return true;
	}

	
	@Deprecated
	public void contributeMenuNewAction(Menu menu, Item parent) {
	}

	public String getDisplayCreate(LinkType lt, ItemType destItemType) {
		return null; // the default value (is itemDestType.getDsiplayName();
	}

	

}
