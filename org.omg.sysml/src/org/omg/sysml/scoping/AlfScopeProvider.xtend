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
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.omg.sysml.lang.sysml.Class
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Feature
import org.omg.sysml.lang.sysml.Generalization
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.SysMLPackage

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class AlfScopeProvider extends AbstractAlfScopeProvider {

	@Inject
	var IGlobalScopeProvider globalScope
	
	private def Map<String,Element> getElements(Package pack){
		pack.ownedMembership.toMap([m|
			if (m.name !== null){
				m.name
			} else{
				m.ownedMemberElement.name
			}
		],[m|
			if (m.memberElement !== null) {
				m.memberElement
			} else {
				m.ownedMemberElement
			}
		])
	}
	
	override getScope(EObject context, EReference reference) {
		if (reference === SysMLPackage.eINSTANCE.feature_ReferencedType ) {
			return scope_Feature_referencedType(context as Feature, reference)
		} else if (reference == SysMLPackage.eINSTANCE.generalization_General){
			if(context instanceof Generalization)
			return scope_Generalization_general(context as Generalization,reference)
		}
		super.getScope(context, reference)
	}

	private def void accept(Package pack, QualifiedName qn, (QualifiedName, Element)=>void visitor) {
//		pack.elements.forEach[n, e|
//			val elementqn = qn.append(n)
//			visitor.apply(elementqn, e)
//			if (e instanceof Package){
//				accept(e, elementqn, visitor)
//			}
//		]
		
		
		pack.ownedMembership.forEach [ m |
			if (m.memberName !== null) {
				val elementqn = qn.append(m.memberName)
				val memberElement = m.memberElement
				visitor.apply(elementqn, memberElement)
				if (memberElement instanceof Package) {
					accept(memberElement, elementqn, visitor)
				}			
			}else if(m.memberElement?.name!==null){
				val elementqn = QualifiedName.create(m.memberElement.name)
				val memberElement = m.memberElement
				visitor.apply(elementqn, memberElement)
				if (memberElement instanceof Package) {
					accept(memberElement, elementqn, visitor)
				}
			} else if(m.ownedMemberElement?.name !== null) {
				val memberElement = m.ownedMemberElement
				val pqn = qn.append(memberElement.name)
				visitor.apply(pqn, memberElement)
				if (memberElement instanceof Package) {
					accept(memberElement, pqn, visitor)
				}
			}
		]
	}
	
	def  IScope scope_Package(Package pack, EReference reference) {
		val elements = <Element, QualifiedName>newHashMap()

		val visitor = [QualifiedName qn, Element el | 
					if (reference.EReferenceType.isInstance(el)) {
						elements.put(el, qn)
					}
					return
				]

		ScopeTraverser.create.accept(pack, visitor)

		val outerscope = if ( /* Root package */ pack.eContainer === null) {
				globalScope.getScope(pack.eResource, reference, Predicates.alwaysTrue)
			} else {
				scope_Package(pack.parentPackage, reference/*, E */)
			}
		
		return Scopes.scopeFor(elements.keySet, [element|elements.get(element)], outerscope)
	}

	private def Package getParentPackage(Package pack) {
		pack.eContainer.eContainer as Package
	}

	def IScope scope_Feature_referencedType(Feature feature, EReference reference) {
		val fmembership = feature.eContainer as Membership
		val clazz = fmembership.eContainer as Package
		return clazz.scope_Package(reference)
	}
	
	def IScope scope_Generalization_general(Generalization general, EReference reference) {
		val clazz0 = general.eContainer as Class
		val memb = clazz0.eContainer as Membership
		if(memb===null)
			return super.getScope(general,reference)
		val clazz1 = memb.eContainer as Package
		return clazz1.scope_Package(reference)
	}

}