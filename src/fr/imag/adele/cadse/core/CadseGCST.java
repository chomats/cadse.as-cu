package fr.imag.adele.cadse.core;


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
import fr.imag.adele.cadse.core.ui.EPosLabel;
import java.lang.String;



/**
    @generated
*/
public class CadseGCST {
	/**
	    @generated
	*/
	public static ItemType AJPROJECT_COMPOSER;
	/**
	    @generated
	*/
	public static LinkType AJPROJECT_COMPOSER_lt_COMPOSER_LINKS;
	/**
	    @generated
	*/
	public static ItemType ASPECT_JEXPORTER;
	/**
	    @generated
	*/
	public static ItemType ASPECT_JPROJECT_CONTENT_MODEL;
	/**
	    @generated
	*/
	public static LinkType ASPECT_JPROJECT_CONTENT_MODEL_lt_CONTENT_MODEL;
	/**
	    @generated
	*/
	public static ItemType ASPECT_JRE_EXPORTER;
	/**
	    @generated
	*/
	public static ItemType ATTRIBUTE;
	/**
	    @generated
	*/
	public final static String ATTRIBUTE_at_TWCOMMIT_KIND="TWCommitKind";
	/**
	    @generated
	*/
	public static EnumAttributeType<TWCommitKind> ATTRIBUTE_at_TWCOMMIT_KIND_;
	/**
	    @generated
	*/
	public final static String ATTRIBUTE_at_TWEVOL="TWEvol";
	/**
	    @generated
	*/
	public static EnumAttributeType<TWEvol> ATTRIBUTE_at_TWEVOL_;
	/**
	    @generated
	*/
	public final static String ATTRIBUTE_at_TWREV_SPECIFIC="TWRevSpecific";
	/**
	    @generated
	*/
	public static BooleanAttributeType ATTRIBUTE_at_TWREV_SPECIFIC_;
	/**
	    @generated
	*/
	public final static String ATTRIBUTE_at_TWUPDATE_KIND="TWUpdateKind";
	/**
	    @generated
	*/
	public static EnumAttributeType<TWUpdateKind> ATTRIBUTE_at_TWUPDATE_KIND_;
	/**
	    @generated
	*/
	public final static String ATTRIBUTE_at_CANNOT_BE_UNDEFINED="cannot-be-undefined";
	/**
	    @generated
	*/
	public static BooleanAttributeType ATTRIBUTE_at_CANNOT_BE_UNDEFINED_;
	/**
	    @generated
	*/
	public final static String ATTRIBUTE_at_DEFAULT_VALUE="default-value";
	/**
	    @generated
	*/
	public static StringAttributeType ATTRIBUTE_at_DEFAULT_VALUE_;
	/**
	    @generated
	*/
	public final static String ATTRIBUTE_at_DEV_GENERATED="dev-generated";
	/**
	    @generated
	*/
	public static BooleanAttributeType ATTRIBUTE_at_DEV_GENERATED_;
	/**
	    @generated
	*/
	public final static String ATTRIBUTE_at_FINAL_VALUE="final-value";
	/**
	    @generated
	*/
	public static BooleanAttributeType ATTRIBUTE_at_FINAL_VALUE_;
	/**
	    @generated
	*/
	public final static String ATTRIBUTE_at_ID_RUNTIME="id-runtime";
	/**
	    @generated
	*/
	public static StringAttributeType ATTRIBUTE_at_ID_RUNTIME_;
	/**
	    @generated
	*/
	public final static String ATTRIBUTE_at_IS_LIST="is-list";
	/**
	    @generated
	*/
	public static BooleanAttributeType ATTRIBUTE_at_IS_LIST_;
	/**
	    @generated
	*/
	public final static String ATTRIBUTE_at_MUST_BE_INITIALIZED="must-be-initialized";
	/**
	    @generated
	*/
	public static BooleanAttributeType ATTRIBUTE_at_MUST_BE_INITIALIZED_;
	/**
	    @generated
	*/
	public final static String ATTRIBUTE_at_NATIF="natif";
	/**
	    @generated
	*/
	public static BooleanAttributeType ATTRIBUTE_at_NATIF_;
	/**
	    @generated
	*/
	public final static String ATTRIBUTE_at_REQUIRE="require";
	/**
	    @generated
	*/
	public static BooleanAttributeType ATTRIBUTE_at_REQUIRE_;
	/**
	    @generated
	*/
	public final static String ATTRIBUTE_at_TRANSIENT="transient";
	/**
	    @generated
	*/
	public static BooleanAttributeType ATTRIBUTE_at_TRANSIENT_;
	/**
	    @generated
	*/
	public static LinkType ATTRIBUTE_lt_WC_LISTENS;
	/**
	    @generated
	*/
	public static ItemType ATTRIBUTE_ITEM_TYPE;
	/**
	    @generated
	*/
	public final static String ATTRIBUTE_ITEM_TYPE_at_RUNTIME_QUALIFIED_CLASS="runtime-qualified-class";
	/**
	    @generated
	*/
	public static StringAttributeType ATTRIBUTE_ITEM_TYPE_at_RUNTIME_QUALIFIED_CLASS_;
	/**
	    @generated
	*/
	public static ItemType BOOLEAN;
	/**
	    @generated
	*/
	public static ItemType BUILD_MODEL;
	/**
	    @generated
	*/
	public static LinkType BUILD_MODEL_lt_COMPOSITE_TYPES;
	/**
	    @generated
	*/
	public static ItemType BUILDER;
	/**
	    @generated
	*/
	public static LinkType BUILDER_lt_REQUIRES;
	/**
	    @generated
	*/
	public static ItemType CADSE;
	/**
	    @generated
	*/
	public final static String CADSE_at_DEFAULT_CONTENT_REPO_URL="defaultContentRepoURL";
	/**
	    @generated
	*/
	public static StringAttributeType CADSE_at_DEFAULT_CONTENT_REPO_URL_;
	/**
	    @generated
	*/
	public final static String CADSE_at_DESCRIPTION="description";
	/**
	    @generated
	*/
	public static StringAttributeType CADSE_at_DESCRIPTION_;
	/**
	    @generated
	*/
	public final static String CADSE_at_EXECUTED="executed";
	/**
	    @generated
	*/
	public static BooleanAttributeType CADSE_at_EXECUTED_;
	/**
	    @generated
	*/
	public static LinkType CADSE_lt_EXTENDS;
	/**
	    @generated
	*/
	public final static String CADSE_at_ID_DEFINITION="id-definition";
	/**
	    @generated
	*/
	public static StringAttributeType CADSE_at_ID_DEFINITION_;
	/**
	    @generated
	*/
	public final static String CADSE_at_ITEM_REPO_LOGIN="itemRepoLogin";
	/**
	    @generated
	*/
	public static StringAttributeType CADSE_at_ITEM_REPO_LOGIN_;
	/**
	    @generated
	*/
	public final static String CADSE_at_ITEM_REPO_PASSWD="itemRepoPasswd";
	/**
	    @generated
	*/
	public static StringAttributeType CADSE_at_ITEM_REPO_PASSWD_;
	/**
	    @generated
	*/
	public final static String CADSE_at_ITEM_REPO_URL="itemRepoURL";
	/**
	    @generated
	*/
	public static StringAttributeType CADSE_at_ITEM_REPO_URL_;
	/**
	    @generated
	*/
	public static LinkType CADSE_lt_ITEM_TYPES;
	/**
	    @generated
	*/
	public static ItemType CADSE_DEFINITION;
	/**
	    @generated
	*/
	public static LinkType CADSE_DEFINITION_lt_BUILD;
	/**
	    @generated
	*/
	public final static String CADSE_DEFINITION_at_CADSE_NAME="cadse-name";
	/**
	    @generated
	*/
	public static StringAttributeType CADSE_DEFINITION_at_CADSE_NAME_;
	/**
	    @generated
	*/
	public final static String CADSE_DEFINITION_at_COMMENTARY="commentary";
	/**
	    @generated
	*/
	public static StringAttributeType CADSE_DEFINITION_at_COMMENTARY_;
	/**
	    @generated
	*/
	public static LinkType CADSE_DEFINITION_lt_CONFIGURATION;
	/**
	    @generated
	*/
	public static LinkType CADSE_DEFINITION_lt_DATA_MODEL;
	/**
	    @generated
	*/
	public final static String CADSE_DEFINITION_at_ID_RUNTIME="id-runtime";
	/**
	    @generated
	*/
	public static StringAttributeType CADSE_DEFINITION_at_ID_RUNTIME_;
	/**
	    @generated
	*/
	public final static String CADSE_DEFINITION_at_IMPORTS="imports";
	/**
	    @generated
	*/
	public static ListAttributeType<String> CADSE_DEFINITION_at_IMPORTS_;
	/**
	    @generated
	*/
	public static LinkType CADSE_DEFINITION_lt_MAPPING;
	/**
	    @generated
	*/
	public final static String CADSE_DEFINITION_at_PACKAGENAME="packagename";
	/**
	    @generated
	*/
	public static StringAttributeType CADSE_DEFINITION_at_PACKAGENAME_;
	/**
	    @generated
	*/
	public final static String CADSE_DEFINITION_at_VENDOR_NAME="vendor-name";
	/**
	    @generated
	*/
	public static StringAttributeType CADSE_DEFINITION_at_VENDOR_NAME_;
	/**
	    @generated
	*/
	public final static String CADSE_DEFINITION_at_VERSION_CADSE="version-cadse";
	/**
	    @generated
	*/
	public static StringAttributeType CADSE_DEFINITION_at_VERSION_CADSE_;
	/**
	    @generated
	*/
	public static LinkType CADSE_DEFINITION_lt_VIEW_MODEL;
	/**
	    @generated
	*/
	public static ItemType COMPOSER;
	/**
	    @generated
	*/
	public static LinkType COMPOSER_lt_COMPOSER_LINKS;
	/**
	    @generated
	*/
	public final static String COMPOSER_at_EXTENDS_CLASS="extends-class";
	/**
	    @generated
	*/
	public static BooleanAttributeType COMPOSER_at_EXTENDS_CLASS_;
	/**
	    @generated
	*/
	public final static String COMPOSER_at_TYPES="types";
	/**
	    @generated
	*/
	public static ListAttributeType<String> COMPOSER_at_TYPES_;
	/**
	    @generated
	*/
	public static ItemType COMPOSER_LINK;
	/**
	    @generated
	*/
	public static LinkType COMPOSER_LINK_lt_EXPORTERS;
	/**
	    @generated
	*/
	public static LinkType COMPOSER_LINK_lt_LINK;
	/**
	    @generated
	*/
	public static ItemType COMPOSITE_ITEM_TYPE;
	/**
	    @generated
	*/
	public static LinkType COMPOSITE_ITEM_TYPE_lt_BUILDERS;
	/**
	    @generated
	*/
	public static LinkType COMPOSITE_ITEM_TYPE_lt_COMPOSERS;
	/**
	    @generated
	*/
	public static LinkType COMPOSITE_ITEM_TYPE_lt_ITEM_TYPE;
	/**
	    @generated
	*/
	public static ItemType COMPUTED_STRING;
	/**
	    @generated
	*/
	public final static String COMPUTED_STRING_at_EXPRESSION="expression";
	/**
	    @generated
	*/
	public static StringAttributeType COMPUTED_STRING_at_EXPRESSION_;
	/**
	    @generated
	*/
	public static ItemType CONFIGURATION_MODEL;
	/**
	    @generated
	*/
	public static LinkType CONFIGURATION_MODEL_lt_BUILD;
	/**
	    @generated
	*/
	public static ItemType CONTENT_ITEM;
	/**
	    @generated
	*/
	public static LinkType CONTENT_ITEM_lt_CHILDREN;
	/**
	    @generated
	*/
	public static LinkType CONTENT_ITEM_lt_OWNER_ITEM;
	/**
	    @generated
	*/
	public static ItemType CONTENT_ITEM_TYPE;
	/**
	    @generated
	*/
	public final static String CONTENT_ITEM_TYPE_at_EXTENDS_CLASS="extends-class";
	/**
	    @generated
	*/
	public static BooleanAttributeType CONTENT_ITEM_TYPE_at_EXTENDS_CLASS_;
	/**
	    @generated
	*/
	public static ItemType DBROWSER;
	/**
	    @generated
	*/
	public static ItemType DCHECK_BOX;
	/**
	    @generated
	*/
	public static ItemType DCHECKED_LIST;
	/**
	    @generated
	*/
	public static ItemType DCHECKED_TREE;
	/**
	    @generated
	*/
	public static ItemType DCOMBO;
	/**
	    @generated
	*/
	public static ItemType DLIST;
	/**
	    @generated
	*/
	public final static String DLIST_at_EDITABLE_BUTTON="editable-button";
	/**
	    @generated
	*/
	public static BooleanAttributeType DLIST_at_EDITABLE_BUTTON_;
	/**
	    @generated
	*/
	public final static String DLIST_at_ORDER_BUTTON="order-button";
	/**
	    @generated
	*/
	public static BooleanAttributeType DLIST_at_ORDER_BUTTON_;
	/**
	    @generated
	*/
	public final static String DLIST_at_SHOW_FILTER="show-filter";
	/**
	    @generated
	*/
	public static BooleanAttributeType DLIST_at_SHOW_FILTER_;
	/**
	    @generated
	*/
	public final static String DLIST_at_UPDATE_BUTTON="update-button";
	/**
	    @generated
	*/
	public static BooleanAttributeType DLIST_at_UPDATE_BUTTON_;
	/**
	    @generated
	*/
	public static ItemType DSYMBOLIC_BIT_MAP_UI;
	/**
	    @generated
	*/
	public final static String DSYMBOLIC_BIT_MAP_UI_at_LABELS="labels";
	/**
	    @generated
	*/
	public static ListAttributeType<String> DSYMBOLIC_BIT_MAP_UI_at_LABELS_;
	/**
	    @generated
	*/
	public final static String DSYMBOLIC_BIT_MAP_UI_at_NUMBER_COLUMN="number-column";
	/**
	    @generated
	*/
	public static IntegerAttributeType DSYMBOLIC_BIT_MAP_UI_at_NUMBER_COLUMN_;
	/**
	    @generated
	*/
	public static ItemType DTEXT;
	/**
	    @generated
	*/
	public final static String DTEXT_at_MULTI_LINE="multi-line";
	/**
	    @generated
	*/
	public static BooleanAttributeType DTEXT_at_MULTI_LINE_;
	/**
	    @generated
	*/
	public final static String DTEXT_at_NO_BORDER="no-border";
	/**
	    @generated
	*/
	public static BooleanAttributeType DTEXT_at_NO_BORDER_;
	/**
	    @generated
	*/
	public final static String DTEXT_at_TOOL_TIP="tool-tip";
	/**
	    @generated
	*/
	public static StringAttributeType DTEXT_at_TOOL_TIP_;
	/**
	    @generated
	*/
	public final static String DTEXT_at_VERTICAL_SPAN="vertical-span";
	/**
	    @generated
	*/
	public static IntegerAttributeType DTEXT_at_VERTICAL_SPAN_;
	/**
	    @generated
	*/
	public final static String DTEXT_at_WRAP_LINE="wrap-line";
	/**
	    @generated
	*/
	public static BooleanAttributeType DTEXT_at_WRAP_LINE_;
	/**
	    @generated
	*/
	public static ItemType DTREE;
	/**
	    @generated
	*/
	public static ItemType DATA_MODEL;
	/**
	    @generated
	*/
	public static LinkType DATA_MODEL_lt_CATEGORIES;
	/**
	    @generated
	*/
	public static LinkType DATA_MODEL_lt_ENUMS;
	/**
	    @generated
	*/
	public static LinkType DATA_MODEL_lt_TYPES;
	/**
	    @generated
	*/
	public static ItemType DATE;
	/**
	    @generated
	*/
	public static ItemType DISPLAY;
	/**
	    @generated
	*/
	public final static String DISPLAY_at_EXTENDS_IC="extendsIC";
	/**
	    @generated
	*/
	public static BooleanAttributeType DISPLAY_at_EXTENDS_IC_;
	/**
	    @generated
	*/
	public final static String DISPLAY_at_EXTENDS_MC="extendsMC";
	/**
	    @generated
	*/
	public static BooleanAttributeType DISPLAY_at_EXTENDS_MC_;
	/**
	    @generated
	*/
	public final static String DISPLAY_at_EXTENDS_UI="extendsUI";
	/**
	    @generated
	*/
	public static BooleanAttributeType DISPLAY_at_EXTENDS_UI_;
	/**
	    @generated
	*/
	public static ItemType DOUBLE;
	/**
	    @generated
	*/
	public static ItemType DYNAMIC_ACTIONS;
	/**
	    @generated
	*/
	public static ItemType ECLIPSE_COMPOSER;
	/**
	    @generated
	*/
	public static LinkType ECLIPSE_COMPOSER_lt_COMPOSER_LINKS;
	/**
	    @generated
	*/
	public static ItemType ECLIPSE_EXPORTER;
	/**
	    @generated
	*/
	public static ItemType ECLIPSE_RE_EXPORTER;
	/**
	    @generated
	*/
	public static ItemType ENUM;
	/**
	    @generated
	*/
	public final static String ENUM_at_ENUM_CLAZZ="enum-clazz";
	/**
	    @generated
	*/
	public static StringAttributeType ENUM_at_ENUM_CLAZZ_;
	/**
	    @generated
	*/
	public static LinkType ENUM_lt_ENUM_TYPE;
	/**
	    @generated
	*/
	public final static String ENUM_at_VALUES="values";
	/**
	    @generated
	*/
	public static ListAttributeType<String> ENUM_at_VALUES_;
	/**
	    @generated
	*/
	public static ItemType ENUM_TYPE;
	/**
	    @generated
	*/
	public final static String ENUM_TYPE_at_JAVA_CLASS="java-class";
	/**
	    @generated
	*/
	public static StringAttributeType ENUM_TYPE_at_JAVA_CLASS_;
	/**
	    @generated
	*/
	public final static String ENUM_TYPE_at_MUST_BE_GENERATED="must-be-generated";
	/**
	    @generated
	*/
	public static BooleanAttributeType ENUM_TYPE_at_MUST_BE_GENERATED_;
	/**
	    @generated
	*/
	public final static String ENUM_TYPE_at_VALUES="values";
	/**
	    @generated
	*/
	public static ListAttributeType<String> ENUM_TYPE_at_VALUES_;
	/**
	    @generated
	*/
	public static ItemType EXPORTER;
	/**
	    @generated
	*/
	public final static String EXPORTER_at_TYPES="types";
	/**
	    @generated
	*/
	public static ListAttributeType<String> EXPORTER_at_TYPES_;
	/**
	    @generated
	*/
	public static ItemType EXT_ITEM;
	/**
	    @generated
	*/
	public static ItemType EXT_ITEM_TYPE;
	/**
	    @generated
	*/
	public static LinkType EXT_ITEM_TYPE_lt_REF_TYPE;
	/**
	    @generated
	*/
	public static ItemType FIELD;
	/**
	    @generated
	*/
	public static LinkType FIELD_lt_ATTRIBUTE;
	/**
	    @generated
	*/
	public final static String FIELD_at_EDITABLE="editable";
	/**
	    @generated
	*/
	public static BooleanAttributeType FIELD_at_EDITABLE_;
	/**
	    @generated
	*/
	public static LinkType FIELD_lt_IC;
	/**
	    @generated
	*/
	public final static String FIELD_at_LABEL="label";
	/**
	    @generated
	*/
	public static StringAttributeType FIELD_at_LABEL_;
	/**
	    @generated
	*/
	public static LinkType FIELD_lt_MC;
	/**
	    @generated
	*/
	public static LinkType FIELD_lt_OVERWRITEFIELD;
	/**
	    @generated
	*/
	public final static String FIELD_at_POSITION="position";
	/**
	    @generated
	*/
	public static EnumAttributeType<EPosLabel> FIELD_at_POSITION_;
	/**
	    @generated
	*/
	public static ItemType FILE_CONTENT_MODEL;
	/**
	    @generated
	*/
	public final static String FILE_CONTENT_MODEL_at_FILE_NAME="file-name";
	/**
	    @generated
	*/
	public static StringAttributeType FILE_CONTENT_MODEL_at_FILE_NAME_;
	/**
	    @generated
	*/
	public final static String FILE_CONTENT_MODEL_at_FILE_PATH="file-path";
	/**
	    @generated
	*/
	public static StringAttributeType FILE_CONTENT_MODEL_at_FILE_PATH_;
	/**
	    @generated
	*/
	public static ItemType FOLDER_CONTENT_MODEL;
	/**
	    @generated
	*/
	public static LinkType FOLDER_CONTENT_MODEL_lt_CONTENT_MODEL;
	/**
	    @generated
	*/
	public final static String FOLDER_CONTENT_MODEL_at_FOLDER_PATH="folder-path";
	/**
	    @generated
	*/
	public static StringAttributeType FOLDER_CONTENT_MODEL_at_FOLDER_PATH_;
	/**
	    @generated
	*/
	public static ItemType FOLDER_EXPORTER;
	/**
	    @generated
	*/
	public final static String FOLDER_EXPORTER_at_PATH="path";
	/**
	    @generated
	*/
	public static StringAttributeType FOLDER_EXPORTER_at_PATH_;
	/**
	    @generated
	*/
	public static ItemType IC_ABSTRACT_FOR_BROWSER_COMBO;
	/**
	    @generated
	*/
	public final static String IC_ABSTRACT_FOR_BROWSER_COMBO_at_MESSAGE="message";
	/**
	    @generated
	*/
	public static StringAttributeType IC_ABSTRACT_FOR_BROWSER_COMBO_at_MESSAGE_;
	/**
	    @generated
	*/
	public final static String IC_ABSTRACT_FOR_BROWSER_COMBO_at_TITLE="title";
	/**
	    @generated
	*/
	public static StringAttributeType IC_ABSTRACT_FOR_BROWSER_COMBO_at_TITLE_;
	/**
	    @generated
	*/
	public static ItemType IC_ABSTRACT_FOR_CHECKED;
	/**
	    @generated
	*/
	public static ItemType IC_ABSTRACT_FOR_LIST;
	/**
	    @generated
	*/
	public static ItemType IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO;
	/**
	    @generated
	*/
	public final static String IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO_at_MESSAGE="message";
	/**
	    @generated
	*/
	public static StringAttributeType IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO_at_MESSAGE_;
	/**
	    @generated
	*/
	public final static String IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO_at_SELECT_MESSAGE="select-message";
	/**
	    @generated
	*/
	public static StringAttributeType IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO_at_SELECT_MESSAGE_;
	/**
	    @generated
	*/
	public final static String IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO_at_SELECT_TITLE="select-title";
	/**
	    @generated
	*/
	public static StringAttributeType IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO_at_SELECT_TITLE_;
	/**
	    @generated
	*/
	public final static String IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO_at_TITLE="title";
	/**
	    @generated
	*/
	public static StringAttributeType IC_ABSTRACT_TREE_DIALOG_FOR_LIST_BROWSER_COMBO_at_TITLE_;
	/**
	    @generated
	*/
	public static ItemType IC_BOOLEAN_TEXT;
	/**
	    @generated
	*/
	public static ItemType IC_ENUM_FOR_BROWSER_COMBO;
	/**
	    @generated
	*/
	public static ItemType IC_ENUM_FOR_LIST;
	/**
	    @generated
	*/
	public static ItemType IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST;
	/**
	    @generated
	*/
	public final static String IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST_at_PATTERN_SELECT_FILE="pattern-select-file";
	/**
	    @generated
	*/
	public static StringAttributeType IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST_at_PATTERN_SELECT_FILE_;
	/**
	    @generated
	*/
	public final static String IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST_at_SELECT_FOLDER="select-folder";
	/**
	    @generated
	*/
	public static StringAttributeType IC_FILE_RESOURCE_FOR_BROWSER_COMBO_LIST_at_SELECT_FOLDER_;
	/**
	    @generated
	*/
	public static ItemType IC_FOLDER_RESOURCE_FOR_BROWSER_COMBO_LIST;
	/**
	    @generated
	*/
	public static ItemType IC_JAR_RESOURCE_FOR_BROWSER_COMBO_LIST;
	/**
	    @generated
	*/
	public static ItemType IC_JAVA_CLASS_FOR_BROWSER_COMBO;
	/**
	    @generated
	*/
	public static ItemType IC_LINK_FOR_BROWSER_COMBO_LIST;
	/**
	    @generated
	*/
	public static ItemType IC_PART_LINK_FOR_BROWSER_COMBO_LIST;
	/**
	    @generated
	*/
	public static ItemType IC_RESOURCE_TREE_DIALOG_FOR_BROWSER_COMBO_LIST;
	/**
	    @generated
	*/
	public static ItemType IC_STATIC_ARRAY_OF_OBJECT_FOR_BROWSER_COMBO;
	/**
	    @generated
	*/
	public static ItemType IC_STRING_LIST_FOR_LIST;
	/**
	    @generated
	*/
	public final static String IC_STRING_LIST_FOR_LIST_at_ALLOW_DUPLICATE="allowDuplicate";
	/**
	    @generated
	*/
	public static BooleanAttributeType IC_STRING_LIST_FOR_LIST_at_ALLOW_DUPLICATE_;
	/**
	    @generated
	*/
	public static ItemType INT_MODEL_CONTROLLER;
	/**
	    @generated
	*/
	public final static String INT_MODEL_CONTROLLER_at_DEFAULT_VALUE="default-value";
	/**
	    @generated
	*/
	public static IntegerAttributeType INT_MODEL_CONTROLLER_at_DEFAULT_VALUE_;
	/**
	    @generated
	*/
	public final static String INT_MODEL_CONTROLLER_at_ERROR_MSG_MAX="error-msg-max";
	/**
	    @generated
	*/
	public static StringAttributeType INT_MODEL_CONTROLLER_at_ERROR_MSG_MAX_;
	/**
	    @generated
	*/
	public final static String INT_MODEL_CONTROLLER_at_ERROR_MSG_MIN="error-msg-min";
	/**
	    @generated
	*/
	public static StringAttributeType INT_MODEL_CONTROLLER_at_ERROR_MSG_MIN_;
	/**
	    @generated
	*/
	public final static String INT_MODEL_CONTROLLER_at_MAX="max";
	/**
	    @generated
	*/
	public static IntegerAttributeType INT_MODEL_CONTROLLER_at_MAX_;
	/**
	    @generated
	*/
	public final static String INT_MODEL_CONTROLLER_at_MIN="min";
	/**
	    @generated
	*/
	public static IntegerAttributeType INT_MODEL_CONTROLLER_at_MIN_;
	/**
	    @generated
	*/
	public static ItemType INTEGER;
	/**
	    @generated
	*/
	public static ItemType INTERACTION_CONTROLLER;
	/**
	    @generated
	*/
	public static ItemType ITEM;
	/**
	    @generated
	*/
	public final static String ITEM_at_TW_VERSION="TW-version";
	/**
	    @generated
	*/
	public static IntegerAttributeType ITEM_at_TW_VERSION_;
	/**
	    @generated
	*/
	public final static String ITEM_at_COMMITTED_BY="committedBy";
	/**
	    @generated
	*/
	public static StringAttributeType ITEM_at_COMMITTED_BY_;
	/**
	    @generated
	*/
	public final static String ITEM_at_COMMITTED_DATE="committedDate";
	/**
	    @generated
	*/
	public static LongAttributeType ITEM_at_COMMITTED_DATE_;
	/**
	    @generated
	*/
	public static LinkType ITEM_lt_CONTENTS;
	/**
	    @generated
	*/
	public final static String ITEM_at_DISPLAY_NAME="display-name";
	/**
	    @generated
	*/
	public static StringAttributeType ITEM_at_DISPLAY_NAME_;
	/**
	    @generated
	*/
	public final static String ITEM_at_ID="id";
	/**
	    @generated
	*/
	public static StringAttributeType ITEM_at_ID_;
	/**
	    @generated
	*/
	public static LinkType ITEM_lt_INSTANCE_OF;
	/**
	    @generated
	*/
	public final static String ITEM_at_ITEM_HIDDEN="item-hidden";
	/**
	    @generated
	*/
	public static BooleanAttributeType ITEM_at_ITEM_HIDDEN_;
	/**
	    @generated
	*/
	public final static String ITEM_at_ITEM_READONLY="item-readonly";
	/**
	    @generated
	*/
	public static BooleanAttributeType ITEM_at_ITEM_READONLY_;
	/**
	    @generated
	*/
	public static LinkType ITEM_lt_MODIFIED_ATTRIBUTES;
	/**
	    @generated
	*/
	public final static String ITEM_at_NAME="name";
	/**
	    @generated
	*/
	public static StringAttributeType ITEM_at_NAME_;
	/**
	    @generated
	*/
	public static LinkType ITEM_lt_PARENT;
	/**
	    @generated
	*/
	public final static String ITEM_at_QUALIFIED_NAME="qualified-name";
	/**
	    @generated
	*/
	public static StringAttributeType ITEM_at_QUALIFIED_NAME_;
	/**
	    @generated
	*/
	public final static String ITEM_at_REQUIRE_NEW_REV="requireNewRev";
	/**
	    @generated
	*/
	public static BooleanAttributeType ITEM_at_REQUIRE_NEW_REV_;
	/**
	    @generated
	*/
	public final static String ITEM_at_REV_MODIFIED="revModified";
	/**
	    @generated
	*/
	public static BooleanAttributeType ITEM_at_REV_MODIFIED_;
	/**
	    @generated
	*/
	public static ItemType ITEM_TYPE;
	/**
	    @generated
	*/
	public final static String ITEM_TYPE_at_CUSTOM_MANAGER="custom-manager";
	/**
	    @generated
	*/
	public static BooleanAttributeType ITEM_TYPE_at_CUSTOM_MANAGER_;
	/**
	    @generated
	*/
	public final static String ITEM_TYPE_at_HAS_CONTENT="has-content";
	/**
	    @generated
	*/
	public static BooleanAttributeType ITEM_TYPE_at_HAS_CONTENT_;
	/**
	    @generated
	*/
	public final static String ITEM_TYPE_at_HAS_SHORT_NAME="has-short-name";
	/**
	    @generated
	*/
	public static BooleanAttributeType ITEM_TYPE_at_HAS_SHORT_NAME_;
	/**
	    @generated
	*/
	public final static String ITEM_TYPE_at_HAS_UNIQUE_NAME="has-unique-name";
	/**
	    @generated
	*/
	public static BooleanAttributeType ITEM_TYPE_at_HAS_UNIQUE_NAME_;
	/**
	    @generated
	*/
	public final static String ITEM_TYPE_at_ICON="icon";
	/**
	    @generated
	*/
	public static StringAttributeType ITEM_TYPE_at_ICON_;
	/**
	    @generated
	*/
	public final static String ITEM_TYPE_at_IS_ABSTRACT="is-abstract";
	/**
	    @generated
	*/
	public static BooleanAttributeType ITEM_TYPE_at_IS_ABSTRACT_;
	/**
	    @generated
	*/
	public final static String ITEM_TYPE_at_IS_HIDDEN="is-hidden";
	/**
	    @generated
	*/
	public static BooleanAttributeType ITEM_TYPE_at_IS_HIDDEN_;
	/**
	    @generated
	*/
	public final static String ITEM_TYPE_at_IS_META_ITEM_TYPE="is-meta-item-type";
	/**
	    @generated
	*/
	public static BooleanAttributeType ITEM_TYPE_at_IS_META_ITEM_TYPE_;
	/**
	    @generated
	*/
	public final static String ITEM_TYPE_at_IS_ROOT_ELEMENT="is-root-element";
	/**
	    @generated
	*/
	public static BooleanAttributeType ITEM_TYPE_at_IS_ROOT_ELEMENT_;
	/**
	    @generated
	*/
	public final static String ITEM_TYPE_at_ITEM_FACTORY="item-factory";
	/**
	    @generated
	*/
	public static StringAttributeType ITEM_TYPE_at_ITEM_FACTORY_;
	/**
	    @generated
	*/
	public final static String ITEM_TYPE_at_ITEM_MANAGER="item-manager";
	/**
	    @generated
	*/
	public static StringAttributeType ITEM_TYPE_at_ITEM_MANAGER_;
	/**
	    @generated
	*/
	public static LinkType ITEM_TYPE_lt_LINK_TYPE;
	/**
	    @generated
	*/
	public final static String ITEM_TYPE_at_MANAGER_CLASS="manager-class";
	/**
	    @generated
	*/
	public static StringAttributeType ITEM_TYPE_at_MANAGER_CLASS_;
	/**
	    @generated
	*/
	public final static String ITEM_TYPE_at_OVERWRITE_DEFAULT_PAGES="overwrite-default-pages";
	/**
	    @generated
	*/
	public static BooleanAttributeType ITEM_TYPE_at_OVERWRITE_DEFAULT_PAGES_;
	/**
	    @generated
	*/
	public final static String ITEM_TYPE_at_PACKAGE_NAME="package-name";
	/**
	    @generated
	*/
	public static StringAttributeType ITEM_TYPE_at_PACKAGE_NAME_;
	/**
	    @generated
	*/
	public static LinkType ITEM_TYPE_lt_SUB_TYPES;
	/**
	    @generated
	*/
	public static LinkType ITEM_TYPE_lt_SUPER_TYPE;
	/**
	    @generated
	*/
	public static LinkType ITEM_TYPE_lt_WC_LISTENERS;
	/**
	    @generated
	*/
	public static ItemType JAVA_ELEMENT_TREE_CONTROLLER;
	/**
	    @generated
	*/
	public static ItemType JAVA_EXPORTER;
	/**
	    @generated
	*/
	public static ItemType JAVA_FILE_CONTENT_MODEL;
	/**
	    @generated
	*/
	public static ItemType JAVA_JAR_FILE_CONTENT_MODEL;
	/**
	    @generated
	*/
	public static ItemType JAVA_PROJECT_COMPOSER;
	/**
	    @generated
	*/
	public static LinkType JAVA_PROJECT_COMPOSER_lt_COMPOSER_LINKS;
	/**
	    @generated
	*/
	public static ItemType JAVA_PROJECT_CONTENT_MODEL;
	/**
	    @generated
	*/
	public static LinkType JAVA_PROJECT_CONTENT_MODEL_lt_CONTENT_MODEL;
	/**
	    @generated
	*/
	public final static String JAVA_PROJECT_CONTENT_MODEL_at_HAS_SOURCE_FOLDER="has-source-folder";
	/**
	    @generated
	*/
	public static BooleanAttributeType JAVA_PROJECT_CONTENT_MODEL_at_HAS_SOURCE_FOLDER_;
	/**
	    @generated
	*/
	public static ItemType JAVA_RE_EXPORTER;
	/**
	    @generated
	*/
	public static ItemType KEY;
	/**
	    @generated
	*/
	public static ItemType LINK;
	/**
	    @generated
	*/
	public final static String LINK_at_TWCOUPLED="TWCoupled";
	/**
	    @generated
	*/
	public static BooleanAttributeType LINK_at_TWCOUPLED_;
	/**
	    @generated
	*/
	public final static String LINK_at_TWDEST_EVOL="TWDestEvol";
	/**
	    @generated
	*/
	public static EnumAttributeType<TWDestEvol> LINK_at_TWDEST_EVOL_;
	/**
	    @generated
	*/
	public final static String LINK_at_AGGREGATION="aggregation";
	/**
	    @generated
	*/
	public static BooleanAttributeType LINK_at_AGGREGATION_;
	/**
	    @generated
	*/
	public final static String LINK_at_ANNOTATION="annotation";
	/**
	    @generated
	*/
	public static BooleanAttributeType LINK_at_ANNOTATION_;
	/**
	    @generated
	*/
	public final static String LINK_at_COMPOSITION="composition";
	/**
	    @generated
	*/
	public static BooleanAttributeType LINK_at_COMPOSITION_;
	/**
	    @generated
	*/
	public static LinkType LINK_lt_DESTINATION;
	/**
	    @generated
	*/
	public final static String LINK_at_GROUP="group";
	/**
	    @generated
	*/
	public static BooleanAttributeType LINK_at_GROUP_;
	/**
	    @generated
	*/
	public final static String LINK_at_HIDDEN="hidden";
	/**
	    @generated
	*/
	public static BooleanAttributeType LINK_at_HIDDEN_;
	/**
	    @generated
	*/
	public static LinkType LINK_lt_INVERSE_LINK;
	/**
	    @generated
	*/
	public final static String LINK_at_KIND="kind";
	/**
	    @generated
	*/
	public static IntegerAttributeType LINK_at_KIND_;
	/**
	    @generated
	*/
	public final static String LINK_at_LINK_MANAGER="link-manager";
	/**
	    @generated
	*/
	public static StringAttributeType LINK_at_LINK_MANAGER_;
	/**
	    @generated
	*/
	public final static String LINK_at_MAPPING="mapping";
	/**
	    @generated
	*/
	public static BooleanAttributeType LINK_at_MAPPING_;
	/**
	    @generated
	*/
	public final static String LINK_at_MAX="max";
	/**
	    @generated
	*/
	public static IntegerAttributeType LINK_at_MAX_;
	/**
	    @generated
	*/
	public final static String LINK_at_MIN="min";
	/**
	    @generated
	*/
	public static IntegerAttributeType LINK_at_MIN_;
	/**
	    @generated
	*/
	public final static String LINK_at_PART="part";
	/**
	    @generated
	*/
	public static BooleanAttributeType LINK_at_PART_;
	/**
	    @generated
	*/
	public final static String LINK_at_REQUIRE="require";
	/**
	    @generated
	*/
	public static BooleanAttributeType LINK_at_REQUIRE_;
	/**
	    @generated
	*/
	public final static String LINK_at_SELECTION="selection";
	/**
	    @generated
	*/
	public static StringAttributeType LINK_at_SELECTION_;
	/**
	    @generated
	*/
	public static LinkType LINK_lt_SOURCE;
	/**
	    @generated
	*/
	public static ItemType LINK_MODEL_CONTROLLER;
	/**
	    @generated
	*/
	public final static String LINK_MODEL_CONTROLLER_at_ERROR_MESSAGE="error-message";
	/**
	    @generated
	*/
	public static StringAttributeType LINK_MODEL_CONTROLLER_at_ERROR_MESSAGE_;
	/**
	    @generated
	*/
	public static ItemType LIST;
	/**
	    @generated
	*/
	public static LinkType LIST_lt_SUB_TYPE;
	/**
	    @generated
	*/
	public static ItemType LIST_OF_STRING_MODEL_CONTROLLER;
	/**
	    @generated
	*/
	public static ItemType LONG;
	/**
	    @generated
	*/
	public static ItemType MC_DATE;
	/**
	    @generated
	*/
	public final static String MC_DATE_at_PATTERN="pattern";
	/**
	    @generated
	*/
	public static StringAttributeType MC_DATE_at_PATTERN_;
	/**
	    @generated
	*/
	public static ItemType MC_DEST_LINK;
	/**
	    @generated
	*/
	public static ItemType MC_LINK_TO_BOOLEAN;
	/**
	    @generated
	*/
	public static ItemType MC_NAME_ATTRIBUTE;
	/**
	    @generated
	*/
	public static ItemType MC_STRING_LIST_TO_ENUM_LIST;
	/**
	    @generated
	*/
	public static ItemType MC_STRING_TO_JAVA_ELEMENT;
	/**
	    @generated
	*/
	public static ItemType MANAGER;
	/**
	    @generated
	*/
	public static LinkType MANAGER_lt_CONTENT_MODEL;
	/**
	    @generated
	*/
	public final static String MANAGER_at_DISPLAY_NAME_TEMPLATE="display-name-template";
	/**
	    @generated
	*/
	public static StringAttributeType MANAGER_at_DISPLAY_NAME_TEMPLATE_;
	/**
	    @generated
	*/
	public static LinkType MANAGER_lt_EXPORTERS;
	/**
	    @generated
	*/
	public final static String MANAGER_at_HUMAN_NAME="human-name";
	/**
	    @generated
	*/
	public static StringAttributeType MANAGER_at_HUMAN_NAME_;
	/**
	    @generated
	*/
	public final static String MANAGER_at_ICON="icon";
	/**
	    @generated
	*/
	public static StringAttributeType MANAGER_at_ICON_;
	/**
	    @generated
	*/
	public static LinkType MANAGER_lt_ITEM_TYPE;
	/**
	    @generated
	*/
	public final static String MANAGER_at_LONG_NAME_TEMPLATE="long-name-template";
	/**
	    @generated
	*/
	public static StringAttributeType MANAGER_at_LONG_NAME_TEMPLATE_;
	/**
	    @generated
	*/
	public final static String MANAGER_at_MESSAGE_ERROR_ID="message-error-id";
	/**
	    @generated
	*/
	public static StringAttributeType MANAGER_at_MESSAGE_ERROR_ID_;
	/**
	    @generated
	*/
	public final static String MANAGER_at_VALID_PATTERN_ID="valid-pattern-id";
	/**
	    @generated
	*/
	public static StringAttributeType MANAGER_at_VALID_PATTERN_ID_;
	/**
	    @generated
	*/
	public static ItemType MAPPING_MODEL;
	/**
	    @generated
	*/
	public static LinkType MAPPING_MODEL_lt_MANAGERS;
	/**
	    @generated
	*/
	public static ItemType MENU;
	/**
	    @generated
	*/
	public static LinkType MENU_lt_CHILDREN;
	/**
	    @generated
	*/
	public static ItemType MENU_ABSTRACT;
	/**
	    @generated
	*/
	public final static String MENU_ABSTRACT_at_ICON="icon";
	/**
	    @generated
	*/
	public static StringAttributeType MENU_ABSTRACT_at_ICON_;
	/**
	    @generated
	*/
	public final static String MENU_ABSTRACT_at_LABEL="label";
	/**
	    @generated
	*/
	public static StringAttributeType MENU_ABSTRACT_at_LABEL_;
	/**
	    @generated
	*/
	public final static String MENU_ABSTRACT_at_PATH="path";
	/**
	    @generated
	*/
	public static StringAttributeType MENU_ABSTRACT_at_PATH_;
	/**
	    @generated
	*/
	public static ItemType MENU_ACTION;
	/**
	    @generated
	*/
	public static ItemType MENU_GROUP;
	/**
	    @generated
	*/
	public static ItemType MODEL_CONTROLLER;
	/**
	    @generated
	*/
	public static ItemType PDEPROJECT_CONTENT_MODEL;
	/**
	    @generated
	*/
	public static LinkType PDEPROJECT_CONTENT_MODEL_lt_CONTENT_MODEL;
	/**
	    @generated
	*/
	public static ItemType PACKAGE_CONTENT_MODEL;
	/**
	    @generated
	*/
	public static ItemType PACKAGE_LIST_CONTROLLER;
	/**
	    @generated
	*/
	public static ItemType PAGE;
	/**
	    @generated
	*/
	public static LinkType PAGE_lt_ATTRIBUTES;
	/**
	    @generated
	*/
	public final static String PAGE_at_DESCRIPTION="description";
	/**
	    @generated
	*/
	public static StringAttributeType PAGE_at_DESCRIPTION_;
	/**
	    @generated
	*/
	public final static String PAGE_at_ID_RUNTIME="id-runtime";
	/**
	    @generated
	*/
	public static StringAttributeType PAGE_at_ID_RUNTIME_;
	/**
	    @generated
	*/
	public final static String PAGE_at_IS_REMOVED="is-removed";
	/**
	    @generated
	*/
	public static BooleanAttributeType PAGE_at_IS_REMOVED_;
	/**
	    @generated
	*/
	public final static String PAGE_at_LABEL="label";
	/**
	    @generated
	*/
	public static StringAttributeType PAGE_at_LABEL_;
	/**
	    @generated
	*/
	public static LinkType PAGE_lt_OVERWRITE;
	/**
	    @generated
	*/
	public final static String PAGE_at_TITLE="title";
	/**
	    @generated
	*/
	public static StringAttributeType PAGE_at_TITLE_;
	/**
	    @generated
	*/
	public static ItemType PROJECT_CONTENT_MODEL;
	/**
	    @generated
	*/
	public static LinkType PROJECT_CONTENT_MODEL_lt_CONTENT_MODEL;
	/**
	    @generated
	*/
	public final static String PROJECT_CONTENT_MODEL_at_PROJECT_NAME="project-name";
	/**
	    @generated
	*/
	public static StringAttributeType PROJECT_CONTENT_MODEL_at_PROJECT_NAME_;
	/**
	    @generated
	*/
	public static ItemType RESOURCE_CONTENT_MODEL;
	/**
	    @generated
	*/
	public static ItemType SOURCE_FOLDER_CONTENT_MODEL;
	/**
	    @generated
	*/
	public static ItemType STRING;
	/**
	    @generated
	*/
	public final static String STRING_at_NOT_EMPTY="not-empty";
	/**
	    @generated
	*/
	public static BooleanAttributeType STRING_at_NOT_EMPTY_;
	/**
	    @generated
	*/
	public static ItemType STRING_TO_BOOLEAN_MODEL_CONTROLLER;
	/**
	    @generated
	*/
	public static ItemType STRING_TO_ENUM_MODEL_CONTROLLER;
	/**
	    @generated
	*/
	public static ItemType STRING_TO_ONE_RESOURCE_MODEL_CONTROLLER;
	/**
	    @generated
	*/
	public static ItemType STRING_TO_PACKAGE_MODEL_CONTROLLER;
	/**
	    @generated
	*/
	public static ItemType STRING_TO_RESOURCE_LIST_MODEL_CONTROLLER;
	/**
	    @generated
	*/
	public static ItemType STRUCT;
	/**
	    @generated
	*/
	public static LinkType STRUCT_lt_ATTRIBUTES;
	/**
	    @generated
	*/
	public static ItemType SUB_CONTENT_MODEL;
	/**
	    @generated
	*/
	public static ItemType SYMBOLIC_BIT_MAP;
	/**
	    @generated
	*/
	public final static String SYMBOLIC_BIT_MAP_at_VALUES="values";
	/**
	    @generated
	*/
	public static ListAttributeType<String> SYMBOLIC_BIT_MAP_at_VALUES_;
	/**
	    @generated
	*/
	public static ItemType TIME;
	/**
	    @generated
	*/
	public final static String TIME_at_INIT_WITH_THE_CURRENT_TIME="init-with-the-current-time";
	/**
	    @generated
	*/
	public static BooleanAttributeType TIME_at_INIT_WITH_THE_CURRENT_TIME_;
	/**
	    @generated
	*/
	public static ItemType TYPE_DEFINITION;
	/**
	    @generated
	*/
	public static LinkType TYPE_DEFINITION_lt_ATTRIBUTES;
	/**
	    @generated
	*/
	public static LinkType TYPE_DEFINITION_lt_CADSE;
	/**
	    @generated
	*/
	public static LinkType TYPE_DEFINITION_lt_CREATION_PAGES;
	/**
	    @generated
	*/
	public static LinkType TYPE_DEFINITION_lt_FIELDS;
	/**
	    @generated
	*/
	public final static String TYPE_DEFINITION_at_ID_RUNTIME="id-runtime";
	/**
	    @generated
	*/
	public static StringAttributeType TYPE_DEFINITION_at_ID_RUNTIME_;
	/**
	    @generated
	*/
	public static LinkType TYPE_DEFINITION_lt_MODIFICATION_PAGES;
	/**
	    @generated
	*/
	public static LinkType TYPE_DEFINITION_lt_VALIDATORS;
	/**
	    @generated
	*/
	public static ItemType UILISTENER;
	/**
	    @generated
	*/
	public static LinkType UILISTENER_lt_FIELDS;
	/**
	    @generated
	*/
	public static ItemType UIVALIDATOR;
	/**
	    @generated
	*/
	public static LinkType UIVALIDATOR_lt_LISTEN_ATTRIBUTES;
	/**
	    @generated
	*/
	public static LinkType UIVALIDATOR_lt_OVERWRITE;
	/**
	    @generated
	*/
	public static ItemType URL;
	/**
	    @generated
	*/
	public static ItemType UUID;
	/**
	    @generated
	*/
	public static ItemType UNRESOLVED_ATTRIBUTE_TYPE;
	/**
	    @generated
	*/
	public static ItemType VIEW;
	/**
	    @generated
	*/
	public final static String VIEW_at_ICON="icon";
	/**
	    @generated
	*/
	public static StringAttributeType VIEW_at_ICON_;
	/**
	    @generated
	*/
	public static LinkType VIEW_lt_VIEW_ITEM_TYPES;
	/**
	    @generated
	*/
	public static ItemType VIEW_ITEM_TYPE;
	/**
	    @generated
	*/
	public final static String VIEW_ITEM_TYPE_at_IS_ROOT_ELEMENT="is-root-element";
	/**
	    @generated
	*/
	public static BooleanAttributeType VIEW_ITEM_TYPE_at_IS_ROOT_ELEMENT_;
	/**
	    @generated
	*/
	public static LinkType VIEW_ITEM_TYPE_lt_ITEM_TYPE;
	/**
	    @generated
	*/
	public final static String VIEW_ITEM_TYPE_at_REF="ref";
	/**
	    @generated
	*/
	public static BooleanAttributeType VIEW_ITEM_TYPE_at_REF_;
	/**
	    @generated
	*/
	public static LinkType VIEW_ITEM_TYPE_lt_VIEW_LINK_TYPES;
	/**
	    @generated
	*/
	public static ItemType VIEW_LINK_TYPE;
	/**
	    @generated
	*/
	public final static String VIEW_LINK_TYPE_at_AGGREGATION="aggregation";
	/**
	    @generated
	*/
	public static BooleanAttributeType VIEW_LINK_TYPE_at_AGGREGATION_;
	/**
	    @generated
	*/
	public final static String VIEW_LINK_TYPE_at_CAN_CREATE_ITEM="can-create-item";
	/**
	    @generated
	*/
	public static BooleanAttributeType VIEW_LINK_TYPE_at_CAN_CREATE_ITEM_;
	/**
	    @generated
	*/
	public final static String VIEW_LINK_TYPE_at_CAN_CREATE_LINK="can-create-link";
	/**
	    @generated
	*/
	public static BooleanAttributeType VIEW_LINK_TYPE_at_CAN_CREATE_LINK_;
	/**
	    @generated
	*/
	public final static String VIEW_LINK_TYPE_at_DISPLAY_CREATE="display-create";
	/**
	    @generated
	*/
	public static StringAttributeType VIEW_LINK_TYPE_at_DISPLAY_CREATE_;
	/**
	    @generated
	*/
	public static LinkType VIEW_LINK_TYPE_lt_LINK_TYPE;
	/**
	    @generated
	*/
	public static ItemType VIEW_MODEL;
	/**
	    @generated
	*/
	public static LinkType VIEW_MODEL_lt_VIEWS;
	/**
	    @generated
	*/
	public static ItemType WCLISTENER;
	/**
	    @generated
	*/
	public static LinkType WCLISTENER_lt_LISTEN_ATTRIBUTE_DEFINITIONS;
	/**
	    @generated
	*/
	public static LinkType WCLISTENER_lt_LISTEN_ITEM_TYPES;
	/**
	    @generated
	*/
	public static LinkType ACTION_EXT_ITEM_TYPE_lt_ACTIONS_MODEL;
	/**
	    @generated
	*/
	public static LinkType GROUP_EXT_ITEM_lt_MEMBER_OF;
	/**
	    @generated
	*/
	public static LinkType GROUP_EXT_ITEM_lt_MEMBERS;

	/**
	    @generated
	*/
	public CadseGCST() {
	}

}
/** Licensed to the Apache Software Foundation (ASF) under one* or more contributor license agreements.  See the NOTICE file* distributed with this work for additional information* regarding copyright ownership.  The ASF licenses this file* to you under the Apache License, Version 2.0 (the* "License"); you may not use this file except in compliance* with the License.  You may obtain a copy of the License at**   http://www.apache.org/licenses/LICENSE-2.0** Unless required by applicable law or agreed to in writing,* software distributed under the License is distributed on an* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY* KIND, either express or implied.  See the License for the* specific language governing permissions and limitations* under the License.*/

