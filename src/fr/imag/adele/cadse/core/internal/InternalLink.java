package fr.imag.adele.cadse.core.internal;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * Methods of this interface MUST NOT be used by users.
 * They are only used internally by CADSE runtime.
 * 
 * @author Thomas
 *
 */
public interface InternalLink {
	
	/**
	 * 
	 * 
	 * @throws CadseException
	 */
	public abstract void commitDelete() throws CadseException;

	/**
	 * 
	 * @param type
	 * @param key
	 * @param value
	 * @return
	 */
	public abstract boolean commitSetAttribute(IAttributeType<?> type, String key, Object value);

	/**
	 * Delete this link.
	 * Note that its link type annotations are not take into account, so, 
	 * cascading of source and destination delete operation are not performed.
	 * 
	 * Users SHOULD NOT use this method. It is used by refactoring features.
	 */
	@Deprecated
	public void destroy() throws CadseException;
}
