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
package org.omg.sysml.validation

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Feature
import org.omg.sysml.lang.sysml.Generalization
import org.omg.sysml.lang.sysml.Import
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.VisibilityKind

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class AlfValidator extends AbstractAlfValidator {

	protected def boolean isGlobalPublic(Element p) {
		var m = p.owningMembership
		while (m !== null) {
			if (m.visibility !== VisibilityKind.PUBLIC)
				return false
			m = m.membershipOwningPackage?.owningMembership
		}
		return true
	}

	public static val NOT_PUBLIC_MEMBERSHIP = 'notPublicImport'

	protected def EObject filePackage(Element e) {
		var pack = e
		while (pack.owner !== null) {
			pack = pack.owner
		}
		return pack
	}

	@Check
	def checkMembershipVisibility(Membership membership) {
		val elem = membership.memberElement
		val elemPack = elem.filePackage
		val membershipPack = membership.filePackage
		if (membership.memberElement !== null && elemPack !== membershipPack &&
			!membership.memberElement.isGlobalPublic) {
			error("Referenced element is not visible in this scope", membership, SysMLPackage.eINSTANCE.membership_MemberElement,
				NOT_PUBLIC_MEMBERSHIP)
		}
	}

	public static val NOT_PUBLIC_INHERITANCE = 'notPublicImport'

	@Check
	def checkInheritanceVisibility(Generalization gen) {
		val ownerr = gen.owner
		val ownerrPack = ownerr.filePackage
		val generalPack = gen.general.filePackage
		if (ownerrPack !== generalPack && !gen.general.isGlobalPublic) {
			error("Inherited import is not visible in this scope", gen, SysMLPackage.eINSTANCE.generalization_General,
				NOT_PUBLIC_INHERITANCE)
		}
	}

	public static val NOT_PUBLIC_FEATURE_TYPE = 'notPublicFeature'

	@Check
	def checkFeatureVisibility(Feature feature) {
		val refs = feature.type.toSet
		val featurePack = feature.filePackage
		refs.forEach [ e |
			val refPack = e.filePackage
			if (featurePack !== refPack && !e.isGlobalPublic) {
				error("Referenced type is not visible in this scope", feature,
					SysMLPackage.eINSTANCE.feature_ReferencedType, NOT_PUBLIC_FEATURE_TYPE)
			}
		]
	}
	public static val NOT_PUBLIC_IMPORT = 'notPublicImport'

	@Check
	def checkImportVisibility(Import imp) {
		val imported = imp.importedPackage
		val importedPack = imported.filePackage
		val importingPack = imp.filePackage
		if (importedPack !== importingPack && !imported.isGlobalPublic) {
			error("Imported package is not visible from this context", imp, SysMLPackage.eINSTANCE.import_ImportedPackage,
				NOT_PUBLIC_IMPORT)
		}
	}

}
