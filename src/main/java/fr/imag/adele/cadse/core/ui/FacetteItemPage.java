/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.ui.view.FilterContext;
import fr.imag.adele.cadse.core.ui.view.NewContext;

/**
 * 
 * @author chomats
 */
public interface FacetteItemPage {
	/**
	 * Gets the good creation page.
	 * 
	 * @param parent
	 *            the parent
	 * @param type
	 *            the type
	 * @param lt
	 *            the lt
	 * 
	 * @return the good creation page
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	public Pages getCreationPages(NewContext context) throws CadseException;

	public Pages getModificationPages(FilterContext context);
}
