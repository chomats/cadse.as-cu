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
	Object[]	_facettes	= null;

	@Override
	public <T> T adapt(Class<T> clazz) {
		if (clazz.isInstance(this))
			return (T) this;
		if (_facettes != null)
			for (int i = 0; i < _facettes.length;) {
				if (_facettes[i++] == clazz)
					return (T) _facettes[i];
				i++;
			}

		throw new UnsupportedOperationException("Facette " + clazz + " for " + this);
	}

	public <T> void addFacette(Class<T> clazz, T f) {
		_facettes = ArraysUtil.add(Object.class, _facettes, clazz);
		_facettes = ArraysUtil.add(Object.class, _facettes, f);
	}

}
