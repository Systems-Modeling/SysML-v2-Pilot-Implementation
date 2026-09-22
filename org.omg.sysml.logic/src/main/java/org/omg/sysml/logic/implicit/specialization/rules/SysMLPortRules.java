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
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.isStructureOwnedComposite;

import java.util.List;

import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;

/**
 * Rules of the constraints of SysML &sect;8.3.12, Ports.
 * <p>
 * Specification quotations are from SysML 2.1.
 */
final class SysMLPortRules {

	private SysMLPortRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				defaultKey("checkPortUsageSpecialization", PortUsage.class, SysMLPortRules::portKey),
				self("portUsageSubobjectSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, PortUsage.class, SysMLPortRules::subobjectSpecialization));
	}

	/**
	 * Selects {@code checkPortUsageOwnedPortSpecialization} for a port of a part,
	 * {@code checkPortUsageSubportSpecialization} for a composite port of a port and
	 * {@code checkPortUsageSpecialization} otherwise (SysML Table 32, &sect;8.4.8).
	 * <p>
	 * SysML §8.3.12.6, {@code checkPortUsageSpecialization}: "A PortUsage must directly or indirectly
	 * specialize the PortUsage Ports::ports from the Systems Model Library."
	 */
	private static String portKey(PortUsage port, ImplicitSpecializationEvaluationContext context) {
		Type owner = port.getOwningType();
		if (owner instanceof PartDefinition || owner instanceof PartUsage) {
			return "ownedPort";
		}
		if (port.isComposite() && (owner instanceof PortDefinition || owner instanceof PortUsage)) {
			return "subport";
		}
		return "base";
	}

	/** Adds "subobject" for a composite PortUsage owned by a structurally typed feature (SysML Table 32, &sect;8.4.8). */
	private static Outcome subobjectSpecialization(PortUsage port, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!isStructureOwnedComposite(port, context)) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addMappedSubsetting(result, port, "subobject");
		return Outcome.APPLIED;
	}
}
