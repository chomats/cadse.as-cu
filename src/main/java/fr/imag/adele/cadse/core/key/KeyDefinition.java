/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core.key;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.INamed;
import fr.imag.adele.cadse.core.INamedUUID;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * 
 * @author chomats
 */
public interface KeyDefinition extends INamedUUID, INamed {

	public IAttributeType<?>[] getKeyElements();

	public KeyDefinition getParentKey();

	public Key computeKey(Key parentKey, Object... key_attributes) throws CadseException;

	public Key computeKey(Item item) throws CadseException;

	public void getQualifiedString(Key key, StringBuilder sb);

	public ItemType getItemType();

	public String getName(Key key);

    public int hashNameAttribute();
    
    public String convertName(String name);
}
