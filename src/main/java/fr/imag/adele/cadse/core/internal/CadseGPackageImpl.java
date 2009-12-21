/** Licensed to the Apache Software Foundation (ASF) under one* or more contributor license agreements.  See the NOTICE file* distributed with this work for additional information* regarding copyright ownership.  The ASF licenses this file* to you under the Apache License, Version 2.0 (the* "License"); you may not use this file except in compliance* with the License.  You may obtain a copy of the License at**   http://www.apache.org/licenses/LICENSE-2.0** Unless required by applicable law or agreed to in writing,* software distributed under the License is distributed on an* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY* KIND, either express or implied.  See the License for the* specific language governing permissions and limitations* under the License.*/
package fr.imag.adele.cadse.core.internal;

import fr.imag.adele.cadse.core.CPackage;
import fr.imag.adele.cadse.core.CadseGPackage;
import fr.imag.adele.cadse.core.ExtendedType;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.attribute.BooleanAttributeType;
import fr.imag.adele.cadse.core.attribute.EnumAttributeType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.attribute.IntegerAttributeType;
import fr.imag.adele.cadse.core.attribute.ListAttributeType;
import fr.imag.adele.cadse.core.attribute.LongAttributeType;
import fr.imag.adele.cadse.core.attribute.StringAttributeType;
import fr.imag.adele.cadse.core.enumdef.TWCommitKind;
import fr.imag.adele.cadse.core.enumdef.TWDestEvol;
import fr.imag.adele.cadse.core.enumdef.TWEvol;
import fr.imag.adele.cadse.core.enumdef.TWUpdateKind;
import fr.imag.adele.cadse.core.ui.EPosLabel;
import java.lang.Integer;
import java.lang.String;
import java.util.UUID;

/**
 * @generated
 */
public class CadseGPackageImpl extends CPackageImpl implements CadseGPackage {
	
		private static boolean	isInited = false;

		public static CadseGPackage init(String name, String qname, int version,
				UUID uuid, String description, String displayName,
				String classCst, String classImplName, Class<?> clazzItf) {
			
			 	if (isInited) 
			 		return (CadseGPackage) CPackage.CRegistry.INSTANCE.getCPackage(uuid);

			    // Obtain or create and register package
			 	CadseGPackageImpl theEcorePackage = 
			 		(CadseGPackageImpl)(CPackage.CRegistry.INSTANCE.get(uuid) instanceof CadseGPackage ? 
			 				CPackage.CRegistry.INSTANCE.get(uuid) : new CadseGPackageImpl());

			    isInited = true;

			    // Create package meta-data objects
			    theEcorePackage.createPackageContents();

			    // Initialize created meta-data
			    theEcorePackage.initializePackageContents();

			  
			    // Update the registry and return the package
			    CPackage.CRegistry.INSTANCE.put(uuid, theEcorePackage);
			    return theEcorePackage;
		}
	
	/**
	 * @generated
	 */
	private ItemType		aJProjectComposerCClass								= null;

	/**
	 * @generated
	 */
	private ExtendedType	actionExtItemTypeCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		aspectJExporterCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		aspectJProjectContentModelCClass					= null;

	/**
	 * @generated
	 */
	private ItemType		aspectJReExporterCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		attributeCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		attributeItemTypeCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		booleanCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		buildModelCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		builderCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		cadseCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		cadseDefinitionCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		composerCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		composerLinkCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		compositeItemTypeCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		computedStringCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		configurationModelCClass							= null;

	/**
	 * @generated
	 */
	private ItemType		contentItemCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		contentItemTypeCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		dBrowserCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		dCheckBoxCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		dCheckedListCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		dCheckedTreeCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		dComboCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		dGroupCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		dListCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		dSectionCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		dSymbolicBitMapUICClass								= null;

	/**
	 * @generated
	 */
	private ItemType		dTextCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		dTreeCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		dataModelCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		dateCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		displayCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		doubleCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		dynamicActionsCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		eclipseComposerCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		eclipseExporterCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		eclipseReExporterCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		enumCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		enumTypeCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		exporterCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		extItemCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		extItemTypeCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		fieldCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		fileContentModelCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		folderContentModelCClass							= null;

	/**
	 * @generated
	 */
	private ItemType		folderExporterCClass								= null;

	/**
	 * @generated
	 */
	private ExtendedType	generateInformationCClass							= null;

	/**
	 * @generated
	 */
	private ExtendedType	groupExtItemCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		groupOfAttributesCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		iC_AbstractForBrowser_ComboCClass					= null;

	/**
	 * @generated
	 */
	private ItemType		iC_AbstractForCheckedCClass							= null;

	/**
	 * @generated
	 */
	private ItemType		iC_AbstractForListCClass							= null;

	/**
	 * @generated
	 */
	private ItemType		iC_AbstractTreeDialogForList_Browser_ComboCClass	= null;

	/**
	 * @generated
	 */
	private ItemType		iC_BooleanTextCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		iC_EnumForBrowser_ComboCClass						= null;

	/**
	 * @generated
	 */
	private ItemType		iC_EnumForListCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		iC_FileResourceForBrowser_Combo_ListCClass			= null;

	/**
	 * @generated
	 */
	private ItemType		iC_FolderResource_ForBrowser_Combo_ListCClass		= null;

	/**
	 * @generated
	 */
	private ItemType		iC_JarResourceForBrowser_Combo_ListCClass			= null;

	/**
	 * @generated
	 */
	private ItemType		iC_JavaClassForBrowser_ComboCClass					= null;

	/**
	 * @generated
	 */
	private ItemType		iC_LinkForBrowser_Combo_ListCClass					= null;

	/**
	 * @generated
	 */
	private ItemType		iC_PartLinkForBrowser_Combo_ListCClass				= null;

	/**
	 * @generated
	 */
	private ItemType		iC_ResourceTreeDialogForBrowser_Combo_ListCClass	= null;

	/**
	 * @generated
	 */
	private ItemType		iC_StaticArrayOfObjectForBrowser_ComboCClass		= null;

	/**
	 * @generated
	 */
	private ItemType		iC_StringListForListCClass							= null;

	/**
	 * @generated
	 */
	private ItemType		iC_WithTitleForDialogCClass							= null;

	/**
	 * @generated
	 */
	private ItemType		integerCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		interactionControllerCClass							= null;

	/**
	 * @generated
	 */
	private ItemType		itemCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		itemTypeCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		javaElementTreeControllerCClass						= null;

	/**
	 * @generated
	 */
	private ItemType		javaExporterCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		javaFileContentModelCClass							= null;

	/**
	 * @generated
	 */
	private ItemType		javaJarFileContentModelCClass						= null;

	/**
	 * @generated
	 */
	private ItemType		javaProjectComposerCClass							= null;

	/**
	 * @generated
	 */
	private ItemType		javaProjectContentModelCClass						= null;

	/**
	 * @generated
	 */
	private ItemType		javaReExporterCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		keyCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		linkTypeCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		linkTypeTypeCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		listCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		longCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		mC_BooleanCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		mC_DateCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		mC_DestLinkCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		mC_EnumCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		mC_IntegerCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		mC_LinkCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		mC_LinkToBooleanCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		mC_ListOfStringCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		mC_NameAttributeCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		mC_StringListToEnumListCClass						= null;

	/**
	 * @generated
	 */
	private ItemType		mC_StringToJavaElementCClass						= null;

	/**
	 * @generated
	 */
	private ItemType		managerCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		mappingModelCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		menuCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		menuAbstractCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		menuActionCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		menuGroupCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		modelControllerCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		pDEProjectContentModelCClass						= null;

	/**
	 * @generated
	 */
	private ItemType		packageContentModelCClass							= null;

	/**
	 * @generated
	 */
	private ItemType		packageListControllerCClass							= null;

	/**
	 * @generated
	 */
	private ItemType		pageCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		projectContentModelCClass							= null;

	/**
	 * @generated
	 */
	private ItemType		resourceContentModelCClass							= null;

	/**
	 * @generated
	 */
	private ItemType		runtimeItemCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		sourceFolderContentModelCClass						= null;

	/**
	 * @generated
	 */
	private ItemType		stringCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		stringToOneResourceModelControllerCClass			= null;

	/**
	 * @generated
	 */
	private ItemType		stringToPackageModelControllerCClass				= null;

	/**
	 * @generated
	 */
	private ItemType		stringToResourceListModelControllerCClass			= null;

	/**
	 * @generated
	 */
	private ItemType		structCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		subContentModelCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		symbolicBitMapCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		timeCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		typeDefinitionCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		uIListenerCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		uIValidatorCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		uRLCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		uUIDCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		unresolvedAttributeTypeCClass						= null;

	/**
	 * @generated
	 */
	private ItemType		viewCClass											= null;

	/**
	 * @generated
	 */
	private ItemType		viewDescriptionCClass								= null;

	/**
	 * @generated
	 */
	private ItemType		viewItemTypeCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		viewLinkTypeCClass									= null;

	/**
	 * @generated
	 */
	private ItemType		viewModelCClass										= null;

	/**
	 * @generated
	 */
	private ItemType		wCListenerCClass									= null;

