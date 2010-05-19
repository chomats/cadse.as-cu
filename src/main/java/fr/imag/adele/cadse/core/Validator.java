package fr.imag.adele.cadse.core;

import java.util.List;



public interface Validator extends ObjectAdapter<Validator>{
	/**
	 * Represents errors on items.
	 */
	public interface ProblemReporter {

		/** The Constant CODE_OK. */
		public static final int	CODE_OK	= 0;

		/**
		 * Reports an error for specified item.
		 * 
		 * @param item
		 *            item in error
		 * @param errorCode
		 *            error code
		 * @param description
		 *            error message
		 * @param parameters
		 *            arguments used to format error message
		 */
		public void report(Item item, int errorCode, String description, Object... parameters);

		/**
		 * Reports a warning for specified item.
		 * 
		 * @param item
		 *            item in error
		 * @param errorCode
		 *            warning code
		 * @param description
		 *            warning message
		 * @param parameters
		 *            arguments used to format warning message
		 */
		public void warning(Item item, int errorCode, String description, Object... parameters);

		/**
		 * Reports an information for specified item.
		 * 
		 * @param item
		 *            item related to this information
		 * @param errorCode
		 *            information code
		 * @param description
		 *            information message
		 * @param parameters
		 *            arguments used to format information message
		 */
		public void info(Item item, int errorCode, String description, Object... parameters);

		/**
		 * Reports an error for specified item.
		 * 
		 * @param item
		 *            item in error
		 * @param errorCode
		 *            error code
		 * @param description
		 *            error message
		 * @param parameters
		 *            arguments used to format error message
		 */
		public void error(Item item, int errorCode, String description, Object... parameters);
	}
	
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
