/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  Model Driven Solutions, Inc.
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
 */
package org.omg.sysml.xtext.postprocessor

import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.omg.sysml.lang.sysml.impl.ClassifierImpl
import org.omg.sysml.lang.sysml.impl.FeatureImpl
import org.omg.sysml.lang.sysml.impl.TypeImpl
import org.omg.sysml.lang.sysml.impl.ItemFlowEndImpl

class SysMLDerivedStateComputer implements IDerivedStateComputer {
	
	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		// Do nothing before linking phase
		if (preLinkingPhase) {
			return
		}
		resource.allContents.filter(TypeImpl).forEach[
			it.computeDerivedState
		]
	}
	
	def dispatch void computeDerivedState(ClassifierImpl classifier) {
		classifier.clearCaches
		
		classifier.computeImplicitSuperclassing
	}
	
	def dispatch void computeDerivedState(FeatureImpl feature) {
		feature.clearCaches
		
		feature.computeImplicitSubsettings
		feature.computeImplicitFeatureTypings
		feature.computeImplicitRedefinition
	}
	
	def dispatch void computeDerivedState(ItemFlowEndImpl itemFlowEnd) {
		itemFlowEnd.clearCaches
		
		itemFlowEnd.computeImplicitRedefinition
		itemFlowEnd.computeImplicitFeatureTypings
		itemFlowEnd.computeImplicitSubsettings
	}
		
	override void discardDerivedState(DerivedStateAwareResource resource) {
		// Derived state is cleaned up during reparsing, there is nothing to clean up 
	}
}
