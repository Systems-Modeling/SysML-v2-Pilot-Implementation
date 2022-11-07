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
import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SuccessionAsUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

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
						getPreviousFeature(target));
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

	protected static Feature getPreviousFeature(Feature feature) {
		Namespace owner = feature.getOwningNamespace();
		if (!(owner instanceof Type)) {
			return null;
		} else {
			Type type = (Type)owner;
			EList<Membership> memberships = type.getOwnedMembership();
			for (int i = memberships.indexOf(feature.getOwningMembership()) - 1; i >= 0; i--) {
				Membership membership = memberships.get(i);
				if (!(membership instanceof TransitionFeatureMembership)) {
					Element previousElement = memberships.get(i).getMemberElement();
					if (previousElement instanceof Feature &&
						!FeatureUtil.isParameter((Feature)previousElement) &&
						!(previousElement instanceof TransitionUsage) &&
						(!(previousElement instanceof Connector) ||
						 !(type instanceof ActionDefinition || type instanceof ActionUsage) && 
						 previousElement instanceof ItemFlow)) {
						return (Feature)previousElement;
					}
				}
			}
			return type instanceof Feature? getPreviousFeature((Feature)type): null;
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
	
	@Override
	public void doTransform() {
		addSourceEnd();
		addTargetEnd();
		super.doTransform();
	}

}
