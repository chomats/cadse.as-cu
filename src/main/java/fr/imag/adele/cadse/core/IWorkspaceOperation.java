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

import fr.imag.adele.cadse.core.transaction.delta.ImmutableWorkspaceDelta;




/**
 * The Interface IWorkspaceOperation.
 */
public interface IWorkspaceOperation {

	/**
	 * Notifie change event.
	 * 
	 * @param id
	 *            the id
	 * @param values
	 *            the values
	 */
	public abstract void notifieChangeEvent(final ChangeID id,
			final Object... values);


	
	
	/**
	 * Gets the number.
	 * 
	 * @return the number
	 */
	long getNumber() ;
	
	/**
	 * Gets the event delta.
	 * 
	 * @return the event delta
	 */
	ImmutableWorkspaceDelta getEventDelta();
	
	/**
	 * Gets the current thread.
	 * 
	 * @return the current thread
	 */
	Thread getCurrentThread();
	
	/**
	 * Gets the number lock.
	 * 
	 * @return the number lock
	 */
	int getNumberLock();
	
	

}
