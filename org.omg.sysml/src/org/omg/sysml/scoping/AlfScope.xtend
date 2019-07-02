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

import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractScope
import org.omg.sysml.lang.sysml.Category
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.Superclassing
import org.omg.sysml.lang.sysml.VisibilityKind
import org.eclipse.xtext.resource.IEObjectDescription

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class AlfScope extends AbstractScope {
	
	Package pack	
	
	EReference reference
	
	Set<Membership> visitedMemberships;
	
	AlfScopeProvider scopeProvider
	
	new(IScope parent, Package pack, EReference reference, Set<Membership> visitedMemberships, AlfScopeProvider scopeProvider) {
		super(parent, false)
		this.pack = pack
		this.reference = reference
		this.scopeProvider = scopeProvider
		this.visitedMemberships = visitedMemberships;
	}
	
	def getPackage() {
		pack
	}
	
	override protected isShadowed(IEObjectDescription input) {
		isShadowed(input.name)
	}

	/**
	 * A qualified name is shadowed if its first segment name is shadowed.
	 */
	protected def isShadowed(QualifiedName name) {
		!getLocalElementsByName(QualifiedName.create(name.firstSegment)).isEmpty
	}
	
	override getAllLocalElements() {
		val savedMemberships = scopeProvider.visitedMemberships
		scopeProvider.visitedMemberships = newHashSet(visitedMemberships)
		val elements = resolveInScope(null)
		scopeProvider.visitedMemberships = savedMemberships
		elements
	}
	
	override getSingleElement(QualifiedName name) {
		val result = getSingleLocalElementByName(name);
		if (result !== null) result 
		else if (parent !== null && !isShadowed(name)) parent.getSingleElement(name)
		else null
	}
	
	override getLocalElementsByName(QualifiedName name) {
		resolveInScope(name)
	}
	
	protected def resolveInScope(QualifiedName targetqn) {		
		val elements = resolve(targetqn)		
		elements.keySet.flatMap[key |
			elements.get(key).map[qn | EObjectDescription.create(qn, key)]
		]
	}
	
	protected def Map<Element, Set<QualifiedName>> resolve(QualifiedName targetqn) {		
		pack.resolve(targetqn, QualifiedName.create(), newHashMap, false, true, newHashSet, newHashSet)		
	}
	
	protected def resolve(Package pack, QualifiedName targetqn, QualifiedName qn, Map<Element, Set<QualifiedName>> elements, boolean checkIfAdded, boolean isInsideScope, 
		Set<Package> visited, Set<QualifiedName> visitedqns) {
		pack.owned(targetqn, qn, elements, checkIfAdded, isInsideScope, newHashSet, visitedqns)
		pack.gen(targetqn, qn, elements, visited, visitedqns)
		pack.imp(targetqn, qn, elements, visited, visitedqns)
		elements
	}
	
	protected def void addName(Map<Element, Set<QualifiedName>> elements, QualifiedName qn, Element el) {
		if (reference.EReferenceType.isInstance(el)) {
			var qns = elements.get(el)
			if (qns === null) {
				elements.put(el, newHashSet(qn))
			} else {
				qns.add(qn)
			}					
		}
	}
	
	private def void owned(Package pack, QualifiedName targetqn, QualifiedName qn, Map<Element, Set<QualifiedName>> elements, boolean checkIfAdded, boolean isInsideScope, 
		Set<Package> visited, Set<QualifiedName> visitedqns) {
		if (!visited.contains(pack)) {
			if (targetqn === null) {
				visited.add(pack)		
			}
			pack.ownedMembership.forEach[m|
				if (!visitedMemberships.contains(m)) {
					val elementName = m.memberName 
					if (elementName !== null && (isInsideScope || m.visibility == VisibilityKind.PUBLIC)) {
						val elementqn = qn.append(elementName)
						if (targetqn === null || targetqn.startsWith(elementqn)) {
							val memberElement = m.memberElement
							if (!checkIfAdded || !visitedqns.contains(elementqn)) {
								visitedqns.add(elementqn)
								if (targetqn === null || targetqn == elementqn) {
									elements.addName(elementqn, memberElement)
								}
								if (targetqn != elementqn) {
									if (memberElement instanceof Package) {
										memberElement.owned(targetqn, elementqn, elements, checkIfAdded, false, visited, visitedqns)
										for (eg: memberElement.ownedRelationship.filter(Superclassing)) {
											if (!visited.contains(eg.superclass)) {
												eg.superclass.resolve(targetqn, elementqn, elements, false, false, visited, visitedqns)
											}
										}
									}
								}
							}
						}
					}
				}
			]
			visited.remove(pack)
		}
	}

	private def void gen(Package pack, QualifiedName targetqn, QualifiedName qn, Map<Element, Set<QualifiedName>> elements, Set<Package> visited, Set<QualifiedName> visitedqns) {
		if (pack instanceof Category) {
			pack.ownedGeneralization.forEach [e |
				if (e.general?.name !== null) {
					if (!visited.contains(e.general)) {
						visited.add(e.general)
						e.general.resolve(targetqn, qn, elements, false, false, visited, visitedqns)
						visited.remove(e.general)
					}
				}
			]
		}
	}
	
	private def void imp(Package pack, QualifiedName targetqn, QualifiedName qn, Map<Element, Set<QualifiedName>> elements, Set<Package> visited, Set<QualifiedName> visitedqns) {
		pack.ownedImport.forEach [e |
			if (!visited.contains(e.importedPackage)) {
				visited.add(e.importedPackage)
				e.importedPackage.resolve(targetqn, qn, elements, true, false, visited, visitedqns)
				visited.remove(e.importedPackage)
			}
		]
	}
	
}
