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
package org.omg.kerml.xtext.scoping

import java.util.Map
import java.util.Set
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractScope
import org.omg.sysml.lang.sysml.Type
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.VisibilityKind
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.emf.ecore.EClass
import org.omg.sysml.lang.sysml.Generalization
import org.omg.sysml.lang.sysml.impl.TypeImpl
import java.util.HashSet
import org.omg.sysml.lang.sysml.impl.FeatureImpl
import org.omg.sysml.lang.sysml.Feature
import org.omg.sysml.lang.sysml.impl.ElementImpl

class KerMLScope extends AbstractScope {
	
	protected Package pack		
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

	new(IScope parent, Package pack, EClass referenceType, KerMLScopeProvider scopeProvider, boolean isFirstScope, boolean isRedefinition, Element element, Element skip) {
		this(parent, pack, referenceType, scopeProvider, true, isFirstScope, isRedefinition, element, skip)
	}
	
	new(IScope parent, Package pack, EClass referenceType, KerMLScopeProvider scopeProvider, boolean isInsideScope, boolean isFirstScope, boolean isRedefinition, Element element, Element skip) {
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
		if (pack instanceof Type && isRedefinition)
			// For a redefinition within a type, start resolution search with inherited members.
			pack.gen(QualifiedName.create(), newHashSet, null)
		else
			pack.resolve(QualifiedName.create(), false, isInsideScope, newHashSet, newHashSet)
	}
	
	protected def boolean resolve(Package pack, QualifiedName qn, boolean checkIfAdded, boolean isInsideScope, Set<Package> visited, Set<Element> redefined) {
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
	
	protected def boolean isSkip(Element e) {
		targetqn !== null && e === skip
	}
	protected def boolean owned(Package pack, QualifiedName qn, boolean checkIfAdded, boolean isInsideScope, Set<Package> ownedvisited, Set<Package> visited, Set<Element> redefined) {
		
		if (!ownedvisited.contains(pack)) {
			if (targetqn === null) {
				ownedvisited.add(pack)		
			}
			for (m: pack.ownedMembership) {
				if (!isSkip(m) && !scopeProvider.visited.contains(m)) {
					var String elementName1
					var String elementName2 //for HumanId
					var Element memberElement
					
					// Note: Proxy resolution for memberElement may result in recursive name resolution
					// (and getting the memberName may also result in accessing the memberElement).
					// In this case, the membership m should be excluded from the scope, to avoid a 
					// cyclic linking error.
					scopeProvider.addVisited(m)
					try {
						memberElement = m.memberElement
						if (memberElement !== null && memberElement.eIsProxy){
							elementName1 = null;
							elementName2 = null;
						} else{
							elementName2 = memberElement.humanId;
							if (m.memberName !== null || (isFirstScope && pack == this.pack && memberElement === element)) elementName1 = m.memberName 
							else elementName1 = (memberElement as ElementImpl)?.effectiveName
						}
							
					} finally {
						scopeProvider.removeVisited(m)
					}
					if (elementName1 !== null  && !redefined.contains(memberElement) &&
						(isInsideScope || m.visibility == VisibilityKind.PUBLIC || 
						 m.visibility == VisibilityKind.PROTECTED && 
							scopingType !== null && 
							scopingType.isInheritedProtected(m.membershipOwningPackage))) {
						val elementqn1 = qn.append(elementName1)
						if (ownedPerQufalifiedName(elementqn1, checkIfAdded, memberElement, ownedvisited, visited))
							return true
					
						if (elementName2 !== null) {
							val elementqn2 = qn.append(elementName2)	
							if (ownedPerQufalifiedName(elementqn2, checkIfAdded, memberElement, ownedvisited, visited))
								return true
						}
					}
				}
			}
			ownedvisited.remove(pack)
		}
		return false
	}
	protected def ownedPerQufalifiedName (QualifiedName elementqn, boolean checkIfAdded, Element memberElement, Set<Package> ownedvisited, Set<Package> visited)
	{
		if (targetqn === null || targetqn.startsWith(elementqn))  {
			if (!checkIfAdded || !visitedqns.contains(elementqn)) {
				visitedqns.add(elementqn)
				if (targetqn === null || targetqn == elementqn) {
					elements.addName(elementqn, memberElement)
					if (findFirst && targetqn == elementqn) {
						return true;
					}
				}
				if (targetqn != elementqn) {
					if (memberElement instanceof Package) {
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
		}
	}
		
	protected def boolean isInheritedProtected(Type general, Element protectedOwningPackage){
		var gs = general.ownedGeneralization
		for(Generalization g: gs){
			if (g.general == protectedOwningPackage || 
				 g.general.isInheritedProtected(protectedOwningPackage)) {
				return true
			}
		}
		return false; 
	}
	
	protected def boolean gen(Package pack, QualifiedName qn, Set<Package> visited, Set<Element> redefined) {
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
				if (!isSkip(e) && !scopeProvider.visited.contains(e)) {
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
		}
		return false
	}
	
	protected def Set<Feature> redefinedFeatures(Type type) {
		type.ownedFeature.
			flatMap[feature|(feature as FeatureImpl).getRedefinedFeaturesWithComputed(skip)].toSet
	}
	
	protected def boolean imp(Package pack, QualifiedName qn, boolean isInsideScope, Set<Package> visited) {
		for (e: pack.ownedImport) {
			if (!isSkip(e) && !scopeProvider.visited.contains(e)) {
				// NOTE: Exclude the import e to avoid possible circular name resolution
				// when resolving a proxy for e.importedPackage.
				scopeProvider.addVisited(e)
				val found = (isInsideScope || e.visibility == VisibilityKind.PUBLIC) &&
					e.importedPackage.resolveIfUnvisited(qn, true, visited, newHashSet)
				scopeProvider.removeVisited(e)
				if (found) {
					return true
				}
			}
		}
		return false
	}
	
	protected def boolean resolveIfUnvisited(Package pack, QualifiedName qn, boolean checkIfAdded, Set<Package> visited, Set<Element> redefined) {
		var found = false
		if (pack !== null && !pack.eIsProxy && !visited.contains(pack)) {
			visited.add(pack)
			found = pack.resolve(qn, checkIfAdded, false, visited, redefined)
			visited.remove(pack)
		}
		found
	}
	
}
