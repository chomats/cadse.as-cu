package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

public interface UIField extends Item {

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
	 * Gets the interaction controller.
	 * 
	 * @return the interaction controller
	 */
	abstract Item getInteractionControllerBASE();

	/**
	 * Gets the model controller.
	 * 
	 * @return the model controller
	 */
	abstract Item getModelController();

	/**
	 * This field has changed ...
	 * 
	 * @return the h span
	 */
	abstract int getHSpan();


	abstract void setEditable(boolean editable);
	
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

	abstract boolean isEditable();


	/**
	 * Return the attribute definition which this field display the value
	 * 
	 * @return the attribute definition
	 */

	abstract IAttributeType<?> getAttributeDefinition();
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

	abstract int getStyle();

	abstract boolean getFlag(int flag);

	abstract void setModelController(Item modelController);

	abstract void setPositionLabel(EPosLabel poslabel);

	abstract void setStyle(int i);
	
	@Override
	public boolean setFlag(int f, boolean flag);
	
	@Override
	public void setType(ItemType itemType);

}