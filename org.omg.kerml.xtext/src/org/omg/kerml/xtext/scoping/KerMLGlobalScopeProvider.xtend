/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
 * Copyright (c) 2019 California Institute of Technology/Jet Propulsion Laboratory
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
 *  Miyako Wilson, Georgia Tech
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.scoping

import com.google.common.base.Predicate
import com.google.common.base.Predicates
import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider
import org.omg.sysml.lang.sysml.SysMLPackage
import java.util.Collections

class KerMLGlobalScopeProvider extends DefaultGlobalScopeProvider {

	@Inject
	KerMLScopeProvider kerMLScopeProvider
	
	static Iterable<IEObjectDescription> libraryDescriptions = Collections.emptyList
	
	override IScope getScope(IScope parent, Resource context, boolean ignoreCase, EClass type, Predicate<IEObjectDescription> filter) {
		val scope = super.getScope(parent, context, false, SysMLPackage.eINSTANCE.element, [eod | eod.name.segmentCount == 1])
		return KerMLGlobalScope.createScope(scope, context, filter, rootFilter, type, kerMLScopeProvider)
		//return KerMLLibraryScope.createScope(kerMLScope, context, type, kerMLScopeProvider, libraryDescriptions);
	}
	

	
	protected def Predicate<IEObjectDescription> getRootFilter() {
		Predicates.alwaysTrue
	}
	
	
	static def setLibraryDescriptions(Iterable<IEObjectDescription> libraryDescriptions) {
		KerMLGlobalScopeProvider.libraryDescriptions = libraryDescriptions
	}
}
