/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022, 2023 Model Driven Solutions, Inc.
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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.Type;

public class Type_multiplicity_SettingDelegate extends BasicDerivedObjectSettingDelegate {

	public Type_multiplicity_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected Multiplicity basicGet(InternalEObject owner) {
		return getMultiplicityOf((Type)owner, new HashSet<Type>());	
	}
	
	protected static Multiplicity getMultiplicityOf(Type type, Set<Type> visited) {
		return (Multiplicity)type.getOwnedMembership().stream().
				map(Membership::getMemberElement).
				filter(Multiplicity.class::isInstance).
				findFirst().orElse(null);
	}

}
