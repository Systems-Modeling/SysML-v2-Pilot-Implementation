/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022, 2024 Model Driven Solutions, Inc.
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
