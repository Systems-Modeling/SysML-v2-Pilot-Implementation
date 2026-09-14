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
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

public class SpecializationParserPostProcessor extends RelationshipParserPostProcessor {

	public SpecializationParserPostProcessor(Specialization element) {
		super(element);
	}

	@Override
	public Specialization getTarget() {
		return (Specialization)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		Specialization obj = getTarget();
		
		// If general is empty, then set it to the last ownedRelatedElement (which will be a Feature chain).
		Object general = obj.eGet(SysMLPackage.Literals.SPECIALIZATION__GENERAL, false);
		if (general == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setGeneral((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
		
		// If specific is empty, then set it to the owningRelatedElement, if that is a Type.
		// Otherwise set it to the first ownedRelatedElement (which will be a FeatureChain).
		Object specific = obj.eGet(SysMLPackage.Literals.SPECIALIZATION__SPECIFIC, false);
		if (specific == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Type) {
				obj.setSpecific((Type)owner);
			} else {
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setSpecific((Feature)ownedRelatedElements.get(0));
				}
			}
		}
	}
}
