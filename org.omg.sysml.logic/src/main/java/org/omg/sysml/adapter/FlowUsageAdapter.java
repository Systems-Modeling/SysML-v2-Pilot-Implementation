/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 * Copyright (c) 2021-2026 Model Driven Solutions, Inc.
 * Copyright (c) 2026 Obeo
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

import org.omg.sysml.lang.sysml.FlowUsage;
import org.omg.sysml.util.UsageUtil;

public class FlowUsageAdapter extends ConnectorAsUsageAdapter {

	public FlowUsageAdapter(FlowUsage feature) {
		super(feature);
	}
	
	@Override
	public FlowUsage getTarget() {
		return (FlowUsage)super.getTarget();
	}
	
	/**
	 * @satisfies validateConnectorRelatedFeatures
	 * (For a FlowUsage that is a message.)
	 */
	protected void makeMessageAbstract() {
		FlowUsage target = getTarget();
		if (UsageUtil.isMessage(target) && target.getRelatedFeature().size() < 2) {
			target.setIsAbstract(true);
		}
	}
	
	@Override
	public void doTransform() {
		makeMessageAbstract();
		super.doTransform();
	}
	
}
