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

import java.util.UUID;

/**
 * The Class DerivedLinkDescription.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class DerivedLinkDescription extends LinkDescription {

	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -7765297233569332892L;

	/** The origin link type id. */
	private String				originLinkTypeID;

	/** The origin link destination type id. */
	private UUID			originLinkDestinationTypeID;

	/** The origin link source type id. */
	private UUID			originLinkSourceTypeID;

	/**
	 * Instantiates a new derived link description.
	 * 
	 * @param source
	 *            the source
	 * @param type
	 *            the type
	 * @param destination
	 *            the destination
	 * @param _isAggregation
	 *            the _is aggregation
	 * @param _isRequire
	 *            the _is require
	 * @param info
	 *            the info
	 * @param originLinkTypeID
	 *            the origin link type id
	 * @param originLinkSourceTypeID
	 *            the origin link source type id
	 * @param originLinkDestinationTypeID
	 *            the origin link destination type id
	 * @param version
	 *            the version
	 */
	public DerivedLinkDescription(ItemDescriptionRef source, LinkType type, ItemDescriptionRef destination,
			boolean _isAggregation, boolean _isRequire, String info, String originLinkTypeID,
			UUID originLinkSourceTypeID, UUID originLinkDestinationTypeID, int version) {
		super(source, type, destination, _isAggregation, false,
				false, false, _isRequire, false, true, false, false, false, info, version);
		this.originLinkTypeID = originLinkTypeID;
		this.originLinkDestinationTypeID = originLinkDestinationTypeID;
		this.originLinkSourceTypeID = originLinkSourceTypeID;
	}

	/**
	 * Instantiates a new derived link description.
	 * 
	 * @param link
	 *            the link
	 */
	public DerivedLinkDescription(DerivedLink link) {
		super(link);
		this.originLinkTypeID = link.getDerivedType().getOriginLinkType().getName();
		this.originLinkDestinationTypeID = link.getDerivedType().getOriginLinkType().getDestination().getId();
		this.originLinkSourceTypeID = link.getDerivedType().getOriginLinkType().getSource().getId();
		// this.other = link.getOther();
	}

	/**
	 * Instantiates a new derived link description.
	 * 
	 * @param source
	 *            the source
	 * @param dl
	 *            the dl
	 */
	public DerivedLinkDescription(ItemDescription source, DerivedLink dl) {
		this(source, dl.getLinkType(), new ItemDescriptionRef(dl.getDestination()), dl.isAggregation(),
				dl.isRequire(), null, dl.getDerivedType().getOriginLinkType().getName(), dl.getDerivedType()
						.getOriginLinkType().getSource().getId(), dl.getDerivedType().getOriginLinkType()
						.getDestination().getId(), dl.getVersion());
	}

	/**
	 * Instantiates a new derived link description.
	 * 
	 * @param description
	 *            the description
	 * @param desc
	 *            the desc
	 */
	public DerivedLinkDescription(ItemDescription description, DerivedLinkDescription desc) {
		super(description, desc, false);
		this.originLinkDestinationTypeID = desc.originLinkDestinationTypeID;
		this.originLinkSourceTypeID = desc.originLinkSourceTypeID;
		this.originLinkTypeID = desc.originLinkTypeID;

	}

	/**
	 * Gets the origin link destination type id.
	 * 
	 * @return the origin link destination type id
	 */
	public UUID getOriginLinkDestinationTypeID() {
		return originLinkDestinationTypeID;
	}

	/**
	 * Gets the origin link source type id.
	 * 
	 * @return the origin link source type id
	 */
	public UUID getOriginLinkSourceTypeID() {
		return originLinkSourceTypeID;
	}

	/**
	 * Gets the origin link type id.
	 * 
	 * @return the origin link type id
	 */
	public String getOriginLinkTypeID() {
		return originLinkTypeID;
	}

}
