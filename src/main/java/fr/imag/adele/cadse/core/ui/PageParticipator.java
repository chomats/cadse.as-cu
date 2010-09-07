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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.imag.adele.cadse.core.*;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.ui.view.FilterContext;
import fr.imag.adele.cadse.objectadapter.ObjectAdapter;


public class PageParticipator extends ObjectAdapter<PageParticipator> {


	@Override
	public Class<PageParticipator> getClassAdapt() {
		return PageParticipator.class;
	}

	public void filterPage(Item item, FilterContext context, List<IPage> list,
			Set<IAttributeType<?>> ro, 
			HashSet<IAttributeType<?>> hiddenAttributeInComputedPages) {
	}
}
