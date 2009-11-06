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
 */

package fr.imag.adele.cadse.core.ui;

/**
 * Implemente un validator qui permet de valider la valeur d'un champ suivant
 * different cas : valeur chang�, un �lement ajout� ou supprimer pour les
 * listes, Chacune des m�thodes returnent true si il y eu une erreur sinon
 * false. L'expression field.getPageController().setMessage(...) permet
 * d'ajouter un message. Suivant l'implementation de setMessage, cela peut etre
 * soit le premier message, soit le dernier, soit l'ensemble des messages.
 * Durant un cycle de validations, plusieurs validators sont appel�s : il peut
 * avoir plusieurs erreur durant le cycle.
 * 
 * @author chomats
 */
public interface IValidateContributor {

	/**
	 * Valid this field : the value has changed .
	 * 
	 * @param field
	 *            the field
	 * @param value
	 *            the new value
	 * 
	 * @return true, if error and stop validation process
	 */
	public abstract boolean validValueChanged(IPageController uiPlatform, UIField field, Object value);

	/**
	 * Valid added element to a list.
	 * 
	 * @param field
	 *            the field
	 * @param addedElement
	 *            the added element
	 * 
	 * @return true, if error and stop validation process
	 */
	public abstract boolean validSubValueAdded(IPageController uiPlatform, UIField field, Object addedElement);

	/**
	 * Valid removed element from a list.
	 * 
	 * @param field
	 *            the field
	 * @param removedElement
	 *            the removed element
	 * 
	 * @return true, if error and stop validation process
	 */
	public abstract boolean validSubValueRemoved(IPageController uiPlatform, UIField field, Object removedElement);

	/**
	 * Valid value deleted.
	 * 
	 * @param field
	 *            the field
	 * @param deletedValue
	 *            the deleted value
	 * 
	 * @return true, if error and stop validation process
	 */
	public abstract boolean validValueDeleted(IPageController uiPlatform, UIField field, Object deletedValue);

	/**
	 * Re validate a field after an other field which has changed.
	 * 
	 * @param field
	 *            null or the field which has changed. All others field is
	 *            revalidate.
	 * @param value
	 *            the current value or null
	 * 
	 * @return true, if error and stop validation process
	 */
	public abstract boolean validValue(IPageController uiPlatform, UIField field, Object value);

}