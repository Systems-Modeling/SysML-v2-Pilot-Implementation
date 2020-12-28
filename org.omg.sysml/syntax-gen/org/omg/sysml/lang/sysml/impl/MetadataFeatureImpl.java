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
		EList<Membership> ownedMemberships = super.getOwnedMembership();
		if (ownedMemberships.isEmpty()) {
			return null;
		} else {
			Membership ownedMembership = ownedMemberships.get(0);
			return ownedMembership instanceof MetadataFeatureValue? (MetadataFeatureValue)ownedMembership: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setMetadataFeatureValue(MetadataFeatureValue newMetadataFeatureValue) {
		throw new UnsupportedOperationException();
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
	public EList<Membership> getOwnedMembership_comp() {
		EList<Membership> ownedMembership_comp = new UniqueEList<Membership>();
		MetadataFeatureValue metadataFeatureValue = getMetadataFeatureValue();
		if (metadataFeatureValue != null) {
			ownedMembership_comp.add(metadataFeatureValue);
		}
		return new UnionEObjectEList<Membership>(this, SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP_COMP, ownedMembership_comp.size(), ownedMembership_comp.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembership_comp() {
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
			case SysMLPackage.METADATA_FEATURE__OWNED_MEMBERSHIP_COMP:
				return isSetOwnedMembership_comp();
			case SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE:
				return isSetMetadataFeatureValue();
		}
		return super.eIsSet(featureID);
	}

} //MetadataFeatureImpl
