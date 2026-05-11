/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2024 Model Driven Solutions, Inc.
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

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.SuccessionAsUsage;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.UsageUtil;

public class ReferenceUsageAdapter extends UsageAdapter {

	public static final String TRANSITION_LINK_FEATURE = "TransitionPerformances::TransitionPerformance::transitionLink";

	public ReferenceUsageAdapter(ReferenceUsage element) {
		super(element);
	}
	
	@Override
	public ReferenceUsage getTarget() {
		return (ReferenceUsage)super.getTarget();
	}
	
	// Implicit Generalization
	
	/**
	 * @satisfies checkTransitionUsagePayloadSpecialization
	 */
	@Override
	public void addDefaultGeneralType() {
		ReferenceUsage target = getTarget();
		Type type = target.getOwningType();
		if (type instanceof TransitionUsage) {
			// checkTransitionUsagePayloadSpecialization
			if (target == UsageUtil.getPayloadParameterOf((TransitionUsage)type)) {
				Feature accepterParameter = UsageUtil.getAccepterPayloadParameterOf((TransitionUsage)type);
				if (accepterParameter != null) {
					addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubsetting(), 
							FeatureUtil.chainFeatures((Feature)accepterParameter.getOwningType(), accepterParameter));
					target.setDeclaredName(accepterParameter.getDeclaredName());
					return;
				}
			}
		} else if (type instanceof SuccessionAsUsage) {
			EList<Feature> ends = ((SuccessionAsUsage)type).getOwnedEndFeature();
			int i = ends.indexOf(target);
			if (i < 2 && target.getOwnedReferenceSubsetting() == null && 
					!TypeUtil.isImplicitSpecializationDeclaredFor(target, SysMLPackage.eINSTANCE.getReferenceSubsetting())) {
				if (i == 0) {
					TypeUtil.addImplicitGeneralTypeTo(target,
							SysMLPackage.eINSTANCE.getReferenceSubsetting(), 
							UsageUtil.getSourceFeature((SuccessionAsUsage)type));
				} else if (i == 1) {
					TypeUtil.addImplicitGeneralTypeTo(target,
							SysMLPackage.eINSTANCE.getReferenceSubsetting(), 
							UsageUtil.getTargetFeature((SuccessionAsUsage)type));
				}
			}
		}
		super.addDefaultGeneralType();
	}
	
	// Computed Redefinitions
	
	@Override
	protected void addRedefinitions(Element skip) {
		ReferenceUsage target = getTarget();
		Type type = target.getOwningType();
		if ((type instanceof TransitionUsage) && target == UsageUtil.getTransitionLinkFeatureOf((TransitionUsage)type)) {
			addImplicitGeneralType(SysMLPackage.eINSTANCE.getRedefinition(), 
					(Feature)SysMLLibraryUtil.getLibraryType(getTarget(), TRANSITION_LINK_FEATURE));
		} else {
			super.addRedefinitions(skip);
		}
	}
	
}
