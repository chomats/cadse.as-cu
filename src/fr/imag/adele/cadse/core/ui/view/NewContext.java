package fr.imag.adele.cadse.core.ui.view;

import fr.imag.adele.cadse.core.CadseGCST;
import fr.imag.adele.cadse.core.IItemNode;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.util.ArraysUtil;
import fr.imag.adele.cadse.core.util.NLS;

public class NewContext extends FilterContext {
	String		_defaultName;
	Item[]		_outgoingDestination;
	LinkType[]	_outgoingLinkType;
	String		_label;
	Item[]		_incomingSource;
	LinkType[]	_incomingLinkType;
	
	public NewContext(IItemNode node) {
		super();
		_node = node;
	}

	public NewContext(FilterContext cxt) {
		super(cxt);
		if (getItemSource() != null)
			addOutgoingLink(CadseGCST.ITEM_lt_PARENT, getItemSource());
		if (getGroupHead() != null)
			addOutgoingLink(CadseGCST.GROUP_EXT_ITEM_lt_MEMBER_OF, getGroupHead());
		if (getDestinationType() != null)
			addOutgoingLink(CadseGCST.ITEM_lt_INSTANCE_OF, getGroupHead());
	}

	public void addOutgoingLink(LinkType lt, Item dest) {
		_outgoingLinkType = ArraysUtil.add(LinkType.class, _outgoingLinkType, lt);
		_outgoingDestination = ArraysUtil.add(Item.class, _outgoingDestination, dest);
	}

	public Item[] getOutgoingDestinations() {
		return _outgoingDestination;
	}

	public LinkType[] getOutgoingLinkType() {
		return _outgoingLinkType;
	}

	public Item getOutgoingDestination(LinkType lt) {
		if (_outgoingDestination == null)
			return null;
		for (int i = 0; i < _outgoingDestination.length; i++) {
			if (_outgoingLinkType[i] == lt)
				return _outgoingDestination[i];
		}
		return null;
	}
	
	public boolean hasKind(LinkType lt) {
		return getOutgoingDestination(lt) != null;
	}

	
	public void addIncomingLink(LinkType lt, Item source) {
		_incomingLinkType = ArraysUtil.add(LinkType.class, _incomingLinkType, lt);
		_incomingSource = ArraysUtil.add(Item.class, _incomingSource, source);
	}

	public Item[] getIncomingSources() {
		return _incomingSource;
	}

	public LinkType[] getIncomingLinkType() {
		return _incomingLinkType;
	}

	public Item getIncomingSource(LinkType lt) {
		if (_incomingSource == null)
			return null;
		for (int i = 0; i < _incomingSource.length; i++) {
			if (_incomingLinkType[i] == lt)
				return _incomingSource[i];
		}
		return null;
	}

	public void setPartParent(Item s, LinkType lt) {
		addOutgoingLink(CadseGCST.ITEM_lt_PARENT, s);
		addIncomingLink(lt, s);
		_itemSource = s;
		_lt = lt;
	}

	public Item getPartParent() {
		return _itemSource;
	}


	public LinkType getPartLinkType() {
		return _lt;
	}

	public void setDestinationType(ItemType destType) {
		addOutgoingLink(CadseGCST.ITEM_lt_INSTANCE_OF, destType);
		_destType = destType;
	}

	public boolean isValid() {
		if (_destType == null || !_destType.exists())
			return false;
		if (_destType.isPartType()) {
			if (_lt == null || _itemSource == null || !_lt.isPart() || _lt.getSource() == null
					|| _lt.getDestination() == null || !_itemSource.exists() || !_lt.exists())
				return false;
			// source
			if (_itemSource.getType() != _lt.getSource() && !_lt.getSource().isSuperGroupTypeOf(_itemSource.getType()))
				return false;
			// dest
			if (_destType != _lt.getDestination() && !_lt.getDestination().isSuperGroupTypeOf(_destType))
				return false;
		}
		return true;
	}

	public void setGroupHead(ItemType gh, LinkType glt) {
		addOutgoingLink(CadseGCST.GROUP_EXT_ITEM_lt_MEMBER_OF, gh);
		addIncomingLink(glt, gh);
		_gh = gh;
		_glt = glt;
	}


	public void setGroupType(ItemType gt) {
		_gt = gt;
	}

	@Override
	public String toString() {
		String from = "";
		if (_destType.isPartType()) {
			from = NLS.bind("from parent {1}({2})", _itemSource == null ? "??" : _itemSource.getDisplayName(),
					_lt == null ? "??" : _lt.getDisplayName());
		}
		if (_gh != null) {
			from = NLS.bind("from group {0}({1}) {2}", new Object[] { _gh.getName(),
					(_glt == null ? "??" : _glt.getDisplayName()), from });
		}
		return NLS.bind("New item of type {0} {1}", _destType == null ? "??" : _destType.getDisplayName(), from);
	}

	public void setDefaultName(String defaultShortNameAction) {
		_defaultName = defaultShortNameAction;
	}

	public String getDefaultName() {
		return _defaultName;
	}

	public void setLabel(String label) {
		_label = label;
	}

	public String getLabel() {
		return _label;
	}
}
