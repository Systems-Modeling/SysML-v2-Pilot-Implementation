/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018-2022 Model Driven Solutions, Inc.
 * Copyright (c) 2018-2020 California Institute of Technology/Jet Propulsion Laboratory
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

import com.google.inject.Inject
import java.util.HashSet
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractScope
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Feature
import org.omg.sysml.lang.sysml.Import
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.MembershipImport
import org.omg.sysml.lang.sysml.Namespace
import org.omg.sysml.lang.sysml.NamespaceImport
import org.omg.sysml.lang.sysml.OwningMembership
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.Type
import org.omg.sysml.lang.sysml.VisibilityKind
import org.omg.sysml.lang.sysml.util.ISysMLScope
import org.omg.sysml.util.FeatureUtil
import org.omg.sysml.util.NamespaceUtil
import org.omg.sysml.util.ScopeResultCache
import org.omg.sysml.util.TypeUtil

class KerMLScope extends AbstractScope implements ISysMLScope {
	
	@Inject
	IQualifiedNameConverter qualifiedNameConverter
	
	/*
	 * The following fields are fixed on construction.
	 */
	
	/**
	 * The namespace whose scope is represented by this KerMLScope.
	 */
	protected val Namespace ns
	
	/**
	 * The metatype of the elements to be included in the scope.
	 */
	protected val EClass referenceType	
	
	/**
	 * The KerMLScopeProvider that created this KerMLScope.
	 */
	protected val KerMLScopeProvider scopeProvider
	
	/**
	 * False if this scope was initialized from KerMLGlobalScope.
	 */
	protected val boolean isInsideScope
	
	/**
	 * Whether this is the most deeply nested (first) scope in chain of nested scopes.
	 */
	protected val boolean isFirstScope
	
	/**
	 * Whether this is the scope for the target of a Redefinition.
	 */
	protected val boolean isRedefinition
	
	/**
	 * An Element to be skipped during searching in this scope.
	 */
	protected val Element skip
	
	/**
	 * The context Element for this scope.
	 */
	protected val Element element
	
	/**
	 * The set of Packages traversed in an import chain during a resolution search.
	 * (Should be empty again at the end of each search.)
	 */
	protected val Set<Package> importingPackages = new HashSet()

	/* 
	 * The following fields are reset for each resolution search.
	 */
	 
	/**
	 * The QualifiedName being resolved. If null, then return all Elements in the scope.
	 */
	protected QualifiedName targetqn;
	
	/**
	 * A map of Elements to the QualifiedNames found for them in the scope.
	 */
	protected Map<Element, Set<QualifiedName>> elements
	
	/**
	 * The QualifiedNames that have already been seen during a resolution search.
	 */
	protected Set<QualifiedName> visitedqns
	
	/**
	 * If targetqn != null, then whether only the first Element found for the targetqn
	 * should be returned, or all matching Elements should be returned.
	 */
	protected boolean findFirst = false;
	
	/**
	 * Whether a shadowing name has been found during the current resolution search.
	 */
	protected boolean isShadowing = false;

	new(IScope parent, Namespace ns, EClass referenceType, KerMLScopeProvider scopeProvider, boolean isInsideScope, boolean isFirstScope, boolean isRedefinition, Element element, Element skip) {
		super(parent, false)
		this.ns = ns
		this.referenceType = referenceType
		this.scopeProvider = scopeProvider
		this.isInsideScope = isInsideScope
		this.isFirstScope = isFirstScope
		this.isRedefinition = isRedefinition
		this.element = element
		this.skip = skip
	}
	
	/**
	 * A qualified name is shadowed if its first segment name is shadowed.
	 */
	protected override isShadowed(IEObjectDescription input) {
		!resolveInScope(QualifiedName.create(input.name.firstSegment), true).isEmpty()
	}
	
	override getElement(String name) {
		var obj = EcoreUtil.resolve(getSingleElement(qualifiedNameConverter.toQualifiedName(name)).EObjectOrProxy, element)
		if (obj instanceof Element) obj else null
	}
	
