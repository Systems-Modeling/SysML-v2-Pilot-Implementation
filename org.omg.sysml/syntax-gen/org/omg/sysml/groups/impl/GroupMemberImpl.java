/**
 */
package org.omg.sysml.groups.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.omg.sysml.core.Element;

import org.omg.sysml.core.impl.RelationshipImpl;

import org.omg.sysml.groups.ElementGroup;
import org.omg.sysml.groups.GroupMember;
import org.omg.sysml.groups.GroupsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.groups.impl.GroupMemberImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.sysml.groups.impl.GroupMemberImpl#getMemberElement <em>Member Element</em>}</li>
 *   <li>{@link org.omg.sysml.groups.impl.GroupMemberImpl#getOwnedMemberElement <em>Owned Member Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupMemberImpl extends RelationshipImpl implements GroupMember {
	/**
	 * The cached value of the '{@link #getMemberElement() <em>Member Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberElement()
	 * @generated
	 * @ordered
	 */
	protected Element memberElement;

	/**
	 * The cached value of the '{@link #getOwnedMemberElement() <em>Owned Member Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMemberElement()
	 * @generated
	 * @ordered
	 */
	protected Element ownedMemberElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupsPackage.Literals.GROUP_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementGroup getGroup() {
		if (eContainerFeatureID() != GroupsPackage.GROUP_MEMBER__GROUP) return null;
		return (ElementGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(ElementGroup newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, GroupsPackage.GROUP_MEMBER__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(ElementGroup newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != GroupsPackage.GROUP_MEMBER__GROUP && newGroup != null)) {
			if (EcoreUtil.isAncestor(this, newGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, GroupsPackage.ELEMENT_GROUP__GROUP_MEMBER, ElementGroup.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupsPackage.GROUP_MEMBER__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getMemberElement() {
		if (memberElement != null && memberElement.eIsProxy()) {
			InternalEObject oldMemberElement = (InternalEObject)memberElement;
			memberElement = (Element)eResolveProxy(oldMemberElement);
			if (memberElement != oldMemberElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupsPackage.GROUP_MEMBER__MEMBER_ELEMENT, oldMemberElement, memberElement));
			}
		}
		return memberElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetMemberElement() {
		return memberElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberElement(Element newMemberElement) {
		Element oldMemberElement = memberElement;
		memberElement = newMemberElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupsPackage.GROUP_MEMBER__MEMBER_ELEMENT, oldMemberElement, memberElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwnedMemberElement() {
		return ownedMemberElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberElement(Element newOwnedMemberElement, NotificationChain msgs) {
		Element oldOwnedMemberElement = ownedMemberElement;
		ownedMemberElement = newOwnedMemberElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GroupsPackage.GROUP_MEMBER__OWNED_MEMBER_ELEMENT, oldOwnedMemberElement, newOwnedMemberElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberElement(Element newOwnedMemberElement) {
		if (newOwnedMemberElement != ownedMemberElement) {
			NotificationChain msgs = null;
			if (ownedMemberElement != null)
				msgs = ((InternalEObject)ownedMemberElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GroupsPackage.GROUP_MEMBER__OWNED_MEMBER_ELEMENT, null, msgs);
			if (newOwnedMemberElement != null)
				msgs = ((InternalEObject)newOwnedMemberElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GroupsPackage.GROUP_MEMBER__OWNED_MEMBER_ELEMENT, null, msgs);
			msgs = basicSetOwnedMemberElement(newOwnedMemberElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupsPackage.GROUP_MEMBER__OWNED_MEMBER_ELEMENT, newOwnedMemberElement, newOwnedMemberElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GroupsPackage.GROUP_MEMBER__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((ElementGroup)otherEnd, msgs);
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
			case GroupsPackage.GROUP_MEMBER__GROUP:
				return basicSetGroup(null, msgs);
			case GroupsPackage.GROUP_MEMBER__OWNED_MEMBER_ELEMENT:
				return basicSetOwnedMemberElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GroupsPackage.GROUP_MEMBER__GROUP:
				return eInternalContainer().eInverseRemove(this, GroupsPackage.ELEMENT_GROUP__GROUP_MEMBER, ElementGroup.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroupsPackage.GROUP_MEMBER__GROUP:
				return getGroup();
			case GroupsPackage.GROUP_MEMBER__MEMBER_ELEMENT:
				if (resolve) return getMemberElement();
				return basicGetMemberElement();
			case GroupsPackage.GROUP_MEMBER__OWNED_MEMBER_ELEMENT:
				return getOwnedMemberElement();
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
			case GroupsPackage.GROUP_MEMBER__GROUP:
				setGroup((ElementGroup)newValue);
				return;
			case GroupsPackage.GROUP_MEMBER__MEMBER_ELEMENT:
				setMemberElement((Element)newValue);
				return;
			case GroupsPackage.GROUP_MEMBER__OWNED_MEMBER_ELEMENT:
				setOwnedMemberElement((Element)newValue);
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
			case GroupsPackage.GROUP_MEMBER__GROUP:
				setGroup((ElementGroup)null);
				return;
			case GroupsPackage.GROUP_MEMBER__MEMBER_ELEMENT:
				setMemberElement((Element)null);
				return;
			case GroupsPackage.GROUP_MEMBER__OWNED_MEMBER_ELEMENT:
				setOwnedMemberElement((Element)null);
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
			case GroupsPackage.GROUP_MEMBER__GROUP:
				return getGroup() != null;
			case GroupsPackage.GROUP_MEMBER__MEMBER_ELEMENT:
				return memberElement != null;
			case GroupsPackage.GROUP_MEMBER__OWNED_MEMBER_ELEMENT:
				return ownedMemberElement != null;
		}
		return super.eIsSet(featureID);
	}

} //GroupMemberImpl
