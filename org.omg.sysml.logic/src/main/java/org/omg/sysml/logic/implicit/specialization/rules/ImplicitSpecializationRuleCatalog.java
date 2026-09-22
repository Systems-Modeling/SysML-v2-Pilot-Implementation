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

import java.util.ArrayList;
import java.util.List;

/**
 * The registered {@link ImplicitSpecializationRule}s. The registration order matters only
 * between rules of the same family, subject and subject metaclass (see
 * {@link ImplicitSpecializationRules}).
 */
final class ImplicitSpecializationRuleCatalog {

	private ImplicitSpecializationRuleCatalog() {
	}

	/**
	 * Returns every rule, in registration order.
	 *
	 * @return a new list of the rules
	 */
	static List<ImplicitSpecializationRule> rules() {
		List<ImplicitSpecializationRule> rules = new ArrayList<>();
		rules.addAll(KerMLTypeRules.rules());
		rules.addAll(KerMLFeatureRules.rules());
		rules.addAll(KerMLAssociationRules.rules());
		rules.addAll(KerMLConnectorRules.rules());
		rules.addAll(KerMLBehaviorRules.rules());
		rules.addAll(KerMLFunctionRules.rules());
		rules.addAll(KerMLExpressionRules.rules());
		rules.addAll(KerMLInteractionRules.rules());
		rules.addAll(KerMLMultiplicityRules.rules());
		rules.addAll(KerMLMetadataRules.rules());
		rules.addAll(SysMLUsageRules.rules());
		rules.addAll(SysMLOccurrenceRules.rules());
		rules.addAll(SysMLItemRules.rules());
		rules.addAll(SysMLPartRules.rules());
		rules.addAll(SysMLPortRules.rules());
		rules.addAll(SysMLConnectionRules.rules());
		rules.addAll(SysMLFlowRules.rules());
		rules.addAll(SysMLActionRules.rules());
		rules.addAll(SysMLStateRules.rules());
		rules.addAll(SysMLCalculationRules.rules());
		rules.addAll(SysMLRequirementRules.rules());
		rules.addAll(SysMLCaseRules.rules());
		rules.addAll(SysMLViewRules.rules());
		rules.addAll(SysMLMetadataRules.rules());
		return rules;
	}
}
