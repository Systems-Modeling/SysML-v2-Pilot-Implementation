/*******************************************************************************
 * Copyright (c) 2014, 2017 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.omg.sysml.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.SavingPolicy;
import org.eclipse.sirius.business.api.session.resource.AirdResource;
import org.eclipse.xtext.resource.SaveOptions;

/**
 * A saving policy dedicated to Xtext aware sessions. It actually work around
 * the bug #432795 by always adding options to ignore the concrete syntax
 * validation of Xtext while saving.
 * 
 * This policy only add the option and delegate the actual work to another one
 * passed as a constructor argument.
 * 
 * @author cbrun
 * 
 */
public class ReadOnlyXtextSavingPolicy implements SavingPolicy {

	@Override
	public Collection<Resource> save(Iterable<Resource> resourcesToSave, Map<?, ?> options, IProgressMonitor monitor) {
		// DO NOTHING: read-only until XText serialization is fully supported
		Map<Object, Object> newOptions = new HashMap<>();
		if (options != null) {
			newOptions.putAll(options);
		}
		newOptions.putAll(SaveOptions.newBuilder().noValidation().getOptions().toOptionsMap());

		Collection<Resource> writeableResourcesToSave = new ArrayList<>();
		resourcesToSave.forEach(r -> {
			if (!(r instanceof AirdResource)) {
				writeableResourcesToSave.add(r);
			}
		});
		return StreamSupport.stream(resourcesToSave.spliterator(), false).collect(Collectors.toList());
	}

}
