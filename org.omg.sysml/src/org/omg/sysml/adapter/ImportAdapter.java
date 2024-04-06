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

package org.omg.sysml.adapter;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.util.NamespaceUtil;

public abstract class ImportAdapter extends RelationshipAdapter {

	public ImportAdapter(Import element) {
		super(element);
	}
	
	public Import getTarget() {
		return (Import)super.getTarget();
	}
	
	// Additional operations
	// Note: The excludedType parameter is needed in case the imported Namespace
	// is a Type that has one or more Generalizations.
	public abstract EList<Membership> importMemberships(EList<Membership> importedMembership,
			Collection<Membership> nonpublicMembership, Collection<Namespace> excludedNamespaces,
			Collection<Type> excludedTypes);
	
	protected void importMembershipsFrom(Namespace importedNamespace, EList<Membership> importedMembership,
			Collection<Membership> nonpublicMembership, Collection<Namespace> excludedNamespaces,
			Collection<Type> excludedTypes, boolean isRecursive) {
		Import target = getTarget();
		Collection<Membership> namespaceMembership = 
				NamespaceUtil.getVisibleMembershipsFor(importedNamespace, excludedNamespaces, excludedTypes, target.isImportAll());
		importedMembership.addAll(namespaceMembership);
		if (nonpublicMembership != null && !VisibilityKind.PUBLIC.equals(target.getVisibility())) {
			nonpublicMembership.addAll(namespaceMembership);
		}
		if (isRecursive) {
			excludedNamespaces.add(importedNamespace);
			for (Membership membership: namespaceMembership) {
				if (membership instanceof OwningMembership) {
					Element member = membership.getMemberElement();
					if (member instanceof Namespace) {
						importMembershipsFrom((Namespace)member, importedMembership, nonpublicMembership, 
								excludedNamespaces, excludedTypes, true);
					}
				}
			}
			excludedNamespaces.remove(importedNamespace);
		}
	}

}
