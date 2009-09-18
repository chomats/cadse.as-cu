package fr.imag.adele.cadse.core;

public interface IContentItemFactory {

	/**
	 * Don't call it, it is called automatically by CADSE runtime.
	 * 
	 * Creates and returns content item associated to specified item.
	 * 
	 * @param item
	 *            an item
	 * 
	 * @return content item associated to specified item.
	 * 
	 * @throws CadseException
	 *             a CADSE exception.
	 */
	public ContentItem createContentItem(Item item) throws CadseException;
}
