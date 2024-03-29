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

public class OperationTypeCst {

	public static OperationType	CREATE_OPERATION		= new OperationType();
	public static OperationType	DELETE_OPERATION		= new OperationType();
	public static OperationType	SET_ATTRIBUTE_OPERATION	= new OperationType();
	public static OperationType	KEY_DELTA				= new OperationType();

	public static OperationType	ITEM_OPERATION			= new OperationType();
	public static OperationType	LINK_OPERATION			= new OperationType();
	public static OperationType	ORDRE_OPERATION			= new OperationType();
	public static OperationType	MAPPING_OPERATION		= new OperationType();

}
