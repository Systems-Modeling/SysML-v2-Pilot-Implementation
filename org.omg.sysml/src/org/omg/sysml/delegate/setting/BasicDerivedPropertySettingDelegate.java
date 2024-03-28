/*******************************************************************************
 * SysML 2 Pilot Implementation
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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate;

public abstract class BasicDerivedPropertySettingDelegate extends BasicSettingDelegate.Stateless {

	public BasicDerivedPropertySettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
		return basicGet(owner);
	}
	
	@Override 
	protected boolean isSet(InternalEObject owner) {
		return basicGet(owner) != null;
	}
	
	protected abstract Object basicGet(InternalEObject owner);
	
}
