package fr.imag.adele.cadse.core.internal;

import fr.imag.adele.cadse.core.CFactory;
import fr.imag.adele.cadse.core.CPackage;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.TypeDefinition;

public class CFactoryImpl implements CFactory {

	@Override
	public TypeDefinition createEClass(int typeInPackage, CPackage cPackage,
			int idInPackage, long itemMsb, long itemLsb, String qname,
			String name) {
		TypeDefinition ret = (TypeDefinition) create(typeInPackage);
		ret.setName(name);
		ret.setQualifiedName(qname);
		ret.setUUID(itemMsb, itemLsb);
		ret.setIdInPackage(idInPackage);
		cPackage.addTypeDefintion(ret);
		return ret;
	}

	public Item create(int eClassIdInPackage) {
		return null;
	}

	@Override
	public Item create(ItemType attributeTypeId) {
		return create(attributeTypeId.getIdInPackage());
	}
	
	protected Item getDefaultImplementation() {
		// TODO Auto-generated method stub
		return null;
	}
}
