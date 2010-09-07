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
package fr.imag.adele.cadse.core;

import java.util.List;

/**
 * group of == instance of + super type
 * 
 * is group ==> is group type
 * 
 * @author chomats
 * 
 */
public interface GroupType {

	/**
	 * Get all hierarchical outgoing link types of kind group.
	 * 
	 * @return an unmodifiable list all hierarchical outgoing link types.
	 */
	public abstract List<LinkType> getGroupOutgoingLinkTypes();

	/**
	 * getGroupType() != null
	 * 
	 * @return
	 */
	public boolean isGroupHead();

	/**
	 * In the outgoing link, there is a link type of kind group
	 * 
	 * @return
	 */
	public boolean isGroupType();

	/**
	 * true if isGroup() and getGroupType() == groupType or groupType
	 * isSuperGroupOf(getGroupType)
	 * 
	 * @param groupType
	 * @return
	 */

	public boolean isGroupOf(GroupType groupType);

	/**
	 * Return the members of this group...
	 * @return
	 */
	public List<Item> getMembers();

	/**
	 * getType() if getType() is groupType or null
	 * 
	 * @return the group type or null if not a group
	 */
	public ItemType getGroupType();

	/**
	 * while (gt !=null) { gt = gt.getGroupType(); if (this == gt) return true;
	 * } return false
	 * 
	 * @param gt
	 * @return
	 */
	public boolean isSuperGroupTypeOf(GroupType gt);

	public ItemType[] getAllSubGroupType();

	public String getName();
}
