/**
 * Licensed to the Apache Software Foundation (ASF) under one* or more
 * contributor license agreements. See the NOTICE file* distributed with this
 * work for additional information* regarding copyright ownership. The ASF
 * licenses this file* to you under the Apache License, Version 2.0 (the*
 * "License"); you may not use this file except in compliance* with the License.
 * You may obtain a copy of the License at**
 * http://www.apache.org/licenses/LICENSE-2.0** Unless required by applicable
 * law or agreed to in writing,* software distributed under the License is
 * distributed on an* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY*
 * KIND, either express or implied. See the License for the* specific language
 * governing permissions and limitations* under the License.
 */
package fr.imag.adele.cadse.core;

import fr.imag.adele.cadse.core.attribute.BooleanAttributeType;
import fr.imag.adele.cadse.core.attribute.DateAttributeType;
import fr.imag.adele.cadse.core.attribute.DoubleAttributeType;
import fr.imag.adele.cadse.core.attribute.EnumAttributeType;
import fr.imag.adele.cadse.core.attribute.IntegerAttributeType;
import fr.imag.adele.cadse.core.attribute.ListAttributeType;
import fr.imag.adele.cadse.core.attribute.StringAttributeType;
import fr.imag.adele.cadse.core.attribute.SymbolicBitMapAttributeType;
import fr.imag.adele.cadse.core.attribute.UUIDAttributeType;
import fr.imag.adele.cadse.core.enumdef.ScriptType;
import fr.imag.adele.cadse.core.enumdef.TWCommitKind;
import fr.imag.adele.cadse.core.enumdef.TWDestEvol;
import fr.imag.adele.cadse.core.enumdef.TWEvol;
import fr.imag.adele.cadse.core.enumdef.TWUpdateKind;
import fr.imag.adele.cadse.core.ui.EPosLabel;

/**
 * @generated
 */
