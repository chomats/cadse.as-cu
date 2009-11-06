package fr.imag.adele.cadse.core.ui;

import java.util.List;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;
import fr.imag.adele.cadse.core.ui.view.FilterContext;
import fr.imag.adele.cadse.core.ui.view.IContextReference;

public interface Pages  {

	/**
	 * Gets the page.
	 * 
	 * @param index
	 *            the index
	 * 
	 * @return the page
	 */
	abstract IPage getPage(int index);

	/**
	 * Gets the pages.
	 * 
	 * @return the pages
	 */
	abstract IPage[] getPages();

	

	/**
	 * Gets the page.
	 * 
	 * @param pageid
	 *            the pageid
	 * 
	 * @return the page
	 */
	abstract IPage getPage(String pageid);



	
	boolean isModificationPages();

	abstract UIField getUIField(IAttributeType<?> at);

	abstract List<UIRunningValidator> getUIValidators();

	abstract IActionPage getAction();

	abstract void setUIField(IAttributeType<?> key, UIField field);

}