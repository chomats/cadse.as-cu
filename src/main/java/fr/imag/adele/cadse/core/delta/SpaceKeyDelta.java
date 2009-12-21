package fr.imag.adele.cadse.core.delta;

import fr.imag.adele.cadse.core.key.ISpaceKey;
import fr.imag.adele.cadse.core.key.SpaceKeyType;

public interface SpaceKeyDelta extends WLWCOperation {
	SpaceKeyType getKeyType();

	ISpaceKey getOldKey();

	ISpaceKey getNewKey();

	SetAttributeOperation[] getAttributeOperations();
}
