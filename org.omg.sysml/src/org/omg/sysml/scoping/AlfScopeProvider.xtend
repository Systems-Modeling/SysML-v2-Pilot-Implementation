/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
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
 * 
 *****************************************************************************/
package org.omg.sysml.scoping

import com.google.common.base.Predicates
import com.google.inject.Inject
import java.util.Map
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
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.Redefinition
import org.omg.sysml.lang.sysml.Subset
import java.util.HashSet

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
			case SysMLPackage.eINSTANCE.feature_ReferencedType: {
				return scope_Feature_referencedType(context as Feature, reference)
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

	private def void accept(Package pack, QualifiedName qn, (QualifiedName, Element)=>void visitor) {
		pack.ownedMembership.forEach [ m |
			if (m.memberName !== null) {
				val elementqn = qn.append(m.memberName)
				val memberElement = m.memberElement
				visitor.apply(elementqn, memberElement)
				if (memberElement instanceof Package) {
					accept(memberElement, elementqn, visitor)
				}
			} else if (m.memberElement?.name !== null) {
				val elementqn = QualifiedName.create(m.memberElement.name)
				val memberElement = m.memberElement
				visitor.apply(elementqn, memberElement)
				if (memberElement instanceof Package) {
					accept(memberElement, elementqn, visitor)
				}
			} else if (m.ownedMemberElement?.name !== null) {
				val memberElement = m.ownedMemberElement
				val pqn = qn.append(memberElement.name)
				visitor.apply(pqn, memberElement)
				if (memberElement instanceof Package) {
					accept(memberElement, pqn, visitor)
				}
			}
		]
	}

	private def gen(Package pack, (QualifiedName, Element)=>void visitor, HashSet<Package> visit) {
		val visited = visit
		if (pack instanceof Class) {
			val c = pack as Class
			c.ownedElement.filter(Generalization).forEach [ e |
				if (e.general?.name !== null) {
					val containerMembership = e.general.owningMembership
					if (containerMembership !== null) {
						val container = containerMembership.owningPackage
						if (container !== null && container instanceof Package) {
							val p = container as Package
							if (!visited.contains(p)) {
								visited.add(p)
								p.gen(visitor, visit)
								p.imp(visitor, visit)
							}
						}
					}
					if (!visited.contains(e.general)) {
						visited.add(e.general)
						e.general.gen(visitor, visit)
						e.general.imp(visitor, visit)
					}
					val qn = QualifiedName.create()
					visitor.apply(qn, e.general)
					e.general.accept(qn, visitor)
				}
			]
		}
	}

	private def imp(Package pack, (QualifiedName, Element)=>void visitor, HashSet<Package> visit) {
		val visited = visit
		pack.ownedImport.forEach [ e |
			if (e.importedPackage?.name !== null) {
				val containerMembership = e.importedPackage.owningMembership
				if (containerMembership !== null) {
					val container = containerMembership.owningPackage
					if (container !== null && container instanceof Package) {
						val p = container as Package
						if (!visited.contains(p)) {
							visited.add(p)
							p.imp(visitor, visit)
							p.gen(visitor, visit)
						}
					}
				}

			}
			if (!visited.contains(e.importedPackage)) {
				visited.add(e.importedPackage)
				e.importedPackage.imp(visitor, visit)
				e.importedPackage.gen(visitor, visit)
			}
			val qn = QualifiedName.create()
			visitor.apply(qn, e.importedPackage)
			e.importedPackage.accept(qn, visitor)

		]
	}

	def IScope scope_Package(Package pack, EReference reference) {
		val elements = <QualifiedName, Element>newHashMap()

		val visitor = [ QualifiedName qn, Element el |
			if (reference.EReferenceType.isInstance(el)) {
				if (!elements.containsKey(qn))
					elements.put(qn, el)
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

	def IScope scope_Feature_referencedType(Feature feature, EReference reference) {
		val fmembership = feature.eContainer as Membership
		val clazz = fmembership.eContainer as Package
		return clazz.scope_Package(reference)
	}

	def IScope scope_Generalization_general(Generalization general, EReference reference) {
		val clazz0 = general.eContainer as Class
		val memb = clazz0.eContainer as Membership
		if (memb === null)
			return super.getScope(general, reference)
		val clazz1 = memb.eContainer as Package
		return clazz1.scope_Package(reference)
	}

	def IScope scope_Redefinition_redefinedFeature(Redefinition redefinition, EReference reference) {
		val feature = redefinition.eContainer as Feature
		val memb = feature.eContainer as Membership
		if (memb === null)
			return super.getScope(feature, reference)
		val clazz1 = memb.eContainer as Package
		return clazz1.scope_Package(reference)
	}

	def IScope scope_Subset_subsettedFeature(Subset subset, EReference reference) {
		val feature = subset.eContainer as Feature
		val memb = feature.eContainer as Membership
		if (memb === null)
			return super.getScope(feature, reference)
		val clazz1 = memb.eContainer as Package
		return clazz1.scope_Package(reference)
	}
}
