/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022-2023, 2025 Model Driven Solutions, Inc.
 * Copyright (c) 2022 Siemens AG
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
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Element;

public class Element_qualifiedName_SettingDelegate extends BasicDerivedPropertySettingDelegate {

	public Element_qualifiedName_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected Object basicGet(InternalEObject owner) {
		Element self = (Element)owner;
		Namespace owningNamespace = self.getOwningNamespace();
		if (owningNamespace == null) {
			return null;
		} else {
			String name = self.getName();
			if (name == null || owningNamespace.getOwnedMember().stream().
					filter(m->name.equals(m.getName())).
					findFirst().orElse(null) != self) {
				return null;
			} else if (owningNamespace.getOwner() == null) {
				return self.escapedName();
			} else {
				String qualification = owningNamespace.getQualifiedName();
				return qualification == null? null: qualification + "::" + self.escapedName();
			}
		}
	}

}
