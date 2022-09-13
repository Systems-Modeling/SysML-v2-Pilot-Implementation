/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2022 Model Driven Solutions, Inc.
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

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TargetEnd;
import org.omg.sysml.lang.sysml.Type;


public class TargetEndAdapter extends FeatureAdapter {

	public TargetEndAdapter(TargetEnd element) {
		super(element);
	}
	
	@Override
	public TargetEnd getTarget() {
		return (TargetEnd)super.getTarget();
	}

	@Override
	public void addDefaultGeneralType() {
		Type type = getTarget().getOwningType();
		if (type instanceof Feature) {
			addImplicitGeneralType(SysMLPackage.eINSTANCE.getReferenceSubsetting(), getTargetFeature((Feature)type));
		} else {
			super.addDefaultGeneralType();
		}
	}
		
	private static Feature getTargetFeature(Feature feature) {
		Type type = feature.getOwningType();
		if (type == null) {
			return null;
		} else {
			EList<FeatureMembership> memberships = type.getOwnedFeatureMembership();
			int i = memberships.indexOf(feature.getOwningFeatureMembership()) + 1;
			return i < memberships.size()? memberships.get(i).getOwnedMemberFeature(): null;
		}
	}

}
