package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.Item;

public interface UIListener extends Item, IEventListener {

	abstract IPage getPage();

	abstract void initAndResgister();

	abstract void disposeAndUnregister();

}