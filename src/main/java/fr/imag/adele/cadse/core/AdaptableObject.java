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
}