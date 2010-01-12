/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core;

import fr.imag.adele.cadse.core.ui.IActionContributor;

/**
 * 
 * @author chomats
 */
public interface FacetteTypeDefinitionAction {

	/**
	 * Gets the action contribution.
	 * 
	 * @return the action contribution
	 */
	public IActionContributor[] getActionContribution();

	/**
	 * Adds the action contributeur.
	 * 
	 * @param contributor
	 *            the contributor
	 */
	public void addActionContributeur(IActionContributor contributor);

}
