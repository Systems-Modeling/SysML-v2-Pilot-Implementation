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
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.TypeFeaturing;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getFeatureOfType <em>Feature Of Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getFeaturingType <em>Featuring Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getOwningFeatureOfType <em>Owning Feature Of Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getOwnedMemberFeature <em>Owned Member Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getOwningType <em>Owning Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureMembershipImpl extends OwningMembershipImpl implements FeatureMembership {
	/**
	 * The cached value of the '{@link #getFeatureOfType() <em>Feature Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfType()
	 * @generated
	 * @ordered
	 */
	protected Feature featureOfType;

	/**
	 * The cached value of the '{@link #getFeaturingType() <em>Featuring Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturingType()
	 * @generated
	 * @ordered
	 */
	protected Type featuringType;

	/**
	 * The cached setting delegate for the '{@link #getOwningFeatureOfType() <em>Owning Feature Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningFeatureOfType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNING_FEATURE_OF_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TYPE_FEATURING__OWNING_FEATURE_OF_TYPE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwnedMemberFeature() <em>Owned Member Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMemberFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_MEMBER_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwningType() <em>Owning Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNING_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNING_TYPE).getSettingDelegate();

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated NOT
	 * @ordered
	 */
	protected static final FeatureDirectionKind DIRECTION_EDEFAULT = null;

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
	@Override
	public Type getFeaturingType() {
		if (featuringType != null && featuringType.eIsProxy()) {
			InternalEObject oldFeaturingType = (InternalEObject)featuringType;
			featuringType = (Type)eResolveProxy(oldFeaturingType);
			if (featuringType != oldFeaturingType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_MEMBERSHIP__FEATURING_TYPE, oldFeaturingType, featuringType));
			}
		}
		return featuringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetFeaturingType() {
		return featuringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeaturingType(Type newFeaturingType) {
		Type oldFeaturingType = featuringType;
		featuringType = newFeaturingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__FEATURING_TYPE, oldFeaturingType, featuringType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeaturingType() {
		return featuringType != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwningFeatureOfType() {
		return (Feature)OWNING_FEATURE_OF_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetOwningFeatureOfType() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwningFeatureOfType(Feature newOwningFeatureOfType) {
		throw new UnsupportedOperationException();
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
	public boolean isSetOwningType() {
		return basicGetOwningType() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberFeature() {
		return (Feature)OWNED_MEMBER_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetOwnedMemberFeature() {
		return (Feature)OWNED_MEMBER_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedMemberFeature(Feature newOwnedMemberFeature) {
		OWNED_MEMBER_FEATURE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwnedMemberFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberFeature() {
		return basicGetOwnedMemberFeature() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Feature getFeatureOfType() {
		// Note: featureOfType is not derived, but its subsetting of ownedMemberFeature
		// must be implemented by hand.
		return getOwnedMemberFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetFeatureOfType() {
		return basicGetOwnedMemberFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setFeatureOfType(Feature newFeatureOfType) {
	    setOwnedMemberFeature(newFeatureOfType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatureOfType() {
		return featureOfType != null;
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
	public Element getOwnedMemberElement() {
		return getOwnedMemberFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwnedMemberElement() {
		return basicGetOwnedMemberFeature();
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
		setOwnedMemberFeature((Feature) newOwnedMemberElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberElement() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.FEATURE_MEMBERSHIP__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.FEATURE_MEMBERSHIP__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.FEATURE_MEMBERSHIP__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getMembershipOwningNamespace() {
		return getOwningType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace basicGetMembershipOwningNamespace() {
		return basicGetOwningType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMembershipOwningNamespace(Namespace newMembershipOwningNamespace) {
		if (newMembershipOwningNamespace != null && !(newMembershipOwningNamespace instanceof Type)) {
			throw new IllegalArgumentException("newMembershipOwningNamespace must be an instance of Type");
		}
		setOwningType((Type) newMembershipOwningNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembershipOwningNamespace() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE_OF_TYPE:
				if (resolve) return getFeatureOfType();
				return basicGetFeatureOfType();
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURING_TYPE:
				if (resolve) return getFeaturingType();
				return basicGetFeaturingType();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
				if (resolve) return getOwningFeatureOfType();
				return basicGetOwningFeatureOfType();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				if (resolve) return getOwnedMemberFeature();
				return basicGetOwnedMemberFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_TYPE:
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
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE_OF_TYPE:
				setFeatureOfType((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURING_TYPE:
				setFeaturingType((Type)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
				setOwningFeatureOfType((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				setOwnedMemberFeature((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_TYPE:
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
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE_OF_TYPE:
				setFeatureOfType((Feature)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURING_TYPE:
				setFeaturingType((Type)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
				setOwningFeatureOfType((Feature)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				setOwnedMemberFeature((Feature)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_TYPE:
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
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE_OF_TYPE:
				return isSetFeatureOfType();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.FEATURE_MEMBERSHIP__SOURCE:
				return isSetSource();
			case SysMLPackage.FEATURE_MEMBERSHIP__TARGET:
				return isSetTarget();
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURING_TYPE:
				return isSetFeaturingType();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
				return OWNING_FEATURE_OF_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				return isSetOwnedMemberElement();
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE:
				return isSetMembershipOwningNamespace();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				return isSetOwnedMemberFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_TYPE:
				return isSetOwningType();
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
		if (baseClass == TypeFeaturing.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE_OF_TYPE: return SysMLPackage.TYPE_FEATURING__FEATURE_OF_TYPE;
				case SysMLPackage.FEATURE_MEMBERSHIP__FEATURING_TYPE: return SysMLPackage.TYPE_FEATURING__FEATURING_TYPE;
				case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE: return SysMLPackage.TYPE_FEATURING__OWNING_FEATURE_OF_TYPE;
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
		if (baseClass == TypeFeaturing.class) {
			switch (baseFeatureID) {
				case SysMLPackage.TYPE_FEATURING__FEATURE_OF_TYPE: return SysMLPackage.FEATURE_MEMBERSHIP__FEATURE_OF_TYPE;
				case SysMLPackage.TYPE_FEATURING__FEATURING_TYPE: return SysMLPackage.FEATURE_MEMBERSHIP__FEATURING_TYPE;
				case SysMLPackage.TYPE_FEATURING__OWNING_FEATURE_OF_TYPE: return SysMLPackage.FEATURE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FeatureMembershipImpl
