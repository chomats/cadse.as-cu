/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * 
 * Copyright (C) 2006-2010 Adele Team/LIG/Grenoble University, France
 */
package fr.imag.adele.cadse.core.internal;


import fr.imag.adele.cadse.core.CadseGFactory;
import fr.imag.adele.cadse.core.CadseGPackage;
import fr.imag.adele.cadse.core.ExtendedType;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;
import static fr.imag.adele.cadse.core.CadseGPackage.*;


/**
    @generated
*/
public class CadseGFactoryImpl extends CFactoryImpl implements  CadseGFactory {

	/**
	    @generated
	*/
	public Item create(int eClassIdInPackage) {switch (eClassIdInPackage) {
			 case AJPROJECT_COMPOSER: 
			 case ACTION_EXT_ITEM_TYPE: 
			 case ASPECT_JEXPORTER: 
			 case ASPECT_JPROJECT_CONTENT_MODEL: 
			 case ASPECT_JRE_EXPORTER: 
			 case ATTRIBUTE: 
			 case ATTRIBUTE_ITEM_TYPE: 
			 case BOOLEAN: 
			 case BUILD_MODEL: 
			 case BUILDER: 
			 case CADSE: 
			 case CADSE_DEFINITION: 
			 case COMPOSER: 
			 case COMPOSER_LINK: 
			 case COMPOSITE_ITEM_TYPE: 
			 case COMPUTED_STRING: 
			 case CONFIGURATION_MODEL: 
			 case CONTENT_ITEM: 
			 case CONTENT_ITEM_TYPE: 
			 case DBROWSER: 
			 case DCHECK_BOX: 
			 case DCHECKED_LIST: 
			 case DCHECKED_TREE: 
			 case DCOMBO: 
			 case DGROUP: 
			 case DLIST: 
			 case DSECTION: 
			 case DSYMBOLIC_BIT_MAP_UI: 
			 case DTEXT: 
			 case DTREE: 
			 case DATA_MODEL: 
			 case DATE: 
			 case DISPLAY: 
			 case DOUBLE: 
			 case DYNAMIC_ACTIONS: 
			 case ECLIPSE_COMPOSER: 
			 case ECLIPSE_EXPORTER: 
			 case ECLIPSE_RE_EXPORTER: 
			 case ENUM: 
			 case ENUM_TYPE: 
			 case EXPORTER: 
			 case EXT_ITEM: 
			 case EXT_ITEM_TYPE: 
			 case FIELD: 
			 case FILE_CONTENT_MODEL: 
			 case FOLDER_CONTENT_MODEL: 
			 case FOLDER_EXPORTER: 
			 case GENERATE_INFORMATION: 
			 case GROUP_EXT_ITEM: 
			 case GROUP_OF_ATTRIBUTES: 
			 case IC_ABSTRACT_FOR_BROWSER_COMBO: 
			 case IC_ABSTRACT_FOR_CHECKED: 
			 case IC_ABSTRACT_FOR_LIST: 
			 case IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO: 
			 case IC_BOOLEAN_TEXT: 
			 case IC_ENUM_FOR_BROWSER_COMBO: 
			 case IC_ENUM_FOR_LIST: 
			 case IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST: 
			 case IC_FOLDER_RESOURCE_FOR_BROWSER_COMBO_LIST: 
			 case IC_JAR_RESOURCE_FOR_BROWSER_COMBO_LIST: 
			 case IC_JAVA_CLASS_FOR_BROWSER_COMBO: 
			 case IC_LINK_FOR_BROWSER_COMBO_LIST: 
			 case IC_PART_LINK_FOR_BROWSER_COMBO_LIST: 
			 case IC_RESOURCE_TREE_DIALOG_FOR_BROWSER_COMBO_LIST: 
			 case IC_STATIC_ARRAY_OF_OBJECT_FOR_BROWSER_COMBO: 
			 case IC_STRING_LIST_FOR_LIST: 
			 case IC_WITH_TITLE_FOR_DIALOG: 
			 case INTEGER: 
			 case INTERACTION_CONTROLLER: 
			 case ITEM: 
			 case ITEM_TYPE: 
			 case JAVA_ELEMENT_TREE_CONTROLLER: 
			 case JAVA_EXPORTER: 
			 case JAVA_FILE_CONTENT_MODEL: 
			 case JAVA_JAR_FILE_CONTENT_MODEL: 
			 case JAVA_PROJECT_COMPOSER: 
			 case JAVA_PROJECT_CONTENT_MODEL: 
			 case JAVA_RE_EXPORTER: 
			 case KEY: 
			 case LINK_TYPE: 
			 case LINK_TYPE_TYPE: 
			 case LIST: 
			 case LONG: 
			 case MC_BOOLEAN: 
			 case MC_DATE: 
			 case MC_DEST_LINK: 
			 case MC_ENUM: 
			 case MC_INTEGER: 
			 case MC_LINK: 
			 case MC_LINK_TO_BOOLEAN: 
			 case MC_LIST_OF_STRING: 
			 case MC_NAME_ATTRIBUTE: 
			 case MC_STRING_LIST_TO_ENUM_LIST: 
			 case MC_STRING_TO_JAVA_ELEMENT: 
			 case MANAGER: 
			 case MAPPING_MODEL: 
			 case MENU: 
			 case MENU_ABSTRACT: 
			 case MENU_ACTION: 
			 case MENU_GROUP: 
			 case MODEL_CONTROLLER: 
			 case PDEPROJECT_CONTENT_MODEL: 
			 case PACKAGE_CONTENT_MODEL: 
			 case PACKAGE_LIST_CONTROLLER: 
			 case PAGE: 
			 case PROJECT_CONTENT_MODEL: 
			 case RESOURCE_CONTENT_MODEL: 
			 case RUNTIME_ITEM: 
			 case SOURCE_FOLDER_CONTENT_MODEL: 
			 case STRING: 
			 case STRING_TO_ONE_RESOURCE_MODEL_CONTROLLER: 
			 case STRING_TO_PACKAGE_MODEL_CONTROLLER: 
			 case STRING_TO_RESOURCE_LIST_MODEL_CONTROLLER: 
			 case STRUCT: 
			 case SUB_CONTENT_MODEL: 
			 case SYMBOLIC_BIT_MAP: 
			 case TIME: 
			 case TYPE_DEFINITION: 
			 case UILISTENER: 
			 case UIVALIDATOR: 
			 case URL: 
			 case UUID: 
			 case UNRESOLVED_ATTRIBUTE_TYPE: 
			 case VIEW: 
			 case VIEW_DESCRIPTION: 
			 case VIEW_ITEM_TYPE: 
			 case VIEW_LINK_TYPE: 
			 case VIEW_MODEL: 
			 case WCLISTENER: 
		}
		return getDefaultImplementation();
	}

	/**
	    @generated
	*/
	public CadseGFactoryImpl() {
		super();
	}

	@Override
	public CadseGPackage getCadseGPackage() {
		// TODO Auto-generated method stub
		return null;
	}

	public static CadseGFactory init() {
		// TODO Auto-generated method stub
		return null;
	}

}

