package fr.imag.adele.cadse.core;

import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import fr.imag.adele.cadse.core.attribute.GroupOfAttributes;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransactionBroadcaster;
import fr.imag.adele.cadse.core.ui.FacetteTypeDefinitionUI;
import fr.imag.adele.cadse.core.ui.FacetteTypeDefinitionUIInternal;
import fr.imag.adele.cadse.core.ui.HierarchicPage;
import fr.imag.adele.cadse.core.ui.IActionPage;
import fr.imag.adele.cadse.core.ui.IPage;
import fr.imag.adele.cadse.core.ui.UIField;
import fr.imag.adele.cadse.core.ui.UIValidator;
import fr.imag.adele.cadse.core.ui.view.FilterContext;
import fr.imag.adele.cadse.core.ui.view.NewContext;

public interface TypeDefinition 
extends Item,IAttributableType, FacetteTypeDefinitionAction, FacetteTypeDefinitionUIInternal,
FacetteTypeDefinitionUI, LogicalWorkspaceTransactionBroadcaster {

	/** The Constant PART. */
	public static final int	IT_PART						= 0x0001;

	/** The Constant COMPOSITE. */
	public static final int	IT_COMPOSITE				= 0x0002;

	/** The Constant ROOT_ELEMENT. */
	public static final int	IT_INSTACES_IS_ROOT_ELEMENT	= 0x0004;

	/** The Constant READ_ONLY. */
	public static final int	IT_INSTANCES_IS_READ_ONLY	= 0x0008;

	/** The Constant HIDDEN. */
	public static final int	IT_INSTANCES_IS_HIDDEN		= 0x0010;

	/** The Constant ABSTRACT : cannot create instance. */
	public static final int	IT_ABSTRACT					= 0x0020;

	/** The Constant UNIQUE_NAME. */
	public static final int	IT_HAS_QUALIFIED_NAME		= 0x0040;

	/** The Constant SHORT_NAME. */
	public static final int	IT_HAS_NAME					= 0x0080;

	/** The Constant SHORT_NAME. */
	public static final int	IT_MAIN_TYPE				= 0x0100;

	/**
	 * It's an ItemType ?
	 * 
	 * @return
	 */
	boolean isMainType();

	/**
	 * It's an Extended Type ?
	 * 
	 * @return
	 */
	boolean isExtendedType();

	// Link type

	
	
	
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

	public abstract IItemManager getItemManager();
	/**
	 * Creates the link type.
	 * 
	 * @param id
	 *            runtime id define in cadseg
	 * @param intID
	 *            the int id (not used) gave 0
	 * @param name
	 *            the name
	 * @param kind
	 *            the kind
	 * @param min
	 *            the min
	 * @param max
	 *            the max
	 * @param selection
	 *            the selection
	 * @param destination
	 *            the destination
	 * 
	 * @return the link type
	 * @throws CadseException
	 */
	public abstract LinkType createLinkType(UUID id, int intID, String name, int kind, int min, int max,
			String selection, TypeDefinition destination) throws CadseException;

	/**
	 * Get an outgoing link type by id.
	 * 
	 * @param name
	 *            the name
	 * 
	 * @return a link type if found; null if not found.
	 */
	public abstract LinkType getOutgoingLinkType(String name);
	
	/**
	 * Get an outgoing link type by id.
	 * 
	 * @param name
	 *            the name
	 * 
	 * @return a link type if found; null if not found.
	 */
	public abstract LinkType getOutgoingLinkType(UUID idLinkType);
	
	/**
	 * Gets the outgoing link type.
	 * 
	 * @param destination
	 *            the destination
	 * @param name
	 *            the name
	 * 
	 * @return the outgoing link type
	 */
	public abstract LinkType getOutgoingLinkType(TypeDefinition destination, String name);

	/**
	 * Gets the outgoing link type.
	 * 
	 * @param destination
	 *            the destination
	 * @param kind
	 *            the kind
	 * 
	 * @return the outgoing link type
	 */
	public abstract LinkType getOutgoingLinkType(TypeDefinition destination, int kind);

	/**
	 * Get an incoming link type by id.
	 * 
	 * @param name
	 *            the name
	 * 
	 * @return a link type if found; null if not found.
	 */
	public abstract LinkType getIncomingLinkType(String name);
	
	/**
	 * Get all hierarchical outgoing link types.
	 * 
	 * @return an unmodifiable list all hierarchical outgoing link types.
	 */
	public abstract List<LinkType> getOutgoingLinkTypes();

	/**
	 * Get all owned outgoing link types, not hierarchical.
	 * 
	 * @return an unmodifiable list all owned outgoing link types.
	 */
	public List<LinkType> getOwnerOutgoingLinkTypes();

	/**
	 * Get all incoming link types.
	 * 
	 * @return an unmodifiable list all incoming link types.
	 */
	public abstract List<LinkType> getIncomingLinkTypes();

	// ETAT
	/**
	 * true if it a runtime ItemType (children of a RuntimeCadse, not a cadseg
	 * IT, not a dynamic IT
	 * 
	 * @return
	 */
	public boolean isRuntime();

	// *CADSE */

	/**
	 * Return the name of the cadse where this type is defined.
	 * 
	 * @return the name of the cadse where this type is defined.
	 */
	public String getCadseName();

	// * INSTANCE

	/**
	 * Gets the items.
	 * 
	 * @return the items
	 */
	public abstract List<Item> getItems();

	// MENU ACTION


	/**
	 * Checks for incoming parts.
	 * 
	 * @return true, if successful
	 */
	boolean hasIncomingParts();
	

	
	
	public CPackage getPackage();

	
	public void setPackage(CPackage p);
	

	public IAttributeType<?> getCStructuralFeatures(int index);

	// *PAGE*/

	interface Internal {
		public IActionPage createDefaultCreationAction(NewContext context) throws CadseException;
		
		public IActionPage createDefaultModificationAction(FilterContext context) ;
		public void computeGroup(Set<GroupOfAttributes> groups);
		public abstract void computeValidators(FilterContext context, List<UIValidator> validators);

		public abstract void recurcifComputeModificationPage(FilterContext context, List<IPage> list,
				Set<IAttributeType<?>> ro);

		public abstract void computeGenericPage(FilterContext context, HierarchicPage genericPage,
				HashSet<IAttributeType<?>> inSpecificPages, Set<IAttributeType<?>> ro, IAttributeType<?>... firstAttributes);
		
		public abstract void recurcifComputeCreationPage(FilterContext context, List<IPage> list);


		public Link addOutgoingLinkType(LinkType ret);

	}

	/**
	 * Create a link type. <br/>
	 * <br/>
	 * 
	 * Pr�conditions: <br/>
	 * - 1. <tt>name</tt> cannot be null.<br/>
	 * - 2. <tt>name</tt> cannot be empty. - 3. <tt>destination</tt> cannot be
	 * null.<br/>
	 * - 4. <tt>name</tt> muqt be unique.<br/>
	 * - 5. <tt>destination</tt> cannot be type workspace.<br/>
	 * - 6. <tt>min</tt> must greater or equal 0; <tt>max</tt> either equal -1
	 * (means the instance's number of this link type is undefined), or either
	 * greater than <tt>min</tt>.
	 * 
	 * @param id
	 *            runtime id define in cadseg
	 * @param intID
	 *            the int id
	 * @param name
	 *            the name
	 * @param kind
	 *            : kind of link type, can be a Aggregation, or a Contaiment, or
	 *            Other.
	 * @param min
	 *            : the minimum instances of this link type that we want create.
	 * @param max
	 *            : the maximum instances of this link type that we want create.
	 * @param selection
	 *            the selection
	 * @param inverse
	 *            the inverse
	 * 
	 * @return the link type
	 * @throws CadseException
	 * 
	 * @OCL: pre: name <> null pre: id <> '' pre: destination <> null pre:
	 *       self.to->forAll(rt | rt.name <> id) -- id must be unique. pre: not
	 *       destination.oclIsTypeOf(WorkspaceType) -- destination cannot be a
	 *       Workspace Type. pre: ((max>=min)||(max==-1))&&(min>=0)) <br/>
	 * @exception IllegalArgumentException
	 *                : Invalid assignment, <tt>name</tt> can not be null.<br/>
	 *                IllegalArgumentException: Invalid assignment,
	 *                <tt>name</tt> can not be empty.<br/>
	 *                IllegalArgumentException: Invalid assignment, item type
	 *                <tt>$name</tt> can not be null.<br/>
	 *                IllegalArgumentException: Invalid assignment, this link
	 *                type <tt>destination</tt> already exist.<br/>
	 *                IllegalArgumentException: Invalid assignment, you can not
	 *                create a link type whose destination is an object of
	 *                WorkspaceType.<br/>
	 *                IllegalArgumentException: Invalid assignment, verify the
	 *                values min and max.<br/>
	 * <br/>
	 */
	public abstract LinkType createLinkType(UUID id, int intID, String name, int kind, int min, int max,
			String selection, LinkType inverse) throws CadseException;
	
	/**
	 * Sets the icon.
	 * 
	 * @param url
	 *            the new icon
	 */
	public void setIcon(String uri);

	/**
	 * Gets the icon.
	 * 
	 * @return the icon
	 */
	public String getImage();
	
	
	public abstract void setCSTName(String cstName);
	
	/**
	 * set the package attribute
	 * 
	 * @param packageName
	 *            the java qualified string or empty string for no package
	 */
	public void setPackageName(String packageName);

	/**
	 * get the package attribute
	 * 
	 * @return the package name attribute
	 */
	public String getPackageName();
	
}