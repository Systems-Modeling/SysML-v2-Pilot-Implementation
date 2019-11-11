/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018, 2019 Model Driven Solutions, Inc.
 * Copyright (c) 2018, 2019 California Institute of Technology/Jet Propulsion Laboratory
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
package org.omg.sysml.scoping

import com.google.common.base.Predicates
import com.google.inject.Inject
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.FeatureTyping
import org.omg.sysml.lang.sysml.Generalization
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.Redefinition
import org.omg.sysml.lang.sysml.Subsetting
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.Import
import org.omg.sysml.lang.sysml.QueryPathExpression
import org.omg.sysml.lang.sysml.QueryPathStepExpression

class AlfScopeProvider extends AbstractAlfScopeProvider {

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
		switch (reference) {
			case SysMLPackage.eINSTANCE.featureTyping_Type: {
				if (context instanceof FeatureTyping)
					return context.typedFeature.scope_owningNamespace(reference)
			}
			case SysMLPackage.eINSTANCE.generalization_General, 
			case SysMLPackage.eINSTANCE.superclassing_Superclass: {
				if (context instanceof Generalization)
					return context.specific.scope_owningNamespace(reference)
			}
			case SysMLPackage.eINSTANCE.redefinition_RedefinedFeature: {
				if (context instanceof Redefinition)
					return context.redefiningFeature.scope_owningNamespace(reference)
			}
			case SysMLPackage.eINSTANCE.subsetting_SubsettedFeature: {
				if (context instanceof Subsetting)
					return context.subsettingFeature.scope_owningNamespace(reference)
			}
			case SysMLPackage.eINSTANCE.membership_MemberElement, 
			case SysMLPackage.eINSTANCE.featureMembership_MemberFeature,
			case SysMLPackage.eINSTANCE.parameterMembership_MemberParameter: {
				if (context instanceof Membership) {
				    var owningPackage = context.membershipOwningPackage
        		    if (owningPackage instanceof QueryPathExpression) {
					    return context.scope_QueryPathExpression(owningPackage as QueryPathExpression, reference)
        		    } 
				    return context.scope_Namespace(owningPackage, reference)
                  }
			}
			case SysMLPackage.eINSTANCE.import_ImportedPackage: {
				if (context instanceof Import) {
					return context.scope_Namespace(context.importOwningPackage, reference)
				}
			}
		}
		return
			if (context instanceof Package) 
				context.alfScope(context, reference)
			else 
				super.getScope(context, reference)		
	}
	
	def static Package getParentPackage(Element element) {
		EcoreUtil2.getContainerOfType(element.eContainer, Package)
	}
	
	def scope_owningNamespace(Element element, EReference reference) {
		element.scope_Namespace(element?.parentPackage, reference)
	}

	def scope_Namespace(Element element, Package namespace, EReference reference) {
		if (namespace === null)
			super.getScope(element, reference)		
		else 
			namespace.alfScope(element, reference)
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

	def IScope scope_QueryPathExpression(Element element, QueryPathExpression qpe, EReference reference) {
		var prev = prevQueryPath(qpe);
		if (prev !== null) {
			return scope_Namespace(element, prev.referent, reference);
		} else {
			return scope_Namespace(element, qpe, reference)
		}
	}
	
	def IScope alfScope(Package pack, Element element, EReference reference) {
		val parent = pack.parentPackage
		val outerscope = 
			if (parent === null) { // Root Package
				 val global = globalScope.getScope(pack.eResource, reference, Predicates.alwaysTrue)
				 if (pack.name !== null) 
				 	// The root scope includes qualified names whose first segment is the name
				 	// of the root package.
				 	new AlfRootScope(global, pack, reference, this)
				 else 
				 	global
			} else {
				parent.alfScope(element, reference)
			}		

		new AlfScope(outerscope, pack, reference, this)
	}
	
}
