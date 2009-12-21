package fr.imag.adele.cadse.core.internal.delta;

import fr.imag.adele.cadse.core.delta.CreateOperation;
import fr.imag.adele.cadse.core.delta.DeleteOperation;
import fr.imag.adele.cadse.core.delta.SetAttributeOperation;

public interface InternalItemOrLinkDelta extends InternalWLWCOperation {

	void setCreateOperation(CreateOperation createItemOperation);

	void setDeleteOperation(DeleteOperation deleteItemOperation);

	void add(SetAttributeOperation setAttributeOperation);

	void add(SetAttributeOperation setAttributeOperation, boolean check);

}