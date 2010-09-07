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
package fr.imag.adele.cadse.core.path;

import java.util.HashSet;
import java.util.Set;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.TypeDefinition;

/**
 * The Class LinkTypePath.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class LinkTypePath extends ElementPath {

	/** The destination. */
	public final TypeDefinition	fDestination;

	/** The link type. */
	public final LinkType		fLinkType;

	/** The closure. */
	public final boolean		fClosure;

	/**
	 * Instantiates a new link type path.
	 * 
	 * @param lt
	 *            the lt
	 * @param closure
	 *            the closure
	 */
	public LinkTypePath(LinkType lt, boolean closure) {
		fDestination = lt.getDestination();
		fLinkType = lt;
		fClosure = closure;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.ElementPath#getItemType()
	 */
	@Override
	public TypeDefinition getItemType() {
		return fDestination;
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
		return "." + fLinkType.getName() + (fClosure ? "*" : "");
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
			ret.addAll(sources);
			Set<Item> secondpass = sources;
			while (secondpass.size() > 0) {
				Set<Item> newsecondpass = new HashSet<Item>();
				for (Item source : secondpass) {
					for (Link l : source.getOutgoingLinks()) {
						if (l.getLinkType() == fLinkType && l.isLinkResolved()) {
							Item dest = l.getResolvedDestination();
							if (!ret.contains(dest)) {
								ret.add(dest);
								newsecondpass.add(dest);
							}
						}
					}
				}
				secondpass = newsecondpass;
			}
		} else {
			for (Item source : sources) {
				for (Link l : source.getOutgoingLinks()) {
					if (l.getLinkType() == fLinkType && l.isLinkResolved()) {
						Item dest = l.getResolvedDestination();
						ret.add(dest);
					}
				}
			}
		}

		return ret;
	}
}