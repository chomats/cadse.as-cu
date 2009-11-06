package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

public interface UIValidator extends Item {


	/** The Constant CHANGED_ACTION. */
	public static final int	CHANGED_ACTION	= 0x0001;

	/** The Constant ADDED_ACTION. */
	public static final int	ADDED_ACTION	= 0x0002;

	/** The Constant REMOVED_ACTION. */
	public static final int	REMOVED_ACTION	= 0x0004;

	/** The Constant DELETED_ACTION. */
	public static final int	DELETED_ACTION	= 0x0008;



	abstract UIValidator[] getOverwriteValidator();

	abstract int incrementError();

	abstract IAttributeType<?>[] getListenAttributeType();
	
	abstract UIRunningValidator create();

}