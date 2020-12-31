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
import org.omg.sysml.lang.sysml.Usage
import org.omg.sysml.lang.sysml.Definition
import org.omg.sysml.lang.sysml.VariantMembership
import org.omg.sysml.lang.sysml.CaseUsage
import org.omg.sysml.lang.sysml.CaseDefinition
import org.omg.sysml.lang.sysml.AnalysisCaseUsage
import org.omg.sysml.lang.sysml.AnalysisCaseDefinition
import org.omg.sysml.lang.sysml.ParameterMembership
import org.omg.sysml.lang.sysml.VerificationCaseUsage
import org.omg.sysml.lang.sysml.VerificationCaseDefinition
import org.omg.sysml.lang.sysml.ViewUsage
import org.omg.sysml.lang.sysml.ViewDefinition
import org.omg.sysml.lang.sysml.ViewpointUsage
import org.omg.sysml.lang.sysml.ViewpointDefinition
import org.omg.sysml.lang.sysml.RenderingUsage
import org.omg.sysml.lang.sysml.RenderingDefinition
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.SubjectMembership
import org.omg.sysml.lang.sysml.ObjectiveMembership
import org.omg.sysml.lang.sysml.ReturnParameterMembership
import org.omg.sysml.lang.sysml.FeatureMembership
import org.omg.sysml.lang.sysml.RequirementVerificationMembership
import org.omg.sysml.lang.sysml.impl.RequirementVerificationMembershipImpl
import org.omg.sysml.lang.sysml.Namespace
import org.omg.sysml.lang.sysml.EnumerationDefinition
import org.omg.sysml.lang.sysml.EnumerationUsage

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
	
	public static val INVALID_USAGE_VARIANT = 'Invalid Usage - invalid variant'
	public static val INVALID_USAGE_VARIANT_MSG = 'A variant must be an owned member of a variation.'
	public static val INVALID_USAGE_VARIATION = 'Invalid Usage - invalid variation'
	public static val INVALID_USAGE_VARIATION_MSG = 'A variation must only have variant owned members.'
	
	public static val INVALID_ACTIONUSAGE = 'Invalid Action Usage - invalid type'
	public static val INVALID_ACTIONUSAGE_MSG = 'An action must be typed by action definitions.'
	public static val INVALID_ITEMUSAGE = 'Invalid Item Usage - invalid type'
	public static val INVALID_ITEMUSAGE_MSG = 'An item usage must be typed by item definitions.'
	public static val INVALID_PARTUSAGE = 'Invalid Block Property - invalid type'
	public static val INVALID_PARTUSAGE_MSG = 'A part usage must be typed by item definitions and at least one part definition.'
	public static val INVALID_CONSTRAINTUSAGE = 'Invalid Constraint Usage - invalid type'
	public static val INVALID_CONSTRAINTUSAGE_MSG = 'A constraint must be typed by one constraint definition.'
	public static val INVALID_INDIVIDUALUSAGE = 'Invalid IndividualUsage - invalid type'
	public static val INVALID_INDIVIDUALUSAGE_MSG = 'An individual must be typed by one individual definition.'
	public static val INVALID_CONNECTIONUSAGE = 'Invalid ConnectionUsage - invalid type'
	public static val INVALID_CONNECTIONUSAGE_MSG = 'A connection must be typed by connection definitions.'
	public static val INVALID_INTERFACEUSAGE = 'Invalid InterfaceUsage - invalid type'
	public static val INVALID_INTERFACEUSAGE_MSG = 'An interface must be typed by one interface definition.'
	public static val INVALID_PORTUSAGE = 'Invalid PortUsage - invalid type'
	public static val INVALID_PORTUSAGE_MSG = 'A port must be typed by one port definition.'
	public static val INVALID_REQUIREMENTUSAGE = 'Invalid RequirementUsage - invalid type'
	public static val INVALID_REQUIREMENTUSAGE_MSG = 'A requirement must be typed by one requirement definition.'
	public static val INVALID_STATEUSAGE = 'Invalid StateUsage - invalid type'
	public static val INVALID_STATEUSAGE_MSG = 'A state must be typed by state definitions.'
	public static val INVALID_ATTRIBUTEUSAGE = 'Invalid attribute usage - invalid type'
	public static val INVALID_ATTRIBUTEUSAGE_MSG = 'An attribute must be typed by attribute definitions.'
	public static val INVALID_ENUMERATIONATTRIBUTEUSAGE = 'Invalid attribute usage - too many enumeration types'
	public static val INVALID_ENUMERATIONATTRIBUTEUSAGE_MSG = 'An enumeration attribute cannot have more than one type.'
	public static val INVALID_ENUMERATIONUSAGE = 'Invalid enumeration usage - invalid type'
	public static val INVALID_ENUMERATIONUSAGE_MSG = 'An enumeration must be typed by one enumeration definition.'
	public static val INVALID_CALCULATIONUSAGE = 'Invalid CalculationUsage - invalid type'
	public static val INVALID_CALCULATIONUSAGE_MSG = 'A calculation must be typed by one calculation definition.'
	public static val INVALID_CASEUSAGE = 'Invalid CaseUsage - invalid type'
	public static val INVALID_CASEUSAGE_MSG = 'A case must be typed by one case definition.'
	public static val INVALID_ANALYSISCASEUSAGE = 'Invalid AnalysisCaseUsage - invalid type'
	public static val INVALID_ANALYSISCASEUSAGE_MSG = 'An analysis case must be typed by one analysis case definition.'
	public static val INVALID_VERIFICATIONCASEUSAGE = 'Invalid VerificationCaseUsage - invalid type'
	public static val INVALID_VERIFICATIONCASEUSAGE_MSG = 'A verification case must be typed by one verification case definition.'
	public static val INVALID_VIEWUSAGE = 'Invalid ViewUsage - invalid type'
	public static val INVALID_VIEWUSAGE_MSG = 'A view must be typed by one view definition.'
	public static val INVALID_VIEWPOINTUSAGE = 'Invalid ViewpointUsage - invalid type'
	public static val INVALID_VIEWPOINTUSAGE_MSG = 'A viewpoint must be typed by one viewpoint definition.'
	public static val INVALID_RENDERINGUSAGE = 'Invalid RenderingUsage - invalid type'
	public static val INVALID_RENDERINGUSAGE_MSG = 'A rendering must be typed by one rendering definition.'
	
	public static val INVALID_VIEWDEFINITION_RENDER = 'Invalid ViewDefinition - invalid render';
	public static val INVALID_VIEWDEFINITION_RENDER_MSG = 'A view definition may have at most one rendering.';
	public static val INVALID_VIEWUSAGE_RENDER = 'Invalid ViewUsage - invalid render';
	public static val INVALID_VIEWUSAGE_RENDER_MSG = 'A view may have at most one rendering.';
	
	public static val INVALID_SUBJECTMEMBERSHIP = 'Invalid SubjectMembership - too many';
	public static val INVALID_SUBJECTMEMBERSHIP_MSG = 'Only one subject is allowed.';
	public static val INVALID_OBJECTIVEMEMBERSHIP = 'Invalid ObjectiveMembership - too many';
	public static val INVALID_OBJECTIVEMEMBERSHIP_MSG = 'Only one objective is allowed.';	
	public static val INVALID_RETURNPARAMETERMEMBERSHIP = 'Invalid ReturnParameterMembership - too many'
	public static val INVALID_RETURNPARAMETERMEMBERSHIP_MSG = 'Only one return parameter is allowed.'
	public static val INVALID_REQUIREMENTVERIFICATIONMEMBERSHIP = 'Invalid RequirementVerificationMembership - not allowed.'
	public static val INVALID_REQUIREMENTVERIFICATIONMEMBERSHIP_MSG = 'A requirement verification must be in the objective of a verification case.'
	
	@Check
	def checkUsage(Usage usage) {
		val owningMembership = usage.owningMembership;
		val owningNamespace = owningMembership?.membershipOwningNamespace;
		
		if (owningMembership instanceof VariantMembership) {
			// A variant Usage must be owned by a variation
			if (!owningNamespace.isVariation) {
				error(org.omg.sysml.xtext.validation.SysMLValidator.INVALID_USAGE_VARIANT_MSG, SysMLPackage.eINSTANCE.element_OwningMembership, org.omg.sysml.xtext.validation.SysMLValidator.INVALID_USAGE_VARIANT)				
			}
		// A variation must not own non-variant Usages (except for parameters)
		} else if (owningNamespace.isVariation && !(owningMembership instanceof ParameterMembership)) {
				error(INVALID_USAGE_VARIATION_MSG, SysMLPackage.eINSTANCE.element_OwningMembership, org.omg.sysml.xtext.validation.SysMLValidator.INVALID_USAGE_VARIATION)							
		}
	}
	
	def boolean isVariation(Namespace namespace) {
		if (namespace instanceof Definition) namespace.isVariation
		else if (namespace instanceof Usage) namespace.isVariation
		else false
	}

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
		if (!(pu instanceof PortUsage || pu instanceof ConnectionUsage))
			if (checkAllTypes(pu, org.omg.sysml.lang.sysml.Class, SysMLValidator.INVALID_PARTUSAGE_MSG, SysMLPackage.eINSTANCE.itemUsage_ItemDefinition, SysMLValidator.INVALID_PARTUSAGE))
				checkAtLeastOneType(pu, PartDefinition, SysMLValidator.INVALID_PARTUSAGE_MSG, SysMLPackage.eINSTANCE.partUsage_PartDefinition, SysMLValidator.INVALID_PARTUSAGE)
	}
	@Check //Must have exactly one type, which is a Predicate.
	def checkConstraintUsageTypes(ConstraintUsage usg){
		if (!(usg instanceof RequirementUsage))
			checkOneType(usg, Predicate, SysMLValidator.INVALID_CONSTRAINTUSAGE_MSG, SysMLPackage.eINSTANCE.constraintUsage_ConstraintDefinition, SysMLValidator.INVALID_CONSTRAINTUSAGE)
	}
	@Check //Must have exactly one type, which is a Function.
	def checkCalculationUsageTypes(CalculationUsage usg){
		if (!(usg instanceof CaseUsage))
			checkOneType(usg, Function, SysMLValidator.INVALID_CALCULATIONUSAGE_MSG, SysMLPackage.eINSTANCE.calculationUsage_CalculationDefinition, SysMLValidator.INVALID_CALCULATIONUSAGE)
	}
	@Check //Must have exactly one type, which is a CaseDefinition.
	def checkCaseUsageTypes(CaseUsage usg){
		if (!(usg instanceof AnalysisCaseUsage || usg instanceof VerificationCaseUsage))
			checkOneType(usg, CaseDefinition, SysMLValidator.INVALID_CASEUSAGE_MSG, SysMLPackage.eINSTANCE.caseUsage_CaseDefinition, SysMLValidator.INVALID_CASEUSAGE)
	}
	@Check //Must have exactly one type, which is an AnalysisCaseDefinition.
	def checkAnalysisCaseUsageTypes(AnalysisCaseUsage usg){
		checkOneType(usg, AnalysisCaseDefinition, SysMLValidator.INVALID_ANALYSISCASEUSAGE_MSG, SysMLPackage.eINSTANCE.analysisCaseUsage_AnalysisCaseDefinition, SysMLValidator.INVALID_ANALYSISCASEUSAGE)
	}
	@Check //Must have exactly one type, which is a VerificationCaseDefinition.
	def checkVerificationCaseUsageTypes(VerificationCaseUsage usg){
		checkOneType(usg, VerificationCaseDefinition, SysMLValidator.INVALID_VERIFICATIONCASEUSAGE_MSG, SysMLPackage.eINSTANCE.verificationCaseUsage_VerificationCaseDefinition, SysMLValidator.INVALID_VERIFICATIONCASEUSAGE)
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
		if (!(usg instanceof EnumerationUsage)) {
		val types = (usg as FeatureImpl).allTypes
			if (types.exists[t | t instanceof EnumerationDefinition] && types.size > 1) {
				error(INVALID_ENUMERATIONATTRIBUTEUSAGE_MSG, SysMLPackage.eINSTANCE.attributeUsage_AttributeDefinition, SysMLValidator.INVALID_ENUMERATIONATTRIBUTEUSAGE)
			}
		}
	}
	@Check // Must have exactly one type, which is an EnumerationDefinition
	def checkEnumerationUsage(EnumerationUsage usg){
		checkOneType(usg, EnumerationDefinition, INVALID_ENUMERATIONUSAGE_MSG, SysMLPackage.eINSTANCE.enumerationUsage_EnumerationDefinition, INVALID_ENUMERATIONUSAGE)
	}
	@Check //Must have exactly one type, which is a ViewDefinition. Must have at most one rendering.
	def checkViewUsageTypes(ViewUsage usg){
		checkOneType(usg, ViewDefinition, SysMLValidator.INVALID_VIEWUSAGE_MSG, SysMLPackage.eINSTANCE.viewUsage_ViewDefinition, SysMLValidator.INVALID_VIEWUSAGE)
	}
	@Check //Must have exactly one type, which is a ViewpointDefinition. 
	def checkViewpointUsageTypes(ViewpointUsage usg){
		checkOneType(usg, ViewpointDefinition, SysMLValidator.INVALID_VIEWPOINTUSAGE_MSG, SysMLPackage.eINSTANCE.viewpointUsage_ViewpointDefinition, SysMLValidator.INVALID_VIEWPOINTUSAGE)
	}
	@Check //Must have exactly one type, which is a RenderingDefinition. 
	def checkRenderingUsageTypes(RenderingUsage usg){
		checkOneType(usg, RenderingDefinition, SysMLValidator.INVALID_RENDERINGUSAGE_MSG, SysMLPackage.eINSTANCE.renderingUsage_RenderingDefinition, SysMLValidator.INVALID_RENDERINGUSAGE)
	}
	
	@Check //Must have at most one rendering.
	def checkViewDefinitionRender(ViewDefinition viewDef){
		checkAtMostOneElement(viewDef.ownedFeature.filter[f|f instanceof RenderingUsage], INVALID_VIEWDEFINITION_RENDER_MSG, INVALID_VIEWDEFINITION_RENDER)
	}
	@Check //Must have at most one rendering.
	def checkViewUsageRender(ViewUsage viewUsg){
		checkAtMostOneElement(viewUsg.ownedFeature.filter[f|f instanceof RenderingUsage], INVALID_VIEWUSAGE_RENDER_MSG, INVALID_VIEWUSAGE_RENDER)
	}
	
	@Check //Must have at most one subject membership.
	def checkSubjectMembership(SubjectMembership mem) {
		checkAtMostOneFeature(SubjectMembership, mem, INVALID_SUBJECTMEMBERSHIP_MSG, INVALID_SUBJECTMEMBERSHIP)
	}
	
	@Check //Must have at most one objective requirement.
	def checkObjectiveMembership(ObjectiveMembership mem) {
		checkAtMostOneFeature(ObjectiveMembership, mem, INVALID_OBJECTIVEMEMBERSHIP_MSG, INVALID_OBJECTIVEMEMBERSHIP)
	}
	
	@Check // Must have at most one owned return parameter.
	def checkReturnMembership(ReturnParameterMembership mem) {
		checkAtMostOneFeature(ReturnParameterMembership, mem, INVALID_RETURNPARAMETERMEMBERSHIP_MSG, INVALID_RETURNPARAMETERMEMBERSHIP)
	}
	
	@Check // Must be owned by objective of verification case.
	def checkRequirementVerificationMembership(RequirementVerificationMembership mem) {
		if (!(mem as RequirementVerificationMembershipImpl).isLegalVerification()) {
			error(INVALID_REQUIREMENTVERIFICATIONMEMBERSHIP_MSG, null, org.omg.sysml.xtext.validation.SysMLValidator.INVALID_REQUIREMENTVERIFICATIONMEMBERSHIP)
		}
	}
	
	protected def boolean checkAtMostOneFeature(Class<?> kind, FeatureMembership mem, String msg, String eId) {
		val owningType = mem.owningType
		if (owningType !== null && owningType.ownedFeatureMembership.exists[m | kind.isInstance(m) && m != mem]) {
			error(msg, mem, SysMLPackage.eINSTANCE.featureMembership_OwnedMemberFeature, eId)
			return false
		}
		return true
	}
	
	protected def boolean checkAtMostOneElement(Iterable<? extends Element> elements, String msg, String eId) {
		if (elements.size <= 1) {
			return true;
		} else {
			for (var i = 1; i < elements.size; i++) {
				error(msg, elements.get(i), null, eId);			
			}
			return false;
		}
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
		if (setted_m instanceof MultiplicityRange && setting_m instanceof MultiplicityRange && setting_m.owningNamespace === sub.subsettingFeature) {
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
		// NOTE: Revised to use featuringTypes instead of owning types, but error messages not changed, because, for SysML user modeling
		// owning types are still what matters.
		if (sub instanceof Redefinition) {
			val subsettingFeaturingTypes = sub.subsettingFeature?.featuringType
			val subsettedFeaturingTypes = sub.subsettedFeature?.featuringType
			if (subsettingFeaturingTypes !== null && subsettedFeaturingTypes !== null) {
				if (subsettedFeaturingTypes.containsAll(subsettingFeaturingTypes) && 
					subsettedFeaturingTypes.size == subsettingFeaturingTypes.size){
					if (subsettingFeaturingTypes.isEmpty) {
						warning("A package-level feature should not be redefined", sub, 
							SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, SysMLValidator.INVALID_REDEFINITION_OWNINGTYPECONFORMANCE)
					} else {
						warning("Owner of redefining feature should not be the same as owner of redefined feature", sub, 
							SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, SysMLValidator.INVALID_REDEFINITION_OWNINGTYPECONFORMANCE)
					}
				}
				else if (!subsettedFeaturingTypes.forall[t | subsettingFeaturingTypes.exists[conformsTo(t)]]){
					warning("Owner of redefining feature should be a specialization of owner of redefined feature", sub, 
					SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, SysMLValidator.INVALID_REDEFINITION_OWNINGTYPECONFORMANCE)
				}
			}
		}
	}
	
	
}
