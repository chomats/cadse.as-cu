/** Licensed to the Apache Software Foundation (ASF) under one* or more contributor license agreements.  See the NOTICE file* distributed with this work for additional information* regarding copyright ownership.  The ASF licenses this file* to you under the Apache License, Version 2.0 (the* "License"); you may not use this file except in compliance* with the License.  You may obtain a copy of the License at**   http://www.apache.org/licenses/LICENSE-2.0** Unless required by applicable law or agreed to in writing,* software distributed under the License is distributed on an* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY* KIND, either express or implied.  See the License for the* specific language governing permissions and limitations* under the License.*/
package fr.imag.adele.cadse.core;


import fr.imag.adele.cadse.core.ExtendedType;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.attribute.BooleanAttributeType;
import fr.imag.adele.cadse.core.attribute.EnumAttributeType;
import fr.imag.adele.cadse.core.attribute.IntegerAttributeType;
import fr.imag.adele.cadse.core.attribute.ListAttributeType;
import fr.imag.adele.cadse.core.attribute.LongAttributeType;
import fr.imag.adele.cadse.core.attribute.StringAttributeType;
import fr.imag.adele.cadse.core.enumdef.TWCommitKind;
import fr.imag.adele.cadse.core.enumdef.TWDestEvol;
import fr.imag.adele.cadse.core.enumdef.TWEvol;
import fr.imag.adele.cadse.core.enumdef.TWUpdateKind;
import fr.imag.adele.cadse.core.internal.CadseGPackageImpl;
import fr.imag.adele.cadse.core.ui.EPosLabel;
import java.lang.Integer;
import java.lang.String;
import java.util.UUID;



/**
    @generated
*/
public interface CadseGPackage extends  CPackage {
	
	/**
	    @generated
	*/
	String cNAME = "CadseG";

	/**
	    @generated
	*/
	String cQNAME = "Model.Workspace.CadseG";

	/**
	    @generated
	*/
	int cVERSION = 0;

	/**
	    @generated
	*/
	java.util.UUID cUUID = new java.util.UUID(3121053974857600664L,-9175877163242216985L);

	/**
	    @generated
	*/
	String cDESCRIPTION = "CADSEg specializes the IDE to provide functionalities to edit and create CADSEs";

	/**
	    @generated
	*/
	String cDISPLAYNAME = "CADSEg (Editor and generator of CADSEs)";

	/**
	    @generated
	*/
	String cCLASS_CST = "fr.imag.adele.cadse.core.CadseGCST";

	/**
	    @generated
	*/
	CadseGPackage cINSTANCE = CadseGPackageImpl.init(cNAME, cQNAME, cVERSION, cUUID, cDESCRIPTION, cDISPLAYNAME, cCLASS_CST,"fr.imag.adele.cadse.core.internal.CadseGPackageImpl", fr.imag.adele.cadse.core.CadseGPackage.class);

	/**
	    @generated
	*/
	int AJPROJECT_COMPOSER = 0;

	/**
	    @generated
	*/
	int AJPROJECT_COMPOSER_lt_COMPOSER_LINKS = 1;

	/**
	    @generated
	*/
	int AJPROJECT_COMPOSER_at_SKIP_WEAVING = 2;

	/**
	    @generated
	*/
	int ACTION_EXT_ITEM_TYPE = 3;

	/**
	    @generated
	*/
	int ACTION_EXT_ITEM_TYPE_lt_ACTIONS_MODEL = 4;

	/**
	    @generated
	*/
	int ASPECT_JEXPORTER = 5;

	/**
	    @generated
	*/
	int ASPECT_JPROJECT_CONTENT_MODEL = 6;

	/**
	    @generated
	*/
	int ASPECT_JPROJECT_CONTENT_MODEL_lt_CONTENT_MODEL = 7;

	/**
	    @generated
	*/
	int ASPECT_JRE_EXPORTER = 8;

	/**
	    @generated
	*/
	int ATTRIBUTE = 9;

	/**
	    @generated
	*/
	int ATTRIBUTE_at_TWCOMMIT_KIND = 10;

	/**
	    @generated
	*/
	int ATTRIBUTE_at_TWEVOL = 11;

	/**
	    @generated
	*/
	int ATTRIBUTE_at_TWREV_SPECIFIC = 12;

	/**
	    @generated
	*/
	int ATTRIBUTE_at_TWUPDATE_KIND = 13;

	/**
	    @generated
	*/
	int ATTRIBUTE_at_CANNOT_BE_UNDEFINED = 14;

	/**
	    @generated
	*/
	int ATTRIBUTE_at_DEFAULT_VALUE = 15;

	/**
	    @generated
	*/
	int ATTRIBUTE_at_DEV_GENERATED = 16;

	/**
	    @generated
	*/
	int ATTRIBUTE_at_FINAL = 17;

	/**
	    @generated
	*/
	int ATTRIBUTE_at_HIDDEN_IN_COMPUTED_PAGES = 18;

	/**
	    @generated
	*/
	int ATTRIBUTE_at_ID_RUNTIME = 19;

	/**
	    @generated
	*/
	int ATTRIBUTE_at_IS_LIST = 20;

	/**
	    @generated
	*/
	int ATTRIBUTE_at_MUST_BE_INITIALIZED = 21;

	/**
	    @generated
	*/
	int ATTRIBUTE_at_NATIF = 22;

	/**
	    @generated
	*/
	int ATTRIBUTE_at_REQUIRE = 23;

	/**
	    @generated
	*/
	int ATTRIBUTE_at_TRANSIENT = 24;

	/**
	    @generated
	*/
	int ATTRIBUTE_lt_WC_LISTENS = 25;

	/**
	    @generated
	*/
	int ATTRIBUTE_ITEM_TYPE = 26;

	/**
	    @generated
	*/
	int ATTRIBUTE_ITEM_TYPE_at_DEFAULT_VALUE = 27;

	/**
	    @generated
	*/
	int ATTRIBUTE_ITEM_TYPE_at_RUNTIME_QUALIFIED_CLASS = 28;

	/**
	    @generated
	*/
	int BOOLEAN = 29;

	/**
	    @generated
	*/
	int BUILD_MODEL = 30;

	/**
	    @generated
	*/
	int BUILD_MODEL_lt_COMPOSITE_TYPES = 31;

	/**
	    @generated
	*/
	int BUILDER = 32;

	/**
	    @generated
	*/
	int BUILDER_lt_REQUIRES = 33;

	/**
	    @generated
	*/
	int CADSE = 34;

	/**
	    @generated
	*/
	int CADSE_at_DEFAULT_CONTENT_REPO_URL = 35;

	/**
	    @generated
	*/
	int CADSE_at_DESCRIPTION = 36;

	/**
	    @generated
	*/
	int CADSE_at_EXECUTED = 37;

	/**
	    @generated
	*/
	int CADSE_lt_EXTENDS = 38;

	/**
	    @generated
	*/
	int CADSE_at_ID_DEFINITION = 39;

	/**
	    @generated
	*/
	int CADSE_at_ITEM_REPO_LOGIN = 40;

	/**
	    @generated
	*/
	int CADSE_at_ITEM_REPO_PASSWD = 41;

	/**
	    @generated
	*/
	int CADSE_at_ITEM_REPO_URL = 42;

	/**
	    @generated
	*/
	int CADSE_lt_ITEM_TYPES = 43;

	/**
	    @generated
	*/
	int CADSE_DEFINITION = 44;

	/**
	    @generated
	*/
	int CADSE_DEFINITION_lt_BUILD = 45;

	/**
	    @generated
	*/
	int CADSE_DEFINITION_at_CADSE_NAME = 46;

	/**
	    @generated
	*/
	int CADSE_DEFINITION_at_COMMENTARY = 47;

	/**
	    @generated
	*/
	int CADSE_DEFINITION_lt_CONFIGURATION = 48;

	/**
	    @generated
	*/
	int CADSE_DEFINITION_lt_DATA_MODEL = 49;

	/**
	    @generated
	*/
	int CADSE_DEFINITION_at_ID_RUNTIME = 50;

	/**
	    @generated
	*/
	int CADSE_DEFINITION_at_IMPORTS = 51;

	/**
	    @generated
	*/
	int CADSE_DEFINITION_lt_MAPPING = 52;

	/**
	    @generated
	*/
	int CADSE_DEFINITION_at_PACKAGENAME = 53;

	/**
	    @generated
	*/
	int CADSE_DEFINITION_at_VENDOR_NAME = 54;

	/**
	    @generated
	*/
	int CADSE_DEFINITION_at_VERSION_CADSE = 55;

	/**
	    @generated
	*/
	int CADSE_DEFINITION_lt_VIEW_MODEL = 56;

	/**
	    @generated
	*/
	int COMPOSER = 57;

	/**
	    @generated
	*/
	int COMPOSER_lt_COMPOSER_LINKS = 58;

	/**
	    @generated
	*/
	int COMPOSER_at_TYPES = 59;

	/**
	    @generated
	*/
	int COMPOSER_LINK = 60;

	/**
	    @generated
	*/
	int COMPOSER_LINK_lt_EXPORTERS = 61;

	/**
	    @generated
	*/
	int COMPOSER_LINK_lt_LINK = 62;

	/**
	    @generated
	*/
	int COMPOSITE_ITEM_TYPE = 63;

	/**
	    @generated
	*/
	int COMPOSITE_ITEM_TYPE_lt_BUILDERS = 64;

	/**
	    @generated
	*/
	int COMPOSITE_ITEM_TYPE_lt_COMPOSERS = 65;

	/**
	    @generated
	*/
	int COMPOSITE_ITEM_TYPE_lt_ITEM_TYPE = 66;

	/**
	    @generated
	*/
	int COMPUTED_STRING = 67;

	/**
	    @generated
	*/
	int COMPUTED_STRING_at_EXPRESSION = 68;

	/**
	    @generated
	*/
	int CONFIGURATION_MODEL = 69;

	/**
	    @generated
	*/
	int CONFIGURATION_MODEL_lt_BUILD = 70;

	/**
	    @generated
	*/
	int CONTENT_ITEM = 71;

	/**
	    @generated
	*/
	int CONTENT_ITEM_lt_CHILDREN = 72;

	/**
	    @generated
	*/
	int CONTENT_ITEM_lt_OWNER_ITEM = 73;

	/**
	    @generated
	*/
	int CONTENT_ITEM_TYPE = 74;

	/**
	    @generated
	*/
	int CONTENT_ITEM_TYPE_at_EXTENDS_CLASS = 75;

	/**
	    @generated
	*/
	int DBROWSER = 76;

	/**
	    @generated
	*/
	int DCHECK_BOX = 77;

	/**
	    @generated
	*/
	int DCHECKED_LIST = 78;

	/**
	    @generated
	*/
	int DCHECKED_TREE = 79;

	/**
	    @generated
	*/
	int DCOMBO = 80;

	/**
	    @generated
	*/
	int DGROUP = 81;

	/**
	    @generated
	*/
	int DGROUP_at_COLUMN = 82;

	/**
	    @generated
	*/
	int DGROUP_at_MAKE_COLUMNS_EQUAL_WIDTH = 83;

	/**
	    @generated
	*/
	int DLIST = 84;

	/**
	    @generated
	*/
	int DLIST_at_EDITABLE_BUTTON = 85;

	/**
	    @generated
	*/
	int DLIST_at_ORDER_BUTTON = 86;

	/**
	    @generated
	*/
	int DLIST_at_SHOW_FILTER = 87;

	/**
	    @generated
	*/
	int DLIST_at_UPDATE_BUTTON = 88;

	/**
	    @generated
	*/
	int DSECTION = 89;

	/**
	    @generated
	*/
	int DSYMBOLIC_BIT_MAP_UI = 90;

	/**
	    @generated
	*/
	int DSYMBOLIC_BIT_MAP_UI_at_LABELS = 91;

	/**
	    @generated
	*/
	int DSYMBOLIC_BIT_MAP_UI_at_NUMBER_COLUMN = 92;

	/**
	    @generated
	*/
	int DTEXT = 93;

	/**
	    @generated
	*/
	int DTEXT_at_MULTI_LINE = 94;

	/**
	    @generated
	*/
	int DTEXT_at_NO_BORDER = 95;

	/**
	    @generated
	*/
	int DTEXT_at_TOOL_TIP = 96;

	/**
	    @generated
	*/
	int DTEXT_at_VERTICAL_SPAN = 97;

	/**
	    @generated
	*/
	int DTEXT_at_WRAP_LINE = 98;

	/**
	    @generated
	*/
	int DTREE = 99;

	/**
	    @generated
	*/
	int DATA_MODEL = 100;

	/**
	    @generated
	*/
	int DATA_MODEL_lt_CATEGORIES = 101;

	/**
	    @generated
	*/
	int DATA_MODEL_lt_ENUMS = 102;

	/**
	    @generated
	*/
	int DATA_MODEL_lt_TYPES = 103;

	/**
	    @generated
	*/
	int DATE = 104;

	/**
	    @generated
	*/
	int DISPLAY = 105;

	/**
	    @generated
	*/
	int DISPLAY_at_EXTENDS_IC = 106;

	/**
	    @generated
	*/
	int DISPLAY_at_EXTENDS_MC = 107;

	/**
	    @generated
	*/
	int DISPLAY_at_EXTENDS_UI = 108;

	/**
	    @generated
	*/
	int DOUBLE = 109;

	/**
	    @generated
	*/
	int DYNAMIC_ACTIONS = 110;

	/**
	    @generated
	*/
	int ECLIPSE_COMPOSER = 111;

	/**
	    @generated
	*/
	int ECLIPSE_COMPOSER_lt_COMPOSER_LINKS = 112;

	/**
	    @generated
	*/
	int ECLIPSE_EXPORTER = 113;

	/**
	    @generated
	*/
	int ECLIPSE_RE_EXPORTER = 114;

	/**
	    @generated
	*/
	int ENUM = 115;

	/**
	    @generated
	*/
	int ENUM_at_ENUM_CLAZZ = 116;

	/**
	    @generated
	*/
	int ENUM_lt_ENUM_TYPE = 117;

	/**
	    @generated
	*/
	int ENUM_at_VALUES = 118;

	/**
	    @generated
	*/
	int ENUM_TYPE = 119;

	/**
	    @generated
	*/
	int ENUM_TYPE_at_JAVA_CLASS = 120;

	/**
	    @generated
	*/
	int ENUM_TYPE_at_MUST_BE_GENERATED = 121;

	/**
	    @generated
	*/
	int ENUM_TYPE_at_VALUES = 122;

	/**
	    @generated
	*/
	int EXPORTER = 123;

	/**
	    @generated
	*/
	int EXPORTER_at_TYPES = 124;

	/**
	    @generated
	*/
	int EXT_ITEM = 125;

	/**
	    @generated
	*/
	int EXT_ITEM_TYPE = 126;

	/**
	    @generated
	*/
	int EXT_ITEM_TYPE_lt_REF_TYPE = 127;

	/**
	    @generated
	*/
	int FIELD = 128;

	/**
	    @generated
	*/
	int FIELD_lt_ATTRIBUTE = 129;

	/**
	    @generated
	*/
	int FIELD_at_EDITABLE = 130;

	/**
	    @generated
	*/
	int FIELD_lt_IC = 131;

	/**
	    @generated
	*/
	int FIELD_at_LABEL = 132;

	/**
	    @generated
	*/
	int FIELD_lt_MC = 133;

	/**
	    @generated
	*/
	int FIELD_lt_OVERWRITEFIELD = 134;

	/**
	    @generated
	*/
	int FIELD_at_POSITION = 135;

	/**
	    @generated
	*/
	int FILE_CONTENT_MODEL = 136;

	/**
	    @generated
	*/
	int FILE_CONTENT_MODEL_at_FILE_NAME = 137;

	/**
	    @generated
	*/
	int FILE_CONTENT_MODEL_at_FILE_PATH = 138;

	/**
	    @generated
	*/
	int FOLDER_CONTENT_MODEL = 139;

	/**
	    @generated
	*/
	int FOLDER_CONTENT_MODEL_lt_CONTENT_MODEL = 140;

	/**
	    @generated
	*/
	int FOLDER_CONTENT_MODEL_at_FOLDER_PATH = 141;

