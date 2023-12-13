/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2023 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.RenderingDefinition;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.ViewRenderingMembership;

public class RenderingUsageAdapter extends PartUsageAdapter {

	public RenderingUsageAdapter(RenderingUsage element) {
		super(element);
	}
	
	@Override
	public RenderingUsage getTarget() {
		return (RenderingUsage)super.getTarget();
	}
	
	@Override
	public void addDefaultGeneralType() {
		super.addDefaultGeneralType();
		if (isViewRendering()) {
			addImplicitGeneralType(SysMLPackage.eINSTANCE.getRedefinition(), getLibraryType(getDefaultSupertype("viewRendering")));
		}
	}

	@Override
	protected String getDefaultSupertype() {
		return isSubrendering()? 
					getDefaultSupertype("subrendering"):
					getDefaultSupertype("base");
	}
	
	public boolean isViewRendering() {
		FeatureMembership membership = getTarget().getOwningFeatureMembership();
		return membership instanceof ViewRenderingMembership;
	}
	
	public boolean isSubrendering() {
		Type owningType = getTarget().getOwningType();
		return owningType instanceof RenderingDefinition | owningType instanceof RenderingUsage;
	}
	
}
