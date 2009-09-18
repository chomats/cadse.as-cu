/**
 * 
 */
package fr.imag.adele.cadse.core.attribute;

import fr.imag.adele.cadse.core.delta.ItemDelta;
import fr.imag.adele.cadse.core.delta.SetAttributeOperation;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransactionListener;

public interface IComputedAttribute {
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
	public abstract String compute(ItemDelta itemCurrent);

	public void registerListener(LogicalWorkspaceTransactionListener l);

	public ItemDelta getSource(ItemDelta item, SetAttributeOperation attOperation);

}