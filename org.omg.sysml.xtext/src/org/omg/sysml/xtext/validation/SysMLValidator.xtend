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
import org.omg.sysml.lang.sysml.Namespace
import org.omg.sysml.lang.sysml.LifeClass
import org.omg.sysml.lang.sysml.ActionDefinition
import org.eclipse.emf.ecore.EObject
import org.omg.sysml.lang.sysml.TransitionFeatureKind
import org.omg.sysml.lang.sysml.ActorMembership
import org.omg.sysml.lang.sysml.RequirementConstraintKind
import org.omg.sysml.lang.sysml.ForLoopActionUsage
import org.omg.sysml.lang.sysml.ReferenceUsage
import org.omg.sysml.lang.sysml.IfActionUsage
import org.omg.sysml.lang.sysml.WhileLoopActionUsage
import org.omg.sysml.lang.sysml.TriggerKind

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SysMLValidator extends KerMLValidator {

	public static val INVALID_DEFINITION_VARIATION_MEMBERSHIP = "validateDefinitionVariationMembership"
	public static val INVALID_DEFINITION_VARIATION_MEMBERSHIP_MSG = "An owned usage of a variation must be a variant."
	public static val INVALID_DEFINITION_VARIATION_SPECIALIZATION = "validateDefinitionVariationSpecialization"
	public static val INVALID_DEFINITION_VARIATION_SPECIALIZATION_MSG = "A variation must not specialize another variation."
	
	public static val INVALID_USAGE_VARIATION_MEMBERSHIP = "validateUsageVariationMembership"
	public static val INVALID_USAGE_VARIATION_MEMBERSHIP_MSG = "An owned usage of a variation must be a variant."
	public static val INVALID_USAGE_VARIATION_SPECIALIZATION = "validateUsageVariationSpecialization"
	public static val INVALID_USAGE_VARIATION_SPECIALIZATION_MSG = "A variation must not specialize another variation."
	
	public static val INVALID_VARIANT_MEMBERSHIP_OWNING_NAMESPACE = "validateVariationMembershipOwningNamespace"
	public static val INVALID_VARIANT_MEMBERSHIP_OWNING_NAMESPACE_MSG = "A variant must be an owned member of a variation."
	
	public static val INVALID_ATTRIBUTE_DEFINITION_FEATURES = "validateAttributeDefinitionFeatures"
	public static val INVALID_ATTRIBUTE_DEFINITION_FEATURES_MSG = "Features of an attribute definition must be referential."
	public static val INVALID_ATTRIBUTE_DEFINITION_SPECIALIZATION = "validateDataTypeSpecialization"
	public static val INVALID_ATTRIBUTE_DEFINITION_SPECIALIZATION_MSG = "Cannot specialize item definition"    
		
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
	public static val INVALID_OCCURRENCE_DEFINITION_LIFE_CLASS_MSG_1 = "Must have exactly one LifeClass."
	public static val INVALID_OCCURRENCE_DEFINITION_LIFE_CLASS_MSG_2 = "Must not have a LifeClass."
	
	public static val INVALID_OCCURRENCE_USAGE_TYPE = "validateOccurrenceUsageType_"
	public static val INVALID_OCCURRENCE_USAGE_TYPE_MSG = "An occurrence must be typed by occurrence definitions."
	public static val INVALID_OCCURRENCE_USAGE_INDIVIDUAL_DEFINITION = "validateOccurrenceUsageIndividualDefinition"
	public static val INVALID_OCCURRENCE_USAGE_INDIVIDUAL_DEFINITION_MSG = "At most one individual definition is allowed."
	public static val INVALID_OCCURRENCE_USAGE_INDIVIDUAL_USAGE = "validateOccurrenceUsageIndividualUsage"
	public static val INVALID_OCCURRENCE_USAGE_INDIVIDUAL_USAGE_MSG = "An individual must be typed by one individual definition."	
	
	public static val INVALID_ITEM_DEFINITION_SPECIALIZATION = "validateClassSpecialization"
	public static val INVALID_ITEM_DEFINITION_SPECIALIZATION_MSG = "Cannot specialize attribute definition"    	

	public static val INVALID_ITEM_USAGE_TYPE = "validateItemUsageType_"
	public static val INVALID_ITEM_USAGE_TYPE_MSG = "An item must be typed by item definitions."
	
	public static val INVALID_PART_USAGE_TYPE = "validatePartUsageType_"
	public static val INVALID_PART_USAGE_TYPE_MSG = "A part must be typed by item definitions."
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
	
	public static val INVALID_ASSIGNMENT_ACTION_USAGE_ARGUMENTS = "validateAssignmentActionUsageArguments"
	public static val INVALID_ASSIGNMENT_ACTION_USAGE_ARGUMENTS_MSG = "An assignment must have two arguments."
	public static val INVALID_ASSIGNMENT_ACTION_USAGE_REFERENT = "validateAssignmentActionUsageReferent"
	public static val INVALID_ASSIGNMENT_ACTION_USAGE_REFERENT_MSG = "An assignment must have a referent."

	public static val INVALID_TRIGGER_INVOCATION_EXPRESSION_AFTER_ARGUMENT = "validateTriggerInvocationActionAfterArgument"
	public static val INVALID_TRIGGER_INVOCATION_EXPRESSION_AFTER_ARGUMENT_MSG = "An after expression must be a DurationValue."
	public static val INVALID_TRIGGER_INVOCATION_EXPRESSION_AT_ARGUMENT = "validateTriggerInvocationActionAtArgument"
	public static val INVALID_TRIGGER_INVOCATION_EXPRESSION_AT_ARGUMENT_MSG = "An at expression must be a TimeInstantValue."
	public static val INVALID_TRIGGER_INVOCATION_EXPRESSION_WHEN_ARGUMENT = "validateTriggerInvocationActionWhenArgument"
	public static val INVALID_TRIGGER_INVOCATION_EXPRESSION_WHEN_ARGUMENT_MSG = "A when expression must be Boolean."
		
	public static val INVALID_CONTROL_NODE_INCOMING_SUCCESSIONS = "validateControlNodeIncomingSuccessions"
	public static val INVALID_CONTROL_NODE_INCOMING_SUCCESSIONS_MSG = "Incoming successions must have target multiplicity 1."
	public static val INVALID_CONTROL_NODE_OUTGOING_SUCCESSIONS = "validateControlNodeOutgoingSuccessions"
	public static val INVALID_CONTROL_NODE_OUTGOING_SUCCESSIONS_MSG = "Outgoing successions must have source multiplicity 1."
	public static val INVALID_CONTROL_NODE_OWNING_TYPE = "validateControlNodeOwningType"
	public static val INVALID_CONTROL_NODE_OWNING_TYPE_MSG = "A control node must be owned by an action definition or usage."
	
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
	public static val INVALID_PERFORM_ACTION_USAGE_REFERENCE_MSG = "Must reference an action."
	
	public static val INVALID_SEND_ACTION_USAGE_PARAMETERS = "validateSendActionUsageParameter"
	public static val INVALID_SEND_ACTION_USAGE_PARAMETERS_MSG = "A send action usage must have three input parameters."
	public static val INVALID_SEND_ACTION_USAGE_RECEIVER = "validateSendActionReceiver_"
	public static val INVALID_SEND_ACTION_USAGE_RECEIVER_MSG = 'Sending to a port should generally use "via" instead of "to".'
	public static val INVALID_SEND_ACTION_USAGE_PAYLOAD = "validateSendActionPayload_"
	public static val INVALID_SEND_ACTION_USAGE_PAYLOAD_MSG = 'A send action must have a payload.'
	
	public static val INVALID_FOR_LOOP_ACTION_USAGE_LOOP_VARIABLE = "validateForLoopActionUsageLoopVariable"
	public static val INVALID_FOR_LOOP_ACTION_USAGE_LOOP_VARIABLE_MSG ="A for loop action must have a loop variable."
	public static val INVALID_FOR_LOOP_ACTION_USAGE_PARAMETERS = "validateForLoopActionUsageParameters"
	public static val INVALID_FOR_LOOP_ACTION_USAGE_PARAMETERS_MSG ="A for loop action must have two parameters."
	
	public static val INVALID_IF_ACTION_USAGE_PARAMETERS = "validateIfActionUsageParameters"
	public static val INVALID_IF_ACTION_USAGE_PARAMETERS_MSG ="An if action must have at least two parameters."
	
	public static val INVALID_WHILE_LOOP_ACTION_USAGE_PARAMETERS = "validateWhileLoopActionUsageParameters"
	public static val INVALID_WHILE_LOOP_ACTION_USAGE_PARAMETERS_MSG ="A while loop action must have at least two parameters."
	
	public static val INVALID_EXHIBIT_STATE_USAGE_REFERENCE = "validateExhibitStateUsageReference"
	public static val INVALID_EXHIBIT_STATE_USAGE_REFERENCE_MSG = "Must reference a state."
		
	public static val INVALID_STATE_SUBACTION_KIND_ENTRY_MSG = "A state may have at most one entry action."
	public static val INVALID_STATE_SUBACTION_KIND_DO_MSG = "A state may have at most one do action."
	public static val INVALID_STATE_SUBACTION_KIND_EXIT_MSG = "A state may have at most one exit action."
	
	public static val INVALID_STATE_DEFINITION_PARALLEL_SUBACTIONS = "validateStateDefinitionParallelSubactions"
	public static val INVALID_STATE_DEFINITION_PARALLEL_SUBACTIONS_MSG = "A parallel state cannot have successions or transitions."
	public static val INVALID_STATE_DEFINITION_SUBACTION_KIND = "validateStateDefinitionSubactionKind"
	public static val INVALID_STATE_DEFINITION_SUBACTION_KIND_MSG_1 = INVALID_STATE_SUBACTION_KIND_ENTRY_MSG
	public static val INVALID_STATE_DEFINITION_SUBACTION_KIND_MSG_2 = INVALID_STATE_SUBACTION_KIND_DO_MSG
	public static val INVALID_STATE_DEFINITION_SUBACTION_KIND_MSG_3 = INVALID_STATE_SUBACTION_KIND_EXIT_MSG
	
	public static val INVALID_STATE_SUBACTION_MEMBERSHIP_OWNING_TYPE = "validateStateSubactionMembershioOwningType"
	public static val INVALID_STATE_SUBACTION_MEMBERSHIP_OWNING_TYPE_MSG = "Only a state can have an entry, do or exit action."
	
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
	
	public static val INVALID_TRANSITION_USAGE_PARAMETERS = "validateTransitionUsageParameters"
	public static val INVALID_TRANSITION_USAGE_PARAMETERS_MSG_1 = "Must have an input parameter."
	public static val INVALID_TRANSITION_USAGE_PARAMETERS_MSG_2 = "Must have two input parameters."
	public static val INVALID_TRANSITION_USAGE_SUCCESSION = "validateTransitionUsageSuccession"
	public static val INVALID_TRANSITION_USAGE_SUCCESSION_MSG = "A transition must own a succession to its target."
	
	public static val INVALID_CALCULATION_USAGE_TYPE = "validateCalculationUsageType_"
	public static val INVALID_CALCULATION_USAGE_TYPE_MSG = "A calculation must be typed by one calculation definition."
	
	public static val INVALID_CONSTRAINT_USAGE_TYPE = "Invalid Constraint Usage - invalid type"
	public static val INVALID_CONSTRAINT_USAGE_TYPE_MSG = "A constraint must be typed by one constraint definition."
	
	public static val INVALID_ACTOR_MEMBERSHIP_OWNING_TYPE = "validateActorMembershipOwningType"
	public static val INVALID_ACTOR_MEMBERSHIP_OWNING_TYPE_MSG = "Only requirements and cases can have actors."
	
	public static val INVALID_FRAMED_CONCERN_MEMBERSHIP_CONSTRAINT_KIND = "validateFramedConcernMembershipConstraintKind"
	public static val INVALID_FRAMED_CONCERN_MEMBERSHIP_CONSTRAINT_KIND_MSG = "A framed concern must be a required constraint."
	
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
	
	public static val INVALID_SATISFY_REQUIREMENT_USAGE_REFERENCE = "validateSatisfyRequirementUsageReference"
	public static val INVALID_SATISFY_REQUIREMENT_USAGE_REFERENCE_MSG = "Must reference a requirement."

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
	
	public static val INVALID_VERIFICATION_CASE_USAGE_TYPE = "validateVerificationCaseUsageType_"
	public static val INVALID_VERIFICATION_CASE_USAGE_TYPE_MSG = "A verification case must be typed by one verification case definition."
	
	public static val INVALID_INCLUDE_USE_CASE_USAGE_REFERENCE = "validateIncludeUseCaseUsageReference"
	public static val INVALID_INCLUDE_USE_CASE_USAGE_REFERENCE_MSG = "Must reference a use case."
		
	public static val INVALID_USE_CASE_USAGE_TYPE = "validateUseCaseUsageType_"
	public static val INVALID_USE_CASE_USAGE_TYPE_MSG = "A use case must be typed by one use case definition."
	public static val INVALID_USE_CASE_USAGE_REFERENCE = "validateUseCaseUsageReference"
	public static val INVALID_USE_CASE_USAGE_REFERENCE_MSG = "Must reference a use case."

	
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
		if (definition.isVariation) {
			// validateDefinitionVariationOwnedFeatureMembership
			for (mem: definition.ownedFeatureMembership) {
				// NOTE: Need to allow parameters and objectives because they are currently physically inserted by transform implementation.
				// TODO: Add allowance of parameters and objectives in variations to spec? Or remove when possible?
				if (!(mem instanceof ParameterMembership || mem instanceof ObjectiveMembership)) {
					error(INVALID_DEFINITION_VARIATION_MEMBERSHIP_MSG, mem, null, INVALID_DEFINITION_VARIATION_MEMBERSHIP)							
				}
			}
			
			// validateDefinitionVariationSpecialization
			for (ownedSpec: definition.ownedSpecialization) {
				if (ownedSpec.general.isVariation) {
					error(INVALID_DEFINITION_VARIATION_SPECIALIZATION_MSG, ownedSpec, SysMLPackage.eINSTANCE.specialization_General, INVALID_DEFINITION_VARIATION_SPECIALIZATION)
				}
			}
		}	
	}
	
