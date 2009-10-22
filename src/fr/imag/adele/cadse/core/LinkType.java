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

import java.util.Collection;

import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransactionBroadcaster;

/**
 * A LinkType is a relation between two item types.
 * 
 * @author Cadse Team
 */
public interface LinkType extends IAttributeType<Link>, Link, LogicalWorkspaceTransactionBroadcaster {

	/**
	 * Bit mask to determine aggregation flag.
	 */
	public static final int	AGGREGATION		= 0x0001;

	/**
	 * Bit mask to determine part flag.
	 */
	public static final int	PART			= 0x0002;

	/**
	 * Bit mask to determine composition flag.
	 */
	public static final int	COMPOSITION		= 0x0004;

	/**
	 * Bit mask to determine require flag.
	 */
	public static final int	REQUIRE			= 0x0008;

	/**
	 * Bit mask to determine derived flag.
	 */
	public static final int	DERIVED			= 0x0010;

	/**
	 * Bit mask to determine inverse part flag.
	 */
	public static final int	INVERSE_PART	= 0x0020;

	/**
	 * Bit mask to determine read only flag.
	 */
	public static final int	READ_ONLY		= 0x0040;

	/**
	 * Bit mask to determine hidden flag.
	 */
	public static final int	HIDDEN			= 0x0080;

	/**
	 * Bit mask to determine annotation flag.
	 */
	public static final int	ANNOTATION		= 0x0100;

	/**
	 * Bit mask to determine ordered flag.
	 */
	public static final int	ORDERED			= 0x0200;

	/**
	 * Bit mask to determine non circular flag.
	 */
	public static final int	NON_CIRCULAR	= 0x0400;

	/**
	 * Bit mask to determine content flag.
	 */
	public static final int	CONTENT			= 0x0800;

	
	/**
	 * Bit mask to determine content flag.
	 */
	public static final int	GROUP			= 0x1000;

	/**
	 * Bit mask to determine modified flag.
	 */
	public static final int	MODIFIED		= 0x8000;

	/**
	 * Cardinality value for unbounded.
	 */
	public static final int	UNBOUNDED		= -1;

	/**
	 * Returns short name.
	 * 
	 * @return short name.
	 */
	public String getName();

	/**
	 * Returns maximum number of links of this type from a same item.
	 * 
	 * @return maximum number of links of this type from a same item.
	 */
	public int getMax();

	/**
	 * Returns minimum number of links of this type from a same item.
	 * 
	 * @return minimum number of links of this type from a same item.
	 */
	public int getMin();

	/**
	 * Returns the destination type (an Item type). It is never null.
	 * 
	 * @return the destination type.
	 */
	public ItemType getDestination();

	/**
	 * Returns the source type (an Item type). It is never null.
	 * 
	 * @return the source type.
	 */
	public ItemType getSource();

	/**
	 * Returns bit set representing flags of this link type (including all
	 * annotations, for example, aggregation one and so on).
	 * 
	 * @return bit set representing flags of this link type.
	 */
	public int getKind();

	/**
	 * Returns true if it is the reverse link type from Destination type to
	 * source type of a part link type.
	 * 
	 * @return true if it is the reverse link type from Destination type to
	 *         source type of a part link type.
	 */
	public boolean isInversePart();

	/**
	 * Returns true if links of this type are ordered. Reorder not ordered links
	 * of this type is not considered as a modification operation.
	 * 
	 * @return true if links of this type are ordered.
	 */
	public boolean isOrdered();

	/**
	 * Returns true if link creation operation forbids create a cycle by
	 * following links of this type. For example, composition links are not
	 * circular.
	 * 
	 * @return true if link creation operation forbids create a cycle by
	 *         following links of this type.
	 */
	public boolean isNonCircular();

	/**
	 * Returns link type representing the reverse link type from Destination
	 * type to source type. Deleting a link also delete inverse link if it
	 * exists.
	 * 
	 * @return link type representing the reverse link type from Destination
	 *         type to source type.
	 */
	public LinkType getInverse();

	/**
	 * Returns all destination items of links from specified source item. This
	 * method is equivalent to source.getOutgoingItem(this, true).
	 * 
	 * TODO not sure returns only resolved destinations
	 * 
	 * @param source
	 *            source item
	 * 
	 * @return all destination items of links from specified source item.
	 */
	public Collection<Item> getSelectingDestination(Item source);

	/**
	 * Returns the link type manager. It is never null.
	 * 
	 * @return the link type manager.
	 */
	public ILinkTypeManager getManager();

	/**
	 * Sets the link type manager.
	 * 
	 * @param manager
	 *            the link type manager
	 */
	public void setManager(ILinkTypeManager manager);

	/**
	 * Returns definition of this link type attribute named
	 * <code>attrName</code>.
	 * 
	 * @param attrName
	 *            attribute name
	 * @return definition of this link type attribute named
	 *         <code>attrName</code>.
	 */
	public IAttributeType<?> getLinkTypeAttributeType(String attrName);

	/**
	 * Defines specified link type as reverse link type of it.
	 * 
	 * @param lt
	 *            a link type
	 */
	public void setInverseLinkType(LinkType lt);

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

	public void setIsGroup(boolean b);
	
	public boolean isGroup();

}