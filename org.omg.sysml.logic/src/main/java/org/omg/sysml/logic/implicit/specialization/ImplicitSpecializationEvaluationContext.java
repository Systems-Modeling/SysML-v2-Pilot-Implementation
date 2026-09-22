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

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.api.ImplicitSpecialization;
import org.omg.sysml.logic.implicit.specialization.api.IImplicitSpecializationCache;

/**
 * State of one outermost request to the service. The context is installed as an adapter on the
 * model scope for the duration of that request, so that every nested request, including those made
 * by derived properties through TypeUtil, shares it.
 * <p>
 * It holds the results computed during the request, including those of uncached Types, and the
 * stack of results in progress. The top of that stack is the result of the computation that is
 * making the current request: a provisional dependency is recorded on it. The "Worked example:
 * nested computations and {@code resultsInProgress}" section of
 * {@code org.omg.sysml.logic/doc/implicit-specialization.md} traces these paths step by step.
 * <p>
 * Public only for the rules of {@code org.omg.sysml.logic.implicit.specialization.rules}: it is
 * internal to the computation of implicit specializations and is not part of the application API.
 */
public final class ImplicitSpecializationEvaluationContext extends AdapterImpl {

	private final ImplicitSpecializationService service;
	/** Results computed during this request, also for Types without a cache. */
	private final Map<Type, ImplicitSpecializationResult> computedResults = new IdentityHashMap<>();
	/** Types whose metadata metaclasses have already been resolved during this request. */
	private final Set<Type> typesWithResolvedMetadata = Collections.newSetFromMap(new IdentityHashMap<>());
	/**
	 * Results being built by the nested computations and reductions of this request, innermost
	 * first. The innermost one belongs to the computation that is making the current request.
	 */
	private final Deque<ImplicitSpecializationResult> resultsInProgress = new ArrayDeque<>();

	public ImplicitSpecializationEvaluationContext(ImplicitSpecializationService service) {
		this.service = service;
	}

	/**
	 * Starts building {@code result}, which becomes the innermost result in progress. Every call
	 * must be matched by {@link #endResult()} in a {@code finally} block.
	 */
	void beginResult(ImplicitSpecializationResult result) {
		resultsInProgress.push(result);
	}

	/** Ends the innermost result in progress, started by {@link #beginResult}. */
	void endResult() {
		resultsInProgress.pop();
	}

	/** Tests whether a computation or reduction is building a result in this context. */
	boolean hasResultInProgress() {
		return !resultsInProgress.isEmpty();
	}

	/**
	 * Returns the raw candidates of {@code type}, computing them if no result is available yet.
	 * <p>
	 * In every path that returns an existing result, the result of {@code type} is not on the stack
	 * of results in progress: the top of the stack is the computation that made this request. When
	 * the returned result is provisional, that requester depends on provisional data and is marked
	 * incomplete. A request made outside any computation marks nothing.
	 *
	 * @param type the type whose raw candidates are requested
	 * @return the raw candidates, possibly provisional
	 */
	public List<ImplicitSpecialization> evaluate(Type type) {
		if (type == null) {
			return List.of();
		}
		// Cycle: type is already being computed further down the stack. Its working candidates are
		// returned as they are, so the requester depends on an unfinished result.
		Computation active = Computation.find(type);
		if (active != null) {
			markRequestingResultIncomplete();
			return active.getResult().toSpecializations();
		}
		// Cached result, possibly from an earlier request: only a provisional one affects the requester.
		IImplicitSpecializationCache cache = service.findOrInstallCache(type);
		if (cache != null && cache.getCandidates() != null) {
			if (!cache.isComplete()) {
				markRequestingResultIncomplete();
			}
			return cache.getCandidates();
		}
		// Result already computed in this request, the only reuse for a Type without a cache.
		ImplicitSpecializationResult previous = computedResults.get(type);
		if (previous != null) {
			if (!previous.isComplete()) {
				markRequestingResultIncomplete();
			}
			return previous.toSpecializations();
		}
		// Resolve metadata metaclasses once per request, before installing the computation guard.
		// Linking a metaclass may need the inherited scope of the annotated type, hence its
		// specializations: with the guard installed, that nested query would see a false cycle.
		// The nested query may also have computed the result, so evaluate again.
		if (!(type instanceof org.omg.sysml.lang.sysml.MetadataFeature) && typesWithResolvedMetadata.add(type)) {
			for (var metadata : org.omg.sysml.util.ElementUtil.getAllMetadataFeaturesOf(type)) {
				metadata.getMetaclass();
			}
			return evaluate(type);
		}
		// Compute: the guard lets nested requests detect a cycle on type (first path above), and the
		// pushed result receives the provisional dependencies observed by the rules.
		ImplicitSpecializationResult result = new ImplicitSpecializationResult(type);
		Computation computation = new Computation(result);
		type.eAdapters().add(computation);
		beginResult(result);
		try {
			service.compute(type, result, this);
			List<ImplicitSpecialization> candidates = result.toSpecializations();
			computedResults.put(type, result);
			// A provisional result is cached too, with its completeness, to avoid recomputing it.
			if (cache != null) {
				cache.setCandidates(candidates, result.isComplete());
				cache.setRedefinitionsStable(result.areRedefinitionsStable());
			}
			return candidates;
		} finally {
			// Also on exception: a later request must really retry instead of seeing a cycle.
			endResult();
			type.eAdapters().remove(computation);
			// The result is popped, so the top of the stack is now its requester: an incomplete
			// result makes that requester incomplete too, and so on up the stack.
			if (!result.isComplete()) {
				markRequestingResultIncomplete();
			}
		}
	}

