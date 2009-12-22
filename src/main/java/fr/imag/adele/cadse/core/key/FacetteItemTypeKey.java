/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core.key;

/**
 * 
 * @author chomats
 */
public interface FacetteItemTypeKey {
	/**
	 * Sets the space key type.
	 * 
	 * @param spaceKeytype
	 *            the new space key type
	 */
	public void setKeyDefinition(KeyDefinition keyDefinition);

	/**
	 * Gets the space key type.
	 * 
	 * @return the space key type
	 */
	public KeyDefinition getKeyDefinition();
}
