/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.omg.kerml.xtext.adapter;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ReferenceSubsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class ReferenceSubsettingParserAdapter extends SubsettingParserAdapter {

	public ReferenceSubsettingParserAdapter(ReferenceSubsetting element) {
		super(element);
	}

	@Override
	public ReferenceSubsetting getTarget() {
		return (ReferenceSubsetting)super.getTarget();
	}

	@Override
	public void postProcess() {
		ReferenceSubsetting obj = getTarget();
		
		// If the referencedFeature is empty, then set it to the last ownedRelatedElement
		// (which will be a Feature chain).
		Object referencedFeature = obj.eGet(SysMLPackage.Literals.REFERENCE_SUBSETTING__REFERENCED_FEATURE, false);
		if (referencedFeature == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setReferencedFeature((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
}
