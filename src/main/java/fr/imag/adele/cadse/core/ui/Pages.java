package fr.imag.adele.cadse.core.ui;

import java.util.List;
import java.util.Set;

import fr.imag.adele.cadse.core.attribute.GroupOfAttributes;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.ui.view.NewContext;

public interface Pages {

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

	abstract void addPage(IPage page);

	abstract void setAction(IActionPage newAction);

	abstract void addUIValidator(UIRunningValidator v);

	abstract NewContext getContext();

	public Set<GroupOfAttributes> getGroupOfAttributes();
}