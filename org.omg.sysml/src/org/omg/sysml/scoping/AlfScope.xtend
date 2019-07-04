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
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.VisibilityKind
import org.eclipse.xtext.resource.IEObjectDescription

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class AlfScope extends AbstractScope {
	
	protected Package pack		
	protected EReference reference	
	protected AlfScopeProvider scopeProvider
	
	protected QualifiedName targetqn;
	protected Map<Element, Set<QualifiedName>> elements
	protected Set<QualifiedName> visitedqns
	protected boolean findFirst = false;
	
	new(IScope parent, Package pack, EReference reference, AlfScopeProvider scopeProvider) {
		super(parent, false)
		this.pack = pack
		this.reference = reference
		this.scopeProvider = scopeProvider
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
	
	override getSingleElement(QualifiedName name) {
		val result = resolveInScope(name, true);
		if (!result.isEmpty) result.get(0)
		else if (parent !== null && !isShadowed(name)) parent.getSingleElement(name)
		else null
	}
	
	override getLocalElementsByName(QualifiedName name) {
		resolveInScope(name, false)
	}
	
	override getAllLocalElements() {
		resolveInScope(null, false)
	}
	
	/**
	 * If targetqn is not null, resolve it in this local scope. If findFirst is true,
	 * return the first matching element, if any. Otherwise return all matching elements.
	 * 
	 * If targetqn is null, return all elements in this local scope with all possible
	 * qualified names by which they can be resolved (except that circularities are
	 * truncated).
	 */
	def resolveInScope(QualifiedName targetqn, boolean findFirst) {
		this.targetqn = targetqn;
		this.findFirst = findFirst	
		this.elements = newHashMap	
		this.visitedqns = newHashSet
		resolve()		
		elements.keySet.flatMap[key |
			elements.get(key).map[qn | EObjectDescription.create(qn, key)]
		]
	}
	
	protected def void resolve() {	
		pack.resolve(QualifiedName.create(), false, true, newHashSet)
	}
	
	protected def boolean resolve(Package pack, QualifiedName qn, boolean checkIfAdded, boolean isInsideScope, Set<Package> visited) {
		pack.owned(qn, checkIfAdded, isInsideScope, newHashSet) ||
		pack.gen(qn, visited) ||
		pack.imp(qn, visited)
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
	
	protected def boolean owned(Package pack, QualifiedName qn, boolean checkIfAdded, boolean isInsideScope, Set<Package> visited) {
		if (!visited.contains(pack)) {
			if (targetqn === null) {
				visited.add(pack)		
			}
			for (m: pack.ownedMembership) {
				if (!scopeProvider.visitedMemberships.contains(m)) {
					
					// Note: Getting the member name my require resolving a proxy for the memberElement,
					// resulting in recursive name resolution. In this case, the membership m should
					// be excluded from the scope, to avoid a cyclic linking error.
					scopeProvider.addVisitedMembership(m)
					val elementName = m.memberName 
					scopeProvider.removeVisitedMembership(m)
									
					if (elementName !== null && (isInsideScope || m.visibility == VisibilityKind.PUBLIC)) {
						val elementqn = qn.append(elementName)
						if (targetqn === null || targetqn.startsWith(elementqn)) {
							val memberElement = m.memberElement
							if (!checkIfAdded || !visitedqns.contains(elementqn)) {
								visitedqns.add(elementqn)
								if (targetqn === null || targetqn == elementqn) {
									elements.addName(elementqn, memberElement)
									if (findFirst && targetqn == elementqn) {
										return true
									}
								}
								if (targetqn != elementqn) {
									if (memberElement instanceof Package) {
										
										// Note: If the resolution is for a single element, search the owned elements first and, if found, do
										// not search the inherited elements. This avoids a possible cyclic linking error if getting the 
										// superclass requires proxy resolution.
										if (memberElement.owned(elementqn, false, false, visited)) {
											return true
										}
										
										if (memberElement instanceof org.omg.sysml.lang.sysml.Class) {								
											for (eg: memberElement.ownedSuperclassing) {
												if (!visited.contains(eg.superclass)) {
													eg.superclass.resolve(elementqn, false, false, visited)
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			visited.remove(pack)
		}
		return false
	}

	protected def boolean gen(Package pack, QualifiedName qn, Set<Package> visited) {
		if (pack instanceof Category) {
			for (e: pack.ownedGeneralization) {
				if (e.general !== null && !visited.contains(e.general)) {
					visited.add(e.general)
					val found = e.general.resolve(qn, false, false, visited)
					visited.remove(e.general)
					if (found) {
						return true
					}
				}
			}
		}
		return false
	}
	
	protected def boolean imp(Package pack, QualifiedName qn, Set<Package> visited) {
		for (e: pack.ownedImport) {
			if (e.importedPackage !== null && !visited.contains(e.importedPackage)) {
				visited.add(e.importedPackage)
				val found = e.importedPackage.resolve(qn, true, false, visited)
				visited.remove(e.importedPackage)
				if (found) {
					return true
				}
			}
		}
		return false
	}
	
}
