/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getMemberFeature <em>Member Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getMembershipOwningPackage <em>Membership Owning Package</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#isReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getOwnedFeatureElement <em>Owned Feature Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#isPart <em>Is Part</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#isPort <em>Is Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getOwningCategory <em>Owning Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureMembershipImpl extends MembershipImpl implements FeatureMembership {
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
	 * The default value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

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
	 * The default value of the '{@link #isPart() <em>Is Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PART_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPart() <em>Is Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPart()
	 * @generated
	 * @ordered
	 */
	protected boolean isPart = IS_PART_EDEFAULT;

	/**
	 * The default value of the '{@link #isPort() <em>Is Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPort()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPort() <em>Is Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPort()
	 * @generated
	 * @ordered
	 */
	protected boolean isPort = IS_PORT_EDEFAULT;

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
	 * The cached value of the '{@link #getOwningCategory() <em>Owning Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningCategory()
	 * @generated
	 * @ordered
	 */
	protected Category owningCategory;

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
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (ownedFeatureElement != null && ownedFeatureElement != newMemberFeature) {
				setOwnedFeatureElement(null);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberFeature() {
		return memberFeature != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.omg.sysml.lang.sysml.Package getMembershipOwningPackage() {
		if (membershipOwningPackage != null && membershipOwningPackage.eIsProxy()) {
			InternalEObject oldMembershipOwningPackage = (InternalEObject)membershipOwningPackage;
			membershipOwningPackage = (org.omg.sysml.lang.sysml.Package)eResolveProxy(oldMembershipOwningPackage);
			if (membershipOwningPackage != oldMembershipOwningPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE, oldMembershipOwningPackage, membershipOwningPackage));
			}
		}
		return membershipOwningPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.omg.sysml.lang.sysml.Package basicGetMembershipOwningPackage() {
		return membershipOwningPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMembershipOwningPackage(org.omg.sysml.lang.sysml.Package newMembershipOwningPackage, NotificationChain msgs) {
		org.omg.sysml.lang.sysml.Package oldMembershipOwningPackage = membershipOwningPackage;
		membershipOwningPackage = newMembershipOwningPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE, oldMembershipOwningPackage, newMembershipOwningPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (owningCategory != null && owningCategory != newMembershipOwningPackage) {
				setOwningCategory(null);
			}
			if (newMembershipOwningPackage != null) {
				Element owner = getOwner();
				if (newMembershipOwningPackage != owner) {
					setOwner(newMembershipOwningPackage);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMembershipOwningPackage(org.omg.sysml.lang.sysml.Package newMembershipOwningPackage) {
		if (newMembershipOwningPackage != membershipOwningPackage) {
			NotificationChain msgs = null;
			if (membershipOwningPackage != null)
				msgs = ((InternalEObject)membershipOwningPackage).eInverseRemove(this, SysMLPackage.PACKAGE__OWNED_MEMBERSHIP, org.omg.sysml.lang.sysml.Package.class, msgs);
			if (newMembershipOwningPackage != null)
				msgs = ((InternalEObject)newMembershipOwningPackage).eInverseAdd(this, SysMLPackage.PACKAGE__OWNED_MEMBERSHIP, org.omg.sysml.lang.sysml.Package.class, msgs);
			msgs = basicSetMembershipOwningPackage(newMembershipOwningPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE, newMembershipOwningPackage, newMembershipOwningPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembershipOwningPackage() {
		return membershipOwningPackage != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
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
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwnedFeatureElement != null) {
				if (newOwnedFeatureElement != memberFeature) {
					setMemberFeature(newOwnedFeatureElement);
				}
			}
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
	public boolean isSetOwnedFeatureElement() {
		return ownedFeatureElement != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPart() {
		return isPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPart(boolean newIsPart) {
		boolean oldIsPart = isPart;
		isPart = newIsPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__IS_PART, oldIsPart, isPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPort() {
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
	public Category getOwningCategory() {
		if (owningCategory != null && owningCategory.eIsProxy()) {
			InternalEObject oldOwningCategory = (InternalEObject)owningCategory;
			owningCategory = (Category)eResolveProxy(oldOwningCategory);
			if (owningCategory != oldOwningCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CATEGORY, oldOwningCategory, owningCategory));
			}
		}
		return owningCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetOwningCategory() {
		return owningCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningCategory(Category newOwningCategory, NotificationChain msgs) {
		Category oldOwningCategory = owningCategory;
		owningCategory = newOwningCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CATEGORY, oldOwningCategory, newOwningCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningCategory != null) {
				if (newOwningCategory != membershipOwningPackage) {
					setMembershipOwningPackage(newOwningCategory);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningCategory(Category newOwningCategory) {
		if (newOwningCategory != owningCategory) {
			NotificationChain msgs = null;
			if (owningCategory != null)
				msgs = ((InternalEObject)owningCategory).eInverseRemove(this, SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP, Category.class, msgs);
			if (newOwningCategory != null)
				msgs = ((InternalEObject)newOwningCategory).eInverseAdd(this, SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP, Category.class, msgs);
			msgs = basicSetOwningCategory(newOwningCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CATEGORY, newOwningCategory, newOwningCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE:
				if (membershipOwningPackage != null)
					msgs = ((InternalEObject)membershipOwningPackage).eInverseRemove(this, SysMLPackage.PACKAGE__OWNED_MEMBERSHIP, org.omg.sysml.lang.sysml.Package.class, msgs);
				return basicSetMembershipOwningPackage((org.omg.sysml.lang.sysml.Package)otherEnd, msgs);
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT:
				if (ownedFeatureElement != null)
					msgs = ((InternalEObject)ownedFeatureElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT, null, msgs);
				return basicSetOwnedFeatureElement((Feature)otherEnd, msgs);
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CATEGORY:
				if (owningCategory != null)
					msgs = ((InternalEObject)owningCategory).eInverseRemove(this, SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP, Category.class, msgs);
				return basicSetOwningCategory((Category)otherEnd, msgs);
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
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE:
				return basicSetMembershipOwningPackage(null, msgs);
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT:
				return basicSetOwnedFeatureElement(null, msgs);
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CATEGORY:
				return basicSetOwningCategory(null, msgs);
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
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				if (resolve) return getMemberFeature();
				return basicGetMemberFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_DERIVED:
				return isDerived();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_READ_ONLY:
				return isReadOnly();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT:
				return getOwnedFeatureElement();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PART:
				return isPart();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				return isPort();
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				return getDirection();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CATEGORY:
				if (resolve) return getOwningCategory();
				return basicGetOwningCategory();
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
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				setMemberFeature((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT:
				setOwnedFeatureElement((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PART:
				setIsPart((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				setIsPort((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				setDirection((FeatureDirectionKind)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CATEGORY:
				setOwningCategory((Category)newValue);
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
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				setMemberFeature((Feature)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT:
				setOwnedFeatureElement((Feature)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PART:
				setIsPart(IS_PART_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				setIsPort(IS_PORT_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CATEGORY:
				setOwningCategory((Category)null);
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
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				return isSetMemberFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE:
				return isSetMembershipOwningPackage();
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_ELEMENT:
				return isSetMemberElement();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				return isSetOwnedMemberElement();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT:
				return isSetOwnedFeatureElement();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PART:
				return isPart != IS_PART_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				return isPort != IS_PORT_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CATEGORY:
				return owningCategory != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (isDerived: ");
		result.append(isDerived);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isPart: ");
		result.append(isPart);
		result.append(", isPort: ");
		result.append(isPort);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getMemberElement() {
		return getMemberFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetMemberElement() {
		return basicGetMemberFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberElement(Element newMemberElement) {
		if (newMemberElement != null && !(newMemberElement instanceof Feature)) {
			throw new IllegalArgumentException("newMemberElement must be an instance of Feature");
		}
		setMemberFeature((Feature) newMemberElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberElement() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwnedMemberElement() {
		return getOwnedFeatureElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwnedMemberElement() {
		return getOwnedFeatureElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberElement(Element newOwnedMemberElement, NotificationChain msgs) {
		if (newOwnedMemberElement != null && !(newOwnedMemberElement instanceof Feature)) {
			throw new IllegalArgumentException("newOwnedMemberElement must be an instance of Feature");
		}
		return basicSetOwnedFeatureElement((Feature) newOwnedMemberElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberElement(Element newOwnedMemberElement) {
		if (newOwnedMemberElement != null && !(newOwnedMemberElement instanceof Feature)) {
			throw new IllegalArgumentException("newOwnedMemberElement must be an instance of Feature");
		}
		setOwnedFeatureElement((Feature) newOwnedMemberElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberElement() {
  		return false;
	}

} //FeatureMembershipImpl
