/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureImpl#getMetadataFeatureValue_comp <em>Metadata Feature Value comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureImpl#getMetadataFeatureValue <em>Metadata Feature Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataFeatureImpl extends FeatureImpl implements MetadataFeature {
	/**
	 * The cached value of the '{@link #getMetadataFeatureValue_comp() <em>Metadata Feature Value comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataFeatureValue_comp()
	 * @generated
	 * @ordered
	 */
	protected MetadataFeatureValue metadataFeatureValue_comp;

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
	public MetadataFeatureValue getMetadataFeatureValue_comp() {
		return metadataFeatureValue_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadataFeatureValue_comp(MetadataFeatureValue newMetadataFeatureValue_comp, NotificationChain msgs) {
		MetadataFeatureValue oldMetadataFeatureValue_comp = metadataFeatureValue_comp;
		metadataFeatureValue_comp = newMetadataFeatureValue_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE_COMP, oldMetadataFeatureValue_comp, newMetadataFeatureValue_comp);
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
	public void setMetadataFeatureValue_comp(MetadataFeatureValue newMetadataFeatureValue_comp) {
		if (newMetadataFeatureValue_comp != metadataFeatureValue_comp) {
			NotificationChain msgs = null;
			if (metadataFeatureValue_comp != null)
				msgs = ((InternalEObject)metadataFeatureValue_comp).eInverseRemove(this, SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE, MetadataFeatureValue.class, msgs);
			if (newMetadataFeatureValue_comp != null)
				msgs = ((InternalEObject)newMetadataFeatureValue_comp).eInverseAdd(this, SysMLPackage.METADATA_FEATURE_VALUE__OWNING_METADATA_FEATURE, MetadataFeatureValue.class, msgs);
			msgs = basicSetMetadataFeatureValue_comp(newMetadataFeatureValue_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE_COMP, newMetadataFeatureValue_comp, newMetadataFeatureValue_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMetadataFeatureValue_comp() {
		return metadataFeatureValue_comp != null;
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
		return getMetadataFeatureValue_comp();
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
	@Override
	public EList<Membership> getOwnedMembership_comp() {
		EList<Membership> ownedMembership_comp = new UniqueEList<Membership>();
		MetadataFeatureValue metadataFeatureValue_comp = getMetadataFeatureValue_comp();
		if (metadataFeatureValue_comp != null) {
			ownedMembership_comp.add(metadataFeatureValue_comp);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE_COMP:
				if (metadataFeatureValue_comp != null)
					msgs = ((InternalEObject)metadataFeatureValue_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE_COMP, null, msgs);
				return basicSetMetadataFeatureValue_comp((MetadataFeatureValue)otherEnd, msgs);
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
			case SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE_COMP:
				return basicSetMetadataFeatureValue_comp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE_COMP:
				return getMetadataFeatureValue_comp();
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
			case SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE_COMP:
				setMetadataFeatureValue_comp((MetadataFeatureValue)newValue);
				return;
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
			case SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE_COMP:
				setMetadataFeatureValue_comp((MetadataFeatureValue)null);
				return;
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
			case SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE_COMP:
				return isSetMetadataFeatureValue_comp();
			case SysMLPackage.METADATA_FEATURE__METADATA_FEATURE_VALUE:
				return basicGetMetadataFeatureValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //MetadataFeatureImpl
