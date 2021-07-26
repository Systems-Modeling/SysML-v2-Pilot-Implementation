/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018, 2019, 2020, 2021 Model Driven Solutions, Inc.
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
import java.util.HashSet
import org.omg.sysml.lang.sysml.Feature
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.Namespace
import org.omg.sysml.util.TypeUtil
import org.omg.sysml.util.FeatureUtil
import org.omg.sysml.lang.sysml.Import
import org.omg.sysml.lang.sysml.Relationship
import org.omg.sysml.lang.sysml.util.ISysMLScope
import java.util.Collections

class KerMLScope extends AbstractScope implements ISysMLScope {
	
	protected Namespace ns		
	protected EClass referenceType	
	protected KerMLScopeProvider scopeProvider
	protected boolean isInsideScope //false if initialized from KerMLGlobalScope
	protected boolean isFirstScope
	protected boolean isRedefinition	
	protected Element skip = null
	protected Element element
	protected Type scopingType
	
	protected QualifiedName targetqn;
	protected Map<Element, Set<QualifiedName>> elements
	protected Set<Membership> memberships
	protected Set<QualifiedName> visitedqns
	protected boolean findFirst = false;
	protected boolean isShadowing = false;
	protected Set<org.omg.sysml.lang.sysml.Package> importingPackages = new HashSet()

	new(IScope parent, Namespace ns, EClass referenceType, KerMLScopeProvider scopeProvider, boolean isFirstScope, boolean isRedefinition, Element element, Element skip) {
		this(parent, ns, referenceType, scopeProvider, true, isFirstScope, isRedefinition, element, skip)
	}
	
	new(IScope parent, Namespace ns, EClass referenceType, KerMLScopeProvider scopeProvider, boolean isInsideScope, boolean isFirstScope, boolean isRedefinition, Element element, Element skip) {
		super(parent, false)
		this.ns = ns
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
		!resolveInScope(QualifiedName.create(input.name.firstSegment), true, false).isEmpty()
	}

	override getSingleElement(QualifiedName name) {
		val result = resolveInScope(name, true, false);
		if (!result.isEmpty) result.get(0)
		else if (parent !== null && !isShadowing) parent.getSingleElement(name)
		else null
	}
	
	override getLocalElementsByName(QualifiedName name) {
		resolveInScope(name, false, false)
	}
	
	override getAllLocalElements() {
		resolveInScope(null, false, false)
	}
	
	override Set<Membership> getMemberships(String name, boolean includeAll) {
		val result = resolveInScope(QualifiedName.create(name), true, includeAll);
		if (!result.isEmpty) memberships
		else if (parent instanceof ISysMLScope && !isShadowing) (parent as ISysMLScope).getMemberships(name, includeAll)
		else Collections.emptySet
	}
	
	/**
	 * If targetqn is not null, resolve it in this local scope. If findFirst is true,
	 * return the first matching element, if any. Otherwise return all matching elements.
	 * 
	 * If targetqn is null, return all elements in this local scope with all possible
	 * qualified names by which they can be resolved (except that circularities are
	 * truncated). [Called when "XPECT scope" is used in an Xpect test.]
	 */
	def resolveInScope(QualifiedName targetqn, boolean findFirst, boolean includeAll) {
		this.targetqn = targetqn;
		this.findFirst = findFirst	
		this.elements = newHashMap
		this.memberships = newHashSet
		this.visitedqns = newHashSet
		resolve(includeAll)
		elements.keySet.flatMap[key |
			elements.get(key).map[qn | EObjectDescription.create(qn, key)]
		]
	}
	
	protected def void resolve(boolean includeAll) {
		if (targetqn !== null && skip !== null) {
			scopeProvider.addVisited(skip)
		}
		if (ns instanceof Type && isRedefinition)
			// For a redefinition within a type, start resolution search with inherited members.
			ns.gen(QualifiedName.create(), newHashSet, null, true)
		else
			ns.resolve(QualifiedName.create(), false, isInsideScope, newHashSet, newHashSet, newHashSet, true, includeAll)
		if (targetqn !== null && skip !== null) {
			scopeProvider.removeVisited(skip)
		}
	}
	
