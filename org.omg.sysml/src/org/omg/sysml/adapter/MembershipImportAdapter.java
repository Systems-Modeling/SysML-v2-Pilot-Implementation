/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024, 2025 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.MembershipImport;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.util.NamespaceUtil;

public class MembershipImportAdapter extends ImportAdapter {

	public MembershipImportAdapter(MembershipImport element) {
		super(element);
	}
	
	public MembershipImport getTarget() {
		return (MembershipImport)super.getTarget();
	}
	
	@Override
	public void importMemberships(EList<Membership> importedMemberships, Set<Namespace> excluded) {
		MembershipImport target = getTarget();
		Membership importedMembership = target.getImportedMembership();
		if (importedMembership != null) {
			importedMemberships.add(importedMembership);
			if (target.isRecursive()) {
				Element importedElement = importedMembership.getMemberElement();
				if (importedElement instanceof Namespace && !excluded.contains(importedElement)) {
					Collection<Membership> namespaceMembership = 
							NamespaceUtil.getVisibleMembershipsFor((Namespace)importedElement, excluded, true, target.isImportAll());
					importedMemberships.addAll(namespaceMembership);
				}
			}
		}
	}
	
}
