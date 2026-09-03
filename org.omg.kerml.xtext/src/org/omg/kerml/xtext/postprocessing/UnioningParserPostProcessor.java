/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 * Copyright (c) 2026 Model Driven Solutions, Inc.
 * 
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.omg.kerml.xtext.postprocessing;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Unioning;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class UnioningParserPostProcessor extends RelationshipParserPostProcessor {

	public UnioningParserPostProcessor(Unioning element) {
		super(element);
	}

	@Override
	public Unioning getTarget() {
		return (Unioning)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		Unioning obj = getTarget();
		
		// If a Unioning is parsed targeting a Feature chain, then the unioningType will be empty,
		// but the Unioning will own the unioningType. So, in this case, the unioningType should
		// be set to the (last) ownedRelatedelement.
		Object unioningType = obj.eGet(SysMLPackage.Literals.UNIONING__UNIONING_TYPE, false);
		if (unioningType == null) {
			// Handle a intersectingType that is a Feature chain.
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setUnioningType((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
}
