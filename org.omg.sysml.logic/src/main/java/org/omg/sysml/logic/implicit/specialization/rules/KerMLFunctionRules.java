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

import java.util.List;

import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Invariant;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;

/**
 * Rules of the constraints of KerML &sect;8.3.4.7, Functions.
 * <p>
 * Specification quotations are from KerML 1.1 Beta 2.
 */
final class KerMLFunctionRules {

	private KerMLFunctionRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				defaultKey("checkExpressionSpecialization", Expression.class, KerMLFunctionRules::expressionKey),
				defaultKey("checkInvariantSpecialization", Invariant.class, KerMLFunctionRules::invariantKey),
				self("expressionPerformanceSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, Expression.class,
						KerMLFunctionRules::expressionPerformanceSpecialization));
	}

	/**
	 * Selects {@code checkInvariantNegatedSpecialization} for a negated Invariant and
	 * {@code checkInvariantSpecialization} otherwise (KerML Table 10, &sect;8.4.4.1).
	 * <p>
	 * KerML §8.3.4.7.5, {@code checkInvariantSpecialization}: "An Invariant must directly or
	 * indirectly specialize either of the following BooleanExpressions from the Kernel Semantic
	 * Library: Performances::trueEvaluations, if isNegated = false, or Performances::falseEvaluations,
	 * if isNegated = true."
	 */
	static String invariantKey(Invariant invariant, ImplicitSpecializationEvaluationContext context) {
		if (invariant.isNegated()) {
			return "negated";
		}
		return "base";
	}

	/**
	 * Adds the performance defaults of an Expression, which do not depend on structural ownership;
	 * see {@link KerMLBehaviorRules#addPerformanceDefaults}.
	 */
	private static Outcome expressionPerformanceSpecialization(Expression expression,
			ImplicitSpecializationResult result, ImplicitSpecializationEvaluationContext context) {
		KerMLBehaviorRules.addPerformanceDefaults(expression, true, result, context);
		return Outcome.APPLIED;
	}

	/**
	 * KerML §8.3.4.7.3, {@code checkExpressionSpecialization}: "An Expression must directly or
	 * indirectly specialize the base Expression Performances::evaluations from the Kernel Semantic
	 * Library."
	 */
	private static String expressionKey(Expression expression,
			ImplicitSpecializationEvaluationContext context) {
		return "base";
	}
}