	/**
	    @generated
	*/
	int FOLDER_EXPORTER = 142;

	/**
	    @generated
	*/
	int FOLDER_EXPORTER_at_PATH = 143;

	/**
	    @generated
	*/
	int GENERATE_INFORMATION = 144;

	/**
	    @generated
	*/
	int GENERATE_INFORMATION_at_CSTNAME = 145;

	/**
	    @generated
	*/
	int GROUP_EXT_ITEM = 146;

	/**
	    @generated
	*/
	int GROUP_EXT_ITEM_lt_MEMBER_OF = 147;

	/**
	    @generated
	*/
	int GROUP_EXT_ITEM_lt_MEMBERS = 148;

	/**
	    @generated
	*/
	int GROUP_OF_ATTRIBUTES = 149;

	/**
	    @generated
	*/
	int GROUP_OF_ATTRIBUTES_lt_ATTRIBUTES = 150;

	/**
	    @generated
	*/
	int GROUP_OF_ATTRIBUTES_at_COLUMN = 151;

	/**
	    @generated
	*/
	int GROUP_OF_ATTRIBUTES_lt_SUPER_GROUP = 152;

	/**
	    @generated
	*/
	int IC_ABSTRACT_FOR_BROWSER_COMBO = 153;

	/**
	    @generated
	*/
	int IC_ABSTRACT_FOR_CHECKED = 154;

	/**
	    @generated
	*/
	int IC_ABSTRACT_FOR_LIST = 155;

	/**
	    @generated
	*/
	int IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO = 156;

	/**
	    @generated
	*/
	int IC_BOOLEAN_TEXT = 157;

	/**
	    @generated
	*/
	int IC_ENUM_FOR_BROWSER_COMBO = 158;

	/**
	    @generated
	*/
	int IC_ENUM_FOR_LIST = 159;

	/**
	    @generated
	*/
	int IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST = 160;

	/**
	    @generated
	*/
	int IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST_at_PATTERN_SELECT_FILE = 161;

	/**
	    @generated
	*/
	int IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST_at_SELECT_FOLDER = 162;

	/**
	    @generated
	*/
	int IC_FOLDER_RESOURCE_FOR_BROWSER_COMBO_LIST = 163;

	/**
	    @generated
	*/
	int IC_JAR_RESOURCE_FOR_BROWSER_COMBO_LIST = 164;

	/**
	    @generated
	*/
	int IC_JAVA_CLASS_FOR_BROWSER_COMBO = 165;

	/**
	    @generated
	*/
	int IC_JAVA_CLASS_FOR_BROWSER_COMBO_at_FILTER = 166;

	/**
	    @generated
	*/
	int IC_JAVA_CLASS_FOR_BROWSER_COMBO_at_STYLE = 167;

	/**
	    @generated
	*/
	int IC_LINK_FOR_BROWSER_COMBO_LIST = 168;

	/**
	    @generated
	*/
	int IC_PART_LINK_FOR_BROWSER_COMBO_LIST = 169;

	/**
	    @generated
	*/
	int IC_RESOURCE_TREE_DIALOG_FOR_BROWSER_COMBO_LIST = 170;

	/**
	    @generated
	*/
	int IC_RESOURCE_TREE_DIALOG_FOR_BROWSER_COMBO_LIST_at_SELECT_TYPE_ROOT = 171;

	/**
	    @generated
	*/
	int IC_STATIC_ARRAY_OF_OBJECT_FOR_BROWSER_COMBO = 172;

	/**
	    @generated
	*/
	int IC_STATIC_ARRAY_OF_OBJECT_FOR_BROWSER_COMBO_at_VALUES = 173;

	/**
	    @generated
	*/
	int IC_STRING_LIST_FOR_LIST = 174;

	/**
	    @generated
	*/
	int IC_STRING_LIST_FOR_LIST_at_ALLOW_DUPLICATE = 175;

	/**
	    @generated
	*/
	int IC_WITH_TITLE_FOR_DIALOG = 176;

	/**
	    @generated
	*/
	int IC_WITH_TITLE_FOR_DIALOG_at_SELECT_MESSAGE = 177;

	/**
	    @generated
	*/
	int IC_WITH_TITLE_FOR_DIALOG_at_SELECT_TITLE = 178;

	/**
	    @generated
	*/
	int INTEGER = 179;

	/**
	    @generated
	*/
	int INTERACTION_CONTROLLER = 180;

	/**
	    @generated
	*/
	int ITEM = 181;

	/**
	    @generated
	*/
	int ITEM_at_TW_VERSION = 182;

	/**
	    @generated
	*/
	int ITEM_at_COMMITTED_BY = 183;

	/**
	    @generated
	*/
	int ITEM_at_COMMITTED_DATE = 184;

	/**
	    @generated
	*/
	int ITEM_lt_CONTENTS = 185;

	/**
	    @generated
	*/
	int ITEM_at_DISPLAY_NAME = 186;

	/**
	    @generated
	*/
	int ITEM_at_ID = 187;

	/**
	    @generated
	*/
	int ITEM_lt_INSTANCE_OF = 188;

	/**
	    @generated
	*/
	int ITEM_at_ISVALID = 189;

	/**
	    @generated
	*/
	int ITEM_at_ITEM_HIDDEN = 190;

	/**
	    @generated
	*/
	int ITEM_at_ITEM_READONLY = 191;

	/**
	    @generated
	*/
	int ITEM_lt_MODIFIED_ATTRIBUTES = 192;

	/**
	    @generated
	*/
	int ITEM_at_NAME = 193;

	/**
	    @generated
	*/
	int ITEM_lt_PARENT = 194;

	/**
	    @generated
	*/
	int ITEM_at_QUALIFIED_NAME = 195;

	/**
	    @generated
	*/
	int ITEM_at_REQUIRE_NEW_REV = 196;

	/**
	    @generated
	*/
	int ITEM_at_REV_MODIFIED = 197;

	/**
	    @generated
	*/
	int ITEM_TYPE = 198;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_CUSTOM_MANAGER = 199;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_DISPLAY_NAME_TEMPLATE = 200;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_HAS_CONTENT = 201;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_HAS_SHORT_NAME = 202;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_HAS_UNIQUE_NAME = 203;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_ICON = 204;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_IS_INSTANCE_ABSTRACT = 205;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_IS_INSTANCE_HIDDEN = 206;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_IS_META_ITEM_TYPE = 207;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_IS_ROOT_ELEMENT = 208;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_ITEM_FACTORY = 209;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_ITEM_MANAGER = 210;

	/**
	    @generated
	*/
	int ITEM_TYPE_lt_LINK_TYPE = 211;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_MANAGER_CLASS = 212;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_MESSAGE_ERROR_ID = 213;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_OVERWRITE_DEFAULT_PAGES = 214;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_PACKAGE_NAME = 215;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_QUALIFIED_NAME_TEMPLATE = 216;

	/**
	    @generated
	*/
	int ITEM_TYPE_lt_SUB_TYPES = 217;

	/**
	    @generated
	*/
	int ITEM_TYPE_lt_SUPER_TYPE = 218;

	/**
	    @generated
	*/
	int ITEM_TYPE_at_VALIDATE_NAME_RE = 219;

	/**
	    @generated
	*/
	int ITEM_TYPE_lt_WC_LISTENERS = 220;

	/**
	    @generated
	*/
	int JAVA_ELEMENT_TREE_CONTROLLER = 221;

	/**
	    @generated
	*/
	int JAVA_EXPORTER = 222;

	/**
	    @generated
	*/
	int JAVA_FILE_CONTENT_MODEL = 223;

	/**
	    @generated
	*/
	int JAVA_FILE_CONTENT_MODEL_at_CLASS_NAME = 224;

	/**
	    @generated
	*/
	int JAVA_FILE_CONTENT_MODEL_at_PACKAGE_NAME = 225;

	/**
	    @generated
	*/
	int JAVA_JAR_FILE_CONTENT_MODEL = 226;

	/**
	    @generated
	*/
	int JAVA_PROJECT_COMPOSER = 227;

	/**
	    @generated
	*/
	int JAVA_PROJECT_COMPOSER_lt_COMPOSER_LINKS = 228;

	/**
	    @generated
	*/
	int JAVA_PROJECT_CONTENT_MODEL = 229;

	/**
	    @generated
	*/
	int JAVA_PROJECT_CONTENT_MODEL_lt_CONTENT_MODEL = 230;

	/**
	    @generated
	*/
	int JAVA_PROJECT_CONTENT_MODEL_at_HAS_SOURCE_FOLDER = 231;

	/**
	    @generated
	*/
	int JAVA_RE_EXPORTER = 232;

	/**
	    @generated
	*/
	int KEY = 233;

	/**
	    @generated
	*/
	int LINK_TYPE = 234;

	/**
	    @generated
	*/
	int LINK_TYPE_at_TWCOUPLED = 235;

	/**
	    @generated
	*/
	int LINK_TYPE_at_TWDEST_EVOL = 236;

	/**
	    @generated
	*/
	int LINK_TYPE_at_AGGREGATION = 237;

	/**
	    @generated
	*/
	int LINK_TYPE_at_ANNOTATION = 238;

	/**
	    @generated
	*/
	int LINK_TYPE_at_COMPOSITION = 239;

	/**
	    @generated
	*/
	int LINK_TYPE_lt_DESTINATION = 240;

	/**
	    @generated
	*/
	int LINK_TYPE_at_GROUP = 241;

	/**
	    @generated
	*/
	int LINK_TYPE_at_HIDDEN = 242;

	/**
	    @generated
	*/
	int LINK_TYPE_lt_INVERSE_LINK = 243;

	/**
	    @generated
	*/
	int LINK_TYPE_at_KIND = 244;

	/**
	    @generated
	*/
	int LINK_TYPE_at_LINK_MANAGER = 245;

	/**
	    @generated
	*/
	int LINK_TYPE_at_MAPPING = 246;

	/**
	    @generated
	*/
	int LINK_TYPE_at_MAX = 247;

	/**
	    @generated
	*/
	int LINK_TYPE_at_MIN = 248;

	/**
	    @generated
	*/
	int LINK_TYPE_at_PART = 249;

	/**
	    @generated
	*/
	int LINK_TYPE_at_REQUIRE = 250;

	/**
	    @generated
	*/
	int LINK_TYPE_at_SELECTION = 251;

	/**
	    @generated
	*/
	int LINK_TYPE_lt_SOURCE = 252;

	/**
	    @generated
	*/
	int LINK_TYPE_TYPE = 253;

	/**
	    @generated
	*/
	int LINK_TYPE_TYPE_at_COMPATIBLE_VERSIONS = 254;

	/**
	    @generated
	*/
	int LINK_TYPE_TYPE_at_HIDDEN = 255;

	/**
	    @generated
	*/
	int LINK_TYPE_TYPE_at_INDEX_OF = 256;

	/**
	    @generated
	*/
	int LINK_TYPE_TYPE_at_VERSION = 257;

	/**
	    @generated
	*/
	int LINK_TYPE_TYPE_at_READ_ONLY = 258;

	/**
	    @generated
	*/
	int LINK_TYPE_TYPE_at_VALID = 259;

	/**
	    @generated
	*/
	int LIST = 260;

	/**
	    @generated
	*/
	int LIST_lt_SUB_TYPE = 261;

	/**
	    @generated
	*/
	int LONG = 262;

	/**
	    @generated
	*/
	int MC_BOOLEAN = 263;

	/**
	    @generated
	*/
	int MC_DATE = 264;

	/**
	    @generated
	*/
	int MC_DATE_at_PATTERN = 265;

	/**
	    @generated
	*/
	int MC_DEST_LINK = 266;

	/**
	    @generated
	*/
	int MC_ENUM = 267;

	/**
	    @generated
	*/
	int MC_INTEGER = 268;

	/**
	    @generated
	*/
	int MC_INTEGER_at_DEFAULT_VALUE = 269;

	/**
	    @generated
	*/
	int MC_INTEGER_at_ERROR_MSG_MAX = 270;

	/**
	    @generated
	*/
	int MC_INTEGER_at_ERROR_MSG_MIN = 271;

	/**
	    @generated
	*/
	int MC_INTEGER_at_MAX = 272;

	/**
	    @generated
	*/
	int MC_INTEGER_at_MIN = 273;

	/**
	    @generated
	*/
	int MC_LINK = 274;

	/**
	    @generated
	*/
	int MC_LINK_at_ERROR_MESSAGE = 275;

	/**
	    @generated
	*/
	int MC_LINK_TO_BOOLEAN = 276;

	/**
	    @generated
	*/
	int MC_LIST_OF_STRING = 277;

	/**
	    @generated
	*/
	int MC_LIST_OF_STRING_at_MAX = 278;

	/**
	    @generated
	*/
	int MC_LIST_OF_STRING_at_MIN = 279;

	/**
	    @generated
	*/
	int MC_NAME_ATTRIBUTE = 280;

	/**
	    @generated
	*/
	int MC_STRING_LIST_TO_ENUM_LIST = 281;

	/**
	    @generated
	*/
	int MC_STRING_TO_JAVA_ELEMENT = 282;

	/**
	    @generated
	*/
	int MANAGER = 283;

	/**
	    @generated
	*/
	int MANAGER_lt_CONTENT_MODEL = 284;

	/**
	    @generated
	*/
	int MANAGER_at_DISPLAY_NAME_TEMPLATE = 285;

	/**
	    @generated
	*/
	int MANAGER_lt_EXPORTERS = 286;

	/**
	    @generated
	*/
	int MANAGER_at_HUMAN_NAME = 287;

	/**
	    @generated
	*/
	int MANAGER_at_ICON = 288;

	/**
	    @generated
	*/
	int MANAGER_lt_ITEM_TYPE = 289;

	/**
	    @generated
	*/
	int MANAGER_at_MESSAGE_ERROR_ID = 290;

	/**
	    @generated
	*/
	int MANAGER_at_QUALIFIED_NAME_TEMPLATE = 291;

	/**
	    @generated
	*/
	int MANAGER_at_VALID_PATTERN_ID = 292;

	/**
	    @generated
	*/
	int MAPPING_MODEL = 293;

	/**
	    @generated
	*/
	int MAPPING_MODEL_lt_MANAGERS = 294;

	/**
	    @generated
	*/
	int MENU = 295;

	/**
	    @generated
	*/
	int MENU_lt_CHILDREN = 296;

	/**
	    @generated
	*/
	int MENU_ABSTRACT = 297;

	/**
	    @generated
	*/
	int MENU_ABSTRACT_at_ICON = 298;

	/**
	    @generated
	*/
	int MENU_ABSTRACT_at_LABEL = 299;

	/**
	    @generated
	*/
	int MENU_ABSTRACT_at_PATH = 300;

	/**
	    @generated
	*/
	int MENU_ACTION = 301;

	/**
	    @generated
	*/
	int MENU_GROUP = 302;

	/**
	    @generated
	*/
	int MODEL_CONTROLLER = 303;

	/**
	    @generated
	*/
	int PDEPROJECT_CONTENT_MODEL = 304;

	/**
	    @generated
	*/
	int PDEPROJECT_CONTENT_MODEL_lt_CONTENT_MODEL = 305;

	/**
	    @generated
	*/
	int PACKAGE_CONTENT_MODEL = 306;

	/**
	    @generated
	*/
	int PACKAGE_CONTENT_MODEL_at_PACKAGE_NAME = 307;

	/**
	    @generated
	*/
	int PACKAGE_LIST_CONTROLLER = 308;

	/**
	    @generated
	*/
	int PAGE = 309;

	/**
	    @generated
	*/
	int PAGE_lt_ATTRIBUTES = 310;

	/**
	    @generated
	*/
	int PAGE_at_DESCRIPTION = 311;

	/**
	    @generated
	*/
	int PAGE_at_ID_RUNTIME = 312;

	/**
	    @generated
	*/
	int PAGE_at_IS_REMOVED = 313;

	/**
	    @generated
	*/
	int PAGE_at_LABEL = 314;

	/**
	    @generated
	*/
	int PAGE_lt_OVERWRITE = 315;

	/**
	    @generated
	*/
	int PAGE_at_TITLE = 316;

	/**
	    @generated
	*/
	int PROJECT_CONTENT_MODEL = 317;

