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

package fr.imag.adele.cadse.core.path;



/**
 * The Class AbstractParsePath.
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public abstract class AbstractParsePath {
	
	/** The error. */
	protected String error ;
	
	/** The issingleton. */
	protected boolean issingleton;
	
	
	/**
	 * Instantiates a new abstract parse path.
	 * 
	 * @param path
	 *            the path
	 */
	public AbstractParsePath(String path) {
		this.error = null;
	}
	
	/**
	 * Parses the.
	 * 
	 * @param value
	 *            the value
	 * @param partiel
	 *            the partiel
	 * 
	 * @return the string
	 */
	protected String parse(String value, boolean partiel) {
		int lastindex = 0;
		String s;
		boolean closure = false;
		
		int len = value.length();
		int nextindex = len;
		error = null;
		beginParse();
		ONE: {
			if (len == 0) {
				break ONE;
			}
			
			int index = value.indexOf('.');
			if (index == lastindex) {
				error = "Bad expresion not begin by '.'";
				break ONE;
			}
			nextindex = (index == -1) ? len : index;
			s = value.substring(lastindex, nextindex);
			if (s.equals(PathConstants.SELF)) {
				parseSelf();
				issingleton = true;
			} else {
				if (s.endsWith("*")) {
					closure = true;
					s = s.substring(0, s.length() - 1);
				}
				parseType(s, closure);
				if (error != null)
					break ONE;
				issingleton = false;
			}
			while (index != -1) {
				lastindex = nextindex +1;
				if (lastindex == len ) {
					error = "Bad expression not end by '.'";
					break ONE;
				}
				index = value.indexOf('.',lastindex);
				if (index == lastindex) {
					error = "Bad expresion find '..'";
					break ONE;
				}
				nextindex = (index == -1) ? len : index;
				s = value.substring(lastindex, nextindex);
			
				closure = false;
				if (s.endsWith("*")) {
					closure = true;
					s = s.substring(0, s.length() - 1);
				}
				if (s.startsWith(PathConstants.PARENT_PATH)) {
					s = s.substring(PathConstants.PARENT_PATH.length());
					parseParent(s,closure);
					if (error != null)
						break ONE;
					continue;
				}
				if (s.equals(PathConstants.INCOMING_LINK_PATH)) {
					s = s.substring(PathConstants.INCOMING_LINK_PATH.length());
					parseIncomingLink(s,closure);
					if (error != null)
						break ONE;
					continue;
				}
				parseOutgoingLink(s,closure);
				if (error != null)
					break ONE;
				
			}
			endParse(partiel);
		}		
		return value.substring(lastindex);
	}
	
	
	/**
	 * Begin parse.
	 */
	protected abstract void beginParse();
	
	/**
	 * Parses the type.
	 * 
	 * @param s
	 *            the s
	 * @param closure
	 *            the closure
	 */
	protected abstract void parseType(String s, boolean closure);

	/**
	 * Parses the self.
	 */
	protected abstract void parseSelf();

	/**
	 * Parses the outgoing link.
	 * 
	 * @param s
	 *            the s
	 * @param closure
	 *            the closure
	 */
	protected abstract void parseOutgoingLink(String s, boolean closure);

	/**
	 * Parses the incoming link.
	 * 
	 * @param s
	 *            the s
	 * @param closure
	 *            the closure
	 */
	protected abstract void parseIncomingLink(String s, boolean closure);

	/**
	 * Parses the parent.
	 * 
	 * @param s
	 *            the s
	 * @param closure
	 *            the closure
	 */
	protected abstract void parseParent(String s, boolean closure);

	/**
	 * End parse.
	 * 
	 * @param partiel
	 *            the partiel
	 */
	protected abstract void endParse(boolean partiel);
	
	/**
	 * Gets the error.
	 * 
	 * @return the error
	 */
	public String getError() {
		return error;
	}
	
}