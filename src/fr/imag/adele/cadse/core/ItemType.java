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

import java.net.URL;
import java.util.List;
import java.util.Map;

import fr.imag.adele.cadse.core.internal.ItemTypeInternal;
import fr.imag.adele.cadse.core.key.SpaceKeyType;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransactionBroadcaster;
import fr.imag.adele.cadse.core.ui.IActionContributor;
import fr.imag.adele.cadse.core.ui.IActionPage;
import fr.imag.adele.cadse.core.ui.IPage;
import fr.imag.adele.cadse.core.ui.IPageFactory;
import fr.imag.adele.cadse.core.ui.Pages;

/**
 * A item type is type of an element in the workspace. Each item type has an id.
 * A item type has two list "outgoings" and "incoming" containing the link types
 * incoming to and going from item type (see LinkType). A item type can be
 * defined as a content, it means all item created by this type are the contents
 * (of others items).
 * 
 * @author nguyent
 * @version 6
 * @date 26/09/05
 */

public interface ItemType extends Item, IAttributable, IAttributableType, LogicalWorkspaceTransactionBroadcaster, ItemTypeInternal {

	/** The Constant PART. */
	public static final int	PART			= 0x0002;

	/** The Constant COMPOSITE. */
	public static final int	COMPOSITE		= 0x0004;

	/** The Constant REQUIRED. */
	public static final int	REQUIRED		= 0x0008;

	/** The Constant DERIVED. */
	public static final int	DERIVED			= 0x0010;

	/** The Constant ROOT_ELEMENT. */
	public static final int	ROOT_ELEMENT	= 0x0020;

	/** The Constant READ_ONLY. */
	public static final int	READ_ONLY		= 0x0040;

	/** The Constant HIDDEN. */
	public static final int	HIDDEN			= 0x0080;

	/** The Constant ABSTRACT. */
	public static final int	ABSTRACT		= 0x0100;

	/** The Constant UNIQUE_NAME. */
	public static final int	UNIQUE_NAME		= 0x0200;

	/** The Constant SHORT_NAME. */
	public static final int	SHORT_NAME		= 0x0400;

	/**
	 * Gets the sub types.
	 * 
	 * @return the sub types
	 */
	public ItemType[] getSubTypes();

	/**
	 * Gets the super type.
	 * 
	 * @return the super type
	 */
	public ItemType getSuperType();

	/**
	 * Returns true if this item type is super type (an ancestor) of
	 * <code>it</code>.
	 * 
	 * @param it
	 *            an item type
	 * 
	 * @return true if this item type is super type of <code>it</code>.
	 */
	public boolean isSuperTypeOf(ItemType it);

	/**
	 * Returns the item manager.
	 * 
	 * @return the item manager.
	 */
	public IItemManager getItemManager();

	/**
	 * Return the name of the cadse where this type is defined.
	 * 
	 * @return the name of the cadse where this type is defined.
	 */
	public String getCadseName();

	/**
	 * Create a link type. <br/> <br/>
	 * 
	 * Pr�conditions: <br/> - 1. <tt>name</tt> cannot be null.<br/> - 2.
	 * <tt>name</tt> cannot be empty. - 3. <tt>destination</tt> cannot be
	 * null.<br/> - 4. <tt>name</tt> muqt be unique.<br/> - 5.
	 * <tt>destination</tt> cannot be type workspace.<br/> - 6. <tt>min</tt>
	 * must greater or equal 0; <tt>max</tt> either equal -1 (means the
	 * instance's number of this link type is undefined), or either greater than
	 * <tt>min</tt>.
	 * 
	 * @param id
	 *            runtime id define in cadseg
	 * @param intID
	 *            the int id
	 * @param name
	 *            the name
	 * @param kind :
	 *            kind of link type, can be a Aggregation, or a Contaiment, or
	 *            Other.
	 * @param min :
	 *            the minimum instances of this link type that we want create.
	 * @param max :
	 *            the maximum instances of this link type that we want create.
	 * @param selection
	 *            the selection
	 * @param inverse
	 *            the inverse
	 * 
	 * @return the link type
	 * @throws CadseException
	 * 
	 * @OCL: pre: name <> null pre: id <> '' pre: destination <> null pre:
	 *       self.to->forAll(rt | rt.name <> id) -- id must be unique. pre: not
	 *       destination.oclIsTypeOf(WorkspaceType) -- destination cannot be a
	 *       Workspace Type. pre: ((max>=min)||(max==-1))&&(min>=0)) <br/>
	 * @exception IllegalArgumentException:
	 *                Invalid assignment, <tt>name</tt> can not be null.<br/>
	 *                IllegalArgumentException: Invalid assignment,
	 *                <tt>name</tt> can not be empty.<br/>
	 *                IllegalArgumentException: Invalid assignment, item type
	 *                <tt>$name</tt> can not be null.<br/>
	 *                IllegalArgumentException: Invalid assignment, this link
	 *                type <tt>destination</tt> already exist.<br/>
	 *                IllegalArgumentException: Invalid assignment, you can not
	 *                create a link type whose destination is an object of
	 *                WorkspaceType.<br/> IllegalArgumentException: Invalid
	 *                assignment, verify the values min and max.<br/> <br/>
	 */
	public abstract LinkType createLinkType(CompactUUID id, int intID, String name, int kind, int min, int max,
			String selection, LinkType inverse) throws CadseException;

