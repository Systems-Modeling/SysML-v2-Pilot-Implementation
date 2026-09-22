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
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.isBehaviorOwned;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.isStructureOwnedComposite;

import java.util.List;

import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.PayloadFeature;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;

/**
 * Rules of the constraints of KerML &sect;8.3.4.6, Behaviors.
 * <p>
 * Specification quotations are from KerML 1.1 Beta 2.
 */
final class KerMLBehaviorRules {

	private KerMLBehaviorRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				defaultKey("checkStepSpecialization", Step.class, KerMLBehaviorRules::stepKey),
				self("stepPerformanceSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, Step.class,
						KerMLBehaviorRules::stepPerformanceSpecialization));
	}

	/**
	 * Selects {@code checkStepOwnedPerformanceSpecialization}, {@code checkStepSubperformanceSpecialization},
	 * {@code checkStepEnclosedPerformanceSpecialization} or the incoming transfer default of a Step with a
	 * payload (KerML Table 10, &sect;8.4.4.7); no key otherwise, so that a more general metaclass
	 * selects it.
	 * <p>
	 * KerML §8.3.4.6.3, {@code checkStepSpecialization}: "A Step must directly or indirectly
	 * specialize the base Step Performances::performances from the Kernel Semantic Library."
	 */
	private static String stepKey(Step step, ImplicitSpecializationEvaluationContext context) {
		if (isStructureOwnedComposite(step, context)) {
			return "ownedPerformance";
		}
		if (isBehaviorOwned(step)) {
			if (step.isComposite()) {
				return "subperformance";
			}
			return "enclosedPerformance";
		}
		if (step.getOwnedFeature().stream().anyMatch(PayloadFeature.class::isInstance)) {
			return "incomingTransfer";
		}
		return null;
	}

	/**
	 * Adds the performance defaults of a Step that is not an Expression; see
	 * {@link #addPerformanceDefaults}.
	 */
	private static Outcome stepPerformanceSpecialization(Step step, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (step instanceof Expression) {
			return Outcome.NOT_APPLICABLE;
		}
		addPerformanceDefaults(step, false, result, context);
		return Outcome.APPLIED;
	}

	/**
	 * Adds the owned, sub- and enclosed performance defaults
	 * ({@code checkStepOwnedPerformanceSpecialization}, {@code checkStepSubperformanceSpecialization},
	 * {@code checkStepEnclosedPerformanceSpecialization}; KerML &sect;8.4.4.7.2).
	 *
	 * @param feature the performance-like feature
	 * @param independent whether the sub- and enclosed performance checks ignore structural
	 *        ownership (Expression and Flow) or depend on it (plain Step)
	 * @param result the result to update
	 * @param context the request context
	 */
	static void addPerformanceDefaults(Feature feature, boolean independent, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		boolean structure = isStructureOwnedComposite(feature, context);
		boolean behavior = isBehaviorOwned(feature);
		boolean behaviorComposite = behavior && feature.isComposite();
		if (structure) {
			SpecializationHelper.addMappedSubsetting(result, feature, "ownedPerformance");
		}
		if ((independent || !structure) && behaviorComposite) {
			SpecializationHelper.addMappedSubsetting(result, feature, "subperformance");
		}
		if ((independent || !structure && !behaviorComposite) && behavior) {
			SpecializationHelper.addMappedSubsetting(result, feature, "enclosedPerformance");
		}
	}
}
