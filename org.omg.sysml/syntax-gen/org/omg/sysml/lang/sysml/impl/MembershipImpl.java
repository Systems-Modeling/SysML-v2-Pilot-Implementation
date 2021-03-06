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
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getOwnedRelatedElement_comp <em>Owned Related Element comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getMemberName <em>Member Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getMembershipOwningNamespace <em>Membership Owning Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getOwnedMemberElement_comp <em>Owned Member Element comp</em>}</li>
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
	 * The cached value of the '{@link #getOwnedMemberElement_comp() <em>Owned Member Element comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMemberElement_comp()
	 * @generated
	 * @ordered
	 */
	protected Element ownedMemberElement_comp;

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
	 * Note: This is still necessary, because the Xtext lazy linker clears the memberElement value set via a
	 * call to setOwnedMemberElement_comp, but does not install a proxy.
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
	 * @generated NOT
	 */
	@Override
	public void setMemberElement(Element newMemberElement) {
		Element oldMemberElement = memberElement;
		memberElement = newMemberElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT, oldMemberElement, memberElement));
		// Note: The generated code below causes the owned member element to be nulled during the Xtext reconcilation process.
//		Resource.Internal eInternalResource = eInternalResource();
//		if (eInternalResource == null || !eInternalResource.isLoading()) {
//			if (ownedMemberElement_comp != null && ownedMemberElement_comp != newMemberElement) {
//				setOwnedMemberElement_comp(null);
//			}
//		}
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
	public EList<Element> getOwnedRelatedElement_comp() {
		if (ownedRelatedElement_comp == null) {
			ownedRelatedElement_comp = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.MEMBERSHIP__OWNED_RELATED_ELEMENT_COMP, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement_comp;
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
		return basicSetMembershipOwningNamespace((Namespace) newOwningRelatedElement, msgs);
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
				if (memberElement == getOwnedMemberElement_comp()) {
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
		if (eContainerFeatureID() != SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE) return null;
		return (Namespace)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMembershipOwningNamespace(Namespace newMembershipOwningNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMembershipOwningNamespace, SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMembershipOwningNamespace(Namespace newMembershipOwningNamespace) {
		if (newMembershipOwningNamespace != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE && newMembershipOwningNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newMembershipOwningNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMembershipOwningNamespace != null)
				msgs = ((InternalEObject)newMembershipOwningNamespace).eInverseAdd(this, SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP_COMP, Namespace.class, msgs);
			msgs = basicSetMembershipOwningNamespace(newMembershipOwningNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE, newMembershipOwningNamespace, newMembershipOwningNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembershipOwningNamespace() {
		return getMembershipOwningNamespace() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwnedMemberElement_comp() {
		return ownedMemberElement_comp;
	}
	
	public NotificationChain basicSetOwnedMemberElement_comp(Element newOwnedMemberElement_comp, NotificationChain msgs) {
		setMemberNameFrom(newOwnedMemberElement_comp);
		return basicSetOwnedMemberElement_compGen(newOwnedMemberElement_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberElement_compGen(Element newOwnedMemberElement_comp, NotificationChain msgs) {
		Element oldOwnedMemberElement_comp = ownedMemberElement_comp;
		ownedMemberElement_comp = newOwnedMemberElement_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP, oldOwnedMemberElement_comp, newOwnedMemberElement_comp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedMemberElement_comp(Element newOwnedMemberElement_comp) {
		if (newOwnedMemberElement_comp != ownedMemberElement_comp) {
			NotificationChain msgs = null;
			if (ownedMemberElement_comp != null)
				msgs = ((InternalEObject)ownedMemberElement_comp).eInverseRemove(this, SysMLPackage.ELEMENT__OWNING_MEMBERSHIP, Element.class, msgs);
			if (newOwnedMemberElement_comp != null)
				msgs = ((InternalEObject)newOwnedMemberElement_comp).eInverseAdd(this, SysMLPackage.ELEMENT__OWNING_MEMBERSHIP, Element.class, msgs);
			msgs = basicSetOwnedMemberElement_comp(newOwnedMemberElement_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP, newOwnedMemberElement_comp, newOwnedMemberElement_comp));
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
		return getOwnedMemberElement_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedMemberElement(Element newOwnedMemberElement) {
		setOwnedMemberElement_comp(newOwnedMemberElement);
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
	
	// Additional subsets
	
	@Override
	public EList<Element> getOwnedRelatedElement() {
		EList<Element> relatedElements = super.getOwnedRelatedElement();
		Element ownedMemberElement = getOwnedMemberElement();
		if (ownedMemberElement != null) {
			relatedElements.add(getOwnedMemberElement());
		}
		return relatedElements;
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
			case SysMLPackage.MEMBERSHIP__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMembershipOwningNamespace((Namespace)otherEnd, msgs);
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP:
				if (ownedMemberElement_comp != null)
					msgs = ((InternalEObject)ownedMemberElement_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP, null, msgs);
				return basicSetOwnedMemberElement_comp((Element)otherEnd, msgs);
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
			case SysMLPackage.MEMBERSHIP__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<?>)getOwnedRelatedElement_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE:
				return basicSetMembershipOwningNamespace(null, msgs);
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP:
				return basicSetOwnedMemberElement_comp(null, msgs);
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
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP_COMP, Namespace.class, msgs);
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
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT:
				if (resolve) return getMemberElement();
				return basicGetMemberElement();
			case SysMLPackage.MEMBERSHIP__MEMBER_NAME:
				return getMemberName();
			case SysMLPackage.MEMBERSHIP__VISIBILITY:
				return getVisibility();
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE:
				return getMembershipOwningNamespace();
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP:
				return getOwnedMemberElement_comp();
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
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP:
				setOwnedMemberElement_comp((Element)newValue);
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
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP:
				setOwnedMemberElement_comp((Element)null);
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
			case SysMLPackage.MEMBERSHIP__OWNED_RELATED_ELEMENT_COMP:
				return ownedRelatedElement_comp != null && !ownedRelatedElement_comp.isEmpty();
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
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP:
				return ownedMemberElement_comp != null;
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
