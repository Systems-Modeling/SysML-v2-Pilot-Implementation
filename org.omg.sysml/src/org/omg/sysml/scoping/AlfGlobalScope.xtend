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
 *  Miyako Wilson, Georgia Tech
 * 
 *****************************************************************************/
package org.omg.sysml.scoping

import java.util.Map
import java.util.Set
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.omg.sysml.lang.sysml.Type
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.VisibilityKind
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.impl.SelectableBasedScope
import org.eclipse.xtext.resource.ISelectable
import org.eclipse.emf.ecore.EClass
import com.google.common.base.Predicate
import com.google.common.collect.Iterables


class AlfGlobalScope extends SelectableBasedScope {

	protected EClass referencteType	
	protected AlfGlobalScopeProvider scopeProvider
	protected QualifiedName targetqn;
	protected Map<Element, Set<QualifiedName>> elements
	protected Set<QualifiedName> visitedqns
	protected boolean findFirst = false;
	boolean isShadowing = false;
	//protected Map<QualifiedName, IEObjectDescription> inDefaultGlobalScope;
	protected Set<QualifiedName> inDefaultGlobalScope;
	
	
	static def createScope (IScope outer, ISelectable selectable, Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase, AlfGlobalScopeProvider scopeProvider) {
		if (selectable === null || selectable.isEmpty())
			return outer;

		return new AlfGlobalScope(outer, selectable, filter, type, ignoreCase, scopeProvider);
	}

	new(IScope parent, ISelectable selectable, Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase, AlfGlobalScopeProvider scopeProvider) {
		super(parent, selectable, filter, type, ignoreCase)
		referencteType = type;
		this.scopeProvider = scopeProvider;
	}

	override getSingleElement(QualifiedName name) {
		return  getSingleLocalElementByName(name)
		
	}
	override IEObjectDescription getSingleLocalElementByName(QualifiedName name) {
		var result = getLocalElementsByName(name);
		var iterator = result.iterator();
		if (iterator.hasNext())
			return iterator.next()
		else
		{  //try to find parent then find from inherited ones
			if( name.segmentCount > 1){
				var pname = name.skipLast(1)
				var e_parent = super.getSingleElement(pname);
				if ( e_parent === null)
				 	return null;
				var o_parent = e_parent.getEObjectOrProxy();
				if (o_parent instanceof Package) {
					targetqn = name
					findFirst = true
					(o_parent as Package).resolve(e_parent.qualifiedName, false, false ,newHashSet)					
					result = elements.keySet.flatMap[key |
						elements.get(key).map[qn | EObjectDescription.create(qn, key)]
					]
					if (!result.isEmpty) return result.get(0)
				}
			}
		}
		return null;
	}
	
	
	override getLocalElementsByName(QualifiedName name) {
		this.visitedqns = newHashSet
		this.elements = newHashMap	
		return super.getLocalElementsByName(name)
	}
	
	override getAllLocalElements() {
		this.visitedqns = newHashSet
		this.elements = newHashMap
		var defaultGlobalScope = super.getAllLocalElements()
	
		//option1: filter out "Base"
		var defaultGlobalScopeWithoutBase = defaultGlobalScope.filter[idec| !idec.qualifiedName.startsWith(QualifiedName.create("Base"))]
		//create HashSet so elements created by default global will not be added in this scope.
		this.inDefaultGlobalScope = newHashSet
		//defaultGlobalScopeWithoutBase.forEach[idec| inDefaultGlobalScope.add(idec.qualifiedName)]
		var iterator = defaultGlobalScopeWithoutBase.iterator();
		//Map<QualifiedName, List<IEObjectDescription> xx = 
			//StreamSupport.stream(defaultGlobalScopeWithoutBase.spliterator(), false)
			//.collect(Collectors.groupingBy[idec| idec.qualifiedName]) 
		

		//option2: include "Base" in the global Scope.		
		//this.inDefaultGlobalScope = defaultGlobalScope.map[idec| idec.qualifiedName].filter[str| !str.startsWith(QualifiedName.create("Base"))].toSet()
		//var iterator = defaultGlobalScope.iterator();

		var publicElementsInDefaultGlobalScope = newHashSet
		//iterator = inDefaultGlobalScope.values().iterator();
		while (iterator.hasNext()){
			var idesc = iterator.next()
			var eobject = idesc.getEObjectOrProxy();
			if (eobject instanceof Type) {
				if (isPublic(eobject)){
					publicElementsInDefaultGlobalScope.add(idesc)
					inDefaultGlobalScope.add(idesc.qualifiedName)
				}
				(eobject as Package).resolve(idesc.qualifiedName, false, false ,newHashSet)					
			}
		}
		var additionalScope = elements.keySet.flatMap[key |
									elements.get(key)
									.filter[qn |!inDefaultGlobalScope.contains(qn)]
									.map[qn | EObjectDescription.create(qn, key)]
								]
		return Iterables.concat(publicElementsInDefaultGlobalScope, additionalScope)
	}
	private def boolean isPublic(Element element) {
		if (element.owningMembership !== null && element.owningMembership.visibility !==  VisibilityKind.PUBLIC)
			return false
		else if (element.owner !== null)
			return isPublic (element.owner)
		else
			return true
	}
	protected def void addName(Map<Element, Set<QualifiedName>> elements, QualifiedName qn, Element el) {
		if (referencteType.isInstance(el)) {
			var qns = elements.get(el)
			if (qns === null) {
				//if (!inDefaultGlobalScope.contains(qn))
					elements.put(el, newHashSet(qn))
			} else {
				//if (!inDefaultGlobalScope.contains(qn))
					qns.add(qn)
			}					
		}
	}
	
