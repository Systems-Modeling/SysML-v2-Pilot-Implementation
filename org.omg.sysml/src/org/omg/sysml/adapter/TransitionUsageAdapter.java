/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2023 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.UsageUtil;

public class TransitionUsageAdapter extends ActionUsageAdapter {

	public TransitionUsageAdapter(TransitionUsage element) {
		super(element);
	}
	
	@Override
	public TransitionUsage getTarget() {
		return (TransitionUsage)super.getTarget();
	}
	
	// Implicit Generalization
	
	@Override
	protected String getDefaultSupertype() {
		return isStateTransition()? getDefaultSupertype("stateTransition"):
			   isActionTransition()? getDefaultSupertype("actionTransition"):
			   getDefaultSupertype("base");
	}
	
	protected boolean isActionTransition() {
		TransitionUsage target = getTarget();
		Type owningType = target.getOwningType();
		return target.isComposite() && 
			   (owningType instanceof ActionDefinition || owningType instanceof ActionUsage);
	}	
	
	protected boolean isStateTransition() {
		TransitionUsage target = getTarget();
		Type owningType = target.getOwningType();
		return target.isComposite() &&
			   (owningType instanceof StateDefinition || owningType instanceof StateUsage);
	}
	
	// Transformation
	
	protected void computeSource() {
		TransitionUsage target = getTarget();
		List<Membership> ownedMemberships = target.getOwnedMembership();
		if (ownedMemberships.isEmpty() || ownedMemberships.get(0) instanceof OwningMembership) {
			Feature source = UsageUtil.getPreviousFeature(target);
			Membership membership = SysMLFactory.eINSTANCE.createMembership();
			membership.setMemberElement(source);
			target.getOwnedRelationship().add(0, membership);
		}
	}
	
	protected Feature computeTransitionLinkConnectors() {
		TransitionUsage transition = getTarget();
		Feature transitionLinkFeature = UsageUtil.getTransitionLinkFeatureOf(transition);
		if (transitionLinkFeature == null) {
			transitionLinkFeature = SysMLFactory.eINSTANCE.createReferenceUsage();
			TypeUtil.addOwnedFeatureTo(transition, transitionLinkFeature);			
			Succession succession = transition.getSuccession();
			addBindingConnector(succession, transitionLinkFeature);			
			List<Feature> parameters = TypeUtil.getOwnedParametersOf(transition);
			if (!parameters.isEmpty()) {
				Feature source = transition.getSource();
				if (source != null) {
					addBindingConnector(source, parameters.get(0));
				}
			}
		}
		return transitionLinkFeature;
	}
	
	@Override
	public void doTransform() {
		// Note: Needs to come before computeTransitionLinkConnectors.
		computeSource();
		// Note: Needs to come before clearing and recomputation of inheritance cache.
		computeTransitionLinkConnectors();		
		super.doTransform();
	}
	
}
