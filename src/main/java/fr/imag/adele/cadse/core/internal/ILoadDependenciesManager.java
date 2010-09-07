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
package fr.imag.adele.cadse.core.internal;

public interface ILoadDependenciesManager {

	/**
	 * 
	 * Avant d'essayer de creer un contenu ou de recharcher le contenu Cette
	 * metthod est appeler pour charget les classes qui pourrai bloquer la
	 * creation du contenu. C'est le cas actuellment d'aspectj. Il se passe que
	 * pour lors du chargement d'une class du bundl aspectje (ui) le bundle est
	 * demarrer. Un autre thread essayer egalement de charger une classe
	 * aspectj() et nous avons un interblocage. l'action de charger tout les
	 * contenus est preceder de l'appel de cet method. (en dehors d'un begin
	 * /end operation pour ne pas avoir d'interblocage
	 * 
	 */

	public void loadDependencies();
}
