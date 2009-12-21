/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.imag.adele.cadse.core.ui;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.attribute.GroupOfAttributes;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.ui.view.FilterContext;
import fr.imag.adele.cadse.core.ui.view.NewContext;

/**
 * 
 * @author chomats
 */
public interface FacetteTypeDefinitionUIInternal {

	public IActionPage createDefaultCreationAction(NewContext context) throws CadseException;

	public IActionPage createDefaultModificationAction(FilterContext context);

	public void computeGroup(Set<GroupOfAttributes> groups);

	public abstract void computeValidators(FilterContext context, List<UIValidator> validators);

	public abstract void recurcifComputeModificationPage(FilterContext context, List<IPage> list,
			Set<IAttributeType<?>> ro);

	public abstract void computeGenericPage(FilterContext context, HierarchicPage genericPage,
			HashSet<IAttributeType<?>> inSpecificPages, Set<IAttributeType<?>> ro, IAttributeType<?>... firstAttributes);

	public abstract void recurcifComputeCreationPage(FilterContext context, List<IPage> list, Set<IAttributeType<?>> ro);
}
