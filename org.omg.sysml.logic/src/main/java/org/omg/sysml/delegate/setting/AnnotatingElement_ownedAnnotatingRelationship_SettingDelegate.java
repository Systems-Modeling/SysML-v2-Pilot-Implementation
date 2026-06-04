/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024, 2025 Model Driven Solutions, Inc.
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
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.delegate.setting;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.NonNotifyingEObjectEList;

public class AnnotatingElement_ownedAnnotatingRelationship_SettingDelegate extends BasicDerivedListSettingDelegate {

	public AnnotatingElement_ownedAnnotatingRelationship_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected EList<Annotation> basicGet(InternalEObject owner) {
		EList<Annotation> annotations = new NonNotifyingEObjectEList<>(Element.class, owner, eStructuralFeature.getFeatureID());
		((Element)owner).getOwnedRelationship().stream().
			filter(Annotation.class::isInstance).
			map(Annotation.class::cast).
			filter(ann->ann.getAnnotatedElement() != owner).
			forEachOrdered(annotations::add);
		return annotations;
	}

}
