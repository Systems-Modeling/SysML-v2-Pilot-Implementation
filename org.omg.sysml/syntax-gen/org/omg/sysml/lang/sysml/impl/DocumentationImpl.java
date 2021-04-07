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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Documentation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DocumentationImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DocumentationImpl#getDocumentingComment <em>Documenting Comment</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DocumentationImpl#getOwningDocumentedElement <em>Owning Documented Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationImpl extends AnnotationImpl implements Documentation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.DOCUMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningDocumentedElement() {
		Element owningDocumentedElement = basicGetOwningDocumentedElement();
		return owningDocumentedElement != null && owningDocumentedElement.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owningDocumentedElement) : owningDocumentedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element basicGetOwningDocumentedElement() {
		return super.basicGetOwningAnnotatedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwningDocumentedElement(Element newOwningDocumentedElement) {
		super.setOwningAnnotatedElement(newOwningDocumentedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningDocumentedElement() {
		return basicGetOwningDocumentedElement() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment getDocumentingComment() {
		Comment documentingComment = basicGetDocumentingComment();
		return documentingComment != null && documentingComment.eIsProxy() ? (Comment)eResolveProxy((InternalEObject)documentingComment) : documentingComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Comment basicGetDocumentingComment() {
		EList<Element> ownedRelatedElements = super.getOwnedRelatedElement();
		if (ownedRelatedElements.isEmpty()) {
			return null;
		} else {
			Element ownedRelatedElement = ownedRelatedElements.get(0);
			return ownedRelatedElement instanceof Comment? (Comment)ownedRelatedElement: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setDocumentingComment(Comment newDocumentingComment) {
		EList<Element> ownedRelatedElements = super.getOwnedRelatedElement();
		ownedRelatedElements.remove(getDocumentingComment());
		if (newDocumentingComment != null) {
			ownedRelatedElements.add(0, newDocumentingComment);
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDocumentingComment() {
		return basicGetDocumentingComment() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotatingElement getAnnotatingElement() {
		return getDocumentingComment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotatingElement basicGetAnnotatingElement() {
		return basicGetDocumentingComment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotatingElement(AnnotatingElement newAnnotatingElement, NotificationChain msgs) {
		if (newAnnotatingElement != null && !(newAnnotatingElement instanceof Comment)) {
			throw new IllegalArgumentException("newAnnotatingElement must be an instance of Comment");
		}
		setDocumentingComment((Comment) newAnnotatingElement);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatingElement(AnnotatingElement newAnnotatingElement) {
		if (newAnnotatingElement != null && !(newAnnotatingElement instanceof Comment)) {
			throw new IllegalArgumentException("newAnnotatingElement must be an instance of Comment");
		}
		setDocumentingComment((Comment) newAnnotatingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnnotatingElement() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement() {
		if (ownedRelatedElement == null) {
			ownedRelatedElement = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.DOCUMENTATION__OWNED_RELATED_ELEMENT, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningAnnotatedElement() {
		return getOwningDocumentedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwningAnnotatedElement() {
		return basicGetOwningDocumentedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningAnnotatedElement(Element newOwningAnnotatedElement) {
		setOwningDocumentedElement(newOwningAnnotatedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningAnnotatedElement() {
  		return false;
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
			case SysMLPackage.DOCUMENTATION__OWNED_RELATED_ELEMENT:
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
			case SysMLPackage.DOCUMENTATION__OWNED_RELATED_ELEMENT:
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
			case SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT:
				if (resolve) return getDocumentingComment();
				return basicGetDocumentingComment();
			case SysMLPackage.DOCUMENTATION__OWNING_DOCUMENTED_ELEMENT:
				if (resolve) return getOwningDocumentedElement();
				return basicGetOwningDocumentedElement();
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
			case SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT:
				setDocumentingComment((Comment)newValue);
				return;
			case SysMLPackage.DOCUMENTATION__OWNING_DOCUMENTED_ELEMENT:
				setOwningDocumentedElement((Element)newValue);
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
			case SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT:
				setDocumentingComment((Comment)null);
				return;
			case SysMLPackage.DOCUMENTATION__OWNING_DOCUMENTED_ELEMENT:
				setOwningDocumentedElement((Element)null);
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
			case SysMLPackage.DOCUMENTATION__OWNED_RELATED_ELEMENT:
				return ownedRelatedElement != null && !ownedRelatedElement.isEmpty();
			case SysMLPackage.DOCUMENTATION__ANNOTATING_ELEMENT:
				return isSetAnnotatingElement();
			case SysMLPackage.DOCUMENTATION__OWNING_ANNOTATED_ELEMENT:
				return isSetOwningAnnotatedElement();
			case SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT:
				return isSetDocumentingComment();
			case SysMLPackage.DOCUMENTATION__OWNING_DOCUMENTED_ELEMENT:
				return isSetOwningDocumentedElement();
		}
		return super.eIsSet(featureID);
	}
	
} //DocumentationImpl
