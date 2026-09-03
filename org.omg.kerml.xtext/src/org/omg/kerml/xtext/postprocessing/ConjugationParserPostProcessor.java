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
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

public class ConjugationParserPostProcessor extends ElementParserPostProcessor {

	public ConjugationParserPostProcessor(Conjugation element) {
		super(element);
	}

	@Override
	public Conjugation getTarget() {
		return (Conjugation)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		Conjugation obj = getTarget();
		
		// If the conjugatedType is not set, then set it to the owningRelatedElement, if this is a Type,
		// otherwise set it to the first ownedRelatedElement.
		Object conjugatedType = obj.eGet(SysMLPackage.Literals.CONJUGATION__CONJUGATED_TYPE, false);
		if (conjugatedType == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Type) {
				obj.setConjugatedType((Type)owner);
			} else {
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setConjugatedType((Type)ownedRelatedElements.get(0));
				}
			}
		}
		
		// If the originalType is not set, set it to the last ownedRelatedElement.
		Object originalType = obj.eGet(SysMLPackage.Literals.CONJUGATION__ORIGINAL_TYPE, false);
		if (originalType == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setOriginalType((Type)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
}
