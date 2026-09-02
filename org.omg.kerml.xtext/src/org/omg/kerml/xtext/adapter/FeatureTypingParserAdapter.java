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
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class FeatureTypingParserAdapter extends SpecializationParserAdapter {

	public FeatureTypingParserAdapter(FeatureTyping element) {
		super(element);
	}

	@Override
	public FeatureTyping getTarget() {
		return (FeatureTyping)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		FeatureTyping obj = getTarget();
		
		// If the type is empty, then set it to the first owned related element
		// (which will be a Feature chain).
		Object type = obj.eGet(SysMLPackage.Literals.FEATURE_TYPING__TYPE, false);
		if (type == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setType((Feature)ownedRelatedElements.get(0));
			}
		}
		
		// If the typedFeature is empty, then set it to the owningRelatedElement (if that is a Feature).
		Object typedFeature = obj.eGet(SysMLPackage.Literals.FEATURE_TYPING__TYPED_FEATURE, false);
		if (typedFeature == null) {
			Element owningRelatedElement = obj.getOwningRelatedElement();
			if (owningRelatedElement instanceof Feature) {
				obj.setTypedFeature((Feature) owningRelatedElement);
			}
		}
	}
}
