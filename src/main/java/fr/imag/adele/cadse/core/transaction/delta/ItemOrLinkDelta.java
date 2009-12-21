package fr.imag.adele.cadse.core.transaction.delta;

import java.util.Collection;

import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.internal.delta.InternalItemOrLinkDelta;

public interface ItemOrLinkDelta extends WLWCOperation, InternalItemOrLinkDelta {

	public abstract CreateOperation getCreateOperation();

	public abstract DeleteOperation getDeleteOperation();

	public abstract boolean isAdded();

	public abstract boolean isDeleted();

	public Collection<SetAttributeOperation> getSetAttributeOperation();

	<T> T getAttribute(IAttributeType<T> key);

	<T> T getAttribute(IAttributeType<T> key, boolean returnDefault);

	/**
	 * Gets an attribute value by its type (definition).
	 * 
	 * @param att
	 *            definition of the attribute we want to search
	 * @param defaultValue
	 *            returned value if the value of the attribute definition we
	 *            want to search is null
	 * 
	 * @return the value of the attribute definition or the defaultValue, if
	 *         null
	 */
	public abstract <T> T getAttributeWithDefaultValue(IAttributeType<T> att, T defaultValue);

	SetAttributeOperation getSetAttributeOperation(IAttributeType<?> key);

}