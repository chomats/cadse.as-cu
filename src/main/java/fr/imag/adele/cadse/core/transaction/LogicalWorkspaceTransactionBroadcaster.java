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
package fr.imag.adele.cadse.core.transaction;

/**
 * All objects which implements this interface are able to notify about logical
 * workspace operations related to them.
 * 
 * If object is an LogicalWorkspace, listeners will be notified about all
 * actions made on this logical workspace. If object is an ItemType, listeners
 * will be notified about all actions on this ItemType and all its instances
 * (items of this type). If object is an LinkType, listeners will be notified
 * about all actions on this LinkType and all its instances (links of this
 * type).
 * 
 * @author Thomas
 * 
 */
public interface LogicalWorkspaceTransactionBroadcaster {

	/**
	 * Add a listener to this object.
	 * 
	 * @param listener a listener
	 */
	public void addLogicalWorkspaceTransactionListener(LogicalWorkspaceTransactionListener listener);

	/**
	 * Remove a listener to this object.
	 * 
	 * @param listener
	 *            a listener
	 */
	public void removeLogicalWorkspaceTransactionListener(LogicalWorkspaceTransactionListener listener);

	/**
	 * Returns all listeners attached to this object.
	 * 
	 * @return all listeners attached to this object.
	 */
	public LogicalWorkspaceTransactionListener[] getLogicalWorkspaceTransactionListener();

}
