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

import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;
import org.omg.sysml.util.UsageUtil;

/**
 * Rules of the constraints of SysML &sect;8.3.6, Definition and Usage.
 * <p>
 * Specification quotations are from SysML 2.1.
 */
final class SysMLUsageRules {

	private SysMLUsageRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				self("usageVariationSpecialization", ImplicitSpecializationRuleFamily.PRIORITY, Usage.class,
						SysMLUsageRules::variationSpecialization));
	}

	/**
	 * Types a variant Usage by its owning variation Definition, or subsets it by its owning
	 * variation Usage; the two constraints are mutually exclusive.
	 * <p>
	 * SysML §8.3.6.4, {@code checkUsageVariationDefinitionSpecialization}: "If a Usage has an
	 * owningVariationDefinition, then it must directly or indirectly specialize that Definition."
	 * <p>
	 * SysML §8.3.6.4, {@code checkUsageVariationUsageSpecialization}: "If a Usage has an
	 * owningVariationUsage, then it must directly or indirectly specialize that Usage."
	 */
	private static Outcome variationSpecialization(Usage usage, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!UsageUtil.isVariant(usage)) {
			return Outcome.NOT_APPLICABLE;
		}
		Definition definition = UsageUtil.getOwningVariationDefinitionFor(usage);
		if (definition != null) {
			result.add(SysMLPackage.Literals.FEATURE_TYPING, definition);
		} else {
			result.add(SysMLPackage.Literals.SUBSETTING, UsageUtil.getOwningVariationUsageFor(usage));
		}
		return Outcome.APPLIED;
	}
}
