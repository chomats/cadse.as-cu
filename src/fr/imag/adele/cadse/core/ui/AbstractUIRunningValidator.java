package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.Item;


public class AbstractUIRunningValidator implements UIRunningValidator {

	final protected Item _desc;
	private int _error;
	public AbstractUIRunningValidator( Item desc) {
		this._desc = desc;
	}
	public AbstractUIRunningValidator() {
		this._desc = null;
	}
	
	@Override
	public void dispose() {
	}

	@Override
	public void init(UIPlatform uiPlatform) {
	}

	@Override
	public void initAfterUI() {
	}
	
	@Override
	public void notifieSubValueAdded(UIField field, Object added) {
	}

	@Override
	public void notifieSubValueRemoved(UIField field, Object removed) {

	}

	@Override
	public void notifieValueChanged(UIField field, Object value) {

	}

	@Override
	public void notifieValueDeleted(UIField field, Object oldvalue) {

	}

	@Override
	public boolean validSubValueAdded(UIField field, Object addedElement) {
		return false;
	}

	@Override
	public boolean validSubValueRemoved(UIField field, Object removedElement) {
		return false;
	}

	@Override
	public boolean validValue(UIField field, Object value) {
		return false;
	}

	@Override
	public boolean validValueChanged(UIField field, Object value) {
		return false;
	}

	@Override
	public boolean validValueDeleted(UIField field, Object deletedValue) {
		return false;
	}

	@Override
	public Item getDescriptor() {
		return _desc;
	}

	@Override
	public int incrementError() {
		//if (_desc != null)
		//	return _desc.incrementError();
		return ++_error;
	}

}
