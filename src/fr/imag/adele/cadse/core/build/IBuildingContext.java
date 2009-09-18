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
/*
 * Adele/LIG/ Grenoble University, France
 * 2006-2008
 */
package fr.imag.adele.cadse.core.build;


/**
 * Represents context of a CADSE build process.
 * 
 * Standard context evolution:
 * <ul>
 * <li>beginTask("Task1", 20)</li>
 * <li>worked(5)</li>
 * <li>subTask("Task1.1")</li>
 * <li>worked(5)</li>
 * <li>subTask("Task1.2")</li>
 * <li>worked(5)</li>
 * <li>worked(5)</li>
 * <li>endTask()</li>
 * </ul>
 */
public interface IBuildingContext {

	/**
	 * Reports an error with a formatted message.
	 * The error is reported in error view of the IDE.
	 * The message is formatted thanks to MessageFormat.format(...).
	 * 
	 * 
	 * @param errorMsg         error message
	 * @param formatParameters arguments used to format the message
	 */
	public void report(String errorMsg, Object ... formatParameters);

	/**
	 * Notify beginning of a task.
	 * 
	 * @param msg  message presenting task
	 * @param size number of work unit to complete this task
	 */
	public void beginTask(String msg, int size);

	/**
	 * Notify beginning of sub task of current task.
	 * 
	 * @param msg message presenting sub task
	 */
	public void subTask(String msg);

	/**
	 * Notify that <code>workUnits</code> work units have been accomplished.
	 * 
	 * @param workUnits number of work unit accomplished
	 */
	public void worked(int workUnits);

	/**
	 * Notify that current task is finished.
	 */
	public void endTask();

	/**
	 * Throws an exception if the user has canceled the current task.
	 * Class of thrown exception is platform dependent.
	 * 
	 * @throws <? extends Exception> if the user has canceled the current task.
	 */
	public void checkCanceled();

}
