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

import java.util.Collections;
import java.util.List;

import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.TypeUtil;

public class ActionUsageAdapter extends OccurrenceUsageAdapter {
	
	public static final String STATE_BASE = "States::StateAction";
	public static final String TRANSITION_BASE = "Actions::TransitionAction";
	public static final String[] TRANSITION_REDEFINED_FEATURES = {"accepter", "guard", "effect"};
	
	public ActionUsageAdapter(ActionUsage element) {
		super(element);
	}
	
	@Override
	public ActionUsage getTarget() {
		return (ActionUsage)super.getTarget();
	}

	// Implicit Generalization
	
	@Override
	public void addDefaultGeneralType() {
		super.addDefaultGeneralType();
		String subactionType = getSubactionType();
		if (subactionType != null) {
			addDefaultGeneralType(subactionType);
		} 
		if (isOwnedPerformance()) {
			addDefaultGeneralType("ownedPerformance");
		} else if (isEnclosedPerformance()) {
			addDefaultGeneralType("enclosedPerformance");
		}
	}
	
	@Override
	protected String getDefaultSupertype() {
		return getDefaultSupertype("base");
	}
	
	protected String getSubactionType() {
		return isSubaction()? "subaction": 
			   isOwnedAction()? "ownedAction":
			   null;	
	}
		
	public boolean isSubaction() {
		ActionUsage target = getTarget();
		Type owningType = target.getOwningType();
		return target.isComposite() && (owningType instanceof ActionDefinition || owningType instanceof ActionUsage);
	}
	
	public boolean isOwnedAction() {
		ActionUsage target = getTarget();
		Type owningType = target.getOwningType();
		return target.isComposite() && (owningType instanceof PartDefinition || owningType instanceof PartUsage);
	}
	
	// Used in subclasses.
	public boolean isPerformedAction() {		
		Type owningType = getTarget().getOwningType();
		return owningType instanceof PartDefinition || owningType instanceof PartUsage;
	}
	
	// Computed Redefinition
	
	/**
	 *  For state and transition actions, always add implicit redefinition.
	 */
	@Override
	public boolean isComputeRedefinitions() {
		String redefinedFeature = getRedefinedFeature(getTarget());
		return redefinedFeature != null? isComputeRedefinitions:
				super.isComputeRedefinitions();
	}
	
	@Override
	public List<? extends Feature> getRelevantFeatures() {
		return TypeUtil.getItemFeaturesOf(getTarget());
	}	
	
	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type, Element skip) {
		ActionUsage target = getTarget();
		String redefinedFeature = getRedefinedFeature(target);
		return redefinedFeature == null? super.getRelevantFeatures(type, skip):
			   type == target.getOwningType()? Collections.singletonList(target):
			   Collections.singletonList((Feature)getLibraryType(redefinedFeature));
	}
	
	protected static String getRedefinedFeature(Feature target) {
		FeatureMembership membership = target.getOwningFeatureMembership();
		return membership instanceof StateSubactionMembership?
					STATE_BASE + "::" + ((StateSubactionMembership)membership).getKind().toString() + "Action": 
			   membership instanceof TransitionFeatureMembership? 
					TRANSITION_BASE + "::" + TRANSITION_REDEFINED_FEATURES[((TransitionFeatureMembership)membership).getKind().getValue()]: 
					null;
	}
	
}
