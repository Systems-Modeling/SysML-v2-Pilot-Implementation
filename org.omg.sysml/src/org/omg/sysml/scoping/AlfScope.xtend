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

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.IScope
import org.omg.sysml.lang.sysml.Package
import java.util.Set
import org.omg.sysml.lang.sysml.Element
import java.util.Map
import org.omg.sysml.lang.sysml.VisibilityKind
import org.omg.sysml.lang.sysml.Category
import org.omg.sysml.lang.sysml.Generalization
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.util.Strings
import org.omg.sysml.lang.sysml.SysMLPackage
import org.eclipse.xtext.resource.EObjectDescription
import org.omg.sysml.lang.sysml.Membership
import java.util.HashSet
import org.eclipse.xtext.scoping.impl.AbstractScope

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
	
	override getAllLocalElements() {
		val savedMemberships = scopeProvider.visitedMemberships
		scopeProvider.visitedMemberships = new HashSet(visitedMemberships)
		val elements = getLocalScopeElements()
		scopeProvider.visitedMemberships = savedMemberships
		return elements
	}
	
	private def getLocalScopeElements() {
		
		val elements = <Element, Set<QualifiedName>>newHashMap()
		val visited = newHashSet
		
		pack.owned(QualifiedName.create(), elements, false, true, newHashSet, visited)
		pack.gen(elements, newHashSet, visited)
		pack.imp(elements, true, newHashSet, visited)
		
		while(pack.loop2(elements, newHashSet, visited)) { }
		
		if (pack.name !== null && pack.eContainer === null) { // Root package
			val packQn = QualifiedName.create(pack.name)
			elements.addName(packQn, pack, visited)
			
			val newElements = <Pair<Element, QualifiedName>>newArrayList(
				elements.entrySet.flatMap[entry |
					entry.value.filter[!startsWith(packQn)].map[qn | 
						new Pair(entry.key, packQn.append(qn))
					]
				])
			
			newElements.forEach[e | elements.addName(e.value, e.key, visited)]
		}
		
		return elements.keySet.flatMap[key |
			elements.get(key).map[qn | EObjectDescription.create(qn, key)]
		]
	}
	
	private def boolean addName(Map<Element, Set<QualifiedName>> elements, QualifiedName qn, Element el, Set<QualifiedName> visited) {
		var added = true;
		if (reference.EReferenceType.isInstance(el)) {
			added = false;
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
		return added
	}
	
	private def void owned(Package pack, QualifiedName qn, Map<Element, Set<QualifiedName>> elements, boolean checkIfAdded, boolean isInsideScope, 
		Set<Package> visited, Set<QualifiedName> visitedQns) {
		if (!visited.contains(pack)) {
			visited.add(pack)
			pack.ownedMembership.forEach[m|
				if (!visitedMemberships.contains(m)) {
					val memberElement = m.memberElement
					val elementName = m.memberName ?: memberElement?.name
					if (elementName !== null && (isInsideScope || m.visibility == VisibilityKind.PUBLIC)) {
						val elementqn = qn.append(elementName)
						val added = elements.addName(elementqn, memberElement, visitedQns)
						if (!checkIfAdded || added) {
							if (memberElement instanceof Package) {
								memberElement.owned(elementqn, elements, checkIfAdded, false, visited, visitedQns)
							}
						}
					}
				}
			]
			visited.remove(pack)
		}
	}

	private def void gen(Package pack, Map<Element, Set<QualifiedName>> elements, Set<Package> visited, Set<QualifiedName> visitedQns) {
		if (pack instanceof Category) {
			pack.ownedGeneralization.forEach [e |
				if (e.general?.name !== null) {
					if (!visited.contains(e.general)) {
						visited.add(e.general)
						e.general.gen(elements, visited, visitedQns)
						e.general.imp(elements, false, visited, visitedQns)
						e.general.owned(QualifiedName.create(), elements, false, false, newHashSet, visitedQns)
					}
				}
			]
		}
	}
	
	private def void imp(Package pack, Map<Element, Set<QualifiedName>> elements, boolean checkIfAdded, Set<Package> visited, Set<QualifiedName> visitedQns) {
		pack.ownedImport.forEach [e |
			if (!visited.contains(e.importedPackage)) {
				visited.add(e.importedPackage)
				e.importedPackage.imp(elements, checkIfAdded, visited, visitedQns)
				e.importedPackage.gen(elements, visited, visitedQns)
				e.importedPackage.owned(QualifiedName.create(), elements, checkIfAdded, false, newHashSet, visitedQns)
			}
		]
	}
	
	private def boolean loop2(Package pack, Map<Element, Set<QualifiedName>> elements, Set<Package> visited, Set<QualifiedName> visitedQns) {
		var isAdded = false;
		
		if (!visited.contains(pack)){ //to prevent CircleImport
			visited.add(pack)
			for (m: pack.ownedMembership) {
				if (m.ownedMemberElement?.name !== null) {
					val memberElement = m.ownedMemberElement
					if (memberElement instanceof Package && !visited.contains(memberElement)){	
						visited.add(memberElement as Package)
						for (eg: memberElement.ownedRelationship.filter(Generalization)) { //FeatureTyping is subclass of Generalization
							var specializesAsText = NodeModelUtils.findNodesForFeature(eg as Generalization, SysMLPackage.Literals.SUPERCLASSING__SUPERCLASS);
							if ( specializesAsText.length !== 0 ){
								var generalQName = QualifiedName.create(Strings.split(specializesAsText.head.text.trim(), '::'))
								//TODO: support multiple inheritance
								if (getInherited(generalQName, elements, eg.eContainer as Element, visitedQns)) {  //A's append to B
									isAdded = true
								}
							}
						}
					}
				}
			}
			for (e: pack.ownedImport) { 
				if (loop2(e.importedPackage, elements, visited, visitedQns)) {
					isAdded = true
				}
			}
		}
		
		return isAdded
	}
	
	private def boolean getInherited(QualifiedName generalQName, Map<Element, Set<QualifiedName>> elements, Element generalEContainer, Set<QualifiedName> visitedQns){
		val qnStartWith = generalQName.toString()
		val qnAppendTo = generalEContainer.name
		val newElements = newArrayList
		elements.keySet.forEach[keyElement | 
			var qns = elements.get(keyElement)
			for (qn: qns) {
				val sqn = qn.toString()
				if (sqn.startsWith(qnStartWith + ".")) {
					var suffix = sqn.substring(sqn.indexOf(qnStartWith + ".") + (qnStartWith.length+1), sqn.length);
					newElements.add(new Pair(keyElement, QualifiedName.create(qnAppendTo).append(suffix)))
				}
			}
		]
		var isAdded = false
		for (ne: newElements) {
			if (elements.addName(ne.value, ne.key, visitedQns)) {
				isAdded = true
			}
		}
		return isAdded
	}
	
}
