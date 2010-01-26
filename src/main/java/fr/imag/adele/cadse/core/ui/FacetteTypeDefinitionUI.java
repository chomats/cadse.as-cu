/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.attribute.GroupOfAttributes;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * 
 * @author chomats
 */
public interface FacetteTypeDefinitionUI {
	/**
	 * Gets the creation page.
	 * 
	 * @return the creation page
	 */
	public abstract IPage[] getCreationPage();

	/**
	 * Gets the modification page.
	 * 
	 * @return the modification page
	 */
	public abstract IPage[] getModificationPage();

	/**
	 * Adds the creation pages.
	 * 
	 * @param creationPages
	 *            the creation pages
	 */
	public void addCreationPages(IPage... creationPages);

	/**
	 * Adds the modification pages.
	 * 
	 * @param modificationPages
	 *            the modification pages
	 */
	public void addModificationPages(IPage... modificationPages);

	public abstract UIField findField(IAttributeType<?> att);

	/**
	 * Creates the default modification action.
	 * 
	 * @param node
	 *            the node
	 * 
	 * @return the i action page
	 */

	public void addValidators(UIValidator v);

	public void addField(UIField v);

	public void addGroupOfAttributes(GroupOfAttributes g);

	public GroupOfAttributes[] getGroupOfAttributes();
}
