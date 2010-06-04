/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core.transaction;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.var.ContextVariable;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemDescriptionRef;

/**
 * 
 * @author chomats
 */
public interface FacetteLWTransaction {
	/**
	 * 
	 * @return create new transaction of this logical workspace
	 */
	public LogicalWorkspaceTransaction createTransaction();

	/**
	 * Load item. Internal method for unresolved refrence
	 * 
	 * @param ref
	 *            the ref
	 * 
	 * @return the item
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	public Item loadItem(ItemDescriptionRef ref) throws CadseException;

	public ContextVariable getContext();

}
