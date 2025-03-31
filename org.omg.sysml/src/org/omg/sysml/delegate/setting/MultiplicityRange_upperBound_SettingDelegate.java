/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022, 2024 Model Driven Solutions, Inc.
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

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.MultiplicityRange;
import org.omg.sysml.util.NamespaceUtil;

public class MultiplicityRange_upperBound_SettingDelegate extends BasicDerivedObjectSettingDelegate {

	public MultiplicityRange_upperBound_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}
	
	@Override
	public Expression basicGet(InternalEObject owner) {
		List<Expression> bounds = NamespaceUtil.getOwnedMembersOf((MultiplicityRange)owner).
				filter(Expression.class::isInstance).map(Expression.class::cast).
				collect(Collectors.toList());
		return bounds.isEmpty()? null:
			   bounds.size() == 1? bounds.get(0):
			   bounds.get(1);
	}

}
