/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core.content;

/**
 * 
 * @author chomats
 */
public interface FacetteItemContent {
	interface Internal {
		/**
		 * 
		 * @return the content item
		 */
		public ContentItem _getContentItem();
	}

	/**
	 * Returns the content item representing the associated content. If it has a
	 * content and content item does not exist, creates and returns it. If it
	 * has no content, returns null.
	 * 
	 * @return the content item representing the associated content.
	 */
	public ContentItem getContentItem();

	/**
	 * Return true if the content associated to this item is loaded. A content
	 * is loaded if content item representing the associated content exists. If
	 * it has no content, returns false.
	 * 
	 * @return true if the content associated to this item is loaded.
	 */
	public boolean contentIsLoaded();

	/**
	 * INTERNAL method.
	 * 
	 * Deletes content item which represents associated content.
	 */
	public void removeContentItem();
}