//	@Check
//	def checkReferenceUsage(ReferenceUsage usage) {
//		// validateReferenceUsageIsReferential is satisfied automatically		
//	}
	
	
	@Check
	def checkUsage(Usage usage) {
		// validateUsageIsReferential is satisfied automatically
		
		if (usage.isVariation) {
			// validateUsageVariationOwnedFeatureMembership
			for (mem: usage.ownedFeatureMembership) {
				// NOTE: Need to allow parameters and objectives because they are currently physically inserted by transform implementation.
				// TODO: Add allowance of parameters and objectives in variations to spec? Or remove when possible?
				if (!(mem instanceof ParameterMembership || mem instanceof ObjectiveMembership)) {
					error(INVALID_USAGE_VARIATION_MEMBERSHIP_MSG, mem, null, INVALID_USAGE_VARIATION_MEMBERSHIP)							
				}
			}
			
			// validateUsageVariationSpecialization
			for (ownedSpec: usage.ownedSpecialization) {
				if (ownedSpec.general.isVariation) {
					error(INVALID_USAGE_VARIATION_SPECIALIZATION_MSG, ownedSpec, SysMLPackage.eINSTANCE.specialization_General, INVALID_USAGE_VARIATION_SPECIALIZATION)
				}
			}
		}
	}
	
	protected def boolean isVariation(Namespace namespace) {
		namespace instanceof Definition && (namespace as Definition).isVariation ||
		namespace instanceof Usage && (namespace as Usage).isVariation
	}
	
	@Check
	def checkVariantMembership(VariantMembership mem) {
		// validateVariantMembershipOwningNamespace
		if (!mem.membershipOwningNamespace.isVariation) {
			error(INVALID_VARIANT_MEMBERSHIP_OWNING_NAMESPACE_MSG, mem, null, INVALID_VARIANT_MEMBERSHIP_OWNING_NAMESPACE)
		}	
	}

	@Check
	def checkAttributeDefinition(AttributeDefinition defn) {
		// Not implemented for now, until resolution of KerML issues on composite semantics. (See KERML-4.)
		// TODO: Check validateAttributeDefinitionFeatures
		// NOTE: Only check owned features, for efficiency and to avoid redundancy.
		// (This should be sufficient, unless a composite feature is inherited from a KerML data type.)
		// checkAllNotComposite(defn.ownedFeature, INVALID_ATTRIBUTE_DEFINITION_FEATURES_MSG, INVALID_ATTRIBUTE_DEFINITION_FEATURES)
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
		
		// Not implemented for now, until resolution of KerML issues on composite semantics. (See KerML-4.)
		// TODO: Check validateAttributeUsageFeatures
		// NOTE: Only check owned features, for efficiency and to avoid redundancy.
		// (This should be sufficient, unless a composite feature is inherited from a KerML data type.)
		// checkAllNotComposite(usg.ownedFeature, INVALID_ATTRIBUTE_USAGE_FEATURES_MSG, INVALID_ATTRIBUTE_USAGE_FEATURES)
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
		
		// validateEventOccurrenceUsageReference
		if (!(usg instanceof PerformActionUsage || usg instanceof IncludeUseCaseUsage)) {
			checkReferenceType(usg, OccurrenceUsage, INVALID_EVENT_OCCURRENCE_USAGE_REFERENCE_MSG, INVALID_EVENT_OCCURRENCE_USAGE_REFERENCE)
		}
	}
	
