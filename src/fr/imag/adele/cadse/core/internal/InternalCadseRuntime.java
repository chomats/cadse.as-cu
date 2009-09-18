package fr.imag.adele.cadse.core.internal;

import fr.imag.adele.cadse.core.CadseRuntime;
import fr.imag.adele.cadse.core.ItemType;

public interface InternalCadseRuntime extends InternalItem {

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.CadseRuntime#addItemType(fede.workspace.domain.internal.ItemTypeImpl)
	 */
	abstract void addItemType(ItemType it);

	abstract void setRequiredCadses(CadseRuntime[] extendsCadse);

	abstract void setDescription(String description);

	abstract void setExecuted(boolean executed);

	abstract void setCadseroot(boolean cadseroot);

	abstract void setDisplayName(String displayName);

	public abstract void addError(String msg);

}