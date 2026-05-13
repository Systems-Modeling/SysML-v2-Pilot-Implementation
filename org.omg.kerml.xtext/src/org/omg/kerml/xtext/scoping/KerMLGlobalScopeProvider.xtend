/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
 * Copyright (c) 2019 California Institute of Technology/Jet Propulsion Laboratory
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 * 
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 * 
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 * 
 * Contributors:
 *  Ed Seidewitz, MDS
 *  Miyako Wilson, Georgia Tech
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.scoping

import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider
import org.eclipse.emf.ecore.EClass
import com.google.common.base.Predicate
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.omg.sysml.lang.sysml.SysMLPackage
import com.google.common.base.Predicates

class KerMLGlobalScopeProvider extends DefaultGlobalScopeProvider {

	@Inject
	KerMLScopeProvider kerMLScopeProvider
	
	override IScope getScope(IScope parent, Resource context, boolean ignoreCase, EClass type, Predicate<IEObjectDescription> filter) {
		val scope = super.getScope(parent, context, false, SysMLPackage.eINSTANCE.element, [eod | eod.name.segmentCount == 1])
		return KerMLGlobalScope.createScope(scope, context, filter, rootFilter, type, kerMLScopeProvider)
	}
	
	protected def Predicate<IEObjectDescription> getRootFilter() {
		Predicates.alwaysTrue
	}

}