	/**
	 * @generated
	 */
	public ItemType getAJProjectComposer() {
		return aJProjectComposerCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getAJProjectComposer_lt_getComposerLinks() {
		return (LinkType) aJProjectComposerCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getAJProjectComposer_at_getSkipWeaving() {
		return (BooleanAttributeType) aJProjectComposerCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ExtendedType getActionExtItemType() {
		return actionExtItemTypeCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getActionExtItemType_lt_getActionsModel() {
		return (LinkType) actionExtItemTypeCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getAspectJExporter() {
		return aspectJExporterCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getAspectJProjectContentModel() {
		return aspectJProjectContentModelCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getAspectJProjectContentModel_lt_getContentModel() {
		return (LinkType) aspectJProjectContentModelCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getAspectJReExporter() {
		return aspectJReExporterCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getAttribute() {
		return attributeCClass;
	}

	/**
	 * @generated
	 */
	public EnumAttributeType<TWCommitKind> getAttribute_at_getTWCommitKind() {
		return (EnumAttributeType<TWCommitKind>) attributeCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public EnumAttributeType<TWEvol> getAttribute_at_getTWEvol() {
		return (EnumAttributeType<TWEvol>) attributeCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getAttribute_at_getTWRevSpecific() {
		return (BooleanAttributeType) attributeCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public EnumAttributeType<TWUpdateKind> getAttribute_at_getTWUpdateKind() {
		return (EnumAttributeType<TWUpdateKind>) attributeCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getAttribute_at_getCannotBeUndefined() {
		return (BooleanAttributeType) attributeCClass.getCStructuralFeatures(4);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getAttribute_at_getDefaultValue() {
		return (StringAttributeType) attributeCClass.getCStructuralFeatures(5);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getAttribute_at_getDevGenerated() {
		return (BooleanAttributeType) attributeCClass.getCStructuralFeatures(6);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getAttribute_at_getFinal() {
		return (BooleanAttributeType) attributeCClass.getCStructuralFeatures(7);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getAttribute_at_getHiddenInComputedPages() {
		return (BooleanAttributeType) attributeCClass.getCStructuralFeatures(8);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getAttribute_at_getIdRuntime() {
		return (StringAttributeType) attributeCClass.getCStructuralFeatures(9);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getAttribute_at_getIsList() {
		return (BooleanAttributeType) attributeCClass.getCStructuralFeatures(10);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getAttribute_at_getMustBeInitialized() {
		return (BooleanAttributeType) attributeCClass.getCStructuralFeatures(11);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getAttribute_at_getNatif() {
		return (BooleanAttributeType) attributeCClass.getCStructuralFeatures(12);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getAttribute_at_getRequire() {
		return (BooleanAttributeType) attributeCClass.getCStructuralFeatures(13);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getAttribute_at_getTransient() {
		return (BooleanAttributeType) attributeCClass.getCStructuralFeatures(14);
	}

	/**
	 * @generated
	 */
	public LinkType getAttribute_lt_getWcListens() {
		return (LinkType) attributeCClass.getCStructuralFeatures(15);
	}

	/**
	 * @generated
	 */
	public ItemType getAttributeItemType() {
		return attributeItemTypeCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getAttributeItemType_at_getDefaultValue() {
		return (StringAttributeType) attributeItemTypeCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getAttributeItemType_at_getRuntimeQualifiedClass() {
		return (StringAttributeType) attributeItemTypeCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getBoolean() {
		return booleanCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getBuildModel() {
		return buildModelCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getBuildModel_lt_getCompositeTypes() {
		return (LinkType) buildModelCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getBuilder() {
		return builderCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getBuilder_lt_getRequires() {
		return (LinkType) builderCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getCadseType() {
		return cadseCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getCadse_at_getDefaultContentRepoURL() {
		return (StringAttributeType) cadseCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getCadse_at_getDescription() {
		return (StringAttributeType) cadseCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getCadse_at_getExecuted() {
		return (BooleanAttributeType) cadseCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public LinkType getCadse_lt_getExtends() {
		return (LinkType) cadseCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getCadse_at_getIdDefinition() {
		return (StringAttributeType) cadseCClass.getCStructuralFeatures(4);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getCadse_at_getItemRepoLogin() {
		return (StringAttributeType) cadseCClass.getCStructuralFeatures(5);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getCadse_at_getItemRepoPasswd() {
		return (StringAttributeType) cadseCClass.getCStructuralFeatures(6);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getCadse_at_getItemRepoURL() {
		return (StringAttributeType) cadseCClass.getCStructuralFeatures(7);
	}

	/**
	 * @generated
	 */
	public LinkType getCadse_lt_getItemTypes() {
		return (LinkType) cadseCClass.getCStructuralFeatures(8);
	}

	/**
	 * @generated
	 */
	public ItemType getCadseDefinition() {
		return cadseDefinitionCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getCadseDefinition_lt_getBuild() {
		return (LinkType) cadseDefinitionCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getCadseDefinition_at_getCadseName() {
		return (StringAttributeType) cadseDefinitionCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getCadseDefinition_at_getCommentary() {
		return (StringAttributeType) cadseDefinitionCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public LinkType getCadseDefinition_lt_getConfiguration() {
		return (LinkType) cadseDefinitionCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public LinkType getCadseDefinition_lt_getDataModel() {
		return (LinkType) cadseDefinitionCClass.getCStructuralFeatures(4);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getCadseDefinition_at_getIdRuntime() {
		return (StringAttributeType) cadseDefinitionCClass.getCStructuralFeatures(5);
	}

	/**
	 * @generated
	 */
	public ListAttributeType<String> getCadseDefinition_at_getImports() {
		return (ListAttributeType<String>) cadseDefinitionCClass.getCStructuralFeatures(6);
	}

	/**
	 * @generated
	 */
	public LinkType getCadseDefinition_lt_getMapping() {
		return (LinkType) cadseDefinitionCClass.getCStructuralFeatures(7);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getCadseDefinition_at_getPackagename() {
		return (StringAttributeType) cadseDefinitionCClass.getCStructuralFeatures(8);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getCadseDefinition_at_getVendorName() {
		return (StringAttributeType) cadseDefinitionCClass.getCStructuralFeatures(9);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getCadseDefinition_at_getVersionCadse() {
		return (StringAttributeType) cadseDefinitionCClass.getCStructuralFeatures(10);
	}

	/**
	 * @generated
	 */
	public LinkType getCadseDefinition_lt_getViewModel() {
		return (LinkType) cadseDefinitionCClass.getCStructuralFeatures(11);
	}

	/**
	 * @generated
	 */
	public ItemType getComposer() {
		return composerCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getComposer_lt_getComposerLinks() {
		return (LinkType) composerCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ListAttributeType<String> getComposer_at_getTypes() {
		return (ListAttributeType<String>) composerCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getComposerLink() {
		return composerLinkCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getComposerLink_lt_getExporters() {
		return (LinkType) composerLinkCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public LinkType getComposerLink_lt_getLink() {
		return (LinkType) composerLinkCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getCompositeItemType() {
		return compositeItemTypeCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getCompositeItemType_lt_getBuilders() {
		return (LinkType) compositeItemTypeCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public LinkType getCompositeItemType_lt_getComposers() {
		return (LinkType) compositeItemTypeCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public LinkType getCompositeItemType_lt_getItemType() {
		return (LinkType) compositeItemTypeCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public ItemType getComputedString() {
		return computedStringCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getComputedString_at_getExpression() {
		return (StringAttributeType) computedStringCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getConfigurationModel() {
		return configurationModelCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getConfigurationModel_lt_getBuild() {
		return (LinkType) configurationModelCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getContentItem() {
		return contentItemCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getContentItem_lt_getChildren() {
		return (LinkType) contentItemCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public LinkType getContentItem_lt_getOwnerItem() {
		return (LinkType) contentItemCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getContentItemType() {
		return contentItemTypeCClass;
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getContentItemType_at_getExtendsClass() {
		return (BooleanAttributeType) contentItemTypeCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getDBrowser() {
		return dBrowserCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getDCheckBox() {
		return dCheckBoxCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getDCheckedList() {
		return dCheckedListCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getDCheckedTree() {
		return dCheckedTreeCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getDCombo() {
		return dComboCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getDGroup() {
		return dGroupCClass;
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getDGroup_at_getColumn() {
		return (IntegerAttributeType) dGroupCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getDGroup_at_getMakeColumnsEqualWidth() {
		return (BooleanAttributeType) dGroupCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getDList() {
		return dListCClass;
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getDList_at_getEditableButton() {
		return (BooleanAttributeType) dListCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getDList_at_getOrderButton() {
		return (BooleanAttributeType) dListCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getDList_at_getShowFilter() {
		return (BooleanAttributeType) dListCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getDList_at_getUpdateButton() {
		return (BooleanAttributeType) dListCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public ItemType getDSection() {
		return dSectionCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getDSymbolicBitMapUI() {
		return dSymbolicBitMapUICClass;
	}

	/**
	 * @generated
	 */
	public ListAttributeType<String> getDSymbolicBitMapUI_at_getLabels() {
		return (ListAttributeType<String>) dSymbolicBitMapUICClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getDSymbolicBitMapUI_at_getNumberColumn() {
		return (IntegerAttributeType) dSymbolicBitMapUICClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getDText() {
		return dTextCClass;
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getDText_at_getMultiLine() {
		return (BooleanAttributeType) dTextCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getDText_at_getNoBorder() {
		return (BooleanAttributeType) dTextCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getDText_at_getToolTip() {
		return (StringAttributeType) dTextCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getDText_at_getVerticalSpan() {
		return (IntegerAttributeType) dTextCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getDText_at_getWrapLine() {
		return (BooleanAttributeType) dTextCClass.getCStructuralFeatures(4);
	}

	/**
	 * @generated
	 */
	public ItemType getDTree() {
		return dTreeCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getDataModel() {
		return dataModelCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getDataModel_lt_getCategories() {
		return (LinkType) dataModelCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public LinkType getDataModel_lt_getEnums() {
		return (LinkType) dataModelCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public LinkType getDataModel_lt_getTypes() {
		return (LinkType) dataModelCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public ItemType getDate() {
		return dateCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getDisplay() {
		return displayCClass;
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getDisplay_at_getExtendsIC() {
		return (BooleanAttributeType) displayCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getDisplay_at_getExtendsMC() {
		return (BooleanAttributeType) displayCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getDisplay_at_getExtendsUI() {
		return (BooleanAttributeType) displayCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public ItemType getDouble() {
		return doubleCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getDynamicActions() {
		return dynamicActionsCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getEclipseComposer() {
		return eclipseComposerCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getEclipseComposer_lt_getComposerLinks() {
		return (LinkType) eclipseComposerCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getEclipseExporter() {
		return eclipseExporterCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getEclipseReExporter() {
		return eclipseReExporterCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getEnum() {
		return enumCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getEnum_at_getEnumClazz() {
		return (StringAttributeType) enumCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public LinkType getEnum_lt_getEnumType() {
		return (LinkType) enumCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ListAttributeType<String> getEnum_at_getValues() {
		return (ListAttributeType<String>) enumCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public ItemType getEnumType() {
		return enumTypeCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getEnumType_at_getJavaClass() {
		return (StringAttributeType) enumTypeCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getEnumType_at_getMustBeGenerated() {
		return (BooleanAttributeType) enumTypeCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ListAttributeType<String> getEnumType_at_getValues() {
		return (ListAttributeType<String>) enumTypeCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public ItemType getExporter() {
		return exporterCClass;
	}

	/**
	 * @generated
	 */
	public ListAttributeType<String> getExporter_at_getTypes() {
		return (ListAttributeType<String>) exporterCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getExtItem() {
		return extItemCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getExtItemType() {
		return extItemTypeCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getExtItemType_lt_getRefType() {
		return (LinkType) extItemTypeCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getField() {
		return fieldCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getField_lt_getAttribute() {
		return (LinkType) fieldCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getField_at_getEditable() {
		return (BooleanAttributeType) fieldCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public LinkType getField_lt_getIc() {
		return (LinkType) fieldCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getField_at_getLabel() {
		return (StringAttributeType) fieldCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public LinkType getField_lt_getMc() {
		return (LinkType) fieldCClass.getCStructuralFeatures(4);
	}

	/**
	 * @generated
	 */
	public LinkType getField_lt_getOverwritefield() {
		return (LinkType) fieldCClass.getCStructuralFeatures(5);
	}

	/**
	 * @generated
	 */
	public EnumAttributeType<EPosLabel> getField_at_getPosition() {
		return (EnumAttributeType<EPosLabel>) fieldCClass.getCStructuralFeatures(6);
	}

	/**
	 * @generated
	 */
	public ItemType getFileContentModel() {
		return fileContentModelCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getFileContentModel_at_getFileName() {
		return (StringAttributeType) fileContentModelCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getFileContentModel_at_getFilePath() {
		return (StringAttributeType) fileContentModelCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getFolderContentModel() {
		return folderContentModelCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getFolderContentModel_lt_getContentModel() {
		return (LinkType) folderContentModelCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getFolderContentModel_at_getFolderPath() {
		return (StringAttributeType) folderContentModelCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getFolderExporter() {
		return folderExporterCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getFolderExporter_at_getPath() {
		return (StringAttributeType) folderExporterCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ExtendedType getGenerateInformation() {
		return generateInformationCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getGenerateInformation_at_getCSTName() {
		return (StringAttributeType) generateInformationCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ExtendedType getGroupExtItem() {
		return groupExtItemCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getGroupExtItem_lt_getMemberOf() {
		return (LinkType) groupExtItemCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public LinkType getGroupExtItem_lt_getMembers() {
		return (LinkType) groupExtItemCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getGroupOfAttributes() {
		return groupOfAttributesCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getGroupOfAttributes_lt_getAttributes() {
		return (LinkType) groupOfAttributesCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getGroupOfAttributes_at_getColumn() {
		return (IntegerAttributeType) groupOfAttributesCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public LinkType getGroupOfAttributes_lt_getSuperGroup() {
		return (LinkType) groupOfAttributesCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public ItemType getIC_AbstractForBrowser_Combo() {
		return iC_AbstractForBrowser_ComboCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getIC_AbstractForChecked() {
		return iC_AbstractForCheckedCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getIC_AbstractForList() {
		return iC_AbstractForListCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getIC_AbstractTreeDialogForList_Browser_Combo() {
		return iC_AbstractTreeDialogForList_Browser_ComboCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getIC_BooleanText() {
		return iC_BooleanTextCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getIC_EnumForBrowser_Combo() {
		return iC_EnumForBrowser_ComboCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getIC_EnumForList() {
		return iC_EnumForListCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getIC_FileResourceForBrowser_Combo_List() {
		return iC_FileResourceForBrowser_Combo_ListCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getIC_FileResourceForBrowser_Combo_List_at_getPatternSelectFile() {
		return (StringAttributeType) iC_FileResourceForBrowser_Combo_ListCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getIC_FileResourceForBrowser_Combo_List_at_getSelectFolder() {
		return (StringAttributeType) iC_FileResourceForBrowser_Combo_ListCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getIC_FolderResource_ForBrowser_Combo_List() {
		return iC_FolderResource_ForBrowser_Combo_ListCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getIC_JarResourceForBrowser_Combo_List() {
		return iC_JarResourceForBrowser_Combo_ListCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getIC_JavaClassForBrowser_Combo() {
		return iC_JavaClassForBrowser_ComboCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getIC_JavaClassForBrowser_Combo_at_getFilter() {
		return (StringAttributeType) iC_JavaClassForBrowser_ComboCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getIC_JavaClassForBrowser_Combo_at_getStyle() {
		return (StringAttributeType) iC_JavaClassForBrowser_ComboCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getIC_LinkForBrowser_Combo_List() {
		return iC_LinkForBrowser_Combo_ListCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getIC_PartLinkForBrowser_Combo_List() {
		return iC_PartLinkForBrowser_Combo_ListCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getIC_ResourceTreeDialogForBrowser_Combo_List() {
		return iC_ResourceTreeDialogForBrowser_Combo_ListCClass;
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getIC_ResourceTreeDialogForBrowser_Combo_List_at_getSelectTypeRoot() {
		return (IntegerAttributeType) iC_ResourceTreeDialogForBrowser_Combo_ListCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getIC_StaticArrayOfObjectForBrowser_Combo() {
		return iC_StaticArrayOfObjectForBrowser_ComboCClass;
	}

	/**
	 * @generated
	 */
	public ListAttributeType<String> getIC_StaticArrayOfObjectForBrowser_Combo_at_getValues() {
		return (ListAttributeType<String>) iC_StaticArrayOfObjectForBrowser_ComboCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getIC_StringListForList() {
		return iC_StringListForListCClass;
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getIC_StringListForList_at_getAllowDuplicate() {
		return (BooleanAttributeType) iC_StringListForListCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getIC_WithTitleForDialog() {
		return iC_WithTitleForDialogCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getIC_WithTitleForDialog_at_getSelectMessage() {
		return (StringAttributeType) iC_WithTitleForDialogCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getIC_WithTitleForDialog_at_getSelectTitle() {
		return (StringAttributeType) iC_WithTitleForDialogCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getInteger() {
		return integerCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getInteractionController() {
		return interactionControllerCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getItem() {
		return itemCClass;
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getItem_at_getTWVersion() {
		return (IntegerAttributeType) itemCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getItem_at_getCommittedBy() {
		return (StringAttributeType) itemCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public LongAttributeType getItem_at_getCommittedDate() {
		return (LongAttributeType) itemCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public LinkType getItem_lt_getContents() {
		return (LinkType) itemCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getItem_at_getDisplayName() {
		return (StringAttributeType) itemCClass.getCStructuralFeatures(4);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getItem_at_getId() {
		return (StringAttributeType) itemCClass.getCStructuralFeatures(5);
	}

	/**
	 * @generated
	 */
	public LinkType getItem_lt_getInstanceOf() {
		return (LinkType) itemCClass.getCStructuralFeatures(6);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getItem_at_getIsvalid() {
		return (BooleanAttributeType) itemCClass.getCStructuralFeatures(7);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getItem_at_getItemHidden() {
		return (BooleanAttributeType) itemCClass.getCStructuralFeatures(8);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getItem_at_getItemReadonly() {
		return (BooleanAttributeType) itemCClass.getCStructuralFeatures(9);
	}

	/**
	 * @generated
	 */
	public LinkType getItem_lt_getModifiedAttributes() {
		return (LinkType) itemCClass.getCStructuralFeatures(10);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getItem_at_getName() {
		return (StringAttributeType) itemCClass.getCStructuralFeatures(11);
	}

	/**
	 * @generated
	 */
	public LinkType getItem_lt_getParent() {
		return (LinkType) itemCClass.getCStructuralFeatures(12);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getItem_at_getQualifiedName() {
		return (StringAttributeType) itemCClass.getCStructuralFeatures(13);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getItem_at_getRequireNewRev() {
		return (BooleanAttributeType) itemCClass.getCStructuralFeatures(14);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getItem_at_getRevModified() {
		return (BooleanAttributeType) itemCClass.getCStructuralFeatures(15);
	}

	/**
	 * @generated
	 */
	public ItemType getItemType() {
		return itemTypeCClass;
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getItemType_at_getCustomManager() {
		return (BooleanAttributeType) itemTypeCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getItemType_at_getDisplayNameTemplate() {
		return (StringAttributeType) itemTypeCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getItemType_at_getHasContent() {
		return (BooleanAttributeType) itemTypeCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getItemType_at_getHasShortName() {
		return (BooleanAttributeType) itemTypeCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getItemType_at_getHasUniqueName() {
		return (BooleanAttributeType) itemTypeCClass.getCStructuralFeatures(4);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getItemType_at_getIcon() {
		return (StringAttributeType) itemTypeCClass.getCStructuralFeatures(5);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getItemType_at_getIsInstanceAbstract() {
		return (BooleanAttributeType) itemTypeCClass.getCStructuralFeatures(6);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getItemType_at_getIsInstanceHidden() {
		return (BooleanAttributeType) itemTypeCClass.getCStructuralFeatures(7);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getItemType_at_getIsMetaItemType() {
		return (BooleanAttributeType) itemTypeCClass.getCStructuralFeatures(8);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getItemType_at_getIsRootElement() {
		return (BooleanAttributeType) itemTypeCClass.getCStructuralFeatures(9);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getItemType_at_getItemFactory() {
		return (StringAttributeType) itemTypeCClass.getCStructuralFeatures(10);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getItemType_at_getItemManager() {
		return (StringAttributeType) itemTypeCClass.getCStructuralFeatures(11);
	}

	/**
	 * @generated
	 */
	public LinkType getItemType_lt_getLinkType() {
		return (LinkType) itemTypeCClass.getCStructuralFeatures(12);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getItemType_at_getManagerClass() {
		return (StringAttributeType) itemTypeCClass.getCStructuralFeatures(13);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getItemType_at_getMessageErrorId() {
		return (StringAttributeType) itemTypeCClass.getCStructuralFeatures(14);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getItemType_at_getOverwriteDefaultPages() {
		return (BooleanAttributeType) itemTypeCClass.getCStructuralFeatures(15);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getItemType_at_getPackageName() {
		return (StringAttributeType) itemTypeCClass.getCStructuralFeatures(16);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getItemType_at_getQualifiedNameTemplate() {
		return (StringAttributeType) itemTypeCClass.getCStructuralFeatures(17);
	}

	/**
	 * @generated
	 */
	public LinkType getItemType_lt_getSubTypes() {
		return (LinkType) itemTypeCClass.getCStructuralFeatures(18);
	}

	/**
	 * @generated
	 */
	public LinkType getItemType_lt_getSuperType() {
		return (LinkType) itemTypeCClass.getCStructuralFeatures(19);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getItemType_at_getValidateNameRe() {
		return (StringAttributeType) itemTypeCClass.getCStructuralFeatures(20);
	}

	/**
	 * @generated
	 */
	public LinkType getItemType_lt_getWcListeners() {
		return (LinkType) itemTypeCClass.getCStructuralFeatures(21);
	}

	/**
	 * @generated
	 */
	public ItemType getJavaElementTreeController() {
		return javaElementTreeControllerCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getJavaExporter() {
		return javaExporterCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getJavaFileContentModel() {
		return javaFileContentModelCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getJavaFileContentModel_at_getClassName() {
		return (StringAttributeType) javaFileContentModelCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getJavaFileContentModel_at_getPackageName() {
		return (StringAttributeType) javaFileContentModelCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getJavaJarFileContentModel() {
		return javaJarFileContentModelCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getJavaProjectComposer() {
		return javaProjectComposerCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getJavaProjectComposer_lt_getComposerLinks() {
		return (LinkType) javaProjectComposerCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getJavaProjectContentModel() {
		return javaProjectContentModelCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getJavaProjectContentModel_lt_getContentModel() {
		return (LinkType) javaProjectContentModelCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getJavaProjectContentModel_at_getHasSourceFolder() {
		return (BooleanAttributeType) javaProjectContentModelCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getJavaReExporter() {
		return javaReExporterCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getKey() {
		return keyCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getLinkType() {
		return linkTypeCClass;
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getLinkType_at_getTWCoupled() {
		return (BooleanAttributeType) linkTypeCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public EnumAttributeType<TWDestEvol> getLinkType_at_getTWDestEvol() {
		return (EnumAttributeType<TWDestEvol>) linkTypeCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getLinkType_at_getAggregation() {
		return (BooleanAttributeType) linkTypeCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getLinkType_at_getAnnotation() {
		return (BooleanAttributeType) linkTypeCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getLinkType_at_getComposition() {
		return (BooleanAttributeType) linkTypeCClass.getCStructuralFeatures(4);
	}

	/**
	 * @generated
	 */
	public LinkType getLinkType_lt_getDestination() {
		return (LinkType) linkTypeCClass.getCStructuralFeatures(5);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getLinkType_at_getGroup() {
		return (BooleanAttributeType) linkTypeCClass.getCStructuralFeatures(6);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getLinkType_at_getHidden() {
		return (BooleanAttributeType) linkTypeCClass.getCStructuralFeatures(7);
	}

	/**
	 * @generated
	 */
	public LinkType getLinkType_lt_getInverseLink() {
		return (LinkType) linkTypeCClass.getCStructuralFeatures(8);
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getLinkType_at_getKind() {
		return (IntegerAttributeType) linkTypeCClass.getCStructuralFeatures(9);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getLinkType_at_getLinkManager() {
		return (StringAttributeType) linkTypeCClass.getCStructuralFeatures(10);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getLinkType_at_getMapping() {
		return (BooleanAttributeType) linkTypeCClass.getCStructuralFeatures(11);
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getLinkType_at_getMax() {
		return (IntegerAttributeType) linkTypeCClass.getCStructuralFeatures(12);
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getLinkType_at_getMin() {
		return (IntegerAttributeType) linkTypeCClass.getCStructuralFeatures(13);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getLinkType_at_getPart() {
		return (BooleanAttributeType) linkTypeCClass.getCStructuralFeatures(14);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getLinkType_at_getRequire() {
		return (BooleanAttributeType) linkTypeCClass.getCStructuralFeatures(15);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getLinkType_at_getSelection() {
		return (StringAttributeType) linkTypeCClass.getCStructuralFeatures(16);
	}

	/**
	 * @generated
	 */
	public LinkType getLinkType_lt_getSource() {
		return (LinkType) linkTypeCClass.getCStructuralFeatures(17);
	}

	/**
	 * @generated
	 */
	public ItemType getLinkTypeType() {
		return linkTypeTypeCClass;
	}

	/**
	 * @generated
	 */
	public ListAttributeType<Integer> getLinkTypeType_at_getCompatibleVersions() {
		return (ListAttributeType<Integer>) linkTypeTypeCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getLinkTypeType_at_getHidden() {
		return (BooleanAttributeType) linkTypeTypeCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getLinkTypeType_at_getIndexOf() {
		return (IntegerAttributeType) linkTypeTypeCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getLinkTypeType_at_getVersion() {
		return (IntegerAttributeType) linkTypeTypeCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getLinkTypeType_at_getReadOnly() {
		return (BooleanAttributeType) linkTypeTypeCClass.getCStructuralFeatures(4);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getLinkTypeType_at_getValid() {
		return (BooleanAttributeType) linkTypeTypeCClass.getCStructuralFeatures(5);
	}

	/**
	 * @generated
	 */
	public ItemType getList() {
		return listCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getList_lt_getSubType() {
		return (LinkType) listCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getLong() {
		return longCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getMC_Boolean() {
		return mC_BooleanCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getMC_Date() {
		return mC_DateCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getMC_Date_at_getPattern() {
		return (StringAttributeType) mC_DateCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getMC_DestLink() {
		return mC_DestLinkCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getMC_Enum() {
		return mC_EnumCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getMC_Integer() {
		return mC_IntegerCClass;
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getMC_Integer_at_getDefaultValue() {
		return (IntegerAttributeType) mC_IntegerCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getMC_Integer_at_getErrorMsgMax() {
		return (StringAttributeType) mC_IntegerCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getMC_Integer_at_getErrorMsgMin() {
		return (StringAttributeType) mC_IntegerCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getMC_Integer_at_getMax() {
		return (IntegerAttributeType) mC_IntegerCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getMC_Integer_at_getMin() {
		return (IntegerAttributeType) mC_IntegerCClass.getCStructuralFeatures(4);
	}

	/**
	 * @generated
	 */
	public ItemType getMC_Link() {
		return mC_LinkCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getMC_Link_at_getErrorMessage() {
		return (StringAttributeType) mC_LinkCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getMC_LinkToBoolean() {
		return mC_LinkToBooleanCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getMC_ListOfString() {
		return mC_ListOfStringCClass;
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getMC_ListOfString_at_getMax() {
		return (IntegerAttributeType) mC_ListOfStringCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public IntegerAttributeType getMC_ListOfString_at_getMin() {
		return (IntegerAttributeType) mC_ListOfStringCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getMC_NameAttribute() {
		return mC_NameAttributeCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getMC_StringListToEnumList() {
		return mC_StringListToEnumListCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getMC_StringToJavaElement() {
		return mC_StringToJavaElementCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getManager() {
		return managerCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getManager_lt_getContentModel() {
		return (LinkType) managerCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getManager_at_getDisplayNameTemplate() {
		return (StringAttributeType) managerCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public LinkType getManager_lt_getExporters() {
		return (LinkType) managerCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getManager_at_getHumanName() {
		return (StringAttributeType) managerCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getManager_at_getIcon() {
		return (StringAttributeType) managerCClass.getCStructuralFeatures(4);
	}

	/**
	 * @generated
	 */
	public LinkType getManager_lt_getItemType() {
		return (LinkType) managerCClass.getCStructuralFeatures(5);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getManager_at_getMessageErrorId() {
		return (StringAttributeType) managerCClass.getCStructuralFeatures(6);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getManager_at_getQualifiedNameTemplate() {
		return (StringAttributeType) managerCClass.getCStructuralFeatures(7);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getManager_at_getValidPatternId() {
		return (StringAttributeType) managerCClass.getCStructuralFeatures(8);
	}

	/**
	 * @generated
	 */
	public ItemType getMappingModel() {
		return mappingModelCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getMappingModel_lt_getManagers() {
		return (LinkType) mappingModelCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getMenu() {
		return menuCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getMenu_lt_getChildren() {
		return (LinkType) menuCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getMenuAbstract() {
		return menuAbstractCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getMenuAbstract_at_getIcon() {
		return (StringAttributeType) menuAbstractCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getMenuAbstract_at_getLabel() {
		return (StringAttributeType) menuAbstractCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getMenuAbstract_at_getPath() {
		return (StringAttributeType) menuAbstractCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public ItemType getMenuAction() {
		return menuActionCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getMenuGroup() {
		return menuGroupCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getModelController() {
		return modelControllerCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getPDEProjectContentModel() {
		return pDEProjectContentModelCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getPDEProjectContentModel_lt_getContentModel() {
		return (LinkType) pDEProjectContentModelCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getPackageContentModel() {
		return packageContentModelCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getPackageContentModel_at_getPackageName() {
		return (StringAttributeType) packageContentModelCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getPackageListController() {
		return packageListControllerCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getPage() {
		return pageCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getPage_lt_getAttributes() {
		return (LinkType) pageCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getPage_at_getDescription() {
		return (StringAttributeType) pageCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getPage_at_getIdRuntime() {
		return (StringAttributeType) pageCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getPage_at_getIsRemoved() {
		return (BooleanAttributeType) pageCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getPage_at_getLabel() {
		return (StringAttributeType) pageCClass.getCStructuralFeatures(4);
	}

	/**
	 * @generated
	 */
	public LinkType getPage_lt_getOverwrite() {
		return (LinkType) pageCClass.getCStructuralFeatures(5);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getPage_at_getTitle() {
		return (StringAttributeType) pageCClass.getCStructuralFeatures(6);
	}

	/**
	 * @generated
	 */
	public ItemType getProjectContentModel() {
		return projectContentModelCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getProjectContentModel_lt_getContentModel() {
		return (LinkType) projectContentModelCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getProjectContentModel_at_getProjectName() {
		return (StringAttributeType) projectContentModelCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getResourceContentModel() {
		return resourceContentModelCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getRuntimeItem() {
		return runtimeItemCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getRuntimeItem_at_getClassName() {
		return (StringAttributeType) runtimeItemCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getRuntimeItem_at_getExtendsClass() {
		return (BooleanAttributeType) runtimeItemCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getSourceFolderContentModel() {
		return sourceFolderContentModelCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getSourceFolderContentModel_at_getOutputPath() {
		return (StringAttributeType) sourceFolderContentModelCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getString() {
		return stringCClass;
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getString_at_getNotEmpty() {
		return (BooleanAttributeType) stringCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getStringToOneResourceModelController() {
		return stringToOneResourceModelControllerCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getStringToPackageModelController() {
		return stringToPackageModelControllerCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getStringToResourceListModelController() {
		return stringToResourceListModelControllerCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getStruct() {
		return structCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getStruct_lt_getAttributes() {
		return (LinkType) structCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getSubContentModel() {
		return subContentModelCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getSymbolicBitMap() {
		return symbolicBitMapCClass;
	}

	/**
	 * @generated
	 */
	public ListAttributeType<String> getSymbolicBitMap_at_getValues() {
		return (ListAttributeType<String>) symbolicBitMapCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getTime() {
		return timeCClass;
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getTime_at_getInitWithTheCurrentTime() {
		return (BooleanAttributeType) timeCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getTypeDefinition() {
		return typeDefinitionCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getTypeDefinition_lt_getAttributes() {
		return (LinkType) typeDefinitionCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public LinkType getTypeDefinition_lt_getCadse() {
		return (LinkType) typeDefinitionCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public LinkType getTypeDefinition_lt_getCreationPages() {
		return (LinkType) typeDefinitionCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public LinkType getTypeDefinition_lt_getFields() {
		return (LinkType) typeDefinitionCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public LinkType getTypeDefinition_lt_getGoupsOfAttributes() {
		return (LinkType) typeDefinitionCClass.getCStructuralFeatures(4);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getTypeDefinition_at_getIdRuntime() {
		return (StringAttributeType) typeDefinitionCClass.getCStructuralFeatures(5);
	}

	/**
	 * @generated
	 */
	public LinkType getTypeDefinition_lt_getModificationPages() {
		return (LinkType) typeDefinitionCClass.getCStructuralFeatures(6);
	}

	/**
	 * @generated
	 */
	public LinkType getTypeDefinition_lt_getValidators() {
		return (LinkType) typeDefinitionCClass.getCStructuralFeatures(7);
	}

	/**
	 * @generated
	 */
	public ItemType getUIListener() {
		return uIListenerCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getUIListener_lt_getFields() {
		return (LinkType) uIListenerCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getUIValidator() {
		return uIValidatorCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getUIValidator_lt_getListenAttributes() {
		return (LinkType) uIValidatorCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public LinkType getUIValidator_lt_getOverwrite() {
		return (LinkType) uIValidatorCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getURL() {
		return uRLCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getUUID() {
		return uUIDCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getUnresolvedAttributeType() {
		return unresolvedAttributeTypeCClass;
	}

	/**
	 * @generated
	 */
	public ItemType getView() {
		return viewCClass;
	}

	/**
	 * @generated
	 */
	public StringAttributeType getView_at_getIcon() {
		return (StringAttributeType) viewCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public LinkType getView_lt_getViewItemTypes() {
		return (LinkType) viewCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public ItemType getViewDescription() {
		return viewDescriptionCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getViewDescription_lt_getRootTypes() {
		return (LinkType) viewDescriptionCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getViewItemType() {
		return viewItemTypeCClass;
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getViewItemType_at_getIsRootElement() {
		return (BooleanAttributeType) viewItemTypeCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public LinkType getViewItemType_lt_getItemType() {
		return (LinkType) viewItemTypeCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getViewItemType_at_getRef() {
		return (BooleanAttributeType) viewItemTypeCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public LinkType getViewItemType_lt_getViewLinkTypes() {
		return (LinkType) viewItemTypeCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public ItemType getViewLinkType() {
		return viewLinkTypeCClass;
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getViewLinkType_at_getAggregation() {
		return (BooleanAttributeType) viewLinkTypeCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getViewLinkType_at_getCanCreateItem() {
		return (BooleanAttributeType) viewLinkTypeCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public BooleanAttributeType getViewLinkType_at_getCanCreateLink() {
		return (BooleanAttributeType) viewLinkTypeCClass.getCStructuralFeatures(2);
	}

	/**
	 * @generated
	 */
	public StringAttributeType getViewLinkType_at_getDisplayCreate() {
		return (StringAttributeType) viewLinkTypeCClass.getCStructuralFeatures(3);
	}

	/**
	 * @generated
	 */
	public LinkType getViewLinkType_lt_getLinkType() {
		return (LinkType) viewLinkTypeCClass.getCStructuralFeatures(4);
	}

	/**
	 * @generated
	 */
	public ItemType getViewModel() {
		return viewModelCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getViewModel_lt_getViews() {
		return (LinkType) viewModelCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public ItemType getWCListener() {
		return wCListenerCClass;
	}

	/**
	 * @generated
	 */
	public LinkType getWCListener_lt_getListenAttributeDefinitions() {
		return (LinkType) wCListenerCClass.getCStructuralFeatures(0);
	}

	/**
	 * @generated
	 */
	public LinkType getWCListener_lt_getListenItemTypes() {
		return (LinkType) wCListenerCClass.getCStructuralFeatures(1);
	}

	/**
	 * @generated
	 */
	public CadseGPackageImpl() {
		super();
	}

	/**
	 * @generated
	 */
	private boolean	isCreated	= false;

	/**
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;
		aJProjectComposerCClass = (ItemType) createEClass(ITEM_TYPE, AJPROJECT_COMPOSER, -3272938655721830761L,
				-6166616129826140345L, "Model.Workspace.Workspace.data-model.AJProjectComposer", "AJProjectComposer");
		actionExtItemTypeCClass = (ExtendedType) createEClass(EXT_ITEM_TYPE, ACTION_EXT_ITEM_TYPE,
				7020403559567869632L, -8145440438181377306L, "ExtItemType extItemType", "ActionExtItemType");
		aspectJExporterCClass = (ItemType) createEClass(ITEM_TYPE, ASPECT_JEXPORTER, 6683774059281073464L,
				-6103661709132888141L, "ItemType AspectJExporter", "AspectJExporter");
		aspectJProjectContentModelCClass = (ItemType) createEClass(ITEM_TYPE, ASPECT_JPROJECT_CONTENT_MODEL,
				-3708706074966406056L, -6620897039005843573L, "ItemType AspectJProjectContentModel",
				"AspectJProjectContentModel");
		aspectJReExporterCClass = (ItemType) createEClass(ITEM_TYPE, ASPECT_JRE_EXPORTER, 4202355174672059986L,
				-7841318489009258146L, "Model.Workspace.Workspace.data-model.AspectJReExporter", "AspectJReExporter");
		attributeCClass = (ItemType) createEClass(ITEM_TYPE, ATTRIBUTE, 3592558516875119300L, -7616697404221476677L,
				"ItemType Attribute", "Attribute");
		attributeItemTypeCClass = (ItemType) createEClass(ITEM_TYPE, ATTRIBUTE_ITEM_TYPE, -39223667059572032L,
				-4819436617620293887L, "Workspace.meta.AttributeItemType", "AttributeItemType");
		booleanCClass = (ItemType) createEClass(ITEM_TYPE, BOOLEAN, -4493123025682805700L, -6534457759033798774L,
				"Model.Workspace.Workspace.data-model.Boolean", "Boolean");
		buildModelCClass = (ItemType) createEClass(ITEM_TYPE, BUILD_MODEL, 5743572823908569016L, -6465171559089904280L,
				"ItemType BuildModel", "BuildModel");
		builderCClass = (ItemType) createEClass(ITEM_TYPE, BUILDER, -3316426278840809636L, -9059570071911160091L,
				"ItemType Workspace::build::Builder", "Builder");
		cadseCClass = (ItemType) createEClass(ITEM_TYPE, CADSE, -5180154116787059312L, -5698325579512892963L,
				"CadseG..Cadse", "Cadse");
		cadseDefinitionCClass = (ItemType) createEClass(ITEM_TYPE, CADSE_DEFINITION, 524136203805806405L,
				-6310709012143652816L, "ItemType CadseDefinition", "CadseDefinition");
		composerCClass = (ItemType) createEClass(ITEM_TYPE, COMPOSER, 5269291391361631751L, -8617809240403191393L,
				"ItemType Composer", "Composer");
		composerLinkCClass = (ItemType) createEClass(ITEM_TYPE, COMPOSER_LINK, 9079372620690574853L,
				-7531035805296049967L, "Model.Workspace.Workspace.data-model.ComposerLink", "ComposerLink");
		compositeItemTypeCClass = (ItemType) createEClass(ITEM_TYPE, COMPOSITE_ITEM_TYPE, 3810146261314260041L,
				-7171594313483725590L, "ItemType CompositeItemType", "CompositeItemType");
		computedStringCClass = (ItemType) createEClass(ATTRIBUTE_ITEM_TYPE, COMPUTED_STRING, 4136719865750373416L,
				-5197966172689946166L, "Workspace.attributes.ComputedString", "ComputedString");
		configurationModelCClass = (ItemType) createEClass(ITEM_TYPE, CONFIGURATION_MODEL, -1363684802334079282L,
				-6002951114892129124L, "ItemType ConfigurationModel", "ConfigurationModel");
		contentItemCClass = (ItemType) createEClass(ITEM_TYPE, CONTENT_ITEM, -3368409659850732856L,
				-5245804870700978507L, "CadseG.content.ContentItem", "ContentItem");
		contentItemTypeCClass = (ItemType) createEClass(ITEM_TYPE, CONTENT_ITEM_TYPE, 8892596593365435791L,
				-5983009203820309926L, "CadseG.content.ContentItemType", "ContentItemType");
		dBrowserCClass = (ItemType) createEClass(ITEM_TYPE, DBROWSER, 4860608097863549650L, -8254245667731023645L,
				"ItemType Workspace::ui::DBrowser", "DBrowser");
		dCheckBoxCClass = (ItemType) createEClass(ITEM_TYPE, DCHECK_BOX, 2910801884804039641L, -8675667614753843419L,
				"ItemType DCheckBox", "DCheckBox");
		dCheckedListCClass = (ItemType) createEClass(ITEM_TYPE, DCHECKED_LIST, -4634643355260862066L,
				-6037885902994222211L, "ItemType DCheckedList", "DCheckedList");
		dCheckedTreeCClass = (ItemType) createEClass(ITEM_TYPE, DCHECKED_TREE, -8627974668586168340L,
				-7205306943474331469L, "CadseG.ui.DCheckedTree", "DCheckedTree");
		dComboCClass = (ItemType) createEClass(ITEM_TYPE, DCOMBO, -8213538970807418865L, -7058585828525433962L,
				"ItemType DCombo", "DCombo");
		dGroupCClass = (ItemType) createEClass(ITEM_TYPE, DGROUP, -3234705619981875047L, -6939392866284801733L,
				"CadseG.ui.DGroup", "DGroup");
		dListCClass = (ItemType) createEClass(ITEM_TYPE, DLIST, 2029494081812516710L, -8574856186310787390L,
				"ItemType DList", "DList");
		dSectionCClass = (ItemType) createEClass(ITEM_TYPE, DSECTION, -5788358212183178243L, -8671002904549583064L,
				"CadseG.ui.DSection", "DSection");
		dSymbolicBitMapUICClass = (ItemType) createEClass(ITEM_TYPE, DSYMBOLIC_BIT_MAP_UI, -8604002962886737065L,
				-5950893944633071423L, "Workspace.ui.DSymbolicBitMapUI", "DSymbolicBitMapUI");
		dTextCClass = (ItemType) createEClass(ITEM_TYPE, DTEXT, 7241008392764670146L, -5299101712756612793L,
				"ItemType Workspace::ui::DText", "DText");
		dTreeCClass = (ItemType) createEClass(ITEM_TYPE, DTREE, 3203651203853667644L, -8494810302662481401L,
				"ItemType Workspace::ui::DTree", "DTree");
		dataModelCClass = (ItemType) createEClass(ITEM_TYPE, DATA_MODEL, 568487321402492950L, -8047821943706114739L,
				"ItemType DataModel", "DataModel");
		dateCClass = (ItemType) createEClass(ATTRIBUTE_ITEM_TYPE, DATE, -1159353971885981296L, -5722637030992718344L,
				"Workspace.attributes.Date", "Date");
		displayCClass = (ItemType) createEClass(ITEM_TYPE, DISPLAY, -2988131707872852080L, -6132767724143373169L,
				"ItemType Display", "Display");
		doubleCClass = (ItemType) createEClass(ATTRIBUTE_ITEM_TYPE, DOUBLE, -6970330876195549376L,
				-8043531356934712956L, "ItemType Double", "Double");
		dynamicActionsCClass = (ItemType) createEClass(ITEM_TYPE, DYNAMIC_ACTIONS, 2898321401792580467L,
				-5071482571271544322L, "ItemType DynamicActions", "DynamicActions");
		eclipseComposerCClass = (ItemType) createEClass(ITEM_TYPE, ECLIPSE_COMPOSER, 1967907823285388382L,
				-5200301843201247850L, "ItemType EclipseComposer", "EclipseComposer");
		eclipseExporterCClass = (ItemType) createEClass(ITEM_TYPE, ECLIPSE_EXPORTER, -7102273944908643788L,
				-6346039699422617057L, "ItemType Workspace::exporter::EclipseExporter", "EclipseExporter");
		eclipseReExporterCClass = (ItemType) createEClass(ITEM_TYPE, ECLIPSE_RE_EXPORTER, -4753652293136529894L,
				-7522900149264263103L, "Model.Workspace.Workspace.data-model.EclipseReExporter", "EclipseReExporter");
		enumCClass = (ItemType) createEClass(ATTRIBUTE_ITEM_TYPE, ENUM, -6338839353348960325L, -9066659860996074695L,
				"ItemType Enum", "Enum");
		enumTypeCClass = (ItemType) createEClass(ITEM_TYPE, ENUM_TYPE, -7337334907700689700L, -8007955588803625220L,
				"ItemType EnumType", "EnumType");
		exporterCClass = (ItemType) createEClass(ITEM_TYPE, EXPORTER, -6906777620690940744L, -6108779841355195240L,
				"ItemType Workspace::exporter::Exporter", "Exporter");
		extItemCClass = (ItemType) createEClass(ITEM_TYPE, EXT_ITEM, -2942022971896541274L, -8867093824462366327L,
				"CadseG.dataModel.ExtItem", "ExtItem");
		extItemTypeCClass = (ItemType) createEClass(ITEM_TYPE, EXT_ITEM_TYPE, 3947670889879978215L,
				-5294066852253207685L, "ItemType ExtItemType", "ExtItemType");
		fieldCClass = (ItemType) createEClass(ITEM_TYPE, FIELD, -6804336950359144687L, -8004709884787310589L,
				"ItemType Field", "Field");
		fileContentModelCClass = (ItemType) createEClass(ITEM_TYPE, FILE_CONTENT_MODEL, -7233171997523818347L,
				-6776061045693011431L, "ItemType FileContentModel", "FileContentModel");
		folderContentModelCClass = (ItemType) createEClass(ITEM_TYPE, FOLDER_CONTENT_MODEL, -1184912933164269526L,
				-5125270947974399875L, "ItemType FolderContentModel", "FolderContentModel");
		folderExporterCClass = (ItemType) createEClass(ITEM_TYPE, FOLDER_EXPORTER, 6143433733653941747L,
				-8982083668553063515L, "ItemType Workspace::exporter::FolderExporter", "FolderExporter");
		generateInformationCClass = (ExtendedType) createEClass(EXT_ITEM_TYPE, GENERATE_INFORMATION,
				2556490882061192967L, -5937569130402047012L, "", "GenerateInformation");
		groupExtItemCClass = (ExtendedType) createEClass(EXT_ITEM_TYPE, GROUP_EXT_ITEM, 4458102609171991298L,
				-5872835121914364397L, "", "GroupExtItem");
		groupOfAttributesCClass = (ItemType) createEClass(ITEM_TYPE, GROUP_OF_ATTRIBUTES, 7693173908560627439L,
				-8748716545036188138L, "CadseG.attributes.GroupOfAttributes", "GroupOfAttributes");
		iC_AbstractForBrowser_ComboCClass = (ItemType) createEClass(ITEM_TYPE, IC_ABSTRACT_FOR_BROWSER_COMBO,
				-7866272167510982210L, -8999624778377124611L, "ItemType IC_AbstractForBrowser_Combo",
				"IC_AbstractForBrowser_Combo");
		iC_AbstractForCheckedCClass = (ItemType) createEClass(ITEM_TYPE, IC_ABSTRACT_FOR_CHECKED, 9287192447635334L,
				-4752039072483619887L, "Workspace.ic.IC_AbstractForChecked", "IC_AbstractForChecked");
		iC_AbstractForListCClass = (ItemType) createEClass(ITEM_TYPE, IC_ABSTRACT_FOR_LIST, 4369544666204554205L,
				-8255651403372173058L, "Model.Workspace.Workspace.data-model.IC_AbstractForList", "IC_AbstractForList");
		iC_AbstractTreeDialogForList_Browser_ComboCClass = (ItemType) createEClass(ITEM_TYPE,
				IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO, 5506239333887853529L, -7835821140306889930L,
				"ItemType IC_AbstractTreeDialogForList_Browser_Combo", "IC_AbstractTreeDialogForList_Browser_Combo");
		iC_BooleanTextCClass = (ItemType) createEClass(ITEM_TYPE, IC_BOOLEAN_TEXT, -4010305584707843742L,
				-6073516073308882732L, "CadseG.ic.IC_BooleanText", "IC_BooleanText");
		iC_EnumForBrowser_ComboCClass = (ItemType) createEClass(ITEM_TYPE, IC_ENUM_FOR_BROWSER_COMBO,
				7592396576727714912L, -5385909513538912432L, "ItemType IC_EnumForBrowser_Combo",
				"IC_EnumForBrowser_Combo");
		iC_EnumForListCClass = (ItemType) createEClass(ITEM_TYPE, IC_ENUM_FOR_LIST, -8820522747301442056L,
				-6730448512259258002L, "ItemType IC_EnumForList", "IC_EnumForList");
		iC_FileResourceForBrowser_Combo_ListCClass = (ItemType) createEClass(ITEM_TYPE,
				IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST, 2764604720432890876L, -7962094661024169260L,
				"ItemType IC_FileResourceForBrowser_Combo_List", "IC_FileResourceForBrowser_Combo_List");
		iC_FolderResource_ForBrowser_Combo_ListCClass = (ItemType) createEClass(ITEM_TYPE,
				IC_FOLDER_RESOURCE_FOR_BROWSER_COMBO_LIST, 8193265887008147902L, -7611029040933739134L,
				"ItemType IC_FolderResource_ForBrowser_Combo_List", "IC_FolderResource_ForBrowser_Combo_List");
		iC_JarResourceForBrowser_Combo_ListCClass = (ItemType) createEClass(ITEM_TYPE,
				IC_JAR_RESOURCE_FOR_BROWSER_COMBO_LIST, -6189257311768916377L, -5863135487937459911L,
				"ItemType IC_JarResourceForBrowser_Combo_List", "IC_JarResourceForBrowser_Combo_List");
		iC_JavaClassForBrowser_ComboCClass = (ItemType) createEClass(ITEM_TYPE, IC_JAVA_CLASS_FOR_BROWSER_COMBO,
				3130408724115636417L, -6137561159599309483L, "ItemType IC_JavaClassForBrowser_Combo",
				"IC_JavaClassForBrowser_Combo");
		iC_LinkForBrowser_Combo_ListCClass = (ItemType) createEClass(ITEM_TYPE, IC_LINK_FOR_BROWSER_COMBO_LIST,
				647614713067685198L, -4912342848556161408L, "ItemType Workspace::ic::IC_LinkForBrowser_Combo_List",
				"IC_LinkForBrowser_Combo_List");
		iC_PartLinkForBrowser_Combo_ListCClass = (ItemType) createEClass(ITEM_TYPE,
				IC_PART_LINK_FOR_BROWSER_COMBO_LIST, -6709236550926316466L, -5845612729449534750L,
				"ItemType IC_PartLinkForBrowser_Combo_List", "IC_PartLinkForBrowser_Combo_List");
		iC_ResourceTreeDialogForBrowser_Combo_ListCClass = (ItemType) createEClass(ITEM_TYPE,
				IC_RESOURCE_TREE_DIALOG_FOR_BROWSER_COMBO_LIST, 5117518016375639851L, -8550647165981975467L,
				"ItemType IC_ResourceTreeDialogForBrowser_Combo_List", "IC_ResourceTreeDialogForBrowser_Combo_List");
		iC_StaticArrayOfObjectForBrowser_ComboCClass = (ItemType) createEClass(ITEM_TYPE,
				IC_STATIC_ARRAY_OF_OBJECT_FOR_BROWSER_COMBO, -2540307967441613101L, -8382034356431177906L,
				"ItemType Workspace::ic::IC_StaticArrayOfObjectForBrowser_Combo",
				"IC_StaticArrayOfObjectForBrowser_Combo");
		iC_StringListForListCClass = (ItemType) createEClass(ITEM_TYPE, IC_STRING_LIST_FOR_LIST, 3243771972917020754L,
				-7497620235736283614L, "ItemType IC_StringListForList", "IC_StringListForList");
		iC_WithTitleForDialogCClass = (ItemType) createEClass(ITEM_TYPE, IC_WITH_TITLE_FOR_DIALOG,
				-2458815058031590741L, -7274897421125929456L, "CadseG.ic.IC_WithTitleForDialog",
				"IC_WithTitleForDialog");
		integerCClass = (ItemType) createEClass(ITEM_TYPE, INTEGER, -7587050091694305981L, -6557852063850737494L,
				"ItemType Workspace::attributes::Integer", "Integer");
		interactionControllerCClass = (ItemType) createEClass(ITEM_TYPE, INTERACTION_CONTROLLER, 1609574491162691470L,
				-6135305313432271977L, "ItemType InteractionController", "InteractionController");
		itemCClass = (ItemType) createEClass(ITEM_TYPE, ITEM, 1481067329060227563L, -6059699345038497928L,
				"Workspace.dataModel.Item", "Item");
		itemTypeCClass = (ItemType) createEClass(ITEM_TYPE, ITEM_TYPE, 4864028770172945040L, -5928200930686985311L,
				"ItemType ItemType", "ItemType");
		javaElementTreeControllerCClass = (ItemType) createEClass(ITEM_TYPE, JAVA_ELEMENT_TREE_CONTROLLER,
				1646749341182740218L, -5036407897035743419L,
				"Model.Workspace.Workspace.data-model.JavaElementTreeController", "JavaElementTreeController");
		javaExporterCClass = (ItemType) createEClass(ITEM_TYPE, JAVA_EXPORTER, -2476550270218317970L,
				-8609114389936257439L, "ItemType JavaExporter", "JavaExporter");
		javaFileContentModelCClass = (ItemType) createEClass(ITEM_TYPE, JAVA_FILE_CONTENT_MODEL, -3333997052043181883L,
				-5720742839199733940L, "ItemType JavaFileContentModel", "JavaFileContentModel");
		javaJarFileContentModelCClass = (ItemType) createEClass(ITEM_TYPE, JAVA_JAR_FILE_CONTENT_MODEL,
				5226898577128178056L, -7012357446063440606L, "ItemType Workspace::content::JavaJarFileContentModel",
				"JavaJarFileContentModel");
		javaProjectComposerCClass = (ItemType) createEClass(ITEM_TYPE, JAVA_PROJECT_COMPOSER, -4170329225541366498L,
				-8227273358641614328L, "ItemType JavaProjectComposer", "JavaProjectComposer");
		javaProjectContentModelCClass = (ItemType) createEClass(ITEM_TYPE, JAVA_PROJECT_CONTENT_MODEL,
				3420262148437265258L, -4838777115917779852L, "ItemType JavaProjectContentModel",
				"JavaProjectContentModel");
		javaReExporterCClass = (ItemType) createEClass(ITEM_TYPE, JAVA_RE_EXPORTER, -3586241938638811834L,
				-7543259867385891835L, "ItemType JavaReExporter", "JavaReExporter");
		keyCClass = (ItemType) createEClass(ATTRIBUTE_ITEM_TYPE, KEY, 806416940432706112L, -7373234453819273118L,
				"Workspace.attributes.Key", "Key");
		linkTypeCClass = (ItemType) createEClass(ITEM_TYPE, LINK_TYPE, -6051813385675846515L, -5017915653031462422L,
				"CadseG.attributes.LinkType", "LinkType");
		linkTypeTypeCClass = (ItemType) createEClass(ITEM_TYPE, LINK_TYPE_TYPE, 832241852270987737L,
				-9113014208353476763L, "CadseG.meta.LinkTypeType", "LinkTypeType");
		listCClass = (ItemType) createEClass(ITEM_TYPE, LIST, 483465285973001695L, -5678112170523461116L,
				"CadseG.attributes.List", "List");
		longCClass = (ItemType) createEClass(ATTRIBUTE_ITEM_TYPE, LONG, -3427307759869278525L, -9122008253170320101L,
				"Workspace.attributes.Long", "Long");
		mC_BooleanCClass = (ItemType) createEClass(ITEM_TYPE, MC_BOOLEAN, 2327173745977413344L, -6208610694948787511L,
				"CadseG.mc.MC_Boolean", "MC_Boolean");
		mC_DateCClass = (ItemType) createEClass(ITEM_TYPE, MC_DATE, 6930760302654999463L, -6219929225484988161L,
				"Workspace.mc.MC_Date", "MC_Date");
		mC_DestLinkCClass = (ItemType) createEClass(ITEM_TYPE, MC_DEST_LINK, -5400358529895939404L,
				-5947143776385408452L, "Workspace.mc.MC_DestLink", "MC_DestLink");
		mC_EnumCClass = (ItemType) createEClass(ITEM_TYPE, MC_ENUM, 5317681216443598127L, -7004142264341601323L,
				"CadseG.mc.MC_Enum", "MC_Enum");
		mC_IntegerCClass = (ItemType) createEClass(ITEM_TYPE, MC_INTEGER, 8395835983902033203L, -8704347637978080933L,
				"CadseG.mc.MC_Integer", "MC_Integer");
		mC_LinkCClass = (ItemType) createEClass(ITEM_TYPE, MC_LINK, -8429964452692933149L, -5206812368221985333L,
				"CadseG.mc.MC_Link", "MC_Link");
		mC_LinkToBooleanCClass = (ItemType) createEClass(ITEM_TYPE, MC_LINK_TO_BOOLEAN, -2592825232741808138L,
				-6132649904697176977L, "ItemType MC_LinkToBoolean", "MC_LinkToBoolean");
		mC_ListOfStringCClass = (ItemType) createEClass(ITEM_TYPE, MC_LIST_OF_STRING, 2132995341976289873L,
				-5000540776189916893L, "CadseG.mc.MC_ListOfString", "MC_ListOfString");
		mC_NameAttributeCClass = (ItemType) createEClass(ITEM_TYPE, MC_NAME_ATTRIBUTE, -3486368728983649427L,
				-7126509041706880224L, "CadseG.mc.MC_NameAttribute", "MC_NameAttribute");
		mC_StringListToEnumListCClass = (ItemType) createEClass(ITEM_TYPE, MC_STRING_LIST_TO_ENUM_LIST,
				7268069676416125748L, -8051473245534349185L, "ItemType MC_StringListToEnumList",
				"MC_StringListToEnumList");
		mC_StringToJavaElementCClass = (ItemType) createEClass(ITEM_TYPE, MC_STRING_TO_JAVA_ELEMENT,
				-2610901675399164168L, -6662583378599964376L,
				"Model.Workspace.Workspace.data-model.MC_StringToJavaElement", "MC_StringToJavaElement");
		managerCClass = (ItemType) createEClass(ITEM_TYPE, MANAGER, -4791748653671166114L, -5938859858663413982L,
				"ItemType Manager", "Manager");
		mappingModelCClass = (ItemType) createEClass(ITEM_TYPE, MAPPING_MODEL, 5466473237229293197L,
				-8895489611031814978L, "Model.Workspace.Workspace.data-model.MappingModel", "MappingModel");
		menuCClass = (ItemType) createEClass(ITEM_TYPE, MENU, -7129950608109318330L, -6673495600749693644L,
				"ItemType Menu", "Menu");
		menuAbstractCClass = (ItemType) createEClass(ITEM_TYPE, MENU_ABSTRACT, -3408587615922008395L,
				-6669661621917434881L, "ItemType MenuAbstract", "MenuAbstract");
		menuActionCClass = (ItemType) createEClass(ITEM_TYPE, MENU_ACTION, 7305473696523307801L, -8700825960329497847L,
				"ItemType Workspace::actions::MenuAction", "MenuAction");
		menuGroupCClass = (ItemType) createEClass(ITEM_TYPE, MENU_GROUP, -5185016392049278462L, -5809299316762041688L,
				"ItemType MenuGroup", "MenuGroup");
		modelControllerCClass = (ItemType) createEClass(ITEM_TYPE, MODEL_CONTROLLER, -4348903279742925608L,
				-5915799449854776720L, "ItemType ModelController", "ModelController");
		pDEProjectContentModelCClass = (ItemType) createEClass(ITEM_TYPE, PDEPROJECT_CONTENT_MODEL,
				4722655899899939563L, -7705481633658074289L, "ItemType PDEProjectContentModel",
				"PDEProjectContentModel");
		packageContentModelCClass = (ItemType) createEClass(ITEM_TYPE, PACKAGE_CONTENT_MODEL, -6028065357668401137L,
				-7810234114106049248L, "ItemType PackageContentModel", "PackageContentModel");
		packageListControllerCClass = (ItemType) createEClass(ITEM_TYPE, PACKAGE_LIST_CONTROLLER, 3481256585849619056L,
				-7484401841974264375L, "ItemType PackageListController", "PackageListController");
		pageCClass = (ItemType) createEClass(ITEM_TYPE, PAGE, -5640750121531521668L, -7208617183309515582L,
				"ItemType Page", "Page");
		projectContentModelCClass = (ItemType) createEClass(ITEM_TYPE, PROJECT_CONTENT_MODEL, 2440356403370347580L,
				-6642060121174967065L, "ItemType ProjectContentModel", "ProjectContentModel");
		resourceContentModelCClass = (ItemType) createEClass(ITEM_TYPE, RESOURCE_CONTENT_MODEL, 5758885802800792078L,
				-7073079967606814516L, "ItemType ResourceContentModel", "ResourceContentModel");
		runtimeItemCClass = (ItemType) createEClass(ITEM_TYPE, RUNTIME_ITEM, -1627711497889626827L,
				-8786035032024066690L, "CadseG.dataModel.RuntimeItem", "RuntimeItem");
		sourceFolderContentModelCClass = (ItemType) createEClass(ITEM_TYPE, SOURCE_FOLDER_CONTENT_MODEL,
				6453355361194954232L, -5232271921142403928L,
				"Model.Workspace.Workspace.data-model.SourceFolderContentModel", "SourceFolderContentModel");
		stringCClass = (ItemType) createEClass(ATTRIBUTE_ITEM_TYPE, STRING, -5399584717918614982L,
				-5165322274984204185L, "ItemType String", "String");
		stringToOneResourceModelControllerCClass = (ItemType) createEClass(ITEM_TYPE,
				STRING_TO_ONE_RESOURCE_MODEL_CONTROLLER, -7244568296749184416L, -8695564780115323674L,
				"ItemType Workspace::mc::StringToOneResourceModelController", "StringToOneResourceModelController");
		stringToPackageModelControllerCClass = (ItemType) createEClass(ITEM_TYPE, STRING_TO_PACKAGE_MODEL_CONTROLLER,
				-8968314858300289322L, -5633178547969312340L, "ItemType StringToPackageModelController",
				"StringToPackageModelController");
		stringToResourceListModelControllerCClass = (ItemType) createEClass(ITEM_TYPE,
				STRING_TO_RESOURCE_LIST_MODEL_CONTROLLER, -1741831402493295597L, -4630845698921681597L,
				"ItemType StringToResourceListModelController", "StringToResourceListModelController");
		structCClass = (ItemType) createEClass(ITEM_TYPE, STRUCT, 4239315553601865007L, -6432807936667206668L,
				"ItemType Workspace::attributes::Struct", "Struct");
		subContentModelCClass = (ItemType) createEClass(ITEM_TYPE, SUB_CONTENT_MODEL, 7058520742842550125L,
				-5823609991318963319L, "ItemType SubContentModel", "SubContentModel");
		symbolicBitMapCClass = (ItemType) createEClass(ITEM_TYPE, SYMBOLIC_BIT_MAP, 3321261138586321132L,
				-4938614284363338661L, "Workspace.attributes.SymbolicBitMap", "SymbolicBitMap");
		timeCClass = (ItemType) createEClass(ITEM_TYPE, TIME, -3090273990612464068L, -7553812015767519660L,
				"Workspace.attributes.Time", "Time");
		typeDefinitionCClass = (ItemType) createEClass(ITEM_TYPE, TYPE_DEFINITION, -5718875934122293329L,
				-4919216356191854392L, "CadseG.dataModel.TypeDefinition", "TypeDefinition");
		uIListenerCClass = (ItemType) createEClass(ITEM_TYPE, UILISTENER, 3974141525214054683L, -7074863809513647649L,
				"Workspace.ui.UIListener", "UIListener");
		uIValidatorCClass = (ItemType) createEClass(ITEM_TYPE, UIVALIDATOR, 4245541747489917363L,
				-7574330702834406891L, "CadseG.dataModel.UIValidator", "UIValidator");
		uRLCClass = (ItemType) createEClass(ATTRIBUTE_ITEM_TYPE, URL, 6408740401534290663L, -6497903996487943119L,
				"Workspace.attributes.URL", "URL");
		uUIDCClass = (ItemType) createEClass(ITEM_TYPE, UUID, -2900111046470185681L, -8400909921349507164L,
				"Workspace.attributes.UUID", "UUID");
		unresolvedAttributeTypeCClass = (ItemType) createEClass(ITEM_TYPE, UNRESOLVED_ATTRIBUTE_TYPE,
				5267897196283839691L, -7627524347907519462L, "CadseG.attributes.UnresolvedAttributeType",
				"UnresolvedAttributeType");
		viewCClass = (ItemType) createEClass(ITEM_TYPE, VIEW, 4368697401120606230L, -5835716709145395793L,
				"ItemType View", "View");
		viewDescriptionCClass = (ItemType) createEClass(ITEM_TYPE, VIEW_DESCRIPTION, 5687934152107377967L,
				-7560770700721787471L, "CadseG.view.ViewDescription", "ViewDescription");
		viewItemTypeCClass = (ItemType) createEClass(ITEM_TYPE, VIEW_ITEM_TYPE, -5606101365677733600L,
				-6678613183900592455L, "ItemType ViewItemType", "ViewItemType");
		viewLinkTypeCClass = (ItemType) createEClass(ITEM_TYPE, VIEW_LINK_TYPE, -8895428296013886884L,
				-7944534885754234047L, "ItemType ViewLinkType", "ViewLinkType");
		viewModelCClass = (ItemType) createEClass(ITEM_TYPE, VIEW_MODEL, -5014535118412820741L, -8736341093056585074L,
				"ItemType Workspace::view::ViewModel", "ViewModel");
		wCListenerCClass = (ItemType) createEClass(ITEM_TYPE, WCLISTENER, 3268817010539905701L, -7095285854512169301L,
				"Workspace.dataModel.WCListener", "WCListener");
		createEAttribute(aJProjectComposerCClass, AJPROJECT_COMPOSER_lt_COMPOSER_LINKS, 8442084740078125224L,
				-7310939922673348027L, "composer-links", LIST, LINK_TYPE);
		createEAttribute(aJProjectComposerCClass, AJPROJECT_COMPOSER_at_SKIP_WEAVING, 7587850506524116916L,
				-8376729183294778470L, "skip-weaving", BOOLEAN);
		createEAttribute(actionExtItemTypeCClass, ACTION_EXT_ITEM_TYPE_lt_ACTIONS_MODEL, -2976470533934723238L,
				-4784452860694751182L, "actions-model", LINK_TYPE);
		createEAttribute(aspectJProjectContentModelCClass, ASPECT_JPROJECT_CONTENT_MODEL_lt_CONTENT_MODEL,
				2815321508876603390L, -7561905016446825892L, "content-model", LIST, LINK_TYPE);
		createEAttribute(attributeCClass, ATTRIBUTE_at_IS_LIST, -2542717760334772178L, -6088412726579282966L,
				"is-list", BOOLEAN);
		createEAttribute(attributeCClass, ATTRIBUTE_at_REQUIRE, 2623863750748291929L, -9198408877767341933L, "require",
				BOOLEAN);
		createEAttribute(attributeCClass, ATTRIBUTE_at_DEFAULT_VALUE, -5030649019245706597L, -4766256875273574486L,
				"default-value", STRING);
		createEAttribute(attributeCClass, ATTRIBUTE_at_CANNOT_BE_UNDEFINED, -3423183319042797845L,
				-8006053779341362993L, "cannot-be-undefined", BOOLEAN);
		createEAttribute(attributeCClass, ATTRIBUTE_at_NATIF, -3471270548458945195L, -5488139896673645219L, "natif",
				BOOLEAN);
		createEAttribute(attributeCClass, ATTRIBUTE_at_TRANSIENT, 6629220883426067318L, -6625384691100680799L,
				"transient", BOOLEAN);
		createEAttribute(attributeCClass, ATTRIBUTE_at_FINAL, -3755208324177769542L, -5466149767341583564L, "final",
				BOOLEAN);
		createEAttribute(attributeCClass, ATTRIBUTE_at_MUST_BE_INITIALIZED, -6382226066240158145L,
				-5271732042789926404L, "must-be-initialized", BOOLEAN);
		createEAttribute(attributeCClass, ATTRIBUTE_at_TWREV_SPECIFIC, -3513034253922909634L, -5360441340782655064L,
				"TWRevSpecific", BOOLEAN);
		createEAttribute(attributeCClass, ATTRIBUTE_at_TWEVOL, -6556116649820929916L, -8717582032097845630L, "TWEvol",
				ENUM);
		createEAttribute(attributeCClass, ATTRIBUTE_at_TWUPDATE_KIND, 820908681011741122L, -7492981238571984928L,
				"TWUpdateKind", ENUM);
		createEAttribute(attributeCClass, ATTRIBUTE_at_TWCOMMIT_KIND, 5486822832854615480L, -7709407795185363997L,
				"TWCommitKind", ENUM);
		createEAttribute(attributeCClass, ATTRIBUTE_lt_WC_LISTENS, -2179537632868940333L, -6729352182800517751L,
				"wcListens", LIST, LINK_TYPE);
		createEAttribute(attributeCClass, ATTRIBUTE_at_DEV_GENERATED, -9220686436712429645L, -8909131287572524821L,
				"dev-generated", BOOLEAN);
		createEAttribute(attributeCClass, ATTRIBUTE_at_ID_RUNTIME, -726968386927376302L, -5653829062192998872L,
				"id-runtime", STRING);
		createEAttribute(attributeCClass, ATTRIBUTE_at_HIDDEN_IN_COMPUTED_PAGES, 1436342611161793245L,
				-8766922011604397064L, "hidden-in-computed-pages", BOOLEAN);
		createEAttribute(attributeItemTypeCClass, ATTRIBUTE_ITEM_TYPE_at_RUNTIME_QUALIFIED_CLASS, 9058459004682716115L,
				-5781601185535237616L, "runtime-qualified-class", STRING);
		createEAttribute(attributeItemTypeCClass, ATTRIBUTE_ITEM_TYPE_at_DEFAULT_VALUE, 8651665830089869974L,
				-6331634790547529052L, "default-value", STRING);
		createEAttribute(buildModelCClass, BUILD_MODEL_lt_COMPOSITE_TYPES, -2065115184406115611L,
				-6322107746629572098L, "composite-types", LIST, LINK_TYPE);
		createEAttribute(builderCClass, BUILDER_lt_REQUIRES, 4353003967296390715L, -5636254994453622825L, "requires",
				LIST, LINK_TYPE);
		createEAttribute(cadseCClass, CADSE_lt_EXTENDS, -5311939042961767251L, -6057641984395631590L, "extends", LIST,
				LINK_TYPE);
		createEAttribute(cadseCClass, CADSE_at_DESCRIPTION, 6859817981831954548L, -5911661469722330247L, "description",
				STRING);
		createEAttribute(cadseCClass, CADSE_at_DEFAULT_CONTENT_REPO_URL, -5308678218422924554L, -7955564280512136044L,
				"defaultContentRepoURL", STRING);
		createEAttribute(cadseCClass, CADSE_at_EXECUTED, -4271676810670683375L, -6704741253959396654L, "executed",
				BOOLEAN);
		createEAttribute(cadseCClass, CADSE_at_ITEM_REPO_LOGIN, -2478669964607733537L, -6187469110397446833L,
				"itemRepoLogin", STRING);
		createEAttribute(cadseCClass, CADSE_at_ITEM_REPO_PASSWD, 6741922683938357846L, -7218804880034703560L,
				"itemRepoPasswd", STRING);
		createEAttribute(cadseCClass, CADSE_at_ITEM_REPO_URL, -7852605455945020935L, -7054370025464556975L,
				"itemRepoURL", STRING);
		createEAttribute(cadseCClass, CADSE_lt_ITEM_TYPES, 6978393775071315180L, -5128306338791400169L, "itemTypes",
				LIST, LINK_TYPE);
		createEAttribute(cadseCClass, CADSE_at_ID_DEFINITION, -5893076169920593260L, -8767106335413169239L,
				"id-definition", STRING);
		createEAttribute(cadseDefinitionCClass, CADSE_DEFINITION_lt_DATA_MODEL, -6968934065506336407L,
				-8068653501252306411L, "data-model", LINK_TYPE);
		createEAttribute(cadseDefinitionCClass, CADSE_DEFINITION_lt_CONFIGURATION, -8798130791473657116L,
				-7410479015189312350L, "configuration", LINK_TYPE);
		createEAttribute(cadseDefinitionCClass, CADSE_DEFINITION_lt_BUILD, -1933048506473101562L,
				-7872259910111122479L, "build", LINK_TYPE);
		createEAttribute(cadseDefinitionCClass, CADSE_DEFINITION_lt_MAPPING, 7385730605805094543L,
				-4731613656315645866L, "mapping", LINK_TYPE);
		createEAttribute(cadseDefinitionCClass, CADSE_DEFINITION_lt_VIEW_MODEL, 6551113672664236912L,
				-5018549296147544050L, "view-model", LINK_TYPE);
		createEAttribute(cadseDefinitionCClass, CADSE_DEFINITION_at_IMPORTS, -1986709061434520905L,
				-4617903214958563102L, "imports", LIST, STRING);
		createEAttribute(cadseDefinitionCClass, CADSE_DEFINITION_at_PACKAGENAME, 1129050764659606892L,
				-4803144242722920392L, "packagename", STRING);
		createEAttribute(cadseDefinitionCClass, CADSE_DEFINITION_at_VENDOR_NAME, 1399355946446245460L,
				-9013655310504927804L, "vendor-name", STRING);
		createEAttribute(cadseDefinitionCClass, CADSE_DEFINITION_at_VERSION_CADSE, 6960548589348408800L,
				-6394650412505195902L, "version-cadse", STRING);
		createEAttribute(cadseDefinitionCClass, CADSE_DEFINITION_at_COMMENTARY, 7740875530988109868L,
				-5927888702666785128L, "commentary", STRING);
		createEAttribute(cadseDefinitionCClass, CADSE_DEFINITION_at_CADSE_NAME, -7236383661086716356L,
				-7746985501087060655L, "cadse-name", STRING);
		createEAttribute(cadseDefinitionCClass, CADSE_DEFINITION_at_ID_RUNTIME, -119233901698658928L,
				-6759169978139899333L, "id-runtime", STRING);
		createEAttribute(composerCClass, COMPOSER_lt_COMPOSER_LINKS, 8483677582154484983L, -7616480509052158555L,
				"composer-links", LIST, LINK_TYPE);
		createEAttribute(composerCClass, COMPOSER_at_TYPES, 6110842582509110325L, -8150412315204794947L, "types", LIST,
				STRING);
		createEAttribute(composerLinkCClass, COMPOSER_LINK_lt_EXPORTERS, 328796854460040324L, -8213922973513033400L,
				"exporters", LIST, LINK_TYPE);
		createEAttribute(composerLinkCClass, COMPOSER_LINK_lt_LINK, 527066175275680430L, -5150312371800943149L, "link",
				LINK_TYPE);
		createEAttribute(compositeItemTypeCClass, COMPOSITE_ITEM_TYPE_lt_COMPOSERS, 5264072729635933957L,
				-6978390795838416711L, "composers", LIST, LINK_TYPE);
		createEAttribute(compositeItemTypeCClass, COMPOSITE_ITEM_TYPE_lt_BUILDERS, -7077985845148104891L,
				-8090037199202042685L, "builders", LIST, LINK_TYPE);
		createEAttribute(compositeItemTypeCClass, COMPOSITE_ITEM_TYPE_lt_ITEM_TYPE, -4640325068125877184L,
				-4694621125818459506L, "item-type", LINK_TYPE);
		createEAttribute(computedStringCClass, COMPUTED_STRING_at_EXPRESSION, 2075809073733586615L,
				-4982819001200601116L, "expression", STRING);
		createEAttribute(configurationModelCClass, CONFIGURATION_MODEL_lt_BUILD, 137170060459918177L,
				-8273815291769659736L, "build", LIST, LINK_TYPE);
		createEAttribute(contentItemCClass, CONTENT_ITEM_lt_OWNER_ITEM, -4128862450062965279L, -8017796158382010686L,
				"owner-item", LINK_TYPE);
		createEAttribute(contentItemCClass, CONTENT_ITEM_lt_CHILDREN, -2805837904547393740L, -8128155903842363698L,
				"children", LIST, LINK_TYPE);
		createEAttribute(contentItemTypeCClass, CONTENT_ITEM_TYPE_at_EXTENDS_CLASS, 2844617944629659701L,
				-6721427560623249186L, "extends-class", BOOLEAN);
		createEAttribute(dGroupCClass, DGROUP_at_COLUMN, 8208141343082627561L, -8902806869028858107L, "column", INTEGER);
		createEAttribute(dGroupCClass, DGROUP_at_MAKE_COLUMNS_EQUAL_WIDTH, -770853220475911755L, -9069078970204003940L,
				"makeColumnsEqualWidth", BOOLEAN);
		createEAttribute(dListCClass, DLIST_at_EDITABLE_BUTTON, -1889145482691523736L, -8427847297576369781L,
				"editable-button", BOOLEAN);
		createEAttribute(dListCClass, DLIST_at_UPDATE_BUTTON, 6775127022721254424L, -7718963863988403149L,
				"update-button", BOOLEAN);
		createEAttribute(dListCClass, DLIST_at_ORDER_BUTTON, 1220437233353313290L, -7774683019636045133L,
				"order-button", BOOLEAN);
		createEAttribute(dListCClass, DLIST_at_SHOW_FILTER, -3861302025716347820L, -6862326207907758128L,
				"show-filter", BOOLEAN);
		createEAttribute(dSymbolicBitMapUICClass, DSYMBOLIC_BIT_MAP_UI_at_NUMBER_COLUMN, 4534338717406283545L,
				-5247477773068267995L, "number-column", INTEGER);
		createEAttribute(dSymbolicBitMapUICClass, DSYMBOLIC_BIT_MAP_UI_at_LABELS, -3532976929492154564L,
				-6235132730010007048L, "labels", LIST, STRING);
		createEAttribute(dTextCClass, DTEXT_at_TOOL_TIP, 2227326465421495103L, -8411385347932334308L, "tool-tip",
				STRING);
		createEAttribute(dTextCClass, DTEXT_at_VERTICAL_SPAN, -5282652402123847801L, -7222283240550819867L,
				"vertical-span", INTEGER);
		createEAttribute(dTextCClass, DTEXT_at_MULTI_LINE, 1008286326512437374L, -6843707123988243330L, "multi-line",
				BOOLEAN);
		createEAttribute(dTextCClass, DTEXT_at_WRAP_LINE, 5884356881569957964L, -4613515033011273851L, "wrap-line",
				BOOLEAN);
		createEAttribute(dTextCClass, DTEXT_at_NO_BORDER, 7200567859429656871L, -8414162936505703230L, "no-border",
				BOOLEAN);
		createEAttribute(dataModelCClass, DATA_MODEL_lt_CATEGORIES, -7945345645362330428L, -6556511239629598321L,
				"categories", LIST, LINK_TYPE);
		createEAttribute(dataModelCClass, DATA_MODEL_lt_TYPES, -8613505164697252459L, -5475512000301540245L, "types",
				LIST, LINK_TYPE);
		createEAttribute(dataModelCClass, DATA_MODEL_lt_ENUMS, 481774276892837701L, -5624946864095029061L, "enums",
				LIST, LINK_TYPE);
		createEAttribute(displayCClass, DISPLAY_at_EXTENDS_IC, -8011175183072211586L, -6144987244156793128L,
				"extendsIC", BOOLEAN);
		createEAttribute(displayCClass, DISPLAY_at_EXTENDS_MC, 4455243460342533434L, -8056706925048991501L,
				"extendsMC", BOOLEAN);
		createEAttribute(displayCClass, DISPLAY_at_EXTENDS_UI, -7349970930805423509L, -7235143270055395060L,
				"extendsUI", BOOLEAN);
		createEAttribute(eclipseComposerCClass, ECLIPSE_COMPOSER_lt_COMPOSER_LINKS, 1460714381372705207L,
				-5118066405861635004L, "composer-links", LIST, LINK_TYPE);
		createEAttribute(enumCClass, ENUM_lt_ENUM_TYPE, 8944357282419066809L, -8793260785729866685L, "enum-type",
				LINK_TYPE);
		createEAttribute(enumCClass, ENUM_at_ENUM_CLAZZ, -231470803140063460L, -5738689726168192725L, "enum-clazz",
				STRING);
		createEAttribute(enumCClass, ENUM_at_VALUES, 4895896025957680706L, -5216719478761370902L, "values", LIST,
				STRING);
		createEAttribute(enumTypeCClass, ENUM_TYPE_at_MUST_BE_GENERATED, 4661056250780340172L, -8185415425128734911L,
				"must-be-generated", BOOLEAN);
		createEAttribute(enumTypeCClass, ENUM_TYPE_at_JAVA_CLASS, -8698456247826561279L, -8023612618634403851L,
				"java-class", STRING);
		createEAttribute(enumTypeCClass, ENUM_TYPE_at_VALUES, -2854433079837963630L, -7511419690549926041L, "values",
				LIST, STRING);
		createEAttribute(exporterCClass, EXPORTER_at_TYPES, 2259673960018038605L, -7581778286575692214L, "types", LIST,
				STRING);
		createEAttribute(extItemTypeCClass, EXT_ITEM_TYPE_lt_REF_TYPE, -2175556445056709947L, -7099569846512351398L,
				"ref-type", LINK_TYPE);
		createEAttribute(fieldCClass, FIELD_lt_ATTRIBUTE, 777820218802259351L, -9007700401303737102L, "attribute",
				LINK_TYPE);
		createEAttribute(fieldCClass, FIELD_at_LABEL, 4378618301619521346L, -5742914646547451705L, "label", STRING);
		createEAttribute(fieldCClass, FIELD_at_POSITION, -7097209760980647644L, -8348869829879113372L, "position", ENUM);
		createEAttribute(fieldCClass, FIELD_lt_OVERWRITEFIELD, -1237665475126276737L, -6798676010783108205L,
				"overwritefield", LINK_TYPE);
		createEAttribute(fieldCClass, FIELD_at_EDITABLE, 1477551274833627594L, -5555186704688979989L, "editable",
				BOOLEAN);
		createEAttribute(fieldCClass, FIELD_lt_IC, -2249876041581050440L, -6699862624213558514L, "ic", LINK_TYPE);
		createEAttribute(fieldCClass, FIELD_lt_MC, 4326016171745297528L, -5951497895072493162L, "mc", LINK_TYPE);
		createEAttribute(fileContentModelCClass, FILE_CONTENT_MODEL_at_FILE_PATH, 8238779106934737224L,
				-7083104083454233635L, "file-path", STRING);
		createEAttribute(fileContentModelCClass, FILE_CONTENT_MODEL_at_FILE_NAME, -6176182539240255591L,
				-6581875066891605703L, "file-name", STRING);
		createEAttribute(folderContentModelCClass, FOLDER_CONTENT_MODEL_lt_CONTENT_MODEL, 1392733222400773045L,
				-7683274692936371910L, "content-model", LIST, LINK_TYPE);
		createEAttribute(folderContentModelCClass, FOLDER_CONTENT_MODEL_at_FOLDER_PATH, -4306595966194136131L,
				-7330822802877986112L, "folder-path", STRING);
		createEAttribute(folderExporterCClass, FOLDER_EXPORTER_at_PATH, 4027409674747858035L, -5836736507002807123L,
				"path", STRING);
		createEAttribute(generateInformationCClass, GENERATE_INFORMATION_at_CSTNAME, 8049074177537755242L,
				-8449265226062501704L, "CSTName", STRING);
		createEAttribute(groupExtItemCClass, GROUP_EXT_ITEM_lt_MEMBERS, 334171466185589700L, -5911395334519968004L,
				"members", LIST, LINK_TYPE);
		createEAttribute(groupExtItemCClass, GROUP_EXT_ITEM_lt_MEMBER_OF, 5210245649367190375L, -8092863085133141386L,
				"memberOf", LINK_TYPE);
		createEAttribute(groupOfAttributesCClass, GROUP_OF_ATTRIBUTES_lt_ATTRIBUTES, 7007935655592151478L,
				-7384383007614959290L, "attributes", LIST, LINK_TYPE);
		createEAttribute(groupOfAttributesCClass, GROUP_OF_ATTRIBUTES_lt_SUPER_GROUP, -190246439964882045L,
				-7225061417444536225L, "superGroup", LINK_TYPE);
		createEAttribute(groupOfAttributesCClass, GROUP_OF_ATTRIBUTES_at_COLUMN, -2013277734244366476L,
				-7265081187509287147L, "column", INTEGER);
		createEAttribute(iC_FileResourceForBrowser_Combo_ListCClass,
				IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST_at_SELECT_FOLDER, 224115798046034343L, -7181404964779948829L,
				"select-folder", STRING);
		createEAttribute(iC_FileResourceForBrowser_Combo_ListCClass,
				IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST_at_PATTERN_SELECT_FILE, 3697232862387388740L,
				-7241975165949847419L, "pattern-select-file", STRING);
		createEAttribute(iC_JavaClassForBrowser_ComboCClass, IC_JAVA_CLASS_FOR_BROWSER_COMBO_at_STYLE,
				2221260749837584618L, -8998274598135222428L, "style", STRING);
		createEAttribute(iC_JavaClassForBrowser_ComboCClass, IC_JAVA_CLASS_FOR_BROWSER_COMBO_at_FILTER,
				-4181540902879672491L, -8614165809545687034L, "filter", STRING);
		createEAttribute(iC_ResourceTreeDialogForBrowser_Combo_ListCClass,
				IC_RESOURCE_TREE_DIALOG_FOR_BROWSER_COMBO_LIST_at_SELECT_TYPE_ROOT, 158972638726409199L,
				-6195528901513586171L, "select-type-root", INTEGER);
		createEAttribute(iC_StaticArrayOfObjectForBrowser_ComboCClass,
				IC_STATIC_ARRAY_OF_OBJECT_FOR_BROWSER_COMBO_at_VALUES, -2122043224732973302L, -7217956470829475539L,
				"values", LIST, STRING);
		createEAttribute(iC_StringListForListCClass, IC_STRING_LIST_FOR_LIST_at_ALLOW_DUPLICATE, 2410722121598453216L,
				-7038654884474977305L, "allowDuplicate", BOOLEAN);
		createEAttribute(iC_WithTitleForDialogCClass, IC_WITH_TITLE_FOR_DIALOG_at_SELECT_TITLE, -5321083344468687949L,
				-7101016380608498221L, "select-title", STRING);
		createEAttribute(iC_WithTitleForDialogCClass, IC_WITH_TITLE_FOR_DIALOG_at_SELECT_MESSAGE,
				-6065290586918665378L, -6698551702688082668L, "select-message", STRING);
		createEAttribute(itemCClass, ITEM_at_COMMITTED_BY, 998170469921669137L, -6873486146817634620L, "committedBy",
				STRING);
		createEAttribute(itemCClass, ITEM_at_DISPLAY_NAME, 1865208505949703968L, -6892177621014954501L, "display-name",
				STRING);
		createEAttribute(itemCClass, ITEM_lt_INSTANCE_OF, -5034615124846622777L, -6427457879428994639L, "instance-of",
				LIST, LINK_TYPE);
		createEAttribute(itemCClass, ITEM_at_ITEM_HIDDEN, -5574682956601668045L, -8879006428971758126L, "item-hidden",
				BOOLEAN);
		createEAttribute(itemCClass, ITEM_at_ITEM_READONLY, -514220199533985161L, -5292919862502636284L,
				"item-readonly", BOOLEAN);
		createEAttribute(itemCClass, ITEM_at_NAME, -5897991176033580287L, -5274262363043617781L, "name", STRING);
		createEAttribute(itemCClass, ITEM_lt_PARENT, -9210349103650353476L, -5186912746184418128L, "parent", LINK_TYPE);
		createEAttribute(itemCClass, ITEM_lt_MODIFIED_ATTRIBUTES, 6860478510892469546L, -5393898762797096289L,
				"modified-attributes", LIST, LINK_TYPE);
		createEAttribute(itemCClass, ITEM_at_QUALIFIED_NAME, -4013075633635769334L, -6731417994443626601L,
				"qualified-name", STRING);
		createEAttribute(itemCClass, ITEM_at_REQUIRE_NEW_REV, 2369321910189510127L, -7051953162843256155L,
				"requireNewRev", BOOLEAN);
		createEAttribute(itemCClass, ITEM_at_TW_VERSION, 5683278655808160617L, -6179758865453391277L, "TW-version",
				INTEGER);
		createEAttribute(itemCClass, ITEM_at_REV_MODIFIED, -2993606101006007885L, -8225153137345016075L, "revModified",
				BOOLEAN);
		createEAttribute(itemCClass, ITEM_at_ID, -675287697173888015L, -6638302667913588645L, "id", STRING);
		createEAttribute(itemCClass, ITEM_at_COMMITTED_DATE, -4675249962261656049L, -7160158777930594704L,
				"committedDate", LONG);
		createEAttribute(itemCClass, ITEM_lt_CONTENTS, 8033882148286383543L, -8197074762269073275L, "contents",
				LINK_TYPE);
		createEAttribute(itemCClass, ITEM_at_ISVALID, -4304828647074477792L, -5996088997888596293L, "isvalid", BOOLEAN);
		createEAttribute(itemTypeCClass, ITEM_TYPE_lt_SUPER_TYPE, -5956676207963255282L, -7590996803390084650L,
				"super-type", LIST, LINK_TYPE);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_HAS_CONTENT, 5247025605029676870L, -6528382653175509451L,
				"has-content", BOOLEAN);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_IS_ROOT_ELEMENT, 1827456314227314450L, -7871971291291372499L,
				"is-root-element", BOOLEAN);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_IS_INSTANCE_ABSTRACT, 5507383460357294372L,
				-6983966127930137732L, "is-instance-abstract", BOOLEAN);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_HAS_SHORT_NAME, -5456801827180493204L, -7364932128250437197L,
				"has-short-name", BOOLEAN);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_HAS_UNIQUE_NAME, -18784406713647075L, -5317793615790274887L,
				"has-unique-name", BOOLEAN);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_IS_META_ITEM_TYPE, 8775331757003784320L, -4980801066555690990L,
				"is-meta-item-type", BOOLEAN);
		createEAttribute(itemTypeCClass, ITEM_TYPE_lt_WC_LISTENERS, 169955203729212853L, -7020814896192527669L,
				"wcListeners", LIST, LINK_TYPE);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_IS_INSTANCE_HIDDEN, 1799372169278082441L, -7401884421300669149L,
				"is-instance-hidden", BOOLEAN);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_OVERWRITE_DEFAULT_PAGES, -1404863301255347812L,
				-5472824239844933052L, "overwrite-default-pages", BOOLEAN);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_ICON, -1144861058683682601L, -5054727362201685967L, "icon",
				STRING);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_ITEM_FACTORY, 928977464291509664L, -7374040401952831451L,
				"item-factory", STRING);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_ITEM_MANAGER, -4514668927160858933L, -7639174229993242797L,
				"item-manager", STRING);
		createEAttribute(itemTypeCClass, ITEM_TYPE_lt_LINK_TYPE, 7525975296182863367L, -6733988287527508841L,
				"link-type", LIST, LINK_TYPE);
		createEAttribute(itemTypeCClass, ITEM_TYPE_lt_SUB_TYPES, 2282425925394124430L, -6186682847072344900L,
				"sub-types", LIST, LINK_TYPE);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_PACKAGE_NAME, -6682418256858757360L, -5682205467483532955L,
				"package-name", STRING);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_CUSTOM_MANAGER, -8531109478260063301L, -8460637860232470261L,
				"custom-manager", BOOLEAN);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_MANAGER_CLASS, 6361710293437859050L, -7018305850918391318L,
				"manager-class", STRING);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_DISPLAY_NAME_TEMPLATE, 4979361582769653928L,
				-6967639935405578880L, "display-name-template", STRING);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_QUALIFIED_NAME_TEMPLATE, 3514789503318839197L,
				-7698269991938166596L, "qualified-name-template", STRING);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_MESSAGE_ERROR_ID, 4512085134478493174L, -6357395802558953400L,
				"message-error-id", STRING);
		createEAttribute(itemTypeCClass, ITEM_TYPE_at_VALIDATE_NAME_RE, -3976572090218688758L, -6551345840603608463L,
				"validate-name-re", STRING);
		createEAttribute(javaFileContentModelCClass, JAVA_FILE_CONTENT_MODEL_at_PACKAGE_NAME, 5796925702026446779L,
				-5175499749821020648L, "package-name", STRING);
		createEAttribute(javaFileContentModelCClass, JAVA_FILE_CONTENT_MODEL_at_CLASS_NAME, 1389524059569081457L,
				-6572846635794588182L, "class-name", STRING);
		createEAttribute(javaProjectComposerCClass, JAVA_PROJECT_COMPOSER_lt_COMPOSER_LINKS, -8824278886167131568L,
				-8394161104011330776L, "composer-links", LIST, LINK_TYPE);
		createEAttribute(javaProjectContentModelCClass, JAVA_PROJECT_CONTENT_MODEL_lt_CONTENT_MODEL,
				9098153987808644475L, -4861498994335334284L, "content-model", LIST, LINK_TYPE);
		createEAttribute(javaProjectContentModelCClass, JAVA_PROJECT_CONTENT_MODEL_at_HAS_SOURCE_FOLDER,
				-8273585257557834581L, -6004961183475962591L, "has-source-folder", BOOLEAN);
		createEAttribute(linkTypeCClass, LINK_TYPE_lt_DESTINATION, 1236744025225707746L, -6427516804473472093L,
				"destination", LINK_TYPE);
		createEAttribute(linkTypeCClass, LINK_TYPE_lt_INVERSE_LINK, -2138857207893375608L, -4754589421293930467L,
				"inverse-link", LINK_TYPE);
		createEAttribute(linkTypeCClass, LINK_TYPE_at_ANNOTATION, 3353478445349292828L, -6230213701710110631L,
				"annotation", BOOLEAN);
		createEAttribute(linkTypeCClass, LINK_TYPE_at_PART, 5720595816634074069L, -4761369048062229951L, "part",
				BOOLEAN);
		createEAttribute(linkTypeCClass, LINK_TYPE_at_AGGREGATION, -2384219926350575548L, -5067528591067164558L,
				"aggregation", BOOLEAN);
		createEAttribute(linkTypeCClass, LINK_TYPE_at_COMPOSITION, -8110138141287693992L, -7201442458043250381L,
				"composition", BOOLEAN);
		createEAttribute(linkTypeCClass, LINK_TYPE_at_SELECTION, -7589480133145706400L, -5759193675250357126L,
				"selection", STRING);
		createEAttribute(linkTypeCClass, LINK_TYPE_at_REQUIRE, -6570192446153078024L, -7909113593182029426L, "require",
				BOOLEAN);
		createEAttribute(linkTypeCClass, LINK_TYPE_at_MAPPING, 6250325500745761262L, -6780288058396218156L, "mapping",
				BOOLEAN);
		createEAttribute(linkTypeCClass, LINK_TYPE_at_LINK_MANAGER, -1410540557444560778L, -7609335726543888444L,
				"link-manager", STRING);
		createEAttribute(linkTypeCClass, LINK_TYPE_at_TWDEST_EVOL, 8799229410811724969L, -8558530069012570337L,
				"TWDestEvol", ENUM);
		createEAttribute(linkTypeCClass, LINK_TYPE_at_TWCOUPLED, -4045433623194546824L, -5579399387606556024L,
				"TWCoupled", BOOLEAN);
		createEAttribute(linkTypeCClass, LINK_TYPE_at_HIDDEN, 3199990222515685430L, -7031121257244614075L, "hidden",
				BOOLEAN);
		createEAttribute(linkTypeCClass, LINK_TYPE_at_MIN, 1198218466826601342L, -6891484286553982129L, "min", INTEGER);
		createEAttribute(linkTypeCClass, LINK_TYPE_at_MAX, 9144261992895629210L, -4890809679079959102L, "max", INTEGER);
		createEAttribute(linkTypeCClass, LINK_TYPE_at_KIND, -8049190393229588948L, -4959784496839446974L, "kind",
				INTEGER);
		createEAttribute(linkTypeCClass, LINK_TYPE_lt_SOURCE, -7285640760647858829L, -7640543082019163810L, "source",
				LINK_TYPE);
		createEAttribute(linkTypeCClass, LINK_TYPE_at_GROUP, 8381608823070084971L, -8090302841120845958L, "group",
				BOOLEAN);
		createEAttribute(linkTypeTypeCClass, LINK_TYPE_TYPE_at_VERSION, 8529320772045130058L, -6159183838194817754L,
				"Version", INTEGER);
		createEAttribute(linkTypeTypeCClass, LINK_TYPE_TYPE_at_INDEX_OF, -5397585981698453788L, -9122794046119269296L,
				"IndexOf", INTEGER);
		createEAttribute(linkTypeTypeCClass, LINK_TYPE_TYPE_at_COMPATIBLE_VERSIONS, 817623444133789772L,
				-6900732421147454198L, "CompatibleVersions", LIST, INTEGER);
		createEAttribute(linkTypeTypeCClass, LINK_TYPE_TYPE_at_HIDDEN, -2222075441215486947L, -7434943826359942581L,
				"Hidden", BOOLEAN);
		createEAttribute(linkTypeTypeCClass, LINK_TYPE_TYPE_at_READ_ONLY, -9091966905554810809L, -5004674071077935911L,
				"readOnly", BOOLEAN);
		createEAttribute(linkTypeTypeCClass, LINK_TYPE_TYPE_at_VALID, 2250056621022268903L, -6959927921354236779L,
				"valid", BOOLEAN);
		createEAttribute(listCClass, LIST_lt_SUB_TYPE, 3988404447318000604L, -5108059107952634316L, "sub-type",
				LINK_TYPE);
		createEAttribute(mC_DateCClass, MC_DATE_at_PATTERN, 5124798361169053537L, -9165174600451067019L, "pattern",
				STRING);
		createEAttribute(mC_IntegerCClass, MC_INTEGER_at_ERROR_MSG_MAX, -7805215120309073393L, -7725483998165661118L,
				"error-msg-max", STRING);
		createEAttribute(mC_IntegerCClass, MC_INTEGER_at_ERROR_MSG_MIN, -4155136879002042179L, -7866015059581765966L,
				"error-msg-min", STRING);
		createEAttribute(mC_IntegerCClass, MC_INTEGER_at_MAX, 6697075400630419892L, -4958049438002780647L, "max",
				INTEGER);
		createEAttribute(mC_IntegerCClass, MC_INTEGER_at_MIN, 7251536929375078983L, -8318973429390533018L, "min",
				INTEGER);
		createEAttribute(mC_IntegerCClass, MC_INTEGER_at_DEFAULT_VALUE, -706859907694703680L, -6707106863301107288L,
				"default-value", INTEGER);
		createEAttribute(mC_LinkCClass, MC_LINK_at_ERROR_MESSAGE, -6872474485299264412L, -6294923211211875600L,
				"error-message", STRING);
		createEAttribute(mC_ListOfStringCClass, MC_LIST_OF_STRING_at_MIN, 360686492572008705L, -5390152708324052823L,
				"min", INTEGER);
		createEAttribute(mC_ListOfStringCClass, MC_LIST_OF_STRING_at_MAX, 2933817770597237028L, -6361341852529163140L,
				"max", INTEGER);
		createEAttribute(managerCClass, MANAGER_lt_ITEM_TYPE, -5579828190911969830L, -5438014314786436519L,
				"item-type", LINK_TYPE);
		createEAttribute(managerCClass, MANAGER_lt_CONTENT_MODEL, -7690589066975820683L, -8420958270119715253L,
				"content-model", LINK_TYPE);
		createEAttribute(managerCClass, MANAGER_lt_EXPORTERS, -1937837271945623130L, -7920773165234134752L,
				"exporters", LIST, LINK_TYPE);
		createEAttribute(managerCClass, MANAGER_at_DISPLAY_NAME_TEMPLATE, -7315435047156956727L, -6068186095844201573L,
				"display-name-template", STRING);
		createEAttribute(managerCClass, MANAGER_at_ICON, 1587504477147316564L, -6881314682192153139L, "icon", STRING);
		createEAttribute(managerCClass, MANAGER_at_VALID_PATTERN_ID, -6869233986945332655L, -6596379406324605718L,
				"valid-pattern-id", STRING);
		createEAttribute(managerCClass, MANAGER_at_QUALIFIED_NAME_TEMPLATE, -3984017638260915676L,
				-7677994414177222992L, "qualified-name-template", STRING);
		createEAttribute(managerCClass, MANAGER_at_MESSAGE_ERROR_ID, 4773699590411602152L, -6412518752974121920L,
				"message-error-id", STRING);
		createEAttribute(managerCClass, MANAGER_at_HUMAN_NAME, -3618627790623652552L, -5538833086304423242L,
				"human-name", STRING);
		createEAttribute(mappingModelCClass, MAPPING_MODEL_lt_MANAGERS, 2575336675500245209L, -7843174451719788434L,
				"managers", LIST, LINK_TYPE);
		createEAttribute(menuCClass, MENU_lt_CHILDREN, 5453276458795775L, -7764413059604959963L, "children", LIST,
				LINK_TYPE);
		createEAttribute(menuAbstractCClass, MENU_ABSTRACT_at_PATH, -4731094401188216586L, -7814800410550555707L,
				"path", STRING);
		createEAttribute(menuAbstractCClass, MENU_ABSTRACT_at_LABEL, 1911038908109966670L, -8663838879647067634L,
				"label", STRING);
		createEAttribute(menuAbstractCClass, MENU_ABSTRACT_at_ICON, 4436610995914491351L, -6874590897865541161L,
				"icon", STRING);
		createEAttribute(pDEProjectContentModelCClass, PDEPROJECT_CONTENT_MODEL_lt_CONTENT_MODEL,
				-6021951036816865220L, -5372875555485671427L, "content-model", LIST, LINK_TYPE);
		createEAttribute(packageContentModelCClass, PACKAGE_CONTENT_MODEL_at_PACKAGE_NAME, -7954100485159237815L,
				-5803138576705313882L, "package-name", STRING);
		createEAttribute(pageCClass, PAGE_lt_ATTRIBUTES, -3062246603368412826L, -6202375758648357125L, "attributes",
				LIST, LINK_TYPE);
		createEAttribute(pageCClass, PAGE_at_TITLE, -3181137248087094488L, -9008447534735510080L, "title", STRING);
		createEAttribute(pageCClass, PAGE_at_DESCRIPTION, 9101043956612812450L, -7557369502151991361L, "description",
				STRING);
		createEAttribute(pageCClass, PAGE_at_IS_REMOVED, -1416656732191374508L, -6837833532334265513L, "is-removed",
				BOOLEAN);
		createEAttribute(pageCClass, PAGE_at_LABEL, -6684875730606210458L, -9156922887543384565L, "label", STRING);
		createEAttribute(pageCClass, PAGE_at_ID_RUNTIME, -892649153301363899L, -6484338443818496901L, "id-runtime",
				STRING);
		createEAttribute(pageCClass, PAGE_lt_OVERWRITE, 4789900369123361160L, -7456432954237581267L, "overwrite", LIST,
				LINK_TYPE);
		createEAttribute(projectContentModelCClass, PROJECT_CONTENT_MODEL_lt_CONTENT_MODEL, -7308076877992998510L,
				-8017203053765955798L, "content-model", LIST, LINK_TYPE);
		createEAttribute(projectContentModelCClass, PROJECT_CONTENT_MODEL_at_PROJECT_NAME, -4482665573468912540L,
				-5880121386129416553L, "project-name", STRING);
		createEAttribute(runtimeItemCClass, RUNTIME_ITEM_at_CLASS_NAME, 2372546248453148253L, -5851896545213257575L,
				"class-name", STRING);
		createEAttribute(runtimeItemCClass, RUNTIME_ITEM_at_EXTENDS_CLASS, 1710068003698984093L, -5747890720692174695L,
				"extends-class", BOOLEAN);
		createEAttribute(sourceFolderContentModelCClass, SOURCE_FOLDER_CONTENT_MODEL_at_OUTPUT_PATH,
				-7242360231781513041L, -4893014583535785108L, "output-path", STRING);
		createEAttribute(stringCClass, STRING_at_NOT_EMPTY, 4886141232023684493L, -8358576447532892837L, "not-empty",
				BOOLEAN);
		createEAttribute(structCClass, STRUCT_lt_ATTRIBUTES, -5045316267877907338L, -8125262601609031827L,
				"attributes", LIST, LINK_TYPE);
		createEAttribute(symbolicBitMapCClass, SYMBOLIC_BIT_MAP_at_VALUES, 1373396693062862165L, -6464146704624767936L,
				"values", LIST, STRING);
		createEAttribute(timeCClass, TIME_at_INIT_WITH_THE_CURRENT_TIME, 6045304764054585912L, -6261734856288719979L,
				"init-with-the-current-time", BOOLEAN);
		createEAttribute(typeDefinitionCClass, TYPE_DEFINITION_lt_ATTRIBUTES, -7786452207538713927L,
				-7827976980874723314L, "attributes", LIST, LINK_TYPE);
		createEAttribute(typeDefinitionCClass, TYPE_DEFINITION_at_ID_RUNTIME, -7453113792689909903L,
				-6147878347643489207L, "id-runtime", STRING);
		createEAttribute(typeDefinitionCClass, TYPE_DEFINITION_lt_FIELDS, -8331130318344401544L, -6311973651578811953L,
				"fields", LIST, LINK_TYPE);
		createEAttribute(typeDefinitionCClass, TYPE_DEFINITION_lt_CREATION_PAGES, 7112347995446398851L,
				-4991241798090464375L, "creation-pages", LIST, LINK_TYPE);
		createEAttribute(typeDefinitionCClass, TYPE_DEFINITION_lt_VALIDATORS, -2592261701985025884L,
				-5087883788075959678L, "validators", LIST, LINK_TYPE);
		createEAttribute(typeDefinitionCClass, TYPE_DEFINITION_lt_CADSE, 9097796322718600730L, -6502331749611633308L,
				"cadse", LINK_TYPE);
		createEAttribute(typeDefinitionCClass, TYPE_DEFINITION_lt_MODIFICATION_PAGES, -3445051493441191559L,
				-8029722834114536170L, "modification-pages", LIST, LINK_TYPE);
		createEAttribute(typeDefinitionCClass, TYPE_DEFINITION_lt_GOUPS_OF_ATTRIBUTES, -1240042651781478238L,
				-8346987446140337958L, "goupsOfAttributes", LIST, LINK_TYPE);
		createEAttribute(uIListenerCClass, UILISTENER_lt_FIELDS, -1198713162447369976L, -4712816681995651207L,
				"fields", LIST, LINK_TYPE);
		createEAttribute(uIValidatorCClass, UIVALIDATOR_lt_OVERWRITE, 3852059016216596243L, -9144547244055260141L,
				"overwrite", LIST, LINK_TYPE);
		createEAttribute(uIValidatorCClass, UIVALIDATOR_lt_LISTEN_ATTRIBUTES, -1509472065291991118L,
				-4616480388510466688L, "listenAttributes", LIST, LINK_TYPE);
		createEAttribute(viewCClass, VIEW_lt_VIEW_ITEM_TYPES, 2362792688293921715L, -6614306368743462923L,
				"view-item-types", LIST, LINK_TYPE);
		createEAttribute(viewCClass, VIEW_at_ICON, -7708015124775810363L, -5557253155891395404L, "icon", STRING);
		createEAttribute(viewDescriptionCClass, VIEW_DESCRIPTION_lt_ROOT_TYPES, 3486090633924462945L,
				-8025012224594462748L, "root-types", LIST, LINK_TYPE);
		createEAttribute(viewItemTypeCClass, VIEW_ITEM_TYPE_lt_ITEM_TYPE, -5688876016733110051L, -5605997758840630338L,
				"item-type", LINK_TYPE);
		createEAttribute(viewItemTypeCClass, VIEW_ITEM_TYPE_lt_VIEW_LINK_TYPES, 787725824754598492L,
				-8285913592121271942L, "view-link-types", LIST, LINK_TYPE);
		createEAttribute(viewItemTypeCClass, VIEW_ITEM_TYPE_at_REF, -8606273520165895331L, -4752509922943585678L,
				"ref", BOOLEAN);
		createEAttribute(viewItemTypeCClass, VIEW_ITEM_TYPE_at_IS_ROOT_ELEMENT, -6607170366269338892L,
				-9133066680182270109L, "is-root-element", BOOLEAN);
		createEAttribute(viewLinkTypeCClass, VIEW_LINK_TYPE_lt_LINK_TYPE, -5054657734466973711L, -4958925098483611539L,
				"link-type", LINK_TYPE);
		createEAttribute(viewLinkTypeCClass, VIEW_LINK_TYPE_at_CAN_CREATE_ITEM, -6640877649708168466L,
				-6688430980818105700L, "can-create-item", BOOLEAN);
		createEAttribute(viewLinkTypeCClass, VIEW_LINK_TYPE_at_CAN_CREATE_LINK, -8475469012803435144L,
				-5011219049844774116L, "can-create-link", BOOLEAN);
		createEAttribute(viewLinkTypeCClass, VIEW_LINK_TYPE_at_DISPLAY_CREATE, -7699501583660790719L,
				-5267421508774392230L, "display-create", STRING);
		createEAttribute(viewLinkTypeCClass, VIEW_LINK_TYPE_at_AGGREGATION, 7686578529767278158L,
				-4727344386265896955L, "aggregation", BOOLEAN);
		createEAttribute(viewModelCClass, VIEW_MODEL_lt_VIEWS, 5076533860390881070L, -6385161897080669083L, "views",
				LIST, LINK_TYPE);
		createEAttribute(wCListenerCClass, WCLISTENER_lt_LISTEN_ITEM_TYPES, -6345884993552364428L,
				-6666343877383953475L, "listenItemTypes", LIST, LINK_TYPE);
		createEAttribute(wCListenerCClass, WCLISTENER_lt_LISTEN_ATTRIBUTE_DEFINITIONS, -4612914330590951571L,
				-4915270252893695935L, "listenAttributeDefinitions", LIST, LINK_TYPE);
	}

	/**
	 * @generated
	 */
	private boolean	isInitialized	= false;

	/**
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;
		setName(cNAME);
		setQualifiedName(cQNAME);
		setVersion(cVERSION);
		setUUID(cUUID);
		setDescription(cDESCRIPTION);
		setDisplayName(cDISPLAYNAME);
		setCstClass(cCLASS_CST);
		initEClass(aJProjectComposerCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"build.composer", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, eclipseComposerCClass, "AJProjectComposer",
				"icons/composer.gif", "fr.imag.adele.cadse.cadseg.managers.build.composer.AJProjectComposerManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "AJPROJECT_COMPOSER");
		initEReference(getAJProjectComposer_lt_getComposerLinks(), 8442084740078125224L, -7310939922673348027L, null,
				"composer-links", 0, -1, composerLinkCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "AJPROJECT_COMPOSER_lt_COMPOSER_LINKS", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getAJProjectComposer_at_getSkipWeaving(), 7587850506524116916L, -8376729183294778470L,
				"skip-weaving", "AJPROJECT_COMPOSER_at_SKIP_WEAVING_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, false, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		bindExt(typeDefinitionCClass, actionExtItemTypeCClass);
		initEReference(getActionExtItemType_lt_getActionsModel(), -2976470533934723238L, -4784452860694751182L, null,
				"actions-model", 0, 1, menuCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "ACTION_EXT_ITEM_TYPE_lt_ACTIONS_MODEL", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(aspectJExporterCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"build.exporter", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, eclipseExporterCClass, "AspectJExporter",
				"icons/exporter.gif", "fr.imag.adele.cadse.cadseg.managers.build.exporter.AspectJExporterManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "ASPECT_JEXPORTER");
		initEClass(aspectJProjectContentModelCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN,
				null, "content", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, javaProjectContentModelCClass,
				"AspectJProjectContentModel", "icons/AspectJProjectContentModel.gif",
				"fr.imag.adele.cadse.cadseg.managers.content.AspectJProjectContentModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "ASPECT_JPROJECT_CONTENT_MODEL");
		initEReference(getAspectJProjectContentModel_lt_getContentModel(), 2815321508876603390L, -7561905016446825892L,
				null, "content-model", 0, -1, resourceContentModelCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "ASPECT_JPROJECT_CONTENT_MODEL_lt_CONTENT_MODEL",
				null, TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(aspectJReExporterCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"build.exporter", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, javaReExporterCClass, "AspectJReExporter",
				"icons/exporter.gif", "fr.imag.adele.cadse.cadseg.managers.build.exporter.AspectJReExporterManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "ASPECT_JRE_EXPORTER");
		initEClass(attributeCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"attributes", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, itemCClass, "Attribute", "icons/attribute.gif",
				"fr.imag.adele.cadse.cadseg.managers.attributes.AttributeManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "ATTRIBUTE");
		initEAttribute(getAttribute_at_getTWCommitKind(), 5486822832854615480L, -7709407795185363997L, "TWCommitKind",
				"ATTRIBUTE_at_TWCOMMIT_KIND_", TWEvol.twImmutable, TWCommitKind.none, TWUpdateKind.none, true,
				TWCommitKind.conflict, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEAttribute(getAttribute_at_getTWEvol(), -6556116649820929916L, -8717582032097845630L, "TWEvol",
				"ATTRIBUTE_at_TWEVOL_", TWEvol.twImmutable, TWCommitKind.none, TWUpdateKind.none, true, TWEvol.twImmutable, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getAttribute_at_getTWRevSpecific(), -3513034253922909634L, -5360441340782655064L,
				"TWRevSpecific", "ATTRIBUTE_at_TWREV_SPECIFIC_", TWEvol.twImmutable, TWCommitKind.none,
				TWUpdateKind.none, true, true, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getAttribute_at_getTWUpdateKind(), 820908681011741122L, -7492981238571984928L, "TWUpdateKind",
				"ATTRIBUTE_at_TWUPDATE_KIND_", TWEvol.twImmutable, TWCommitKind.none, TWUpdateKind.none, true, TWUpdateKind.merge,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getAttribute_at_getCannotBeUndefined(), -3423183319042797845L, -8006053779341362993L,
				"cannot-be-undefined", "ATTRIBUTE_at_CANNOT_BE_UNDEFINED_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, false, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getAttribute_at_getDefaultValue(), -5030649019245706597L, -4766256875273574486L,
				"default-value", "ATTRIBUTE_at_DEFAULT_VALUE_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getAttribute_at_getDevGenerated(), -9220686436712429645L, -8909131287572524821L,
				"dev-generated", "ATTRIBUTE_at_DEV_GENERATED_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, false, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getAttribute_at_getFinal(), -3755208324177769542L, -5466149767341583564L, "final",
				"ATTRIBUTE_at_FINAL_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getAttribute_at_getHiddenInComputedPages(), 1436342611161793245L, -8766922011604397064L,
				"hidden-in-computed-pages", "ATTRIBUTE_at_HIDDEN_IN_COMPUTED_PAGES_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getAttribute_at_getIdRuntime(), -726968386927376302L, -5653829062192998872L, "id-runtime",
				"ATTRIBUTE_at_ID_RUNTIME_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null,
				0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getAttribute_at_getIsList(), -2542717760334772178L, -6088412726579282966L, "is-list",
				"ATTRIBUTE_at_IS_LIST_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getAttribute_at_getMustBeInitialized(), -6382226066240158145L, -5271732042789926404L,
				"must-be-initialized", "ATTRIBUTE_at_MUST_BE_INITIALIZED_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, true, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getAttribute_at_getNatif(), -3471270548458945195L, -5488139896673645219L, "natif",
				"ATTRIBUTE_at_NATIF_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getAttribute_at_getRequire(), 2623863750748291929L, -9198408877767341933L, "require",
				"ATTRIBUTE_at_REQUIRE_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getAttribute_at_getTransient(), 6629220883426067318L, -6625384691100680799L, "transient",
				"ATTRIBUTE_at_TRANSIENT_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEReference(getAttribute_lt_getWcListens(), -2179537632868940333L, -6729352182800517751L, null, "wcListens",
				0, -1, wCListenerCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "ATTRIBUTE_lt_WC_LISTENS", null,
				TWEvol.twImmutable, TWCommitKind.none, TWUpdateKind.none, true, TWDestEvol.immutable, false);
		initEClass(attributeItemTypeCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"meta", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, itemTypeCClass, "AttributeItemType", null,
				"fr.imag.adele.cadse.cadseg.managers.meta.AttributeItemTypeManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "ATTRIBUTE_ITEM_TYPE");
		initEAttribute(getAttributeItemType_at_getDefaultValue(), 8651665830089869974L, -6331634790547529052L,
				"default-value", "ATTRIBUTE_ITEM_TYPE_at_DEFAULT_VALUE_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getAttributeItemType_at_getRuntimeQualifiedClass(), 9058459004682716115L, -5781601185535237616L,
				"runtime-qualified-class", "ATTRIBUTE_ITEM_TYPE_at_RUNTIME_QUALIFIED_CLASS_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, null, 256, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(booleanCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "attributes",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, attributeCClass, "Boolean", "icons/attribute.gif",
				"fr.imag.adele.cadse.cadseg.managers.attributes.BooleanManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "BOOLEAN");
		initEClass(buildModelCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "build",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "BuildModel", "icons/build.gif",
				"fr.imag.adele.cadse.cadseg.managers.build.BuildModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "BUILD_MODEL");
		initEReference(getBuildModel_lt_getCompositeTypes(), -2065115184406115611L, -6322107746629572098L, null,
				"composite-types", 0, -1, compositeItemTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "BUILD_MODEL_lt_COMPOSITE_TYPES", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(builderCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "build",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "Builder", "icons/s4all-16x16-build.gif",
				"fr.imag.adele.cadse.cadseg.managers.build.BuilderManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "BUILDER");
		initEReference(getBuilder_lt_getRequires(), 4353003967296390715L, -5636254994453622825L, null, "requires", 0,
				-1, builderCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "BUILDER_lt_REQUIRES", null, TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(cadseCClass, IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "Cadse", "icons/cadseruntime-noactive.png",
				"fr.imag.adele.cadse.cadseg.managers.CadseManager", "${#parent.qualified-name}{.}${#name}", null, null,
				"CADSE");
		initEAttribute(getCadse_at_getDefaultContentRepoURL(), -5308678218422924554L, -7955564280512136044L,
				"defaultContentRepoURL", "CADSE_at_DEFAULT_CONTENT_REPO_URL_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getCadse_at_getDescription(), 6859817981831954548L, -5911661469722330247L, "description",
				"CADSE_at_DESCRIPTION_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getCadse_at_getExecuted(), -4271676810670683375L, -6704741253959396654L, "executed",
				"CADSE_at_EXECUTED_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEReference(getCadse_lt_getExtends(), -5311939042961767251L, -6057641984395631590L, null, "extends", 0, -1,
				cadseCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE, !IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN,
				!IS_PART, null, "CADSE_lt_EXTENDS", null, TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getCadse_at_getIdDefinition(), -5893076169920593260L, -8767106335413169239L, "id-definition",
				"CADSE_at_ID_DEFINITION_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getCadse_at_getItemRepoLogin(), -2478669964607733537L, -6187469110397446833L, "itemRepoLogin",
				"CADSE_at_ITEM_REPO_LOGIN_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null,
				0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getCadse_at_getItemRepoPasswd(), 6741922683938357846L, -7218804880034703560L, "itemRepoPasswd",
				"CADSE_at_ITEM_REPO_PASSWD_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEAttribute(getCadse_at_getItemRepoURL(), -7852605455945020935L, -7054370025464556975L, "itemRepoURL",
				"CADSE_at_ITEM_REPO_URL_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null,
				0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEReference(getCadse_lt_getItemTypes(), 6978393775071315180L, -5128306338791400169L, null, "itemTypes", 0,
				-1, itemTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "CADSE_lt_ITEM_TYPES", null, TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(cadseDefinitionCClass, IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, cadseCClass, "CadseDefinition",
				"icons/s4all-16x16-workspace.gif", "fr.imag.adele.cadse.cadseg.managers.CadseDefinitionManager",
				"Model.Workspace.${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[A-Za-z_][A-Z0-9a-z_]*(\\.[A-Za-z_][A-Z0-9a-z_]*)*", "CADSE_DEFINITION");
		initEReference(getCadseDefinition_lt_getBuild(), -1933048506473101562L, -7872259910111122479L, null, "build",
				1, 1, buildModelCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "CADSE_DEFINITION_lt_BUILD", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getCadseDefinition_at_getCadseName(), -7236383661086716356L, -7746985501087060655L,
				"cadse-name", "CADSE_DEFINITION_at_CADSE_NAME_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getCadseDefinition_at_getCommentary(), 7740875530988109868L, -5927888702666785128L,
				"commentary", "CADSE_DEFINITION_at_COMMENTARY_", TWEvol.twImmutable, TWCommitKind.none,
				TWUpdateKind.none, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEReference(getCadseDefinition_lt_getConfiguration(), -8798130791473657116L, -7410479015189312350L, null,
				"configuration", 0, 1, configurationModelCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "CADSE_DEFINITION_lt_CONFIGURATION", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEReference(getCadseDefinition_lt_getDataModel(), -6968934065506336407L, -8068653501252306411L, null,
				"data-model", 1, 1, dataModelCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "CADSE_DEFINITION_lt_DATA_MODEL", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getCadseDefinition_at_getIdRuntime(), -119233901698658928L, -6759169978139899333L, "id-runtime",
				"CADSE_DEFINITION_at_ID_RUNTIME_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEAttribute(getCadseDefinition_at_getImports(), -1986709061434520905L, -4617903214958563102L, "imports",
				"CADSE_DEFINITION_at_IMPORTS_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, IS_LIST);
		initEReference(getCadseDefinition_lt_getMapping(), 7385730605805094543L, -4731613656315645866L, null,
				"mapping", 1, 1, mappingModelCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "CADSE_DEFINITION_lt_MAPPING", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getCadseDefinition_at_getPackagename(), 1129050764659606892L, -4803144242722920392L,
				"packagename", "CADSE_DEFINITION_at_PACKAGENAME_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getCadseDefinition_at_getVendorName(), 1399355946446245460L, -9013655310504927804L,
				"vendor-name", "CADSE_DEFINITION_at_VENDOR_NAME_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getCadseDefinition_at_getVersionCadse(), 6960548589348408800L, -6394650412505195902L,
				"version-cadse", "CADSE_DEFINITION_at_VERSION_CADSE_", TWEvol.twImmutable, TWCommitKind.none,
				TWUpdateKind.none, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEReference(getCadseDefinition_lt_getViewModel(), 6551113672664236912L, -5018549296147544050L, null,
				"view-model", 1, 1, viewModelCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "CADSE_DEFINITION_lt_VIEW_MODEL", null,
				TWEvol.twImmutable, TWCommitKind.none, TWUpdateKind.none, true, TWDestEvol.immutable, false);
		initEClass(composerCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "build",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, runtimeItemCClass, "Composer", "icons/composer.gif",
				"fr.imag.adele.cadse.cadseg.managers.build.ComposerManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "COMPOSER");
		initEReference(getComposer_lt_getComposerLinks(), 8483677582154484983L, -7616480509052158555L, null,
				"composer-links", 0, -1, composerLinkCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "COMPOSER_lt_COMPOSER_LINKS", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getComposer_at_getTypes(), 6110842582509110325L, -8150412315204794947L, "types",
				"COMPOSER_at_TYPES_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				IS_LIST);
		initEClass(composerLinkCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"build", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "ComposerLink", "icons/build-link.gif",
				"fr.imag.adele.cadse.cadseg.managers.build.ComposerLinkManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "COMPOSER_LINK");
		initEReference(getComposerLink_lt_getExporters(), 328796854460040324L, -8213922973513033400L, null,
				"exporters", 0, -1, exporterCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "COMPOSER_LINK_lt_EXPORTERS", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEReference(getComposerLink_lt_getLink(), 527066175275680430L, -5150312371800943149L, null, "link", 1, 1,
				linkTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE, !IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN,
				!IS_PART, null, "COMPOSER_LINK_lt_LINK", null, TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(compositeItemTypeCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"build", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "CompositeItemType",
				"icons/build-composite.gif", "fr.imag.adele.cadse.cadseg.managers.build.CompositeItemTypeManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "COMPOSITE_ITEM_TYPE");
		initEReference(getCompositeItemType_lt_getBuilders(), -7077985845148104891L, -8090037199202042685L, null,
				"builders", 0, -1, builderCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "COMPOSITE_ITEM_TYPE_lt_BUILDERS", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEReference(getCompositeItemType_lt_getComposers(), 5264072729635933957L, -6978390795838416711L, null,
				"composers", 0, -1, composerCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "COMPOSITE_ITEM_TYPE_lt_COMPOSERS", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEReference(getCompositeItemType_lt_getItemType(), -4640325068125877184L, -4694621125818459506L, null,
				"item-type", 1, 1, itemTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "COMPOSITE_ITEM_TYPE_lt_ITEM_TYPE", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(computedStringCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"attributes", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, attributeCClass, "ComputedString", null,
				"fr.imag.adele.cadse.cadseg.managers.attributes.ComputedStringManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "COMPUTED_STRING");
		initEAttribute(getComputedString_at_getExpression(), 2075809073733586615L, -4982819001200601116L, "expression",
				"COMPUTED_STRING_at_EXPRESSION_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEClass(configurationModelCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, itemCClass, "ConfigurationModel",
				"icons/s4all-16x16-configuration.gif", "fr.imag.adele.cadse.cadseg.managers.ConfigurationModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "CONFIGURATION_MODEL");
		initEReference(getConfigurationModel_lt_getBuild(), 137170060459918177L, -8273815291769659736L, null, "build",
				0, -1, buildModelCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "CONFIGURATION_MODEL_lt_BUILD", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(contentItemCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"content", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "ContentItem", null,
				"fr.imag.adele.cadse.cadseg.managers.content.ContentItemManager",
				"${#parent.qualified-name}{.}${#name}", null, null, "CONTENT_ITEM");
		initEReference(getContentItem_lt_getChildren(), -2805837904547393740L, -8128155903842363698L, null, "children",
				0, -1, contentItemCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "CONTENT_ITEM_lt_CHILDREN", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEReference(getContentItem_lt_getOwnerItem(), -4128862450062965279L, -8017796158382010686L, null,
				"owner-item", 0, 1, itemCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "CONTENT_ITEM_lt_OWNER_ITEM", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(contentItemTypeCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"content", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, itemCClass, "ContentItemType",
				"icons/ContentModel.gif", "fr.imag.adele.cadse.cadseg.managers.content.ContentItemTypeManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "CONTENT_ITEM_TYPE");
		initEAttribute(getContentItemType_at_getExtendsClass(), 2844617944629659701L, -6721427560623249186L,
				"extends-class", "CONTENT_ITEM_TYPE_at_EXTENDS_CLASS_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, false, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(dBrowserCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "ui",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, displayCClass, "DBrowser", "icons/attribute-wizard.gif",
				"fr.imag.adele.cadse.cadseg.managers.ui.DBrowserManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "DBROWSER");
		initEClass(dCheckBoxCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "ui",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, displayCClass, "DCheckBox", "icons/attribute-wizard.gif",
				"fr.imag.adele.cadse.cadseg.managers.ui.DCheckBoxManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "DCHECK_BOX");
		initEClass(dCheckedListCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "ui",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, displayCClass, "DCheckedList", "icons/attribute-wizard.gif",
				"fr.imag.adele.cadse.cadseg.managers.ui.DCheckedListManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "DCHECKED_LIST");
		initEClass(dCheckedTreeCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "ui",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, displayCClass, "DCheckedTree", null,
				"fr.imag.adele.cadse.cadseg.managers.ui.DCheckedTreeManager",
				"${#parent-unique-name}{.}${#short-name}", null, null, "DCHECKED_TREE");
		initEClass(dComboCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "ui",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, displayCClass, "DCombo", "icons/attribute-wizard.gif",
				"fr.imag.adele.cadse.cadseg.managers.ui.DComboManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "DCOMBO");
		initEClass(dGroupCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "ui",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, fieldCClass, "DGroup", "",
				"fr.imag.adele.cadse.cadseg.managers.ui.DGroupManager", "${#parent.qualified-name}{.}${#name}", null,
				null, "DGROUP");
		initEAttribute(getDGroup_at_getColumn(), 8208141343082627561L, -8902806869028858107L, "column",
				"DGROUP_at_COLUMN_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, -1, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getDGroup_at_getMakeColumnsEqualWidth(), -770853220475911755L, -9069078970204003940L,
				"makeColumnsEqualWidth", "DGROUP_at_MAKE_COLUMNS_EQUAL_WIDTH_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(dListCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "ui",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, displayCClass, "DList", "icons/attribute-wizard.gif",
				"fr.imag.adele.cadse.cadseg.managers.ui.DListManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "DLIST");
		initEAttribute(getDList_at_getEditableButton(), -1889145482691523736L, -8427847297576369781L,
				"editable-button", "DLIST_at_EDITABLE_BUTTON_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, true, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getDList_at_getOrderButton(), 1220437233353313290L, -7774683019636045133L, "order-button",
				"DLIST_at_ORDER_BUTTON_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getDList_at_getShowFilter(), -3861302025716347820L, -6862326207907758128L, "show-filter",
				"DLIST_at_SHOW_FILTER_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getDList_at_getUpdateButton(), 6775127022721254424L, -7718963863988403149L, "update-button",
				"DLIST_at_UPDATE_BUTTON_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEClass(dSectionCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "ui",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, displayCClass, "DSection", "",
				"fr.imag.adele.cadse.cadseg.managers.ui.DSectionManager", "${#parent.qualified-name}{.}${#name}", null,
				null, "DSECTION");
		initEClass(dSymbolicBitMapUICClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"ui", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, displayCClass, "DSymbolicBitMapUI", null,
				"fr.imag.adele.cadse.cadseg.managers.ui.DSymbolicBitMapUIManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "DSYMBOLIC_BIT_MAP_UI");
		initEAttribute(getDSymbolicBitMapUI_at_getLabels(), -3532976929492154564L, -6235132730010007048L, "labels",
				"DSYMBOLIC_BIT_MAP_UI_at_LABELS_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, IS_LIST);
		initEAttribute(getDSymbolicBitMapUI_at_getNumberColumn(), 4534338717406283545L, -5247477773068267995L,
				"number-column", "DSYMBOLIC_BIT_MAP_UI_at_NUMBER_COLUMN_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, -1, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(dTextCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "ui",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, displayCClass, "DText", "icons/attribute-wizard.gif",
				"fr.imag.adele.cadse.cadseg.managers.ui.DTextManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "DTEXT");
		initEAttribute(getDText_at_getMultiLine(), 1008286326512437374L, -6843707123988243330L, "multi-line",
				"DTEXT_at_MULTI_LINE_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getDText_at_getNoBorder(), 7200567859429656871L, -8414162936505703230L, "no-border",
				"DTEXT_at_NO_BORDER_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getDText_at_getToolTip(), 2227326465421495103L, -8411385347932334308L, "tool-tip",
				"DTEXT_at_TOOL_TIP_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getDText_at_getVerticalSpan(), -5282652402123847801L, -7222283240550819867L, "vertical-span",
				"DTEXT_at_VERTICAL_SPAN_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, 1, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getDText_at_getWrapLine(), 5884356881569957964L, -4613515033011273851L, "wrap-line",
				"DTEXT_at_WRAP_LINE_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEClass(dTreeCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "ui",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, displayCClass, "DTree", "icons/attribute-wizard.gif",
				"fr.imag.adele.cadse.cadseg.managers.ui.DTreeManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "DTREE");
		initEClass(dataModelCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"dataModel", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "DataModel",
				"icons/s4all-16x16-data.gif", "fr.imag.adele.cadse.cadseg.managers.dataModel.DataModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "DATA_MODEL");
		initEReference(getDataModel_lt_getCategories(), -7945345645362330428L, -6556511239629598321L, null,
				"categories", 0, -1, dataModelCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "DATA_MODEL_lt_CATEGORIES", null,
				TWEvol.twImmutable, TWCommitKind.none, TWUpdateKind.none, true, TWDestEvol.immutable, false);
		initEReference(getDataModel_lt_getEnums(), 481774276892837701L, -5624946864095029061L, null, "enums", 0, -1,
				enumTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE, !IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN,
				IS_PART, null, "DATA_MODEL_lt_ENUMS", null, TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEReference(getDataModel_lt_getTypes(), -8613505164697252459L, -5475512000301540245L, null, "types", 0, -1,
				itemTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE, !IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN,
				IS_PART, null, "DATA_MODEL_lt_TYPES", null, TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(dateCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "attributes",
				!IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, attributeCClass, "Date", null,
				"fr.imag.adele.cadse.cadseg.managers.attributes.DateManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "DATE");
		initEClass(displayCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "ui",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, fieldCClass, "Display", "icons/attribute-wizard.gif",
				"fr.imag.adele.cadse.cadseg.managers.ui.DisplayManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "DISPLAY");
		initEAttribute(getDisplay_at_getExtendsIC(), -8011175183072211586L, -6144987244156793128L, "extendsIC",
				"DISPLAY_at_EXTENDS_IC_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getDisplay_at_getExtendsMC(), 4455243460342533434L, -8056706925048991501L, "extendsMC",
				"DISPLAY_at_EXTENDS_MC_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getDisplay_at_getExtendsUI(), -7349970930805423509L, -7235143270055395060L, "extendsUI",
				"DISPLAY_at_EXTENDS_UI_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEClass(doubleCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "attributes",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, attributeCClass, "Double", "icons/attribute.gif",
				"fr.imag.adele.cadse.cadseg.managers.attributes.DoubleManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "DOUBLE");
		initEClass(dynamicActionsCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"actions", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, menuAbstractCClass, "DynamicActions", null,
				"fr.imag.adele.cadse.cadseg.managers.actions.DynamicActionsManager", "",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "DYNAMIC_ACTIONS");
		initEClass(eclipseComposerCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"build.composer", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, composerCClass, "EclipseComposer",
				"icons/composer.gif", "fr.imag.adele.cadse.cadseg.managers.build.composer.EclipseComposerManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "ECLIPSE_COMPOSER");
		initEReference(getEclipseComposer_lt_getComposerLinks(), 1460714381372705207L, -5118066405861635004L, null,
				"composer-links", 0, -1, composerLinkCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "ECLIPSE_COMPOSER_lt_COMPOSER_LINKS", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(eclipseExporterCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"build.exporter", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, exporterCClass, "EclipseExporter",
				"icons/exporter.gif", "fr.imag.adele.cadse.cadseg.managers.build.exporter.EclipseExporterManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "ECLIPSE_EXPORTER");
		initEClass(eclipseReExporterCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"build.exporter", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, exporterCClass, "EclipseReExporter",
				"icons/exporter.gif", "fr.imag.adele.cadse.cadseg.managers.build.exporter.EclipseReExporterManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "ECLIPSE_RE_EXPORTER");
		initEClass(enumCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "attributes",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, attributeCClass, "Enum", "icons/attribute.gif",
				"fr.imag.adele.cadse.cadseg.managers.attributes.EnumManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "ENUM");
		initEAttribute(getEnum_at_getEnumClazz(), -231470803140063460L, -5738689726168192725L, "enum-clazz",
				"ENUM_at_ENUM_CLAZZ_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEReference(getEnum_lt_getEnumType(), 8944357282419066809L, -8793260785729866685L, null, "enum-type", 0, 1,
				enumTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE, IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN,
				!IS_PART, null, "ENUM_lt_ENUM_TYPE", null, TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getEnum_at_getValues(), 4895896025957680706L, -5216719478761370902L, "values",
				"ENUM_at_VALUES_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				IS_LIST);
		initEClass(enumTypeCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "dataModel",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "EnumType",
				"icons/EnumerationDefintionElement.gif",
				"fr.imag.adele.cadse.cadseg.managers.dataModel.EnumTypeManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "ENUM_TYPE");
		initEAttribute(getEnumType_at_getJavaClass(), -8698456247826561279L, -8023612618634403851L, "java-class",
				"ENUM_TYPE_at_JAVA_CLASS_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null,
				0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getEnumType_at_getMustBeGenerated(), 4661056250780340172L, -8185415425128734911L,
				"must-be-generated", "ENUM_TYPE_at_MUST_BE_GENERATED_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, true, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getEnumType_at_getValues(), -2854433079837963630L, -7511419690549926041L, "values",
				"ENUM_TYPE_at_VALUES_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				IS_LIST);
		initEClass(exporterCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"build.exporter", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, runtimeItemCClass, "Exporter",
				"icons/exporter.gif", "fr.imag.adele.cadse.cadseg.managers.build.exporter.ExporterManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "EXPORTER");
		initEAttribute(getExporter_at_getTypes(), 2259673960018038605L, -7581778286575692214L, "types",
				"EXPORTER_at_TYPES_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				IS_LIST);
		initEClass(extItemCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "dataModel",
				!IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, itemCClass, "ExtItem", null,
				"fr.imag.adele.cadse.cadseg.managers.dataModel.ExtItemManager", "${#parent.qualified-name}{.}${#name}",
				null, null, "EXT_ITEM");
		initEClass(extItemTypeCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"dataModel", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, typeDefinitionCClass, "ExtItemType",
				"icons/ext-itemtype-icon.gif", "fr.imag.adele.cadse.cadseg.managers.dataModel.ExtItemTypeManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "EXT_ITEM_TYPE");
		initEReference(getExtItemType_lt_getRefType(), -2175556445056709947L, -7099569846512351398L, null, "ref-type",
				0, 1, itemTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "EXT_ITEM_TYPE_lt_REF_TYPE", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(fieldCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "ui",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, runtimeItemCClass, "Field", "icons/attribute.gif",
				"fr.imag.adele.cadse.cadseg.managers.ui.FieldManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "FIELD");
		initEReference(getField_lt_getAttribute(), 777820218802259351L, -9007700401303737102L, null, "attribute", 1, 1,
				attributeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE, IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN,
				!IS_PART, "self.<-parent:Manager.item-type.super-type*.attributes", "FIELD_lt_ATTRIBUTE", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getField_at_getEditable(), 1477551274833627594L, -5555186704688979989L, "editable",
				"FIELD_at_EDITABLE_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEReference(getField_lt_getIc(), -2249876041581050440L, -6699862624213558514L, null, "ic", 0, 1,
				interactionControllerCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "FIELD_lt_IC", null, TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getField_at_getLabel(), 4378618301619521346L, -5742914646547451705L, "label", "FIELD_at_LABEL_",
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, "", 0, !IS_OBJECT_HIDDEN,
				IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEReference(getField_lt_getMc(), 4326016171745297528L, -5951497895072493162L, null, "mc", 0, 1,
				modelControllerCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "FIELD_lt_MC", null, TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEReference(getField_lt_getOverwritefield(), -1237665475126276737L, -6798676010783108205L, null,
				"overwritefield", 0, 1, fieldCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "FIELD_lt_OVERWRITEFIELD", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getField_at_getPosition(), -7097209760980647644L, -8348869829879113372L, "position",
				"FIELD_at_POSITION_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, EPosLabel.defaultpos,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEClass(fileContentModelCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"content", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, resourceContentModelCClass, "FileContentModel",
				"icons/FileContentModel.gif", "fr.imag.adele.cadse.cadseg.managers.content.FileContentModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "FILE_CONTENT_MODEL");
		initEAttribute(getFileContentModel_at_getFileName(), -6176182539240255591L, -6581875066891605703L, "file-name",
				"FILE_CONTENT_MODEL_at_FILE_NAME_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge,
				true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEAttribute(getFileContentModel_at_getFilePath(), 8238779106934737224L, -7083104083454233635L, "file-path",
				"FILE_CONTENT_MODEL_at_FILE_PATH_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge,
				true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEClass(folderContentModelCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"content", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, resourceContentModelCClass, "FolderContentModel",
				"icons/FolderContentModel.gif",
				"fr.imag.adele.cadse.cadseg.managers.content.FolderContentModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "FOLDER_CONTENT_MODEL");
		initEReference(getFolderContentModel_lt_getContentModel(), 1392733222400773045L, -7683274692936371910L, null,
				"content-model", 0, -1, resourceContentModelCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "FOLDER_CONTENT_MODEL_lt_CONTENT_MODEL", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getFolderContentModel_at_getFolderPath(), -4306595966194136131L, -7330822802877986112L,
				"folder-path", "FOLDER_CONTENT_MODEL_at_FOLDER_PATH_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(folderExporterCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"build.exporter", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, eclipseExporterCClass, "FolderExporter",
				"icons/exporter.gif", "fr.imag.adele.cadse.cadseg.managers.build.exporter.FolderExporterManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "FOLDER_EXPORTER");
		initEAttribute(getFolderExporter_at_getPath(), 4027409674747858035L, -5836736507002807123L, "path",
				"FOLDER_EXPORTER_at_PATH_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null,
				0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		bindExt(itemCClass, generateInformationCClass);
		initEAttribute(getGenerateInformation_at_getCSTName(), 8049074177537755242L, -8449265226062501704L, "CSTName",
				"GENERATE_INFORMATION_at_CSTNAME_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge,
				true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		bindExt(itemCClass, groupExtItemCClass);
		initEReference(getGroupExtItem_lt_getMemberOf(), 5210245649367190375L, -8092863085133141386L, null, "memberOf",
				0, 1, itemCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, !IS_REQUIRE, !IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN,
				!IS_PART, null, "GROUP_EXT_ITEM_lt_MEMBER_OF", null, TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEReference(getGroupExtItem_lt_getMembers(), 334171466185589700L, -5911395334519968004L, null, "members", 0,
				-1, itemCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, !IS_REQUIRE, !IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN,
				!IS_PART, null, "GROUP_EXT_ITEM_lt_MEMBERS", null, TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(groupOfAttributesCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"attributes", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, attributeCClass, "GroupOfAttributes", "",
				"fr.imag.adele.cadse.cadseg.managers.attributes.GroupOfAttributesManager",
				"${#parent.qualified-name}{.}${#name}", null, null, "GROUP_OF_ATTRIBUTES");
		initEReference(getGroupOfAttributes_lt_getAttributes(), 7007935655592151478L, -7384383007614959290L, null,
				"attributes", 1, -1, attributeCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "GROUP_OF_ATTRIBUTES_lt_ATTRIBUTES", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getGroupOfAttributes_at_getColumn(), -2013277734244366476L, -7265081187509287147L, "column",
				"GROUP_OF_ATTRIBUTES_at_COLUMN_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				-1, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEReference(getGroupOfAttributes_lt_getSuperGroup(), -190246439964882045L, -7225061417444536225L, null,
				"superGroup", 0, 1, groupOfAttributesCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "GROUP_OF_ATTRIBUTES_lt_SUPER_GROUP", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(iC_AbstractForBrowser_ComboCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN,
				null, "ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, iC_WithTitleForDialogCClass,
				"IC_AbstractForBrowser_Combo", "icons/uc.gif",
				"fr.imag.adele.cadse.cadseg.managers.ic.IC_AbstractForBrowser_ComboManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "IC_ABSTRACT_FOR_BROWSER_COMBO");
		initEClass(iC_AbstractForCheckedCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN,
				null, "ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, interactionControllerCClass,
				"IC_AbstractForChecked", null, "fr.imag.adele.cadse.cadseg.managers.ic.IC_AbstractForCheckedManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "IC_ABSTRACT_FOR_CHECKED");
		initEClass(iC_AbstractForListCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, iC_WithTitleForDialogCClass, "IC_AbstractForList",
				"icons/uc.gif", "fr.imag.adele.cadse.cadseg.managers.ic.IC_AbstractForListManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "IC_ABSTRACT_FOR_LIST");
		initEClass(iC_AbstractTreeDialogForList_Browser_ComboCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT,
				!IS_INSTANCE_IS_HIDDEN, null, "ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT,
				iC_WithTitleForDialogCClass, "IC_AbstractTreeDialogForList_Browser_Combo", "icons/uc.gif",
				"fr.imag.adele.cadse.cadseg.managers.ic.IC_AbstractTreeDialogForList_Browser_ComboManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO");
		initEClass(iC_BooleanTextCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "ic",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, interactionControllerCClass, "IC_BooleanText", null,
				"fr.imag.adele.cadse.cadseg.managers.ic.IC_BooleanTextManager",
				"${#parent-unique-name}{.}${#short-name}", null, null, "IC_BOOLEAN_TEXT");
		initEClass(iC_EnumForBrowser_ComboCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN,
				null, "ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, iC_AbstractForBrowser_ComboCClass,
				"IC_EnumForBrowser_Combo", "icons/uc.gif",
				"fr.imag.adele.cadse.cadseg.managers.ic.IC_EnumForBrowser_ComboManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "IC_ENUM_FOR_BROWSER_COMBO");
		initEClass(iC_EnumForListCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "ic",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, interactionControllerCClass, "IC_EnumForList", "icons/uc.gif",
				"fr.imag.adele.cadse.cadseg.managers.ic.IC_EnumForListManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "IC_ENUM_FOR_LIST");
		initEClass(iC_FileResourceForBrowser_Combo_ListCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT,
				!IS_INSTANCE_IS_HIDDEN, null, "ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT,
				iC_ResourceTreeDialogForBrowser_Combo_ListCClass, "IC_FileResourceForBrowser_Combo_List",
				"icons/uc.gif", "fr.imag.adele.cadse.cadseg.managers.ic.IC_FileResourceForBrowser_Combo_ListManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST");
		initEAttribute(getIC_FileResourceForBrowser_Combo_List_at_getPatternSelectFile(), 3697232862387388740L,
				-7241975165949847419L, "pattern-select-file",
				"IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST_at_PATTERN_SELECT_FILE_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getIC_FileResourceForBrowser_Combo_List_at_getSelectFolder(), 224115798046034343L,
				-7181404964779948829L, "select-folder", "IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST_at_SELECT_FOLDER_",
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN,
				!IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(iC_FolderResource_ForBrowser_Combo_ListCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT,
				!IS_INSTANCE_IS_HIDDEN, null, "ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT,
				interactionControllerCClass, "IC_FolderResource_ForBrowser_Combo_List", "icons/uc.gif",
				"fr.imag.adele.cadse.cadseg.managers.ic.IC_FolderResource_ForBrowser_Combo_ListManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "IC_FOLDER_RESOURCE_FOR_BROWSER_COMBO_LIST");
		initEClass(iC_JarResourceForBrowser_Combo_ListCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT,
				!IS_INSTANCE_IS_HIDDEN, null, "ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT,
				iC_ResourceTreeDialogForBrowser_Combo_ListCClass, "IC_JarResourceForBrowser_Combo_List",
				"icons/uc.gif", "fr.imag.adele.cadse.cadseg.managers.ic.IC_JarResourceForBrowser_Combo_ListManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "IC_JAR_RESOURCE_FOR_BROWSER_COMBO_LIST");
		initEClass(iC_JavaClassForBrowser_ComboCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT,
				!IS_INSTANCE_IS_HIDDEN, null, "ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT,
				interactionControllerCClass, "IC_JavaClassForBrowser_Combo", "icons/uc.gif",
				"fr.imag.adele.cadse.cadseg.managers.ic.IC_JavaClassForBrowser_ComboManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "IC_JAVA_CLASS_FOR_BROWSER_COMBO");
		initEAttribute(getIC_JavaClassForBrowser_Combo_at_getFilter(), -4181540902879672491L, -8614165809545687034L,
				"filter", "IC_JAVA_CLASS_FOR_BROWSER_COMBO_at_FILTER_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getIC_JavaClassForBrowser_Combo_at_getStyle(), 2221260749837584618L, -8998274598135222428L,
				"style", "IC_JAVA_CLASS_FOR_BROWSER_COMBO_at_STYLE_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(iC_LinkForBrowser_Combo_ListCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT,
				!IS_INSTANCE_IS_HIDDEN, null, "ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT,
				iC_AbstractTreeDialogForList_Browser_ComboCClass, "IC_LinkForBrowser_Combo_List", "icons/uc.gif",
				"fr.imag.adele.cadse.cadseg.managers.ic.IC_LinkForBrowser_Combo_ListManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "IC_LINK_FOR_BROWSER_COMBO_LIST");
		initEClass(iC_PartLinkForBrowser_Combo_ListCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT,
				!IS_INSTANCE_IS_HIDDEN, null, "ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT,
				iC_LinkForBrowser_Combo_ListCClass, "IC_PartLinkForBrowser_Combo_List", "icons/uc.gif",
				"fr.imag.adele.cadse.cadseg.managers.ic.IC_PartLinkForBrowser_Combo_ListManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "IC_PART_LINK_FOR_BROWSER_COMBO_LIST");
		initEClass(iC_ResourceTreeDialogForBrowser_Combo_ListCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT,
				!IS_INSTANCE_IS_HIDDEN, null, "ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT,
				iC_AbstractTreeDialogForList_Browser_ComboCClass, "IC_ResourceTreeDialogForBrowser_Combo_List",
				"icons/uc.gif",
				"fr.imag.adele.cadse.cadseg.managers.ic.IC_ResourceTreeDialogForBrowser_Combo_ListManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "IC_RESOURCE_TREE_DIALOG_FOR_BROWSER_COMBO_LIST");
		initEAttribute(getIC_ResourceTreeDialogForBrowser_Combo_List_at_getSelectTypeRoot(), 158972638726409199L,
				-6195528901513586171L, "select-type-root",
				"IC_RESOURCE_TREE_DIALOG_FOR_BROWSER_COMBO_LIST_at_SELECT_TYPE_ROOT_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, -1, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(iC_StaticArrayOfObjectForBrowser_ComboCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT,
				!IS_INSTANCE_IS_HIDDEN, null, "ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT,
				iC_AbstractForBrowser_ComboCClass, "IC_StaticArrayOfObjectForBrowser_Combo", "icons/uc.gif",
				"fr.imag.adele.cadse.cadseg.managers.ic.IC_StaticArrayOfObjectForBrowser_ComboManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "IC_STATIC_ARRAY_OF_OBJECT_FOR_BROWSER_COMBO");
		initEAttribute(getIC_StaticArrayOfObjectForBrowser_Combo_at_getValues(), -2122043224732973302L,
				-7217956470829475539L, "values", "IC_STATIC_ARRAY_OF_OBJECT_FOR_BROWSER_COMBO_at_VALUES_",
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN,
				IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, IS_LIST);
		initEClass(iC_StringListForListCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, iC_AbstractForListCClass, "IC_StringListForList",
				"icons/uc.gif", "fr.imag.adele.cadse.cadseg.managers.ic.IC_StringListForListManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "IC_STRING_LIST_FOR_LIST");
		initEAttribute(getIC_StringListForList_at_getAllowDuplicate(), 2410722121598453216L, -7038654884474977305L,
				"allowDuplicate", "IC_STRING_LIST_FOR_LIST_at_ALLOW_DUPLICATE_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, true, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(iC_WithTitleForDialogCClass, IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, interactionControllerCClass, "IC_WithTitleForDialog",
				"", "fr.imag.adele.cadse.cadseg.managers.ic.IC_WithTitleForDialogManager",
				"${#parent.qualified-name}{.}${#name}", null, null, "IC_WITH_TITLE_FOR_DIALOG");
		initEAttribute(getIC_WithTitleForDialog_at_getSelectMessage(), -6065290586918665378L, -6698551702688082668L,
				"select-message", "IC_WITH_TITLE_FOR_DIALOG_at_SELECT_MESSAGE_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getIC_WithTitleForDialog_at_getSelectTitle(), -5321083344468687949L, -7101016380608498221L,
				"select-title", "IC_WITH_TITLE_FOR_DIALOG_at_SELECT_TITLE_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(integerCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "attributes",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, attributeCClass, "Integer", "icons/attribute.gif",
				"fr.imag.adele.cadse.cadseg.managers.attributes.IntegerManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "INTEGER");
		initEClass(interactionControllerCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, runtimeItemCClass, "InteractionController",
				"icons/uc.gif", "fr.imag.adele.cadse.cadseg.managers.ic.InteractionControllerManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "INTERACTION_CONTROLLER");
		initEClass(itemCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "dataModel",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "Item", null,
				"fr.imag.adele.cadse.cadseg.managers.dataModel.ItemManager", "${#parent.qualified-name}{.}${#name}",
				null, null, "ITEM");
		initEAttribute(getItem_at_getTWVersion(), 5683278655808160617L, -6179758865453391277L, "TW-version",
				"ITEM_at_TW_VERSION_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, -1, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getItem_at_getCommittedBy(), 998170469921669137L, -6873486146817634620L, "committedBy",
				"ITEM_at_COMMITTED_BY_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getItem_at_getCommittedDate(), -4675249962261656049L, -7160158777930594704L, "committedDate",
				"ITEM_at_COMMITTED_DATE_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, 0L, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEReference(getItem_lt_getContents(), 8033882148286383543L, -8197074762269073275L, null, "contents", 0, 1,
				contentItemTypeCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "ITEM_lt_CONTENTS", null, TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getItem_at_getDisplayName(), 1865208505949703968L, -6892177621014954501L, "display-name",
				"ITEM_at_DISPLAY_NAME_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getItem_at_getId(), -675287697173888015L, -6638302667913588645L, "id", "ITEM_at_ID_",
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN,
				!IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEReference(getItem_lt_getInstanceOf(), -5034615124846622777L, -6427457879428994639L, null, "instance-of",
				1, -1, itemTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "ITEM_lt_INSTANCE_OF", null, TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getItem_at_getIsvalid(), -4304828647074477792L, -5996088997888596293L, "isvalid",
				"ITEM_at_ISVALID_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, true, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getItem_at_getItemHidden(), -5574682956601668045L, -8879006428971758126L, "item-hidden",
				"ITEM_at_ITEM_HIDDEN_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getItem_at_getItemReadonly(), -514220199533985161L, -5292919862502636284L, "item-readonly",
				"ITEM_at_ITEM_READONLY_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false,
				0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEReference(getItem_lt_getModifiedAttributes(), 6860478510892469546L, -5393898762797096289L, null,
				"modified-attributes", 0, -1, attributeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "ITEM_lt_MODIFIED_ATTRIBUTES", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getItem_at_getName(), -5897991176033580287L, -5274262363043617781L, "name", "ITEM_at_NAME_",
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN,
				!IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEReference(getItem_lt_getParent(), -9210349103650353476L, -5186912746184418128L, null, "parent", 0, 1,
				itemCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, !IS_REQUIRE, !IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN,
				!IS_PART, null, "ITEM_lt_PARENT", null, TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge,
				true, TWDestEvol.immutable, false);
		initEAttribute(getItem_at_getQualifiedName(), -4013075633635769334L, -6731417994443626601L, "qualified-name",
				"ITEM_at_QUALIFIED_NAME_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null,
				0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getItem_at_getRequireNewRev(), 2369321910189510127L, -7051953162843256155L, "requireNewRev",
				"ITEM_at_REQUIRE_NEW_REV_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false,
				0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getItem_at_getRevModified(), -2993606101006007885L, -8225153137345016075L, "revModified",
				"ITEM_at_REV_MODIFIED_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEClass(itemTypeCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"dataModel", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, typeDefinitionCClass, "ItemType",
				"icons/itemtype-icon.gif", "fr.imag.adele.cadse.cadseg.managers.dataModel.ItemTypeManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "ITEM_TYPE");
		initEAttribute(getItemType_at_getCustomManager(), -8531109478260063301L, -8460637860232470261L,
				"custom-manager", "ITEM_TYPE_at_CUSTOM_MANAGER_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, false, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getItemType_at_getDisplayNameTemplate(), 4979361582769653928L, -6967639935405578880L,
				"display-name-template", "ITEM_TYPE_at_DISPLAY_NAME_TEMPLATE_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getItemType_at_getHasContent(), 5247025605029676870L, -6528382653175509451L, "has-content",
				"ITEM_TYPE_at_HAS_CONTENT_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, true,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getItemType_at_getHasShortName(), -5456801827180493204L, -7364932128250437197L,
				"has-short-name", "ITEM_TYPE_at_HAS_SHORT_NAME_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, false, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getItemType_at_getHasUniqueName(), -18784406713647075L, -5317793615790274887L,
				"has-unique-name", "ITEM_TYPE_at_HAS_UNIQUE_NAME_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, false, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getItemType_at_getIcon(), -1144861058683682601L, -5054727362201685967L, "icon",
				"ITEM_TYPE_at_ICON_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getItemType_at_getIsInstanceAbstract(), 5507383460357294372L, -6983966127930137732L,
				"is-instance-abstract", "ITEM_TYPE_at_IS_INSTANCE_ABSTRACT_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getItemType_at_getIsInstanceHidden(), 1799372169278082441L, -7401884421300669149L,
				"is-instance-hidden", "ITEM_TYPE_at_IS_INSTANCE_HIDDEN_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, false, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getItemType_at_getIsMetaItemType(), 8775331757003784320L, -4980801066555690990L,
				"is-meta-item-type", "ITEM_TYPE_at_IS_META_ITEM_TYPE_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, false, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getItemType_at_getIsRootElement(), 1827456314227314450L, -7871971291291372499L,
				"is-root-element", "ITEM_TYPE_at_IS_ROOT_ELEMENT_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, true, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getItemType_at_getItemFactory(), 928977464291509664L, -7374040401952831451L, "item-factory",
				"ITEM_TYPE_at_ITEM_FACTORY_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEAttribute(getItemType_at_getItemManager(), -4514668927160858933L, -7639174229993242797L, "item-manager",
				"ITEM_TYPE_at_ITEM_MANAGER_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEReference(getItemType_lt_getLinkType(), 7525975296182863367L, -6733988287527508841L, null, "link-type", 0,
				-1, itemTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "ITEM_TYPE_lt_LINK_TYPE", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getItemType_at_getManagerClass(), 6361710293437859050L, -7018305850918391318L, "manager-class",
				"ITEM_TYPE_at_MANAGER_CLASS_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEAttribute(getItemType_at_getMessageErrorId(), 4512085134478493174L, -6357395802558953400L,
				"message-error-id", "ITEM_TYPE_at_MESSAGE_ERROR_ID_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getItemType_at_getOverwriteDefaultPages(), -1404863301255347812L, -5472824239844933052L,
				"overwrite-default-pages", "ITEM_TYPE_at_OVERWRITE_DEFAULT_PAGES_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, true, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getItemType_at_getPackageName(), -6682418256858757360L, -5682205467483532955L, "package-name",
				"ITEM_TYPE_at_PACKAGE_NAME_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEAttribute(getItemType_at_getQualifiedNameTemplate(), 3514789503318839197L, -7698269991938166596L,
				"qualified-name-template", "ITEM_TYPE_at_QUALIFIED_NAME_TEMPLATE_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEReference(getItemType_lt_getSubTypes(), 2282425925394124430L, -6186682847072344900L, null, "sub-types", 0,
				-1, itemTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "ITEM_TYPE_lt_SUB_TYPES",
				getItemType_lt_getSuperType(), TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				TWDestEvol.immutable, false);
		initEReference(getItemType_lt_getSuperType(), -5956676207963255282L, -7590996803390084650L, null, "super-type",
				0, -1, itemTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "ITEM_TYPE_lt_SUPER_TYPE",
				getItemType_lt_getSubTypes(), TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				TWDestEvol.immutable, false);
		initEAttribute(getItemType_at_getValidateNameRe(), -3976572090218688758L, -6551345840603608463L,
				"validate-name-re", "ITEM_TYPE_at_VALIDATE_NAME_RE_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEReference(getItemType_lt_getWcListeners(), 169955203729212853L, -7020814896192527669L, null,
				"wcListeners", 0, -1, wCListenerCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "ITEM_TYPE_lt_WC_LISTENERS", null,
				TWEvol.twImmutable, TWCommitKind.none, TWUpdateKind.none, true, TWDestEvol.immutable, false);
		initEClass(javaElementTreeControllerCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN,
				null, "ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, interactionControllerCClass,
				"JavaElementTreeController", "icons/uc.gif",
				"fr.imag.adele.cadse.cadseg.managers.ic.JavaElementTreeControllerManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "JAVA_ELEMENT_TREE_CONTROLLER");
		initEClass(javaExporterCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"build.exporter", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, eclipseExporterCClass, "JavaExporter",
				"icons/exporter.gif", "fr.imag.adele.cadse.cadseg.managers.build.exporter.JavaExporterManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "JAVA_EXPORTER");
		initEClass(javaFileContentModelCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"content", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, fileContentModelCClass, "JavaFileContentModel",
				"icons/JavaFileContentModel.gif",
				"fr.imag.adele.cadse.cadseg.managers.content.JavaFileContentModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "JAVA_FILE_CONTENT_MODEL");
		initEAttribute(getJavaFileContentModel_at_getClassName(), 1389524059569081457L, -6572846635794588182L,
				"class-name", "JAVA_FILE_CONTENT_MODEL_at_CLASS_NAME_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getJavaFileContentModel_at_getPackageName(), 5796925702026446779L, -5175499749821020648L,
				"package-name", "JAVA_FILE_CONTENT_MODEL_at_PACKAGE_NAME_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(javaJarFileContentModelCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN,
				null, "content", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, contentItemTypeCClass,
				"JavaJarFileContentModel", "icons/jar_obj.gif",
				"fr.imag.adele.cadse.cadseg.managers.content.JavaJarFileContentModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "JAVA_JAR_FILE_CONTENT_MODEL");
		initEClass(javaProjectComposerCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"build.composer", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, eclipseComposerCClass, "JavaProjectComposer",
				"icons/composer.gif", "fr.imag.adele.cadse.cadseg.managers.build.composer.JavaProjectComposerManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "JAVA_PROJECT_COMPOSER");
		initEReference(getJavaProjectComposer_lt_getComposerLinks(), -8824278886167131568L, -8394161104011330776L,
				null, "composer-links", 0, -1, composerLinkCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "JAVA_PROJECT_COMPOSER_lt_COMPOSER_LINKS", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(javaProjectContentModelCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN,
				null, "content", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, projectContentModelCClass,
				"JavaProjectContentModel", "icons/JavaProjectContentModel.gif",
				"fr.imag.adele.cadse.cadseg.managers.content.JavaProjectContentModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "JAVA_PROJECT_CONTENT_MODEL");
		initEReference(getJavaProjectContentModel_lt_getContentModel(), 9098153987808644475L, -4861498994335334284L,
				null, "content-model", 0, -1, resourceContentModelCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "JAVA_PROJECT_CONTENT_MODEL_lt_CONTENT_MODEL",
				null, TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getJavaProjectContentModel_at_getHasSourceFolder(), -8273585257557834581L,
				-6004961183475962591L, "has-source-folder", "JAVA_PROJECT_CONTENT_MODEL_at_HAS_SOURCE_FOLDER_",
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, true, 0, !IS_OBJECT_HIDDEN,
				!IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(javaReExporterCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"build.exporter", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, eclipseReExporterCClass, "JavaReExporter",
				"icons/exporter.gif", "fr.imag.adele.cadse.cadseg.managers.build.exporter.JavaReExporterManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "JAVA_RE_EXPORTER");
		initEClass(keyCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "attributes",
				!IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, attributeCClass, "Key", null,
				"fr.imag.adele.cadse.cadseg.managers.attributes.KeyManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "KEY");
		initEClass(linkTypeCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"attributes", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, attributeCClass, "LinkType",
				"icons/linktype-icon.gif", "fr.imag.adele.cadse.cadseg.managers.attributes.LinkTypeManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "LINK_TYPE");
		initEAttribute(getLinkType_at_getTWCoupled(), -4045433623194546824L, -5579399387606556024L, "TWCoupled",
				"LINK_TYPE_at_TWCOUPLED_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getLinkType_at_getTWDestEvol(), 8799229410811724969L, -8558530069012570337L, "TWDestEvol",
				"LINK_TYPE_at_TWDEST_EVOL_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				TWDestEvol.immutable, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEAttribute(getLinkType_at_getAggregation(), -2384219926350575548L, -5067528591067164558L, "aggregation",
				"LINK_TYPE_at_AGGREGATION_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, true,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getLinkType_at_getAnnotation(), 3353478445349292828L, -6230213701710110631L, "annotation",
				"LINK_TYPE_at_ANNOTATION_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getLinkType_at_getComposition(), -8110138141287693992L, -7201442458043250381L, "composition",
				"LINK_TYPE_at_COMPOSITION_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				false, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEReference(getLinkType_lt_getDestination(), 1236744025225707746L, -6427516804473472093L, null,
				"destination", 1, 1, typeDefinitionCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "LINK_TYPE_lt_DESTINATION", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getLinkType_at_getGroup(), 8381608823070084971L, -8090302841120845958L, "group",
				"LINK_TYPE_at_GROUP_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getLinkType_at_getHidden(), 3199990222515685430L, -7031121257244614075L, "hidden",
				"LINK_TYPE_at_HIDDEN_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEReference(getLinkType_lt_getInverseLink(), -2138857207893375608L, -4754589421293930467L, null,
				"inverse-link", 0, 1, linkTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "LINK_TYPE_lt_INVERSE_LINK", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getLinkType_at_getKind(), -8049190393229588948L, -4959784496839446974L, "kind",
				"LINK_TYPE_at_KIND_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, -1, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getLinkType_at_getLinkManager(), -1410540557444560778L, -7609335726543888444L, "link-manager",
				"LINK_TYPE_at_LINK_MANAGER_", TWEvol.twImmutable, TWCommitKind.none, TWUpdateKind.none, true, "", 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getLinkType_at_getMapping(), 6250325500745761262L, -6780288058396218156L, "mapping",
				"LINK_TYPE_at_MAPPING_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getLinkType_at_getMax(), 9144261992895629210L, -4890809679079959102L, "max",
				"LINK_TYPE_at_MAX_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, -1, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getLinkType_at_getMin(), 1198218466826601342L, -6891484286553982129L, "min",
				"LINK_TYPE_at_MIN_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, 0, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getLinkType_at_getPart(), 5720595816634074069L, -4761369048062229951L, "part",
				"LINK_TYPE_at_PART_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getLinkType_at_getRequire(), -6570192446153078024L, -7909113593182029426L, "require",
				"LINK_TYPE_at_REQUIRE_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getLinkType_at_getSelection(), -7589480133145706400L, -5759193675250357126L, "selection",
				"LINK_TYPE_at_SELECTION_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEReference(getLinkType_lt_getSource(), -7285640760647858829L, -7640543082019163810L, null, "source", 1, 1,
				typeDefinitionCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "LINK_TYPE_lt_SOURCE", null, TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(linkTypeTypeCClass, IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "meta",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "LinkTypeType", "",
				"fr.imag.adele.cadse.cadseg.managers.meta.LinkTypeTypeManager", "${#parent.qualified-name}{.}${#name}",
				null, null, "LINK_TYPE_TYPE");
		initEAttribute(getLinkTypeType_at_getCompatibleVersions(), 817623444133789772L, -6900732421147454198L,
				"CompatibleVersions", "LINK_TYPE_TYPE_at_COMPATIBLE_VERSIONS_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, -1, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, IS_LIST);
		initEAttribute(getLinkTypeType_at_getHidden(), -2222075441215486947L, -7434943826359942581L, "Hidden",
				"LINK_TYPE_TYPE_at_HIDDEN_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				false, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEAttribute(getLinkTypeType_at_getIndexOf(), -5397585981698453788L, -9122794046119269296L, "IndexOf",
				"LINK_TYPE_TYPE_at_INDEX_OF_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, -1,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getLinkTypeType_at_getVersion(), 8529320772045130058L, -6159183838194817754L, "Version",
				"LINK_TYPE_TYPE_at_VERSION_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, -1,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getLinkTypeType_at_getReadOnly(), -9091966905554810809L, -5004674071077935911L, "readOnly",
				"LINK_TYPE_TYPE_at_READ_ONLY_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				false, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEAttribute(getLinkTypeType_at_getValid(), 2250056621022268903L, -6959927921354236779L, "valid",
				"LINK_TYPE_TYPE_at_VALID_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEClass(listCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "attributes",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, attributeCClass, "List", null,
				"fr.imag.adele.cadse.cadseg.managers.attributes.ListManager",
				"${#parent-unique-name}{.}${#short-name}", null, null, "LIST");
		initEReference(getList_lt_getSubType(), 3988404447318000604L, -5108059107952634316L, null, "sub-type", 1, 1,
				attributeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE, !IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN,
				IS_PART, null, "LIST_lt_SUB_TYPE", null, TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge,
				true, TWDestEvol.immutable, false);
		initEClass(longCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "attributes",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, attributeCClass, "Long", null,
				"fr.imag.adele.cadse.cadseg.managers.attributes.LongManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "LONG");
		initEClass(mC_BooleanCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "mc",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, modelControllerCClass, "MC_Boolean", "icons/mc.gif",
				"fr.imag.adele.cadse.cadseg.managers.mc.MC_BooleanManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MC_BOOLEAN");
		initEClass(mC_DateCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "mc",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, modelControllerCClass, "MC_Date", null,
				"fr.imag.adele.cadse.cadseg.managers.mc.MC_DateManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MC_DATE");
		initEAttribute(getMC_Date_at_getPattern(), 5124798361169053537L, -9165174600451067019L, "pattern",
				"MC_DATE_at_PATTERN_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 256,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEClass(mC_DestLinkCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "mc",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, mC_LinkCClass, "MC_DestLink", null,
				"fr.imag.adele.cadse.cadseg.managers.mc.MC_DestLinkManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MC_DEST_LINK");
		initEClass(mC_EnumCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "mc",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, modelControllerCClass, "MC_Enum", "icons/mc.gif",
				"fr.imag.adele.cadse.cadseg.managers.mc.MC_EnumManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MC_ENUM");
		initEClass(mC_IntegerCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "mc",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, modelControllerCClass, "MC_Integer", "icons/mc.gif",
				"fr.imag.adele.cadse.cadseg.managers.mc.MC_IntegerManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MC_INTEGER");
		initEAttribute(getMC_Integer_at_getDefaultValue(), -706859907694703680L, -6707106863301107288L,
				"default-value", "MC_INTEGER_at_DEFAULT_VALUE_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, -1, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getMC_Integer_at_getErrorMsgMax(), -7805215120309073393L, -7725483998165661118L,
				"error-msg-max", "MC_INTEGER_at_ERROR_MSG_MAX_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getMC_Integer_at_getErrorMsgMin(), -4155136879002042179L, -7866015059581765966L,
				"error-msg-min", "MC_INTEGER_at_ERROR_MSG_MIN_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getMC_Integer_at_getMax(), 6697075400630419892L, -4958049438002780647L, "max",
				"MC_INTEGER_at_MAX_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, -1, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getMC_Integer_at_getMin(), 7251536929375078983L, -8318973429390533018L, "min",
				"MC_INTEGER_at_MIN_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, -1, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEClass(mC_LinkCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "mc",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, modelControllerCClass, "MC_Link", "icons/mc.gif",
				"fr.imag.adele.cadse.cadseg.managers.mc.MC_LinkManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MC_LINK");
		initEAttribute(getMC_Link_at_getErrorMessage(), -6872474485299264412L, -6294923211211875600L, "error-message",
				"MC_LINK_at_ERROR_MESSAGE_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null,
				0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEClass(mC_LinkToBooleanCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"mc", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, mC_LinkCClass, "MC_LinkToBoolean", "icons/mc.gif",
				"fr.imag.adele.cadse.cadseg.managers.mc.MC_LinkToBooleanManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MC_LINK_TO_BOOLEAN");
		initEClass(mC_ListOfStringCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "mc",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, modelControllerCClass, "MC_ListOfString", "icons/mc.gif",
				"fr.imag.adele.cadse.cadseg.managers.mc.MC_ListOfStringManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MC_LIST_OF_STRING");
		initEAttribute(getMC_ListOfString_at_getMax(), 2933817770597237028L, -6361341852529163140L, "max",
				"MC_LIST_OF_STRING_at_MAX_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, -1,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getMC_ListOfString_at_getMin(), 360686492572008705L, -5390152708324052823L, "min",
				"MC_LIST_OF_STRING_at_MIN_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, -1,
				0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEClass(mC_NameAttributeCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"mc", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, modelControllerCClass, "MC_NameAttribute", null,
				"fr.imag.adele.cadse.cadseg.managers.mc.MC_NameAttributeManager",
				"${#parent.qualified-name}{.}${#name}", null, null, "MC_NAME_ATTRIBUTE");
		initEClass(mC_StringListToEnumListCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN,
				null, "mc", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, modelControllerCClass, "MC_StringListToEnumList",
				"icons/mc.gif", "fr.imag.adele.cadse.cadseg.managers.mc.MC_StringListToEnumListManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MC_STRING_LIST_TO_ENUM_LIST");
		initEClass(mC_StringToJavaElementCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN,
				null, "mc", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, modelControllerCClass, "MC_StringToJavaElement",
				"icons/mc.gif", "fr.imag.adele.cadse.cadseg.managers.mc.MC_StringToJavaElementManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MC_STRING_TO_JAVA_ELEMENT");
		initEClass(managerCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "content",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "Manager", "icons/manager.gif",
				"fr.imag.adele.cadse.cadseg.managers.content.ManagerManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MANAGER");
		initEReference(getManager_lt_getContentModel(), -7690589066975820683L, -8420958270119715253L, null,
				"content-model", 0, 1, contentItemTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "MANAGER_lt_CONTENT_MODEL", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getManager_at_getDisplayNameTemplate(), -7315435047156956727L, -6068186095844201573L,
				"display-name-template", "MANAGER_at_DISPLAY_NAME_TEMPLATE_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEReference(getManager_lt_getExporters(), -1937837271945623130L, -7920773165234134752L, null, "exporters",
				0, -1, exporterCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "MANAGER_lt_EXPORTERS", null, TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getManager_at_getHumanName(), -3618627790623652552L, -5538833086304423242L, "human-name",
				"MANAGER_at_HUMAN_NAME_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getManager_at_getIcon(), 1587504477147316564L, -6881314682192153139L, "icon",
				"MANAGER_at_ICON_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEReference(getManager_lt_getItemType(), -5579828190911969830L, -5438014314786436519L, null, "item-type", 1,
				1, itemTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE,
				IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "MANAGER_lt_ITEM_TYPE", null, TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getManager_at_getMessageErrorId(), 4773699590411602152L, -6412518752974121920L,
				"message-error-id", "MANAGER_at_MESSAGE_ERROR_ID_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getManager_at_getQualifiedNameTemplate(), -3984017638260915676L, -7677994414177222992L,
				"qualified-name-template", "MANAGER_at_QUALIFIED_NAME_TEMPLATE_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getManager_at_getValidPatternId(), -6869233986945332655L, -6596379406324605718L,
				"valid-pattern-id", "MANAGER_at_VALID_PATTERN_ID_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(mappingModelCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"content", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "MappingModel",
				"icons/s4all-16x16-mapping.gif", "fr.imag.adele.cadse.cadseg.managers.content.MappingModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MAPPING_MODEL");
		initEReference(getMappingModel_lt_getManagers(), 2575336675500245209L, -7843174451719788434L, null, "managers",
				0, -1, managerCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "MAPPING_MODEL_lt_MANAGERS", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(menuCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "actions",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, menuAbstractCClass, "Menu", "icons/menu.gif",
				"fr.imag.adele.cadse.cadseg.managers.actions.MenuManager", "",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MENU");
		initEReference(getMenu_lt_getChildren(), 5453276458795775L, -7764413059604959963L, null, "children", 0, -1,
				menuAbstractCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "MENU_lt_CHILDREN", null, TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(menuAbstractCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"actions", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, itemCClass, "MenuAbstract", null,
				"fr.imag.adele.cadse.cadseg.managers.actions.MenuAbstractManager", "",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MENU_ABSTRACT");
		initEAttribute(getMenuAbstract_at_getIcon(), 4436610995914491351L, -6874590897865541161L, "icon",
				"MENU_ABSTRACT_at_ICON_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null,
				256, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getMenuAbstract_at_getLabel(), 1911038908109966670L, -8663838879647067634L, "label",
				"MENU_ABSTRACT_at_LABEL_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null,
				256, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getMenuAbstract_at_getPath(), -4731094401188216586L, -7814800410550555707L, "path",
				"MENU_ABSTRACT_at_PATH_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null,
				256, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEClass(menuActionCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "actions",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, menuAbstractCClass, "MenuAction", "icons/actions.gif",
				"fr.imag.adele.cadse.cadseg.managers.actions.MenuActionManager", "",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MENU_ACTION");
		initEClass(menuGroupCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "actions",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, menuAbstractCClass, "MenuGroup", null,
				"fr.imag.adele.cadse.cadseg.managers.actions.MenuGroupManager", "",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MENU_GROUP");
		initEClass(modelControllerCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "mc",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, runtimeItemCClass, "ModelController", "icons/mc.gif",
				"fr.imag.adele.cadse.cadseg.managers.mc.ModelControllerManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "MODEL_CONTROLLER");
		initEClass(pDEProjectContentModelCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN,
				null, "content", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, javaProjectContentModelCClass,
				"PDEProjectContentModel", "icons/PDEProjectContentModel.gif",
				"fr.imag.adele.cadse.cadseg.managers.content.PDEProjectContentModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "PDEPROJECT_CONTENT_MODEL");
		initEReference(getPDEProjectContentModel_lt_getContentModel(), -6021951036816865220L, -5372875555485671427L,
				null, "content-model", 0, -1, resourceContentModelCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "PDEPROJECT_CONTENT_MODEL_lt_CONTENT_MODEL",
				null, TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(packageContentModelCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"content", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, folderContentModelCClass, "PackageContentModel",
				"icons/FolderContentModel.gif",
				"fr.imag.adele.cadse.cadseg.managers.content.PackageContentModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "PACKAGE_CONTENT_MODEL");
		initEAttribute(getPackageContentModel_at_getPackageName(), -7954100485159237815L, -5803138576705313882L,
				"package-name", "PACKAGE_CONTENT_MODEL_at_PACKAGE_NAME_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(packageListControllerCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"ic", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, interactionControllerCClass, "PackageListController",
				"icons/uc.gif", "fr.imag.adele.cadse.cadseg.managers.ic.PackageListControllerManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "PACKAGE_LIST_CONTROLLER");
		initEClass(pageCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "dataModel",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "Page", "icons/attribute-page-wizard.gif",
				"fr.imag.adele.cadse.cadseg.managers.dataModel.PageManager", "",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "PAGE");
		initEReference(getPage_lt_getAttributes(), -3062246603368412826L, -6202375758648357125L, null, "attributes", 0,
				-1, attributeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "PAGE_lt_ATTRIBUTES", null, TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getPage_at_getDescription(), 9101043956612812450L, -7557369502151991361L, "description",
				"PAGE_at_DESCRIPTION_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getPage_at_getIdRuntime(), -892649153301363899L, -6484338443818496901L, "id-runtime",
				"PAGE_at_ID_RUNTIME_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getPage_at_getIsRemoved(), -1416656732191374508L, -6837833532334265513L, "is-removed",
				"PAGE_at_IS_REMOVED_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEAttribute(getPage_at_getLabel(), -6684875730606210458L, -9156922887543384565L, "label", "PAGE_at_LABEL_",
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN,
				!IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEReference(getPage_lt_getOverwrite(), 4789900369123361160L, -7456432954237581267L, null, "overwrite", 0,
				-1, pageCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE, !IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN,
				!IS_PART, null, "PAGE_lt_OVERWRITE", null, TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getPage_at_getTitle(), -3181137248087094488L, -9008447534735510080L, "title", "PAGE_at_TITLE_",
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN,
				IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(projectContentModelCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"content", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, contentItemTypeCClass, "ProjectContentModel",
				"icons/ProjectContentModel.gif",
				"fr.imag.adele.cadse.cadseg.managers.content.ProjectContentModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "PROJECT_CONTENT_MODEL");
		initEReference(getProjectContentModel_lt_getContentModel(), -7308076877992998510L, -8017203053765955798L, null,
				"content-model", 0, -1, resourceContentModelCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "PROJECT_CONTENT_MODEL_lt_CONTENT_MODEL", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getProjectContentModel_at_getProjectName(), -4482665573468912540L, -5880121386129416553L,
				"project-name", "PROJECT_CONTENT_MODEL_at_PROJECT_NAME_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, "${#qualified-name}", 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(resourceContentModelCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"content", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, contentItemTypeCClass, "ResourceContentModel",
				"icons/ResourceContentModel.gif",
				"fr.imag.adele.cadse.cadseg.managers.content.ResourceContentModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "RESOURCE_CONTENT_MODEL");
		initEClass(runtimeItemCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"dataModel", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "RuntimeItem", "",
				"fr.imag.adele.cadse.cadseg.managers.dataModel.RuntimeItemManager",
				"${#parent.qualified-name}{.}${#name}", null, null, "RUNTIME_ITEM");
		initEAttribute(getRuntimeItem_at_getClassName(), 2372546248453148253L, -5851896545213257575L, "class-name",
				"RUNTIME_ITEM_at_CLASS_NAME_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEAttribute(getRuntimeItem_at_getExtendsClass(), 1710068003698984093L, -5747890720692174695L,
				"extends-class", "RUNTIME_ITEM_at_EXTENDS_CLASS_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, false, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(sourceFolderContentModelCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN,
				null, "content", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, folderContentModelCClass,
				"SourceFolderContentModel", "icons/SourceFolderContentModel.gif",
				"fr.imag.adele.cadse.cadseg.managers.content.SourceFolderContentModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "SOURCE_FOLDER_CONTENT_MODEL");
		initEAttribute(getSourceFolderContentModel_at_getOutputPath(), -7242360231781513041L, -4893014583535785108L,
				"output-path", "SOURCE_FOLDER_CONTENT_MODEL_at_OUTPUT_PATH_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(stringCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "attributes",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, attributeCClass, "String", "icons/attribute.gif",
				"fr.imag.adele.cadse.cadseg.managers.attributes.StringManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "STRING");
		initEAttribute(getString_at_getNotEmpty(), 4886141232023684493L, -8358576447532892837L, "not-empty",
				"STRING_at_NOT_EMPTY_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false, 0,
				!IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEClass(stringToOneResourceModelControllerCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT,
				!IS_INSTANCE_IS_HIDDEN, null, "mc", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, modelControllerCClass,
				"StringToOneResourceModelController", "icons/mc.gif",
				"fr.imag.adele.cadse.cadseg.managers.mc.StringToOneResourceModelControllerManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "STRING_TO_ONE_RESOURCE_MODEL_CONTROLLER");
		initEClass(stringToPackageModelControllerCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT,
				!IS_INSTANCE_IS_HIDDEN, null, "mc", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, modelControllerCClass,
				"StringToPackageModelController", "icons/mc.gif",
				"fr.imag.adele.cadse.cadseg.managers.mc.StringToPackageModelControllerManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "STRING_TO_PACKAGE_MODEL_CONTROLLER");
		initEClass(stringToResourceListModelControllerCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT,
				!IS_INSTANCE_IS_HIDDEN, null, "mc", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, modelControllerCClass,
				"StringToResourceListModelController", "icons/mc.gif",
				"fr.imag.adele.cadse.cadseg.managers.mc.StringToResourceListModelControllerManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "STRING_TO_RESOURCE_LIST_MODEL_CONTROLLER");
		initEClass(structCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "attributes",
				!IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, attributeCClass, "Struct", "icons/attribute.gif",
				"fr.imag.adele.cadse.cadseg.managers.attributes.StructManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "STRUCT");
		initEReference(getStruct_lt_getAttributes(), -5045316267877907338L, -8125262601609031827L, null, "attributes",
				0, -1, attributeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "STRUCT_lt_ATTRIBUTES", null, TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(subContentModelCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"content", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, contentItemTypeCClass, "SubContentModel",
				"icons/SubContentModel.gif", "fr.imag.adele.cadse.cadseg.managers.content.SubContentModelManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "SUB_CONTENT_MODEL");
		initEClass(symbolicBitMapCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"attributes", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, attributeCClass, "SymbolicBitMap", null,
				"fr.imag.adele.cadse.cadseg.managers.attributes.SymbolicBitMapManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "SYMBOLIC_BIT_MAP");
		initEAttribute(getSymbolicBitMap_at_getValues(), 1373396693062862165L, -6464146704624767936L, "values",
				"SYMBOLIC_BIT_MAP_at_VALUES_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, IS_LIST);
		initEClass(timeCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "attributes",
				!IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, longCClass, "Time", null,
				"fr.imag.adele.cadse.cadseg.managers.attributes.TimeManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "TIME");
		initEAttribute(getTime_at_getInitWithTheCurrentTime(), 6045304764054585912L, -6261734856288719979L,
				"init-with-the-current-time", "TIME_at_INIT_WITH_THE_CURRENT_TIME_", TWEvol.twImmutable,
				TWCommitKind.conflict, TWUpdateKind.merge, true, true, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEClass(typeDefinitionCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"dataModel", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, itemCClass, "TypeDefinition",
				"icons/itemtype-icon.gif", "fr.imag.adele.cadse.cadseg.managers.dataModel.TypeDefinitionManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "TYPE_DEFINITION");
		initEReference(getTypeDefinition_lt_getAttributes(), -7786452207538713927L, -7827976980874723314L, null,
				"attributes", 0, -1, attributeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "TYPE_DEFINITION_lt_ATTRIBUTES", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEReference(getTypeDefinition_lt_getCadse(), 9097796322718600730L, -6502331749611633308L, null, "cadse", 1,
				1, cadseCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, !IS_REQUIRE, !IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN,
				!IS_PART, null, "TYPE_DEFINITION_lt_CADSE", null, TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEReference(getTypeDefinition_lt_getCreationPages(), 7112347995446398851L, -4991241798090464375L, null,
				"creation-pages", 0, -1, pageCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "TYPE_DEFINITION_lt_CREATION_PAGES", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEReference(getTypeDefinition_lt_getFields(), -8331130318344401544L, -6311973651578811953L, null, "fields",
				0, -1, fieldCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "TYPE_DEFINITION_lt_FIELDS", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEReference(getTypeDefinition_lt_getGoupsOfAttributes(), -1240042651781478238L, -8346987446140337958L, null,
				"goupsOfAttributes", 0, -1, groupOfAttributesCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "TYPE_DEFINITION_lt_GOUPS_OF_ATTRIBUTES", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getTypeDefinition_at_getIdRuntime(), -7453113792689909903L, -6147878347643489207L, "id-runtime",
				"TYPE_DEFINITION_at_ID_RUNTIME_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEReference(getTypeDefinition_lt_getModificationPages(), -3445051493441191559L, -8029722834114536170L, null,
				"modification-pages", 0, -1, pageCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "TYPE_DEFINITION_lt_MODIFICATION_PAGES", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEReference(getTypeDefinition_lt_getValidators(), -2592261701985025884L, -5087883788075959678L, null,
				"validators", 0, -1, uIValidatorCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "TYPE_DEFINITION_lt_VALIDATORS", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(uIListenerCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "ui",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "UIListener", null,
				"fr.imag.adele.cadse.cadseg.managers.ui.UIListenerManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "UILISTENER");
		initEReference(getUIListener_lt_getFields(), -1198713162447369976L, -4712816681995651207L, null, "fields", 0,
				-1, fieldCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE, !IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN,
				!IS_PART, null, "UILISTENER_lt_FIELDS", null, TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(uIValidatorCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"dataModel", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "UIValidator", "",
				"fr.imag.adele.cadse.cadseg.managers.dataModel.UIValidatorManager",
				"${#parent.qualified-name}{.}${#name}", null, null, "UIVALIDATOR");
		initEReference(getUIValidator_lt_getListenAttributes(), -1509472065291991118L, -4616480388510466688L, null,
				"listenAttributes", 0, -1, attributeCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "UIVALIDATOR_lt_LISTEN_ATTRIBUTES", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEReference(getUIValidator_lt_getOverwrite(), 3852059016216596243L, -9144547244055260141L, null,
				"overwrite", 0, -1, uIValidatorCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "UIVALIDATOR_lt_OVERWRITE", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(uRLCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "attributes",
				!IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, attributeCClass, "URL", null,
				"fr.imag.adele.cadse.cadseg.managers.attributes.URLManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "URL");
		initEClass(uUIDCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "attributes",
				!IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, attributeCClass, "UUID", null,
				"fr.imag.adele.cadse.cadseg.managers.attributes.UUIDManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "UUID");
		initEClass(unresolvedAttributeTypeCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN,
				null, "attributes", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, attributeCClass, "UnresolvedAttributeType",
				null, "fr.imag.adele.cadse.cadseg.managers.attributes.UnresolvedAttributeTypeManager",
				"${#parent-unique-name}{.}${#short-name}", null, null, "UNRESOLVED_ATTRIBUTE_TYPE");
		initEClass(viewCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "view",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "View", "icons/view2.gif",
				"fr.imag.adele.cadse.cadseg.managers.view.ViewManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "VIEW");
		initEAttribute(getView_at_getIcon(), -7708015124775810363L, -5557253155891395404L, "icon", "VIEW_at_ICON_",
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN,
				!IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEReference(getView_lt_getViewItemTypes(), 2362792688293921715L, -6614306368743462923L, null,
				"view-item-types", 0, -1, viewItemTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "VIEW_lt_VIEW_ITEM_TYPES", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(viewDescriptionCClass, IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"view", !IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "ViewDescription", "",
				"fr.imag.adele.cadse.cadseg.managers.view.ViewDescriptionManager",
				"${#parent.qualified-name}{.}${#name}", null, null, "VIEW_DESCRIPTION");
		initEReference(getViewDescription_lt_getRootTypes(), 3486090633924462945L, -8025012224594462748L, null,
				"root-types", 0, -1, typeDefinitionCClass, 0, !IS_OBJECT_HIDDEN, IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "VIEW_DESCRIPTION_lt_ROOT_TYPES", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(viewItemTypeCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "view",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "ViewItemType", "icons/viewitemtype.gif",
				"fr.imag.adele.cadse.cadseg.managers.view.ViewItemTypeManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "VIEW_ITEM_TYPE");
		initEAttribute(getViewItemType_at_getIsRootElement(), -6607170366269338892L, -9133066680182270109L,
				"is-root-element", "VIEW_ITEM_TYPE_at_IS_ROOT_ELEMENT_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, false, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEReference(getViewItemType_lt_getItemType(), -5688876016733110051L, -5605997758840630338L, null,
				"item-type", 1, 1, itemTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE,
				IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "VIEW_ITEM_TYPE_lt_ITEM_TYPE", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEAttribute(getViewItemType_at_getRef(), -8606273520165895331L, -4752509922943585678L, "ref",
				"VIEW_ITEM_TYPE_at_REF_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, false,
				0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT,
				!IS_LIST);
		initEReference(getViewItemType_lt_getViewLinkTypes(), 787725824754598492L, -8285913592121271942L, null,
				"view-link-types", 0, -1, viewLinkTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, IS_PART, null, "VIEW_ITEM_TYPE_lt_VIEW_LINK_TYPES", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(viewLinkTypeCClass, !IS_ROOT_ELMENT, IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "view",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "ViewLinkType", "icons/viewlinktype.gif",
				"fr.imag.adele.cadse.cadseg.managers.view.ViewLinkTypeManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "VIEW_LINK_TYPE");
		initEAttribute(getViewLinkType_at_getAggregation(), 7686578529767278158L, -4727344386265896955L, "aggregation",
				"VIEW_LINK_TYPE_at_AGGREGATION_", TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true,
				true, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_LIST);
		initEAttribute(getViewLinkType_at_getCanCreateItem(), -6640877649708168466L, -6688430980818105700L,
				"can-create-item", "VIEW_LINK_TYPE_at_CAN_CREATE_ITEM_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, true, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getViewLinkType_at_getCanCreateLink(), -8475469012803435144L, -5011219049844774116L,
				"can-create-link", "VIEW_LINK_TYPE_at_CAN_CREATE_LINK_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, true, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEAttribute(getViewLinkType_at_getDisplayCreate(), -7699501583660790719L, -5267421508774392230L,
				"display-create", "VIEW_LINK_TYPE_at_DISPLAY_CREATE_", TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, null, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_LIST);
		initEReference(getViewLinkType_lt_getLinkType(), -5054657734466973711L, -4958925098483611539L, null,
				"link-type", 1, 1, linkTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, !IS_AGGREGATION, IS_REQUIRE,
				IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "VIEW_LINK_TYPE_lt_LINK_TYPE", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(viewModelCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null, "view",
				!IS_INSTANCE_IS_ITEM_TYPE, !IS_ABSTRACT, itemCClass, "ViewModel", "icons/viewmodel.gif",
				"fr.imag.adele.cadse.cadseg.managers.view.ViewModelManager", "${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "VIEW_MODEL");
		initEReference(getViewModel_lt_getViews(), 5076533860390881070L, -6385161897080669083L, null, "views", 0, -1,
				viewCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED, !IS_MUST_BE_INITIALIZED_AT_CREATION_TIME,
				!IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, IS_REQUIRE, !IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN,
				IS_PART, null, "VIEW_MODEL_lt_VIEWS", null, TWEvol.twImmutable, TWCommitKind.conflict,
				TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEClass(wCListenerCClass, !IS_ROOT_ELMENT, !IS_INSTANCE_HAS_CONTENT, !IS_INSTANCE_IS_HIDDEN, null,
				"dataModel", !IS_INSTANCE_IS_ITEM_TYPE, IS_ABSTRACT, itemCClass, "WCListener", null,
				"fr.imag.adele.cadse.cadseg.managers.dataModel.WCListenerManager",
				"${#parent-unique-name}{.}${#short-name}",
				"Name must match pattern [a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*",
				"[a-zA-Z][a-zA-Z0-9_]*((-| )[a-z][a-zA-Z0-9_]*)*", "WCLISTENER");
		initEReference(getWCListener_lt_getListenAttributeDefinitions(), -4612914330590951571L, -4915270252893695935L,
				null, "listenAttributeDefinitions", 0, -1, attributeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "WCLISTENER_lt_LISTEN_ATTRIBUTE_DEFINITIONS",
				null, TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
		initEReference(getWCListener_lt_getListenItemTypes(), -6345884993552364428L, -6666343877383953475L, null,
				"listenItemTypes", 0, -1, itemTypeCClass, 0, !IS_OBJECT_HIDDEN, !IS_CAN_BE_UNDEFINED,
				!IS_MUST_BE_INITIALIZED_AT_CREATION_TIME, !IS_TRANSIENT, !IS_COMPOSITION, IS_AGGREGATION, !IS_REQUIRE,
				!IS_ANNOTATION, !IS_NATIF, !IS_HIDDEN, !IS_PART, null, "WCLISTENER_lt_LISTEN_ITEM_TYPES", null,
				TWEvol.twImmutable, TWCommitKind.conflict, TWUpdateKind.merge, true, TWDestEvol.immutable, false);
	}

	

}
