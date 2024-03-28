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
