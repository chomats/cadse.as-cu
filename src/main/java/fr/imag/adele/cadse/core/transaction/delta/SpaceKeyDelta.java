package fr.imag.adele.cadse.core.transaction.delta;

import fr.imag.adele.cadse.core.key.DefaultKeyDefinitionImpl;
import fr.imag.adele.cadse.core.key.Key;
import fr.imag.adele.cadse.core.key.KeyDefinition;

public interface SpaceKeyDelta extends WLWCOperation {
	KeyDefinition getKeyType();

	Key getOldKey();

	Key getNewKey();

	SetAttributeOperation[] getAttributeOperations();
}
