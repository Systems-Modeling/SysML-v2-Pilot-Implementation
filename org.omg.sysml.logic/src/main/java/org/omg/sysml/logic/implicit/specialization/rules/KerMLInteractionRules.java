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

import org.omg.sysml.lang.sysml.Flow;
import org.omg.sysml.lang.sysml.PayloadFeature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;

/**
 * Rules of the constraints of KerML &sect;8.3.4.9, Interactions.
 * <p>
 * Specification quotations are from KerML 1.1 Beta 2.
 */
final class KerMLInteractionRules {

	private KerMLInteractionRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				self("checkPayloadFeatureRedefinition", ImplicitSpecializationRuleFamily.REDEFINITION, PayloadFeature.class,
						KerMLInteractionRules::payloadRedefinition)
						.excluding(KerMLFeatureRules.POSITIONAL_REDEFINITION),
				defaultKey("checkFlowSpecialization", Flow.class, KerMLInteractionRules::flowKey),
				self("flowPerformanceSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, Flow.class,
						KerMLInteractionRules::flowPerformanceSpecialization));
	}

	/**
	 * KerML §8.3.4.9.5, {@code checkPayloadFeatureRedefinition}: "A PayloadFeature must redefine the
	 * Feature Transfers::Transfer::payload from the Kernel Semantic Library."
	 */
	private static Outcome payloadRedefinition(PayloadFeature payload, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		SpecializationHelper.addMapped(result, payload, SysMLPackage.Literals.REDEFINITION, "payload");
		return Outcome.APPLIED;
	}

	/**
	 * Selects {@code checkFlowWithEndsSpecialization} for a Flow with ends and
	 * {@code checkFlowSpecialization} otherwise (KerML Table 10, &sect;8.4.4.6).
	 * <p>
	 * KerML §8.3.4.9.2, {@code checkFlowSpecialization}: "A Flow must directly or indirectly
	 * specialize the Step Transfers::transfers from the Kernel Semantic Library."
	 */
	private static String flowKey(Flow flow, ImplicitSpecializationEvaluationContext context) {
		if (flow.getOwnedEndFeature().isEmpty()) {
			return "base";
		}
		return "flow";
	}

	/**
	 * Adds the performance defaults of a KerML Flow, which is not an Expression; see
	 * {@link KerMLBehaviorRules#addPerformanceDefaults}.
	 */
	private static Outcome flowPerformanceSpecialization(Flow flow, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		KerMLBehaviorRules.addPerformanceDefaults(flow, true, result, context);
		return Outcome.APPLIED;
	}
}
