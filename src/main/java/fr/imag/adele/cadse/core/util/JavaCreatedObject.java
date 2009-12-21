/**
 * 
 */
package fr.imag.adele.cadse.core.util;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;

final public class JavaCreatedObject implements CreatedObject {
	private Map<ItemType, Class<?>>				ITEMTYPE_TO_RUNNING_IMPL	= new HashMap<ItemType, Class<?>>();	
	private Map<Item, Class<?>>				ITEM_TO_RUNNING_IMPL	= new HashMap<Item, Class<?>>();	
	CreatedObject _superCreate =  null;
	
	public JavaCreatedObject(CreatedObject superCreate) {
		_superCreate = superCreate;
	}
	
	public <T> void register(ItemType it, Class<T> clazz) {
		ITEMTYPE_TO_RUNNING_IMPL.put(it, clazz);
	}
	
	public <T> T create(Item item) {
		Class<?> clazz = ITEM_TO_RUNNING_IMPL.get(item);
		
		if (clazz == null)
			clazz = ITEMTYPE_TO_RUNNING_IMPL.get(item.getType());
		
		if (clazz == null) {
			if (_superCreate != null)
				return _superCreate.create(item);
			return null;
		}
		try {
			return (T) clazz.newInstance();
		} catch (SecurityException e) {
			log("Cannot create instance of " + clazz, e);
		} catch (IllegalArgumentException e) {
			log("Cannot create instance of " + clazz, e);
		} catch (InstantiationException e) {
			log("Cannot create instance of " + clazz, e);
		} catch (IllegalAccessException e) {
			log("Cannot create instance of " + clazz, e);
		}
		return null;
	}
	
	public void log(String msg, Throwable e) {
		Logger.getLogger("uiPlatform").log(Level.SEVERE, msg, e);
	}

	public <T> void register(Item item, Class<T> clazz) {
		ITEM_TO_RUNNING_IMPL.put(item, clazz);
	}
}