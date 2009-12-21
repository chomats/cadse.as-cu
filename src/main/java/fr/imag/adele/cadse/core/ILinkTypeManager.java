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

package fr.imag.adele.cadse.core;

import java.util.Collection;

/**
 * The interface for the link type manager. It's used to allow or
 * forbid operations such as link creation or delete operation.
 */
public interface ILinkTypeManager {

	/**
	 * Gets a subset of allowed destination instances for a new link with
	 * <code>source</code> given into parameter. We want to create a link from
	 * <code>source</code> given into parameter. The Type of this link is the
	 * one of this manager. This method computes the allowed instances which can
	 * be chosen as destination for this new link.
	 * 
	 * @param source
	 *            the source instance
	 * 
	 * @return the list of allowed destination instances, or <code>null</code>
	 *         if all possible destinations are allowed
	 */
	public Collection<Item> getSelectingDestination(Item source);

	/**
	 * Compare two links.
	 * 
	 * @param l1
	 *            a link
	 * @param l2
	 *            another link
	 * 
	 * @return a negative integer, zero, or a positive integer as this object is
	 *         less than, equal to, or greater than the specified object.
	 */
	public int compare(Link l1, Link l2);

	/**
	 * Internal method used to set the LinkType of this manager. Souldn't be
	 * called by user.
	 * 
	 * @param lt
	 *            the new link type
	 */
	public void setLinkType(LinkType lt);

	/**
	 * Gets the link type of this manager.
	 * 
	 * @return the link type
	 */
	public LinkType getLinkType();

	/**
	 * Checks if outgoing links are sorted. The {@link #compare(Link, Link)}
	 * method is used for the test.
	 * 
	 * @return true, if is outgoing link are sorted
	 */
	public boolean isOutgoingLinkSorted();

	/**
	 * Checks if a link of type <code>lt</code> can be created between
	 * <code>source</code> and <code>destination</code>
	 * 
	 * @param source
	 *            the potential source for the link
	 * @param dest
	 *            the potential destination for the link
	 * @param lt
	 *            the type of the link
	 * 
	 * @return null if creation is allowed, error message otherwise.
	 */
	public String canCreateLink(Item source, Item dest, LinkType lt);

	/**
	 * Tests if the link given into parameter can be deleted.
	 * 
	 * @param link
	 *            the link
	 * 
	 * @return null if link can be deleted, error message otherwise.
	 */
	public String canDeleteLink(Link link);

}
