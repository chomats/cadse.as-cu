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
package fr.imag.adele.cadse.core.oper;

import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.oper.annotation.OperParameter;
import fr.imag.adele.cadse.core.oper.annotation.OperTest;
import fr.imag.adele.cadse.core.oper.annotation.ParameterKind;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;

@OperTest(testMustBeStopped = true)
public class WSODeleteLink extends WSOperation {
	@OperParameter(constructorPosition = 0, type = ParameterKind.link_ref)
	private Link	link;

	public WSODeleteLink(Link l) {
		this.link = l;
	}

	@Override
	protected void excecuteImpl() throws Throwable {
		LogicalWorkspaceTransaction t = link.getSource().getLogicalWorkspace().createTransaction();
		t.getLink(link).delete();
		t.commit();
	}

	public Link getLink() {
		return link;
	}

	public Class<?> getType() {
		return WSODeleteLink.class;
	}

	@Override
	public String getDiplayComment() {
		return "delete link from " + link.getSource().getDisplayName() + " to "
				+ link.getDestination().getDisplayName() + "( " + link.getLinkType().toString() + " )";
	}
}
