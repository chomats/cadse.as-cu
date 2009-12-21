package fr.imag.adele.cadse.core;

import fr.imag.adele.emf.cadse.ccore.ExtentedType;

public interface ExtendedType extends TypeDefinition, ExtentedType {

	public abstract ItemType[] getExendsItemType();

	public abstract void setExendsItemType(ItemType[] exendsItemType);

	public abstract void addExendsItemType(ItemType... exendsItemType);

}