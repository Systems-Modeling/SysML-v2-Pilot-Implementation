/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018, 2019, 2020 Model Driven Solutions, Inc.
 * Copyright (c) 2018, 2019, 2020 California Institute of Technology/Jet Propulsion Laboratory
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
package org.omg.kerml.xtext.scoping

import java.util.Map
import java.util.Set
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractScope
import org.omg.sysml.lang.sysml.Type
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.VisibilityKind
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.emf.ecore.EClass
import org.omg.sysml.lang.sysml.impl.TypeImpl
import java.util.HashSet
import org.omg.sysml.lang.sysml.impl.FeatureImpl
import org.omg.sysml.lang.sysml.Feature
import org.omg.sysml.lang.sysml.impl.ElementImpl
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.impl.MembershipImpl
import org.omg.sysml.lang.sysml.Namespace


class KerMLScope extends AbstractScope {
	
	protected Namespace pack		
	protected EClass referenceType	
	protected KerMLScopeProvider scopeProvider
	protected boolean isInsideScope //false if initialized from KerMLGlobalScope
	protected boolean isFirstScope
	protected boolean isRedefinition
	
	protected Element skip = null
	
	protected QualifiedName targetqn;
	protected Map<Element, Set<QualifiedName>> elements
	protected Set<QualifiedName> visitedqns
	protected boolean findFirst = false;
	
	protected boolean isShadowing = false;
	protected Element element
	protected Type scopingType

	new(IScope parent, Namespace pack, EClass referenceType, KerMLScopeProvider scopeProvider, boolean isFirstScope, boolean isRedefinition, Element element, Element skip) {
		this(parent, pack, referenceType, scopeProvider, true, isFirstScope, isRedefinition, element, skip)
	}
	
	new(IScope parent, Namespace pack, EClass referenceType, KerMLScopeProvider scopeProvider, boolean isInsideScope, boolean isFirstScope, boolean isRedefinition, Element element, Element skip) {
		super(parent, false)
		this.pack = pack
		this.referenceType = referenceType
		this.scopeProvider = scopeProvider
		this.isInsideScope = isInsideScope
		this.isFirstScope = isFirstScope
		this.isRedefinition = isRedefinition
		this.skip = skip
		this.element = element
		this.scopingType = if (element?.owner instanceof Type) element.owner as Type else null
	}
	
	/**
	 * A qualified name is shadowed if its first segment name is shadowed.
	 */
	protected override isShadowed(IEObjectDescription input) {
		!resolveInScope(QualifiedName.create(input.name.firstSegment), true).isEmpty()
	}

