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
package org.omg.sysml.util.traversal.facade;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Relationship;

/**
 * This interface defines the face for processing SysML Elements and Relationships.
 * 
 * @author Ed Seidewitz
 *
 */
public interface ElementProcessingFacade {

	/**
	 * Process the given Element, returning a unique identifier for that element.
	 * 
	 * @param 	element			the Element to be processed
	 * @return	a unique identifier for the processed Element
	 */
	Object processElement(Element element);
	
	/**
	 * Process the given Relationship, returning a unique identifier for that relationship.
	 * 
	 * @param 	relationship	the Relationship to be processed
	 * @return	a unique identifier for the processed Relationship
	 */
	Object processRelationship(Relationship relationship);
	
}
