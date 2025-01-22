/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2025 Model Driven Solutions, Inc.
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

package org.omg.sysml.delegate.invocation;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;

public class Feature_isFeaturingType_InvocationDelegate extends BasicInvocationDelegate {

	public Feature_isFeaturingType_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		Feature self = (Feature) target;
		Type type = (Type) arguments.get(0);
		Type owningType = self.getOwningType();
		if (!self.isVariable()) {
			return type == owningType;
		} else if (type instanceof Feature) {
			Feature feature = (Feature)type;
			List<Feature> redefinedFeatures = FeatureUtil.getRedefinedFeaturesWithComputedOf(self, null).stream().
					filter(Feature::isVariable).
					flatMap(FeatureUtil::getFeaturingFeaturesOf).
					toList();
			return feature.getFeaturingType().contains(owningType) &&
				   redefinedFeatures.isEmpty()? feature.redefinesFromLibrary("Occurrences::Occurrence::snapshots"):
				   redefinedFeatures.stream().allMatch(r->feature.redefines(r));
		} else {
			return false;
		}
	}

}
