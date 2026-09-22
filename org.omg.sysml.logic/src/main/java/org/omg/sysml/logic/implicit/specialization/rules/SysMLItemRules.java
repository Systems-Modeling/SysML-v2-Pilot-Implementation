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
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.isSubitem;

import java.util.List;

import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;

/**
 * Rules of the constraints of SysML &sect;8.3.10, Items.
 * <p>
 * Specification quotations are from SysML 2.1.
 */
final class SysMLItemRules {

	private SysMLItemRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				defaultKey("checkItemUsageSpecialization", ItemUsage.class, SysMLItemRules::itemKey));
	}

	/**
	 * Selects {@code checkItemUsageSubitemSpecialization} for a composite item owned by an item and
	 * {@code checkItemUsageSpecialization} otherwise (SysML Table 32, &sect;8.4.7).
	 * <p>
	 * SysML §8.3.10.3, {@code checkItemUsageSpecialization}: "An ItemUsage must directly or indirectly
	 * specialize the Systems Model Library ItemUsage items."
	 */
	private static String itemKey(ItemUsage item, ImplicitSpecializationEvaluationContext context) {
		if (isSubitem(item)) {
			return "subitem";
		}
		return "base";
	}

	/**
	 * Adds "subpart" for a composite usage owned by an item. It is not a rule of ItemUsage because
	 * other ItemUsage subtypes, such as PartUsage, do not get this default.
	 *
	 * @param item the usage being evaluated
	 * @param result the result to update
	 * @return whether the default was added
	 */
	static Outcome subpartSpecialization(ItemUsage item, ImplicitSpecializationResult result) {
		if (!isSubitem(item)) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addMappedSubsetting(result, item, "subpart");
		return Outcome.APPLIED;
	}
}
