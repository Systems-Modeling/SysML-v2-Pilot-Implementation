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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureValueImpl#getMetadataValue <em>Metadata Value</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureValueImpl#getOwningMetadataFeature <em>Owning Metadata Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataFeatureValueImpl extends FeatureValueImpl implements MetadataFeatureValue {
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
	public MetadataFeature getOwningMetadataFeature() {
		MetadataFeature owningMetadataFeature = basicGetOwningMetadataFeature();
		return owningMetadataFeature != null && owningMetadataFeature.eIsProxy() ? (MetadataFeature)eResolveProxy((InternalEObject)owningMetadataFeature) : owningMetadataFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MetadataFeature basicGetOwningMetadataFeature() {
		Namespace owningNamespace = super.basicGetMembershipOwningNamespace();
		return owningNamespace instanceof MetadataFeature? (MetadataFeature)owningNamespace: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwningMetadataFeature(MetadataFeature newOwningMetadataFeature) {
		super.setMembershipOwningNamespace(newOwningMetadataFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningMetadataFeature() {
		return basicGetOwningMetadataFeature() != null;
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
		return super.basicGetValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setMetadataValue(Expression newMetadataValue) {
		super.setValue(newMetadataValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMetadataValue() {
		return basicGetMetadataValue() != null;
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
		return basicGetOwningMetadataFeature();
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
		return basicGetOwningMetadataFeature();
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
	public Expression getValue() {
		return getMetadataValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression basicGetValue() {
		return basicGetMetadataValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Expression newValue) {
		setMetadataValue(newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
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
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE:
				if (resolve) return getMetadataValue();
				return basicGetMetadataValue();
			case SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE:
				if (resolve) return getOwningMetadataFeature();
				return basicGetOwningMetadataFeature();
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
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE:
				setMetadataValue((Expression)newValue);
				return;
			case SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE:
				setOwningMetadataFeature((MetadataFeature)newValue);
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
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE:
				setMetadataValue((Expression)null);
				return;
			case SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE:
				setOwningMetadataFeature((MetadataFeature)null);
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
			case SysMLPackage.METADATA_FEATURE_VALUE__VALUE:
				return isSetValue();
			case SysMLPackage.METADATA_FEATURE_VALUE__FEATURE_WITH_VALUE:
				return isSetFeatureWithValue();
			case SysMLPackage.METADATA_FEATURE_VALUE__MEMBERSHIP_OWNING_NAMESPACE:
				return isSetMembershipOwningNamespace();
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE:
				return isSetMetadataValue();
			case SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE:
				return isSetOwningMetadataFeature();
		}
		return super.eIsSet(featureID);
	}

} //MetadataFeatureValueImpl
