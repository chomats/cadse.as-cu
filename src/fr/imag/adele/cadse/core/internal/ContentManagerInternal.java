package fr.imag.adele.cadse.core.internal;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.imag.adele.cadse.core.CadseDomain;
import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.CompactUUID;
import fr.imag.adele.cadse.core.ContentItem;
import fr.imag.adele.cadse.core.DerivedLink;
import fr.imag.adele.cadse.core.DerivedLinkDescription;
import fr.imag.adele.cadse.core.EventFilter;
import fr.imag.adele.cadse.core.GenContext;
import fr.imag.adele.cadse.core.GenStringBuilder;
import fr.imag.adele.cadse.core.GroupType;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemDescription;
import fr.imag.adele.cadse.core.ItemDescriptionRef;
import fr.imag.adele.cadse.core.ItemFilter;
import fr.imag.adele.cadse.core.ItemState;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.LogicalWorkspace;
import fr.imag.adele.cadse.core.WorkspaceListener;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.build.Composer;
import fr.imag.adele.cadse.core.build.Exporter;
import fr.imag.adele.cadse.core.build.IBuildingContext;
import fr.imag.adele.cadse.core.delta.ImmutableWorkspaceDelta;
import fr.imag.adele.cadse.core.delta.ItemDelta;
import fr.imag.adele.cadse.core.key.ISpaceKey;
import fr.imag.adele.cadse.core.ui.Pages;
import fr.imag.adele.cadse.core.util.IErrorCollector;
import fr.imag.adele.cadse.core.util.OrderWay;
import fr.imag.adele.cadse.core.var.ContextVariable;

/**
 * The Class ContantManager.
 */
