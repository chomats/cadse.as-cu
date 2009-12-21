/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.ui.view.FilterContext;
import fr.imag.adele.cadse.core.ui.view.NewContext;

/**
 * 
 * @author chomats
 */
public interface FacetteLWUI {

	public NewContext[] getNewContextFrom(FilterContext context);

}
