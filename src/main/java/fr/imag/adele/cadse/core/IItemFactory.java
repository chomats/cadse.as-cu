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
package fr.imag.adele.cadse.core;

import fr.imag.adele.cadse.core.transaction.delta.ItemDelta;

/**
 * All items are created thanks to an item factory. Each item type defines what
 * is the factory to use to create items of its type.
 * 
 * To implement your own factory, please subclass ItemFactory class.
 * 
 * @author Thomas
 * 
 */
public interface IItemFactory {

	/**
	 * Creates and returns an item of <code>itemType</code> type defined by
	 * <code>itemOp</code> item creation operation. Created item is in state
	 * CREATED.
	 * 
	 * @param logicalWorkspace
	 *            logical workspace
	 * @param itemType
	 *            type of item to create
	 * @param itemOp
	 *            item creation operation description
	 * @return a new item of <code>itemType</code> type defined by
	 *         <code>itemOp</code> item creation operation.
	 */
	public Item newForCommitItem(LogicalWorkspace logicalWorkspace, ItemType itemType, ItemDelta itemOp);

}
