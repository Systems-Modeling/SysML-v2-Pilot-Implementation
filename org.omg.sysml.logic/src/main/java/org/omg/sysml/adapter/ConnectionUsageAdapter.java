/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2025 Model Driven Solutions, Inc.
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