//	@Check
//	def checkLifeClass(LifeClass cls) {}
//		// validateLifeClassIsSufficient is satisfied automatically
//	}
	
	@Check
	def checkOccurrenceDefinition(OccurrenceDefinition defn) {
		// validateOccurrenceDefinitionLifeClass
		val n = defn.ownedMember.filter[m | m instanceof LifeClass].size
		if (defn.isIndividual) {
			if (n != 1) {
				error(INVALID_OCCURRENCE_DEFINITION_LIFE_CLASS_MSG_1, defn, null, INVALID_OCCURRENCE_DEFINITION_LIFE_CLASS)
			}
		} else {
			if (n > 0) {
				error(INVALID_OCCURRENCE_DEFINITION_LIFE_CLASS_MSG_2, defn, null, INVALID_OCCURRENCE_DEFINITION_LIFE_CLASS)
			}			
		}
	}
	
	@Check 
	def checkOccurrenceUsage(OccurrenceUsage usg) {
		// All types must be Classes
		if (!(usg instanceof ItemUsage || usg instanceof PortUsage || usg instanceof Step))	
			checkAllTypes(usg, org.omg.sysml.lang.sysml.Class, INVALID_OCCURRENCE_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.occurrenceUsage_OccurrenceDefinition, INVALID_OCCURRENCE_USAGE_TYPE)

		// validateOccurrenceUsageIndividualDefinition
		var nIndividualDefs = usg.occurrenceDefinition.filter[d | d instanceof OccurrenceDefinition && (d as OccurrenceDefinition).isIndividual].size
		if (nIndividualDefs > 1) {
			error(INVALID_OCCURRENCE_USAGE_INDIVIDUAL_DEFINITION_MSG, usg, null, INVALID_OCCURRENCE_USAGE_INDIVIDUAL_DEFINITION_MSG)

		// validateOccurrenceUsageIndividualUsage
		} else if (usg.isIndividual && nIndividualDefs != 1) {
			error (INVALID_OCCURRENCE_USAGE_INDIVIDUAL_USAGE_MSG, SysMLPackage.eINSTANCE.occurrenceUsage_OccurrenceDefinition, INVALID_OCCURRENCE_USAGE_INDIVIDUAL_USAGE)
		}

	}
	
	@Check
	def checkItemUsage(ItemUsage iu) {
		// All types must be Structures
		if (!(iu instanceof PartUsage || iu instanceof PortUsage || iu instanceof MetadataUsage))	
			checkAllTypes(iu, Structure, INVALID_ITEM_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.itemUsage_ItemDefinition, INVALID_ITEM_USAGE_TYPE)
	}
	
	@Check
	def checkPartUsage(PartUsage pu){
		if (!(pu instanceof ConnectionUsage))
			if (checkAllTypes(pu, Structure, INVALID_PART_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.itemUsage_ItemDefinition, INVALID_PART_USAGE_TYPE))
				// validatePartUsagePartDefinition
				checkAtLeastOneType(pu, PartDefinition, INVALID_PART_USAGE_PART_DEFINITION_MSG, SysMLPackage.eINSTANCE.partUsage_PartDefinition, INVALID_PART_USAGE_PART_DEFINITION)
	}
	
	@Check
	def checkConjugatedPortDefinition(ConjugatedPortDefinition cpd) {
		// validateConjugatedPortDefinitionConjugatedPortDefinition
		if (cpd.conjugatedPortDefinition !== null) {
			error(INVALID_CONJUGATED_PORT_DEFINITION_CONJUGATED_PORT_DEFINITION_MSG, cpd, null, INVALID_CONJUGATED_PORT_DEFINITION_CONJUGATED_PORT_DEFINITION)
		}
		
		// validateConjugatedPortDefinitionOriginalPortDefinition
		val portConjugator = cpd.ownedPortConjugator
		if (portConjugator !== null && portConjugator.originalPortDefinition !== cpd.originalPortDefinition) {
			error(INVALID_CONJUGATED_PORT_DEFINITION_ORIGINAL_PORT_DEFINITION_MSG, cpd, null, INVALID_CONJUGATED_PORT_DEFINITION_ORIGINAL_PORT_DEFINITION)
		}
	}
	
	@Check
	def checkPortDefinition(PortDefinition pd) {
		// Check validatePortDefinitionConjugatedPortDefinition
		if (!(pd instanceof ConjugatedPortDefinition)) {
			val n = pd.ownedMember.filter[m | m instanceof ConjugatedPortDefinition].size()
			if (n != 1) {
				error(INVALID_PORT_DEFINITION_CONJUGATED_PORT_DEFINITION_MSG, pd, null, INVALID_PORT_DEFINITION_CONJUGATED_PORT_DEFINITION)
			}
		}
		
		// validatePortDefinitionOwnedUsagesNotComposite
		val usages = pd.ownedUsage.filter[u | !(u instanceof PortUsage)]
		checkAllNotComposite(usages, INVALID_PORT_DEFINITION_OWNED_USAGES_NOT_COMPOSITE_MSG, INVALID_PORT_DEFINITION_OWNED_USAGES_NOT_COMPOSITE)
	}
	
	@Check
	def checkPortUsage(PortUsage usg) {
		// All types must be PortDefinitions
		checkAllTypes(usg, PortDefinition, INVALID_PORT_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.portUsage_PortDefinition, INVALID_PORT_USAGE_TYPE)

		// validatePortUsageIsReference is satisfied automatically

		// validatePortUsageNestedUsagesNotComposite
		val usages = usg.nestedUsage.filter[u | !(u instanceof PortUsage)]
		checkAllNotComposite(usages, INVALID_PORT_USAGE_NESTED_USAGES_NOT_COMPOSITE_MSG, INVALID_PORT_USAGE_NESTED_USAGES_NOT_COMPOSITE)
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
		// validateAcceptActionUsageParameters
		if (usg.inputParameters.size < 2) {
			error(INVALID_ACCEPT_ACTION_USAGE_PARAMETERS_MSG, usg, null, INVALID_ACCEPT_ACTION_USAGE_PARAMETERS)
		}
	}
	
	@Check
	def checkActionUsage(ActionUsage usg) {
		// All types must be Behaviors
		if (!(usg instanceof StateUsage || usg instanceof CalculationUsage || usg instanceof FlowConnectionUsage) )
			checkAllTypes(usg, Behavior, INVALID_ACTION_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.actionUsage_ActionDefinition, INVALID_ACTION_USAGE_TYPE)
	}
	
	@Check
	def checkAssignmentActionUsage(AssignmentActionUsage usg) {
		// validateAssignmentActionUsageArguments
		// NOTE: First argument is allowed to be null, pending resolution of SYSML2-499.
		if (/*usg.argument(1) === null ||*/ usg.argument(2) === null) {
			error(INVALID_ASSIGNMENT_ACTION_USAGE_ARGUMENTS_MSG, usg, null, INVALID_ASSIGNMENT_ACTION_USAGE_ARGUMENTS)
		}
		
		// validateAssignmentActionUsageReferent
		if (!usg.ownedMembership.exists[m | !(m instanceof FeatureMembership) && m.memberElement instanceof Feature]) {
			error(INVALID_ASSIGNMENT_ACTION_USAGE_REFERENT_MSG, usg, null, INVALID_ASSIGNMENT_ACTION_USAGE_REFERENT)
		}
		
	}
	
	@Check
	def checkTriggerInvocationExpression(TriggerInvocationExpression expr) {
		val kind = expr.kind
		val arguments = expr.argument
		val argument = if (arguments.empty) null else arguments.get(0)
		
		// validateTriggerInvocationExpressionAfterArgument
		if (kind == TriggerKind.AFTER && !(argument !== null && isDuration(argument))) {
			error(INVALID_TRIGGER_INVOCATION_EXPRESSION_AFTER_ARGUMENT_MSG, expr, null, INVALID_TRIGGER_INVOCATION_EXPRESSION_AFTER_ARGUMENT)
		}
		
		// validateTriggerInvocationExpressionAtArgument
		if (kind == TriggerKind.AT && !(argument !== null && isTime(argument))) {
			error(INVALID_TRIGGER_INVOCATION_EXPRESSION_AT_ARGUMENT_MSG, expr, null, INVALID_TRIGGER_INVOCATION_EXPRESSION_AT_ARGUMENT)
		}
		
		// validateTriggerInvocationExpressionWhenArgument
		if (kind == TriggerKind.WHEN && !(argument !== null && isBooleanExpression(argument))) {
			error(INVALID_TRIGGER_INVOCATION_EXPRESSION_WHEN_ARGUMENT_MSG, expr, null, INVALID_TRIGGER_INVOCATION_EXPRESSION_WHEN_ARGUMENT)
		}
	}
	
	def static boolean isTime(Expression expr) {
		expr.result !== null && specializesFromLibrary(expr, expr.result, "Time::TimeInstantValue") ||
		expr instanceof OperatorExpression &&
			(expr as OperatorExpression).operator.isQuantityOperator &&
			(expr as OperatorExpression).argument.forall[isDuration || isTime]
	}
	
	def static boolean isDuration(Expression expr) {
		expr.isDurationLiteral ||
		expr.result !== null && specializesFromLibrary(expr, expr.result, "ISQBase::DurationValue") ||
		expr instanceof OperatorExpression &&
			(expr as OperatorExpression).operator.isQuantityOperator &&
			(expr as OperatorExpression).argument.forall[isDuration || isTime]
	}
	
	def static boolean isDurationLiteral(Expression expr) {
		if (expr instanceof OperatorExpression) {
			if (expr.operator == "[") {
				val arguments = expr.argument
				if (arguments.size >= 2) {
					val result = arguments.get(1).result
					return result !== null && specializesFromLibrary(expr, result, "ISQBase::DurationUnit")
				}
			}
		}
		return false
	}
	
	def static boolean isTimeOperation(Expression expr) {
		if (expr instanceof OperatorExpression) {
			expr.operator.isQuantityOperator &&
			expr.argument.forall[isDuration || isTime]
		}
		return false
	}
	
	def static isQuantityOperator(String operator) {
		newArrayList("-", "+", "*", "%", "^", "**").contains(operator)
	}
	
	@Check
	def checkControlNode(ControlNode node) {
		// TODO: Check validateControlNodeIncomingSuccessions (?)
		// TODO: Check validateControlNodeOutgoingSuccessions (?)
		
		// validateControlNodeOwningType
		val owningType = node.owningType
		if (!(owningType !== null && (owningType instanceof ActionUsage || owningType instanceof ActionDefinition))) {
			error(INVALID_CONTROL_NODE_OWNING_TYPE_MSG, node, null, INVALID_CONTROL_NODE_OWNING_TYPE)
		}
	}
	
	@Check
	def checkDecisionNode(DecisionNode node) {	
		// TODO: Check validateDecisionNodeIncomingSuccessions (?)
		// TODO: Check validateDecisionNodeOutgoingSuccessions (?)
	}
	
	@Check
	def checkForkNode(ForkNode node) {
		// TODO: Check validateForkNodeIncomingSuccessions (?)
	}
	
	@Check
	def checkJoinNode(JoinNode node) {
		// TODO: Check validateJoinNodeOutgoingSuccessions (?)
	}
	
	@Check
	def checkMergeNode(MergeNode node) {	
		// TODO: Check validateMergeNodeIncomingSuccessions (?)
		// TODO: Check validateMergeNodeOutgoingSucessions (?)
	}
	
	@Check
	def checkPerformActionUsage(PerformActionUsage usg) {
		// validatePerformActionUsageReference
		if (!(usg instanceof ExhibitStateUsage || usg instanceof IncludeUseCaseUsage)) {
			checkReferenceType(usg, ActionUsage, INVALID_PERFORM_ACTION_USAGE_REFERENCE_MSG, INVALID_PERFORM_ACTION_USAGE_REFERENCE)
		}
	}
	
	@Check
	def checkSendActionUsage(SendActionUsage usg) {
		// Warn if sending "to" a port, rather than "via"
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

		// validateSendActionParameters
		if (usg.inputParameters.size < 3) {
			error(INVALID_SEND_ACTION_USAGE_PARAMETERS_MSG, usg, null, INVALID_SEND_ACTION_USAGE_PARAMETERS)
		}
	}
	
	@Check
	def checkForLoopActionUsage(ForLoopActionUsage usg) {
		// validateForLoopActionUsageLoopVariable
		val ownedFeatures = usg.ownedFeature
		if (ownedFeatures.empty || !(ownedFeatures.get(0) instanceof ReferenceUsage)) {
			error(INVALID_FOR_LOOP_ACTION_USAGE_LOOP_VARIABLE_MSG, usg, null, INVALID_FOR_LOOP_ACTION_USAGE_LOOP_VARIABLE)
		}
		
		// validateForLoopActionUsageParameters
		if (usg.inputParameters.size != 2) {
			error(INVALID_FOR_LOOP_ACTION_USAGE_PARAMETERS_MSG, usg, null, INVALID_FOR_LOOP_ACTION_USAGE_PARAMETERS)
		}
	}	
	
	@Check
	def checkIfActionUsage(IfActionUsage usg) {
		// validateIfActionUsageParameters
		if (usg.inputParameters.size < 2) {
			error(INVALID_IF_ACTION_USAGE_PARAMETERS_MSG, usg, null, INVALID_IF_ACTION_USAGE_PARAMETERS)
		}
	}	
	
	@Check
	def checkWhileLoopActionUsage(WhileLoopActionUsage usg) {
		// validateWhileLoopActionUsageParameters
		if (usg.inputParameters.size < 2) {
			error(INVALID_WHILE_LOOP_ACTION_USAGE_PARAMETERS_MSG, usg, null, INVALID_WHILE_LOOP_ACTION_USAGE_PARAMETERS)
		}
	}	
	
	@Check
	def checkExhibitStateUsage(ExhibitStateUsage usg) {
		// validateExhibitStateUsageReference
		checkReferenceType(usg, StateUsage, INVALID_EXHIBIT_STATE_USAGE_REFERENCE_MSG, INVALID_EXHIBIT_STATE_USAGE_REFERENCE)
	}
		
	@Check
	def checkStateDefinition(StateDefinition defn) {
		// validateStateDefinitionParallelSubactions is checked by checkTransitionUsage and checkSuccession
		
		// validateStateDefinitionStateSubactionKind
		checkStateSubactions(defn);
	}
	
	@Check
	def checkStateSubactionMembership(StateSubactionMembership mem) {
		// validateStateSubactionMembershipOwningType
		val owningType = mem.owningType;
		if (!(owningType instanceof StateUsage || owningType instanceof StateDefinition)) {
			error(INVALID_STATE_SUBACTION_MEMBERSHIP_OWNING_TYPE_MSG, mem, null, INVALID_STATE_SUBACTION_MEMBERSHIP_OWNING_TYPE)
		}
	}
		
	@Check
	def checkStateUsage(StateUsage usg){
		// All types must be Behaviors
		checkAllTypes(usg, Behavior, INVALID_STATE_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.stateUsage_StateDefinition, INVALID_STATE_USAGE_TYPE)

		// validateStateUsageParallelSubactions is checked by checkTransitionUsage and checkSuccession

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
		val kind = mem.kind
		if (kind == TransitionFeatureKind.EFFECT) {
			// validateTransitionFeatureMembershipEffectAction
			if (!(mem.transitionFeature instanceof ActionUsage)) {
				error(INVALID_TRANSITION_FEATURE_MEMBERSHIP_EFFECT_ACTION_MSG, mem, null, INVALID_TRANSITION_FEATURE_MEMBERSHIP_EFFECT_ACTION)
			}
		} else if (kind == TransitionFeatureKind.GUARD) {
			// Check validateTransitionFeatureMembershipGuardExpression
			val transitionFeature = mem.transitionFeature
			if (!(transitionFeature instanceof Expression && (transitionFeature as Expression).isBoolean)) {
				error(INVALID_TRANSITION_FEATURE_MEMBERSHIP_GUARD_EXPRESSION_MSG, mem, null, INVALID_TRANSITION_FEATURE_MEMBERSHIP_GUARD_EXPRESSION)
			}
		} if (kind == TransitionFeatureKind.TRIGGER) {
			// validateTransitionFeatureMembershipTriggerAction
			if (!(mem.transitionFeature instanceof AcceptActionUsage)) {
				error(INVALID_TRANSITION_FEATURE_MEMBERSHIP_TRIGGER_ACTION_MSG, mem, null, INVALID_TRANSITION_FEATURE_MEMBERSHIP_TRIGGER_ACTION)
			}
		}
		
		// validateTransitionFeatureMembershipOwningType
		if (!(mem.owningType instanceof TransitionUsage)) {
			error(INVALID_TRANSITION_FEATURE_MEMBERSHIP_OWNING_TYPE_MSG, mem, null, INVALID_TRANSITION_FEATURE_MEMBERSHIP_OWNING_TYPE)
		}
	}
	
	@Check
	def checkTransitionUsage(TransitionUsage usg) {
		// validateStateDefinitionParallelSubactions
		// validateStateUsageParallelSubactions
		if (UsageUtil.isParallelState(usg.owningType)) {
			if (usg.owningType instanceof Definition) {
				error(INVALID_STATE_DEFINITION_PARALLEL_SUBACTIONS_MSG, usg, null, INVALID_STATE_DEFINITION_PARALLEL_SUBACTIONS_MSG)
			} else {
				error(INVALID_STATE_USAGE_PARALLEL_SUBACTIONS_MSG, usg, null, INVALID_STATE_USAGE_PARALLEL_SUBACTIONS_MSG)
			}
		}
		
		// validateTransitionUsageParameters
		val n = usg.inputParameters.size
		if (usg.triggerAction.isEmpty) {
			if (n < 1) {
				error(INVALID_TRANSITION_USAGE_PARAMETERS_MSG_1, usg, null, INVALID_TRANSITION_USAGE_PARAMETERS)
			}
		} else {
			if (n < 2) {
				error(INVALID_TRANSITION_USAGE_PARAMETERS_MSG_2, usg, null, INVALID_TRANSITION_USAGE_PARAMETERS)
			}
		}
		
		// validateTransitionUsageSuccession	
		val successions = usg.ownedMember.filter[m | m instanceof Succession]
		if (successions.empty || !(successions.get(0) as Succession).targetFeature.forall[f | FeatureUtil.getBasicFeatureOf(f) instanceof ActionUsage]) {
			error(INVALID_TRANSITION_USAGE_SUCCESSION_MSG, usg, null, INVALID_TRANSITION_USAGE_SUCCESSION)
		}
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
		// TODO: Add/check validateAssertConstraintUsageReference
	}

	@Check 
	def checkConstraintUsage(ConstraintUsage usg){
		// Must have exactly one type, which is a Predicate
		if (!(usg instanceof RequirementUsage))
			checkOneType(usg, Predicate, INVALID_CONSTRAINT_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.constraintUsage_ConstraintDefinition, INVALID_CONSTRAINT_USAGE_TYPE)
	}
	
	@Check
	def checkActorMembership(ActorMembership mem) {
		// validateActorMembershipOwningType
		val owningType = mem.owningType
		if (!(owningType instanceof RequirementDefinition || owningType instanceof RequirementUsage ||
			  owningType instanceof CaseDefinition || owningType instanceof CaseUsage)) {
			error(INVALID_ACTOR_MEMBERSHIP_OWNING_TYPE_MSG, mem, null, INVALID_ACTOR_MEMBERSHIP_OWNING_TYPE)
		}
	}
	
	@Check
	def checkFramedConcernUsage(FramedConcernMembership mem) {
		// validateFramedConcernMembershipConstraintKind
		if (mem.kind != RequirementConstraintKind::REQUIREMENT) {
			error(INVALID_FRAMED_CONCERN_MEMBERSHIP_CONSTRAINT_KIND_MSG, mem, null, INVALID_FRAMED_CONCERN_MEMBERSHIP_CONSTRAINT_KIND)
		}
	}
	
	@Check
	def checkRequirementConstraintMembership(RequirementConstraintMembership mem) {
		// validateRequirementConstraintMembershipIsComposite
		val ownedConstraint = mem.ownedConstraint
		if (ownedConstraint !== null && !ownedConstraint.isComposite) {
			error(INVALID_REQUIREMENT_CONSTRAINT_MEMBERSHIP_IS_COMPOSITE_MSG, mem, null, INVALID_REQUIREMENT_CONSTRAINT_MEMBERSHIP_IS_COMPOSITE)
		}
		
		// validateRequirementConstraintMembershipOwningType
		val owningType = mem.owningType
		if (!(owningType instanceof RequirementDefinition || owningType instanceof RequirementUsage)) {
			error(INVALID_REQUIREMENT_CONSTRAINT_MEMBERSHIP_OWNING_TYPE_MSG, mem, null, INVALID_REQUIREMENT_CONSTRAINT_MEMBERSHIP_OWNING_TYPE)
		}
	}
	
	@Check
	def checkRequirementDefinition(RequirementDefinition defn) {
		// validateRequirementDefinitionOnlyOneSubject
		checkAtMostOneFeature(defn, SubjectMembership, INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT_MSG, INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT)
		
		// validateRequirementDefinitionSubjectParameterPosition
		checkSubjectParameter(defn, defn.subjectParameter, defn.input, INVALID_REQUIREMENT_DEFINITION_SUBJECT_PARAMETER_POSITION_MSG, INVALID_REQUIREMENT_DEFINITION_SUBJECT_PARAMETER_POSITION)
	}	
	
	@Check 
	def checkRequirementUsage(RequirementUsage usg){
		// Must have exactly one type, which is a RequirementDefinition
		checkOneType(usg, RequirementDefinition, INVALID_REQUIREMENT_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.requirementUsage_RequirementDefinition, INVALID_REQUIREMENT_USAGE_TYPE)

		// validateRequirementUsageOnlyOneSubject
		checkAtMostOneFeature(usg, SubjectMembership, INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT_MSG, INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT)
		
		// validateRequirementUsageSubjectParameterPosition
		checkSubjectParameter(usg, usg.subjectParameter, usg.input, INVALID_REQUIREMENT_USAGE_SUBJECT_PARAMETER_POSITION_MSG, INVALID_REQUIREMENT_USAGE_SUBJECT_PARAMETER_POSITION)
	}
	
	@Check
	def checkSatisfyRequirementUsage(SatisfyRequirementUsage usg) {
		// validateSatisfyRequirementUsageReference
		checkReferenceType(usg, RequirementUsage, INVALID_SATISFY_REQUIREMENT_USAGE_REFERENCE_MSG, INVALID_SATISFY_REQUIREMENT_USAGE_REFERENCE)
	}
	
	@Check
	def checkStakeholderMembership(StakeholderMembership mem) {
		// validateStakeholderMembershipOwningType
		val owningType = mem.owningType
		if (!(owningType instanceof RequirementDefinition || owningType instanceof RequirementUsage)) {
			error(INVALID_STAKEHOLDER_MEMBERSHIP_OWNING_TYPE_MSG, mem, null, INVALID_STAKEHOLDER_MEMBERSHIP_OWNING_TYPE)
		}
	}
	
	@Check
	def checkSubjectMembership(SubjectMembership mem) {
		// validateSubjectMembershipOwningType
		val owningType = mem.owningType
		if (!(owningType instanceof RequirementDefinition || owningType instanceof RequirementUsage ||
			  owningType instanceof CaseDefinition || owningType instanceof CaseUsage ||
			  // NOTE: Temporarily allow requirement constraint features to have subject memberships
			  // TODO: Remove this once implicit subjects are no longer being physically inserted
			  owningType !== null && owningType.owningMembership instanceof RequirementConstraintMembership)) {
			error(INVALID_SUBJECT_MEMBERSHIP_OWNING_TYPE_MSG, mem, null, INVALID_SUBJECT_MEMBERSHIP_OWNING_TYPE)
		}
	}
	
	
	@Check
	def checkCaseDefinition(CaseDefinition defn) {
		// validateCaseDefinitionOnlyOneObjective is checked in checkObjectiveMembership
		checkAtMostOneFeature(defn, ObjectiveMembership, INVALID_CASE_USAGE_ONLY_ONE_OBJECTIVE_MSG, INVALID_CASE_USAGE_ONLY_ONE_OBJECTIVE)
		
		// validateCaseDefinitionOnlyOneSubject is checked in checkSubjectMembership
		checkAtMostOneFeature(defn, SubjectMembership, INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT_MSG, INVALID_REQUIREMENT_USAGE_ONLY_ONE_SUBJECT)
		
		// validateCaseDefinitionSubjectParameterPosition
		checkSubjectParameter(defn, defn.subjectParameter, defn.input, INVALID_CASE_DEFINITION_SUBJECT_PARAMETER_POSITION_MSG, INVALID_CASE_DEFINITION_SUBJECT_PARAMETER_POSITION)
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
		
		// validateCaseUsageSubjectParameterPosition
		checkSubjectParameter(usg, usg.subjectParameter, usg.input, INVALID_CASE_USAGE_SUBJECT_PARAMETER_POSITION_MSG, INVALID_CASE_USAGE_SUBJECT_PARAMETER_POSITION)
	}
	
	@Check
	def checkObjectiveMembership(ObjectiveMembership mem) {
		// validateObjectiveMembershipIsComposite
		val ownedObjectiveRequirement = mem.ownedObjectiveRequirement
		if (ownedObjectiveRequirement !== null && !ownedObjectiveRequirement.isComposite) {
			error(INVALID_OBJECTIVE_MEMBERSHIP_IS_COMPOSITE_MSG, mem, null, INVALID_OBJECTIVE_MEMBERSHIP_IS_COMPOSITE)
		}
		
		// validateObjectiveMembershipOwningType
		val owningType = mem.owningType
		if (!(owningType instanceof CaseDefinition || owningType instanceof CaseUsage)) {
			error(INVALID_OBJECTIVE_MEMBERSHIP_OWNING_TYPE_MSG, mem, null, INVALID_OBJECTIVE_MEMBERSHIP_OWNING_TYPE)
		}
	}	
	
	@Check 
	def checkAnalysisCaseUsage(AnalysisCaseUsage usg) {
		// Must have exactly one type, which is an AnalysisCaseDefinition
		checkOneType(usg, AnalysisCaseDefinition, INVALID_ANALYSIS_CASE_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.analysisCaseUsage_AnalysisCaseDefinition, INVALID_ANALYSIS_CASE_USAGE_TYPE)
	}
	
	@Check
	def checkRequirementVerificationMembership(RequirementVerificationMembership mem) {
		// validateRequirementVerificationMembershipKind
		if (mem.kind != RequirementConstraintKind::REQUIREMENT) {
			error(INVALID_REQUIREMENT_VERIFICATION_MEMBERSHIP_KIND_MSG, mem, null, INVALID_REQUIREMENT_VERIFICATION_MEMBERSHIP_KIND)
		}

		// validateRequirementVerificationMembershipOwningType
		if (!UsageUtil.isLegalVerification(mem)) {
			error(INVALID_REQUIREMENT_VERIFICATION_MEMBERSHIP_OWNING_TYPE_MSG, null, INVALID_REQUIREMENT_VERIFICATION_MEMBERSHIP_OWNING_TYPE)
		}
	}	
	
	@Check
	def checkVerificationCaseUsage(VerificationCaseUsage usg) {
		// Must have exactly one type, which is a VerificationCaseDefinition
		checkOneType(usg, VerificationCaseDefinition, INVALID_VERIFICATION_CASE_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.verificationCaseUsage_VerificationCaseDefinition, INVALID_VERIFICATION_CASE_USAGE_TYPE)
	}
	
	@Check
	def checkIncludeUseCaseUsage(IncludeUseCaseUsage usg) {
		// TODO: Add validateIncludeUseCaseUsageReference
		checkReferenceType(usg, UseCaseUsage, INVALID_INCLUDE_USE_CASE_USAGE_REFERENCE_MSG, INVALID_INCLUDE_USE_CASE_USAGE_REFERENCE)
	}
	
	@Check 
	def checkUseCaseUsage(UseCaseUsage usg) {
		// Must have exactly one type, which is a UseCaseDefinition
		checkOneType(usg, UseCaseDefinition, INVALID_USE_CASE_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.useCaseUsage_UseCaseDefinition, INVALID_USE_CASE_USAGE_TYPE)
	}
	
	@Check
	def checkExpose(Expose exp) {
		// validateExposeIsImportAll is automatically satisfied
		
		// validateExposeOwningNamespace
		if (!(exp.importOwningNamespace instanceof ViewUsage)) {
			error(INVALID_VARIANT_MEMBERSHIP_OWNING_NAMESPACE_MSG, exp, null, INVALID_VARIANT_MEMBERSHIP_OWNING_NAMESPACE)
		}	
	}
	
	@Check
	def checkRenderingUsage(RenderingUsage usg) {
		// Must have exactly one type, which is a RenderingDefinition
		checkOneType(usg, RenderingDefinition, INVALID_RENDERING_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.renderingUsage_RenderingDefinition, INVALID_RENDERING_USAGE_TYPE)
	}
	
	@Check
	def checkViewDefinition(ViewDefinition viewDef) {
		// validateViewDefinitionOnlyOneViewRendering
		checkAtMostOneElement(viewDef.ownedFeature.filter[f|f instanceof RenderingUsage], INVALID_VIEW_DEFINITION_ONLY_ONE_VIEW_RENDERING_MSG, INVALID_VIEW_DEFINITION_ONLY_ONE_VIEW_RENDERING)
	}
	
	@Check
	def checkViewRenderingMembership(ViewRenderingMembership mem) {
		// validateViewRenderingMembershipOwningType
		val owningType = mem.owningType
		if (!(owningType instanceof ViewDefinition || owningType instanceof ViewUsage)) {
			error(INVALID_VIEW_RENDERING_MEMBERSHIP_OWNING_TYPE_MSG, mem, null, INVALID_VIEW_RENDERING_MEMBERSHIP_OWNING_TYPE)
		}		
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
	override checkDataType(DataType d) {
		// validateDataTypeSpecialization
		// Overridden to tailor error message for SysML.
		for (s: d.ownedSpecialization) {
			if (s.general instanceof org.omg.sysml.lang.sysml.Class || s.general instanceof Association) {
				error(INVALID_ATTRIBUTE_DEFINITION_SPECIALIZATION_MSG, s, SysMLPackage.eINSTANCE.specialization_General, INVALID_ATTRIBUTE_DEFINITION_SPECIALIZATION)
			}
		}
	}
	
	@Check
	override checkClass(org.omg.sysml.lang.sysml.Class c) {
		// validateClassSpecialization
		// Overridden to tailor error message for SysML.
		for (s: c.ownedSpecialization) {
			if (s.general instanceof DataType || s.general instanceof Association && !(c instanceof Association)) {
				error(INVALID_ITEM_DEFINITION_SPECIALIZATION_MSG, s, SysMLPackage.eINSTANCE.specialization_General, INVALID_ITEM_DEFINITION_SPECIALIZATION)
			}
		}
	}
	
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
	
	protected def boolean checkNotAny(Iterable<? extends EObject> list, String msg, EStructuralFeature eFeature, String eId) {
		var check = true
		for (obj: list) {
			error(msg, obj, eFeature, eId)
			check = false
		}
		return check
	}
	
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
	
	protected def boolean checkAllNotComposite(Iterable<? extends Feature> list, String msg, String eId) {
		var check = true
		for (feature: list) {
			if (feature.isComposite) {
				error(msg, feature, null, eId)
				check = false
			}
		}
		return check
	}
	
	protected def boolean checkReferenceType(Feature feature, Class<?> type, String msg, String eId) {
		val subsetting = feature.ownedReferenceSubsetting
		
		// NOTE: This is implemented using getBasicFeatureOf to account for feature chaining. (See SYSML2-307.)
		if (subsetting !== null && !type.isInstance(FeatureUtil.getBasicFeatureOf(subsetting.referencedFeature))) {
			error(msg, subsetting, null, eId)
			return false
		}
		
		return true
	}
	
	protected def boolean checkSubjectParameter(Type type, Feature subjectParameter, Iterable<Feature> inputs, String msg, String eId) {
		if (subjectParameter !== null && (inputs.empty || inputs.get(0) !== subjectParameter)) {
			if (subjectParameter.owningType === type) {
				error(msg, subjectParameter, null, eId)
			} else {
				error(msg, type, null, eId)
			}
			return false
		}
		return true
	}
	
	protected def boolean checkAllParallelSpecialization(Type type, String msg1, String msg2, String eId) {
		val isParallel = type.isParallel
		val badGen = type.ownedSpecialization.filter[s | s.general.isParallel != isParallel]
		checkNotAny(badGen, isParallel? msg1: msg2, SysMLPackage.eINSTANCE.specialization_General, eId)
	}
	
	protected def boolean isParallel(Type type) {
		if (type instanceof StateDefinition) type.isParallel
		else if (type instanceof StateUsage) type.isParallel
		else false
	}
	
}