public class CadseRootCST {
	/**
	 * @generated
	 */
	public static ItemType							ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							ATTRIBUTE_TYPE_lt__$_INVERT_PART_ATTRIBUTES_DEFINITION_TO_META_ITEM_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							ATTRIBUTE_TYPE_lt__$_INVERT_PART_FIELDS_TO_STRUCT_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							ATTRIBUTE_TYPE_lt__$_INVERT_PART_KEY_TYPE_TO_MAP_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							ATTRIBUTE_TYPE_lt__$_INVERT_PART_SUB_TYPE_TO_LIST_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							ATTRIBUTE_TYPE_lt__$_INVERT_PART_SUB_TYPE_TO_VARIABLE_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							ATTRIBUTE_TYPE_lt__$_INVERT_PART_VALUE_TYPE_TO_MAP_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public final static String						ATTRIBUTE_TYPE_at_TWCOMMIT_KIND								= "TWCommitKind";
	/**
	 * @generated
	 */
	public static EnumAttributeType<TWCommitKind>	ATTRIBUTE_TYPE_at_TWCOMMIT_KIND_;
	/**
	 * @generated
	 */
	public final static String						ATTRIBUTE_TYPE_at_TWEVOL									= "TWEvol";
	/**
	 * @generated
	 */
	public static EnumAttributeType<TWEvol>			ATTRIBUTE_TYPE_at_TWEVOL_;
	/**
	 * @generated
	 */
	public final static String						ATTRIBUTE_TYPE_at_TWREV_SPECIFIC							= "TWRevSpecific";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				ATTRIBUTE_TYPE_at_TWREV_SPECIFIC_;
	/**
	 * @generated
	 */
	public final static String						ATTRIBUTE_TYPE_at_TWUPDATE_KIND								= "TWUpdateKind";
	/**
	 * @generated
	 */
	public static EnumAttributeType<TWUpdateKind>	ATTRIBUTE_TYPE_at_TWUPDATE_KIND_;
	/**
	 * @generated
	 */
	public final static String						ATTRIBUTE_TYPE_at_CACHED									= "cached";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				ATTRIBUTE_TYPE_at_CACHED_;
	/**
	 * @generated
	 */
	public final static String						ATTRIBUTE_TYPE_at_CANNOT_BE_UNDEFINED						= "cannot-be-undefined";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				ATTRIBUTE_TYPE_at_CANNOT_BE_UNDEFINED_;
	/**
	 * @generated
	 */
	public final static String						ATTRIBUTE_TYPE_at_FINAL_VALUE								= "final-value";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				ATTRIBUTE_TYPE_at_FINAL_VALUE_;
	/**
	 * @generated
	 */
	public final static String						ATTRIBUTE_TYPE_at_IS_META_ATTRIBUTE							= "is-meta-attribute";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				ATTRIBUTE_TYPE_at_IS_META_ATTRIBUTE_;
	/**
	 * @generated
	 */
	public final static String						ATTRIBUTE_TYPE_at_MUST_BE_INITIALIZED_AT_CREATION_TIME		= "must-be-initialized-at-creation-time";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				ATTRIBUTE_TYPE_at_MUST_BE_INITIALIZED_AT_CREATION_TIME_;
	/**
	 * @generated
	 */
	public final static String						ATTRIBUTE_TYPE_at_NAME										= "name";
	/**
	 * @generated
	 */
	public static StringAttributeType				ATTRIBUTE_TYPE_at_NAME_;
	/**
	 * @generated
	 */
	public final static String						ATTRIBUTE_TYPE_at_OVERWRITABLE								= "overwritable";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				ATTRIBUTE_TYPE_at_OVERWRITABLE_;
	/**
	 * @generated
	 */
	public final static String						ATTRIBUTE_TYPE_at_TRANSIENT									= "transient";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				ATTRIBUTE_TYPE_at_TRANSIENT_;
	/**
	 * @generated
	 */
	public static ItemType							BOOLEAN_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public final static String						BOOLEAN_ATTRIBUTE_TYPE_at_DEFAULT_VALUE						= "defaultValue";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				BOOLEAN_ATTRIBUTE_TYPE_at_DEFAULT_VALUE_;
	/**
	 * @generated
	 */
	public static ItemType							CADSE_RUNTIME;
	/**
	 * @generated
	 */
	public final static String						CADSE_RUNTIME_at_CADSE_DEFINITION_ID						= "cadseDefinitionId";
	/**
	 * @generated
	 */
	public static StringAttributeType				CADSE_RUNTIME_at_CADSE_DEFINITION_ID_;
	/**
	 * @generated
	 */
	public final static String						CADSE_RUNTIME_at_DEFAULT_CONTENT_REPO_URL					= "defaultContentRepoURL";
	/**
	 * @generated
	 */
	public static StringAttributeType				CADSE_RUNTIME_at_DEFAULT_CONTENT_REPO_URL_;
	/**
	 * @generated
	 */
	public final static String						CADSE_RUNTIME_at_DESCRIPTION								= "description";
	/**
	 * @generated
	 */
	public static StringAttributeType				CADSE_RUNTIME_at_DESCRIPTION_;
	/**
	 * @generated
	 */
	public final static String						CADSE_RUNTIME_at_EXCUTED									= "excuted";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				CADSE_RUNTIME_at_EXCUTED_;
	/**
	 * @generated
	 */
	public static LinkType							CADSE_RUNTIME_lt_EXTENDS;
	/**
	 * @generated
	 */
	public final static String						CADSE_RUNTIME_at_ITEM_REPO_LOGIN							= "itemRepoLogin";
	/**
	 * @generated
	 */
	public static StringAttributeType				CADSE_RUNTIME_at_ITEM_REPO_LOGIN_;
	/**
	 * @generated
	 */
	public final static String						CADSE_RUNTIME_at_ITEM_REPO_PASSWD							= "itemRepoPasswd";
	/**
	 * @generated
	 */
	public static StringAttributeType				CADSE_RUNTIME_at_ITEM_REPO_PASSWD_;
	/**
	 * @generated
	 */
	public final static String						CADSE_RUNTIME_at_ITEM_REPO_URL								= "itemRepoURL";
	/**
	 * @generated
	 */
	public static StringAttributeType				CADSE_RUNTIME_at_ITEM_REPO_URL_;
	/**
	 * @generated
	 */
	public static LinkType							CADSE_RUNTIME_lt_ITEM_TYPES;
	/**
	 * @generated
	 */
	public static LinkType							CADSE_RUNTIME_lt_VIEWS;
	/**
	 * @generated
	 */
	public static ItemType							CADSE_RUNTIME_EXECUTED;
	/**
	 * @generated
	 */
	public static ItemType							DBROWSER;
	/**
	 * @generated
	 */
	public static ItemType							DCHECK_BOX;
	/**
	 * @generated
	 */
	public static ItemType							DCHECKED_LIST;
	/**
	 * @generated
	 */
	public static ItemType							DCHECKED_TREE;
	/**
	 * @generated
	 */
	public static ItemType							DCOMBO;
	/**
	 * @generated
	 */
	public static ItemType							DGRILD;
	/**
	 * @generated
	 */
	public static ItemType							DLIST;
	/**
	 * @generated
	 */
	public final static String						DLIST_at_EDITABLE_BUTTON									= "editable-button";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				DLIST_at_EDITABLE_BUTTON_;
	/**
	 * @generated
	 */
	public final static String						DLIST_at_ORDER_BUTTON										= "order-button";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				DLIST_at_ORDER_BUTTON_;
	/**
	 * @generated
	 */
	public final static String						DLIST_at_SHOW_FILTER										= "show-filter";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				DLIST_at_SHOW_FILTER_;
	/**
	 * @generated
	 */
	public final static String						DLIST_at_UPDATE_BUTTON										= "update-button";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				DLIST_at_UPDATE_BUTTON_;
	/**
	 * @generated
	 */
	public static ItemType							DSASH_FORM;
	/**
	 * @generated
	 */
	public static ItemType							DTEXT;
	/**
	 * @generated
	 */
	public final static String						DTEXT_at_MULTI_LINE											= "multi-line";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				DTEXT_at_MULTI_LINE_;
	/**
	 * @generated
	 */
	public final static String						DTEXT_at_NO_BORDER											= "no-border";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				DTEXT_at_NO_BORDER_;
	/**
	 * @generated
	 */
	public final static String						DTEXT_at_TOOL_TIP											= "tool-tip";
	/**
	 * @generated
	 */
	public static StringAttributeType				DTEXT_at_TOOL_TIP_;
	/**
	 * @generated
	 */
	public final static String						DTEXT_at_VERTICAL_SPAN										= "vertical-span";
	/**
	 * @generated
	 */
	public static IntegerAttributeType				DTEXT_at_VERTICAL_SPAN_;
	/**
	 * @generated
	 */
	public final static String						DTEXT_at_WRAP_LINE											= "wrap-line";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				DTEXT_at_WRAP_LINE_;
	/**
	 * @generated
	 */
	public static ItemType							DTREE;
	/**
	 * @generated
	 */
	public static ItemType							DATE_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public final static String						DATE_ATTRIBUTE_TYPE_at_DATE_FORMAT							= "date-format";
	/**
	 * @generated
	 */
	public static StringAttributeType				DATE_ATTRIBUTE_TYPE_at_DATE_FORMAT_;
	/**
	 * @generated
	 */
	public final static String						DATE_ATTRIBUTE_TYPE_at_DEFAULT_VALUE						= "defaultValue";
	/**
	 * @generated
	 */
	public static DateAttributeType					DATE_ATTRIBUTE_TYPE_at_DEFAULT_VALUE_;
	/**
	 * @generated
	 */
	public static ItemType							DISPLAY;
	/**
	 * @generated
	 */
	public static LinkType							DISPLAY_lt__$_INVERT_PART_DISPLAY_TO_FIELD_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							DISPLAY_lt_IC;
	/**
	 * @generated
	 */
	public static LinkType							DISPLAY_lt_MC;
	/**
	 * @generated
	 */
	public static ItemType							DOUBLE_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public final static String						DOUBLE_ATTRIBUTE_TYPE_at_DEFAULT_VALUE						= "defaultValue";
	/**
	 * @generated
	 */
	public static DoubleAttributeType				DOUBLE_ATTRIBUTE_TYPE_at_DEFAULT_VALUE_;
	/**
	 * @generated
	 */
	public final static String						DOUBLE_ATTRIBUTE_TYPE_at_MAX								= "max";
	/**
	 * @generated
	 */
	public static DoubleAttributeType				DOUBLE_ATTRIBUTE_TYPE_at_MAX_;
	/**
	 * @generated
	 */
	public final static String						DOUBLE_ATTRIBUTE_TYPE_at_MIN								= "min";
	/**
	 * @generated
	 */
	public static DoubleAttributeType				DOUBLE_ATTRIBUTE_TYPE_at_MIN_;
	/**
	 * @generated
	 */
	public static ItemType							ENUM_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							ENUM_ATTRIBUTE_TYPE_lt_CODE;
	/**
	 * @generated
	 */
	public final static String						ENUM_ATTRIBUTE_TYPE_at_DEFAULT_VALUE						= "defaultValue";
	/**
	 * @generated
	 */
	public static StringAttributeType				ENUM_ATTRIBUTE_TYPE_at_DEFAULT_VALUE_;
	/**
	 * @generated
	 */
	public final static String						ENUM_ATTRIBUTE_TYPE_at_ENUM_CLAZZ							= "enum-clazz";
	/**
	 * @generated
	 */
	public static StringAttributeType				ENUM_ATTRIBUTE_TYPE_at_ENUM_CLAZZ_;
	/**
	 * @generated
	 */
	public final static String						ENUM_ATTRIBUTE_TYPE_at_VALUES								= "values";
	/**
	 * @generated
	 */
	public static ListAttributeType<String>			ENUM_ATTRIBUTE_TYPE_at_VALUES_;
	/**
	 * @generated
	 */
	public static ItemType							FIELD_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							FIELD_TYPE_lt__$_INVERT_PART_FIELDS_TO_PAGE_DEFINITION_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							FIELD_TYPE_lt_ATTRIBUTE;
	/**
	 * @generated
	 */
	public static LinkType							FIELD_TYPE_lt_DISPLAY;
	/**
	 * @generated
	 */
	public final static String						FIELD_TYPE_at_EDITABLE										= "editable";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				FIELD_TYPE_at_EDITABLE_;
	/**
	 * @generated
	 */
	public final static String						FIELD_TYPE_at_LABEL											= "label";
	/**
	 * @generated
	 */
	public static StringAttributeType				FIELD_TYPE_at_LABEL_;
	/**
	 * @generated
	 */
	public final static String						FIELD_TYPE_at_POSITION										= "position";
	/**
	 * @generated
	 */
	public static EnumAttributeType<EPosLabel>		FIELD_TYPE_at_POSITION_;
	/**
	 * @generated
	 */
	public static ItemType							FLAG_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public final static String						FLAG_ATTRIBUTE_TYPE_at_VALUES								= "values";
	/**
	 * @generated
	 */
	public static ListAttributeType<String>			FLAG_ATTRIBUTE_TYPE_at_VALUES_;
	/**
	 * @generated
	 */
	public static ItemType							IC_ABSTRACT_FOR_BROWSER_COMBO;
	/**
	 * @generated
	 */
	public final static String						IC_ABSTRACT_FOR_BROWSER_COMBO_at_MESSAGE					= "message";
	/**
	 * @generated
	 */
	public static StringAttributeType				IC_ABSTRACT_FOR_BROWSER_COMBO_at_MESSAGE_;
	/**
	 * @generated
	 */
	public final static String						IC_ABSTRACT_FOR_BROWSER_COMBO_at_TITLE						= "title";
	/**
	 * @generated
	 */
	public static StringAttributeType				IC_ABSTRACT_FOR_BROWSER_COMBO_at_TITLE_;
	/**
	 * @generated
	 */
	public static ItemType							IC_ABSTRACT_FOR_LIST;
	/**
	 * @generated
	 */
	public final static String						IC_ABSTRACT_FOR_LIST_at_MESSAGE								= "message";
	/**
	 * @generated
	 */
	public static StringAttributeType				IC_ABSTRACT_FOR_LIST_at_MESSAGE_;
	/**
	 * @generated
	 */
	public final static String						IC_ABSTRACT_FOR_LIST_at_TITLE								= "title";
	/**
	 * @generated
	 */
	public static StringAttributeType				IC_ABSTRACT_FOR_LIST_at_TITLE_;
	/**
	 * @generated
	 */
	public static ItemType							IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO;
	/**
	 * @generated
	 */
	public final static String						IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO_at_MESSAGE	= "message";
	/**
	 * @generated
	 */
	public static StringAttributeType				IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO_at_MESSAGE_;
	/**
	 * @generated
	 */
	public final static String						IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO_at_TITLE		= "title";
	/**
	 * @generated
	 */
	public static StringAttributeType				IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO_at_TITLE_;
	/**
	 * @generated
	 */
	public static ItemType							IC_BOOLEAN_TEXT;
	/**
	 * @generated
	 */
	public static ItemType							IC_ENUM_FOR_BROWSER_COMBO;
	/**
	 * @generated
	 */
	public static ItemType							IC_ENUM_FOR_LIST;
	/**
	 * @generated
	 */
	public static ItemType							IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST;
	/**
	 * @generated
	 */
	public static ItemType							IC_FOLDER_RESOURCE_FOR_BROWSER_COMBO_LIST;
	/**
	 * @generated
	 */
	public static ItemType							IC_JAR_RESOURCE_FOR_BROWSER_COMBO_LIST;
	/**
	 * @generated
	 */
	public static ItemType							IC_JAVA_CLASS_FOR_BROWSER_COMBO;
	/**
	 * @generated
	 */
	public static ItemType							IC_LINK_FOR_BROWSER_COMBO_LIST;
	/**
	 * @generated
	 */
	public static ItemType							IC_PART_LINK_FOR_BROWSER_COMBO_LIST;
	/**
	 * @generated
	 */
	public static ItemType							IC_RESOURCE_TREE_DIALOG_FOR_BROWSER_COMBO_LIST;
	/**
	 * @generated
	 */
	public static ItemType							IC_STATIC_ARRAY_OF_OBJECT_FOR_BROWSER_COMBO;
	/**
	 * @generated
	 */
	public static ItemType							IC_STRING_LIST_FOR_LIST;
	/**
	 * @generated
	 */
	public final static String						IC_STRING_LIST_FOR_LIST_at_ALLOW_DUPLICATE					= "allowDuplicate";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				IC_STRING_LIST_FOR_LIST_at_ALLOW_DUPLICATE_;
	/**
	 * @generated
	 */
	public static ItemType							INT_MODEL_CONTROLLER;
	/**
	 * @generated
	 */
	public final static String						INT_MODEL_CONTROLLER_at_DEFAULT_VALUE						= "default-value";
	/**
	 * @generated
	 */
	public static IntegerAttributeType				INT_MODEL_CONTROLLER_at_DEFAULT_VALUE_;
	/**
	 * @generated
	 */
	public final static String						INT_MODEL_CONTROLLER_at_ERROR_MSG_MAX						= "error-msg-max";
	/**
	 * @generated
	 */
	public static StringAttributeType				INT_MODEL_CONTROLLER_at_ERROR_MSG_MAX_;
	/**
	 * @generated
	 */
	public final static String						INT_MODEL_CONTROLLER_at_ERROR_MSG_MIN						= "error-msg-min";
	/**
	 * @generated
	 */
	public static StringAttributeType				INT_MODEL_CONTROLLER_at_ERROR_MSG_MIN_;
	/**
	 * @generated
	 */
	public final static String						INT_MODEL_CONTROLLER_at_MAX									= "max";
	/**
	 * @generated
	 */
	public static IntegerAttributeType				INT_MODEL_CONTROLLER_at_MAX_;
	/**
	 * @generated
	 */
	public final static String						INT_MODEL_CONTROLLER_at_MIN									= "min";
	/**
	 * @generated
	 */
	public static IntegerAttributeType				INT_MODEL_CONTROLLER_at_MIN_;
	/**
	 * @generated
	 */
	public static ItemType							INTEGER_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public final static String						INTEGER_ATTRIBUTE_TYPE_at_DEFAULT_VALUE						= "defaultValue";
	/**
	 * @generated
	 */
	public static IntegerAttributeType				INTEGER_ATTRIBUTE_TYPE_at_DEFAULT_VALUE_;
	/**
	 * @generated
	 */
	public final static String						INTEGER_ATTRIBUTE_TYPE_at_MAX								= "max";
	/**
	 * @generated
	 */
	public static IntegerAttributeType				INTEGER_ATTRIBUTE_TYPE_at_MAX_;
	/**
	 * @generated
	 */
	public final static String						INTEGER_ATTRIBUTE_TYPE_at_MIN								= "min";
	/**
	 * @generated
	 */
	public static IntegerAttributeType				INTEGER_ATTRIBUTE_TYPE_at_MIN_;
	/**
	 * @generated
	 */
	public static ItemType							INTERACTION_CONTROLLER;
	/**
	 * @generated
	 */
	public static LinkType							INTERACTION_CONTROLLER_lt__$_INVERT_PART_IC_TO_DISPLAY;
	/**
	 * @generated
	 */
	public static ItemType							ITEM_TYPE;
	/**
	 * @generated
	 */
	public final static String						ITEM_TYPE_at_TW_VERSION										= "TW-version";
	/**
	 * @generated
	 */
	public static IntegerAttributeType				ITEM_TYPE_at_TW_VERSION_;
	/**
	 * @generated
	 */
	public final static String						ITEM_TYPE_at_COMMITTED_BY									= "committedBy";
	/**
	 * @generated
	 */
	public static StringAttributeType				ITEM_TYPE_at_COMMITTED_BY_;
	/**
	 * @generated
	 */
	public final static String						ITEM_TYPE_at_COMMITTED_DATE									= "committedDate";
	/**
	 * @generated
	 */
	public static DateAttributeType					ITEM_TYPE_at_COMMITTED_DATE_;
	/**
	 * @generated
	 */
	public final static String						ITEM_TYPE_at_DISPLAY_NAME									= "display-name";
	/**
	 * @generated
	 */
	public static StringAttributeType				ITEM_TYPE_at_DISPLAY_NAME_;
	/**
	 * @generated
	 */
	public static LinkType							ITEM_TYPE_lt_EXTENDED_BY;
	/**
	 * @generated
	 */
	public final static String						ITEM_TYPE_at_ID												= "id";
	/**
	 * @generated
	 */
	public static StringAttributeType				ITEM_TYPE_at_ID_;
	/**
	 * @generated
	 */
	public static LinkType							ITEM_TYPE_lt_INSTANCE_OF;
	/**
	 * @generated
	 */
	public final static String						ITEM_TYPE_at_ITEM_HIDDEN									= "item-hidden";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				ITEM_TYPE_at_ITEM_HIDDEN_;
	/**
	 * @generated
	 */
	public final static String						ITEM_TYPE_at_ITEM_READONLY									= "item-readonly";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				ITEM_TYPE_at_ITEM_READONLY_;
	/**
	 * @generated
	 */
	public static LinkType							ITEM_TYPE_lt_MODIFIED_ATTRIBUTES;
	/**
	 * @generated
	 */
	public final static String						ITEM_TYPE_at_NAME											= "name";
	/**
	 * @generated
	 */
	public static StringAttributeType				ITEM_TYPE_at_NAME_;
	/**
	 * @generated
	 */
	public final static String						ITEM_TYPE_at_PARENT_ITEM_ID									= "parent-item-id";
	/**
	 * @generated
	 */
	public static UUIDAttributeType					ITEM_TYPE_at_PARENT_ITEM_ID_;
	/**
	 * @generated
	 */
	public final static String						ITEM_TYPE_at_PARENT_ITEM_TYPE_ID							= "parent-item-type-id";
	/**
	 * @generated
	 */
	public static StringAttributeType				ITEM_TYPE_at_PARENT_ITEM_TYPE_ID_;
	/**
	 * @generated
	 */
	public final static String						ITEM_TYPE_at_QUALIFIED_DISPLAY_NAME							= "qualified-display-name";
	/**
	 * @generated
	 */
	public static StringAttributeType				ITEM_TYPE_at_QUALIFIED_DISPLAY_NAME_;
	/**
	 * @generated
	 */
	public final static String						ITEM_TYPE_at_QUALIFIED_NAME									= "qualified-name";
	/**
	 * @generated
	 */
	public static StringAttributeType				ITEM_TYPE_at_QUALIFIED_NAME_;
	/**
	 * @generated
	 */
	public final static String						ITEM_TYPE_at_READ_ONLY										= "read-only";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				ITEM_TYPE_at_READ_ONLY_;
	/**
	 * @generated
	 */
	public final static String						ITEM_TYPE_at_REQUIRE_NEW_REV								= "requireNewRev";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				ITEM_TYPE_at_REQUIRE_NEW_REV_;
	/**
	 * @generated
	 */
	public final static String						ITEM_TYPE_at_REV_MODIFIED									= "revModified";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				ITEM_TYPE_at_REV_MODIFIED_;
	/**
	 * @generated
	 */
	public static LinkType							ITEM_TYPE_lt_WS_LISTENERS;
	/**
	 * @generated
	 */
	public static ItemType							JAVA_ELEMENT_TREE_CONTROLLER;
	/**
	 * @generated
	 */
	public static ItemType							KEY_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							KEY_ATTRIBUTE_TYPE_lt_ATTRIBUTES_IN;
	/**
	 * @generated
	 */
	public final static String						KEY_ATTRIBUTE_TYPE_at_EXPRESSION							= "expression";
	/**
	 * @generated
	 */
	public static StringAttributeType				KEY_ATTRIBUTE_TYPE_at_EXPRESSION_;
	/**
	 * @generated
	 */
	public static ItemType							LINK_DEFINITION_ATTIBUTE_TYPE;
	/**
	 * @generated
	 */
	public final static String						LINK_DEFINITION_ATTIBUTE_TYPE_at_TWCOUPLED					= "TWCoupled";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				LINK_DEFINITION_ATTIBUTE_TYPE_at_TWCOUPLED_;
	/**
	 * @generated
	 */
	public final static String						LINK_DEFINITION_ATTIBUTE_TYPE_at_TWDEST_EVOL				= "TWDestEvol";
	/**
	 * @generated
	 */
	public static EnumAttributeType<TWDestEvol>		LINK_DEFINITION_ATTIBUTE_TYPE_at_TWDEST_EVOL_;
	/**
	 * @generated
	 */
	public static LinkType							LINK_DEFINITION_ATTIBUTE_TYPE_lt_DESTINATION;
	/**
	 * @generated
	 */
	public static LinkType							LINK_DEFINITION_ATTIBUTE_TYPE_lt_INVERSE;
	/**
	 * @generated
	 */
	public final static String						LINK_DEFINITION_ATTIBUTE_TYPE_at_KIND						= "kind";
	/**
	 * @generated
	 */
	public static SymbolicBitMapAttributeType		LINK_DEFINITION_ATTIBUTE_TYPE_at_KIND_;
	/**
	 * @generated
	 */
	public final static String						LINK_DEFINITION_ATTIBUTE_TYPE_at_LINK_IS_HIDDEN				= "link-is-hidden";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				LINK_DEFINITION_ATTIBUTE_TYPE_at_LINK_IS_HIDDEN_;
	/**
	 * @generated
	 */
	public final static String						LINK_DEFINITION_ATTIBUTE_TYPE_at_MAX						= "max";
	/**
	 * @generated
	 */
	public static IntegerAttributeType				LINK_DEFINITION_ATTIBUTE_TYPE_at_MAX_;
	/**
	 * @generated
	 */
	public final static String						LINK_DEFINITION_ATTIBUTE_TYPE_at_MIN						= "min";
	/**
	 * @generated
	 */
	public static IntegerAttributeType				LINK_DEFINITION_ATTIBUTE_TYPE_at_MIN_;
	/**
	 * @generated
	 */
	public final static String						LINK_DEFINITION_ATTIBUTE_TYPE_at_SELECTION					= "selection";
	/**
	 * @generated
	 */
	public static StringAttributeType				LINK_DEFINITION_ATTIBUTE_TYPE_at_SELECTION_;
	/**
	 * @generated
	 */
	public static LinkType							LINK_DEFINITION_ATTIBUTE_TYPE_lt_SOURCE;
	/**
	 * @generated
	 */
	public static ItemType							LINK_MODEL_CONTROLLER;
	/**
	 * @generated
	 */
	public final static String						LINK_MODEL_CONTROLLER_at_ERROR_MESSAGE						= "error-message";
	/**
	 * @generated
	 */
	public static StringAttributeType				LINK_MODEL_CONTROLLER_at_ERROR_MESSAGE_;
	/**
	 * @generated
	 */
	public static ItemType							LIST_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public final static String						LIST_ATTRIBUTE_TYPE_at_MAX									= "max";
	/**
	 * @generated
	 */
	public static IntegerAttributeType				LIST_ATTRIBUTE_TYPE_at_MAX_;
	/**
	 * @generated
	 */
	public final static String						LIST_ATTRIBUTE_TYPE_at_MIN									= "min";
	/**
	 * @generated
	 */
	public static IntegerAttributeType				LIST_ATTRIBUTE_TYPE_at_MIN_;
	/**
	 * @generated
	 */
	public static LinkType							LIST_ATTRIBUTE_TYPE_lt_SUB_TYPE;
	/**
	 * @generated
	 */
	public static ItemType							LIST_OF_STRING_MODEL_CONTROLLER;
	/**
	 * @generated
	 */
	public static ItemType							LONG_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public static ItemType							MC_DATE;
	/**
	 * @generated
	 */
	public final static String						MC_DATE_at_PATTERN											= "pattern";
	/**
	 * @generated
	 */
	public static StringAttributeType				MC_DATE_at_PATTERN_;
	/**
	 * @generated
	 */
	public static ItemType							MC_LINK_TO_BOOLEAN;
	/**
	 * @generated
	 */
	public static ItemType							MC_SHORT_NAME_ITEM_PROPERTY;
	/**
	 * @generated
	 */
	public static ItemType							MC_STRING_LIST_TO_ENUM_LIST;
	/**
	 * @generated
	 */
	public static ItemType							MC_STRING_TO_JAVA_ELEMENT;
	/**
	 * @generated
	 */
	public static ItemType							MAP_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							MAP_ATTRIBUTE_TYPE_lt_KEY_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							MAP_ATTRIBUTE_TYPE_lt_VALUE_TYPE;
	/**
	 * @generated
	 */
	public static ItemType							META_ITEM_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							META_ITEM_TYPE_lt_ATTRIBUTES_DEFINITION;
	/**
	 * @generated
	 */
	public final static String						META_ITEM_TYPE_at_CADSE_NAME								= "cadse-name";
	/**
	 * @generated
	 */
	public static StringAttributeType				META_ITEM_TYPE_at_CADSE_NAME_;
	/**
	 * @generated
	 */
	public static LinkType							META_ITEM_TYPE_lt_CADSE_RUNTIME;
	/**
	 * @generated
	 */
	public static LinkType							META_ITEM_TYPE_lt_CREATION_PAGES;
	/**
	 * @generated
	 */
	public final static String						META_ITEM_TYPE_at_HAS_CONTENT								= "has-content";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				META_ITEM_TYPE_at_HAS_CONTENT_;
	/**
	 * @generated
	 */
	public final static String						META_ITEM_TYPE_at_ICON										= "icon";
	/**
	 * @generated
	 */
	public static StringAttributeType				META_ITEM_TYPE_at_ICON_;
	/**
	 * @generated
	 */
	public final static String						META_ITEM_TYPE_at_IS_ABSTRACT								= "is-abstract";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				META_ITEM_TYPE_at_IS_ABSTRACT_;
	/**
	 * @generated
	 */
	public final static String						META_ITEM_TYPE_at_ITEM_FACTORY								= "item-factory";
	/**
	 * @generated
	 */
	public static StringAttributeType				META_ITEM_TYPE_at_ITEM_FACTORY_;
	/**
	 * @generated
	 */
	public final static String						META_ITEM_TYPE_at_ITEM_MANAGER								= "item-manager";
	/**
	 * @generated
	 */
	public static StringAttributeType				META_ITEM_TYPE_at_ITEM_MANAGER_;
	/**
	 * @generated
	 */
	public static LinkType							META_ITEM_TYPE_lt_META_LINK_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							META_ITEM_TYPE_lt_MODIFICATION_PAGES;
	/**
	 * @generated
	 */
	public final static String						META_ITEM_TYPE_at_PACKAGE_NAME								= "package-name";
	/**
	 * @generated
	 */
	public static StringAttributeType				META_ITEM_TYPE_at_PACKAGE_NAME_;
	/**
	 * @generated
	 */
	public final static String						META_ITEM_TYPE_at_ROOT_ELEMENT								= "root-element";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				META_ITEM_TYPE_at_ROOT_ELEMENT_;
	/**
	 * @generated
	 */
	public static LinkType							META_ITEM_TYPE_lt_SUB_TYPES;
	/**
	 * @generated
	 */
	public static LinkType							META_ITEM_TYPE_lt_SUPER_TYPE;
	/**
	 * @generated
	 */
	public static ItemType							MODEL_CONTROLLER;
	/**
	 * @generated
	 */
	public static LinkType							MODEL_CONTROLLER_lt__$_INVERT_PART_MC_TO_DISPLAY;
	/**
	 * @generated
	 */
	public static ItemType							PACKAGE_LIST_CONTROLLER;
	/**
	 * @generated
	 */
	public static ItemType							PAGE_DEFINITION_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							PAGE_DEFINITION_TYPE_lt__$_INVERT_PART_CREATION_PAGES_TO_META_ITEM_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							PAGE_DEFINITION_TYPE_lt__$_INVERT_PART_MODIFICATION_PAGES_TO_META_ITEM_TYPE;
	/**
	 * @generated
	 */
	public final static String						PAGE_DEFINITION_TYPE_at_DESCRIPTION							= "description";
	/**
	 * @generated
	 */
	public static StringAttributeType				PAGE_DEFINITION_TYPE_at_DESCRIPTION_;
	/**
	 * @generated
	 */
	public static LinkType							PAGE_DEFINITION_TYPE_lt_FIELDS;
	/**
	 * @generated
	 */
	public final static String						PAGE_DEFINITION_TYPE_at_HSPAN								= "hspan";
	/**
	 * @generated
	 */
	public static IntegerAttributeType				PAGE_DEFINITION_TYPE_at_HSPAN_;
	/**
	 * @generated
	 */
	public final static String						PAGE_DEFINITION_TYPE_at_LABEL								= "label";
	/**
	 * @generated
	 */
	public static StringAttributeType				PAGE_DEFINITION_TYPE_at_LABEL_;
	/**
	 * @generated
	 */
	public static LinkType							PAGE_DEFINITION_TYPE_lt_LISTENER;
	/**
	 * @generated
	 */
	public final static String						PAGE_DEFINITION_TYPE_at_TITLE								= "title";
	/**
	 * @generated
	 */
	public static StringAttributeType				PAGE_DEFINITION_TYPE_at_TITLE_;
	/**
	 * @generated
	 */
	public static ItemType							RUNTIME_CLASS;
	/**
	 * @generated
	 */
	public final static String						RUNTIME_CLASS_at_MODULE_NAME								= "moduleName";
	/**
	 * @generated
	 */
	public static StringAttributeType				RUNTIME_CLASS_at_MODULE_NAME_;
	/**
	 * @generated
	 */
	public final static String						RUNTIME_CLASS_at_QUALIFIED_CLASS_NAME						= "qualifiedClassName";
	/**
	 * @generated
	 */
	public static StringAttributeType				RUNTIME_CLASS_at_QUALIFIED_CLASS_NAME_;
	/**
	 * @generated
	 */
	public static ItemType							SCRIPT;
	/**
	 * @generated
	 */
	public static LinkType							SCRIPT_lt__$_INVERT_PART_CODE_TO_ENUM_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							SCRIPT_lt__$_INVERT_PART_SCRIPT_TO_UILISTENER;
	/**
	 * @generated
	 */
	public final static String						SCRIPT_at_CODE												= "code";
	/**
	 * @generated
	 */
	public static StringAttributeType				SCRIPT_at_CODE_;
	/**
	 * @generated
	 */
	public final static String						SCRIPT_at_IMPORT_PACKAGES									= "importPackages";
	/**
	 * @generated
	 */
	public static ListAttributeType<String>			SCRIPT_at_IMPORT_PACKAGES_;
	/**
	 * @generated
	 */
	public final static String						SCRIPT_at_KIND												= "kind";
	/**
	 * @generated
	 */
	public static EnumAttributeType<ScriptType>		SCRIPT_at_KIND_;
	/**
	 * @generated
	 */
	public static LinkType							SCRIPT_lt_REQUIRE;
	/**
	 * @generated
	 */
	public static ItemType							STRING_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public final static String						STRING_ATTRIBUTE_TYPE_at_DEFAULT_VALUE						= "defaultValue";
	/**
	 * @generated
	 */
	public static StringAttributeType				STRING_ATTRIBUTE_TYPE_at_DEFAULT_VALUE_;
	/**
	 * @generated
	 */
	public final static String						STRING_ATTRIBUTE_TYPE_at_NOT_EMPTY							= "not-empty";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				STRING_ATTRIBUTE_TYPE_at_NOT_EMPTY_;
	/**
	 * @generated
	 */
	public static ItemType							STRING_COMPUTED_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public final static String						STRING_COMPUTED_ATTRIBUTE_TYPE_at_SCRIPT					= "script";
	/**
	 * @generated
	 */
	public static StringAttributeType				STRING_COMPUTED_ATTRIBUTE_TYPE_at_SCRIPT_;
	/**
	 * @generated
	 */
	public static ItemType							STRING_TO_BOOLEAN_MODEL_CONTROLLER;
	/**
	 * @generated
	 */
	public static ItemType							STRING_TO_ENUM_MODEL_CONTROLLER;
	/**
	 * @generated
	 */
	public static ItemType							STRING_TO_ONE_RESOURCE_MODEL_CONTROLLER;
	/**
	 * @generated
	 */
	public static ItemType							STRING_TO_PACKAGE_MODEL_CONTROLLER;
	/**
	 * @generated
	 */
	public static ItemType							STRING_TO_RESOURCE_LIST_MODEL_CONTROLLER;
	/**
	 * @generated
	 */
	public static ItemType							STRUCT_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							STRUCT_ATTRIBUTE_TYPE_lt_FIELDS;
	/**
	 * @generated
	 */
	public static ItemType							SYMBOLIC_BIT_MAP_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public final static String						SYMBOLIC_BIT_MAP_ATTRIBUTE_TYPE_at_SYMBOLS					= "symbols";
	/**
	 * @generated
	 */
	public static ListAttributeType<String>			SYMBOLIC_BIT_MAP_ATTRIBUTE_TYPE_at_SYMBOLS_;
	/**
	 * @generated
	 */
	public static ItemType							TIME_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public final static String						TIME_ATTRIBUTE_TYPE_at_INIT_WITH_THE_CURRENT_TIME			= "init-with-the-current-time";
	/**
	 * @generated
	 */
	public static BooleanAttributeType				TIME_ATTRIBUTE_TYPE_at_INIT_WITH_THE_CURRENT_TIME_;
	/**
	 * @generated
	 */
	public static ItemType							TREE_VIEW;
	/**
	 * @generated
	 */
	public static LinkType							TREE_VIEW_lt__$_INVERT_PART_VIEWS_TO_CADSE_RUNTIME;
	/**
	 * @generated
	 */
	public static ItemType							UILISTENER;
	/**
	 * @generated
	 */
	public static LinkType							UILISTENER_lt__$_INVERT_PART_LISTENER_TO_PAGE_DEFINITION_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							UILISTENER_lt_LISTEN;
	/**
	 * @generated
	 */
	public static LinkType							UILISTENER_lt_SCRIPT;
	/**
	 * @generated
	 */
	public static ItemType							URLATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public static ItemType							UUIDATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public static ItemType							UNRESOLVED_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public static ItemType							VARIABLE_ATTRIBUTE_TYPE;
	/**
	 * @generated
	 */
	public static LinkType							VARIABLE_ATTRIBUTE_TYPE_lt_SUB_TYPE;
	/**
	 * @generated
	 */
	public static ItemType							WCLISTENER;
	/**
	 * @generated
	 */
	public static LinkType							WCLISTENER_lt_LISTEN_ITEMS;

	/**
	 * @generated
	 */
	public CadseRootCST() {
	}

}
