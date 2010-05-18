package fr.imag.adele.cadse.core;



public interface CFactory {

	TypeDefinition createEClass(int typeInPackage, 
			CPackage cPackage, int idInPackage,
			long itemMsb, long itemLsb, String qname, String name) throws CadseException;

	Item create(int attributeTypeId);
	
	Item create(ItemType attributeTypeId);
}
