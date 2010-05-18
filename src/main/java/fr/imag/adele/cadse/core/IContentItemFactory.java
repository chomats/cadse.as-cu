package fr.imag.adele.cadse.core;

import java.util.UUID;

import fr.imag.adele.cadse.core.content.ContentItem;


public interface IContentItemFactory  {

	/**
	 * Don't call it, it is called automatically by CADSE runtime.
	 * 
	 * Creates and returns content item associated to specified item.
	 * 
	 * @param id
	 *            the id of the loaded item
	 * @param owerItem TODO
	 * 
	 * @return content item associated to specified item.
	 * 
	 * @throws CadseException
	 *             a CADSE exception.
	 */
	public ContentItem createContentItem(UUID id, Item owerItem) throws CadseException;
	

}