	protected def boolean resolve(Namespace ns, QualifiedName qn, boolean checkIfAdded, boolean isInsideScope, Set<Namespace> ownedVisited, Set<Namespace> visited, Set<Element> redefined, 
		boolean includeImplicitGen, boolean includeAll) {
		ns.owned(qn, checkIfAdded, isInsideScope, ownedVisited, visited, redefined, includeImplicitGen, includeAll) ||
		ns.gen(qn, visited, redefined, includeImplicitGen) ||
		ns.imp(qn, isInsideScope, visited, includeImplicitGen, includeAll)
	}
	
	protected def boolean addName(QualifiedName qn, Relationship rel, Element el) {
		if (!referenceType.isInstance(el)) {
			return false
		} else {
			var qns = elements.get(el)
			if (qns === null) {
				elements.put(el, newHashSet(qn))
			} else {
				qns.add(qn)
			}
			if (rel instanceof Membership) {
				memberships.add(rel)
			}
			return true
		}
	}
	
	protected def boolean isIncludeAsMember(Element el) {
		importingPackages.forall[includeAsMember(el)]
	}
	
	protected def boolean owned(Namespace ns, QualifiedName qn, boolean checkIfAdded, boolean isInsideScope, Set<Namespace> ownedvisited, Set<Namespace> visited, Set<Element> redefined, 
		boolean includeImplicitGen, boolean includeAll) {		
		if (!ownedvisited.contains(ns)) {
			if (targetqn === null) {
				ownedvisited.add(ns)		
			}
			
			for (r: ns.ownedRelationship) {
				if (!scopeProvider.visited.contains(r)) {
					
					if (checkElementId(qn, checkIfAdded, r, ownedvisited, visited, includeImplicitGen, includeAll)) {
						return true
					}
					
					if (r instanceof Membership) {

						// Note: Proxy resolution for memberElement may result in recursive name resolution
						// (and getting the memberName may also result in accessing the memberElement).
						// In this case, the membership r should be excluded from the scope, to avoid a 
						// cyclic linking error.
						scopeProvider.addVisited(r)
						var memberElement = r.ownedMemberElement
						var elementName = 
							if (r.memberName !== null || (isFirstScope && ns == this.ns && memberElement === element)) r.memberName 
							else memberElement?.getEffectiveName
						if (elementName !== null) {
							val elementqn = qn.append(elementName)
							if ((includeAll || isInsideScope || r.visibility == VisibilityKind.PUBLIC || 
							     r.visibility == VisibilityKind.PROTECTED && scopingType !== null && 
							     scopingType.isInheritedProtected(ns)) &&
							     checkQualifiedName(elementqn, checkIfAdded)) {
							    // Delay proxy resolution of memberElement for as long as possible (if not caused by getting memberName).
							    // This can prevent the proxy from being spuriously marked as unresolvable during an earlier phase of the search. 
								memberElement = r.memberElement
								scopeProvider.removeVisited(r)
							    if (memberElement !== null && !memberElement.eIsProxy && 
							    	!redefined.contains(memberElement) && 
							    	visitQualifiedName(elementqn, r, memberElement, ownedvisited, visited, includeImplicitGen, includeAll)) {
									return true
								}
							}
						}
						scopeProvider.removeVisited(r)						
					}									
				}
			}
			ownedvisited.remove(ns)
		}
		return false
	}
	
	protected def checkElementId(QualifiedName qn, boolean checkIfAdded, Relationship r, Set<Namespace> ownedvisited, Set<Namespace> visited, 
		boolean includeImplicitGen, boolean includeAll) {
		val element =
			if (r instanceof Membership) r.getOwnedMemberElement
			else {
				// Note: This assumes ownership relationships will be binary.
				val ownedElements = r.ownedRelatedElement
				if (ownedElements !== null && !ownedElements.empty) ownedElements.get(0)
				else null
			}
		val elementId = element?.humanId
		if (elementId === null) false
		else {
			val elementqn = qn.append(elementId)
			checkQualifiedName(elementqn, checkIfAdded) && 
			visitQualifiedName(elementqn, r, element, ownedvisited, visited, includeImplicitGen, includeAll)
		}
	}
	
