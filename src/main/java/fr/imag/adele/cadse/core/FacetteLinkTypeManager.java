/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core;

/**
 * 
 * @author chomats
 */
public interface FacetteLinkTypeManager {

	/**
	 * Returns the link type manager. It is never null.
	 * 
	 * @return the link type manager.
	 */
	public ILinkTypeManager getManager();

	/**
	 * Sets the link type manager.
	 * 
	 * @param manager
	 *            the link type manager
	 */
	public void setManager(ILinkTypeManager manager);

}
