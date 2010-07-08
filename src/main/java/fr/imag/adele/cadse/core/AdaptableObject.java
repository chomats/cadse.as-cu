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

	public <T extends ObjectAdapter<T>> T adapt(Class<T> clazz);
	
	public <T extends ObjectAdapter<T>> T[] adapts(Class<T> clazz);
	
	public <T> void addAdapter(ObjectAdapter<T> adapt);
	
	public <T> void removeAdapter(ObjectAdapter<T> adapt);
}
