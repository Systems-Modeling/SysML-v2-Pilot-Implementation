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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Feature
 * Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureValueImpl#getMembershipOwningNamespace <em>Membership Owning Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureValueImpl#getFeatureWithValue <em>Feature With Value</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureValueImpl#getValue_comp <em>Value comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureValueImpl#getValueConnector <em>Value Connector</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureValueImpl#getValue <em>Value</em>}</li>
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
	 * The cached value of the '{@link #getValue_comp() <em>Value comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_comp()
	 * @generated
	 * @ordered
	 */
	protected Expression value_comp;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getMembershipOwningNamespace() {
		if (eContainerFeatureID() != SysMLPackage.FEATURE_VALUE__MEMBERSHIP_OWNING_NAMESPACE) return null;
		return (Namespace)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMembershipOwningNamespace(Namespace newMembershipOwningNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMembershipOwningNamespace, SysMLPackage.FEATURE_VALUE__MEMBERSHIP_OWNING_NAMESPACE, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (featureWithValue != null && featureWithValue != newMembershipOwningNamespace) {
				setFeatureWithValue(null);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMembershipOwningNamespace(Namespace newMembershipOwningNamespace) {
		if (newMembershipOwningNamespace != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.FEATURE_VALUE__MEMBERSHIP_OWNING_NAMESPACE && newMembershipOwningNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newMembershipOwningNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMembershipOwningNamespace != null)
				msgs = ((InternalEObject)newMembershipOwningNamespace).eInverseAdd(this, SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP_COMP, Namespace.class, msgs);
			msgs = basicSetMembershipOwningNamespace(newMembershipOwningNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_VALUE__MEMBERSHIP_OWNING_NAMESPACE, newMembershipOwningNamespace, newMembershipOwningNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembershipOwningNamespace() {
		return getMembershipOwningNamespace() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getValue_comp() {
		return value_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue_comp(Expression newValue_comp, NotificationChain msgs) {
		Expression oldValue_comp = value_comp;
		value_comp = newValue_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_VALUE__VALUE_COMP, oldValue_comp, newValue_comp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue_comp(Expression newValue_comp) {
		if (newValue_comp != value_comp) {
			NotificationChain msgs = null;
			if (value_comp != null)
				msgs = ((InternalEObject)value_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.FEATURE_VALUE__VALUE_COMP, null, msgs);
			if (newValue_comp != null)
				msgs = ((InternalEObject)newValue_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.FEATURE_VALUE__VALUE_COMP, null, msgs);
			msgs = basicSetValue_comp(newValue_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_VALUE__VALUE_COMP, newValue_comp, newValue_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue_comp() {
		return value_comp != null;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetValue() {
		return getValue_comp();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValue(Expression newValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.FEATURE_VALUE__MEMBERSHIP_OWNING_NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMembershipOwningNamespace((Namespace)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		return feature == null? null: ((FeatureImpl)feature).getValueConnector();
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
	public Element getOwnedMemberElement_comp() {
		return getValue_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberElement_comp(Element newOwnedMemberElement_comp, NotificationChain msgs) {
		if (newOwnedMemberElement_comp != null && !(newOwnedMemberElement_comp instanceof Expression)) {
			throw new IllegalArgumentException("newOwnedMemberElement_comp must be an instance of Expression");
		}
		return basicSetValue_comp((Expression) newOwnedMemberElement_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberElement_comp(Element newOwnedMemberElement_comp) {
		if (newOwnedMemberElement_comp != null && !(newOwnedMemberElement_comp instanceof Expression)) {
			throw new IllegalArgumentException("newOwnedMemberElement_comp must be an instance of Expression");
		}
		setValue_comp((Expression) newOwnedMemberElement_comp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberElement_comp() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.FEATURE_VALUE__MEMBERSHIP_OWNING_NAMESPACE:
				return basicSetMembershipOwningNamespace(null, msgs);
			case SysMLPackage.FEATURE_VALUE__VALUE_COMP:
				return basicSetValue_comp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SysMLPackage.FEATURE_VALUE__MEMBERSHIP_OWNING_NAMESPACE:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP_COMP, Namespace.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case SysMLPackage.FEATURE_VALUE__VALUE_COMP:
				return getValue_comp();
			case SysMLPackage.FEATURE_VALUE__VALUE_CONNECTOR:
				if (resolve) return getValueConnector();
				return basicGetValueConnector();
			case SysMLPackage.FEATURE_VALUE__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
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
			case SysMLPackage.FEATURE_VALUE__VALUE_COMP:
				setValue_comp((Expression)newValue);
				return;
			case SysMLPackage.FEATURE_VALUE__VALUE_CONNECTOR:
				setValueConnector((BindingConnector)newValue);
				return;
			case SysMLPackage.FEATURE_VALUE__VALUE:
				setValue((Expression)newValue);
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
			case SysMLPackage.FEATURE_VALUE__VALUE_COMP:
				setValue_comp((Expression)null);
				return;
			case SysMLPackage.FEATURE_VALUE__VALUE_CONNECTOR:
				setValueConnector((BindingConnector)null);
				return;
			case SysMLPackage.FEATURE_VALUE__VALUE:
				setValue((Expression)null);
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
			case SysMLPackage.FEATURE_VALUE__MEMBERSHIP_OWNING_NAMESPACE:
				return isSetMembershipOwningNamespace();
			case SysMLPackage.FEATURE_VALUE__OWNED_MEMBER_ELEMENT_COMP:
				return isSetOwnedMemberElement_comp();
			case SysMLPackage.FEATURE_VALUE__FEATURE_WITH_VALUE:
				return featureWithValue != null;
			case SysMLPackage.FEATURE_VALUE__VALUE_COMP:
				return isSetValue_comp();
			case SysMLPackage.FEATURE_VALUE__VALUE_CONNECTOR:
				return basicGetValueConnector() != null;
			case SysMLPackage.FEATURE_VALUE__VALUE:
				return basicGetValue() != null;
		}
		return super.eIsSet(featureID);
	}

} // FeatureValueImpl
