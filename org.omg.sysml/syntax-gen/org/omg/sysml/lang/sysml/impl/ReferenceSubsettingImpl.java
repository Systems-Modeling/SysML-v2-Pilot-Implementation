/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ReferenceSubsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Subsetting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ReferenceSubsettingImpl#getReferencedFeature <em>Referenced Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ReferenceSubsettingImpl#getReferencingFeature <em>Referencing Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceSubsettingImpl extends SubsettingImpl implements ReferenceSubsetting {
	/**
	 * The cached value of the '{@link #getReferencedFeature() <em>Referenced Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature referencedFeature;

	/**
	 * The cached setting delegate for the '{@link #getReferencingFeature() <em>Referencing Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REFERENCING_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.REFERENCE_SUBSETTING__REFERENCING_FEATURE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceSubsettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.REFERENCE_SUBSETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Feature getReferencedFeature() {
		return referencedFeature == null? basicGetReferencedFeature(): getReferencedFeatureGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getReferencedFeatureGen() {
		if (referencedFeature != null && referencedFeature.eIsProxy()) {
			InternalEObject oldReferencedFeature = (InternalEObject)referencedFeature;
			referencedFeature = (Feature)eResolveProxy(oldReferencedFeature);
			if (referencedFeature != oldReferencedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.REFERENCE_SUBSETTING__REFERENCED_FEATURE, oldReferencedFeature, referencedFeature));
			}
		}
		return referencedFeature;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * Xtext workaround:
	 * If the referencedFeature is empty, then set it to the last ownedRelatedElement
	 * (which will be a Feature chain).
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetReferencedFeature() {
		if (referencedFeature == null) {
			EList<Element> ownedRelatedElements = getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				referencedFeature = (Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1);
			}
		}
		return referencedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedFeature(Feature newReferencedFeature) {
		Feature oldReferencedFeature = referencedFeature;
		referencedFeature = newReferencedFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.REFERENCE_SUBSETTING__REFERENCED_FEATURE, oldReferencedFeature, referencedFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencedFeature() {
		return referencedFeature != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getReferencingFeature() {
		return (Feature)REFERENCING_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetReferencingFeature() {
		return (Feature)REFERENCING_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencingFeature(Feature newReferencingFeature) {
		REFERENCING_FEATURE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newReferencingFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencingFeature() {
		return basicGetReferencingFeature() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.REFERENCE_SUBSETTING__REFERENCED_FEATURE:
				if (resolve) return getReferencedFeature();
				return basicGetReferencedFeature();
			case SysMLPackage.REFERENCE_SUBSETTING__REFERENCING_FEATURE:
				if (resolve) return getReferencingFeature();
				return basicGetReferencingFeature();
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
			case SysMLPackage.REFERENCE_SUBSETTING__REFERENCED_FEATURE:
				setReferencedFeature((Feature)newValue);
				return;
			case SysMLPackage.REFERENCE_SUBSETTING__REFERENCING_FEATURE:
				setReferencingFeature((Feature)newValue);
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
			case SysMLPackage.REFERENCE_SUBSETTING__REFERENCED_FEATURE:
				setReferencedFeature((Feature)null);
				return;
			case SysMLPackage.REFERENCE_SUBSETTING__REFERENCING_FEATURE:
				setReferencingFeature((Feature)null);
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
			case SysMLPackage.REFERENCE_SUBSETTING__SUBSETTED_FEATURE:
				return isSetSubsettedFeature();
			case SysMLPackage.REFERENCE_SUBSETTING__SUBSETTING_FEATURE:
				return isSetSubsettingFeature();
			case SysMLPackage.REFERENCE_SUBSETTING__OWNING_FEATURE:
				return isSetOwningFeature();
			case SysMLPackage.REFERENCE_SUBSETTING__REFERENCED_FEATURE:
				return isSetReferencedFeature();
			case SysMLPackage.REFERENCE_SUBSETTING__REFERENCING_FEATURE:
				return isSetReferencingFeature();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getSubsettedFeature() {
		return getReferencedFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature basicGetSubsettedFeature() {
		return basicGetReferencedFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsettedFeature(Feature newSubsettedFeature) {
		setReferencedFeature(newSubsettedFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubsettedFeature() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getSubsettingFeature() {
		return getReferencingFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature basicGetSubsettingFeature() {
		return basicGetReferencingFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsettingFeature(Feature newSubsettingFeature) {
		setReferencingFeature(newSubsettingFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubsettingFeature() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getOwningFeature() {
		return getReferencingFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature basicGetOwningFeature() {
		return basicGetReferencingFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningFeature(Feature newOwningFeature) {
		setReferencingFeature(newOwningFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningFeature() {
  		return false;
	}

} //ReferenceSubsettingImpl
