package fr.imag.adele.cadse.core;

import java.net.URL;

/**
 * Represents a separator in a contextual menu.
 * 
 * @author chomats
 */
final public class Separator extends IMenuAction {

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getIcon()
	 */
	@Override
	public URL getImage() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getLabel()
	 */
	@Override
	public String getLabel() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#isSeparator()
	 */
	@Override
	public boolean isSeparator() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#run(fede.workspace.domain.IItemNode[])
	 */
	@Override
	public void run(IItemNode[] selection) throws CadseException {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getMenuPath()
	 */
	@Override
	public String getMenuPath() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getId()
	 */
	@Override
	public String getId() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#isGroup()
	 */
	@Override
	public boolean isGroup() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Action " + getLabel();
	}

}