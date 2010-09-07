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
package fr.imag.adele.cadse.core.ui;

/**
 * The Class EventAdapter.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public abstract class EventAdapter implements IEventListener {

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.IEventListener#init(fede.workspace.domain.ui.UIField)
	 */
	public void init(UIField field) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.IEventListener#notifieSubValueAdded(fede.workspace.domain.ui.UIField,
	 *      java.lang.Object)
	 */
	public void notifieSubValueAdded(UIField field, Object added) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.IEventListener#notifieSubValueRemoved(fede.workspace.domain.ui.UIField,
	 *      java.lang.Object)
	 */
	public void notifieSubValueRemoved(UIField field, Object removed) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.IEventListener#notifieValueChanged(fede.workspace.domain.ui.UIField,
	 *      java.lang.Object)
	 */
	public void notifieValueChanged(UIField field, Object value) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.IEventListener#notifieValueDeleted(fede.workspace.domain.ui.UIField,
	 *      java.lang.Object)
	 */
	public void notifieValueDeleted(UIField field, Object oldvalue) {
	}

}
