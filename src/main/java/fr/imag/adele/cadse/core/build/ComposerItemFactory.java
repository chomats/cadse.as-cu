package fr.imag.adele.cadse.core.build;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemFactoryObjecterAdapter;

public class ComposerItemFactory  extends ItemFactoryObjecterAdapter<Composer> {
	
	public ComposerItemFactory(Class<? extends Composer> clazz) {
		super(clazz);
	}

	@Override
	public Class<Composer> getSubClassAdapt() {
		return Composer.class;
	}

}
