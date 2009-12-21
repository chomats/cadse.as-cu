package fr.imag.adele.cadse.core.internal;

import java.util.UUID;

import fr.imag.adele.cadse.core.CFactory;
import fr.imag.adele.cadse.core.CPackage;
import fr.imag.adele.cadse.core.ExtendedType;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.TypeDefinition;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.enumdef.TWCommitKind;
import fr.imag.adele.cadse.core.enumdef.TWDestEvol;
import fr.imag.adele.cadse.core.enumdef.TWEvol;
import fr.imag.adele.cadse.core.enumdef.TWUpdateKind;
import fr.imag.adele.emf.cadse.ccore.BindExt;
import fr.imag.adele.emf.cadse.ccore.CadseCoreFactory;
import fr.imag.adele.emf.cadse.ccore.impl.BindExtImpl;
import fr.imag.adele.emf.cadse.ccore.impl.CadseImpl;

public class CPackageImpl extends CadseImpl  implements CPackage {
	final static protected boolean IS_ABSTRACT = true;
	
	final static protected boolean IS_AGGREGATION = true;
	final static protected boolean IS_ANNOTATION = true;
	final static protected boolean IS_COMPOSITION = true;
	final static protected boolean IS_PART = true;
	final static protected boolean IS_REQUIRE = true;
	final static protected boolean IS_HIDDEN = true;

	final static protected boolean IS_ROOT_ELMENT = true;
	final static protected boolean IS_INSTANCE_IS_HIDDEN = true;
	final static protected boolean IS_INSTANCE_IS_READ_ONLY = true;
	
	final static protected boolean IS_OBJECT_HIDDEN = true;
	final static protected boolean ATTRIBUT_CAN_BE_UNDEFINED = true;
	final static protected boolean ATTRIBUT_MUST_BE_INITIALIZED_AT_CREATION_TIME = true;
	final static protected boolean ATTRIBUT_TRANSIENT = true;
	final static protected boolean STRING_NOT_EMPTY = true;
	final static protected boolean IS_LIST = true;
	final static protected boolean IS_INSTANCE_HAS_CONTENT = true;
	final static protected boolean IS_INSTANCE_IS_ITEM_TYPE = true;
	final static protected boolean IS_CAN_BE_UNDEFINED = true;
	final static protected boolean IS_MUST_BE_INITIALIZED_AT_CREATION_TIME = true;
	final static protected boolean IS_TRANSIENT = true;
	final static protected boolean IS_NATIF = true;
	
	
	CFactory _factory;

	private String	_cclassCst;

	private String	_cdisplayname;

	private String	_cdescription;

	private String	_qname;

	private int	_version;
	
	@Override
	public UUID getId() {
		return new UUID(getUuid_msb(), getUuid_lsb());
	}



	public TypeDefinition createEClass(ItemType type, int idInPackage,
                        long itemMsb, long itemLsb, String qname,
			String name) {
		CFactory f = type.getPackage().getCFactory();
		return f.createEClass(type.getIdInPackage(), this, idInPackage, itemMsb, itemLsb, qname, name);
	}
	
	public TypeDefinition createEClass(CFactory f, int typeInPage, int idInPackage, long itemMsb, long itemLsb, String qname,
			String name)  {
		return f.createEClass(typeInPage, this, idInPackage,itemMsb, itemLsb, qname, name);
	}
	
	public TypeDefinition createEClass(int typeInPage, int idInPackage, long itemMsb, long itemLsb, String qname,
			String name) {
		return getCFactory().createEClass(typeInPage, this, idInPackage, itemMsb, itemLsb, qname, name);
	}
	
	public IAttributeType<?> createEAttribute(TypeDefinition ownerTypeDefintion,
			int idInPackage, long itemMsb, long itemLsb, 
			String name, int attributeTypeId,
			IAttributeType<?> ...attributeTypes) {
		IAttributeType<?> ret = (IAttributeType<?>) getCFactory().create(attributeTypeId);
		ret.setName(name);
		ret.setUuid_msb(itemMsb);
		ret.setUuid_lsb(itemLsb);
		ret.setIdInPackage(idInPackage);
		ownerTypeDefintion.addAttributeType(ret);
                ret.setParent(ownerTypeDefintion, null);
		return ret;
	}
	public IAttributeType<?> createEAttribute(TypeDefinition ownerTypeDefintion,
			int idInPackage, long itemMsb, long itemLsb, 
			String name, int attributeTypeId,
			int attributeTypeId2) {
		IAttributeType<?> ret = (IAttributeType<?>) getCFactory().create(attributeTypeId);
		ret.setName(name);
        ret.setUuid_msb(itemMsb);
		ret.setUuid_lsb(itemLsb);
		ret.setIdInPackage(idInPackage);
		ownerTypeDefintion.addAttributeType(ret);
		return ret;
	}
	
	@Override
	public CFactory getCFactory() {
		return _factory;
	}


    @Override
    public void addTypeDefintion(TypeDefinition ret) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    protected void createEAttribute(ItemType composerCClass, int COMPOSER_at_TYPES, long l, long l0, String string, int LIST, int i) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    protected void initEClass(ItemType ownerType, boolean rootElement,
			boolean instanceHasContent, boolean instanceIsHidden, Object object,
			String string, boolean instanceIsItemType, boolean isAbstract,
			ItemType superType, String displayName, String iconPath,
			String managerClass, String templateQualifiedName, 
			String errorMessage, String validateName,
			String cst) {
		// TODO Auto-generated method stub
		
	}

    protected void setCstClass(String cclassCst) {
		_cclassCst = cclassCst;
	}

	

	protected void setUUID(UUID cuuid) {
		setUuid_msb(cuuid.getMostSignificantBits());
		setUuid_lsb(cuuid.getLeastSignificantBits());
	}

	protected void setVersion(int cversion) {
		_version = cversion;
	}

	


	protected void initEAttribute(IAttributeType<?> attrObj, long uuid_m, long uuid_l, String string, String cst,
			TWEvol twImmutable, TWCommitKind conflict, TWUpdateKind merge, boolean b, Object object, int flag,
			boolean objectHidden, boolean isCanBeUndefined, boolean mustBeInitializedAtCreationTime,
			boolean isTransient, boolean isList) {
		// TODO Auto-generated method stub

	}

	protected void initEAttribute(IAttributeType<?> attrObj, long uuid_m, long uuid_l, String string, String cst,
			TWEvol twImmutable, TWCommitKind conflict, TWUpdateKind merge, boolean b, boolean object, int flag,
			boolean objectHidden, boolean isCanBeUndefined, boolean mustBeInitializedAtCreationTime,
			boolean isTransient, boolean isList) {
		// TODO Auto-generated method stub

	}

	protected void initEReference(
			LinkType attObj, long uuid_m, long uuid_l, 
			String object, String string, 
			int min,
			int max, ItemType destination, int flag, 
			boolean objectHidden, boolean isCanBeUndefined, boolean mustBeInitializedAtCreationTime,
			boolean isTransient,
			
			boolean isComposition,
			boolean isAggregation, boolean isRequire, boolean isAnnotation, boolean isNatif, 
			boolean isHidden, boolean isGroup, Object object2,
			String cst, Object object3, TWEvol twimmutable, TWCommitKind conflict, TWUpdateKind merge, boolean p,
			TWDestEvol immutable, boolean q) {
		// TODO Auto-generated method stub

	}
	
	protected void bindExt(ItemType type, ExtendedType extType) {

        BindExt b = CadseCoreFactory.eINSTANCE.createBindExt();
        b.setRefExt(extType);
        b.setRefItemType(type);
        
        getBinding().add(b);
	}
}
