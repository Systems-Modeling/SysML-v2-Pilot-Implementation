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

package org.omg.sysml.delegate.setting;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ConstraintDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;

public class Definition_directedUsage_SettingDelegate extends DefaultDerivedPropertySettingDelegate {

	public Definition_directedUsage_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);		
	}

	@Override
	protected EList<?> basicGet(InternalEObject owner) {
		return owner instanceof ActionDefinition?
				new DerivedEObjectEList<>(Usage.class, owner, eStructuralFeature.getFeatureID(), new int[] {SysMLPackage.ACTION_DEFINITION__PARAMETER}):
			   owner instanceof ConstraintDefinition?
				new DerivedEObjectEList<>(Usage.class, owner, eStructuralFeature.getFeatureID(), new int[] {SysMLPackage.CONSTRAINT_DEFINITION__PARAMETER}):
				super.basicGet(owner);
	}
}