public class ContentManagerInternal implements ContentItem {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.ContentManager#build(fede.workspace.domain.build
	 * .IBuildingContext)
	 */
	public void build(IBuildingContext context) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.ContentManager#clean(fede.workspace.domain.build
	 * .IBuildingContext, boolean)
	 */
	public void clean(IBuildingContext context, boolean componentsContent) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fede.workspace.domain.ContentManager#compose(fede.workspace.domain.build
	 * .IBuildingContext)
	 */
	public void compose(IBuildingContext context) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ContentManager#create()
	 */
	public void create() throws CadseException {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ContentManager#delete()
	 */
	public void delete() throws CadseException {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ContentManager#getKindsResource()
	 */
	public String[] getKindsResource() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ContentManager#getMainResource()
	 */
	public Object getMainResource() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ContentManager#getResources(java.lang.String)
	 */
	public Object[] getResources(String kind) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ContentManager#setResources(java.lang.String,
	 * java.lang.Object[])
	 */
	public void setResources(String kind, Object[] resource) throws CadseException {
	}

	public ItemType getType() {
		return null;
	}

	public void setParentContent(ContentItem newParentContentManager) {

	}

	public void dispose() {

	}

	public void generate(GenStringBuilder sb, String type, String kind, Set<String> imports, GenContext context) {

	}

	public void generatePart(String linkID, GenStringBuilder sb, String type, String kind, Set<String> imports,
			GenContext context) {

	}

	public void generateParts(GenStringBuilder sb, String type, String kind, Set<String> imports, GenContext context) {

	}

	public void generateParts(String linkID, GenStringBuilder sb, String type, String kind, Set<String> imports,
			GenContext context) {

	}

	public ContentItem[] getChildrenContentManager() {
		return null;
	}

	public ContentItem[] getChildrenPropreContentManager() {
		return null;
	}

	public Composer[] getComposers() {
		return null;
	}

	public Exporter[] getExporter(String exporterType) {
		return null;
	}

	public Exporter[] getExporters() {
		return null;
	}

	public Item getItem() {
		return null;
	}

	public <T> T getMainMappingContent(Class<T> clazz, Object... params) {
		return null;
	}

	public <T> T getMainMappingContent(ContextVariable cxt, Class<T> clazz, Object... params) {
		return null;
	}

	public ContentItem getParentContentManager() {
		return null;
	}

	public ContentItem getParentPartContentManager(boolean includeContainers) {
		return null;
	}

	public ContentItem getParentPartContentManager() {
		return null;
	}

	public String getResourceName() {
		return null;
	}

	public Object[] getResources() {
		return null;
	}

	public void init() throws CadseException {

	}

	public void migrateContentItem(ItemDelta ownerItem, ContextVariable newCxt, ContextVariable oldCxt) {

	}

	public void setComposers(Composer... composers) {

	}

	public void setExporters(Exporter... exporters) {

	}

	public void setResourceName(String resourceName) {

	}

	public void addListener(WorkspaceListener l, int eventFilter) {

	}

	public void addListener(WorkspaceListener l, EventFilter eventFilter) {

	}

	public Link addOutgoingItem(LinkType linkType, Item destination) throws CadseException {
		return null;
	}

	public void buildComposite() throws CadseException {

	}

	public boolean canCreateLink(LinkType linkType, CompactUUID destItemId) {
		return false;
	}

	public boolean canEditContent(String slashedPath) {
		return false;
	}

	public boolean canSetAttribute(String attrName, Object value) {
		return false;
	}

	public boolean containsComponent(CompactUUID id) {
		return false;
	}

	public boolean containsPartChild(Item item) {
		return false;
	}

	public boolean contentIsLoaded() {
		return false;
	}

	public Link createLink(LinkType linkType, Item destItem) throws CadseException {
		return null;
	}

	public void delete(boolean deleteContent) throws CadseException {

	}

	public List<WorkspaceListener> filter(int filters, ImmutableWorkspaceDelta delta) {
		return null;
	}

	public void finishLoad() {

	}

	public List<Link> getAggregations() {
		return null;
	}

	public ContentItem getAndCreateContentManager() {
		return null;
	}

	public CadseDomain getCadseDomain() {
		return null;
	}

	public Set<CompactUUID> getComponentIds() {
		return null;
	}

	public Item getComponentInfo(CompactUUID id) {
		return null;
	}

	public Set<Item> getComponents() {
		return null;
	}

	public List<Item> getCompositeParent() {
		return null;
	}

	public ContentItem getContentItem() {
		return null;
	}

	public Set<DerivedLinkDescription> getDerivedLinkDescriptions(ItemDescription source) {
		return null;
	}

	public Set<DerivedLink> getDerivedLinks() {
		return null;
	}

	public String getDisplayName() {
		return null;
	}

	public String getHandleIdentifier() throws CadseException {
		return null;
	}

	public CompactUUID getId() {
		return null;
	}

	public Item getIncomingItem(LinkType linkType) {
		return null;
	}

	public Collection<Item> getIncomingItems(LinkType linkType) {
		return null;
	}

	public Collection<Item> getIncomingItems() {
		return null;
	}

	public Link getIncomingLink(LinkType linkType, CompactUUID srcId) {
		return null;
	}

	public List<Link> getIncomingLinks() {
		return null;
	}

	public List<Link> getIncomingLinks(LinkType linkType) {
		return null;
	}

	public ISpaceKey getKey() {
		return null;
	}

	public int getLastVersion() {
		return 0;
	}

	public File getLocation() {
		return null;
	}

	public LogicalWorkspace getLogicalWorkspace() {
		return null;
	}

	public <T> T getMainMappingContent(Class<T> clazz) {
		return null;
	}

	public <T> List<T> getMappingContents(Class<T> clazz) {
		return null;
	}

	public List<?> getMappingContents() {
		return null;
	}

	public Item getOutgoingItem(String linkTypeName, CompactUUID itemId, boolean resolvedOnly) {
		return null;
	}

	public Item getOutgoingItem(LinkType lt, boolean resolvedOnly) {
		return null;
	}

	public Item getOutgoingItem(String linkID, boolean resolvedOnly) {
		return null;
	}

	public Collection<Item> getOutgoingItems(LinkType lt, boolean resolvedOnly) {
		return null;
	}

	public Collection<Item> getOutgoingItems(boolean resolvedOnly) {
		return null;
	}

	public Collection<Item> getOutgoingItems(String types_link, boolean resolvedOnly) {
		return null;
	}

	public Link getOutgoingLink(LinkType linkType) {
		return null;
	}

	public Link getOutgoingLink(Item destItem) {
		return null;
	}

	public Link getOutgoingLink(LinkType lt, CompactUUID destId) {
		return null;
	}

	public List<Link> getOutgoingLinks() {
		return null;
	}

	public List<Link> getOutgoingLinks(LinkType linkType) {
		return null;
	}

	public Item getPartChild(CompactUUID destItemId) {
		return null;
	}

	public Collection<Item> getPartChildren() {
		return null;
	}

	public Collection<Item> getPartChildren(LinkType linkType) {
		return null;
	}

	public Item getPartParent(boolean attemptToRecreate) {
		return null;
	}

	public ContentItem getPartParent() {
		return null;
	}

	public Item getPartParent(LinkType linkType) {
		return null;
	}

	public Item getPartParent(LinkType linkType, boolean attemptToRecreate) throws CadseException {
		return null;
	}

	public Item getPartParent(ItemType itemType) {
		return null;
	}

	public Item getPartParentByName(String typeName) {
		return null;
	}

	public LinkType getPartParentLink() {
		return null;
	}

	public LinkType getPartParentLinkType() {
		return null;
	}

	public String getQualifiedDisplayName() {
		return null;
	}

	public String getName() {
		return null;
	}

	public ItemState getState() {
		return null;
	}

	public String getQualifiedName() {
		return null;
	}

	public String getUniqueName(boolean recompute) throws CadseException {
		return null;
	}

	public int getVersion() {
		return 0;
	}

	public int indexOf(Link link) {
		return 0;
	}

	public boolean isAccessible() {
		return false;
	}

	public boolean isAncestorOf(Item item) {
		return false;
	}

	public boolean isComposite() {
		return false;
	}

	public boolean isHidden() {
		return false;
	}

	public boolean isInIncomingLinks(Link l) {
		return false;
	}

	public boolean isInOutgoingLinks(Link l) {
		return false;
	}

	public boolean isInstanceOf(ItemType it) {
		return false;
	}

	public boolean isOrphan() {
		return false;
	}

	public boolean isPartItem() {
		return false;
	}

	public boolean isReadOnly() {
		return false;
	}

	public boolean isRequierNewRev() {
		return false;
	}

	public boolean isResolved() {
		return false;
	}

	public boolean isRevModified() {
		return false;
	}

	public boolean isStatic() {
		return false;
	}

	public boolean isValid() {
		return false;
	}

	public boolean itemHasContent() {
		return false;
	}

	public void setKey(ISpaceKey newkey) {

	}

	public void removeContentItem() {

	}

	public void removeListener(WorkspaceListener l) {

	}

	public Link removeOutgoingItem(LinkType linkType, Item destination) throws CadseException {
		return null;
	}

	public void setComponents(Set<ItemDescriptionRef> comp) throws CadseException {

	}

	public void setDerivedLinks(Set<DerivedLinkDescription> derivedLinks) {

	}

	public Link setOutgoingItem(LinkType linkID, Item dest) throws CadseException {
		return null;
	}

	public Collection<Link> setOutgoingItems(LinkType linkType, Collection<Item> value) throws CadseException {
		return null;
	}

	public void setReadOnly(boolean readOnly) throws CadseException {

	}

	public void setShortName(String shortname) throws CadseException {

	}

	public void setState(ItemState modifing) {

	}

	public void setUniqueName(String uniqueName) throws CadseException {

	}

	public void setValid(boolean isValid) {

	}

	public void shadow(boolean deleteContent) throws CadseException {

	}

	public void unload() throws CadseException {

	}

	public void update(IWorkingLoadingItems items, ItemDelta desc, IWorkspaceNotifier notifie) {

	}

	public <T> T getAttribute(IAttributeType<T> att) {
		return null;
	}

	public <T> T getAttribute(String att) {
		return null;
	}

	public <T> T getAttributeH(String att, boolean fromSuperIfNull) {
		return null;
	}

	public String[] getAttributeKeys() {
		return null;
	}

	public <T> T getAttributeOwner(IAttributeType<T> att) {
		return null;
	}

	public <T> T getAttributeWithDefaultValue(IAttributeType<T> att, T defaultValue) {
		return null;
	}

	public <T> T getAttributeWithDefaultValue(String att, T defaultValue) {
		return null;
	}

	public boolean isTWAttributeModified(IAttributeType<?> att) {
		return false;
	}

	public void setAttribute(IAttributeType<?> att, Object value) throws CadseException {

	}

	public void setAttribute(String att, Object value) throws CadseException {

	}

	public void getLocalAllAttributeTypes(List<IAttributeType<?>> all) {

	}

	public void getLocalAllAttributeTypes(Map<String, IAttributeType<?>> all, boolean keepLastAttribute) {

	}

	public void getLocalAllAttributeTypes(List<IAttributeType<?>> all, ItemFilter filter) {

	}

	public IAttributeType<?>[] getLocalAllAttributeTypes() {
		return null;
	}

	public void getLocalAllAttributeTypes(Map<String, IAttributeType<?>> all, boolean keepLastAttribute,
			ItemFilter filter) {

	}

	public void getLocalAllAttributeTypesKeys(Set<String> all, ItemFilter filter) {

	}

	public IAttributeType<?> getLocalAttributeType(String shortname) {
		return null;
	}

	public void addIncomingLink(Link link, boolean notify) {

	}

	public Link commitLoadCreateLink(LinkType lt, Item destination) throws CadseException {
		return null;
	}

	public boolean commitMove(OrderWay kind, Link l1, Link l2) throws CadseException {
		return false;
	}

	public boolean commitSetAttribute(IAttributeType<?> type, Object value) {
		return false;
	}

	public void computeAttribute(String attributeName, Object theirsValue, Object baseValue, Object mineValue) {

	}

	public void computeAttributes() {

	}

	public void forceState(ItemState state) {

	}

	public <T> T internalGetGenericOwnerAttribute(String key) {
		return null;
	}

	public <T> T internalGetGenericOwnerAttribute(IAttributeType<T> type) {
		return null;
	}

	public <T> T internalGetOwnerAttribute(String key) {
		return null;
	}

	public <T> T internalGetOwnerAttribute(IAttributeType<T> type) {
		return null;
	}

	public void loadContent() {

	}

	public void loadItem(IWorkingLoadingItems wl, ItemDelta itemOperation, IErrorCollector errorCollector)
			throws CadseException {

	}

	public Iterator<Item> propagateValue(IAttributeType<?> type) {
		return null;
	}

	public Iterator<Item> propagateValue(String key) {
		return null;
	}

	public void refresh() {

	}

	public void removeIncomingLink(Link link, boolean notify) {

	}

	public void removeOutgoingLink(Link link, boolean notify) {

	}

	public boolean setFlag(int f, boolean flag) {
		return false;
	}

	public void setIsStatic(boolean isStatic) {

	}

	public void setParent(Item parent, LinkType lt) {

	}

	public void setType(ItemType itemType) {

	}

	public void setVersion(int version) {

	}

	public <T> T getMainMappingContent(ContextVariable cxt, Class<T> clazz) {
		return null;
	}

	public ContentItem _getContentItem() {
		return null;
	}

	public Collection<ContentItem> getPartChildrenContents() {
		return null;
	}

	public String getQualifiedName(boolean recompute) throws CadseException {
		return null;
	}

	public String getShortName() {
		return "<invalid content>";
	}

	public String getUniqueName() {
		return null;
	}

	public void setName(String name) throws CadseException {
	}

	public void setQualifiedName(String qualifiedName) throws CadseException {
	}

	@Override
	public Item getOwnerItem() {
		return null;
	}

	@Override
	public Item getBaseItem() {
		return this;
	}

	@Override
	public void addChild(ContentItem contentItem) {
	}

	@Override
	public void removeChild(ContentItem contentItem) {
	}

	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public boolean isMember() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMemberOf(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GroupType getGroup() {
		return null;
	}

	@Override
	public List<LinkType> getInstanceOutgoingLinkTypes() {
		return null;
	}

	@Override
	public Pages getInstanceModificationPages(Item selectedItem) {
		// TODO Auto-generated method stub
		return null;
	}

}