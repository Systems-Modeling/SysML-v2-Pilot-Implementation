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
import java.util.HashSet

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class AlfScopeProvider extends AbstractAlfScopeProvider {

	@Inject
	var IGlobalScopeProvider globalScope

	var Set<Membership> visitedMemberships = newHashSet
	
	def getVisitedMemberships() {
		visitedMemberships
	}
	
	def setVisitedMemberships(Set<Membership> visitedMemberships) {
		this.visitedMemberships = visitedMemberships
	}
	
	override getScope(EObject context, EReference reference) {
		switch (reference) {
			case SysMLPackage.eINSTANCE.featureTyping_Type: {
				if (context instanceof FeatureTyping)
					return scope_FeatureTyping_type(context as FeatureTyping, reference)
			}
			case SysMLPackage.eINSTANCE.generalization_General, 
			case SysMLPackage.eINSTANCE.superclassing_Superclass: {
				if (context instanceof Generalization)
					return scope_Generalization_general(context as Generalization, reference)
			}
			case SysMLPackage.eINSTANCE.redefinition_RedefinedFeature: {
				if (context instanceof Redefinition)
					return scope_Redefinition_redefinedFeature(context as Redefinition, reference)
			}
			case SysMLPackage.eINSTANCE.subsetting_SubsettedFeature: {
				if (context instanceof Subsetting)
					return scope_Subsetting_subsettedFeature(context as Subsetting, reference)
			}
			case SysMLPackage.eINSTANCE.membership_MemberElement, 
			case SysMLPackage.eINSTANCE.featureMembership_MemberFeature,
			case SysMLPackage.eINSTANCE.parameterMembership_MemberParameter: {
				if (context instanceof Membership)
					return scope_Membership_memberElement(context as Membership, reference)
			}
		}
		return if (context instanceof Package) 
			context.alfScope(context, reference)
		else 
			super.getScope(context, reference)
	}
	
	private def Package getParentPackage(Element element) {
		EcoreUtil2.getContainerOfType(element.eContainer, Package)
	}
	
	def IScope scope_Namespace(Element element, Package namespace, EReference reference) {
		if (namespace === null)
			return super.getScope(element, reference)		
		return namespace.alfScope(element, reference)
	}
	
	def IScope scope_owningNamespace(Element element, EReference reference) {
		return scope_Namespace(element, element?.parentPackage, reference)
	}

	def IScope scope_FeatureTyping_type(FeatureTyping featureTyping, EReference reference) {
		return scope_owningNamespace(featureTyping.typedFeature, reference)
	}

	def IScope scope_Generalization_general(Generalization generalization, EReference reference) {
		return scope_owningNamespace(generalization.specific, reference)
	}

	def IScope scope_Redefinition_redefinedFeature(Redefinition redefinition, EReference reference) {
		return scope_owningNamespace(redefinition.redefiningFeature, reference)
	}

	def IScope scope_Subsetting_subsettedFeature(Subsetting subset, EReference reference) {
		return scope_owningNamespace(subset.subsettingFeature, reference)
	}
	
	def IScope scope_Membership_memberElement(Membership membership, EReference reference) {
		val scope = scope_Namespace(membership, membership.membershipOwningPackage, reference)
		return scope
	}
	
	def IScope alfScope(Package pack, Element element, EReference reference) {
		val outerscope = if ( /* Root package */ pack.eContainer === null) {
			globalScope.getScope(pack.eResource, reference, Predicates.alwaysTrue)
		} else {
			pack.parentPackage.alfScope(element, reference)
		}		

		val memberships = new HashSet(visitedMemberships)
		if (element instanceof Membership) {
			memberships.add(element)
		}
			
		return new AlfScope(outerscope, pack, reference, memberships, this)
	}
	
}
