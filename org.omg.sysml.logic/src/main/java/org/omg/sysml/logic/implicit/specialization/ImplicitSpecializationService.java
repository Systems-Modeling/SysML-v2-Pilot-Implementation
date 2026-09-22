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

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext.Computation;
import org.omg.sysml.logic.implicit.specialization.api.IImplicitSpecializationCache;
import org.omg.sysml.logic.implicit.specialization.api.IImplicitSpecializationService;
import org.omg.sysml.logic.implicit.specialization.api.ImplicitSpecialization;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRules;

/**
 * Lazy implicit-specialization queries. All operations are confined to the model's
 * thread. The instance owns its rules and default installation predicate; model
 * policies, caches and temporary scopes belong to EMF objects. Application
 * predicates must respect that model lifetime. Cache installation and invalidation
 * are independent of this service — see {@link ImplicitSpecializationCacheUtil}.
 */
public class ImplicitSpecializationService implements IImplicitSpecializationService {

	private final Predicate<Type> defaultCachePolicy;
	private final ImplicitSpecializationRules rules = ImplicitSpecializationRules.createDefault();
	private final ImplicitSpecializationReducer reducer = new ImplicitSpecializationReducer();

	/** Creates a service that never installs caches automatically. */
	public ImplicitSpecializationService() {
		this(type -> false);
	}

	/** Creates a service with an explicit default automatic-installation policy. */
	public ImplicitSpecializationService(Predicate<Type> defaultCachePolicy) {
		this.defaultCachePolicy = Objects.requireNonNull(defaultCachePolicy);
	}

	/** {@inheritDoc} */
	@Override
	public List<ImplicitSpecialization> getImplicitSpecializationCandidates(Type type) {
		// Cache hit, served without creating an evaluation context; a provisional result still
		// marks the requesting computation when this call is made by a rule.
		IImplicitSpecializationCache cache = findCache(type);
		if (cache != null && cache.getCandidates() != null) {
			propagateIncomplete(type, cache.isComplete());
			return cache.getCandidates();
		}
		if (type == null) {
			return List.of();
		}
		return inContext(type, context -> context.evaluate(type));
	}

