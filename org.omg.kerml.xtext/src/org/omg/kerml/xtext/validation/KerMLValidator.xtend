/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018, 2019 Model Driven Solutions, Inc.
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
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.validation

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Import
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.VisibilityKind
import org.omg.sysml.lang.sysml.Superclassing
import org.omg.sysml.lang.sysml.Subsetting
import org.omg.sysml.lang.sysml.FeatureTyping
import org.omg.sysml.lang.sysml.impl.PackageImpl
import org.eclipse.xtext.EcoreUtil2

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class KerMLValidator extends AbstractKerMLValidator {

	protected def boolean isGlobalPublic(Element p) {
		var m = p.owningMembership
		while (m !== null) {
			if (m.visibility !== VisibilityKind.PUBLIC)
				return false
			m = m.membershipOwningPackage?.owningMembership
		}
		return true
	}

	public static val NOT_PUBLIC_MEMBERSHIP = 'notPublicMembership'

	protected def EObject filePackage(Element e) {
		EcoreUtil2.getRootContainer(e)
	}
	
	@Check
	def clearPackage(Package pack) {
		(pack as PackageImpl).clearCaches();
	}

	@Check
	def checkMembershipVisibility(Membership membership) {
		val elem = membership.memberElement
		if (elem !== membership.ownedMemberElement) {
			val elemPack = elem.filePackage
			val membershipPack = membership.membershipOwningPackage.filePackage
			if (membership.memberElement !== null && elemPack !== membershipPack &&
				!membership.memberElement.isGlobalPublic) {
				error("Referenced element is not visible in this scope", membership, SysMLPackage.eINSTANCE.membership_MemberElement,
					NOT_PUBLIC_MEMBERSHIP)
			}
		}
	}

	public static val NOT_PUBLIC_SUPERCLASS = 'notPublicSuperclass'

	@Check
	def checkInheritanceVisibility(Superclassing sup) {
		val ownerr = sup.owningRelatedElement
		val ownerrPack = ownerr.filePackage
		val superPack = sup.superclass.filePackage
		if (superPack !== null && ownerrPack !== superPack && !sup.superclass.isGlobalPublic) {
			error("Superclass is not visible in this scope", sup, SysMLPackage.eINSTANCE.superclassing_Superclass,
				NOT_PUBLIC_SUPERCLASS)
		}
	}

	public static val NOT_PUBLIC_FEATURE = 'notPublicFeature'

	@Check
	def checkSubsettingVisibility(Subsetting sub) {
		val ownerr = sub.owningRelatedElement
		val ownerrPack = ownerr.filePackage
		val featurePack = sub.subsettedFeature.filePackage
		if (ownerrPack !== featurePack && !sub.subsettedFeature.isGlobalPublic) {
			error("Subsetted/redefined feature is not visible in this scope", sub, SysMLPackage.eINSTANCE.subsetting_SubsettedFeature,
				NOT_PUBLIC_SUPERCLASS)
		}
	}

	public static val NOT_PUBLIC_FEATURE_TYPE = 'notPublicType'

	@Check
	def checkFeatureVisibility(FeatureTyping typing) {
		val type = typing.type
		val featurePack = typing.owningRelatedElement.filePackage
		val refPack = type.filePackage
		if (featurePack !== refPack && !type.isGlobalPublic) {
			error("Referenced type is not visible in this scope", typing,
				SysMLPackage.eINSTANCE.featureTyping_Type, NOT_PUBLIC_FEATURE_TYPE)
		}
	}
	public static val NOT_PUBLIC_IMPORT = 'notPublicImport'

	@Check
	def checkImportVisibility(Import imp) {
		val imported = imp.importedPackage
		val importedPack = imported.filePackage
		val importingPack = imp.owningRelatedElement.filePackage
		if (importedPack !== importingPack && !imported.isGlobalPublic) {
			error("Imported package is not visible from this context", imp, SysMLPackage.eINSTANCE.import_ImportedPackage,
				NOT_PUBLIC_IMPORT)
		}
	}

}
