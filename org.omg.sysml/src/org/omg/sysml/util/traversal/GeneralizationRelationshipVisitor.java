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
import org.omg.sysml.lang.sysml.ConjugatedPortTyping;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Specialization;
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
 * This class implements a visitor to support walking relationships in SysML v2 models
 *  
 * @author Ed Seidewitz
 *
 */
public class GeneralizationRelationshipVisitor extends ElementVisitor {
	
	/**
	 * The Element this visitor is visiting.
	 */
	private Relationship element;
	
	/**
	 * The Element on the other side of this relationship
	 */
	private Element lookAhead;
	
	/**
	 * The Element this visitor is visiting from.
	 */
	private final Element visitingFrom;
	
	/** 
	 * The traversal object used to record which Elements have already been visited.
	 */
	private final GeneralizationTraversal traversal;
	
	/**
	 * Flag for whether to traverse the relationship after processing is finished
	 */
	private boolean continueToNext = false;
	
	/**
	 * Create a visitor for the given Element, using the given traversal and facade objects.
	 * 
	 * @param 	element			the Element to be visited
	 * @param 	traversal		the traversal object the be used to record a visit
	 * @param 	visitingFrom the element from which this relationship is being reached
	 */
	public GeneralizationRelationshipVisitor(Relationship element, GeneralizationTraversal traversal, Element visitingFrom) {
		super(element, traversal, null);
		this.element = element;
		this.visitingFrom = visitingFrom;
		this.traversal = traversal;
		this.lookAhead = null;
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
		return this.traversal;
	}
	
	/**
	 * Process the Element being visited and record with the traversal that the Element has been visited.
	 * Then visit each of the related Elements of the Element, if it is a Relationship, and all 
	 * Relationships owned by the Element.
	 * 
	 * @return	a unique identifier for the Element, to be used to avoid redundant processing of it
	 */
	public Object visit() {
		// the support for depth-first style stack use should be around here.
		if (this.getTraversal().getCurrentDebug().equals(NestedFeatureTraversal.DebugLevel.TRACE)) {
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
		if (element.eClass().getName().equals("ConjugatedPortTyping") ) {
			System.out.println("At CPT issue");
		}
		// discover the next element
		for (Element relatedElement : element.getRelatedElement()) {
			if (element.getRelatedElement().size() > 2) {
				// TODO: throw an exception here
			}
			if (!relatedElement.equals(visitingFrom)) {
				// this seems to be ping-ponging back and forth rather than moving forward
				this.lookAhead = relatedElement;
			}
		}
		return UUID.fromString(element.getIdentifier());
	}
	
	/**
	 * Post-process the Element being visited. For relationships, this means navigating to the related element
	 */
	protected void postProcess() {
		// if the relationship is the correct metatype, navigate forward with breadcrumbs to extend the paths
		if (isPathRelationship(element)) {
			if (!lookAhead.eIsProxy()) {
				((GeneralizationTraversal) this.getTraversal()).startNewPath(lookAhead);
				this.getTraversal().visit(lookAhead, visitingFrom, element);
			}
		}
	}
	
	boolean isPathRelationship(Relationship relationToCheck) {
		if (relationToCheck instanceof Specialization) {
			return true;
		}
		return false;
	}
	
	/**
	 * Create a description of the given SysML model Element, for use in logging.
	 * 
	 * @param 	element				the Element to be described
	 * @return	a description of the Element, in terms of its EClass name, hash code, Element name 
	 * 			and whether it is a proxy.
	 */
	public String describeElement() {
		
		int counter = 0;
		String s = "";
		
		s = element.eClass().getName() + ' ';
		
		for (Element relatedElement : element.getRelatedElement()) {
			String name = relatedElement.getName();
			if (name != null) {
				s += " (" + name + ")";
			}		
			if (relatedElement.eIsProxy()) {
				s += " PROXY";
			}
			if (counter < element.getRelatedElement().size() - 1) {
				s+= " to ";
			}
			counter++;
		}
		
		return s + " " + element.getIdentifier();
	}

}