	protected def checkQualifiedName(QualifiedName elementqn, boolean checkIfAdded) {
		(targetqn === null || targetqn.startsWith(elementqn)) &&
		(!checkIfAdded || !visitedqns.contains(elementqn))
	}
	
	protected def addQualifiedName(QualifiedName elementqn, Relationship rel, Element memberElement) {
		visitedqns.add(elementqn)
		if (targetqn === null || targetqn == elementqn) {
			if (addName(elementqn, rel, memberElement)) {
				if (targetqn != elementqn && memberElement instanceof Namespace) {
					isShadowing = true
				}
				if (findFirst && targetqn == elementqn) {
					return true
				}
			}
		}
		false
	}
	
	protected def visitQualifiedName(QualifiedName elementqn, Relationship rel, Element memberElement, Set<Namespace> ownedVisited, Set<Namespace> visited, 
		boolean includeImplicitGen, boolean includeAll) {
		if (!memberElement.includeAsMember) {
			return false
		}
		if (addQualifiedName(elementqn, rel, memberElement)) {
			return true
		}		
		if (targetqn != elementqn) {
			if (memberElement instanceof Namespace) {
				isShadowing = true;
 				if (memberElement.resolve(elementqn, false, false, ownedVisited, visited, newHashSet, includeImplicitGen, includeAll)) {
 					return true;
 				}
			}
		}
		false
	}
	
	protected def boolean isInheritedProtected(Type general, Element protectedOwningNamespace) {
		isInheritedProtected(general, protectedOwningNamespace, newHashSet)
	}
	
	protected def boolean isInheritedProtected(Type general, Element protectedOwningNamespace, Set<Type> visited){
		visited.add(general);
		for(Type g: TypeUtil.getSupertypesOf(general)) {
			if (!visited.contains(g) && (g == protectedOwningNamespace || 
				 g.isInheritedProtected(protectedOwningNamespace, visited))) {
				return true
			}
		}
		return false; 
	}
	
	protected def boolean gen(Namespace ns, QualifiedName qn, Set<Namespace> visited, Set<Element> redefined, boolean includeImplicit) {
		if (ns instanceof Type) {
			val conjugator = ns.ownedConjugator
			if (conjugator !== null && !scopeProvider.visited.contains(conjugator)) {
				scopeProvider.addVisited(conjugator)
				val found = conjugator.originalType.resolveIfUnvisited(qn, false, visited, newHashSet, false, includeImplicit, false)
				scopeProvider.removeVisited(conjugator)
				if (found) {
					return true
				}
			}
			val newRedefined = new HashSet()
			if (redefined !== null) {
				newRedefined.addAll(redefined)
				newRedefined.addAll(ns.redefinedFeatures)
			}
			for (e: ns.ownedSpecialization) {
				if (!scopeProvider.visited.contains(e)) {
					// NOTE: Exclude the generalization e to avoid possible circular name resolution
					// when resolving a proxy for e.general.
					scopeProvider.addVisited(e)
					val found = e.general.resolveIfUnvisited(qn, false, visited, newRedefined, false, includeImplicit, false)
					scopeProvider.removeVisited(e)
					if (found) {
						return true
					}
				}
			}
			if (includeImplicit && !scopeProvider.visited.contains(ns)) {
				scopeProvider.addVisited(ns);
				var implicitTypes = TypeUtil.getImplicitGeneralTypesFor(ns);
				scopeProvider.removeVisited(ns)
				for (type : implicitTypes) {
					val found = type.resolveIfUnvisited(qn, false, visited, newRedefined, false, true, false)
					if (found) {
						return true
					}
				}
			}
			if (ns instanceof Feature) {
				val chainingFeature = FeatureUtil.getLastChainingFeatureOf(ns)
				if (chainingFeature !== null && 
					chainingFeature.resolveIfUnvisited(qn, false, visited, newRedefined, false, true, false)) {
					return true;
				}
			}
		}
		return false
	}
	
