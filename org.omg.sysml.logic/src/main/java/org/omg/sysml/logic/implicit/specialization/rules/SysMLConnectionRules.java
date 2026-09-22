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

import org.omg.sysml.lang.sysml.ConnectionDefinition;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.SuccessionAsUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;
import org.omg.sysml.util.UsageUtil;

/**
 * Rules of the constraints of SysML &sect;8.3.13, Connections.
 * <p>
 * Specification quotations are from SysML 2.1.
 */
final class SysMLConnectionRules {

	private SysMLConnectionRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				defaultKey("checkConnectionUsageSpecialization", ConnectionUsage.class, SysMLConnectionRules::connectionUsageKey),
				defaultKey("checkConnectionDefinitionSpecialization", ConnectionDefinition.class,
						SysMLConnectionRules::connectionDefinitionKey),
				self("connectionUsageSubpartSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, ConnectionUsage.class,
						(connection, result, context) -> SysMLItemRules.subpartSpecialization(connection, result)),
				self("successionEndReferenceSubsetting", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, ReferenceUsage.class,
						SysMLConnectionRules::successionEndReferenceSubsetting));
	}

	/**
	 * Selects {@code checkConnectionUsageBinarySpecialization} for two ends and
	 * {@code checkConnectionUsageSpecialization} otherwise (SysML Table 32, &sect;8.4.9).
	 * <p>
	 * SysML §8.3.13.4, {@code checkConnectionUsageSpecialization}: "A ConnectionUsage must directly or
	 * indirectly specialize the ConnectionUsage Connections::connections from the Systems Model
	 * Library."
	 */
	private static String connectionUsageKey(ConnectionUsage connection,
			ImplicitSpecializationEvaluationContext context) {
		if (connection.getOwnedEndFeature().size() == 2) {
			return "binary";
		}
		return "base";
	}

	/**
	 * Selects {@code checkConnectionDefinitionBinarySpecialization} for two ends and
	 * {@code checkConnectionDefinitionSpecialization} otherwise (SysML Table 31, &sect;8.4.9).
	 * <p>
	 * SysML §8.3.13.3, {@code checkConnectionDefinitionSpecializations}: "A ConnectionDefinition must
	 * directly or indirectly specialize the ConnectionDefinition Connections::Connection from the
	 * Systems Model Library."
	 * <p>
	 * Table 31 and &sect;8.4 name this constraint {@code checkConnectionDefinitionSpecialization},
	 * the identifier of the rule.
	 */
	private static String connectionDefinitionKey(ConnectionDefinition connection,
			ImplicitSpecializationEvaluationContext context) {
		if (connection.getOwnedEndFeature().size() == 2) {
			return "binary";
		}
		return "base";
	}

	/**
	 * Adds the missing ReferenceSubsetting from the first two ends of a SuccessionAsUsage to its
	 * source and target features. No named constraint defines it: it follows the succession
	 * shorthand notation (SysML &sect;8.4.9.4, KerML &sect;7.17.4).
	 */
	private static Outcome successionEndReferenceSubsetting(ReferenceUsage reference, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!(reference.getOwningType() instanceof SuccessionAsUsage succession)) {
			return Outcome.NOT_APPLICABLE;
		}
		int index = succession.getOwnedEndFeature().indexOf(reference);
		if (index < 0 || index >= 2 || reference.getOwnedReferenceSubsetting() != null
				|| result.containsKind(SysMLPackage.Literals.REFERENCE_SUBSETTING)) {
			return Outcome.NOT_APPLICABLE;
		}
		Feature relatedFeature;
		if (index == 0) {
			relatedFeature = UsageUtil.getSourceFeature(succession);
		} else {
			relatedFeature = UsageUtil.getTargetFeature(succession);
		}
		result.add(SysMLPackage.Literals.REFERENCE_SUBSETTING, relatedFeature);
		return Outcome.APPLIED;
	}
}
