package fr.imag.adele.cadse.core.transaction.delta;

import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.internal.delta.InternalSetAttributeOperation;

public interface SetAttributeOperation extends WLWCOperation, InternalSetAttributeOperation {

	/**
	 * Return name of changed attribute.
	 * 
	 * @return name of changed attribute.
	 */
	String getAttributeName();

	/**
	 * Return current value of attribute. Null it the value is deleted
	 * (undefined)
	 * 
	 * @return current value of attribute.
	 */
	Object getCurrentValue();

	/**
	 * Return old value of attribute in the workspace logique or null if the
	 * value operation is new
	 * 
	 * @return old value of attribute.
	 */
	Object getOldValue();

	/**
	 * Return true if attribute and its value have just been added to the item.
	 * 
	 * @return true if attribute and its value have just been added to the item.
	 */
	boolean isAdded();

	/**
	 * Return true if old attribute value and new one are considered as not
	 * equals.
	 * 
	 * @return true if old attribute value and new one are considered as not
	 *         equals.
	 */
	boolean isChanged();

	/**
	 * Return true if attribute and its value have just been removed to the
	 * item.
	 * 
	 * @return true if attribute and its value have just been removed to the
	 *         item.
	 */
	boolean isRemoved();

	IAttributeType<?> getAttributeDefinition();

	/**
	 * 
	 * @return the precedent current value or the old value at the first time
	 */
	Object getPrecCurrentValue();

}