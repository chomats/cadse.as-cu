package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.ui.view.IContextReference;

public interface UIField extends IEventListener, IPageObject, IContextReference, Item {

	public static final String	CADSE_MODEL_KEY		= "CADSE-MODEL";
	public static final String	ADD_BUTTON			= "Add...";
	public static final String	REMOVE_BUTTON		= "Remove...";
	public static final String	UP_BUTTON			= "Up";
	public static final String	EDIT_BUTTON			= "Edit";
	public static final String	DOWN_BUTTON			= "Down";
	public static final String	RE_ORDER_BUTTON		= "Re order";
	public static final String	SELECT_BUTTON		= "...";
	public static final String	SELECT_ALL_BUTTON	= "Select All";
	public static final String	DESELECT_ALL_BUTTON	= "Deselect All";

	/**
	 * Gets the pages.
	 * 
	 * @return the pages
	 */
	abstract Pages getPages();

	/**
	 * Gets the pos label.
	 * 
	 * @return the pos label
	 */
	abstract EPosLabel getPosLabel();

	/**
	 * Gets the label.
	 * 
	 * @return the label
	 */
	abstract String getLabel();

	/**
	 * Sets the label.
	 * 
	 * @param label
	 *            the new label
	 */
	abstract void setLabel(String label);

	/**
	 * 
	 * @return the name of the attribute definition
	 */
	abstract String getAttributeName();

	/**
	 * Gets the page.
	 * 
	 * @return the page
	 */
	abstract IPage getPage();

	/**
	 * Gets the interaction controller.
	 * 
	 * @return the interaction controller
	 */
	abstract IInteractionController getInteractionController();

	/**
	 * Gets the model controller.
	 * 
	 * @return the model controller
	 */
	abstract IModelController getModelController();

	/**
	 * Inits the.
	 * 
	 * @param globalController
	 *            the global controller
	 */
	abstract void init(IPageController globalController);

	/**
	 * Gets the visual value.
	 * 
	 * @return the visual value
	 */
	abstract Object getVisualValue();

	/**
	 * Sets the visual value and send notification if need.
	 * 
	 * @param visualValue
	 *            the new visual value
	 */
	abstract void setVisualValue(Object visualValue);

	/**
	 * Sets the visual value and send notification if need.
	 * 
	 * DO NOT CALL THIS METHOD
	 * 
	 * @param visualValue
	 *            the new visual value
	 * @param sendNotification
	 *            tell if the notification must be send
	 */
	abstract void setVisualValue(Object visualValue, boolean sendNotification);

	/**
	 * Sets the value.
	 * 
	 * @param visualValue
	 *            the new value
	 */
	abstract void setValue(Object visualValue);

	/**
	 * This field has changed ...
	 * 
	 * @return the h span
	 */
	abstract int getHSpan();

	/**
	 * Gets the v span.
	 * 
	 * @return the v span
	 */
	abstract int getVSpan();

	/**
	 * This field has changed.
	 */
	abstract void thisFieldHasChanged();

	abstract boolean isRunning();

	/**
	 * Force change.
	 */
	abstract void forceChange();

	/**
	 * Sets the enabled.
	 * 
	 * @param v
	 *            the new enabled
	 */
	abstract void setEnabled(boolean v);

	abstract void setEditable(boolean editable);

	/**
	 * Sets the internal editable.
	 * 
	 * @param v
	 *            the new editable
	 */
	public abstract void internalSetEditable(boolean v);

	/**
	 * Sets the internal visible.
	 * 
	 * @param v
	 *            the new visible
	 */
	public abstract void internalSetVisible(boolean v);

	/**
	 * Sets the visible.
	 * 
	 * @param v
	 *            the new visible
	 */
	abstract void setVisible(boolean v);

	/**
	 * Sets the visible.
	 * 
	 * @param v
	 *            the new visible
	 */
	abstract void setHidden(boolean v);

	public void setPage(IPage p);

	/**
	 * Creates the control.
	 * 
	 * @param globalUIController
	 *            the global ui controller
	 * @param toolkit
	 *            the toolkit
	 * @param container
	 *            the container
	 * @param hspan
	 *            the hspan
	 * 
	 * @return the object
	 */
	abstract Object createControl(IPageController globalUIController, IFedeFormToolkit toolkit, Object container,
			int hspan);

	/**
	 * Gets the uI object.
	 * 
	 * @param index
	 *            the index
	 * 
	 * @return the uI object
	 */
	abstract Object getUIObject(int index);

	/**
	 * Inits the.
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	abstract void init() throws CadseException;

	/**
	 * Inits the after ui.
	 */
	abstract void initAfterUI();

	/**
	 * Put.
	 * 
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	abstract void put(String key, Object value);

	/**
	 * Gets the value for visual.
	 * 
	 * @return the value for visual
	 */
	abstract Object getValueForVisual();

	/**
	 * Update value.
	 */
	abstract void updateValue();

	/**
	 * Adds the listener.
	 * 
	 * @param l
	 *            the l
	 */
	abstract void addListener(IEventListener l);

	/**
	 * Adds the validate contributor.
	 * 
	 * @param l
	 *            the l
	 */
	abstract void addValidateContributor(IValidateContributor l);

	/**
	 * Removes the listener as a listener of the specified type.
	 * 
	 * @param l
	 *            the listener to be removed
	 */
	abstract void removeListener(IEventListener l);

	/**
	 * Reset visual value.
	 */
	abstract void resetVisualValue();

	/**
	 * Validate field.
	 * 
	 * @return true, if successful
	 */
	abstract boolean validateField();

	abstract boolean isDisposed();

	/**
	 * Broadcast value changed.
	 * 
	 * @param globalController
	 *            the global controller
	 * @param visualValue
	 *            the visual value
	 * 
	 * @return true if error in the current field, if error in other field
	 *         return false or no error in this field. false indique no error in
	 *         the current field and not error in other field
	 */
	abstract boolean broadcastValueChanged(IPageController globalController, Object visualValue);

	/**
	 * Broadcast init.
	 */
	abstract void broadcastInit();

	/**
	 * Broadcast value deleted.
	 * 
	 * @param globalController
	 *            the global controller
	 * @param oldvalue
	 *            the oldvalue
	 * 
	 * @return true if error
	 */
	abstract boolean broadcastValueDeleted(IPageController globalController, Object oldvalue);

	/**
	 * Broadcast sub value added.
	 * 
	 * @param globalController
	 *            the global controller
	 * @param added
	 *            the added
	 * 
	 * @return true if error
	 */
	abstract boolean broadcastSubValueAdded(IPageController globalController, Object added);

	/**
	 * Broadcast sub value removed.
	 * 
	 * @param globalController
	 *            the global controller
	 * @param removed
	 *            the removed
	 * 
	 * @return true if error
	 */
	abstract boolean broadcastSubValueRemoved(IPageController globalController, Object removed);

	/**
	 * Dispose.
	 */
	abstract void dispose();

	/**
	 * Gets the context.
	 * 
	 * @return the context
	 */
	abstract Object getContext();

	abstract boolean isEditable();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.ui.IEventListener#init(fede.workspace.domain.ui
	 * .UIField)
	 */
	abstract void init(UIField field);

	abstract Item getPartParent();

	/**
	 * Return the attribute definition which this field display the value
	 * 
	 * @return the attribute definition
	 */

	abstract IAttributeType<?> getAttributeDefinition();

	abstract void setItem(Item item);

	/**
	 * 
	 * @return true if has children
	 */
	abstract boolean hasChildren();

	/**
	 * 
	 * @return if has children return the array of {@link UIField} else null
	 */

	abstract UIField[] getChildren();

}