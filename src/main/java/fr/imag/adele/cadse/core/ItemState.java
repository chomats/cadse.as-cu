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
 * Represents the different state of an item.
 * 
 * NOT_IN_WORKSPACE -> CREATED -> DELETED
 */
public enum ItemState {

	/**
	 * State representing an item which is not present in logical workspace.
	 */
	NOT_IN_WORKSPACE,

	/**
	 * State representing an item present in the logical workspace (the related
	 * item creation operation has been committed). This item is visible in
	 * logical workspace. Item Id is set and all mandatory attributes must be
	 * set.
	 * 
	 * It is the normal state (most of time) of an item.
	 */
	CREATED,

	/**
	 * State representing a deleted item. A deleted item does no more exist and
	 * is not visible in logical workspace. User cannot perform any operation on
	 * it.
	 */
	DELETED,
	/**
	 * en cours de modification
	 */
	MODIFING,

}
