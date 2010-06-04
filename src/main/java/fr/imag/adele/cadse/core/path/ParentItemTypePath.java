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

package fr.imag.adele.cadse.core.path;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;

/**
 * The Class ParentItemTypePath.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class ParentItemTypePath extends ElementPath {

	/** The Constant BEGIN_PATH. */
	public static final String	BEGIN_PATH	= "<-parent:";

	/** The parent type. */
	public final ItemType		fParentType;

	/**
	 * Instantiates a new parent item type path.
	 * 
	 * @param parentType
	 *            the parent type
	 */
	public ParentItemTypePath(ItemType parentType) {
		fParentType = parentType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.ElementPath#getItemType()
	 */
	@Override
	public ItemType getItemType() {
		return fParentType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.ElementPath#getText()
	 */
	@Override
	public String getText() {
		return "." + BEGIN_PATH + fParentType.getId() + "*";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.ElementPath#evaluate(java.util.Set)
	 */
	@Override
	Set<Item> evaluate(Set<Item> sources) {
		if (sources.size() == 1) {
			Item parent = sources.iterator().next().getPartParent(fParentType);
			if (parent != null)
				return Collections.singleton(parent);
			return Collections.EMPTY_SET;
		}
		HashSet<Item> ret = new HashSet<Item>();
		for (Item source : sources) {
			Item parent = source.getPartParent(fParentType);
			if (parent != null)
				ret.add(parent);

		}
		return ret;
	}
}