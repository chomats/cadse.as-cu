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
package fr.imag.adele.cadse.core.key;

import fr.imag.adele.emf.cadse.ccore.String;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.CadseGCST;
import java.util.UUID;
import fr.imag.adele.cadse.core.INamed;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.emf.cadse.ccore.impl.KeyDefinitionImpl;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * The Class SpaceKeyType.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class DefaultKeyDefinitionImpl extends KeyDefinitionImpl implements KeyDefinition {

	
	public DefaultKeyDefinitionImpl() {
	}

	/**
	 * Instantiates a new space key type.
	 * 
	 * @param itemType
	 *            the item type
	 * @param parentItemType
	 *            the space key type
	 */
	public DefaultKeyDefinitionImpl(UUID uuid, int objectId, fr.imag.adele.emf.cadse.ccore.KeyDefinition parentKeyDef,
			IAttributeType<?>... elts) {
		super(uuid, objectId, parentKeyDef, elts);

	}

    @Override
    public Key computeKey(fr.imag.adele.emf.cadse.ccore.Item item) throws CadseException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.lang.String getName(Key key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
