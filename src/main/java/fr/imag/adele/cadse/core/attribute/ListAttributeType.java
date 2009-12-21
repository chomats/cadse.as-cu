package fr.imag.adele.cadse.core.attribute;

import java.util.List;

public interface ListAttributeType<X> extends IAttributeType<List<X>>, IComplexAttributeType {

	public IAttributeType<X> getSubAttributeType();
}
