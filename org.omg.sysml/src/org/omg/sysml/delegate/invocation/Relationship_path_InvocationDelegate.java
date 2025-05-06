/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2025 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Relationship;

public class Relationship_path_InvocationDelegate extends Element_path_InvocationDelegate {

	public Relationship_path_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public String dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		Relationship self = (Relationship) target;
		Relationship owningRelationship = self.getOwningRelationship();
		Element owningRelatedElement = self.getOwningRelatedElement();
		return owningRelationship == null && owningRelatedElement != null?
					owningRelatedElement.path() + "/" + 
					(owningRelatedElement.getOwnedRelationship().indexOf(self) + 1):
			   super.dynamicInvoke(target, arguments);
	}

}
