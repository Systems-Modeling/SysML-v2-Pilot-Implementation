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
package org.omg.sysml.scoping

import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.IScope
import org.omg.sysml.lang.sysml.Package
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.emf.ecore.EClass
import com.google.common.base.Predicate
import com.google.common.collect.Iterables
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.scoping.impl.AbstractScope

class AlfGlobalScope extends AbstractScope {

	protected IScope outer;
	protected Resource resource
	protected Predicate<IEObjectDescription> filter;
	protected EClass referenceType	
	protected AlfScopeProvider scopeProvider
	
	static def createScope (IScope outer, Resource resource, Predicate<IEObjectDescription> filter, EClass type, AlfScopeProvider scopeProvider) {
		return new AlfGlobalScope(outer, resource, filter, type, scopeProvider);
	}

	new(IScope outer, Resource resource, Predicate<IEObjectDescription> filter, EClass type, AlfScopeProvider scopeProvider) {
		super(IScope.NULLSCOPE, false)
		this.outer = outer
		this.resource = resource
		this.filter = filter
		this.referenceType = type
		this.scopeProvider = scopeProvider
	}
	
	def IScope alfScope(Package pack) {
		new AlfScope(IScope.NULLSCOPE, pack, this.referenceType, this.scopeProvider, false)
	}
	
	def IEObjectDescription addQualification(IEObjectDescription description, String name) {
		if (description === null) null
		else EObjectDescription.create(QualifiedName.create(name).append(description.name), description.EObjectOrProxy)
	}
	
	def IEObjectDescription filter(IEObjectDescription description) {
		if (description !== null && filter !== null && !filter.apply(description)) null
		else description
	}
	
	override getSingleElement(QualifiedName name) {
		var IEObjectDescription result = null
		if (name.segmentCount > 0) {
			val rootName = QualifiedName.create(name.firstSegment)
			val root = outer.getSingleElement(rootName)
			if (root !== null) {
				if (name.segmentCount == 1) {
					if (referenceType.isInstance(root.EObjectOrProxy)) {
						result = root;
					}
				} else if (root.EObjectOrProxy instanceof Package) {
					result = alfScope(EcoreUtil.resolve(root.EObjectOrProxy, resource) as Package).
						getSingleElement(name.skipFirst(1)).addQualification(name.firstSegment)	
				}
			}
		}
		return result.filter
	}

	override getAllLocalElements() {
		val rootElements = outer.allElements.filter[!name.firstSegment.equals("Base")];
		var Iterable<IEObjectDescription> allElements = rootElements.filter[referenceType.isInstance(EObjectOrProxy)]
		for (root: rootElements) {
			val element = root.EObjectOrProxy
			if (element instanceof Package) {
				allElements = Iterables.concat(allElements, 
					alfScope(element as Package).allElements.map[addQualification(root.name.firstSegment)]
				)
			}
		}
		return if (filter === null) allElements else Iterables.filter(allElements, filter)
	}
	
}