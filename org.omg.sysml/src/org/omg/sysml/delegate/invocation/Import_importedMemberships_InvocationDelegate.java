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
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.VisibilityKind;

public abstract class Import_importedMemberships_InvocationDelegate extends BasicInvocationDelegate {

	public Import_importedMemberships_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		Import self = (Import) target;
		@SuppressWarnings("unchecked")
		EList<Namespace> excluded = (EList<Namespace>) arguments.get(0);
		
		return importMemberships(self, new BasicInternalEList<>(Membership.class), null,
				excluded, new HashSet<>());
	}

	// Note: The excludedType parameter is needed in case the imported Namespace
	// is a Type that has one or more Generalizations.
	public abstract EList<Membership> importMemberships(Import self, EList<Membership> importedMembership,
			Collection<Membership> nonpublicMembership, Collection<Namespace> excludedNamespaces,
			Collection<Type> excludedTypes);
	
	protected void importMembershipsFrom(Import self, Namespace importedNamespace, EList<Membership> importedMembership,
			Collection<Membership> nonpublicMembership, Collection<Namespace> excludedNamespaces,
			Collection<Type> excludedTypes, boolean isRecursive) {
		Collection<Membership> namespaceMembership = 
				Namespace_visibleMemberships_InvocationDelegate.getVisibleMembershipsFor(importedNamespace, excludedNamespaces, excludedTypes, self.isImportAll());
		importedMembership.addAll(namespaceMembership);
		if (nonpublicMembership != null && !VisibilityKind.PUBLIC.equals(self.getVisibility())) {
			nonpublicMembership.addAll(namespaceMembership);
		}
		if (isRecursive) {
			excludedNamespaces.add(importedNamespace);
			for (Membership membership: namespaceMembership) {
				if (membership instanceof OwningMembership) {
					Element member = membership.getMemberElement();
					if (member instanceof Namespace) {
						importMembershipsFrom(self, (Namespace)member, importedMembership, nonpublicMembership, 
								excludedNamespaces, excludedTypes, true);
					}
				}
			}
			excludedNamespaces.remove(importedNamespace);
		}
	}
	
	public static EList<Membership> importMembershipsFor(Import _import, EList<Membership> importedMembership,
			Collection<Membership> nonpublicMembership, Collection<Namespace> excludedNamespaces,
			Collection<Type> excludedTypes) {
		Import_importedMemberships_InvocationDelegate importedMembershipsDelegate = (Import_importedMemberships_InvocationDelegate) 
				OperationInvocationDelegateFactory.getInvocationDelegate(_import.eClass(), SysMLPackage.eINSTANCE.getImport__ImportedMemberships__EList());
		return importedMembershipsDelegate.importMemberships(_import, importedMembership, nonpublicMembership, excludedNamespaces, excludedTypes);
	}
}
