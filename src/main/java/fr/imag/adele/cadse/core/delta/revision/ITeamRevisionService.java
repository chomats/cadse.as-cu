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
package fr.imag.adele.cadse.core.delta.revision;

import java.util.Collection;
import java.util.List;

import java.util.UUID;
import fr.imag.adele.cadse.core.LogicalWorkspace;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;
import fr.imag.adele.cadse.core.transaction.delta.ItemDelta;
import fr.imag.adele.cadse.util.IProgressMonitor;

public interface ITeamRevisionService {

	public void getDeltaFromItemId(WorkspaceLogiqueRevisionDelta delta, LogicalWorkspace wl, List<UUID> ids,
			LinkDescriptionFilter filter, boolean trace, IProgressMonitor monitor, boolean all, boolean noOptimization,
			boolean useinforemote);

	public ITeamItem[] getTeamItems(WorkspaceLogiqueRevisionDelta delta, boolean trace, IProgressMonitor monitor);

	public UUID[] getIds(IProgressMonitor monitor);

	public UUID[] getHeadIds(IProgressMonitor monitor);

	public UUID[] getLocalIds(IProgressMonitor monitor);

	public ItemDelta getBase(LogicalWorkspaceTransaction t, UUID id, IProgressMonitor monitor);

	public ItemDelta getHead(LogicalWorkspaceTransaction t, UUID id, IProgressMonitor monitor);

	public ItemDelta getLocal(LogicalWorkspaceTransaction t, UUID id, IProgressMonitor monitor);

	void teamRevert(List<ItemRevisionDelta> ids, IProgressMonitor monitor);

	void teamUpdate(List<ItemRevisionDelta> ids, IProgressMonitor monitor);

	void teamStatus(List<ItemRevisionDelta> ids, Appendable p, IProgressMonitor monitor);

	void teamCommit(String message, List<ItemRevisionDelta> ids, IProgressMonitor monitor);

	void teamDelete(List<ItemRevisionDelta> ids, IProgressMonitor monitor);

	void disablePersistence();

	void enablePersistance();

	void save(Collection<ItemRevisionDelta> remoteChangeItems);

	void logErrorMessage(ItemRevisionDelta source, String message);
}
