package fr.imag.adele.cadse.core;


public interface ExtendedType extends TypeDefinition {

	public abstract ItemType[] getExendsItemType();

	public abstract void setExendsItemType(ItemType[] exendsItemType);

	public abstract void addExendsItemType(ItemType... exendsItemType);

}