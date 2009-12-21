package fr.imag.adele.cadse.core.attribute;

public interface GroupOfAttributes extends IAttributeType<Object> {

	public abstract IAttributeType<?>[] getAttributes();

	public abstract void add(IAttributeType<?> attributes);

	public abstract GroupOfAttributes getOverWriteGroup();

	public abstract void setOverWriteGroup(GroupOfAttributes ow);

	public abstract String getLabel();

	public abstract int getColumn();

}