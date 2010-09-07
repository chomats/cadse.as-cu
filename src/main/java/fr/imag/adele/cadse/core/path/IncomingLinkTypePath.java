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
 * The Class IncomingLinkTypePath.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class IncomingLinkTypePath extends ElementPath {

	/** The Constant BEGIN_PATH. */
	public static final String	BEGIN_PATH	= "<-";

	/** The source. */
	public final TypeDefinition	fSource;

	/** The link type. */
	public final LinkType		fLinkType;

	/**
	 * Instantiates a new incoming link type path.
	 * 
	 * @param lt
	 *            the lt
	 */
	public IncomingLinkTypePath(LinkType lt) {
		fSource = lt.getSource();
		fLinkType = lt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.ElementPath#getItemType()
	 */
	@Override
	public TypeDefinition getItemType() {
		return fSource;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.ElementPath#getText()
	 */
	@Override
	public String getText() {
		return "." + BEGIN_PATH + fLinkType.getName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.path.ElementPath#evaluate(java.util.Set)
	 */
	@Override
	Set<Item> evaluate(Set<Item> sources) {
		HashSet<Item> ret = getIncomingItems(sources, fLinkType);
		return ret;
	}

	/**
	 * Gets the incoming items.
	 * 
	 * @param sources
	 *            the sources
	 * @param fLinkType
	 *            the f link type
	 * 
	 * @return the incoming items
	 */
	public static HashSet<Item> getIncomingItems(Set<Item> sources, LinkType fLinkType) {
		// source est de type fLinkType.getDestination()
		HashSet<Item> ret = new HashSet<Item>();
		for (Item source : sources) {
			for (Link l : source.getIncomingLinks()) {
				if (l.getLinkType() == fLinkType) {
					ret.add(l.getSource());
				}
			}
		}
		return ret;
	}
}