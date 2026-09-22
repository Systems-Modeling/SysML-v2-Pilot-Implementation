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
package org.omg.sysml.logic.implicit.specialization;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.api.ImplicitSpecialization;

/**
 * Removes implicit specializations covered by explicit or more-specific relationships.
 *
 * <p>The traversal excludes the original specific type and keeps a visited set so
 * malformed or temporarily cyclic live models terminate deterministically.</p>
 * <p>
 * Public only for the rules of {@code org.omg.sysml.logic.implicit.specialization.rules}: it is
 * internal to the computation of implicit specializations and is not part of the application API.
 */
public final class ImplicitSpecializationReducer {
	/** Creates the stateless reducer. */
	public ImplicitSpecializationReducer() {
	}

	/**
	 * Reduces a completed candidate set, resolving required explicit references.
	 *
	 * @param type the specific type
	 * @param result the candidates to reduce
	 * @param context the request-scoped evaluation context
	 */
	public void apply(Type type, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		List<Specialization> explicitSpecializations = type.getOwnedSpecialization().stream()
				.filter(specialization -> specialization.getSpecific() == type).toList();
		List<Type> allImplicit = result.toSpecializations().stream()
				.map(ImplicitSpecialization::generalType).toList();
		for (EClass kind : result.getKinds().toArray(EClass[]::new)) {
			List<Type> generals = new ArrayList<>(result.getOnly(kind));
			// A previous insertion can own a different instance of the same inferred chain.
			List<Type> ownedGenerals = explicitSpecializations.stream()
					.filter(kind::isInstance)
					.map(specialization -> resolvedGeneral(specialization, context))
					.filter(java.util.Objects::nonNull).toList();
			generals.removeIf(general -> ownedGenerals.stream()
					.anyMatch(owned -> isSameGeneral(general, owned)));
			if (kind != SysMLPackage.Literals.REDEFINITION) {
				List<Type> explicitGenerals = explicitSpecializations.stream()
						.map(specialization -> resolvedGeneral(specialization, context))
						.filter(general -> general != null && general != type).toList();
				generals.removeIf(general -> explicitGenerals.stream()
						.anyMatch(candidate -> specializesExcluding(type, candidate, general, context))
						|| allImplicit.stream().anyMatch(candidate -> candidate != general
								&& specializesExcluding(type, candidate, general, context)));
			}
			result.remove(kind);
			generals.forEach(general -> result.add(kind, general));
		}
	}

	/**
	 * Compares ordinary generals by identity and derived feature chains structurally.
	 *
	 * @param inferredGeneral the request-local inferred general
	 * @param ownedGeneral the already materialized general
	 * @return {@code true} when both represent the same general
	 */
	private static boolean isSameGeneral(Type inferredGeneral, Type ownedGeneral) {
		if (inferredGeneral == ownedGeneral) {
			return true;
		}
		// Some rules infer a detached feature chain. Materialization owns that chain,
		// while a later computation creates an equivalent detached instance.
		return inferredGeneral instanceof Feature inferredFeature
				&& ownedGeneral instanceof Feature ownedFeature
				&& inferredFeature.getOwningRelationship() == null
				&& hasSameFeatureChain(inferredFeature, ownedFeature);
	}

