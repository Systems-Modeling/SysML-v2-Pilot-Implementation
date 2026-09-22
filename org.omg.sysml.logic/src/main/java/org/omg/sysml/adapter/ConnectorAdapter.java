/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2024-2026 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.util.ConnectorUtil;

public class ConnectorAdapter extends FeatureAdapter {

	public ConnectorAdapter(Connector feature) {
		super(feature);
	}
	
	@Override
	public Connector getTarget() {
		return (Connector)super.getTarget();
	}
	
	/**
	 * @satisfies checkConnectorTypeFeaturing
	 */
	protected void addContextFeaturingType() {
		addFeaturingTypeIfNecessary(ConnectorUtil.getContextTypeFor(getTarget()));
	}
	
	/**
	 * @satisfies checkConnectorTypeFeaturing
	 */
	@Override
	public void doTransform() {
		super.doTransform();
		addContextFeaturingType();
	}
	
}
