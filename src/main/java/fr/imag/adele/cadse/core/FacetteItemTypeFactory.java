/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core;

/**
 * 
 * @author chomats
 */
public interface FacetteItemTypeFactory {
	/**
	 * Returns factory used to create item of this type.
	 * 
	 * @return factory used to create item of this type.
	 */
	public IItemFactory getItemFactory();

	/**
	 * Sets factory used to create item of this type.
	 * 
	 * @param factory
	 *            an item factory
	 */
	public void setItemFactory(IItemFactory factory);

}
