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

public abstract class ObjectTeamChange implements ITeamChangeObject {

	protected int	change;

	public ObjectTeamChange() {
		super();
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.delta.revision.ITeamChangeObject#hasChange()
	 */
	public boolean hasChange() {
		return (change & WorkspaceLogiqueRevisionDelta.HAS_CHANGE) != 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.delta.revision.ITeamChangeObject#hasLocalChange()
	 */
	public boolean hasLocalChange() {
		return (change & WorkspaceLogiqueRevisionDelta.HAS_LOCAL_CHANGE) != 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.delta.revision.ITeamChangeObject#hasRemoteChange()
	 */
	public boolean hasRemoteChange() {
		return (change & WorkspaceLogiqueRevisionDelta.HAS_REMOTE_CHANGE) != 0;
	}

	public void acceptRemoteChange() {
		if (hasRemoteChange()) {
			change |= WorkspaceLogiqueRevisionDelta.ACCEPT_REMOTE;
			change &= ~WorkspaceLogiqueRevisionDelta.REFUSE_REMOTE;
		}
	}

	public void refuseRemoteChange() {
		if (hasRemoteChange()) {
			change |= WorkspaceLogiqueRevisionDelta.REFUSE_REMOTE;
			change &= ~WorkspaceLogiqueRevisionDelta.ACCEPT_REMOTE;
		}
	}

	public boolean hasAcceptRemoteChange() {
		if (hasRemoteChange()) {
			return (change & WorkspaceLogiqueRevisionDelta.ACCEPT_REMOTE) != 0;
		}
		return false;
	}

	public boolean hasRefuseRemoteChange() {
		if (hasRemoteChange()) {
			return (change & WorkspaceLogiqueRevisionDelta.REFUSE_REMOTE) != 0;
		}
		return false;
	}

	public boolean hasAcceptLocalChange() {
		if (hasLocalChange()) {
			return (change & WorkspaceLogiqueRevisionDelta.ACCEPT_LOCAL) != 0;
		}
		return false;
	}

	public boolean hasRefuseLocalChange() {
		if (hasLocalChange()) {
			return (change & WorkspaceLogiqueRevisionDelta.REFUSE_LOCAL) != 0;
		}
		return false;
	}

	public void acceptLocalChange() {
		if (hasLocalChange()) {
			change |= WorkspaceLogiqueRevisionDelta.ACCEPT_LOCAL;
			change &= ~WorkspaceLogiqueRevisionDelta.REFUSE_LOCAL;
		}
	}

	public void refuseLocalChange() {
		if (hasLocalChange()) {
			change &= ~WorkspaceLogiqueRevisionDelta.ACCEPT_LOCAL;
			change |= WorkspaceLogiqueRevisionDelta.REFUSE_LOCAL;
		}
	}

	public boolean isRemoteAdded() {
		return isSet(WorkspaceLogiqueRevisionDelta.REMOTE_ADD);
	}

	public boolean isRemoteDeleted() {
		return isSet(WorkspaceLogiqueRevisionDelta.REMOTE_DELETE);
	}

	public boolean isLocalAdded() {
		return isSet(WorkspaceLogiqueRevisionDelta.LOCAL_ADD);
	}

	public boolean isLocalDeleted() {
		return isSet(WorkspaceLogiqueRevisionDelta.LOCAL_DELETE);
	}

	boolean isSet(int flags) {
		return (change & flags) == flags;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.delta.revision.ITeamChangeObject#isLocalChanged()
	 */
	public boolean isLocalChanged() {
		return (change & WorkspaceLogiqueRevisionDelta.HAS_LOCAL_CHANGE) != 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.delta.revision.ITeamChangeObject#isRemoteChanged()
	 */
	public boolean isRemoteChanged() {
		return (change & WorkspaceLogiqueRevisionDelta.HAS_REMOTE_CHANGE) != 0;
	}

}