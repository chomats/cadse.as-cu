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

package fr.imag.adele.cadse.core.ui;

import java.util.UUID;
import fr.imag.adele.cadse.core.IItemNode;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.TypeDefinition;

/**
 * A factory for creating EmptyPage objects.
 */
public class EmptyPageFactory extends PageFactory {

	/**
	 * Instantiates a new empty page factory.
	 * 
	 * @param id
	 *            the id
	 */
	public EmptyPageFactory(UUID id, String name) {
		super(id, name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.PageFactory#isEmptyPage()
	 */
	@Override
	public final boolean isEmptyPage() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.PageFactory#createPage(int,
	 * fede.workspace.domain.Link, fede.workspace.domain.Item,
	 * fede.workspace.domain.IItemNode, fede.workspace.domain.ItemType,
	 * fede.workspace.domain.LinkType)
	 */
	@Override
	public IPage createPage(int cas, Link l, Item item, IItemNode node, TypeDefinition type, LinkType lt) {
		return null;
	}
}
