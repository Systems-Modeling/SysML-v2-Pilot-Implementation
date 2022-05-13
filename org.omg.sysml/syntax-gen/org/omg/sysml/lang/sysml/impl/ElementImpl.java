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
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.UUID;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Documentation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TextualRepresentation;
import org.omg.sysml.util.ElementUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwningRelationship <em>Owning Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedRelationship <em>Owned Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwningMembership <em>Owning Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwningNamespace <em>Owning Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getElementId <em>Element Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedAnnotation <em>Owned Annotation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getTextualRepresentation <em>Textual Representation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getAliasIds <em>Alias Ids</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getEffectiveName <em>Effective Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The cached value of the '{@link #getOwnedRelationship() <em>Owned Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> ownedRelationship;

	/**
	 * The cached setting delegate for the '{@link #getOwningMembership() <em>Owning Membership</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningMembership()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNING_MEMBERSHIP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ELEMENT__OWNING_MEMBERSHIP).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwningNamespace() <em>Owning Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningNamespace()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNING_NAMESPACE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ELEMENT__OWNING_NAMESPACE).getSettingDelegate();

	/**
	 * The default value of the '{@link #getElementId() <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementId()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementId() <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementId()
	 * @generated
	 * @ordered
	 */
	protected String elementId = ELEMENT_ID_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ELEMENT__OWNER).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_ELEMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ELEMENT__OWNED_ELEMENT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getDocumentation() <em>Documentation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DOCUMENTATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ELEMENT__DOCUMENTATION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwnedAnnotation() <em>Owned Annotation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_ANNOTATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ELEMENT__OWNED_ANNOTATION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTextualRepresentation() <em>Textual Representation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextualRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TEXTUAL_REPRESENTATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ELEMENT__TEXTUAL_REPRESENTATION).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getAliasIds() <em>Alias Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> aliasIds;

	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getEffectiveName() <em>Effective Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EFFECTIVE_NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ELEMENT__EFFECTIVE_NAME).getSettingDelegate();

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate QUALIFIED_NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ELEMENT__QUALIFIED_NAME).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ELEMENT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getElementId() {
		if (elementId == null) {
			elementId = UUID.randomUUID().toString();
		}
		return elementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementId(String newElementId) {
		String oldElementId = elementId;
		elementId = newElementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT__ELEMENT_ID, oldElementId, elementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Relationship getOwningRelationship() {
		EObject container = eInternalContainer();
		return container instanceof Relationship && ((Relationship)container).getOwnedRelatedElement().contains(this)? (Relationship)container: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelationship(Relationship newOwningRelationship, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelationship, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelationship(Relationship newOwningRelationship) {
		if (newOwningRelationship != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.ELEMENT__OWNING_RELATIONSHIP && newOwningRelationship != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP, newOwningRelationship, newOwningRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		return (Element)OWNER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		return (Element)OWNER__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Element newOwner) {
		OWNER__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OwningMembership getOwningMembership() {
		return (OwningMembership)OWNING_MEMBERSHIP__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwningMembership basicGetOwningMembership() {
		return (OwningMembership)OWNING_MEMBERSHIP__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningMembership(OwningMembership newOwningMembership) {
		OWNING_MEMBERSHIP__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwningMembership);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getOwningNamespace() {
		return (Namespace)OWNING_NAMESPACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetOwningNamespace() {
		return (Namespace)OWNING_NAMESPACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningNamespace(Namespace newOwningNamespace) {
		OWNING_NAMESPACE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwningNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public EList<Element> getOwnedElement() {
		return (EList<Element>)OWNED_ELEMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String newName) {
		setNameGen(ElementUtil.unescapeString(newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameGen(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT__NAME, oldName, name));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship() {
		if (ownedRelationship == null) {
			ownedRelationship = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Documentation> getDocumentation() {
		return (EList<Documentation>)DOCUMENTATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Annotation> getOwnedAnnotation() {
		return (EList<Annotation>)OWNED_ANNOTATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedAnnotation() <em>Owned Annotation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAnnotation()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ANNOTATION_ESUPERSETS = new int[] {SysMLPackage.ELEMENT__OWNED_RELATIONSHIP};


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TextualRepresentation> getTextualRepresentation() {
		return (EList<TextualRepresentation>)TEXTUAL_REPRESENTATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAliasIds() {
		if (aliasIds == null) {
			aliasIds = new EDataTypeUniqueEList<String>(String.class, this, SysMLPackage.ELEMENT__ALIAS_IDS);
		}
		return aliasIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShortName() {
		return shortName;
	}

	@Override
	public void setShortName(String shortName) {
		setShortNameGen(ElementUtil.unescapeString(shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortNameGen(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualifiedName() {
		return (String)QUALIFIED_NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifiedName(String newQualifiedName) {
		QUALIFIED_NAME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Get the effective name for this element, which by default is just its regular name.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffectiveName() {
		return (String)EFFECTIVE_NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffectiveName(String newEffectiveName) {
		EFFECTIVE_NAME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newEffectiveName);
	}
	
	// Operations

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String escapedName() {
		String effectiveName = getEffectiveName();
		String shortName = getShortName();
		String elementName = 
				effectiveName != null? effectiveName:
				shortName != null? shortName:
				null;
		return ElementUtil.escapeName(elementName);
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String effectiveName() {
		return getName();
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
			case SysMLPackage.ELEMENT__OWNING_RELATIONSHIP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelationship((Relationship)otherEnd, msgs);
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.ELEMENT__OWNING_RELATIONSHIP:
				return basicSetOwningRelationship(null, msgs);
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				return ((InternalEList<?>)getOwnedRelationship()).basicRemove(otherEnd, msgs);
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
			case SysMLPackage.ELEMENT__OWNING_RELATIONSHIP:
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
			case SysMLPackage.ELEMENT__OWNING_RELATIONSHIP:
				return getOwningRelationship();
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				return getOwnedRelationship();
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				if (resolve) return getOwningMembership();
				return basicGetOwningMembership();
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				if (resolve) return getOwningNamespace();
				return basicGetOwningNamespace();
			case SysMLPackage.ELEMENT__ELEMENT_ID:
				return getElementId();
			case SysMLPackage.ELEMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				return getOwnedElement();
			case SysMLPackage.ELEMENT__DOCUMENTATION:
				return getDocumentation();
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION:
				return getOwnedAnnotation();
			case SysMLPackage.ELEMENT__TEXTUAL_REPRESENTATION:
				return getTextualRepresentation();
			case SysMLPackage.ELEMENT__ALIAS_IDS:
				return getAliasIds();
			case SysMLPackage.ELEMENT__SHORT_NAME:
				return getShortName();
			case SysMLPackage.ELEMENT__EFFECTIVE_NAME:
				return getEffectiveName();
			case SysMLPackage.ELEMENT__NAME:
				return getName();
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				return getQualifiedName();
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
			case SysMLPackage.ELEMENT__OWNING_RELATIONSHIP:
				setOwningRelationship((Relationship)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				getOwnedRelationship().clear();
				getOwnedRelationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				setOwningMembership((OwningMembership)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				setOwningNamespace((Namespace)newValue);
				return;
			case SysMLPackage.ELEMENT__ELEMENT_ID:
				setElementId((String)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNER:
				setOwner((Element)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				getOwnedElement().clear();
				getOwnedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ELEMENT__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				getOwnedAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case SysMLPackage.ELEMENT__TEXTUAL_REPRESENTATION:
				getTextualRepresentation().clear();
				getTextualRepresentation().addAll((Collection<? extends TextualRepresentation>)newValue);
				return;
			case SysMLPackage.ELEMENT__ALIAS_IDS:
				getAliasIds().clear();
				getAliasIds().addAll((Collection<? extends String>)newValue);
				return;
			case SysMLPackage.ELEMENT__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case SysMLPackage.ELEMENT__EFFECTIVE_NAME:
				setEffectiveName((String)newValue);
				return;
			case SysMLPackage.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
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
			case SysMLPackage.ELEMENT__OWNING_RELATIONSHIP:
				setOwningRelationship((Relationship)null);
				return;
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				getOwnedRelationship().clear();
				return;
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				setOwningMembership((OwningMembership)null);
				return;
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				setOwningNamespace((Namespace)null);
				return;
			case SysMLPackage.ELEMENT__ELEMENT_ID:
				setElementId(ELEMENT_ID_EDEFAULT);
				return;
			case SysMLPackage.ELEMENT__OWNER:
				setOwner((Element)null);
				return;
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				getOwnedElement().clear();
				return;
			case SysMLPackage.ELEMENT__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				return;
			case SysMLPackage.ELEMENT__TEXTUAL_REPRESENTATION:
				getTextualRepresentation().clear();
				return;
			case SysMLPackage.ELEMENT__ALIAS_IDS:
				getAliasIds().clear();
				return;
			case SysMLPackage.ELEMENT__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case SysMLPackage.ELEMENT__EFFECTIVE_NAME:
				EFFECTIVE_NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case SysMLPackage.ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				QUALIFIED_NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case SysMLPackage.ELEMENT__OWNING_RELATIONSHIP:
				return getOwningRelationship() != null;
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				return ownedRelationship != null && !ownedRelationship.isEmpty();
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				return OWNING_MEMBERSHIP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				return OWNING_NAMESPACE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ELEMENT__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementId != null : !ELEMENT_ID_EDEFAULT.equals(elementId);
			case SysMLPackage.ELEMENT__OWNER:
				return OWNER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				return OWNED_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ELEMENT__DOCUMENTATION:
				return DOCUMENTATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION:
				return OWNED_ANNOTATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ELEMENT__TEXTUAL_REPRESENTATION:
				return TEXTUAL_REPRESENTATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ELEMENT__ALIAS_IDS:
				return aliasIds != null && !aliasIds.isEmpty();
			case SysMLPackage.ELEMENT__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case SysMLPackage.ELEMENT__EFFECTIVE_NAME:
				return EFFECTIVE_NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				return QUALIFIED_NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case SysMLPackage.ELEMENT___ESCAPED_NAME:
				return escapedName();
			case SysMLPackage.ELEMENT___EFFECTIVE_NAME:
				return effectiveName();
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
		result.append(" (elementId: ");
		result.append(elementId);
		result.append(", aliasIds: ");
		result.append(aliasIds);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
