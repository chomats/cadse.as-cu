package fr.imag.adele.cadse.core;

public interface InitAction {

	/**
	 * Make initialization for type of items managed. It is often used to add
	 * listeners on creation, deletion and modification on items managed by this
	 * manager.
	 * 
	 * This method is called only once per ItemType during a CADSE execution.
	 */
	public void init();
}
