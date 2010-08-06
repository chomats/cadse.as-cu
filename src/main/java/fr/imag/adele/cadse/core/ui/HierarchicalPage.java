package fr.imag.adele.cadse.core.ui;

public interface HierarchicalPage extends IPage {

	IPage[] getBlocks();

	IPage insertNewBloc(String displayName);

	boolean isGroupPage();
}
