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

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * The Class LinkDescription.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class LinkDescription implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long			serialVersionUID	= -8066152219451914452L;

	/** The Constant INFO_ATTRIBUTE. */
	public static final String			INFO_ATTRIBUTE		= "info";

	/** The source. */
	private ItemDescriptionRef			source;

	/** The type. */
	private String						type;

	/** The destination. */
	private ItemDescriptionRef			destination;

	/** The state. */
	final private int					state;

	/** The Constant AGGREGATION_IGNORE. */
	final public static int				AGGREGATION_IGNORE	= 0x000000001;

	/** The Constant AGGREGATION. */
	final public static int				AGGREGATION			= 0x000000002;

	/** The Constant COMPOSITION_IGNORE. */
	final public static int				COMPOSITION_IGNORE	= 0x000000004;

	/** The Constant COMPOSITION. */
	final public static int				COMPOSITION			= 0x000000008;

	/** The Constant DERIBED_IGNORE. */
	final public static int				DERIBED_IGNORE		= 0x000000010;

	/** The Constant DERIBED. */
	final public static int				DERIBED				= 0x000000020;

	/** The Constant HIDDEN_IGNORE. */
	final public static int				HIDDEN_IGNORE		= 0x000000040;

	/** The Constant HIDDEN. */
	final public static int				HIDDEN				= 0x000000080;

	/** The Constant MODIFIED_IGNORE. */
	final public static int				MODIFIED_IGNORE		= 0x000000100;

	/** The Constant MODIFIED. */
	final public static int				MODIFIED			= 0x000000200;

	/** The Constant OTHER_IGNORE. */
	final public static int				OTHER_IGNORE		= 0x000000400;

	/** The Constant OTHER. */
	final public static int				OTHER				= 0x000000800;

	/** The Constant PART_IGNORE. */
	final public static int				PART_IGNORE			= 0x000001000;

	/** The Constant PART. */
	final public static int				PART				= 0x000002000;

	/** The Constant READ_ONLY_IGNORE. */
	final public static int				READ_ONLY_IGNORE	= 0x000004000;

	/** The Constant READ_ONLY. */
	final public static int				READ_ONLY			= 0x000008000;

	/** The Constant REQUIRE_IGNORE. */
	final public static int				REQUIRE_IGNORE		= 0x000010000;

	/** The Constant REQUIRE. */
	final public static int				REQUIRE				= 0x000020000;

	/** The Constant ANNOTATION_IGNORE. */
	final public static int				ANNOTATION_IGNORE	= 0x000040000;

	/** The Constant ANNOTATION. */
	final public static int				ANNOTATION			= 0x000080000;

	/** The attributes. */
	private final Map<String, Object>	attributes;

	/** The version. */
	private int							version;

	/**
	 * Instantiates a new link description.
	 * 
	 * @param source
	 *            the source
	 * @param type
	 *            the type
	 * @param destination
	 *            the destination
	 * @param _isAggregation
	 *            the _is aggregation
	 * @param _isAnnotation
	 *            the _is annotation
	 * @param _isComposition
	 *            the _is composition
	 * @param _isPart
	 *            the _is part
	 * @param _isRequire
	 *            the _is require
	 * @param _isOther
	 *            the _is other
	 * @param _isDerived
	 *            the _is derived
	 * @param _isHidden
	 *            the _is hidden
	 * @param _isModified
	 *            the _is modified
	 * @param _isReadOnly
	 *            the _is read only
	 * @param info
	 *            the info
	 * @param version
	 *            the version
	 */
	public LinkDescription(final ItemDescriptionRef source, final String type, final ItemDescriptionRef destination,
			final boolean _isAggregation, final boolean _isAnnotation, final boolean _isComposition,
			final boolean _isPart, final boolean _isRequire, final boolean _isOther, final boolean _isDerived,
			final boolean _isHidden, final boolean _isModified, final boolean _isReadOnly, String info, int version) {
		this(source, type, destination, _isAggregation, _isAnnotation, _isComposition, _isPart, _isRequire, _isOther,
				_isDerived, _isHidden, _isModified, _isReadOnly, info);
		this.version = version;
	}

	/**
	 * Instantiates a new link description.
	 * 
	 * @param source
	 *            the source
	 * @param type
	 *            the type
	 * @param destination
	 *            the destination
	 * @param _isAggregation
	 *            the _is aggregation
	 * @param _isAnnotation
	 *            the _is annotation
	 * @param _isComposition
	 *            the _is composition
	 * @param _isPart
	 *            the _is part
	 * @param _isRequire
	 *            the _is require
	 * @param _isOther
	 *            the _is other
	 * @param _isDerived
	 *            the _is derived
	 * @param _isHidden
	 *            the _is hidden
	 * @param _isModified
	 *            the _is modified
	 * @param _isReadOnly
	 *            the _is read only
	 * @param info
	 *            the info
	 */
	public LinkDescription(final ItemDescriptionRef source, final String type, final ItemDescriptionRef destination,
			final boolean _isAggregation, final boolean _isAnnotation, final boolean _isComposition,
			final boolean _isPart, final boolean _isRequire, final boolean _isOther, final boolean _isDerived,
			final boolean _isHidden, final boolean _isModified, final boolean _isReadOnly, String info) {
		super();
		this.source = source;
		this.type = type;
		this.destination = destination;

		state = (_isAggregation ? AGGREGATION : 0) + (_isAnnotation ? ANNOTATION : 0)
				+ (_isComposition ? COMPOSITION : 0) + (_isPart ? PART : 0) + (_isRequire ? REQUIRE : 0)
				+ (_isOther ? OTHER : 0) + (_isDerived ? DERIBED : 0) + (_isHidden ? HIDDEN : 0)
				+ (_isModified ? MODIFIED : 0) + (_isReadOnly ? READ_ONLY : 0);

		attributes = new HashMap<String, Object>();
		attributes.put(INFO_ATTRIBUTE, info);
		if (source instanceof ItemDescription) {
			((ItemDescription) source).links.add(this);
		}
	}

	/**
	 * Instantiates a new link description.
	 * 
	 * @param source
	 *            the source
	 * @param type
	 *            the type
	 * @param destination
	 *            the destination
	 */
	public LinkDescription(final ItemDescriptionRef source, final String type, final ItemDescriptionRef destination) {
		this(source, type, destination, true);
	}

	/**
	 * Instantiates a new link description.
	 * 
	 * @param source
	 *            the source
	 * @param type
	 *            the type
	 * @param destination
	 *            the destination
	 * @param add
	 *            the add
	 */
	public LinkDescription(final ItemDescriptionRef source, final String type, final ItemDescriptionRef destination,
			boolean add) {
		super();
		this.source = source;
		this.type = type;
		this.destination = destination;

		state = AGGREGATION_IGNORE + ANNOTATION_IGNORE + COMPOSITION_IGNORE + PART_IGNORE + REQUIRE_IGNORE
				+ OTHER_IGNORE + DERIBED_IGNORE + HIDDEN_IGNORE + MODIFIED_IGNORE + READ_ONLY;

		attributes = new HashMap<String, Object>();
		if (add && source instanceof ItemDescription) {
			((ItemDescription) source).links.add(this);
		}
	}

	/**
	 * Instantiates a new link description.
	 * 
	 * @param l
	 *            the l
	 */
	public LinkDescription(Link l) {
		source = new ItemDescriptionRef(l.getSource());
		type = l.getLinkType().getName();
		destination = new ItemDescriptionRef(l.getDestination(false));
		state = (l.isAggregation() ? AGGREGATION : 0) + (l.isComposition() ? ANNOTATION : 0)
				+ (l.isAnnotation() ? COMPOSITION : 0) + (l.getLinkType().isPart() ? PART : 0) + (l.isRequire() ? REQUIRE : 0)
				+ (l.isDerived() ? DERIBED : 0) + (l.isHidden() ? HIDDEN : 0) + (l.isReadOnly() ? READ_ONLY : 0);
		attributes = new HashMap<String, Object>();
		version = l.getVersion();

	}

	/**
	 * Instantiates a new link description.
	 * 
	 * @param ret
	 *            the ret
	 * @param l
	 *            the l
	 * @param add
	 *            the add
	 */
	public LinkDescription(ItemDescription ret, LinkDescription l, boolean add) {
		this.source = ret;
		type = l.getType();
		destination = l.getDestination();
		state = l.state;
		attributes = new HashMap<String, Object>(l.getAttributes());
		version = l.getVersion();
		if (add && source instanceof ItemDescription) {
			((ItemDescription) source).links.add(this);
		}
	}

	/**
	 * Sets the source.
	 * 
	 * @param source
	 *            the new source
	 */
	public void setSource(ItemDescription source) {
		this.source = source;
	}

	/**
	 * Gets the type.
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Checks if is aggregation.
	 * 
	 * @return true, if is aggregation
	 */
	public boolean isAggregation() {
		return (state & AGGREGATION) == AGGREGATION;
	}

	/**
	 * Checks if is annotation.
	 * 
	 * @return true, if is annotation
	 */
	public boolean isAnnotation() {
		return (state & ANNOTATION) == ANNOTATION;
	}

	/**
	 * Checks if is composition.
	 * 
	 * @return true, if is composition
	 */
	public boolean isComposition() {
		return (state & COMPOSITION) == COMPOSITION;
	}

	/**
	 * Checks if is derived.
	 * 
	 * @return true, if is derived
	 */
	public boolean isDerived() {
		return (state & DERIBED) == DERIBED;
	}

	/**
	 * Checks if is hidden.
	 * 
	 * @return true, if is hidden
	 */
	public boolean isHidden() {
		return (state & HIDDEN) == HIDDEN;
	}

	/**
	 * Checks if is modified.
	 * 
	 * @return true, if is modified
	 */
	public boolean isModified() {
		return (state & MODIFIED) == MODIFIED;
	}

	/**
	 * Checks if is other.
	 * 
	 * @return true, if is other
	 */
	public boolean isOther() {
		return (state & OTHER) == OTHER;
	}

	/**
	 * Checks if is part.
	 * 
	 * @return true, if is part
	 */
	public boolean isPart() {
		return (state & PART) == PART;
	}

	/**
	 * Checks if is read only.
	 * 
	 * @return true, if is read only
	 */
	public boolean isReadOnly() {
		return (state & READ_ONLY) == READ_ONLY;
	}

	/**
	 * Checks if is require.
	 * 
	 * @return true, if is require
	 */
	public boolean isRequire() {
		return (state & REQUIRE) == REQUIRE;
	}

	/**
	 * Adds the attribute.
	 * 
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	public void addAttribute(String key, Object value) {
		attributes.put(key, value);
	}

	/**
	 * Gets the attributes.
	 * 
	 * @return the attributes
	 */
	public Map<String, Object> getAttributes() {
		return attributes;
	}

	/**
	 * Gets the source.
	 * 
	 * @return the source
	 */
	public ItemDescriptionRef getSource() {
		return source;
	}

	/**
	 * Gets the destination.
	 * 
	 * @return the destination
	 */
	public ItemDescriptionRef getDestination() {
		return destination;
	}

	/**
	 * Gets the version.
	 * 
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * Sets the version.
	 * 
	 * @param version
	 *            the new version
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/**
	 * Sets the type.
	 * 
	 * @param type
	 *            the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Sets the destination.
	 * 
	 * @param dest
	 *            the new destination
	 */
	public void setDestination(ItemDescription dest) {
		this.destination = dest;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return source.getId().toString() + " --(" + type + ")--> " + destination.getId().toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LinkDescription) {
			LinkDescription l = (LinkDescription) obj;
			return l.source.getId().equals(source.getId()) && l.destination.getId().equals(destination.getId())
					&& l.type.equals(type);
		}
		return super.equals(obj);
	}
}
