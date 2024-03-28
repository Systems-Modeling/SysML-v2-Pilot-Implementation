/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2023 Model Driven Solutions, Inc.
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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.BooleanExpression;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintUsageImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintUsageImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintUsageImpl#isModelLevelEvaluable <em>Is Model Level Evaluable</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintUsageImpl#getConstraintDefinition <em>Constraint Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintUsageImpl extends OccurrenceUsageImpl implements ConstraintUsage {
	
	/**
	 * The cached setting delegate for the '{@link #getParameter() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PARAMETER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.STEP__PARAMETER).getSettingDelegate();
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
	 * The cached setting delegate for the '{@link #getConstraintDefinition() <em>Constraint Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONSTRAINT_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.CONSTRAINT_USAGE__CONSTRAINT_DEFINITION).getSettingDelegate();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONSTRAINT_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getParameter() {
		return (EList<Feature>)PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameter() {
		return !getParameter().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getConstraintDefinition() {
		return (Predicate)CONSTRAINT_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate basicGetConstraintDefinition() {
		return (Predicate)CONSTRAINT_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintDefinition(Predicate newConstraintDefinition) {
		CONSTRAINT_DEFINITION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newConstraintDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraintDefinition() {
		return basicGetConstraintDefinition() != null;
	}

	/**
	 * The cached invocation delegate for the '{@link #modelLevelEvaluable(org.eclipse.emf.common.util.EList) <em>Model Level Evaluable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #modelLevelEvaluable(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate MODEL_LEVEL_EVALUABLE_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.EXPRESSION___MODEL_LEVEL_EVALUABLE__ELIST).getInvocationDelegate();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getDirectedFeature() {
		return getParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectedFeature() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getFunction() {
		return getPredicate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetFunction() {
		return basicGetPredicate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Function newFunction) {
		if (newFunction != null && !(newFunction instanceof Predicate)) {
			throw new IllegalArgumentException("newFunction must be an instance of Predicate");
		}
		setPredicate((Predicate) newFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFunction() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate getPredicate() {
		return getConstraintDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate basicGetPredicate() {
		return basicGetConstraintDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(Predicate newPredicate) {
		setConstraintDefinition(newPredicate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredicate() {
  		return false;
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
	 * @generated
	 */
	public boolean modelLevelEvaluable(EList<Feature> visited) {
		try {
			return (Boolean)MODEL_LEVEL_EVALUABLE_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{visited}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #evaluate(org.omg.sysml.lang.sysml.Element) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #evaluate(org.omg.sysml.lang.sysml.Element)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EVALUATE_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.EXPRESSION___EVALUATE__ELEMENT).getInvocationDelegate();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Element> evaluate(Element target) {
		try {
			return (EList<Element>)EVALUATE_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{target}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #checkCondition(org.omg.sysml.lang.sysml.Element) <em>Check Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #checkCondition(org.omg.sysml.lang.sysml.Element)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CHECK_CONDITION_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.EXPRESSION___CHECK_CONDITION__ELEMENT).getInvocationDelegate();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkCondition(Element target) {
		try {
			return (Boolean)CHECK_CONDITION_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{target}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CONSTRAINT_USAGE__BEHAVIOR:
				return getBehavior();
			case SysMLPackage.CONSTRAINT_USAGE__PARAMETER:
				return getParameter();
			case SysMLPackage.CONSTRAINT_USAGE__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case SysMLPackage.CONSTRAINT_USAGE__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
			case SysMLPackage.CONSTRAINT_USAGE__IS_MODEL_LEVEL_EVALUABLE:
				return isModelLevelEvaluable();
			case SysMLPackage.CONSTRAINT_USAGE__PREDICATE:
				if (resolve) return getPredicate();
				return basicGetPredicate();
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_DEFINITION:
				if (resolve) return getConstraintDefinition();
				return basicGetConstraintDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.CONSTRAINT_USAGE__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__FUNCTION:
				setFunction((Function)newValue);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__RESULT:
				setResult((Feature)newValue);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__IS_MODEL_LEVEL_EVALUABLE:
				setIsModelLevelEvaluable((Boolean)newValue);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__PREDICATE:
				setPredicate((Predicate)newValue);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_DEFINITION:
				setConstraintDefinition((Predicate)newValue);
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
			case SysMLPackage.CONSTRAINT_USAGE__BEHAVIOR:
				getBehavior().clear();
				return;
			case SysMLPackage.CONSTRAINT_USAGE__PARAMETER:
				getParameter().clear();
				return;
			case SysMLPackage.CONSTRAINT_USAGE__FUNCTION:
				setFunction((Function)null);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__RESULT:
				setResult((Feature)null);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__IS_MODEL_LEVEL_EVALUABLE:
				IS_MODEL_LEVEL_EVALUABLE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__PREDICATE:
				setPredicate((Predicate)null);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_DEFINITION:
				setConstraintDefinition((Predicate)null);
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
			case SysMLPackage.CONSTRAINT_USAGE__DIRECTED_FEATURE:
				return isSetDirectedFeature();
			case SysMLPackage.CONSTRAINT_USAGE__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.CONSTRAINT_USAGE__PARAMETER:
				return isSetParameter();
			case SysMLPackage.CONSTRAINT_USAGE__FUNCTION:
				return isSetFunction();
			case SysMLPackage.CONSTRAINT_USAGE__RESULT:
				return RESULT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.CONSTRAINT_USAGE__IS_MODEL_LEVEL_EVALUABLE:
				return IS_MODEL_LEVEL_EVALUABLE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.CONSTRAINT_USAGE__PREDICATE:
				return isSetPredicate();
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_DEFINITION:
				return isSetConstraintDefinition();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Step.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONSTRAINT_USAGE__BEHAVIOR: return SysMLPackage.STEP__BEHAVIOR;
				case SysMLPackage.CONSTRAINT_USAGE__PARAMETER: return SysMLPackage.STEP__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONSTRAINT_USAGE__FUNCTION: return SysMLPackage.EXPRESSION__FUNCTION;
				case SysMLPackage.CONSTRAINT_USAGE__RESULT: return SysMLPackage.EXPRESSION__RESULT;
				case SysMLPackage.CONSTRAINT_USAGE__IS_MODEL_LEVEL_EVALUABLE: return SysMLPackage.EXPRESSION__IS_MODEL_LEVEL_EVALUABLE;
				default: return -1;
			}
		}
		if (baseClass == BooleanExpression.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONSTRAINT_USAGE__PREDICATE: return SysMLPackage.BOOLEAN_EXPRESSION__PREDICATE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Step.class) {
			switch (baseFeatureID) {
				case SysMLPackage.STEP__BEHAVIOR: return SysMLPackage.CONSTRAINT_USAGE__BEHAVIOR;
				case SysMLPackage.STEP__PARAMETER: return SysMLPackage.CONSTRAINT_USAGE__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (baseFeatureID) {
				case SysMLPackage.EXPRESSION__FUNCTION: return SysMLPackage.CONSTRAINT_USAGE__FUNCTION;
				case SysMLPackage.EXPRESSION__RESULT: return SysMLPackage.CONSTRAINT_USAGE__RESULT;
				case SysMLPackage.EXPRESSION__IS_MODEL_LEVEL_EVALUABLE: return SysMLPackage.CONSTRAINT_USAGE__IS_MODEL_LEVEL_EVALUABLE;
				default: return -1;
			}
		}
		if (baseClass == BooleanExpression.class) {
			switch (baseFeatureID) {
				case SysMLPackage.BOOLEAN_EXPRESSION__PREDICATE: return SysMLPackage.CONSTRAINT_USAGE__PREDICATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Step.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (baseOperationID) {
				case SysMLPackage.EXPRESSION___MODEL_LEVEL_EVALUABLE__ELIST: return SysMLPackage.CONSTRAINT_USAGE___MODEL_LEVEL_EVALUABLE__ELIST;
				case SysMLPackage.EXPRESSION___EVALUATE__ELEMENT: return SysMLPackage.CONSTRAINT_USAGE___EVALUATE__ELEMENT;
				case SysMLPackage.EXPRESSION___CHECK_CONDITION__ELEMENT: return SysMLPackage.CONSTRAINT_USAGE___CHECK_CONDITION__ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == BooleanExpression.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case SysMLPackage.CONSTRAINT_USAGE___MODEL_LEVEL_EVALUABLE__ELIST:
				return modelLevelEvaluable((EList<Feature>)arguments.get(0));
			case SysMLPackage.CONSTRAINT_USAGE___EVALUATE__ELEMENT:
				return evaluate((Element)arguments.get(0));
			case SysMLPackage.CONSTRAINT_USAGE___CHECK_CONDITION__ELEMENT:
				return checkCondition((Element)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConstraintUsageImpl
