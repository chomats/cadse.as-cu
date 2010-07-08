package fr.imag.adele.cadse.core.ui;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.imag.adele.cadse.core.*;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.ui.view.FilterContext;
import fr.imag.adele.cadse.objectadapter.ObjectAdapter;


public class PageParticipator extends ObjectAdapter<PageParticipator> {


	@Override
	public Class<PageParticipator> getClassAdapt() {
		return PageParticipator.class;
	}

	public void filterPage(Item item, FilterContext context, List<IPage> list,
			Set<IAttributeType<?>> ro, 
			HashSet<IAttributeType<?>> hiddenAttributeInComputedPages) {
	}
}
