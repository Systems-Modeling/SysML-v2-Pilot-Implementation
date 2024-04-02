/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
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
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.NonNotifyingEObjectEList;

public class Namespace_importedMemberships_InvocationDelegate extends BasicInvocationDelegate {

	public Namespace_importedMemberships_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		Namespace self = (Namespace) target;
		@SuppressWarnings("unchecked")
		EList<Namespace> excluded = (EList<Namespace>) arguments.get(0);
		
		return getImportedMembership(self, new HashSet<>(excluded), new HashSet<Type>(), true);
	}
	
	protected EList<Membership> getImportedMembership(Namespace self, Collection<org.omg.sysml.lang.sysml.Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeAll) {
		EList<Membership> importedMembership = new NonNotifyingEObjectEList<Membership>(Membership.class, (InternalEObject)self, SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP);
		Collection<Membership> nonpublicMembership = includeAll? null: new HashSet<Membership>();
		if (!excludedNamespaces.contains(self)) {
			for (Import _import: self.getOwnedImport()) {
				Import_importedMemberships_InvocationDelegate.importMembershipsFor(_import, importedMembership, nonpublicMembership, excludedNamespaces, excludedTypes);
			}
		}
		if (!includeAll) {
			importedMembership.removeAll(nonpublicMembership);
		}
		return importedMembership;
	}
	
	public static EList<Membership> getImportedMembershipFor(Namespace namespace, Collection<org.omg.sysml.lang.sysml.Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeAll) {
		Namespace_importedMemberships_InvocationDelegate importedMembershipsDelegate = (Namespace_importedMemberships_InvocationDelegate) 
				OperationInvocationDelegateFactory.getInvocationDelegate(namespace.eClass(), SysMLPackage.eINSTANCE.getNamespace__ImportedMemberships__EList());
		return importedMembershipsDelegate.getImportedMembership(namespace, excludedNamespaces, excludedTypes, includeAll);
	}

	
}
