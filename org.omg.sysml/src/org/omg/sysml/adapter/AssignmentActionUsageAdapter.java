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

import java.util.List;

import org.omg.sysml.lang.sysml.AssignmentActionUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.TypeUtil;

public class AssignmentActionUsageAdapter extends ActionUsageAdapter {

	public AssignmentActionUsageAdapter(AssignmentActionUsage element) {
		super(element);
	}

	public AssignmentActionUsage getTarget() {
		return (AssignmentActionUsage)super.getTarget();
	}
	
	protected void addTargetRedefinitions() {
		AssignmentActionUsage target = getTarget();
		List<Feature> parameters = TypeUtil.getOwnedParametersOf(target);
		if (!parameters.isEmpty()) {
			Feature targetFeature = parameters.get(0);
			List<Feature> features = targetFeature.getOwnedFeature();
			if (!features.isEmpty()) {
				Feature startingAtFeature = features.get(0);
				TypeUtil.addDefaultGeneralTypeTo(startingAtFeature, SysMLPackage.eINSTANCE.getRedefinition(), getDefaultSupertype("startingAt"));
				TypeUtil.setIsAddImplicitGeneralTypesFor(startingAtFeature, false);
				features = startingAtFeature.getOwnedFeature();
				if (!features.isEmpty()) {
					Feature accessedFeature = features.get(0);
					TypeUtil.addDefaultGeneralTypeTo(accessedFeature, SysMLPackage.eINSTANCE.getRedefinition(), getDefaultSupertype("accessedFeature"));
					Feature referent = target.getReferent();
					if (referent != null) {
						TypeUtil.addImplicitGeneralTypeTo(accessedFeature, SysMLPackage.eINSTANCE.getRedefinition(), referent);
					}
					TypeUtil.setIsAddImplicitGeneralTypesFor(accessedFeature, false);
				}
			}
		}
	}
	
	public void doTransform() {
		super.doTransform();
		addTargetRedefinitions();
	}
}
