package fr.imag.adele.cadse.core.delta;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.CompactUUID;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.internal.delta.InternalWLWCOperation;

public interface LinkDelta extends Link, ItemOrLinkDelta, InternalWLWCOperation {

	String getLinkTypeName();

	boolean equals(Object obj);

	int hashCode();

	void delete(DeleteOperation options) throws CadseException;

	/**
	 * Delete this link. Note that according to its link type annotations,
	 * cascading of source and destination delete operation are performed.
	 * 
	 * si l'operation est cree, alors if faut enlever l'operation. si
	 * l'operation est deja detruit, elle ne fait rien sinon ajout une operation
	 * de destruction.
	 */
	public void delete() throws CadseException;

	ItemDelta getItemOperationParent();

	ItemDelta getDestination();

	ItemDelta getDestination(boolean resolved);

	CompactUUID getDestinationId();

	/**
	 * @deprecated Use {@link #getDestinationName()} instead
	 */
	String getDestinationShortName();

	String getDestinationName();

	ItemType getDestinationType();

	String getDestinationQualifiedName();

	int getIndex();

	void setIndex(int index, boolean loaded);

	String getInfo();

	ItemDelta getResolvedDestination();

	ItemDelta getSource();

	CompactUUID getSourceId();

	int getVersion();

	boolean isAggregation();

	boolean isAnnotation();

	boolean isComposition();

	boolean isDerived();

	boolean isHidden();

	boolean isOther();

	boolean isPart();

	boolean isReadOnly();

	boolean isRequire();

	boolean isLinkResolved();

	/**
	 * Move this link just before specified link. These two links must have same
	 * source and same link type.
	 * 
	 * @param link
	 *            a link with same source as this link one
	 * @throws CadseException
	 */
	public void moveBefore(Link link) throws CadseException;

	/**
	 * Move this link just after specified link. These two links must have same
	 * source and same link type.
	 * 
	 * @param link
	 *            a link with same source as this link one
	 * @throws CadseException
	 */
	public void moveAfter(Link link) throws CadseException;

	void restore() throws CadseException;

	void setHidden(boolean hidden);

	void setInfo(String info);

	void setInfo(String info, boolean loaded);

	void setAttribute(String key, Object v, Object oldValue, boolean loaded);

	void setReadOnly(boolean readOnly);

	void setVersion(int version);

	void setVersion(int version, boolean loaded);

	String getHandleIdentifier();

	void toString(String begin, StringBuilder sb, String tab);

	String toString();

	ItemDelta getSourceOperation();

	ItemDelta getDestinationOperation() throws CadseException;

	boolean mustDeleteDestination();

	boolean mustDeleteSource();

	IAttributeType<?> getAttributeType(SetAttributeOperation setAttributeOperation);

	void destroy() throws CadseException;

	boolean resolve();

	boolean commitSetAttribute(IAttributeType<?> type, String key, Object value);

	void addCompatibleVersions(int... versions);

	void clearCompatibleVersions();

	int[] getCompatibleVersions();

	boolean isMappingLink();

	LinkDelta getInverseLink();

	boolean isCreatedLink();

	// return the link in the workspace logique
	Link getBaseLink();

	boolean isStatic();

	void changeDestination(Item att);

	

}