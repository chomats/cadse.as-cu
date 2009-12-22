package fr.imag.adele.cadse.core.transaction.delta;

import fr.imag.adele.cadse.core.internal.delta.InternalWLWCOperation;

public interface DeleteOperation extends InternalWLWCOperation {

	public abstract void setDeleteContent(boolean deleteContent);

	public abstract boolean isDeleteContent();

	public abstract void setDeleteMapping(boolean deleteMapping);

	public abstract boolean isDeleteMapping();

	public abstract void setDeleteIncomingLink(boolean deleteIncomingLink);

	public abstract boolean isDeleteIncomingLink();

	public abstract void setDeleteAnnotationLink(boolean f);

	public abstract boolean isDeleteAnnotationLink();

	public abstract void setisDeletePartLink(boolean f);

	public abstract boolean isDeletePartLink();

}