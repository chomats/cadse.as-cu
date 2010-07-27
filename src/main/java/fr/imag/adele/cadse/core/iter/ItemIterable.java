package fr.imag.adele.cadse.core.iter;

import java.util.Iterator;

import fr.imag.adele.cadse.core.GenContext;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.var.ContextVariable;
import fr.imag.adele.cadse.objectadapter.ObjectAdapter;

public class ItemIterable extends ObjectAdapter<ItemIterable> implements Iterable<Item>, Iterator<Item> {

	
	public void beginAll(Item currentItem,
			ContextVariable context) {
		
	}

	
	public void endAll(Item currentItem,
			ContextVariable context) {
		
	}

	@Override
	public Iterator<Item> iterator() {
		return this;
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Item next() {
		return null;
	}

	@Override
	public void remove() {
		
	}

	@Override
	public Class<ItemIterable> getClassAdapt() {
		return ItemIterable.class;
	}

}
