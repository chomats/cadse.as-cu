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
package fr.imag.adele.cadse.core.util;





/**
 * The Class ItemOrder.
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public final class ElementsOrder <T> {
	
	/**
	 * Creates an instance with the given values.
	 * <p>
	 * This class is not intended to be instantiated by clients.
	 * </p>
	 * 
	 * @param projects
	 *            initial value of <code>projects</code> field
	 * @param hasCycles
	 *            initial value of <code>hasCycles</code> field
	 * @param knots
	 *            initial value of <code>knots</code> field
	 */
	public ElementsOrder(T[] elements, boolean hasCycles, T[][] knots) {
		this.elements = elements;
		this.hasCycles = hasCycles;
		this.knots = knots;
	}

	/**
	 * A list of elements ordered so as to honor the element reference
	 * relationships between these element wherever possible. The elements are
	 * a subset of the ones passed as the <code>elements</code> parameter to
	 * <code>IWorkspace.computeProjectOrder</code>, where inaccessible
	 * (closed or non-existent) projects have been omitted.
	 */
	final public T[] elements;
	
	/**
	 * Indicates whether any of the accessible projects in <code>projects</code>
	 * are involved in non-trivial cycles. <code>true</code> if the project
	 * reference graph contains at least one cycle involving two or more of the
	 * projects in <code>projects</code>, and <code>false</code> if none of
	 * the projects in <code>projects</code> are involved in cycles.
	 */
	final public boolean hasCycles;
	
	/**
	 * A list of knots in the project reference graph. This list is empty if the
	 * project reference graph does not contain cycles. If the project reference
	 * graph contains cycles, each element is a knot of two or more accessible
	 * projects from <code>projects</code> that are involved in a cycle of
	 * mutually dependent references.
	 */
	final public T[][] knots;
}