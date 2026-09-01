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

import org.omg.sysml.lang.sysml.PortConjugation;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class PortConjugationParserAdapter extends ConjugationParserAdapter {

	public PortConjugationParserAdapter(PortConjugation element) {
		super(element);
	}

	@Override
	public PortConjugation getTarget() {
		return (PortConjugation)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		
		PortConjugation obj = getTarget();
		
		// If the originalPortDefinition is empty, then set it to the owner of the conjugatedPortDefinition
		// (if that is a PortDefinition).
		Object originalPortDefinition = obj.eGet(SysMLPackage.Literals.PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION, false);
		if (originalPortDefinition == null) {
			ConjugatedPortDefinition conjugatedPortDefinition = obj.getConjugatedPortDefinition();
			if (conjugatedPortDefinition != null) {
				Element conjugatedPortDefinitionOwner = conjugatedPortDefinition.getOwner();
				if (conjugatedPortDefinitionOwner instanceof PortDefinition) {
					obj.setOriginalPortDefinition((PortDefinition)conjugatedPortDefinitionOwner);
				}
			}
		}
	}
}
