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

package fr.imag.adele.cadse.core.key;

import fr.imag.adele.cadse.core.CadseException;

/**
 * The Class LinksSpaceKey.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class LinksSpaceKey extends SpaceKey {

	/** The lt key. */
	protected ISpaceKey	ltKey;

	/**
	 * Instantiates a new links space key.
	 * 
	 * @param type
	 *            the type
	 * @param name
	 *            the name
	 * @param parentKey
	 *            the parent key
	 * @param ltKey
	 *            the lt key
	 * @throws CadseException
	 */
	LinksSpaceKey(LinksSpaceKeyType type, String name, ISpaceKey parentKey, ISpaceKey ltKey) {
		super(null, type, name, parentKey);
		this.ltKey = ltKey;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.key.SpaceKey#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof LinksSpaceKey && super.equals((LinksSpaceKey) obj)
				&& ((LinksSpaceKey) obj).ltKey.equals(ltKey);
	}

	@Override
	protected int computeHashCode() {
		return super.computeHashCode() ^ ltKey.hashCode();
	}

	public ISpaceKey getLtKey() {
		return ltKey;
	}

}
