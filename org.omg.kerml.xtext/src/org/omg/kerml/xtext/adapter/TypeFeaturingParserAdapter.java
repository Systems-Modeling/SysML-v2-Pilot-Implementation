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

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.TypeFeaturing;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class TypeFeaturingParserAdapter extends ElementParserAdapter {

	public TypeFeaturingParserAdapter(TypeFeaturing element) {
		super(element);
	}

	@Override
	public TypeFeaturing getTarget() {
		return (TypeFeaturing)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		TypeFeaturing obj = getTarget();
		
		// If the featureOfType is empty, then set it to the owningRelatedElement (if this is a Feature).
		Object featureOfType = obj.eGet(SysMLPackage.Literals.TYPE_FEATURING__FEATURE_OF_TYPE, false);
		if (featureOfType == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Feature) {
				obj.setFeatureOfType((Feature)owner);
			}
		}
	}
}
