/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;

public class Feature_effectiveShortName_InvocationDelegate extends BasicInvocationDelegate {

	public Feature_effectiveShortName_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	private final Map<Feature, String> nameCache = new HashMap<>();
	
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		Feature self = (Feature) target;
		
		return computeEffectiveShortName(self, new HashSet<>());
	}
	
	private boolean isNameSet(Feature self) {
		return self.getDeclaredName() != null || self.getDeclaredShortName() != null;
	}
	
	public String computeEffectiveShortName(Feature self, Set<Feature> visited) {
		if (isNameSet(self)) {
			return self.getDeclaredShortName();
		}
		
		String effectiveShortName = nameCache.get(self);
		
		if (effectiveShortName != null) {
			return effectiveShortName;
		}

		visited.add(self);
		FeatureImpl namingFeature = (FeatureImpl) self.namingFeature();
		
		if (namingFeature != null && !visited.contains(namingFeature)) {
			effectiveShortName = computeEffectiveShortName(namingFeature, visited);
			nameCache.put(self, effectiveShortName);
		}
		
		return effectiveShortName;
	}

}
