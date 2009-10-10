package fr.imag.adele.cadse.core;

import java.util.Collection;
import java.util.Set;

import fr.imag.adele.cadse.core.build.Composer;
import fr.imag.adele.cadse.core.build.Exporter;
import fr.imag.adele.cadse.core.build.IBuildingContext;
import fr.imag.adele.cadse.core.delta.ItemDelta;
import fr.imag.adele.cadse.core.internal.ContentManagerInternal;
import fr.imag.adele.cadse.core.var.ContextVariable;

/**
 * Represents the content associated to an item. Basically, an item is related
 * to at most one content item.
 * 
 * A content item can represent an IDE resource (file, directory, project), a
 * file part, any informations in form of serializable objects.
 * 
 * Note that today (CADSE 2.2), a content item is not an item in CADSE sense. It
 * will become it in future release of CADSE. That's why, you cannot find in the
 * logical workspace these items.
 * 
 * @author Thomas
 * 
 */
public interface ContentItem extends Item {

	/** The Constant NO_COMPOSER. */
	public static final Composer[]	NO_COMPOSER		= new Composer[0];

	/** The Constant NO_EXPORTER. */
	public static final Exporter[]	NO_EXPORTER		= new Exporter[0];

	/** The Constant NO_CONTENT. */
	public static final ContentItem	NO_CONTENT		= new ContentManagerInternal();

	/** The Constant INVALID_CONTENT. */
	public static final ContentItem	INVALID_CONTENT	= new ContentManagerInternal();

	/**
	 * Returns the item which has as content this item.
	 * 
	 * @return the item which has as content this item.
	 * @deprecated use getOwnerItem()
	 */
	public Item getItem();

	
	/**
	 * Returns the item which has as content this item.
	 * 
	 * @return the item which has as content this item.
	 */
	public Item getOwnerItem();
	
	
	/**
	 * Initialize this content. This method is called only once during a CADSE
	 * execution. Loading an item loads the associated content item and then
	 * call its init method. This method has always been called when you call
	 * create method.
	 * 
	 * @throws CadseException
	 *             a CADSE exception
	 */
	public void init() throws CadseException;

	/**
	 * Free resource and memory used by this item.
	 */
	public void dispose();

	/**
	 * Removes all resources, objects and items generated by builders associated
	 * to this item. If <code>componentsContent</code> is true, clean also all
	 * content of components. Components are destination items of all outgoing
	 * composition links.
	 * 
	 * @param context
	 *            building context
	 * @param componentsContent
	 *            if true, also cleans component contents
	 */
	public void clean(IBuildingContext context, boolean componentsContent);

	/**
	 * Builds this content. Building can produce new resources, modify existing
	 * resources, generates or modify objects and items.
	 * 
	 * Note that clean action is not performed before each build but only on
	 * demand. Builder is considered as incremental by default.
	 * 
	 * @param context
	 *            building context
	 */
	public void build(IBuildingContext context);

	/**
	 * Calls all composers associated to this item. A composer is in charge of
	 * computation based on component exported contents (exported contents are
	 * retrieved from exporters of the components) which leads to generate or
	 * modify resources, objects or items associated to this item.
	 * 
	 * Note that clean action is not performed before each compose action but
	 * only on demand. Composer is considered as incremental by default.
	 * 
	 * @param context
	 *            building context
	 */
	public void compose(IBuildingContext context);

	/**
	 * Returns all resources represented by this content.
	 * 
	 * @return all resources represented by this content.
	 * @deprecated uses {@link #getMainResource()} or
	 *             {@link ContentManagerImpl#getMainMappingContent(Class, Object...)}
	 */
	@Deprecated
	public Object[] getResources();

	/**
	 * Returns all resources represented by this content with specified type.
	 * 
	 * @param resType
	 *            resource type
	 * 
	 * @return all resources represented by this content with specified type.
	 * @deprecated uses {@link #getMainResource()} or
	 *             {@link ContentManagerImpl#getMainMappingContent(Class, Object...)}
	 */
	@Deprecated
	public Object[] getResources(String resType);

	/**
	 * Return root resource associated to this item. For example, a CADSE
	 * definition item has related project as main mapping content.
	 * 
	 * @return root resource associated to this item.
	 */
	public Object getMainResource();

