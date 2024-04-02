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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.TypeUtil;

public class Type_allSupertypes_InvocationDelegate extends BasicInvocationDelegate {

	public Type_allSupertypes_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		Type self = (Type) target;
		
		return getAllSuperTypes(self, new HashSet<>());
	}
	
	protected EList<Type> getAllSuperTypes(Type self, Set<Type> visited) {
		if (self.isConjugated()) {
			Type originalType = self.getOwnedConjugator().getOriginalType();
			return getAllSuperTypes(originalType, visited);
		} else {
			EList<Type> superTypes = new BasicEList<>();
			TypeUtil.getSupertypesOf(self).stream().
				forEachOrdered(superType->{
					if (superType != null && !visited.contains(superType)) {
						visited.add(superType);
						superTypes.add(superType);
						superTypes.addAll(getAllSuperTypes(superType, visited));
					}
				});
			return superTypes;
		}
	}

}
