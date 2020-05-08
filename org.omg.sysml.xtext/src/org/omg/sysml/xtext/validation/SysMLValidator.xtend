/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 California Institute of Technology/Jet Propulsion Laboratory
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
 *  Miyako Wilson, JPL
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/
package org.omg.sysml.xtext.validation


import org.eclipse.xtext.validation.Check
import org.omg.kerml.xtext.validation.KerMLValidator
import org.omg.sysml.lang.sysml.Subsetting
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.Redefinition
import org.omg.sysml.lang.sysml.MultiplicityRange
import org.omg.sysml.lang.sysml.LiteralInteger
import org.omg.sysml.lang.sysml.LiteralUnbounded
import org.omg.sysml.lang.sysml.Expression
import org.omg.sysml.lang.sysml.Multiplicity
import org.omg.sysml.lang.sysml.Connector

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SysMLValidator extends KerMLValidator {
	
	public static val INVALID_MULTIPLICITY_ILLEGALLOWERBOUND = 'Invalid Multiplicity - Illegal lower bound'
	
	public static val INVALID_SUBSETTING_OWNINGTYPECONFORMANCE = 'Invalid Subsetting - OwningType conformance'
	public static val INVALID_REDEFINITION_OWNINGTYPECONFORMANCE = 'Invalid Redefinition - OwningType conformance'
	public static val INVALID_SUBSETTING_MULTIPLICITYCONFORMANCE = 'Invalid Subsetting - Multiplicity conformance'
	public static val INVALID_REDEFINITION_MULTIPLICITYCONFORMANCE = 'Invalid Redefinition - Multiplicity conformance'
	public static val INVALID_SUBSETTING_UNIQUENESS_CONFORMANCE = 'Invalid Subsetting - Uniqueness conformance'
	
	@Check
	def checkMultiplicityLowerBound(Multiplicity mult) {
		if (mult instanceof MultiplicityRange && (mult as MultiplicityRange).getLowerBound() instanceof LiteralUnbounded) {
			error("Multiplicity lower bound cannot be *", SysMLPackage.eINSTANCE.multiplicityRange_LowerBound, 
				org.omg.sysml.xtext.validation.SysMLValidator.INVALID_MULTIPLICITY_ILLEGALLOWERBOUND
			);
		}		
	}
	
	@Check
	def checkSubsettingConformance(Subsetting sub) { 
		
		var subsettingOwningType = sub.subsettingFeature?.owningType
		var subsettedOwningType = sub.subsettedFeature?.owningType
		
		// Due to how connector is implemented, no validation is performed if the owner is a Connector.
		if ( subsettingOwningType instanceof Connector || subsettedOwningType instanceof Connector ) 
			return;

		// Multiplicity conformance
		
		var setted_m = sub.subsettedFeature?.multiplicity
		var setting_m = sub.subsettingFeature?.multiplicity
		var Expression setting_m_l = null;
		var Expression setting_m_u = null;
		
		// Only check multiplicity conformance if the subsettingFeature owns its multiplicity element.
		if (setted_m instanceof MultiplicityRange && setting_m instanceof MultiplicityRange && setting_m.owningType === sub.subsettingFeature) {
			var setted_m_l = (setted_m as MultiplicityRange)?.lowerBound
			var setted_m_u = (setted_m as MultiplicityRange)?.upperBound
			
			setting_m_l = (setting_m as MultiplicityRange)?.lowerBound
			setting_m_u = (setting_m as MultiplicityRange)?.upperBound
			
			// Lower bound (only check if the Subsetting is a Redefinition): setting must be >= setted
			if (sub instanceof Redefinition) {
				if (setting_m_l instanceof LiteralInteger && setted_m_l instanceof LiteralInteger && (setting_m_l as LiteralInteger).value < (setted_m_l as LiteralInteger).value) {
					error("Redefining feature cannot have smaller multiplicity lower bound", sub, 
						SysMLPackage.eINSTANCE.redefinition_RedefiningFeature, org.omg.sysml.xtext.validation.SysMLValidator.INVALID_REDEFINITION_MULTIPLICITYCONFORMANCE)
				}
			}
			
			// Upper bound: setting must be <= setted
			if (setting_m_u instanceof LiteralUnbounded && !(setted_m_u instanceof LiteralUnbounded) ||
				setting_m_u instanceof LiteralInteger && setted_m_u instanceof LiteralInteger && (setting_m_u as LiteralInteger).value > (setted_m_u as LiteralInteger).value) {
				error("Subsetting/redefining feature cannot have larger multiplicity upper bound", sub, 
						SysMLPackage.eINSTANCE.subsetting_SubsettingFeature, org.omg.sysml.xtext.validation.SysMLValidator.INVALID_SUBSETTING_MULTIPLICITYCONFORMANCE)
			}
		}

		// Uniqueness conformance
		if (sub.subsettedFeature !== null && sub.subsettedFeature.unique && sub.subsettingFeature !== null && !sub.subsettingFeature.unique){
			if (setting_m_u instanceof LiteralUnbounded || (setting_m_u as LiteralInteger).value > 1) {//less than or equal to 1 is ok
				error("Subsetting/redefining feature cannot be nonunique if subsetted/redefined feature is unique", sub, 
						SysMLPackage.eINSTANCE.subsetting_SubsettingFeature, org.omg.sysml.xtext.validation.SysMLValidator.INVALID_SUBSETTING_UNIQUENESS_CONFORMANCE)
			}
		}
					
		// Owning type conformance (only check for Redefinition)
		if (sub instanceof Redefinition) {
			if (subsettingOwningType == subsettedOwningType){
				if (subsettingOwningType === null) {
					error("A package-level feature cannot be redefined", sub, 
						SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, org.omg.sysml.xtext.validation.SysMLValidator.INVALID_REDEFINITION_OWNINGTYPECONFORMANCE)
				} else {
					error("Owner of redefining feature cannot be the same as owner of redefined feature", sub, 
						SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, org.omg.sysml.xtext.validation.SysMLValidator.INVALID_REDEFINITION_OWNINGTYPECONFORMANCE)
				}
			}
			else if (!subsettingOwningType.conformsTo(subsettedOwningType)){
				error("Owner of redefining feature must be a specialization of owner of redefined feature", sub, 
				SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, org.omg.sysml.xtext.validation.SysMLValidator.INVALID_REDEFINITION_OWNINGTYPECONFORMANCE)
			}
		}
	}
	
	
}
