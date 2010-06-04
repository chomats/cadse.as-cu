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
 * Represents a CADSE runtime event (for instance, create item operation).
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class WSEvent {
	
	/**
	 * Order number of this event.
	 */
    private final long _order;
    
    /** 
     * Event type.
     * @see  fr.imag.adele.cadse.core.ChangeID
     */
    private final ChangeID _eventTypeId;
    
    /** 
     * The event operation arguments. 
     */
    private final Object[] _args;
    
    /**
	 * Instantiates a new wS event.
	 * 
	 * @param eventTypeId   event type
	 * @param operationArgs arguments of representing operation
	 */
    public WSEvent(long order, ChangeID eventTypeId, Object[] operationArgs) {
        super();
        _order = order;
        _eventTypeId = eventTypeId;
        _args = operationArgs;
    }
    
    
    @Override
    public String toString() {
        return _eventTypeId.toString( _args);
    }

    /**
	 * Returns created item if this event 
	 * represents an item creation operation.
	 * 
	 * @return created item if this event 
	 * represents an item creation operation.
	 */
    public Item getCreatedItem() {
        return (Item) _args[0];
    }
    
    /**
	 * Returns event type.
	 * 
	 * @return event type.
	 */
    public ChangeID getEventTypeId() {
        return _eventTypeId;
    }
    
    /**
	 * Returns the operation arguments.
	 * 
	 * @return the operation arguments.
	 */
    public Object[] getOperationArgs() {
        return _args;
    }
    
    /**
     * Returns order number of this event.
     * 
     * @return order number of this event.
     */
    public long getOrder() {
		return _order;
	}
}