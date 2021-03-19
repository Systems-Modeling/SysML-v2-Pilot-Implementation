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

import org.omg.sysml.lang.sysml.RenderingDefinition;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.Type;

public class RenderingUsageAdapter extends PartUsageAdapter {

	public static final String RENDERING_SUBSETTING_BASE_DEFAULT = "Views::renderings";
	public static final String RENDERING_SUBSETTING_SUBRENDERING_DEFAULT = "Views::Rendering::subrenderings";

	public RenderingUsageAdapter(RenderingUsage element) {
		super(element);
	}
	
	@Override
	public RenderingUsage getTarget() {
		return (RenderingUsage)super.getTarget();
	}

	@Override
	protected String getDefaultSupertype() {
		return isSubrendering()? 
					RENDERING_SUBSETTING_SUBRENDERING_DEFAULT:
					RENDERING_SUBSETTING_BASE_DEFAULT;
	}
	
	public boolean isSubrendering() {
		Type owningType = getTarget().getOwningType();
		return owningType instanceof RenderingDefinition | owningType instanceof RenderingUsage;
	}
	
}
