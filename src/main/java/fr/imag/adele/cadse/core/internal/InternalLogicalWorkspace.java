package fr.imag.adele.cadse.core.internal;

import fr.imag.adele.cadse.core.CadseException;
import java.util.UUID;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LogicalWorkspace;
import fr.imag.adele.cadse.core.key.Key;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;

public interface InternalLogicalWorkspace extends LogicalWorkspace {

	boolean containsUniqueName(String un);

	boolean containsSpaceKey(Key key);

	 void commit(LogicalWorkspaceTransaction logicalWorkspaceTransactionImpl, boolean b) throws CadseException;

	public ItemType createUnresolvedItemType(UUID cadseid, UUID id, String sn, String un)
			throws CadseException;
}
