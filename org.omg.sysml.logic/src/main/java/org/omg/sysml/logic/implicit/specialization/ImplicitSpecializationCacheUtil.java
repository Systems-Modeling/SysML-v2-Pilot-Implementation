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

import java.util.Objects;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.api.IImplicitSpecializationCache;

/**
 * Cache installation and invalidation, independent of any {@code IImplicitSpecializationService}.
 * A ResourceSet's installation policy and a Type's attached cache are plain EMF
 * adapters; none of these operations need a query-service instance.
 */
public final class ImplicitSpecializationCacheUtil {

	private ImplicitSpecializationCacheUtil() {
	}

	/**
	 * Attaches an empty cache to a Type that reaches the model (see
	 * {@link ImplicitSpecializationServices#reachesModel(Type)}), independently of the policy;
	 * idempotent.
	 */
	public static IImplicitSpecializationCache installCache(Type type) {
		Objects.requireNonNull(type);
		if (!ImplicitSpecializationServices.reachesModel(type)) {
			throw new IllegalArgumentException("A persistent cache requires a Type that reaches the model");
		}
		IImplicitSpecializationCache existing = IImplicitSpecializationCache.find(type);
		if (existing != null) {
			return existing;
		}
		DefaultImplicitSpecializationCache cache = new DefaultImplicitSpecializationCache();
		type.eAdapters().add(cache);
		return cache;
	}

	/** Installs caches on all currently contained types, without resolution or computation. */
	public static void installCaches(Resource resource) {
		Objects.requireNonNull(resource);
		for (var contents = EcoreUtil.getAllContents(resource, false); contents.hasNext();) {
			if (contents.next() instanceof Type type) {
				installCache(type);
			}
		}
	}

	/** Clears the type's specialization results, retaining its adapter and unrelated caches. */
	public static void invalidate(Type type) {
		if (type != null) {
			IImplicitSpecializationCache cache = IImplicitSpecializationCache.find(type);
			if (cache != null) {
				cache.invalidate();
			}
		}
	}

	/** Invalidates currently contained types without resolving proxies. */
	public static void invalidate(Resource resource) {
		Objects.requireNonNull(resource);
		for (var contents = EcoreUtil.getAllContents(resource, false); contents.hasNext();) {
			if (contents.next() instanceof Type type) {
				invalidate(type);
			}
		}
	}

}
