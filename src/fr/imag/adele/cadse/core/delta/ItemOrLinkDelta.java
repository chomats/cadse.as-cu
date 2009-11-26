package fr.imag.adele.cadse.core.delta;

import java.util.Collection;

import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.internal.delta.InternalItemOrLinkDelta;

public interface ItemOrLinkDelta extends WLWCOperation, InternalItemOrLinkDelta {

	public abstract CreateOperation getCreateOperation();

	public abstract DeleteOperation getDeleteOperation();

	public abstract boolean isAdded();

	public abstract boolean isDeleted();

	public Collection<SetAttributeOperation> getSetAttributeOperation();

	<T> T getAttribute(String key);

	<T> T getAttribute(String key, boolean returnDefault);

	SetAttributeOperation getSetAttributeOperation(String key);

	IAttributeType<?> getAttributeType(SetAttributeOperation setAttributeOperation);

}