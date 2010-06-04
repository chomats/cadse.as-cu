package fr.imag.adele.cadse.core.util;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;

public interface CreatedObject {

	public abstract <T> T create(Item descriptor);
	public <T> void register(Item item, Class<T> clazz);
	public <T> void register(ItemType it, Class<T> clazz);
}