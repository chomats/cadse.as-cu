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

import java.util.UUID;

/**
 * The Interface INamedUUID.
 * 
 * @author &lt;a href=&quot;mailto:stephane.chomat@imag.fr&quot;&gt;Stephane
 *         Chomat&lt;/a&gt;
 * @version 2.0
 */
public interface INamedUUID {

	/**
	 * Returns the immutable universally unique identifier of this object.
	 * Object has same Id for all its life.
	 * 
	 * @return an immutable universally unique identifier of this item.
	 */
	public UUID getId();

	/**
	 * Return a local identifier. This identifier is the same during all the
	 * life in local. If this object is deleted and after re-imported, the local
	 * identifier cannot be the same. Return -1 if this object is added and not
	 * saved. After the first save or load, this method return a good
	 * identifier.
	 * 
	 * @return a local identifier.
	 */
	public int getObjectId();
	
	public void setUUID(long uuidMsb, long uuidLsb);
	
	public void setUUID(UUID uuid);

}
