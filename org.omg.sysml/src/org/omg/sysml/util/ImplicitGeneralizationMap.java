/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
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
		
		put(DataTypeImpl.class, "base", "Base::DataValue");
		
		put(ExpressionImpl.class, "base", "Performances::evaluations");
		put(ExpressionImpl.class, "subperformance", "Performances::Performance::subevaluations");
		
		put(FeatureImpl.class, "base", "Base::things");
		put(FeatureImpl.class, "dataValue", "Base::dataValues");
		put(FeatureImpl.class, "occurrence", "Occurrences::occurrences");
		put(FeatureImpl.class, "object", "Objects::objects");
		
		put(FunctionImpl.class, "base", "Performances::Evaluation");
		
		put(InvariantImpl.class, "base", "Performances::trueEvaluations");
		put(InvariantImpl.class, "negated", "Performances::falseEvaluations");
		
		put(ItemFlowImpl.class, "base", "Transfers::transfers");
		put(ItemFlowImpl.class, "subperformance", "Performances::Performance::subtransfers");
		
		put(LiteralBooleanImpl.class, "base", "Performances::literalBooleanEvaluations");
		
		put(LiteralExpressionImpl.class, "base", "Performances::literalEvaluations");
		
		put(LiteralInfinityImpl.class, "base", "Performances::literalIntegerEvaluations");
		
		put(LiteralIntegerImpl.class, "base", "Performances::literalIntegerEvaluations");
		
		put(LiteralRationalImpl.class, "base", "Performances::literalRationalEvaluations");
		
		put(LiteralStringImpl.class, "base", "Performances::literalStringEvaluations");
		
		put(MultiplicityImpl.class, "base", "Base::naturals");
		put(MultiplicityImpl.class, "feature", "Base::exactlyOne");
		put(MultiplicityImpl.class, "classifier", "Base::zeroOrOne");

		put(MultiplicityRangeImpl.class, "feature", "Base::naturals");
		put(MultiplicityRangeImpl.class, "classifier", "Base::naturals");
		
		put(NullExpressionImpl.class, "base", "Performances::nullEvaluations");
		
		put(PredicateImpl.class, "base", "Performances::BooleanExpressions");
		
		put(StepImpl.class, "base", "Performances::performances");
		put(StepImpl.class, "subperformance", "Performances::Performance::subperformances");
		put(StepImpl.class, "enactedPerformance", "Objects::Object::enactedPerformances");
		put(StepImpl.class, "incomingTransfer", "Occurrences::Occurrence::incomingTransfers");
		
		put(StructureImpl.class, "base", "Objects::Object");
		
		put(SuccessionImpl.class, "binary", "Occurrences::happensBeforeLinks");
		
		put(SuccessionItemFlowImpl.class, "base", "Transfers::transfersBefore");
		put(SuccessionItemFlowImpl.class, "subperformance", "Performances::Performance::subtransfersBefore");

		put(TypeImpl.class, "base", "Base::Anything");

		// SysML
		
		put(AcceptActionUsageImpl.class, "base", "Actions::acceptActions");
		put(AcceptActionUsageImpl.class, "subaction", "Actions::Action::acceptSubactions");
		
		put(ActionDefinitionImpl.class, "base", "Actions::Action");		
		put(ActionUsageImpl.class, "base", "Actions::actions");
		put(ActionUsageImpl.class, "subaction", "Actions::Action::subactions");
		put(ActionUsageImpl.class, "enactedPerformance", "Parts::Part::performedActions");
		
		put(AllocationDefinitionImpl.class, "base", "Links::Link");
		put(AllocationDefinitionImpl.class, "binary", "Allocations::Allocation");
		put(AllocationUsageImpl.class, "base", "Links::links");
		put(AllocationUsageImpl.class, "binary", "Allocations::allocations");
		
		put(AnalysisCaseDefinitionImpl.class, "base", "AnalysisCases::AnalysisCase");
		put(AnalysisCaseUsageImpl.class, "base", "AnalysisCases::analysisCases");
		put(AnalysisCaseUsageImpl.class, "subAnalysisCase", "AnalysisCases::AnalysisCase::subAnalysisCases");
		
		put(AssertConstraintUsageImpl.class, "base", "Constraints::assertedConstraintChecks");
		put(AssertConstraintUsageImpl.class, "negated", "Constraints::negatedConstraintChecks");
		
		put(AttributeDefinitionImpl.class, "base", "Base::DataValue");
		put(AttributeUsageImpl.class, "base", "Base::dataValues");
		
		put(CalculationDefinitionImpl.class, "base", "Calculations::Calculation");
		put(CalculationUsageImpl.class, "base", "Calculations::calculations");
		put(CalculationUsageImpl.class, "subcalculation", "Calculations::Calculation::subcalculations");
		
		put(CaseDefinitionImpl.class, "base", "Cases::Case");
		put(CaseUsageImpl.class, "base", "Cases::cases");
		put(CaseUsageImpl.class, "subcase", "Cases::Case::subcases");
		
		put(ConcernDefinitionImpl.class, "base", "Requirements::ConcernCheck");
		put(ConcernUsageImpl.class, "base", "Requirements::concernChecks");
		put(ConcernUsageImpl.class, "subrequirement", "Requirements::RequirementCheck::concerns");
		
		put(ConnectionDefinitionImpl.class, "base", "Connections::Connection");
		put(ConnectionDefinitionImpl.class, "binary", "Connections::BinaryConnection");
		put(ConnectionUsageImpl.class, "base", "Connections::connections");
		put(ConnectionUsageImpl.class, "binary", "Connections::binaryConnections");
		
		put(ConstraintDefinitionImpl.class, "base", "Constraints::ConstraintCheck");
		put(ConstraintUsageImpl.class, "base", "Constraints::constraintChecks");
		put(ConstraintUsageImpl.class, "subperformance", "Performances::Performance::subevaluations");
		put(ConstraintUsageImpl.class, "enactedPerformance", "Items::Item::checkedConstraints");
		
		put(DecisionNodeImpl.class, "subaction", "Actions::Action::decisions");
		
		put(EventOccurrenceUsageImpl.class, "suboccurrence", "Occurrences::Occurrence::suboccurrences");

		put(ExhibitStateUsageImpl.class, "enactedPerformance", "Parts::Part::exhibitedStates");
		
		put(ForkNodeImpl.class, "subaction", "Actions::Action::forks");
		
		put(IncludeUseCaseUsageImpl.class, "subUseCase", "UseCases::UseCase::includedUseCases");
		put(IncludeUseCaseUsageImpl.class, "enactedPerformance", "Parts::Part::performedActions");
		
		put(InterfaceDefinitionImpl.class, "base", "Interfaces::Interface");
		put(InterfaceDefinitionImpl.class, "binary", "Interfaces::BinaryInterface");
		put(InterfaceUsageImpl.class, "base", "Interfaces::interfaces");
		put(InterfaceUsageImpl.class, "binary", "Interfaces::binaryInterfaces");
		
		put(ItemDefinitionImpl.class, "base", "Items::Item");
		put(ItemUsageImpl.class, "base", "Items::items");
		put(ItemUsageImpl.class, "subitem", "Items::Item::subitems");
		
		put(JoinNodeImpl.class, "subaction", "Actions::Action::joins");
		
		put(LifeClassImpl.class, "base", "Occurrences::Life");
		
		put(MergeNodeImpl.class, "subaction", "Actions::Action::merges");
		
		put(OccurrenceDefinitionImpl.class, "base", "Occurrences::Occurrence");
		put(OccurrenceUsageImpl.class, "base", "Occurrences::occurrences");
		
		put(PartDefinitionImpl.class, "base", "Parts::Part");
		put(PartUsageImpl.class, "base", "Parts::parts");
		put(PartUsageImpl.class, "subitem", "Items::Item::subparts");
		put(PartUsageImpl.class, "requirementActor", "Requirements::RequirementCheck::actors");
		put(PartUsageImpl.class, "requirementStakeholder", "Requirements::RequirementCheck::stakeholders");
		put(PartUsageImpl.class, "caseActor", "Cases::Case::actors");
		
		put(PortDefinitionImpl.class, "base", "Ports::Port");
		put(PortUsageImpl.class, "base", "Ports::ports");
		put(PortUsageImpl.class, "portOnPart", "Parts::Part::portsOnPart");
		put(PortUsageImpl.class, "subport", "Ports::Port::subports");
		
		put(RenderingDefinitionImpl.class, "base", "Views::Rendering");
		put(RenderingUsageImpl.class, "base", "Views::renderings");
		put(RenderingUsageImpl.class, "subrendering", "Views::Rendering::subrenderings");
		
		put(RequirementDefinitionImpl.class, "base", "Requirements::RequirementCheck");
		put(RequirementUsageImpl.class, "base", "Requirements::requirementChecks");
		put(RequirementUsageImpl.class, "subrequirement", "Requirements::RequirementCheck::subrequirements");
		
		put(SatisfyRequirementUsageImpl.class, "base", "Requirements::satisfiedRequirementChecks");
		put(SatisfyRequirementUsageImpl.class, "negated", "Requirements::notSatisfiedRequirementChecks");
		
		put(SendActionUsageImpl.class, "base", "Actions::sendActions");
		put(SendActionUsageImpl.class, "subaction", "Actions::Action::sendSubactions");
		
		put(StateDefinitionImpl.class, "base", "States::StateAction");
		put(StateUsageImpl.class, "base", "States::stateActions");
		put(StateUsageImpl.class, "substate", "States::StateAction::substates");
		
		put(TransitionUsageImpl.class, "base", "Actions::transitionActions");
		put(TransitionUsageImpl.class, "actionTransition", "Actions::Action::transitions");
		put(TransitionUsageImpl.class, "stateTransition", "States::StateAction::stateTransitions");
		
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
