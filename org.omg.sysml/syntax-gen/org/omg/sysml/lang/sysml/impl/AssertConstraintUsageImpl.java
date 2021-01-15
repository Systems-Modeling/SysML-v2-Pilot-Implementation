/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.AssertConstraintUsage;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Invariant;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert Constraint Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssertConstraintUsageImpl#getAssertionConnector <em>Assertion Connector</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssertConstraintUsageImpl#getAssertedConstraint <em>Asserted Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertConstraintUsageImpl extends ConstraintUsageImpl implements AssertConstraintUsage {

	public static final String ASSERT_CONSTRAINT_SUBSETTING_PART_DEFAULT = "Items::Item::assertedConstraints";
	
	private Type subsettingBaseDefault;
	private Type subsettingPartDefault;

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
	public BindingConnector getAssertionConnector() {
		BindingConnector assertionConnector = basicGetAssertionConnector();
		return assertionConnector != null && assertionConnector.eIsProxy() ? (BindingConnector)eResolveProxy((InternalEObject)assertionConnector) : assertionConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BindingConnector basicGetAssertionConnector() {
		return assertionConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setAssertionConnector(BindingConnector newAssertionConnector) {
		assertionConnector = newAssertionConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getAssertedConstraint() {
		ConstraintUsage assertedConstraint = basicGetAssertedConstraint();
		return assertedConstraint != null && assertedConstraint.eIsProxy() ? (ConstraintUsage)eResolveProxy((InternalEObject)assertedConstraint) : assertedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConstraintUsage basicGetAssertedConstraint() {
		Type subsettingBaseDefault = getSubsettingBaseDefault();
		Type subsettingPartDefault = getSubsettingPartDefault();
		EList<Subsetting> subsettings = getOwnedSubsetting();		
		if (subsettings.stream().map(sub->sub.getSubsettedFeature()).
				allMatch(feature->feature == subsettingBaseDefault || 
				         feature == subsettingPartDefault)) {
			return this;
		} else {
			Feature subsettedFeature = subsettings.get(0).getSubsettedFeature(); 
			return subsettedFeature instanceof ConstraintUsage? (ConstraintUsage)subsettedFeature: this;
		}
	}
	
	protected Type getSubsettingBaseDefault() {
		if (subsettingBaseDefault == null) {
			subsettingBaseDefault = getDefaultType(CONSTRAINT_SUBSETTING_BASE_DEFAULT);
		}
		return subsettingBaseDefault;
	}

	protected Type getSubsettingPartDefault() {
		if (subsettingPartDefault == null) {
			subsettingPartDefault = getDefaultType(ASSERT_CONSTRAINT_SUBSETTING_PART_DEFAULT);
		}
		return subsettingPartDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setAssertedConstraint(ConstraintUsage newAssertedConstraint) {
		throw new UnsupportedOperationException();
	}

	// Additional redefinitions and subsets

	@Override
	protected String getDefaultSupertype() {
		return isEnactedPerformance()?
				ASSERT_CONSTRAINT_SUBSETTING_PART_DEFAULT:
				super.getDefaultSupertype();
	}
	
	public boolean isEnactedPerformance() {
		return StepImpl.isEnactedPerformance(this);
	}
	
	@Override
	public void transform() {
		super.transform();
		if (assertionConnector == null) {
			assertionConnector = InvariantImpl.getAssertionConnectorFor(this, this.getResult());
		}
	}
	
	@Override
	public void cleanDerivedValues() {
		if (assertionConnector != null) {
			removeOwnedBindingConnector(assertionConnector);
			assertionConnector = null;
		}
		super.cleanDerivedValues();
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
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTION_CONNECTOR:
				if (resolve) return getAssertionConnector();
				return basicGetAssertionConnector();
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
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTION_CONNECTOR:
				setAssertionConnector((BindingConnector)newValue);
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
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTION_CONNECTOR:
				setAssertionConnector((BindingConnector)null);
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
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTION_CONNECTOR:
				return basicGetAssertionConnector() != null;
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTED_CONSTRAINT:
				return basicGetAssertedConstraint() != null;
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
				case SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTION_CONNECTOR: return SysMLPackage.INVARIANT__ASSERTION_CONNECTOR;
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
				case SysMLPackage.INVARIANT__ASSERTION_CONNECTOR: return SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTION_CONNECTOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AssertConstraintUsageImpl
