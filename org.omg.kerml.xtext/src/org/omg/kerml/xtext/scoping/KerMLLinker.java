/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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
 * Contributors:
 *  Zoltan Ujhelyi, MDS
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.scoping;

import java.util.Objects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Documentation;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.ElementUtil;

public class KerMLLinker extends LazyLinker {

	@Override
	protected void clearReferences(EObject obj) {
		super.clearReferences(obj);
		if (obj instanceof Element) {
			ElementUtil.clean((Element)obj);
		}
	}
	
	@Override
	protected void clearReference(EObject obj, EReference ref) {
		if (
			// The Relationship#source and #target features are overridden
			// in each subtype to provide specific derived implementations that
			// are regenerated each time they are accessed so there is no need to
			// delete them; and as of May 2020, generic references are not supported
			// in concrete syntax, making it a safe to not clear them during linking.
			Objects.equals(ref, SysMLPackage.Literals.RELATIONSHIP__SOURCE) || 
			Objects.equals(ref, SysMLPackage.Literals.RELATIONSHIP__TARGET) ||
			
			// The Relationship#relatedElement feature is a derived union in the
			// abstract syntax model, but it is implemented as a manual derivation,
			// which is overridden as necessary in subtypes, so there is no need to
			// delete it.
			Objects.equals(ref, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT) ||
			
			// The Annotation#annotatingElement feature, which is not composite, is
			// redefined by Documentation#documentingComment, which is composite. 
			// Clearing annotedElement spuriously clears the documentedElement, which
			// then does not get a proxy because it is composite (containment).
			// Annotation#annotatingElement has the opposite feature 
			// AnnotatingElement#Annotation, which also should not be cleared.
			obj instanceof Documentation && Objects.equals(ref, SysMLPackage.Literals.ANNOTATION__ANNOTATING_ELEMENT) ||
			obj instanceof Comment && obj.eContainer() instanceof Documentation && 
				Objects.equals(ref, SysMLPackage.Literals.ANNOTATING_ELEMENT__ANNOTATION)
		 ) {
			return;
		}
		super.clearReference(obj, ref);
	}
}
