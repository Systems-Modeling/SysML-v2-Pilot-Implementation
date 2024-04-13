/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Siemens AG
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.TypeFeaturing;
import org.omg.sysml.util.NonNotifyingEObjectEList;

public class Feature_ownedTypeFeaturing_SettingDelegate extends BasicDerivedListSettingDelegate {

	public Feature_ownedTypeFeaturing_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected EList<?> basicGet(InternalEObject owner) {
		EList<TypeFeaturing> featurings = new NonNotifyingEObjectEList<>(TypeFeaturing.class, owner, eStructuralFeature.getFeatureID());
		((Feature)owner).getOwnedRelationship().stream().
			filter(rel->(rel instanceof TypeFeaturing) && ((TypeFeaturing)rel).getFeatureOfType() == owner).
			map(TypeFeaturing.class::cast).
			forEachOrdered(featurings::add);
		return featurings;
	}

}
