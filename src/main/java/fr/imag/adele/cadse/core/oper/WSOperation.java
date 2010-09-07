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
package fr.imag.adele.cadse.core.oper;

import fr.imag.adele.cadse.core.CadseException;

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

public abstract class WSOperation {
	private Throwable	ex;

	public final void execute() {
		try {
			excecuteImpl();
		} catch (Throwable e) {
			this.ex = e;
		}
	}

	protected abstract void excecuteImpl() throws Throwable;

	public Throwable getEx() {
		return ex;
	}

	static protected boolean equals(Object v1, Object v2) {
		if (v1 == null && v2 == null)
			return true;
		if (v1 != null && v2 != null) {
			if (v1.getClass() != v2.getClass())
				return false;
			return v1.equals(v2);
		}
		return false;
	}

	public abstract String getDiplayComment();

	public void throwCadseException() throws CadseException {
		if (ex == null)
			return;
		if (ex instanceof CadseException) {
			throw (CadseException) ex;
		}
		if (ex instanceof RuntimeException) {
			throw (RuntimeException) ex;
		}
		throw new CadseException(ex.getMessage(), ex);
	}
}
