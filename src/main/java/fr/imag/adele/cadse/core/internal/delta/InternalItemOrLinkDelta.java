package fr.imag.adele.cadse.core.internal.delta;

import fr.imag.adele.cadse.core.transaction.delta.CreateOperation;
import fr.imag.adele.cadse.core.transaction.delta.DeleteOperation;
import fr.imag.adele.cadse.core.transaction.delta.SetAttributeOperation;

public interface InternalItemOrLinkDelta extends InternalWLWCOperation {

	void setCreateOperation(CreateOperation createItemOperation);

	void setDeleteOperation(DeleteOperation deleteItemOperation);

	void add(SetAttributeOperation setAttributeOperation);

	void add(SetAttributeOperation setAttributeOperation, boolean check);

}