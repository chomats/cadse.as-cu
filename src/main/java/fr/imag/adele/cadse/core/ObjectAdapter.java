package fr.imag.adele.cadse.core;

public abstract class ObjectAdapter<T> {

	
	private T[] _ow;

	public abstract Class<T> getClassAdapt();
	
	final public T[] getOverrideObject(){
		return _ow;
	}
	
	final public void setOverrideObject(T... ow) {
		this._ow = ow;
	}
}
