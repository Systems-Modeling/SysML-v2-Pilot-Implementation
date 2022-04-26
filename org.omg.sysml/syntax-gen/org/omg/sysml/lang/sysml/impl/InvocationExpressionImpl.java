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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.expressions.ModelLevelFunction;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.ImplicitGeneralizationMap;


/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Invocation Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.InvocationExpressionImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvocationExpressionImpl extends ExpressionImpl implements InvocationExpression {
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocationExpressionImpl() {
		super();
	}

	@Override
	public boolean isModelLevelEvaluable() {
		return functionIsModelLevelEvaluable() && argumentsAreModelLevelEvaluable();
	}
	
	public boolean functionIsModelLevelEvaluable() {
		Function function = getFunction();
		return function != null && function.isModelLevelEvaluable();
	}
	
	public boolean argumentsAreModelLevelEvaluable() {
		for (Expression argument: getArgument()) {
			if (!argument.isModelLevelEvaluable()) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public EList<Element> evaluate(Element target) {
		ModelLevelFunction function = getModelLevelFunctionImpl();
		return function == null? null: function.invoke(this, target);
	}
	
	protected ModelLevelFunction getModelLevelFunctionImpl() {
		return ModelLevelFunction.getFunctionImpl(getFunction());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.INVOCATION_EXPRESSION;
	}
	
	@Override
	public Function getFunction() {
		Type type = ExpressionUtil.getExpressionTypeOf(this);
		return type instanceof Function? (Function)type:
			   type instanceof Expression? ((Expression)type).getFunction():
			   (Function)SysMLLibraryUtil.getLibraryType(this, 
					   ImplicitGeneralizationMap.getDefaultSupertypeFor(FunctionImpl.class, "base"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getArgument() {
		return new DerivedEObjectEList<Expression>(Expression.class, this, SysMLPackage.INVOCATION_EXPRESSION__ARGUMENT, new int[] {SysMLPackage.INVOCATION_EXPRESSION__OWNED_FEATURE});
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.INVOCATION_EXPRESSION__ARGUMENT:
				return getArgument();
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
			case SysMLPackage.INVOCATION_EXPRESSION__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends Expression>)newValue);
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
			case SysMLPackage.INVOCATION_EXPRESSION__ARGUMENT:
				getArgument().clear();
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
			case SysMLPackage.INVOCATION_EXPRESSION__ARGUMENT:
				return !getArgument().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public List<? extends Feature> getArguments() {
		return super.getOwnedFeature();
	}

} // InvocationExpressionImpl
