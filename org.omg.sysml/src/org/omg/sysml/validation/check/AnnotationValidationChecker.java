/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.validation.check;

import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class AnnotationValidationChecker extends RelationshipValidationChecker {

	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateAnnotationAnnotatingElement(element, messageAccepter);
		validateAnnotationAnnotatedElementOwnership(element, messageAccepter);
	}
	
	public void validateAnnotationAnnotatingElement(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Annotation ann) {
			var ownedAnnotatingElement = ann.getOwnedAnnotatingElement();
			var owningAnnotatingElement = ann.getOwningAnnotatingElement();
			if (ownedAnnotatingElement == null && owningAnnotatingElement == null ||
				ownedAnnotatingElement != null && owningAnnotatingElement != null) {
				messageAccepter.error(ann, null, "validateAnnotationAnnotatingElement");
			}
		}
	}
	
	public void validateAnnotationAnnotatedElementOwnership(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Annotation ann) {
			var ownedAnnotatingElement = ann.getOwnedAnnotatingElement();
			var owningAnnotatedElement = ann.getOwningAnnotatedElement();
			if (owningAnnotatedElement != null && ownedAnnotatingElement == null) {
				messageAccepter.error(ann, null, "validateAnnotationAnnotatedElementOwnership_1");
			}
			if (owningAnnotatedElement == null && ownedAnnotatingElement != null) {
				messageAccepter.error(ann, null, "validateAnnotationAnnotatedElementOwnership_2");
			}
		}
	}

}
