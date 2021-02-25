/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionFeatureKind;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ImplicitFeatureRelationships;

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
	 * The default value of the '{@link #isModelLevelEvaluable() <em>Is Model Level Evaluable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModelLevelEvaluable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MODEL_LEVEL_EVALUABLE_EDEFAULT = false;
	public static final String EXPRESSION_SUBSETTING_BASE_DEFAULT = "Performances::evaluations";
	public static final String EXPRESSION_SUBSETTING_PERFORMANCE_DEFAULT = "Performances::Performance::subevaluations";
	public static final String EXPRESSION_GUARD_FEATURE = "TransitionPerformances::TransitionPerformance::guard";
	
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
		Function function = basicGetFunction();
		return function != null && function.eIsProxy() ? (Function)eResolveProxy((InternalEObject)function) : function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Function basicGetFunction() {
		return (Function)super.getBehavior().stream().
				filter(Function.class::isInstance).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setFunction(Function newFunction) {
		throw new UnsupportedOperationException();
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
	protected String getDefaultSupertype() {
		return isSubperformance()?
				EXPRESSION_SUBSETTING_PERFORMANCE_DEFAULT:
				EXPRESSION_SUBSETTING_BASE_DEFAULT;
	}

	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		Type owningType = getOwningType();
		return isTransitionGuard()?
					type == owningType? Collections.singletonList(this):
					Collections.singletonList((Feature)getDefaultType(EXPRESSION_GUARD_FEATURE)):
			   owningType instanceof FeatureValue? Collections.emptyList():
			   super.getRelevantFeatures(type);
	}
	
	@Override
	protected List<Type> getGeneralTypes(Type type, Element skip) {
		Type owningType = getOwningType();
		return isTransitionGuard() && type == owningType?
				Collections.singletonList(getDefaultType(TransitionUsageImpl.TRANSITION_USAGE_SUBSETTING_DEFAULT)):
				super.getGeneralTypes(type, skip);
	}
	
	protected boolean isTransitionGuard() {
		FeatureMembership membership = getOwningFeatureMembership();
		return (membership instanceof TransitionFeatureMembership) &&
				((TransitionFeatureMembership)membership).getKind() == TransitionFeatureKind.GUARD;
	}
		
	@Override 
	public EList<Feature> getInput() {
		return super.getOwnedInput();
	}
	
	protected void computeInput() {
		if (getInput().isEmpty()) {
			for (Feature parameter: getTypeParameters()) {
				createFeatureForParameter(parameter);
			}
		}
	}
	
	protected List<Feature> getTypeParameters() {
		Type type = getExpressionType();
		return type == null? Collections.emptyList():
			   type.getInput().stream().
				filter(input->((FeatureImpl)input).isParameter() && input.getOwner() == type).
				collect(Collectors.toList());
	}
	
	public Type getExpressionType() {
		return getFunction();
	}
	
	@Override
	public EList<Feature> getOutput() {
		return super.getOwnedOutput();
	}
	
	protected void computeOutput() {
		if (getOutput().isEmpty()) {
			Feature parameter = SysMLFactory.eINSTANCE.createFeature();
			ParameterMembership membership = SysMLFactory.eINSTANCE.createReturnParameterMembership();
			membership.setOwnedMemberParameter_comp(parameter);
			membership.setMemberName("$result");
			getOwnedFeatureMembership_comp().add(membership);
		}		
	}
			
	protected Feature createFeatureForParameter(Feature parameter) {
		if (parameter == null) {
			return null;
		} else {
			Feature feature = SysMLFactory.eINSTANCE.createFeature();
			FeatureMembership membership = SysMLFactory.eINSTANCE.createParameterMembership();
			membership.setOwnedMemberFeature_comp(feature);
			membership.setMemberName("$" + parameter.getName());
			getOwnedFeatureMembership_comp().add(membership);
			FeatureMembership parameterMembership = parameter.getOwningFeatureMembership();
			if (parameterMembership != null) {
				membership.setDirection(parameterMembership.getDirection());
			}			
			return feature;
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getResult() {
		Feature result = basicGetResult();
		return result != null && result.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)result) : result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetResult() {
		return getOwnedResultParameter();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setResult(Feature newResult) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isModelLevelEvaluable() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setIsModelLevelEvaluable(boolean newIsModelLevelEvaluable) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Element> evaluate(Element target) {
		return new BasicEList<>();
	}

	@Override
	public Collection<Feature> getFeaturesRedefinedByType() {
		Collection<Feature> features = super.getFeaturesRedefinedByType();
		
		// If inputs and outputs have not been computed, add effectively
		// redefined features from the Expression type, without actually
		// computing the inputs and outputs.
		if (getInput().isEmpty()) {
			features.addAll(getTypeParameters());
		}
		if (getOutput().isEmpty()) {
			Type type = getExpressionType();
			if (type instanceof Function || type instanceof Expression) {
				Feature result = ((TypeImpl)type).getOwnedResultParameter();
				if (result != null) {
					features.add(result);
				}
			}
		}
		
		return features;
	}
	
	// Utility methods
	
	@Override
	public void transform() {
		super.transform();
		if (getOwningNamespace() instanceof Multiplicity || getOwningMembership() instanceof FeatureValue) {
			ImplicitFeatureRelationships.getOrCreateAdapter(this).
				addImplicitFeaturingTypes();
		}
		computeInput();
		computeOutput();
	}
		
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
				setIsModelLevelEvaluable(IS_MODEL_LEVEL_EVALUABLE_EDEFAULT);
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
				return basicGetResult() != null;
			case SysMLPackage.EXPRESSION__IS_MODEL_LEVEL_EVALUABLE:
				return isModelLevelEvaluable() != IS_MODEL_LEVEL_EVALUABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.EXPRESSION___EVALUATE__ELEMENT:
				return evaluate((Element)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExpressionImpl
