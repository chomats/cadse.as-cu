package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

public interface UIValidator extends Item, IEventListener, IValidateContributor {

	abstract IPage getPage();

	abstract void initAndResgister();

	abstract void disposeAndUnregister();

	abstract UIValidator[] getOverwriteValidator();

	abstract void incrementError();

	abstract IAttributeType<?>[] getListenAttributeType();

}