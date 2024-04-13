/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022, 2024 Model Driven Solutions, Inc.
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

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.ImplicitGeneralizationMap;
import org.omg.sysml.util.TypeUtil;

public class ExpressionAdapter extends StepAdapter {

	public static final String EXPRESSION_GUARD_FEATURE = "TransitionPerformances::TransitionPerformance::guard";

	public ExpressionAdapter(Expression element) {
		super(element);
	}
	
	@Override
	public Expression getTarget() {
		return (Expression)super.getTarget();
	}
	
	// Utility
	
	// May be overridden in subclasses
	public Type getExpressionType() {
		return getTarget().getFunction();
	}		
	
	// May be overridden in subclasses
	public List<Feature> getTypeParameters() {
		Type type = getExpressionType();
		return type == null? Collections.emptyList():
			   type.getInput().stream().
				filter(input->FeatureUtil.isParameter(input) && input.getOwner() == type).
				collect(Collectors.toList());
	}
	
	// Inheritence
	
	@Override
	public Collection<Feature> getFeaturesRedefinedByType() {
		Collection<Feature> features = super.getFeaturesRedefinedByType();
		
		// If inputs and outputs have not been computed, add effectively
		// redefined features from the Expression type, without actually
		// computing the inputs and outputs.
		Expression target = getTarget();
		if (target.getInput().isEmpty()) {
			features.addAll(ExpressionUtil.getTypeParametersOf(target));
		}
		if (target.getOutput().isEmpty()) {
			Type exprType = ExpressionUtil.getExpressionTypeOf(target);
			if (exprType instanceof Function || exprType instanceof Expression) {
				Feature result = TypeUtil.getOwnedResultParameterOf(exprType);
				if (result != null) {
					features.add(result);
				}
			}
		}
		
		return features;
	}

	// Implicit Generalization
	
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

	@Override
	protected String getDefaultSupertype() {
		return getDefaultSupertype("base");
	}
	
	// Computed Redefinition

	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type, Element skip) {
		Expression target = getTarget();
		Type owningType = target.getOwningType();
		return ExpressionUtil.isTransitionGuard(target)?
					type == owningType? Collections.singletonList(target):
					Collections.singletonList((Feature)getLibraryType(EXPRESSION_GUARD_FEATURE)):
			   owningType instanceof FeatureValue? Collections.emptyList():
			   super.getRelevantFeatures(type, skip);
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

	protected Feature createFeatureForParameter(Feature parameter) {
		if (parameter == null) {
			return null;
		} else {
			Feature feature = SysMLFactory.eINSTANCE.createFeature();
			feature.setDirection(parameter.getDirection());
			
			FeatureMembership membership = SysMLFactory.eINSTANCE.createParameterMembership();
			membership.setOwnedMemberFeature(feature);
			
			Expression expression = getTarget();
			expression.getOwnedRelationship().add(membership);
			
			return feature;
		}
	}
	
	@Override
	public void addAdditionalMembers() {
		TypeUtil.addResultParameterTo(getTarget());
	}
	
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
