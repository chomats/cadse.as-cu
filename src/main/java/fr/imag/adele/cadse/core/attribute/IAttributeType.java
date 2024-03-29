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
package fr.imag.adele.cadse.core.attribute;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.INamed;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.TypeDefinition;
import fr.imag.adele.cadse.core.internal.InternalIAttributeType;
import fr.imag.adele.cadse.core.ui.FacetteAttributeUI;
import fr.imag.adele.cadse.core.ui.UIField;

/**
 * Represents an attribute definition.
 */
public interface IAttributeType<T> extends Item, INamed, InternalIAttributeType, FacetteAttributeUI {

	/**
	 * undefined value
	 */
	public static final Object VALUE_NOT_DEFINED = null;

	/**
	 * undefined value
	 */
	public static final Object VALUE_NOT_INIT = new Object();

	/**
	 * TODO soit ItemType soit IAttributeType pour les types composer get
	 * 
	 * @return the parent
	 */
	public Item getParent();

	/**
	 * Returns data type of this attribute.
	 * 
	 * @return data type of this attribute.
	 */
	public Class<T> getAttributeType();

	/**
	 * If returns true, method createNewValueFor(Item) is called to set value of this attribute of a just created item.
	 * 
	 * @return true, if createNewValueFor(Item) need to be called when an item which has an attribute of this definition
	 *         is created.
	 */
	public boolean mustBeCreateNewValueAtCreationTimeOfItem();

	/**
	 * Returns computed value for this attribute of specified item. This method is called only if
	 * mustBeCreateNewValueAtCreationTimeOfItem() method returns true.
	 * 
	 * @param createdItem
	 *            a just created item
	 * @return computed value for this attribute of specified item.
	 */
	public Object createNewValueFor(Item createdItem) throws CadseException;

	/**
	 * Returns default value.
	 * 
	 * @return default value.
	 */
	public T getDefaultValue();

	/**
	 * Returns maximum number of values. It is useful for attribute collection value.
	 * 
	 * @return maximum number of values.
	 */
	public int getMax();

	/**
	 * Returns minimum number of values. It is useful for attribute collection value.
	 * 
	 * @return minimum number of values.
	 */
	public int getMin();

	/**
	 * Returns true if attribute value set and get operations are managed by user code. TODO add methods necessary to
	 * implement
	 * 
	 * @return true if attribute value set and get operations are managed by user code.
	 */
	public boolean isNatif();

	/**
	 * Set flag which determines if attribute value set and get operations are managed by user code.
	 * 
	 * @param isNatif
	 *            isNatif flag
	 * @return true if set flag value is different from current one.
	 */
	public boolean setIsNatif(boolean isNatif);

	/**
	 * Returns true if attribute value is not persisted. It should be used for derived or computed values.
	 * 
	 * @return true if attribute value is not persisted.
	 */
	public boolean isTransient();

	/**
	 * Returns true if attribute value can be undefined. An undefined attribute value is equal to <code>NULL</code>..
	 * 
	 * @return true if attribute value is not persisted.
	 */
	public boolean canBeUndefined();

	/**
	 * Returns true if attribute value cannot be undefined. An undefined attribute value is equal to <code>NULL</code>.
	 * The value attribute cannot be to <code>NULL</code>.
	 * 
	 * @return true if attribute value cannot not be undefined.
	 */
	public boolean cannotBeUndefined();

	/**
	 * Returns true if the attribute should be displayed in the default modification page. If the attribute is displayed
	 * in a user defined modification page, the attribute in not displayed in the default modification page.
	 * 
	 * @return
	 */
	public boolean isShowInDefaultMP();

	/**
	 * Sets if the attribute should be displayed in the default modification page. If the attribute is displayed in a
	 * user defined modification page, the attribute in not displayed in the default modification page.
	 */
	public void setShowInDefaultMP(boolean flag);

	/**
	 * Returns true if the attribute should be displayed in the default creation page. If the attribute is displayed in
	 * a user defined creation page, the attribute in not displayed in the default creation page.
	 * 
	 * @return
	 */
	public boolean isShowInDefaultCP();

	/**
	 * Sets if the attribute should be displayed in the default creation page. If the attribute is displayed in a user
	 * defined creation page, the attribute in not displayed in the default creation page.
	 */
	public void setShowInDefaultCP(boolean flag);
	
	
	/**
	 * Returns true if the attribute should be editable in modification pages.
	 * 
	 * @return
	 */
	public boolean isNotEditableInMP();

	/**
	 * Returns true if the attribute should be editable in creation pages.
	 * 
	 * @return
	 */
	public boolean isNotEditableInCP();

	/**
	 * TODO
	 * 
	 * @return cannot be modified is value not <code>NULL</code>.
	 */
	public boolean isFinal();

	/**
	 * TODO
	 */
	public void setFinal(boolean flag);

	/**
	 * Converts specified value into this attribute data type.
	 * 
	 * @param value
	 *            a value
	 * @return converted value of this attribute data type.
	 */
	public T convertTo(Object value) throws IllegalArgumentException;

	/**
	 * Returns the errors related if we set specified attribute value to specified item.
	 * 
	 * @param item
	 *            item on which the attribute value will be set
	 * @param value
	 *            attribute value to try to set
	 * @return the errors related if we set specified attribute value to specified item.
	 */
	public CheckStatus check(Item item, Object value);

	/**
	 * Returns true if modification of value of an attribute of this type from oldValue to newValue is considered as
	 * modified for version control system.
	 * 
	 * @param oldValue
	 *            old attribute value
	 * @param newValue
	 *            new attribute value
	 * @return true if modification of value of an attribute of this type from oldValue to newValue is considered as
	 *         modified for version control system.
	 */
	public boolean isTWValueModified(Object oldValue, Object newValue);

	/**
	 * Returns false if modification of value of an attribute of this type from oldValue to newValue is considered as no
	 * modified. In this case, newValue is not set and no set attribute event is thrown. This method is called by CADSE
	 * runtime when setting attribute.
	 * 
	 * @param oldValue
	 *            old attribute value
	 * @param newValue
	 *            new attribute value
	 * @return true if modification of value of an attribute of this type from oldValue to newValue is considered as
	 *         modified for version control system.
	 */
	public boolean isValueModified(Object oldValue, Object newValue);

	/**
	 * Returns true if all versions (revisions) of an item has same value for this attribute. If the attribute value is
	 * modified on an item version, all others versions of the same item has their attribute value updated.
	 * 
	 * @return true if all versions (revisions) of an item has same value for this attribute.
	 */
	public boolean isTWRevSpecific();

	/**
	 * return the CST name generated by cadseg
	 */
	public String getCSTName();

	public UIField generateDefaultField();

	public IAttributeType<?>[] getChildren();

	public TypeDefinition getSource();

	public boolean isAttributeHead();

	/**
	 * source.isGroup
	 * 
	 * @return
	 */
	public boolean isAttributeMember();

}
