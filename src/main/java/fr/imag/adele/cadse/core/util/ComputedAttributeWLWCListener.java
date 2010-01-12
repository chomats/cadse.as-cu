package fr.imag.adele.cadse.core.util;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.delta.ItemDelta;
import fr.imag.adele.cadse.core.delta.SetAttributeOperation;
import fr.imag.adele.cadse.core.transaction.AbstractLogicalWorkspaceTransactionListener;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;

public class ComputedAttributeWLWCListener extends AbstractLogicalWorkspaceTransactionListener {
	ItemType[]			itemTypes;
	IAttributeType<?>[]	attributes;

	public class ComplexAttributeState {
		Item[]	items;
	}

	public ComputedAttributeWLWCListener(ItemType[] itemTypes, IAttributeType<?>[] attributes) {
		super();
		this.itemTypes = itemTypes;
		this.attributes = attributes;

		for (ItemType type : itemTypes) {
			type.addLogicalWorkspaceTransactionListener(this);
		}
	}

	@Override
	public void notifyChangeAttribute(LogicalWorkspaceTransaction wc, ItemDelta item,
			SetAttributeOperation attOperation) throws CadseException {

		// Item goodItem = foundGoodItem(item, attOperation, att, at)
	}

	Item foundGoodItem(ItemDelta item, SetAttributeOperation attOperation, ItemType it, IAttributeType<?> at) {
		return null;
	}

}
