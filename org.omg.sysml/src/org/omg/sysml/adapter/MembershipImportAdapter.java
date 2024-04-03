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
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.MembershipImport;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Type;

public class MembershipImportAdapter extends ImportAdapter {

	public MembershipImportAdapter(MembershipImport element) {
		super(element);
	}
	
	public MembershipImport getTarget() {
		return (MembershipImport)super.getTarget();
	}
	
	@Override
	public EList<Membership> importMemberships(EList<Membership> importedMemberships,
			Collection<Membership> nonpublicMemberships, Collection<Namespace> excludedNamespaces,
			Collection<Type> excludedTypes) {
		MembershipImport target = getTarget();
		Membership importedMembership = target.getImportedMembership();
		if (importedMembership != null) {
			importedMemberships.add(importedMembership);
			if (target.isRecursive()) {
				Element importedElement = importedMembership.getMemberElement();
				if (importedElement instanceof Namespace) {
					excludedNamespaces.add((Namespace)importedElement);
					importMembershipsFrom((Namespace)importedElement, importedMemberships, nonpublicMemberships, 
							excludedNamespaces, excludedTypes, true);
					excludedNamespaces.remove(importedElement);
				}
			}
		}
		return importedMemberships;
	}
	
}
