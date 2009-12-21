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
package fr.imag.adele.cadse.core;

/**
 * Utility class.
 * Contains utility methods to:
 * - get string description of links.
 * 
 * @author Thomas
 *
 */
public class CommonMethods {
	
	/** 
	 * Empty string.
	 */
	private static final String NO_STRING = "";
	
	/**
	 * Returns string description of specified link including 
	 * - source item display name
	 * - destination item display name
	 * - link name
	 * - resolved or not
	 * 
	 * @param link a link
	 * @return string description of specified link.
	 */
	public static String toStringLink(Link link) {
		StringBuilder sb = new StringBuilder();
		sb.append(link.getSource().getDisplayName());
		sb.append(" --> ");
		sb.append(link.getDestination(false).getDisplayName());
		sb.append(" (");
		sb.append((link.getLinkType() == null ? "???": link.getLinkType().getName()));
		sb.append( ")");
		sb.append((link.getDestination().isResolved() ? NO_STRING : " unresolved" ));
		return sb.toString();
	}
	
	/**
	 * Returns string description of specified link including 
	 * - source item unique name and id
	 * - destination item unique name and id
	 * - link name
	 * - resolved or not
	 * 
	 * @param link a link
	 * @return string description of specified link.
	 */
	public static String toStringLink2(Link link) {
		StringBuilder sb = new StringBuilder();
		sb.append(link.getSource().getQualifiedName());
		sb.append(" - ");
		sb.append(link.getSource().getId());
		sb.append(" --> ");
		sb.append(link.getDestination().getQualifiedName());
		sb.append(" - ");
		sb.append(link.getDestination().getId());
		sb.append(" (");
		sb.append((link.getLinkType() == null? "???": link.getLinkType().getName()));
		sb.append( ")");
		sb.append((link.getDestination().isResolved() ? NO_STRING : " unresolved" ));
		return sb.toString();
	}
}
