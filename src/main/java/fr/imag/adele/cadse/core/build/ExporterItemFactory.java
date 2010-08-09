package fr.imag.adele.cadse.core.build;

import fr.imag.adele.cadse.core.ItemFactoryObjecterAdapter;

public abstract class ExporterItemFactory  extends ItemFactoryObjecterAdapter<Exporter> {

	public ExporterItemFactory(Class<? extends Exporter> clazz) {
		super(clazz);
	}

	@Override
	public Class<Exporter> getSubClassAdapt() {
		return Exporter.class;
	}


}
