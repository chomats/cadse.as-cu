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

import java.util.List;
import java.util.Set;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.TypeDefinition;

/**
 * The Class ElementPath.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public abstract class ElementPath {

	/**
	 * Gets the item type.
	 * 
	 * @return the item type
	 */
	public abstract TypeDefinition getItemType();

	/**
	 * Available.
	 * 
	 * @return the element path[]
	 */
	public ElementPath[] available() {
		List<LinkType> lts = getItemType().getOutgoingLinkTypes();
		int closure = 0;
		for (LinkType lt : lts) {
			if (lt.getDestination().equals(getItemType()))
				closure++;
		}
		ElementPath[] ret = new ElementPath[lts.size() + closure];
		for (int i = 0, j = 0; i < lts.size(); i++) {
			LinkType lt = lts.get(i);
			ret[j++] = new LinkTypePath(lt, false);
			if (lt.getDestination().equals(getItemType()))
				ret[j++] = new LinkTypePath(lt, true);
		}
		return ret;
	}

	/**
	 * Gets the text.
	 * 
	 * @return the text
	 */
	public abstract String getText();

	/**
	 * Evaluate.
	 * 
	 * @param sources
	 *            the sources
	 * 
	 * @return the set< item>
	 */
	abstract Set<Item> evaluate(Set<Item> sources);

}