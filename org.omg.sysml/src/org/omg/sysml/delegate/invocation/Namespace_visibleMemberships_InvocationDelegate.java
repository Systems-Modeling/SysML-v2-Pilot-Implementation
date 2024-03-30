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
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.lang.sysml.impl.NamespaceImpl;

public class Namespace_visibleMemberships_InvocationDelegate extends BasicInvocationDelegate {
	
	public Namespace_visibleMemberships_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		NamespaceImpl self = (NamespaceImpl) target;
		@SuppressWarnings("unchecked")
		EList<Namespace> excluded = (EList<Namespace>) arguments.get(0);
		boolean includeAll = (boolean) arguments.get(2);
		
		return getVisibleMemberships(self, new HashSet<>(excluded), new HashSet<Type>(), includeAll);
	}

	// Note: The excludedTypes parameter is need when this operation is overridden in class Type.
	protected EList<Membership> getVisibleMemberships(Namespace self, Collection<org.omg.sysml.lang.sysml.Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeAll) {
		EList<Membership> visibleMembership;
		if (includeAll) {
			visibleMembership = new BasicInternalEList<Membership>(Membership.class);
			visibleMembership.addAll(self.getOwnedMembership());
		} else {
			visibleMembership = getVisibleOwnedMembership(self, VisibilityKind.PUBLIC);
		}
		visibleMembership.addAll(Namespace_importedMemberships_InvocationDelegate.getImportedMembershipFor(self, excludedNamespaces, excludedTypes, includeAll));
		return visibleMembership;
	}

	protected EList<Membership> getVisibleOwnedMembership(Namespace self, VisibilityKind visibility) {
		EList<Membership> publicMembership = new BasicInternalEList<Membership>(Membership.class);
		publicMembership.addAll(self.getOwnedMembership().stream().
				filter(membership->visibility.equals(membership.getVisibility())).collect(Collectors.toList()));
		return publicMembership;
	}
	
	public static EList<Membership> getVisibleMembershipsFor(Namespace namespace, Collection<org.omg.sysml.lang.sysml.Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeAll) {
		Namespace_visibleMemberships_InvocationDelegate visibleMembershipsDelegate = (Namespace_visibleMemberships_InvocationDelegate) 
				OperationInvocationDelegateFactory.getInvocationDelegate(namespace.eClass(), SysMLPackage.eINSTANCE.getNamespace__VisibleMemberships__EList_boolean_boolean());
		return visibleMembershipsDelegate.getVisibleMemberships(namespace, excludedNamespaces, excludedTypes, includeAll);
	}


}
