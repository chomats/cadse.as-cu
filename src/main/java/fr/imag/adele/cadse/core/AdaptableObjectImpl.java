/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core;

import fr.imag.adele.cadse.util.ArraysUtil;

/**
 * 
 * @author chomats
 */
public class AdaptableObjectImpl implements AdaptableObject {
	ObjectAdapter<?>[]	_adaptObjects	= null;

	@SuppressWarnings("unchecked")
	@Override
	public <T> T adapt(Class<T> clazz) {
		if (_adaptObjects != null)
			for (int i = 0; i < _adaptObjects.length; i++) {
				if (_adaptObjects[i].getClassAdapt() == clazz)
					return (T) _adaptObjects[i];
			}

		return null;
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public <T> T[] adapts(Class<T> clazz) {
		T[] ret = null;
		if (_adaptObjects != null)
			for (int i = 0; i < _adaptObjects.length; i++) {
				if (_adaptObjects[i].getClassAdapt() == clazz)
					ret = ArraysUtil.add(clazz, ret, (T) _adaptObjects[i]);
			}

		return ret;
	}

	@Override
	public <T> void addAdater(ObjectAdapter<T> adapt) {
		_adaptObjects = ArraysUtil.add(ObjectAdapter.class, _adaptObjects, adapt);
	}

	@Override
	public <T> void removeAdater(ObjectAdapter<T> adapt) {
		_adaptObjects = ArraysUtil.remove(ObjectAdapter.class, _adaptObjects, adapt);
	}

}
