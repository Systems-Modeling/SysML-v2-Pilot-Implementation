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

import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.util.ConnectorUtil;
import org.omg.sysml.util.FeatureUtil;

public class ConnectorAdapter extends FeatureAdapter {

	public static final String CONNECTOR_SUBSETTING_DEFAULT = "Links::links";
	public static final String BINARY_CONNECTOR_SUBSETTING_DEFAULT = "Links::binaryLinks";
	public static final String CONNECTOR_OBJECT_SUBSETTING_DEFAULT = "Objects::linkObjects";
	public static final String BINARY_CONNECTOR_OBJECT_SUBSETTING_DEFAULT = "Objects::binaryLinkObjects";
	
	public ConnectorAdapter(Connector feature) {
		super(feature);
	}
	
	@Override
	public Connector getTarget() {
		return (Connector)super.getTarget();
	}

	@Override
	protected String getDefaultSupertype() {
		Connector target = getTarget();
		return FeatureUtil.isStructureFeature(target)?
				target.getConnectorEnd().size() > 2? 
					CONNECTOR_OBJECT_SUBSETTING_DEFAULT:
					BINARY_CONNECTOR_OBJECT_SUBSETTING_DEFAULT:
				target.getConnectorEnd().size() > 2? 
					CONNECTOR_SUBSETTING_DEFAULT:
					BINARY_CONNECTOR_SUBSETTING_DEFAULT;
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		addFeaturingTypeIfNecessary(ConnectorUtil.getContextTypeFor(getTarget()));
	}
	
}
