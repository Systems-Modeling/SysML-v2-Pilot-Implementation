/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subsetting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SubsettingImpl#getSubsettingFeature <em>Subsetting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SubsettingImpl#getOwningFeature <em>Owning Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SubsettingImpl#getSubsettedFeature <em>Subsetted Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubsettingImpl extends SpecializationImpl implements Subsetting {
	/**
	 * The cached value of the '{@link #getSubsettingFeature() <em>Subsetting Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsettingFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature subsettingFeature;

	/**
	 * The cached setting delegate for the '{@link #getOwningFeature() <em>Owning Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNING_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.SUBSETTING__OWNING_FEATURE).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getSubsettedFeature() <em>Subsetted Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsettedFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature subsettedFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubsettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SUBSETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSubsettingFeature() {
		if (subsettingFeature != null && subsettingFeature.eIsProxy()) {
			InternalEObject oldSubsettingFeature = (InternalEObject)subsettingFeature;
			subsettingFeature = (Feature)eResolveProxy(oldSubsettingFeature);
			if (subsettingFeature != oldSubsettingFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.SUBSETTING__SUBSETTING_FEATURE, oldSubsettingFeature, subsettingFeature));
			}
		}
		return subsettingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetSubsettingFeature() {
		return subsettingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubsettingFeature(Feature newSubsettingFeature) {
		Feature oldSubsettingFeature = subsettingFeature;
		subsettingFeature = newSubsettingFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SUBSETTING__SUBSETTING_FEATURE, oldSubsettingFeature, subsettingFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubsettingFeature() {
		return subsettingFeature != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSubsettedFeature() {
		if (subsettedFeature != null && subsettedFeature.eIsProxy()) {
			InternalEObject oldSubsettedFeature = (InternalEObject)subsettedFeature;
			subsettedFeature = (Feature)eResolveProxy(oldSubsettedFeature);
			if (subsettedFeature != oldSubsettedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.SUBSETTING__SUBSETTED_FEATURE, oldSubsettedFeature, subsettedFeature));
			}
		}
		return subsettedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetSubsettedFeature() {
		return subsettedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubsettedFeature(Feature newSubsettedFeature) {
		Feature oldSubsettedFeature = subsettedFeature;
		subsettedFeature = newSubsettedFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SUBSETTING__SUBSETTED_FEATURE, oldSubsettedFeature, subsettedFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubsettedFeature() {
		return subsettedFeature != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwningFeature() {
		return (Feature)OWNING_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetOwningFeature() {
		return (Feature)OWNING_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningFeature(Feature newOwningFeature) {
		OWNING_FEATURE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwningFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningFeature() {
		return basicGetOwningFeature() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.SUBSETTING__SUBSETTING_FEATURE:
				if (resolve) return getSubsettingFeature();
				return basicGetSubsettingFeature();
			case SysMLPackage.SUBSETTING__OWNING_FEATURE:
				if (resolve) return getOwningFeature();
				return basicGetOwningFeature();
			case SysMLPackage.SUBSETTING__SUBSETTED_FEATURE:
				if (resolve) return getSubsettedFeature();
				return basicGetSubsettedFeature();
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
			case SysMLPackage.SUBSETTING__SUBSETTING_FEATURE:
				setSubsettingFeature((Feature)newValue);
				return;
			case SysMLPackage.SUBSETTING__OWNING_FEATURE:
				setOwningFeature((Feature)newValue);
				return;
			case SysMLPackage.SUBSETTING__SUBSETTED_FEATURE:
				setSubsettedFeature((Feature)newValue);
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
			case SysMLPackage.SUBSETTING__SUBSETTING_FEATURE:
				setSubsettingFeature((Feature)null);
				return;
			case SysMLPackage.SUBSETTING__OWNING_FEATURE:
				setOwningFeature((Feature)null);
				return;
			case SysMLPackage.SUBSETTING__SUBSETTED_FEATURE:
				setSubsettedFeature((Feature)null);
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
			case SysMLPackage.SUBSETTING__SUBSETTING_FEATURE:
				return isSetSubsettingFeature();
			case SysMLPackage.SUBSETTING__OWNING_TYPE:
				return isSetOwningType();
			case SysMLPackage.SUBSETTING__GENERAL:
				return isSetGeneral();
			case SysMLPackage.SUBSETTING__SPECIFIC:
				return isSetSpecific();
			case SysMLPackage.SUBSETTING__OWNING_FEATURE:
				return isSetOwningFeature();
			case SysMLPackage.SUBSETTING__SUBSETTED_FEATURE:
				return isSetSubsettedFeature();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getGeneral() {
		return getSubsettedFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetGeneral() {
		return basicGetSubsettedFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(Type newGeneral) {
		if (newGeneral != null && !(newGeneral instanceof Feature)) {
			throw new IllegalArgumentException("newGeneral must be an instance of Feature");
		}
		setSubsettedFeature((Feature) newGeneral);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGeneral() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getSpecific() {
		return getSubsettingFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetSpecific() {
		return basicGetSubsettingFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Type newSpecific) {
		if (newSpecific != null && !(newSpecific instanceof Feature)) {
			throw new IllegalArgumentException("newSpecific must be an instance of Feature");
		}
		setSubsettingFeature((Feature) newSpecific);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecific() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOwningType() {
		return getOwningFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetOwningType() {
		return basicGetOwningFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningType(Type newOwningType) {
		if (newOwningType != null && !(newOwningType instanceof Feature)) {
			throw new IllegalArgumentException("newOwningType must be an instance of Feature");
		}
		setOwningFeature((Feature) newOwningType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningType() {
  		return false;
	}

} //SubsettingImpl
