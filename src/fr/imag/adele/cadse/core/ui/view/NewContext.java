package fr.imag.adele.cadse.core.ui.view;

import fr.imag.adele.cadse.core.GroupType;
import fr.imag.adele.cadse.core.IItemNode;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.util.NLS;

public class NewContext extends FilterContext {
	String _defaultName;
	
	public NewContext(IItemNode node) {
		super();
		_node = node;
	}
	
	
	public void setPartParent(Item s) {
		_itemSource = s;
	}
	
	public Item getPartParent() {
		return _itemSource;
	}
	
	public void setPartLinkType(LinkType lt) {
		_lt = lt;
	}
	
	public LinkType getPartLinkType() {
		return _lt;
	}
	
	public void setDestinationType(ItemType destType) {
		_destType = destType;
	}
	
	
	public boolean isValid() {
		if (_destType == null || !_destType.exists())
			return false;
		if (_destType.isPartType()) {
			if (_lt == null || _itemSource == null || ! _lt.isPart() || _lt.getSource() == null || _lt.getDestination() == null || !_itemSource.exists() || !_lt.exists())
				return false;
			//source
			if (_itemSource.getType() != _lt.getSource() && !_lt.getSource().isSuperGroupTypeOf(_itemSource.getType()))
				return false;
			//dest
			if (_destType != _lt.getDestination() && !_lt.getDestination().isSuperGroupTypeOf(_destType))
				return false;
		}
		return true;
	}
	
	
	public void setGroupHead(GroupType gh) {
		_gh = gh;
	}
	public void setGroupLinkType(LinkType glt) {
		_glt = glt;
	}
	public void setGroupType(GroupType gt) {
		_gt = gt;
	}

	@Override
	public String toString() {
		String from = "";
		if (_destType.isPartType()) {
			from = NLS.bind("from parent {1}({2})", _itemSource == null ? "??": _itemSource.getDisplayName(), _lt == null ? "??" : _lt.getDisplayName());
		}
		if (_gh != null) {
			from = NLS.bind("from group {0}({1}) {2}", new Object[] { _gh.getName(), ( _glt == null ? "??" : _glt.getDisplayName()), from});
		}
		return NLS.bind("New item of type {0} {1}", _destType == null ? "??" : _destType.getDisplayName(), from);
	}


	public void setDefaultName(String defaultShortNameAction) {
		_defaultName = defaultShortNameAction;
	}
	
	public String getDefaultName() {
		return _defaultName;
	}
	
}
