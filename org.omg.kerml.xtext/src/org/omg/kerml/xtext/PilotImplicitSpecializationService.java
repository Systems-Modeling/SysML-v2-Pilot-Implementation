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
package org.omg.kerml.xtext;

import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationService;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationServices;
import org.omg.sysml.logic.implicit.specialization.api.IImplicitSpecializationService;

/** Pilot-specific opt-in: automatically install caches on all types that reach the model. */
public class PilotImplicitSpecializationService extends ImplicitSpecializationService {

	public PilotImplicitSpecializationService() {
		super(type -> true);
	}

	/** Resolves the injectable runtime service once when a model scope first needs it. */
	public static void configureServiceFactory() {
		ImplicitSpecializationServices.setServiceFactory(resource -> {
			if (resource != null && resource.getURI() != null) {
				IResourceServiceProvider provider = IResourceServiceProvider.Registry.INSTANCE
						.getResourceServiceProvider(resource.getURI());
				if (provider != null) {
					IImplicitSpecializationService service = provider.get(IImplicitSpecializationService.class);
					if (service != null) {
						return service;
					}
				}
			}
			return new ImplicitSpecializationService();
		});
	}
}
