/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core.key;

import fr.imag.adele.cadse.core.CadseException;

/**
 * 
 * @author chomats
 */
public interface FacetteItemKey {

	/**
	 * TODO
	 * 
	 * @return the key
	 */
	Key getKey();

	/**
	 * Sets item key.
	 * 
	 * @param newkey
	 *            new item key.
	 * @throws CadseException
	 */
	public void setKey(Key newkey) throws CadseException;

}
