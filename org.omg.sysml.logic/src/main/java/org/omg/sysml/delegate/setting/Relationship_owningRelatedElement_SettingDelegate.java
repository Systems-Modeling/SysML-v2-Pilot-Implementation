/*******************************************************************************
 * SysML 2 Pilot Implementation
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * Relationship::owningRelatedElement is not actually derived, but this class reproduces the basic get and set
 * functionality for that property, as a base for implementing the delegates for other derived properties based
 * on owningRelatedElement.
 */
public abstract class Relationship_owningRelatedElement_SettingDelegate extends BasicDerivedObjectSettingDelegate {

	public Relationship_owningRelatedElement_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	protected <T> T basicGet(InternalEObject relationship, Class<T> kind) {
		if (relationship.eContainerFeatureID() != SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT) return null;
		EObject container = relationship.eContainer();
		return kind.isInstance(container)? kind.cast(container): null;
	}

	@Override
	public void set(InternalEObject relationship, Object newOwningRelatedElement) {
		// relationship.eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT, null);
	}
}
