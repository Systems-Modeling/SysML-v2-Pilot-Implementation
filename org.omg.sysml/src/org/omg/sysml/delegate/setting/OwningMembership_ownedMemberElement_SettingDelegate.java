/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.OwningMembership;

public class OwningMembership_ownedMemberElement_SettingDelegate extends BasicDerivedObjectSettingDelegate {

	public OwningMembership_ownedMemberElement_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected Element basicGet(InternalEObject owner) {
		return ((OwningMembership)owner).getOwnedRelatedElement().stream().findFirst().orElse(null);
	}
	
	protected <T> T basicGet(InternalEObject owner, Class<T> kind) {
		return ((OwningMembership)owner).getOwnedRelatedElement().stream().
				findFirst().
				filter(kind::isInstance).
				map(kind::cast).
				orElse(null);
	}
	
	@Override
    protected void set(InternalEObject owner, Object newOwnedMemberElement) {
		if (newOwnedMemberElement != null) { 
			EList<Element> ownedRelatedElements = ((OwningMembership)owner).getOwnedRelatedElement();
			ownedRelatedElements.remove(((OwningMembership)owner).getOwnedMemberElement());
			ownedRelatedElements.add(0, (Element)newOwnedMemberElement);
		}
    }

}
