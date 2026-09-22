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

import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.self;

import java.util.List;

import org.omg.sysml.lang.sysml.CalculationDefinition;
import org.omg.sysml.lang.sysml.CalculationUsage;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;

/**
 * Rules of the constraints of SysML &sect;8.3.19, Calculations.
 * <p>
 * Specification quotations are from SysML 2.1.
 */
final class SysMLCalculationRules {

	private SysMLCalculationRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				self("checkCalculationUsageSubcalculationSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, CalculationUsage.class,
						SysMLCalculationRules::subcalculationSpecialization)
						.excluding("checkActionUsageSubactionSpecialization"));
	}

	/**
	 * Adds the subcalculation default of a composite calculation owned by a calculation; it
	 * subsumes the generic subaction default ({@code checkCalculationUsageSubcalculationSpecialization},
	 * SysML Table 32, &sect;8.4.15).
	 * <p>
	 * SysML §8.4.15.2, {@code checkCalculationUsageSubcalculationSpecialization}:
	 * "checkCalculationUsageSubcalculationSpecialization requires that a CalculationUsage that is
	 * composite and has an owningType that is a CalculationDefinition or CalculationUsage specialize
	 * the CalculationUsage Calculations::Calculation::subcalculations (see 9.2.12.2.1 ), which subsets
	 * Calculations::calculations and the ActionUsage Actions::Action::subactions (see 9.2.10.2.4 )."
	 */
	private static Outcome subcalculationSpecialization(CalculationUsage calculation, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!calculation.isComposite() || !(calculation.getOwningType() instanceof CalculationDefinition
				|| calculation.getOwningType() instanceof CalculationUsage)) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addMappedSubsetting(result, calculation, "subcalculation");
		return Outcome.APPLIED;
	}
}
