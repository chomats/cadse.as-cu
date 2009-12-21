package fr.imag.adele.cadse.core.internal;

import fr.imag.adele.cadse.core.ItemType;

public interface ItemTypeInternal {

	public void setSuperType(ItemType it);

	public void addSubItemType(ItemType itemType);

	public void removeSubItemType(ItemType itemType);

	public void resetContributions();

	public void setCSTName(String cst);
	
	public Link addOutgoingLinkType(LinkType ret);
}
