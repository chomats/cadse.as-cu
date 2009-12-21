package fr.imag.adele.cadse.core.attribute;

/**
 * Represents an attribute value assignment.
 * 
 * @author Thomas
 * 
 * @param <T>
 *            type of an attribute
 */
public interface SetAttrVal<T> {

	/**
	 * Returns attribute definition. May be null. In this case, use
	 * getAttrName() method.
	 * 
	 * @return attribute definition.
	 */
	public IAttributeType<T> getAttrDef();

	/**
	 * Return attribute value.
	 * 
	 * @return attribute value.
	 */
	public T getValue();
}
