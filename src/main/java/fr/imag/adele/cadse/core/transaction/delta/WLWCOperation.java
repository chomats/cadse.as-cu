package fr.imag.adele.cadse.core.transaction.delta;

import fr.imag.adele.cadse.core.CadseError;
import java.util.UUID;
import fr.imag.adele.cadse.core.internal.delta.InternalWLWCOperation;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;

public interface WLWCOperation extends InternalWLWCOperation {

	void addError(String msg, Object... args);

	void addError(CadseError e);

	OperationType getOperationType();

	UUID getOperationId();

	LogicalWorkspaceTransaction getWorkingCopy();

	WLWCOperation getParentOperDelta();

	OperationType getParentType();

	boolean isModified();

	boolean isLoaded();

}