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
import org.omg.sysml.lang.sysml.Class
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Feature
import org.omg.sysml.lang.sysml.Generalization
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.Redefinition
import org.omg.sysml.lang.sysml.Subset
import org.omg.sysml.lang.sysml.SysMLPackage
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import java.util.HashMap
import org.eclipse.xtext.util.Strings
import java.util.List

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
			case SysMLPackage.eINSTANCE.feature_Type: {
				return scope_Feature_type(context as Feature, reference)
			}
			case SysMLPackage.eINSTANCE.generalization_General: {
				if (context instanceof Generalization)
					return scope_Generalization_general(context as Generalization, reference)
			}
			case SysMLPackage.eINSTANCE.redefinition_RedefinedFeature: {
				if (context instanceof Redefinition)
					return scope_Redefinition_redefinedFeature(context as Redefinition, reference)
			}
			case SysMLPackage.eINSTANCE.subset_SubsettedFeature: {
				if (context instanceof Subset)
					return scope_Subset_subsettedFeature(context as Subset, reference)
			}
		}
		if (context instanceof Package) {
			return context.scope_Package(reference)
		}
		super.getScope(context, reference)
	}

	private def void accept(Package rootpack, QualifiedName rootqn, (QualifiedName, Element)=>void visitor) {
		//val visited = newHashSet()
		val newvisited = <Element, HashSet>newHashMap()
		val queue = newLinkedList(rootpack -> rootqn)
		
		while(!queue.empty){
			val next = queue.pop
			val pack = next.key
			val qn = next.value 
			//if (!visited.contains(pack)){
				//visited += pack
				val qns = newvisited.get(pack);
				pack.ownedMembership.forEach[m|
					var elementName = m.memberName ?: m.memberElement?.name;
					if (elementName !== null) {
						val elementqn = qn.append(elementName)
						System.out.println(elementqn);
						if(qns === null || !qns.contains(elementqn)){
							val memberElement = m.memberElement
							visitor.apply(elementqn, memberElement)
							newvisited.put(pack, newHashSet(elementqn));
							if (memberElement instanceof Package) {
								queue += memberElement -> elementqn
							}
						}
					}
				]
			//}
		}
		
	}

	private def void gen(Package pack, (QualifiedName, Element)=>void visitor, HashSet<Package> visit) {
		val visited = visit
		if (pack instanceof Class) {
			val c = pack as Class
			c.ownedElement.filter(Generalization).forEach [ e |
				if (e.general?.name !== null) {
					val container = e.general.owningNamespace
					if (container !== null && container instanceof Package) {
						val p = container as Package
						if (!visited.contains(p)) {
							visited.add(p)
							p.gen(visitor, visit)
							p.imp(visitor, visit)
						}
					}
					if (!visited.contains(e.general)) {
						visited.add(e.general)
						e.general.gen(visitor, visit)
						e.general.imp(visitor, visit)
						val qn = QualifiedName.create()
						visitor.apply(qn, e.general)
						e.general.accept(qn, visitor)
					}
				}
			]
		}
	}
	private def void gen2(Package pack, (QualifiedName, Element)=>void visitor, HashSet<Package> visit, HashMap<QualifiedName, Element> elements) {
		//??????????val visited = visit
		if (pack instanceof Package){
			System.out.println( "---------gen2 pack: " + pack)
			pack.ownedMembership.forEach[m|
				if (m.ownedMemberElement?.name !== null) {
					val memberElement = m.ownedMemberElement
					memberElement.ownedElement.filter(Generalization).forEach [ eg |
						var specializesAsText = NodeModelUtils.findNodesForFeature(eg as Generalization, SysMLPackage.Literals.GENERALIZATION__GENERAL);
						if ( specializesAsText.length !== 0 ){
							//System.out.println("!" + (eg.eContainer as Class).name + " specializes " + specializesAsText.head.text.trim());
							var generalQName = QualifiedName.create(Strings.split(specializesAsText.head.text.trim(), '::'))
							//System.out.println(generalQName);
							var newElements = getInherited(generalQName.toString(), elements, (eg.eContainer as Class).name ) //A's append to B
							elements.putAll(newElements)	
						}
					]
				}
			]
			System.out.println("pack's owned import");
			pack.ownedImport.forEach [ e | 
				System.out.println("e: " + e)
				if (e.importedPackage?.name !== null) {
					System.out.println("owningNamespace: " + e.importedPackage.owningNamespace)
					e.importedPackage.ownedMembership.forEach[m|
						if (m.ownedMemberElement?.name !== null) {
							val memberElement = m.ownedMemberElement
							memberElement.ownedElement.filter(Generalization).forEach [ eg |
								var specializesAsText = NodeModelUtils.findNodesForFeature(eg as Generalization, SysMLPackage.Literals.GENERALIZATION__GENERAL);
								System.out.println("!" + (eg.eContainer as Class).name + " specializes " + specializesAsText.head.text.trim());
								var generalQName = QualifiedName.create(Strings.split(specializesAsText.head.text.trim(), '::'))
								System.out.println("generalQname: " + generalQName);
								var newElements = getInherited(generalQName.toString(), elements, (eg.eContainer as Class).name ) //A's append to B
								elements.putAll(newElements)
							]
						}
					]
				}
			]
		}
	}
	
	private def HashMap<QualifiedName, Element> getInherited(String qnStartWith, HashMap<QualifiedName, Element> elements, String qnAppendTo){
		var newElements = newHashMap()
		var keys = elements.keySet;
		for ( var i = 0; i < keys.size; i++){
			if ( keys.get(i).toString().startsWith(qnStartWith + ".")){
				var suffix = keys.get(i).toString().substring(keys.get(i).toString().indexOf(qnStartWith + ".") + (qnStartWith.length+ 1), keys.get(i).toString().length);
				var value = elements.get(keys.get(i))
				newElements.put(QualifiedName.create(qnAppendTo).append(suffix), value)
			}
		}
		return newElements	
	}
	private def void imp(Package pack, (QualifiedName, Element)=>void visitor, HashSet<Package> visit) {
		val visited = visit
		pack.ownedImport.forEach [ e |
			if (e.importedPackage?.name !== null) {
				val container = e.importedPackage.owningNamespace
				if (container !== null && container instanceof Package) {
					val p = container as Package
					if (!visited.contains(p)) {
						visited.add(p)
						p.imp(visitor, visit)
						p.gen(visitor, visit)
					}
				}
			}
			if (!visited.contains(e.importedPackage)) {
				visited.add(e.importedPackage)
				e.importedPackage.imp(visitor, visit)
				e.importedPackage.gen(visitor, visit)
				val qn = QualifiedName.create()
				visitor.apply(qn, e.importedPackage)
				e.importedPackage.accept(qn, visitor)
			}
		]
	}

	def IScope scope_Package(Package pack, EReference reference) {
		val elements = <QualifiedName, Element>newHashMap()

		val visitor = [ QualifiedName qn, Element el |
			if (reference.EReferenceType.isInstance(el)) {
				if (!elements.containsKey(qn)){
					elements.put(qn, el)
				}
			}
			return
		]

		pack.accept(QualifiedName.create(), visitor)

		pack.gen(visitor, newHashSet)

		pack.imp(visitor, newHashSet)

		val outerscope = if ( /* Root package */ pack.eContainer === null) {
				pack.accept(QualifiedName.create().append(pack.name),visitor)
				globalScope.getScope(pack.eResource, reference, Predicates.alwaysTrue)
			} else {
				scope_Package(pack.parentPackage, reference /*, E */ )
			}
			
		//if repeated until elements size not change - to solve ordering problems
		var int previousCount;
		do {
			previousCount = elements.size();
			System.out.println(previousCount);
			pack.gen2(visitor, newHashSet, elements)
		} while( elements.size !== previousCount)
		
		
		System.out.println("===== start ============");
		elements.entrySet.forEach[ e | System.out.println(e.key);
			return
		]
		System.out.println("===== end ============");
		
		return new SimpleScope(outerscope, elements.entrySet.map [ entry |
			EObjectDescription.create(entry.key, entry.value)
		])
		
	}
	
	private def Package getParentPackage(Package pack) {
		var EObject container=pack.eContainer
		while(!(container instanceof Package)){
			container=container.eContainer
		}
		return (container as Package)
	}
	

	def IScope scope_Feature_type(Feature feature, EReference reference) {
		val clazz = feature.owningNamespace
		return clazz.scope_Package(reference)
	}

	def IScope scope_Generalization_general(Generalization general, EReference reference) {
		val clazz0 = general.owner as Class
		val clazz1 = clazz0.owningNamespace
		if (clazz1 === null)
			return super.getScope(general, reference)
		return clazz1.scope_Package(reference)
	}

	def IScope scope_Redefinition_redefinedFeature(Redefinition redefinition, EReference reference) {
		val feature = redefinition.owner as Feature
		val clazz1 = feature.owningNamespace
		if (clazz1 === null)
			return super.getScope(feature, reference)
		return clazz1.scope_Package(reference)
	}

	def IScope scope_Subset_subsettedFeature(Subset subset, EReference reference) {
		val feature = subset.owner as Feature
		val clazz1 = feature.owningNamespace
		if (clazz1 === null)
			return super.getScope(feature, reference)
		return clazz1.scope_Package(reference)
	}
}