	/**
	    @generated
	*/
	int PROJECT_CONTENT_MODEL_lt_CONTENT_MODEL = 318;

	/**
	    @generated
	*/
	int PROJECT_CONTENT_MODEL_at_PROJECT_NAME = 319;

	/**
	    @generated
	*/
	int RESOURCE_CONTENT_MODEL = 320;

	/**
	    @generated
	*/
	int RUNTIME_ITEM = 321;

	/**
	    @generated
	*/
	int RUNTIME_ITEM_at_CLASS_NAME = 322;

	/**
	    @generated
	*/
	int RUNTIME_ITEM_at_EXTENDS_CLASS = 323;

	/**
	    @generated
	*/
	int SOURCE_FOLDER_CONTENT_MODEL = 324;

	/**
	    @generated
	*/
	int SOURCE_FOLDER_CONTENT_MODEL_at_OUTPUT_PATH = 325;

	/**
	    @generated
	*/
	int STRING = 326;

	/**
	    @generated
	*/
	int STRING_at_NOT_EMPTY = 327;

	/**
	    @generated
	*/
	int STRING_TO_ONE_RESOURCE_MODEL_CONTROLLER = 328;

	/**
	    @generated
	*/
	int STRING_TO_PACKAGE_MODEL_CONTROLLER = 329;

	/**
	    @generated
	*/
	int STRING_TO_RESOURCE_LIST_MODEL_CONTROLLER = 330;

	/**
	    @generated
	*/
	int STRUCT = 331;

	/**
	    @generated
	*/
	int STRUCT_lt_ATTRIBUTES = 332;

	/**
	    @generated
	*/
	int SUB_CONTENT_MODEL = 333;

	/**
	    @generated
	*/
	int SYMBOLIC_BIT_MAP = 334;

	/**
	    @generated
	*/
	int SYMBOLIC_BIT_MAP_at_VALUES = 335;

	/**
	    @generated
	*/
	int TIME = 336;

	/**
	    @generated
	*/
	int TIME_at_INIT_WITH_THE_CURRENT_TIME = 337;

	/**
	    @generated
	*/
	int TYPE_DEFINITION = 338;

	/**
	    @generated
	*/
	int TYPE_DEFINITION_lt_ATTRIBUTES = 339;

	/**
	    @generated
	*/
	int TYPE_DEFINITION_lt_CADSE = 340;

	/**
	    @generated
	*/
	int TYPE_DEFINITION_lt_CREATION_PAGES = 341;

	/**
	    @generated
	*/
	int TYPE_DEFINITION_lt_FIELDS = 342;

	/**
	    @generated
	*/
	int TYPE_DEFINITION_lt_GOUPS_OF_ATTRIBUTES = 343;

	/**
	    @generated
	*/
	int TYPE_DEFINITION_at_ID_RUNTIME = 344;

	/**
	    @generated
	*/
	int TYPE_DEFINITION_lt_MODIFICATION_PAGES = 345;

	/**
	    @generated
	*/
	int TYPE_DEFINITION_lt_VALIDATORS = 346;

	/**
	    @generated
	*/
	int UILISTENER = 347;

	/**
	    @generated
	*/
	int UILISTENER_lt_FIELDS = 348;

	/**
	    @generated
	*/
	int UIVALIDATOR = 349;

	/**
	    @generated
	*/
	int UIVALIDATOR_lt_LISTEN_ATTRIBUTES = 350;

	/**
	    @generated
	*/
	int UIVALIDATOR_lt_OVERWRITE = 351;

	/**
	    @generated
	*/
	int URL = 352;

	/**
	    @generated
	*/
	int UUID = 353;

	/**
	    @generated
	*/
	int UNRESOLVED_ATTRIBUTE_TYPE = 354;

	/**
	    @generated
	*/
	int VIEW = 355;

	/**
	    @generated
	*/
	int VIEW_at_ICON = 356;

	/**
	    @generated
	*/
	int VIEW_lt_VIEW_ITEM_TYPES = 357;

	/**
	    @generated
	*/
	int VIEW_DESCRIPTION = 358;

	/**
	    @generated
	*/
	int VIEW_DESCRIPTION_lt_ROOT_TYPES = 359;

	/**
	    @generated
	*/
	int VIEW_ITEM_TYPE = 360;

	/**
	    @generated
	*/
	int VIEW_ITEM_TYPE_at_IS_ROOT_ELEMENT = 361;

	/**
	    @generated
	*/
	int VIEW_ITEM_TYPE_lt_ITEM_TYPE = 362;

	/**
	    @generated
	*/
	int VIEW_ITEM_TYPE_at_REF = 363;

	/**
	    @generated
	*/
	int VIEW_ITEM_TYPE_lt_VIEW_LINK_TYPES = 364;

	/**
	    @generated
	*/
	int VIEW_LINK_TYPE = 365;

	/**
	    @generated
	*/
	int VIEW_LINK_TYPE_at_AGGREGATION = 366;

	/**
	    @generated
	*/
	int VIEW_LINK_TYPE_at_CAN_CREATE_ITEM = 367;

	/**
	    @generated
	*/
	int VIEW_LINK_TYPE_at_CAN_CREATE_LINK = 368;

	/**
	    @generated
	*/
	int VIEW_LINK_TYPE_at_DISPLAY_CREATE = 369;

	/**
	    @generated
	*/
	int VIEW_LINK_TYPE_lt_LINK_TYPE = 370;

	/**
	    @generated
	*/
	int VIEW_MODEL = 371;

	/**
	    @generated
	*/
	int VIEW_MODEL_lt_VIEWS = 372;

	/**
	    @generated
	*/
	int WCLISTENER = 373;

	/**
	    @generated
	*/
	int WCLISTENER_lt_LISTEN_ATTRIBUTE_DEFINITIONS = 374;

	/**
	    @generated
	*/
	int WCLISTENER_lt_LISTEN_ITEM_TYPES = 375;

	/**
	    @generated
	*/
	ItemType getAJProjectComposer();

	/**
	    @generated
	*/
	LinkType getAJProjectComposer_lt_getComposerLinks();

	/**
	    @generated
	*/
	BooleanAttributeType getAJProjectComposer_at_getSkipWeaving();

	/**
	    @generated
	*/
	ExtendedType getActionExtItemType();

	/**
	    @generated
	*/
	LinkType getActionExtItemType_lt_getActionsModel();

	/**
	    @generated
	*/
	ItemType getAspectJExporter();

	/**
	    @generated
	*/
	ItemType getAspectJProjectContentModel();

	/**
	    @generated
	*/
	LinkType getAspectJProjectContentModel_lt_getContentModel();

	/**
	    @generated
	*/
	ItemType getAspectJReExporter();

	/**
	    @generated
	*/
	ItemType getAttribute();

	/**
	    @generated
	*/
	EnumAttributeType<TWCommitKind> getAttribute_at_getTWCommitKind();

	/**
	    @generated
	*/
	EnumAttributeType<TWEvol> getAttribute_at_getTWEvol();

	/**
	    @generated
	*/
	BooleanAttributeType getAttribute_at_getTWRevSpecific();

	/**
	    @generated
	*/
	EnumAttributeType<TWUpdateKind> getAttribute_at_getTWUpdateKind();

	/**
	    @generated
	*/
	BooleanAttributeType getAttribute_at_getCannotBeUndefined();

	/**
	    @generated
	*/
	StringAttributeType getAttribute_at_getDefaultValue();

	/**
	    @generated
	*/
	BooleanAttributeType getAttribute_at_getDevGenerated();

	/**
	    @generated
	*/
	BooleanAttributeType getAttribute_at_getFinal();

	/**
	    @generated
	*/
	BooleanAttributeType getAttribute_at_getHiddenInComputedPages();

	/**
	    @generated
	*/
	StringAttributeType getAttribute_at_getIdRuntime();

	/**
	    @generated
	*/
	BooleanAttributeType getAttribute_at_getIsList();

	/**
	    @generated
	*/
	BooleanAttributeType getAttribute_at_getMustBeInitialized();

	/**
	    @generated
	*/
	BooleanAttributeType getAttribute_at_getNatif();

	/**
	    @generated
	*/
	BooleanAttributeType getAttribute_at_getRequire();

	/**
	    @generated
	*/
	BooleanAttributeType getAttribute_at_getTransient();

	/**
	    @generated
	*/
	LinkType getAttribute_lt_getWcListens();

	/**
	    @generated
	*/
	ItemType getAttributeItemType();

	/**
	    @generated
	*/
	StringAttributeType getAttributeItemType_at_getDefaultValue();

	/**
	    @generated
	*/
	StringAttributeType getAttributeItemType_at_getRuntimeQualifiedClass();

	/**
	    @generated
	*/
	ItemType getBoolean();

	/**
	    @generated
	*/
	ItemType getBuildModel();

	/**
	    @generated
	*/
	LinkType getBuildModel_lt_getCompositeTypes();

	/**
	    @generated
	*/
	ItemType getBuilder();

	/**
	    @generated
	*/
	LinkType getBuilder_lt_getRequires();

	/**
	    @generated
	*/
	ItemType getCadseType();

	/**
	    @generated
	*/
	StringAttributeType getCadse_at_getDefaultContentRepoURL();

	/**
	    @generated
	*/
	StringAttributeType getCadse_at_getDescription();

	/**
	    @generated
	*/
	BooleanAttributeType getCadse_at_getExecuted();

	/**
	    @generated
	*/
	LinkType getCadse_lt_getExtends();

	/**
	    @generated
	*/
	StringAttributeType getCadse_at_getIdDefinition();

	/**
	    @generated
	*/
	StringAttributeType getCadse_at_getItemRepoLogin();

	/**
	    @generated
	*/
	StringAttributeType getCadse_at_getItemRepoPasswd();

	/**
	    @generated
	*/
	StringAttributeType getCadse_at_getItemRepoURL();

	/**
	    @generated
	*/
	LinkType getCadse_lt_getItemTypes();

	/**
	    @generated
	*/
	ItemType getCadseDefinition();

	/**
	    @generated
	*/
	LinkType getCadseDefinition_lt_getBuild();

	/**
	    @generated
	*/
	StringAttributeType getCadseDefinition_at_getCadseName();

	/**
	    @generated
	*/
	StringAttributeType getCadseDefinition_at_getCommentary();

	/**
	    @generated
	*/
	LinkType getCadseDefinition_lt_getConfiguration();

	/**
	    @generated
	*/
	LinkType getCadseDefinition_lt_getDataModel();

	/**
	    @generated
	*/
	StringAttributeType getCadseDefinition_at_getIdRuntime();

	/**
	    @generated
	*/
	ListAttributeType<String> getCadseDefinition_at_getImports();

	/**
	    @generated
	*/
	LinkType getCadseDefinition_lt_getMapping();

	/**
	    @generated
	*/
	StringAttributeType getCadseDefinition_at_getPackagename();

	/**
	    @generated
	*/
	StringAttributeType getCadseDefinition_at_getVendorName();

	/**
	    @generated
	*/
	StringAttributeType getCadseDefinition_at_getVersionCadse();

	/**
	    @generated
	*/
	LinkType getCadseDefinition_lt_getViewModel();

	/**
	    @generated
	*/
	ItemType getComposer();

	/**
	    @generated
	*/
	LinkType getComposer_lt_getComposerLinks();

	/**
	    @generated
	*/
	ListAttributeType<String> getComposer_at_getTypes();

	/**
	    @generated
	*/
	ItemType getComposerLink();

	/**
	    @generated
	*/
	LinkType getComposerLink_lt_getExporters();

	/**
	    @generated
	*/
	LinkType getComposerLink_lt_getLink();

	/**
	    @generated
	*/
	ItemType getCompositeItemType();

	/**
	    @generated
	*/
	LinkType getCompositeItemType_lt_getBuilders();

	/**
	    @generated
	*/
	LinkType getCompositeItemType_lt_getComposers();

	/**
	    @generated
	*/
	LinkType getCompositeItemType_lt_getItemType();

	/**
	    @generated
	*/
	ItemType getComputedString();

	/**
	    @generated
	*/
	StringAttributeType getComputedString_at_getExpression();

	/**
	    @generated
	*/
	ItemType getConfigurationModel();

	/**
	    @generated
	*/
	LinkType getConfigurationModel_lt_getBuild();

	/**
	    @generated
	*/
	ItemType getContentItem();

	/**
	    @generated
	*/
	LinkType getContentItem_lt_getChildren();

	/**
	    @generated
	*/
	LinkType getContentItem_lt_getOwnerItem();

	/**
	    @generated
	*/
	ItemType getContentItemType();

	/**
	    @generated
	*/
	BooleanAttributeType getContentItemType_at_getExtendsClass();

	/**
	    @generated
	*/
	ItemType getDBrowser();

	/**
	    @generated
	*/
	ItemType getDCheckBox();

	/**
	    @generated
	*/
	ItemType getDCheckedList();

	/**
	    @generated
	*/
	ItemType getDCheckedTree();

	/**
	    @generated
	*/
	ItemType getDCombo();

	/**
	    @generated
	*/
	ItemType getDGroup();

	/**
	    @generated
	*/
	IntegerAttributeType getDGroup_at_getColumn();

	/**
	    @generated
	*/
	BooleanAttributeType getDGroup_at_getMakeColumnsEqualWidth();

	/**
	    @generated
	*/
	ItemType getDList();

	/**
	    @generated
	*/
	BooleanAttributeType getDList_at_getEditableButton();

	/**
	    @generated
	*/
	BooleanAttributeType getDList_at_getOrderButton();

	/**
	    @generated
	*/
	BooleanAttributeType getDList_at_getShowFilter();

	/**
	    @generated
	*/
	BooleanAttributeType getDList_at_getUpdateButton();

	/**
	    @generated
	*/
	ItemType getDSection();

	/**
	    @generated
	*/
	ItemType getDSymbolicBitMapUI();

	/**
	    @generated
	*/
	ListAttributeType<String> getDSymbolicBitMapUI_at_getLabels();

	/**
	    @generated
	*/
	IntegerAttributeType getDSymbolicBitMapUI_at_getNumberColumn();

	/**
	    @generated
	*/
	ItemType getDText();

	/**
	    @generated
	*/
	BooleanAttributeType getDText_at_getMultiLine();

	/**
	    @generated
	*/
	BooleanAttributeType getDText_at_getNoBorder();

	/**
	    @generated
	*/
	StringAttributeType getDText_at_getToolTip();

	/**
	    @generated
	*/
	IntegerAttributeType getDText_at_getVerticalSpan();

	/**
	    @generated
	*/
	BooleanAttributeType getDText_at_getWrapLine();

	/**
	    @generated
	*/
	ItemType getDTree();

	/**
	    @generated
	*/
	ItemType getDataModel();

	/**
	    @generated
	*/
	LinkType getDataModel_lt_getCategories();

	/**
	    @generated
	*/
	LinkType getDataModel_lt_getEnums();

	/**
	    @generated
	*/
	LinkType getDataModel_lt_getTypes();

	/**
	    @generated
	*/
	ItemType getDate();

	/**
	    @generated
	*/
	ItemType getDisplay();

	/**
	    @generated
	*/
	BooleanAttributeType getDisplay_at_getExtendsIC();

	/**
	    @generated
	*/
	BooleanAttributeType getDisplay_at_getExtendsMC();

	/**
	    @generated
	*/
	BooleanAttributeType getDisplay_at_getExtendsUI();

	/**
	    @generated
	*/
	ItemType getDouble();

	/**
	    @generated
	*/
	ItemType getDynamicActions();

	/**
	    @generated
	*/
	ItemType getEclipseComposer();

	/**
	    @generated
	*/
	LinkType getEclipseComposer_lt_getComposerLinks();

	/**
	    @generated
	*/
	ItemType getEclipseExporter();

	/**
	    @generated
	*/
	ItemType getEclipseReExporter();

	/**
	    @generated
	*/
	ItemType getEnum();

	/**
	    @generated
	*/
	StringAttributeType getEnum_at_getEnumClazz();

	/**
	    @generated
	*/
	LinkType getEnum_lt_getEnumType();

	/**
	    @generated
	*/
	ListAttributeType<String> getEnum_at_getValues();

