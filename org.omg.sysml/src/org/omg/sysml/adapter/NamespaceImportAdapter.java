/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
 * Copyright (c) 2024 Budapest University of Technology and Economics
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
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.NamespaceImport;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Type;

public class NamespaceImportAdapter extends ImportAdapter {

	public NamespaceImportAdapter(NamespaceImport element) {
		super(element);
	}
	
	public NamespaceImport getTarget() {
		return (NamespaceImport)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		super.postProcess();
		
		NamespaceImport obj = getTarget();		
		// If importedNamespace is empty, then set it to the first ownedRelatedElement, if this is a namespace
		// (filling in the implicit import for a filter package). Otherwise, set it to the importOwningNamspace.
		Object importedNamespace = obj.eGet(SysMLPackage.Literals.NAMESPACE_IMPORT__IMPORTED_NAMESPACE, false);
		if (importedNamespace == null) {
			EList<Element> ownedRelatedElement = obj.getOwnedRelatedElement();
			if (!ownedRelatedElement.isEmpty() && ownedRelatedElement.get(0) instanceof Namespace) {
				// Fill in the implicit import for a filter package.
				obj.setImportedNamespace((Namespace)ownedRelatedElement.get(0));
			} else {
				obj.setImportedNamespace(obj.getImportOwningNamespace());
			}
		}
	}
	
	@Override
	public EList<Membership> importMemberships(EList<Membership> importedMembership,
			Collection<Membership> nonpublicMembership, Collection<Namespace> excludedNamespaces,
			Collection<Type> excludedTypes) {
		NamespaceImport target = getTarget();
		Namespace importedNamespace = target.getImportedNamespace();
		if (importedNamespace != null && !excludedNamespaces.contains(importedNamespace)) {
			Namespace owningNamespace = target.getImportOwningNamespace();
			excludedNamespaces.add(owningNamespace);
			importMembershipsFrom(importedNamespace, importedMembership, nonpublicMembership, 
					excludedNamespaces, excludedTypes, target.isRecursive());
			excludedNamespaces.remove(owningNamespace);
		}
		return importedMembership;
	}
	
}
