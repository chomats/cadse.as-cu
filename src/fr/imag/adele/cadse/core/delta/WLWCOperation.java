package fr.imag.adele.cadse.core.delta;

import fr.imag.adele.cadse.core.CadseError;
import fr.imag.adele.cadse.core.CompactUUID;
import fr.imag.adele.cadse.core.internal.delta.InternalWLWCOperation;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;

public interface WLWCOperation extends InternalWLWCOperation {

	void addError(String msg, Object ...args);
	
	void addError(CadseError e);

	OperationType getOperationType();

	CompactUUID getOperationId();

	LogicalWorkspaceTransaction getWorkingCopy();

	WLWCOperation getParent();

	OperationType getParentType();

	boolean isModified();

	boolean isLoaded();

}