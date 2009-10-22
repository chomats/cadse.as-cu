package fr.imag.adele.cadse.core;

import java.util.List;

/**
 * group of == instance of + super type
 * 
 * is group ==> is group type
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
	 * @return
	 */
	public boolean isGroup();
	/**
	 * In the outgoing link, there is a link type of kind group
	 * @return
	 */
	public boolean isGroupType();
	
	/**
	 * true if isGroup() and getGroupType() == groupType or groupType isSuperGroupOf(getGroupType)
	 * @param groupType
	 * @return
	 */
	
	public boolean isGroupOf(GroupType groupType);
	
	public List<Item> getMembers();
	
	/**
	 * getType() if getType() is groupType or null 
	 * @return the group type or null if not a group
	 */
	public GroupType getGroupType();
	
	/**
	 * while (gt !=null) { gt = gt.getGroupType(); if (this == gt) return true; } return false
	 * @param gt
	 * @return
	 */
	public boolean isSuperGroupOf(GroupType gt);
}
