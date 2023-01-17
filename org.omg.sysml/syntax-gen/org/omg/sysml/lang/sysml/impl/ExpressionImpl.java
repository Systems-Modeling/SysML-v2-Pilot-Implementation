/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ExpressionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ExpressionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ExpressionImpl#isModelLevelEvaluable <em>Is Model Level Evaluable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends StepImpl implements Expression {
	
	/**
	 * The cached setting delegate for the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FUNCTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.EXPRESSION__FUNCTION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getResult() <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RESULT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.EXPRESSION__RESULT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #isModelLevelEvaluable() <em>Is Model Level Evaluable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModelLevelEvaluable()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_MODEL_LEVEL_EVALUABLE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.EXPRESSION__IS_MODEL_LEVEL_EVALUABLE).getSettingDelegate();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getFunction() {
		return (Function)FUNCTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetFunction() {
		return (Function)FUNCTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(Function newFunction) {
		FUNCTION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFunction() {
		return basicGetFunction() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Behavior> getBehavior() {
		EList<Behavior> behavior = new UniqueEList<Behavior>();
		Function function = getFunction();
		if (function != null) {
			behavior.add(function);
		}
		return new UnionEObjectEList<Behavior>(this, SysMLPackage.Literals.STEP__BEHAVIOR, behavior.size(), behavior.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBehavior() {
  		return false;
	}
	
	@Override 
	public EList<Feature> getInput() {
		// Only owned inputs
		EList<Feature> inputs = new BasicInternalEList<Feature>(Feature.class);
		// Note: Using directionOf causes an infinite recursion.
		getOwnedFeature().stream().
			filter(feature->
				FeatureDirectionKind.IN == feature.getDirection() || 
				FeatureDirectionKind.INOUT == feature.getDirection()).
			forEachOrdered(inputs::add);
		return inputs;
	}
	
	@Override
	public EList<Feature> getOutput() {
		// Only owned outputs
		EList<Feature> outputs = new BasicInternalEList<Feature>(Feature.class);
		// Note: Using directionOf causes an infinite recursion.
		getOwnedFeature().stream().
			filter(feature->
				FeatureDirectionKind.OUT == feature.getDirection() || 
				FeatureDirectionKind.INOUT == feature.getDirection()).
				forEachOrdered(outputs::add);
		return outputs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getResult() {
		return (Feature)RESULT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetResult() {
		return (Feature)RESULT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResult(Feature newResult) {
		RESULT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newResult);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isModelLevelEvaluable() {
		return (Boolean)IS_MODEL_LEVEL_EVALUABLE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsModelLevelEvaluable(boolean newIsModelLevelEvaluable) {
		IS_MODEL_LEVEL_EVALUABLE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newIsModelLevelEvaluable);
	}
	
	// Operations
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean modelLevelEvaluable(EList<Feature> visited) {
		List<Feature> parameters = TypeUtil.getAllParametersOf(this);
		if (!parameters.stream().allMatch(
				param->directionOf(param) == FeatureDirectionKind.IN && 
				FeatureUtil.getValuationFor(param) == null)) {
			return false;
		} else {
			Expression resultExpression = ExpressionUtil.getResultExpressionOf(this);
			return resultExpression == null || resultExpression.modelLevelEvaluable(visited);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Element> evaluate(Element target) {
		return new BasicEList<>();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean checkCondition(Element target) {
		return ExpressionUtil.checkConditionOn(target, this);
	}

	// Other

	@Override
	public Collection<Feature> getFeaturesRedefinedByType() {
		Collection<Feature> features = super.getFeaturesRedefinedByType();
		
		// If inputs and outputs have not been computed, add effectively
		// redefined features from the Expression type, without actually
		// computing the inputs and outputs.
		if (getInput().isEmpty()) {
			features.addAll(ExpressionUtil.getTypeParametersOf(this));
		}
		if (getOutput().isEmpty()) {
			Type type = ExpressionUtil.getExpressionTypeOf(this);
			if (type instanceof Function || type instanceof Expression) {
				Feature result = TypeUtil.getOwnedResultParameterOf(type);
				if (result != null) {
					features.add(result);
				}
			}
		}
		
		return features;
	}
	
	//
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.EXPRESSION__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case SysMLPackage.EXPRESSION__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
			case SysMLPackage.EXPRESSION__IS_MODEL_LEVEL_EVALUABLE:
				return isModelLevelEvaluable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.EXPRESSION__FUNCTION:
				setFunction((Function)newValue);
				return;
			case SysMLPackage.EXPRESSION__RESULT:
				setResult((Feature)newValue);
				return;
			case SysMLPackage.EXPRESSION__IS_MODEL_LEVEL_EVALUABLE:
				setIsModelLevelEvaluable((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.EXPRESSION__FUNCTION:
				setFunction((Function)null);
				return;
			case SysMLPackage.EXPRESSION__RESULT:
				setResult((Feature)null);
				return;
			case SysMLPackage.EXPRESSION__IS_MODEL_LEVEL_EVALUABLE:
				IS_MODEL_LEVEL_EVALUABLE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.EXPRESSION__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.EXPRESSION__FUNCTION:
				return isSetFunction();
			case SysMLPackage.EXPRESSION__RESULT:
				return RESULT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.EXPRESSION__IS_MODEL_LEVEL_EVALUABLE:
				return IS_MODEL_LEVEL_EVALUABLE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.EXPRESSION___MODEL_LEVEL_EVALUABLE__ELIST:
				return modelLevelEvaluable((EList<Feature>)arguments.get(0));
			case SysMLPackage.EXPRESSION___EVALUATE__ELEMENT:
				return evaluate((Element)arguments.get(0));
			case SysMLPackage.EXPRESSION___CHECK_CONDITION__ELEMENT:
				return checkCondition((Element)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExpressionImpl
