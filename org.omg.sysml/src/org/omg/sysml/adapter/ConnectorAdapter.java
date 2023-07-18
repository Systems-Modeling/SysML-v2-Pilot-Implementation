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
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.ConnectorUtil;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.TypeUtil;

public class ConnectorAdapter extends FeatureAdapter {

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
		int numEnds = TypeUtil.getOwnedEndFeaturesOf(target).size();
		return hasStructureType()?
				numEnds != 2? 
					getDefaultSupertype("object"):
					getDefaultSupertype("binaryObject"):
				numEnds != 2? 
					getDefaultSupertype("base"):
					getDefaultSupertype("binary");
	}
	
	public static void addEndSubsetting(Connector target) {
		for (Feature end: target.getConnectorEnd()) {
			if (end != null) {
				Expression expression = end.getOwnedFeature().stream().
						filter(Expression.class::isInstance).
						map(Expression.class::cast).
						findFirst().orElse(null);
				if (expression != null) {
					ElementUtil.transform(expression);
					TypeUtil.addImplicitGeneralTypeTo(end, SysMLPackage.eINSTANCE.getSubsetting(), expression.getResult());
				}
			}
		}
	}
	
	@Override
	public void doTransform() {
		Connector target = getTarget();
		super.doTransform();
		addFeaturingTypeIfNecessary(ConnectorUtil.getContextTypeFor(target));
		addEndSubsetting(target);
	}
	
}