	/**
	 * Creates the link type.
	 * 
	 * @param id
	 *            runtime id define in cadseg
	 * @param intID
	 *            the int id (not used) gave 0
	 * @param name
	 *            the name
	 * @param kind
	 *            the kind
	 * @param min
	 *            the min
	 * @param max
	 *            the max
	 * @param selection
	 *            the selection
	 * @param destination
	 *            the destination
	 * 
	 * @return the link type
	 * @throws CadseException 
	 */
	public abstract LinkType createLinkType(CompactUUID id, int intID, String name, int kind, int min, int max,
			String selection, ItemType destination) throws CadseException;

	/**
	 * Get an outgoing link type by id.
	 * 
	 * @param name
	 *            the name
	 * 
	 * @return a link type if found; null if not found.
	 */
	public abstract LinkType getOutgoingLinkType(String name);

	/**
	 * Gets the outgoing link type.
	 * 
	 * @param destination
	 *            the destination
	 * @param name
	 *            the name
	 * 
	 * @return the outgoing link type
	 */
	public abstract LinkType getOutgoingLinkType(ItemType destination, String name);

	/**
	 * Gets the outgoing link type.
	 * 
	 * @param destination
	 *            the destination
	 * @param kind
	 *            the kind
	 * 
	 * @return the outgoing link type
	 */
	public abstract LinkType getOutgoingLinkType(ItemType destination, int kind);

	/**
	 * Get an incoming link type by id.
	 * 
	 * @param name
	 *            the name
	 * 
	 * @return a link type if found; null if not found.
	 */
	public abstract LinkType getIncomingLinkType(String name);

//	/**
//	 * Get all hierarchical outgoing link types.
//	 * 
//	 * @return an unmodifiable list all hierarchical outgoing link types.
//	 */
//	@Deprecated
//	public abstract List<LinkType> getOugoingLinkTypes();

	/**
	 * Get all hierarchical outgoing link types.
	 * 
	 * @return an unmodifiable list all hierarchical outgoing link types.
	 */
	public abstract List<LinkType> getOutgoingLinkTypes();

	/**
	 * Get all owned outgoing link types, not hierarchical.
	 * 
	 * @return an unmodifiable list all owned outgoing link types.
	 */
	public List<LinkType> getOwnerOutgoingLinkTypes();

	/**
	 * Get all incoming link types.
	 * 
	 * @return an unmodifiable list all incoming link types.
	 */
	public abstract List<LinkType> getIncomingLinkTypes();

	/**
	 * Return true si ce type a un contenu (file, folder, project, ...).
	 * 
	 * @return true, if checks for content
	 */

	public abstract boolean hasContent();

	/**
	 * Change the default value.
	 * 
	 * @param val
	 *            the val
	 */
	public void setRootElement(boolean val);

	/**
	 * Checks if is root element.
	 * 
	 * @return true if is a root item type : les item de ce type sont montr�e au
	 *         premier niveau.
	 */
	public boolean isRootElement();

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.Item#isComposite()
	 */
	public boolean isComposite();

	/**
	 * Sets the checks for unique name attribute.
	 * 
	 * @param val
	 *            the new checks for unique name attribute
	 */
	public void setHasUniqueNameAttribute(boolean val);

	/**
	 * Checks for unique name attribute.
	 * 
	 * @return true, if successful
	 */
	public boolean hasQualifiedNameAttribute();

	/**
	 * Sets the checks for short name attribute.
	 * 
	 * @param val
	 *            the new checks for short name attribute
	 */
	public void setHasShortNameAttribute(boolean val);

	/**
	 * Checks for short name attribute.
	 * 
	 * @return true, if successful
	 */
	public boolean hasShortNameAttribute();

	/**
	 * Checks if is abstract.
	 * 
	 * @return true, if is abstract
	 */
	public boolean isAbstract();

