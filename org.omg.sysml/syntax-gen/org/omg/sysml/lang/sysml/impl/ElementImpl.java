/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018, 2019 Model Driven Solutions, Inc.
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
 * 
 * Contributors:
 *  Ed Seidewitz
 * 
 *****************************************************************************/
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwningRelationship <em>Owning Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwningMembership <em>Owning Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedRelationship_comp <em>Owned Relationship comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedRelationship <em>Owned Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwningNamespace <em>Owning Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The cached value of the '{@link #getOwningMembership() <em>Owning Membership</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningMembership()
	 * @generated
	 * @ordered
	 */
	protected Membership owningMembership;

	/**
	 * The cached value of the '{@link #getOwnedRelationship_comp() <em>Owned Relationship comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelationship_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> ownedRelationship_comp;

	/**
	 * The cached value of the '{@link #getOwnedRelationship() <em>Owned Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> ownedRelationship;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

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
	 * Converts a string literal or unrestricted name with escaped characters 
	 * into a string in which the escape sequences are replaced with the corresponding 
	 * represented characters. If the input string starts with a single or double quote
	 * character, it is assumed to be a lexically valid unrestricted name or string literal,
	 * respectively. Otherwise, the input string is returned without change.
	 */
	public static String unescapeString(String literal) {
		if (literal == null || literal.isEmpty() || 
				literal.charAt(0) != '"' && literal.charAt(0) != '\'') {
			return literal;
		} else {
			StringBuilder s = new StringBuilder();
			int i = 1;
			int j = literal.indexOf('\\', 1);
			while (j >= 0) {
				char c = literal.charAt(j + 1);
				s.append(literal.substring(i, j));
				s.append(
					c == 'b'? '\b':
					c == 't'? '\t':
					c == 'n'? '\n':
					c == 'f'? '\f':
					c == 'r'? '\r':
					c == '"'? '"':
					c == '\''? '\'':
					c == '\\'? '\\':
					' ');
				i = j + 2;
				j = literal.indexOf('\\', i);
			}
			int n = literal.length();
			if (n > 1) {
				s.append(literal.substring(i, n - 1));
			}
			return s.toString();
		}
	}
	
	/**
	 * Return a string that is the same as the input string,  but with escapable characters
	 * replaced by appropriate escape sequences.
	 */
	public static String escapeString(String str) {
		StringBuilder s = new StringBuilder();
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			int c = "\b\t\n\f\r\"'\\".indexOf(str.charAt(i));
			if (c > 0) {
				s.append(str.substring(j, i));
				s.append('\\');
				s.append("btnfr\"'\\".charAt(c));
			}
			j++;
		}
		return s.toString();
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
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (owningMembership != null && owningMembership != newOwningRelationship) {
				setOwningMembership(null);
			}
		}
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
				msgs = ((InternalEObject)newOwningRelationship).eInverseAdd(this, SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT_COMP, Relationship.class, msgs);
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
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element basicGetOwner() {
		Relationship owningRelationship = getOwningRelationship();
		return owningRelationship != null && owningRelationship.getOwnedRelatedElement().contains(this)? 
						owningRelationship.getOwningRelatedElement(): null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwner(Element newOwner) {
		// TODO: implement this method to set the 'Owner' reference
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Membership getOwningMembership() {
		if (owningMembership != null && owningMembership.eIsProxy()) {
			InternalEObject oldOwningMembership = (InternalEObject)owningMembership;
			owningMembership = (Membership)eResolveProxy(oldOwningMembership);
			if (owningMembership != oldOwningMembership) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.ELEMENT__OWNING_MEMBERSHIP, oldOwningMembership, owningMembership));
			}
		}
		return owningMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Membership basicGetOwningMembership() {
		return owningMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningMembership(Membership newOwningMembership, NotificationChain msgs) {
		Membership oldOwningMembership = owningMembership;
		owningMembership = newOwningMembership;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT__OWNING_MEMBERSHIP, oldOwningMembership, newOwningMembership);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningMembership != null) {
				Relationship owningRelationship = getOwningRelationship();
				if (newOwningMembership != owningRelationship) {
					setOwningRelationship(newOwningMembership);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningMembership(Membership newOwningMembership) {
		if (newOwningMembership != owningMembership) {
			NotificationChain msgs = null;
			if (owningMembership != null)
				msgs = ((InternalEObject)owningMembership).eInverseRemove(this, SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP, Membership.class, msgs);
			if (newOwningMembership != null)
				msgs = ((InternalEObject)newOwningMembership).eInverseAdd(this, SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP, Membership.class, msgs);
			msgs = basicSetOwningMembership(newOwningMembership, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT__OWNING_MEMBERSHIP, newOwningMembership, newOwningMembership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship_comp() {
		if (ownedRelationship_comp == null) {
			ownedRelationship_comp = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.omg.sysml.lang.sysml.Package getOwningNamespace() {
		org.omg.sysml.lang.sysml.Package owningNamespace = basicGetOwningNamespace();
		return owningNamespace != null && owningNamespace.eIsProxy() ? (org.omg.sysml.lang.sysml.Package)eResolveProxy((InternalEObject)owningNamespace) : owningNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public org.omg.sysml.lang.sysml.Package basicGetOwningNamespace() {
		Membership membership = this.getOwningMembership();
		return membership == null? null: membership.getMembershipOwningPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOwningNamespace(org.omg.sysml.lang.sysml.Package newOwningNamespace) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BasicEList<Element> getOwnedElement() {
		BasicEList<Element> ownedElements = new EObjectEList<Element>(Element.class, this, SysMLPackage.ELEMENT__OWNED_ELEMENT);
		ownedElements.addAllUnique(getOwnedRelationship().stream().
				flatMap(relationship->relationship.getOwnedRelatedElement().stream()).collect(Collectors.toList()));
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT__IDENTIFIER, oldIdentifier, identifier));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		String name = this.basicGetName();
		if (name != null) {
			return name;
		} else {
			Membership owningMembership = this.getOwningMembership();
			return owningMembership == null? null: owningMembership.getMemberName(); 
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setName(String newName) {
		Membership owningMembership = this.getOwningMembership();
		if (owningMembership != null) {
			owningMembership.setMemberName(newName);
			this.basicSetName(null);
		} else {
			this.basicSetName(unescapeString(newName));
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship() {
		if (ownedRelationship == null) {
			ownedRelationship = new EObjectResolvingEList<Relationship>(Relationship.class, this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP);
		}
		return ownedRelationship;
	}

	// Additional
	
	String name;
	
	/**
	 * Get the locally stored value for the element name.
	 */
	public String basicGetName() {
		return name;
	}
	
	/**
	 * Set the locally stored value for the element name.
	 */
	public void basicSetName(String newName) {
		name = newName;
	}
	
	// Utility
	
	@SuppressWarnings("unchecked")
	public static <T> T cast(Object element, Class<T> class_) {
		return class_.isInstance(element)? (T)element: null;		
	}
	
	public <T extends Relationship> T getOwningRelationship(Class<T> class_) {
		return cast(getOwningRelationship(), class_);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> EList<T> filter(List<?> elements, Class<T> class_) {
		EList<T> list = new BasicInternalEList<T>(class_);
		list.addAll((List<T>)elements.stream().filter(element->class_.isInstance(element)).collect(Collectors.toList()));
		return list;
	}
	
	public <T extends Relationship> EList<T> getOwnedRelationship(Class<T> class_) {
		return filter(getOwnedRelationship(), class_);
	}
	
	@SuppressWarnings("unchecked")
	public <T extends Relationship> T getFirstOwnedRelationship(Class<T> class_) {
		return (T)getOwnedRelationship().stream().filter(rel->class_.isInstance(rel)).findFirst().orElse(null);
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
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				if (owningMembership != null)
					msgs = ((InternalEObject)owningMembership).eInverseRemove(this, SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP, Membership.class, msgs);
				return basicSetOwningMembership((Membership)otherEnd, msgs);
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship_comp()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				return basicSetOwningMembership(null, msgs);
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<?>)getOwnedRelationship_comp()).basicRemove(otherEnd, msgs);
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
				return eInternalContainer().eInverseRemove(this, SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT_COMP, Relationship.class, msgs);
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
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				if (resolve) return getOwningMembership();
				return basicGetOwningMembership();
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP:
				return getOwnedRelationship_comp();
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				return getOwnedRelationship();
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				if (resolve) return getOwningNamespace();
				return basicGetOwningNamespace();
			case SysMLPackage.ELEMENT__IDENTIFIER:
				return getIdentifier();
			case SysMLPackage.ELEMENT__NAME:
				return getName();
			case SysMLPackage.ELEMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				return getOwnedElement();
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
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				setOwningMembership((Membership)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP:
				getOwnedRelationship_comp().clear();
				getOwnedRelationship_comp().addAll((Collection<? extends Relationship>)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				getOwnedRelationship().clear();
				getOwnedRelationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				setOwningNamespace((org.omg.sysml.lang.sysml.Package)newValue);
				return;
			case SysMLPackage.ELEMENT__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case SysMLPackage.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNER:
				setOwner((Element)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				getOwnedElement().clear();
				getOwnedElement().addAll((Collection<? extends Element>)newValue);
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
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				setOwningMembership((Membership)null);
				return;
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP:
				getOwnedRelationship_comp().clear();
				return;
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				getOwnedRelationship().clear();
				return;
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				setOwningNamespace((org.omg.sysml.lang.sysml.Package)null);
				return;
			case SysMLPackage.ELEMENT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case SysMLPackage.ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SysMLPackage.ELEMENT__OWNER:
				setOwner((Element)null);
				return;
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				getOwnedElement().clear();
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
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				return owningMembership != null;
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP:
				return ownedRelationship_comp != null && !ownedRelationship_comp.isEmpty();
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				return ownedRelationship != null && !ownedRelationship.isEmpty();
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				return basicGetOwningNamespace() != null;
			case SysMLPackage.ELEMENT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case SysMLPackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case SysMLPackage.ELEMENT__OWNER:
				return basicGetOwner() != null;
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				return !getOwnedElement().isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
