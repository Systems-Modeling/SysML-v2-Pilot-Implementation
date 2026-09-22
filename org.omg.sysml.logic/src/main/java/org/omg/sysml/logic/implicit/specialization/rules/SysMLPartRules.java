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

import java.util.List;

import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.util.UsageUtil;

/**
 * Rules of the constraints of SysML &sect;8.3.11, Parts.
 * <p>
 * Specification quotations are from SysML 2.1.
 */
final class SysMLPartRules {

	private SysMLPartRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				defaultKey("checkPartUsageSpecialization", PartUsage.class, SysMLPartRules::partKey));
	}

	/**
	 * Selects the requirement actor, requirement stakeholder or case actor default of a PartUsage
	 * ({@code checkPartUsageActorSpecialization}, {@code checkPartUsageStakeholderSpecialization}, SysML
	 * &sect;8.4.17 and &sect;8.4.18); no key otherwise, so that ItemUsage selects it.
	 * <p>
	 * SysML §8.3.11.3, {@code checkPartUsageSpecialization}: "A PartUsage must directly or indirectly
	 * specialize the PartUsage Parts::parts from the Systems Model Library."
	 */
	private static String partKey(PartUsage part, ImplicitSpecializationEvaluationContext context) {
		Type owner = part.getOwningType();
		if (owner instanceof RequirementDefinition || owner instanceof RequirementUsage) {
			if (UsageUtil.isActorParameter(part)) {
				return "requirementActor";
			}
			if (UsageUtil.isStakeholderParameter(part)) {
				return "requirementStakeholder";
			}
		}
		if (UsageUtil.isActorParameter(part) && (owner instanceof CaseDefinition || owner instanceof CaseUsage)) {
			return "caseActor";
		}
		return null;
	}
}
