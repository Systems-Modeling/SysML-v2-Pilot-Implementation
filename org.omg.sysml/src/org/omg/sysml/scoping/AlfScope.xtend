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

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.IScope
import org.omg.sysml.lang.sysml.Package
import java.util.Set
import org.omg.sysml.lang.sysml.Membership

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class AlfScope implements IScope {
	
	Package pack	
	
	EReference reference
	
	Set<Membership> scopedMemberships = newHashSet;
	
	IScope scope = null

	var AlfScopeProvider scopeProvider

	new(Package pack, EReference reference, Set<Membership> scopedMemberships, AlfScopeProvider scopeProvider) {
		this.pack = pack;
		this.reference = reference;
		this.scopedMemberships.addAll(scopedMemberships);
		this.scopeProvider = scopeProvider;
	}
	
	override getSingleElement(QualifiedName qn) {
		getScope.getSingleElement(qn)
	}
	
	override getSingleElement(EObject object) {
		getScope.getSingleElement(object)
	}
	
	override getAllElements() {
		getScope.getAllElements
	}
	
	override getElements(QualifiedName name) {
		getScope.getElements(name)
	}
	
	override getElements(EObject object) {
		getScope.getElements(object)
	}
	
	def protected getScope() {
		if (scope === null) {
			scope = scopeProvider.scope_Package(pack, reference, scopedMemberships)
		}
		return scope;
	}
		
}
