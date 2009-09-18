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
/*
 * Adele/LIG/ Grenoble University, France
 * 2006-2008
 */
package fr.imag.adele.cadse.core;

import java.io.File;
import java.util.concurrent.TimeoutException;

import fr.imag.adele.cadse.core.internal.IWorkspaceNotifier;
import fr.imag.adele.teamwork.db.ModelVersionDBService;

/**
 * The Interface WorkspaceDomain.
 * 
 */

public interface CadseDomain extends IWorkspaceNotifier {

	/** The Constant DOMAIN_NAME. */
	public static final String		DOMAIN_NAME			= "Workspace";

	public static final CompactUUID	META_LINK_ID		= new CompactUUID(-6545371884280260901L, 1328766321966205240L);	// 1270b9ee-024c-4938-a52a-2af33aa556db

	/** The Constant ANY_ID. */
	public static final CompactUUID	ITEM_TYPE_ID		= new CompactUUID(-8319073587239432622L, -6158067025215123703L);	// "8c8cb6a6-1442-4e52-aa8a-26aadb018f09"

	/**
	 * The Constant ANY_ID.
	 * 
	 * @deprecated use ITEM_TYPE_ID
	 */
	@Deprecated
	public static final CompactUUID	ANY_ID				= ITEM_TYPE_ID;													// "8c8cb6a6-1442-4e52-aa8a-26aadb018f09"

	/** The Constant META_ITEMTYPE_ID. */
	public static final CompactUUID	META_ITEMTYPE_ID	= new CompactUUID(-1425540810463033436L, -4910210400093615868L);	// "ec37762f-8b87-47a4-bbdb-6da811fdc904"

	/** The Constant CADSE_ROOT_MODEL. */
	public static final String		CADSE_ROOT_MODEL	= "Model.Workspace.CadseRoot";

	/** The Constant ID_ITEM_TYPE_ANY. */
	public static final int			ID_ITEM_TYPE_ANY	= -2;

	/**
	 * Get a workspace logique.
	 * 
	 * @return the workspace logique
	 */
	public LogicalWorkspace getLogicalWorkspace();

	/**
	 * Get location.
	 * 
	 * @return the location
	 */
	public abstract File getLocation();

	// /**
	// * Reload ws content.
	// */
	// @Deprecated
	// public void reloadWSContent();
	//
	// /**
	// * Disable persistance.
	// */
	// @Deprecated
	// public void disablePersistance();
	//
	// /**
	// * Enable persistance.
	// */
	// @Deprecated
	// public void enablePersistance();
	//
	// /**
	// * Checks if is enable persistance.
	// *
	// * @return true, if is enable persistance
	// */
	// @Deprecated
	// public boolean isEnablePersistance();

	/**
	 * Checks if is locked.
	 * 
	 * @return true, if is locked
	 */
	public boolean isLocked();

	/**
	 * Begin rule.
	 * 
	 * @param rule
	 *            the rule
	 */
	public void beginRule(Object rule);

	/**
	 * End rule.
	 * 
	 * @param rule
	 *            the rule
	 */
	public void endRule(Object rule);

	/**
	 * End operation.
	 */
	public void endOperation();

	/**
	 * Begin operation.
	 * 
	 * @param name
	 *            the name
	 * 
	 * @return the i workspace operation
	 */
	public IWorkspaceOperation beginOperation(String name);

	/**
	 * Begin operation.
	 * 
	 * @param name
	 *            the name
	 * @param wait
	 *            the wait
	 * 
	 * @return the i workspace operation
	 */
	public IWorkspaceOperation beginOperation(String name, boolean wait);

	public void waitEndAsyncEvents(int timeout) throws InterruptedException, TimeoutException;

	/**
	 * Returns versioning service used to save and restore items from a
	 * repository.
	 * 
	 * @return versioning service used to save and restore items from a
	 *         repository.
	 */
	public ModelVersionDBService getModelVersionDBService();

	public void error(Item item, String message, Throwable e);

	public void setReadOnly(Item item, boolean flag);

	/**
	 * Refreshes the content of the eclipse resource associated with an item
	 * 
	 * @param item
	 */
	public void refresh(Item item);

	public void log(Item item, int errorcode, String type, String message, Throwable e);

	public void log(String type, String message, Throwable e);

}