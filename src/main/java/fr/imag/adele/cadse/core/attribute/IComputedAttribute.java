/**
 * 
 */
package fr.imag.adele.cadse.core.attribute;

import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransactionListener;
import fr.imag.adele.cadse.core.transaction.delta.ItemDelta;
import fr.imag.adele.cadse.core.transaction.delta.SetAttributeOperation;

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