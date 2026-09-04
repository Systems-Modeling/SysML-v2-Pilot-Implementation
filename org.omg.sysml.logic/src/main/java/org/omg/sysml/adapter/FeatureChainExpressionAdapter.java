/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2022, 2025 Model Driven Solutions, Inc.
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
