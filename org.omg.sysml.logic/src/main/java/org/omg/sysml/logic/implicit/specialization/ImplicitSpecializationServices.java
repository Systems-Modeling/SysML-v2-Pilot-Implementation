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
import java.util.function.Function;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.api.IImplicitSpecializationService;
import org.omg.sysml.util.ElementUtil;

/**
 * Connects static EMF utilities to an application-supplied service. Instances are
 * owned by a model scope (see {@link #scopeOf(Type)}), never by a global singleton.
 * All access is confined to the model's thread.
 */
public final class ImplicitSpecializationServices extends AdapterImpl {

	private static Function<Resource, IImplicitSpecializationService> serviceFactory =
			resource -> new ImplicitSpecializationService();
	private final IImplicitSpecializationService service;

	private ImplicitSpecializationServices(IImplicitSpecializationService service) {
		this.service = Objects.requireNonNull(service);
	}

	/**
	 * Injects the service used by all TypeUtil and adapter calls in this ResourceSet.
	 * Install before semantic queries. When replacing a service, explicitly invalidate
	 * existing specialization results if the implementations have different semantics.
	 */
	public static void install(ResourceSet resourceSet, IImplicitSpecializationService service) {
		Objects.requireNonNull(resourceSet);
		Objects.requireNonNull(service);
		resourceSet.eAdapters().removeIf(ImplicitSpecializationServices.class::isInstance);
		resourceSet.eAdapters().add(new ImplicitSpecializationServices(service));
	}

	/**
	 * Bootstrap hook for runtimes such as Xtext. The factory is consulted only when
	 * a model scope has no service. It must return a service, retain no model references
	 * globally, and be configured before model access. Explicit installation takes precedence.
	 */
	public static void setServiceFactory(Function<Resource, IImplicitSpecializationService> factory) {
		serviceFactory = Objects.requireNonNull(factory);
	}

	/** Returns the injected service, lazily creating an uncached default when no runtime supplies one. */
	public static IImplicitSpecializationService get(Type type) {
		if (type == null) {
			return new ImplicitSpecializationService();
		}
		Notifier scope = scopeOf(type);
		for (var adapter : scope.eAdapters()) {
			if (adapter instanceof ImplicitSpecializationServices services) {
				return services.service;
			}
		}
		IImplicitSpecializationService service = Objects.requireNonNull(serviceFactory.apply(resourceOf(type)));
		scope.eAdapters().add(new ImplicitSpecializationServices(service));
		return service;
	}

	/**
	 * Returns the model scope of {@code type}, which holds its service and the context of a request
	 * in progress: the ResourceSet of the closest element in a resource, reached through the
	 * effective containers of a detached Type (see {@link ElementUtil#getClosestElementInResource}),
	 * or that resource when it has no ResourceSet. A detached Type linked to no element in a
	 * resource uses its containment root.
	 */
	static Notifier scopeOf(Type type) {
		Resource resource = resourceOf(type);
		if (resource == null) {
			return EcoreUtil.getRootContainer(type);
		}
		if (resource.getResourceSet() != null) {
			return resource.getResourceSet();
		}
		return resource;
	}

	/**
	 * Tests whether {@code type} reaches the model: it belongs to a resource, or one of its
	 * effective containers does. Its results then depend only on the model, as for any attached
	 * Type, and may be cached. A detached Type linked to no element in a resource depends on the
	 * request that computes it and is never cached.
	 */
	static boolean reachesModel(Type type) {
		return resourceOf(type) != null;
	}

	/** Returns the resource of the closest element in a resource, or {@code null} when there is none. */
	private static Resource resourceOf(Type type) {
		EObject attached = ElementUtil.getClosestElementInResource(type);
		if (attached == null) {
			return null;
		}
		return attached.eResource();
	}
}
