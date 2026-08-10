/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019, 2021, 2022 Model Driven Solutions, Inc.
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
 *  Miyako Wilson, JPL (Georgia Tech)
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.scoping

import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.emf.ecore.EClass
import com.google.common.base.Predicate
import com.google.common.collect.Iterables
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.scoping.impl.AbstractScope
import org.omg.sysml.lang.sysml.Namespace
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.Element
import org.omg.kerml.xtext.naming.QualifiedNameUtil
import org.omg.kerml.xtext.resource.KerMLResourceDescriptionStrategy

class KerMLGlobalScope extends AbstractScope {

	protected val IScope outer;
	protected val IScope shortNameOuter;
	protected val Resource resource
	protected val Predicate<IEObjectDescription> filter;
	protected val Predicate<IEObjectDescription> rootFilter;
	protected val EClass referenceType
	protected val KerMLScopeProvider scopeProvider
	
	static def createScope (IScope outer, IScope shortNameOuter, Resource resource, Predicate<IEObjectDescription> filter, Predicate<IEObjectDescription> rootFilter, EClass type, KerMLScopeProvider scopeProvider) {
		return new KerMLGlobalScope(outer, shortNameOuter, resource, filter, rootFilter, type, scopeProvider);
	}

	new(IScope outer, IScope shortNameOuter, Resource resource, Predicate<IEObjectDescription> filter, Predicate<IEObjectDescription> rootFilter, EClass type, KerMLScopeProvider scopeProvider) {
		super(IScope.NULLSCOPE, false)
		this.outer = outer
		this.shortNameOuter = shortNameOuter
		this.resource = resource
		this.filter = filter
		this.rootFilter = rootFilter
		this.referenceType = type
		this.scopeProvider = scopeProvider
	}
	
	
	def IScope scopeFor(Namespace pack) {
		new KerMLScope(IScope.NULLSCOPE, pack, this.referenceType, this.scopeProvider, false, false, false, null, null)
	}
	
	def IEObjectDescription addQualification(IEObjectDescription description, String name) {
		if (description === null) null
		else EObjectDescription.create(QualifiedName.create(name).append(description.name), description.EObjectOrProxy)
	}
	
	def IEObjectDescription filter(IEObjectDescription description) {
		if (description !== null && filter !== null && !filter.apply(description)) null
		else description
	}
	
	/**
	 * Get the description of the root Element with the given (single segment) name. A root Element
	 * is exported under its declaredName by KerMLQualifiedNameProvider and, if it has one, under
	 * its declaredShortName by KerMLResourceDescriptionStrategy. Short names are exported under a
	 * separate qualifier and are only considered here if no root Element has the given name as its
	 * declaredName, so a declaredName always takes precedence over a declaredShortName.
	 */
	def protected IEObjectDescription getRootElement(QualifiedName rootName) {
		val root = outer.getSingleElement(rootName)
		if (root !== null || shortNameOuter === null) {
			return root
		}
		val shortName = QualifiedName.create(KerMLResourceDescriptionStrategy.SHORT_NAME_QUALIFIER).append(rootName)
		val shortNameRoot = shortNameOuter.getSingleElement(shortName)
		return if (shortNameRoot === null) null
			else EObjectDescription.create(rootName, shortNameRoot.EObjectOrProxy)
	}

	override getSingleElement(QualifiedName name) {
		val qualifiedName = QualifiedNameUtil.getNonGlobalQualifiedName(name)							
		var IEObjectDescription result = null
		
		if (qualifiedName.segmentCount > 0) {
			if (QualifiedNameUtil.isGlobalScopeQualification(name)) {
				//search the context resource first
				val rootNS = resource.contents.head as Namespace
				result = scopeFor(rootNS).getSingleElement(qualifiedName)
			}		
			
			if (result === null) {
				val rootName = QualifiedName.create(qualifiedName.firstSegment)
				val root = getRootElement(rootName)
				if (root !== null) {
					if (qualifiedName.segmentCount == 1) {
						if (referenceType == SysMLPackage.eINSTANCE.membership) {
							var eObject = EcoreUtil.resolve(root.EObjectOrProxy, resource)
							result = if (eObject.eIsProxy) null 
								else EObjectDescription.create(qualifiedName, (eObject as Element).owningMembership)
						} else if (referenceType.isInstance(root.EObjectOrProxy)) {
							result = root;
						}
					} else if (root.EObjectOrProxy instanceof Namespace) {
						result = scopeFor(EcoreUtil.resolve(root.EObjectOrProxy, resource) as Namespace).
							getSingleElement(qualifiedName.skipFirst(1)).addQualification(qualifiedName.firstSegment)	
					}
				}
			}
		}
		
		return result.filter
	}

	override getAllLocalElements() {
		// Note: 'outer' is assumed to be a default global scope filtered to only return elements with qualified names
		// of a single segment. 'rootFilter' can be used to filter out library models.
		val rootElements = Iterables.filter(outer.allElements, rootFilter)
		var Iterable<IEObjectDescription> allElements = rootElements.filter[
			referenceType == SysMLPackage.eINSTANCE.membership || referenceType.isInstance(EObjectOrProxy)
		]
		for (root: rootElements) {
			val element = root.EObjectOrProxy
			if (element instanceof Namespace) {
				allElements = Iterables.concat(allElements, 
					scopeFor(element).allElements.map[addQualification(root.name.firstSegment)]
				)
			}
		}
		return if (filter === null) allElements else Iterables.filter(allElements, filter)
	}
	
}