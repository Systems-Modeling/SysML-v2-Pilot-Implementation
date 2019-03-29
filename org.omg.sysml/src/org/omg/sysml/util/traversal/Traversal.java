/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Ed Seidewitz
 * 
 *****************************************************************************/
package org.omg.sysml.util.traversal;

import org.omg.sysml.lang.sysml.Element;

/**
 * This interface is used to traverse a graph of SysML Elements. An Element can be
 * visited in order to carry out some processing and given an identifier in order
 * to record that it has already been visited.
 * 
 * @author Ed Seidewitz
 *
 */
public interface Traversal {

	/**
	 * Get the identifier corresponding to the given Element (if any).
	 * 
	 * @param 	element			the Element to be identified
	 * @return	the identifier for the given Element, or null if none has been recorded
	 */
	public Object getIdentifier(Element element);
	
	/**
	 * Record an identifier for the given Element.
	 * 
	 * @param 	element			the Element to be identified
	 * @param 	identifier		the identifier to be used for the given Element
	 */
	public void putIdentifier(Element element, Object identifier);
	
	/**
	 * Visit the given element and carry out any appropriate processing.
	 * 
	 * @param 	element			the Element to be visited
	 * @return	the identifier to be used for that Element
	 */
	public Object visit(Element element);
	
	/**
	 * Reset the Traversal object so that it can be used for a new traversal. At a minimum,
	 * all Element identifier associations are removed.
	 */
	public void reset();
	
}
