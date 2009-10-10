package fr.imag.adele.cadse.core;

import fr.imag.adele.cadse.core.internal.InternalCadseRuntime;

/**
 * Run version of a CADSE.
 * 
 * @author CADSE team
 */
public interface CadseRuntime extends Item, InternalCadseRuntime {

	/** The Constant RESOURCE_SUFFIX. */
	public final static String	CADSE_NAME_SUFFIX	= "Model.Workspace.";

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
	 * True if all dependencies are resolved and canbeExecuted
	 * @return
	 */
	public boolean canBeExecuted() ;

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

	/**
	 * 
	 * @return the id of the cadse definition in CadseG
	 */
	public CompactUUID getIdCadseDefinition() ;

	/**
	 * the qualified Class Name
	 * @return the qualified Class Name where is defined java constante
	 */
	public String getCstQualifiedClassName();

	
}
