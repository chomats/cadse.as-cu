package fr.imag.adele.cadse.core.internal.delta;

import fr.imag.adele.cadse.core.CadseException;

public interface InternalWLWCOperation {

	void addInParent() throws CadseException;

	void removeInParent();

	void setLoaded(boolean loaded);
}