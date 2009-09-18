package fr.imag.adele.cadse.core;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Represents a contextual menu action.
 * 
 * @author chomats
 */
public class Menu extends IMenuAction {

	/** The id. */
	private String				id;

	/** The children. */
	private List<IMenuAction>	children;

	/** The label. */
	private String				label;

	/** The icon. */
	private URL					icon;

	/**
	 * Instantiates a new menu.
	 * 
	 * @param id
	 *            the id
	 * @param label
	 *            the label
	 * @param icon
	 *            the icon
	 * @param children
	 *            the children
	 */
	public Menu(String id, String label, URL icon, List<IMenuAction> children) {
		this.id = id;
		this.children = children;
		this.label = label;
		this.icon = icon;
	}

	/**
	 * Instantiates a new menu.
	 * 
	 * @param id
	 *            the id
	 * @param label
	 *            the label
	 * @param icon
	 *            the icon
	 */
	public Menu(String id, String label, URL icon) {
		this.id = id;
		this.children = new ArrayList<IMenuAction>();
		this.label = label;
		this.icon = icon;
	}

	/**
	 * Instantiates a new menu.
	 */
	public Menu() {
		this.id = null;
		this.children = new ArrayList<IMenuAction>();
		this.label = null;
		this.icon = null;
	}

	/**
	 * Instantiates a new menu.
	 * 
	 * @param id
	 *            the id
	 * @param label
	 *            the label
	 * @param icon
	 *            the icon
	 * @param children
	 *            the children
	 */
	public Menu(String id, String label, URL icon, IMenuAction[] children) {
		this.id = id;
		this.children = new ArrayList(Arrays.asList(children));
		this.label = label;
		this.icon = icon;
	}

	public void clear() {
		this.children.clear();
	}

	/**
	 * Adds the to group.
	 * 
	 * @param groupName
	 *            the group name
	 * @param item
	 *            the item
	 * @param append
	 *            the append
	 */
	public void addToGroup(String groupName, IMenuAction item, boolean append) {
		int i;
		Iterator items = children.iterator();
		for (i = 0; items.hasNext(); i++) {
			IMenuAction o = (IMenuAction) items.next();
			if (o.isGroup()) {
				String id = o.getId();
				if (id != null && id.equalsIgnoreCase(groupName)) {
					i++;
					if (append) {
						for (; items.hasNext(); i++) {
							IMenuAction ci = (IMenuAction) items.next();
							if (ci.isGroup()) {
								break;
							}
						}
					}

					children.add(i, item);
					return;
				}
			}
		}
		throw new IllegalArgumentException("Group not found: " + groupName);//$NON-NLS-1$
	}

	/**
	 * Insert.
	 * 
	 * @param path
	 *            the path
	 * @param a
	 *            the a
	 * @param append
	 *            the append
	 */
	public void insert(String path, IMenuAction a, boolean append) {
		List<IMenuAction> l = getList();
		if (path == null) {
			if (append) {
				l.add(a);
			} else {
				l.add(0, a);
			}
			return;
		}
		int separator = path.indexOf('/');
		String id;
		String rest = null;
		if (separator != -1) {
			id = path.substring(0, separator);
			rest = path.substring(separator + 1);
		} else {
			id = path;
		}

		IMenuAction fa = find(id);
		if (fa == null) {
			return;
		}

		if (fa instanceof Menu) {
			((Menu) fa).insert(rest, a, append);
			return;
		} else if (fa.isGroup()) {
			addToGroup(id, a, append);
		}

	}

	/*
	 * (non-Javadoc) Method declared on IContributionManager.
	 */
	/**
	 * Find.
	 * 
	 * @param id
	 *            the id
	 * 
	 * @return the i menu action
	 */
	public IMenuAction find(String id) {
		Iterator e = children.iterator();
		while (e.hasNext()) {
			IMenuAction item = (IMenuAction) e.next();
			String itemId = item.getId();
			if (itemId != null && itemId.equalsIgnoreCase(id)) {
				return item;
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getIcon()
	 */
	@Override
	public URL getImage() {
		return icon;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getLabel()
	 */
	@Override
	public String getLabel() {
		return label;
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
		return id;
	}

	/**
	 * Gets the list.
	 * 
	 * @return the list
	 */
	public List<IMenuAction> getList() {
		return children;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#isMenu()
	 */
	@Override
	public boolean isMenu() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.IMenuAction#getChildren()
	 */
	@Override
	public IMenuAction[] getChildren() {
		return (children).toArray(new IMenuAction[(children).size()]);
	}

	/**
	 * To string.
	 * 
	 * @param sb
	 *            the sb
	 * @param tab
	 *            the tab
	 */
	public void toString(StringBuilder sb, String tab) {
		sb.append(tab).append("Menu ");
		if (getLabel() != null) {
			sb.append(getLabel());
		}
		sb.append("\n");
		tab = tab + " ";
		for (IMenuAction ma : children) {
			if (ma instanceof Menu) {
				((Menu) ma).toString(sb, tab);
			} else {
				sb.append(tab).append(ma.toString()).append("\n");
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, "");
		return sb.toString();
	}

}