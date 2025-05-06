/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018-2022, 2024 Model Driven Solutions, Inc.
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
 *  Laszlo Gati, MDS
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.scoping

import com.google.common.base.Predicates
import com.google.inject.Inject
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.Conjugation
import org.omg.sysml.lang.sysml.Connector
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.FeatureChaining
import org.omg.sysml.lang.sysml.Import
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.Namespace
import org.omg.sysml.lang.sysml.ReferenceSubsetting
import org.omg.sysml.lang.sysml.Specialization
import org.omg.sysml.lang.sysml.Subsetting
import org.omg.sysml.util.NamespaceUtil
import org.omg.sysml.lang.sysml.FeatureTyping
import org.omg.kerml.xtext.library.LibraryNamespaces

class KerMLScopeProvider extends AbstractKerMLScopeProvider {

	@Inject
	IGlobalScopeProvider globalScope
	
	@Inject
	LibraryNamespaces libraryNamespaces

	def getLibraryNamespaces(){
	    libraryNamespaces
	}
	
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
			(context.eContainer as Element).scope_owningNamespace(context, reference)
		else if (context instanceof ReferenceSubsetting) {
		    var referencingFeature = context.referencingFeature
		    var owningType = referencingFeature?.owningType
			if (referencingFeature.isEnd && owningType instanceof Connector)
		    	owningType.scope_owningNamespace(context, reference)
		    else
				(context.eContainer as Element).scope_owningNamespace(context, reference)
		} else if (context instanceof FeatureTyping)
			(context.eContainer as Element).scope_nonExpressionNamespace(context, reference)
		else if (context instanceof Specialization)
			(context.eContainer as Element).scope_owningNamespace(context, reference)
		else if (context instanceof FeatureChaining)
			context.scope_featureChaining(reference)
		else if (context instanceof Membership)
	    	context.scope_relativeNamespace(context.membershipOwningNamespace, context, reference)
		else if (context instanceof Import)
			context.scope_Namespace(context.importOwningNamespace, context, reference, true)
		else if (context instanceof Namespace) 
			context.scopeFor(reference, null, true, true, false, null)
		else if (context instanceof Element)
			context.scope_owningNamespace(context, reference)
		else
			super.getScope(context, reference)
	}
	
	def scope_featureChaining(FeatureChaining ch, EReference reference) {
		var featureChained = ch.featureChained
		val ownedFeatureChainings = featureChained.ownedFeatureChaining
		val i = ownedFeatureChainings.indexOf(ch)
		if (i <= 0) {
			val owningRelationship = featureChained.owningRelationship
			var owningNamespace = featureChained?.owningNamespace
			if (owningRelationship instanceof Subsetting) {
				featureChained = owningRelationship.subsettingFeature
				owningNamespace = featureChained?.owningNamespace
				if (owningNamespace instanceof Connector && owningRelationship instanceof ReferenceSubsetting) {
			    	featureChained = owningNamespace as Connector
			    }
			}
			featureChained.scope_relativeNamespace(owningNamespace, ch, reference)
		} else
			ch.scope_Namespace(ownedFeatureChainings.get(i-1).chainingFeature, ch, reference, false)
	}
	
	def scope_owningNamespace(Element element, EObject context, EReference reference) {
		element.scope_Namespace(NamespaceUtil.getParentNamespaceOf(element), context, reference, true)
	}

	def scope_nonExpressionNamespace(Element element, EObject context, EReference reference) {
		element.scope_Namespace(NamespaceUtil.getNonExpressionNamespaceFor(element), context, reference, true)
	}
	
	def scope_Namespace(Element element, Namespace namespace, EObject context, EReference reference, boolean isInsideScope) {
		if (namespace === null)
			super.getScope(element, reference)		
		else 
			namespace.scopeFor(reference, element, isInsideScope, true,
				reference == SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, 
				if (context instanceof Element) context else null)
	}
	
	def scope_relativeNamespace(Element element, Namespace ns, EObject context, EReference reference) {
		val rel = NamespaceUtil.getRelativeNamespaceFor(ns)
		if (rel === null) {
			element.scope_nonExpressionNamespace(context, reference)
		} else {
			element.scope_Namespace(rel, context, reference, false)
		}
	}

	def IScope scopeFor(Namespace pack, EReference reference, Element element, boolean isInsideScope, boolean isFirstScope, boolean isRedefinition, Element skip) {
		var outerscope = IScope.NULLSCOPE;
		if (isInsideScope) {
			val parent = NamespaceUtil.getParentNamespaceOf(pack)
			outerscope = 
				if (parent === null) // Root Package
					globalScope.getScope(pack.eResource, reference, Predicates.alwaysTrue)
				else
					parent.scopeFor(reference, element, true, false, false, skip)
		}	

		new KerMLScope(outerscope, pack, reference.EReferenceType, this, isInsideScope, isFirstScope, isRedefinition, element, skip)
	}
	
}
