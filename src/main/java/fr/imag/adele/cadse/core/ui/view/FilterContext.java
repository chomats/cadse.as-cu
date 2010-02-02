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
package fr.imag.adele.cadse.core.ui.view;

import java.util.HashSet;
import java.util.Set;

import fr.imag.adele.cadse.core.GroupType;
import fr.imag.adele.cadse.core.IItemNode;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.ui.IPage;
import fr.imag.adele.cadse.core.ui.Pages;
import fr.imag.adele.cadse.core.ui.UIField;

/**
 * la view, la page, le field, le type du lien, l'item source
 * 
 * @author chomats
 * 
 */
public class FilterContext {

	protected Item				_itemSource;
	protected ViewDescription	_view;
	protected IPage				_page;
	protected LinkType			_lt;
	protected ItemType			_destType;

	protected UIField			_field;
	protected IItemNode			_node;
	protected Pages				_pages;

	protected GroupType			_gt;
	protected GroupType			_gh;
	protected LinkType			_glt;

	protected FilterContext() {

	}

	public FilterContext(Item source, LinkType lt, ItemType destType, ViewDescription view, IPage page, UIField field,
			IItemNode node, Pages pages, GroupType gt, GroupType g, LinkType glt) {
		super();
		this._node = node;
		this._itemSource = source;
		this._lt = lt;
		this._destType = destType;
		this._view = view;
		this._page = page;
		this._field = field;
		this._pages = pages;
		this._gt = gt;
		this._gh = g;
		this._glt = glt;
	}

	public FilterContext(Item source, LinkType lt, ItemType destType, ViewDescription view, IPage page, UIField field,
			IItemNode node, Pages pages) {
		super();
		this._node = node;
		this._itemSource = source;
		this._lt = lt;
		this._destType = destType;
		this._view = view;
		this._node = node;
		this._page = page;
		this._field = field;
		this._pages = pages;
	}

	public FilterContext(FilterContext filterContext, IPage page) {
		_itemSource = filterContext._itemSource;
		_view = filterContext._view;
		_pages = filterContext._pages;
		_page = page;
		_destType = filterContext._destType;
		_lt = filterContext._lt;
		_field = null;
		_node = filterContext._node;
		_gt = filterContext._gt;
		_gh = filterContext._gh;
		_glt = filterContext._glt;

	}

	public FilterContext(FilterContext filterContext, UIField field) {
		_itemSource = filterContext._itemSource;
		_view = filterContext._view;
		_pages = filterContext._pages;
		_page = filterContext._page;
		_lt = filterContext._lt;
		_destType = filterContext._destType;
		_field = field;
		_node = filterContext._node;
		_gt = filterContext._gt;
		_gh = filterContext._gh;
		_glt = filterContext._glt;
	}

	public FilterContext(FilterContext cxt) {
		_itemSource = cxt.getItemSource();
		_view = cxt.getView();
		_pages = cxt.getPages();
		_page = cxt.getPage();
		_lt = cxt.getLinkType();
		_destType = cxt.getDestinationType();
		_field = cxt.getField();
		_node = cxt.getItemNode();
		_gt = cxt.getGroupType();
		_gh = cxt.getGroupHead();
		_glt = cxt.getGroupLinkType();
	}

	public FilterContext(ViewDescription view, IItemNode node) {
		this._view = view;
		this._node = node;
	}

	public ViewDescription getView() {
		return _view;
	}

	public LinkType getLinkType() {
		return _lt;
	}

	public Item getItemSource() {
		return _itemSource;
	}

	public IPage getPage() {
		return _page;
	}

	public UIField getField() {
		return _field;
	}

	public IItemNode getItemNode() {
		return _node;
	}

	public Pages getPages() {
		return _pages;
	}

	public ItemType getGroupHead() {
		return (ItemType) _gh;
	}

	public LinkType getGroupLinkType() {
		return _glt;
	}

	public GroupType getGroupType() {
		return _gt;
	}

	public ItemType getDestinationType() {
		return _destType;
	}

	public Set<Item> getItemFromContext() {
		ItemType it = getDestinationType();
		ViewDescription view = getView();
		Set<Item> result = new HashSet<Item>();
		ViewFilter[] viewfilters = view.getFilters();

		if (viewfilters != null) {
			for (ViewFilter f : viewfilters) {
				if (f.isPositifFilter()) {
					f.acceptSelect(this, result);
				}
			}
		}

		if (result.size() == 0) {
			result.addAll(it.getItems());
		}
		if (viewfilters != null) {
			for (ViewFilter f : viewfilters) {
				if (f.isNegatifFilter()) {
					f.filterSelect(this, result);
				}
			}
		}
		return result;
	}

	public void setItemSource(Item item) {
		_itemSource = item;
	}
}