	/**
	 * Return root content of specified type associated to this item. For
	 * example, a CADSE definition item has related project as main mapping
	 * content.
	 * 
	 * @param cxt
	 *            context
	 * @param clazz
	 *            resource class
	 * 
	 * @return root content of specified type associated to this item.
	 */
	public <T> T getMainMappingContent(ContextVariable cxt, Class<T> clazz);

	/**
	 * Associates to this content item specified resources. Current associated
	 * resources are no more considered related to this content.
	 * 
	 * @param resType
	 *            resource type
	 * @param resources
	 *            resources to associate to this item.
	 * 
	 * @throws CadseException
	 *             a CADSE exception
	 */
	public void setResources(String resType, Object[] resources) throws CadseException;

	/**
	 * Returns all content types managed by this content item.
	 * 
	 * @return all content types managed by this content item.
	 */
	public String[] getKindsResource();

	/**
	 * Creates the resources, objects and items represented by this content
	 * item.
	 * 
	 * @throws CadseException
	 *             a CADSE exception
	 */
	public void create() throws CadseException;

	/**
	 * Deletes all resources, objects and items represented by this content
	 * item.
	 * 
	 * @throws CadseException
	 *             a CADSE exception
	 */
	public void delete() throws CadseException;

//	/**
//	 * Returns its parent content item. Note that it is not parent of the
//	 * logical item but the direct parent content item of this content item. For
//	 * example, a content item representing a source directory may have a
//	 * content item representing the project as parent. Content items are
//	 * organized hierarchically. If it has no parent, returns null.
//	 * 
//	 * If there is no associated resource and the item is part of another item,
//	 * it is possible to request the resource associated with the first
//	 * containing ancestor having one.
//	 * 
//	 * @param includeContainers
//	 *            recursif
//	 * 
//	 * @return its parent content item.
//	 * 
//	 */
//	@Deprecated
//	public ContentItem getParentPartContentManager(boolean includeContainers);

	/**
	 * Migrates a content of <code>ownerItem</code> item from a context to
	 * another one. This method is useful to perform refactoring on existing
	 * contents. Be careful, it may be not implemented.
	 * 
	 * @param ownerItem
	 *            item who has content represented by this item (delta
	 *            represents modification performed on this item)
	 * @param newCxt
	 *            new context
	 * @param oldCxt
	 *            old context
	 */
	public void migrateContentItem(ItemDelta ownerItem, ContextVariable newCxt, ContextVariable oldCxt);

	/**
	 * Sets parent content item.
	 * 
	 * @param newParentContentItem
	 *            new parent content item
	 */
	public void setParentContent(ContentItem newParentContentItem);

	/**
	 * Returns its parent content item. Note that it is not parent of the
	 * logical item but the direct parent content item of this content item. For
	 * example, a content item representing a source directory may have a
	 * content item representing the project as parent. Content items are
	 * organized hierarchically. If it has no parent, returns null.
	 * 
	 * @return its parent content item.
	 */
	public ContentItem getPartParent();

	/**
	 * Returns its children content items. Note that it is not children of the
	 * logical item but the direct children content items of this content item.
	 * For example, a content item representing a project may have children
	 * content items representing the source directories. Content items are
	 * organized hierarchically.
	 * 
	 * @return its children content items.
	 */
	public Collection<ContentItem> getPartChildrenContents();

	/**
	 * Returns its parent content item. Note that it is not parent of the
	 * logical item but the direct parent content item of this content item. For
	 * example, a content item representing a source directory may have a
	 * content item representing the project as parent. Content items are
	 * organized hierarchically. If it has no parent, returns null.
	 * 
	 * @return its parent content item.
	 * @deprecated uses {@link #getPartParent()}
	 */
	@Deprecated
	public ContentItem getParentContentManager();

