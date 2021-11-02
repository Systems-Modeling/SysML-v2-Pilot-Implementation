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

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.SourceEnd;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;

public class SourceEndAdapter extends FeatureAdapter {

	public SourceEndAdapter(SourceEnd element) {
		super(element);
	}
	
	@Override
	public SourceEnd getTarget() {
		return (SourceEnd)super.getTarget();
	}
	
	@Override
	public void addDefaultGeneralType() {
		Type type = getTarget().getOwningType();
		if (type instanceof Feature) {
			addImplicitGeneralType(getGeneralizationEClass(), getSource((Feature)type));
		} else {
			super.addDefaultGeneralType();
		}
	}
	
	public static Feature getSource(Feature owningFeature) {
		Namespace namespace = owningFeature.getOwningNamespace();
		return owningFeature instanceof BindingConnector && 
			   namespace instanceof SatisfyRequirementUsage? 
					((SatisfyRequirementUsage)namespace).getSubjectParameter(): 
					getPreviousFeature(owningFeature);
	}
	
	private static Feature getPreviousFeature(Feature feature) {
		Namespace owner = feature.getOwningNamespace();
		if (!(owner instanceof Type)) {
			return null;
		} else {
			EList<Membership> memberships = ((Type)owner).getOwnedMembership();
			for (int i = memberships.indexOf(feature.getOwningMembership()) - 1; i >= 0; i--) {
				Membership membership = memberships.get(i);
				if (!(membership instanceof TransitionFeatureMembership)) {
					Element previousElement = memberships.get(i).getMemberElement();
					if (previousElement instanceof Feature &&
						!FeatureUtil.isParameter((Feature)previousElement) &&
						!(previousElement instanceof TransitionUsage) &&
						(!(previousElement instanceof Connector) ||
						 !(owner instanceof ActionDefinition || owner instanceof ActionUsage) && 
						 previousElement instanceof ItemFlow)) {
						return (Feature)previousElement;
					}
				}
			}
			return owner instanceof Feature? getPreviousFeature((Feature)owner): null;
		}
	}

}
