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

	public static final CompactUUID	META_LINK_ID		= new CompactUUID(7525975296182863367L, -6733988287527508841L);	// 6871a2a8-5558-4607-a28c-1154a8482497

	/** The Constant ANY_ID. */
	public static final CompactUUID	ITEM_ID		= new CompactUUID(1481067329060227563L, -6059699345038497928L);	// "148dcee3-8512-49eb-abe7-9f8d25502778"


	static public CompactUUID EXT_ITEM_ID = new CompactUUID("d72bd5b1-cf11-4fa6-84f1-c12582dc5989");

	
	/** The Constant META_ITEMTYPE_ID. */
	public static final CompactUUID	ITEMTYPE_ID	= new CompactUUID(4864028770172945040L, -5928200930686985311L);
	// "43808065-4f70-4290-adba-cca999431ba1"
	
	
	

	/** The Constant CADSE_ROOT_MODEL. */
	public static final String		CADSE_ROOT_MODEL	= "Model.Workspace.CadseG";

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

	public Item createUnresolvedItem(ItemType itemType, String name,
			CompactUUID id) throws CadseException;

}