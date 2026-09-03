/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 * Copyright (c) 2026 Model Driven Solutions, Inc.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.omg.kerml.xtext.postprocessing;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.omg.sysml.lang.sysml.Dependency;
import org.omg.sysml.lang.sysml.Element;

public class DependencyParserPostProcessor extends ElementParserPostProcessor {

	public DependencyParserPostProcessor(Dependency element) {
		super(element);
	}

	@Override
	public Dependency getTarget() {
		return (Dependency)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		Dependency target = getTarget();
		
		// Add all ownedRelatedElements to supplier.
		EObjectResolvingEList<Element> suppliers = (EObjectResolvingEList<Element>)target.getSupplier();
		EList<Element> ownedRelatedElements = target.getOwnedRelatedElement();
		ownedRelatedElements.stream().forEachOrdered(suppliers::addUnique);
	}
}
