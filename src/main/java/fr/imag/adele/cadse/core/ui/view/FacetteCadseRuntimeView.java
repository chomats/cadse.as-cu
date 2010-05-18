/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core.ui.view;

/**
 * 
 * @author chomats
 */
public interface FacetteCadseRuntimeView {

	public void addDefineNewContext(DefineNewContext d);

	public void removeDefineNewContext(DefineNewContext d);

	public DefineNewContext[] getDefineNewContexts();
}
