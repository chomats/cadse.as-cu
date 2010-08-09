package fr.imag.adele.cadse.core;

import fr.imag.adele.cadse.core.build.Composer;
import fr.imag.adele.cadse.objectadapter.ObjectAdapter;

public abstract class ItemFactoryObjecterAdapter<T> extends ObjectAdapter<ItemFactoryObjecterAdapter> {
	Class<? extends T> _clazz;
	
	public ItemFactoryObjecterAdapter(Class<? extends T> clazz) {
		_clazz = clazz;
	}
	
	@Override
	public Class<ItemFactoryObjecterAdapter> getClassAdapt() {
		return ItemFactoryObjecterAdapter.class;
	}
	
	public abstract Class<T> getSubClassAdapt();
	
	public T createObject(Item instance) {
		T ret = null;
		try {
			ret = _clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return ret;
	}
}
