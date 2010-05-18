/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core;

import java.util.List;

import fr.imag.adele.cadse.core.transaction.delta.ImmutableWorkspaceDelta;

/**
 * 
 * @author chomats
 */
public interface FacetteItemWorkspaceListener {

	/**
	 * Adds a listener for modification, deletion about this item.
	 * 
	 * @see fr.imag.adele.cadse.core.ChangeID
	 * 
	 * @param listener
	 *            a listener for modification, deletion about this item.
	 * @param eventFilter
	 *            ChangeID event mask
	 */
	public void addListener(WorkspaceListener listener, int eventFilter);

	/**
	 * Adds a listener for modification, deletion about this item.
	 * 
	 * @param listener
	 *            a listener for modification, deletion about this item.
	 * @param eventFilter
	 *            an event filter
	 */
	public void addListener(WorkspaceListener listener, EventFilter eventFilter);

	/**
	 * Removes a listener on this item.
	 * 
	 * @param listener
	 *            a listener for modification, deletion about this item.
	 */
	public void removeListener(WorkspaceListener listener);

	/**
	 * Returns all listeners for modification, deletion about this item which
	 * are interested in operations specified by eventFilter on logical
	 * workspace delta.
	 * 
	 * @see fr.imag.adele.cadse.core.ChangeID
	 * 
	 * @param eventFilter
	 *            ChangeID event mask
	 * @param delta
	 *            a logical workspace delta
	 * @return all listeners for modification, deletion about this item which
	 *         are interested in operations specified by eventFilter on logical
	 *         workspace delta.
	 */
	public List<WorkspaceListener> filter(int eventFilter, ImmutableWorkspaceDelta delta);

}
