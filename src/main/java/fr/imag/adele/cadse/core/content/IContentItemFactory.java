package fr.imag.adele.cadse.core.content;

import fr.imag.adele.cadse.core.CadseException;
import java.util.UUID;

public interface IContentItemFactory {

	/**
	 * Don't call it, it is called automatically by CADSE runtime.
	 * 
	 * Creates and returns content item associated to specified item.
	 * 
	 * @param id
	 *            the id of the loaded item
	 * 
	 * @return content item associated to specified item.
	 * 
	 * @throws CadseException
	 *             a CADSE exception.
	 */
	public ContentItem createContentItem(UUID id) throws CadseException;
}
