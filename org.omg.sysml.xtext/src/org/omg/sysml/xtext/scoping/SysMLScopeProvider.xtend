/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2025 Model Driven Solutions, Inc.
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
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/
package org.omg.sysml.xtext.scoping

import org.omg.kerml.xtext.scoping.KerMLScopeProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.TransitionUsage
import org.omg.sysml.lang.sysml.FeatureMembership
import org.omg.sysml.lang.sysml.ReferenceSubsetting
import org.omg.sysml.lang.sysml.SuccessionAsUsage
import org.omg.sysml.lang.sysml.FeatureChaining

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class SysMLScopeProvider extends KerMLScopeProvider {
	
	def EObject featureRelationship(EObject context) {
		if (context instanceof FeatureChaining) {
			var featureChained = context.featureChained
			val ownedFeatureChainings = featureChained.ownedFeatureChaining
			val i = ownedFeatureChainings.indexOf(context)
			if ( i <= 0) {
				return featureChained.owningRelationship
			}
		}
		return context
	}
	
	override getScope(EObject context, EReference reference) {
		var relationship = context.featureRelationship

		// Scope a TransitionUsage source to the owningNamespace of the TransitionUsage
		if (relationship instanceof Membership) {
			val owningNamespace = relationship.membershipOwningNamespace;
			if (owningNamespace instanceof TransitionUsage && 
				relationship == owningNamespace.ownedMembership.filter[mem | !(mem instanceof FeatureMembership)].head) {
				return owningNamespace.scope_owningNamespace(context, reference)
			}
		
		// Scope a TransitionUsage target to the owningNamespace of the TransitionUsage
		} else if (relationship instanceof ReferenceSubsetting) {
			val owningFeature = relationship.owningFeature
			val owningType = owningFeature.owningType
			if (owningType instanceof SuccessionAsUsage && owningType.ownedEndFeature.indexOf(owningFeature) == 1) {
				val outerNamespace = owningType.owningNamespace
				if (outerNamespace instanceof TransitionUsage && owningType === (outerNamespace as TransitionUsage).succession) {
					return outerNamespace.scope_owningNamespace(context, reference)
				}
			}
		}
		return super.getScope(context, reference)
	}
}
