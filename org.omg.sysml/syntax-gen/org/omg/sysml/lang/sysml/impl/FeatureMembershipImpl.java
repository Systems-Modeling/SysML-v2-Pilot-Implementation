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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getOwningFeatureOfType <em>Owning Feature Of Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getFeaturingType <em>Featuring Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getMemberFeature <em>Member Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getOwnedMemberFeature <em>Owned Member Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#isReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#isPortion <em>Is Portion</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#isPort <em>Is Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getOwningType <em>Owning Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureMembershipImpl extends MembershipImpl implements FeatureMembership {
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
	 * The default value of the '{@link #isComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComposite()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposite = IS_COMPOSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPortion() <em>Is Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPortion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PORTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPortion() <em>Is Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPortion()
	 * @generated
	 * @ordered
	 */
	protected boolean isPortion = IS_PORTION_EDEFAULT;

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
	 * @generated NOT
	 * @ordered
	 */
	protected static final FeatureDirectionKind DIRECTION_EDEFAULT = null;

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
		Feature owningFeatureOfType = basicGetOwningFeatureOfType();
		return owningFeatureOfType != null && owningFeatureOfType.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)owningFeatureOfType) : owningFeatureOfType;
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
	}

	@Override
	public Feature getMemberFeature() {
		return memberFeature == null? basicGetMemberFeature(): getMemberFeatureGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getMemberFeatureGen() {
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
	 * This is still necessary, because the Xtext grammar bypasses setOwnedMemberFeature to add a new Feature
	 * directly into the ownedRelationship list.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetMemberFeature() {
		Feature ownedMemberFeature = getOwnedMemberFeature();
		if (memberFeature == null && ownedMemberFeature != null) {
			memberFeature = ownedMemberFeature;
		}
		return memberFeature;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	public boolean isSetMemberFeature() {
		return memberFeature != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public boolean isReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public boolean isPortion() {
		return isPortion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPortion(boolean newIsPortion) {
		boolean oldIsPortion = isPortion;
		isPortion = newIsPortion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__IS_PORTION, oldIsPortion, isPortion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPort() {
		return isPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPort(boolean newIsPort) {
		boolean oldIsPort = isPort;
		isPort = newIsPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT, oldIsPort, isPort));
	}

	/**
	 * @generated
	 */
	@Override
	public FeatureDirectionKind getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public Type getOwningType() {
		Type owningType = basicGetOwningType();
		return owningType != null && owningType.eIsProxy() ? (Type)eResolveProxy((InternalEObject)owningType) : owningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type basicGetOwningType() {
		Element owningNamespace = super.basicGetMembershipOwningNamespace();
		return owningNamespace instanceof Type? (Type)owningNamespace: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwningType(Type newOwningType) {
		super.setMembershipOwningNamespace(newOwningType);
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
		Feature ownedMemberFeature = basicGetOwnedMemberFeature();
		return ownedMemberFeature != null && ownedMemberFeature.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)ownedMemberFeature) : ownedMemberFeature;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetOwnedMemberFeature() {
		Element ownedMemberElement = super.basicGetOwnedMemberElement();
		return ownedMemberElement instanceof Feature? (Feature)ownedMemberElement: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedMemberFeature(Feature newOwnedMemberFeature) {
		super.setOwnedMemberElement(newOwnedMemberFeature);
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
	public boolean isComposite() {
		if (!isComposite) {
			Feature memberFeature = getOwnedMemberFeature();
			isComposite = memberFeature != null && ((FeatureImpl)memberFeature).basicIsComposite( );
		}
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsComposite(boolean newIsComposite) {
		boolean oldIsComposite = isComposite;
		isComposite = newIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__IS_COMPOSITE, oldIsComposite, isComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeatureOfType() {
		return getMemberFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeatureOfType() {
		return basicGetMemberFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureOfType(Feature newFeatureOfType) {
		setMemberFeature(newFeatureOfType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatureOfType() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE_OF_TYPE:
				if (resolve) return getFeatureOfType();
				return basicGetFeatureOfType();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
				if (resolve) return getOwningFeatureOfType();
				return basicGetOwningFeatureOfType();
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURING_TYPE:
				if (resolve) return getFeaturingType();
				return basicGetFeaturingType();
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				if (resolve) return getMemberFeature();
				return basicGetMemberFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				if (resolve) return getOwnedMemberFeature();
				return basicGetOwnedMemberFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_DERIVED:
				return isDerived();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_READ_ONLY:
				return isReadOnly();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_COMPOSITE:
				return isComposite();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORTION:
				return isPortion();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				return isPort();
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				return getDirection();
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
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
				setOwningFeatureOfType((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURING_TYPE:
				setFeaturingType((Type)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				setMemberFeature((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				setOwnedMemberFeature((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_COMPOSITE:
				setIsComposite((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORTION:
				setIsPortion((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				setIsPort((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				setDirection((FeatureDirectionKind)newValue);
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
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
				setOwningFeatureOfType((Feature)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURING_TYPE:
				setFeaturingType((Type)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				setMemberFeature((Feature)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				setOwnedMemberFeature((Feature)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORTION:
				setIsPortion(IS_PORTION_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				setIsPort(IS_PORT_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
				return isSetOwningRelatedElement();
			case SysMLPackage.FEATURE_MEMBERSHIP__SOURCE:
				return isSetSource();
			case SysMLPackage.FEATURE_MEMBERSHIP__TARGET:
				return isSetTarget();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
				return basicGetOwningFeatureOfType() != null;
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURING_TYPE:
				return isSetFeaturingType();
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				return isSetMemberFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				return isSetOwnedMemberElement();
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_ELEMENT:
				return isSetMemberElement();
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE:
				return isSetMembershipOwningNamespace();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				return isSetOwnedMemberFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_COMPOSITE:
				return isComposite != IS_COMPOSITE_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORTION:
				return isPortion != IS_PORTION_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				return isPort != IS_PORT_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
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
				case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE: return SysMLPackage.TYPE_FEATURING__OWNING_FEATURE_OF_TYPE;
				case SysMLPackage.FEATURE_MEMBERSHIP__FEATURING_TYPE: return SysMLPackage.TYPE_FEATURING__FEATURING_TYPE;
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
				case SysMLPackage.TYPE_FEATURING__OWNING_FEATURE_OF_TYPE: return SysMLPackage.FEATURE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE;
				case SysMLPackage.TYPE_FEATURING__FEATURING_TYPE: return SysMLPackage.FEATURE_MEMBERSHIP__FEATURING_TYPE;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isDerived: ");
		result.append(isDerived);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(", isPortion: ");
		result.append(isPortion);
		result.append(", isPort: ");
		result.append(isPort);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //FeatureMembershipImpl
