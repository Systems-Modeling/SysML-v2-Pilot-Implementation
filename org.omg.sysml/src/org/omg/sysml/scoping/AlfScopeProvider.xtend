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

import com.google.common.base.Predicates
import com.google.inject.Inject
import java.util.HashSet
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Generalization
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.Redefinition
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.Subsetting
import org.omg.sysml.lang.sysml.FeatureTyping
import org.omg.sysml.lang.sysml.Category

import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import java.util.HashMap
import org.eclipse.xtext.util.Strings
import org.omg.sysml.lang.sysml.VisibilityKind
import org.omg.sysml.lang.sysml.Membership
import java.util.Set
import org.eclipse.xtext.EcoreUtil2

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class AlfScopeProvider extends AbstractAlfScopeProvider {

	@Inject
	var IGlobalScopeProvider globalScope

	var Set<Membership> scopedMemberships = newHashSet
	
	override getScope(EObject context, EReference reference) {
		switch (reference) {
			case SysMLPackage.eINSTANCE.featureTyping_Type: {
				if (context instanceof FeatureTyping)
					return scope_FeatureTyping_type(context as FeatureTyping, reference)
			}
			case SysMLPackage.eINSTANCE.generalization_General, 
			case SysMLPackage.eINSTANCE.superclassing_Superclass: {
				if (context instanceof Generalization)
					return scope_Generalization_general(context as Generalization, reference)
			}
			case SysMLPackage.eINSTANCE.redefinition_RedefinedFeature: {
				if (context instanceof Redefinition)
					return scope_Redefinition_redefinedFeature(context as Redefinition, reference)
			}
			case SysMLPackage.eINSTANCE.subsetting_SubsettedFeature: {
				if (context instanceof Subsetting)
					return scope_Subsetting_subsettedFeature(context as Subsetting, reference)
			}
			case SysMLPackage.eINSTANCE.membership_MemberElement, 
			case SysMLPackage.eINSTANCE.featureMembership_MemberFeature,
			case SysMLPackage.eINSTANCE.parameterMembership_MemberParameter: {
				if (context instanceof Membership)
					return scope_Membership_memberElement(context as Membership, reference)
			}
		}
		if (context instanceof Package) {
			return new AlfScope(context, reference, scopedMemberships, this)
		}
		super.getScope(context, reference)
	}
	
	private def void accept(Package pack, QualifiedName qn, (QualifiedName, Element)=>boolean visitor, boolean checkIfAdded, boolean isInsideScope, HashSet<Package> visited) {
		if (!visited.contains(pack)) {
			visited.add(pack)
			pack.ownedMembership.forEach[m|
				if (!scopedMemberships.contains(m)) {
					val memberElement = m.memberElement
					val elementName = m.memberName ?: memberElement?.name
					if (elementName !== null && (isInsideScope || m.visibility == VisibilityKind.PUBLIC)) {
						val elementqn = qn.append(elementName)
						val added = visitor.apply(elementqn, memberElement)
						if ( !checkIfAdded || added) {
							if (memberElement instanceof Package) {
								accept(memberElement, elementqn, visitor, checkIfAdded, false, visited)
							}
						}
					}
				}
			]
			visited.remove(pack)
		}
	}

	private def void gen(Package pack, (QualifiedName, Element)=>boolean visitor, HashSet<Package> visit) {
		if (pack instanceof Category) {
			pack.ownedGeneralization.forEach [ e |
				if (e.general?.name !== null) {
					if (!visit.contains(e.general)) {
						visit.add(e.general)
						e.general.gen(visitor, visit)
						e.general.imp(visitor, visit, false)
						val qn = QualifiedName.create()
						e.general.accept(qn, visitor, false, false, newHashSet)
					}
				}
			]
		}
	}
	
	private def void loop2(Package pack, (QualifiedName, Element)=>boolean visitor, HashSet<Package> visit, 
		HashMap<Element, HashSet<QualifiedName>> elements) {
		
		if ( !visit.contains(pack)){ //to prevent CircleImport
			visit.add(pack)
			if (pack instanceof Package){
				pack.ownedMembership.forEach[m|
					if (m.ownedMemberElement?.name !== null) {
						val memberElement = m.ownedMemberElement
						if ( !visit.contains(memberElement)){	
							visit.add(memberElement as Package)
							memberElement.ownedRelationship.filter(Generalization).forEach [ eg | //FeatureType is subclass of Generalization
								var specializesAsText = NodeModelUtils.findNodesForFeature(eg as Generalization, SysMLPackage.Literals.SUPERCLASSING__SUPERCLASS);
								if ( specializesAsText.length !== 0 ){
									var generalQName = QualifiedName.create(Strings.split(specializesAsText.head.text.trim(), '::'))
									//TODO: support multiple inheritance
									getInherited(generalQName, elements, eg.eContainer as Element, visitor ) //A's append to B
								}
							]
						}
					}
				]
				pack.ownedImport.forEach [ e | 
					loop2(e.importedPackage, visitor, visit, elements)
				]
			}
		}
	}
	
	private def void getInherited(QualifiedName generalQName, HashMap<Element, HashSet<QualifiedName>> elements, Element generalEContainer,	(QualifiedName, Element)=>boolean visitor	){
		val qnStartWith = generalQName.toString()
		val qnAppendTo = generalEContainer.name
		val newElements = newArrayList
		elements.keySet.forEach[ keyElement| 
			var qns = elements.get(keyElement)
			for ( var i = 0; i < qns.size; i++){
				val sqn = qns.get(i).toString()
				if ( sqn.startsWith(qnStartWith + ".")){
					var suffix = sqn.substring(sqn.indexOf(qnStartWith + ".") + (qnStartWith.length+ 1), sqn.length);
					newElements.add(newArrayList(keyElement, QualifiedName.create(qnAppendTo).append(suffix)))
				}
			}
		]
		newElements.forEach[ne| visitor.apply(ne.get(1) as QualifiedName, ne.get(0) as Element)]
	}
	
	private def void imp(Package pack, (QualifiedName, Element)=>boolean visitor, HashSet<Package> visit, boolean checkIfAdded) {
		pack.ownedImport.forEach [ e |
			if (!visit.contains(e.importedPackage)) {
				visit.add(e.importedPackage)
				e.importedPackage.imp(visitor, visit, checkIfAdded)
				e.importedPackage.gen(visitor, visit)
				val qn = QualifiedName.create()
				e.importedPackage.accept(qn, visitor, checkIfAdded, false, newHashSet)
			}
		]
	}
	
	def IScope scope_Package(Package pack, EReference reference, Set<Membership> scopedMemberships) {
		val temp = newHashSet
		temp.addAll(this.scopedMemberships)
		this.scopedMemberships.clear
		this.scopedMemberships.addAll(scopedMemberships)
		val scope = scope_Package(pack, reference)
		this.scopedMemberships.clear
		this.scopedMemberships.addAll(temp)
		return scope
	}
	
	def IScope scope_Package(Package pack, EReference reference) {
		
		val elements = <Element, HashSet<QualifiedName>>newHashMap()
		val visited = newHashSet
		val visitor = [ QualifiedName qn, Element el |
			var added = true;
			if (reference.EReferenceType.isInstance(el)) {
				added = false;
				val qns = elements.get(el);
				if ( qns === null ) { 
					if ( !visited.contains(qn)){
						elements.put(el, newHashSet(qn))
						visited.add(qn)
						added = true
					}
				}
				else if ( !qns.contains(qn) ){ //elements contains more than one qualifiedName - test::A and test2::A have difference qns
					if( !visited.contains(qn)){
						qns.add(qn)
						elements.put(el, qns)
						visited.add(qn)
						added = true
					}
				}				
			}
			added
		]
		pack.accept(QualifiedName.create(), visitor, false, true, newHashSet)
		pack.gen(visitor, newHashSet)
		pack.imp(visitor, newHashSet, true)
		
		val outerscope = if ( /* Root package */ pack.eContainer === null) {
				if (pack.name !== null) {
					val qn = QualifiedName.create().append(pack.name)
					visitor.apply(qn, pack)
					pack.accept(qn, visitor, false, true, newHashSet)
				}
				globalScope.getScope(pack.eResource, reference, Predicates.alwaysTrue)
		} else {
			new AlfScope(pack.parentPackage, reference, scopedMemberships, this)
		}

		var int previousCount;
		do {
			previousCount = elements.values.flatten.size()
			pack.loop2(visitor, newHashSet, elements)
		} while( elements.values.flatten.size() > previousCount)
		
		if ( pack.eContainer === null){
			val newElements = newArrayList
			elements.entrySet.forEach[ entry |
				var qns = entry.value
				qns.forEach[qn| 
					if ( pack.name !== null && !qn.startsWith(QualifiedName.create(pack.name))) {
						newElements.add(newArrayList(entry.key, QualifiedName.create().append(pack.name).append(qn)))
					}
				]
			]
			newElements.forEach[ e| visitor.apply( e.get(1) as QualifiedName, e.get(0) as Element)]
		}
		
		val od = newArrayList
		elements.keySet.forEach[ key |
			val qns = elements.get(key)
			qns.forEach[qn |
				od.add(EObjectDescription.create(qn, key))
			]
		]
		return new SimpleScope(outerscope, od)
	}
	
	private def Package getParentPackage(Element element) {
		EcoreUtil2.getContainerOfType(element.eContainer, Package)
	}
	
	def IScope scope_Namespace(Element element, Package namespace, EReference reference) {
		if (namespace === null)
			return super.getScope(element, reference)		
		return new AlfScope(namespace, reference, scopedMemberships, this)
	}
	
	def IScope scope_owningNamespace(Element element, EReference reference) {
		return scope_Namespace(element, element?.parentPackage, reference)
	}

	def IScope scope_FeatureTyping_type(FeatureTyping featureTyping, EReference reference) {
		return scope_owningNamespace(featureTyping.typedFeature, reference)
	}

	def IScope scope_Generalization_general(Generalization generalization, EReference reference) {
		return scope_owningNamespace(generalization.specific, reference)
	}

	def IScope scope_Redefinition_redefinedFeature(Redefinition redefinition, EReference reference) {
		return scope_owningNamespace(redefinition.redefiningFeature, reference)
	}

	def IScope scope_Subsetting_subsettedFeature(Subsetting subset, EReference reference) {
		return scope_owningNamespace(subset.subsettingFeature, reference)
	}
	
	def IScope scope_Membership_memberElement(Membership membership, EReference reference) {
		scopedMemberships.add(membership) 
		val scope = scope_Namespace(membership, membership.membershipOwningPackage, reference)
		scopedMemberships.remove(membership)
		return scope
	}
}
