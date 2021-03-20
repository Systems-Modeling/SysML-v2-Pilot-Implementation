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
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.MetadataFeatureValue;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureImpl#getMetadataFeatureValue <em>Metadata Feature Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataFeatureImpl extends FeatureImpl implements MetadataFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.METADATA_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataFeatureValue getMetadataFeatureValue() {
		MetadataFeatureValue metadataFeatureValue = basicGetMetadataFeatureValue();
		return metadataFeatureValue != null && metadataFeatureValue.eIsProxy() ? (MetadataFeatureValue)eResolveProxy((InternalEObject)metadataFeatureValue) : metadataFeatureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MetadataFeatureValue basicGetMetadataFeatureValue() {
		return (MetadataFeatureValue)super.getOwnedMembership().stream().
				filter(MetadataFeatureValue.class::isInstance).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setMetadataFeatureValue(MetadataFeatureValue newMetadataFeatureValue) {
		EList<Relationship> ownedRelationships = getOwnedRelationship();
		ownedRelationships.remove(getMetadataFeatureValue());
		if (newMetadataFeatureValue != null) {
			ownedRelationships.add(newMetadataFeatureValue);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMetadataFeatureValue() {
		return basicGetMetadataFeatureValue() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Membership> getOwnedMembership() {
		EList<Membership> ownedMembership = new UniqueEList<Membership>();
		MetadataFeatureValue metadataFeatureValue = getMetadataFeatureValue();
		if (metadataFeatureValue != null) {
			ownedMembership.add(metadataFeatureValue);
		}
		return new UnionEObjectEList<Membership>(this, SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP, ownedMembership.size(), ownedMembership.toArray());
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedMembership() <em>Owned Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembership()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBERSHIP_ESUPERSETS = new int[] {SysMLPackage.METADATA_FEATURE__OWNED_RELATIONSHIP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembership() {
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
			case SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE:
				if (resolve) return getMetadataFeatureValue();
				return basicGetMetadataFeatureValue();
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
			case SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE:
				setMetadataFeatureValue((MetadataFeatureValue)newValue);
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
			case SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE:
				setMetadataFeatureValue((MetadataFeatureValue)null);
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
			case SysMLPackage.METADATA_FEATURE__OWNED_MEMBERSHIP:
				return isSetOwnedMembership();
			case SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE:
				return isSetMetadataFeatureValue();
		}
		return super.eIsSet(featureID);
	}

} //MetadataFeatureImpl
