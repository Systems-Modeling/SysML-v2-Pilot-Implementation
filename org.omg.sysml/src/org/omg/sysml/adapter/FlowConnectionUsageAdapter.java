/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2023 Model Driven Solutions, Inc.
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

import java.util.List;

import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FlowConnectionUsage;
import org.omg.sysml.util.ConnectorUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.UsageUtil;

public class FlowConnectionUsageAdapter extends ConnectionUsageAdapter {

	public FlowConnectionUsageAdapter(FlowConnectionUsage feature) {
		super(feature);
	}
	
	@Override
	public FlowConnectionUsage getTarget() {
		return (FlowConnectionUsage)super.getTarget();
	}
	
	@Override
	public void addDefaultGeneralType() {
		super.addDefaultGeneralType();
		if (isPartOwnedComposite()) {
			addDefaultGeneralType("ownedAction");
		} else if (isStructureOwnedComposite()) {
			addDefaultGeneralType("ownedPerformance");
		}
		if (isActionOwnedComposite()) {
			addDefaultGeneralType("subaction");
		} else if (isBehaviorOwnedComposite()) {
			addDefaultGeneralType("subperformance");
		} else if (isBehaviorOwned()) {
			addDefaultGeneralType("enclosedPerformance");
		}
	}
	
	@Override
	protected String getDefaultSupertype() {
		return UsageUtil.isMessageConnection(getTarget())?
				getDefaultSupertype("message"):
				getDefaultSupertype("base");
	}
	
	@Override
	public List<? extends Feature> getRelevantFeatures() {
		return TypeUtil.getItemFeaturesOf(getTarget());
	}
	
	@Override
	public void doTransform() {
		ConnectorUtil.transformConnectorEndsOf(getTarget());
		super.doTransform();
	}
	
}
