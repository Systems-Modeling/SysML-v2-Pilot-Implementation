/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.util.ElementUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getMemberElementId <em>Member Element Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getMembershipOwningNamespace <em>Membership Owning Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getMemberShortName <em>Member Short Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getMemberElement <em>Member Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getMemberName <em>Member Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MembershipImpl extends RelationshipImpl implements Membership {
	/**
	 * The cached setting delegate for the '{@link #getMemberElementId() <em>Member Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberElementId()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MEMBER_ELEMENT_ID__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.MEMBERSHIP__MEMBER_ELEMENT_ID).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getMembershipOwningNamespace() <em>Membership Owning Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembershipOwningNamespace()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MEMBERSHIP_OWNING_NAMESPACE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE).getSettingDelegate();

	/**
	 * The default value of the '{@link #getMemberShortName() <em>Member Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBER_SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberShortName() <em>Member Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberShortName()
	 * @generated
	 * @ordered
	 */
	protected String memberShortName = MEMBER_SHORT_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getMemberName() <em>Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberName() <em>Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberName()
	 * @generated
	 * @ordered
	 */
	protected String memberName = MEMBER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.MEMBERSHIP;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getMemberElement() {
		if (memberElement != null && memberElement.eIsProxy()) {
			InternalEObject oldMemberElement = (InternalEObject)memberElement;
			memberElement = (Element)eResolveProxy(oldMemberElement);
			if (memberElement != oldMemberElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT, oldMemberElement, memberElement));
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
	@Override
	public void setMemberElement(Element newMemberElement) {
		Element oldMemberElement = memberElement;
		memberElement = newMemberElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT, oldMemberElement, memberElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberElement() {
		return memberElement != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMemberName() {
		return memberName;
	}
	
	@Override
	public void setMemberName(String newMemberName) {
		setMemberNameGen(ElementUtil.unescapeString(newMemberName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberNameGen(String newMemberName) {
		String oldMemberName = memberName;
		memberName = newMemberName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MEMBERSHIP__MEMBER_NAME, oldMemberName, memberName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
			if (EcoreUtil.isAncestor(this, newOwningRelatedElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningRelatedElement != null)
				msgs = ((InternalEObject)newOwningRelatedElement).eInverseAdd(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, Element.class, msgs);
			msgs = basicSetOwningRelatedElement(newOwningRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMemberElementId() {
		return (String)MEMBER_ELEMENT_ID__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberElementId(String newMemberElementId) {
		MEMBER_ELEMENT_ID__ESETTING_DELEGATE.dynamicSet(this, null, 0, newMemberElementId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MEMBERSHIP__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * The cached invocation delegate for the '{@link #isDistinguishableFrom(org.omg.sysml.lang.sysml.Membership) <em>Is Distinguishable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinguishableFrom(org.omg.sysml.lang.sysml.Membership)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_DISTINGUISHABLE_FROM_MEMBERSHIP__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getMembershipOwningNamespace() {
		return (Namespace)MEMBERSHIP_OWNING_NAMESPACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetMembershipOwningNamespace() {
		return (Namespace)MEMBERSHIP_OWNING_NAMESPACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMembershipOwningNamespace(Namespace newMembershipOwningNamespace) {
		MEMBERSHIP_OWNING_NAMESPACE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newMembershipOwningNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembershipOwningNamespace() {
		return basicGetMembershipOwningNamespace() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMemberShortName() {
		return memberShortName;
	}

	@Override
	public void setMemberShortName(String newMemberShortName) {
		setMemberShortNameGen(ElementUtil.unescapeString(newMemberShortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberShortNameGen(String newMemberShortName) {
		String oldMemberShortName = memberShortName;
		memberShortName = newMemberShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MEMBERSHIP__MEMBER_SHORT_NAME, oldMemberShortName, memberShortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Element memberElement = getMemberElement();
		if (memberElement != null) {
			target.add(memberElement);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__TARGET, target.size(), target.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTarget() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Namespace membershipOwningNamespace = getMembershipOwningNamespace();
		if (membershipOwningNamespace != null) {
			source.add(membershipOwningNamespace);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__SOURCE, source.size(), source.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
  		return false;
	}
	
	// Operations
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDistinguishableFrom(Membership other) {
		try {
			return (Boolean)IS_DISTINGUISHABLE_FROM_MEMBERSHIP__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{other}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}
	
	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelatedElement((Element)otherEnd, msgs);
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
			case SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT:
				return basicSetOwningRelatedElement(null, msgs);
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
			case SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, Element.class, msgs);
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
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT_ID:
				return getMemberElementId();
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE:
				if (resolve) return getMembershipOwningNamespace();
				return basicGetMembershipOwningNamespace();
			case SysMLPackage.MEMBERSHIP__MEMBER_SHORT_NAME:
				return getMemberShortName();
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT:
				if (resolve) return getMemberElement();
				return basicGetMemberElement();
			case SysMLPackage.MEMBERSHIP__MEMBER_NAME:
				return getMemberName();
			case SysMLPackage.MEMBERSHIP__VISIBILITY:
				return getVisibility();
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
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT_ID:
				setMemberElementId((String)newValue);
				return;
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE:
				setMembershipOwningNamespace((Namespace)newValue);
				return;
			case SysMLPackage.MEMBERSHIP__MEMBER_SHORT_NAME:
				setMemberShortName((String)newValue);
				return;
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT:
				setMemberElement((Element)newValue);
				return;
			case SysMLPackage.MEMBERSHIP__MEMBER_NAME:
				setMemberName((String)newValue);
				return;
			case SysMLPackage.MEMBERSHIP__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
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
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT_ID:
				MEMBER_ELEMENT_ID__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE:
				setMembershipOwningNamespace((Namespace)null);
				return;
			case SysMLPackage.MEMBERSHIP__MEMBER_SHORT_NAME:
				setMemberShortName(MEMBER_SHORT_NAME_EDEFAULT);
				return;
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT:
				setMemberElement((Element)null);
				return;
			case SysMLPackage.MEMBERSHIP__MEMBER_NAME:
				setMemberName(MEMBER_NAME_EDEFAULT);
				return;
			case SysMLPackage.MEMBERSHIP__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
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
			case SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.MEMBERSHIP__SOURCE:
				return isSetSource();
			case SysMLPackage.MEMBERSHIP__TARGET:
				return isSetTarget();
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT_ID:
				return MEMBER_ELEMENT_ID__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE:
				return isSetMembershipOwningNamespace();
			case SysMLPackage.MEMBERSHIP__MEMBER_SHORT_NAME:
				return MEMBER_SHORT_NAME_EDEFAULT == null ? memberShortName != null : !MEMBER_SHORT_NAME_EDEFAULT.equals(memberShortName);
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT:
				return isSetMemberElement();
			case SysMLPackage.MEMBERSHIP__MEMBER_NAME:
				return MEMBER_NAME_EDEFAULT == null ? memberName != null : !MEMBER_NAME_EDEFAULT.equals(memberName);
			case SysMLPackage.MEMBERSHIP__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP:
				return isDistinguishableFrom((Membership)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (memberShortName: ");
		result.append(memberShortName);
		result.append(", memberName: ");
		result.append(memberName);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //MembershipImpl
