/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024, 2025 Model Driven Solutions, Inc.
 * Copyright (c) 2024 Budapest University of Technology and Economics
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *  
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class AnnotationAdapter extends RelationshipAdapter {

	public AnnotationAdapter(Annotation element) {
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
