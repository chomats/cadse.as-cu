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
package fr.imag.adele.cadse.core.delta.revision;

import fr.imag.adele.cadse.core.CadseException;
import java.util.UUID;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;

public class AttributeRevisionDelta<T> extends ObjectTeamChange implements ITeamChangeObject {
	final public static class NotPresent {
		private NotPresent() {
		}

		@Override
		public String toString() {
			return "<not present>";
		}
	}

	final static public Object	NOT_PRESENT	= new NotPresent();

	final private Object		parent;

	final private T				baseValue;
	final private T				headValue;
	final private T				currentValue;

	// int change;
	IAttributeType<T>			key;

	public AttributeRevisionDelta(Object parent, IAttributeType<T> key, T baseValue, T headValue, T currentValue) {
		super();
		this.parent = parent;
		this.key = key;
		this.baseValue = baseValue;
		this.headValue = headValue;
		this.currentValue = currentValue;
		change = 0;
		if (baseValue == NOT_PRESENT)
			change |= WorkspaceLogiqueRevisionDelta.BASE_NOT_PRESENT;
		else
			change += WorkspaceLogiqueRevisionDelta.BASE_PRESENT;

		if (currentValue == NOT_PRESENT)
			change |= WorkspaceLogiqueRevisionDelta.CURRENT_NOT_PRESENT;
		else
			change += WorkspaceLogiqueRevisionDelta.CURRENT_PRESENT;

		if (headValue == NOT_PRESENT)
			change |= WorkspaceLogiqueRevisionDelta.HEAD_NOT_PRESENT;
		else
			change += WorkspaceLogiqueRevisionDelta.HEAD_PRESENT;

		if (isSet(WorkspaceLogiqueRevisionDelta.BASE_NOT_PRESENT | WorkspaceLogiqueRevisionDelta.CURRENT_PRESENT)) {
			change |= WorkspaceLogiqueRevisionDelta.LOCAL_CHANGE_ADD;
		}

		if (isSet(WorkspaceLogiqueRevisionDelta.BASE_PRESENT | WorkspaceLogiqueRevisionDelta.CURRENT_PRESENT)) {
			if (!equals(currentValue, baseValue)) {
				change |= WorkspaceLogiqueRevisionDelta.LOCAL_CHANGE_MODIFIED;
			}
		}

		if (isSet(WorkspaceLogiqueRevisionDelta.BASE_PRESENT | WorkspaceLogiqueRevisionDelta.CURRENT_NOT_PRESENT)) {
			change |= WorkspaceLogiqueRevisionDelta.LOCAL_CHANGE_REMOVE;
		}

		if (isSet(WorkspaceLogiqueRevisionDelta.BASE_NOT_PRESENT | WorkspaceLogiqueRevisionDelta.HEAD_PRESENT)) {
			change |= WorkspaceLogiqueRevisionDelta.REMOTE_CHANGE_ADD;
		}

		if (isSet(WorkspaceLogiqueRevisionDelta.BASE_PRESENT | WorkspaceLogiqueRevisionDelta.HEAD_PRESENT)) {
			if (!equals(headValue, baseValue)) {
				change |= WorkspaceLogiqueRevisionDelta.REMOTE_CHANGE_MODIFIED;
			}
		}

		if (isSet(WorkspaceLogiqueRevisionDelta.BASE_PRESENT | WorkspaceLogiqueRevisionDelta.HEAD_NOT_PRESENT)) {
			change |= WorkspaceLogiqueRevisionDelta.REMOTE_CHANGE_REMOVE;
		}
	}

	private static boolean equals(Object v1, Object v2) {
		return (v1 == null && v2 == null) || (v1 != null && v2 != null && v1.equals(v2));
	}

	public IAttributeType<?> getKey() {
		return key;
	}

	public Object getBaseValue() {
		return baseValue;
	}

	public Object getHeadValue() {
		return headValue;
	}

	public Object getCurrentValue() {
		return currentValue;
	}

	boolean revertLocalChanges(ITeamRevisionService ser, LogicalWorkspaceTransaction copy) throws CadseException {
		if (!hasRefuseLocalChange())
			return false;
		if (hasRemoteChange() && hasAcceptRemoteChange())
			return false;

		if (this.headValue == AttributeRevisionDelta.NOT_PRESENT) {
			if (currentValue == AttributeRevisionDelta.NOT_PRESENT)
				return false;
			if (parent instanceof ItemRevisionDelta) {
				copy.actionRemoveAttribute(getParentId(), key);
			} else {
				copy.actionRemoveAttribute(((LinkRevisionDelta) parent).toDesc(), key);
			}
			return true;
		} else if (currentValue == AttributeRevisionDelta.NOT_PRESENT) {
			if (parent instanceof ItemRevisionDelta) {
				copy.actionAddAttribute(getParentId(), key, headValue);
			} else {
				copy.actionAddAttribute(((LinkRevisionDelta) parent).toDesc(), key, headValue);
			}
			return true;
		} else if (!currentValueEqualsHeadValue()) {
			if (parent instanceof ItemRevisionDelta) {
				copy.actionChangeAttribute(getParentId(), key, headValue);
			} else {
				copy.actionChangeAttribute(((LinkRevisionDelta) parent).toDesc(), key, headValue);
			}
			return true;
		}
		return false;
	}

