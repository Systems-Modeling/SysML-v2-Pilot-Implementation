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
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.FramedConcernMembership;
import org.omg.sysml.lang.sysml.RequirementConstraintKind;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.util.NonNotifyingEObjectEList;
import org.omg.sysml.util.UsageUtil;

public class RequirementDefinition_framedConcern_SettingDelegate extends BasicDerivedListSettingDelegate {

	public RequirementDefinition_framedConcern_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected EList<?> basicGet(InternalEObject owner) {
		EList<ConcernUsage> concerns = new NonNotifyingEObjectEList<>(ConcernUsage.class, owner, eStructuralFeature.getFeatureID());
		UsageUtil.getRequirementConstraints((RequirementDefinition)owner, FramedConcernMembership.class, RequirementConstraintKind.REQUIREMENT).
			map(ConcernUsage.class::cast).forEachOrdered(concerns::add);
		return concerns;
	}

}
