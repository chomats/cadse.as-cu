package fr.imag.adele.cadse.core;

import java.util.ArrayList;
import java.util.List;

public class DefaultValidator extends Validator {

	// validation...

	public static final int	CODE_OK						= ProblemReporter.CODE_OK;

	public static final int	FIRST_ERROR_CODE			= 10000;
	public static final int	ERROR_CODE_RANGE			= 10000;
	public static final int	LAST_ERROR_CODE				= FIRST_ERROR_CODE + ERROR_CODE_RANGE;

	public static final int	CODE_MISSING_REQUIRED_ITEM	= FIRST_ERROR_CODE + 1;
	public static final int	CODE_CARDINALITY_PROBLEM	= FIRST_ERROR_CODE + 2;
	public static final int	CODE_MISSING_PARENT			= FIRST_ERROR_CODE + 3;

	/**
	 * /** This methods validates an item and report all errors found using the
	 * provided reporter.
	 * 
	 * The method should return the list of related items required to validate
	 * this item. This is needed so that when one of the related items changes
	 * the item gets revalidated.
	 * 
	 * TODO: REFACTORING TO GENERALIZE TO ANY WORKSPACE MODEL
	 * 
	 * The general validations performed in this method should be done by the
	 * validation builder and should not be done in a model specific manager.
	 */
	public List<Item> validate(Item item, ProblemReporter reporter) {

		Item parentItem = item.getPartParent();
		if (parentItem == null && item.isPartItem()) {
			reporter.report(item, CODE_MISSING_PARENT, "Parent item of {0} is missing", item.getDisplayName());
		}
		// validate required items
		for (Link link : item.getOutgoingLinks()) {
			if (link.getLinkType().isRequire() && !link.isLinkResolved()) {
				reporter.report(item, CODE_MISSING_REQUIRED_ITEM, "{1} requires {0} not in workspace", link
						.getDestinationName(), item.getQualifiedDisplayName());
			}
		}

		// validate Cardinalities
		for (LinkType linkType : item.getType().getOutgoingLinkTypes()) {
			List<Link> links = filterDerived(item.getOutgoingLinks(linkType));
			if (links.size() < linkType.getMin()) {
				reporter.report(item, CODE_CARDINALITY_PROBLEM, "{2}::{0} : Minimum {1} link required  ", linkType
						.getName(), linkType.getMin(), item.getQualifiedDisplayName());
			}
			if ((linkType.getMax() != -1) && links.size() > linkType.getMax()) {
				reporter.report(item, CODE_CARDINALITY_PROBLEM, "{2}::{0} : Maximum {1} link allowed ", linkType
						.getName(), linkType.getMax(), item.getQualifiedDisplayName());
			}
		}

		return null;
	}
	
	private List<Link> filterDerived(List<Link> outgoingLinks) {
		ArrayList<Link> ret =new ArrayList<Link>();
		for (Link link : outgoingLinks) {
			if (link.isDerived()) continue;
			ret.add(link);
		}
		return ret;
	}

}
