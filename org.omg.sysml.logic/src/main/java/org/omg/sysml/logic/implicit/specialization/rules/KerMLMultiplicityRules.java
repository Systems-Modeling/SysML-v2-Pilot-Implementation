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

import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;

/**
 * Rules of the constraints of KerML &sect;8.3.4.11, Multiplicities.
 * <p>
 * Specification quotations are from KerML 1.1 Beta 2.
 */
final class KerMLMultiplicityRules {

	private KerMLMultiplicityRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				defaultKey("checkMultiplicitySpecialization", Multiplicity.class, KerMLMultiplicityRules::multiplicityKey));
	}

	/**
	 * Selects the classifier, feature or base default of a Multiplicity from its owner
	 * ({@code checkMultiplicitySpecialization}, KerML Table 11, &sect;8.4.4.1).
	 * <p>
	 * KerML §8.3.3.1.9, {@code checkMultiplicitySpecialization}: "A Multiplicity must directly or
	 * indirectly specialize the Feature Base::naturals from the Kernel Semantic Library."
	 */
	private static String multiplicityKey(Multiplicity multiplicity,
			ImplicitSpecializationEvaluationContext context) {
		if (multiplicity.getOwner() instanceof Classifier) {
			return "classifier";
		}
		if (multiplicity.getOwner() instanceof Feature) {
			return "feature";
		}
		return "base";
	}
}
