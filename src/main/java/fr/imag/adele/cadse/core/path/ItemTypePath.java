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

import java.util.HashSet;
import java.util.Set;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;

/**
 * The Class ItemTypePath.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class ItemTypePath extends ElementPath {

	/** The source. */
	public final ItemType	fSource;

	/** The closure. */
	public final boolean	fClosure;

	/**
	 * Instantiates a new item type path.
	 * 
	 * @param source
	 *            the source
	 * @param closure
	 *            the closure
	 */
	public ItemTypePath(ItemType source, boolean closure) {
		fSource = source;
		fClosure = closure;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.ElementPath#getItemType()
	 */
	@Override
	public ItemType getItemType() {
		return fSource;
	}

	/**
	 * Checks if is closure.
	 * 
	 * @return true, if is closure
	 */
	public boolean isClosure() {
		return fClosure;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.ElementPath#getText()
	 */
	@Override
	public String getText() {
		return fSource.getId() + (fClosure ? "*" : "");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.ElementPath#evaluate(java.util.Set)
	 */
	@Override
	Set<Item> evaluate(Set<Item> sources) {
		HashSet<Item> ret = new HashSet<Item>();
		if (fClosure) {
			evaluate(fSource, ret);
		} else
			ret.addAll(fSource.getItems());
		return ret;
	}

	/**
	 * Evaluate.
	 * 
	 * @param subit
	 *            the subit
	 * @param ret
	 *            the ret
	 */
	private static void evaluate(ItemType subit, HashSet<Item> ret) {
		ret.addAll(subit.getItems());
		ItemType[] its = subit.getSubTypes();
		for (ItemType subit2 : its) {
			evaluate(subit2,ret);
		}
	}
}