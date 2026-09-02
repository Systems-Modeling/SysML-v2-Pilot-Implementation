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

package org.omg.kerml.xtext.adapter;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Differencing;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class DifferencingParserAdapter extends ElementParserAdapter {

	public DifferencingParserAdapter(Differencing element) {
		super(element);
	}

	@Override
	public Differencing getTarget() {
		return (Differencing)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		Differencing obj = getTarget();
		
		// If a Differencing is parsed targeting a Feature chain, then the differencingType will be empty,
		// but the Differencing will own the differencingType. So, in this case, the differencingType should
		// be set to the (last) ownedRelatedelement.
		Object differencingType = obj.eGet(SysMLPackage.Literals.DIFFERENCING__DIFFERENCING_TYPE, false);
		if (differencingType == null) {
			// Handle a differencingType that is a Feature chain.
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setDifferencingType((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
}
