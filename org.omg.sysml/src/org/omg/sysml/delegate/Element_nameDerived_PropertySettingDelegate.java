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

package org.omg.sysml.delegate;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.impl.ElementImpl;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.impl.MembershipImpl;
import org.omg.sysml.util.ElementUtil;

public class Element_nameDerived_PropertySettingDelegate extends BasicSettingDelegate.Stateless {

	public Element_nameDerived_PropertySettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
		String name = ((ElementImpl)owner).basicGetName();
		if (name != null) {
			return name;
		} else {
			Membership owningMembership = ((Element)owner).getOwningMembership();
			return owningMembership == null? null: ((MembershipImpl)owningMembership).basicGetMemberName(); 
		}
	}
	
	 @Override
		protected void set(InternalEObject owner, Object newValue) {
		 Membership owningMembership = ((Element)owner).getOwningMembership();
			if (owningMembership != null) {
				owningMembership.setMemberName((String)newValue);
				((ElementImpl)owner).basicSetName(null);
			} else {
				((ElementImpl)owner).basicSetName(ElementUtil.unescapeString((String)newValue));
			}
		}

	@Override
	protected boolean isSet(InternalEObject owner) {
		// TODO Auto-generated method stub
		return false;
	}

}
