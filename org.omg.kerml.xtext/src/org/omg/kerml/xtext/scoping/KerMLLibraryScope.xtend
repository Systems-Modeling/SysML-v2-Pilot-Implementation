/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  California Institute of Technology ("Caltech")
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
package org.omg.kerml.xtext.scoping

import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractScope
import org.eclipse.emf.ecore.util.EcoreUtil
import org.omg.sysml.lang.sysml.SysMLPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.EObjectDescription
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Namespace
import com.google.common.collect.Iterables

class KerMLLibraryScope extends AbstractScope {
	
	Iterable<IEObjectDescription> libraryDescriptions;
	Resource resource
	EClass referenceType
	KerMLScopeProvider scopeProvider
	
	static def createScope(IScope outer, Resource resource, EClass type, KerMLScopeProvider scopeProvider, Iterable<IEObjectDescription> libraryDescriptions) {

		new KerMLLibraryScope(outer, resource, type, scopeProvider, libraryDescriptions)
	}
	
	protected new(IScope outer, Resource resource, EClass type, KerMLScopeProvider scopeProvider, Iterable<IEObjectDescription> libraryDescriptions) {
		super(outer, false)
		this.resource = resource
		this.referenceType = type
		this.libraryDescriptions = libraryDescriptions
		this.scopeProvider = scopeProvider
	}
	
	 def IScope scopeFor(Namespace pack) {
		new KerMLScope(IScope.NULLSCOPE, pack, this.referenceType, this.scopeProvider, false, false, false, null, null)
	}
	
	def IEObjectDescription addQualification(IEObjectDescription description, String name) {
		if(description === null) null else EObjectDescription.create(
			QualifiedName.create(name).append(description.name), description.EObjectOrProxy)
	}
	
	override getSingleElement(QualifiedName name) {
		val iterator = libraryDescriptions.iterator
		var IEObjectDescription result = null
		if (name.segmentCount > 0) {
			val rootName = QualifiedName.create(name.firstSegment)
			val root = iterator.findFirst[it.qualifiedName == rootName]
			if (root !== null) {
				if (name.segmentCount == 1) {
					if (referenceType == SysMLPackage.eINSTANCE.membership) {
						var eObject = EcoreUtil.resolve(root.EObjectOrProxy, resource)
						result = if(eObject.eIsProxy) null else EObjectDescription.create(name,
							(eObject as Element).owningMembership)
					} else if (referenceType.isInstance(root.EObjectOrProxy)) {
						result = root;
					}
				} else if (root.EObjectOrProxy instanceof Namespace) {
					result = scopeFor(EcoreUtil.resolve(root.EObjectOrProxy, resource) as Namespace).getSingleElement(
						name.skipFirst(1)).addQualification(name.firstSegment)
				}
			}
		}

		return result === null ? super.getSingleElement(name) : result
	}
	
	override protected getAllLocalElements()
	{
		var Iterable<IEObjectDescription> allElements = libraryDescriptions.filter[
			referenceType == SysMLPackage.eINSTANCE.membership || referenceType.isInstance(EObjectOrProxy)
		]
		for (root: libraryDescriptions) {
			val element = root.EObjectOrProxy
			if (element instanceof Namespace) {
				allElements = Iterables.concat(allElements, 
					scopeFor(element).allElements.map[addQualification(root.name.firstSegment)]
				)
			}
		}
		return allElements
	}	
}