	public boolean commitAcceptHeadChanges(ITeamRevisionService ser, LogicalWorkspaceTransaction copy)
			throws CadseException {
		if (!hasRemoteChange()) {
			// System.out.println("has no remote change "+key);
			return false;
		}

		if (!hasAcceptRemoteChange()) {
			// System.out.println("has no accept remote change "+key);
			return false;
		}
		// meme si la valeur est egual on fait l'operation.
		// if (currentValueEqualsHeadValue()) {
		// System.out.println("value is equals :"+key);
		// return true;
		// }

		if (parent instanceof ItemRevisionDelta) {
			if (headValue == null) {
				copy.actionRemoveAttribute(getParentId(), key);
				return true;
			}
			if (baseValue == null) {
				copy.actionAddAttribute(getParentId(), key, headValue);
				return true;
			}
			copy.actionChangeAttribute(getParentId(), key, headValue);
			return true;
		} else if (parent instanceof LinkRevisionDelta) {
			if (headValue == null) {
				copy.actionRemoveAttribute(((LinkRevisionDelta) parent).toDesc(), key);
				return true;
			}
			if (baseValue == null) {
				copy.actionAddAttribute(((LinkRevisionDelta) parent).toDesc(), key, headValue);
				return true;
			}
			copy.actionChangeAttribute(((LinkRevisionDelta) parent).toDesc(), key, headValue);
			return true;
		} else {
			throw new UnsupportedOperationException();
		}
	}

	public UUID getParentId() {
		return ((ItemRevisionDelta) parent).getId();
	}

	public boolean currentValueEqualsHeadValue() {
		return equals(currentValue, headValue);
	}

	public StringBuilder toString(StringBuilder sb, String tab) {
		if (currentValueEqualsHeadValue()) {
			sb.append(tab);
			sb.append(this.key).append(" no change");
			sb.append("\n");
			return sb;
		}
		if (isRemoteChanged() && isLocalChanged()) {
			sb.append(tab);
			sb.append(this.key).append(" Conflict attribute current value =");
			sb.append(currentValue);
			sb.append("\n");
			sb.append(tab).append(this.key).append("    head value =").append(headValue).append("\n");
			sb.append(tab).append(this.key).append("    base value =").append(baseValue).append("\n");
			return sb;
		}
		if (isRemoteChanged()) {
			sb.append(tab);
			sb.append(this.key).append(" Remote change value =");
			sb.append(headValue);
			sb.append("\n");
			sb.append(tab).append(this.key).append("    current value =").append(currentValue).append("\n");
			sb.append(tab).append(this.key).append("    base value =").append(baseValue).append("\n");
			return sb;
		}
		if (isLocalChanged()) {
			sb.append(tab);
			sb.append(this.key).append(" Local change value =");
			sb.append(currentValue);
			sb.append("\n");
			sb.append(tab).append(this.key).append("    head value =").append(headValue).append("\n");
			sb.append(tab).append(this.key).append("    base value =").append(baseValue).append("\n");
			return sb;
		}
		sb.append(tab);
		sb.append(this.key).append(" no change");
		sb.append("\n");
		return sb;
	}

	static public final int	L	= 0;
	static public final int	R	= 1;
	static public final int	C	= 2;
	static public final int	AL	= 3;
	static public final int	AR	= 4;

	public String getStatus() {
		char[] statusItem = new char[5];
		statusItem[L] = statusItem[R] = statusItem[C] = ' ';
		statusItem[AL] = ' ';
		statusItem[AR] = ' ';

		// ItemDescription mergeItem = new ItemDescription(delta.getId(),
		// delta.getType());
		if (isSet(WorkspaceLogiqueRevisionDelta.LOCAL_CHANGE_ADD)) {
			statusItem[L] = 'a';
		}
		if (isSet(WorkspaceLogiqueRevisionDelta.LOCAL_CHANGE_REMOVE)) {
			statusItem[L] = 'd';
		}
		if (isSet(WorkspaceLogiqueRevisionDelta.LOCAL_CHANGE_MODIFIED)) {
			statusItem[L] = 'm';
		}
		if (isSet(WorkspaceLogiqueRevisionDelta.REMOTE_CHANGE_ADD)) {
			statusItem[R] = 'A';
		}
		if (isSet(WorkspaceLogiqueRevisionDelta.REMOTE_CHANGE_REMOVE)) {
			statusItem[R] = 'D';
		}
		if (isSet(WorkspaceLogiqueRevisionDelta.REMOTE_CHANGE_MODIFIED)) {
			statusItem[R] = 'M';
		}
		if (hasConflict()) {
			statusItem[C] = 'C';
		}

		if (hasAcceptLocalChange()) {
			statusItem[AL] = 'a';
		} else if (hasRefuseLocalChange()) {
			statusItem[AL] = 'r';
		}
		if (hasAcceptRemoteChange()) {
			statusItem[AR] = 'A';
		} else if (hasRefuseRemoteChange()) {
			statusItem[AR] = 'R';
		}
		// //AL DL AR DR C * AL
		// for (LinkRevisionDelta lrd : links) {
		// if (lrd.hasConflict())
		// return true;
		// }

		return new String(statusItem);
	}

	public String toStringNoReturn(String tab, boolean detail) {

		StringBuilder sb = new StringBuilder();
		sb.append("[").append(getStatus()).append("] ").append(key);
		if (!detail)
			return sb.toString();

		sb.append(" value =");
		sb.append(currentValue);
		sb.append(", head value =").append(headValue);
		sb.append(", base value =").append(baseValue);
		return sb.toString();
	}

	public String getDisplayOneLine() {
		return "Attribute " + key;
	}

	@Override
	public String toString() {
		return toString(new StringBuilder(), "").toString();
	}

	public boolean hasConflict() {
		if (currentValueEqualsHeadValue()) {
			return false;
		}
		return (isRemoteChanged() && isLocalChanged());
	}

	public int getHStatus() {
		return change;
	}

}
