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

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;

/**
 * The rules of one {@link ImplicitSpecializationRuleFamily} and how they run for a Type. The rules
 * that apply to the metaclass of the Type, in execution order, are looked up in an
 * {@link ImplicitSpecializationRulesByMetaclass}; this class adds what depends on the family:
 * a first-match family ends at the first rule that applies, a rule excluded by a rule that applied
 * earlier is skipped, and an exclusion is checked, when the engine is created, to take effect.
 * <p>
 * For example, for a StateUsage in the {@code DEFAULT_ADDITION} family, the rules are tried in the
 * order of the generated {@code SysMLSwitch} (StateUsage, ActionUsage, OccurrenceUsage, Step, ...,
 * Feature), then in registration order for the same metaclass:
 * <ol>
 * <li>{@code checkStateUsageSubstateSpecialization} (StateUsage);</li>
 * <li>{@code checkActionUsageSubactionSpecialization} (ActionUsage), skipped when the previous rule
 * applied, since it excludes this one;</li>
 * <li>{@code occurrenceUsageSpecializations} (OccurrenceUsage);</li>
 * <li>{@code stepPerformanceSpecialization} (Step);</li>
 * <li>{@code checkFeatureValuationSpecialization}, {@code checkFeatureEndSpecialization} and
 * {@code checkFeatureCrossingSpecialization} (Feature).</li>
 * </ol>
 * The family is cumulative, so every rule that applies adds its candidates; in the first-match
 * {@code DEFAULT_KEY} family, the first rule that applies would end the family.
 */
final class ImplicitSpecializationFamilyRules {

	private final ImplicitSpecializationRuleFamily family;
	private final ImplicitSpecializationRulesByMetaclass rules;

	/**
	 * Groups the rules of a family.
	 *
	 * @param family the family
	 * @param rules its rules, indexed by metaclass
	 */
	ImplicitSpecializationFamilyRules(ImplicitSpecializationRuleFamily family, ImplicitSpecializationRulesByMetaclass rules) {
		this.family = family;
		this.rules = rules;
	}

	/**
	 * Returns the family of these rules.
	 *
	 * @return the family
	 */
	ImplicitSpecializationRuleFamily getFamily() {
		return family;
	}

	/**
	 * Tests whether at least one rule of the family applies to the metaclass of the computed Type.
	 *
	 * @param run the current run
	 * @return {@code true} when the family has rules to try for this run
	 */
	boolean hasRulesFor(ImplicitSpecializationRuleRun run) {
		return !rules.rulesFor(run.getComputedType()).isEmpty();
	}

	/**
	 * Checks that an exclusion can take effect: the excluding rule must run before the excluded one
	 * for every Type to which both apply.
	 *
	 * @param excluding a rule of this family
	 * @param excluded a rule of this family that {@code excluding} excludes
	 * @throws IllegalArgumentException when {@code excluded} can run before {@code excluding}
	 */
	void checkRunsBefore(ImplicitSpecializationRule excluding, ImplicitSpecializationRule excluded) {
		EClass metaclass = rules.findMetaclassRunningBefore(excluding, excluded);
		if (metaclass != null) {
			throw new IllegalArgumentException("Rule " + excluding.id() + " excludes " + excluded.id()
					+ ", which runs first for " + metaclass.getName());
		}
	}

	/**
	 * Runs the rules of the family in switch order, skipping the excluded ones, and records the
	 * consequences of each rule that applies. In a first-match family, the first rule that applies
	 * ends the family.
	 *
	 * @param run the current run
	 */
	void run(ImplicitSpecializationRuleRun run) {
		for (ImplicitSpecializationRule rule : rules.rulesFor(run.getComputedType())) {
			if (run.isExcluded(rule)) {
				continue;
			}
			Outcome outcome = run.applyRule(rule);
			if (outcome != Outcome.NOT_APPLICABLE) {
				run.recordApplied(rule, outcome);
				if (family.isFirstMatch()) {
					return;
				}
			}
		}
	}
}