	/**
	 * Compares two feature chains element by element.
	 *
	 * @param inferredFeature the request-local chain feature
	 * @param ownedFeature the materialized chain feature
	 * @return {@code true} when both chains contain equivalent features in the same order
	 */
	private static boolean hasSameFeatureChain(Feature inferredFeature, Feature ownedFeature) {
		List<Feature> inferredChain = inferredFeature.getChainingFeature();
		List<Feature> ownedChain = ownedFeature.getChainingFeature();
		if (inferredChain.isEmpty() || inferredChain.size() != ownedChain.size()) {
			return false;
		}
		for (int i = 0; i < inferredChain.size(); i++) {
			if (!isSameChainingFeature(inferredChain.get(i), ownedChain.get(i))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Compares one pair of features occurring inside derived feature chains.
	 *
	 * @param inferredFeature the request-local chaining feature
	 * @param ownedFeature the materialized chaining feature
	 * @return {@code true} when typing, featuring and nested chaining are equivalent
	 */
	private static boolean isSameChainingFeature(Feature inferredFeature, Feature ownedFeature) {
		if (inferredFeature == ownedFeature) {
			return true;
		}
		if (!(inferredFeature.getOwningRelationship() instanceof FeatureChaining)
				|| !(ownedFeature.getOwningRelationship() instanceof FeatureChaining)) {
			return false;
		}
		return inferredFeature.eClass() == ownedFeature.eClass()
				&& inferredFeature.getOwnedTyping().stream().map(typing -> typing.getType()).toList()
						.equals(ownedFeature.getOwnedTyping().stream().map(typing -> typing.getType()).toList())
				&& inferredFeature.getFeaturingType().equals(ownedFeature.getFeaturingType())
				&& (inferredFeature.getChainingFeature().isEmpty()
						|| hasSameFeatureChain(inferredFeature, ownedFeature));
	}

	/**
	 * Tests conformance through explicit and request-local implicit generals.
	 *
	 * @param subtype the candidate subtype
	 * @param supertype the required supertype
	 * @param context the request-scoped evaluation context
	 * @return {@code true} when a finite specialization path exists
	 */
	public static boolean specializes(Type subtype, Type supertype,
			ImplicitSpecializationEvaluationContext context) {
		return specializes(subtype, supertype, context, new HashSet<>());
	}

	/**
	 * Returns direct explicit and request-local implicit generals.
	 *
	 * @param type the type whose direct generals are required
	 * @param context the request-scoped evaluation context
	 * @return generals in stable explicit-then-implicit order
	 */
	public static List<Type> directGeneralTypes(Type type,
			ImplicitSpecializationEvaluationContext context) {
		List<Type> generals = new ArrayList<>();
		type.getOwnedSpecialization().stream()
				.map(specialization -> resolvedGeneral(specialization, context))
				.filter(general -> general != null && general != type).forEach(generals::add);
		for (Type general : context.generalTypes(type)) {
			if (general != type && !generals.contains(general)) {
				generals.add(general);
			}
		}
		// Like TypeUtil.getGeneralTypesOf, a chain inherits from its last chaining feature.
		if (type instanceof Feature feature && !feature.getOwnedFeatureChaining().isEmpty()) {
			var chain = feature.getOwnedFeatureChaining();
			Feature last = chain.get(chain.size() - 1).getChainingFeature();
			if (last != null && last.eIsProxy()) {
				context.markRequestingResultIncomplete();
			} else if (last != null && last != type && !generals.contains(last)) {
				generals.add(last);
			}
		}
		return generals;
	}

	/**
	 * Attempts to resolve a direct general and checks whether it is available.
	 * A proxy that remains unresolved makes the request uncacheable.
	 *
	 * @param specialization the explicit specialization to inspect
	 * @param context the request-scoped evaluation context
	 * @return the resolved direct general, or {@code null} for an unresolved proxy
	 */
	private static Type resolvedGeneral(Specialization specialization,
			ImplicitSpecializationEvaluationContext context) {
		Type general = specialization.getGeneral();
		if (general != null && general.eIsProxy()) {
			context.markRequestingResultIncomplete();
			return null;
		}
		return general;
	}

	/**
	 * Tests conformance while excluding the specific type currently being reduced.
	 * The exclusion prevents a candidate from proving itself through the very
	 * implicit relationship that is under consideration.
	 *
	 * @param excluded the type that must not be traversed
	 * @param subtype the candidate subtype
	 * @param supertype the required supertype
	 * @param context the request-scoped evaluation context
	 * @return {@code true} when another finite specialization path exists
	 */
	private static boolean specializesExcluding(Type excluded, Type subtype, Type supertype,
			ImplicitSpecializationEvaluationContext context) {
		// The raw candidates are not pruned in place. In an explicit cycle, using
		// another member's default would therefore erase the default from every view.
		if (explicitlyReaches(subtype, excluded, context, new HashSet<>())) {
			return false;
		}
		Set<Type> visited = new HashSet<>();
		visited.add(excluded);
		return specializes(subtype, supertype, context, visited);
	}

	private static boolean explicitlyReaches(Type type, Type target,
			ImplicitSpecializationEvaluationContext context, Set<Type> visited) {
		if (type == null || !visited.add(type)) {
			return false;
		}
		if (type == target) {
			return true;
		}
		for (Specialization specialization : type.getOwnedSpecialization()) {
			if (explicitlyReaches(resolvedGeneral(specialization, context), target, context, visited)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Recursive conformance worker guarded by an identity-based visited set.
	 * The guard is necessary for incomplete editor states that temporarily contain
	 * explicit or implicit specialization cycles; without it, conformance reduction
	 * would recurse until the Java stack overflows.
	 *
	 * @param subtype the current type on the path
	 * @param supertype the required supertype
	 * @param context the request-scoped evaluation context
	 * @param visited types already traversed on this search
	 * @return {@code true} when a specialization path reaches {@code supertype}
	 */
	private static boolean specializes(Type subtype, Type supertype,
			ImplicitSpecializationEvaluationContext context, Set<Type> visited) {
		if (subtype == null || supertype == null || !visited.add(subtype)) {
			return false;
		}
		if (subtype == supertype) {
			return true;
		}
		for (Type general : directGeneralTypes(subtype, context)) {
			if (general == supertype || specializes(general, supertype, context, visited)) {
				return true;
			}
		}
		return false;
	}
}
