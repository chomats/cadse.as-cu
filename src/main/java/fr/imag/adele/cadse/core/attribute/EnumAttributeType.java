package fr.imag.adele.cadse.core.attribute;

public interface EnumAttributeType<X extends Enum<X>> extends IAttributeType<X> {
	public void setDefaultValue(X value);

	public X convertTo(Object v);

	public X toEnum(Object value);

	public String[] getValues();
}
