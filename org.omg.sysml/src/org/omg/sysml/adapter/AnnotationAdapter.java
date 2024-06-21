/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
 * Copyright (c) 2024 Budapest University of Technology and Economics
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
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
		
		// If there is no annotatingElement set, then set the AnnotatingElement to the owningRelatedElement,
		// if it is an AnnotatingElement, otherwise set it to the first ownedRelatedElement that is an
		// AnnotatingElement (if any).
		Object annotatingElement = obj.eGet(SysMLPackage.Literals.ANNOTATION__ANNOTATING_ELEMENT, false);
		if (annotatingElement == null) {
			Element owner = obj.getOwningRelatedElement();
			obj.setAnnotatingElement((AnnotatingElement)
					(owner instanceof AnnotatingElement? owner: 
						obj.getOwnedRelatedElement().stream().
							filter(AnnotatingElement.class::isInstance).
							findFirst().orElse(null)));
		}
	}
	
}
