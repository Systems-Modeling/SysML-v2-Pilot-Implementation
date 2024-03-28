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
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.impl.ClassifierImpl;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.ImplicitGeneralizationMap;
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
		// TODO: Fix OCL for isFeaturedWithin
		if (featuringTypes.isEmpty()) {
			return true;
		} else {
			Type effectiveType = type == null?
				SysMLLibraryUtil.getLibraryType(self, ImplicitGeneralizationMap.getDefaultSupertypeFor(ClassifierImpl.class)):
				type;
			return featuringTypes.stream().allMatch(featuringType->
				   		TypeUtil.conforms(effectiveType, featuringType));
		}
	}

}
