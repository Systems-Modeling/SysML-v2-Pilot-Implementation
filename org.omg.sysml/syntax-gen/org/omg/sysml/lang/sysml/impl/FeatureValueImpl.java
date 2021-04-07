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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.FeatureUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Feature
 * Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureValueImpl#getFeatureWithValue <em>Feature With Value</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureValueImpl#getValueConnector <em>Value Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureValueImpl extends MembershipImpl implements FeatureValue {
	/**
	 * The cached value of the '{@link #getFeatureWithValue() <em>Feature With Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithValue()
	 * @generated
	 * @ordered
	 */
	protected Feature featureWithValue;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	
	protected FeatureValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getValue() {
		Expression value = basicGetValue();
		return value != null && value.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)value) : value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetValue() {
		Element ownedMemberElement = super.basicGetOwnedMemberElement();
		return ownedMemberElement instanceof Expression? (Expression)ownedMemberElement: null;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValue(Expression newValue) {
		super.setOwnedMemberElement(newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return basicGetValue() != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getFeatureWithValue() {
		if (featureWithValue != null && featureWithValue.eIsProxy()) {
			InternalEObject oldFeatureWithValue = (InternalEObject)featureWithValue;
			featureWithValue = (Feature)eResolveProxy(oldFeatureWithValue);
			if (featureWithValue != oldFeatureWithValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_VALUE__FEATURE_WITH_VALUE, oldFeatureWithValue, featureWithValue));
			}
		}
		return featureWithValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetFeatureWithValue() {
		Namespace owningNamespace = getMembershipOwningNamespace();
		return owningNamespace instanceof Feature? (Feature)owningNamespace: null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setFeatureWithValue(Feature newFeatureWithValue) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindingConnector getValueConnector() {
		BindingConnector valueConnector = basicGetValueConnector();
		return valueConnector != null && valueConnector.eIsProxy() ? (BindingConnector)eResolveProxy((InternalEObject)valueConnector) : valueConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BindingConnector basicGetValueConnector() {
		Feature feature = getFeatureWithValue();
		return feature == null? null: FeatureUtil.getValueConnectorFor(feature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueConnector(BindingConnector newValueConnector) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwnedMemberElement() {
		return getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwnedMemberElement() {
		return basicGetValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberElement(Element newOwnedMemberElement) {
		if (newOwnedMemberElement != null && !(newOwnedMemberElement instanceof Expression)) {
			throw new IllegalArgumentException("newOwnedMemberElement must be an instance of Expression");
		}
		setValue((Expression) newOwnedMemberElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberElement() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FEATURE_VALUE__FEATURE_WITH_VALUE:
				if (resolve) return getFeatureWithValue();
				return basicGetFeatureWithValue();
			case SysMLPackage.FEATURE_VALUE__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case SysMLPackage.FEATURE_VALUE__VALUE_CONNECTOR:
				if (resolve) return getValueConnector();
				return basicGetValueConnector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.FEATURE_VALUE__FEATURE_WITH_VALUE:
				setFeatureWithValue((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_VALUE__VALUE:
				setValue((Expression)newValue);
				return;
			case SysMLPackage.FEATURE_VALUE__VALUE_CONNECTOR:
				setValueConnector((BindingConnector)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.FEATURE_VALUE__FEATURE_WITH_VALUE:
				setFeatureWithValue((Feature)null);
				return;
			case SysMLPackage.FEATURE_VALUE__VALUE:
				setValue((Expression)null);
				return;
			case SysMLPackage.FEATURE_VALUE__VALUE_CONNECTOR:
				setValueConnector((BindingConnector)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.FEATURE_VALUE__OWNED_MEMBER_ELEMENT:
				return isSetOwnedMemberElement();
			case SysMLPackage.FEATURE_VALUE__FEATURE_WITH_VALUE:
				return featureWithValue != null;
			case SysMLPackage.FEATURE_VALUE__VALUE:
				return isSetValue();
			case SysMLPackage.FEATURE_VALUE__VALUE_CONNECTOR:
				return basicGetValueConnector() != null;
		}
		return super.eIsSet(featureID);
	}

} // FeatureValueImpl
