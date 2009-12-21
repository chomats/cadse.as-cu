package fr.imag.adele.cadse.core.key;

import fr.imag.adele.cadse.core.INamedUUID;

public interface FacetteLWKey {

	/**
	 * Gets the item.
	 * 
	 * @param key
	 *            the key
	 * 
	 * @return the item
	 */
	public INamedUUID getItem(Key key);

	public void addKey(INamedUUID item, Key key);

	public void changeKey(INamedUUID item, Key oldKey, Key newKey);

	public Key[] getChildrenKey(Key aThis);
}
