/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2023 Model Driven Solutions, Inc.
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
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getDeclaredShortName <em>Declared Short Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getDeclaredName <em>Declared Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#isImpliedIncluded <em>Is Implied Included</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#isLibraryElement <em>Is Library Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends MinimalEObjectImpl.Container implements Element {
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
	 * The default value of the '{@link #getDeclaredShortName() <em>Declared Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARED_SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeclaredShortName() <em>Declared Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredShortName()
	 * @generated
	 * @ordered
	 */
	protected String declaredShortName = DECLARED_SHORT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeclaredName() <em>Declared Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredName()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeclaredName() <em>Declared Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredName()
	 * @generated
	 * @ordered
	 */
	protected String declaredName = DECLARED_NAME_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SHORT_NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ELEMENT__SHORT_NAME).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ELEMENT__NAME).getSettingDelegate();

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
	 * The default value of the '{@link #isImpliedIncluded() <em>Is Implied Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImpliedIncluded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IMPLIED_INCLUDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImpliedIncluded() <em>Is Implied Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImpliedIncluded()
	 * @generated
	 * @ordered
	 */
	protected boolean isImpliedIncluded = IS_IMPLIED_INCLUDED_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #isLibraryElement() <em>Is Library Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLibraryElement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_LIBRARY_ELEMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ELEMENT__IS_LIBRARY_ELEMENT).getSettingDelegate();

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
	 * If there is not elementId, set it to a random UUID.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getElementId() {
		if (elementId == null) {
			UUID uuid = UUID.randomUUID();
			if (ElementUtil.isStandardLibraryElement(this)) {
				String qualifiedName = getQualifiedName();
				if (qualifiedName != null) {
					Namespace libraryNamespace = libraryNamespace();
					if (this != libraryNamespace) {
						UUID namespaceUUID = UUID.fromString(libraryNamespace.getElementId());
						uuid = ElementUtil.constructNameUUID(namespaceUUID, qualifiedName);
					}
				}
			}
			elementId = uuid.toString();
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
	 * @generated
	 */
	@Override
	public Relationship getOwningRelationship() {
		if (eContainerFeatureID() != SysMLPackage.ELEMENT__OWNING_RELATIONSHIP) return null;
		return (Relationship)eInternalContainer();
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
	public String getDeclaredName() {
		return declaredName;
	}
	
	@Override
	public void setDeclaredName(String newName) {
		setDeclaredNameGen(ElementUtil.unescapeString(newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaredNameGen(String newDeclaredName) {
		String oldDeclaredName = declaredName;
		declaredName = newDeclaredName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT__DECLARED_NAME, oldDeclaredName, declaredName));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShortName() {
		return (String)SHORT_NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortName(String newShortName) {
		SHORT_NAME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newShortName);
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
	public String getDeclaredShortName() {
		return declaredShortName;
	}

	@Override
	public void setDeclaredShortName(String shortName) {
		setDeclaredShortNameGen(ElementUtil.unescapeString(shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaredShortNameGen(String newDeclaredShortName) {
		String oldDeclaredShortName = declaredShortName;
		declaredShortName = newDeclaredShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT__DECLARED_SHORT_NAME, oldDeclaredShortName, declaredShortName));
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
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isImpliedIncluded() {
		return isImpliedIncluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsImpliedIncluded(boolean newIsImpliedIncluded) {
		boolean oldIsImpliedIncluded = isImpliedIncluded;
		isImpliedIncluded = newIsImpliedIncluded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT__IS_IMPLIED_INCLUDED, oldIsImpliedIncluded, isImpliedIncluded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLibraryElement() {
		return (Boolean)IS_LIBRARY_ELEMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLibraryElement(boolean newIsLibraryElement) {
		IS_LIBRARY_ELEMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newIsLibraryElement);
	}

	/**
	 * The cached invocation delegate for the '{@link #escapedName() <em>Escaped Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #escapedName()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ESCAPED_NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.ELEMENT___ESCAPED_NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * Get the effective name for this element, which by default is just its regular name.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		NAME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newName);
	}
	
	// Operations

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String escapedName() {
		try {
			return (String)ESCAPED_NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}	

	/**
	 * The cached invocation delegate for the '{@link #effectiveShortName() <em>Effective Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #effectiveShortName()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EFFECTIVE_SHORT_NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.ELEMENT___EFFECTIVE_SHORT_NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String effectiveShortName() {
		try {
			return (String)EFFECTIVE_SHORT_NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #effectiveName() <em>Effective Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #effectiveName()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EFFECTIVE_NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.ELEMENT___EFFECTIVE_NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String effectiveName() {
		try {
			return (String)EFFECTIVE_NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}
	
	/**
	 * The cached invocation delegate for the '{@link #libraryNamespace() <em>Library Namespace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #libraryNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate LIBRARY_NAMESPACE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.ELEMENT___LIBRARY_NAMESPACE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace libraryNamespace() {
		try {
			return (Namespace)LIBRARY_NAMESPACE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
			case SysMLPackage.ELEMENT__DECLARED_SHORT_NAME:
				return getDeclaredShortName();
			case SysMLPackage.ELEMENT__DECLARED_NAME:
				return getDeclaredName();
			case SysMLPackage.ELEMENT__SHORT_NAME:
				return getShortName();
			case SysMLPackage.ELEMENT__NAME:
				return getName();
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				return getQualifiedName();
			case SysMLPackage.ELEMENT__IS_IMPLIED_INCLUDED:
				return isImpliedIncluded();
			case SysMLPackage.ELEMENT__IS_LIBRARY_ELEMENT:
				return isLibraryElement();
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
			case SysMLPackage.ELEMENT__DECLARED_SHORT_NAME:
				setDeclaredShortName((String)newValue);
				return;
			case SysMLPackage.ELEMENT__DECLARED_NAME:
				setDeclaredName((String)newValue);
				return;
			case SysMLPackage.ELEMENT__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case SysMLPackage.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case SysMLPackage.ELEMENT__IS_IMPLIED_INCLUDED:
				setIsImpliedIncluded((Boolean)newValue);
				return;
			case SysMLPackage.ELEMENT__IS_LIBRARY_ELEMENT:
				setIsLibraryElement((Boolean)newValue);
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
			case SysMLPackage.ELEMENT__DECLARED_SHORT_NAME:
				setDeclaredShortName(DECLARED_SHORT_NAME_EDEFAULT);
				return;
			case SysMLPackage.ELEMENT__DECLARED_NAME:
				setDeclaredName(DECLARED_NAME_EDEFAULT);
				return;
			case SysMLPackage.ELEMENT__SHORT_NAME:
				SHORT_NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case SysMLPackage.ELEMENT__NAME:
				NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				QUALIFIED_NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case SysMLPackage.ELEMENT__IS_IMPLIED_INCLUDED:
				setIsImpliedIncluded(IS_IMPLIED_INCLUDED_EDEFAULT);
				return;
			case SysMLPackage.ELEMENT__IS_LIBRARY_ELEMENT:
				IS_LIBRARY_ELEMENT__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case SysMLPackage.ELEMENT__DECLARED_SHORT_NAME:
				return DECLARED_SHORT_NAME_EDEFAULT == null ? declaredShortName != null : !DECLARED_SHORT_NAME_EDEFAULT.equals(declaredShortName);
			case SysMLPackage.ELEMENT__DECLARED_NAME:
				return DECLARED_NAME_EDEFAULT == null ? declaredName != null : !DECLARED_NAME_EDEFAULT.equals(declaredName);
			case SysMLPackage.ELEMENT__SHORT_NAME:
				return SHORT_NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ELEMENT__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				return QUALIFIED_NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ELEMENT__IS_IMPLIED_INCLUDED:
				return isImpliedIncluded != IS_IMPLIED_INCLUDED_EDEFAULT;
			case SysMLPackage.ELEMENT__IS_LIBRARY_ELEMENT:
				return IS_LIBRARY_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case SysMLPackage.ELEMENT___EFFECTIVE_SHORT_NAME:
				return effectiveShortName();
			case SysMLPackage.ELEMENT___EFFECTIVE_NAME:
				return effectiveName();
			case SysMLPackage.ELEMENT___LIBRARY_NAMESPACE:
				return libraryNamespace();
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
		result.append(", declaredShortName: ");
		result.append(declaredShortName);
		result.append(", declaredName: ");
		result.append(declaredName);
		result.append(", isImpliedIncluded: ");
		result.append(isImpliedIncluded);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
