package fr.imag.adele.cadse.core.ui;

import java.util.HashSet;
import java.util.List;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.TypeDefinition;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * The Class IPage. Represente une page graphique. Elle contient UIField,
 * eventuellement une action page
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public interface IPage extends Item {

	public static final IAttributeType<?>[]	EMPTY_UIFIELD	= new IAttributeType<?>[0];

	IPage[] getOverwritePage();

	
	abstract IAttributeType<?>[] getHiddenAttributes();
	
	abstract void addHiddenAttributes(IAttributeType<?>... attr);
	
	public void addOverridePage(IPage... pages) ;
	
	/**
	 * Return the attributs which be readonly in this pages and other pages
	 * @return a not null array. If no attribut, return an empty array.
	 */
	abstract IAttributeType<?>[]  getReadOnlyAttributes();

	/**
	 * Add readonly attributes
	 * @param attr
	 */
	abstract void addReadOnlyAttributes(IAttributeType<?>... attr);
	
	/**
	 * Gets owner the fields.
	 * 
	 * @return the fields
	 */
	abstract IAttributeType<?>[] getAttributes();
	 
	abstract void addLast(IAttributeType<?>... attr);

	void addLast(List<IAttributeType<?>> attrs);

	abstract void addBefore(IAttributeType<?> beforeAttr, IAttributeType<?> attributeToInsert);

	abstract void addAfter(IAttributeType<?> afterAttr, IAttributeType<?> attributeToInsert);

	/**
	 * Gets the action page.
	 * 
	 * @return the action page
	 */
	abstract IActionPage getActionPage();

	/**
	 * Gets the label.
	 * 
	 * @return the label
	 */
	abstract String getLabel();

	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	abstract String getTitle();

	/**
	 * Gets the description.
	 * 
	 * @return the description
	 */
	abstract String getDescription();

	abstract TypeDefinition getParentItemType();

	abstract boolean isModificationPage();

	boolean isEmptyPage();

	boolean isLast(IAttributeType<?> attributeDefinition);

	void getAllAttributes(HashSet<IAttributeType<?>> allAttributes);

	
}