/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018 Model Driven Solutions, Inc.
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
 *  Zoltan Kiss
 *  Balazs Grill
 *  Ed Seidewitz
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

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class AlfScopeProvider extends AbstractAlfScopeProvider {

	@Inject
	var IGlobalScopeProvider globalScope

	override getScope(EObject context, EReference reference) {
		switch (reference) {
			case SysMLPackage.eINSTANCE.featureTyping_Type: {
				return scope_FeatureTyping_type(context as FeatureTyping, reference)
			}
			case SysMLPackage.eINSTANCE.generalization_General, case SysMLPackage.eINSTANCE.superclassing_Superclass: {
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
		}
		if (context instanceof Package) {
			return context.scope_Package(reference)
		}
		super.getScope(context, reference)
	}

	private def void accept(Package rootpack, QualifiedName rootqn, (QualifiedName, Element)=>void visitor, HashMap elements, boolean isInsideScope) {
		val newvisited = <Element, HashSet<QualifiedName>>newHashMap() //change to handle element with redefined/subset (is) name. 
		val queue = newLinkedList(rootpack -> rootqn)
		
		while(!queue.empty){
			val next = queue.pop
			val pack = next.key
			val qn = next.value 
			val qns = newvisited.get(pack);
			pack.ownedMembership.forEach[m|
				var elementName = m.memberName ?: m.memberElement?.name;
				if (elementName !== null && (isInsideScope && pack === rootpack|| m.visibility == VisibilityKind.PUBLIC)) {
					val elementqn = qn.append(elementName)
					newvisited.put(pack, newHashSet(elementqn));
				
					if(qns === null || !qns.contains(elementqn)){
						val memberElement = m.memberElement
						var originalsize = 0
						if (elements !== null) { originalsize = elements.values.flatten.size()}
						visitor.apply(elementqn, memberElement)
						if ( elements === null || elements.values.flatten.size() > originalsize) {
							if (memberElement instanceof Package) {
								queue += memberElement -> elementqn
							}
						}
					}
				}

			]
		}
	}

	private def void gen(Package pack, (QualifiedName, Element)=>void visitor, HashSet<Package> visit) {
		val visited = visit
		if (pack instanceof Category) {
			val c = pack as Category
			c.ownedRelationship.filter(Generalization).forEach [ e |
				if (e.general?.name !== null) {
					val container = e.general.owningNamespace
					if (container !== null && container instanceof Package) {
						val p = container as Package
						if (!visited.contains(p)) {
							visited.add(p)
							p.gen(visitor, visit)
							p.imp(visitor, visit, null)
						}
					}
					if (!visited.contains(e.general)) {
						visited.add(e.general)
						e.general.gen(visitor, visit)
						e.general.imp(visitor, visit, null)
						val qn = QualifiedName.create()
						visitor.apply(qn, e.general)
						e.general.accept(qn, visitor, null, false)
					}
				}
			]
		}
	}
	private def void loop2(Package pack, (QualifiedName, Element)=>void visitor, HashSet<Package> visit, 
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
	private def void getInherited(QualifiedName generalQName, HashMap<Element, HashSet<QualifiedName>> elements, Element generalEContainer,	(QualifiedName, Element)=>void visitor	){
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
	private def void imp(Package pack, (QualifiedName, Element)=>void visitor, HashSet<Package> visit, HashMap elements) {
		val visited = visit
		pack.ownedImport.forEach [ e |
			if (e.importedPackage?.name !== null) {
				val container = e.importedPackage.owningNamespace
				if (container !== null && container instanceof Package) {
					val p = container as Package
					if (!visited.contains(p)) {
						visited.add(p)
						p.imp(visitor, visit, elements)
						p.gen(visitor, visit)
					}
				}
			}
			if (!visited.contains(e.importedPackage)) {
				visited.add(e.importedPackage)
				e.importedPackage.imp(visitor, visit, elements)
				e.importedPackage.gen(visitor, visit)
				val qn = QualifiedName.create()
				visitor.apply(qn, e.importedPackage)
				e.importedPackage.accept(qn, visitor, elements, false)
			}
		]
	}

	def IScope scope_Package(Package pack, EReference reference) {
		
		val elements = <Element, HashSet<QualifiedName>>newHashMap()
		val visited = newHashSet
		val visitor = [ QualifiedName qn, Element el |
			if (reference.EReferenceType.isInstance(el)) {
				val qns = elements.get(el);
				if ( qns === null ) { 
					if ( !visited.contains(qn)){
						elements.put(el, newHashSet(qn))
						visited.add(qn)
					}
				}
				else if ( !qns.contains(qn) ){ //elements contains more than one qualifiedName - test::A and test2::A have difference qns
					if( !visited.contains(qn)){
						qns.add(qn)
						elements.put(el, qns)
						visited.add(qn)
					}
				}				
			}
			return
		]
		pack.accept(QualifiedName.create(), visitor, null, true)
		pack.gen(visitor, newHashSet)
		pack.imp(visitor, newHashSet, elements)
		
		val outerscope = if ( /* Root package */ pack.eContainer === null) {
				pack.accept(QualifiedName.create().append(pack.name), visitor, null, true)
				globalScope.getScope(pack.eResource, reference, Predicates.alwaysTrue)
		} else {
			scope_Package(pack.parentPackage, reference /*, E */ )
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
					if ( !qn.startsWith(QualifiedName.create(pack.name))) {
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
	
	private def Package getParentPackage(Package pack) {
		var EObject container=pack.eContainer
		while(!(container instanceof Package)){
			container=container.eContainer
		}
		return (container as Package)
	}
	

	def IScope scope_FeatureTyping_type(FeatureTyping featureTyping, EReference reference) {
		val namespace = featureTyping.typedFeature.owningNamespace
		return namespace.scope_Package(reference)
	}

	def IScope scope_Generalization_general(Generalization generalization, EReference reference) {
		val category = generalization.specific;
		val namespace = category.owningNamespace
		if (namespace === null)
			return super.getScope(category, reference)
		return namespace.scope_Package(reference)
	}

	def IScope scope_Redefinition_redefinedFeature(Redefinition redefinition, EReference reference) {
		val feature = redefinition.redefiningFeature
		val namespace = feature.owningNamespace
		if (namespace === null)
			return super.getScope(feature, reference)
		return namespace.scope_Package(reference)
	}

	def IScope scope_Subsetting_subsettedFeature(Subsetting subset, EReference reference) {
		val feature = subset.subsettingFeature
		val namespace = feature.owningNamespace
		if (namespace === null)
			return super.getScope(feature, reference)
		return namespace.scope_Package(reference)
	}
}
