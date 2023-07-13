/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 California Institute of Technology/Jet Propulsion Laboratory
 * Copyright (c) 2020-2023 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.FlowConnectionUsage
import org.omg.sysml.lang.sysml.Interaction
import org.omg.sysml.lang.sysml.FlowConnectionDefinition
import org.omg.sysml.lang.sysml.SendActionUsage
import org.omg.sysml.lang.sysml.FeatureReferenceExpression
import org.omg.sysml.lang.sysml.FeatureChainExpression
import org.omg.sysml.lang.sysml.OperatorExpression
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil
import org.omg.sysml.lang.sysml.Expression
import org.omg.sysml.lang.sysml.EventOccurrenceUsage
import org.omg.sysml.lang.sysml.ConjugatedPortDefinition
import org.omg.sysml.lang.sysml.AssignmentActionUsage
import org.omg.sysml.lang.sysml.TriggerInvocationExpression
import org.omg.sysml.lang.sysml.ControlNode
import org.omg.sysml.lang.sysml.DecisionNode
import org.omg.sysml.lang.sysml.ForkNode
import org.omg.sysml.lang.sysml.JoinNode
import org.omg.sysml.lang.sysml.MergeNode
import org.omg.sysml.lang.sysml.PerformActionUsage
import org.omg.sysml.lang.sysml.ExhibitStateUsage
import org.omg.sysml.lang.sysml.StateSubactionMembership
import org.omg.sysml.lang.sysml.TransitionFeatureMembership
import org.omg.sysml.lang.sysml.AssertConstraintUsage
import org.omg.sysml.lang.sysml.FramedConcernMembership
import org.omg.sysml.lang.sysml.RequirementConstraintMembership
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage
import org.omg.sysml.lang.sysml.StakeholderMembership
import org.omg.sysml.lang.sysml.AcceptActionUsage
import org.omg.sysml.lang.sysml.IncludeUseCaseUsage
import org.omg.sysml.lang.sysml.Expose
import org.omg.sysml.lang.sysml.ViewRenderingMembership
import org.omg.sysml.lang.sysml.AttributeDefinition

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SysMLValidator extends KerMLValidator {

	public static val INVALID_DEFINITION_NON_VARIATION_MEMBERSHIP = "validateDefinitionNonVariationMembership"
	public static val INVALID_DEFINITION_NON_VARIATION_MEMBERSHIP_MSG = "A variant must be an owned member of a variation."
	public static val INVALID_DEFINITION_VARIATION_MEMBERSHIP = "validateDefinitionVariationMembership"
	public static val INVALID_DEFINITION_VARIATION_MEMBERSHIP_MSG = "An owned usage of a variation must be a variant."
	public static val INVALID_DEFINITION_VARIATION_SPECIALIZATION = "validateDefinitionVariationSpecialization"
	public static val INVALID_DEFINITION_VARIATION_SPECIALIZATION_MSG = "A variation must not specialize another variation."
	
	public static val INVALID_USAGE_NON_VARIATION_MEMBERSHIP = "validateUsageNonVariationMembership"
	public static val INVALID_USAGE_NON_VARIATION_MEMBERSHIP_MSG = "A variant must be an owned member of a variation."
	public static val INVALID_USAGE_VARIATION_MEMBERSHIP = "validateUsageVariationMembership"
	public static val INVALID_USAGE_VARIATION_MSG = "An owned usage of a variation must be a variant."
	public static val INVALID_USAGE_VARIATION_SPECIALIZATION = "validateUsageVariationSpecialization"
	public static val INVALID_USAGE_VARIATION_SPECIALIZATION_MSG = "A variation must not specialize another variation."
	
	public static val INVALID_VARIATION_MEMBERSHIP_OWNING_NAMESPACE = "validateVariationMembershipOwningNamespace"
	public static val INVALID_VARIATION_MEMBERSHIP_OWNING_NAMESPACE_MSG = "Variant membership not allowed."
	
	public static val INVALID_ATTRIBUTE_DEFINITION_FEATURES = "validateAttributeDefinitionFeatures"
	public static val INVALID_ATTRIBUTE_DEFINITION_FEATURES_MSG = "Features of an attribute definition must be referential."
	
	public static val INVALID_ATTRIBUTE_USAGE_FEATURES = "validateAttributeUsageFeatures"
	public static val INVALID_ATTRIBUTE_USAGE_FEATURES_MSG = "Features of an attribute usage must be referential."
	public static val INVALID_ATTRIBUTE_USAGE_TYPE = "validateAttributeUsageType_"
	public static val INVALID_ATTRIBUTE_USAGE_MSG = "An attribute must be typed by attribute definitions."
	public static val INVALID_ATTRIBUTE_USAGE_ENUMERATION_TYPE = "validateAttributeUsageEnumerationType_"
	public static val INVALID_ATTRIBUTE_USAGE_ENUMERATION_TYPE_MSG = "An enumeration attribute cannot have more than one type."
	
	public static val INVALID_ENUMERATION_USAGE_TYPE = "validateEnumerationUsageType_"
	public static val INVALID_ENUMERATION_USAGE_TYPE_MSG = "An enumeration must be typed by one enumeration definition."
	
	public static val INVALID_EVENT_OCCURRENCE_USAGE_REFERENCE = "validateEventOccurrenceUsageReferent"
	public static val INVALID_EVENT_OCCURRENCE_USAGE_REFERENCE_MSG = "Must reference an occurrence."
	
	public static val INVALID_OCCURRENCE_DEFINITION_LIFE_CLASS = "validateOccurrenceDefinitionLifeClass"
	public static val INVALID_OCCURRENCE_DEFINITION_LIFE_CLASS_MSG = "Must have a LifeClass."
	
	public static val INVALID_OCCURRENCE_USAGE_TYPE = "validateOccurrenceUsageType_"
	public static val INVALID_OCCURRENCE_USAGE_TYPE_MSG = "An occurrence must be typed by occurrence definitions."
	public static val INVALID_OCCURRENCE_USAGE_INDIVIDUAL_DEFINITION = "validateOccurrenceUsageIndividualDefinition"
	public static val INVALID_OCCURRENCE_USAGE_INDIVIDUAL_DEFINITION_MSG = "Only one individual definition is allowed."
	public static val INVALID_OCCURRENCE_USAGE_INDIVIDUAL_USAGE = "validateOccurrenceUsageIndividualUsage"
	public static val INVALID_OCCURRENCE_USAGE_INDIVIDUAL_USAGE_MSG = "An individual must be typed by one individual definition."	
	
	public static val INVALID_ITEM_USAGE_TYPE = "validateItemUsageType_"
	public static val INVALID_ITEM_USAGE_TYPE_MSG = "An item must be typed by item definitions."
	
	public static val INVALID_PART_USAGE_TYPE = "validatePartUsageType_"
	public static val INVALID_PART_USAGE_TYPE_MSG = "A part must be typed by item definitions and at least one part definition."
	public static val INVALID_PART_USAGE_PART_DEFINITION = "validatePartUsagePartDefinition"
	public static val INVALID_PART_USAGE_PART_DEFINITION_MSG = "A part must be typed by at least one part definition."
	
	public static val INVALID_CONJUGATED_PORT_DEFINITION_CONJUGATED_PORT_DEFINITION = "validateConjugatedPortDefinitionConjugatedPortDefinition"
	public static val INVALID_CONJUGATED_PORT_DEFINITION_CONJUGATED_PORT_DEFINITION_MSG = "A conjugated port definition must not have a conjugated port definition."
	public static val INVALID_CONJUGATED_PORT_DEFINITION_ORIGINAL_PORT_DEFINITION = "validateConjugatedPortDefinitionConjugatedPortDefinition"
	public static val INVALID_CONJUGATED_PORT_DEFINITION_ORIGINAL_PORT_DEFINITION_MSG = "A conjugated port definition must be owned by its original port definition."
	
	public static val INVALID_PORT_DEFINITION_CONJUGATED_PORT_DEFINITION = "validatePortDefinitionConjugatedPortDefinition"
	public static val INVALID_PORT_DEFINITION_CONJUGATED_PORT_DEFINITION_MSG = "A port definition must have a conjugated port definition."
	public static val INVALID_PORT_DEFINITION_OWNED_USAGES_NOT_COMPOSITE = "validatePortDefinitionOwnedUsagesNotComposite"
	public static val INVALID_PORT_DEFINITION_OWNED_USAGES_NOT_COMPOSITE_MSG = "Owned usages of a port definition (other than ports) must be referential."
	
	public static val INVALID_PORT_USAGE_TYPE = "validatePortUsageType_"
	public static val INVALID_PORT_USAGE_TYPE_MSG = "A port must be typed by port definitions."
	public static val INVALID_PORT_USAGE_NESTED_USAGES_NOT_COMPOSITE = "validatePortUsageNestedUsagesNotComposite"
	public static val INVALID_PORT_USAGE_NESTED_USAGES_NOT_COMPOSITE_MSG = "Nested usages of a port usage (other than ports) must be referential."
	
	public static val INVALID_CONNECTION_USAGE_TYPE = "validateConnectionUsageType_"
	public static val INVALID_CONNECTION_USAGE_TYPE_MSG = "A connection must be typed by connection definitions."
	
	public static val INVALID_FLOW_CONNECTION_DEFINITION_END = "validateFlowConnectionEnd_"
	public static val INVALID_FLOW_CONNECTION_DEFINITION_END_MSG = "A flow connection definition can have only two ends."
	
	public static val INVALID_FLOW_CONNECTION_USAGE_TYPE = "validateFlowConnectionUsageType_"
	public static val INVALID_FLOW_CONNECTION_USAGE_TYPE_MSG = "A flow connection must be typed by flow connection definitions."

	public static val INVALID_INTERFACE_DEFINITION_END = "validateInterfaceDefinitionEnd_"
	public static val INVALID_INTERFACE_DEFINITION_END_MSG = "An interface definition end must be a port."
	
	public static val INVALID_INTERFACE_USAGE_TYPE = "validateInterfaceUsageType_"
	public static val INVALID_INTERFACE_USAGE_TYPE_MSG = "An interface must be typed by interface definitions."	
	public static val INVALID_INTERFACE_USAGE_END = "validateInterfaceUsageEnd_"
	public static val INVALID_INTERFACE_USAGE_END_MSG = "An interface end must be a port."
	
	public static val INVALID_ALLOCATION_USAGE_TYPE = "validateAllocationUsageType_"
	public static val INVALID_ALLOCATION_USAGE_TYPE_MSG = "An allocation must be typed by allocation definitions."
	
	public static val INVALID_ACCEPT_ACTION_USAGE_PARAMETERS = "validateAcceptActionUsageParameter"
	public static val INVALID_ACCEPT_ACTION_USAGE_PARAMETERS_MSG = "An accept action must have two input parameters."
	
	public static val INVALID_ACTION_USAGE_TYPE = "validateActionUsageType_"
	public static val INVALID_ACTION_USAGE_TYPE_MSG = "An action must be typed by action definitions."
	
	public static val INVALID_CONTROL_NODE_INCOMING_SUCCESSIONS = "validateControlNodeIncomingSuccessions"
	public static val INVALID_CONTROL_NODE_INCOMING_SUCCESSIONS_MSG = "Incoming successions must have target multiplicity 1."
	public static val INVALID_CONTROL_NODE_OUTGOING_SUCCESSIONS = "validateControlNodeOutgoingSuccessions"
	public static val INVALID_CONTROL_NODE_OUTGOING_SUCCESSIONS_MSG = "Outgoing successions must have source multiplicity 1."
	
	public static val INVALID_DECISION_NODE_INCOMING_SUCCESSIONS = "validateDecisionNodeIncomingSuccessions"
	public static val INVALID_DECISION_NODE_INCOMING_SUCCESSIONS_MSG = "Must have at most one incoming succession."
	public static val INVALID_DECISION_NODE_OUTGOING_SUCCESSIONS = "validateDecisionNodeOutgoingSuccessions"
	public static val INVALID_DECISION_NODE_OUTGOING_SUCCESSIONS_MSG = "Outgoing successions must have target multiplicity 0..1."
	
	public static val INVALID_FORK_NODE_INCOMING_SUCCESSIONS = "validateForkNodeIncomingSuccessions"
	public static val INVALID_FORK_NODE_INCOMING_SUCCESSIONS_MSG = "Must have at most one incoming succession."

	public static val INVALID_JOIN_NODE_OUTGOING_SUCCESSIONS = "validateJoinNodeOutgoingSuccessions"
	public static val INVALID_JOIN_NODE_OUTGOING_SUCCESSIONS_MSG = "Must have at most one outgoing succession."

	public static val INVALID_MERGE_NODE_INCOMING_SUCCESSIONS = "validateMergeNodeIncomingSuccessions"
	public static val INVALID_MERGE_NODE_INCOMING_SUCCESSIONS_MSG = "Incoming successions must have source multiplicity 0..1."
	public static val INVALID_MERGE_NODE_OUTGOING_SUCCESSIONS = "validateMergeNodeOutgoingSuccessions"
	public static val INVALID_MERGE_NODE_OUTGOING_SUCCESSIONS_MSG = "Must have at most one outgoing succession."
	
	public static val INVALID_PERFORM_ACTION_USAGE_REFERENCE = "validatePerformActionUsageReference"
	public static val INVALID_PERFORM_ACTION_USAGE_REFERENCE_MSG = "Must reference an occurrence"
	
	public static val INVALID_SEND_ACTION_USAGE_PARAMETERS = "validateSendActionUsageParameter"
	public static val INVALID_SEND_ACTION_USAGE_PARAMETERS_MSG = "A send action usage must have three input parameters."
	public static val INVALID_SEND_ACTION_USAGE_RECEIVER = "validateSendActionReceiver_"
	public static val INVALID_SEND_ACTION_USAGE_RECEIVER_MSG = 'Sending to a port should generally use "via" instead of "to".'
	public static val INVALID_SEND_ACTION_USAGE_PAYLOAD = "validateSendActionPayload_"
	public static val INVALID_SEND_ACTION_USAGE_PAYLOAD_MSG = 'A send action must have a payload.'
		
	public static val INVALID_STATE_SUBACTION_KIND_ENTRY_MSG = "A state may have at most one entry action."
	public static val INVALID_STATE_SUBACTION_KIND_DO_MSG = "A state may have at most one do action."
	public static val INVALID_STATE_SUBACTION_KIND_EXIT_MSG = "A state may have at most one exit action."
	
	public static val INVALID_STATE_DEFINITION_PARALLEL_GENERALIZATION = "validateStateDefinitionParallelGeneralization"
	public static val INVALID_STATE_DEFINITION_PARALLEL_GENERALIZATION_MSG_1 = "Parallel state must have parallel state generalizations."
	public static val INVALID_STATE_DEFINITION_PARALLEL_GENERALIZATION_MSG_2 = "Non-parallel state must not have parallel state generalizations."
	public static val INVALID_STATE_DEFINITION_PARALLEL_SUBACTIONS = "validateStateDefinitionParallelSubactions"
	public static val INVALID_STATE_DEFINITION_PARALLEL_SUBACTIONS_MSG = "A parallel state cannot have successions or transitions."
	public static val INVALID_STATE_DEFINITION_SUBACTION_KIND = "validateStateDefinitionSubactionKind"
	public static val INVALID_STATE_DEFINITION_SUBACTION_KIND_MSG_1 = INVALID_STATE_SUBACTION_KIND_ENTRY_MSG
	public static val INVALID_STATE_DEFINITION_SUBACTION_KIND_MSG_2 = INVALID_STATE_SUBACTION_KIND_DO_MSG
	public static val INVALID_STATE_DEFINITION_SUBACTION_KIND_MSG_3 = INVALID_STATE_SUBACTION_KIND_EXIT_MSG
	
	public static val INVALID_STATE_USAGE_TYPE = "validateStateUsageType_"
	public static val INVALID_STATE_USAGE_TYPE_MSG = "A state must be typed by state definitions."
	public static val INVALID_STATE_USAGE_PARALLEL_SUBACTIONS = "validateStateUsageParallelSubactions"
	public static val INVALID_STATE_USAGE_PARALLEL_SUBACTIONS_MSG = "A parallel state cannot have successions or transitions."
	public static val INVALID_STATE_USAGE_SUBACTION_KIND = "validateStateUsageSubactionKind"
	public static val INVALID_STATE_USAGE_SUBACTION_KIND_MSG_1 = INVALID_STATE_SUBACTION_KIND_ENTRY_MSG
	public static val INVALID_STATE_USAGE_SUBACTION_KIND_MSG_2 = INVALID_STATE_SUBACTION_KIND_DO_MSG
	public static val INVALID_STATE_USAGE_SUBACTION_KIND_MSG_3 = INVALID_STATE_SUBACTION_KIND_EXIT_MSG
	
	public static val INVALID_TRANSITION_FEATURE_MEMBERSHIP_EFFECT_ACTION = "validateTransitionFeatureMembershipEffectAction"
	public static val INVALID_TRANSITION_FEATURE_MEMBERSHIP_EFFECT_ACTION_MSG = "Must be an action."	
	public static val INVALID_TRANSITION_FEATURE_MEMBERSHIP_GUARD_EXPRESSION = "validateTransitionFeatureMembershipGuardExpression"
	public static val INVALID_TRANSITION_FEATURE_MEMBERSHIP_GUARD_EXPRESSION_MSG = "Must be a Boolean expression."	
	public static val INVALID_TRANSITION_FEATURE_MEMBERSHIP_OWNING_TYPE = "validateTransitionFeatureMembershipOwningType"
	public static val INVALID_TRANSITION_FEATURE_MEMBERSHIP_OWNING_TYPE_MSG = "Transition feature membership not allowed."	
	public static val INVALID_TRANSITION_FEATURE_MEMBERSHIP_TRIGGER_ACTION = "validateTransitionFeatureMembershipTriggerAction"
	public static val INVALID_TRANSITION_FEATURE_MEMBERSHIP_TRIGGER_ACTION_MSG = "Must be an accept action."
	
	public static val INVALID_TRANSITION_USAGE_PARMETERS = "validateTransitionUsageParameters"
	public static val INVALID_TRANSITION_USAGE_PARMETERS_MSG_1 = "Must have an input parameter."
	public static val INVALID_TRANSITION_USAGE_PARMETERS_MSG_2 = "Must have two input parameters."
	public static val INVALID_TRANSITION_USAGE_SUCCESSION = "validateTransitionUsageSuccession"
	public static val INVALID_TRANSITION_USAGE_SUCCESSION_MSG = "A transition must own a succession to its target."
	
	public static val INVALID_CALCULATION_USAGE_TYPE = "validateCalculationUsageType_"
	public static val INVALID_CALCULATION_USAGE_TYPE_MSG = "A calculation must be typed by one calculation definition."
	
	public static val INVALID_CONSTRAINT_USAGE_TYPE = "Invalid Constraint Usage - invalid type"
	public static val INVALID_CONSTRAINT_USAGE_TYPE_MSG = "A constraint must be typed by one constraint definition."
	
	public static val INVALID_ACTOR_MEMBERSHIP_OWNING_TYPE = "validateActorMembershipOwningType"
	public static val INVALID_ACTOR_MEMBERSHIP_OWNING_TYPE_MSG = "Only requirements and cases can have actors."
	
	public static val INVALID_REQUIREMENT_CONSTRAINT_MEMBERSHIP_IS_COMPOSITE = "validateRequirementConstraintMembershipIsComposite"
	public static val INVALID_REQUIREMENT_CONSTRAINT_MEMBERSHIP_IS_COMPOSITE_MSG = "A requirement constraint must be composite."
	public static val INVALID_REQUIREMENT_CONSTRAINT_MEMBERSHIP_OWNING_TYPE = "validateRequirementConstraintMembershipOwningType"
	public static val INVALID_REQUIREMENT_CONSTRAINT_MEMBERSHIP_OWNING_TYPE_MSG = "Only requirements can have assumed or required constraints."
	
	public static val INVALID_REQUIREMENT_DEFINITION_ONLY_ONE_SUBJECT = "validateRequirementDefinitionOnlyOneSubject"
	public static val INVALID_REQUIREMENT_DEFINITION_ONLY_ONE_SUBJECT_MSG = "Only one subject is allowed."
	public static val INVALID_REQUIREMENT_DEFINITION_SUBJECT_PARAMETER_POSITION = "validateRequirementDefinitionSubjectParameterPosition"
	public static val INVALID_REQUIREMENT_DEFINITION_SUBJECT_PARAMETER_POSITION_MSG = "Subject must be first parameter."

	public static val INVALID_REQUIREMENT_USAGE_TYPE = "validateRequirementUsageType_"
	public static val INVALID_REQUIREMENT_USAGE_TYPE_MSG = "A requirement must be typed by one requirement definition."
	public static val INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT = "validateRequirementUsageOnlyOneSubject"
	public static val INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT_MSG = "Only one subject is allowed."
	public static val INVALID_REQUIREMENT_USAGE_SUBJECT_PARAMETER_POSITION = "validateRequirementUsageSubjectParameterPosition"
	public static val INVALID_REQUIREMENT_USAGE_SUBJECT_PARAMETER_POSITION_MSG = "Subject must be first parameter."
	
	public static val INVALID_STAKEHOLDER_MEMBERSHIP_OWNING_TYPE = "validateStakeholderMembershipOwningType"
	public static val INVALID_STAKEHOLDER_MEMBERSHIP_OWNING_TYPE_MSG = "Only requirements can have stakeholders."
	
	public static val INVALID_SUBJECT_MEMBERSHIP_OWNING_TYPE = "validateSubjectMembershipOwningType"
	public static val INVALID_SUBJECT_MEMBERSHIP_OWNING_TYPE_MSG = "Only requirements and cases can have subjects."
	
	public static val INVALID_CASE_DEFINITION_ONLY_ONE_OBJECTIVE = "validateCaseDefinitionOnlyOneObjective";
	public static val INVALID_CASE_DEFINITION_ONLY_ONE_OBJECTIVE_MSG = "Only one objective is allowed.";	
	public static val INVALID_CASE_DEFINITION_ONLY_ONE_SUBJECT = "validateCaseDefinitionOnlyOneSubject"
	public static val INVALID_CASE_DEFINITION_ONLY_ONE_SUBJECT_MSG = "Only one subject is allowed."
	public static val INVALID_CASE_DEFINITION_SUBJECT_PARAMETER_POSITION = "validateCaseDefinitionSubjectParameterPosition"
	public static val INVALID_CASE_DEFINITION_SUBJECT_PARAMETER_POSITION_MSG = "Subject must be first parameter."

	public static val INVALID_CASE_USAGE_TYPE = "validateCaseUsageType_"
	public static val INVALID_CASE_USAGE_TYPE_MSG = "A case must be typed by one case definition."
	public static val INVALID_CASE_USAGE_ONLY_ONE_OBJECTIVE = "validateCaseUsageOnlyOneObjective";
	public static val INVALID_CASE_USAGE_ONLY_ONE_OBJECTIVE_MSG = "Only one objective is allowed.";	
	public static val INVALID_CASE_USAGE_ONLY_ONE_SUBJECT = "validateCaseUsageOnlyOneSubject"
	public static val INVALID_CASE_USAGE_ONLY_ONE_SUBJECT_MSG = "Only one subject is allowed."
	public static val INVALID_CASE_USAGE_SUBJECT_PARAMETER_POSITION = "validateCaseUsageSubjectParameterPosition"
	public static val INVALID_CASE_USAGE_SUBJECT_PARAMETER_POSITION_MSG = "Subject must be first parameter."
	
	public static val INVALID_OBJECTIVE_MEMBERSHIP_IS_COMPOSITE = "validateObjectiveMembershipIsComposite"
	public static val INVALID_OBJECTIVE_MEMBERSHIP_IS_COMPOSITE_MSG = "An objective must be composite."
	public static val INVALID_OBJECTIVE_MEMBERSHIP_OWNING_TYPE = "validateObjectiveMembershipOwningType"
	public static val INVALID_OBJECTIVE_MEMBERSHIP_OWNING_TYPE_MSG = "Only cases can have objectives."
	
	public static val INVALID_ANALYSIS_CASE_USAGE_TYPE = "validateAnalysisCaseUsageType_"
	public static val INVALID_ANALYSIS_CASE_USAGE_TYPE_MSG = "An analysis case must be typed by one analysis case definition."
	
	public static val INVALID_REQUIREMENT_VERIFICATION_MEMBERSHIP_KIND = "validateRequirementVerificationMembershipKind"
	public static val INVALID_REQUIREMENT_VERIFICATION_MEMBERSHIP_KIND_MSG = "A requirement verification must be a required constraint."
	public static val INVALID_REQUIREMENT_VERIFICATION_MEMBERSHIP_OWNING_TYPE = "validateRequirementVerificationMembershipOwningType"
	public static val INVALID_REQUIREMENT_VERIFICATION_MEMBERSHIP_OWNING_TYPE_MSG = "A requirement verification must be in the objective of a verification case."
	
	public static val INVALID_VERIFICATIONCASE_USAGE_TYPE = "validateVerificationCaseUsageType_"
	public static val INVALID_VERIFICATIONCASE_USAGE_TYPE_MSG = "A verification case must be typed by one verification case definition."
	
	public static val INVALID_USE_CASE_USAGE_TYPE = "validateUseCaseUsageType_"
	public static val INVALID_USE_CASE_USAGE_TYPE_MSG = "A use case must be typed by one use case definition."
	
	public static val INVALID_EXPOSE_IS_IMPORT_ALL = "validateExposeIsImportAll"
	public static val INVALID_EXPOSE_IS_IMPORT_ALL_MSG = "An expose must import all."
	public static val INVALID_EXPOSE_IS_OWNING_NAMESPACE = "validateExposeIsImportAll"
	public static val INVALID_EXPOSE_IS_OWNING_NAMESPACE_MSG = "Only view usages can expose elements."
	
	public static val INVALID_RENDERING_USAGE_TYPE = "validateRenderingUsageType_"
	public static val INVALID_RENDERING_USAGE_TYPE_MSG = "A rendering must be typed by one rendering definition."
	
	public static val INVALID_VIEW_DEFINITION_ONLY_ONE_VIEW_RENDERING = "validateViewDefinitionOnlyOnvViewRendering"
	public static val INVALID_VIEW_DEFINITION_ONLY_ONE_VIEW_RENDERING_MSG = "A view definition may have at most one rendering."
	
	public static val INVALID_VIEWPOINT_USAGE_TYPE = "validateViewpointUsageType_"
	public static val INVALID_VIEWPOINT_USAGE_TYPE_MSG = "A viewpoint must be typed by one viewpoint definition."
	
	public static val INVALID_VIEW_RENDERING_MEMBERSHIP_OWNING_TYPE = "validateViewRenderingMembershipOwningType"
	public static val INVALID_VIEW_RENDERING_MEMBERSHIP_OWNING_TYPE_MSG = "Only views can have view renderings."
	
	public static val INVALID_VIEW_USAGE_TYPE = "validateViewUsageType_"
	public static val INVALID_VIEW_USAGE_TYPE_MSG = "A view must be typed by one view definition."
	public static val INVALID_VIEW_USAGE_ONLY_ONE_RENDERING = "validateViewUsageOnlyOneRendering"
	public static val INVALID_VIEW_USAGE_ONLY_ONE_RENDERING_MSG = "A view may have at most one rendering."
	
	public static val INVALID_METADATA_USAGE_TYPE = "validateMetadataUsageType_"
	public static val INVALID_METADATA_USAGE_TYPE_MSG = "A metadata usage must be typed by one metadata definition."
		
	public static val INVALID_OPERATOR_EXPRESSION_QUANTITY = "validateOperatorExpressionQuantity"
	public static val INVALID_OPERATOR_EXPRESSION_QUANTITY_MSG = "Should be a measurement reference (unit)."
		
	@Check
	def checkDefinition(Definition definition) {		
		if (!definition.isVariation) {
			// validateDefinitionNonVariationMembership
			for (mem: definition.variantMembership) {
				error(INVALID_USAGE_NON_VARIATION_MEMBERSHIP_MSG, mem, null, INVALID_USAGE_NON_VARIATION_MEMBERSHIP)
			}
		} else {
			// validateDefinitionVariationMembership
			for (ownedUsage: definition.ownedUsage) {
				// TODO: Allow parameters and objectives in variations in spec? Or is that just due to implementation here?
				val mem = ownedUsage.owningFeatureMembership
				if (!(mem instanceof ParameterMembership || mem instanceof ObjectiveMembership)) {
					error(INVALID_USAGE_VARIATION_MSG, mem, null, INVALID_USAGE_VARIATION_MEMBERSHIP)							
				}
			}
			
			// TODO: Check validateDefinitionVariationSpecialization
		}	
	}
	
//	@Check
//	def checkReferenceUsage(ReferenceUsage usage) {
//		// validateReferenceUsageIsReferential is satisfied automatically		
//	}
	
	
	@Check
	def checkUsage(Usage usage) {
		if (!usage.isVariation) {
			// validateUsageNonVariationMembership
			for (mem: usage.variantMembership) {
				error(INVALID_USAGE_NON_VARIATION_MEMBERSHIP_MSG, mem, null, INVALID_USAGE_NON_VARIATION_MEMBERSHIP)
			}
		} else {
			// validateUsageVariationMembership
			for (nestedUsage: usage.nestedUsage) {
				// TODO: Allow parameters and objectives in variations in spec? Or is that just due to implementation here?
				val mem = nestedUsage.owningFeatureMembership
				if (!(mem instanceof ParameterMembership || mem instanceof ObjectiveMembership)) {
					error(INVALID_USAGE_VARIATION_MSG, mem, null, INVALID_USAGE_VARIATION_MEMBERSHIP)							
				}
			}
			
			// TODO: Check validateUsageVariationSpecialization
		}
		
		// TODO: Check validateUsageOwningType	
	}
	
	@Check
	def checkVariantMembership(VariantMembership mem) {
	  // TODO: Check validateVariantMembershipOwningNamespace		
	}

	@Check
	def checkAttributeDefinition(AttributeDefinition defn) {
		// TODO: Check validateAttributeDefinitionFeatures
	}
	
	@Check 
	def checkAttributeUsage(AttributeUsage usg) {
		// All types must be DataTypes
		checkAllTypes(usg, DataType, INVALID_ATTRIBUTE_USAGE_MSG, SysMLPackage.eINSTANCE.attributeUsage_AttributeDefinition, INVALID_ATTRIBUTE_USAGE_TYPE)
		if (!(usg instanceof EnumerationUsage)) {
			// TODO: Add validateAttributeUsageEnumerationDefinition?
			val types = FeatureUtil.getAllTypesOf(usg)
			if (types.exists[t | t instanceof EnumerationDefinition] && types.size > 1) {
				error(INVALID_ATTRIBUTE_USAGE_ENUMERATION_TYPE_MSG, SysMLPackage.eINSTANCE.attributeUsage_AttributeDefinition, INVALID_ATTRIBUTE_USAGE_ENUMERATION_TYPE)
			}
		}
		
		// validateAttributeUsageIsReference is satisfied automatically			
		
		// TODO: Check validateAttributeUsageFeatures
	}
	
//	@Check
//	def checkEnumerationDefinition(EnumerationDefinition defn) {
//		// validateEnumerationDefinitionIsVariation is satisfied automatically
//	}
	
	@Check 
	def checkEnumerationUsage(EnumerationUsage usg) {
		// Must have exactly one type, which is an EnumerationDefinition
		checkOneType(usg, EnumerationDefinition, INVALID_ENUMERATION_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.enumerationUsage_EnumerationDefinition, INVALID_ENUMERATION_USAGE_TYPE)
	}
	
	@Check
	def checkEventOccurrenceUsage(EventOccurrenceUsage usg) {
		// validateEventOccurrenceUsageIsReference is satisfied automatically
		// TODO: Check validateEventOccurrenceUsageReference
	}
	
//	@Check
//	def checkLifeClass(LifeClass cls) {}
//		// validateLifeClassIsSufficient is satisfied automatically
//		// TODO: Update LifeClass so isSufficient = true
//	}
	
	@Check
	def checkOccurrenceDefinition(OccurrenceDefinition defn) {
		// TODO: Check validateOccurrenceDefinitionLifeClass
	}
	
	@Check 
	def checkOccurrenceUsage(OccurrenceUsage usg) {
		// All types must be Classes
		if (!(usg instanceof ItemUsage || usg instanceof PortUsage || usg instanceof Step))	
			checkAllTypes(usg, org.omg.sysml.lang.sysml.Class, INVALID_OCCURRENCE_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.occurrenceUsage_OccurrenceDefinition, INVALID_OCCURRENCE_USAGE_TYPE)

		// TODO: Check validateOccurrenceUsageIndividualDefinition

		// validateOccurrenceUsageIndividualUsage
		if (usg.isIndividual && usg.occurrenceDefinition.filter[t | t instanceof OccurrenceDefinition && (t as OccurrenceDefinition).isIndividual].size() != 1)
			error (INVALID_OCCURRENCE_USAGE_INDIVIDUAL_USAGE_MSG, SysMLPackage.eINSTANCE.occurrenceUsage_OccurrenceDefinition, INVALID_OCCURRENCE_USAGE_INDIVIDUAL_USAGE)	
	}
	
	@Check 
	def checkItemUsage(ItemUsage iu) {
		// All types must be Structures
		if (!(iu instanceof PartUsage || iu instanceof PortUsage || iu instanceof MetadataUsage))	
			checkAllTypes(iu, Structure, INVALID_ITEM_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.itemUsage_ItemDefinition, INVALID_ITEM_USAGE_TYPE)
	}
	
	@Check
	def checkPartUsage(PartUsage pu){
		// validatePartUsagePartDefinition
		if (!(pu instanceof ConnectionUsage))
			if (checkAllTypes(pu, Structure, INVALID_PART_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.itemUsage_ItemDefinition, INVALID_PART_USAGE_TYPE))
				checkAtLeastOneType(pu, PartDefinition, INVALID_PART_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.partUsage_PartDefinition, INVALID_PART_USAGE_TYPE)
	}
	
	@Check
	def checkConjugatedPortDefinition(ConjugatedPortDefinition cpd) {
		// TODO: Check validateConjugatedPortDefinitionConjugatedPortDefinition
		// TODO: Check validateConjugatedPortDefinitionOriginalPortDefinition
	}
	
	@Check
	def checkPortDefinition(PortDefinition pd) {
		// TODO: Check validatePortDefinitionConjugatedPortDefinition
		// TODO: Check validatePortDefinitionOwnedUsagesNotComposite
	}
	
	@Check
	def checkPortUsage(PortUsage usg) {
		// All types must be PortDefinitions
		checkAllTypes(usg, PortDefinition, INVALID_PORT_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.portUsage_PortDefinition, INVALID_PORT_USAGE_TYPE)

		// validatePortUsageIsReference is satisfied automatically
		// TODO: Check validatePortUsageNestedUsagesNotComposite
	}

	@Check
	def checkConnectionUsage(ConnectionUsage usg) {
		// All types must be Associations
		if (!(usg instanceof FlowConnectionUsage || usg instanceof InterfaceUsage || usg instanceof AllocationUsage))	
			checkAllTypes(usg, Association, INVALID_CONNECTION_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.connectionUsage_ConnectionDefinition, INVALID_CONNECTION_USAGE_TYPE)
	}
	
	@Check
	def checkFlowConnectionDefinition(FlowConnectionDefinition cdef) {
		//At most two owned ends
		val ends = cdef.ownedEndFeature
		if (ends.size > 2) {
			for (var i = 2; i < ends.size; i++) {
				error(INVALID_FLOW_CONNECTION_DEFINITION_END_MSG, ends.get(i), null, INVALID_FLOW_CONNECTION_DEFINITION_END)
			}
		}
	}

	@Check 
	def checkFlowConnectionUsage(FlowConnectionUsage usg) {
		// All types must be Interactions
		checkAllTypes(usg, Interaction, INVALID_FLOW_CONNECTION_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.flowConnectionUsage_FlowConnectionDefinition, INVALID_FLOW_CONNECTION_USAGE_TYPE)
	}

	@Check
	def checkInterfaceDefinitionEnds(InterfaceDefinition idef) {
		// Ends must be ports
		for (end: idef.ownedFeature.filter[isEnd]) {
			if (!(end instanceof PortUsage)) {
				error(INVALID_INTERFACE_DEFINITION_END_MSG, end, null, INVALID_INTERFACE_DEFINITION_END)
			}
		}
	}
	
	@Check
	def checkInterfaceUsageEnds(InterfaceUsage usg) {
		// Ends must be ports
		for (end: usg.ownedFeature.filter[isEnd]) {
			if (!(end instanceof PortUsage)) {
				error(INVALID_INTERFACE_USAGE_END_MSG, end, null, INVALID_INTERFACE_USAGE_END)
			}
		}
	}
	
	@Check
	def checkInterfaceUsage(InterfaceUsage usg) {
		// All types must be InterfaceDefinitions
		checkAllTypes(usg, InterfaceDefinition, INVALID_INTERFACE_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.interfaceUsage_InterfaceDefinition, INVALID_INTERFACE_USAGE_TYPE)
	}

	@Check
	def checkAllocationUsage(AllocationUsage usg) {
		// All types must be AllocationDefinitions
		checkAllTypes(usg, AllocationDefinition, INVALID_ALLOCATION_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.allocationUsage_AllocationDefinition, INVALID_ALLOCATION_USAGE_TYPE)
	}
	
	@Check
	def checkAcceptActionUsage(AcceptActionUsage usg) {
		// TODO: Check validateAcceptActionUsageParameters
	}
	
	@Check
	def checkActionUsage(ActionUsage usg) {
		// All types must be Behaviors
		if (!(usg instanceof StateUsage || usg instanceof CalculationUsage || usg instanceof FlowConnectionUsage) )
			checkAllTypes(usg, Behavior, INVALID_ACTION_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.actionUsage_ActionDefinition, INVALID_ACTION_USAGE_TYPE)
	}
	
	@Check
	def checkAssignmentActionUsage(AssignmentActionUsage usg) {
		// TODO: Add/check validateAssignmentActionUsageArguments
		// TODO: Add/check validateAssignmentActionUsageReferent
	}
	
	@Check
	def checkTriggerInvocationExpression(TriggerInvocationExpression expr) {
		// TODO: Add/check validate TriggerInvocationExpressionAfterArgument
		// TODO: Add/check validate TriggerInvocationExpressionAtArgument
		// TODO: Add/check validate TriggerInvocationExpressionWhenArgument
	}
	
	@Check
	def checkControlNode(ControlNode node) {
		// TODO: Check validateControlNodeIncomingSuccessions (?)
		// TODO: Check validateControlNodeOutgoingSuccessions (?)
		// TODO: Check validateControlNodeOwningType
	}
	
	@Check
	def checkDecisionNode(DecisionNode node) {	
		// TODO: Check validateDecisionNodeIncomingSuccessions (?)
		// TODO: Check validateDecisionNodeOutgoingSuccessions (?)
	}
	
	@Check
	def checkForkNodeIncomingSuccessions(ForkNode node) {
		// TODO: Check validateForkNodeIncomingSuccessions
	}
	
	def checkJoinNodeIncomingSuccessions(JoinNode node) {
		// TODO: Check validateJoinNodeOutgoingSuccessions
	}
	
	def checkMergeNodeIncomingSuccessions(MergeNode node) {	
		// TODO: Check validateMergeNodeIncomingSuccessions
		// TODO: Check validateMergeNodeOutgoingSucessions
	}
	
	def checkPerformActionUsage(PerformActionUsage usg) {
		// TODO: Check validatePerformActionUsageReference
	}
	
	@Check
	def checkSendActionUsage(SendActionUsage usg) {
		val receiverArgument = usg.receiverArgument
		if (receiverArgument instanceof FeatureReferenceExpression && 
				(receiverArgument as FeatureReferenceExpression).referent instanceof PortUsage ||
			receiverArgument instanceof FeatureChainExpression &&
				FeatureUtil.getBasicFeatureOf((receiverArgument as FeatureChainExpression).targetFeature) instanceof PortUsage) {
			warning(INVALID_SEND_ACTION_USAGE_RECEIVER_MSG, receiverArgument, null, INVALID_SEND_ACTION_USAGE_RECEIVER)
		}
		
		// payloadArgument has multiplicity 1
		if (usg.payloadArgument === null) {
			error(INVALID_SEND_ACTION_USAGE_PAYLOAD_MSG, usg, null, INVALID_SEND_ACTION_USAGE_PAYLOAD_MSG)
		} 

		// TODO: Check validateSendActionParameters
	}	
	
	def checkExhibitStateUsage(ExhibitStateUsage usg) {
		// TODO: Add validateExhibitStateUsageReference
	}
		
	@Check
	def checkStateDefinition(StateDefinition defn) {
		// TODO: CHeck validateStateDefinitionParallelGeneralization
		// validateStateDefinitionStateSubactionKind
		checkStateSubactions(defn);
	}
	
	@Check
	def checkStateSubactionMembership(StateSubactionMembership defn) {
		// TODO: Check validateStateSubactionMembershipOwningType
	}
		
	@Check
	def checkStateUsage(StateUsage usg){
		// All types must be Behaviors
		checkAllTypes(usg, Behavior, INVALID_STATE_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.stateUsage_StateDefinition, INVALID_STATE_USAGE_TYPE)

		// TODO: Check validateStateUsageIsParallelGeneralization

//		val owningType = usg.owningType
//		if (owningType !== null && !owningType.isAbstract && usg.isComposite && 
//			UsageUtil.isNonParallelState(owningType) && !UsageUtil.hasIncomingTransitions(usg)
//		) {
//			warning(INVALID_STATE_USAGE_TYPE_TRANSITIONS_MSG, usg, null, INVALID_STATE_USAGE_TYPE_TRANSITIONS)
//		}

		// validateStateUsageStateSubactionKind
		checkStateSubactions(usg)
	}
	
	protected def checkStateSubactions(Type type) {
		val errorId = type instanceof Definition? INVALID_STATE_DEFINITION_SUBACTION_KIND: INVALID_STATE_USAGE_SUBACTION_KIND
		checkAtMostOneElement(UsageUtil.getStateSubactionMembershipsOf(type, StateSubactionKind.ENTRY), INVALID_STATE_SUBACTION_KIND_ENTRY_MSG, errorId);
		checkAtMostOneElement(UsageUtil.getStateSubactionMembershipsOf(type, StateSubactionKind.DO), INVALID_STATE_SUBACTION_KIND_DO_MSG, errorId);
		checkAtMostOneElement(UsageUtil.getStateSubactionMembershipsOf(type, StateSubactionKind.EXIT), INVALID_STATE_SUBACTION_KIND_EXIT_MSG, errorId);
	}
	
	@Check
	def checkTransitionFeatureMembership(TransitionFeatureMembership mem) {
		// TODO: Check validateTransitionFeatureMembershipEffectAction
		// TODO: Check validateTransitionFeatureMembershipGuardAction
		// TODO: Check validateTransitionFeatureMembershipOwningType
		// TODO: Check validateTransitionFeatureMembershipTriggerAction
	}
	
	@Check
	def checkTransitionUsage(TransitionUsage usg) {
		// validateStateDefinitionParallelSubactions
		// validateStateUsageParallelSubactions
		if (UsageUtil.isParallelState(usg.owningType)) {
			error(INVALID_STATE_USAGE_PARALLEL_SUBACTIONS_MSG, usg, null, INVALID_STATE_USAGE_PARALLEL_SUBACTIONS_MSG)
		}
		
		// TODO: Check validateTransitionUsageParameters
		// TODO: Check validateTransitionUsageSuccession	
	}
	
	@Check
	def checkSuccession(Succession usg) {
		// validateStateDefinitionParallelSubactions
		// validateStateUsageParallelSubactions
		if (UsageUtil.isParallelState(usg.owningType)) {
			error(INVALID_STATE_USAGE_PARALLEL_SUBACTIONS_MSG, usg, null, INVALID_STATE_USAGE_PARALLEL_SUBACTIONS_MSG)
		}
	}
	
	@Check 
	def checkCalculationUsage(CalculationUsage usg) {
		// Must have exactly one type, which is a Function
		if (!(usg instanceof CaseUsage))
			checkOneType(usg, Function, INVALID_CALCULATION_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.calculationUsage_CalculationDefinition, INVALID_CALCULATION_USAGE_TYPE)
	}
	
	@Check
	def checkAssertConstraintUsage(AssertConstraintUsage usg) {
		// TODO: Add validateAssertConstraintUsageReference
	}

	@Check 
	def checkConstraintUsage(ConstraintUsage usg){
		// Must have exactly one type, which is a Predicate
		if (!(usg instanceof RequirementUsage))
			checkOneType(usg, Predicate, INVALID_CONSTRAINT_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.constraintUsage_ConstraintDefinition, INVALID_CONSTRAINT_USAGE_TYPE)
	}
	
	@Check
	def checkActorMembership(ConstraintUsage usg) {
		// TODO: Check validateActorMembershipOwningType
	}
	
	@Check
	def checkFramedConcernUsage(FramedConcernMembership mem) {
		// TODO: Check validateFramedConcernMembershipConstraintKind
	}
	
	@Check
	def checkRequirementConstraintMembership(RequirementConstraintMembership mem) {
		// TODO: Check validateRequirementConstraintMembershipIsComposite
		// TODO: Check validateRequirementConstraintMembershipOwningType
	}
	
	@Check
	def checkRequirementDefinition(RequirementDefinition defn) {
		// validateRequirementDefinitionOnlyOneSubject
		checkAtMostOneFeature(defn, SubjectMembership, INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT_MSG, INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT)
		
		// TODO: Check validateRequirementDefinitionSubjectParameterPosition
	}	
	
	@Check 
	def checkRequirementUsage(RequirementUsage usg){
		// Must have exactly one type, which is a RequirementDefinition
		checkOneType(usg, RequirementDefinition, INVALID_REQUIREMENT_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.requirementUsage_RequirementDefinition, INVALID_REQUIREMENT_USAGE_TYPE)

		// validateRequirementUsageOnlyOneSubject
		checkAtMostOneFeature(usg, SubjectMembership, INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT_MSG, INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT)
		
		// TODO: Check validateRequirementUsageSubjectParameterPosition
	}
	
	@Check
	def checkSatisfyRequirementUsage(SatisfyRequirementUsage usg) {
		// TODO: Add validateSatisfyRequirementUsageReference
	}
	
	@Check
	def checkStakeholderMembership(StakeholderMembership mem) {
		// TODO: Check validateStakeholderMembershipOwningType
	}
	
	@Check
	def checkSubjectMembership(SubjectMembership mem) {
		// TODO: Check validateSubjectMembershipOwningType
	}
	
	
	@Check
	def checkCaseDefinition(CaseDefinition defn) {
		// validateCaseDefinitionOnlyOneObjective is checked in checkObjectiveMembership
		checkAtMostOneFeature(defn, ObjectiveMembership, INVALID_CASE_USAGE_ONLY_ONE_OBJECTIVE_MSG, INVALID_CASE_USAGE_ONLY_ONE_OBJECTIVE)
		
		// validateCaseDefinitionOnlyOneSubject is checked in checkSubjectMembership
		checkAtMostOneFeature(defn, SubjectMembership, INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT_MSG, INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT)
		
		// TODO: Check validateCaseDefinitionSubjectParameterPosition
	}

	@Check 
	def checkCaseUsage(CaseUsage usg){
		// Must have exactly one type, which is a CaseDefinition
		if (!(usg instanceof AnalysisCaseUsage || usg instanceof VerificationCaseUsage || usg instanceof UseCaseUsage))
			checkOneType(usg, CaseDefinition, INVALID_CASE_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.caseUsage_CaseDefinition, INVALID_CASE_USAGE_TYPE)

		// validateCaseDefinitionOnlyOneObjective is checked in checkObjectiveMembership
		checkAtMostOneFeature(usg, ObjectiveMembership, INVALID_CASE_USAGE_ONLY_ONE_OBJECTIVE_MSG, INVALID_CASE_USAGE_ONLY_ONE_OBJECTIVE)
		
		// validateCaseDefinitionOnlyOneSubject is checked in checkSubjectMembership
		checkAtMostOneFeature(usg, SubjectMembership, INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT_MSG, INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT)
		
		// TODO: Check validateCaseUsageSubjectParameterPosition
	}
	
	@Check
	def checkObjectiveMembership(ObjectiveMembership mem) {
		// TODO: Check validateObjectiveMembershipIsComposite
		// TODO: Check validateObjectiveMembershipOwningType
	}	
	
	@Check 
	def checkAnalysisCaseUsage(AnalysisCaseUsage usg) {
		// Must have exactly one type, which is an AnalysisCaseDefinition
		checkOneType(usg, AnalysisCaseDefinition, INVALID_ANALYSIS_CASE_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.analysisCaseUsage_AnalysisCaseDefinition, INVALID_ANALYSIS_CASE_USAGE_TYPE)
	}
	
	@Check
	def checkRequirementVerificationMembership(RequirementVerificationMembership mem) {
		// TODO: Check validateRequirementVerificationMembershipKind

		// validateRequirementVerificationMembershipOwningType
		if (!UsageUtil.isLegalVerification(mem)) {
			error(INVALID_REQUIREMENT_VERIFICATION_MEMBERSHIP_OWNING_TYPE_MSG, null, INVALID_REQUIREMENT_VERIFICATION_MEMBERSHIP_OWNING_TYPE)
		}
	}	
	
	@Check
	def checkVerificationCaseUsage(VerificationCaseUsage usg) {
		// Must have exactly one type, which is a VerificationCaseDefinition
		checkOneType(usg, VerificationCaseDefinition, INVALID_VERIFICATIONCASE_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.verificationCaseUsage_VerificationCaseDefinition, INVALID_VERIFICATIONCASE_USAGE_TYPE)
	}
	
	@Check
	def checkIncludeUseCaseUsage(IncludeUseCaseUsage usg) {
		// TODO: Add validateIncludeUseCaseUsageReference
	}
	
	@Check 
	def checkUseCaseUsage(UseCaseUsage usg) {
		// Must have exactly one type, which is a UseCaseDefinition
		checkOneType(usg, UseCaseDefinition, INVALID_USE_CASE_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.useCaseUsage_UseCaseDefinition, INVALID_USE_CASE_USAGE_TYPE)
	}
	
	@Check
	def checkExpose(Expose exp) {
		// validateExposeIsImportAll is automatically satisfied
		// TODO: Check validateExposeOwningNamespace
	}
	
	@Check
	def checkRenderingUsage(RenderingUsage usg) {
		// Must have exactly one type, which is a RenderingDefinition
		checkOneType(usg, RenderingDefinition, INVALID_RENDERING_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.renderingUsage_RenderingDefinition, INVALID_RENDERING_USAGE_TYPE)
	}
	
	@Check
	def checkViewDefinition(ViewDefinition viewDef) {
		// validateViewDefinitionOnlyOneRendering
		checkAtMostOneElement(viewDef.ownedFeature.filter[f|f instanceof RenderingUsage], INVALID_VIEW_DEFINITION_ONLY_ONE_VIEW_RENDERING_MSG, INVALID_VIEW_DEFINITION_ONLY_ONE_VIEW_RENDERING)
	}
	
	@Check
	def checkViewRenderingMembership(ViewRenderingMembership mem) {
		// TODO: Check validateViewRenderingMembershipOwningType
	}
	
	@Check
	def checkViewpointUsage(ViewpointUsage usg) {
		// Must have exactly one type, which is a ViewpointDefinition 
		checkOneType(usg, ViewpointDefinition, INVALID_VIEWPOINT_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.viewpointUsage_ViewpointDefinition, INVALID_VIEWPOINT_USAGE_TYPE)
	}
	
	@Check
	def checkViewUsage(ViewUsage usg) {
		// Must have exactly one type, which is a ViewDefinition
		checkOneType(usg, ViewDefinition, INVALID_VIEW_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.viewUsage_ViewDefinition, INVALID_VIEW_USAGE_TYPE)

		// validateViewUsageOnlyOneRendering	
		checkAtMostOneElement(usg.ownedFeature.filter[f|f instanceof RenderingUsage], INVALID_VIEW_USAGE_ONLY_ONE_RENDERING_MSG, INVALID_VIEW_USAGE_ONLY_ONE_RENDERING)
	}
	
	@Check
	def checkMetadataUsage(MetadataUsage usg) {
		// Must have exactly one type, which is a Metaclass. 
		checkOneType(usg, Metaclass, INVALID_METADATA_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.metadataUsage_MetadataDefinition, INVALID_METADATA_USAGE_TYPE)
	}
	
	/* Overrides */
	
	@Check
	override checkOperatorExpression(OperatorExpression e) {
		if (e.operator != '[') {
			super.checkOperatorExpression(e)
		} else {
			val arguments = e.argument
			if (arguments.size >= 2) {
				val indexArg = arguments.get(1)
				val mRefType = SysMLLibraryUtil.getLibraryElement(e, "MeasurementReferences::TensorMeasurementReference") as Type
				if (!indexArg.resultConformsTo(mRefType)) {
					warning(INVALID_OPERATOR_EXPRESSION_QUANTITY_MSG, indexArg, null, INVALID_OPERATOR_EXPRESSION_QUANTITY)	
				}
			}
		}
	}
	
	/**
	 * Check if the result of the given Expression conforms to the given Type, or, alternatively, if the 
	 * Expression is an OperatorExpression with a result that has a type to which the given Type conforms, 
	 * check whether at least one of the argument Expression results conforms to the given Type in a similar way.
	 * (This works, for example, for nested OperatorExpressions with arithmetic operations that return the same
	 * result Type as one of their arguments, such as for MeasurementReference operations.)
	 */
	def boolean resultConformsTo(Expression expr, Type type) {
		val result = expr.result;
		if (result.conformsTo(type)) {
			true
		} else if (expr instanceof OperatorExpression) {
			result.type.exists[t | type.conformsTo(t)] && expr.argument.exists[resultConformsTo(type)]
		} else {
			false
		}
	}
	
	/* Utility Methods */
	
	protected def boolean checkAtMostOneFeature(Type owningType, Class<? extends FeatureMembership> kind, String msg, String eId) {
		var mems = owningType.ownedFeatureMembership.filter[m | kind.isInstance(m)]
		checkAtMostOneElement(mems, msg, eId);
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
	
	protected def boolean checkOneType(Feature f, Class<?> requiredType, String msg, EReference ref, String eId){
		val types = FeatureUtil.getAllTypesOf(f)
		val check = types.length == 1 && types.exists[u| requiredType.isInstance(u)]
		if (!check)
			error (msg, ref, eId)
		return check
	}
	
}
