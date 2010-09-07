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
package fr.imag.adele.cadse.core.util;

import java.util.HashSet;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.LinkType;

public class LinkPathUtil {

	public static boolean checkNonCicular(Item source, Item dest, LinkType lt) {
		assert lt.getMax() == 1;
		// LinkPath path = findPath(source, dest, lt);
		HashSet<Item> visited = new HashSet<Item>();
		while (source != dest) {
			if (!visited.add(source)) {
				return false;
			}
			Item new_source = source.getOutgoingItem(lt, true);
			if (new_source == null) {
				return false;
			}
			source = new_source;
		}
		return true;
	}

}
