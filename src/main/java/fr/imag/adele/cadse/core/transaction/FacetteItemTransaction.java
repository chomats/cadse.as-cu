/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core.transaction;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.internal.IWorkingLoadingItems;
import fr.imag.adele.cadse.core.internal.IWorkspaceNotifier;
import fr.imag.adele.cadse.core.transaction.delta.ItemDelta;
import fr.imag.adele.cadse.core.util.IErrorCollector;

/**
 * 
 * @author chomats
 */
public interface FacetteItemTransaction {
	interface Internal {

		public void loadItem(IWorkingLoadingItems wl, ItemDelta itemOperation, IErrorCollector errorCollector)
				throws CadseException;

		/**
		 * INTERNAL method.
		 */
		public void update(IWorkingLoadingItems items, ItemDelta desc, IWorkspaceNotifier notifie);

	}
}
