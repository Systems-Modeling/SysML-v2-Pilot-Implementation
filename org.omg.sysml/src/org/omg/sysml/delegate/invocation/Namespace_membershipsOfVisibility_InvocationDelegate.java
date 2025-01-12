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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.lang.sysml.impl.NamespaceImpl;

public class Namespace_membershipsOfVisibility_InvocationDelegate extends BasicInvocationDelegate {
	
	public Namespace_membershipsOfVisibility_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		NamespaceImpl self = (NamespaceImpl) target;
		VisibilityKind visibility = (VisibilityKind) arguments.get(0);
		EList<Namespace> excluded = (EList<Namespace>) arguments.get(1);
		
		EList<Membership> memberships = new BasicEList<>(self.getOwnedMembership()) {
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isUnique() {
				return true;
			}
		};
		EList<Import> ownedImports = new BasicEList<>(self.getOwnedImport());
		
		if (visibility != null) {
			memberships.removeIf(mem->mem.getVisibility() != visibility);
			ownedImports.removeIf(imp->imp.getVisibility() != visibility);
		}
		
		excluded.add(self);
		memberships.addAll(ownedImports.stream().
				flatMap(imp->imp.importedMemberships(excluded).stream()).
				toList());
		excluded.remove(self);
		
		return memberships;
	}

}
