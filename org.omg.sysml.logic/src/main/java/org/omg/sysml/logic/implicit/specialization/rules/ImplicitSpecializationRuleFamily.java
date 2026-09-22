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

/**
 * The families of {@link ImplicitSpecializationRule}s, in execution order. The order is part of
 * the semantics: a family may read what earlier families added to the working result, and it
 * avoids false cycles between the recursive evaluations of other Types.
 */
enum ImplicitSpecializationRuleFamily {

	/** Rules determined by the owning context of a Feature, such as connector ends. */
	CONTEXT(false, false, false, null),
	/**
	 * Mandatory rules that, when they apply, fully determine the priority specializations of a
	 * Feature: they suppress the fallbacks, and the {@link #PRIORITY} family does not run.
	 */
	PRIORITY_EXCLUSIVE(false, false, false, null),
	/** Mandatory typing and subsetting needed before the fallbacks are chosen. */
	PRIORITY(false, false, false, PRIORITY_EXCLUSIVE),
	/** Base types of the applicable semantic metadata. */
	METADATA(true, false, false, null),
	/** Redefinitions of a Feature, published for the requests that read them afterward. */
	REDEFINITION(false, false, true, null),
	/** Specializations of the result parameter of an Expression. */
	EXPRESSION_RESULT(false, false, false, null),
	/**
	 * The default generalization of a Type: the first applicable rule, from the most specific
	 * metaclass, chooses the key of the library default in
	 * {@link org.omg.sysml.util.ImplicitGeneralizationMap}.
	 */
	DEFAULT_KEY(true, true, false, null),
	/** Additional defaults, added after the default generalization. */
	DEFAULT_ADDITION(true, false, false, null);

	private final boolean fallback;
	private final boolean firstMatch;
	private final boolean publishesRedefinitions;
	private final ImplicitSpecializationRuleFamily alternativeTo;

	ImplicitSpecializationRuleFamily(boolean fallback, boolean firstMatch, boolean publishesRedefinitions,
			ImplicitSpecializationRuleFamily alternativeTo) {
		this.fallback = fallback;
		this.firstMatch = firstMatch;
		this.publishesRedefinitions = publishesRedefinitions;
		this.alternativeTo = alternativeTo;
	}

	/**
	 * Tests whether the family is a fallback: it does not run for a conjugated Type or once a
	 * rule has suppressed the fallbacks.
	 *
	 * @return {@code true} for a fallback family
	 */
	boolean isFallback() {
		return fallback;
	}

	/**
	 * Tests whether only the first applicable rule of the family runs.
	 *
	 * @return {@code true} when the first rule that applies ends the family
	 */
	boolean isFirstMatch() {
		return firstMatch;
	}

	/**
	 * Returns the earlier family of which this family is the alternative: this family does not run
	 * once a rule of that family has applied.
	 *
	 * @return the family this one is an alternative to, or {@code null}
	 */
	ImplicitSpecializationRuleFamily alternativeTo() {
		return alternativeTo;
	}

	/**
	 * Tests whether the redefinitions of the working result are published after this family,
	 * for the requests made later during the computation.
	 *
	 * @return {@code true} when the family publishes the redefinitions
	 */
	boolean publishesRedefinitions() {
		return publishesRedefinitions;
	}
}
