package fr.imag.adele.cadse.core.iter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import fr.imag.adele.cadse.core.GenContext;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.var.ContextVariable;

public class ItemPartIterable extends ItemIterable {
	
	Item _next = null;
	protected LinkedList<Item> _nexts = new LinkedList<Item>();
	

	@Override
	public Item next() {
		return _next;
	}
	
	@Override
	public boolean hasNext() {
		_next = null;
		while(true) {
			if (_nexts.isEmpty())
				return false;
			_next = _nexts.remove(0);
			if (_next == null)
				continue;
			List<Link> links = _next.getOutgoingLinks();
			for (Link link : links) {
				if (link != null && link.isLinkResolved() && link.getLinkType().isPart()) {
					_nexts.add(link.getDestination());
				}
			}
			return true;
		}
	}
	
	@Override
	public void beginAll(Item currentItem,
			ContextVariable context) {
		_nexts.add(currentItem);
	}
	
	
}