	protected def Set<Feature> redefinedFeatures(Type type) {
		type.ownedFeature.
			flatMap[feature|FeatureUtil.getRedefinedFeaturesWithComputedOf(feature, skip)].toSet
	}
	
	protected def boolean imp(Namespace ns, QualifiedName qn, boolean isInsideScope, Set<Namespace> visited, boolean includeImplicitGen, boolean includeAll) {
		for (e: ns.ownedImport) {
			if (!scopeProvider.visited.contains(e)) {
				if (includeAll || isInsideScope || e.visibility == VisibilityKind.PUBLIC) {
					if (ns instanceof org.omg.sysml.lang.sysml.Package) {
						if (!ns.filterCondition.isEmpty) {
							importingPackages.add(ns)
						}
					}
					// NOTE: Exclude the import e to avoid possible circular name resolution
					// when resolving a proxy for e.importedNamespace.
					scopeProvider.addVisited(e)
					val found = e.resolveImport(qn, visited, includeImplicitGen)
					scopeProvider.removeVisited(e)
					importingPackages.remove(ns)
					if (found) return true
				}
			}
		}
		return false
	}
	
	protected def boolean resolveImport(Import imp, QualifiedName qn, Set<Namespace> visited, boolean includeImplicitGen) {
		val name = imp.importedMemberName
		if (name === null) {
			return imp.importedNamespace.resolveIfUnvisited(qn, true, visited, newHashSet, imp.isRecursive, includeImplicitGen, imp.isImportAll)
		} else {
			// Find the memberships corresponding to the importedMemberName.
			val importScope = scopeProvider.scope_import(imp)
			val mems = (importScope as ISysMLScope).getMemberships(name, imp.isImportAll)
			
			for (mem: mems) {
				// Check if the targetqn resolves via the imported membership.
				val elm = mem.memberElement
				if (resolveForName(mem, elm, mem.memberName, qn, visited, includeImplicitGen, imp.isImportAll)) {
					return true
				}
				if (resolveForName(mem, elm, elm.humanId, qn, visited, includeImplicitGen, imp.isImportAll)) {
					return true
				}
								
				// If recursive, check recursively.
				if (elm instanceof Namespace && imp.isRecursive) {
					return (elm as Namespace).resolveIfUnvisited(qn, true, visited, newHashSet, true, false, imp.isImportAll)
				}
			}
				
			return false
		}			
	}
	
	protected def boolean resolveForName(Membership mem, Element elm, String name, QualifiedName qn, Set<Namespace> visited, boolean includeImplicitGen, boolean includeAll) {
		if (name !== null) {
			var elementqn = qn.append(name)			
			if (elementqn.checkQualifiedName(true) && 
				elementqn.visitQualifiedName(mem, elm, newHashSet, visited, includeImplicitGen, includeAll)) {
				return true
			}
		}	
		return false
	}
	
	protected def boolean resolveIfUnvisited(Namespace ns, QualifiedName qn, boolean checkIfAdded, Set<Namespace> visited, Set<Element> redefined, boolean isRecursive, boolean includeImplicitGen, boolean includeAll) {
		var found = false
		if (ns !== null && !ns.eIsProxy && !visited.contains(ns)) {
			visited.add(ns)
			found = ns.resolve(qn, checkIfAdded, false, newHashSet, visited, redefined, !isRecursive && includeImplicitGen, includeAll)
			if (!found && isRecursive) {
				found = resolveRecursive(ns, qn, visited, includeAll)
			}
			visited.remove(ns)
		}
		found
	}
	
	protected def boolean resolveRecursive(Namespace ns, QualifiedName qn, Set<Namespace> visited, boolean includeAll) {
		for (r: ns.ownedRelationship) {
			if (r instanceof Membership) {
				if (r.visibility == VisibilityKind.PUBLIC) {
					val memberElement = r.ownedMemberElement
					if (memberElement instanceof Namespace) {
						if (memberElement.resolveIfUnvisited(qn, false, visited, newHashSet, true, false, includeAll))
							return true
					}
				}					
			}
		}
		return false
	}

}
