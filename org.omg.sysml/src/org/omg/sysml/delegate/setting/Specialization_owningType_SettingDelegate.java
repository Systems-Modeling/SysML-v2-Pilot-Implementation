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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Type;

public class Specialization_owningType_SettingDelegate extends BasicDerivedObjectSettingDelegate {

	public Specialization_owningType_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected Type basicGet(InternalEObject owner) {
		return basicGet(owner, Type.class);
	}
	
	protected <T> T basicGet(InternalEObject owner, Class<T> kind) {
		Element element = ((Specialization)owner).getOwningRelatedElement();
		return kind.isInstance(element)? kind.cast(element): null;
	}
	
	@Override
	protected void set(InternalEObject owner, Object newOwningType) {
		if (newOwningType != null) {
			((Specialization)owner).setOwningRelatedElement((Type)newOwningType);
		}
	}

}
