package fr.imag.adele.cadse.core.internal;

import java.util.List;
import java.util.Map;

import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.ui.IPage;
import fr.imag.adele.cadse.core.ui.IPageFactory;

public interface ItemTypeInternal {

	public void setSuperType(ItemType it);
	
	
	public void addSubItemType(ItemType itemType);
	
	public void removeSubItemType(ItemType itemType);
	public void resetModificationPages();
	public void resetCreationPages();
	public void resetIncomingLinkType();
	public void resetContributions();
	
	public void resetOutgoingLinkType();
	
	public void recurcifComputeGoodCreationPage(List<IPage> list);

	public void setCSTName(String cst);
	
	public Link addOutgoingLinkType(LinkType ret);
}
