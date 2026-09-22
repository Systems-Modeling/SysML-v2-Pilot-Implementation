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

import org.omg.sysml.lang.sysml.MetadataUsage;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;

/**
 * Rules of the constraints of SysML &sect;8.3.27, Metadata.
 * <p>
 * Specification quotations are from SysML 2.1.
 */
final class SysMLMetadataRules {

	private SysMLMetadataRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				defaultKey("checkMetadataUsageSpecialization", MetadataUsage.class, SysMLMetadataRules::metadataUsageKey));
	}

	/**
	 * SysML §8.3.27.3, {@code checkMetadataUsageSpecialization}: "A MetadataUsage must directly or
	 * indirectly specialize the base MetadataUsage Metadata::metadataItems from the Systems Model
	 * Library."
	 */
	private static String metadataUsageKey(MetadataUsage metadata,
			ImplicitSpecializationEvaluationContext context) {
		return "base";
	}
}