	/** {@inheritDoc} */
	@Override
	public List<ImplicitSpecialization> getImplicitSpecializations(Type type) {
		IImplicitSpecializationCache existing = findCache(type);
		if (existing != null && existing.getReduced() != null) {
			propagateIncomplete(type, existing.isReducedComplete());
			return existing.getReduced();
		}
		if (type == null) {
			return List.of();
		}
		return inContext(type, context -> {
			// The reduction starts from the raw candidates, which may have to be computed.
			List<ImplicitSpecialization> candidates = context.evaluate(type);
			// Computing them may have reduced this Type through a nested request: reuse that view.
			IImplicitSpecializationCache cache = findOrInstallCache(type);
			if (cache != null && cache.getReduced() != null) {
				if (!cache.isReducedComplete()) {
					context.markRequestingResultIncomplete();
				}
				return cache.getReduced();
			}
			// Reduce a working copy, provisional from the start when the raw candidates are.
			ImplicitSpecializationResult reduced = new ImplicitSpecializationResult(type);
			candidates.forEach(candidate -> reduced.add(candidate.specializationKind(), candidate.generalType()));
			if (!context.isComplete(type)) {
				reduced.markIncomplete();
			}
			// Pushed so that the provisional dependencies observed by the reducer mark the reduction.
			context.beginResult(reduced);
			try {
				reducer.apply(type, reduced, context);
				List<ImplicitSpecialization> snapshot = reduced.toSpecializations();
				// Not cached while type is being computed: the reduction then read working candidates.
				if (cache != null && Computation.find(type) == null) {
					cache.setReduced(snapshot, reduced.isComplete());
				}
				return snapshot;
			} finally {
				context.endResult();
				// An incomplete reduction makes the computation that requested it incomplete too.
				if (!reduced.isComplete()) {
					context.markRequestingResultIncomplete();
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * A cache hit is served from the cache's per-kind view.
	 */
	@Override
	public List<ImplicitSpecialization> getCandidatesOfKind(Type type, EClass kind) {
		if (type == null || kind == null) {
			return List.of();
		}
		Computation active = null;
		IImplicitSpecializationCache cache = null;
		for (var adapter : type.eAdapters()) {
			if (adapter instanceof Computation computation) {
				active = computation;
			} else if (adapter instanceof IImplicitSpecializationCache found) {
				cache = found;
			}
		}
		// Redefinitions of a Type being computed, once its REDEFINITION rule family is stable: reading them
		// avoids a cycle, for instance when an effective name needs them during the computation.
		if (active != null
				&& kind == SysMLPackage.Literals.REDEFINITION && active.getResult().areRedefinitionsStable()) {
			return active.getResult().toSpecializations().stream().
					filter(candidate -> candidate.specializationKind() == kind).toList();
		}
		// Cache hit, served from the per-kind view of the cache.
		if (cache != null && cache.getCandidates() != null) {
			propagateIncomplete(type, cache.isComplete());
			List<ImplicitSpecialization> ofKind = cache.getCandidatesOfKind(kind);
			return ofKind != null ? ofKind : List.of();
		}
		// Otherwise the full raw query, which also handles a cycle on a Type being computed.
		return getImplicitSpecializationCandidates(type).stream().
				filter(candidate -> candidate.specializationKind() == kind).toList();
	}

	/** {@inheritDoc} */
	@Override
	public boolean isEvaluationInProgress(Type type) {
		if (type == null) {
			return false;
		}
		ImplicitSpecializationEvaluationContext context = findContext(type);
		return context != null && context.hasResultInProgress();
	}

	/**
	 * Runs the rules applicable to {@code type} into {@code result}; see
	 * {@link ImplicitSpecializationRules#apply}.
	 */
	void compute(Type type, ImplicitSpecializationResult result, ImplicitSpecializationEvaluationContext context) {
		rules.apply(type, result, context);
	}

	/** Cache hits bypass the installation policy, including after invalidation. */
	private IImplicitSpecializationCache findCache(Type type) {
		if (type == null) {
			return null;
		}
		return IImplicitSpecializationCache.find(type);
	}

	/**
	 * Returns the cache of {@code type}, installing one when the default policy accepts the type;
	 * returns {@code null} for a refused Type or one that does not reach the model (see
	 * {@link ImplicitSpecializationServices#reachesModel(Type)}).
	 */
	IImplicitSpecializationCache findOrInstallCache(Type type) {
		IImplicitSpecializationCache cache = IImplicitSpecializationCache.find(type);
		if (cache != null) {
			return cache;
		}
		if (!ImplicitSpecializationServices.reachesModel(type) || !defaultCachePolicy.test(type)) {
			return null;
		}
		DefaultImplicitSpecializationCache created = new DefaultImplicitSpecializationCache();
		type.eAdapters().add(created);
		return created;
	}

	/**
	 * Marks the requesting computation incomplete when a provisional cached result is served
	 * outside {@link ImplicitSpecializationEvaluationContext#evaluate}; does nothing outside any
	 * request.
	 */
	private void propagateIncomplete(Type type, boolean complete) {
		if (!complete) {
			ImplicitSpecializationEvaluationContext context = findContext(type);
			if (context != null) {
				context.markRequestingResultIncomplete();
			}
		}
	}

	/**
	 * Finds the context of the request in progress for {@code type}, installed on its model scope
	 * (see {@link ImplicitSpecializationServices#scopeOf(Type)}), which a detached Type reaches
	 * through its effective containers.
	 */
	private ImplicitSpecializationEvaluationContext findContext(Type type) {
		for (var adapter : ImplicitSpecializationServices.scopeOf(type).eAdapters()) {
			if (adapter instanceof ImplicitSpecializationEvaluationContext context) {
				return context;
			}
		}
		return null;
	}

	/**
	 * Runs {@code action} in the context of the request in progress, or in a new context that
	 * exists only for this outermost request.
	 */
	private <T> T inContext(Type type, Function<ImplicitSpecializationEvaluationContext, T> action) {
		// Nested request: share the stack of results in progress and the request-local results.
		ImplicitSpecializationEvaluationContext existing = findContext(type);
		if (existing != null) {
			return action.apply(existing);
		}
		// Outermost request: its request-local results are dropped when it ends.
		Notifier scope = ImplicitSpecializationServices.scopeOf(type);
		ImplicitSpecializationEvaluationContext context = new ImplicitSpecializationEvaluationContext(this);
		scope.eAdapters().add(context);
		try {
			return action.apply(context);
		} finally {
			scope.eAdapters().remove(context);
		}
	}
}