	/**
	    @generated
	*/
	ItemType getEnumType();

	/**
	    @generated
	*/
	StringAttributeType getEnumType_at_getJavaClass();

	/**
	    @generated
	*/
	BooleanAttributeType getEnumType_at_getMustBeGenerated();

	/**
	    @generated
	*/
	ListAttributeType<String> getEnumType_at_getValues();

	/**
	    @generated
	*/
	ItemType getExporter();

	/**
	    @generated
	*/
	ListAttributeType<String> getExporter_at_getTypes();

	/**
	    @generated
	*/
	ItemType getExtItem();

	/**
	    @generated
	*/
	ItemType getExtItemType();

	/**
	    @generated
	*/
	LinkType getExtItemType_lt_getRefType();

	/**
	    @generated
	*/
	ItemType getField();

	/**
	    @generated
	*/
	LinkType getField_lt_getAttribute();

	/**
	    @generated
	*/
	BooleanAttributeType getField_at_getEditable();

	/**
	    @generated
	*/
	LinkType getField_lt_getIc();

	/**
	    @generated
	*/
	StringAttributeType getField_at_getLabel();

	/**
	    @generated
	*/
	LinkType getField_lt_getMc();

	/**
	    @generated
	*/
	LinkType getField_lt_getOverwritefield();

	/**
	    @generated
	*/
	EnumAttributeType<EPosLabel> getField_at_getPosition();

	/**
	    @generated
	*/
	ItemType getFileContentModel();

	/**
	    @generated
	*/
	StringAttributeType getFileContentModel_at_getFileName();

	/**
	    @generated
	*/
	StringAttributeType getFileContentModel_at_getFilePath();

	/**
	    @generated
	*/
	ItemType getFolderContentModel();

	/**
	    @generated
	*/
	LinkType getFolderContentModel_lt_getContentModel();

	/**
	    @generated
	*/
	StringAttributeType getFolderContentModel_at_getFolderPath();

	/**
	    @generated
	*/
	ItemType getFolderExporter();

	/**
	    @generated
	*/
	StringAttributeType getFolderExporter_at_getPath();

	/**
	    @generated
	*/
	ExtendedType getGenerateInformation();

	/**
	    @generated
	*/
	StringAttributeType getGenerateInformation_at_getCSTName();

	/**
	    @generated
	*/
	ExtendedType getGroupExtItem();

	/**
	    @generated
	*/
	LinkType getGroupExtItem_lt_getMemberOf();

	/**
	    @generated
	*/
	LinkType getGroupExtItem_lt_getMembers();

	/**
	    @generated
	*/
	ItemType getGroupOfAttributes();

	/**
	    @generated
	*/
	LinkType getGroupOfAttributes_lt_getAttributes();

	/**
	    @generated
	*/
	IntegerAttributeType getGroupOfAttributes_at_getColumn();

	/**
	    @generated
	*/
	LinkType getGroupOfAttributes_lt_getSuperGroup();

	/**
	    @generated
	*/
	ItemType getIC_AbstractForBrowser_Combo();

	/**
	    @generated
	*/
	ItemType getIC_AbstractForChecked();

	/**
	    @generated
	*/
	ItemType getIC_AbstractForList();

	/**
	    @generated
	*/
	ItemType getIC_AbstractTreeDialogForList_Browser_Combo();

	/**
	    @generated
	*/
	ItemType getIC_BooleanText();

	/**
	    @generated
	*/
	ItemType getIC_EnumForBrowser_Combo();

	/**
	    @generated
	*/
	ItemType getIC_EnumForList();

	/**
	    @generated
	*/
	ItemType getIC_FileResourceForBrowser_Combo_List();

	/**
	    @generated
	*/
	StringAttributeType getIC_FileResourceForBrowser_Combo_List_at_getPatternSelectFile();

	/**
	    @generated
	*/
	StringAttributeType getIC_FileResourceForBrowser_Combo_List_at_getSelectFolder();

	/**
	    @generated
	*/
	ItemType getIC_FolderResource_ForBrowser_Combo_List();

	/**
	    @generated
	*/
	ItemType getIC_JarResourceForBrowser_Combo_List();

	/**
	    @generated
	*/
	ItemType getIC_JavaClassForBrowser_Combo();

	/**
	    @generated
	*/
	StringAttributeType getIC_JavaClassForBrowser_Combo_at_getFilter();

	/**
	    @generated
	*/
	StringAttributeType getIC_JavaClassForBrowser_Combo_at_getStyle();

	/**
	    @generated
	*/
	ItemType getIC_LinkForBrowser_Combo_List();

	/**
	    @generated
	*/
	ItemType getIC_PartLinkForBrowser_Combo_List();

	/**
	    @generated
	*/
	ItemType getIC_ResourceTreeDialogForBrowser_Combo_List();

	/**
	    @generated
	*/
	IntegerAttributeType getIC_ResourceTreeDialogForBrowser_Combo_List_at_getSelectTypeRoot();

	/**
	    @generated
	*/
	ItemType getIC_StaticArrayOfObjectForBrowser_Combo();

	/**
	    @generated
	*/
	ListAttributeType<String> getIC_StaticArrayOfObjectForBrowser_Combo_at_getValues();

	/**
	    @generated
	*/
	ItemType getIC_StringListForList();

	/**
	    @generated
	*/
	BooleanAttributeType getIC_StringListForList_at_getAllowDuplicate();

	/**
	    @generated
	*/
	ItemType getIC_WithTitleForDialog();

	/**
	    @generated
	*/
	StringAttributeType getIC_WithTitleForDialog_at_getSelectMessage();

	/**
	    @generated
	*/
	StringAttributeType getIC_WithTitleForDialog_at_getSelectTitle();

	/**
	    @generated
	*/
	ItemType getInteger();

	/**
	    @generated
	*/
	ItemType getInteractionController();

	/**
	    @generated
	*/
	ItemType getItem();

	/**
	    @generated
	*/
	IntegerAttributeType getItem_at_getTWVersion();

	/**
	    @generated
	*/
	StringAttributeType getItem_at_getCommittedBy();

	/**
	    @generated
	*/
	LongAttributeType getItem_at_getCommittedDate();

	/**
	    @generated
	*/
	LinkType getItem_lt_getContents();

	/**
	    @generated
	*/
	StringAttributeType getItem_at_getDisplayName();

	/**
	    @generated
	*/
	StringAttributeType getItem_at_getId();

	/**
	    @generated
	*/
	LinkType getItem_lt_getInstanceOf();

	/**
	    @generated
	*/
	BooleanAttributeType getItem_at_getIsvalid();

	/**
	    @generated
	*/
	BooleanAttributeType getItem_at_getItemHidden();

	/**
	    @generated
	*/
	BooleanAttributeType getItem_at_getItemReadonly();

	/**
	    @generated
	*/
	LinkType getItem_lt_getModifiedAttributes();

	/**
	    @generated
	*/
	StringAttributeType getItem_at_getName();

	/**
	    @generated
	*/
	LinkType getItem_lt_getParent();

	/**
	    @generated
	*/
	StringAttributeType getItem_at_getQualifiedName();

	/**
	    @generated
	*/
	BooleanAttributeType getItem_at_getRequireNewRev();

	/**
	    @generated
	*/
	BooleanAttributeType getItem_at_getRevModified();

	/**
	    @generated
	*/
	ItemType getItemType();

	/**
	    @generated
	*/
	BooleanAttributeType getItemType_at_getCustomManager();

	/**
	    @generated
	*/
	StringAttributeType getItemType_at_getDisplayNameTemplate();

	/**
	    @generated
	*/
	BooleanAttributeType getItemType_at_getHasContent();

	/**
	    @generated
	*/
	BooleanAttributeType getItemType_at_getHasShortName();

	/**
	    @generated
	*/
	BooleanAttributeType getItemType_at_getHasUniqueName();

	/**
	    @generated
	*/
	StringAttributeType getItemType_at_getIcon();

	/**
	    @generated
	*/
	BooleanAttributeType getItemType_at_getIsInstanceAbstract();

	/**
	    @generated
	*/
	BooleanAttributeType getItemType_at_getIsInstanceHidden();

	/**
	    @generated
	*/
	BooleanAttributeType getItemType_at_getIsMetaItemType();

	/**
	    @generated
	*/
	BooleanAttributeType getItemType_at_getIsRootElement();

	/**
	    @generated
	*/
	StringAttributeType getItemType_at_getItemFactory();

	/**
	    @generated
	*/
	StringAttributeType getItemType_at_getItemManager();

	/**
	    @generated
	*/
	LinkType getItemType_lt_getLinkType();

	/**
	    @generated
	*/
	StringAttributeType getItemType_at_getManagerClass();

	/**
	    @generated
	*/
	StringAttributeType getItemType_at_getMessageErrorId();

	/**
	    @generated
	*/
	BooleanAttributeType getItemType_at_getOverwriteDefaultPages();

	/**
	    @generated
	*/
	StringAttributeType getItemType_at_getPackageName();

	/**
	    @generated
	*/
	StringAttributeType getItemType_at_getQualifiedNameTemplate();

	/**
	    @generated
	*/
	LinkType getItemType_lt_getSubTypes();

	/**
	    @generated
	*/
	LinkType getItemType_lt_getSuperType();

	/**
	    @generated
	*/
	StringAttributeType getItemType_at_getValidateNameRe();

	/**
	    @generated
	*/
	LinkType getItemType_lt_getWcListeners();

	/**
	    @generated
	*/
	ItemType getJavaElementTreeController();

	/**
	    @generated
	*/
	ItemType getJavaExporter();

	/**
	    @generated
	*/
	ItemType getJavaFileContentModel();

	/**
	    @generated
	*/
	StringAttributeType getJavaFileContentModel_at_getClassName();

	/**
	    @generated
	*/
	StringAttributeType getJavaFileContentModel_at_getPackageName();

	/**
	    @generated
	*/
	ItemType getJavaJarFileContentModel();

	/**
	    @generated
	*/
	ItemType getJavaProjectComposer();

	/**
	    @generated
	*/
	LinkType getJavaProjectComposer_lt_getComposerLinks();

	/**
	    @generated
	*/
	ItemType getJavaProjectContentModel();

	/**
	    @generated
	*/
	LinkType getJavaProjectContentModel_lt_getContentModel();

	/**
	    @generated
	*/
	BooleanAttributeType getJavaProjectContentModel_at_getHasSourceFolder();

	/**
	    @generated
	*/
	ItemType getJavaReExporter();

	/**
	    @generated
	*/
	ItemType getKey();

	/**
	    @generated
	*/
	ItemType getLinkType();

	/**
	    @generated
	*/
	BooleanAttributeType getLinkType_at_getTWCoupled();

	/**
	    @generated
	*/
	EnumAttributeType<TWDestEvol> getLinkType_at_getTWDestEvol();

	/**
	    @generated
	*/
	BooleanAttributeType getLinkType_at_getAggregation();

	/**
	    @generated
	*/
	BooleanAttributeType getLinkType_at_getAnnotation();

	/**
	    @generated
	*/
	BooleanAttributeType getLinkType_at_getComposition();

	/**
	    @generated
	*/
	LinkType getLinkType_lt_getDestination();

	/**
	    @generated
	*/
	BooleanAttributeType getLinkType_at_getGroup();

	/**
	    @generated
	*/
	BooleanAttributeType getLinkType_at_getHidden();

	/**
	    @generated
	*/
	LinkType getLinkType_lt_getInverseLink();

	/**
	    @generated
	*/
	IntegerAttributeType getLinkType_at_getKind();

	/**
	    @generated
	*/
	StringAttributeType getLinkType_at_getLinkManager();

	/**
	    @generated
	*/
	BooleanAttributeType getLinkType_at_getMapping();

	/**
	    @generated
	*/
	IntegerAttributeType getLinkType_at_getMax();

	/**
	    @generated
	*/
	IntegerAttributeType getLinkType_at_getMin();

	/**
	    @generated
	*/
	BooleanAttributeType getLinkType_at_getPart();

	/**
	    @generated
	*/
	BooleanAttributeType getLinkType_at_getRequire();

	/**
	    @generated
	*/
	StringAttributeType getLinkType_at_getSelection();

	/**
	    @generated
	*/
	LinkType getLinkType_lt_getSource();

	/**
	    @generated
	*/
	ItemType getLinkTypeType();

	/**
	    @generated
	*/
	ListAttributeType<Integer> getLinkTypeType_at_getCompatibleVersions();

	/**
	    @generated
	*/
	BooleanAttributeType getLinkTypeType_at_getHidden();

	/**
	    @generated
	*/
	IntegerAttributeType getLinkTypeType_at_getIndexOf();

	/**
	    @generated
	*/
	IntegerAttributeType getLinkTypeType_at_getVersion();

	/**
	    @generated
	*/
	BooleanAttributeType getLinkTypeType_at_getReadOnly();

	/**
	    @generated
	*/
	BooleanAttributeType getLinkTypeType_at_getValid();

	/**
	    @generated
	*/
	ItemType getList();

	/**
	    @generated
	*/
	LinkType getList_lt_getSubType();

	/**
	    @generated
	*/
	ItemType getLong();

	/**
	    @generated
	*/
	ItemType getMC_Boolean();

	/**
	    @generated
	*/
	ItemType getMC_Date();

	/**
	    @generated
	*/
	StringAttributeType getMC_Date_at_getPattern();

	/**
	    @generated
	*/
	ItemType getMC_DestLink();

	/**
	    @generated
	*/
	ItemType getMC_Enum();

	/**
	    @generated
	*/
	ItemType getMC_Integer();

	/**
	    @generated
	*/
	IntegerAttributeType getMC_Integer_at_getDefaultValue();

	/**
	    @generated
	*/
	StringAttributeType getMC_Integer_at_getErrorMsgMax();

	/**
	    @generated
	*/
	StringAttributeType getMC_Integer_at_getErrorMsgMin();

	/**
	    @generated
	*/
	IntegerAttributeType getMC_Integer_at_getMax();

	/**
	    @generated
	*/
	IntegerAttributeType getMC_Integer_at_getMin();

	/**
	    @generated
	*/
	ItemType getMC_Link();

	/**
	    @generated
	*/
	StringAttributeType getMC_Link_at_getErrorMessage();

	/**
	    @generated
	*/
	ItemType getMC_LinkToBoolean();

	/**
	    @generated
	*/
	ItemType getMC_ListOfString();

	/**
	    @generated
	*/
	IntegerAttributeType getMC_ListOfString_at_getMax();

	/**
	    @generated
	*/
	IntegerAttributeType getMC_ListOfString_at_getMin();

	/**
	    @generated
	*/
	ItemType getMC_NameAttribute();

	/**
	    @generated
	*/
	ItemType getMC_StringListToEnumList();

	/**
	    @generated
	*/
	ItemType getMC_StringToJavaElement();

	/**
	    @generated
	*/
	ItemType getManager();

	/**
	    @generated
	*/
	LinkType getManager_lt_getContentModel();

	/**
	    @generated
	*/
	StringAttributeType getManager_at_getDisplayNameTemplate();

	/**
	    @generated
	*/
	LinkType getManager_lt_getExporters();

	/**
	    @generated
	*/
	StringAttributeType getManager_at_getHumanName();

	/**
	    @generated
	*/
	StringAttributeType getManager_at_getIcon();

	/**
	    @generated
	*/
	LinkType getManager_lt_getItemType();

	/**
	    @generated
	*/
	StringAttributeType getManager_at_getMessageErrorId();

	/**
	    @generated
	*/
	StringAttributeType getManager_at_getQualifiedNameTemplate();

	/**
	    @generated
	*/
	StringAttributeType getManager_at_getValidPatternId();

	/**
	    @generated
	*/
	ItemType getMappingModel();

	/**
	    @generated
	*/
	LinkType getMappingModel_lt_getManagers();

	/**
	    @generated
	*/
	ItemType getMenu();

	/**
	    @generated
	*/
	LinkType getMenu_lt_getChildren();

	/**
	    @generated
	*/
	ItemType getMenuAbstract();

	/**
	    @generated
	*/
	StringAttributeType getMenuAbstract_at_getIcon();

	/**
	    @generated
	*/
	StringAttributeType getMenuAbstract_at_getLabel();

