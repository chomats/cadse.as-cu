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
/**
 * 
 */
package fr.imag.adele.cadse.core.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


/**
 * This class HashList implements a Map which value is a list.
 */
public class HashListSet<K,V> extends HashMap<K, Set<V>> {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2659152800468661487L;

	/**
	 * Adds a key and a value into this map.
	 * 
	 * @param key the key
	 * @param value the value
	 * 
	 * @return true, if added
	 */
	public boolean add(K key, V value) {
		Set<V> temp = get(key);
		if (temp == null) {
			temp = new HashSet<V>();
			put(key, temp);
		}
		return temp.add(value);
	}
	
	/**
	 * Removes the key and value. If the list is empty the key is removed definitively otherwise
	 * only the value is removed from the list associted with this key.
	 * 
	 * @param key the key
	 * @param value the value
	 * 
	 * @return true, if removed
	 */
	public boolean remove(K key, V value) {
		Set<V> temp = get(key);
		if (temp == null) {
			return false;
		}
		if (temp.remove(value)) {
			if (temp.size() == 0)
				remove(key);
			return true;
		}
		return false;
	}
}