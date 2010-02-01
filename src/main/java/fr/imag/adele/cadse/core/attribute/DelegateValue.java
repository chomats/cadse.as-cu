package fr.imag.adele.cadse.core.attribute;

import java.util.UUID;

import fr.imag.adele.cadse.core.Item;

public class DelegateValue {

	UUID _idItem;
	Object _overrideValue = null;
	boolean _isReadOnly = true;
	
	public DelegateValue(Item itemOriginal) {
		_idItem = itemOriginal.getId();
	}

	public UUID getIdItem() {
		return _idItem;
	}

	public void setIdItem(UUID idItem) {
		_idItem = idItem;
	}

	public Object getOverrideValue() {
		return _overrideValue;
	}

	public void setOverrideValue(Object overrideValue) {
		_overrideValue = overrideValue;
	}

	public boolean isReadOnly() {
		return _isReadOnly;
	}

	public void setReadOnly(boolean isReadOnly) {
		_isReadOnly = isReadOnly;
	}
}
