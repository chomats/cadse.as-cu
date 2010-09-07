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
package fr.imag.adele.cadse.core.ui;


/*
 * String 							key;
 * Int 	  							hspan;
 * Enum:EPosLabel 					pos-label;
 * String							label;
 * transient Object 				context;
 * transient Object 				parent-context;
 * Class:IFieldUIControler			field-ui-controller;
 * Class:IValueControler			value-controller;
 * Class:IInteractiveControler		interactive-controller;
 * Class:IGetAbstractValueFromKey	get-abstract-value-from-key;
 * FieldDescription[]				fields
 */

/**
 * The Interface IFieldDescription.
 */

public interface IFieldDescription {
	
	/** The Constant VERTICAL_SPAN. */
	@Deprecated
	public static final String VERTICAL_SPAN = "vertical-span";
	
	/** The Constant INTERACTION_CONTROLLER. */
	@Deprecated
	public static final String INTERACTION_CONTROLLER = "interaction-controller";

	/** The Constant INTERACTIVE_CONTROLLER. */
	public static final String INTERACTIVE_CONTROLLER = INTERACTION_CONTROLLER;

	/** The Constant FIELDS. */
	@Deprecated
	public static final String FIELDS = "fields";

	/** The Constant LABEL. */
	@Deprecated
	public static final String LABEL = "label";

	/** The Constant POS_LABEL. */
	@Deprecated
	public static final String POS_LABEL = "pos-label";

	/** The Constant FIELD_UI_CONTROLLER. */
	@Deprecated
	public static final String FIELD_UI_CONTROLLER = "field-ui-controller";

	/** The Constant MODEL_CONTROLLER. */
	@Deprecated
	public static final String MODEL_CONTROLLER = "get-and-set-controller";

	/** The Constant PARENT_CONTEXT. */
	public static final String PARENT_CONTEXT = "parent-context";

	///** The Constant CONTEXT. */
	//public static final String CONTEXT = "context";

	/** The Constant KEY_CST. */
	@Deprecated
	public static final String KEY_CST = "key";

	/** The Constant HSPAN_CST. */
	@Deprecated
	public static final String HSPAN_CST = "hspan";

	/** The Constant INCOMING_LINK_TYPE. */
	public static final String INCOMING_LINK_TYPE = "incoming-link-type";

	/** The Constant TITLE. */
	@Deprecated
	public static final String TITLE = "title";

	/** The Constant DESCRIPTION. */
	@Deprecated
	public static final String DESCRIPTION = "description";

	/** The Constant PAGE_COMPLETE. */
	@Deprecated
	public static final String PAGE_COMPLETE = "page-compelete";

	///** The Constant CREATED_ITEM. */
	//@Deprecated
	//public static final String CREATED_ITEM = "created-item";

	/** The Constant ACTION_CONTROLLER. */
	@Deprecated
	public static final String ACTION_CONTROLLER = "action-controller";

	/** The Constant ITEM_TYPE. */
	@Deprecated
	public static final String ITEM_TYPE = "item-type";
	
	/** The Constant SELECTED_OBJECT. */
	@Deprecated
	public static final String SELECTED_OBJECT = "selected-object";

	/** The Constant ENABLE. */
	@Deprecated
	public static final String ENABLE = "enable";
	
	/** The Constant EDITABLE. */
	@Deprecated
	public static final String EDITABLE = "editable";
	

	/** The Constant LABEL_WIDGET. */
	@Deprecated
	public static final String LABEL_WIDGET = "label-widget";

	/** The Constant STYLE. */
	@Deprecated
	public static final String STYLE = "style-widget";

//	@Deprecated
//	public abstract int getHSpan();
//
//	@Deprecated
//	public abstract String getKey();
//
//	/**
//	 * Get hierarchique sans valeur par d�faut. si il ne le trouve pas en local
//	 * il le recherche dans le parent s'il en a un.
//	 * @param key Cle recherche
//	 * @return Valeur de la cle ou null si la cle n'est pas trouve.
//	 */
//	@Deprecated
//	public abstract <T> T getH(String key);
//	/**
//	 * Get hierarchique sans valeur par d�faut. si il ne le trouve pas en local
//	 * il le recherche dans le parent s'il en a un.
//	 * @param key		   Cle recherche
//	 * @param defaultValue Valuer par d�faut.
//	 * @return Valeur de la cle ou la valeur par defaut si la cle n'est pas trouve.
//	 */
//	public abstract <T> T getH(String key, T defaultValue);
//	
//	/**
//	 * Get local sans valeur par d�faut.
//	 * @param key Cle recherche
//	 * @return Valeur de la cle ou null si la cle n'est pas trouve.
//	 */
//	public abstract <T> T getLocal(String key);
//	
//	/**
//	 * Get local avec valeur par d�faut.
//	 * @param key Cle recherche
//	 * @return Valeur de la cle ou la valeur par defaut si la cle n'est pas trouve.
//	 */
//	public abstract <T> T getLocal(Object key, T defaultValue);
//
//	public abstract Object getContext();
//
//	public abstract Object getParentContext();
//
//	public abstract IModelController getModelController();
//
//	
//	public abstract UIField getUIControler();
//
//	public abstract EPosLabel getPosLabel();
//
//	public abstract String getLabel();
//
//	public abstract IFieldDescription[] getFields();
//
//	public abstract IInteractionController getUserController();
//
//	public abstract Object put(Object key, Object value);
//	
//	public abstract void setContext(Object context);
//
//	public abstract void setParentContext(Object parent_context);
//
//	public abstract void setGetAndSetController(
//			IModelController defaultGetAndSet);
//
//	public abstract void setChildren(IFieldDescription... descriptions);
//
//	public abstract IFieldDescription getParentDesc();
//
//	public abstract void setParent(IFieldDescription parent);
//
//	public abstract Object get(String key, Object defaultValue);
//
//	public abstract IFieldDescription getField(String... keyPath);
//	
//	public abstract void updateField(String... keyPath);
//
//	public abstract Object getVisualValue();

}
