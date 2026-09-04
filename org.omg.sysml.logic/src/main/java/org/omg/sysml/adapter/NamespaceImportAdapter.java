/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024, 2025 Model Driven Solutions, Inc.
 * Copyright (c) 2024 Budapest University of Technology and Economics
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *  
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.NamespaceImport;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.NamespaceUtil;
import org.omg.sysml.lang.sysml.Namespace;

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
	public void importMemberships(EList<Membership> importedMemberships, Set<Namespace> excluded) {
		NamespaceImport target = getTarget();
		Namespace importedNamespace = target.getImportedNamespace();
		if (importedNamespace != null && !excluded.contains(importedNamespace)) {
			Collection<Membership> namespaceMembership = 
					NamespaceUtil.getVisibleMembershipsFor(importedNamespace, excluded, target.isRecursive(), target.isImportAll());
			importedMemberships.addAll(namespaceMembership);
		}
	}
	
}
