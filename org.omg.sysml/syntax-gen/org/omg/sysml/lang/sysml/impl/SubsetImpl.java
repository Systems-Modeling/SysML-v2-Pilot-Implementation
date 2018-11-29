/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Subset;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SubsetImpl#getSubsettedFeature <em>Subsetted Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SubsetImpl#getSubsettingFeature <em>Subsetting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SubsetImpl#getOwningFeature <em>Owning Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubsetImpl extends GeneralizationImpl implements Subset {
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
	 * The cached value of the '{@link #getSubsettingFeature() <em>Subsetting Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsettingFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature subsettingFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SUBSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getSubsettedFeature() {
		if (subsettedFeature != null && subsettedFeature.eIsProxy()) {
			InternalEObject oldSubsettedFeature = (InternalEObject)subsettedFeature;
			subsettedFeature = (Feature)eResolveProxy(oldSubsettedFeature);
			if (subsettedFeature != oldSubsettedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.SUBSET__SUBSETTED_FEATURE, oldSubsettedFeature, subsettedFeature));
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
	public void setSubsettedFeature(Feature newSubsettedFeature) {
		Feature oldSubsettedFeature = subsettedFeature;
		subsettedFeature = newSubsettedFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SUBSET__SUBSETTED_FEATURE, oldSubsettedFeature, subsettedFeature));
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
	public Feature getSubsettingFeature() {
		if (subsettingFeature != null && subsettingFeature.eIsProxy()) {
			InternalEObject oldSubsettingFeature = (InternalEObject)subsettingFeature;
			subsettingFeature = (Feature)eResolveProxy(oldSubsettingFeature);
			if (subsettingFeature != oldSubsettingFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.SUBSET__SUBSETTING_FEATURE, oldSubsettingFeature, subsettingFeature));
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
	public void setSubsettingFeature(Feature newSubsettingFeature) {
		Feature oldSubsettingFeature = subsettingFeature;
		subsettingFeature = newSubsettingFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SUBSET__SUBSETTING_FEATURE, oldSubsettingFeature, subsettingFeature));
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
	public Feature getOwningFeature() {
		Feature owningFeature = basicGetOwningFeature();
		return owningFeature != null && owningFeature.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)owningFeature) : owningFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetOwningFeature() {
		// TODO: implement this method to return the 'Owning Feature' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningFeature(Feature newOwningFeature) {
		// TODO: implement this method to set the 'Owning Feature' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case SysMLPackage.SUBSET__SUBSETTED_FEATURE:
				if (resolve) return getSubsettedFeature();
				return basicGetSubsettedFeature();
			case SysMLPackage.SUBSET__SUBSETTING_FEATURE:
				if (resolve) return getSubsettingFeature();
				return basicGetSubsettingFeature();
			case SysMLPackage.SUBSET__OWNING_FEATURE:
				if (resolve) return getOwningFeature();
				return basicGetOwningFeature();
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
			case SysMLPackage.SUBSET__SUBSETTED_FEATURE:
				setSubsettedFeature((Feature)newValue);
				return;
			case SysMLPackage.SUBSET__SUBSETTING_FEATURE:
				setSubsettingFeature((Feature)newValue);
				return;
			case SysMLPackage.SUBSET__OWNING_FEATURE:
				setOwningFeature((Feature)newValue);
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
			case SysMLPackage.SUBSET__SUBSETTED_FEATURE:
				setSubsettedFeature((Feature)null);
				return;
			case SysMLPackage.SUBSET__SUBSETTING_FEATURE:
				setSubsettingFeature((Feature)null);
				return;
			case SysMLPackage.SUBSET__OWNING_FEATURE:
				setOwningFeature((Feature)null);
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
			case SysMLPackage.SUBSET__GENERAL:
				return isSetGeneral();
			case SysMLPackage.SUBSET__SPECIFIC:
				return isSetSpecific();
			case SysMLPackage.SUBSET__OWNING_CATEGORY:
				return isSetOwningCategory();
			case SysMLPackage.SUBSET__SUBSETTED_FEATURE:
				return isSetSubsettedFeature();
			case SysMLPackage.SUBSET__SUBSETTING_FEATURE:
				return isSetSubsettingFeature();
			case SysMLPackage.SUBSET__OWNING_FEATURE:
				return isSetOwningFeature();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getGeneral() {
		return getSubsettedFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category basicGetGeneral() {
		return basicGetSubsettedFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(Category newGeneral) {
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
	@Override
	public Category getSpecific() {
		return getSubsettingFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category basicGetSpecific() {
		return basicGetSubsettingFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Category newSpecific) {
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
	@Override
	public Category getOwningCategory() {
		return getOwningFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category basicGetOwningCategory() {
		return basicGetOwningFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningCategory(Category newOwningCategory) {
		if (newOwningCategory != null && !(newOwningCategory instanceof Feature)) {
			throw new IllegalArgumentException("newOwningCategory must be an instance of Feature");
		}
		setOwningFeature((Feature) newOwningCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningCategory() {
  		return false;
	}

} //SubsetImpl
