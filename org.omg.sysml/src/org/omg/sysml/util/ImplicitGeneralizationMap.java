/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2025 Model Driven Solutions, Inc.
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
 *******************************************************************************/

package org.omg.sysml.util;

import java.util.HashMap;
import java.util.Map;

import org.omg.sysml.lang.sysml.impl.*;

public class ImplicitGeneralizationMap {
	
	private static ImplicitGeneralizationMap INSTANCE = new ImplicitGeneralizationMap();
	
	public static String getDefaultSupertypeFor(Class<?> elementType) {
		return INSTANCE.get(elementType);
	}

	public static String getDefaultSupertypeFor(Class<?> elementType, String kind) {
		return INSTANCE.get(elementType, kind);
	}
	
	protected Map<String, String> map = new HashMap<String, String>();
	
	protected ImplicitGeneralizationMap() {
		
		// KerML
		
		//checkAssociationSpecialization
		put(AssociationImpl.class, "base", "Links::Link");
		//checkAssociationBinarySpecialization
		put(AssociationImpl.class, "binary", "Links::BinaryLink");
		
		//checkAssociationStructureSpecialization
		put(AssociationStructureImpl.class, "base", "Objects::LinkObject");
		//checkAssociationStructureBinarySpecialization
		put(AssociationStructureImpl.class, "binary", "Objects::BinaryLinkObject");
		
		//checkBehaviorSpecialization
		put(BehaviorImpl.class, "base", "Performances::Performance");
		
		//checkBindingConnectorSpecialization
		put(BindingConnectorImpl.class, "binary", "Links::selfLinks");
		
		//checkBooleanExpressionSpecialization
		put(BooleanExpressionImpl.class, "base", "Performances::booleanEvaluations");
		
		//checkClassSpecialization
		put(ClassImpl.class, "base", "Occurrences::Occurrence");
		
		//checkTypeSpcialization
		put(ClassifierImpl.class, "base", "Base::Anything");
		
		//checkConnectorSpecialization
		put(ConnectorImpl.class, "base", "Links::links");
		//checkConnectorBinarySpecialization
		put(ConnectorImpl.class, "binary", "Links::binaryLinks");
		//checkConnectorObjectSpecialization
		put(ConnectorImpl.class, "object", "Objects::linkObjects");
		//checkConnectorBinaryObjectSpecialization
		put(ConnectorImpl.class, "binaryObject", "Objects::binaryLinkObjects");
		
		//checkConstructorExpressionSpecialization
		put(ConstructorExpressionImpl.class, "base", "Performances::constructorEvaluations");
		
		//checkDataTypeSpecialization
		put(DataTypeImpl.class, "base", "Base::DataValue");
		
		//checkExpressionSpecialization
		put(ExpressionImpl.class, "base", "Performances::evaluations");
		//checkStepEnclosedPerformanceSpecialization
		put(ExpressionImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		
		//checkFeatureSpecialization
		put(FeatureImpl.class, "base", "Base::things");
		//checkFeatureDataValueSpecialization
		put(FeatureImpl.class, "dataValue", "Base::dataValues");
		//checkFeatureOccurrenceSpecialization
		put(FeatureImpl.class, "occurrence", "Occurrences::occurrences");
		//checkFeatureSuboccurrenceSpecialization
		put(FeatureImpl.class, "suboccurrence", "Occurrences::Occurrence::suboccurrences");
		//checkFeaturePortionSpecialization
		put(FeatureImpl.class, "portion", "Occurrences::Occurrence::portions");
		//checkFeatureObjectSpecialization
		put(FeatureImpl.class, "object", "Objects::objects");
		//checkFeatureSubobjectSpecialization
		put(FeatureImpl.class, "subobject", "Objects::Object::subobjects");
		//checkFeatureEndSpecialization
		put(FeatureImpl.class, "participant", "Links::Link::participant");
		//checkAssignmentActionUsageStartingAtRedefinition
		put(FeatureImpl.class, "startingAt", "FeatureReferencingPerformances::FeatureAccessPerformance::onOccurrence::startingAt");
		//checkAssignmentActionUsageAccessedFeatureRedefinition
		put(FeatureImpl.class, "accessedFeature", "FeatureReferencingPerformances::FeatureAccessPerformance::onOccurrence::startingAt::accessedFeature");
		
		//checkAssignmentActionUsageAccessedFeatureRedefinition
		put(FeatureChainExpressionImpl.class, "target", "ControlFunctions::'.'::source::target");
		
		//checkAssignmentActionUsageAccessedFeatureRedefinition
		put(FunctionImpl.class, "base", "Performances::Evaluation");
		
		//checkInvariantSpecialization
		put(InvariantImpl.class, "base", "Performances::trueEvaluations");
		//checkInvariantSpecialization
		put(InvariantImpl.class, "negated", "Performances::falseEvaluations");
		
		//checkPayloadFeatureRedefinition
		put(PayloadFeatureImpl.class, "payload", "Transfers::Transfer::payload");
		
		/*
		 * TODO: checkFlowSpecialization
		 * specializesFromLibrary('Transfers::transfers')
		 */		
		//checkFlowWithEndsSpecialization
		put(FlowImpl.class, "base", "Transfers::flowTransfers");
		//checkStepEnclosedPerformanceSpecialization
		put(FlowImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		//checkStepSubperformanceSpecialization
		put(FlowImpl.class, "subperformance", "Performances::Performance::subperformances");
		//checkStepOwnedPerformanceSpecialization
		put(FlowImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		
		//checkFeatureFlowFeatureRedefinition
		put(FlowEndImpl.class, "sourceOutput", "Transfers::Transfer::source::sourceOutput");
		//checkFeatureFlowFeatureRedefinition
		put(FlowEndImpl.class, "targetInput", "Transfers::Transfer::target::targetInput");
		
		//checkLiteralBooleanSpecialization
		put(LiteralBooleanImpl.class, "base", "Performances::literalBooleanEvaluations");
		
		//checkLiteralExpressionSpecialization
		put(LiteralExpressionImpl.class, "base", "Performances::literalEvaluations");
		
		//checkLiteralInfinitySpecialization
		put(LiteralInfinityImpl.class, "base", "Performances::literalIntegerEvaluations");
		
		//checkLiteralIntegerSpecialization
		put(LiteralIntegerImpl.class, "base", "Performances::literalIntegerEvaluations");
		
		//checkLiteralRationalSpecialization
		put(LiteralRationalImpl.class, "base", "Performances::literalRationalEvaluations");
		
		//checkLiteralStringSpecialization
		put(LiteralStringImpl.class, "base", "Performances::literalStringEvaluations");
		
		//checkMetaclassSpecialization
		put(MetaclassImpl.class, "base", "Metaobjects::Metaobject");
		//checkMetadataFeatureSpecialization
		put(MetadataFeatureImpl.class, "base", "Metaobjects::metaobjects");
		put(MetadataFeatureImpl.class, "annotatedElement", "Metaobjects::Metaobject::annotatedElement");
		//checkMetadataFeatureSemanticSpecialization
		put(MetadataFeatureImpl.class, "baseType", "Metaobjects::SemanticMetadata::baseType");
		
		//checkMetadataAccessExpressionSpecialization
		put(MetadataAccessExpressionImpl.class, "base", "Performances::metadataAccessEvaluations");
		
		//checkMultiplicitySpecialization
		put(MultiplicityImpl.class, "base", "Base::naturals");
		// TODO: Update SysML specification to formalize default multiplicities.
		// See SYSML21-185
		put(MultiplicityImpl.class, "feature", "Base::exactlyOne");
		//checkOccurrenceDefinitionMultiplicitySpecialization
		put(MultiplicityImpl.class, "classifier", "Base::zeroOrOne");
		
		put(MultiplicityRangeImpl.class, "feature", "Base::naturals");
		put(MultiplicityRangeImpl.class, "classifier", "Base::naturals");
		
		//checkNullExpressionSpecialization
		put(NullExpressionImpl.class, "base", "Performances::nullEvaluations");
		
		//checkPredicateSpecialization
		put(PredicateImpl.class, "base", "Performances::BooleanEvaluation");
		
		//checkStepSpecialization
		put(StepImpl.class, "base", "Performances::performances");
		//checkStepEnclosedPerformanceSpecialization
		put(StepImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		//checkStepSubperformanceSpecialization
		put(StepImpl.class, "subperformance", "Performances::Performance::subperformances");
		//checkStepOwnedPerformanceSpecialization
		put(StepImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		put(StepImpl.class, "incomingTransfer", "Occurrences::Occurrence::incomingTransfers");
		put(StepImpl.class, "featureWrite", "FeatureReferencingPerformances::FeatureWritePerformance");
		
		//checkStructureSpecialization
		put(StructureImpl.class, "base", "Objects::Object");
		
		//checkSuccessionSpecialization
		put(SuccessionImpl.class, "binary", "Occurrences::happensBeforeLinks");
		
		//checkSuccessionSpecialization
		put(SuccessionFlowImpl.class, "base", "Transfers::flowTransfersBefore");
		//checkStepEnclosedPerformanceSpecialization
		put(SuccessionFlowImpl.class, "enclosedperformance", "Performances::Performance::enclosedPerformances");
		//checkStepSubperformanceSpecialization
		put(SuccessionFlowImpl.class, "subperformance", "Performances::Performance::subperformances");
		//checkStepOwnedPerformanceSpecialization
		put(SuccessionFlowImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		
		//checkTypeSpecialization
		put(TypeImpl.class, "base", "Base::Anything");

		// SysML
		
		//checkAcceptActionUsageSpecialization
		put(AcceptActionUsageImpl.class, "base", "Actions::acceptActions");
		//checkAcceptActionUsageSubactionSpecialization
		put(AcceptActionUsageImpl.class, "subaction", "Actions::Action::acceptSubactions");
		
		//checkActionDefinitionSpecialization
		put(ActionDefinitionImpl.class, "base", "Actions::Action");
		//checkActionUsageSpecialization
		put(ActionUsageImpl.class, "base", "Actions::actions");
		//checkActionUsageSubactionSpecialization
		put(ActionUsageImpl.class, "subaction", "Actions::Action::subactions");
		//checkActionUsageOwnedActionSpecialization
		put(ActionUsageImpl.class, "ownedAction", "Parts::Part::ownedActions");
		//checkStepSubperformanceSpecialization
		put(ActionUsageImpl.class, "subperformance", "Performances::Performance::subperformances");
		//checkStepEnclosedPerformanceSpecialization
		put(ActionUsageImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		//checkStepOwnedPerformanceSpecialization
		put(ActionUsageImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		//checkActionUsageStateActionRedefinition
		put(ActionUsageImpl.class, "entry", "States::StateAction::entryAction");
		//checkActionUsageStateActionRedefinition
		put(ActionUsageImpl.class, "do", "States::StateAction::doAction");
		//checkActionUsageStateActionRedefinition
		put(ActionUsageImpl.class, "exit", "States::StateAction::exitAction");
		//checkTransitionUsageTransitionFeatureSpecialization
		put(ActionUsageImpl.class, "trigger", "Actions::TransitionAction::accepter");
		//checkTransitionUsageTransitionFeatureSpecialization
		put(ActionUsageImpl.class, "guard", "Actions::TransitionAction::guard");
		//checkTransitionUsageTransitionFeatureSpecialization
		put(ActionUsageImpl.class, "effect", "Actions::TransitionAction::effect");
		
		//checkAllocationDefinitionSpecialization
		put(AllocationDefinitionImpl.class, "base", "Allocations::Allocation");
		//checkAllocationDefinitionSpecialization
		put(AllocationDefinitionImpl.class, "binary", "Allocations::Allocation");
		//checkAllocationUsageSpecialization
		put(AllocationUsageImpl.class, "base", "Allocations::allocations");
		//checkAllocationUsageSpecialization
		put(AllocationUsageImpl.class, "binary", "Allocations::allocations");
		
		//checkAnalysisCaseDefinitionSpecialization
		put(AnalysisCaseDefinitionImpl.class, "base", "AnalysisCases::AnalysisCase");
		//checkAnalysisCaseUsageSpecialization
		put(AnalysisCaseUsageImpl.class, "base", "AnalysisCases::analysisCases");
		//checkAnalysisCaseUsageSubAnalysisCaseSpecialization
		put(AnalysisCaseUsageImpl.class, "subAnalysisCase", "AnalysisCases::AnalysisCase::subAnalysisCases");
		
		//checkAssertConstraintUsageSpecialization
		put(AssertConstraintUsageImpl.class, "base", "Constraints::assertedConstraintChecks");
		//checkAssertConstraintUsageSpecialization
		put(AssertConstraintUsageImpl.class, "negated", "Constraints::negatedConstraintChecks");
		
		//checkAssignmentActionUsageSpecialization
		put(AssignmentActionUsageImpl.class, "base", "Actions::assignmentActions");
		//checkAssignmentActionUsageSubactionSpecialization
		put(AssignmentActionUsageImpl.class, "subaction", "Actions::Action::assignments");
		put(AssignmentActionUsageImpl.class, "featureWrite", "Actions::AssignmentAction");
		
		//checkDataTypeSpecialization (an AttributeDefinition is a DataType)
		put(AttributeDefinitionImpl.class, "base", "Base::DataValue");
		//checkAttributeUsageSpecialization
		put(AttributeUsageImpl.class, "base", "Base::dataValues");
		
		//checkBindingConnectorSpecialization
		put(BindingConnectorAsUsageImpl.class, "base", "Links::selfLinks");
		//checkBindingConnectorSpecialization
		put(BindingConnectorAsUsageImpl.class, "binary", "Links::selfLinks");
		
		//checkCalculationDefinitionSpecialization
		put(CalculationDefinitionImpl.class, "base", "Calculations::Calculation");
		//checkCalculationUsageSpecialization
		put(CalculationUsageImpl.class, "base", "Calculations::calculations");
		//checkCalculationUsageSubcalculationSpecialization
		put(CalculationUsageImpl.class, "subcalculation", "Calculations::Calculation::subcalculations");
		
		//checkCaseDefinitionSpecialization
		put(CaseDefinitionImpl.class, "base", "Cases::Case");
		//checkCaseUsageSpecialization
		put(CaseUsageImpl.class, "base", "Cases::cases");
		//checkCaseUsageSubcaseSpecialization
		put(CaseUsageImpl.class, "subcase", "Cases::Case::subcases");
		
		//checkCaseUsageSubcaseSpecialization
		put(ConcernDefinitionImpl.class, "base", "Requirements::ConcernCheck");
		//checkConcernUsageSpecialization
		put(ConcernUsageImpl.class, "base", "Requirements::concernChecks");
		//checkConcernUsageFramedConcernSpecialization
		put(ConcernUsageImpl.class, "concern", "Requirements::RequirementCheck::concerns");
		
		//checkConnectionDefinitionBinarySpecialization
		put(ConnectionDefinitionImpl.class, "base", "Connections::Connection");
		//checkConnectionDefinitionBinarySpecialization
		put(ConnectionDefinitionImpl.class, "binary", "Connections::BinaryConnection");
		//checkConnectionUsageSpecialization
		put(ConnectionUsageImpl.class, "base", "Connections::connections");
		//checkConnectionUsageBinarySpecialization
		put(ConnectionUsageImpl.class, "binary", "Connections::binaryConnections");
		
		//checkConstraintDefinitionSpecialization
		put(ConstraintDefinitionImpl.class, "base", "Constraints::ConstraintCheck");
		//checkConstraintUsageSpecialization
		put(ConstraintUsageImpl.class, "base", "Constraints::constraintChecks");
		//checkConstraintUsageCheckedConstraintSpecialization
		put(ConstraintUsageImpl.class, "checkedConstraint", "Items::Item::checkedConstraints");
		//checkStepEnclosedPerformanceSpecialization
		put(ConstraintUsageImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		//checkStepSubperformanceSpecialization
		put(ConstraintUsageImpl.class, "subperformance", "Performances::Performance::subperformances");
		//checkStepOwnedPerformanceSpecialization
		put(ConstraintUsageImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		//checkConstraintUsageRequirementConstraintSpecialization
		put(ConstraintUsageImpl.class, "assumption", "Requirements::RequirementCheck::assumptions");
		//checkConstraintUsageRequirementConstraintSpecialization
		put(ConstraintUsageImpl.class, "requirement", "Requirements::RequirementCheck::constraints");
		
		//checkDecisionNodeSpecialization
		put(DecisionNodeImpl.class, "subaction", "Actions::Action::decisions");
		
		//checkEventOccurrenceUsageSpecialization
		put(EventOccurrenceUsageImpl.class, "suboccurrence", "Occurrences::Occurrence::timeEnclosedOccurrences");
		
		//checkExhibitStateUsageSpecialization
		put(ExhibitStateUsageImpl.class, "performedAction", "Parts::Part::exhibitedStates");
		
		//checkFlowDefinitionSpecialization
		put(FlowDefinitionImpl.class, "base", "Flows::MessageAction");
		//checkFlowDefinitionBinarySpecialization
		put(FlowDefinitionImpl.class, "binary", "Flows::Message");
		//checkFlowUsageFlowSpecialization
		put(FlowUsageImpl.class, "base", "Flows::flows");
		//checkFlowUsageSpecialization
		put(FlowUsageImpl.class, "message", "Flows::messages");
		//checkActionUsageSubactionSpecialization
		put(FlowUsageImpl.class, "subaction", "Actions::Action::subactions");
		//checkActionUsageOwnedActionSpecialization
		put(FlowUsageImpl.class, "ownedAction", "Parts::Part::ownedActions");
		//checkStepEnclosedPerformanceSpecialization
		put(FlowUsageImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		//checkStepSubperformanceSpecialization
		put(FlowUsageImpl.class, "subperformance", "Performances::Performance::subperformances");
		//checkStepOwnedPerformanceSpecialization
		put(FlowUsageImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		//checkActionUsageStateActionRedefinition
		put(FlowUsageImpl.class, "entry", "States::StateAction::entryAction");
		//checkActionUsageStateActionRedefinition
		put(FlowUsageImpl.class, "do", "States::StateAction::doAction");
		//checkActionUsageStateActionRedefinition
		put(FlowUsageImpl.class, "exit", "States::StateAction::exitAction");
		//checkTransitionUsageTransitionFeatureSpecialization
		put(FlowUsageImpl.class, "trigger", "Actions::TransitionAction::accepter");
		//checkTransitionUsageTransitionFeatureSpecialization
		put(FlowUsageImpl.class, "guard", "Actions::TransitionAction::guard");
		//checkTransitionUsageTransitionFeatureSpecialization
		put(FlowUsageImpl.class, "effect", "Actions::TransitionAction::effect");
		//checkOccurrenceUsageTimeSliceSpecialization
		put(FlowUsageImpl.class, "timeslice", "Occurrences::Occurrence::timeSlices");
		//checkOccurrenceUsageSnapshotSpecialization
		put(FlowUsageImpl.class, "snapshot", "Occurrences::Occurrence::snapshots");
		
		//checkForLoopActionUsageSpecialization
		put(ForLoopActionUsageImpl.class, "base", "Actions::forLoopActions");
		//checkForLoopActionUsageSubactionSpecialization
		put(ForLoopActionUsageImpl.class, "subaction", "Actions::Action::forLoops");
		//checkForLoopActionUsageVarRedefinition
		put(ForLoopActionUsageImpl.class, "loopVariable", "Actions::ForLoopAction::var");
		
		//checkForkNodeSpecialization
		put(ForkNodeImpl.class, "subaction", "Actions::Action::forks");
		
		//checkIfActionUsageSpecialization
		put(IfActionUsageImpl.class, "base", "Actions::ifThenActions");
		//checkIfActionUsageSpecialization
		put(IfActionUsageImpl.class, "ifThenElse", "Actions::ifThenElseActions");
		//checkIfActionUsageSubactionSpecialization
		put(IfActionUsageImpl.class, "subaction", "Actions::Action::ifSubactions");
		
		//checkIncludeUseCaseSpecialization
		put(IncludeUseCaseUsageImpl.class, "subUseCase", "UseCases::UseCase::includedUseCases");
		//checkPerformActionUsageSpecialization
		put(IncludeUseCaseUsageImpl.class, "performedAction", "Parts::Part::performedActions");
		
		//checkInterfaceDefinitionSpecialization
		put(InterfaceDefinitionImpl.class, "base", "Interfaces::Interface");
		//checkInterfaceDefinitionBinarySpecialization
		put(InterfaceDefinitionImpl.class, "binary", "Interfaces::BinaryInterface");
		//checkInterfaceUsageSpecialization
		put(InterfaceUsageImpl.class, "base", "Interfaces::interfaces");
		//checkInterfaceUsageBinarySpecialization
		put(InterfaceUsageImpl.class, "binary", "Interfaces::binaryInterfaces");
		
		//checkItemDefinitionSpecialization
		put(ItemDefinitionImpl.class, "base", "Items::Item");
		//checkItemDefinitionSpecialization
		put(ItemUsageImpl.class, "base", "Items::items");
		//checkItemUsageSubitemSpecialization
		put(ItemUsageImpl.class, "subitem", "Items::Item::subitems");
		
		//checkJoinNodeSpecialization
		put(JoinNodeImpl.class, "subaction", "Actions::Action::joins");
		
		//checkMetadataDefinitionSpecialization
		put(MetadataDefinitionImpl.class, "base", "Metadata::MetadataItem");
		//checkMetadataUsageSpecialization
		put(MetadataUsageImpl.class, "base", "Metadata::metadataItems");
		put(MetadataUsageImpl.class, "annotatedElement", "Metaobjects::Metaobject::annotatedElement");
		put(MetadataUsageImpl.class, "baseType", "Metaobjects::SemanticMetadata::baseType");
		
		//checkMergeNodeSpecialization
		put(MergeNodeImpl.class, "subaction", "Actions::Action::merges");
		
		//checkClassSpecialization (an OccurrenceDefinition is a Class)
		put(OccurrenceDefinitionImpl.class, "base", "Occurrences::Occurrence");
		//checkOccurrenceDefinitionIndividualSpecialization
		put(OccurrenceDefinitionImpl.class, "life", "Occurrences::Life");
		//checkOccurrenceUsageSpecialization
		put(OccurrenceUsageImpl.class, "base", "Occurrences::occurrences");
		//checkOccurrenceUsageTimeSliceSpecialization
		put(OccurrenceUsageImpl.class, "timeslice", "Occurrences::Occurrence::timeSlices");
		//checkOccurrenceUsageSnapshotSpecialization
		put(OccurrenceUsageImpl.class, "snapshot", "Occurrences::Occurrence::snapshots");
				
		//checkPartDefinitionSpecialization
		put(PartDefinitionImpl.class, "base", "Parts::Part");
		//checkPartUsageSpecialization
		put(PartUsageImpl.class, "base", "Parts::parts");
		//checkPartUsageSubpartSpecialization
		put(PartUsageImpl.class, "subitem", "Items::Item::subparts");
		//checkPartUsageActorSpecialization
		put(PartUsageImpl.class, "requirementActor", "Requirements::RequirementCheck::actors");
		//checkPartUsageStakeholderSpecialization
		put(PartUsageImpl.class, "requirementStakeholder", "Requirements::RequirementCheck::stakeholders");
		//checkPartUsageActorSpecialization
		put(PartUsageImpl.class, "caseActor", "Cases::Case::actors");
		
		//checkPerformActionUsageSpecialization
		put(PerformActionUsageImpl.class, "performedAction", "Parts::Part::performedActions");
		
		//checkPortDefinitionSpecialization
		put(PortDefinitionImpl.class, "base", "Ports::Port");
		//checkPortUsageSpecialization
		put(PortUsageImpl.class, "base", "Ports::ports");
		//checkPortUsageOwnedPortSpecialization
		put(PortUsageImpl.class, "ownedPort", "Parts::Part::ownedPorts");
		//checkPortUsageSubportSpecialization
		put(PortUsageImpl.class, "subport", "Ports::Port::subports");
		
		//checkRenderingDefinitionSpecialization
		put(RenderingDefinitionImpl.class, "base", "Views::Rendering");
		//checkRenderingUsageSpecialization
		put(RenderingUsageImpl.class, "base", "Views::renderings");
		//checkRenderingUsageSubrenderingSpecialization
		put(RenderingUsageImpl.class, "subrendering", "Views::Rendering::subrenderings");
		//checkRenderingUsageRedefinition
		put(RenderingUsageImpl.class, "viewRendering", "Views::View::viewRendering");
		
		//checkRequirementDefinitionSpecialization
		put(RequirementDefinitionImpl.class, "base", "Requirements::RequirementCheck");
		//checkRequirementUsageSpecialization
		put(RequirementUsageImpl.class, "base", "Requirements::requirementChecks");
		//checkRequirementUsageSubrequirementSpecialization
		put(RequirementUsageImpl.class, "subrequirement", "Requirements::RequirementCheck::subrequirements");
		//checkRequirementUsageRequirementVerificationSpecialization
		put(RequirementUsageImpl.class, "verification", "Verifications::VerificationCase::obj::requirementVerifications");
		
		//checkSatisfyRequirementUsageSpecialization
		put(SatisfyRequirementUsageImpl.class, "base", "Requirements::satisfiedRequirementChecks");
		//checkSatisfyRequirementUsageSpecialization
		put(SatisfyRequirementUsageImpl.class, "negated", "Requirements::notSatisfiedRequirementChecks");
		
		//checkSendActionUsageSpecialization
		put(SendActionUsageImpl.class, "base", "Actions::sendActions");
		//checkActionUsageSubactionSpecialization
		put(SendActionUsageImpl.class, "subaction", "Actions::Action::sendSubactions");
		
		//checkStateDefinitionSpecialization
		put(StateDefinitionImpl.class, "base", "States::StateAction");
		//checkStateUsageSpecialization
		put(StateUsageImpl.class, "base", "States::stateActions");
		//checkStateUsageSubstateSpecialization
		put(StateUsageImpl.class, "substate", "States::StateAction::substates");
		//checkStateUsageExclusiveStateSpecialization
		put(StateUsageImpl.class, "exclusiveState", "States::StateAction::exclusiveStates");
		//checkStateUsageOwnedStateSpecialization
		put(StateUsageImpl.class, "ownedAction", "Parts::Part::ownedStates");
		
		//checkSuccessionSpecialization
		put(SuccessionAsUsageImpl.class, "base", "Occurrences::happensBeforeLinks");
		//checkSuccessionSpecialization
		put(SuccessionAsUsageImpl.class, "binary", "Occurrences::happensBeforeLinks");
		
		//checkSuccessionFlowUsageSpecialization
		put(SuccessionFlowUsageImpl.class, "base", "Flows::successionFlows");
		//checkSuccessionFlowUsageSpecialization
		put(SuccessionFlowUsageImpl.class, "message", "Flows::successionFlows");
		
		//checkTerminateActionUsageSpecialization
		put(TerminateActionUsageImpl.class, "base", "Actions::terminateActions");
		//checkTerminateActionUsageSubactionSpecialization
		put(TerminateActionUsageImpl.class, "subaction", "Actions::Action::terminateSubactions");
		
		// TODO: Delete this.
		put(TerminateActionUsageImpl.class, "subaction", "Actions::Action::terminateWithResultSubactions");
		
		//checkTransitionUsageSpecialization
		put(TransitionUsageImpl.class, "base", "Actions::transitionActions");
		//checkTransitionUsageActionSpecialization
		put(TransitionUsageImpl.class, "actionTransition", "Actions::Action::decisionTransitions");
		//checkTransitionUsageStateSpecialization
		put(TransitionUsageImpl.class, "stateTransition", "States::StateAction::stateTransitions");
		
		//checkInvocationExpressionSpecialization (with appropriate insantiatedType)
		put(TriggerInvocationExpressionImpl.class, "when", "Triggers::TriggerWhen");
		put(TriggerInvocationExpressionImpl.class, "at", "Triggers::TriggerAt");
		put(TriggerInvocationExpressionImpl.class, "after", "Triggers::TriggerAfter");
		
		//checkUseCaseDefinitionSpecialization
		put(UseCaseDefinitionImpl.class, "base", "UseCases::UseCase");
		//checkUseCaseUsageSpecialization
		put(UseCaseUsageImpl.class, "base", "UseCases::useCases");
		//checkUseCaseUsageSubUseCaseSpecialization
		put(UseCaseUsageImpl.class, "subUseCase", "UseCases::UseCase::subUseCases");
		
		//checkVerificationCaseSpecialization
		put(VerificationCaseDefinitionImpl.class, "base", "VerificationCases::VerificationCase");
		//checkVerificationCaseUsageSpecialization
		put(VerificationCaseUsageImpl.class, "base", "VerificationCases::verificationCases");
		//checkVerificationCaseUsageSubVerificationCaseSpecialization
		put(VerificationCaseUsageImpl.class, "subVerificationCase", "VerificationCases::VerificationCase::subVerificationCases");
		
		//checkViewDefinitionSpecialization
		put(ViewDefinitionImpl.class, "base", "Views::View");
		//checkViewUsageSpecialization
		put(ViewUsageImpl.class, "base", "Views::views");
		//checkViewUsageSubviewSpecialization
		put(ViewUsageImpl.class, "subview", "Views::View::subviews");
		
		//checkViewpointDefinitionSpecialization
		put(ViewpointDefinitionImpl.class, "base", "Views::ViewpointCheck");
		//checkViewpointUsageSpecialization
		put(ViewpointUsageImpl.class, "base", "Views::viewpointChecks");
		//checkViewpointUsageViewpointSatisfactionSpecialization
		put(ViewpointUsageImpl.class, "satisfied", "Views::View::viewpointSatisfactions");
		
		/*
		 * TODO: Update checkViewpointDefinitionSpecialization and checkViewpointUsageSpecialization
		 * 
		 * See SYSML21-301
		 */
		
		//checkWhileLoopActionUsageSpecialization
		put(WhileLoopActionUsageImpl.class, "base", "Actions::whileLoopActions");
		//checkWhileLoopActionUsageSubactionSpecialization
		put(WhileLoopActionUsageImpl.class, "subaction", "Actions::Action::whileLoops");
	}
	
	public String get(Class<?> elementType) {
		return get(elementType, "base");
	}
	
	public String get(Class<?> elementType, String kind) {
		do {
			String defaultSupertype = map.get(elementType.getSimpleName()+ "_" + kind);
			if (defaultSupertype != null) {
				return defaultSupertype;
			}
			elementType = elementType.getSuperclass();
		} while (elementType != null);
		return null;
	}
	
	protected void put(Class<?> elementType, String kind, String defaultSupertype) {
		map.put(elementType.getSimpleName()+ "_" + kind, defaultSupertype);
	}

}
