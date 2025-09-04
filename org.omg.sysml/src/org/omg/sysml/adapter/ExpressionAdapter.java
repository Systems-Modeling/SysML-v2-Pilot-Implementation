/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022, 2024-2025 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.ImplicitGeneralizationMap;

public class ExpressionAdapter extends StepAdapter {

	public static final String EXPRESSION_GUARD_FEATURE = "TransitionPerformances::TransitionPerformance::guard";

	public ExpressionAdapter(Expression element) {
		super(element);
	}
	
	@Override
	public Expression getTarget() {
		return (Expression)super.getTarget();
	}
	
	// Implicit Generalization
	
	/**
	 * @satisfies checkStepOwnedPerformanceSpecialization
	 * @satisfies checkStepSubperformanceSpecialization
	 * @satisfies checkStepEnclosedPerformanceSpecialization
	 * 
	 * Note: These are satisfied by getDefaultSupertype in StepAdapter, 
	 * which is overridden in ExpressionAdapater.
	 */
	@Override
	public void addDefaultGeneralType() {
		super.addDefaultGeneralType();
		if (isStructureOwnedComposite()) {
			addDefaultGeneralType("ownedPerformance");
		}
		if (isBehaviorOwnedComposite()) {
			addDefaultGeneralType("subperformance");
		}
		if (isBehaviorOwned()) {
			addDefaultGeneralType("enclosedPerformance");
		}
	}
	
	/**
	 * @satisfies checkExpressionSpecialization
	 */
	@Override
	protected String getDefaultSupertype() {
		return getDefaultSupertype("base");
	}
	
	// Computed Redefinition

	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		Expression target = getTarget();
		Type owningType = target.getOwningType();
		return ExpressionUtil.isTransitionGuard(target)?
					type == owningType? Collections.singletonList(target):
					Collections.singletonList((Feature)getLibraryType(EXPRESSION_GUARD_FEATURE)):
			   owningType instanceof FeatureValue? Collections.emptyList():
			   super.getRelevantFeatures(type);
	}
	
	@Override
	protected List<Type> getGeneralTypes(Type type, Element skip) {
		Expression target = getTarget();
		Type owningType = target.getOwningType();
		return ExpressionUtil.isTransitionGuard(target) && type == owningType?
				Collections.singletonList(getLibraryType(ImplicitGeneralizationMap.getDefaultSupertypeFor(type.getClass(), "base"))):
				super.getGeneralTypes(type, skip);
	}
	
	// Transformation
	
	/**
	 * @satisfies checkExpressionTypeFeaturing
	 * @satisfies checkExpressionResultBindingConnector
	 * @satisfies checkMultiplicityRangeExpressionTypeFeaturing
	 */
	@Override
	public void doTransform() {
		Expression expression = getTarget();
		super.doTransform();
		if (expression.getOwningNamespace() instanceof Multiplicity || 
				expression.getOwningMembership() instanceof FeatureValue) {
			addImplicitFeaturingTypesIfNecessary();
		}
		createResultConnector(expression.getResult());
	}
		
}
