/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Disjoining;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disjoining</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DisjoiningImpl#getTypeDisjoined <em>Type Disjoined</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DisjoiningImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DisjoiningImpl#getDisjoiningType <em>Disjoining Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DisjoiningImpl#getOwningType <em>Owning Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisjoiningImpl extends RelationshipImpl implements Disjoining {
	/**
	 * The cached value of the '{@link #getTypeDisjoined() <em>Type Disjoined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDisjoined()
	 * @generated
	 * @ordered
	 */
	protected Type typeDisjoined;

	/**
	 * The cached value of the '{@link #getDisjoiningType() <em>Disjoining Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjoiningType()
	 * @generated
	 * @ordered
	 */
	protected Type disjoiningType;

	/**
	 * The cached setting delegate for the '{@link #getOwningType() <em>Owning Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNING_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DISJOINING__OWNING_TYPE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisjoiningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.DISJOINING;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Type getDisjoiningType() {
		return disjoiningType == null? basicGetDisjoiningType(): getDisjoiningTypeGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getDisjoiningTypeGen() {
		if (disjoiningType != null && disjoiningType.eIsProxy()) {
			InternalEObject oldDisjoiningType = (InternalEObject)disjoiningType;
			disjoiningType = (Type)eResolveProxy(oldDisjoiningType);
			if (disjoiningType != oldDisjoiningType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.DISJOINING__DISJOINING_TYPE, oldDisjoiningType, disjoiningType));
			}
		}
		return disjoiningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround:
	 * If a Disjoining is parsed targeting a Feature chain, then the disjoiningType will be empty,
	 * but the Disjoining will own the disjoiningType. So, in this case, the disjoiningType should
	 * be set to the (last) ownedRelatedelement.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type basicGetDisjoiningType() {
		if (disjoiningType == null) {
			// Handle a disjoiningType that is a Feature chain.
			EList<Element> ownedRelatedElements = getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				disjoiningType = (Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1);
			}
		}
		
		return disjoiningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisjoiningType(Type newDisjoiningType) {
		Type oldDisjoiningType = disjoiningType;
		disjoiningType = newDisjoiningType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.DISJOINING__DISJOINING_TYPE, oldDisjoiningType, disjoiningType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisjoiningType() {
		return disjoiningType != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		return (Type)OWNING_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetOwningType() {
		return (Type)OWNING_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningType(Type newOwningType) {
		OWNING_TYPE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwningType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, Element.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Type getTypeDisjoined() {
		return typeDisjoined == null? basicGetTypeDisjoined(): getTypeDisjoinedGen();
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getTypeDisjoinedGen() {
		if (typeDisjoined != null && typeDisjoined.eIsProxy()) {
			InternalEObject oldTypeDisjoined = (InternalEObject)typeDisjoined;
			typeDisjoined = (Type)eResolveProxy(oldTypeDisjoined);
			if (typeDisjoined != oldTypeDisjoined) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.DISJOINING__TYPE_DISJOINED, oldTypeDisjoined, typeDisjoined));
			}
		}
		return typeDisjoined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround:
	 * If the typedDisjoined (source) is empty, set it to the owningRelatedElement, if it is a Type.
	 * Otherwise, set it to the first ownedRelatedElement, to the first ownedRelatedElement,
	 * which will be a Feature chain.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type basicGetTypeDisjoined() {
		if (typeDisjoined == null) {
			Element owner = getOwningRelatedElement();
			if (owner instanceof Type) {
				// Handle a Disjoining owned by the typeDisjoined.
				typeDisjoined = (Type)owner;
			} else {
				// Handle a typeDisjoined that is a Feature chain.
				EList<Element> ownedRelatedElements = getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					typeDisjoined = (Feature)ownedRelatedElements.get(0);
				}
			}
		}
		
		return typeDisjoined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeDisjoined(Type newTypeDisjoined) {
		Type oldTypeDisjoined = typeDisjoined;
		typeDisjoined = newTypeDisjoined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.DISJOINING__TYPE_DISJOINED, oldTypeDisjoined, typeDisjoined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeDisjoined() {
		return typeDisjoined != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Type disjoiningType = getDisjoiningType();
		if (disjoiningType != null) {
			target.add(disjoiningType);
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
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Type typeDisjoined = getTypeDisjoined();
		if (typeDisjoined != null) {
			source.add(typeDisjoined);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.DISJOINING__TYPE_DISJOINED:
				if (resolve) return getTypeDisjoined();
				return basicGetTypeDisjoined();
			case SysMLPackage.DISJOINING__DISJOINING_TYPE:
				if (resolve) return getDisjoiningType();
				return basicGetDisjoiningType();
			case SysMLPackage.DISJOINING__OWNING_TYPE:
				if (resolve) return getOwningType();
				return basicGetOwningType();
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
			case SysMLPackage.DISJOINING__TYPE_DISJOINED:
				setTypeDisjoined((Type)newValue);
				return;
			case SysMLPackage.DISJOINING__DISJOINING_TYPE:
				setDisjoiningType((Type)newValue);
				return;
			case SysMLPackage.DISJOINING__OWNING_TYPE:
				setOwningType((Type)newValue);
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
			case SysMLPackage.DISJOINING__TYPE_DISJOINED:
				setTypeDisjoined((Type)null);
				return;
			case SysMLPackage.DISJOINING__DISJOINING_TYPE:
				setDisjoiningType((Type)null);
				return;
			case SysMLPackage.DISJOINING__OWNING_TYPE:
				setOwningType((Type)null);
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
			case SysMLPackage.DISJOINING__TYPE_DISJOINED:
				return isSetTypeDisjoined();
			case SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.DISJOINING__SOURCE:
				return isSetSource();
			case SysMLPackage.DISJOINING__TARGET:
				return isSetTarget();
			case SysMLPackage.DISJOINING__DISJOINING_TYPE:
				return isSetDisjoiningType();
			case SysMLPackage.DISJOINING__OWNING_TYPE:
				return OWNING_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //DisjoiningImpl
