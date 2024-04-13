/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.DerivedEObjectEList;

public class DefaultDerivedPropertySettingDelegate extends BasicDerivedListSettingDelegate {
	
	private Class<?> type;
	private int featureID;
	private int sourceFeatureID;
	
	public DefaultDerivedPropertySettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
		this.type = eStructuralFeature.getEType().getInstanceClass();
		this.featureID = eStructuralFeature.getFeatureID();
		EAnnotation annotation = eStructuralFeature.getEAnnotation("subsets");
		EStructuralFeature sourceFeature = (EStructuralFeature)annotation.getReferences().get(0);
		this.sourceFeatureID = sourceFeature.getFeatureID();
	}

	@Override
	protected EList<?> basicGet(InternalEObject owner) {
		return new DerivedEObjectEList<>(type, owner, featureID, new int[] {sourceFeatureID});
	}

}
