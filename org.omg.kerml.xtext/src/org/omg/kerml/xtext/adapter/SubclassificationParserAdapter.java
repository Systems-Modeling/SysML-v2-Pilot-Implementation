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

import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Subclassification;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class SubclassificationParserAdapter extends SpecializationParserAdapter {

	public SubclassificationParserAdapter(Subclassification element) {
		super(element);
	}

	@Override
	public Subclassification getTarget() {
		return (Subclassification)super.getTarget();
	}

	@Override
	public void postProcess() {
		Subclassification obj = getTarget();
		
		// If the subclassifier is empty, then set it to the owningRelatedElement,
		// if this is a Classifier.
		Object subclassifier = obj.eGet(SysMLPackage.Literals.SUBCLASSIFICATION__SUBCLASSIFIER, false);
		if (subclassifier == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Classifier) {
				obj.setSubclassifier((Classifier) owner);
			}
		}
	}
}
