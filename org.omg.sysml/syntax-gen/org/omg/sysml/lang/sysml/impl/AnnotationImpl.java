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

import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotationImpl#getAnnotatingElement <em>Annotating Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotationImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotationImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotationImpl#getOwningAnnotatedElement <em>Owning Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotationImpl#getOwningAnnotatingElement <em>Owning Annotating Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends RelationshipImpl implements Annotation {
	/**
	 * The cached value of the '{@link #getAnnotatingElement() <em>Annotating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatingElement()
	 * @generated
	 * @ordered
	 */
	protected AnnotatingElement annotatingElement;

	/**
	 * The cached value of the '{@link #getAnnotatedElement() <em>Annotated Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedElement()
	 * @generated
	 * @ordered
	 */
	protected Element annotatedElement;

	/**
	 * The cached setting delegate for the '{@link #getOwningAnnotatedElement() <em>Owning Annotated Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningAnnotatedElement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNING_ANNOTATED_ELEMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ANNOTATION__OWNING_ANNOTATED_ELEMENT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwningAnnotatingElement() <em>Owning Annotating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningAnnotatingElement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNING_ANNOTATING_ELEMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ANNOTATION__OWNING_ANNOTATING_ELEMENT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element getAnnotatedElement() {
		return annotatedElement == null? basicGetAnnotatedElement(): getAnnotatedElementGen();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getAnnotatedElementGen() {
		if (annotatedElement != null && annotatedElement.eIsProxy()) {
			InternalEObject oldAnnotatedElement = (InternalEObject)annotatedElement;
			annotatedElement = (Element)eResolveProxy(oldAnnotatedElement);
			if (annotatedElement != oldAnnotatedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT, oldAnnotatedElement, annotatedElement));
			}
		}
		return annotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround:
	 * If the Annotation is not owned by an AnnotatingElement, then the annotatedElement is the owningRelatedElement.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element basicGetAnnotatedElement() {
		if (annotatedElement == null) {
			Element owningRelatedElement = getOwningRelatedElement();
			if (!(owningRelatedElement instanceof AnnotatingElement)) {
				annotatedElement = owningRelatedElement;
			}
		}
		return annotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Do not set owningAnnotatedElement using annotatedElement.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setAnnotatedElement(Element newAnnotatedElement) {
		Element oldAnnotatedElement = annotatedElement;
		annotatedElement = newAnnotatedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT, oldAnnotatedElement, annotatedElement));
//		Resource.Internal eInternalResource = eInternalResource();
//		if (eInternalResource == null || !eInternalResource.isLoading()) {
//			Element owningAnnotatedElement = getOwningAnnotatedElement();
//			if (owningAnnotatedElement != null && owningAnnotatedElement != newAnnotatedElement) {
//				setOwningAnnotatedElement(null);
//			}
//		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnnotatedElement() {
		return annotatedElement != null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.ANNOTATION__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.ANNOTATION__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.ANNOTATION__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ANNOTATION__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public AnnotatingElement getAnnotatingElement() {
		return annotatingElement == null? basicGetAnnotatingElement(): getAnnotatingElementGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatingElement getAnnotatingElementGen() {
		if (annotatingElement != null && annotatingElement.eIsProxy()) {
			InternalEObject oldAnnotatingElement = (InternalEObject)annotatingElement;
			annotatingElement = (AnnotatingElement)eResolveProxy(oldAnnotatingElement);
			if (annotatingElement != oldAnnotatingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT, oldAnnotatingElement, annotatingElement));
			}
		}
		return annotatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround:
	 * If there is no annotatingElement set, then set the AnnotatingElement to the owningRelatedElement,
	 * if it is an AnnotatingElement, otherwise set it to the first ownedRelatedElement that is an
	 * AnnotatingElement (if any).
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AnnotatingElement basicGetAnnotatingElement() {
		if (annotatingElement == null) {
			Element owner = getOwningRelatedElement();
			annotatingElement = (AnnotatingElement)
					(owner instanceof AnnotatingElement? owner: 
						getOwnedRelatedElement().stream().
							filter(AnnotatingElement.class::isInstance).
							findFirst().orElse(null));
		}
		return annotatingElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotatingElement(AnnotatingElement newAnnotatingElement) {
		if (newAnnotatingElement != annotatingElement) {
			NotificationChain msgs = null;
			if (annotatingElement != null)
				msgs = ((InternalEObject)annotatingElement).eInverseRemove(this, SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION, AnnotatingElement.class, msgs);
			if (newAnnotatingElement != null)
				msgs = ((InternalEObject)newAnnotatingElement).eInverseAdd(this, SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION, AnnotatingElement.class, msgs);
			msgs = basicSetAnnotatingElement(newAnnotatingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT, newAnnotatingElement, newAnnotatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotatingElement(AnnotatingElement newAnnotatingElement, NotificationChain msgs) {
		AnnotatingElement oldAnnotatingElement = annotatingElement;
		annotatingElement = newAnnotatingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT, oldAnnotatingElement, newAnnotatingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnnotatingElement() {
		return annotatingElement != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningAnnotatedElement() {
		return (Element)OWNING_ANNOTATED_ELEMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwningAnnotatedElement() {
		return (Element)OWNING_ANNOTATED_ELEMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningAnnotatedElement(Element newOwningAnnotatedElement) {
		OWNING_ANNOTATED_ELEMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwningAnnotatedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotatingElement getOwningAnnotatingElement() {
		return (AnnotatingElement)OWNING_ANNOTATING_ELEMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatingElement basicGetOwningAnnotatingElement() {
		return (AnnotatingElement)OWNING_ANNOTATING_ELEMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningAnnotatingElement(AnnotatingElement newOwningAnnotatingElement) {
		OWNING_ANNOTATING_ELEMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwningAnnotatingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Element annotatedElement = getAnnotatedElement();
		if (annotatedElement != null) {
			target.add(annotatedElement);
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
		AnnotatingElement annotatingElement = getAnnotatingElement();
		if (annotatingElement != null) {
			source.add(annotatingElement);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT:
				if (annotatingElement != null)
					msgs = ((InternalEObject)annotatingElement).eInverseRemove(this, SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION, AnnotatingElement.class, msgs);
				return basicSetAnnotatingElement((AnnotatingElement)otherEnd, msgs);
			case SysMLPackage.ANNOTATION__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT:
				return basicSetAnnotatingElement(null, msgs);
			case SysMLPackage.ANNOTATION__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.ANNOTATION__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT:
				if (resolve) return getAnnotatingElement();
				return basicGetAnnotatingElement();
			case SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT:
				if (resolve) return getAnnotatedElement();
				return basicGetAnnotatedElement();
			case SysMLPackage.ANNOTATION__OWNING_ANNOTATED_ELEMENT:
				if (resolve) return getOwningAnnotatedElement();
				return basicGetOwningAnnotatedElement();
			case SysMLPackage.ANNOTATION__OWNING_ANNOTATING_ELEMENT:
				if (resolve) return getOwningAnnotatingElement();
				return basicGetOwningAnnotatingElement();
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
			case SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT:
				setAnnotatingElement((AnnotatingElement)newValue);
				return;
			case SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT:
				setAnnotatedElement((Element)newValue);
				return;
			case SysMLPackage.ANNOTATION__OWNING_ANNOTATED_ELEMENT:
				setOwningAnnotatedElement((Element)newValue);
				return;
			case SysMLPackage.ANNOTATION__OWNING_ANNOTATING_ELEMENT:
				setOwningAnnotatingElement((AnnotatingElement)newValue);
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
			case SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT:
				setAnnotatingElement((AnnotatingElement)null);
				return;
			case SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT:
				setAnnotatedElement((Element)null);
				return;
			case SysMLPackage.ANNOTATION__OWNING_ANNOTATED_ELEMENT:
				setOwningAnnotatedElement((Element)null);
				return;
			case SysMLPackage.ANNOTATION__OWNING_ANNOTATING_ELEMENT:
				setOwningAnnotatingElement((AnnotatingElement)null);
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
			case SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT:
				return isSetAnnotatingElement();
			case SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT:
				return isSetAnnotatedElement();
			case SysMLPackage.ANNOTATION__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.ANNOTATION__SOURCE:
				return isSetSource();
			case SysMLPackage.ANNOTATION__TARGET:
				return isSetTarget();
			case SysMLPackage.ANNOTATION__OWNING_ANNOTATED_ELEMENT:
				return OWNING_ANNOTATED_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ANNOTATION__OWNING_ANNOTATING_ELEMENT:
				return OWNING_ANNOTATING_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //AnnotationImpl
