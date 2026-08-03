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

package org.omg.kerml.xtext.linking;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class SubsettingParserAdapter extends SpecializationParserAdapter {

	public SubsettingParserAdapter(Subsetting element) {
		super(element);
	}

	@Override
	public Subsetting getTarget() {
		return (Subsetting)super.getTarget();
	}

	@Override
	public void postProcess() {
		Subsetting obj = getTarget();
		
		// If the subsettedFeature is empty, then set it to the last ownedRelatedElement
		// (which will be a Feature chain).
		Object subsettedFeature = obj.eGet(SysMLPackage.Literals.SUBSETTING__SUBSETTED_FEATURE, false);
		if (subsettedFeature == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setSubsettedFeature((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
		
		// If the subsettingFeature is empty, then set it to the owningRelatedFeature, if this is a Feature.
		// Otherwise set it to the first ownedRelatedElement (which will be a Feature chain).
		Object subsettingFeature = obj.eGet(SysMLPackage.Literals.SUBSETTING__SUBSETTING_FEATURE, false);
		if (subsettingFeature == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Feature) {
				obj.setSubsettingFeature((Feature) owner);
			} else {
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setSubsettingFeature((Feature)ownedRelatedElements.get(0));
				}
			}
		}
	}
}
