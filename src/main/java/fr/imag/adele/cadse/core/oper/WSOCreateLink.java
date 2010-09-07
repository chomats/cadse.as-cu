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
package fr.imag.adele.cadse.core.oper;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.oper.annotation.OperParameter;
import fr.imag.adele.cadse.core.oper.annotation.OperTest;
import fr.imag.adele.cadse.core.oper.annotation.ParameterKind;

@Deprecated
@OperTest(testMustBeStopped = true)
public class WSOCreateLink extends WSOperation {
	@OperParameter(constructorPosition = 0, type = ParameterKind.item_ref)
	private Item		source;
	@OperParameter(constructorPosition = 1, type = ParameterKind.link_type_ref)
	private LinkType	linktype;
	@OperParameter(constructorPosition = 2, type = ParameterKind.item_ref)
	private Item		dest;

	private Link		resultat;

	public WSOCreateLink(Item source, LinkType linktype, Item dest) {
		this.source = source;
		this.linktype = linktype;
		this.dest = dest;
	}

	@Override
	protected void excecuteImpl() throws Throwable {
		resultat = source.createLink(linktype, dest);
	}

	public Item getDest() {
		return dest;
	}

	public LinkType getLinktype() {
		return linktype;
	}

	public Item getSource() {
		return source;
	}

	public Class<?> getType() {
		return WSOCreateLink.class;
	}

	@Override
	public String getDiplayComment() {
		return "create link from " + source.getDisplayName() + " to " + dest.getDisplayName() + "( "
				+ linktype.toString() + " )";
	}

	public Link getResultat() {
		return resultat;
	}
}
