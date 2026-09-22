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

import java.util.List;

import org.omg.sysml.lang.sysml.FlowDefinition;
import org.omg.sysml.lang.sysml.FlowUsage;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PortionKind;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;
import org.omg.sysml.util.UsageUtil;

/**
 * Rules of the constraints of SysML &sect;8.3.16, Flows.
 * <p>
 * Specification quotations are from SysML 2.1.
 */
final class SysMLFlowRules {

	private SysMLFlowRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				defaultKey("checkFlowUsageSpecialization", FlowUsage.class, SysMLFlowRules::flowUsageKey),
				defaultKey("checkFlowDefinitionSpecialization", FlowDefinition.class, SysMLFlowRules::flowDefinitionKey),
				self("flowUsageSpecializations", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, FlowUsage.class, SysMLFlowRules::flowUsageSpecializations));
	}

	/**
	 * Selects the message default of a FlowUsage without ends, and the base default otherwise
	 * ({@code checkFlowUsageSpecialization}, SysML Table 32, &sect;8.4.12).
	 * <p>
	 * SysML §8.3.16.3, {@code checkFlowUsageSpecialization}: "A FlowUsage must directly or indirectly
	 * specialize the base FlowUsage Flows::messages from the Systems Library model."
	 */
	private static String flowUsageKey(FlowUsage flow, ImplicitSpecializationEvaluationContext context) {
		if (UsageUtil.isMessage(flow)) {
			return "message";
		}
		return "base";
	}

	/**
	 * Selects {@code checkFlowDefinitionBinarySpecialization} for two ends and
	 * {@code checkFlowDefinitionSpecialization} otherwise (SysML Table 31, &sect;8.4.12).
	 * <p>
	 * SysML §8.3.16.2, {@code checkFlowDefinitionSpecialization}: "A FlowDefinition must directly or
	 * indirectly specialize the base FlowDefinition Flows::MessageAction from the Systems Model
	 * Library."
	 */
	private static String flowDefinitionKey(FlowDefinition flow,
			ImplicitSpecializationEvaluationContext context) {
		if (flow.getOwnedEndFeature().size() == 2) {
			return "binary";
		}
		return "base";
	}

	/**
	 * Adds the suboccurrence, portion and action defaults of a FlowUsage (SysML Table 32,
	 * &sect;8.4.12). The "subaction"/"ownedAction" keys are also considered by the ActionUsage rule;
	 * the performance default is added by the Step rule.
	 */
	private static Outcome flowUsageSpecializations(FlowUsage flow, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (flow.isComposite() && flow.getOwningType() instanceof OccurrenceUsage) {
			SpecializationHelper.addMappedSubsetting(result, flow, "suboccurrence");
		}
		if (flow.getPortionKind() == PortionKind.SNAPSHOT) {
			SpecializationHelper.addMappedSubsetting(result, flow, "snapshot");
		} else if (flow.getPortionKind() == PortionKind.TIMESLICE) {
			SpecializationHelper.addMappedSubsetting(result, flow, "timeslice");
		}
		if (isActionOwnedComposite(flow)) {
			SpecializationHelper.addMappedSubsetting(result, flow, "subaction");
		} else if (isPartOwnedComposite(flow)) {
			SpecializationHelper.addMappedSubsetting(result, flow, "ownedAction");
		}
		return Outcome.APPLIED;
	}
}
