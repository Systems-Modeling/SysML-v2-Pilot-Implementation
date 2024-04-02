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

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.VisibilityKind;

public class Type_visibleMemberships_InvocationDelegate extends Namespace_visibleMemberships_InvocationDelegate {
	
	public Type_visibleMemberships_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	protected EList<Membership> getVisibleMemberships(Namespace self, Collection<org.omg.sysml.lang.sysml.Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeAll) {
		EList<Membership> visibleMembership = super.getVisibleMemberships(self, excludedNamespaces, excludedTypes, includeAll);
		visibleMembership.addAll(Type_inheritedMemberships_InvocationDelegate.getInheritedMembershipFor((Type)self, excludedNamespaces, excludedTypes, includeAll));
		return visibleMembership;
	}

	protected EList<Membership> getNonPrivateMembership(Type self, Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		EList<Membership> nonPrivateMembership = super.getVisibleMemberships(self, excludedNamespaces, excludedTypes, false);
		if (includeProtected) {
			nonPrivateMembership.addAll(getVisibleOwnedMembership(self, VisibilityKind.PROTECTED));
		}
		nonPrivateMembership.addAll(Type_inheritedMemberships_InvocationDelegate.getInheritedMembershipFor(self, excludedNamespaces, excludedTypes, includeProtected));
		return nonPrivateMembership;
	}
	
	public static EList<Membership> getNonPrivateMembershipFor(Type type, Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		Type_visibleMemberships_InvocationDelegate visibleMembershipsDelegate = (Type_visibleMemberships_InvocationDelegate) 
				OperationInvocationDelegateFactory.getInvocationDelegate(type.eClass(), SysMLPackage.eINSTANCE.getNamespace__VisibleMemberships__EList_boolean_boolean());
		return visibleMembershipsDelegate.getNonPrivateMembership(type, excludedNamespaces, excludedTypes, includeProtected);
	}

}
