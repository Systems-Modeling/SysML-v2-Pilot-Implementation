/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024, 2025 Model Driven Solutions, Inc.
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

package org.omg.sysml.delegate.invocation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.omg.sysml.lang.sysml.Membership;

public class Membership_isDistinguishableFrom_InvocationDelegate extends BasicInvocationDelegate {

	public Membership_isDistinguishableFrom_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		Membership self = (Membership) target;
		Membership other = (Membership) arguments.get(0);
		
		// TODO: Add member element metaclass check
		
		String memberShortName = self.getMemberShortName();
		String memberName = self.getMemberName();
		String otherShortName = other.getMemberShortName();
		String otherName = other.getMemberName();
		if (memberShortName != null) {
			if (memberShortName.equals(otherShortName) || memberShortName.equals(otherName)) {
				return false;
			}
		}
		if (memberName != null) {
			if (memberName.equals(otherShortName) || memberName.equals(otherName)) {
				return false;
			}
		}
		return true;
	}

}
