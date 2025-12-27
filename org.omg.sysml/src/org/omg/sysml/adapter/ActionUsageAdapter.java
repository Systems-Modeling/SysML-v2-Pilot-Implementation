/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2025 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ImplicitGeneralizationMap;

public class ActionUsageAdapter extends OccurrenceUsageAdapter {
	
	public ActionUsageAdapter(ActionUsage element) {
		super(element);
	}
	
	@Override
	public ActionUsage getTarget() {
		return (ActionUsage)super.getTarget();
	}

	// Implicit Generalization
	
	/**
	 * @satisfies checkAcceptActionUsageTriggerActionSpecialization
	 * @satisfies checkStepEnclosedPerformanceSpecialization
	 * @satisfies checkStepOwnedPerformanceSpecialization
	 * @satisfies checkStepSubperformanceSpecialization
	 */
	@Override
	public void addDefaultGeneralType() {
		super.addDefaultGeneralType();
		
		String subactionType = getSubactionType();
		if (subactionType != null) {
			addDefaultGeneralType(subactionType);
		}
		
		// From StepAdapter
		if (isStructureOwnedComposite()) {
			addDefaultGeneralType("ownedPerformance");
		} else if (isBehaviorOwnedComposite()) {
			addDefaultGeneralType("subperformance");
		} else if (isBehaviorOwned()) {
			addDefaultGeneralType("enclosedPerformance");
		}
	}
	
	/**
	 * @satisfies checkAcceptActionUsageSpecialization
	 * @satisfies checkSendActionUsageSpecialization
	 * @satisfies checkWhileLoopActionUsageSpecialization
	 */
	@Override
	protected String getDefaultSupertype() {
		return getDefaultSupertype("base");
	}
	
	@Override
	protected boolean isSuboccurrence() {
		return super.isSuboccurrence() && !isActionOwnedComposite();
	}
	
	/**
	 * @satisfies checkActionUsageSubactionSpecialization
	 * @satisfies checkAcceptActionUsageSubactionSpecialization
	 * @satisfies checkDecisionNodeSpecialization
	 * @satisfies checkForkNodeSpecialization
	 * @satisfies checkForLoopActionUsageSubactionSpecialization
	 * @satisfies checkIfActionUsageSubactionSpecialization
	 * @satisfies checkJoinNodeSpecialization
	 * @satisfies checkMergeNodeSpecialization
	 * @satisfies checkAssignmentActionUsageSubactionSpecialization
	 * @satisfies checkSendActionUsageSubactionSpecialization
	 * @satisfies checkWhileLoopActionUsageSubactionSpecialization
	 * @satisfies checkActionUsageOwnedActionSpecialization
	 * @satisfies checkStateUsageOwnedStateSpecialization
	 * 
	 */
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
		//checkActionUsageStateActionRedefinition
		String redefinedFeature = getRedefinedFeature(getTarget());
		return redefinedFeature != null? isComputeRedefinitions:
				super.isComputeRedefinitions();
	}
	
	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		ActionUsage target = getTarget();
		String redefinedFeature = getRedefinedFeature(target);
		return redefinedFeature == null? super.getRelevantFeatures(type):
			   type == target.getOwningType()? Collections.singletonList(target):
			   Collections.singletonList((Feature)getLibraryType(redefinedFeature));
	}
	
	/**
	 * @satisfies checkTransitionUsageTransitionFeatureSpecialization
	 */
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
