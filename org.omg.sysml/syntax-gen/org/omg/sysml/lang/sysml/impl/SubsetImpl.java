/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
public class SubsetImpl extends RelationshipImpl implements Subset {
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
	 * The cached value of the '{@link #getOwningFeature() <em>Owning Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature owningFeature;

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
	public Feature getOwningFeature() {
		if (owningFeature != null && owningFeature.eIsProxy()) {
			InternalEObject oldOwningFeature = (InternalEObject)owningFeature;
			owningFeature = (Feature)eResolveProxy(oldOwningFeature);
			if (owningFeature != oldOwningFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.SUBSET__OWNING_FEATURE, oldOwningFeature, owningFeature));
			}
		}
		return owningFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetOwningFeature() {
		return owningFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningFeature(Feature newOwningFeature, NotificationChain msgs) {
		Feature oldOwningFeature = owningFeature;
		owningFeature = newOwningFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.SUBSET__OWNING_FEATURE, oldOwningFeature, newOwningFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningFeature(Feature newOwningFeature) {
		if (newOwningFeature != owningFeature) {
			NotificationChain msgs = null;
			if (owningFeature != null)
				msgs = ((InternalEObject)owningFeature).eInverseRemove(this, SysMLPackage.FEATURE__OWNED_SUBSET, Feature.class, msgs);
			if (newOwningFeature != null)
				msgs = ((InternalEObject)newOwningFeature).eInverseAdd(this, SysMLPackage.FEATURE__OWNED_SUBSET, Feature.class, msgs);
			msgs = basicSetOwningFeature(newOwningFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SUBSET__OWNING_FEATURE, newOwningFeature, newOwningFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.SUBSET__OWNING_FEATURE:
				if (owningFeature != null)
					msgs = ((InternalEObject)owningFeature).eInverseRemove(this, SysMLPackage.FEATURE__OWNED_SUBSET, Feature.class, msgs);
				return basicSetOwningFeature((Feature)otherEnd, msgs);
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
			case SysMLPackage.SUBSET__OWNING_FEATURE:
				return basicSetOwningFeature(null, msgs);
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
			case SysMLPackage.SUBSET__SUBSETTED_FEATURE:
				return subsettedFeature != null;
			case SysMLPackage.SUBSET__SUBSETTING_FEATURE:
				return subsettingFeature != null;
			case SysMLPackage.SUBSET__OWNING_FEATURE:
				return owningFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //SubsetImpl
