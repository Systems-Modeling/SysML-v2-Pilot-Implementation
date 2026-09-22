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
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.hasStructureType;

import java.util.List;

import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;

/**
 * Rules of the constraints of KerML &sect;8.3.4.5, Connectors.
 * <p>
 * Specification quotations are from KerML 1.1 Beta 2.
 */
final class KerMLConnectorRules {

	private KerMLConnectorRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				defaultKey("checkConnectorSpecialization", Connector.class, KerMLConnectorRules::connectorKey));
	}

	/**
	 * Selects {@code checkConnectorBinaryObjectSpecialization}, {@code checkConnectorObjectSpecialization},
	 * {@code checkConnectorBinarySpecialization} or {@code checkConnectorSpecialization} from the
	 * number of ends and whether the connector is typed by a Structure (KerML Table 10, &sect;8.4.4.6).
	 * <p>
	 * KerML §8.3.4.5.3, {@code checkConnectorSpecialization}: "A Connector must directly or indirectly
	 * specialize the base Connector Links::links from the Kernel Semantic Library."
	 */
	private static String connectorKey(Connector connector,
			ImplicitSpecializationEvaluationContext context) {
		int ends = connector.getOwnedEndFeature().size();
		if (hasStructureType(connector, context)) {
			if (ends == 2) {
				return "binaryObject";
			}
			return "object";
		}
		if (ends == 2) {
			return "binary";
		}
		return "base";
	}
}