	override getSingleElement(QualifiedName name) {
		val result = resolveInScope(name, true);
		if (!result.isEmpty) result.get(0)
		else if (parent !== null && !isShadowing) parent.getSingleElement(name)
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
	 * truncated). - called when "XPECT scope" is used.
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
		if (targetqn !== null && skip !== null) {
			scopeProvider.addVisited(skip)
		}
		if (pack instanceof Type && isRedefinition)
			// For a redefinition within a type, start resolution search with inherited members.
			pack.gen(QualifiedName.create(), newHashSet, null)
		else
			pack.resolve(QualifiedName.create(), false, isInsideScope, newHashSet, newHashSet)
		if (targetqn !== null && skip !== null) {
			scopeProvider.removeVisited(skip)
		}
	}
	
	protected def boolean resolve(Namespace pack, QualifiedName qn, boolean checkIfAdded, boolean isInsideScope, Set<Namespace> visited, Set<Element> redefined) {
		pack.owned(qn, checkIfAdded, isInsideScope, newHashSet, visited, redefined) ||
		pack.gen(qn, visited, redefined) ||
		pack.imp(qn, isInsideScope, visited)
	}
	
	protected def void addName(Map<Element, Set<QualifiedName>> elements, QualifiedName qn, Element el) {
		if (referenceType.isInstance(el)) {
			var qns = elements.get(el)
			if (qns === null) {
				elements.put(el, newHashSet(qn))
			} else {
				qns.add(qn)
			}					
		}
	}
	
	protected def boolean owned(Namespace pack, QualifiedName qn, boolean checkIfAdded, boolean isInsideScope, Set<Namespace> ownedvisited, Set<Namespace> visited, Set<Element> redefined) {
		
		if (!ownedvisited.contains(pack)) {
			if (targetqn === null) {
				ownedvisited.add(pack)		
			}
			
			for (r: pack.ownedRelationship) {
				if (!scopeProvider.visited.contains(r)) {
					if (r instanceof Membership) {
					
						// Note: Use basicGetMemberElement in order to avoid proxy resolution at this point.
						if (checkElementId(qn, checkIfAdded, (r as MembershipImpl).basicGetMemberElement, ownedvisited, visited)) {
							return true
						}

						// Note: Proxy resolution for memberElement may result in recursive name resolution
						// (and getting the memberName may also result in accessing the memberElement).
						// In this case, the membership m should be excluded from the scope, to avoid a 
						// cyclic linking error.
						scopeProvider.addVisited(r)
						var memberElement = r.ownedMemberElement
						var elementName = 
							if (r.memberName !== null || (isFirstScope && pack == this.pack && memberElement === element)) r.memberName 
							else (memberElement as ElementImpl)?.effectiveName
						if (elementName !== null) {
							val elementqn = qn.append(elementName)
							if ((isInsideScope || r.visibility == VisibilityKind.PUBLIC || 
							     r.visibility == VisibilityKind.PROTECTED && scopingType !== null && 
							     scopingType.isInheritedProtected(r.membershipOwningNamespace)) &&
							     checkQualifiedName(elementqn, checkIfAdded)) {
							    // Delay proxy resolution of memberElement for as long as possible (if not caused by getting memberName).
							    // This can prevent the proxy from being spuriously marked as unresolvable during an earlier phase of the search. 
								memberElement = r.memberElement
								scopeProvider.removeVisited(r)
							    if (memberElement !== null && !memberElement.eIsProxy && 
							    	!redefined.contains(memberElement) && 
							    	visitQualifiedName(elementqn, memberElement, ownedvisited, visited)) {
									return true
								}
							}
						}
						scopeProvider.removeVisited(r)
						
					} else {
						val ownedElements = r.ownedRelatedElement
						if (!ownedElements.empty && 
							// Note: This assumes ownership relationships will be binary.
							checkElementId(qn, checkIfAdded, ownedElements.get(0), ownedvisited, visited)) {
							return true
						}							
					}				
					
				}
			}
			ownedvisited.remove(pack)
		}
		return false
	}
	
	protected def checkElementId(QualifiedName qn, boolean checkIfAdded, Element element, Set<Namespace> ownedvisited, Set<Namespace> visited) {
		val elementId = element?.humanId
		if (elementId !== null) {
			val elementqn = qn.append(elementId)
			checkQualifiedName(elementqn, checkIfAdded) && visitQualifiedName(elementqn, element, ownedvisited, visited)
		}
	}
		
	protected def checkQualifiedName(QualifiedName elementqn, boolean checkIfAdded) {
		(targetqn === null || targetqn.startsWith(elementqn)) &&
		(!checkIfAdded || !visitedqns.contains(elementqn))
	}
	
	protected def visitQualifiedName(QualifiedName elementqn, Element memberElement, Set<Namespace> ownedvisited, Set<Namespace> visited) {
		visitedqns.add(elementqn)
		if (targetqn === null || targetqn == elementqn) {
			elements.addName(elementqn, memberElement)
			if (findFirst && targetqn == elementqn) {
				return true;
			}
		}
		if (targetqn != elementqn) {
			if (memberElement instanceof Namespace) {
				isShadowing = true;
				
				// Note: If the resolution is for a single element, search the owned elements first and, if found, do
				// not search the inherited elements. This avoids a possible cyclic linking error if getting the 
				// superclass requires proxy resolution.
				if (memberElement.owned(elementqn, false, false, ownedvisited, visited, newHashSet)) {
					return true
				}
				
				if (memberElement.gen(elementqn, visited, newHashSet)) {
					return true;
				}
				if (memberElement.imp(elementqn, false, visited)) {
					return true;
				}
			}
		}
	}
	
	protected def boolean isInheritedProtected(Type general, Element protectedOwningPackage){
		for(Type g: (general as TypeImpl).supertypes) {
			if (g == protectedOwningPackage || 
				 g.isInheritedProtected(protectedOwningPackage)) {
				return true
			}
		}
		return false; 
	}
	
	protected def boolean gen(Namespace pack, QualifiedName qn, Set<Namespace> visited, Set<Element> redefined) {
		if (pack instanceof Type) {
			val conjugator = pack.ownedConjugator
			if (conjugator !== null && !scopeProvider.visited.contains(conjugator)) {
				scopeProvider.addVisited(conjugator)
				val found = conjugator.originalType.resolveIfUnvisited(qn, false, visited, newHashSet)
				scopeProvider.removeVisited(conjugator)
				if (found) {
					return true
				}
			}
			val newRedefined = new HashSet()
			if (redefined !== null) {
				newRedefined.addAll(redefined)
				newRedefined.addAll(pack.redefinedFeatures)
			}
			for (e: (pack as TypeImpl).ownedGeneralization) {
				if (!scopeProvider.visited.contains(e)) {
					// NOTE: Exclude the generalization e to avoid possible circular name resolution
					// when resolving a proxy for e.general.
					scopeProvider.addVisited(e)
					val found = e.general.resolveIfUnvisited(qn, false, visited, newRedefined)
					scopeProvider.removeVisited(e)
					if (found) {
						return true
					}
				}
			}
			if (!scopeProvider.visited.contains(pack)) {
				scopeProvider.addVisited(pack);
				(pack as TypeImpl).computeImplicitGeneralTypes
				scopeProvider.removeVisited(pack)
				for (type : (pack as TypeImpl).getImplicitGeneralTypes) {
					val found = type.resolveIfUnvisited(qn, false, visited, newRedefined)
					if (found) {
						return true
					}
				}
			}
		}
		return false
	}
	
	protected def Set<Feature> redefinedFeatures(Type type) {
		type.ownedFeature.
			flatMap[feature|(feature as FeatureImpl).getRedefinedFeaturesWithComputed(skip)].toSet
	}
	
	protected def boolean imp(Namespace pack, QualifiedName qn, boolean isInsideScope, Set<Namespace> visited) {
		for (e: pack.ownedImport) {
			if (!scopeProvider.visited.contains(e)) {
				// NOTE: Exclude the import e to avoid possible circular name resolution
				// when resolving a proxy for e.importedNamespace.
				scopeProvider.addVisited(e)
				val found = (isInsideScope || e.visibility == VisibilityKind.PUBLIC) &&
					e.importedNamespace.resolveIfUnvisited(qn, true, visited, newHashSet)
				scopeProvider.removeVisited(e)
				if (found) {
					return true
				}
				if (e.isRecursive)
					resolveRecursiveImport(e.importedNamespace, qn,  newHashSet, visited)
			}
		}
		return false
	}
	
	protected def boolean resolveRecursiveImport(Namespace pack, QualifiedName qn, Set<Namespace> ownedvisited, Set<Namespace> visited){
		
		for (r: pack.ownedRelationship) {
			if (r instanceof Membership) {
				var memberElement = r.ownedMemberElement
				if (memberElement instanceof Namespace) {
					var found = memberElement.resolve(qn, false, false, visited, newHashSet)
						|| resolveRecursiveImport((memberElement as Namespace), qn, ownedvisited, visited)
					if (found) return true
				}						
			}
		}
		return false
	}

	protected def boolean resolveIfUnvisited(Namespace pack, QualifiedName qn, boolean checkIfAdded, Set<Namespace> visited, Set<Element> redefined) {
		var found = false
		if (pack !== null && !pack.eIsProxy && !visited.contains(pack)) {
			visited.add(pack)
			found = pack.resolve(qn, checkIfAdded, false, visited, redefined)
			visited.remove(pack)
		}
		found
	}
	
}
