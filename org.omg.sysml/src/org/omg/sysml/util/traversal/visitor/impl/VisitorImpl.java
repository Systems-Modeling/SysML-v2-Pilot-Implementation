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
import org.omg.sysml.lang.sysml.impl.ElementImpl;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;
import org.omg.sysml.util.traversal.visitor.ElementVisitor;

/**
 * This is an abstract base class that provides the general framework for the implementation of visitors for
 * specific kinds of Elements.
 *  
 * @author Ed Seidewitz
 *
 */
public abstract class VisitorImpl implements ElementVisitor {
	
	/**
	 * The Element this visitor is visiting.
	 */
	private final Element element;
	
	/** 
	 * The traversal object used to record which Elements have already been visited.
	 */
	private final Traversal traversal;
	
	/**
	 * The Element-processing facade being used by this visitor.
	 */
	private final ElementProcessingFacade facade;
	
	/**
	 * Create a visitor for the given Element, using the given traversal and facade objects.
	 * 
	 * @param 	element			the Element to be visited
	 * @param 	traversal		the traversal object the be used to record a visit
	 * @param 	facade			the facade to be used for Element processing
	 */
	public VisitorImpl(Element element, Traversal traversal, ElementProcessingFacade facade) {
		this.element = element;
		this.traversal = traversal;
		this.facade = facade;
	}

	/**
	 * Get the Element this visitor is visiting.
	 * 
	 * @return	the Element is Element visitor is visiting
	 */
	@Override
	public Element getElement() {
		return this.element;
	}
	
	/**
	 * Get the traversal for this visitor.
	 * 
	 * @return	the traversal for this visitor
	 */
	public Traversal getTraversal() {
		return this.traversal;
	}
	
	/**
	 * The facade for this visitor.
	 * 
	 * @return	the facade for this visitor
	 */
	public ElementProcessingFacade getFacade() {
		return this.facade;
	}

	/**
	 * Process the Element being visited and record with the traversal that the Element has been visited.
	 * Then visit each of the Relationships owned by the Element.
	 * 
	 * @return	a unique identifier for the Element, to be used to avoid redundant processing of it
	 */
	@Override
	public Object visit() {
		this.preProcess();
		Object identifier = this.process();
		Element element = this.getElement();
		Traversal traversal = this.getTraversal();
		traversal.putIdentifier(element, identifier);
		for (Relationship relationship: ((ElementImpl)element).getOwnedRelationship()) {
			traversal.visit(relationship);
		}
		this.postProcess();
		return identifier;
	}
	
	/**
	 * Pre-process the element being visited.
	 */
	protected void preProcess() {
		this.getFacade().preProcess(this.getElement());
	}
	
	/**
	 * Process the Element being visited. This method is to be defined by subclasses.
	 * 
	 * @return	a unique identifier for the Element, to be used to avoid redundant processing of it
	 */
	protected abstract Object process();
	
	/**
	 * Post-process the Element being visited.
	 */
	protected void postProcess() {
		this.getFacade().postProcess(this.getElement());
	}

}
