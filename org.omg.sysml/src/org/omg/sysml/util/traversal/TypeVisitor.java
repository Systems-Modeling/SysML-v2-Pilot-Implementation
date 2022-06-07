/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2020 Model Driven Solutions, Inc.
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
 *  Bjorn Cole
 * 
 *****************************************************************************/
package org.omg.sysml.util.traversal;

import java.util.ArrayList;
import java.util.UUID;

import org.omg.sysml.lang.sysml.Usage;
import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Package;
import org.omg.sysml.lang.sysml.impl.ElementImpl;
import org.omg.sysml.lang.sysml.impl.MembershipImpl;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;
import org.omg.sysml.util.traversal.facade.impl.BandedGraphProcessingFacade;

/**
 * This class implements a visitor to support gathering nested and banded Features
 *  
 * @author Ed Seidewitz
 *
 */
public class TypeVisitor extends ElementVisitor {
	
	/**
	 * The Element this visitor is visiting.
	 */
	private final Element element;
	
	/**
	 * The last element visited from the relationship incoming to this Element
	 */
	
	private final Element visitingFrom;
	
	/** 
	 * The traversal object used to record which Elements have already been visited.
	 */
	private final GeneralizationTraversal traversal;
	
	/**
	 * Create a visitor for the given Element, using the given traversal and facade objects.
	 * 
	 * @param 	element			the Element to be visited
	 * @param 	traversal		the traversal object the be used to record a visit
	 * @param 	facade			the facade to be used for Element processing
	 */
	public TypeVisitor(Element element, GeneralizationTraversal traversal) {
		super(element, traversal, null);
		this.element = element;
		this.traversal = traversal;
		this.visitingFrom = null;
	}
	
	public TypeVisitor(Element element, GeneralizationTraversal traversal, Element visitingFrom) {
		super(element, traversal, null);
		this.element = element;
		this.traversal = traversal;
		this.visitingFrom = visitingFrom;
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
	public GeneralizationTraversal getTraversal() {
		return ((GeneralizationTraversal) this.traversal);
	}
	
	/**
	 * Process the Element being visited and record with the traversal that the Element has been visited.
	 * Then visit each of the related Elements of the Element, if it is a Relationship, and all 
	 * Relationships owned by the Element.
	 * 
	 * @return	a unique identifier for the Element, to be used to avoid redundant processing of it
	 */
	public Object visit() {
		if (((GeneralizationTraversal) this.getTraversal()).getCurrentDebug().equals(GeneralizationTraversal.DebugLevel.TRACE)) {
			System.out.println("Visiting " + describeElement());
		}
		this.preProcess();
		Object identifier = this.process();
		this.getTraversal().putIdentifier(this.getElement(), identifier);
		// In post-process is where further graph navigation happens.
		this.postProcess();
		return identifier;
	}
	
	/**
	 * Pre-process the element being visited.
	 */
	protected void preProcess() {
		Element element = this.getElement();
	}
	
	/**
	 * Process the Element being visited using the Element-processing facade for this visitor.
	 * 
	 * @return	a unique identifier for the Element, to be used to avoid redundant processing of it
	 */
	protected Object process() {
		if (visitingFrom != null) {
			ArrayList<Element> visitingFromPath = this.getTraversal().getPathFor(visitingFrom);
			if (visitingFromPath == null) {
				boolean stopHere = true;
			}
			ArrayList<Element> newPath = new ArrayList<Element>(visitingFromPath);
			// only extend the path if this is a Type
			if (element instanceof Type) {
				newPath.add(element);
			}
			this.getTraversal().mapIntoPath(element, newPath);
		}
		return UUID.fromString(element.getIdentifier());
	}
	
	/**
	 * Post-process the Element being visited. Unless the Element is a library model Element, this
	 * includes at least visiting any related Elements of the Element, if it is a Relationship, and 
	 * all Relationships owned by it. Relationships are not traversed for library Elements.
	 */
	protected void postProcess() {
		for (Relationship relation : element.getOwnedRelationship()) {
			
			((GeneralizationTraversal) this.getTraversal()).visit(element, relation);
		}
	}
	
	/**
	 * Create a description of the given SysML model Element, for use in logging.
	 * 
	 * @param 	element				the Element to be described
	 * @return	a description of the Element, in terms of its EClass name, hash code, Element name 
	 * 			and whether it is a proxy.
	 */
	public String describeElement() {
		
		String s = "";
		
		s = element.eClass().getName() + ' ';
		
		String name = element.getName();
		if (name != null) {
			s += " (" + name + ")";
		}		
		if (element.eIsProxy()) {
			s += " PROXY";
		}
		
		return s + " " + element.getIdentifier();
	}

}
