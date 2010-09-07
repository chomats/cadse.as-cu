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


/**
 * This enumeration represents all states that can have a LogicalWorkspace.<br/>
 * 
 * For WorkspaceLogique:
 * <ul>
 * <li>{@link #INIT} -> {@link #LOAD} -> {@link #RUN}</li>
 * <li>{@link #RELOAD} -> {@link #RUN} </li>
 * </ul>
 * 
 * 
 * For LogicalWorkspaceTransaction:
 * <ul>
 * <li>{@link #COPY_WRITE} -> {@link #COPY_PRE_LOAD} -> {@link #COPY_READ_ONLY}</li>
 * </ul>
 */
public enum WSModelState {
	
	/** 
	 * In initialization phase, process is loading items. 
	 */
	INIT,
	
	/** 
	 * Asked CADSE have been executed (and loaded).
	 * Loading of persisted items is being performed. 
	 */
	LOAD,
	
	/** 
	 * Persisted items are reloading. 
	 */
	RELOAD,
	
	/** 
	 * Normal state, all items are loaded. 
	 */
	RUN,
	
	/**
	 * Commit has not been already performed, actions can be performed on this transaction.
	 * This state appears only for LogicalWorkspaceTransaction.
	 */
	COPY_WRITE,
	
	/**
	 * Effective commit is being performed on this transaction.
	 * This state appears only for LogicalWorkspaceTransaction.
	 */
	COPY_PRE_LOAD,
	
	/**
	 * Commit or rollback has already been performed, no more action is allowed on this transaction.
	 * This state appears only for LogicalWorkspaceTransaction.
	 */
	COPY_READ_ONLY,
}
