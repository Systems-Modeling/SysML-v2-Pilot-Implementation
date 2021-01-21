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

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.SendActionUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SendActionUsageImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendActionUsageImpl extends TransferActionUsageImpl implements SendActionUsage {
	/**
	 * The cached value of the BindingConnector from the result of the target Expression of this SendAction to 
	 * its ItemFeature.
	 */
	protected BindingConnector targetConnector = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SEND_ACTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getTarget() {
		Expression target = basicGetTarget();
		return target != null && target.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)target) : target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetTarget() {
		List<Expression> expressions = getOwnedExpressions();
		return expressions.size() < 2? null: expressions.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setTarget(Expression newTarget) {
		throw new UnsupportedOperationException();
	}
	
	public List<Expression> getOwnedExpressions() {
		return super.getOwnedFeature().stream().
				filter(f->f instanceof Expression).
				map(f->(Expression)f).
				collect(Collectors.toList());
	}
	
	@Override
	protected Feature getContextFeature() {
		Expression target = getTarget();
		return target == null? null: target.getResult();
	}

	public ItemFeature getItemFeature() {
		return super.getOwnedFeature().stream().
				filter(f->f instanceof ItemFeature).
				map(f->(ItemFeature)f).
				findFirst().orElse(null);
	}
	
	public Feature getSource() {
		Expression sourceExpression = getSourceExpression();
		return sourceExpression == null? null: sourceExpression.getResult();
	}
	
	protected Expression getSourceExpression() {
		List<Expression> expressions = getOwnedExpressions();
		return expressions.isEmpty()? null: expressions.get(0);
	}

	public BindingConnector getTargetConnector() {
		return targetConnector;
	}
	
	protected void computeTargetConnector() {
		Expression sourceExpression = getSourceExpression();
		if (sourceExpression != null) {
			targetConnector = makeResultBinding(targetConnector, sourceExpression, getItemFeature());
		}
	}
	
	public void transform() {
		super.transform();
		computeTargetConnector();
	}
	
/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.SEND_ACTION_USAGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case SysMLPackage.SEND_ACTION_USAGE__TARGET:
				setTarget((Expression)newValue);
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
			case SysMLPackage.SEND_ACTION_USAGE__TARGET:
				setTarget((Expression)null);
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
			case SysMLPackage.SEND_ACTION_USAGE__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //SendActionUsageImpl
