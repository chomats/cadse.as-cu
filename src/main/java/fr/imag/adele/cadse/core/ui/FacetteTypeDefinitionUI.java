/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core.ui;

import java.util.List;

import fr.imag.adele.cadse.core.attribute.GroupOfAttributes;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * 
 * @author chomats
 */
public interface FacetteTypeDefinitionUI {
	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.imag.adele.cadse.core.ItemType#getCreationPage()
	 */
	public abstract IPage[] getCreationPage();

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.imag.adele.cadse.core.ItemType#getModificationPage()
	 */
	public abstract IPage[] getModificationPage();

	/**
	 * Adds the creation pages.
	 * 
	 * @param creationPages
	 *            the creation pages
	 */
	public void addCreationPages(List<IPage> creationPages);

	/**
	 * Adds the modification pages.
	 * 
	 * @param modificationPages
	 *            the modification pages
	 */
	public void addModificationPages(List<IPage> modificationPages);

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
