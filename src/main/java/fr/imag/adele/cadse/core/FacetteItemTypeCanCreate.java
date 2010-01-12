/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core;

import fr.imag.adele.cadse.core.ui.view.NewContext;

/**
 * 
 * @author chomats
 */
public interface FacetteItemTypeCanCreate {

	public boolean canCreateItem(NewContext newContext);

	public boolean canCreateItem(NewContext newContext, LinkType lt, Item src);
}
