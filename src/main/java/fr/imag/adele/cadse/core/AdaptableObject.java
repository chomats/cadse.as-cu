/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core;

/**
 * 
 * @author chomats
 */
public interface AdaptableObject {

	public <T> T adapt(Class<T> clazz);
	
	public <T> T[] adapts(Class<T> clazz);
	
	public <T> void addAdater(ObjectAdapter<T> adapt);
	
	public <T> void removeAdater(ObjectAdapter<T> adapt);
}
