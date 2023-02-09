/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2023 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ImplicitGeneralizationMap;
import org.omg.sysml.util.TypeUtil;

public class ActionUsageAdapter extends OccurrenceUsageAdapter {
	
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
		if (isStructureOwnedComposite()) {
			addDefaultGeneralType("ownedPerformance");
		} else if (isBehaviorOwned()) {
			addDefaultGeneralType("enclosedPerformance");
		}
	}
	
	@Override
	protected String getDefaultSupertype() {
		return getDefaultSupertype("base");
	}
	
	@Override
	protected boolean isSuboccurrence() {
		return super.isSuboccurrence() && !isActionOwnedComposite();
	}
	
	protected String getSubactionType() {
		return isActionOwnedComposite()? "subaction": 
			   isPartOwnedComposite()? "ownedAction":
			   null;	
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
		String kind = 
				membership instanceof StateSubactionMembership?
					((StateSubactionMembership)membership).getKind().toString():
				membership instanceof TransitionFeatureMembership?
					((TransitionFeatureMembership)membership).getKind().toString():
				null;
		return kind == null? null:
			   ImplicitGeneralizationMap.getDefaultSupertypeFor(target.getClass(), kind);
	}
	
}
