package fr.imag.adele.cadse.core;

import fr.imag.adele.cadse.core.ui.IActionContributor;

/**
 * The Interface ContributionToMenuAction.
 * Deprecated.  Use {@link IActionContributor} or cadesg editor
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
@Deprecated
public interface ContributionToMenuAction {
	
	/**
	 * Contribute menu new action.
	 * 
	 * @param menu
	 *            the menu
	 * @param parent
	 *            the parent
	 */
	public void contributeMenuNewAction(Menu menu, Item parent);
	
	
}