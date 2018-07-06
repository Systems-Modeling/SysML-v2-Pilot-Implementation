/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDomain;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureDomainImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureDomainImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureDomainImpl#getEndOfAssociation <em>End Of Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureDomainImpl extends RelationshipImpl implements FeatureDomain {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature feature;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.lang.sysml.Class domain;

	/**
	 * The cached value of the '{@link #getEndOfAssociation() <em>End Of Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association endOfAssociation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (Feature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_DOMAIN__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Feature newFeature) {
		Feature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_DOMAIN__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (org.omg.sysml.lang.sysml.Class)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_DOMAIN__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(org.omg.sysml.lang.sysml.Class newDomain) {
		org.omg.sysml.lang.sysml.Class oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_DOMAIN__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getEndOfAssociation() {
		if (endOfAssociation != null && endOfAssociation.eIsProxy()) {
			InternalEObject oldEndOfAssociation = (InternalEObject)endOfAssociation;
			endOfAssociation = (Association)eResolveProxy(oldEndOfAssociation);
			if (endOfAssociation != oldEndOfAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_DOMAIN__END_OF_ASSOCIATION, oldEndOfAssociation, endOfAssociation));
			}
		}
		return endOfAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetEndOfAssociation() {
		return endOfAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndOfAssociation(Association newEndOfAssociation, NotificationChain msgs) {
		Association oldEndOfAssociation = endOfAssociation;
		endOfAssociation = newEndOfAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_DOMAIN__END_OF_ASSOCIATION, oldEndOfAssociation, newEndOfAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndOfAssociation(Association newEndOfAssociation) {
		if (newEndOfAssociation != endOfAssociation) {
			NotificationChain msgs = null;
			if (endOfAssociation != null)
				msgs = ((InternalEObject)endOfAssociation).eInverseRemove(this, SysMLPackage.ASSOCIATION__END, Association.class, msgs);
			if (newEndOfAssociation != null)
				msgs = ((InternalEObject)newEndOfAssociation).eInverseAdd(this, SysMLPackage.ASSOCIATION__END, Association.class, msgs);
			msgs = basicSetEndOfAssociation(newEndOfAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_DOMAIN__END_OF_ASSOCIATION, newEndOfAssociation, newEndOfAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.FEATURE_DOMAIN__END_OF_ASSOCIATION:
				if (endOfAssociation != null)
					msgs = ((InternalEObject)endOfAssociation).eInverseRemove(this, SysMLPackage.ASSOCIATION__END, Association.class, msgs);
				return basicSetEndOfAssociation((Association)otherEnd, msgs);
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
			case SysMLPackage.FEATURE_DOMAIN__END_OF_ASSOCIATION:
				return basicSetEndOfAssociation(null, msgs);
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
			case SysMLPackage.FEATURE_DOMAIN__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case SysMLPackage.FEATURE_DOMAIN__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case SysMLPackage.FEATURE_DOMAIN__END_OF_ASSOCIATION:
				if (resolve) return getEndOfAssociation();
				return basicGetEndOfAssociation();
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
			case SysMLPackage.FEATURE_DOMAIN__FEATURE:
				setFeature((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_DOMAIN__DOMAIN:
				setDomain((org.omg.sysml.lang.sysml.Class)newValue);
				return;
			case SysMLPackage.FEATURE_DOMAIN__END_OF_ASSOCIATION:
				setEndOfAssociation((Association)newValue);
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
			case SysMLPackage.FEATURE_DOMAIN__FEATURE:
				setFeature((Feature)null);
				return;
			case SysMLPackage.FEATURE_DOMAIN__DOMAIN:
				setDomain((org.omg.sysml.lang.sysml.Class)null);
				return;
			case SysMLPackage.FEATURE_DOMAIN__END_OF_ASSOCIATION:
				setEndOfAssociation((Association)null);
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
			case SysMLPackage.FEATURE_DOMAIN__FEATURE:
				return feature != null;
			case SysMLPackage.FEATURE_DOMAIN__DOMAIN:
				return domain != null;
			case SysMLPackage.FEATURE_DOMAIN__END_OF_ASSOCIATION:
				return endOfAssociation != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureDomainImpl
