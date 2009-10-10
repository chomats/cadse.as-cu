package fr.imag.adele.cadse.core.ui;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.ui.view.IContextReference;

/**
 * The Class IPage. Represente une page graphique. Elle contient UIField,
 * eventuellement une action page
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public interface IPage extends Item, IEventListener, IPageObject, IValidateContributor, IContextReference {

	public static final UIField[]	EMPTY_UIFIELD	= new UIField[0];

	/**
	 * Gets the fields.
	 * 
	 * @return the fields
	 */
	abstract UIField[] getFields();

	abstract void addLast(UIField... field);

	abstract void addUIListner(UIListener l);

	abstract void addBefore(String key, UIField field);

	abstract void addAfter(String key, UIField field);

	/**
	 * Gets the action page.
	 * 
	 * @return the action page
	 */
	abstract IActionPage getActionPage();

	/**
	 * Gets the h span.
	 * 
	 * @return the h span
	 */
	abstract int getHSpan();

	/**
	 * Gets the label.
	 * 
	 * @return the label
	 */
	abstract String getLabel();

	/**
	 * Gets the field.
	 * 
	 * @param keyPath
	 *            the key path
	 * 
	 * @return the field
	 */
	abstract UIField getField(String... keyPath);

	/**
	 * Gets the pages.
	 * 
	 * @return the pages
	 */
	abstract Pages getPages();

	/*
	 * (non-Javadoc)
	 * 
	 * @see fede.workspace.domain.ui.IPageObject#getField(java.lang.String)
	 */
	abstract UIField getField(String fieldid);

	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	abstract String getTitle();

	/**
	 * Gets the description.
	 * 
	 * @return the description
	 */
	abstract String getDescription();

	/**
	 * Checks if is page complete.
	 * 
	 * @return true, if is page complete
	 */
	abstract boolean isPageComplete();

	/**
	 * Reset visual value. and set UI_running at true
	 */
	abstract void resetVisualValue();

	/**
	 * Dispose. (stop running)
	 */
	abstract void dispose();

	/**
	 * Gets the context.
	 * 
	 * @return the context
	 */
	abstract Object getContext();

	abstract ItemType getParentItemType();

	abstract boolean isModificationPage();

	abstract boolean isLast(UIField field);

	abstract boolean isFirst(UIField field);

	/**
	 * Sets the message error.
	 * 
	 * @param msg
	 *            the new message error
	 */
	abstract void setMessageError(String msg);

	/**
	 * Sets the message error.
	 * 
	 * @param msg
	 *            the new message error
	 */
	abstract void setMessageWarning(String msg);

	/**
	 * Sets the message error.
	 * 
	 * @param msg
	 *            the new message error
	 */
	abstract void setMessageInfo(String msg);

	public boolean validateFields(UIField currentField);

	abstract void initAfterUI();

	abstract void setPages(Pages pages);

	abstract void init(IPageController pageController) throws CadseException;

	abstract boolean runCreationPage();

	abstract void setItem(Item item);

	abstract boolean isEmpty();
}