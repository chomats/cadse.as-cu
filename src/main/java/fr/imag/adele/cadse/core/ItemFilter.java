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

/**
 * Represents a filter on items.
 * 
 * 
 */
public interface ItemFilter<T> {
	
	/**
	 * Tests whether or not the specified item is ignored.
	 * If returns <code>false</code>, specified item is ignored and related actions 
	 * are not performed on it.
	 * 
	 * @param item an item
	 * 
	 * @return <code>true</code> if and only if <code>item</code> will be performed by related actions.
	 */
	public boolean accept(T item);
    
    /**
	 * Returns <code>true</code> if TODO.
	 * 
	 * @return <code>true</code> si la recherche est fini
	 */
    public boolean stop();
    
}
