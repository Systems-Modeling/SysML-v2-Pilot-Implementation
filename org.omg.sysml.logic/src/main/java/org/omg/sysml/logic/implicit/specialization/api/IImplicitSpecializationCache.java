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
package org.omg.sysml.logic.implicit.specialization.api;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Type;

/**
 * Optional, model-thread-confined storage for one Type's raw and reduced
 * implicit-specialization results.
 */
public interface IImplicitSpecializationCache {

	/** Raw candidates, or {@code null} if not yet computed. */
	List<ImplicitSpecialization> getCandidates();

	/** Records freshly computed raw candidates and whether that computation was complete. */
	void setCandidates(List<ImplicitSpecialization> candidates, boolean complete);

	/** Whether the stored raw candidates were computed without any provisional or recursive gap. */
	boolean isComplete();

	/**
	 * The stored raw candidates of one specialization kind, or {@code null} if
	 * {@link #getCandidates()} is itself {@code null}. Implementations may derive and
	 * memoize this view from {@link #getCandidates()} instead of storing it separately,
	 * as long as it is invalidated together with the raw candidates.
	 */
	List<ImplicitSpecialization> getCandidatesOfKind(EClass kind);

	/** Reduced view, or {@code null} if not yet computed. */
	List<ImplicitSpecialization> getReduced();

	/** Records a freshly reduced view and whether that reduction was complete. */
	void setReduced(List<ImplicitSpecialization> reduced, boolean complete);

	/** Whether the stored reduced view was computed without any provisional or recursive gap. */
	boolean isReducedComplete();

	/**
	 * Whether the REDEFINITION-kind candidates specifically were computed without any
	 * provisional or recursive gap, independent of {@link #isComplete()}'s whole-result
	 * flag (other specialization kinds computed after redefinitions, such as defaults,
	 * may still be provisional while this is {@code true}).
	 */
	boolean areRedefinitionsStable();

	/** Records whether the REDEFINITION-kind candidates were stable. */
	void setRedefinitionsStable(boolean stable);

	/**
	 * Clears raw and reduced results, their completeness flags and the per-kind
	 * memoizations; keeps the cache attached.
	 */
	void invalidate();

	/**
	 * Finds the cache already attached to {@code type}, if any. Works for any
	 * implementation: an implementation only needs to also be an EMF {@code Adapter}
	 * attached to {@code type} to be found here.
	 */
	static IImplicitSpecializationCache find(Type type) {
		for (var adapter : type.eAdapters()) {
			if (adapter instanceof IImplicitSpecializationCache cache) {
				return cache;
			}
		}
		return null;
	}
}
