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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DocumentationImpl#getDocumentingComment_comp <em>Documenting Comment comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DocumentationImpl#getOwningDocumentedElement <em>Owning Documented Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DocumentationImpl#getDocumentingComment <em>Documenting Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationImpl extends AnnotationImpl implements Documentation {
	/**
	 * The cached value of the '{@link #getDocumentingComment_comp() <em>Documenting Comment comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentingComment_comp()
	 * @generated
	 * @ordered
	 */
	protected Comment documentingComment_comp;

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
	public Comment getDocumentingComment_comp() {
		return documentingComment_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentingComment_comp(Comment newDocumentingComment_comp, NotificationChain msgs) {
		Comment oldDocumentingComment_comp = documentingComment_comp;
		documentingComment_comp = newDocumentingComment_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT_COMP, oldDocumentingComment_comp, newDocumentingComment_comp);
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
	public void setDocumentingComment_comp(Comment newDocumentingComment_comp) {
		if (newDocumentingComment_comp != documentingComment_comp) {
			NotificationChain msgs = null;
			if (documentingComment_comp != null)
				msgs = ((InternalEObject)documentingComment_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT_COMP, null, msgs);
			if (newDocumentingComment_comp != null)
				msgs = ((InternalEObject)newDocumentingComment_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT_COMP, null, msgs);
			msgs = basicSetDocumentingComment_comp(newDocumentingComment_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT_COMP, newDocumentingComment_comp, newDocumentingComment_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDocumentingComment_comp() {
		return documentingComment_comp != null;
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
		return getDocumentingComment_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setDocumentingComment(Comment newDocumentingComment) {
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotatingElement getAnnotatingElement() {
		return getDocumentingComment_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotatingElement basicGetAnnotatingElement() {
		return getDocumentingComment_comp();
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
		return basicSetDocumentingComment_comp((Comment) newAnnotatingElement, msgs);
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
		setDocumentingComment_comp((Comment) newAnnotatingElement);
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
	public EList<Element> getOwnedRelatedElement_comp() {
		EList<Element> ownedRelatedElement_comp = new UniqueEList<Element>();
		Comment documentingComment_comp = getDocumentingComment_comp();
		if (documentingComment_comp != null) {
			ownedRelatedElement_comp.add(documentingComment_comp);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__OWNED_RELATED_ELEMENT_COMP, ownedRelatedElement_comp.size(), ownedRelatedElement_comp.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedRelatedElement_comp() {
  		return false;
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
	
	@Override
	public Element getAnnotatedElement() {
		return getOwningDocumentedElement();
	}
	
	// Other overrides
	
	@Override
	public Element getOwningRelatedElement() {
		return getOwningDocumentedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT_COMP:
				return basicSetDocumentingComment_comp(null, msgs);
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
			case SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT_COMP:
				return getDocumentingComment_comp();
			case SysMLPackage.DOCUMENTATION__OWNING_DOCUMENTED_ELEMENT:
				if (resolve) return getOwningDocumentedElement();
				return basicGetOwningDocumentedElement();
			case SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT:
				if (resolve) return getDocumentingComment();
				return basicGetDocumentingComment();
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
			case SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT_COMP:
				setDocumentingComment_comp((Comment)newValue);
				return;
			case SysMLPackage.DOCUMENTATION__OWNING_DOCUMENTED_ELEMENT:
				setOwningDocumentedElement((Element)newValue);
				return;
			case SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT:
				setDocumentingComment((Comment)newValue);
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
			case SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT_COMP:
				setDocumentingComment_comp((Comment)null);
				return;
			case SysMLPackage.DOCUMENTATION__OWNING_DOCUMENTED_ELEMENT:
				setOwningDocumentedElement((Element)null);
				return;
			case SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT:
				setDocumentingComment((Comment)null);
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
			case SysMLPackage.DOCUMENTATION__ANNOTATING_ELEMENT:
				return isSetAnnotatingElement();
			case SysMLPackage.DOCUMENTATION__OWNED_RELATED_ELEMENT_COMP:
				return isSetOwnedRelatedElement_comp();
			case SysMLPackage.DOCUMENTATION__OWNING_ANNOTATED_ELEMENT:
				return isSetOwningAnnotatedElement();
			case SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT_COMP:
				return isSetDocumentingComment_comp();
			case SysMLPackage.DOCUMENTATION__OWNING_DOCUMENTED_ELEMENT:
				return isSetOwningDocumentedElement();
			case SysMLPackage.DOCUMENTATION__DOCUMENTING_COMMENT:
				return basicGetDocumentingComment() != null;
		}
		return super.eIsSet(featureID);
	}
} //DocumentationImpl
