/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2022 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.impl.ElementImpl;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;

/**
 * This class implements a generic visitor for any kind of SysML v2 model Element.
 *  
 * @author Ed Seidewitz
 *
 */
public class ElementVisitor {
	
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
	public ElementVisitor(Element element, Traversal traversal, ElementProcessingFacade facade) {
		this.element = element;
		this.traversal = traversal;
		this.facade = facade;
	}

	/**
	 * Get the Element this visitor is visiting.
	 * 
	 * @return	the Element is Element visitor is visiting
	 */
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
	 * Get the facade for this visitor.
	 * 
	 * @return	the facade for this visitor
	 */
	public ElementProcessingFacade getFacade() {
		return this.facade;
	}

	/**
	 * Process the Element being visited and record with the traversal that the Element has been visited.
	 * Then visit each of the related Elements of the Element, if it is a Relationship, and all 
	 * Relationships owned by the Element.
	 * 
	 * @return	a unique identifier for the Element, to be used to avoid redundant processing of it
	 */
	public Object visit() {
		this.preProcess();
		Object identifier = this.process();
		this.getTraversal().putIdentifier(this.getElement(), identifier);
		this.postProcess();
		return identifier;
	}
	
	/**
	 * Pre-process the element being visited.
	 */
	protected void preProcess() {
		Element element = this.getElement();
		this.getFacade().preProcess(element);
	}
	
	/**
	 * Process the Element being visited using the Element-processing facade for this visitor.
	 * 
	 * @return	a unique identifier for the Element, to be used to avoid redundant processing of it
	 */
	protected Object process() {
		return this.getFacade().process(this.getElement());		
	}
	
	/**
	 * Post-process the Element being visited. Unless the Element is a library model Element, this
	 * includes at least visiting any related Elements of the Element, if it is a Relationship, and 
	 * all Relationships owned by it. Relationships are not traversed for library Elements.
	 */
	protected void postProcess() {
		Element element = this.getElement();
		if (!ElementUtil.isStandardLibraryElement(element)) {
			Traversal traversal = this.getTraversal();
			if (element instanceof Relationship) {
				for (Element relatedElement: ((Relationship)element).getRelatedElement()) {
					traversal.visit(relatedElement);
				}
			}
			for (Relationship relationship: ((ElementImpl)element).getOwnedRelationship()) {
				traversal.visit(relationship);
			}
		}
		this.getFacade().postProcess(element);
	}

}