	/**
	    @generated
	*/
	StringAttributeType getMenuAbstract_at_getPath();

	/**
	    @generated
	*/
	ItemType getMenuAction();

	/**
	    @generated
	*/
	ItemType getMenuGroup();

	/**
	    @generated
	*/
	ItemType getModelController();

	/**
	    @generated
	*/
	ItemType getPDEProjectContentModel();

	/**
	    @generated
	*/
	LinkType getPDEProjectContentModel_lt_getContentModel();

	/**
	    @generated
	*/
	ItemType getPackageContentModel();

	/**
	    @generated
	*/
	StringAttributeType getPackageContentModel_at_getPackageName();

	/**
	    @generated
	*/
	ItemType getPackageListController();

	/**
	    @generated
	*/
	ItemType getPage();

	/**
	    @generated
	*/
	LinkType getPage_lt_getAttributes();

	/**
	    @generated
	*/
	StringAttributeType getPage_at_getDescription();

	/**
	    @generated
	*/
	StringAttributeType getPage_at_getIdRuntime();

	/**
	    @generated
	*/
	BooleanAttributeType getPage_at_getIsRemoved();

	/**
	    @generated
	*/
	StringAttributeType getPage_at_getLabel();

	/**
	    @generated
	*/
	LinkType getPage_lt_getOverwrite();

	/**
	    @generated
	*/
	StringAttributeType getPage_at_getTitle();

	/**
	    @generated
	*/
	ItemType getProjectContentModel();

	/**
	    @generated
	*/
	LinkType getProjectContentModel_lt_getContentModel();

	/**
	    @generated
	*/
	StringAttributeType getProjectContentModel_at_getProjectName();

	/**
	    @generated
	*/
	ItemType getResourceContentModel();

	/**
	    @generated
	*/
	ItemType getRuntimeItem();

	/**
	    @generated
	*/
	StringAttributeType getRuntimeItem_at_getClassName();

	/**
	    @generated
	*/
	BooleanAttributeType getRuntimeItem_at_getExtendsClass();

	/**
	    @generated
	*/
	ItemType getSourceFolderContentModel();

	/**
	    @generated
	*/
	StringAttributeType getSourceFolderContentModel_at_getOutputPath();

	/**
	    @generated
	*/
	ItemType getString();

	/**
	    @generated
	*/
	BooleanAttributeType getString_at_getNotEmpty();

	/**
	    @generated
	*/
	ItemType getStringToOneResourceModelController();

	/**
	    @generated
	*/
	ItemType getStringToPackageModelController();

	/**
	    @generated
	*/
	ItemType getStringToResourceListModelController();

	/**
	    @generated
	*/
	ItemType getStruct();

	/**
	    @generated
	*/
	LinkType getStruct_lt_getAttributes();

	/**
	    @generated
	*/
	ItemType getSubContentModel();

	/**
	    @generated
	*/
	ItemType getSymbolicBitMap();

	/**
	    @generated
	*/
	ListAttributeType<String> getSymbolicBitMap_at_getValues();

	/**
	    @generated
	*/
	ItemType getTime();

	/**
	    @generated
	*/
	BooleanAttributeType getTime_at_getInitWithTheCurrentTime();

	/**
	    @generated
	*/
	ItemType getTypeDefinition();

	/**
	    @generated
	*/
	LinkType getTypeDefinition_lt_getAttributes();

	/**
	    @generated
	*/
	LinkType getTypeDefinition_lt_getCadse();

	/**
	    @generated
	*/
	LinkType getTypeDefinition_lt_getCreationPages();

	/**
	    @generated
	*/
	LinkType getTypeDefinition_lt_getFields();

	/**
	    @generated
	*/
	LinkType getTypeDefinition_lt_getGoupsOfAttributes();

	/**
	    @generated
	*/
	StringAttributeType getTypeDefinition_at_getIdRuntime();

	/**
	    @generated
	*/
	LinkType getTypeDefinition_lt_getModificationPages();

	/**
	    @generated
	*/
	LinkType getTypeDefinition_lt_getValidators();

	/**
	    @generated
	*/
	ItemType getUIListener();

	/**
	    @generated
	*/
	LinkType getUIListener_lt_getFields();

	/**
	    @generated
	*/
	ItemType getUIValidator();

	/**
	    @generated
	*/
	LinkType getUIValidator_lt_getListenAttributes();

	/**
	    @generated
	*/
	LinkType getUIValidator_lt_getOverwrite();

	/**
	    @generated
	*/
	ItemType getURL();

	/**
	    @generated
	*/
	ItemType getUUID();

	/**
	    @generated
	*/
	ItemType getUnresolvedAttributeType();

	/**
	    @generated
	*/
	ItemType getView();

	/**
	    @generated
	*/
	StringAttributeType getView_at_getIcon();

	/**
	    @generated
	*/
	LinkType getView_lt_getViewItemTypes();

	/**
	    @generated
	*/
	ItemType getViewDescription();

	/**
	    @generated
	*/
	LinkType getViewDescription_lt_getRootTypes();

	/**
	    @generated
	*/
	ItemType getViewItemType();

	/**
	    @generated
	*/
	BooleanAttributeType getViewItemType_at_getIsRootElement();

	/**
	    @generated
	*/
	LinkType getViewItemType_lt_getItemType();

	/**
	    @generated
	*/
	BooleanAttributeType getViewItemType_at_getRef();

	/**
	    @generated
	*/
	LinkType getViewItemType_lt_getViewLinkTypes();

	/**
	    @generated
	*/
	ItemType getViewLinkType();

	/**
	    @generated
	*/
	BooleanAttributeType getViewLinkType_at_getAggregation();

	/**
	    @generated
	*/
	BooleanAttributeType getViewLinkType_at_getCanCreateItem();

	/**
	    @generated
	*/
	BooleanAttributeType getViewLinkType_at_getCanCreateLink();

	/**
	    @generated
	*/
	StringAttributeType getViewLinkType_at_getDisplayCreate();

	/**
	    @generated
	*/
	LinkType getViewLinkType_lt_getLinkType();

	/**
	    @generated
	*/
	ItemType getViewModel();

	/**
	    @generated
	*/
	LinkType getViewModel_lt_getViews();

	/**
	    @generated
	*/
	ItemType getWCListener();

	/**
	    @generated
	*/
	LinkType getWCListener_lt_getListenAttributeDefinitions();

	/**
	    @generated
	*/
	LinkType getWCListener_lt_getListenItemTypes();
	interface Literals 
	{

	/**
	    @generated
	*/
	ItemType AJPROJECT_COMPOSER = cINSTANCE.getAJProjectComposer();

	/**
	    @generated
	*/
	LinkType AJPROJECT_COMPOSER_lt_COMPOSER_LINKS = cINSTANCE.getAJProjectComposer_lt_getComposerLinks();

	/**
	    @generated
	*/
	BooleanAttributeType AJPROJECT_COMPOSER_at_SKIP_WEAVING = cINSTANCE.getAJProjectComposer_at_getSkipWeaving();

	/**
	    @generated
	*/
	ExtendedType ACTION_EXT_ITEM_TYPE = cINSTANCE.getActionExtItemType();

	/**
	    @generated
	*/
	LinkType ACTION_EXT_ITEM_TYPE_lt_ACTIONS_MODEL = cINSTANCE.getActionExtItemType_lt_getActionsModel();

	/**
	    @generated
	*/
	ItemType ASPECT_JEXPORTER = cINSTANCE.getAspectJExporter();

	/**
	    @generated
	*/
	ItemType ASPECT_JPROJECT_CONTENT_MODEL = cINSTANCE.getAspectJProjectContentModel();

	/**
	    @generated
	*/
	LinkType ASPECT_JPROJECT_CONTENT_MODEL_lt_CONTENT_MODEL = cINSTANCE.getAspectJProjectContentModel_lt_getContentModel();

	/**
	    @generated
	*/
	ItemType ASPECT_JRE_EXPORTER = cINSTANCE.getAspectJReExporter();

	/**
	    @generated
	*/
	ItemType ATTRIBUTE = cINSTANCE.getAttribute();

	/**
	    @generated
	*/
	EnumAttributeType<TWCommitKind> ATTRIBUTE_at_TWCOMMIT_KIND = cINSTANCE.getAttribute_at_getTWCommitKind();

	/**
	    @generated
	*/
	EnumAttributeType<TWEvol> ATTRIBUTE_at_TWEVOL = cINSTANCE.getAttribute_at_getTWEvol();

	/**
	    @generated
	*/
	BooleanAttributeType ATTRIBUTE_at_TWREV_SPECIFIC = cINSTANCE.getAttribute_at_getTWRevSpecific();

	/**
	    @generated
	*/
	EnumAttributeType<TWUpdateKind> ATTRIBUTE_at_TWUPDATE_KIND = cINSTANCE.getAttribute_at_getTWUpdateKind();

	/**
	    @generated
	*/
	BooleanAttributeType ATTRIBUTE_at_CANNOT_BE_UNDEFINED = cINSTANCE.getAttribute_at_getCannotBeUndefined();

	/**
	    @generated
	*/
	StringAttributeType ATTRIBUTE_at_DEFAULT_VALUE = cINSTANCE.getAttribute_at_getDefaultValue();

	/**
	    @generated
	*/
	BooleanAttributeType ATTRIBUTE_at_DEV_GENERATED = cINSTANCE.getAttribute_at_getDevGenerated();

	/**
	    @generated
	*/
	BooleanAttributeType ATTRIBUTE_at_FINAL = cINSTANCE.getAttribute_at_getFinal();

	/**
	    @generated
	*/
	BooleanAttributeType ATTRIBUTE_at_HIDDEN_IN_COMPUTED_PAGES = cINSTANCE.getAttribute_at_getHiddenInComputedPages();

	/**
	    @generated
	*/
	StringAttributeType ATTRIBUTE_at_ID_RUNTIME = cINSTANCE.getAttribute_at_getIdRuntime();

	/**
	    @generated
	*/
	BooleanAttributeType ATTRIBUTE_at_IS_LIST = cINSTANCE.getAttribute_at_getIsList();

	/**
	    @generated
	*/
	BooleanAttributeType ATTRIBUTE_at_MUST_BE_INITIALIZED = cINSTANCE.getAttribute_at_getMustBeInitialized();

	/**
	    @generated
	*/
	BooleanAttributeType ATTRIBUTE_at_NATIF = cINSTANCE.getAttribute_at_getNatif();

	/**
	    @generated
	*/
	BooleanAttributeType ATTRIBUTE_at_REQUIRE = cINSTANCE.getAttribute_at_getRequire();

	/**
	    @generated
	*/
	BooleanAttributeType ATTRIBUTE_at_TRANSIENT = cINSTANCE.getAttribute_at_getTransient();

	/**
	    @generated
	*/
	LinkType ATTRIBUTE_lt_WC_LISTENS = cINSTANCE.getAttribute_lt_getWcListens();

	/**
	    @generated
	*/
	ItemType ATTRIBUTE_ITEM_TYPE = cINSTANCE.getAttributeItemType();

	/**
	    @generated
	*/
	StringAttributeType ATTRIBUTE_ITEM_TYPE_at_DEFAULT_VALUE = cINSTANCE.getAttributeItemType_at_getDefaultValue();

	/**
	    @generated
	*/
	StringAttributeType ATTRIBUTE_ITEM_TYPE_at_RUNTIME_QUALIFIED_CLASS = cINSTANCE.getAttributeItemType_at_getRuntimeQualifiedClass();

	/**
	    @generated
	*/
	ItemType BOOLEAN = cINSTANCE.getBoolean();

	/**
	    @generated
	*/
	ItemType BUILD_MODEL = cINSTANCE.getBuildModel();

	/**
	    @generated
	*/
	LinkType BUILD_MODEL_lt_COMPOSITE_TYPES = cINSTANCE.getBuildModel_lt_getCompositeTypes();

	/**
	    @generated
	*/
	ItemType BUILDER = cINSTANCE.getBuilder();

	/**
	    @generated
	*/
	LinkType BUILDER_lt_REQUIRES = cINSTANCE.getBuilder_lt_getRequires();

	/**
	    @generated
	*/
	ItemType CADSE = cINSTANCE.getCadseType();

	/**
	    @generated
	*/
	StringAttributeType CADSE_at_DEFAULT_CONTENT_REPO_URL = cINSTANCE.getCadse_at_getDefaultContentRepoURL();

	/**
	    @generated
	*/
	StringAttributeType CADSE_at_DESCRIPTION = cINSTANCE.getCadse_at_getDescription();

	/**
	    @generated
	*/
	BooleanAttributeType CADSE_at_EXECUTED = cINSTANCE.getCadse_at_getExecuted();

	/**
	    @generated
	*/
	LinkType CADSE_lt_EXTENDS = cINSTANCE.getCadse_lt_getExtends();

	/**
	    @generated
	*/
	StringAttributeType CADSE_at_ID_DEFINITION = cINSTANCE.getCadse_at_getIdDefinition();

	/**
	    @generated
	*/
	StringAttributeType CADSE_at_ITEM_REPO_LOGIN = cINSTANCE.getCadse_at_getItemRepoLogin();

	/**
	    @generated
	*/
	StringAttributeType CADSE_at_ITEM_REPO_PASSWD = cINSTANCE.getCadse_at_getItemRepoPasswd();

	/**
	    @generated
	*/
	StringAttributeType CADSE_at_ITEM_REPO_URL = cINSTANCE.getCadse_at_getItemRepoURL();

	/**
	    @generated
	*/
	LinkType CADSE_lt_ITEM_TYPES = cINSTANCE.getCadse_lt_getItemTypes();

	/**
	    @generated
	*/
	ItemType CADSE_DEFINITION = cINSTANCE.getCadseDefinition();

	/**
	    @generated
	*/
	LinkType CADSE_DEFINITION_lt_BUILD = cINSTANCE.getCadseDefinition_lt_getBuild();

	/**
	    @generated
	*/
	StringAttributeType CADSE_DEFINITION_at_CADSE_NAME = cINSTANCE.getCadseDefinition_at_getCadseName();

	/**
	    @generated
	*/
	StringAttributeType CADSE_DEFINITION_at_COMMENTARY = cINSTANCE.getCadseDefinition_at_getCommentary();

	/**
	    @generated
	*/
	LinkType CADSE_DEFINITION_lt_CONFIGURATION = cINSTANCE.getCadseDefinition_lt_getConfiguration();

	/**
	    @generated
	*/
	LinkType CADSE_DEFINITION_lt_DATA_MODEL = cINSTANCE.getCadseDefinition_lt_getDataModel();

	/**
	    @generated
	*/
	StringAttributeType CADSE_DEFINITION_at_ID_RUNTIME = cINSTANCE.getCadseDefinition_at_getIdRuntime();

	/**
	    @generated
	*/
	ListAttributeType<String> CADSE_DEFINITION_at_IMPORTS = cINSTANCE.getCadseDefinition_at_getImports();

	/**
	    @generated
	*/
	LinkType CADSE_DEFINITION_lt_MAPPING = cINSTANCE.getCadseDefinition_lt_getMapping();

	/**
	    @generated
	*/
	StringAttributeType CADSE_DEFINITION_at_PACKAGENAME = cINSTANCE.getCadseDefinition_at_getPackagename();

	/**
	    @generated
	*/
	StringAttributeType CADSE_DEFINITION_at_VENDOR_NAME = cINSTANCE.getCadseDefinition_at_getVendorName();

	/**
	    @generated
	*/
	StringAttributeType CADSE_DEFINITION_at_VERSION_CADSE = cINSTANCE.getCadseDefinition_at_getVersionCadse();

	/**
	    @generated
	*/
	LinkType CADSE_DEFINITION_lt_VIEW_MODEL = cINSTANCE.getCadseDefinition_lt_getViewModel();

	/**
	    @generated
	*/
	ItemType COMPOSER = cINSTANCE.getComposer();

	/**
	    @generated
	*/
	LinkType COMPOSER_lt_COMPOSER_LINKS = cINSTANCE.getComposer_lt_getComposerLinks();

	/**
	    @generated
	*/
	ListAttributeType<String> COMPOSER_at_TYPES = cINSTANCE.getComposer_at_getTypes();

