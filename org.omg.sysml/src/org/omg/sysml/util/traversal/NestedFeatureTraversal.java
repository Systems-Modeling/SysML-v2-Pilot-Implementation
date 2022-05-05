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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.UUID;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;
import org.omg.sysml.util.traversal.facade.impl.BandedGraphProcessingFacade;

/**
 * Implement the traversal of a graph of SysML Elements in which non-Relationship Elements are
 * connected only by Relationship Elements.
 * 
 * @author Ed Seidewitz
 *
 */
public class NestedFeatureTraversal extends Traversal {
	
	public enum DebugLevel {
		INFO,
		TRACE,
		ERROR
	}
	
	public DebugLevel currentDebug = DebugLevel.TRACE;
	
	private HashMap<Element, ArrayList<Element>> pathToElement = new HashMap<Element, ArrayList<Element>>();
	
	public NestedFeatureTraversal() {
		super(null);
	}

	/**
	 * Create an Element visitor for the given element.
	 */
	@Override
	public NestedFeatureVisitor createVisitor(Element element) {
		return new NestedFeatureVisitor(element, this);
	}
	
	public NestedFeatureVisitor createVisitor(Element element, Element visitingFrom) {
		return new NestedFeatureVisitor(element, this, visitingFrom);
	}
	
	public BandedRelationshipVisitor createRelationshipVisitor(Relationship element, Element visitingFrom) {
		return new BandedRelationshipVisitor(element, this, visitingFrom);
	}
	
	/**
	 * Check whether the given Element has been visited previously. If so, then return
	 * that identifier without doing any processing. Otherwise, create a visitor and
	 * use it to visit the given Element.
	 * 
	 * @param 	element			the Element to be visited
	 * @return	the identifier to be used for that Element
	 */
	@Override
	public Object visit(Element element) {
		Object identifier = this.getIdentifier(element);
		return identifier != null? identifier:
				this.visit(this.createVisitor(element));
	}
	
	public Object visit(Element visitingFrom, Relationship relation) {
		Object identifier = this.getIdentifier(relation);
		if (identifier != null) {
			return identifier;
		}
		else {
			return this.visit(this.createRelationshipVisitor(relation, visitingFrom));
		}
	}
	
	/**
	 * Check whether the given Element has been visited previously. If so, then return
	 * that identifier without doing any processing. Otherwise, create a visitor and
	 * use it to visit the given Element.
	 * 
	 * @param 	element			the Element to be visited
	 * @return	the identifier to be used for that Element
	 */
	public Object visit(Element element, Element visitingFrom, Relationship relation) {
		Object identifier = this.getIdentifier(element);
			
		if (identifier != null) {
			return identifier;
		}
		else {
			return this.visit(this.createVisitor(element, visitingFrom));
		}
	}
	
	public String describePaths() {
		String description = "";
		for (ArrayList<Element> thisPath : pathToElement.values()) {
			description = description + "\nNext path:\n";
			for (Element el : thisPath) {
				description = description + BandedGraphProcessingFacade.descriptionOf(el) + ", ";
			}
		}
		return description;
	}
	
	public String writePathConstraint() {
		String description = "";
		for (Element pathKey : pathToElement.keySet()) {
			ArrayList<Element> thisPath = pathToElement.get(pathKey);
			int counter = 0;
			description = description + "\nNext constraint:\n";
			description = description + describeElement(pathKey) + " " + pathKey.getIdentifier() +  " : ";
			for (Element el : thisPath) {
				description = description + describeElement(el);
				if (counter < thisPath.size() - 1) {
					description = description +".";
				}
				counter++;
			}
			description = description + " != {Ø}";
		}
		
		return description;
	}
	
	/**
	 * Create a description of the given SysML model Element, for use in logging.
	 * 
	 * @param 	element				the Element to be described
	 * @return	a description of the Element, in terms of its EClass name, hash code, Element name 
	 * 			and whether it is a proxy.
	 */
	public String describeElement(Element element) {
		
		String s = "";
		String name = element.getName();
		if (name != null) {
			s += name;
		}
		else if (element instanceof Usage) {
			if (((Usage) element).getOwnedRedefinition().size() > 0) {
				s += " : > " + ((Usage) element).getOwnedRedefinition().get(0).getRedefinedFeature().getName();
			}
		}
		if (element.eIsProxy()) {
			s += " PROXY";
		}
		
		return s;
	}
	
	public void mapIntoPath(Element element, ArrayList<Element> workingPath) {
		pathToElement.put(element, workingPath);
	}
	
	public ArrayList<Element> getPathFor(Element element) {
		return pathToElement.get(element);
	}
	
	public void startNewPath(Element indexElement) {
		ArrayList<Element> selfList = new ArrayList<Element>();
		selfList.add(indexElement);
		pathToElement.put(indexElement, selfList);
	}
	
	public DebugLevel getCurrentDebug() {
		return this.currentDebug;
	}

}
