/*******************************************************************************
 * SysML 2 Pilot Implementation
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
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Disjoining;

public class Disjoining_owningType_SettingDelegate extends BasicDerivedObjectSettingDelegate {

	public Disjoining_owningType_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected Type basicGet(InternalEObject owner) {
		Element element = ((Disjoining) owner).getOwningRelatedElement();
		return element instanceof Type? (Type)element: null;
	}
	
	protected void set(InternalEObject owner, Type newOwningType)
	{
		if (((Disjoining)owner).getTypeDisjoined() != newOwningType) {
			((Disjoining)owner).setTypeDisjoined(newOwningType);
		}
		((Disjoining)owner).setOwningRelatedElement(newOwningType);
	}

}
