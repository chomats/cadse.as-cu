package fr.imag.adele.cadse.core;

import java.util.List;

import fr.imag.adele.cadse.core.IItemManager.ProblemReporter;

public interface Validator {

	/**
	 * This method should not be override by a user.
	 * 
	 * Returns set of items for which any modification can impact the validation
	 * of specified item. Default validation checks:
	 * <ul>
	 * <li>If it has a parent, he must be present.</li>
	 * <li>If it requires other items (require outgoing links exist), they must
	 * be present.</li>
	 * <li>Cardinality for each outgoing relationships must be conformed.</li>
	 * </ul>
	 * All errors are published in specified reporter.
	 * 
	 * @param item
	 *            item to validate
	 * @param reporter
	 *            issue reporter
	 * 
	 * @return set of items for which any modification can impact the validation
	 *         of specified item.
	 */
	public List<Item> validate(Item item, ProblemReporter reporter);

}
