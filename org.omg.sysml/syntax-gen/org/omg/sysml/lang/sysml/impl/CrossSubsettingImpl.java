/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.CrossSubsetting;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Subsetting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CrossSubsettingImpl#getCrossedFeature <em>Crossed Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CrossSubsettingImpl#getCrossingFeature <em>Crossing Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrossSubsettingImpl extends SubsettingImpl implements CrossSubsetting {
	/**
	 * The cached value of the '{@link #getCrossedFeature() <em>Crossed Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossedFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature crossedFeature;
	/**
	 * The cached setting delegate for the '{@link #getCrossingFeature() <em>Crossing Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossingFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CROSSING_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.CROSS_SUBSETTING__CROSSING_FEATURE).getSettingDelegate();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrossSubsettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CROSS_SUBSETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Feature getCrossedFeature() {
		return crossedFeature == null? basicGetCrossedFeature(): getCrossedFeatureGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getCrossedFeatureGen() {
		if (crossedFeature != null && crossedFeature.eIsProxy()) {
			InternalEObject oldCrossedFeature = (InternalEObject)crossedFeature;
			crossedFeature = (Feature)eResolveProxy(oldCrossedFeature);
			if (crossedFeature != oldCrossedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CROSS_SUBSETTING__CROSSED_FEATURE, oldCrossedFeature, crossedFeature));
			}
		}
		return crossedFeature;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * Xtext workaround:
	 * If the crossedFeature is empty, then set it to the last ownedRelatedElement
	 * (which will be a Feature chain).
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetCrossedFeature() {
		if (crossedFeature == null) {
			EList<Element> ownedRelatedElements = getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				crossedFeature = (Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1);
			}
		}
		return crossedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossedFeature(Feature newCrossedFeature) {
		Feature oldCrossedFeature = crossedFeature;
		crossedFeature = newCrossedFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CROSS_SUBSETTING__CROSSED_FEATURE, oldCrossedFeature, crossedFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCrossedFeature() {
		return crossedFeature != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getCrossingFeature() {
		return (Feature)CROSSING_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetCrossingFeature() {
		return (Feature)CROSSING_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossingFeature(Feature newCrossingFeature) {
		CROSSING_FEATURE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newCrossingFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCrossingFeature() {
		return basicGetCrossingFeature() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CROSS_SUBSETTING__CROSSED_FEATURE:
				if (resolve) return getCrossedFeature();
				return basicGetCrossedFeature();
			case SysMLPackage.CROSS_SUBSETTING__CROSSING_FEATURE:
				if (resolve) return getCrossingFeature();
				return basicGetCrossingFeature();
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
			case SysMLPackage.CROSS_SUBSETTING__CROSSED_FEATURE:
				setCrossedFeature((Feature)newValue);
				return;
			case SysMLPackage.CROSS_SUBSETTING__CROSSING_FEATURE:
				setCrossingFeature((Feature)newValue);
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
			case SysMLPackage.CROSS_SUBSETTING__CROSSED_FEATURE:
				setCrossedFeature((Feature)null);
				return;
			case SysMLPackage.CROSS_SUBSETTING__CROSSING_FEATURE:
				setCrossingFeature((Feature)null);
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
			case SysMLPackage.CROSS_SUBSETTING__SUBSETTED_FEATURE:
				return isSetSubsettedFeature();
			case SysMLPackage.CROSS_SUBSETTING__OWNING_FEATURE:
				return isSetOwningFeature();
			case SysMLPackage.CROSS_SUBSETTING__CROSSED_FEATURE:
				return isSetCrossedFeature();
			case SysMLPackage.CROSS_SUBSETTING__CROSSING_FEATURE:
				return isSetCrossingFeature();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getSubsettedFeature() {
		return getCrossedFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature basicGetSubsettedFeature() {
		return basicGetCrossedFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsettedFeature(Feature newSubsettedFeature) {
		setCrossedFeature(newSubsettedFeature);
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
	public Feature getOwningFeature() {
		return getCrossingFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature basicGetOwningFeature() {
		return basicGetCrossingFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningFeature(Feature newOwningFeature) {
		setCrossingFeature(newOwningFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningFeature() {
  		return false;
	}

} //CrossSubsettingImpl