	/**
	 * Returns its parent content item. Note that it is not parent of the
	 * logical item but the direct parent content item of this content item. For
	 * example, a content item representing a source directory may have a
	 * content item representing the project as parent. Content items are
	 * organized hierarchically. If it has no parent, returns null.
	 * 
	 * @return its parent content item.
	 * @deprecated uses {@link #getPartParent()}
	 */
	@Deprecated
	public ContentItem getParentPartContentManager();

//	/**
//	 * Returns its children content items. Note that it is not children of the
//	 * logical item but the direct children content items of this content item.
//	 * For example, a content item representing a project may have children
//	 * content items representing the source directories. Content items are
//	 * organized hierarchically.
//	 * 
//	 * @return its children content items.
//	 * @deprecated uses {@link #getPartChildrenContents()}
//	 */
//	@Deprecated
//	public ContentItem[] getChildrenContentManager();

//	/**
//	 * Returns its children content items. Note that it is not children of the
//	 * logical item but the direct children content items of this content item.
//	 * For example, a content item representing a project may have children
//	 * content items representing the source directories. Content items are
//	 * organized hierarchically.
//	 * 
//	 * @return its children content items.
//	 * @deprecated uses {@link #getPartChildrenContents()}
//	 */
//	@Deprecated
//	public ContentItem[] getChildrenPropreContentManager();

	/**
	 * Generates a string content represented by this item.
	 * 
	 * @param sb           string builder used to generate string content
	 * @param type         generation type
	 * @param kind         generation kind (multiple kinds per generation type)
	 * @param imports      set of imports used for the generation
	 * @param context      generation context which contains configuration properties
	 */
	public void generate(GenStringBuilder sb, String type, String kind, Set<String> imports, GenContext context);

	/**
	 * Generates string content represented by all children (destination items of 
	 * outgoing part links) of the logical item associated to this item.
	 * 
	 * @param sb           string builder used to generate string content
	 * @param type         generation type
	 * @param kind         generation kind (multiple kinds per generation type)
	 * @param imports      set of imports used for the generation
	 * @param context      generation context which contains configuration properties
	 */
	public void generateParts(GenStringBuilder sb, String type, String kind, Set<String> imports, GenContext context);

	/**
	 * Generates string content represented by one child (destination item of 
	 * one outgoing link of specified type) of the logical item associated to this item.
	 * 
	 * @param linkTypeName link type name
	 * @param sb           string builder used to generate string content
	 * @param type         generation type
	 * @param kind         generation kind (multiple kinds per generation type)
	 * @param imports      set of imports used for the generation
	 * @param context      generation context which contains configuration properties
	 */
	public void generatePart(String linkTypeName, GenStringBuilder sb, String type, String kind, Set<String> imports,
			GenContext context);

	/**
	 * Generates string content represented by all children (destination items of 
	 * outgoing links of specified type) of the logical item associated to this item.
	 * 
	 * @param linkTypeName link type name
	 * @param sb           string builder used to generate string content
	 * @param type         generation type
	 * @param kind         generation kind (multiple kinds per generation type)
	 * @param imports      set of imports used for the generation
	 * @param context      generation context which contains configuration properties
	 */
	public void generateParts(String linkTypeName, GenStringBuilder sb, String type, String kind, Set<String> imports,
			GenContext context);

	/**
	 * Returns its exporters.
	 * 
	 * @return its exporters.
	 */
	public Exporter[] getExporters();

	/**
	 * Returns all exporters managing specified type of exported content.
	 * 
	 * @param exportedContentType
	 *            content type
	 * 
	 * @return the exporter managing specified type of exported content.
	 */
	public Exporter[] getExporter(String exportedContentType);

	/**
	 * Sets the exporters.
	 * 
	 * @param exporters
	 *            content exporters
	 */
	public void setExporters(Exporter... exporters);

	/**
	 * Returns its composers.
	 * 
	 * @return its composers.
	 */
	public Composer[] getComposers();

	/**
	 * Sets the composers.
	 * 
	 * @param composers
	 *            composers
	 */
	public void setComposers(Composer... composers);

	/**
	 * If this item represents an IDE resource, returns the resource name else
	 * return null.
	 * 
	 * @return name of IDE resource represented by this item.
	 */
	@Deprecated
	public String getResourceName();

	/**
	 * Sets name of the resource represented by this item. If this item does not
	 * represent any resource, don't use this method.
	 * 
	 * @param resourceName
	 *            represented resource name
	 */
	@Deprecated
	public void setResourceName(String resourceName);


	/* internale */

	public void addChild(ContentItem contentItem);
	
	public void removeChild(ContentItem contentItem);

}