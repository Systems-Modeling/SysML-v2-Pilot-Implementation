/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2022, 2025 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.ImplicitGeneralizationMap;
import org.omg.sysml.util.TypeUtil;

public class FeatureChainExpressionAdapter extends OperatorExpressionAdapter {

	public FeatureChainExpressionAdapter(FeatureChainExpression element) {
		super(element);
	}
	
	@Override
	public FeatureChainExpression getTarget() {
		return (FeatureChainExpression)super.getTarget();
	}

	/**
	 * @satisfies checkFeatureChainExpressionResultSpecialization
	 */
	@Override
	protected void addResultTyping() {
		FeatureChainExpression target = getTarget();
		Feature result = target.getResult();
		Feature sourceTarget = target.sourceTargetFeature();
		if (result != null && sourceTarget != null) {
			Feature sourceParameter = target.getOwnedFeature().stream().
					filter(param->param.getDirection() == FeatureDirectionKind.IN).
					findFirst().orElse(null);
			if (sourceParameter != null) {
				TypeUtil.addImplicitGeneralTypeTo(result,
						SysMLPackage.eINSTANCE.getSubsetting(), 
							FeatureUtil.chainFeatures(sourceParameter, sourceTarget));
			}
		}
	}
	
	@Override
	public void addAdditionalMembers() {
		super.addAdditionalMembers();
		
		// Add sourceTarget feature.
		FeatureChainExpression target = getTarget();
		Feature sourceParameter = TypeUtil.getOwnedParameterOf(target, 0, Feature.class);
		if (sourceParameter != null) {
			if (sourceParameter.getOwnedFeature().isEmpty()) {
				Feature sourceTarget = SysMLFactory.eINSTANCE.createFeature();
				sourceTarget.setDeclaredName(""); // To avoid effective naming.
				TypeUtil.addOwnedFeatureTo(sourceParameter, sourceTarget);
			}
		}
	}
	
	/**
	 * @satisfies checkFeatureChainExpressionTargetRedefinition
	 * @satisfies checkFeatureChainExpressionSourceTargetRedefinition
	 */
	protected void addTargetRedefinition() {
		FeatureChainExpression target = getTarget();
		Feature sourceParameter = TypeUtil.getOwnedParameterOf(target, 0, Feature.class);
		if (sourceParameter != null) {
			Feature sourceTarget = target.sourceTargetFeature();
			TypeUtil.addImplicitGeneralTypeTo(sourceTarget,
					SysMLPackage.eINSTANCE.getRedefinition(),
					//checkFeatureChainExpressionTargetRedefinition
					getLibraryType(ImplicitGeneralizationMap.getDefaultSupertypeFor(target.getClass(), "target")));
			//checkFeatureChainExpressionSourceTargetRedefinition
			TypeUtil.addImplicitGeneralTypeTo(sourceTarget,
					SysMLPackage.eINSTANCE.getRedefinition(), target.getTargetFeature());
			TypeUtil.setIsAddImplicitGeneralTypesFor(sourceTarget, false);
		}
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		addTargetRedefinition();
	}
	
}
