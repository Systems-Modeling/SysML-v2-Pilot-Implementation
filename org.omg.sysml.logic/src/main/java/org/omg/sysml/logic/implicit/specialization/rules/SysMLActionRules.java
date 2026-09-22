/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2026 Obeo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License, version 2, as published by
 * the Eclipse Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 */
package org.omg.sysml.logic.implicit.specialization.rules;

import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.defaultKey;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.self;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.isActionOwnedComposite;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.isPartOwnedComposite;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.isPerformedAction;

import java.util.List;

import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.AssignmentActionUsage;
import org.omg.sysml.lang.sysml.DecisionNode;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ForLoopActionUsage;
import org.omg.sysml.lang.sysml.IfActionUsage;
import org.omg.sysml.lang.sysml.MergeNode;
import org.omg.sysml.lang.sysml.PerformActionUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.SuccessionAsUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionFeatureKind;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TriggerInvocationExpression;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.ImplicitGeneralizationMap;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.UsageUtil;

/**
 * Rules of the constraints of SysML &sect;8.3.17, Actions.
 * <p>
 * Specification quotations are from SysML 2.1.
 */
final class SysMLActionRules {

	private SysMLActionRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				self("checkForLoopActionUsageVarRedefinition", ImplicitSpecializationRuleFamily.CONTEXT, Feature.class,
						SysMLActionRules::forLoopVariableRedefinition),
				self("checkAcceptActionUsageTriggerActionSpecialization", ImplicitSpecializationRuleFamily.PRIORITY_EXCLUSIVE,
						AcceptActionUsage.class, SysMLActionRules::triggerActionSpecialization),
				self("triggerInvocationExpressionInstantiatedType", ImplicitSpecializationRuleFamily.PRIORITY,
						TriggerInvocationExpression.class, SysMLActionRules::triggerInvocationExpressionInstantiatedType),
				self("checkActionUsageStateActionRedefinition", ImplicitSpecializationRuleFamily.REDEFINITION,
						ActionUsage.class, SysMLActionRules::stateActionRedefinition)
						.excluding(KerMLFeatureRules.POSITIONAL_REDEFINITION),
				self("checkAssignmentActionUsageStartingAtRedefinition", ImplicitSpecializationRuleFamily.REDEFINITION,
						Feature.class, SysMLActionRules::startingAtRedefinition),
				self("checkAssignmentActionUsageAccessedFeatureRedefinition", ImplicitSpecializationRuleFamily.REDEFINITION,
						Feature.class, SysMLActionRules::accessedFeatureRedefinition),
				self("checkAssignmentActionUsageReferentRedefinition", ImplicitSpecializationRuleFamily.REDEFINITION,
						Feature.class, SysMLActionRules::referentRedefinition),
				defaultKey("checkActionUsageSpecialization", ActionUsage.class, SysMLActionRules::actionKey),
				self("checkActionUsageSubactionSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, ActionUsage.class,
						SysMLActionRules::subactionSpecialization),
				self("checkIfActionUsageSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, IfActionUsage.class,
						SysMLActionRules::ifThenElseSpecialization),
				self("checkPerformActionUsageSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, PerformActionUsage.class,
						SysMLActionRules::performedActionSpecialization),
				self("checkDecisionNodeOutgoingSuccessionSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, SuccessionAsUsage.class,
						SysMLActionRules::decisionSuccessionSpecialization),
				self("checkMergeNodeIncomingSuccessionSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, SuccessionAsUsage.class,
						SysMLActionRules::mergeSuccessionSpecialization));
	}

	/**
	 * Redefines an entry, do or exit action as the matching feature of the library state action, once
	 * for each direct general type of its owning state.
	 * <p>
	 * SysML §8.3.17.4, {@code checkActionUsageStateActionRedefinition}: "An ActionUsage that is the
	 * entry, do, or exit Action of a StateDefinition or StateUsage must redefine the entryAction,
	 * doAction, or exitAction feature, respectively, of the StateDefinition States::StateAction from
	 * the Systems Model Library."
	 */
	private static Outcome stateActionRedefinition(ActionUsage action, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!(action.getOwningFeatureMembership() instanceof StateSubactionMembership membership)) {
			return Outcome.NOT_APPLICABLE;
		}
		String libraryFeature = SpecializationHelper.mapped(action, membership.getKind().toString());
		if (libraryFeature == null) {
			return Outcome.NOT_APPLICABLE;
		}
		PositionalRedefinitions.add(action,
				PositionalRedefinitions.itselfOrLibraryFeature(action, libraryFeature, context), result, context);
		return Outcome.APPLIED;
	}

	/**
	 * SysML §8.3.17.5, {@code checkAssignmentActionUsageStartingAtRedefinition}: "The first
	 * ownedFeature of the first parameter of an AssignmentActionUsage must redefine
	 * AssignmentAction::target::startingAt."
	 */
	private static Outcome startingAtRedefinition(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!isStartingAtFeature(feature)) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addMapped(result, feature, SysMLPackage.Literals.REDEFINITION, "startingAt");
		return Outcome.APPLIED;
	}

	/**
	 * SysML §8.3.17.5, {@code checkAssignmentActionUsageAccessedFeatureRedefinition}: "The first
	 * ownedFeature of the first ownedFeature of the first parameter of an AssignmentActionUsage must
	 * redefine AssignmentAction::target::startingAt::accessedFeature."
	 */
	private static Outcome accessedFeatureRedefinition(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!isAccessedFeature(feature)) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addMapped(result, feature, SysMLPackage.Literals.REDEFINITION, "accessedFeature");
		return Outcome.APPLIED;
	}

	/**
	 * SysML §8.3.17.5, {@code checkAssignmentActionUsageReferentRedefinition}: "The first
	 * ownedFeature of the first ownedFeature of the first parameter of an AssignmentActionUsage must
	 * redefine the referent of the AssignmentActionUsage."
	 */
	private static Outcome referentRedefinition(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!isAccessedFeature(feature)) {
			return Outcome.NOT_APPLICABLE;
		}
		AssignmentActionUsage assignment = (AssignmentActionUsage)feature.getOwner().getOwner().getOwner();
		result.add(SysMLPackage.Literals.REDEFINITION, assignment.getReferent());
		return Outcome.APPLIED;
	}

	/** Tests the first owned feature of the first parameter of an AssignmentActionUsage. */
	private static boolean isStartingAtFeature(Feature feature) {
		return feature.getOwningType() instanceof Feature parameter
				&& parameter.getOwningType() instanceof AssignmentActionUsage assignment
				&& assignment.getParameter().indexOf(parameter) == 0;
	}

	/** Tests the first owned feature of the {@code startingAt} feature of an AssignmentActionUsage. */
	private static boolean isAccessedFeature(Feature feature) {
		return feature.getOwningType() instanceof Feature startingAt && isStartingAtFeature(startingAt)
				&& startingAt.getOwnedFeature().indexOf(feature) == 0;
	}

	/**
	 * Redefines a for-loop variable as {@code Actions::ForLoopAction::var}, which fully determines
	 * it, and subsets it by the sequence parameter of the action.
	 * <p>
	 * SysML §8.3.17.9, {@code checkForLoopActionUsageVarRedefinition}: "The loopVariable of a
	 * ForLoopActionUsage must redefine the ActionUsage Actions::ForLoopAction::var."
	 * <p>
	 * The subsetting narrows the variable to the sequence bound in this usage, as the library does
	 * for {@code ForLoopAction} (SysML §8.4.13.10): "It also has a protected ownedFeature var that
	 * is a subset of seq with multiplicity 0..1."
	 */
	private static Outcome forLoopVariableRedefinition(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!(feature.getOwningType() instanceof ForLoopActionUsage action)) {
			return Outcome.NOT_APPLICABLE;
		}
		if (!(feature instanceof ReferenceUsage loopVariable) || action.getLoopVariable() != loopVariable) {
			return Outcome.NOT_APPLICABLE;
		}
		result.add(SysMLPackage.Literals.REDEFINITION, SpecializationHelper.library(result, action,
				ImplicitGeneralizationMap.getDefaultSupertypeFor(action.getClass(), "loopVariable")));
		ReferenceUsage sequenceParameter = TypeUtil.getOwnedParameterOf(action, 0, ReferenceUsage.class);
		result.add(SysMLPackage.Literals.SUBSETTING, sequenceParameter);
		return Outcome.APPLIED_DETERMINES;
	}

	/**
	 * Recognizes an AcceptActionUsage used as a transition trigger: the rule adds nothing and
	 * suppresses the fallbacks. The specialization is the redefinition of the library trigger
	 * feature added by the redefinition family for a Feature owned by a TransitionFeatureMembership.
	 * <p>
	 * SysML §8.3.17.2, {@code checkAcceptActionUsageTriggerActionSpecialization}: "An
	 * AcceptActionUsage that is the triggerAction of TransitionUsage must directly or indirectly
	 * specialize the ActionUsage Actions::TransitionAction::accepter from the Systems Model
	 * Library."
	 */
	private static Outcome triggerActionSpecialization(AcceptActionUsage action, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (action.getOwningFeatureMembership() instanceof TransitionFeatureMembership membership
				&& membership.getKind() == TransitionFeatureKind.TRIGGER) {
			return Outcome.APPLIED_SUPPRESSES_FALLBACKS;
		}
		return Outcome.NOT_APPLICABLE;
	}

	/**
	 * Types a TriggerInvocationExpression by the library function of its kind, following the
	 * {@code instantiatedType()} operation of SysML §8.3.17.17, TriggerInvocationExpression.
	 */
	private static Outcome triggerInvocationExpressionInstantiatedType(TriggerInvocationExpression trigger,
			ImplicitSpecializationResult result, ImplicitSpecializationEvaluationContext context) {
		if (trigger.getKind() == null) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addLibrary(result, trigger, SysMLPackage.Literals.FEATURE_TYPING,
				SpecializationHelper.mapped(trigger, trigger.getKind().toString()));
		return Outcome.APPLIED;
	}

	/**
	 * Adds the subaction default of a composite action owned by an action, or the owned action
	 * default of a composite action owned by a part ({@code checkActionUsageSubactionSpecialization},
	 * {@code checkActionUsageOwnedActionSpecialization}, SysML &sect;8.4.13). More specific action
	 * family rules exclude it; the performance default is added by the Step rule.
	 * <p>
	 * SysML §8.3.17.4, {@code checkActionUsageSubactionSpecialization}: "A composite ActionUsage that
	 * is a subaction usage must directly or indirectly specialize the ActionUsage
	 * Actions::Action::subactions from the Systems Model Library."
	 */
	private static Outcome subactionSpecialization(ActionUsage action, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (isActionOwnedComposite(action)) {
			SpecializationHelper.addMappedSubsetting(result, action, "subaction");
			return Outcome.APPLIED;
		}
		if (isPartOwnedComposite(action)) {
			SpecializationHelper.addMappedSubsetting(result, action, "ownedAction");
			return Outcome.APPLIED;
		}
		return Outcome.NOT_APPLICABLE;
	}

	/**
	 * Adds "ifThenElse" for an IfActionUsage with an else branch ({@code
	 * checkIfActionUsageSpecialization}, SysML &sect;8.4.13).
	 * <p>
	 * SysML §8.3.17.10, {@code checkIfActionUsageSpecialization}: "A IfActionUsage must directly or
	 * indirectly specialize the ActionUsage Actions::ifThenActions from the Systems Model Library. If
	 * it has an elseAction, then it must directly or indirectly specialize Actions::ifThenElseActions"
	 */
	private static Outcome ifThenElseSpecialization(IfActionUsage ifAction, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (ifAction.getElseAction() == null) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addMappedSubsetting(result, ifAction, "ifThenElse");
		return Outcome.APPLIED;
	}

	/**
	 * Adds "performedAction" for a PerformActionUsage performed by a part ({@code
	 * checkPerformActionUsageSpecialization}).
	 * <p>
	 * SysML §8.3.17.14, {@code checkPerformActionUsageSpecialization}: "If a PerformActionUsage has an
	 * owningType that is a PartDefinition or PartUsage, then it must directly or indirectly specialize
	 * the ActionUsage Parts::Part::performedActions."
	 */
	private static Outcome performedActionSpecialization(PerformActionUsage perform, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!isPerformedAction(perform)) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addMappedSubsetting(result, perform, "performedAction");
		return Outcome.APPLIED;
	}

	/**
	 * Subsets a succession whose source is a DecisionNode by the chain of that node and its outgoing
	 * links ({@code checkDecisionNodeOutgoingSuccessionSpecialization}, SysML &sect;8.3.17.7).
	 * <p>
	 * SysML §8.3.17.7, {@code checkDecisionNodeOutgoingSuccessionSpecialization}: "All outgoing
	 * Successions from a DecisionNode must subset the inherited outgoingHBLink feature of the
	 * DecisionNode."
	 */
	private static Outcome decisionSuccessionSpecialization(SuccessionAsUsage succession,
			ImplicitSpecializationResult result, ImplicitSpecializationEvaluationContext context) {
		Feature source = UsageUtil.getSourceOf(succession);
		if (!(source instanceof DecisionNode)) {
			return Outcome.NOT_APPLICABLE;
		}
		result.add(SysMLPackage.Literals.SUBSETTING, FeatureUtil.chainFeatures(source,
				(Feature)SpecializationHelper.library(result, succession, SpecializationHelper.mapped(succession, "decision"))));
		return Outcome.APPLIED;
	}

	/**
	 * Subsets a succession whose target is a MergeNode by the chain of that node and its incoming
	 * links ({@code checkMergeNodeIncomingSuccessionSpecialization}, SysML &sect;8.3.17.13).
	 * <p>
	 * SysML §8.3.17.13, {@code checkMergeNodeIncomingSuccessionSpecialization}: "All incoming
	 * Successions to a MergeNode must subset the inherited incomingHBLink feature of the MergeNode."
	 */
	private static Outcome mergeSuccessionSpecialization(SuccessionAsUsage succession, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		Feature target = UsageUtil.getTargetOf(succession);
		if (!(target instanceof MergeNode)) {
			return Outcome.NOT_APPLICABLE;
		}
		result.add(SysMLPackage.Literals.SUBSETTING, FeatureUtil.chainFeatures(target,
				(Feature)SpecializationHelper.library(result, succession, SpecializationHelper.mapped(succession, "merge"))));
		return Outcome.APPLIED;
	}

	/**
	 * SysML §8.3.17.4, {@code checkActionUsageSpecialization}: "An ActionUsage must directly or
	 * indirectly specialize the ActionUsage Actions::actions from the Systems Model Library."
	 */
	private static String actionKey(ActionUsage action, ImplicitSpecializationEvaluationContext context) {
		return "base";
	}
}
