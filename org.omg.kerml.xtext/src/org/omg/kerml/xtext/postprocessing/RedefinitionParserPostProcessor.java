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
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class RedefinitionParserPostProcessor extends SubsettingParserPostProcessor {

	public RedefinitionParserPostProcessor(Redefinition element) {
		super(element);
	}

	@Override
	public Redefinition getTarget() {
		return (Redefinition)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		Redefinition obj = getTarget();
		
		// If the redefiningFeature is empty, then set it to the owningRelatedElement, if that is a Feature.
		// Otherwise, set it to the first ownedRelatedElement (which will be a Feature chain).
		Object redefiningFeature = obj.eGet(SysMLPackage.Literals.REDEFINITION__REDEFINING_FEATURE, false);
		if (redefiningFeature == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Feature) {
				obj.setRedefiningFeature((Feature) owner);
			} else {
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setRedefiningFeature((Feature)ownedRelatedElements.get(0));
				}
			}
		}
		
		Object redefinedFeature = obj.eGet(SysMLPackage.Literals.REDEFINITION__REDEFINED_FEATURE, false);
		if (redefinedFeature == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setRedefinedFeature((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
}
