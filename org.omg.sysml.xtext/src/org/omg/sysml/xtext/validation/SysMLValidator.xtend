/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 California Institute of Technology/Jet Propulsion Laboratory
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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

import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.validation.Check
import org.omg.kerml.xtext.validation.KerMLValidator
import org.omg.sysml.lang.sysml.ActionUsage
import org.omg.sysml.lang.sysml.AllocationDefinition
import org.omg.sysml.lang.sysml.AllocationUsage
import org.omg.sysml.lang.sysml.AnalysisCaseDefinition
import org.omg.sysml.lang.sysml.AnalysisCaseUsage
import org.omg.sysml.lang.sysml.Association
import org.omg.sysml.lang.sysml.AttributeUsage
import org.omg.sysml.lang.sysml.Behavior
import org.omg.sysml.lang.sysml.CalculationUsage
import org.omg.sysml.lang.sysml.CaseDefinition
import org.omg.sysml.lang.sysml.CaseUsage
import org.omg.sysml.lang.sysml.ConnectionUsage
import org.omg.sysml.lang.sysml.ConstraintUsage
import org.omg.sysml.lang.sysml.DataType
import org.omg.sysml.lang.sysml.Definition
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.EnumerationDefinition
import org.omg.sysml.lang.sysml.EnumerationUsage
import org.omg.sysml.lang.sysml.Feature
import org.omg.sysml.lang.sysml.FeatureMembership
import org.omg.sysml.lang.sysml.Function
import org.omg.sysml.lang.sysml.InterfaceDefinition
import org.omg.sysml.lang.sysml.InterfaceUsage
import org.omg.sysml.lang.sysml.ItemUsage
import org.omg.sysml.lang.sysml.Namespace
import org.omg.sysml.lang.sysml.ObjectiveMembership
import org.omg.sysml.lang.sysml.OccurrenceDefinition
import org.omg.sysml.lang.sysml.OccurrenceUsage
import org.omg.sysml.lang.sysml.ParameterMembership
import org.omg.sysml.lang.sysml.PartDefinition
import org.omg.sysml.lang.sysml.PartUsage
import org.omg.sysml.lang.sysml.PortDefinition
import org.omg.sysml.lang.sysml.PortUsage
import org.omg.sysml.lang.sysml.Predicate
import org.omg.sysml.lang.sysml.RenderingDefinition
import org.omg.sysml.lang.sysml.RenderingUsage
import org.omg.sysml.lang.sysml.RequirementDefinition
import org.omg.sysml.lang.sysml.RequirementUsage
import org.omg.sysml.lang.sysml.RequirementVerificationMembership
import org.omg.sysml.lang.sysml.ReturnParameterMembership
import org.omg.sysml.lang.sysml.StateUsage
import org.omg.sysml.lang.sysml.Step
import org.omg.sysml.lang.sysml.Structure
import org.omg.sysml.lang.sysml.SubjectMembership
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.Usage
import org.omg.sysml.lang.sysml.VariantMembership
import org.omg.sysml.lang.sysml.VerificationCaseDefinition
import org.omg.sysml.lang.sysml.VerificationCaseUsage
import org.omg.sysml.lang.sysml.ViewDefinition
import org.omg.sysml.lang.sysml.ViewUsage
import org.omg.sysml.lang.sysml.ViewpointDefinition
import org.omg.sysml.lang.sysml.ViewpointUsage
import org.omg.sysml.lang.sysml.TransitionUsage
import org.omg.sysml.lang.sysml.Succession
import org.omg.sysml.lang.sysml.StateDefinition
import org.omg.sysml.lang.sysml.Type
import org.omg.sysml.lang.sysml.StateSubactionKind
import org.omg.sysml.lang.sysml.UseCaseUsage
import org.omg.sysml.lang.sysml.UseCaseDefinition
import org.omg.sysml.lang.sysml.MetadataUsage
import org.omg.sysml.lang.sysml.Metaclass
import org.omg.sysml.util.FeatureUtil
import org.omg.sysml.util.UsageUtil

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SysMLValidator extends KerMLValidator {
	
	public static val INVALID_USAGE_VARIANT = 'Invalid Usage - invalid variant'
	public static val INVALID_USAGE_VARIANT_MSG = 'A variant must be an owned member of a variation.'
	public static val INVALID_USAGE_VARIATION = 'Invalid Usage - invalid variation'
	public static val INVALID_USAGE_VARIATION_MSG = 'A variation must only have variant owned members.'
	
	public static val INVALID_ATTRIBUTEUSAGE = 'Invalid attribute usage - invalid type'
	public static val INVALID_ATTRIBUTEUSAGE_MSG = 'An attribute must be typed by attribute definitions.'
	public static val INVALID_ENUMERATIONATTRIBUTEUSAGE = 'Invalid attribute usage - too many enumeration types'
	public static val INVALID_ENUMERATIONATTRIBUTEUSAGE_MSG = 'An enumeration attribute cannot have more than one type.'
	public static val INVALID_ENUMERATIONUSAGE = 'Invalid enumeration usage - invalid type'
	public static val INVALID_ENUMERATIONUSAGE_MSG = 'An enumeration must be typed by one enumeration definition.'
	public static val INVALID_OCCURRENCEUSAGE = 'Invalid OccurrenceUsage - invalid type'
	public static val INVALID_OCCURRENCEUSAGE_MSG = 'An occurrence must be typed by occurrence definitions.'
	public static val INVALID_ITEMUSAGE = 'Invalid Item Usage - invalid type'
	public static val INVALID_ITEMUSAGE_MSG = 'An item must be typed by item definitions.'
	public static val INVALID_PARTUSAGE = 'Invalid Part Usage - invalid type'
	public static val INVALID_PARTUSAGE_MSG = 'A part must be typed by item definitions and at least one part definition.'
	public static val INVALID_CONSTRAINTUSAGE = 'Invalid Constraint Usage - invalid type'
	public static val INVALID_CONSTRAINTUSAGE_MSG = 'A constraint must be typed by one constraint definition.'
	public static val INVALID_INDIVIDUALUSAGE = 'Invalid IndividualUsage - invalid type'
	public static val INVALID_INDIVIDUALUSAGE_MSG = 'An individual must be typed by one individual definition.'
	public static val INVALID_CONNECTIONUSAGE = 'Invalid ConnectionUsage - invalid type'
	public static val INVALID_CONNECTIONUSAGE_MSG = 'A connection must be typed by connection definitions.'
	public static val INVALID_INTERFACEUSAGE = 'Invalid InterfaceUsage - invalid type'
	public static val INVALID_INTERFACEUSAGE_MSG = 'An interface must be typed by interface definitions.'
	public static val INVALID_INTERFACEDEFINITION_END = 'Invalid InterfaceDefinition - invalid end'
	public static val INVALID_INTERFACEDEFINITION_END_MSG = 'An interface definition end must be a port.'
	public static val INVALID_INTERFACEUSAGE_END = 'Invalid InterfaceUsage - invalid end'
	public static val INVALID_INTERFACEUSAGE_END_MSG = 'An interface end must be a port.'
	public static val INVALID_ALLOCATIONUSAGE = 'Invalid AllocationUsage - invalid type'
	public static val INVALID_ALLOCATIONUSAGE_MSG = 'An allocation must be typed by allocation definitions.'
	public static val INVALID_PORTUSAGE = 'Invalid PortUsage - invalid type'
	public static val INVALID_PORTUSAGE_MSG = 'A port must be typed by port definitions.'
	public static val INVALID_REQUIREMENTUSAGE = 'Invalid RequirementUsage - invalid type'
	public static val INVALID_REQUIREMENTUSAGE_MSG = 'A requirement must be typed by one requirement definition.'
	public static val INVALID_ACTIONUSAGE = 'Invalid Action Usage - invalid type'
	public static val INVALID_ACTIONUSAGE_MSG = 'An action must be typed by action definitions.'
	public static val INVALID_STATEUSAGE = 'Invalid StateUsage - invalid type'
	public static val INVALID_STATEUSAGE_MSG = 'A state must be typed by state definitions.'
	public static val INVALID_STATEUSAGE_TRANSITIONS = 'Invalid StateUsage - no incoming transition'
	public static val INVALID_STATEUSAGE_TRANSITIONS_MSG = 'Should have an incoming transition.'
	public static val INVALID_STATEUSAGE_INITIAL = 'Invalid StateUsage - no initial transition'
	public static val INVALID_STATEUSAGE_INITIAL_MSG = 'Should have an initial transition from entry.'
	public static val INVALID_STATEDEFINITION_INITIAL = 'Invalid StateDefinition - no initial transition'
	public static val INVALID_STATEDEFINITION_INITIAL_MSG = 'Should have an initial transition from entry.'
	public static val INVALID_STATE_SUBACTION_MEMBERSHIP_ENTRY = 'Invalid StateSubactionMembership - invalid entry'
	public static val INVALID_STATE_SUBACTION_MEMBERSHIP_ENTRY_MSG = 'A state may have at most one entry action.'
	public static val INVALID_STATE_SUBACTION_MEMBERSHIP_DO = 'Invalid StateSubactionMembership - invalid do'
	public static val INVALID_STATE_SUBACTION_MEMBERSHIP_DO_MSG = 'A state may have at most one do action.'
	public static val INVALID_STATE_SUBACTION_MEMBERSHIP_EXIT = 'Invalid StateSubactionMembership - invalid exit'
	public static val INVALID_STATE_SUBACTION_MEMBERSHIP_EXIT_MSG = 'A state may have at most one exit action.'
	public static val INVALID_TRANSITIONUSAGE = 'Invalid TransitionUsage - in parallel state'
	public static val INVALID_TRANSITIONUSAGE_MSG = 'A parallel state cannot have successions or transitions.'
	public static val INVALID_CALCULATIONUSAGE = 'Invalid CalculationUsage - invalid type'
	public static val INVALID_CALCULATIONUSAGE_MSG = 'A calculation must be typed by one calculation definition.'
	public static val INVALID_CASEUSAGE = 'Invalid CaseUsage - invalid type'
	public static val INVALID_CASEUSAGE_MSG = 'A case must be typed by one case definition.'
	public static val INVALID_ANALYSISCASEUSAGE = 'Invalid AnalysisCaseUsage - invalid type'
	public static val INVALID_ANALYSISCASEUSAGE_MSG = 'An analysis case must be typed by one analysis case definition.'
	public static val INVALID_VERIFICATIONCASEUSAGE = 'Invalid VerificationCaseUsage - invalid type'
	public static val INVALID_VERIFICATIONCASEUSAGE_MSG = 'A verification case must be typed by one verification case definition.'
	public static val INVALID_USECASEUSAGE = 'Invalid UseCaseUsage - invalid type'
	public static val INVALID_USECASEUSAGE_MSG = 'A use case must be typed by one use case definition.'
	public static val INVALID_VIEWUSAGE = 'Invalid ViewUsage - invalid type'
	public static val INVALID_VIEWUSAGE_MSG = 'A view must be typed by one view definition.'
	public static val INVALID_VIEWPOINTUSAGE = 'Invalid ViewpointUsage - invalid type'
	public static val INVALID_VIEWPOINTUSAGE_MSG = 'A viewpoint must be typed by one viewpoint definition.'
	public static val INVALID_RENDERINGUSAGE = 'Invalid RenderingUsage - invalid type'
	public static val INVALID_RENDERINGUSAGE_MSG = 'A rendering must be typed by one rendering definition.'
	public static val INVALID_METADATAUSAGE = 'Invalid MetadataUsage - invalid type'
	public static val INVALID_METADATAUSAGE_MSG = 'A metadata usage must be typed by one metadata definition.'
	
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
				error(SysMLValidator.INVALID_USAGE_VARIANT_MSG, SysMLPackage.eINSTANCE.element_OwningMembership, SysMLValidator.INVALID_USAGE_VARIANT)				
			}
		// A variation must not own non-variant Usages (except for parameters)
		} else if (owningNamespace.isVariation && !(owningMembership instanceof ParameterMembership) && !(owningMembership instanceof ObjectiveMembership)) {
				error(INVALID_USAGE_VARIATION_MSG, SysMLPackage.eINSTANCE.element_OwningMembership, SysMLValidator.INVALID_USAGE_VARIATION)							
		}
	}
	
	def boolean isVariation(Namespace namespace) {
		if (namespace instanceof Definition) namespace.isVariation
		else if (namespace instanceof Usage) namespace.isVariation
		else false
	}

	@Check //All types must be DataTypes.
	def checkAttributeUsageTypes(AttributeUsage usg){
		checkAllTypes(usg, DataType, SysMLValidator.INVALID_ATTRIBUTEUSAGE_MSG, SysMLPackage.eINSTANCE.attributeUsage_AttributeDefinition, SysMLValidator.INVALID_ATTRIBUTEUSAGE)
		if (!(usg instanceof EnumerationUsage)) {
		val types = FeatureUtil.getAllTypesOf(usg)
			if (types.exists[t | t instanceof EnumerationDefinition] && types.size > 1) {
				error(INVALID_ENUMERATIONATTRIBUTEUSAGE_MSG, SysMLPackage.eINSTANCE.attributeUsage_AttributeDefinition, SysMLValidator.INVALID_ENUMERATIONATTRIBUTEUSAGE)
			}
		}
	}
	@Check // Must have exactly one type, which is an EnumerationDefinition
	def checkEnumerationUsageTypes(EnumerationUsage usg){
		checkOneType(usg, EnumerationDefinition, INVALID_ENUMERATIONUSAGE_MSG, SysMLPackage.eINSTANCE.enumerationUsage_EnumerationDefinition, INVALID_ENUMERATIONUSAGE)
	}
	@Check //All types must be Classes. 
	def checkOccurreceUsageTypes(OccurrenceUsage ou){
		if (!(ou instanceof ItemUsage || ou instanceof PortUsage || ou instanceof Step))	
			checkAllTypes(ou, org.omg.sysml.lang.sysml.Class, SysMLValidator.INVALID_OCCURRENCEUSAGE_MSG, SysMLPackage.eINSTANCE.occurrenceUsage_OccurrenceDefinition, SysMLValidator.INVALID_OCCURRENCEUSAGE)
	}
	@Check //All types must be Structures. 
	def checkItemUsageTypes(ItemUsage iu){
		if (!(iu instanceof PartUsage || iu instanceof PortUsage || iu instanceof MetadataUsage))	
			checkAllTypes(iu, Structure, SysMLValidator.INVALID_ITEMUSAGE_MSG, SysMLPackage.eINSTANCE.itemUsage_ItemDefinition, SysMLValidator.INVALID_ITEMUSAGE)
	}
	@Check //All types must be Structures, at least one must be a PartDefinition. 
	def checkPartUsageTypes(PartUsage pu){
		if (!(pu instanceof ConnectionUsage))
			if (checkAllTypes(pu, Structure, SysMLValidator.INVALID_PARTUSAGE_MSG, SysMLPackage.eINSTANCE.itemUsage_ItemDefinition, SysMLValidator.INVALID_PARTUSAGE))
				checkAtLeastOneType(pu, PartDefinition, SysMLValidator.INVALID_PARTUSAGE_MSG, SysMLPackage.eINSTANCE.partUsage_PartDefinition, SysMLValidator.INVALID_PARTUSAGE)
	}
	@Check //All types must be Behaviors
	def checkActionUsageTypes(ActionUsage usg){
		if (!(usg instanceof StateUsage || usg instanceof CalculationUsage) )
			checkAllTypes(usg, Behavior, SysMLValidator.INVALID_ACTIONUSAGE_MSG, SysMLPackage.eINSTANCE.actionUsage_ActionDefinition, SysMLValidator.INVALID_ACTIONUSAGE)
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
		if (!(usg instanceof AnalysisCaseUsage || usg instanceof VerificationCaseUsage || usg instanceof UseCaseUsage))
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
	@Check //Must have exactly one type, which is a UseCaseDefinition.
	def checkUseCaseUsageTypes(UseCaseUsage usg){
		checkOneType(usg, UseCaseDefinition, SysMLValidator.INVALID_USECASEUSAGE_MSG, SysMLPackage.eINSTANCE.useCaseUsage_UseCaseDefinition, SysMLValidator.INVALID_USECASEUSAGE)
	}
	@Check //Must have one occurrenceDefinition that is an individual.
	def checkIndividualUsageTypes(OccurrenceUsage usg){
		if (usg.isIndividual && usg.occurrenceDefinition.filter[t | t instanceof OccurrenceDefinition && (t as OccurrenceDefinition).isIndividual].size() != 1)
			error (SysMLValidator.INVALID_INDIVIDUALUSAGE_MSG, SysMLPackage.eINSTANCE.occurrenceUsage_OccurrenceDefinition, SysMLValidator.INVALID_INDIVIDUALUSAGE)	
	}
	@Check //All types must be Associations.
	def checkConnectionUsageTypes(ConnectionUsage usg){
		if (!(usg instanceof InterfaceUsage || usg instanceof AllocationUsage))	
			checkAllTypes(usg, Association, SysMLValidator.INVALID_CONNECTIONUSAGE_MSG, SysMLPackage.eINSTANCE.connector_Association, SysMLValidator.INVALID_CONNECTIONUSAGE)
	}
	@Check //All types must be InterfaceDefinitions.
	def checkInterfaceUsageTypes(InterfaceUsage usg){
		checkAllTypes(usg, InterfaceDefinition, SysMLValidator.INVALID_INTERFACEUSAGE_MSG, SysMLPackage.eINSTANCE.interfaceUsage_InterfaceDefinition, SysMLValidator.INVALID_INTERFACEUSAGE)
	}
	@Check //All types must be AllocationDefinitions.
	def checkAllocationUsageTypes(AllocationUsage usg){
		checkAllTypes(usg, AllocationDefinition, SysMLValidator.INVALID_ALLOCATIONUSAGE_MSG, SysMLPackage.eINSTANCE.connector_Association, SysMLValidator.INVALID_ALLOCATIONUSAGE)
	}
	@Check //All types must be PortDefinitions. 
	def checkPortUsageTypes(PortUsage usg){
		checkAllTypes(usg, PortDefinition, SysMLValidator.INVALID_PORTUSAGE_MSG, SysMLPackage.eINSTANCE.portUsage_PortDefinition, SysMLValidator.INVALID_PORTUSAGE)
	}
	@Check  //Must have exactly one type, which is a RequirementDefinition. 
	def checkRequirementUsageTypes(RequirementUsage usg){
		checkOneType(usg, RequirementDefinition, SysMLValidator.INVALID_REQUIREMENTUSAGE_MSG, SysMLPackage.eINSTANCE.requirementUsage_RequirementDefinition, SysMLValidator.INVALID_REQUIREMENTUSAGE)
	}
	@Check //All types must be Behaviors.
	def checkStateUsageTypes(StateUsage usg){
		checkAllTypes(usg, Behavior, SysMLValidator.INVALID_STATEUSAGE_MSG, SysMLPackage.eINSTANCE.stateUsage_StateDefinition, SysMLValidator.INVALID_STATEUSAGE)
	}
	@Check //Must have exactly one type, which is a ViewDefinition.
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
	
	@Check //Must have exactly one type, which is a Metaclass. 
	def checkMetadataUsageTypes(MetadataUsage usg){
		checkOneType(usg, Metaclass, SysMLValidator.INVALID_METADATAUSAGE_MSG, SysMLPackage.eINSTANCE.metadataUsage_MetadataDefinition, SysMLValidator.INVALID_METADATAUSAGE)
	}

	@Check //Ends must be ports
	def checkInterfaceDefinitionEnds(InterfaceDefinition usg) {
		for (end: usg.ownedFeature.filter[isEnd]) {
			if (!(end instanceof PortUsage)) {
				error(INVALID_INTERFACEDEFINITION_END_MSG, end, null, INVALID_INTERFACEDEFINITION_END)
			}
		}
	}
	
	@Check //Ends must be ports
	def checkInterfaceUsageEnds(InterfaceUsage usg) {
		for (end: usg.ownedFeature.filter[isEnd]) {
			if (!(end instanceof PortUsage)) {
				error(INVALID_INTERFACEUSAGE_END_MSG, end, null, INVALID_INTERFACEUSAGE_END)
			}
		}
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
		if (!UsageUtil.isLegalVerification(mem)) {
			error(INVALID_REQUIREMENTVERIFICATIONMEMBERSHIP_MSG, null, INVALID_REQUIREMENTVERIFICATIONMEMBERSHIP)
		}
	}
	
	@Check
	def checkStateDefinition(StateDefinition defn) {
		checkStateSubactions(defn);
	}
	
	@Check
	def checkStateUsage(StateUsage usg) {
//		val owningType = usg.owningType
//		if (owningType !== null && !owningType.isAbstract && usg.isComposite && 
//			UsageUtil.isNonParallelState(owningType) && !UsageUtil.hasIncomingTransitions(usg)
//		) {
//			warning(INVALID_STATEUSAGE_TRANSITIONS_MSG, usg, null, INVALID_STATEUSAGE_TRANSITIONS)
//		}
		checkStateSubactions(usg)
	}
	
	protected def checkStateSubactions(Type type) {
		checkAtMostOneElement(UsageUtil.getStateSubactionMembershipsOf(type, StateSubactionKind.ENTRY), INVALID_STATE_SUBACTION_MEMBERSHIP_ENTRY_MSG, INVALID_STATE_SUBACTION_MEMBERSHIP_ENTRY);
		checkAtMostOneElement(UsageUtil.getStateSubactionMembershipsOf(type, StateSubactionKind.DO), INVALID_STATE_SUBACTION_MEMBERSHIP_DO_MSG, INVALID_STATE_SUBACTION_MEMBERSHIP_DO);
		checkAtMostOneElement(UsageUtil.getStateSubactionMembershipsOf(type, StateSubactionKind.EXIT), INVALID_STATE_SUBACTION_MEMBERSHIP_EXIT_MSG, INVALID_STATE_SUBACTION_MEMBERSHIP_EXIT);
	}
	
	@Check
	def checkSuccession(Succession usg) {
		if (UsageUtil.isParallelState(usg.owningType)) {
			error(INVALID_TRANSITIONUSAGE_MSG, usg, null, INVALID_TRANSITIONUSAGE)
		}
	}
	
	@Check
	def checkTransitionUsage(TransitionUsage usg) {
		if (UsageUtil.isParallelState(usg.owningType)) {
			error(INVALID_TRANSITIONUSAGE_MSG, usg, null, INVALID_TRANSITIONUSAGE)
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
		val check = FeatureUtil.getAllTypesOf(f).forall[u| requiredType.isInstance(u)]
		if (!check)
			error (msg, ref, eId)
		return check;
	}
	
	protected def boolean checkAtLeastOneType(Feature f, Class<?> requiredType, String msg, EStructuralFeature ref, String eId){
		val check = FeatureUtil.getAllTypesOf(f).exists[u| requiredType.isInstance(u)]
		if (!check)
			error (msg, ref, eId)
		return check
	}
	
	//check types but must have exactly one type
	protected def boolean checkOneType(Feature f, Class<?> requiredType, String msg, EReference ref, String eId){
		val types = FeatureUtil.getAllTypesOf(f)
		val check = types.length == 1 && types.exists[u| requiredType.isInstance(u)]
		if (!check)
			error (msg, ref, eId)
		return check
	}
	
}
