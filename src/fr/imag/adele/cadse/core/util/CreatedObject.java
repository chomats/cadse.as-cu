package fr.imag.adele.cadse.core.util;

import fr.imag.adele.cadse.core.Item;

public interface CreatedObject {

	public abstract <T> T create(Item descriptor);

}