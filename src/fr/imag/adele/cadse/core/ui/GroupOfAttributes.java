package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.attribute.IAttributeType;

public interface GroupOfAttributes {

	public abstract IAttributeType<?>[] getAttributes();

	public abstract void add(IAttributeType<?> attributes);

	public abstract GroupOfAttributes getOverWriteGroup();

	public abstract void setOverWriteGroup(GroupOfAttributes ow);

}