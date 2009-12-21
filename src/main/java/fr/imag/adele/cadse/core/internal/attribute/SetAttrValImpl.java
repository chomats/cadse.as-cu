package fr.imag.adele.cadse.core.internal.attribute;

import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.attribute.SetAttrVal;

/**
 * Default implementation of an attribute assignment description. It is an
 * immutable object.
 * 
 * @author Thomas
 * 
 */
public class SetAttrValImpl<T> implements SetAttrVal<T> {

	private IAttributeType<T>	_attrType;
	private String				_attrName;
	private T					_attrVal;

	public SetAttrValImpl(IAttributeType<T> attrType, T val) {
		this(attrType.getName(), val);
		_attrType = attrType;
	}

	public SetAttrValImpl(String attrName, T val) {
		_attrName = attrName;
		_attrVal = val;
	}

	public IAttributeType<T> getAttrDef() {
		return _attrType;
	}

	public String getAttrName() {
		return _attrName;
	}

	public T getValue() {
		return _attrVal;
	}

}