	/**
	    @generated
	*/
	ItemType COMPOSER_LINK = cINSTANCE.getComposerLink();

	/**
	    @generated
	*/
	LinkType COMPOSER_LINK_lt_EXPORTERS = cINSTANCE.getComposerLink_lt_getExporters();

	/**
	    @generated
	*/
	LinkType COMPOSER_LINK_lt_LINK = cINSTANCE.getComposerLink_lt_getLink();

	/**
	    @generated
	*/
	ItemType COMPOSITE_ITEM_TYPE = cINSTANCE.getCompositeItemType();

	/**
	    @generated
	*/
	LinkType COMPOSITE_ITEM_TYPE_lt_BUILDERS = cINSTANCE.getCompositeItemType_lt_getBuilders();

	/**
	    @generated
	*/
	LinkType COMPOSITE_ITEM_TYPE_lt_COMPOSERS = cINSTANCE.getCompositeItemType_lt_getComposers();

	/**
	    @generated
	*/
	LinkType COMPOSITE_ITEM_TYPE_lt_ITEM_TYPE = cINSTANCE.getCompositeItemType_lt_getItemType();

	/**
	    @generated
	*/
	ItemType COMPUTED_STRING = cINSTANCE.getComputedString();

	/**
	    @generated
	*/
	StringAttributeType COMPUTED_STRING_at_EXPRESSION = cINSTANCE.getComputedString_at_getExpression();

	/**
	    @generated
	*/
	ItemType CONFIGURATION_MODEL = cINSTANCE.getConfigurationModel();

	/**
	    @generated
	*/
	LinkType CONFIGURATION_MODEL_lt_BUILD = cINSTANCE.getConfigurationModel_lt_getBuild();

	/**
	    @generated
	*/
	ItemType CONTENT_ITEM = cINSTANCE.getContentItem();

	/**
	    @generated
	*/
	LinkType CONTENT_ITEM_lt_CHILDREN = cINSTANCE.getContentItem_lt_getChildren();

	/**
	    @generated
	*/
	LinkType CONTENT_ITEM_lt_OWNER_ITEM = cINSTANCE.getContentItem_lt_getOwnerItem();

	/**
	    @generated
	*/
	ItemType CONTENT_ITEM_TYPE = cINSTANCE.getContentItemType();

	/**
	    @generated
	*/
	BooleanAttributeType CONTENT_ITEM_TYPE_at_EXTENDS_CLASS = cINSTANCE.getContentItemType_at_getExtendsClass();

	/**
	    @generated
	*/
	ItemType DBROWSER = cINSTANCE.getDBrowser();

	/**
	    @generated
	*/
	ItemType DCHECK_BOX = cINSTANCE.getDCheckBox();

	/**
	    @generated
	*/
	ItemType DCHECKED_LIST = cINSTANCE.getDCheckedList();

	/**
	    @generated
	*/
	ItemType DCHECKED_TREE = cINSTANCE.getDCheckedTree();

	/**
	    @generated
	*/
	ItemType DCOMBO = cINSTANCE.getDCombo();

	/**
	    @generated
	*/
	ItemType DGROUP = cINSTANCE.getDGroup();

	/**
	    @generated
	*/
	IntegerAttributeType DGROUP_at_COLUMN = cINSTANCE.getDGroup_at_getColumn();

	/**
	    @generated
	*/
	BooleanAttributeType DGROUP_at_MAKE_COLUMNS_EQUAL_WIDTH = cINSTANCE.getDGroup_at_getMakeColumnsEqualWidth();

	/**
	    @generated
	*/
	ItemType DLIST = cINSTANCE.getDList();

	/**
	    @generated
	*/
	BooleanAttributeType DLIST_at_EDITABLE_BUTTON = cINSTANCE.getDList_at_getEditableButton();

	/**
	    @generated
	*/
	BooleanAttributeType DLIST_at_ORDER_BUTTON = cINSTANCE.getDList_at_getOrderButton();

	/**
	    @generated
	*/
	BooleanAttributeType DLIST_at_SHOW_FILTER = cINSTANCE.getDList_at_getShowFilter();

	/**
	    @generated
	*/
	BooleanAttributeType DLIST_at_UPDATE_BUTTON = cINSTANCE.getDList_at_getUpdateButton();

	/**
	    @generated
	*/
	ItemType DSECTION = cINSTANCE.getDSection();

	/**
	    @generated
	*/
	ItemType DSYMBOLIC_BIT_MAP_UI = cINSTANCE.getDSymbolicBitMapUI();

	/**
	    @generated
	*/
	ListAttributeType<String> DSYMBOLIC_BIT_MAP_UI_at_LABELS = cINSTANCE.getDSymbolicBitMapUI_at_getLabels();

	/**
	    @generated
	*/
	IntegerAttributeType DSYMBOLIC_BIT_MAP_UI_at_NUMBER_COLUMN = cINSTANCE.getDSymbolicBitMapUI_at_getNumberColumn();

	/**
	    @generated
	*/
	ItemType DTEXT = cINSTANCE.getDText();

	/**
	    @generated
	*/
	BooleanAttributeType DTEXT_at_MULTI_LINE = cINSTANCE.getDText_at_getMultiLine();

	/**
	    @generated
	*/
	BooleanAttributeType DTEXT_at_NO_BORDER = cINSTANCE.getDText_at_getNoBorder();

	/**
	    @generated
	*/
	StringAttributeType DTEXT_at_TOOL_TIP = cINSTANCE.getDText_at_getToolTip();

	/**
	    @generated
	*/
	IntegerAttributeType DTEXT_at_VERTICAL_SPAN = cINSTANCE.getDText_at_getVerticalSpan();

	/**
	    @generated
	*/
	BooleanAttributeType DTEXT_at_WRAP_LINE = cINSTANCE.getDText_at_getWrapLine();

	/**
	    @generated
	*/
	ItemType DTREE = cINSTANCE.getDTree();

	/**
	    @generated
	*/
	ItemType DATA_MODEL = cINSTANCE.getDataModel();

	/**
	    @generated
	*/
	LinkType DATA_MODEL_lt_CATEGORIES = cINSTANCE.getDataModel_lt_getCategories();

	/**
	    @generated
	*/
	LinkType DATA_MODEL_lt_ENUMS = cINSTANCE.getDataModel_lt_getEnums();

	/**
	    @generated
	*/
	LinkType DATA_MODEL_lt_TYPES = cINSTANCE.getDataModel_lt_getTypes();

	/**
	    @generated
	*/
	ItemType DATE = cINSTANCE.getDate();

	/**
	    @generated
	*/
	ItemType DISPLAY = cINSTANCE.getDisplay();

	/**
	    @generated
	*/
	BooleanAttributeType DISPLAY_at_EXTENDS_IC = cINSTANCE.getDisplay_at_getExtendsIC();

	/**
	    @generated
	*/
	BooleanAttributeType DISPLAY_at_EXTENDS_MC = cINSTANCE.getDisplay_at_getExtendsMC();

	/**
	    @generated
	*/
	BooleanAttributeType DISPLAY_at_EXTENDS_UI = cINSTANCE.getDisplay_at_getExtendsUI();

	/**
	    @generated
	*/
	ItemType DOUBLE = cINSTANCE.getDouble();

	/**
	    @generated
	*/
	ItemType DYNAMIC_ACTIONS = cINSTANCE.getDynamicActions();

	/**
	    @generated
	*/
	ItemType ECLIPSE_COMPOSER = cINSTANCE.getEclipseComposer();

	/**
	    @generated
	*/
	LinkType ECLIPSE_COMPOSER_lt_COMPOSER_LINKS = cINSTANCE.getEclipseComposer_lt_getComposerLinks();

	/**
	    @generated
	*/
	ItemType ECLIPSE_EXPORTER = cINSTANCE.getEclipseExporter();

	/**
	    @generated
	*/
	ItemType ECLIPSE_RE_EXPORTER = cINSTANCE.getEclipseReExporter();

	/**
	    @generated
	*/
	ItemType ENUM = cINSTANCE.getEnum();

	/**
	    @generated
	*/
	StringAttributeType ENUM_at_ENUM_CLAZZ = cINSTANCE.getEnum_at_getEnumClazz();

	/**
	    @generated
	*/
	LinkType ENUM_lt_ENUM_TYPE = cINSTANCE.getEnum_lt_getEnumType();

	/**
	    @generated
	*/
	ListAttributeType<String> ENUM_at_VALUES = cINSTANCE.getEnum_at_getValues();

	/**
	    @generated
	*/
	ItemType ENUM_TYPE = cINSTANCE.getEnumType();

	/**
	    @generated
	*/
	StringAttributeType ENUM_TYPE_at_JAVA_CLASS = cINSTANCE.getEnumType_at_getJavaClass();

	/**
	    @generated
	*/
	BooleanAttributeType ENUM_TYPE_at_MUST_BE_GENERATED = cINSTANCE.getEnumType_at_getMustBeGenerated();

	/**
	    @generated
	*/
	ListAttributeType<String> ENUM_TYPE_at_VALUES = cINSTANCE.getEnumType_at_getValues();

	/**
	    @generated
	*/
	ItemType EXPORTER = cINSTANCE.getExporter();

	/**
	    @generated
	*/
	ListAttributeType<String> EXPORTER_at_TYPES = cINSTANCE.getExporter_at_getTypes();

	/**
	    @generated
	*/
	ItemType EXT_ITEM = cINSTANCE.getExtItem();

	/**
	    @generated
	*/
	ItemType EXT_ITEM_TYPE = cINSTANCE.getExtItemType();

	/**
	    @generated
	*/
	LinkType EXT_ITEM_TYPE_lt_REF_TYPE = cINSTANCE.getExtItemType_lt_getRefType();

	/**
	    @generated
	*/
	ItemType FIELD = cINSTANCE.getField();

	/**
	    @generated
	*/
	LinkType FIELD_lt_ATTRIBUTE = cINSTANCE.getField_lt_getAttribute();

	/**
	    @generated
	*/
	BooleanAttributeType FIELD_at_EDITABLE = cINSTANCE.getField_at_getEditable();

	/**
	    @generated
	*/
	LinkType FIELD_lt_IC = cINSTANCE.getField_lt_getIc();

	/**
	    @generated
	*/
	StringAttributeType FIELD_at_LABEL = cINSTANCE.getField_at_getLabel();

	/**
	    @generated
	*/
	LinkType FIELD_lt_MC = cINSTANCE.getField_lt_getMc();

	/**
	    @generated
	*/
	LinkType FIELD_lt_OVERWRITEFIELD = cINSTANCE.getField_lt_getOverwritefield();

	/**
	    @generated
	*/
	EnumAttributeType<EPosLabel> FIELD_at_POSITION = cINSTANCE.getField_at_getPosition();

	/**
	    @generated
	*/
	ItemType FILE_CONTENT_MODEL = cINSTANCE.getFileContentModel();

	/**
	    @generated
	*/
	StringAttributeType FILE_CONTENT_MODEL_at_FILE_NAME = cINSTANCE.getFileContentModel_at_getFileName();

	/**
	    @generated
	*/
	StringAttributeType FILE_CONTENT_MODEL_at_FILE_PATH = cINSTANCE.getFileContentModel_at_getFilePath();

	/**
	    @generated
	*/
	ItemType FOLDER_CONTENT_MODEL = cINSTANCE.getFolderContentModel();

	/**
	    @generated
	*/
	LinkType FOLDER_CONTENT_MODEL_lt_CONTENT_MODEL = cINSTANCE.getFolderContentModel_lt_getContentModel();

	/**
	    @generated
	*/
	StringAttributeType FOLDER_CONTENT_MODEL_at_FOLDER_PATH = cINSTANCE.getFolderContentModel_at_getFolderPath();

	/**
	    @generated
	*/
	ItemType FOLDER_EXPORTER = cINSTANCE.getFolderExporter();

	/**
	    @generated
	*/
	StringAttributeType FOLDER_EXPORTER_at_PATH = cINSTANCE.getFolderExporter_at_getPath();

	/**
	    @generated
	*/
	ExtendedType GENERATE_INFORMATION = cINSTANCE.getGenerateInformation();

	/**
	    @generated
	*/
	StringAttributeType GENERATE_INFORMATION_at_CSTNAME = cINSTANCE.getGenerateInformation_at_getCSTName();

	/**
	    @generated
	*/
	ExtendedType GROUP_EXT_ITEM = cINSTANCE.getGroupExtItem();

	/**
	    @generated
	*/
	LinkType GROUP_EXT_ITEM_lt_MEMBER_OF = cINSTANCE.getGroupExtItem_lt_getMemberOf();

	/**
	    @generated
	*/
	LinkType GROUP_EXT_ITEM_lt_MEMBERS = cINSTANCE.getGroupExtItem_lt_getMembers();

	/**
	    @generated
	*/
	ItemType GROUP_OF_ATTRIBUTES = cINSTANCE.getGroupOfAttributes();

	/**
	    @generated
	*/
	LinkType GROUP_OF_ATTRIBUTES_lt_ATTRIBUTES = cINSTANCE.getGroupOfAttributes_lt_getAttributes();

	/**
	    @generated
	*/
	IntegerAttributeType GROUP_OF_ATTRIBUTES_at_COLUMN = cINSTANCE.getGroupOfAttributes_at_getColumn();

	/**
	    @generated
	*/
	LinkType GROUP_OF_ATTRIBUTES_lt_SUPER_GROUP = cINSTANCE.getGroupOfAttributes_lt_getSuperGroup();

	/**
	    @generated
	*/
	ItemType IC_ABSTRACT_FOR_BROWSER_COMBO = cINSTANCE.getIC_AbstractForBrowser_Combo();

	/**
	    @generated
	*/
	ItemType IC_ABSTRACT_FOR_CHECKED = cINSTANCE.getIC_AbstractForChecked();

	/**
	    @generated
	*/
	ItemType IC_ABSTRACT_FOR_LIST = cINSTANCE.getIC_AbstractForList();

	/**
	    @generated
	*/
	ItemType IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO = cINSTANCE.getIC_AbstractTreeDialogForList_Browser_Combo();

	/**
	    @generated
	*/
	ItemType IC_BOOLEAN_TEXT = cINSTANCE.getIC_BooleanText();

	/**
	    @generated
	*/
	ItemType IC_ENUM_FOR_BROWSER_COMBO = cINSTANCE.getIC_EnumForBrowser_Combo();

	/**
	    @generated
	*/
	ItemType IC_ENUM_FOR_LIST = cINSTANCE.getIC_EnumForList();

	/**
	    @generated
	*/
	ItemType IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST = cINSTANCE.getIC_FileResourceForBrowser_Combo_List();

	/**
	    @generated
	*/
	StringAttributeType IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST_at_PATTERN_SELECT_FILE = cINSTANCE.getIC_FileResourceForBrowser_Combo_List_at_getPatternSelectFile();

	/**
	    @generated
	*/
	StringAttributeType IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST_at_SELECT_FOLDER = cINSTANCE.getIC_FileResourceForBrowser_Combo_List_at_getSelectFolder();

	/**
	    @generated
	*/
	ItemType IC_FOLDER_RESOURCE_FOR_BROWSER_COMBO_LIST = cINSTANCE.getIC_FolderResource_ForBrowser_Combo_List();

	/**
	    @generated
	*/
	ItemType IC_JAR_RESOURCE_FOR_BROWSER_COMBO_LIST = cINSTANCE.getIC_JarResourceForBrowser_Combo_List();

	/**
	    @generated
	*/
	ItemType IC_JAVA_CLASS_FOR_BROWSER_COMBO = cINSTANCE.getIC_JavaClassForBrowser_Combo();

	/**
	    @generated
	*/
	StringAttributeType IC_JAVA_CLASS_FOR_BROWSER_COMBO_at_FILTER = cINSTANCE.getIC_JavaClassForBrowser_Combo_at_getFilter();

	/**
	    @generated
	*/
	StringAttributeType IC_JAVA_CLASS_FOR_BROWSER_COMBO_at_STYLE = cINSTANCE.getIC_JavaClassForBrowser_Combo_at_getStyle();

	/**
	    @generated
	*/
	ItemType IC_LINK_FOR_BROWSER_COMBO_LIST = cINSTANCE.getIC_LinkForBrowser_Combo_List();

