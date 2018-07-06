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
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureDomain;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getEndOfAssociation <em>End Of Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#isIsPort <em>Is Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getMemberFeature <em>Member Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getOwnedFeatureElement <em>Owned Feature Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getOwningClass <em>Owning Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureMembershipImpl extends MembershipImpl implements FeatureMembership {
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
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final FeatureDirectionKind DIRECTION_EDEFAULT = FeatureDirectionKind.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected FeatureDirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPort() <em>Is Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPort()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPort() <em>Is Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPort()
	 * @generated
	 * @ordered
	 */
	protected boolean isPort = IS_PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMemberFeature() <em>Member Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature memberFeature;

	/**
	 * The cached value of the '{@link #getOwnedFeatureElement() <em>Owned Feature Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureElement()
	 * @generated
	 * @ordered
	 */
	protected Feature ownedFeatureElement;

	/**
	 * The cached value of the '{@link #getOwningClass() <em>Owning Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningClass()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.lang.sysml.Class owningClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE_MEMBERSHIP;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_MEMBERSHIP__FEATURE, oldFeature, feature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__FEATURE, oldFeature, feature));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_MEMBERSHIP__DOMAIN, oldDomain, domain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__DOMAIN, oldDomain, domain));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_MEMBERSHIP__END_OF_ASSOCIATION, oldEndOfAssociation, endOfAssociation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__END_OF_ASSOCIATION, oldEndOfAssociation, newEndOfAssociation);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__END_OF_ASSOCIATION, newEndOfAssociation, newEndOfAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDirectionKind getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(FeatureDirectionKind newDirection) {
		FeatureDirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPort() {
		return isPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPort(boolean newIsPort) {
		boolean oldIsPort = isPort;
		isPort = newIsPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT, oldIsPort, isPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getMemberFeature() {
		if (memberFeature != null && memberFeature.eIsProxy()) {
			InternalEObject oldMemberFeature = (InternalEObject)memberFeature;
			memberFeature = (Feature)eResolveProxy(oldMemberFeature);
			if (memberFeature != oldMemberFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE, oldMemberFeature, memberFeature));
			}
		}
		return memberFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetMemberFeature() {
		return memberFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberFeature(Feature newMemberFeature) {
		Feature oldMemberFeature = memberFeature;
		memberFeature = newMemberFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE, oldMemberFeature, memberFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getOwnedFeatureElement() {
		return ownedFeatureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedFeatureElement(Feature newOwnedFeatureElement, NotificationChain msgs) {
		Feature oldOwnedFeatureElement = ownedFeatureElement;
		ownedFeatureElement = newOwnedFeatureElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT, oldOwnedFeatureElement, newOwnedFeatureElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedFeatureElement(Feature newOwnedFeatureElement) {
		if (newOwnedFeatureElement != ownedFeatureElement) {
			NotificationChain msgs = null;
			if (ownedFeatureElement != null)
				msgs = ((InternalEObject)ownedFeatureElement).eInverseRemove(this, SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP, Feature.class, msgs);
			if (newOwnedFeatureElement != null)
				msgs = ((InternalEObject)newOwnedFeatureElement).eInverseAdd(this, SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP, Feature.class, msgs);
			msgs = basicSetOwnedFeatureElement(newOwnedFeatureElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT, newOwnedFeatureElement, newOwnedFeatureElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class getOwningClass() {
		if (owningClass != null && owningClass.eIsProxy()) {
			InternalEObject oldOwningClass = (InternalEObject)owningClass;
			owningClass = (org.omg.sysml.lang.sysml.Class)eResolveProxy(oldOwningClass);
			if (owningClass != oldOwningClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CLASS, oldOwningClass, owningClass));
			}
		}
		return owningClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class basicGetOwningClass() {
		return owningClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningClass(org.omg.sysml.lang.sysml.Class newOwningClass, NotificationChain msgs) {
		org.omg.sysml.lang.sysml.Class oldOwningClass = owningClass;
		owningClass = newOwningClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CLASS, oldOwningClass, newOwningClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningClass(org.omg.sysml.lang.sysml.Class newOwningClass) {
		if (newOwningClass != owningClass) {
			NotificationChain msgs = null;
			if (owningClass != null)
				msgs = ((InternalEObject)owningClass).eInverseRemove(this, SysMLPackage.CLASS__OWNED_FEATURE_MEMBERSHIP, org.omg.sysml.lang.sysml.Class.class, msgs);
			if (newOwningClass != null)
				msgs = ((InternalEObject)newOwningClass).eInverseAdd(this, SysMLPackage.CLASS__OWNED_FEATURE_MEMBERSHIP, org.omg.sysml.lang.sysml.Class.class, msgs);
			msgs = basicSetOwningClass(newOwningClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CLASS, newOwningClass, newOwningClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.FEATURE_MEMBERSHIP__END_OF_ASSOCIATION:
				if (endOfAssociation != null)
					msgs = ((InternalEObject)endOfAssociation).eInverseRemove(this, SysMLPackage.ASSOCIATION__END, Association.class, msgs);
				return basicSetEndOfAssociation((Association)otherEnd, msgs);
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT:
				if (ownedFeatureElement != null)
					msgs = ((InternalEObject)ownedFeatureElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT, null, msgs);
				return basicSetOwnedFeatureElement((Feature)otherEnd, msgs);
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CLASS:
				if (owningClass != null)
					msgs = ((InternalEObject)owningClass).eInverseRemove(this, SysMLPackage.CLASS__OWNED_FEATURE_MEMBERSHIP, org.omg.sysml.lang.sysml.Class.class, msgs);
				return basicSetOwningClass((org.omg.sysml.lang.sysml.Class)otherEnd, msgs);
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
			case SysMLPackage.FEATURE_MEMBERSHIP__END_OF_ASSOCIATION:
				return basicSetEndOfAssociation(null, msgs);
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT:
				return basicSetOwnedFeatureElement(null, msgs);
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CLASS:
				return basicSetOwningClass(null, msgs);
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
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case SysMLPackage.FEATURE_MEMBERSHIP__END_OF_ASSOCIATION:
				if (resolve) return getEndOfAssociation();
				return basicGetEndOfAssociation();
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				return getDirection();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				return isIsPort();
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				if (resolve) return getMemberFeature();
				return basicGetMemberFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT:
				return getOwnedFeatureElement();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CLASS:
				if (resolve) return getOwningClass();
				return basicGetOwningClass();
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
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE:
				setFeature((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__DOMAIN:
				setDomain((org.omg.sysml.lang.sysml.Class)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__END_OF_ASSOCIATION:
				setEndOfAssociation((Association)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				setDirection((FeatureDirectionKind)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				setIsPort((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				setMemberFeature((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT:
				setOwnedFeatureElement((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CLASS:
				setOwningClass((org.omg.sysml.lang.sysml.Class)newValue);
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
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE:
				setFeature((Feature)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__DOMAIN:
				setDomain((org.omg.sysml.lang.sysml.Class)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__END_OF_ASSOCIATION:
				setEndOfAssociation((Association)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				setIsPort(IS_PORT_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				setMemberFeature((Feature)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT:
				setOwnedFeatureElement((Feature)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CLASS:
				setOwningClass((org.omg.sysml.lang.sysml.Class)null);
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
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE:
				return feature != null;
			case SysMLPackage.FEATURE_MEMBERSHIP__DOMAIN:
				return domain != null;
			case SysMLPackage.FEATURE_MEMBERSHIP__END_OF_ASSOCIATION:
				return endOfAssociation != null;
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				return isPort != IS_PORT_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				return memberFeature != null;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT:
				return ownedFeatureElement != null;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CLASS:
				return owningClass != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FeatureDomain.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE: return SysMLPackage.FEATURE_DOMAIN__FEATURE;
				case SysMLPackage.FEATURE_MEMBERSHIP__DOMAIN: return SysMLPackage.FEATURE_DOMAIN__DOMAIN;
				case SysMLPackage.FEATURE_MEMBERSHIP__END_OF_ASSOCIATION: return SysMLPackage.FEATURE_DOMAIN__END_OF_ASSOCIATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FeatureDomain.class) {
			switch (baseFeatureID) {
				case SysMLPackage.FEATURE_DOMAIN__FEATURE: return SysMLPackage.FEATURE_MEMBERSHIP__FEATURE;
				case SysMLPackage.FEATURE_DOMAIN__DOMAIN: return SysMLPackage.FEATURE_MEMBERSHIP__DOMAIN;
				case SysMLPackage.FEATURE_DOMAIN__END_OF_ASSOCIATION: return SysMLPackage.FEATURE_MEMBERSHIP__END_OF_ASSOCIATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (direction: ");
		result.append(direction);
		result.append(", isPort: ");
		result.append(isPort);
		result.append(')');
		return result.toString();
	}

} //FeatureMembershipImpl
