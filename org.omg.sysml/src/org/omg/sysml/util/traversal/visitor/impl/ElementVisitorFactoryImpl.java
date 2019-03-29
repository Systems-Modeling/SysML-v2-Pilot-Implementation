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
package org.omg.sysml.util.traversal.visitor.impl;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;
import org.omg.sysml.util.traversal.visitor.ElementVisitor;
import org.omg.sysml.util.traversal.visitor.ElementVisitorFactory;

/**
 * A factory for creating Element visitors that process Elements and Relationships using 
 * a specific Element-processing facade.
 * 
 * @author Ed Seidewitz
 *
 */
public class ElementVisitorFactoryImpl implements ElementVisitorFactory {
	
	/**
	 * The traversal object used to record what Elements have already been visited.
	 */
	private Traversal traversal;
	
	/**
	 * The facade used for processing Elements and Relationships.
	 */
	private final ElementProcessingFacade facade;
	
	/**
	 * Create a factory for Element visitors using the given Element-processing facade.
	 * 
	 * @param 	facade			the Element-processing facade to be used
	 */
	public ElementVisitorFactoryImpl(ElementProcessingFacade facade) {
		this.facade = facade;
	}
	
	/**
	 * Get the current traversal object.
	 * 
	 * @return	the current traversal object
	 */
	public Traversal getTraversal() { 
		return this.traversal;
	}
	
	/**
	 * Set the current traversal object.
	 * 
	 * @param 	traversal		the traversal object to be used
	 */
	public void setTraversal(Traversal traversal) {
		this.traversal = traversal;
	}
	
	/**
	 * Get the facade being used by the Element visitors created by this factory.
	 * 
	 * @return	the Element-processing facade
	 */
	public ElementProcessingFacade getFacade() {
		return this.facade;
	}
	
	/**
	 * Create an Element visitor for the given element. If the Element is a Relationship, then a specialized
	 * Relationship visitor is created. Otherwise, a generic Element visitor is created.
	 */
	@Override
	public ElementVisitor createVisitor(Element element) {
		return element instanceof Relationship? 
				new RelationshipVisitorImpl((Relationship)element, this.getTraversal(), this.getFacade()): 
					new ElementVisitorImpl(element, this.getTraversal(), this.getFacade());
	}

}