	/**
	 * Tests whether the raw candidates of {@code type} are known to be complete, without computing
	 * them. A Type being computed, or without any result yet, is not complete.
	 *
	 * @param type the type to test
	 * @return {@code true} when a complete result exists
	 */
	boolean isComplete(Type type) {
		if (Computation.find(type) != null) {
			return false;
		}
		IImplicitSpecializationCache cache = service.findOrInstallCache(type);
		if (cache != null && cache.getCandidates() != null) {
			return cache.isComplete();
		}
		ImplicitSpecializationResult result = computedResults.get(type);
		return result != null && result.isComplete();
	}

	/**
	 * Returns the typing candidates a default rule inspects. For the Type being computed, these are
	 * its working candidates: requesting its final result would be reported as a cycle and make the
	 * computation provisional without reason. Any other Type is evaluated normally.
	 *
	 * @param type the type whose candidates are inspected
	 * @return the working candidates of the Type being computed, or the result of {@link #evaluate}
	 */
	public List<ImplicitSpecialization> typingCandidates(Type type) {
		ImplicitSpecializationResult innermost = resultsInProgress.peek();
		if (innermost != null && innermost.getType() == type) {
			return innermost.toSpecializations();
		}
		return evaluate(type);
	}

	/**
	 * Returns the general types of the raw candidates of {@code type}; see {@link #evaluate}.
	 *
	 * @param type the specific type
	 * @return the general types, in candidate order
	 */
	List<Type> generalTypes(Type type) {
		return evaluate(type).stream().map(ImplicitSpecialization::generalType).toList();
	}

	/**
	 * Marks incomplete the innermost result in progress, which belongs to the computation that is
	 * making the current request; does nothing outside any computation.
	 */
	public void markRequestingResultIncomplete() {
		ImplicitSpecializationResult requesting = resultsInProgress.peek();
		if (requesting != null) {
			requesting.markIncomplete();
		}
	}

	/**
	 * Guard adapter installed on a Type while its raw candidates are computed, also on uncached and
	 * detached Types, and always removed in {@code finally}. Its presence identifies a cycle, and it
	 * holds the working result of the computation.
	 */
	static final class Computation extends AdapterImpl {
		private final ImplicitSpecializationResult result;

		Computation(ImplicitSpecializationResult result) {
			this.result = result;
		}

		ImplicitSpecializationResult getResult() {
			return result;
		}

		static Computation find(Type type) {
			for (var adapter : type.eAdapters()) {
				if (adapter instanceof Computation computation) {
					return computation;
				}
			}
			return null;
		}
	}
}
