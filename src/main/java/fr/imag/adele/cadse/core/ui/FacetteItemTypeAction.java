/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core.ui;

/**
 * 
 * @author chomats
 */
public interface FacetteItemTypeAction {

	/**
	 * Sets the creation action.
	 * 
	 * @param clazz
	 *            the clazz
	 * @param defaultShortName
	 *            the default short name
	 */
	public void setCreationAction(Class<? extends IActionPage> clazz, String defaultShortName);

	/**
	 * Gets the all action contribution.
	 * 
	 * @return the all action contribution
	 */
	public IActionContributor[] getAllActionContribution();

}
