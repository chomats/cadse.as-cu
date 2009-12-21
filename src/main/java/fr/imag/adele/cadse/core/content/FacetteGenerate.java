/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.imag.adele.cadse.core.content;

import java.util.Set;

import fr.imag.adele.cadse.core.GenContext;
import fr.imag.adele.cadse.core.GenStringBuilder;

/**
 * 
 * @author chomats
 */
public interface FacetteGenerate {

	/**
	 * Generates a string content represented by this item.
	 * 
	 * @param sb
	 *            string builder used to generate string content
	 * @param type
	 *            generation type
	 * @param kind
	 *            generation kind (multiple kinds per generation type)
	 * @param imports
	 *            set of imports used for the generation
	 * @param context
	 *            generation context which contains configuration properties
	 */
	public void generate(GenStringBuilder sb, String type, String kind, Set<String> imports, GenContext context);

	/**
	 * Generates string content represented by all children (destination items
	 * of outgoing part links) of the logical item associated to this item.
	 * 
	 * @param sb
	 *            string builder used to generate string content
	 * @param type
	 *            generation type
	 * @param kind
	 *            generation kind (multiple kinds per generation type)
	 * @param imports
	 *            set of imports used for the generation
	 * @param context
	 *            generation context which contains configuration properties
	 */
	public void generateParts(GenStringBuilder sb, String type, String kind, Set<String> imports, GenContext context);

	/**
	 * Generates string content represented by one child (destination item of
	 * one outgoing link of specified type) of the logical item associated to
	 * this item.
	 * 
	 * @param linkTypeName
	 *            link type name
	 * @param sb
	 *            string builder used to generate string content
	 * @param type
	 *            generation type
	 * @param kind
	 *            generation kind (multiple kinds per generation type)
	 * @param imports
	 *            set of imports used for the generation
	 * @param context
	 *            generation context which contains configuration properties
	 */
	public void generatePart(String linkTypeName, GenStringBuilder sb, String type, String kind, Set<String> imports,
			GenContext context);

	/**
	 * Generates string content represented by all children (destination items
	 * of outgoing links of specified type) of the logical item associated to
	 * this item.
	 * 
	 * @param linkTypeName
	 *            link type name
	 * @param sb
	 *            string builder used to generate string content
	 * @param type
	 *            generation type
	 * @param kind
	 *            generation kind (multiple kinds per generation type)
	 * @param imports
	 *            set of imports used for the generation
	 * @param context
	 *            generation context which contains configuration properties
	 */
	public void generateParts(String linkTypeName, GenStringBuilder sb, String type, String kind, Set<String> imports,
			GenContext context);

}
