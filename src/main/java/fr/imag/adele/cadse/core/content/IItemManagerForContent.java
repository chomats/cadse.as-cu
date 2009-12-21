/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core.content;

/**
 * 
 * @author chomats
 */
public interface IItemManagerForContent {

	/**
	 * Don't call it, it is called automatically by CADSE runtime.
	 * 
	 * Create a factory to create a content item.
	 * 
	 * @return a content item factory.
	 * 
	 */
	public IContentItemFactory getContentItemFactory();

	public ContentItem getParentContentItemWherePutMyContent(ContentItem cm);

}
