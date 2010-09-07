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

import fr.imag.adele.cadse.core.CadseRuntime;
import java.util.UUID;
import fr.imag.adele.cadse.core.ItemType;

public interface InternalCadseRuntime extends InternalItem {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.CadseRuntime#addItemType(fede.workspace.domain.
	 * internal.ItemTypeImpl)
	 */
	abstract void addItemType(ItemType it);

	abstract void setRequiredCadses(CadseRuntime[] extendsCadse);

	abstract void setDescription(String description);

	abstract void setExecuted(boolean executed);

	abstract void setCadseroot(boolean cadseroot);

	abstract void setDisplayName(String displayName);

	public abstract void addError(String msg);

	/**
	 * @param idCadseDefintiion
	 */
	public void setIdCadseDefinition(UUID idCadseDefintiion);

	
	public abstract void setCstQualifiedClassName(String cstClass);

}
