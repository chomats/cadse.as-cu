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
package fr.imag.adele.cadse.core.build;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.objectadapter.AdaptableObjectImpl;

/**
 * This class manages the contents of an eclipse resources associated with an
 * item in order to perform at the eclipse resource level the actions
 * corresponding to the logical composition.
 * 
 * @author vega
 */
public abstract class Composer {

	/** The content manager. */
	final private Item			_owerItem;

	/** The exporter types. */
	final private String[]		_exporterTypes;

	protected IExporterTarget	currentTarget;

	/**
	 * Instantiates a new composer.
	 * 
	 * @param contentManager
	 *            the content manager
	 * @param exporterTypes
	 *            the exporter types
	 */
	protected Composer(Item owerItem, String... exporterTypes) {
		this._owerItem = owerItem;
		this._exporterTypes = exporterTypes;
	}

	/**
	 * Gets the item associated with this composer.
	 * 
	 * @return the item
	 */
	final public Item getItem() {
		return _owerItem;
	}

	/**
	 * Gets the exporter types.
	 * 
	 * @return the exporter types
	 */
	final public String[] getExporterTypes() {
		return _exporterTypes;
	}

	public IExporterTarget getCurrentTarget() {
		return currentTarget;
	}

	/**
	 * Composes the new derived resources of the item associated with this
	 * composer, from all the packaged items found in the project.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @throws CadseException
	 */
	final public void compose(IBuildingContext context) throws CadseException {
		Item item = getItem();
		currentTarget = getTarget();
		if (currentTarget == null) {
			Logger.getLogger("Composer").severe("Cannot found current target");
			return;
		}
		preComposer(context, currentTarget);

		List<IExportedContent> listExportedContent = new ArrayList<IExportedContent>();
		for (String exporterType : _exporterTypes) {
			List<Link> outgoingLinks = new ArrayList<Link>(item.getOutgoingLinks());
			for (Link l : outgoingLinks) {

				if (!l.isLinkResolved()) {
					context.report("not resolveed link to item {0}", l.getDestinationId());// error...
					continue;
				}
				if (!accepts(l)) {
					continue;
				}

				Item composant = l.getResolvedDestination();
				Exporter[] ex = composant.getExporter(exporterType);
				if (ex == null) {
					continue;
				}
				for (Exporter exporter : ex) {
					boolean fullExport = getFullExport(l, exporterType);
					IExportedContent exportedContent = exporter.exportItem(context, currentTarget, exporterType,
							fullExport);
					if (exportedContent != null) {
						listExportedContent.add(exportedContent);
						exportedContent.setLink(l);
					}
				}
			}

			garbageCollect(context, exporterType, currentTarget);
		}

		postCompose(context, listExportedContent, currentTarget);
		currentTarget = null;
	}

	/**
	 * Gets the full export.
	 * 
	 * @param l
	 *            the l
	 * @param exporterType
	 *            the exporter type
	 * 
	 * @return the full export
	 */
	protected boolean getFullExport(Link l, String exporterType) {
		return true;
	}

	/**
	 * Accepts.
	 * 
	 * @param l
	 *            A link to test
	 * 
	 * @return true if the link is managed by the composer
	 */
	protected boolean accepts(Link l) {
		return l.getLinkType().isComposition();
	}

	/**
	 * Garbage collect.
	 * 
	 * @param context
	 *            the context
	 * @param exporterType
	 *            the exporter type
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	protected void garbageCollect(IBuildingContext context, String exporterType, IExporterTarget target)
			throws CadseException {
		if (target == null) {
			Logger.getLogger("Composer").severe("Cannot found target");
			return;
		}
		/*
		 * Garbage collection.
		 * 
		 * After updating all components, we verify the packaged components in
		 * the local repository and delete any content that doesn't correspond
		 * to a composants (at all levels of composition)
		 * 
		 * TODO,BUG,WARNING
		 * 
		 * Because we share a single repository for all items in a project, this
		 * can delete packaged content of one of the parts.
		 * 
		 * We need to handle mapping variants in which there are many composites
		 * in a single eclipse project, this is the case for example when a
		 * composite has parts that are themselves composites.
		 */
		List<IExportedContent> repositoryComponents = target.getRepositoryComponents(exporterType);

		// monitor = new
		// SubProgressMonitor(getMonitor(),1,SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		context.beginTask("Trimming components of item " + getItem().getId(), repositoryComponents.size());
		context.checkCanceled();

		for (IExportedContent component : repositoryComponents) {
			context.subTask("verifiying " + component.getItemDisplayName());

			if (containsComponent(component)) {
				continue;
			}

			component.delete(context);
			context.worked(1);
		}
		context.endTask();
	}

	protected boolean containsComponent(IExportedContent component) {
		return getItem().containsComponent(component.getItemIdentification());
	}

	/**
	 * Pre composer.
	 * 
	 * @param context
	 *            the context
	 * @param target
	 *            the target
	 */
	protected void preComposer(IBuildingContext context, IExporterTarget target) {
	}

	/**
	 * Post compose.
	 * 
	 * @param context
	 *            the context
	 * @param listExportedContent
	 *            the list exported content
	 * @param target
	 */
	protected void postCompose(IBuildingContext context, List<IExportedContent> listExportedContent,
			IExporterTarget target) {
	}

	/**
	 * Gets the target.
	 * 
	 * @return the target
	 */
	protected abstract IExporterTarget getTarget();

	/**
	 * Clean.
	 * 
	 * @param context
	 *            the context
	 */
	public void clean(IBuildingContext context) {
		currentTarget = getTarget();
		if (currentTarget == null) {
			Logger.getLogger("Composer").severe("Cannot found current target");
			return;
		}
		preClean(context, currentTarget);
		for (String exporterType : _exporterTypes) {
			try {
				List<IExportedContent> repositoryComponents = currentTarget.getRepositoryComponents(exporterType);

				// monitor = new
				// SubProgressMonitor(getMonitor(),1,SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
				context.beginTask("Cleaning components of item " + getItem().getId(), repositoryComponents.size());

				for (IExportedContent component : repositoryComponents) {
					context.subTask("verifiying " + component.getItemDisplayName());

					try {
						component.delete(context);
					} catch (CadseException e) {
						context.subTask("cleaning " + component.getItemDisplayName());
						context.report("Error in detete the component {0}/{1} : {2}", component.getItemDisplayName(),
								exporterType, e.getMessage());
						e.printStackTrace();
					}
					context.worked(1);
				}
			} catch (CadseException e) {
				context.report("Error in get repository of {0} : {1}", exporterType, e.getMessage());
				e.printStackTrace();
			}
			context.endTask();
		}
		postClean(context, currentTarget);
		currentTarget = null;
	}

	protected void preClean(IBuildingContext context, IExporterTarget target) {
	}

	protected void postClean(IBuildingContext context, IExporterTarget target) {
	}
}
