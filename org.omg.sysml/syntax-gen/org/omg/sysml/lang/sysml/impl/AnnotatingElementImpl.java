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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotating Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotatingElementImpl#getOwnedRelationship <em>Owned Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotatingElementImpl#getOwningRelationship <em>Owning Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotatingElementImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotatingElementImpl#getOwnedAnnotatingRelationship <em>Owned Annotating Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotatingElementImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotatingElementImpl#getOwningAnnotatingRelationship <em>Owning Annotating Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotatingElementImpl extends ElementImpl implements AnnotatingElement {
	/**
	 * The cached setting delegate for the '{@link #getAnnotatedElement() <em>Annotated Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedElement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ANNOTATED_ELEMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwnedAnnotatingRelationship() <em>Owned Annotating Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAnnotatingRelationship()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_ANNOTATING_RELATIONSHIP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ANNOTATING_ELEMENT__OWNED_ANNOTATING_RELATIONSHIP).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAnnotation() <em>Annotation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ANNOTATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ANNOTATING_ELEMENT__ANNOTATION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwningAnnotatingRelationship() <em>Owning Annotating Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningAnnotatingRelationship()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNING_ANNOTATING_RELATIONSHIP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ANNOTATING_ELEMENT__OWNING_ANNOTATING_RELATIONSHIP).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotatingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ANNOTATING_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getAnnotatedElement() {
		return (EList<Element>)ANNOTATED_ELEMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Annotation> getOwnedAnnotatingRelationship() {
		return (EList<Annotation>)OWNED_ANNOTATING_RELATIONSHIP__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedAnnotatingRelationship() <em>Owned Annotating Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAnnotatingRelationship()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ANNOTATING_RELATIONSHIP_ESUPERSETS = new int[] {SysMLPackage.ANNOTATING_ELEMENT__OWNED_RELATIONSHIP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Annotation> getAnnotation() {
		return (EList<Annotation>)ANNOTATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation getOwningAnnotatingRelationship() {
		return (Annotation)OWNING_ANNOTATING_RELATIONSHIP__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation basicGetOwningAnnotatingRelationship() {
		return (Annotation)OWNING_ANNOTATING_RELATIONSHIP__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningAnnotatingRelationship(Annotation newOwningAnnotatingRelationship) {
		OWNING_ANNOTATING_RELATIONSHIP__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwningAnnotatingRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship() {
		if (ownedRelationship == null) {
			ownedRelationship = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.ANNOTATING_ELEMENT__OWNED_RELATIONSHIP, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relationship getOwningRelationship() {
		if (eContainerFeatureID() != SysMLPackage.ANNOTATING_ELEMENT__OWNING_RELATIONSHIP) return null;
		return (Relationship)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelationship(Relationship newOwningRelationship, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelationship, SysMLPackage.ANNOTATING_ELEMENT__OWNING_RELATIONSHIP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelationship(Relationship newOwningRelationship) {
		if (newOwningRelationship != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.ANNOTATING_ELEMENT__OWNING_RELATIONSHIP && newOwningRelationship != null)) {
			if (EcoreUtil.isAncestor(this, newOwningRelationship))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningRelationship != null)
				msgs = ((InternalEObject)newOwningRelationship).eInverseAdd(this, SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT, Relationship.class, msgs);
			msgs = basicSetOwningRelationship(newOwningRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ANNOTATING_ELEMENT__OWNING_RELATIONSHIP, newOwningRelationship, newOwningRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.ANNOTATING_ELEMENT__OWNED_RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ANNOTATING_ELEMENT__OWNING_RELATIONSHIP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelationship((Relationship)otherEnd, msgs);
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
			case SysMLPackage.ANNOTATING_ELEMENT__OWNED_RELATIONSHIP:
				return ((InternalEList<?>)getOwnedRelationship()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ANNOTATING_ELEMENT__OWNING_RELATIONSHIP:
				return basicSetOwningRelationship(null, msgs);
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
			case SysMLPackage.ANNOTATING_ELEMENT__OWNING_RELATIONSHIP:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT, Relationship.class, msgs);
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
			case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT:
				return getAnnotatedElement();
			case SysMLPackage.ANNOTATING_ELEMENT__OWNED_ANNOTATING_RELATIONSHIP:
				return getOwnedAnnotatingRelationship();
			case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION:
				return getAnnotation();
			case SysMLPackage.ANNOTATING_ELEMENT__OWNING_ANNOTATING_RELATIONSHIP:
				if (resolve) return getOwningAnnotatingRelationship();
				return basicGetOwningAnnotatingRelationship();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT:
				getAnnotatedElement().clear();
				getAnnotatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ANNOTATING_ELEMENT__OWNED_ANNOTATING_RELATIONSHIP:
				getOwnedAnnotatingRelationship().clear();
				getOwnedAnnotatingRelationship().addAll((Collection<? extends Annotation>)newValue);
				return;
			case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case SysMLPackage.ANNOTATING_ELEMENT__OWNING_ANNOTATING_RELATIONSHIP:
				setOwningAnnotatingRelationship((Annotation)newValue);
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
			case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT:
				getAnnotatedElement().clear();
				return;
			case SysMLPackage.ANNOTATING_ELEMENT__OWNED_ANNOTATING_RELATIONSHIP:
				getOwnedAnnotatingRelationship().clear();
				return;
			case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION:
				getAnnotation().clear();
				return;
			case SysMLPackage.ANNOTATING_ELEMENT__OWNING_ANNOTATING_RELATIONSHIP:
				setOwningAnnotatingRelationship((Annotation)null);
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
			case SysMLPackage.ANNOTATING_ELEMENT__OWNED_RELATIONSHIP:
				return ownedRelationship != null && !ownedRelationship.isEmpty();
			case SysMLPackage.ANNOTATING_ELEMENT__OWNING_RELATIONSHIP:
				return getOwningRelationship() != null;
			case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT:
				return ANNOTATED_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ANNOTATING_ELEMENT__OWNED_ANNOTATING_RELATIONSHIP:
				return OWNED_ANNOTATING_RELATIONSHIP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION:
				return ANNOTATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ANNOTATING_ELEMENT__OWNING_ANNOTATING_RELATIONSHIP:
				return OWNING_ANNOTATING_RELATIONSHIP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //AnnotatingElementImpl
