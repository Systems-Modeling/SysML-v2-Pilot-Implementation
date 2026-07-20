/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Siemens AG
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.NonNotifyingEObjectEList;

public class Type_endFeature_SettingDelegate extends BasicDerivedListSettingDelegate  {

	public Type_endFeature_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected EList<? extends Feature> basicGet(InternalEObject owner) {
		return basicGet(owner, Feature.class);
	}

	protected <T> EList<T> basicGet(InternalEObject owner, Class<T> kind) {
		EList<T> endFeatures = new NonNotifyingEObjectEList<>(kind, owner, eStructuralFeature.getFeatureID());
		((Type)owner).getFeature().stream().
			filter(Feature::isEnd).
			filter(kind::isInstance).
			map(kind::cast).
			forEachOrdered(endFeatures::add);
		return endFeatures;
	}

}