	/**
	 * Get domain.
	 * 
	 * @return the domain
	 */
	public abstract CadseDomain getDomain();

	/**
	 * Checks if is part type.
	 * 
	 * @return true if this itemtype has an incoming linktype of type PART.
	 */
	public abstract boolean isPartType();

	/**
	 * if this item type is a partType, return the incoming linktype.
	 * 
	 * @param typeParent
	 *            the type parent
	 * 
	 * @return the linktype of type PART
	 */
	public LinkType getIncomingPart(ItemType typeParent);

	/**
	 * Gets the items.
	 * 
	 * @return the items
	 */
	public abstract List<Item> getItems();

	/**
	 * Checks for incoming parts.
	 * 
	 * @return true, if successful
	 */
	public boolean hasIncomingParts();

	/**
	 * Gets the incoming one.
	 * 
	 * @param type
	 *            the type
	 * 
	 * @return the incoming one if found or null if none or more one.
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	public LinkType getIncomingOne(ItemType type) throws CadseException;

	/**
	 * Gets the creation page.
	 * 
	 * @return the creation page
	 */
	public IPageFactory[] getCreationPage();

	/**
	 * Gets the modification page.
	 * 
	 * @return the modification page
	 */
	public IPageFactory[] getModificationPage();

	/**
	 * Sets the creation action.
	 * 
	 * @param clazz
	 *            the clazz
	 * @param defaultShortName
	 *            the default short name
	 */
	public void setCreationAction(Class<? extends IActionPage> clazz, String defaultShortName);

	/**
	 * Adds the creation pages.
	 * 
	 * @param creationPages
	 *            the creation pages
	 */
	public void addCreationPages(List<IPageFactory> creationPages);

	/**
	 * Adds the modification pages.
	 * 
	 * @param modificationPages
	 *            the modification pages
	 */
	public void addModificationPages(List<IPageFactory> modificationPages);

	/**
	 * Gets the good creation page.
	 * 
	 * @param parent
	 *            the parent
	 * @param type
	 *            the type
	 * @param lt
	 *            the lt
	 * 
	 * @return the good creation page
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	public Pages getGoodCreationPage(Item parent, ItemType type, LinkType lt) throws CadseException;

	/**
	 * Gets the good modification page.
	 * 
	 * @param selected
	 *            the selected
	 * 
	 * @return the good modification page
	 */
	public Pages getGoodModificationPage(Item selected);

	/**
	 * Gets the good modification page.
	 * 
	 * @param selected
	 *            the selected
	 * 
	 * @return the good modification page
	 */
	public Pages getGoodModificationPage(IItemNode selected);

	/**
	 * Gets the action contribution.
	 * 
	 * @return the action contribution
	 */
	public IActionContributor[] getActionContribution();

	/**
	 * Gets the all action contribution.
	 * 
	 * @return the all action contribution
	 */
	public IActionContributor[] getAllActionContribution();

	/**
	 * Adds the action contributeur.
	 * 
	 * @param contributor
	 *            the contributor
	 */
	public void addActionContributeur(IActionContributor contributor);

	/**
	 * Sets the icon.
	 * 
	 * @param url
	 *            the new icon
	 */
	public void setIcon(URL url);

	/**
	 * Gets the icon.
	 * 
	 * @return the icon
	 */
	public URL getImage();

	/**
	 * set the package attribute
	 * 
	 * @param packageName
	 *            the java qualified string or empty string for no package
	 */
	public void setPackageName(String packageName);

	/**
	 * get the package attribute
	 * 
	 * @return the package name attribute
	 */
	public String getPackageName();

	/**
	 * Sets the space key type.
	 * 
	 * @param spaceKeytype
	 *            the new space key type
	 */
	public void setSpaceKeyType(SpaceKeyType spaceKeytype);

	/**
	 * Gets the space key type.
	 * 
	 * @return the space key type
	 */
	public SpaceKeyType getSpaceKeyType();

	public <T> T getApdapter(Item instance, Class<T> clazz);

	/**
	 * Returns factory used to create item of this type.
	 * 
	 * @return factory used to create item of this type.
	 */
	public IItemFactory getItemFactory();

	/**
	 * Sets factory used to create item of this type.
	 * 
	 * @param factory
	 *            an item factory
	 */
	public void setItemFactory(IItemFactory factory);

	/**
	 * Returns . TODO
	 * 
	 * @return
	 */
	public IPage getFirstCreatedPage();

	public IPage getFirstModificationPage();

	public CadseRuntime getCadseRuntime();

	
/**
 * true if it a runtime ItemType (children of a RuntimeCadse, not a cadseg IT, not a dynamic IT
 * @return
 */
	public boolean isRuntime();


}