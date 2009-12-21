package fr.imag.adele.cadse.core.var;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

public interface Variable extends IAttributeType<String> {

	/**
	 * Checks if is null.
	 * 
	 * @return true, if is null
	 */
	public boolean isNull();

	/**
	 * Compute.
	 * 
	 * @param context
	 *            the context
	 * @param itemCurrent
	 *            the item current
	 * 
	 * @return the string
	 */
	public abstract String compute(ContextVariable context, Item itemCurrent);
}
