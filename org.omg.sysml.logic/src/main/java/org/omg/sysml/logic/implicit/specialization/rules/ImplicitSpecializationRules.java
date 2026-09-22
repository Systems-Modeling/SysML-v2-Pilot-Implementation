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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;

/**
 * Registers, orders and runs the {@link ImplicitSpecializationRule}s that compute the raw
 * implicit specializations of a Type.
 * <p>
 * The families run in the order of {@link ImplicitSpecializationRuleFamily}. Within a family,
 * the rules run in the order of {@link ImplicitSpecializationRulesByMetaclass}. The engine is
 * stateless once created: the state of one computation is held by an
 * {@link ImplicitSpecializationRuleRun}.
 */
public final class ImplicitSpecializationRules {

	/** The rules of every family, in family order. */
	private final List<ImplicitSpecializationFamilyRules> families;

	/**
	 * Creates an engine for the rules registered in {@link ImplicitSpecializationRuleCatalog}.
	 *
	 * @return a new engine
	 */
	public static ImplicitSpecializationRules createDefault() {
		return new ImplicitSpecializationRules(ImplicitSpecializationRuleCatalog.rules());
	}

	/**
	 * Creates an engine for the given rules.
	 *
	 * @param registered the rules, in registration order
	 * @throws IllegalArgumentException when two rules share an identifier, when a subject class is
	 *         not a metaclass of {@code SysMLPackage}, when an excluded rule is not a rule of the same
	 *         family, or when an excluded rule can run before the rule that excludes it
	 */
	ImplicitSpecializationRules(List<ImplicitSpecializationRule> registered) {
		Map<String, ImplicitSpecializationRule> rulesById = validate(registered);
		List<ImplicitSpecializationFamilyRules> indexed = new ArrayList<>();
		for (ImplicitSpecializationRuleFamily family : ImplicitSpecializationRuleFamily.values()) {
			indexed.add(new ImplicitSpecializationFamilyRules(family,
					new ImplicitSpecializationRulesByMetaclass(select(registered, family))));
		}
		families = List.copyOf(indexed);
		// Checked once, on the built order, so that running the rules needs no check.
		for (ImplicitSpecializationRule rule : registered) {
			for (String excludedId : rule.excludes()) {
				families.get(rule.family().ordinal()).checkRunsBefore(rule, rulesById.get(excludedId));
			}
		}
	}

	/**
	 * Runs the rules applicable to {@code type}, family after family, into its working result.
	 * <p>
	 * For each family, in order:
	 * <ol>
	 * <li>the family is skipped when it may not run: a fallback family for a conjugated Type or
	 * once a rule has suppressed the fallbacks, an alternative family once a rule of the family it
	 * replaces has applied (see {@link ImplicitSpecializationRuleRun#shouldRun});</li>
	 * <li>the family is also skipped when it has no rule for the metaclass of the Type: it then
	 * neither runs nor publishes the redefinitions;</li>
	 * <li>its rules run (see {@link ImplicitSpecializationFamilyRules#run}); a rule that applies
	 * excludes the rules it names for the rest of the computation, and its outcome may suppress
	 * the fallbacks or determine the Type;</li>
	 * <li>the redefinitions are published after a family that publishes them, and when the Type
	 * is determined, so that nested requests may read them;</li>
	 * <li>when the Type is determined, the later families do not run.</li>
	 * </ol>
	 *
	 * @param type the Type being computed
	 * @param result its working result
	 * @param context the request context
	 */
	public void apply(Type type, ImplicitSpecializationResult result, ImplicitSpecializationEvaluationContext context) {
		ImplicitSpecializationRuleRun run = new ImplicitSpecializationRuleRun(type, result, context);
		for (ImplicitSpecializationFamilyRules family : families) {
			if (!run.shouldRun(family.getFamily()) || !family.hasRulesFor(run)) {
				continue;
			}
			family.run(run);
			if (family.getFamily().publishesRedefinitions() || run.isDetermined()) {
				result.publishRedefinitions();
			}
			if (run.isDetermined()) {
				return;
			}
		}
	}

	/** Returns the rules of a family, in registration order. */
	private static List<ImplicitSpecializationRule> select(List<ImplicitSpecializationRule> registered,
			ImplicitSpecializationRuleFamily family) {
		List<ImplicitSpecializationRule> selected = new ArrayList<>();
		for (ImplicitSpecializationRule rule : registered) {
			if (rule.family() == family) {
				selected.add(rule);
			}
		}
		return selected;
	}

	/**
	 * Checks the identifiers, subject classes and exclusion families documented on the constructor.
	 *
	 * @return the rules by identifier
	 */
	private static Map<String, ImplicitSpecializationRule> validate(List<ImplicitSpecializationRule> registered) {
		Map<String, ImplicitSpecializationRule> byId = new HashMap<>();
		for (ImplicitSpecializationRule rule : registered) {
			if (byId.put(rule.id(), rule) != null) {
				throw new IllegalArgumentException("Duplicate rule identifier " + rule.id());
			}
			if (rule.subjectClass().getEPackage() != SysMLPackage.eINSTANCE) {
				throw new IllegalArgumentException("Rule " + rule.id() + " has no SysML subject class");
			}
		}
		for (ImplicitSpecializationRule rule : registered) {
			for (String excludedId : rule.excludes()) {
				ImplicitSpecializationRule excluded = byId.get(excludedId);
				if (excluded == null || excluded.family() != rule.family()) {
					throw new IllegalArgumentException(
							"Rule " + rule.id() + " excludes " + excludedId + ", which is not a rule of its family");
				}
			}
		}
		return byId;
	}
}
