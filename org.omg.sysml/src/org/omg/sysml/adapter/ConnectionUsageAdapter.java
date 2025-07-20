/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2025 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.util.ConnectorUtil;
import org.omg.sysml.util.TypeUtil;

public class ConnectionUsageAdapter extends PartUsageAdapter {

	public ConnectionUsageAdapter(ConnectionUsage element) {
		super(element);
	}
	
	@Override
	public ConnectionUsage getTarget() {
		return (ConnectionUsage)super.getTarget();
	}
	
	/**
	 * @satisfies checkPartUsageSubpartSpecialization
	 */
	@Override
	public void addDefaultGeneralType() {
		super.addDefaultGeneralType();
		if (isSubitem()) {
			addDefaultGeneralType("subpart");
		}
	}
	
	/**
	 * @satisfies checkConnectionUsageSpecialization
	 * @satisfies checkAllocationUsageSpecialization
	 * @satisfies checkInterfaceDefinitionSpecialization
	 * @satisfies checkConnectionUsageBinarySpecialization
	 * @satisfies checkAllocationUsageSpecialization
	 * @satisfies checkInterfaceDefinitionBinarySpecialization
	 */
	@Override
	protected String getDefaultSupertype() {
		int numEnds = TypeUtil.getOwnedEndFeaturesOf(getTarget()).size();
		return numEnds != 2?
				getDefaultSupertype("base"):
				getDefaultSupertype("binary");
	}
	
	@Override
	protected boolean isAddMultiplicity() {
		return getTarget().isEnd();
	}
	
	@Override
	public void doTransform() {
		ConnectionUsage target = getTarget();
		super.doTransform();
		addFeaturingTypeIfNecessary(ConnectorUtil.getContextTypeFor(target));
		ConnectorAdapter.addEndSubsetting(target);
	}
	
}
