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

import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class AnnotationParserAdapter extends ElementParserAdapter {

	public AnnotationParserAdapter(Annotation element) {
		super(element);
	}

	@Override
	public Annotation getTarget() {
		return (Annotation)super.getTarget();
	}

	@Override
	public void postProcess() {
		Annotation obj = getTarget();
		
		// If the Annotation is not owned by an AnnotatingElement, then the annotatedElement is the owningRelatedElement.
		Object annotatedElement = obj.eGet(SysMLPackage.Literals.ANNOTATION__ANNOTATED_ELEMENT, false);
		if (annotatedElement == null) {
			Element owningRelatedElement = obj.getOwningRelatedElement();
			if (!(owningRelatedElement instanceof AnnotatingElement)) {
				obj.setAnnotatedElement(owningRelatedElement);
			}
		}
	}
}
