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
import org.omg.sysml.lang.sysml.Disjoining;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

public class DisjoiningParserAdapter extends ElementParserAdapter {

	public DisjoiningParserAdapter(Disjoining element) {
		super(element);
	}

	@Override
	public Disjoining getTarget() {
		return (Disjoining)super.getTarget();
	}

	@Override
	public void postProcess() {
		Disjoining obj = getTarget();
		
		// If a Disjoining is parsed targeting a Feature chain, then the disjoiningType will be empty,
		// but the Disjoining will own the disjoiningType. So, in this case, the disjoiningType should
		// be set to the (last) ownedRelatedelement.
		Object disjoiningType = obj.eGet(SysMLPackage.Literals.DISJOINING__DISJOINING_TYPE, false);
		if (disjoiningType == null) {
			// Handle a disjoiningType that is a Feature chain.
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setDisjoiningType((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
		
		// If the typedDisjoined (source) is empty, set it to the owningRelatedElement, if it is a Type.
		// Otherwise, set it to the first ownedRelatedElement, to the first ownedRelatedElement,
		// which will be a Feature chain.
		Object typeDisjoined = obj.eGet(SysMLPackage.Literals.DISJOINING__TYPE_DISJOINED, false);
		if (typeDisjoined == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Type) {
				// Handle a Disjoining owned by the typeDisjoined.
				obj.setTypeDisjoined((Type)owner);
			} else {
				// Handle a typeDisjoined that is a Feature chain.
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setTypeDisjoined((Feature)ownedRelatedElements.get(0));
				}
			}
		}
	}
}
