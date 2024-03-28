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

package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DelegatingEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.ImplicitGeneralizationMap;
import org.omg.sysml.util.TypeUtil;


/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Invocation Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.InvocationExpressionImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.InvocationExpressionImpl#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvocationExpressionImpl extends ExpressionImpl implements InvocationExpression {
	
	/**
	 * The cached setting delegate for the '{@link #getArgument() <em>Argument</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ARGUMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.INVOCATION_EXPRESSION__ARGUMENT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocationExpressionImpl() {
		super();
	}
		
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.INVOCATION_EXPRESSION;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Expression> getArgument() {
		return (EList<Expression>)ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	// Additional overrides

	@Override
	public Function getFunction() {
		// TODO: Invoke expressions/features using subsetting instead of feature typing.
		Type type = ExpressionUtil.getExpressionTypeOf(this);
		return type instanceof Function? (Function)type:
			   type instanceof Expression? ((Expression)type).getFunction():
			   (Function)SysMLLibraryUtil.getLibraryType(this, 
					   ImplicitGeneralizationMap.getDefaultSupertypeFor(FunctionImpl.class, "base"));
	}

	// Operand mechanism
	
	/**
	 * Xtext workaround:
	 * "operand" is an additional property not in the normative abstract syntax, but added to the Ecore.
	 * It contains a list of direct containment references to arguments of this InvocationExpression.
	 * It allows for tractable parsing in Xtext of expressions with left-recursive syntax 
	 * (particularly operator expressions).
	 */
	protected EList<Expression> operand = null;
	
	/**
	 * Filter operands from the eContents of the InvocationExpression, because the referenced arguments will
	 * already be including via owning FeatureMemberships. 
	 */
	@Override
	public EList<EObject> eContents() {
		EClass eClass = eClass();
		EStructuralFeature[] containmentFeatures = ((EClassImpl.FeatureSubsetSupplier)eClass.getEAllStructuralFeatures()).containments();
		EStructuralFeature operandFeature = eClass.getEStructuralFeature(SysMLPackage.OPERATOR_EXPRESSION__OPERAND);
		EStructuralFeature[] nonOperandFeatures = new EStructuralFeature[containmentFeatures.length - 1];
		int i = 0;
		for (EStructuralFeature feature: containmentFeatures) {
			if (feature != operandFeature) {
				nonOperandFeatures[i] = feature;
				i++;
			}
		}
		return new EContentsEList<>(this, nonOperandFeatures);
	}

	/**
	 * Use a special OperandEList so that operands inserted into the list are automatically actually added
	 * as owned features.
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<Expression> getOperand() {
		if (operand == null) {
			operand = new OperandEList();
		}
		return operand;
	}
	
	private class OperandEList extends DelegatingEList<Expression> implements InternalEList<Expression> {
		private static final long serialVersionUID = 1L;

		@Override
		protected List<Expression> delegateList() {
			return getArgument();
		}

		@Override
		protected void delegateAdd(Expression object) {
			TypeUtil.addOwnedParameterTo(InvocationExpressionImpl.this, object).
				setVisibility(VisibilityKind.PRIVATE);
		}

		@Override
		protected void delegateAdd(int i, Expression object) {
			throw new UnsupportedOperationException();
		}

		@Override
		public Expression remove(int i) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean remove(Object object) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void clear() {

		}

		@Override
		public Object[] basicToArray() {
			return delegateToArray();
		}

		@Override
		public <T> T[] basicToArray(T[] array) {
			return delegateToArray(array);
		}

		@Override
		public int basicIndexOf(Object object) {
			return delegateIndexOf(object);
		}

		@Override
		public int basicLastIndexOf(Object object) {
			return delegateLastIndexOf(object);
		}

		@Override
		public boolean basicContains(Object object) {
			return delegateContains(object);
		}

		@Override
		public boolean basicContainsAll(Collection<?> collection) {
			return delegateContainsAll(collection);
		}

		@Override
		public NotificationChain basicRemove(Object object, NotificationChain notifications) {
			remove(object);
			return notifications;
		}

		@Override
		public NotificationChain basicAdd(Expression object, NotificationChain notifications) {
			add(object);
			return notifications;
		}

		@Override
		public Expression basicGet(int i) {
			return super.basicGet(i);
		}

		@Override
		public List<Expression> basicList() {
			return super.basicList();
		}

		@Override
		public Iterator<Expression> basicIterator() {
			return super.basicIterator();
		}

		@Override
		public ListIterator<Expression> basicListIterator() {
			return super.basicListIterator();
		}

		@Override
		public ListIterator<Expression> basicListIterator(int i) {
			return super.basicListIterator(i);
		}
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
			case SysMLPackage.INVOCATION_EXPRESSION__ARGUMENT:
				return getArgument();
			case SysMLPackage.INVOCATION_EXPRESSION__OPERAND:
				return getOperand();
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
			case SysMLPackage.INVOCATION_EXPRESSION__OPERAND:
				getOperand().clear();
				getOperand().addAll((Collection<? extends Expression>)newValue);
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
			case SysMLPackage.INVOCATION_EXPRESSION__OPERAND:
				getOperand().clear();
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
				return ARGUMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.INVOCATION_EXPRESSION__OPERAND:
				return !getOperand().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // InvocationExpressionImpl
