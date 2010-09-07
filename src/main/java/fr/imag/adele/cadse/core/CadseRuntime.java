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
package fr.imag.adele.cadse.core;

import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.internal.InternalCadseRuntime;
import fr.imag.adele.cadse.core.ui.view.FacetteCadseRuntimeView;

import java.util.Properties;
import java.util.UUID;
import fr.imag.adele.cadse.core.ui.view.DefineNewContext;

/**
 * Run version of a CADSE.
 * 
 * @author CADSE team
 */
public interface CadseRuntime extends Item, InternalCadseRuntime, FacetteCadseRuntimeView {
	
	public static class Binding {
		public Binding(ItemType it, ExtendedType et) {
			this.it = it.getId();
			this.ext = et.getId();
		}
		public UUID it;
		public UUID ext;
	}

	/** The Constant RESOURCE_SUFFIX. */
	public final static String	CADSE_NAME_SUFFIX	= "Model.Workspace.";

	/**
	 * Returns the list of all the CADSE which have to be executed, to get a
	 * valid execution of the current CADSE.
	 * 
	 * @return null if no dependencies
	 */
	public abstract CadseRuntime[] getRequiredCadses();

	/**
	 * Returns the list of all the errors found during execution.
	 * 
	 * @return null if no errors
	 */
	public abstract String[] getErrors();

	/**
	 * True if all dependencies are resolved and canbeExecuted
	 * 
	 * @return
	 */
	public boolean canBeExecuted();

	/**
	 * Test if this CADSE is executed.
	 * 
	 * @return a boolean
	 */
	public abstract boolean isExecuted();

	/**
	 * Test if this CADSE is the CADSE root.
	 * 
	 * @return a boolean
	 */
	public abstract boolean isCadseRoot();

	/**
	 * Test if this CADSE requires the CADSE given into parameter. The
	 * dependency between CADSEs can be direct or not.
	 * 
	 * @param cr
	 *            another CADSE
	 * @return true if the CADSE given into parameter is needed
	 */
	public abstract boolean isRequired(CadseRuntime cr);

	/**
	 * 
	 * @return the id of the cadse definition in CadseG
	 */
	public UUID getIdCadseDefinition();

	/**
	 * the qualified Class Name
	 * 
	 * @return the qualified Class Name where is defined java constante
	 */
	public String getCstQualifiedClassName();

	/**
	 * return the CST name generated by cadseg
	 */
	public String getCSTName();

	public void addDefineNewContext(DefineNewContext d);

	public void removeDefineNewContext(DefineNewContext d);

	public DefineNewContext[] getDefineNewContexts();

	public void addExtendedType(ExtendedType et);
	
	public void removeExtendedType(ExtendedType et);
	
	/**
	 * If no elements return an null array.
	 * @return can be null, if no elements
	 */
	public ExtendedType[] getExtendedType();
	
	public void addBinding(Binding b);
	public void removeBinding(Binding b);
	
	public Binding[] getBinding();
	
	public ItemType[] getItemTypes();

	public abstract String getLocalizedLabel(IAttributeType<?> attr);
	
	public void setLocalizedLabels(Properties localizedLabels);

}
