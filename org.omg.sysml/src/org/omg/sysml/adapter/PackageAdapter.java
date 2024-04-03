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
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Package;
import org.omg.sysml.lang.sysml.Type;

public class PackageAdapter extends NamespaceAdapter {

	public PackageAdapter(Package element) {
		super(element);
	}
	
	public Package getTarget() {
		return (Package)super.getTarget();
	}

	@Override
	public EList<Membership> getImportedMembership(Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean isIncludeAll) {
		Package target = getTarget();
		EList<Membership> importedMemberships = super.getImportedMembership(excludedNamespaces, excludedTypes, isIncludeAll);
		importedMemberships.removeIf(membership->!target.includeAsMember(membership.getMemberElement()));
		return importedMemberships;
	}
	
}
