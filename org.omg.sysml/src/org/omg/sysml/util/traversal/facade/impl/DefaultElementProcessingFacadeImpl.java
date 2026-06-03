/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 * 
 * Contributors:
 *  Ed Seidewitz
 * 
 *****************************************************************************/
package org.omg.sysml.util.traversal.facade.impl;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;

/**
 * This is a default element processing facade that simply prints out a string representation of an Element
 * being processed and returns a hex-string representation of the object hash code to be used as an identifier.
 * 
 * @author Ed Seidewitz
 *
 */
public class DefaultElementProcessingFacadeImpl implements ElementProcessingFacade {
	
	/**
	 * The size of the indent to use.
	 */
	private int indentSize = 2;
	
	/**
	 * The current indent level.
	 */
	private int indentLevel = 0;
	
	/**
	 * Get the indent size.
	 * 
	 * @return the indent size.
	 */
	public int getIndentSize() {
		return this.indentSize;
	}
	
	/**
	 * Set the indent size (the default is 2).
	 * 
	 * @param 	indentSize		the number of spaces to indent on each level.
	 */
	public void setIndentSize(int indentSize) {
		this.indentSize = indentSize;
	}
	
	/**
	 * Get the current indent level.
	 * 
	 * @return the current indent level.
	 */
	public int getIndentLevel() {
		return this.indentLevel;
	}
	
	/**
	 * Get a string of spaces of length equal to the indent size times the indent level.
	 * 
	 * @return	the current indent string.
	 */
	public String getIndent() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < this.indentLevel * this.indentSize; i++) {
			s.append(" ");
		}
		return s.toString();
	}
	
	/**
	 * By default, print each formatted line to System.out. Override to redirect the output elsewhere.
	 * 
	 * @param 	line		the line to be printed.
	 */
	public void println(String line) {
		System.out.println(line);
	}
	
	public static String getId(Element element) {
		return Integer.toHexString(element.hashCode());
	}
	
	/**
	 * Print out a string representation of an Element, including its metaclass name, element name (if any), kind and
	 * hex-string identifier.
	 * 
	 * @param 	element		the element being processed.
	 * @return	a hex-string representation of the object hash code to be used as an identifier.
	 */
	@Override
	public void preProcess(Element element) {
		String name = element.getDeclaredName();
		String kind = element instanceof Relationship? "Relationship": "Element";
		String id = getId(element);
		this.println(this.getIndent() + element.eClass().getName() + (name == null? "": " " + name) + " (" + kind + "@" + id + ")");
		this.indentLevel++;
	}

	/* (non-Javadoc)
	 * @see org.omg.sysml.util.traversal.facade.ElementProcessingFacade#processElement(org.omg.sysml.lang.sysml.Element)
	 */
	@Override
	public String process(Element element) {
		return getId(element);
	}

	/* (non-Javadoc)
	 * @see org.omg.sysml.util.traversal.facade.ElementProcessingFacade#postprocess(org.omg.sysml.lang.sysml.Element)
	 */
	@Override
	public void postProcess(Element element) {
		this.indentLevel--;
	}

}
