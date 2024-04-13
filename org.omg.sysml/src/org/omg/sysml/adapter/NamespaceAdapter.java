/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.util.NamespaceUtil;
import org.omg.sysml.util.NonNotifyingEObjectEList;

public class NamespaceAdapter extends ElementAdapter {

	public NamespaceAdapter(Namespace element) {
		super(element);
	}
	
	public Namespace getTarget() {
		return (Namespace)super.getTarget();
	}
	
	// Additional operations
	
	public EList<Membership> getImportedMembership(Collection<org.omg.sysml.lang.sysml.Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeAll) {
		Namespace target = getTarget();
		EList<Membership> importedMembership = new NonNotifyingEObjectEList<Membership>(Membership.class, (InternalEObject)target, SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP);
		Collection<Membership> nonpublicMembership = includeAll? null: new HashSet<Membership>();
		if (!excludedNamespaces.contains(target)) {
			for (Import _import: target.getOwnedImport()) {
				NamespaceUtil.importMembershipsFor(_import, importedMembership, nonpublicMembership, excludedNamespaces, excludedTypes);
			}
		}
		if (!includeAll) {
			importedMembership.removeAll(nonpublicMembership);
		}
		return importedMembership;
	}
	
	// Note: The excludedTypes parameter is need when this operation is overridden in class Type.
	public EList<Membership> getVisibleMemberships(Collection<org.omg.sysml.lang.sysml.Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeAll) {
		Namespace target = getTarget();
		EList<Membership> visibleMembership;
		if (includeAll) {
			visibleMembership = new BasicInternalEList<Membership>(Membership.class);
			visibleMembership.addAll(target.getOwnedMembership());
		} else {
			visibleMembership = getVisibleOwnedMembership(VisibilityKind.PUBLIC);
		}
		visibleMembership.addAll(getImportedMembership(excludedNamespaces, excludedTypes, includeAll));
		return visibleMembership;
	}

	public EList<Membership> getVisibleOwnedMembership(VisibilityKind visibility) {
		Namespace target = getTarget();
		EList<Membership> publicMembership = new BasicInternalEList<Membership>(Membership.class);
		publicMembership.addAll(target.getOwnedMembership().stream().
				filter(membership->visibility.equals(membership.getVisibility())).collect(Collectors.toList()));
		return publicMembership;
	}
		
	// Caching
	
	private EList<Membership> importedMembership = null;

	public EList<Membership> getImportedMembership() {
		return importedMembership;
	}
	
	public EList<Membership> setImportedMembership(EList<Membership> importedMembership) {
		this.importedMembership = importedMembership;
		return importedMembership;
	}
	
	@Override
	public void clearCaches() {
		importedMembership = null;
	}
	
	// Transformation
	
	public void addAdditionalMembers() {
	}
	
	@Override
	public void doTransform() {
		addAdditionalMembers();
		super.doTransform();
	}
	
}
