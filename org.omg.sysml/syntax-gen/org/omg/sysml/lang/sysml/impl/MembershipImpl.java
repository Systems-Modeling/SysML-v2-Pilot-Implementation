/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getMemberElement <em>Member Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getMemberName <em>Member Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getMembershipOwningNamespace <em>Membership Owning Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getOwnedMemberElement <em>Owned Member Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MembershipImpl extends RelationshipImpl implements Membership {
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
	
	@Override
	public Element getMemberElement() {
		return memberElement == null? basicGetMemberElement(): getMemberElementGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getMemberElementGen() {
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
	 * This is still necessary, because the Xtext grammar bypasses setOwnedMemberElement to add a new Element
	 * directly into the ownedRelationship list.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element basicGetMemberElement() {
		Element ownedMemberElement = basicGetOwnedMemberElement();
		if (memberElement == null && ownedMemberElement != null) {
			memberElement = ownedMemberElement;
		}
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
	public EList<Element> getOwnedRelatedElement() {
		if (ownedRelatedElement == null) {
			ownedRelatedElement = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.MEMBERSHIP__OWNED_RELATED_ELEMENT, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		return getMembershipOwningNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		if (newOwningRelatedElement != null && !(newOwningRelatedElement instanceof Namespace)) {
			throw new IllegalArgumentException("newOwningRelatedElement must be an instance of Namespace");
		}
		setMembershipOwningNamespace((Namespace) newOwningRelatedElement);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != null && !(newOwningRelatedElement instanceof Namespace)) {
			throw new IllegalArgumentException("newOwningRelatedElement must be an instance of Namespace");
		}
		setMembershipOwningNamespace((Namespace) newOwningRelatedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningRelatedElement() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getMemberName() {
		if (memberName == null) {
			ElementImpl memberElement = (ElementImpl)this.getMemberElement();
			if (memberElement != null) {
				if (memberElement == getOwnedMemberElement()) {
					memberName = memberElement.basicGetName();
					memberElement.basicSetName(null);
				} else {
					memberName = memberElement.getName();
				}
			}
		}
		return memberName;
	}

	@Override
	public void setMemberName(String newMemberName) {
		isNameSet = true;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getMembershipOwningNamespace() {
		Namespace membershipOwningNamespace = basicGetMembershipOwningNamespace();
		return membershipOwningNamespace != null && membershipOwningNamespace.eIsProxy() ? (Namespace)eResolveProxy((InternalEObject)membershipOwningNamespace) : membershipOwningNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Namespace basicGetMembershipOwningNamespace() {
		Element owningRelatedElement = super.getOwningRelatedElement();
		return owningRelatedElement instanceof Namespace? (Namespace)owningRelatedElement: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setMembershipOwningNamespace(Namespace newMembershipOwningNamespace) {
		super.basicSetOwningRelatedElement(newMembershipOwningNamespace, null);
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
	public Element getOwnedMemberElement() {
		Element ownedMemberElement = basicGetOwnedMemberElement();
		return ownedMemberElement != null && ownedMemberElement.eIsProxy() ? (Element)eResolveProxy((InternalEObject)ownedMemberElement) : ownedMemberElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element basicGetOwnedMemberElement() {
		EList<Element> ownedRelatedElements = getOwnedRelatedElement();
		return ownedRelatedElements.isEmpty()? null: ownedRelatedElements.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedMemberElement(Element newOwnedMemberElement) {
		EList<Element> ownedRelatedElements = super.getOwnedRelatedElement();
		ownedRelatedElements.remove(getOwnedMemberElement());
		if (newOwnedMemberElement != null) { 
			setMemberNameFrom(newOwnedMemberElement);
			ownedRelatedElements.add(0, newOwnedMemberElement);
			setMemberElement(newOwnedMemberElement);
		}
	}

	// Operations
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isDistinguishableFrom(Membership other) {
		// TODO Implement full distinguishability test.
		String name = this.getMemberEffectiveName();
		return name == null 
			|| (!name.equals(((MembershipImpl)other).getMemberEffectiveName())
//			&& (this.memberElement == null || this.memberElement.getHumanId() == null ||
//			(
//					!name.equals(((MembershipImpl)other).memberElement.getHumanId())
//					&& !this.memberElement.getHumanId().equals(((MembershipImpl)other).memberElement.getHumanId())
//					&& !this.memberElement.getHumanId().equals(((MembershipImpl)other).getMemberEffectiveName())
//			)
//			)
			);
			
	}
	
	public String getMemberEffectiveName() {
		String name = getMemberName();
		if (name == null) {
			Element memberElement = getMemberElement();
			if (memberElement != null) {
				name = ((ElementImpl)memberElement).getEffectiveName();
			}
		}
		return name;
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
	
	// Additional
	
	private boolean isNameSet = false;
	
	protected void setMemberNameFrom(Element element) {
		if (!isNameSet) {
			memberName = ((ElementImpl)element).basicGetName();
			((ElementImpl)element).basicSetName(null);
		}
	}
	
	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.MEMBERSHIP__OWNED_RELATED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.MEMBERSHIP__OWNED_RELATED_ELEMENT:
				return ((InternalEList<?>)getOwnedRelatedElement()).basicRemove(otherEnd, msgs);
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
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT:
				if (resolve) return getMemberElement();
				return basicGetMemberElement();
			case SysMLPackage.MEMBERSHIP__MEMBER_NAME:
				return getMemberName();
			case SysMLPackage.MEMBERSHIP__VISIBILITY:
				return getVisibility();
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE:
				if (resolve) return getMembershipOwningNamespace();
				return basicGetMembershipOwningNamespace();
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				if (resolve) return getOwnedMemberElement();
				return basicGetOwnedMemberElement();
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
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT:
				setMemberElement((Element)newValue);
				return;
			case SysMLPackage.MEMBERSHIP__MEMBER_NAME:
				setMemberName((String)newValue);
				return;
			case SysMLPackage.MEMBERSHIP__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE:
				setMembershipOwningNamespace((Namespace)newValue);
				return;
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT:
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
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT:
				setMemberElement((Element)null);
				return;
			case SysMLPackage.MEMBERSHIP__MEMBER_NAME:
				setMemberName(MEMBER_NAME_EDEFAULT);
				return;
			case SysMLPackage.MEMBERSHIP__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE:
				setMembershipOwningNamespace((Namespace)null);
				return;
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT:
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
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT:
				return isSetMemberElement();
			case SysMLPackage.MEMBERSHIP__OWNED_RELATED_ELEMENT:
				return ownedRelatedElement != null && !ownedRelatedElement.isEmpty();
			case SysMLPackage.MEMBERSHIP__TARGET:
				return isSetTarget();
			case SysMLPackage.MEMBERSHIP__SOURCE:
				return isSetSource();
			case SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT:
				return isSetOwningRelatedElement();
			case SysMLPackage.MEMBERSHIP__MEMBER_NAME:
				return MEMBER_NAME_EDEFAULT == null ? memberName != null : !MEMBER_NAME_EDEFAULT.equals(memberName);
			case SysMLPackage.MEMBERSHIP__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE:
				return isSetMembershipOwningNamespace();
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				return basicGetOwnedMemberElement() != null;
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
		result.append(" (memberName: ");
		result.append(memberName);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //MembershipImpl
