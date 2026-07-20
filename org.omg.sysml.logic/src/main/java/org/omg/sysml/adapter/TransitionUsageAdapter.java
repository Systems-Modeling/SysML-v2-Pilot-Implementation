/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2023-2025 Model Driven Solutions, Inc.
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

import java.util.List;

import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ParameterMembership;
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
	
	/**
	 * @satisfies checkTransitionUsageStateSpecialization
	 * @satisfies checkTransitionUsageActionSpecialization
	 * @satisfies checkTransitionUsageSpecialization
	 */
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
			   (owningType instanceof ActionDefinition || owningType instanceof ActionUsage) &&
			   !(target.getSource() instanceof StateUsage);
	}	
	
	protected boolean isStateTransition() {
		TransitionUsage target = getTarget();
		Type owningType = target.getOwningType();
		return target.isComposite() &&
			   (owningType instanceof StateDefinition || owningType instanceof StateUsage) &&
			   target.getSource() instanceof StateUsage;
	}
	
	// Transformation
	
	/**
	 * @satisfies checkTransitionUsageSuccessionSourceSpecialization
	 */
	protected void computeSource() {
		TransitionUsage target = getTarget();
		List<Membership> ownedMemberships = target.getOwnedMembership();
		if (ownedMemberships.isEmpty() || 
				ownedMemberships.get(0) instanceof ParameterMembership) {
			Feature source = UsageUtil.getPreviousFeature(target);
			Membership membership = SysMLFactory.eINSTANCE.createMembership();
			membership.setMemberElement(source);
			target.getOwnedRelationship().add(0, membership);
		} else if (ownedMemberships.get(0).getMemberElement() == null) {
			Feature source = UsageUtil.getPreviousFeature(target);
			ownedMemberships.get(0).setMemberElement(source);
		}
	}
	
	/**
	 * @satisfies checkTransitionUsageSuccessionBindingConnector
	 * @satisfies checkTransitionUsageSourceBindingConnector
	 */
	protected Feature computeTransitionLinkConnectors() {
		TransitionUsage transition = getTarget();
		Feature transitionLinkFeature = UsageUtil.getTransitionLinkFeatureOf(transition);
		if (transitionLinkFeature == null) {
			Succession succession = transition.getSuccession();
			if (succession != null) {
				transitionLinkFeature = SysMLFactory.eINSTANCE.createReferenceUsage();
				TypeUtil.addOwnedFeatureTo(transition, transitionLinkFeature);			
				addBindingConnector(succession, transitionLinkFeature);
			}
			
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
	public void addAdditionalMembers() {
		// Note: Needs to come before computeTransitionLinkConnectors.
		//checkTransitionUsageSuccessionSourceSpecialization
		computeSource();
		// Note: Needs to come before clearing and recomputation of inheritance cache.
		//checkTransitionUsageSuccessionBindingConnector
		computeTransitionLinkConnectors();		
	}
	
}
