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
import org.omg.sysml.lang.sysml.FeatureInverting;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class FeatureInvertingParserAdapter extends ElementParserAdapter {

	public FeatureInvertingParserAdapter(FeatureInverting element) {
		super(element);
	}

	@Override
	public FeatureInverting getTarget() {
		return (FeatureInverting)super.getTarget();
	}

	@Override
	public void postProcess() {
		FeatureInverting obj = getTarget();
		
		// If the featureInverted is empty, then set it to the owningRelatedElement of the FeatureInverting,
		// if that is a Feature, otherwise set it to the first ownedRelatedElement (which will be a
		// Feature chain).
		Object featureInverted = obj.eGet(SysMLPackage.Literals.FEATURE_INVERTING__FEATURE_INVERTED, false);
		if (featureInverted == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Feature) {
				// Handle FeatureInverting owned by the featureInverted.
				obj.setFeatureInverted((Feature)owner);
			} else {
				// Handle featureInverted that is a Feature chain.
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setFeatureInverted((Feature)ownedRelatedElements.get(0));
				}
			}
		}
		
		// If the invertingFeature is empty, then set it to the last ownedRelatedElement
		// (which will be a Feature chain).
		Object invertingFeature = obj.eGet(SysMLPackage.Literals.FEATURE_INVERTING__INVERTING_FEATURE, false);
		if (invertingFeature == null) {
			// Handle invertingFeature that is a Feature chain.
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setInvertingFeature((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
}
