package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.transaction.LogicalWorkspaceTransaction;
import fr.imag.adele.cadse.core.ui.view.FilterContext;
import fr.imag.adele.cadse.core.ui.view.IContextReference;

public interface Pages extends IPageObject, IContextReference {

	/**
	 * Gets the page.
	 * 
	 * @param index
	 *            the index
	 * 
	 * @return the page
	 */
	abstract IPage getPage(int index);

	/**
	 * Gets the pages.
	 * 
	 * @return the pages
	 */
	abstract IPage[] getPages();

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.IPageObject#getParent()
	 */
	abstract IPageObject getParent();

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.IPageObject#putLocal(java.lang.String,
	 *      java.lang.Object)
	 */
	abstract void putLocal(String key, Object value);

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.IPageObject#getLocal(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	abstract <T> T getLocal(String key);

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.IPageObject#getLocal(java.lang.String,
	 *      java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	abstract <T> T getLocal(String key, T d);

	/**
	 * Gets the field.
	 * 
	 * @param pageid
	 *            the pageid
	 * @param keyPath
	 *            the key path
	 * 
	 * @return the field
	 */
	abstract UIField getField(String pageid, String... keyPath);

	/**
	 * Gets the page.
	 * 
	 * @param pageid
	 *            the pageid
	 * 
	 * @return the page
	 */
	abstract IPage getPage(String pageid);

	/**
	 * Update field.
	 * 
	 * @param pageid
	 *            the pageid
	 * @param keyPath
	 *            the key path
	 */
	abstract void updateField(String pageid, String... keyPath);

	/**
	 * Inits the local.
	 * 
	 * @param pageController
	 *            the page controller
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	abstract void initLocal(IPageController pageController) throws CadseException;

	/**
	 * Inits the.
	 * 
	 * @param pageController
	 *            the page controller
	 * 
	 * @throws CadseException
	 *             the melusine exception
	 */
	abstract void init(IPageController pageController) throws CadseException;

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.IPageObject#getPageController()
	 */
	abstract IPageController getPageController();

	/**
	 * Dispose.
	 */
	abstract void dispose();

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.IPageObject#getField(java.lang.String)
	 */
	abstract UIField getField(String fieldid);

	/**
	 * Do finish.
	 * 
	 * @param monitor
	 *            the monitor
	 * 
	 * @throws Exception
	 *             the exception
	 */
	abstract void doFinish(Object monitor) throws Exception;

	abstract void doCancel(Object monitor);

	/**
	 * Size.
	 * 
	 * @return the int
	 */
	abstract int size();

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.IPageObject#get(java.lang.String)
	 */
	abstract <T> T get(String key);

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.IPageObject#get(java.lang.String,
	 *      java.lang.Object)
	 */
	abstract <T> T get(String key, T d);

	/**
	 * Validate fields.
	 * 
	 * @param currentField
	 *            the current field
	 * @param currentPage
	 *            the current page
	 * 
	 * @return true if error
	 */
	abstract boolean validateFields(UIField currentField, IPage currentPage);

	abstract LogicalWorkspaceTransaction getCopy();

	abstract boolean runCreationPage();

	/**
	 * Do next page action.
	 * 
	 * @param monitor
	 *            the monitor
	 * @param pages
	 *            the pages
	 * @param currentPage
	 *            the current page
	 * 
	 * @throws Exception
	 *             the exception
	 */
	abstract void doNextPageAction(Object monitor, int currentPage) throws Exception;

	/**
	 * Do prev page action.
	 * 
	 * @param monitor
	 *            the monitor
	 * @param pages
	 *            the pages
	 * @param currentPage
	 *            the current page
	 * 
	 * @throws Exception
	 *             the exception
	 */
	abstract void doPrevPageAction(Object monitor, int currentPage) throws Exception;

	/**
	 * Gets the next page index.
	 * 
	 * @param pages
	 *            the pages
	 * @param currentPage
	 *            the current page
	 * 
	 * @return the next page index
	 * 
	 * @throws Exception
	 *             the exception
	 */
	abstract int getNextPageIndex(int currentPage) throws Exception;

	/**
	 * Gets the prev page index.
	 * 
	 * @param pages
	 *            the pages
	 * @param currentPage
	 *            the current page
	 * 
	 * @return the prev page index
	 * 
	 * @throws Exception
	 *             the exception
	 */
	abstract int getPrevPageIndex(int currentPage) throws Exception;

	abstract Item getItem();

	abstract void setItem(String it, Item item);

	abstract void setItem(Item item);

	abstract ItemType getParentItemType();

	abstract void setFilterContext(FilterContext filterContext);

	abstract FilterContext getFilterContext();

}