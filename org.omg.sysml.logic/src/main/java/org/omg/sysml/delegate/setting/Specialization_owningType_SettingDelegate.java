/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Siemens AG
 * Copyright (c) 2022 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *  
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
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
