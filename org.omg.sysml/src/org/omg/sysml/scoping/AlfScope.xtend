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

import java.util.HashSet
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
	
//	/**
//	 * A qualified name is shadowed if its first segment name is shadowed.
//	 */
//	override protected boolean isShadowed(IEObjectDescription input) {
//		return !getLocalElementsByName(QualifiedName.create(input.name.firstSegment)).isEmpty
//	}
	
	override getAllElements() {
		super.getAllElements()
	}
	
	override getAllLocalElements() {
		val savedMemberships = scopeProvider.visitedMemberships
		scopeProvider.visitedMemberships = new HashSet(visitedMemberships)
		val elements = resolveInScope(null)
		scopeProvider.visitedMemberships = savedMemberships
		return elements
	}
	
	override getLocalElementsByName(QualifiedName name) {
		resolveInScope(name)
	}
	
	protected def resolveInScope(QualifiedName targetqn) {		
		val elements = resolve(targetqn)		
		return elements.keySet.flatMap[key |
			elements.get(key).map[qn | EObjectDescription.create(qn, key)]
		]
	}
	
	protected def Map<Element, Set<QualifiedName>> resolve(QualifiedName targetqn) {
		
		val elements = <Element, Set<QualifiedName>>newHashMap()
		val visited = newHashSet
		
		pack.resolve(QualifiedName.create(), elements, false, true, newHashSet, visited, targetqn)
		
		return elements		
	}
	
	protected def void resolve(Package pack, QualifiedName qn, Map<Element, Set<QualifiedName>> elements, boolean checkIfAdded, boolean isInsideScope, 
		Set<Package> visited, Set<QualifiedName> visitedqns, QualifiedName targetqn) {
		pack.owned(qn, elements, checkIfAdded, isInsideScope, newHashSet, visitedqns, targetqn)
		pack.gen(qn, elements, visited, visitedqns, targetqn)
		pack.imp(qn, elements, visited, visitedqns, targetqn)
	}
	
	protected def boolean addName(Map<Element, Set<QualifiedName>> elements, QualifiedName qn, Element el, Set<QualifiedName> visited, QualifiedName targetqn) {
		var added = true;
		if (reference.EReferenceType.isInstance(el)) {
			added = false;
			if (targetqn === null || targetqn.equals(qn)) {
				val qns = elements.get(el);
				if (qns === null) { 
					if (!visited.contains(qn)){
						elements.put(el, newHashSet(qn))
						visited.add(qn)
						added = true
					}
				}
				else if (!qns.contains(qn)){ //elements contains more than one qualifiedName - test::A and test2::A have difference qns
					if(!visited.contains(qn)){
						qns.add(qn)
						elements.put(el, qns)
						visited.add(qn)
						added = true
					}
				}
			}			
		}
		return added
	}
	
	private def void owned(Package pack, QualifiedName qn, Map<Element, Set<QualifiedName>> elements, boolean checkIfAdded, boolean isInsideScope, 
		Set<Package> visited, Set<QualifiedName> visitedQns, QualifiedName targetqn) {
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
							val added = elements.addName(elementqn, memberElement, visitedQns, targetqn)
							if ((!checkIfAdded || added) && targetqn != elementqn) {
								if (memberElement instanceof Package) {
									memberElement.owned(elementqn, elements, checkIfAdded, false, visited, visitedQns, targetqn)
									for (eg: memberElement.ownedRelationship.filter(Superclassing)) {
										if (!visited.contains(eg.superclass)) {
											eg.superclass.resolve(elementqn, elements, false, false, visited, visitedQns, targetqn)
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

	private def void gen(Package pack, QualifiedName qn, Map<Element, Set<QualifiedName>> elements, Set<Package> visited, Set<QualifiedName> visitedQns, QualifiedName targetqn) {
		if (pack instanceof Category) {
			pack.ownedGeneralization.forEach [e |
				if (e.general?.name !== null) {
					if (!visited.contains(e.general)) {
						visited.add(e.general)
						e.general.resolve(qn, elements, false, false, visited, visitedQns, targetqn)
						visited.remove(e.general)
					}
				}
			]
		}
	}
	
	private def void imp(Package pack, QualifiedName qn, Map<Element, Set<QualifiedName>> elements, Set<Package> visited, Set<QualifiedName> visitedQns, QualifiedName targetqn) {
		pack.ownedImport.forEach [e |
			if (!visited.contains(e.importedPackage)) {
				visited.add(e.importedPackage)
				e.importedPackage.resolve(qn, elements, targetqn === null, false, visited, visitedQns, targetqn)
				visited.remove(e.importedPackage)
			}
		]
	}
	
}
