package fr.imag.adele.cadse.core.delta;

import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.util.OrderWay;

public interface OrderOperation extends WLWCOperation {

	public static final int	KIND_BEFORE	= 2;
	public static final int	KIND_AFTER	= 3;

	OrderWay getKind();

	LinkDelta getFrom();

	LinkDelta getTo();

	LinkType getLinkType();

}