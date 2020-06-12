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
import org.omg.sysml.lang.sysml.ActionUsage
import org.omg.sysml.lang.sysml.Behavior
import org.omg.sysml.lang.sysml.impl.FeatureImpl
import org.omg.sysml.lang.sysml.ConstraintUsage
import org.omg.sysml.lang.sysml.IndividualUsage
import org.omg.sysml.lang.sysml.IndividualDefinition
import org.omg.sysml.lang.sysml.ConnectionUsage
import org.omg.sysml.lang.sysml.Feature
import org.eclipse.emf.ecore.EReference
import org.omg.sysml.lang.sysml.Predicate
import org.omg.sysml.lang.sysml.Association
import org.eclipse.emf.ecore.EStructuralFeature
import org.omg.sysml.lang.sysml.InterfaceUsage
import org.omg.sysml.lang.sysml.InterfaceDefinition
import org.omg.sysml.lang.sysml.PortDefinition
import org.omg.sysml.lang.sysml.RequirementDefinition
import org.omg.sysml.lang.sysml.RequirementUsage
import org.omg.sysml.lang.sysml.PortUsage
import org.omg.sysml.lang.sysml.StateUsage
import org.omg.sysml.lang.sysml.DataType
import org.omg.sysml.lang.sysml.Function
import org.omg.sysml.lang.sysml.PartUsage
import org.omg.sysml.lang.sysml.CalculationUsage
import org.omg.sysml.lang.sysml.AttributeUsage
import org.omg.sysml.lang.sysml.ItemUsage
import org.omg.sysml.lang.sysml.PartDefinition

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
	public static val INVALID_ACTIONUSAGE = 'Invalid Action Usage - invalid type'
	public static val INVALID_ACTIONUSAGE_MSG = 'An action must be typed by action definitions.'
	public static val INVALID_ITEMUSAGE = 'Invalid Item Usage - invalid type'
	public static val INVALID_ITEMUSAGE_MSG = 'An item usage must be typed by item definitions.'
	public static val INVALID_PARTUSAGE = 'Invalid Block Property - invalid type'
	public static val INVALID_PARTUSAGE_MSG = 'A part usage must be typed by item definitions and at least one part definition.'
	public static val INVALID_CONSTRINTUSAGE = 'Invalid Constraint Usage - invalid type'
	public static val INVALID_CONSTRINTUSAGE_MSG = 'A constraint must be typed by one constraint definition.'
	public static val INVALID_INDIVIDUALUSAGE = 'Invalid IndividualUsage - invalid type'
	public static val INVALID_INDIVIDUALUSAGE_MSG = 'An individual must be typed by one individual definition.'
	public static val INVALID_CONNECTIONUSAGE = 'Invalid ConnectionUsage - invalid type'
	public static val INVALID_CONNECTIONUSAGE_MSG = 'A connection must be typed by association blocks.'
	public static val INVALID_INTERFACEUSAGE = 'Invalid InterfaceUsage - invalid type'
	public static val INVALID_INTERFACEUSAGE_MSG = 'An interface must be typed by one interface definition.'
	public static val INVALID_PORTUSAGE = 'Invalid PortUsage - invalid type'
	public static val INVALID_PORTUSAGE_MSG = 'A port must be typed by one port definition.'
	public static val INVALID_REQUIREMENTUSAGE = 'Invalid RequirementUsage - invalid type'
	public static val INVALID_REQUIREMENTUSAGE_MSG = 'A requirement  must be typed by one requirement definition.'
	public static val INVALID_STATEUSAGE = 'Invalid StateUsage - invalid type'
	public static val INVALID_STATEUSAGE_MSG = 'A state must be typed by state definitions.'
	public static val INVALID_ATTRIBUTEUSAGE = 'Invalid attribute usage - invalid type'
	public static val INVALID_ATTRIBUTEUSAGE_MSG = 'An attribute usage must be typed by attribute definitions.'
	public static val INVALID_CALCULATIONUSAGE = 'Invalid CalculationUsage - invalid type'
	public static val INVALID_CALCULATIONUSAGE_MSG = 'A calculation must be typed by one calculation definition.'

	@Check //All types must be Behaviors
	def checkActionUsageTypes(ActionUsage usg){
		if (!(usg instanceof StateUsage|| usg instanceof CalculationUsage) )
			checkAllTypes(usg, Behavior, SysMLValidator.INVALID_ACTIONUSAGE_MSG, SysMLPackage.eINSTANCE.actionUsage_ActionDefinition, SysMLValidator.INVALID_ACTIONUSAGE)
	}	
	@Check //All types must be Classes. 
	def checkItemUsageTypes(ItemUsage iu){
		if (!(iu instanceof IndividualUsage || iu instanceof PartUsage))	
			checkAllTypes(iu, org.omg.sysml.lang.sysml.Class, SysMLValidator.INVALID_ITEMUSAGE_MSG, SysMLPackage.eINSTANCE.itemUsage_ItemDefinition, SysMLValidator.INVALID_ITEMUSAGE)
	}
	@Check //All types must be Classes, at least one must be a PartDefinition. 
	def checkPartUsageTypes(PartUsage pu){
		if (checkAllTypes(pu, org.omg.sysml.lang.sysml.Class, SysMLValidator.INVALID_PARTUSAGE_MSG, SysMLPackage.eINSTANCE.itemUsage_ItemDefinition, SysMLValidator.INVALID_PARTUSAGE))
			checkAtLeastOneType(pu, PartDefinition, SysMLValidator.INVALID_PARTUSAGE_MSG, SysMLPackage.eINSTANCE.partUsage_PartDefinition, SysMLValidator.INVALID_PARTUSAGE)
	}
	@Check //Must have exactly one type, which is a Predicate.
	def checkConstraintUsageTypes(ConstraintUsage usg){
		if (!(usg instanceof RequirementUsage))
			checkOneType(usg, Predicate, SysMLValidator.INVALID_CONSTRINTUSAGE_MSG, SysMLPackage.eINSTANCE.constraintUsage_ConstraintDefinition, SysMLValidator.INVALID_CONSTRINTUSAGE)
	}
	@Check //Must have exactly one type, which is a Function.
	def checkCalculationUsageTypes(CalculationUsage usg){
		checkOneType(usg, Function, SysMLValidator.INVALID_CALCULATIONUSAGE_MSG, SysMLPackage.eINSTANCE.calculationUsage_CalculationDefinition, SysMLValidator.INVALID_CALCULATIONUSAGE)
	}
	@Check //Must have exactly one type, which is an IndividualDefinition
	def checkIndividualUsageTypes(IndividualUsage usg){
		checkOneType(usg, IndividualDefinition, SysMLValidator.INVALID_INDIVIDUALUSAGE_MSG, SysMLPackage.eINSTANCE.individualUsage_IndividualDefinition, SysMLValidator.INVALID_INDIVIDUALUSAGE)
	}
	@Check //All types must be Associations.
	def checkConnectionUsageTypes(ConnectionUsage usg){
		if (!(usg instanceof InterfaceUsage))	
			checkAllTypes(usg, Association, SysMLValidator.INVALID_CONNECTIONUSAGE_MSG, SysMLPackage.eINSTANCE.connector_Association, SysMLValidator.INVALID_CONNECTIONUSAGE)
	}
	@Check //Must have exactly one type, which is an InterfaceDefinitions.
	def checkInterfaceUsageTypes(InterfaceUsage usg){
		checkOneType(usg, InterfaceDefinition, SysMLValidator.INVALID_INTERFACEUSAGE_MSG, SysMLPackage.eINSTANCE.interfaceUsage_InterfaceDefinition, SysMLValidator.INVALID_INTERFACEUSAGE)
	}
	@Check //Must have exactly one type, which is a PortDefinition. 
	def checkPortUsageTypes(PortUsage usg){
		checkOneType(usg, PortDefinition, SysMLValidator.INVALID_PORTUSAGE_MSG, SysMLPackage.eINSTANCE.portUsage_PortDefinition, SysMLValidator.INVALID_PORTUSAGE)
	}
	@Check  //Must have exactly one type, which is a RequirementDefinition. 
	def checkRequirementUsageTypes(RequirementUsage usg){
		checkOneType(usg, RequirementDefinition, SysMLValidator.INVALID_REQUIREMENTUSAGE_MSG, SysMLPackage.eINSTANCE.requirementUsage_RequirementDefinition, SysMLValidator.INVALID_REQUIREMENTUSAGE)
	}
	@Check //All types must be Behaviors.
	def checkStateDefinitionTypes(StateUsage usg){
		checkAllTypes(usg, Behavior, SysMLValidator.INVALID_STATEUSAGE_MSG, SysMLPackage.eINSTANCE.stateUsage_StateDefinition, SysMLValidator.INVALID_STATEUSAGE)
	}
	@Check //All types must be DataTypes.
	def checkAttributeUsageTypes(AttributeUsage usg){
		checkAllTypes(usg, DataType, SysMLValidator.INVALID_ATTRIBUTEUSAGE_MSG, SysMLPackage.eINSTANCE.attributeUsage_AttributeDefinition, SysMLValidator.INVALID_ATTRIBUTEUSAGE)
	}
	
	protected def boolean checkAllTypes(Feature f, Class<?> requiredType, String msg, EStructuralFeature ref, String eId){
		val check = (f as FeatureImpl).allTypes.forall[u| requiredType.isInstance(u)]
		if (!check)
			error (msg, ref, eId)
		return check;
	}
	
	protected def boolean checkAtLeastOneType(Feature f, Class<?> requiredType, String msg, EStructuralFeature ref, String eId){
		val check = (f as FeatureImpl).allTypes.exists[u| requiredType.isInstance(u)]
		if (!check)
			error (msg, ref, eId)
		return check
	}
	
	//check types but must have exactly one type
	protected def boolean checkOneType(Feature f, Class<?> requiredType, String msg, EReference ref, String eId){
		val types = (f as FeatureImpl).allTypes;
		val check = types.length == 1 && types.exists[u| requiredType.isInstance(u)]
		if (!check)
			error (msg, ref, eId)
		return check
	}
	
	@Check
	def checkMultiplicityLowerBound(Multiplicity mult) {
		if (mult instanceof MultiplicityRange && (mult as MultiplicityRange).getLowerBound() instanceof LiteralUnbounded) 
			error("Multiplicity lower bound cannot be *", SysMLPackage.eINSTANCE.multiplicityRange_LowerBound, SysMLValidator.INVALID_MULTIPLICITY_ILLEGALLOWERBOUND);
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
					warning("Redefining feature should not have smaller multiplicity lower bound", sub, 
						SysMLPackage.eINSTANCE.redefinition_RedefiningFeature, SysMLValidator.INVALID_REDEFINITION_MULTIPLICITYCONFORMANCE)
				}
			}
			
			// Upper bound: setting must be <= setted
			if (setting_m_u instanceof LiteralUnbounded && !(setted_m_u instanceof LiteralUnbounded) ||
				setting_m_u instanceof LiteralInteger && setted_m_u instanceof LiteralInteger && (setting_m_u as LiteralInteger).value > (setted_m_u as LiteralInteger).value) {
				warning("Subsetting/redefining feature should not have larger multiplicity upper bound", sub, 
						SysMLPackage.eINSTANCE.subsetting_SubsettingFeature, SysMLValidator.INVALID_SUBSETTING_MULTIPLICITYCONFORMANCE)
			}
		}

		// Uniqueness conformance
		if (sub.subsettedFeature !== null && sub.subsettedFeature.unique && sub.subsettingFeature !== null && !sub.subsettingFeature.unique){
			if (setting_m_u instanceof LiteralUnbounded || (setting_m_u as LiteralInteger).value > 1) {//less than or equal to 1 is ok
				warning("Subsetting/redefining feature should not be nonunique if subsetted/redefined feature is unique", sub, 
						SysMLPackage.eINSTANCE.subsetting_SubsettingFeature, SysMLValidator.INVALID_SUBSETTING_UNIQUENESS_CONFORMANCE)
			}
		}
					
		// Owning type conformance (only check for Redefinition)
		if (sub instanceof Redefinition) {
			if (subsettingOwningType == subsettedOwningType){
				if (subsettingOwningType === null) {
					warning("A package-level feature should not be redefined", sub, 
						SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, SysMLValidator.INVALID_REDEFINITION_OWNINGTYPECONFORMANCE)
				} else {
					warning("Owner of redefining feature should not be the same as owner of redefined feature", sub, 
						SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, SysMLValidator.INVALID_REDEFINITION_OWNINGTYPECONFORMANCE)
				}
			}
			else if (!subsettingOwningType.conformsTo(subsettedOwningType)){
				warning("Owner of redefining feature should be a specialization of owner of redefined feature", sub, 
				SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, SysMLValidator.INVALID_REDEFINITION_OWNINGTYPECONFORMANCE)
			}
		}
	}
	
	
}
