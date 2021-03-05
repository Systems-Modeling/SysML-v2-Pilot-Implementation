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

package org.omg.sysml.transformer;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.TransformationUtil;

public class TransitionUsageTransformer extends ActionUsageTransformer {

	public static final String TRANSITION_LINK_FEATURE = "TransitionPerformances::TransitionPerformance::transitionLink";

	public TransitionUsageTransformer(TransitionUsage element) {
		super(element);
	}
	
	@Override
	public TransitionUsage getElement() {
		return (TransitionUsage)super.getElement();
	}

	protected void updateTransitionLinkRedefinition(Feature transitionLinkFeature) {
		// the Redefinition computation part of the general implicit typing mechanism.
		Redefinition redefinition;
		EList<Redefinition> redefinitions = transitionLinkFeature.getOwnedRedefinition();
		if (redefinitions.isEmpty()) {
			redefinition = SysMLFactory.eINSTANCE.createRedefinition();
			redefinition.setRedefiningFeature(transitionLinkFeature);
			transitionLinkFeature.getOwnedRelationship_comp().add(redefinition);
		} else {
			redefinition = redefinitions.get(0);
		}
		redefinition.setRedefinedFeature((Feature)SysMLLibraryUtil.getLibraryType(getElement(), TRANSITION_LINK_FEATURE));
	}
	
	protected Feature getTransitionLinkFeature() {
		TransitionUsage transition = getElement();
		Feature transitionLinkFeature = TransformationUtil.getTransitionLinkFeatureOf(transition);
		if (transitionLinkFeature == null) {
			transitionLinkFeature = SysMLFactory.eINSTANCE.createFeature();
			TransformationUtil.addOwnedFeatureTo(transition, transitionLinkFeature);
			TransformationUtil.setTransitionLinkFeatureOf(transition, transitionLinkFeature);
		}
		updateTransitionLinkRedefinition(transitionLinkFeature);
		return transitionLinkFeature;
	}
	
	protected void computeReferenceConnector() {
		TransitionUsage transition = getElement();
		Succession succession = transition.getSuccession();
		ElementUtil.transform(succession);
		TransformationUtil.addBindingConnectorTo(transition, succession, getTransitionLinkFeature());
	}
	
	@Override
	public void transform() {
		// Note: Needs to come first, before clearing and recomputation of inheritance cache.
		computeReferenceConnector();		
		super.transform();
	}
	
}
