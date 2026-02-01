/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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
		if (!ElementUtil.isStandardLibraryElement(target) &&
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
