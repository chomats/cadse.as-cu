package fr.imag.adele.cadse.core;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.imag.adele.cadse.core.attribute.GroupOfAttributes;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.ui.HierarchicPage;
import fr.imag.adele.cadse.core.ui.IActionPage;
import fr.imag.adele.cadse.core.ui.IPage;
import fr.imag.adele.cadse.core.ui.UIField;
import fr.imag.adele.cadse.core.ui.UIValidator;
import fr.imag.adele.cadse.core.ui.view.FilterContext;
import fr.imag.adele.cadse.core.ui.view.NewContext;

public interface TypeDefinition extends Item {

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

	
	public abstract void getAllAttributeTypes(List<IAttributeType<?>> all, ItemFilter filter);


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
	
	public void addGroupOfAttributes( GroupOfAttributes g);
	
	public GroupOfAttributes[] getGroupOfAttributes();
	
	interface Internal {
		public IActionPage createDefaultCreationAction(NewContext context) throws CadseException;
		public IActionPage createDefaultModificationAction(FilterContext context) ;
		public void computeGroup(Set<GroupOfAttributes> groups);
		public abstract void computeValidators(FilterContext context, List<UIValidator> validators);

		public abstract void recurcifComputeModificationPage(FilterContext context, List<IPage> list,
				Set<IAttributeType<?>> ro);

		public abstract void computeGenericPage(FilterContext context, HierarchicPage genericPage,
				HashSet<IAttributeType<?>> inSpecificPages, Set<IAttributeType<?>> ro, IAttributeType<?>... firstAttributes);
		
		public abstract void recurcifComputeCreationPage(FilterContext context, List<IPage> list, Set<IAttributeType<?>> ro);

		
	}

	public abstract boolean isMainType();

	public abstract IItemManager getItemManager();

	public abstract Collection<? extends Item> getItems();

	public abstract LinkType getOutgoingLinkType(String nameOfLinkType);

	public abstract List<LinkType> getOutgoingLinkTypes();

	public abstract LinkType getIncomingLinkType(String nameOfLinkType);
}