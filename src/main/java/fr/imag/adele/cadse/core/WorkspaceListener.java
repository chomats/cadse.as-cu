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

import java.util.EventListener;

import fr.imag.adele.cadse.core.transaction.delta.ImmutableWorkspaceDelta;

/**
 * This class should be extended to implement a listener which does not modify
 * the logical workspace. Used when you want to be notified of logical workspace
 * state change asynchronously. The time when this kind of listener is called is
 * not specified.
 * 
 * It is most of time used to update views managed by another technology than
 * CADSE view one.
 * 
 * Please, use init() method in an item manager to add a listener.
 * 
 * @see IItemManager#init()
 * 
 * @author Thomas
 * 
 */
public abstract class WorkspaceListener implements EventListener {

	/**
	 * Represents all listener types. It defines a priority for listeners. UI
	 * listeners are notified more often than BUILD ones and they are called
	 * before the BUILD ones.
	 */
	public static enum ListenerKind {
		/**
		 * Listener is used for short running tasks like UI updates. For
		 * example, to update GMF views.
		 */
		UI,

		/**
		 * Listener is used for long running tasks like builds (ant builds).
		 */
		BUILD,
	}

	/**
	 * Filter used to ignore events.
	 */
	private EventFilter		_filter	= null;

	/**
	 * Priority of this listener (Default is UI priority).
	 */
	private ListenerKind	_kind	= ListenerKind.UI;

	/**
	 * Callback method of the listener.
	 * 
	 * @param delta
	 *            delta which represents all modifications performed on the
	 *            logical workspace.
	 */
	public abstract void workspaceChanged(ImmutableWorkspaceDelta delta);

	/**
	 * Sets a filter to ignore events that we are not interested in.
	 * 
	 * @param filter
	 *            an event filter
	 */
	public void setFilter(EventFilter filter) {
		this._filter = filter;
	}

	/**
	 * Returns event filter.
	 * 
	 * @return event filter.
	 */
	public EventFilter getFilter() {
		return _filter;
	}

	/**
	 * Returns listener priority.
	 * 
	 * @return listener priority.
	 */
	public ListenerKind getKind() {
		return _kind;
	}

	/**
	 * Sets listener priority (equivalent to listener kind).
	 * 
	 * @param kind
	 *            listener priority
	 */
	public void setKind(ListenerKind kind) {
		this._kind = kind;
	}

}
