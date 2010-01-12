package fr.imag.adele.cadse.core.util;

import java.util.HashMap;
import java.util.Map;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
public abstract class CreatedObjectManager {
	static public JavaCreatedObject DEFAULTObjectMANAGER = new JavaCreatedObject(null);
	
	static private Map<Class<?>, CreatedObject>		PLATFORME_;	
	
	static public CreatedObject getManager(Item desc, Class platform) {
		CreatedObject ret = PLATFORME_.get(platform);
		if (ret == null)
			ret = DEFAULTObjectMANAGER;
		return ret;
	}
	
	static public <T> void defaultregister(ItemType it, Class<T> clazz) {
		DEFAULTObjectMANAGER.register(it, clazz);
	}
	
	static public <T> void registerPlatform(Class<T> clazz, CreatedObject manager) {
		if (PLATFORME_ == null) {
			PLATFORME_	= new HashMap<Class<?>, CreatedObject>();	
			PLATFORME_.put(CreatedObjectManager.class, DEFAULTObjectMANAGER);
		}
		PLATFORME_.put(clazz, manager);
	}

	public static Item register(CreatedObject platform, Item item, Class<?> clazz) {
		if (platform != null)
			platform.register(item, clazz);
		else
			DEFAULTObjectMANAGER.register(item, clazz);
		return item;
	}
}
