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

import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.util.ConnectorUtil;

public class ConnectionUsageAdapter extends PartUsageAdapter {

	public static final String CONNECTOR_USAGE_SUBSETTING_DEFAULT = "Connections::connections";

	public ConnectionUsageAdapter(ConnectionUsage element) {
		super(element);
	}
	
	@Override
	public ConnectionUsage getTarget() {
		return (ConnectionUsage)super.getTarget();
	}

	@Override
	protected String getDefaultSupertype() {
		return getTarget().getConnectorEnd().size() > 2? 
				ConnectorAdapter.CONNECTOR_SUBSETTING_DEFAULT:
				CONNECTOR_USAGE_SUBSETTING_DEFAULT;
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		addFeaturingTypeIfNecessary(ConnectorUtil.getContextTypeFor(getTarget()));
	}
	
}
