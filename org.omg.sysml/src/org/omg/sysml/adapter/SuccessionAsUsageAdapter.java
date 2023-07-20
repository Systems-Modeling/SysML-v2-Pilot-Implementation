/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SuccessionAsUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.UsageUtil;

public class SuccessionAsUsageAdapter extends SuccessionAdapter {

	public SuccessionAsUsageAdapter(SuccessionAsUsage feature) {
		super(feature);
	}
	
	@Override
	public SuccessionAsUsage getTarget() {
		return (SuccessionAsUsage)super.getTarget();
	}
	
	protected void addSourceEnd() {
		SuccessionAsUsage target = getTarget();
		EList<Feature> ends = target.getConnectorEnd();
		if (!ends.isEmpty()) {
			Feature sourceEnd = ends.get(0);
			if (sourceEnd.getOwnedReferenceSubsetting() == null) {
				TypeUtil.addImplicitGeneralTypeTo(sourceEnd,
						SysMLPackage.eINSTANCE.getReferenceSubsetting(), 
						getSourceFeature(target));
			}
		}
	}
	
	protected void addTargetEnd() {
		SuccessionAsUsage target = getTarget();
		EList<Feature> ends = target.getConnectorEnd();
		if (ends.size() > 1) {
			Feature targetEnd = ends.get(1);
			if (targetEnd.getOwnedReferenceSubsetting() == null) {
				TypeUtil.addImplicitGeneralTypeTo(targetEnd,
						SysMLPackage.eINSTANCE.getReferenceSubsetting(), 
						getTargetFeature(target));
			}
		}
	}
	
	protected static Feature getSourceFeature(Feature feature) {
		Namespace owningNamespace = feature.getOwningNamespace();
		if (owningNamespace instanceof TransitionUsage) {
			TransitionUsage transition = (TransitionUsage)owningNamespace;
			if (transition.getSuccession() == feature) {
				return transition.getSource();
			}
		}
		return UsageUtil.getPreviousFeature(feature);
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
	
	@Override
	public void doTransform() {
		addSourceEnd();
		addTargetEnd();
		super.doTransform();
	}

}
