package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;

public interface UIRunningValidator {
	
	public Item getDescriptor();
	
	/**
	 * Inits the.
	 * 
	 * @param field
	 *            the field
	 * @throws CadseException 
	 */
	public void init(UIPlatform uiPlatform) throws CadseException;


	public void initAfterUI();
	

/** Called when ui is disposed. */

	abstract void dispose();

	/**
	 * Notifie value deleted.
	 * 
	 * @param field
	 *            the field
	 * @param oldvalue
	 *            the oldvalue
	 */
	public void notifieValueDeleted(UIField field, Object oldvalue);

	/**
	 * Notifie value changed.
	 * 
	 * @param field
	 *            the field
	 * @param value
	 *            the value
	 */
	public void notifieValueChanged(UIField field, Object value);

	/**
	 * Notifie sub value added.
	 * 
	 * @param field
	 *            the field
	 * @param added
	 *            the added
	 */
	public void notifieSubValueAdded(UIField field, Object added);

	/**
	 * Notifie sub value removed.
	 * 
	 * @param field
	 *            the field
	 * @param removed
	 *            the removed
	 */
	public void notifieSubValueRemoved(UIField field, Object removed);
	
	/**
	 * Valid this field : the value has changed .
	 * 
	 * @param field
	 *            the field
	 * @param value
	 *            the new value
	 * 
	 * @return true, if error and stop validation process
	 */
	public abstract boolean validValueChanged(UIField field, Object value);

	/**
	 * Valid added element to a list.
	 * 
	 * @param field
	 *            the field
	 * @param addedElement
	 *            the added element
	 * 
	 * @return true, if error and stop validation process
	 */
	public abstract boolean validSubValueAdded(UIField field, Object addedElement);

	/**
	 * Valid removed element from a list.
	 * 
	 * @param field
	 *            the field
	 * @param removedElement
	 *            the removed element
	 * 
	 * @return true, if error and stop validation process
	 */
	public abstract boolean validSubValueRemoved(UIField field, Object removedElement);

	/**
	 * Valid value deleted.
	 * 
	 * @param field
	 *            the field
	 * @param deletedValue
	 *            the deleted value
	 * 
	 * @return true, if error and stop validation process
	 */
	public abstract boolean validValueDeleted(UIField field, Object deletedValue);

	/**
	 * Re validate a field after an other field which has changed.
	 * 
	 * @param field
	 *            null or the field which has changed. All others field is
	 *            revalidate.
	 * @param value
	 *            the current value or null
	 * 
	 * @return true, if error and stop validation process
	 */
	public abstract boolean validValue(UIField field, Object value);

	public int incrementError();

}
