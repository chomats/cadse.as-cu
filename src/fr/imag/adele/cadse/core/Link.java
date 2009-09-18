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
/*
 * Adele/LIG/ Grenoble University, France
 * 2006-2008
 */
package fr.imag.adele.cadse.core;

import fr.imag.adele.cadse.core.internal.InternalLink;

/**
 * A link is a relation between two items. Each link has a type called a
 * LinkType.
 * 
 * @author nguyent
 */
public interface Link extends InternalLink {

	/**
	 * Returns the destination type (an Item type). It is inherited from its
	 * link type. It is never null.
	 * 
	 * @return the destination type.
	 */
	public ItemType getDestinationType();

	/**
	 * Returns the link type. Link Type is never null.
	 * 
	 * @return link type.
	 */
	public LinkType getLinkType();

	/**
	 * Returns source element of this link (an Item). Source is never null.
	 * 
	 * @return source of this link.
	 */
	public Item getSource();

	/**
	 * Returns source item id. It is never null.
	 * 
	 * @return source item id.
	 */
	public CompactUUID getSourceId();

	/**
	 * Returns the resolved destination (an Item). Destination may not exist in
	 * the logical workspace. In this case, link is not resolved and returns
	 * null.
	 * 
	 * @return destination of this link.
	 */
	public Item getResolvedDestination();

	/**
	 * Returns the resolved destination (an Item). Destination may not exist in
	 * the logical workspace. In this case, link is not resolved and returns a
	 * virtual item which represents the unresolved destination. To distinguish
	 * virtual items, use isResolved() method.
	 * 
	 * @return destination of this link.
	 */
	public Item getDestination();

	/**
	 * Returns the destination (an Item). Destination may not exist in the
	 * logical workspace. In this case, link is not resolved; if destination
	 * must be resolved, returns null else returns a virtual item which
	 * represents the unresolved destination. To distinguish virtual items, use
	 * isResolved() method.
	 * 
	 * @param mustBeResolved
	 *            if true, returns null if destination does not exist
	 * @return destination of this link.
	 */
	public Item getDestination(boolean mustBeResolved);

	/**
	 * Returns destination unique name.
	 * 
	 * @return destination unique name.
	 */
	public String getDestinationQualifiedName();

	/**
	 * Returns destination short name.
	 * 
	 * @return destination short name.
	 * @deprecated Use {@link #getDestinationName()} instead
	 */
	public String getDestinationShortName();

	/**
	 * Returns destination short name.
	 * 
	 * @return destination short name.
	 */
	public String getDestinationName();

	/**
	 * Returns destination item id. It is never null.
	 * 
	 * @return destination item id.
	 */
	public CompactUUID getDestinationId();

	/**
	 * Set read only flag. A read only link cannot be modified (delete and set
	 * attribute actions are disallowed).
	 * 
	 * @param readOnly
	 *            read only flag
	 */
	public void setReadOnly(boolean readOnly);

	/**
	 * Returns true if this link is read only. A read only link cannot be
	 * modified (delete and set attribute actions are disallowed).
	 * 
	 * @return true if this link is read only.
	 */
	public boolean isReadOnly();

	/**
	 * Set this link as hidden. A hidden link is not shown in CADSE views if
	 * related view filter (Hidden item) is active.
	 * 
	 * @param hidden
	 *            hidden flag
	 */
	public void setHidden(boolean hidden);

	/**
	 * Returns true if this link is hidden. A hidden link is not shown in CADSE
	 * views if related view filter (Hidden item) is active.
	 * 
	 * @return true if this link is hidden.
	 */
	public boolean isHidden();

	/**
	 * Delete this link. Note that according to its link type annotations,
	 * cascading of source and destination delete operation are performed.
	 */
	@Deprecated
	public void delete() throws CadseException;

	/**
	 * Returns true if it is used for annotations. This flag is inherited from
	 * its link type. If a destination of an annotation link is deleted, then
	 * link source is also deleted.
	 * 
	 * @return true if it is used for annotations.
	 */
	public boolean isAnnotation();

	/**
	 * Returns true if it is an aggregation link. This flag is inherited from
	 * its link type. Aggregation annotations are used to structure CADSE views.
	 * 
	 * @return true if it is an aggregation link.
	 */
	public boolean isAggregation();

	/**
	 * Returns true if it is a part link. This flag is inherited from its link
	 * type. If a source of a part link is deleted, then link destination is
	 * also deleted.
	 * 
	 * @return true if it is a part link.
	 */
	public boolean isPart();

	/**
	 * Returns true if it is a composition link. This flag is inherited from its
	 * link type. Composition annotations are used to transfer data from
	 * destination to source for builders.
	 * 
	 * @return true if it is a composition link.
	 */
	public boolean isComposition();

	/**
	 * Returns true if it is a require link. This flag is inherited from its
	 * link type. If a source of a require link is imported, then link
	 * destination is also imported.
	 * 
	 * @return true if it is a require link.
	 */
	public boolean isRequire();

	/**
	 * Returns true if this link is derived. A derived link is created by CADSE
	 * runtime. They cannot be created and modified by users.
	 * 
	 * @return true if this link is derived.
	 */
	public boolean isDerived();

	/**
	 * Returns true if destination is resolved (destination exists in the
	 * logical wrokspace).
	 * 
	 * @return true if destination is resolved.
	 */
	public boolean isLinkResolved();

	/**
	 * Returns true if this link is static. A static link is a read only link
	 * where read only flag cannot be set to false.
	 * 
	 * @return true if this link is static.
	 */
	public boolean isStatic();

	/**
	 * Restore this link from the cache.
	 * 
	 * @throws CadseException
	 */
	@Deprecated
	public void restore() throws CadseException;

	/**
	 * Returns order index of this link from its source. Considered links are
	 * only ones with same link type.
	 * 
	 * @return order index of this link from its source.
	 */
	public int getIndex();

	/**
	 * Returns destination version.
	 * 
	 * @return destination version.
	 */
	public int getVersion();

	/**
	 * Sets destination version. Note that destination item version is not
	 * modified but only the reference owns by the link.
	 * 
	 * @param version
	 *            destination version.
	 */
	public void setVersion(int version);

	/**
	 * TODO
	 * 
	 * @return
	 */
	public boolean resolve();

	/**
	 * Return all destination versions compatible with the source item.
	 * 
	 * @return all destination versions compatible with the source item.
	 */
	public int[] getCompatibleVersions();

	/**
	 * After call, any destination version is considered as not compatible with
	 * source item.
	 */
	public void clearCompatibleVersions();

	/**
	 * Add many destination versions as compatible with source item.
	 * 
	 * @param versions
	 *            destination versions considered compatible with source item
	 */
	public void addCompatibleVersions(int... versions);

}