	/**
	    @generated
	*/
	ItemType IC_PART_LINK_FOR_BROWSER_COMBO_LIST = cINSTANCE.getIC_PartLinkForBrowser_Combo_List();

	/**
	    @generated
	*/
	ItemType IC_RESOURCE_TREE_DIALOG_FOR_BROWSER_COMBO_LIST = cINSTANCE.getIC_ResourceTreeDialogForBrowser_Combo_List();

	/**
	    @generated
	*/
	IntegerAttributeType IC_RESOURCE_TREE_DIALOG_FOR_BROWSER_COMBO_LIST_at_SELECT_TYPE_ROOT = cINSTANCE.getIC_ResourceTreeDialogForBrowser_Combo_List_at_getSelectTypeRoot();

	/**
	    @generated
	*/
	ItemType IC_STATIC_ARRAY_OF_OBJECT_FOR_BROWSER_COMBO = cINSTANCE.getIC_StaticArrayOfObjectForBrowser_Combo();

	/**
	    @generated
	*/
	ListAttributeType<String> IC_STATIC_ARRAY_OF_OBJECT_FOR_BROWSER_COMBO_at_VALUES = cINSTANCE.getIC_StaticArrayOfObjectForBrowser_Combo_at_getValues();

	/**
	    @generated
	*/
	ItemType IC_STRING_LIST_FOR_LIST = cINSTANCE.getIC_StringListForList();

	/**
	    @generated
	*/
	BooleanAttributeType IC_STRING_LIST_FOR_LIST_at_ALLOW_DUPLICATE = cINSTANCE.getIC_StringListForList_at_getAllowDuplicate();

	/**
	    @generated
	*/
	ItemType IC_WITH_TITLE_FOR_DIALOG = cINSTANCE.getIC_WithTitleForDialog();

	/**
	    @generated
	*/
	StringAttributeType IC_WITH_TITLE_FOR_DIALOG_at_SELECT_MESSAGE = cINSTANCE.getIC_WithTitleForDialog_at_getSelectMessage();

	/**
	    @generated
	*/
	StringAttributeType IC_WITH_TITLE_FOR_DIALOG_at_SELECT_TITLE = cINSTANCE.getIC_WithTitleForDialog_at_getSelectTitle();

	/**
	    @generated
	*/
	ItemType INTEGER = cINSTANCE.getInteger();

	/**
	    @generated
	*/
	ItemType INTERACTION_CONTROLLER = cINSTANCE.getInteractionController();

	/**
	    @generated
	*/
	ItemType ITEM = cINSTANCE.getItem();

	/**
	    @generated
	*/
	IntegerAttributeType ITEM_at_TW_VERSION = cINSTANCE.getItem_at_getTWVersion();

	/**
	    @generated
	*/
	StringAttributeType ITEM_at_COMMITTED_BY = cINSTANCE.getItem_at_getCommittedBy();

	/**
	    @generated
	*/
	LongAttributeType ITEM_at_COMMITTED_DATE = cINSTANCE.getItem_at_getCommittedDate();

	/**
	    @generated
	*/
	LinkType ITEM_lt_CONTENTS = cINSTANCE.getItem_lt_getContents();

	/**
	    @generated
	*/
	StringAttributeType ITEM_at_DISPLAY_NAME = cINSTANCE.getItem_at_getDisplayName();

	/**
	    @generated
	*/
	StringAttributeType ITEM_at_ID = cINSTANCE.getItem_at_getId();

	/**
	    @generated
	*/
	LinkType ITEM_lt_INSTANCE_OF = cINSTANCE.getItem_lt_getInstanceOf();

	/**
	    @generated
	*/
	BooleanAttributeType ITEM_at_ISVALID = cINSTANCE.getItem_at_getIsvalid();

	/**
	    @generated
	*/
	BooleanAttributeType ITEM_at_ITEM_HIDDEN = cINSTANCE.getItem_at_getItemHidden();

	/**
	    @generated
	*/
	BooleanAttributeType ITEM_at_ITEM_READONLY = cINSTANCE.getItem_at_getItemReadonly();

	/**
	    @generated
	*/
	LinkType ITEM_lt_MODIFIED_ATTRIBUTES = cINSTANCE.getItem_lt_getModifiedAttributes();

	/**
	    @generated
	*/
	StringAttributeType ITEM_at_NAME = cINSTANCE.getItem_at_getName();

	/**
	    @generated
	*/
	LinkType ITEM_lt_PARENT = cINSTANCE.getItem_lt_getParent();

	/**
	    @generated
	*/
	StringAttributeType ITEM_at_QUALIFIED_NAME = cINSTANCE.getItem_at_getQualifiedName();

	/**
	    @generated
	*/
	BooleanAttributeType ITEM_at_REQUIRE_NEW_REV = cINSTANCE.getItem_at_getRequireNewRev();

	/**
	    @generated
	*/
	BooleanAttributeType ITEM_at_REV_MODIFIED = cINSTANCE.getItem_at_getRevModified();

	/**
	    @generated
	*/
	ItemType ITEM_TYPE = cINSTANCE.getItemType();

	/**
	    @generated
	*/
	BooleanAttributeType ITEM_TYPE_at_CUSTOM_MANAGER = cINSTANCE.getItemType_at_getCustomManager();

	/**
	    @generated
	*/
	StringAttributeType ITEM_TYPE_at_DISPLAY_NAME_TEMPLATE = cINSTANCE.getItemType_at_getDisplayNameTemplate();

	/**
	    @generated
	*/
	BooleanAttributeType ITEM_TYPE_at_HAS_CONTENT = cINSTANCE.getItemType_at_getHasContent();

	/**
	    @generated
	*/
	BooleanAttributeType ITEM_TYPE_at_HAS_SHORT_NAME = cINSTANCE.getItemType_at_getHasShortName();

	/**
	    @generated
	*/
	BooleanAttributeType ITEM_TYPE_at_HAS_UNIQUE_NAME = cINSTANCE.getItemType_at_getHasUniqueName();

	/**
	    @generated
	*/
	StringAttributeType ITEM_TYPE_at_ICON = cINSTANCE.getItemType_at_getIcon();

	/**
	    @generated
	*/
	BooleanAttributeType ITEM_TYPE_at_IS_INSTANCE_ABSTRACT = cINSTANCE.getItemType_at_getIsInstanceAbstract();

	/**
	    @generated
	*/
	BooleanAttributeType ITEM_TYPE_at_IS_INSTANCE_HIDDEN = cINSTANCE.getItemType_at_getIsInstanceHidden();

	/**
	    @generated
	*/
	BooleanAttributeType ITEM_TYPE_at_IS_META_ITEM_TYPE = cINSTANCE.getItemType_at_getIsMetaItemType();

	/**
	    @generated
	*/
	BooleanAttributeType ITEM_TYPE_at_IS_ROOT_ELEMENT = cINSTANCE.getItemType_at_getIsRootElement();

	/**
	    @generated
	*/
	StringAttributeType ITEM_TYPE_at_ITEM_FACTORY = cINSTANCE.getItemType_at_getItemFactory();

	/**
	    @generated
	*/
	StringAttributeType ITEM_TYPE_at_ITEM_MANAGER = cINSTANCE.getItemType_at_getItemManager();

	/**
	    @generated
	*/
	LinkType ITEM_TYPE_lt_LINK_TYPE = cINSTANCE.getItemType_lt_getLinkType();

	/**
	    @generated
	*/
	StringAttributeType ITEM_TYPE_at_MANAGER_CLASS = cINSTANCE.getItemType_at_getManagerClass();

	/**
	    @generated
	*/
	StringAttributeType ITEM_TYPE_at_MESSAGE_ERROR_ID = cINSTANCE.getItemType_at_getMessageErrorId();

	/**
	    @generated
	*/
	BooleanAttributeType ITEM_TYPE_at_OVERWRITE_DEFAULT_PAGES = cINSTANCE.getItemType_at_getOverwriteDefaultPages();

	/**
	    @generated
	*/
	StringAttributeType ITEM_TYPE_at_PACKAGE_NAME = cINSTANCE.getItemType_at_getPackageName();

	/**
	    @generated
	*/
	StringAttributeType ITEM_TYPE_at_QUALIFIED_NAME_TEMPLATE = cINSTANCE.getItemType_at_getQualifiedNameTemplate();

	/**
	    @generated
	*/
	LinkType ITEM_TYPE_lt_SUB_TYPES = cINSTANCE.getItemType_lt_getSubTypes();

	/**
	    @generated
	*/
	LinkType ITEM_TYPE_lt_SUPER_TYPE = cINSTANCE.getItemType_lt_getSuperType();

	/**
	    @generated
	*/
	StringAttributeType ITEM_TYPE_at_VALIDATE_NAME_RE = cINSTANCE.getItemType_at_getValidateNameRe();

	/**
	    @generated
	*/
	LinkType ITEM_TYPE_lt_WC_LISTENERS = cINSTANCE.getItemType_lt_getWcListeners();

	/**
	    @generated
	*/
	ItemType JAVA_ELEMENT_TREE_CONTROLLER = cINSTANCE.getJavaElementTreeController();

	/**
	    @generated
	*/
	ItemType JAVA_EXPORTER = cINSTANCE.getJavaExporter();

	/**
	    @generated
	*/
	ItemType JAVA_FILE_CONTENT_MODEL = cINSTANCE.getJavaFileContentModel();

	/**
	    @generated
	*/
	StringAttributeType JAVA_FILE_CONTENT_MODEL_at_CLASS_NAME = cINSTANCE.getJavaFileContentModel_at_getClassName();

	/**
	    @generated
	*/
	StringAttributeType JAVA_FILE_CONTENT_MODEL_at_PACKAGE_NAME = cINSTANCE.getJavaFileContentModel_at_getPackageName();

	/**
	    @generated
	*/
	ItemType JAVA_JAR_FILE_CONTENT_MODEL = cINSTANCE.getJavaJarFileContentModel();

	/**
	    @generated
	*/
	ItemType JAVA_PROJECT_COMPOSER = cINSTANCE.getJavaProjectComposer();

	/**
	    @generated
	*/
	LinkType JAVA_PROJECT_COMPOSER_lt_COMPOSER_LINKS = cINSTANCE.getJavaProjectComposer_lt_getComposerLinks();

	/**
	    @generated
	*/
	ItemType JAVA_PROJECT_CONTENT_MODEL = cINSTANCE.getJavaProjectContentModel();

	/**
	    @generated
	*/
	LinkType JAVA_PROJECT_CONTENT_MODEL_lt_CONTENT_MODEL = cINSTANCE.getJavaProjectContentModel_lt_getContentModel();

	/**
	    @generated
	*/
	BooleanAttributeType JAVA_PROJECT_CONTENT_MODEL_at_HAS_SOURCE_FOLDER = cINSTANCE.getJavaProjectContentModel_at_getHasSourceFolder();

	/**
	    @generated
	*/
	ItemType JAVA_RE_EXPORTER = cINSTANCE.getJavaReExporter();

	/**
	    @generated
	*/
	ItemType KEY = cINSTANCE.getKey();

	/**
	    @generated
	*/
	ItemType LINK_TYPE = cINSTANCE.getLinkType();

	/**
	    @generated
	*/
	BooleanAttributeType LINK_TYPE_at_TWCOUPLED = cINSTANCE.getLinkType_at_getTWCoupled();

	/**
	    @generated
	*/
	EnumAttributeType<TWDestEvol> LINK_TYPE_at_TWDEST_EVOL = cINSTANCE.getLinkType_at_getTWDestEvol();

	/**
	    @generated
	*/
	BooleanAttributeType LINK_TYPE_at_AGGREGATION = cINSTANCE.getLinkType_at_getAggregation();

	/**
	    @generated
	*/
	BooleanAttributeType LINK_TYPE_at_ANNOTATION = cINSTANCE.getLinkType_at_getAnnotation();

	/**
	    @generated
	*/
	BooleanAttributeType LINK_TYPE_at_COMPOSITION = cINSTANCE.getLinkType_at_getComposition();

	/**
	    @generated
	*/
	LinkType LINK_TYPE_lt_DESTINATION = cINSTANCE.getLinkType_lt_getDestination();

	/**
	    @generated
	*/
	BooleanAttributeType LINK_TYPE_at_GROUP = cINSTANCE.getLinkType_at_getGroup();

	/**
	    @generated
	*/
	BooleanAttributeType LINK_TYPE_at_HIDDEN = cINSTANCE.getLinkType_at_getHidden();

	/**
	    @generated
	*/
	LinkType LINK_TYPE_lt_INVERSE_LINK = cINSTANCE.getLinkType_lt_getInverseLink();

	/**
	    @generated
	*/
	IntegerAttributeType LINK_TYPE_at_KIND = cINSTANCE.getLinkType_at_getKind();

	/**
	    @generated
	*/
	StringAttributeType LINK_TYPE_at_LINK_MANAGER = cINSTANCE.getLinkType_at_getLinkManager();

	/**
	    @generated
	*/
	BooleanAttributeType LINK_TYPE_at_MAPPING = cINSTANCE.getLinkType_at_getMapping();

	/**
	    @generated
	*/
	IntegerAttributeType LINK_TYPE_at_MAX = cINSTANCE.getLinkType_at_getMax();

	/**
	    @generated
	*/
	IntegerAttributeType LINK_TYPE_at_MIN = cINSTANCE.getLinkType_at_getMin();

	/**
	    @generated
	*/
	BooleanAttributeType LINK_TYPE_at_PART = cINSTANCE.getLinkType_at_getPart();

	/**
	    @generated
	*/
	BooleanAttributeType LINK_TYPE_at_REQUIRE = cINSTANCE.getLinkType_at_getRequire();

	/**
	    @generated
	*/
	StringAttributeType LINK_TYPE_at_SELECTION = cINSTANCE.getLinkType_at_getSelection();

	/**
	    @generated
	*/
	LinkType LINK_TYPE_lt_SOURCE = cINSTANCE.getLinkType_lt_getSource();

	/**
	    @generated
	*/
	ItemType LINK_TYPE_TYPE = cINSTANCE.getLinkTypeType();

	/**
	    @generated
	*/
	ListAttributeType<Integer> LINK_TYPE_TYPE_at_COMPATIBLE_VERSIONS = cINSTANCE.getLinkTypeType_at_getCompatibleVersions();

	/**
	    @generated
	*/
	BooleanAttributeType LINK_TYPE_TYPE_at_HIDDEN = cINSTANCE.getLinkTypeType_at_getHidden();

	/**
	    @generated
	*/
	IntegerAttributeType LINK_TYPE_TYPE_at_INDEX_OF = cINSTANCE.getLinkTypeType_at_getIndexOf();

	/**
	    @generated
	*/
	IntegerAttributeType LINK_TYPE_TYPE_at_VERSION = cINSTANCE.getLinkTypeType_at_getVersion();

	/**
	    @generated
	*/
	BooleanAttributeType LINK_TYPE_TYPE_at_READ_ONLY = cINSTANCE.getLinkTypeType_at_getReadOnly();

	/**
	    @generated
	*/
	BooleanAttributeType LINK_TYPE_TYPE_at_VALID = cINSTANCE.getLinkTypeType_at_getValid();

	/**
	    @generated
	*/
	ItemType LIST = cINSTANCE.getList();

	/**
	    @generated
	*/
	LinkType LIST_lt_SUB_TYPE = cINSTANCE.getList_lt_getSubType();

	/**
	    @generated
	*/
	ItemType LONG = cINSTANCE.getLong();

	/**
	    @generated
	*/
	ItemType MC_BOOLEAN = cINSTANCE.getMC_Boolean();

	/**
	    @generated
	*/
	ItemType MC_DATE = cINSTANCE.getMC_Date();

	/**
	    @generated
	*/
	StringAttributeType MC_DATE_at_PATTERN = cINSTANCE.getMC_Date_at_getPattern();

	/**
	    @generated
	*/
	ItemType MC_DEST_LINK = cINSTANCE.getMC_DestLink();

	/**
	    @generated
	*/
	ItemType MC_ENUM = cINSTANCE.getMC_Enum();

	/**
	    @generated
	*/
	ItemType MC_INTEGER = cINSTANCE.getMC_Integer();

