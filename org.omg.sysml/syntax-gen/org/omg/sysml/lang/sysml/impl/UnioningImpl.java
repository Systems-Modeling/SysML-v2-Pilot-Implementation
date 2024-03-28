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

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Unioning;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unioning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UnioningImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UnioningImpl#getTypeUnioned <em>Type Unioned</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UnioningImpl#getUnioningType <em>Unioning Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnioningImpl extends RelationshipImpl implements Unioning {
	/**
	 * The cached setting delegate for the '{@link #getTypeUnioned() <em>Type Unioned</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeUnioned()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TYPE_UNIONED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.UNIONING__TYPE_UNIONED).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getUnioningType() <em>Unioning Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnioningType()
	 * @generated
	 * @ordered
	 */
	protected Type unioningType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnioningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.UNIONING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.UNIONING__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.UNIONING__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.UNIONING__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.UNIONING__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Type getUnioningType() {
		return unioningType == null? basicGetUnioningType(): getUnioningTypeGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getUnioningTypeGen() {
		if (unioningType != null && unioningType.eIsProxy()) {
			InternalEObject oldUnioningType = (InternalEObject)unioningType;
			unioningType = (Type)eResolveProxy(oldUnioningType);
			if (unioningType != oldUnioningType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.UNIONING__UNIONING_TYPE, oldUnioningType, unioningType));
			}
		}
		return unioningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround:
	 * If a Unioning is parsed targeting a Feature chain, then the unioningType will be empty,
	 * but the Unioning will own the unioningType. So, in this case, the unioningType should
	 * be set to the (last) ownedRelatedelement.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type basicGetUnioningType() {
		if (unioningType == null) {
			// Handle a intersectingType that is a Feature chain.
			EList<Element> ownedRelatedElements = getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				unioningType = (Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1);
			}
		}
		return unioningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnioningType(Type newUnioningType) {
		Type oldUnioningType = unioningType;
		unioningType = newUnioningType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.UNIONING__UNIONING_TYPE, oldUnioningType, unioningType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnioningType() {
		return unioningType != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getTypeUnioned() {
		return (Type)TYPE_UNIONED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetTypeUnioned() {
		return (Type)TYPE_UNIONED__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeUnioned(Type newTypeUnioned) {
		TYPE_UNIONED__ESETTING_DELEGATE.dynamicSet(this, null, 0, newTypeUnioned);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeUnioned() {
		return basicGetTypeUnioned() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.UNIONING__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.UNIONING__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.UNIONING__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.UNIONING__TYPE_UNIONED:
				if (resolve) return getTypeUnioned();
				return basicGetTypeUnioned();
			case SysMLPackage.UNIONING__UNIONING_TYPE:
				if (resolve) return getUnioningType();
				return basicGetUnioningType();
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
			case SysMLPackage.UNIONING__TYPE_UNIONED:
				setTypeUnioned((Type)newValue);
				return;
			case SysMLPackage.UNIONING__UNIONING_TYPE:
				setUnioningType((Type)newValue);
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
			case SysMLPackage.UNIONING__TYPE_UNIONED:
				setTypeUnioned((Type)null);
				return;
			case SysMLPackage.UNIONING__UNIONING_TYPE:
				setUnioningType((Type)null);
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
			case SysMLPackage.UNIONING__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.UNIONING__SOURCE:
				return isSetSource();
			case SysMLPackage.UNIONING__TARGET:
				return isSetTarget();
			case SysMLPackage.UNIONING__TYPE_UNIONED:
				return isSetTypeUnioned();
			case SysMLPackage.UNIONING__UNIONING_TYPE:
				return isSetUnioningType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Type unioningType = getUnioningType();
		if (unioningType != null) {
			target.add(unioningType);
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
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Type typeUnioned = getTypeUnioned();
		if (typeUnioned != null) {
			source.add(typeUnioned);
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

} //UnioningImpl
