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

import java.net.URL;
import java.util.List;
import java.util.UUID;

import fr.imag.adele.cadse.core.attribute.BooleanAttributeType;
import fr.imag.adele.cadse.core.attribute.GroupOfAttributes;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.internal.ItemTypeInternal;
import fr.imag.adele.cadse.core.key.FacetteItemTypeKey;
import fr.imag.adele.cadse.core.key.KeyDefinition;
import fr.imag.adele.cadse.core.transaction.FacetteItemTypeTransaction;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransactionBroadcaster;
import fr.imag.adele.cadse.core.ui.FacetteItemTypeAction;
import fr.imag.adele.cadse.core.ui.IActionContributor;
import fr.imag.adele.cadse.core.ui.IActionPage;
import fr.imag.adele.cadse.core.ui.IPage;
import fr.imag.adele.cadse.core.ui.UIField;
import fr.imag.adele.cadse.core.ui.UIValidator;
import fr.imag.adele.cadse.core.ui.view.NewContext;

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
public interface ItemType extends Item, ItemTypeInternal, GroupType, TypeDefinition, FacetteItemTypeAction,
		FacetteItemTypeCanCreate, FacetteItemTypeFactory, FacetteItemTypeKey,
		FacetteItemTypeTransaction, 
		IAttributable, IAttributableType, LogicalWorkspaceTransactionBroadcaster {

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
	 * @return the sub types (non null array, if no sub type, return an empty
	 *         array)
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

	public ExtendedType[] getExtendedType();
	
	public void addExtendedType(ExtendedType et);
	
	public void removeExtendedType(ExtendedType et);

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
	@Override
	public boolean isComposite();

	/**
	 * Sets the checks for unique name attribute.
	 * 
	 * @param val
	 *            the new checks for unique name attribute
	 */
	public void setHasQualifiedNameAttribute(boolean val);

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
	public void setHasNameAttribute(boolean val);

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
	
	public void setIsAbstract(boolean b);

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
	public IPage[] getCreationPage();

	/**
	 * Gets the modification page.
	 * 
	 * @return the modification page
	 */
	public IPage[] getModificationPage();

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
	public void addCreationPages(IPage... creationPages);

	/**
	 * Adds the modification pages.
	 * 
	 * @param modificationPages
	 *            the modification pages
	 */
	public void addModificationPages(IPage ... modificationPages);

	public String getDefaultInstanceName() ;

	/**
	 * Sets the space key type.
	 * 
	 * @param spaceKeytype
	 *            the new space key type
	 */
	public void setKeyDefinition(KeyDefinition spaceKeytype);

	/**
	 * Gets the space key type.
	 * 
	 * @return the space key type
	 */
	public KeyDefinition getKeyDefinition();

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
	 * @deprecated Use {@link #getCadse()} instead
	 */
	public CadseRuntime getCadseRuntime();

	public CadseRuntime getCadse();

	/**
	 * true if it a runtime ItemType (children of a RuntimeCadse, not a cadseg
	 * IT, not a dynamic IT
	 * 
	 * @return
	 */
	public boolean isRuntime();

	/*
	 * return the implemented class of the manager
	 */
	public String getItemManagerClass();

	public String getCSTName();

	public boolean isMemberType();

	@Override
	public boolean isGroupHead();

	public boolean canCreateItem(NewContext newContext);

	public boolean canCreateItem(NewContext newContext, LinkType lt, Item src);
	
	public void addValidators(UIValidator v);
	
	public void addField(UIField v);
	
	public void addGroupOfAttributes( GroupOfAttributes g);
	
	public GroupOfAttributes[] getGroupOfAttributes();

	public CPackage getPackage();

}