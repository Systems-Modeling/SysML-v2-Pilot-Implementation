/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022, 2024 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.util.ElementUtil;

public class MembershipAdapter extends RelationshipAdapter {

	public MembershipAdapter(Membership element) {
		super(element);
	}
	
	@Override
	public Membership getTarget() {
		return (Membership)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		super.postProcess();
		Membership target = getTarget();
		if (!(target instanceof OwningMembership)) {
			target.setMemberName(ElementUtil.unescapeString(target.getMemberName()));
			target.setMemberShortName(ElementUtil.unescapeString(target.getMemberShortName()));
		}
	}
	
}
