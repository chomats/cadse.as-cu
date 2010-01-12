package fr.imag.adele.cadse.core;

import java.net.URL;

/**
 * Represents an anchor in a menu where sub menus and actions can be attached.
 * 
 * @author chomats
 */
final public class MenuGroup extends IMenuAction {

	/** The id. */
	private String	_id;

	/** The has separator. */
	private boolean	_hasSeparator;

	/**
	 * Creates a new menu group.
	 * 
	 * @param id group id which is used to refer to its group
	 * @param hasSeparator if true, a separator is added at before its group in the menu
	 */
	public MenuGroup(String id, boolean hasSeparator) {
		this._id = id;
		this._hasSeparator = hasSeparator;
	}

	/**
	 * Creates a new menu group.
	 * 
	 * @param id group id which is used to refer to its group
	 */
	public MenuGroup(String id) {
		this(id, true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getId()
	 */
	@Override
	public String getId() {
		return _id;
	}

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
		return _hasSeparator;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#isGroup()
	 */
	@Override
	public boolean isGroup() {
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Group " + _id + " sep " + _hasSeparator;
	}

}