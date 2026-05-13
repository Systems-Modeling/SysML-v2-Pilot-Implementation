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

package org.omg.sysml.delegate.invocation;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class Feature_isFeaturedWithin_InvocationDelegate extends BasicInvocationDelegate {

	public Feature_isFeaturedWithin_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		Feature self = (Feature) target;
		Type type = (Type) arguments.get(0);
		
		List<Type> featuringTypes = self.getFeaturingType();
		if (featuringTypes.isEmpty()) {
			return true;
		} else if (type == null) {
			Type anythingType = SysMLLibraryUtil.getLibraryType(self, "Base::Anything");
			return featuringTypes.stream().allMatch(featuringType->featuringType == anythingType);
		} else {
			Feature firstChainingFeature = FeatureUtil.getFirstChainingFeatureOf(self);
			return featuringTypes.stream().allMatch(featuringType->TypeUtil.isCompatible(type, featuringType)) ||
				   self.isVariable() && TypeUtil.specializes(type, self.getOwningType()) ||
				   firstChainingFeature != null && firstChainingFeature.isVariable() &&
				   		TypeUtil.specializes(type, firstChainingFeature.getOwningType());
		}
	}

}
