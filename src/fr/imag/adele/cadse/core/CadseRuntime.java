package fr.imag.adele.cadse.core;

import fr.imag.adele.cadse.core.internal.InternalCadseRuntime;

/**
 * Run version of a CADSE.
 * 
 * @author CADSE team
 */
public interface CadseRuntime extends Item, InternalCadseRuntime {

	/**
	 * Returns the list of all the CADSE which have to be executed, to get a
	 * valid execution of the current CADSE.
	 * 
	 * @return null if no dependencies
	 */
	public abstract CadseRuntime[] getRequiredCadses();

	/**
	 * Returns the list of all the errors found during execution.
	 * 
	 * @return null if no errors
	 */
	public abstract String[] getErrors();

	/**
	 * Test if this CADSE is executed.
	 * 
	 * @return a boolean
	 */
	public abstract boolean isExecuted();

	/**
	 * Test if this CADSE is the CADSE root.
	 * 
	 * @return a boolean
	 */
	public abstract boolean isCadseRoot();

	/**
	 * Test if this CADSE requires the CADSE given into parameter. The
	 * dependency between CADSEs can be direct or not.
	 * 
	 * @param cr
	 *            another CADSE
	 * @return true if the CADSE given into parameter is needed
	 */
	public abstract boolean isRequired(CadseRuntime cr);

}
