/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import java.util.UUID;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.util.ElementUtil;

public class OwningMembershipAdapter extends MembershipAdapter {

	public OwningMembershipAdapter(OwningMembership element) {
		super(element);
	}
	
	@Override
	public OwningMembership getTarget() {
		return (OwningMembership)super.getTarget();
	}
	
	/**
	 * If the OwningMembership is not itself a standard library Element, but its ownedMemberElement 
	 * is a standard library Package, then give the OwningMembership a stable elementId anyway.
	 * (This will give a stable elementID to the owningMembership of a top-level standard library Package.)
	 */
	@Override
	public String createElementId() {
		OwningMembership target = getTarget();
		
		Element ownedMemberElement = target.getOwnedMemberElement();
		if (!ElementUtil.isStandardLibraryElement(target) && ownedMemberElement != null &&
			ElementUtil.isStandardLibraryElement(ownedMemberElement) && 
			ownedMemberElement.libraryNamespace() == ownedMemberElement) {
			String path = target.path();
			if (path != null) {
				UUID namespaceUUID = UUID.fromString(ownedMemberElement.getElementId());
				return ElementUtil.constructNameUUID(namespaceUUID, path).toString();
			}
		}
		
		return super.createElementId();
	}
	
}
