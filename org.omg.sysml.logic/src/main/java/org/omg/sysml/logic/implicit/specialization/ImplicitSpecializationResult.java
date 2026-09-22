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
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.api.ImplicitSpecialization;
import org.omg.sysml.util.VirtualContainer;

/**
 * Mutable result used only while one service request is evaluated.
 * <p>
 * Public only for the rules of {@code org.omg.sysml.logic.implicit.specialization.rules}: it is
 * internal to the computation of implicit specializations and is not part of the application API.
 */
public final class ImplicitSpecializationResult {

	private final Type type;
	/** Whether the REDEFINITION rule family has finished without provisional dependency. */
	private boolean redefinitionsStable;
	private final Map<EClass, List<Type>> generalTypes = new LinkedHashMap<>();
	private boolean fallbackSpecializationsAllowed = true;
	private boolean complete = true;

	/**
	 * Creates an empty computation result for one specific type.
	 *
	 * @param type the type whose implicit specializations are being computed
	 */
	public ImplicitSpecializationResult(Type type) {
		this.type = type;
	}

	/**
	 * Returns the type whose implicit specializations are computed.
	 *
	 * @return the specific type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Records that the {@code REDEFINITION} rule family has finished: its redefinitions are stable
	 * when no provisional dependency has been observed so far. The families are defined in the
	 * "Computation order" section of {@code org.omg.sysml.logic/doc/implicit-specialization.md}.
	 */
	public void publishRedefinitions() {
		redefinitionsStable = isComplete();
	}

	/**
	 * Returns whether the {@code REDEFINITION} rule family has finished without provisional
	 * dependency, so that its redefinitions can be read while later families are still running.
	 *
	 * @return {@code true} once {@link #publishRedefinitions()} recorded a complete state
	 */
	public boolean areRedefinitionsStable() {
		return redefinitionsStable;
	}

	/**
	 * Adds a specialization candidate. A general created outside the model, such as a feature chain,
	 * gets the specific type as its virtual container (see {@link VirtualContainer#attach}), since the
	 * specific type owns the implied Specialization.
	 *
	 * @param kind the concrete specialization metaclass
	 * @param general the inferred general type
	 */
	public void add(EClass kind, Type general) {
		if (general != null && general.eIsProxy()) {
			markIncomplete();
			return;
		}
		if (kind != null && general != null && general != type) {
			List<Type> generals = generalTypes.computeIfAbsent(kind, key -> new ArrayList<>());
			if (generals.stream().noneMatch(existing -> areEquivalentGenerals(existing, general))) {
				generals.add(general);
				VirtualContainer.attach(general, type);
			}
		}
	}

	/**
	 * Tests whether two generals are equivalent: the same object, or feature chains with the same
	 * ordered chaining features. Independently created chains can represent the same chain and
	 * must not be added twice.
	 *
	 * @param first the first candidate general
	 * @param second the second candidate general
	 * @return {@code true} for identical types or equal non-empty feature chains
	 */
	static boolean areEquivalentGenerals(Type first, Type second) {
		if (first == second) {
			return true;
		}
		if (first instanceof Feature firstFeature && second instanceof Feature secondFeature) {
			List<Feature> firstChain = firstFeature.getChainingFeature();
			List<Feature> secondChain = secondFeature.getChainingFeature();
			return !firstChain.isEmpty() && firstChain.equals(secondChain);
		}
		return false;
	}

	/**
	 * Removes all candidates of one specialization kind during reduction.
	 *
	 * @param kind the specialization metaclass to remove
	 */
	public void remove(EClass kind) {
		generalTypes.remove(kind);
	}

	/**
	 * Returns candidates of exactly one specialization kind.
	 *
	 * @param kind the specialization metaclass to select
	 * @return the candidates, or an empty list when this kind has none
	 */
	public List<Type> getOnly(EClass kind) {
		return generalTypes.getOrDefault(kind, List.of());
	}

	/**
	 * Returns populated specialization kinds in stable metamodel order.
	 *
	 * @return the populated specialization metaclasses
	 */
	public Collection<EClass> getKinds() {
		return generalTypes.keySet().stream()
				.sorted(Comparator.comparingInt(EClass::getClassifierID))
				.toList();
	}

	/**
	 * Tests whether at least one candidate exists for a specialization kind.
	 *
	 * @param kind the specialization metaclass to test
	 * @return {@code true} when the kind has candidates
	 */
	public boolean containsKind(EClass kind) {
		return generalTypes.containsKey(kind);
	}

	/**
	 * Suppresses semantic fallback rules while preserving implicit redefinitions.
	 *
	 * <p>A fallback specialization is the relationship implied to satisfy a semantic
	 * constraint when the explicit model does not already do so, such as a
	 * {@code Classifier} subclassifying {@code Base::Anything} or a {@code Feature}
	 * subsetting {@code Base::things}. See KerML 7.3.3.2, 7.3.4.2 and 8.4.2.</p>
	 */
	public void suppressFallbackSpecializations() {
		fallbackSpecializationsAllowed = false;
	}

	/**
	 * Returns whether metadata, default-generalization and additional fallback rules may run.
	 *
	 * @return {@code true} when semantic fallback specializations remain applicable
	 */
	public boolean areFallbackSpecializationsAllowed() {
		return fallbackSpecializationsAllowed;
	}

	/**
	 * Marks the result provisional: a rule depended on a result that is itself provisional or still
	 * being computed, or on semantic data that could not be resolved.
	 */
	public void markIncomplete() {
		complete = false;
	}

	/**
	 * Returns whether the result is complete, that is not provisional.
	 *
	 * @return {@code true} when no provisional dependency or unresolved data was observed
	 */
	public boolean isComplete() {
		return complete;
	}

	/**
	 * Creates the immutable public representation of the current candidates.
	 *
	 * @return candidates ordered by specialization metaclass and insertion order
	 */
	public List<ImplicitSpecialization> toSpecializations() {
		List<ImplicitSpecialization> result = new ArrayList<>();
		for (EClass kind : getKinds()) {
			for (Type general : getOnly(kind)) {
				result.add(new ImplicitSpecialization(kind, general));
			}
		}
		return List.copyOf(result);
	}
}
