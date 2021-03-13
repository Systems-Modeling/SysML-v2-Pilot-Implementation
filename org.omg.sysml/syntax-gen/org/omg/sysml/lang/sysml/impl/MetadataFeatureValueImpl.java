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

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.MetadataFeatureValue;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata Feature Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureValueImpl#getMetadataValue_comp <em>Metadata Value comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureValueImpl#getOwningMetadataFeature <em>Owning Metadata Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureValueImpl#getMetadataValue <em>Metadata Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataFeatureValueImpl extends FeatureValueImpl implements MetadataFeatureValue {
	/**
	 * The cached value of the '{@link #getMetadataValue_comp() <em>Metadata Value comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataValue_comp()
	 * @generated
	 * @ordered
	 */
	protected Expression metadataValue_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataFeatureValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.METADATA_FEATURE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getMetadataValue_comp() {
		return metadataValue_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadataValue_comp(Expression newMetadataValue_comp, NotificationChain msgs) {
		Expression oldMetadataValue_comp = metadataValue_comp;
		metadataValue_comp = newMetadataValue_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP, oldMetadataValue_comp, newMetadataValue_comp);
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
	public void setMetadataValue_comp(Expression newMetadataValue_comp) {
		if (newMetadataValue_comp != metadataValue_comp) {
			NotificationChain msgs = null;
			if (metadataValue_comp != null)
				msgs = ((InternalEObject)metadataValue_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP, null, msgs);
			if (newMetadataValue_comp != null)
				msgs = ((InternalEObject)newMetadataValue_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP, null, msgs);
			msgs = basicSetMetadataValue_comp(newMetadataValue_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP, newMetadataValue_comp, newMetadataValue_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMetadataValue_comp() {
		return metadataValue_comp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataFeature getOwningMetadataFeature() {
		if (eContainerFeatureID() != SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE) return null;
		return (MetadataFeature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningMetadataFeature(MetadataFeature newOwningMetadataFeature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningMetadataFeature, SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningMetadataFeature(MetadataFeature newOwningMetadataFeature) {
		if (newOwningMetadataFeature != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE && newOwningMetadataFeature != null)) {
			if (EcoreUtil.isAncestor(this, newOwningMetadataFeature))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningMetadataFeature != null)
				msgs = ((InternalEObject)newOwningMetadataFeature).eInverseAdd(this, SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE_COMP, MetadataFeature.class, msgs);
			msgs = basicSetOwningMetadataFeature(newOwningMetadataFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE, newOwningMetadataFeature, newOwningMetadataFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningMetadataFeature() {
		return getOwningMetadataFeature() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getMetadataValue() {
		Expression metadataValue = basicGetMetadataValue();
		return metadataValue != null && metadataValue.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)metadataValue) : metadataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetMetadataValue() {
		return super.getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setMetadataValue(Expression newMetadataValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getValue_comp() {
		return getMetadataValue_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue_comp(Expression newValue_comp, NotificationChain msgs) {
		return basicSetMetadataValue_comp(newValue_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue_comp(Expression newValue_comp) {
		setMetadataValue_comp(newValue_comp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue_comp() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getMembershipOwningNamespace() {
		return getOwningMetadataFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace basicGetMembershipOwningNamespace() {
		return getOwningMetadataFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMembershipOwningNamespace(Namespace newMembershipOwningNamespace) {
		if (newMembershipOwningNamespace != null && !(newMembershipOwningNamespace instanceof MetadataFeature)) {
			throw new IllegalArgumentException("newMembershipOwningNamespace must be an instance of MetadataFeature");
		}
		setOwningMetadataFeature((MetadataFeature) newMembershipOwningNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembershipOwningNamespace() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getFeatureWithValue() {
		return getOwningMetadataFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature basicGetFeatureWithValue() {
		return getOwningMetadataFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFeatureWithValue(Feature newFeatureWithValue) {
		if (newFeatureWithValue != null && !(newFeatureWithValue instanceof MetadataFeature)) {
			throw new IllegalArgumentException("newFeatureWithValue must be an instance of MetadataFeature");
		}
		if (newFeatureWithValue != null) {
			setOwningMetadataFeature((MetadataFeature) newFeatureWithValue);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatureWithValue() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningMetadataFeature((MetadataFeature)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP:
				return basicSetMetadataValue_comp(null, msgs);
			case SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE:
				return basicSetOwningMetadataFeature(null, msgs);
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
			case SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE_COMP, MetadataFeature.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP:
				return getMetadataValue_comp();
			case SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE:
				return getOwningMetadataFeature();
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE:
				if (resolve) return getMetadataValue();
				return basicGetMetadataValue();
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
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP:
				setMetadataValue_comp((Expression)newValue);
				return;
			case SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE:
				setOwningMetadataFeature((MetadataFeature)newValue);
				return;
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE:
				setMetadataValue((Expression)newValue);
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
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP:
				setMetadataValue_comp((Expression)null);
				return;
			case SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE:
				setOwningMetadataFeature((MetadataFeature)null);
				return;
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE:
				setMetadataValue((Expression)null);
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
			case SysMLPackage.METADATA_FEATURE_VALUE__VALUE_COMP:
				return isSetValue_comp();
			case SysMLPackage.METADATA_FEATURE_VALUE__FEATURE_WITH_VALUE:
				return isSetFeatureWithValue();
			case SysMLPackage.METADATA_FEATURE_VALUE__MEMBERSHIP_OWNING_NAMESPACE:
				return isSetMembershipOwningNamespace();
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP:
				return isSetMetadataValue_comp();
			case SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE:
				return isSetOwningMetadataFeature();
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE:
				return basicGetMetadataValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //MetadataFeatureValueImpl