	/**
	    @generated
	*/
	IntegerAttributeType MC_INTEGER_at_DEFAULT_VALUE = cINSTANCE.getMC_Integer_at_getDefaultValue();

	/**
	    @generated
	*/
	StringAttributeType MC_INTEGER_at_ERROR_MSG_MAX = cINSTANCE.getMC_Integer_at_getErrorMsgMax();

	/**
	    @generated
	*/
	StringAttributeType MC_INTEGER_at_ERROR_MSG_MIN = cINSTANCE.getMC_Integer_at_getErrorMsgMin();

	/**
	    @generated
	*/
	IntegerAttributeType MC_INTEGER_at_MAX = cINSTANCE.getMC_Integer_at_getMax();

	/**
	    @generated
	*/
	IntegerAttributeType MC_INTEGER_at_MIN = cINSTANCE.getMC_Integer_at_getMin();

	/**
	    @generated
	*/
	ItemType MC_LINK = cINSTANCE.getMC_Link();

	/**
	    @generated
	*/
	StringAttributeType MC_LINK_at_ERROR_MESSAGE = cINSTANCE.getMC_Link_at_getErrorMessage();

	/**
	    @generated
	*/
	ItemType MC_LINK_TO_BOOLEAN = cINSTANCE.getMC_LinkToBoolean();

	/**
	    @generated
	*/
	ItemType MC_LIST_OF_STRING = cINSTANCE.getMC_ListOfString();

	/**
	    @generated
	*/
	IntegerAttributeType MC_LIST_OF_STRING_at_MAX = cINSTANCE.getMC_ListOfString_at_getMax();

	/**
	    @generated
	*/
	IntegerAttributeType MC_LIST_OF_STRING_at_MIN = cINSTANCE.getMC_ListOfString_at_getMin();

	/**
	    @generated
	*/
	ItemType MC_NAME_ATTRIBUTE = cINSTANCE.getMC_NameAttribute();

	/**
	    @generated
	*/
	ItemType MC_STRING_LIST_TO_ENUM_LIST = cINSTANCE.getMC_StringListToEnumList();

	/**
	    @generated
	*/
	ItemType MC_STRING_TO_JAVA_ELEMENT = cINSTANCE.getMC_StringToJavaElement();

	/**
	    @generated
	*/
	ItemType MANAGER = cINSTANCE.getManager();

	/**
	    @generated
	*/
	LinkType MANAGER_lt_CONTENT_MODEL = cINSTANCE.getManager_lt_getContentModel();

	/**
	    @generated
	*/
	StringAttributeType MANAGER_at_DISPLAY_NAME_TEMPLATE = cINSTANCE.getManager_at_getDisplayNameTemplate();

	/**
	    @generated
	*/
	LinkType MANAGER_lt_EXPORTERS = cINSTANCE.getManager_lt_getExporters();

	/**
	    @generated
	*/
	StringAttributeType MANAGER_at_HUMAN_NAME = cINSTANCE.getManager_at_getHumanName();

	/**
	    @generated
	*/
	StringAttributeType MANAGER_at_ICON = cINSTANCE.getManager_at_getIcon();

	/**
	    @generated
	*/
	LinkType MANAGER_lt_ITEM_TYPE = cINSTANCE.getManager_lt_getItemType();

	/**
	    @generated
	*/
	StringAttributeType MANAGER_at_MESSAGE_ERROR_ID = cINSTANCE.getManager_at_getMessageErrorId();

	/**
	    @generated
	*/
	StringAttributeType MANAGER_at_QUALIFIED_NAME_TEMPLATE = cINSTANCE.getManager_at_getQualifiedNameTemplate();

	/**
	    @generated
	*/
	StringAttributeType MANAGER_at_VALID_PATTERN_ID = cINSTANCE.getManager_at_getValidPatternId();

	/**
	    @generated
	*/
	ItemType MAPPING_MODEL = cINSTANCE.getMappingModel();

	/**
	    @generated
	*/
	LinkType MAPPING_MODEL_lt_MANAGERS = cINSTANCE.getMappingModel_lt_getManagers();

	/**
	    @generated
	*/
	ItemType MENU = cINSTANCE.getMenu();

	/**
	    @generated
	*/
	LinkType MENU_lt_CHILDREN = cINSTANCE.getMenu_lt_getChildren();

	/**
	    @generated
	*/
	ItemType MENU_ABSTRACT = cINSTANCE.getMenuAbstract();

	/**
	    @generated
	*/
	StringAttributeType MENU_ABSTRACT_at_ICON = cINSTANCE.getMenuAbstract_at_getIcon();

	/**
	    @generated
	*/
	StringAttributeType MENU_ABSTRACT_at_LABEL = cINSTANCE.getMenuAbstract_at_getLabel();

	/**
	    @generated
	*/
	StringAttributeType MENU_ABSTRACT_at_PATH = cINSTANCE.getMenuAbstract_at_getPath();

	/**
	    @generated
	*/
	ItemType MENU_ACTION = cINSTANCE.getMenuAction();

	/**
	    @generated
	*/
	ItemType MENU_GROUP = cINSTANCE.getMenuGroup();

	/**
	    @generated
	*/
	ItemType MODEL_CONTROLLER = cINSTANCE.getModelController();

	/**
	    @generated
	*/
	ItemType PDEPROJECT_CONTENT_MODEL = cINSTANCE.getPDEProjectContentModel();

	/**
	    @generated
	*/
	LinkType PDEPROJECT_CONTENT_MODEL_lt_CONTENT_MODEL = cINSTANCE.getPDEProjectContentModel_lt_getContentModel();

	/**
	    @generated
	*/
	ItemType PACKAGE_CONTENT_MODEL = cINSTANCE.getPackageContentModel();

	/**
	    @generated
	*/
	StringAttributeType PACKAGE_CONTENT_MODEL_at_PACKAGE_NAME = cINSTANCE.getPackageContentModel_at_getPackageName();

	/**
	    @generated
	*/
	ItemType PACKAGE_LIST_CONTROLLER = cINSTANCE.getPackageListController();

	/**
	    @generated
	*/
	ItemType PAGE = cINSTANCE.getPage();

	/**
	    @generated
	*/
	LinkType PAGE_lt_ATTRIBUTES = cINSTANCE.getPage_lt_getAttributes();

	/**
	    @generated
	*/
	StringAttributeType PAGE_at_DESCRIPTION = cINSTANCE.getPage_at_getDescription();

	/**
	    @generated
	*/
	StringAttributeType PAGE_at_ID_RUNTIME = cINSTANCE.getPage_at_getIdRuntime();

	/**
	    @generated
	*/
	BooleanAttributeType PAGE_at_IS_REMOVED = cINSTANCE.getPage_at_getIsRemoved();

	/**
	    @generated
	*/
	StringAttributeType PAGE_at_LABEL = cINSTANCE.getPage_at_getLabel();

	/**
	    @generated
	*/
	LinkType PAGE_lt_OVERWRITE = cINSTANCE.getPage_lt_getOverwrite();

	/**
	    @generated
	*/
	StringAttributeType PAGE_at_TITLE = cINSTANCE.getPage_at_getTitle();

	/**
	    @generated
	*/
	ItemType PROJECT_CONTENT_MODEL = cINSTANCE.getProjectContentModel();

	/**
	    @generated
	*/
	LinkType PROJECT_CONTENT_MODEL_lt_CONTENT_MODEL = cINSTANCE.getProjectContentModel_lt_getContentModel();

	/**
	    @generated
	*/
	StringAttributeType PROJECT_CONTENT_MODEL_at_PROJECT_NAME = cINSTANCE.getProjectContentModel_at_getProjectName();

	/**
	    @generated
	*/
	ItemType RESOURCE_CONTENT_MODEL = cINSTANCE.getResourceContentModel();

	/**
	    @generated
	*/
	ItemType RUNTIME_ITEM = cINSTANCE.getRuntimeItem();

	/**
	    @generated
	*/
	StringAttributeType RUNTIME_ITEM_at_CLASS_NAME = cINSTANCE.getRuntimeItem_at_getClassName();

	/**
	    @generated
	*/
	BooleanAttributeType RUNTIME_ITEM_at_EXTENDS_CLASS = cINSTANCE.getRuntimeItem_at_getExtendsClass();

	/**
	    @generated
	*/
	ItemType SOURCE_FOLDER_CONTENT_MODEL = cINSTANCE.getSourceFolderContentModel();

	/**
	    @generated
	*/
	StringAttributeType SOURCE_FOLDER_CONTENT_MODEL_at_OUTPUT_PATH = cINSTANCE.getSourceFolderContentModel_at_getOutputPath();

	/**
	    @generated
	*/
	ItemType STRING = cINSTANCE.getString();

	/**
	    @generated
	*/
	BooleanAttributeType STRING_at_NOT_EMPTY = cINSTANCE.getString_at_getNotEmpty();

	/**
	    @generated
	*/
	ItemType STRING_TO_ONE_RESOURCE_MODEL_CONTROLLER = cINSTANCE.getStringToOneResourceModelController();

	/**
	    @generated
	*/
	ItemType STRING_TO_PACKAGE_MODEL_CONTROLLER = cINSTANCE.getStringToPackageModelController();

	/**
	    @generated
	*/
	ItemType STRING_TO_RESOURCE_LIST_MODEL_CONTROLLER = cINSTANCE.getStringToResourceListModelController();

	/**
	    @generated
	*/
	ItemType STRUCT = cINSTANCE.getStruct();

	/**
	    @generated
	*/
	LinkType STRUCT_lt_ATTRIBUTES = cINSTANCE.getStruct_lt_getAttributes();

	/**
	    @generated
	*/
	ItemType SUB_CONTENT_MODEL = cINSTANCE.getSubContentModel();

	/**
	    @generated
	*/
	ItemType SYMBOLIC_BIT_MAP = cINSTANCE.getSymbolicBitMap();

	/**
	    @generated
	*/
	ListAttributeType<String> SYMBOLIC_BIT_MAP_at_VALUES = cINSTANCE.getSymbolicBitMap_at_getValues();

	/**
	    @generated
	*/
	ItemType TIME = cINSTANCE.getTime();

	/**
	    @generated
	*/
	BooleanAttributeType TIME_at_INIT_WITH_THE_CURRENT_TIME = cINSTANCE.getTime_at_getInitWithTheCurrentTime();

	/**
	    @generated
	*/
	ItemType TYPE_DEFINITION = cINSTANCE.getTypeDefinition();

	/**
	    @generated
	*/
	LinkType TYPE_DEFINITION_lt_ATTRIBUTES = cINSTANCE.getTypeDefinition_lt_getAttributes();

	/**
	    @generated
	*/
	LinkType TYPE_DEFINITION_lt_CADSE = cINSTANCE.getTypeDefinition_lt_getCadse();

	/**
	    @generated
	*/
	LinkType TYPE_DEFINITION_lt_CREATION_PAGES = cINSTANCE.getTypeDefinition_lt_getCreationPages();

	/**
	    @generated
	*/
	LinkType TYPE_DEFINITION_lt_FIELDS = cINSTANCE.getTypeDefinition_lt_getFields();

	/**
	    @generated
	*/
	LinkType TYPE_DEFINITION_lt_GOUPS_OF_ATTRIBUTES = cINSTANCE.getTypeDefinition_lt_getGoupsOfAttributes();

	/**
	    @generated
	*/
	StringAttributeType TYPE_DEFINITION_at_ID_RUNTIME = cINSTANCE.getTypeDefinition_at_getIdRuntime();

	/**
	    @generated
	*/
	LinkType TYPE_DEFINITION_lt_MODIFICATION_PAGES = cINSTANCE.getTypeDefinition_lt_getModificationPages();

	/**
	    @generated
	*/
	LinkType TYPE_DEFINITION_lt_VALIDATORS = cINSTANCE.getTypeDefinition_lt_getValidators();

	/**
	    @generated
	*/
	ItemType UILISTENER = cINSTANCE.getUIListener();

	/**
	    @generated
	*/
	LinkType UILISTENER_lt_FIELDS = cINSTANCE.getUIListener_lt_getFields();

	/**
	    @generated
	*/
	ItemType UIVALIDATOR = cINSTANCE.getUIValidator();

	/**
	    @generated
	*/
	LinkType UIVALIDATOR_lt_LISTEN_ATTRIBUTES = cINSTANCE.getUIValidator_lt_getListenAttributes();

	/**
	    @generated
	*/
	LinkType UIVALIDATOR_lt_OVERWRITE = cINSTANCE.getUIValidator_lt_getOverwrite();

	/**
	    @generated
	*/
	ItemType URL = cINSTANCE.getURL();

	/**
	    @generated
	*/
	ItemType UUID = cINSTANCE.getUUID();

	/**
	    @generated
	*/
	ItemType UNRESOLVED_ATTRIBUTE_TYPE = cINSTANCE.getUnresolvedAttributeType();

	/**
	    @generated
	*/
	ItemType VIEW = cINSTANCE.getView();

	/**
	    @generated
	*/
	StringAttributeType VIEW_at_ICON = cINSTANCE.getView_at_getIcon();

	/**
	    @generated
	*/
	LinkType VIEW_lt_VIEW_ITEM_TYPES = cINSTANCE.getView_lt_getViewItemTypes();

	/**
	    @generated
	*/
	ItemType VIEW_DESCRIPTION = cINSTANCE.getViewDescription();

	/**
	    @generated
	*/
	LinkType VIEW_DESCRIPTION_lt_ROOT_TYPES = cINSTANCE.getViewDescription_lt_getRootTypes();

	/**
	    @generated
	*/
	ItemType VIEW_ITEM_TYPE = cINSTANCE.getViewItemType();

	/**
	    @generated
	*/
	BooleanAttributeType VIEW_ITEM_TYPE_at_IS_ROOT_ELEMENT = cINSTANCE.getViewItemType_at_getIsRootElement();

	/**
	    @generated
	*/
	LinkType VIEW_ITEM_TYPE_lt_ITEM_TYPE = cINSTANCE.getViewItemType_lt_getItemType();

	/**
	    @generated
	*/
	BooleanAttributeType VIEW_ITEM_TYPE_at_REF = cINSTANCE.getViewItemType_at_getRef();

	/**
	    @generated
	*/
	LinkType VIEW_ITEM_TYPE_lt_VIEW_LINK_TYPES = cINSTANCE.getViewItemType_lt_getViewLinkTypes();

	/**
	    @generated
	*/
	ItemType VIEW_LINK_TYPE = cINSTANCE.getViewLinkType();

	/**
	    @generated
	*/
	BooleanAttributeType VIEW_LINK_TYPE_at_AGGREGATION = cINSTANCE.getViewLinkType_at_getAggregation();

	/**
	    @generated
	*/
	BooleanAttributeType VIEW_LINK_TYPE_at_CAN_CREATE_ITEM = cINSTANCE.getViewLinkType_at_getCanCreateItem();

	/**
	    @generated
	*/
	BooleanAttributeType VIEW_LINK_TYPE_at_CAN_CREATE_LINK = cINSTANCE.getViewLinkType_at_getCanCreateLink();

	/**
	    @generated
	*/
	StringAttributeType VIEW_LINK_TYPE_at_DISPLAY_CREATE = cINSTANCE.getViewLinkType_at_getDisplayCreate();

	/**
	    @generated
	*/
	LinkType VIEW_LINK_TYPE_lt_LINK_TYPE = cINSTANCE.getViewLinkType_lt_getLinkType();

	/**
	    @generated
	*/
	ItemType VIEW_MODEL = cINSTANCE.getViewModel();

	/**
	    @generated
	*/
	LinkType VIEW_MODEL_lt_VIEWS = cINSTANCE.getViewModel_lt_getViews();

	/**
	    @generated
	*/
	ItemType WCLISTENER = cINSTANCE.getWCListener();

	/**
	    @generated
	*/
	LinkType WCLISTENER_lt_LISTEN_ATTRIBUTE_DEFINITIONS = cINSTANCE.getWCListener_lt_getListenAttributeDefinitions();

	/**
	    @generated
	*/
	LinkType WCLISTENER_lt_LISTEN_ITEM_TYPES = cINSTANCE.getWCListener_lt_getListenItemTypes();
	}


}

