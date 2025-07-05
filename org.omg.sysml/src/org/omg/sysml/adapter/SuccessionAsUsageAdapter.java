/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024, 2025 Model Driven Solutions, Inc.
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.DecisionNode;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.MergeNode;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SuccessionAsUsage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.UsageUtil;

public class SuccessionAsUsageAdapter extends SuccessionAdapter {

	public SuccessionAsUsageAdapter(SuccessionAsUsage feature) {
		super(feature);
	}
	
	@Override
	public SuccessionAsUsage getTarget() {
		return (SuccessionAsUsage)super.getTarget();
	}
	
	@Override
	protected void addContextFeaturingType() {
		SuccessionAsUsage target = getTarget();
		Namespace owningNamespace = target.getOwningNamespace();
		if (owningNamespace instanceof TransitionUsage && ((TransitionUsage)owningNamespace).getSuccession() == target) {
			ElementUtil.transform(owningNamespace);
			addFeaturingTypes(((TransitionUsage)owningNamespace).getFeaturingType());
		}
	}
	
	@Override
	public void addDefaultGeneralType() {
		super.addDefaultGeneralType();
		addDecisionNodeOutgoingSuccessionSpecialization();
		addMergeNodeIncomingSuccessionSpecialization();
	}
	
	/**
	 * @satisfies checkDecisionNodeOutgoingSuccessionSpecialization
	 * 
	 * TODO: Update checkDecisionNodeOutgoingSuccessionSpecialization
	 * 
	 * OCL refers to MergePerformance::outgoingHBLink rather than DecisionPerformance::outgoingHBLink.
	 * See SYSML21-306
	 */
	protected void addDecisionNodeOutgoingSuccessionSpecialization() {
		SuccessionAsUsage succession = getTarget();
		// Note: Use utility method to get source feature, to avoid infinite recursion.
		Feature sourceFeature = UsageUtil.getSourceOf(succession);
		if (sourceFeature instanceof DecisionNode) {
			addImplicitGeneralType(getSpecializationEClass(), 
					FeatureUtil.chainFeatures(sourceFeature, (Feature)getLibraryType(getDefaultSupertype("decision"))));
		}
	}
	
	/**
	 * @satisfies checkMergeNodeIncomingSuccessionSpecialization
	 */
	protected void addMergeNodeIncomingSuccessionSpecialization() {
		SuccessionAsUsage succession = getTarget();
		// Note: Use utility method to get target feature, to avoid infinite recursion.
		Feature targetFeature = UsageUtil.getTargetOf(succession);
		if (targetFeature instanceof MergeNode) {
			addImplicitGeneralType(getSpecializationEClass(), 
					FeatureUtil.chainFeatures(targetFeature, (Feature)getLibraryType(getDefaultSupertype("merge"))));
		}
	}

}
