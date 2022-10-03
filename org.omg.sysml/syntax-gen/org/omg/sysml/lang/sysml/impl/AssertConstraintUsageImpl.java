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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.AssertConstraintUsage;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Invariant;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert Constraint Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssertConstraintUsageImpl#isNegated <em>Is Negated</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssertConstraintUsageImpl#getAssertedConstraint <em>Asserted Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertConstraintUsageImpl extends ConstraintUsageImpl implements AssertConstraintUsage {

	/**
	 * The default value of the '{@link #isNegated() <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NEGATED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isNegated() <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected boolean isNegated = IS_NEGATED_EDEFAULT;
	/**
	 * The cached setting delegate for the '{@link #getAssertedConstraint() <em>Asserted Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertedConstraint()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSERTED_CONSTRAINT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ASSERT_CONSTRAINT_USAGE__ASSERTED_CONSTRAINT).getSettingDelegate();
	/**
	 * The cached value of the BindingConnector from the result of the
	 * this ConstraintUsage to the result of a LiteralBoolean true.
	 */
	protected BindingConnector assertionConnector = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertConstraintUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ASSERT_CONSTRAINT_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNegated() {
		return isNegated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsNegated(boolean newIsNegated) {
		boolean oldIsNegated = isNegated;
		isNegated = newIsNegated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ASSERT_CONSTRAINT_USAGE__IS_NEGATED, oldIsNegated, isNegated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getAssertedConstraint() {
		return (ConstraintUsage)ASSERTED_CONSTRAINT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintUsage basicGetAssertedConstraint() {
		return (ConstraintUsage)ASSERTED_CONSTRAINT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssertedConstraint(ConstraintUsage newAssertedConstraint) {
		ASSERTED_CONSTRAINT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newAssertedConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__IS_NEGATED:
				return isNegated();
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTED_CONSTRAINT:
				if (resolve) return getAssertedConstraint();
				return basicGetAssertedConstraint();
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
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__IS_NEGATED:
				setIsNegated((Boolean)newValue);
				return;
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTED_CONSTRAINT:
				setAssertedConstraint((ConstraintUsage)newValue);
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
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__IS_NEGATED:
				setIsNegated(IS_NEGATED_EDEFAULT);
				return;
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTED_CONSTRAINT:
				setAssertedConstraint((ConstraintUsage)null);
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
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__IS_NEGATED:
				return isNegated != IS_NEGATED_EDEFAULT;
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTED_CONSTRAINT:
				return ASSERTED_CONSTRAINT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (baseClass == Invariant.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.ASSERT_CONSTRAINT_USAGE__IS_NEGATED: return SysMLPackage.INVARIANT__IS_NEGATED;
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
		if (baseClass == Invariant.class) {
			switch (baseFeatureID) {
				case SysMLPackage.INVARIANT__IS_NEGATED: return SysMLPackage.ASSERT_CONSTRAINT_USAGE__IS_NEGATED;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isNegated: ");
		result.append(isNegated);
		result.append(')');
		return result.toString();
	}

} //AssertConstraintUsageImpl
