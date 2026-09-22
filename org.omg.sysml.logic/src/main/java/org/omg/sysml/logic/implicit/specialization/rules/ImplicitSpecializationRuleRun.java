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

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;

/**
 * The state of one run of {@link ImplicitSpecializationRules} on one Type: the Type, its working
 * result, the request context, and what the rules that applied so far decided for the rest of the
 * run. A run is created for each computation of a Type and is not shared.
 */
final class ImplicitSpecializationRuleRun {

	private final Type computedType;
	private final ImplicitSpecializationResult workingResult;
	private final ImplicitSpecializationEvaluationContext requestContext;
	private final Set<ImplicitSpecializationRuleFamily> appliedFamilies =
			EnumSet.noneOf(ImplicitSpecializationRuleFamily.class);
	/** The identifiers of the excluded rules; created by the first exclusion, which few Types reach. */
	private Set<String> excludedRuleIds;
	private boolean determined;

	/**
	 * Starts a run.
	 *
	 * @param computedType the Type being computed
	 * @param workingResult the working result of the Type
	 * @param requestContext the request context
	 */
	ImplicitSpecializationRuleRun(Type computedType, ImplicitSpecializationResult workingResult,
			ImplicitSpecializationEvaluationContext requestContext) {
		this.computedType = computedType;
		this.workingResult = workingResult;
		this.requestContext = requestContext;
	}

	/**
	 * Returns the Type whose implicit specializations are computed.
	 *
	 * @return the computed Type
	 */
	Type getComputedType() {
		return computedType;
	}

	/**
	 * Returns the working result to which the rules add their candidates.
	 *
	 * @return the working result of the computed Type
	 */
	ImplicitSpecializationResult getWorkingResult() {
		return workingResult;
	}

	/**
	 * Returns the context of the request in which the Type is computed.
	 *
	 * @return the request context
	 */
	ImplicitSpecializationEvaluationContext getRequestContext() {
		return requestContext;
	}

	/**
	 * Tests whether the rules of a family may run: a fallback family does not run for a conjugated
	 * Type or once a rule has suppressed the fallbacks, and a family does not run once a rule of
	 * the family it is an alternative to has applied.
	 *
	 * @param family a family
	 * @return {@code true} when the rules of the family may run
	 */
	boolean shouldRun(ImplicitSpecializationRuleFamily family) {
		if (family.isFallback() && !areFallbacksAllowed()) {
			return false;
		}
		return family.alternativeTo() == null || !hasFamilyApplied(family.alternativeTo());
	}

	/**
	 * Tests whether a rule of a family has applied during this run.
	 *
	 * @param family a family
	 * @return {@code true} once a rule of {@code family} returned an outcome other than
	 *         {@link Outcome#NOT_APPLICABLE}
	 */
	boolean hasFamilyApplied(ImplicitSpecializationRuleFamily family) {
		return appliedFamilies.contains(family);
	}

	/**
	 * Tests whether a rule has been excluded by a rule that applied earlier in this run.
	 *
	 * @param rule a rule
	 * @return {@code true} when the rule must not run
	 */
	boolean isExcluded(ImplicitSpecializationRule rule) {
		return excludedRuleIds != null && excludedRuleIds.contains(rule.id());
	}

	/**
	 * Tests whether a rule that applied fully determines the computed Type, so that the later
	 * families do not run.
	 *
	 * @return {@code true} once a rule returned {@link Outcome#APPLIED_DETERMINES}
	 */
	boolean isDetermined() {
		return determined;
	}

	/**
	 * Applies a rule to the computed Type.
	 *
	 * @param rule the rule to apply
	 * @return the outcome returned by the rule
	 */
	Outcome applyRule(ImplicitSpecializationRule rule) {
		return rule.apply(getComputedType(), getWorkingResult(), getRequestContext());
	}

	/**
	 * Records the consequences of a rule that applied: its family has applied, the rules it
	 * excludes no longer run, and its outcome may determine the Type or suppress the fallbacks.
	 *
	 * @param rule the rule that applied
	 * @param outcome its outcome, other than {@link Outcome#NOT_APPLICABLE}
	 */
	void recordApplied(ImplicitSpecializationRule rule, Outcome outcome) {
		markFamilyApplied(rule.family());
		excludeRules(rule.excludes());
		if (outcome == Outcome.APPLIED_DETERMINES) {
			markDetermined();
		} else if (outcome == Outcome.APPLIED_SUPPRESSES_FALLBACKS) {
			getWorkingResult().suppressFallbackSpecializations();
		}
	}

	private boolean areFallbacksAllowed() {
		return getWorkingResult().areFallbackSpecializationsAllowed() && !getComputedType().isConjugated();
	}

	private void markFamilyApplied(ImplicitSpecializationRuleFamily family) {
		appliedFamilies.add(family);
	}

	private void excludeRules(Set<String> ruleIds) {
		if (ruleIds.isEmpty()) {
			return;
		}
		if (excludedRuleIds == null) {
			excludedRuleIds = new HashSet<>();
		}
		excludedRuleIds.addAll(ruleIds);
	}

	private void markDetermined() {
		determined = true;
	}
}