	override getSingleElement(QualifiedName name) {
	    val scopeResultCache = ScopeResultCache.getInstance(ns)
	    
		val IEObjectDescription localResult = scopeResultCache.computeEObjectDescription(name, referenceType,
		    [ resolveInScope(name, true).head ], 
		    [result | !isShadowing && !isRedefinition && (scopeProvider.visited.isEmpty || result !== null)]
		)
		
		return if (localResult === null) {
		    if(parent !== null && !isShadowing) {
		        parent.getSingleElement(name)
	        } else null
        } else {
            localResult
        }
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
	 * truncated). [Called when "XPECT scope" is used in an Xpect test.]
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
		if (ns instanceof Type && isRedefinition) {
			// For a redefinition within a type, start resolution search with inherited members.
			ns.gen(QualifiedName.create(), newHashSet, null, true, true)
		} else {
			val includeAll = referenceType === SysMLPackage.eINSTANCE.membership && element instanceof Import && (element as Import).isImportAll
			ns.resolve(QualifiedName.create(), newHashSet, newHashSet, newHashSet, false, isInsideScope, true, true, includeAll)
		}
		if (targetqn !== null && skip !== null) {
			scopeProvider.removeVisited(skip)
		}
	}
	
	protected def boolean resolve(Namespace ns, QualifiedName qn, Set<Namespace> ownedVisited, Set<Namespace> visited, Set<Element> redefined, 
		boolean checkIfAdded, boolean isInsideScope, boolean isInheriting, boolean includeImplicitGen, boolean includeAll) {
		if (this.ns === ns || scopeProvider.libraryNamespaces.canContainMember(ns, qn, targetqn)) {
    		ns.owned(qn, ownedVisited, visited, redefined, checkIfAdded, isInsideScope, isInheriting, includeImplicitGen, includeAll) ||
    		ns.gen(qn, visited, redefined, isInheriting, includeImplicitGen) ||
    		ns.imp(qn, visited, isInsideScope, includeImplicitGen, includeAll)
		} else false
	}
	
	protected def boolean addName(QualifiedName qn, Membership mem, Element elm) {
		var el = elm
		if (referenceType !== SysMLPackage.eINSTANCE.membership && !referenceType.isInstance(el)) {
			return false
		} else {
			if (findFirst && referenceType === SysMLPackage.eINSTANCE.membership) {
				el = mem
			}
			val qns = elements.get(el)
			if (qns === null) {
				elements.put(el, newHashSet(qn))
			} else {
				qns.add(qn)
			}
			return true
		}
	}
	
	protected def boolean isIncludeAsMember(Element el) {
		importingPackages.forall[includeAsMember(el)]
	}
	
	protected def boolean owned(Namespace ns, QualifiedName qn, Set<Namespace> ownedvisited, Set<Namespace> visited, Set<Element> redefined, 
		boolean checkIfAdded, boolean isInsideScope, boolean isInheriting, boolean includeImplicitGen, boolean includeAll) {		
		if (!ownedvisited.contains(ns)) {
			if (targetqn === null) {
				ownedvisited.add(ns)		
			}
			
			NamespaceUtil.addAdditionalMembersTo(ns)
			for (mem: ns.ownedMembership.clone) { // Clone to avoid any possible ConcurrentModificationException.
				if (!scopeProvider.visited.contains(mem)) {
					if (includeAll || isInsideScope || mem.visibility == VisibilityKind.PUBLIC || 
						     mem.visibility == VisibilityKind.PROTECTED && isInheriting) {

						// Note: Proxy resolution may result in recursive name resolution. In this case, the
						// membership mem should be excluded from the scope, to avoid a cyclic linking error.
						scopeProvider.addVisited(mem)
						
						var memberName = 
							if (mem instanceof OwningMembership && isFirstScope && ns == this.ns && mem.memberElement === element) 
								mem.memberElement?.declaredName // Note: Don't use effective name.
							else mem.memberName
					
						if (checkElementName(memberName, qn, mem, ownedvisited, visited, redefined, checkIfAdded, includeImplicitGen, includeAll)) {
							return true
						}
						
						scopeProvider.addVisited(mem) // In case it was removed during the previous checkElementName call.
						
						var memberShortName = 
							if (mem instanceof OwningMembership && isFirstScope && ns == this.ns && mem.memberElement === element) 
								mem.memberElement?.declaredShortName // Note: Don't use effective shortName.
							else mem.memberShortName
					
						if (checkElementName(memberShortName, qn, mem, ownedvisited, visited, redefined, checkIfAdded, includeImplicitGen, includeAll)) {
							return true
						}
					
						scopeProvider.removeVisited(mem)						
					}					
				}
			}
			ownedvisited.remove(ns)
		}
		return false
	}
	
	protected def checkElementName(String elementName, QualifiedName qn, Membership mem, 
		Set<Namespace> ownedvisited, Set<Namespace> visited, Set<Element> redefined,
		boolean checkIfAdded, boolean includeImplicitGen, boolean includeAll) {
		if (elementName !== null) {
			val elementqn = qn.append(elementName)
			if (checkQualifiedName(elementqn, checkIfAdded)) {
			    // Delay proxy resolution of memberElement for as long as possible (if not caused by getting memberName).
			    // This can prevent the proxy from being spuriously marked as unresolvable during an earlier phase of the search. 
			    val memberElement = mem.memberElement
				scopeProvider.removeVisited(mem)
			    if (memberElement !== null && !memberElement.eIsProxy && 
			    	!redefined.contains(memberElement) && 
			    	visitQualifiedName(elementqn, mem, memberElement, ownedvisited, visited, includeImplicitGen, includeAll)) {
					return true
				}
			}
		}
		return false
	}
	
	protected def checkQualifiedName(QualifiedName elementqn, boolean checkIfAdded) {
		(targetqn === null || targetqn.startsWith(elementqn)) &&
		(!checkIfAdded || !visitedqns.contains(elementqn))
	}
	
	protected def addQualifiedName(QualifiedName elementqn, Membership mem, Element memberElement) {
		visitedqns.add(elementqn)
		if (targetqn === null || targetqn == elementqn) {
			if (addName(elementqn, mem, memberElement)) {
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
	
	protected def visitQualifiedName(QualifiedName elementqn, Membership mem, Element memberElement, Set<Namespace> ownedVisited, Set<Namespace> visited, 
		boolean includeImplicitGen, boolean includeAll) {
		if (!memberElement.includeAsMember) {
			return false
		}
		if (addQualifiedName(elementqn, mem, memberElement)) {
			return true
		}		
		if (targetqn != elementqn) {
			if (memberElement instanceof Namespace) {
				isShadowing = true;
 				if (memberElement.resolve(elementqn, ownedVisited, visited, newHashSet, false, false, false, includeImplicitGen, includeAll)) {
 					return true;
 				}
			}
		}
		false
	}
	
	protected def boolean gen(Namespace ns, QualifiedName qn, Set<Namespace> visited, Set<Element> redefined, boolean isInheriting, boolean includeImplicit) {
		if (ns instanceof Type) {
			val conjugator = ns.ownedConjugator
			if (conjugator !== null) {
				if (!scopeProvider.visited.contains(conjugator)) {
					scopeProvider.addVisited(conjugator)
					val found = conjugator.originalType.resolveIfUnvisited(qn, false, visited, newHashSet, false, false,
						includeImplicit, false)
					scopeProvider.removeVisited(conjugator)
					if (found) {
						return true
					}
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
					val found = e.general.resolveIfUnvisited(qn, false, visited, newRedefined, isInheriting, false, includeImplicit, false)
					scopeProvider.removeVisited(e)
					if (found) {
						return true
					}
				}
			}
			if (includeImplicit) {
				if (!scopeProvider.visited.contains(ns)){
					scopeProvider.addVisited(ns);
					var implicitTypes = TypeUtil.getImplicitGeneralTypesFor(ns);
					scopeProvider.removeVisited(ns)
					for (type : implicitTypes) {
						val found = type.resolveIfUnvisited(qn, false, visited, newRedefined, isInheriting, false, true, false)
						if (found) {
							return true
						}
					}
				}
			}
			
			if (ns instanceof Feature) {
				val chainingFeature = FeatureUtil.getLastChainingFeatureOf(ns)
				if (chainingFeature !== null && 
					chainingFeature.resolveIfUnvisited(qn, false, visited, newRedefined, isInheriting, false, true, false)) {
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
	
	protected def boolean imp(Namespace ns, QualifiedName qn, Set<Namespace> visited, boolean isInsideScope, boolean includeImplicitGen, boolean includeAll) {
		for (e: ns.ownedImport) {
			if (!scopeProvider.visited.contains(e)) {
				if (includeAll || isInsideScope || e.visibility == VisibilityKind.PUBLIC) {
					if (ns instanceof Package) {
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
		if (imp instanceof NamespaceImport) {
			return imp.importedNamespace.resolveIfUnvisited(qn, true, visited, newHashSet, false, imp.isRecursive, includeImplicitGen, imp.isImportAll)
		} else {
			val mem = (imp as MembershipImport).importedMembership
			
			// Check if the targetqn resolves via the imported membership.
			val elm = mem.memberElement
			if (resolveForName(mem, elm, mem.memberName, qn, visited, includeImplicitGen, imp.isImportAll)) {
				return true
			}
			if (resolveForName(mem, elm, mem.memberShortName, qn, visited, includeImplicitGen, imp.isImportAll)) {
				return true
			}
							
			// If recursive, check recursively.
			if (elm instanceof Namespace && imp.isRecursive) {
				return (elm as Namespace).resolveIfUnvisited(qn, true, visited, newHashSet, false, true, false, imp.isImportAll)
			}
				
			return false
		}			
	}
	
	protected def boolean resolveForName(Membership mem, Element elm, String name, QualifiedName qn, Set<Namespace> visited, 
		boolean includeImplicitGen, boolean includeAll) {
		if (name !== null) {
			var elementqn = qn.append(name)			
			if (elementqn.checkQualifiedName(true) && 
				elementqn.visitQualifiedName(mem, elm, newHashSet, visited, includeImplicitGen, includeAll)) {
				return true
			}
		}	
		return false
	}
	
	protected def boolean resolveIfUnvisited(Namespace ns, QualifiedName qn, boolean checkIfAdded, Set<Namespace> visited, Set<Element> redefined, 
		boolean isInheriting, boolean isRecursive, boolean includeImplicitGen, boolean includeAll) {
		var found = false
		if (ns !== null && !ns.eIsProxy && !visited.contains(ns)) {
			visited.add(ns)
			found = ns.resolve(qn, newHashSet, visited, redefined, checkIfAdded, false, isInheriting, !isRecursive && includeImplicitGen, includeAll)
			if (!found && isRecursive) {
				found = resolveRecursive(ns, qn, visited, includeAll)
			}
			visited.remove(ns)
		}
		found
	}
	
	protected def boolean resolveRecursive(Namespace ns, QualifiedName qn, Set<Namespace> visited, boolean includeAll) {
		for (r: ns.ownedRelationship) {
			if (r instanceof OwningMembership) {
				if (r.visibility == VisibilityKind.PUBLIC) {
					val memberElement = r.ownedMemberElement
					if (memberElement instanceof Namespace) {
						if (memberElement.resolveIfUnvisited(qn, false, visited, newHashSet, false, true, false, includeAll))
							return true
					}
				}					
			}
		}
		return false
	}

}
