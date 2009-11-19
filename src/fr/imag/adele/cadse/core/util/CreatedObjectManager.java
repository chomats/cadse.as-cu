package fr.imag.adele.cadse.core.util;

import fr.imag.adele.cadse.core.Item;

public class CreatedObjectManager<T> {
	
	static public <T> CreatedObjectManager<T> getManager(Item desc, Class<T> clazz) {
		if (desc instanceof CreatedObjectManager) {
			return ((CreatedObjectManager<T>) desc);
		}
		
		if (desc.getType() instanceof CreatedObjectManager )
			return (CreatedObjectManager<T>) desc.getType();
		
		if (desc.getType().getItemManager() instanceof CreatedObjectManager )
			return (CreatedObjectManager<T>) desc.getType().getItemManager();
		
		return null;
	}
	
	public T create(Item descriptor) {
		return null;
	}
}
