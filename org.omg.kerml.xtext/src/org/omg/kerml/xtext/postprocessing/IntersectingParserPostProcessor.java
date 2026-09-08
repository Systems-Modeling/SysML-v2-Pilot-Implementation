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
import org.omg.sysml.lang.sysml.Intersecting;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class IntersectingParserPostProcessor extends RelationshipParserPostProcessor {

	public IntersectingParserPostProcessor(Intersecting element) {
		super(element);
	}

	@Override
	public Intersecting getTarget() {
		return (Intersecting)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		Intersecting obj = getTarget();
		
		// If a Intersecting is parsed targeting a Feature chain, then the intersectingType will be empty,
		// but the Intersecting will own the intersectingType. So, in this case, the intersectingType should
		// be set to the (last) ownedRelatedelement.
		Object intersectingType = obj.eGet(SysMLPackage.Literals.INTERSECTING__INTERSECTING_TYPE, false);
		if (intersectingType == null) {
			// Handle a intersectingType that is a Feature chain.
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setIntersectingType((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
}
