/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024, 2025 Model Driven Solutions, Inc.
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
