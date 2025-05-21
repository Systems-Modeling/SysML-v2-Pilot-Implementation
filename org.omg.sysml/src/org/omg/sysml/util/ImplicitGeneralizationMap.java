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
		
		put(AssociationImpl.class, "base", "Links::Link");
		put(AssociationImpl.class, "binary", "Links::BinaryLink");
		
		put(AssociationStructureImpl.class, "base", "Objects::LinkObject");
		put(AssociationStructureImpl.class, "binary", "Objects::BinaryLinkObject");
		
		put(BehaviorImpl.class, "base", "Performances::Performance");
		
		put(BindingConnectorImpl.class, "binary", "Links::selfLinks");
		
		put(BooleanExpressionImpl.class, "base", "Performances::booleanEvaluations");
		
		put(ClassImpl.class, "base", "Occurrences::Occurrence");
		
		put(ClassifierImpl.class, "base", "Base::Anything");
		
		put(ConnectorImpl.class, "base", "Links::links");
		put(ConnectorImpl.class, "binary", "Links::binaryLinks");
		put(ConnectorImpl.class, "object", "Objects::linkObjects");
		put(ConnectorImpl.class, "binaryObject", "Objects::binaryLinkObjects");
		
		put(ConstructorExpressionImpl.class, "base", "Performances::constructorEvaluations");

		put(DataTypeImpl.class, "base", "Base::DataValue");
		
		put(ExpressionImpl.class, "base", "Performances::evaluations");
		put(ExpressionImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		
		//checkFeatureSpecialization
		put(FeatureImpl.class, "base", "Base::things");
		//checkFeatureDataValueSpecialization
		put(FeatureImpl.class, "dataValue", "Base::dataValues");
		//checkFeatureOccurrenceSpecialization
		put(FeatureImpl.class, "occurrence", "Occurrences::occurrences");
		//checkFeatureSuboccurrenceSpecialization
		put(FeatureImpl.class, "suboccurrence", "Occurrences::Occurrence::suboccurrences");
		put(FeatureImpl.class, "portion", "Occurrences::Occurrence::portions");
		//checkFeatureObjectSpecialization
		put(FeatureImpl.class, "object", "Objects::objects");
		//checkFeatureSubobjectSpecialization
		put(FeatureImpl.class, "subobject", "Objects::Object::subobjects");
		put(FeatureImpl.class, "participant", "Links::Link::participant");
		put(FeatureImpl.class, "startingAt", "FeatureReferencingPerformances::FeatureAccessPerformance::onOccurrence::startingAt");
		put(FeatureImpl.class, "accessedFeature", "FeatureReferencingPerformances::FeatureAccessPerformance::onOccurrence::startingAt::accessedFeature");
		
		put(FeatureChainExpressionImpl.class, "target", "ControlFunctions::'.'::source::target");
		
		put(FunctionImpl.class, "base", "Performances::Evaluation");
		
		put(InvariantImpl.class, "base", "Performances::trueEvaluations");
		put(InvariantImpl.class, "negated", "Performances::falseEvaluations");
		
		put(PayloadFeatureImpl.class, "payload", "Transfers::Transfer::payload");
		
		put(FlowImpl.class, "base", "Transfers::flowTransfers");
		put(FlowImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		put(FlowImpl.class, "subperformance", "Performances::Performance::subperformances");
		put(FlowImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		
		put(FlowEndImpl.class, "sourceOutput", "Transfers::Transfer::source::sourceOutput");
		put(FlowEndImpl.class, "targetInput", "Transfers::Transfer::target::targetInput");
		
		put(LiteralBooleanImpl.class, "base", "Performances::literalBooleanEvaluations");
		
		put(LiteralExpressionImpl.class, "base", "Performances::literalEvaluations");
		
		put(LiteralInfinityImpl.class, "base", "Performances::literalIntegerEvaluations");
		
		put(LiteralIntegerImpl.class, "base", "Performances::literalIntegerEvaluations");
		
		put(LiteralRationalImpl.class, "base", "Performances::literalRationalEvaluations");
		
		put(LiteralStringImpl.class, "base", "Performances::literalStringEvaluations");
		
		put(MetaclassImpl.class, "base", "Metaobjects::Metaobject");
		put(MetadataFeatureImpl.class, "base", "Metaobjects::metaobjects");
		put(MetadataFeatureImpl.class, "annotatedElement", "Metaobjects::Metaobject::annotatedElement");
		put(MetadataFeatureImpl.class, "baseType", "Metaobjects::SemanticMetadata::baseType");
		
		put(MetadataAccessExpressionImpl.class, "base", "Performances::metadataAccessEvaluations");

		put(MultiplicityImpl.class, "base", "Base::naturals");
		put(MultiplicityImpl.class, "feature", "Base::exactlyOne");
		put(MultiplicityImpl.class, "classifier", "Base::zeroOrOne");

		put(MultiplicityRangeImpl.class, "feature", "Base::naturals");
		put(MultiplicityRangeImpl.class, "classifier", "Base::naturals");
		
		put(NullExpressionImpl.class, "base", "Performances::nullEvaluations");
		
		put(PredicateImpl.class, "base", "Performances::BooleanEvaluation");
		
		put(StepImpl.class, "base", "Performances::performances");
		put(StepImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		put(StepImpl.class, "subperformance", "Performances::Performance::subperformances");
		put(StepImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		put(StepImpl.class, "incomingTransfer", "Occurrences::Occurrence::incomingTransfers");
		put(StepImpl.class, "featureWrite", "FeatureReferencingPerformances::FeatureWritePerformance");
		
		put(StructureImpl.class, "base", "Objects::Object");
		
		put(SuccessionImpl.class, "binary", "Occurrences::happensBeforeLinks");
		
		put(SuccessionFlowImpl.class, "base", "Transfers::flowTransfersBefore");
		put(SuccessionFlowImpl.class, "enclosedperformance", "Performances::Performance::enclosedPerformances");
		put(SuccessionFlowImpl.class, "subperformance", "Performances::Performance::subperformances");
		put(SuccessionFlowImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");

		put(TypeImpl.class, "base", "Base::Anything");

		// SysML
		
		put(AcceptActionUsageImpl.class, "base", "Actions::acceptActions");
		put(AcceptActionUsageImpl.class, "subaction", "Actions::Action::acceptSubactions");
		
		put(ActionDefinitionImpl.class, "base", "Actions::Action");		
		put(ActionUsageImpl.class, "base", "Actions::actions");
		put(ActionUsageImpl.class, "subaction", "Actions::Action::subactions");
		put(ActionUsageImpl.class, "ownedAction", "Parts::Part::ownedActions");
		put(ActionUsageImpl.class, "subperformance", "Performances::Performance::subperformances");
		put(ActionUsageImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		put(ActionUsageImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		put(ActionUsageImpl.class, "entry", "States::StateAction::entryAction");
		put(ActionUsageImpl.class, "do", "States::StateAction::doAction");
		put(ActionUsageImpl.class, "exit", "States::StateAction::exitAction");
		put(ActionUsageImpl.class, "trigger", "Actions::TransitionAction::accepter");
		put(ActionUsageImpl.class, "guard", "Actions::TransitionAction::guard");
		put(ActionUsageImpl.class, "effect", "Actions::TransitionAction::effect");
		
		put(AllocationDefinitionImpl.class, "base", "Allocations::Allocation");
		put(AllocationDefinitionImpl.class, "binary", "Allocations::Allocation");
		put(AllocationUsageImpl.class, "base", "Allocations::allocations");
		put(AllocationUsageImpl.class, "binary", "Allocations::allocations");
		
		put(AnalysisCaseDefinitionImpl.class, "base", "AnalysisCases::AnalysisCase");
		put(AnalysisCaseUsageImpl.class, "base", "AnalysisCases::analysisCases");
		put(AnalysisCaseUsageImpl.class, "subAnalysisCase", "AnalysisCases::AnalysisCase::subAnalysisCases");
		
		put(AssertConstraintUsageImpl.class, "base", "Constraints::assertedConstraintChecks");
		put(AssertConstraintUsageImpl.class, "negated", "Constraints::negatedConstraintChecks");
		
		put(AssignmentActionUsageImpl.class, "base", "Actions::assignmentActions");
		put(AssignmentActionUsageImpl.class, "subaction", "Actions::Action::assignments");
		put(AssignmentActionUsageImpl.class, "featureWrite", "Actions::AssignmentAction");
		
		put(AttributeDefinitionImpl.class, "base", "Base::DataValue");
		put(AttributeUsageImpl.class, "base", "Base::dataValues");
		
		put(BindingConnectorAsUsageImpl.class, "base", "Links::selfLinks");
		put(BindingConnectorAsUsageImpl.class, "binary", "Links::selfLinks");
		
		put(CalculationDefinitionImpl.class, "base", "Calculations::Calculation");
		put(CalculationUsageImpl.class, "base", "Calculations::calculations");
		put(CalculationUsageImpl.class, "subcalculation", "Calculations::Calculation::subcalculations");
		
		put(CaseDefinitionImpl.class, "base", "Cases::Case");
		put(CaseUsageImpl.class, "base", "Cases::cases");
		put(CaseUsageImpl.class, "subcase", "Cases::Case::subcases");
		
		put(ConcernDefinitionImpl.class, "base", "Requirements::ConcernCheck");
		put(ConcernUsageImpl.class, "base", "Requirements::concernChecks");
		put(ConcernUsageImpl.class, "concern", "Requirements::RequirementCheck::concerns");
		
		put(ConnectionDefinitionImpl.class, "base", "Connections::Connection");
		put(ConnectionDefinitionImpl.class, "binary", "Connections::BinaryConnection");
		put(ConnectionUsageImpl.class, "base", "Connections::connections");
		put(ConnectionUsageImpl.class, "binary", "Connections::binaryConnections");
		
		put(ConstraintDefinitionImpl.class, "base", "Constraints::ConstraintCheck");
		put(ConstraintUsageImpl.class, "base", "Constraints::constraintChecks");
		put(ConstraintUsageImpl.class, "checkedConstraint", "Items::Item::checkedConstraints");
		put(ConstraintUsageImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		put(ConstraintUsageImpl.class, "subperformance", "Performances::Performance::subperformances");
		put(ConstraintUsageImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		put(ConstraintUsageImpl.class, "assumption", "Requirements::RequirementCheck::assumptions");
		put(ConstraintUsageImpl.class, "requirement", "Requirements::RequirementCheck::constraints");
		
		put(DecisionNodeImpl.class, "subaction", "Actions::Action::decisions");
		
		put(EventOccurrenceUsageImpl.class, "suboccurrence", "Occurrences::Occurrence::timeEnclosedOccurrences");

		put(ExhibitStateUsageImpl.class, "performedAction", "Parts::Part::exhibitedStates");
		
		put(FlowDefinitionImpl.class, "base", "Flows::MessageAction");		
		put(FlowDefinitionImpl.class, "binary", "Flows::Message");		
		put(FlowUsageImpl.class, "base", "Flows::flows");
		put(FlowUsageImpl.class, "message", "Flows::messages");
		put(FlowUsageImpl.class, "subaction", "Actions::Action::subactions");
		put(FlowUsageImpl.class, "ownedAction", "Parts::Part::ownedActions");
		put(FlowUsageImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		put(FlowUsageImpl.class, "subperformance", "Performances::Performance::subperformances");
		put(FlowUsageImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		put(FlowUsageImpl.class, "entry", "States::StateAction::entryAction");
		put(FlowUsageImpl.class, "do", "States::StateAction::doAction");
		put(FlowUsageImpl.class, "exit", "States::StateAction::exitAction");
		put(FlowUsageImpl.class, "trigger", "Actions::TransitionAction::accepter");
		put(FlowUsageImpl.class, "guard", "Actions::TransitionAction::guard");
		put(FlowUsageImpl.class, "effect", "Actions::TransitionAction::effect");
		put(FlowUsageImpl.class, "timeslice", "Occurrences::Occurrence::timeSlices");
		put(FlowUsageImpl.class, "snapshot", "Occurrences::Occurrence::snapshots");
		
		put(ForLoopActionUsageImpl.class, "base", "Actions::forLoopActions");
		put(ForLoopActionUsageImpl.class, "subaction", "Actions::Action::forLoops");
		put(ForLoopActionUsageImpl.class, "loopVariable", "Actions::ForLoopAction::var");
		
		put(ForkNodeImpl.class, "subaction", "Actions::Action::forks");
		
		put(IfActionUsageImpl.class, "base", "Actions::ifThenActions");
		put(IfActionUsageImpl.class, "ifThenElse", "Actions::ifThenElseActions");
		put(IfActionUsageImpl.class, "subaction", "Actions::Action::ifSubactions");
		
		put(IncludeUseCaseUsageImpl.class, "subUseCase", "UseCases::UseCase::includedUseCases");
		put(IncludeUseCaseUsageImpl.class, "performedAction", "Parts::Part::performedActions");
		
		put(InterfaceDefinitionImpl.class, "base", "Interfaces::Interface");
		put(InterfaceDefinitionImpl.class, "binary", "Interfaces::BinaryInterface");
		put(InterfaceUsageImpl.class, "base", "Interfaces::interfaces");
		put(InterfaceUsageImpl.class, "binary", "Interfaces::binaryInterfaces");
		
		put(ItemDefinitionImpl.class, "base", "Items::Item");
		put(ItemUsageImpl.class, "base", "Items::items");
		put(ItemUsageImpl.class, "subitem", "Items::Item::subitems");
		
		put(JoinNodeImpl.class, "subaction", "Actions::Action::joins");
		
		put(MetadataDefinitionImpl.class, "base", "Metadata::MetadataItem");
		put(MetadataUsageImpl.class, "base", "Metadata::metadataItems");
		put(MetadataUsageImpl.class, "annotatedElement", "Metaobjects::Metaobject::annotatedElement");
		put(MetadataUsageImpl.class, "baseType", "Metaobjects::SemanticMetadata::baseType");
		
		put(MergeNodeImpl.class, "subaction", "Actions::Action::merges");
		
		put(OccurrenceDefinitionImpl.class, "base", "Occurrences::Occurrence");
		put(OccurrenceDefinitionImpl.class, "life", "Occurrences::Life");
		put(OccurrenceUsageImpl.class, "base", "Occurrences::occurrences");
		put(OccurrenceUsageImpl.class, "timeslice", "Occurrences::Occurrence::timeSlices");
		put(OccurrenceUsageImpl.class, "snapshot", "Occurrences::Occurrence::snapshots");
		
		put(PartDefinitionImpl.class, "base", "Parts::Part");
		put(PartUsageImpl.class, "base", "Parts::parts");
		put(PartUsageImpl.class, "subitem", "Items::Item::subparts");
		put(PartUsageImpl.class, "requirementActor", "Requirements::RequirementCheck::actors");
		put(PartUsageImpl.class, "requirementStakeholder", "Requirements::RequirementCheck::stakeholders");
		put(PartUsageImpl.class, "caseActor", "Cases::Case::actors");
		
		put(PerformActionUsageImpl.class, "performedAction", "Parts::Part::performedActions");
		
		put(PortDefinitionImpl.class, "base", "Ports::Port");
		put(PortUsageImpl.class, "base", "Ports::ports");
		put(PortUsageImpl.class, "ownedPort", "Parts::Part::ownedPorts");
		put(PortUsageImpl.class, "subport", "Ports::Port::subports");
		
		put(RenderingDefinitionImpl.class, "base", "Views::Rendering");
		put(RenderingUsageImpl.class, "base", "Views::renderings");
		put(RenderingUsageImpl.class, "subrendering", "Views::Rendering::subrenderings");
		put(RenderingUsageImpl.class, "viewRendering", "Views::View::viewRendering");
		
		put(RequirementDefinitionImpl.class, "base", "Requirements::RequirementCheck");
		put(RequirementUsageImpl.class, "base", "Requirements::requirementChecks");
		put(RequirementUsageImpl.class, "subrequirement", "Requirements::RequirementCheck::subrequirements");
		put(RequirementUsageImpl.class, "verification", "Verifications::VerificationCase::obj::requirementVerifications");
		
		put(SatisfyRequirementUsageImpl.class, "base", "Requirements::satisfiedRequirementChecks");
		put(SatisfyRequirementUsageImpl.class, "negated", "Requirements::notSatisfiedRequirementChecks");
		
		put(SendActionUsageImpl.class, "base", "Actions::sendActions");
		put(SendActionUsageImpl.class, "subaction", "Actions::Action::sendSubactions");
		
		put(StateDefinitionImpl.class, "base", "States::StateAction");
		put(StateUsageImpl.class, "base", "States::stateActions");
		put(StateUsageImpl.class, "substate", "States::StateAction::substates");
		put(StateUsageImpl.class, "exclusiveState", "States::StateAction::exclusiveStates");
		put(StateUsageImpl.class, "ownedAction", "Parts::Part::ownedStates");
		
		put(SuccessionAsUsageImpl.class, "base", "Occurrences::happensBeforeLinks");
		put(SuccessionAsUsageImpl.class, "binary", "Occurrences::happensBeforeLinks");
		
		put(SuccessionFlowUsageImpl.class, "base", "Flows::successionFlows");
		put(SuccessionFlowUsageImpl.class, "message", "Flows::successionFlows");

		put(TerminateActionUsageImpl.class, "base", "Actions::terminateActions");
		put(TerminateActionUsageImpl.class, "subaction", "Actions::Action::terminateSubactions");
		
		put(TerminateActionUsageImpl.class, "subaction", "Actions::Action::terminateWithResultSubactions");

		put(TransitionUsageImpl.class, "base", "Actions::transitionActions");
		put(TransitionUsageImpl.class, "actionTransition", "Actions::Action::decisionTransitions");
		put(TransitionUsageImpl.class, "stateTransition", "States::StateAction::stateTransitions");
		
		put(TriggerInvocationExpressionImpl.class, "when", "Triggers::TriggerWhen");
		put(TriggerInvocationExpressionImpl.class, "at", "Triggers::TriggerAt");
		put(TriggerInvocationExpressionImpl.class, "after", "Triggers::TriggerAfter");
		
		put(UseCaseDefinitionImpl.class, "base", "UseCases::UseCase");
		put(UseCaseUsageImpl.class, "base", "UseCases::useCases");
		put(UseCaseUsageImpl.class, "subUseCase", "UseCases::UseCase::subUseCases");
		
		put(VerificationCaseDefinitionImpl.class, "base", "VerificationCases::VerificationCase");
		put(VerificationCaseUsageImpl.class, "base", "VerificationCases::verificationCases");
		put(VerificationCaseUsageImpl.class, "subVerificationCase", "VerificationCases::VerificationCase::subVerificationCases");
		
		put(ViewDefinitionImpl.class, "base", "Views::View");
		put(ViewUsageImpl.class, "base", "Views::views");
		put(ViewUsageImpl.class, "subview", "Views::View::subviews");

		put(ViewpointDefinitionImpl.class, "base", "Views::ViewpointCheck");
		put(ViewpointUsageImpl.class, "base", "Views::viewpointChecks");
		put(ViewpointUsageImpl.class, "satisfied", "Views::View::viewpointSatisfactions");
		
		put(WhileLoopActionUsageImpl.class, "base", "Actions::whileLoopActions");
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
