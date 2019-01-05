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

	private def void accept(Package rootpack, QualifiedName rootqn, (QualifiedName, Element)=>void visitor) {
		val visited = newHashSet()
		val queue = newLinkedList(rootpack -> rootqn)
		
		while(!queue.empty){
			val next = queue.pop
			val pack = next.key
			val qn = next.value 
			if (!visited.contains(pack)){
				visited += pack
				pack.ownedMembership.forEach[m|
					var elementName = m.memberName ?: m.memberElement?.name;
					if (elementName !== null) {
						val elementqn = qn.append(elementName)
						val memberElement = m.memberElement
						visitor.apply(elementqn, memberElement)
						if (memberElement instanceof Package) {
							queue += memberElement -> elementqn
						}
					}
				]
			}
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