	protected def boolean resolve(Package pack, QualifiedName qn, boolean checkIfAdded, boolean isInsideScope, Set<Package> visited) {
		if ( pack.owningMembership.visibility == VisibilityKind.PUBLIC) {
			pack.owned(qn, checkIfAdded, isInsideScope, newHashSet, visited) ||
			pack.gen(qn, visited) ||
			pack.imp(qn, isInsideScope, visited)
		}
	}
	protected def boolean owned(Package pack, QualifiedName qn, boolean checkIfAdded, boolean isInsideScope, Set<Package> ownedvisited, Set<Package> visited) {
		if (!ownedvisited.contains(pack)) {
			if (targetqn === null) {
				ownedvisited.add(pack)		
			}
			for (m: pack.ownedMembership) {
				if (!scopeProvider.visited.contains(m)) {
					var String elementName
					var Element memberElement
					
					// Note: Proxy resolution for memberElement may result in recursive name resolution
					// (and getting the memberName may also result in accessing the memberElement).
					// In this case, the membership m should be excluded from the scope, to avoid a 
					// cyclic linking error.
					scopeProvider.addVisited(m)
					
					try {
						memberElement = m.memberElement
						elementName = m.memberName 
					} finally {
						scopeProvider.removeVisited(m)
					}
									
					if (elementName !== null && (isInsideScope || m.visibility == VisibilityKind.PUBLIC)) {
						val elementqn = qn.append(elementName)
						if (targetqn === null || targetqn.startsWith(elementqn)) {
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
										isShadowing = true;
										
										// Note: If the resolution is for a single element, search the owned elements first and, if found, do
										// not search the inherited elements. This avoids a possible cyclic linking error if getting the 
										// superclass requires proxy resolution.
										if (memberElement.owned(elementqn, false, false, ownedvisited, visited)) {
											return true
										}
										if (memberElement.gen(elementqn, visited)) {
											return true;
										}
										if (memberElement.imp(elementqn, false, visited)){
											return true;
										}
									}
								}
							}
						}
					}
				}
			}
			ownedvisited.remove(pack)
		}
		return false
	}

	protected def boolean gen(Package pack, QualifiedName qn, Set<Package> visited) {
		if (pack instanceof Type) {
			for (e: pack.ownedGeneralization) {
				if (!scopeProvider.visited.contains(e)) {
					var found = false;
					// NOTE: Exclude the generalization e to avoid possible circular name resolution
					// when resolving a proxy for e.general.
					scopeProvider.addVisited(e)
					if (e.general !== null && !visited.contains(e.general)) {
						visited.add(e.general)
						found = e.general.resolve(qn, false, false, visited)
						visited.remove(e.general)
					}
					scopeProvider.removeVisited(e)					
					if (found) {
						return true
					}
					
				}
			}
		}
		return false
	}
	protected def boolean imp(Package pack, QualifiedName qn, boolean isInsideScope, Set<Package> visited) {
		for (e: pack.ownedImport) {
			if (!scopeProvider.visited.contains(e)) {
				var found = false;
				// NOTE: Exclude the import e to avoid possible circular name resolution
				// when resolving a proxy for e.importedPackage.
				scopeProvider.addVisited(e)
				if (e.importedPackage !== null && !visited.contains(e.importedPackage) &&
					(isInsideScope || e.visibility == VisibilityKind.PUBLIC)) {
					visited.add(e.importedPackage)
					found = e.importedPackage.resolve(qn, true, false, visited)
					visited.remove(e.importedPackage)
				}
				scopeProvider.removeVisited(e)
				if (found) {
					return true
				}
			}
		}
		return false
	}
	
}