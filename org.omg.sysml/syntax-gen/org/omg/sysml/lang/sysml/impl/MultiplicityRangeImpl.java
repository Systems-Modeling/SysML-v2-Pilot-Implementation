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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.MultiplicityRange;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityRangeImpl#getBound <em>Bound</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityRangeImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityRangeImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicityRangeImpl extends MultiplicityImpl implements MultiplicityRange {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.MULTIPLICITY_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getLowerBound() {
		Expression lowerBound = basicGetLowerBound();
		return lowerBound != null && lowerBound.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)lowerBound) : lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetLowerBound() {
		EList<Element> bounds = super.getOwnedMember();
		if (bounds.size() < 2) {
			return null;
		} else {
			Element bound = bounds.get(0);
			return bound instanceof Expression? (Expression)bound: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setLowerBound(Expression newLowerBound) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getUpperBound() {
		Expression upperBound = basicGetUpperBound();
		return upperBound != null && upperBound.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)upperBound) : upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetUpperBound() {
		EList<Element> bounds = super.getOwnedMember();
		int size = bounds.size();
		if (bounds.isEmpty()) {
			return null;
		} else {
			Element bound = bounds.get(size - 1);
			return bound instanceof Expression? (Expression)bound: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setUpperBound(Expression newUpperBound) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getBound() {
		return new DerivedUnionEObjectEList<Expression>(Expression.class, this, SysMLPackage.MULTIPLICITY_RANGE__BOUND, BOUND_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getBound() <em>Bound</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected static final int[] BOUND_ESUBSETS = new int[] {SysMLPackage.MULTIPLICITY_RANGE__LOWER_BOUND, SysMLPackage.MULTIPLICITY_RANGE__UPPER_BOUND};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBound() {
		return !getBound().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedMember() {
		@SuppressWarnings("unchecked")
		EList<Element> bound = (EList<Element>)((EList<?>)getBound());
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMember() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.MULTIPLICITY_RANGE__BOUND:
				return getBound();
			case SysMLPackage.MULTIPLICITY_RANGE__LOWER_BOUND:
				if (resolve) return getLowerBound();
				return basicGetLowerBound();
			case SysMLPackage.MULTIPLICITY_RANGE__UPPER_BOUND:
				if (resolve) return getUpperBound();
				return basicGetUpperBound();
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
			case SysMLPackage.MULTIPLICITY_RANGE__LOWER_BOUND:
				setLowerBound((Expression)newValue);
				return;
			case SysMLPackage.MULTIPLICITY_RANGE__UPPER_BOUND:
				setUpperBound((Expression)newValue);
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
			case SysMLPackage.MULTIPLICITY_RANGE__LOWER_BOUND:
				setLowerBound((Expression)null);
				return;
			case SysMLPackage.MULTIPLICITY_RANGE__UPPER_BOUND:
				setUpperBound((Expression)null);
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
			case SysMLPackage.MULTIPLICITY_RANGE__BOUND:
				return isSetBound();
			case SysMLPackage.MULTIPLICITY_RANGE__OWNED_MEMBER:
				return isSetOwnedMember();
			case SysMLPackage.MULTIPLICITY_RANGE__LOWER_BOUND:
				return basicGetLowerBound() != null;
			case SysMLPackage.MULTIPLICITY_RANGE__UPPER_BOUND:
				return basicGetUpperBound() != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiplicityRangeImpl
