/**
 * 
 */
package fr.imag.adele.cadse.core.util;

import fr.imag.adele.cadse.core.Item;

final public class ItemManagerCreatedObject implements CreatedObject {
	
	@Override
	public <T> T create(Item desc) {
		return findManager(desc).create(desc);
	}

	private CreatedObject findManager(Item desc) {
		if (desc instanceof CreatedObjectManager) {
			return ((CreatedObject) desc);
		}
		
		if (desc.getType() instanceof CreatedObjectManager )
			return (CreatedObject) desc.getType();
		
		if (desc.getType().getItemManager() instanceof CreatedObjectManager )
			return (CreatedObject) desc.getType().getItemManager();
		
		return CreatedObjectManager.DEFAULTObjectMANAGER;
	}
}