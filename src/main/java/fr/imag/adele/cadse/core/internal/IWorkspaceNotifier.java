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
package fr.imag.adele.cadse.core.internal;

import fr.imag.adele.cadse.core.ChangeID;

public interface IWorkspaceNotifier {

	static class NullWorkspanceNotififier implements IWorkspaceNotifier {
		private NullWorkspanceNotififier() {
		}

		public void notifieChangeEvent(ChangeID id, Object... values) {
		}
	}

	public final static IWorkspaceNotifier	NULL	= new NullWorkspanceNotififier();

	/**
	 * ajout d'un lien CHANGE_CREATE_OUTGOING_LINK CHANGE_CREATE_INCOMING_LINK
	 * delete d'un lien outgoing CHANGE_DELETE_OUTGOING_LINK delete d'un lien
	 * incoming CHANGE_DELETE_INCOMING_LINK set attribut CHANGE_SET_ATTRIBUT
	 * close CHANGE_CLOSE open CHANGE_OPEN valid CHANGE_VALID content
	 * CHANGE_CONTENT readonly CHANGE_READ_ONLY CHANGE_RENAME.
	 * 
	 * @param id
	 *            the id
	 * @param values
	 *            the values
	 */
	public abstract void notifieChangeEvent(ChangeID id, Object... values);

}