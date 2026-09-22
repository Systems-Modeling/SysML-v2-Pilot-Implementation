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
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.isPerformedAction;

import java.util.List;

import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.ExhibitStateUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.UsageUtil;

/**
 * Rules of the constraints of SysML &sect;8.3.18, States.
 * <p>
 * Specification quotations are from SysML 2.1.
 */
final class SysMLStateRules {

	private static final String GUARD_EXPRESSION_FEATURE = "TransitionPerformances::TransitionPerformance::guard";
	private static final String TRANSITION_LINK_FEATURE = "TransitionPerformances::TransitionPerformance::transitionLink";

	private SysMLStateRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				self("checkTransitionUsagePayloadSpecialization", ImplicitSpecializationRuleFamily.PRIORITY_EXCLUSIVE,
						ReferenceUsage.class, SysMLStateRules::transitionPayloadSpecialization),
				self("checkTransitionUsageTransitionFeatureSpecialization", ImplicitSpecializationRuleFamily.REDEFINITION,
						ActionUsage.class, SysMLStateRules::transitionFeatureRedefinition)
						.excluding(KerMLFeatureRules.POSITIONAL_REDEFINITION),
				self("transitionGuardExpressionRedefinition", ImplicitSpecializationRuleFamily.REDEFINITION,
						Expression.class, SysMLStateRules::guardExpressionRedefinition)
						.excluding(KerMLFeatureRules.POSITIONAL_REDEFINITION),
				self("transitionLinkRedefinition", ImplicitSpecializationRuleFamily.REDEFINITION, ReferenceUsage.class,
						SysMLStateRules::transitionLinkRedefinition)
						.excluding(KerMLFeatureRules.POSITIONAL_REDEFINITION),
				defaultKey("checkTransitionUsageSpecialization", TransitionUsage.class, SysMLStateRules::transitionKey),
				self("checkStateUsageSubstateSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, StateUsage.class, SysMLStateRules::substateSpecialization)
						.excluding("checkActionUsageSubactionSpecialization"),
				self("checkExhibitStateUsageSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, ExhibitStateUsage.class,
						SysMLStateRules::exhibitedStateSpecialization));
	}

	/**
	 * Subsets the payload parameter of a TransitionUsage by the chain of its trigger's accepter and
	 * payload parameter, which fully determines it.
	 * <p>
	 * SysML §8.3.18.9, {@code checkTransitionUsagePayloadSpecialization}: "If a TransitionUsage has
	 * a triggerAction, then the payload parameter of the TransitionUsage subsets the Feature chain of
	 * the triggerAction and its payloadParameter."
	 */
	private static Outcome transitionPayloadSpecialization(ReferenceUsage reference, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!(reference.getOwningType() instanceof TransitionUsage transition)
				|| reference != UsageUtil.getPayloadParameterOf(transition)) {
			return Outcome.NOT_APPLICABLE;
		}
		Feature accepter = UsageUtil.getAccepterPayloadParameterOf(transition);
		if (accepter == null) {
			return Outcome.NOT_APPLICABLE;
		}
		result.add(SysMLPackage.Literals.SUBSETTING,
				FeatureUtil.chainFeatures((Feature)accepter.getOwningType(), accepter));
		return Outcome.APPLIED_SUPPRESSES_FALLBACKS;
	}

	/**
	 * Redefines a trigger, guard or effect ActionUsage of a TransitionUsage as the matching feature
	 * of the library transition action, once for each general type used by
	 * {@link PositionalRedefinitions#add}.
	 * <p>
	 * SysML §8.3.18.9, {@code checkTransitionUsageTransitionFeatureSpecialization}: "The
	 * triggerActions, guardExpressions, and effectActions of a TransitionUsage must specialize,
	 * respectively, the accepter, guard, and effect features of the ActionUsage
	 * Actions::TransitionActions from the Systems Model Library."
	 */
	private static Outcome transitionFeatureRedefinition(ActionUsage action, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!(action.getOwningFeatureMembership() instanceof TransitionFeatureMembership membership)) {
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
	 * Redefines a guard Expression of a TransitionUsage, other than an ActionUsage, as
	 * {@code TransitionPerformances::TransitionPerformance::guard} (SysML &sect;8.4.14.3); a guard
	 * that is an ActionUsage is redefined by {@code checkTransitionUsageTransitionFeatureSpecialization}.
	 */
	private static Outcome guardExpressionRedefinition(Expression expression, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (expression instanceof ActionUsage || !ExpressionUtil.isTransitionGuard(expression)) {
			return Outcome.NOT_APPLICABLE;
		}
		PositionalRedefinitions.add(expression,
				PositionalRedefinitions.itselfOrLibraryFeature(expression, GUARD_EXPRESSION_FEATURE, context), result,
				context);
		return Outcome.APPLIED;
	}

	/**
	 * Redefines the transition-link ReferenceUsage of a TransitionUsage as
	 * {@code TransitionPerformances::TransitionPerformance::transitionLink}, the feature that its
	 * succession is bound to.
	 * <p>
	 * SysML §8.3.18.9, {@code checkTransitionUsageSuccessionBindingConnector}: "A TransitionUsage
	 * must have an ownedMember that is a BindingConnector between its succession and the inherited
	 * Feature TransitionPerformances::TransitionPerformance::transitionLink."
	 */
	private static Outcome transitionLinkRedefinition(ReferenceUsage reference, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!(reference.getOwningType() instanceof TransitionUsage transition)
				|| reference != UsageUtil.getTransitionLinkFeatureOf(transition)) {
			return Outcome.NOT_APPLICABLE;
		}
		result.add(SysMLPackage.Literals.REDEFINITION, SysMLLibraryUtil.getLibraryType(reference, TRANSITION_LINK_FEATURE));
		return Outcome.APPLIED;
	}

	/**
	 * Selects the state transition or action transition default of a composite TransitionUsage
	 * ({@code checkTransitionUsageStateSpecialization}, {@code checkTransitionUsageActionSpecialization},
	 * {@code checkTransitionUsageSpecialization}, SysML &sect;8.4.14).
	 * <p>
	 * SysML §8.3.18.9, {@code checkTransitionUsageSpecialization}: "A TransitionUsage must directly or
	 * indirectly specialize the ActionUsage Actions::transitionActions from the Systems Model
	 * Library."
	 */
	private static String transitionKey(TransitionUsage transition,
			ImplicitSpecializationEvaluationContext context) {
		Type owner = transition.getOwningType();
		if (transition.isComposite() && (owner instanceof StateDefinition || owner instanceof StateUsage)
				&& transition.getSource() instanceof StateUsage) {
			return "stateTransition";
		}
		if (transition.isComposite() && (owner instanceof ActionDefinition || owner instanceof ActionUsage)
				&& !(transition.getSource() instanceof StateUsage)) {
			return "actionTransition";
		}
		return "base";
	}

	/**
	 * Adds the exclusive state or substate default of a substate; an exclusive state takes precedence
	 * ({@code checkStateUsageExclusiveStateSpecialization}, {@code checkStateUsageSubstateSpecialization},
	 * SysML &sect;8.4.14). It subsumes the generic subaction default.
	 * <p>
	 * SysML §8.3.18.6, {@code checkStateUsageSubstateSpecialization}: "A StateUsage that is a substate
	 * usage with a owning StateDefinition or StateUsage that is parallel must directly or indirectly
	 * specialize the StateUsage States::StateAction::substates from the Systems Model Library."
	 */
	private static Outcome substateSpecialization(StateUsage state, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (state.isSubstateUsage(false)) {
			SpecializationHelper.addMappedSubsetting(result, state, "exclusiveState");
			return Outcome.APPLIED;
		}
		if (state.isSubstateUsage(true)) {
			SpecializationHelper.addMappedSubsetting(result, state, "substate");
			return Outcome.APPLIED;
		}
		return Outcome.NOT_APPLICABLE;
	}

	/**
	 * Adds "performedAction" for an ExhibitStateUsage performed by a part ({@code
	 * checkExhibitStateUsageSpecialization}, SysML &sect;8.4.14).
	 * <p>
	 * SysML §8.3.18.2, {@code checkExhibitStateUsageSpecialization}: "If an ExhibitStateUsage has an
	 * owningType that is a PartDefinition or PartUsage, then it must directly or indirectly specialize
	 * the StateUsage Parts::Part::exhibitedStates."
	 */
	private static Outcome exhibitedStateSpecialization(ExhibitStateUsage exhibit, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!isPerformedAction(exhibit)) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addMappedSubsetting(result, exhibit, "performedAction");
		return Outcome.APPLIED;
	}
}
