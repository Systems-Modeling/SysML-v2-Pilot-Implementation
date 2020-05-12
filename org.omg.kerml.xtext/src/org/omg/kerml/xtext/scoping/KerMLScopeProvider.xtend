/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018-2020 Model Driven Solutions, Inc.
 * Copyright (c) 2018,2019 California Institute of Technology/Jet Propulsion Laboratory
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Zoltan Kiss, IncQuery
 *  Balazs Grill, IncQuery
 *  Ed Seidewitz, MDS
 *  Miyako Wilson, JPL
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.scoping

import com.google.common.base.Predicates
import com.google.inject.Inject
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Generalization
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.Import
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.omg.sysml.lang.sysml.QueryPathExpression
import org.omg.sysml.lang.sysml.QueryPathStepExpression
import org.omg.sysml.lang.sysml.Conjugation
import org.omg.sysml.lang.sysml.Connector
import org.omg.sysml.lang.sysml.Subsetting

class KerMLScopeProvider extends AbstractKerMLScopeProvider {

	@Inject
	IGlobalScopeProvider globalScope

	// Used to record visited Memberships and Imports.
	Set<Element> visited = newHashSet
	
	def getVisited() {
		visited
	}
	
	def setVisited(Set<Element> visited) {
		this.visited = visited
	}
	
	def addVisited(Element element) {
		visited.add(element)
	}
	
	def removeVisited(Element element) {
		visited.remove(element)
	}
	
	override getScope(EObject context, EReference reference) {
		if (context instanceof Conjugation)
			context.conjugatedType.scope_owningNamespace(context, reference)
		else if (context instanceof Subsetting) {
		    var subsettingFeature = context.subsettingFeature
		    var owningType = subsettingFeature?.owningType
		    if (owningType instanceof QueryPathExpression) {
			    return subsettingFeature.scope_QueryPathExpression(owningType as QueryPathExpression, context, reference)
		    } else if (owningType instanceof Connector) {
		    	if (owningType.connectorEnd.contains(subsettingFeature)) {
		    		return owningType.scope_owningNamespace(context, reference)
		    	}
		    }
			subsettingFeature.scope_owningNamespace(context, reference)
		} else if (context instanceof Generalization)
			context.specific.scope_owningNamespace(context, reference)
		else if (context instanceof Membership) {
		    context.scope_Namespace(context.membershipOwningPackage, context, reference)
		} else if (context instanceof Import)
			context.scope_Namespace(context.importOwningPackage, context, reference)
		else if (context instanceof Package) 
			context.scopeFor(reference, null, true, false, null)
		else 
			super.getScope(context, reference)
	}
	
	def static Package getParentPackage(Element element) {
		EcoreUtil2.getContainerOfType(element.eContainer, Package)
	}
	
	def scope_owningNamespace(Element element, EObject context, EReference reference) {
		element.scope_Namespace(element?.parentPackage, context, reference)
	}

	def scope_Namespace(Element element, Package namespace, EObject context, EReference reference) {
		if (namespace === null)
			super.getScope(element, reference)		
		else 
			namespace.scopeFor(reference, element, true,
				reference == SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, 
				if (context instanceof Element) context else null)
	}

	def QueryPathExpression prevQueryPath(QueryPathStepExpression qps) {
		var ops = qps.operand
		if (ops.size() >= 2) {
			var op1 = ops.get(1)
			if (op1 instanceof QueryPathExpression) {
				return op1
			}
		}
		return null;
	}

	def QueryPathExpression prevQueryPath(QueryPathExpression qpe) {
		var oe = qpe.owner
		if (oe instanceof QueryPathStepExpression) {
			var ops = oe.operand
			if (ops.size() >= 2) {
				var op1 = ops.get(0);
				if (op1 == qpe) {
					return null;
				} else if (op1 instanceof QueryPathExpression) {
					return op1
				} else if (op1 instanceof QueryPathStepExpression) {
					return prevQueryPath(op1)
				}
			}
		}
		return null
	}

	def IScope scope_QueryPathExpression(Element element, QueryPathExpression qpe, EObject context, EReference reference) {
		var prev = prevQueryPath(qpe)
		if (prev !== null)
			element.scope_Namespace(prev.referent, context, reference)
		else 
			element.scope_Namespace(qpe, context, reference)
	}
	
	def IScope scopeFor(Package pack, EReference reference, Element element, boolean isFirstScope, boolean isRedefinition, Element skip) {
		val parent = pack.parentPackage
		val outerscope = 
			if (parent === null) { // Root Package
				 val global = globalScope.getScope(pack.eResource, reference, Predicates.alwaysTrue)
				 if (pack.name !== null) 
				 	// The root scope includes qualified names whose first segment is the name
				 	// of the root package.
				 	new KerMLRootScope(global, pack, reference.EReferenceType, this, element, skip)
				 else 
				 	global
			} else {
				parent.scopeFor(reference, element, false, false, skip)
			}		

		new KerMLScope(outerscope, pack, reference.EReferenceType, this, isFirstScope, isRedefinition, element, skip)
	}
	
}
