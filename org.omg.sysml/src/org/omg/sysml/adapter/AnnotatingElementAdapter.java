/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022, 2024 Model Driven Solutions, Inc.
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
 *******************************************************************************/
package org.omg.sysml.adapter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Relationship;

public class AnnotatingElementAdapter extends ElementAdapter {
	
	public AnnotatingElementAdapter(AnnotatingElement element) {
		super(element);
	}
	
	public AnnotatingElement getTarget() {
		return (AnnotatingElement)super.getTarget();
	}
	
	public static void transformAnnotatingElement(AnnotatingElement annotatingElement) {
		EList<Annotation> annotations = annotatingElement.getAnnotation();
		if (annotations.isEmpty()) {
			Relationship owningRelationship = annotatingElement.getOwningRelationship();
			if (owningRelationship instanceof Annotation) {
				annotations.add((Annotation)owningRelationship);
			} else {
				annotatingElement.getOwnedRelationship().stream().
					filter(Annotation.class::isInstance).
					forEachOrdered(a->((InternalEList<Annotation>)annotations).basicAdd((Annotation)a, null));
			}
		}
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		transformAnnotatingElement(getTarget());
	}

}
