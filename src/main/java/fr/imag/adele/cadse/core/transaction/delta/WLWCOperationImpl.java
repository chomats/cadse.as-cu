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
package fr.imag.adele.cadse.core.transaction.delta;

import fr.imag.adele.cadse.core.CadseError;
import java.util.UUID;
import fr.imag.adele.cadse.core.internal.delta.InternalWLWCOperation;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;
import fr.imag.adele.cadse.objectadapter.AdaptableObjectImpl;
import fr.imag.adele.cadse.util.ArraysUtil;

public abstract class WLWCOperationImpl extends AdaptableObjectImpl implements InternalWLWCOperation, WLWCOperation {
	UUID						_operationId					= UUID.randomUUID();
	private final OperationType		_type;
	protected final WLWCOperation	_parent;
	long							_commitFlag						= 0;
	boolean							_loaded;
	CadseError[]					_errors							= null;
	private long					_timeStamp						= System.nanoTime();

	public static long				beforeDeletingDestinationItem	= 0x00001;
	public static long				beforeDeletingLink				= 0x00002;
	public static long				mustDeleteSource				= 0x00004;
	public static long				beforeDeletingSourceItem		= 0x00008;

	public WLWCOperationImpl(OperationType type, WLWCOperation parent) {
		this._type = type;
		this._parent = parent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.internal.delta.WLWCOperation#addError(java.lang
	 * .String)
	 */
	public void addError(String msg, Object... args) {
		addError(new CadseError(msg, args));
	}

	@Override
	public void addError(CadseError e) {
		_errors = ArraysUtil.add(CadseError.class, _errors, e);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.delta.InternalWLWCOperation#addInParent()
	 */
	public void addInParent() {
		getWorkingCopy().actionAddOperation(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.delta.InternalWLWCOperation#removeInParent()
	 */
	public void removeInParent() {
		getWorkingCopy().actionRemoveOperation(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.internal.delta.WLWCOperation#getOperationType()
	 */
	public OperationType getOperationType() {
		return _type;
	}

	public boolean isSetCommitFlag(long setBit) {
		return (_commitFlag & setBit) != 0;
	}

	public void setCommitFlag(long setBit) {
		this._commitFlag |= setBit;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.internal.delta.WLWCOperation#getOperationId()
	 */
	public UUID getOperationId() {
		return _operationId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.internal.delta.WLWCOperation#getWorkingCopy()
	 */
	public LogicalWorkspaceTransaction getWorkingCopy() {
		return _parent.getWorkingCopy();
	}

	@Override
	public WLWCOperation getParentOperDelta() {
			return _parent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.internal.delta.WLWCOperation#getParentType()
	 */
	public OperationType getParentType() {
		if (_parent == null) {
			return null;
		}
		return _parent.getOperationType();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.internal.delta.WLWCOperation#isModified()
	 */
	public boolean isModified() {
		return false;
	}

	public void setLoaded(boolean loaded) {
		this._loaded = loaded;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.internal.delta.WLWCOperation#isLoaded()
	 */
	public boolean isLoaded() {
		return _loaded;
	}

	protected void changeTimeStamp() {
		_timeStamp = System.nanoTime();
	}

	public long getTimeStamp() {
		return _timeStamp;
	}
}
