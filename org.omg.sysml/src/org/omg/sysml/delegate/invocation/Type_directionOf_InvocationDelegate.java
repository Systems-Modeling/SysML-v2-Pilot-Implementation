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
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Type;

public class Type_directionOf_InvocationDelegate extends BasicInvocationDelegate {

	public Type_directionOf_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		Type self = (Type) target;
		Feature feature = (Feature) arguments.get(0);
		
		return directionOf(feature, self, new HashSet<Type>());
	}
	
	protected static FeatureDirectionKind directionOf(Feature feature, Type type, Set<Type> visited) {
		visited.add(type);
		Conjugation conjugator = type.getOwnedConjugator();
		if (feature.getOwningType() == type) {
			return feature.getDirection();
		} else if (conjugator != null) {
			Type originalType = conjugator.getOriginalType();
			if (originalType == null || visited.contains(originalType)) {
				return null;
			} else {
				FeatureDirectionKind originalDirection = directionOf(feature, originalType, visited);
				return originalDirection == FeatureDirectionKind.IN? FeatureDirectionKind.OUT:
					   originalDirection == FeatureDirectionKind.OUT? FeatureDirectionKind.IN:
					   originalDirection;
			}
		} else {
			for (Specialization specialization: type.getOwnedSpecialization()) {
				Type general = specialization.getGeneral();
				if (general != null && !visited.contains(general)) {
					FeatureDirectionKind direction = directionOf(feature, general, visited);
					if (direction != null) {
						return direction;
					}
				}
			}
			return null;
		}
	}

}
