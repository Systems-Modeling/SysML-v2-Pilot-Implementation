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
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.SubsetSupersetEDataTypeUniqueEList;
import org.omg.sysml.lang.sysml.AnnotatingFeature;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Documentation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TextualRepresentation;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwningRelationship <em>Owning Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedRelationship_comp <em>Owned Relationship comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedAnnotation_comp <em>Owned Annotation comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getAliasId <em>Alias Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwningMembership <em>Owning Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwningNamespace <em>Owning Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getDocumentation_comp <em>Documentation comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getDocumentationComment <em>Documentation Comment</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedTextualRepresentation <em>Owned Textual Representation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getHumanId <em>Human Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedRelationship <em>Owned Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedAnnotation <em>Owned Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
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
	 * The cached value of the '{@link #getOwnedAnnotation_comp() <em>Owned Annotation comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAnnotation_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> ownedAnnotation_comp;

	/**
	 * The cached value of the '{@link #getAliasId() <em>Alias Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasId()
	 * @generated
	 * @ordered
	 */
	protected EList<String> aliasId;

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
	 * The cached value of the '{@link #getDocumentation_comp() <em>Documentation comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> documentation_comp;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHumanId() <em>Human Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanId()
	 * @generated
	 * @ordered
	 */
	protected static final String HUMAN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHumanId() <em>Human Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanId()
	 * @generated
	 * @ordered
	 */
	protected String humanId = HUMAN_ID_EDEFAULT;

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
		for (int i = 0; i < str.length(); i++) {
			int c = "\b\t\n\f\r\"'\\".indexOf(str.charAt(i));
			if (c < 0) {
				s.append(str.charAt(i));
			} else {
				s.append('\\');
				s.append("btnfr\"'\\".charAt(c));
			}
		}
		return s.toString();
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
	 * @generated NOT
	 */
	public NotificationChain basicSetOwningRelationship(Relationship newOwningRelationship, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelationship, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP, msgs);
//		Resource.Internal eInternalResource = eInternalResource();
//		if (eInternalResource == null || !eInternalResource.isLoading()) {
//			Membership owningMembership = getOwningMembership();
//			if (owningMembership != null && owningMembership != newOwningRelationship) {
//				setOwningMembership(null);
//			}
//		}
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
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Membership getOwningMembership() {
		Relationship owningRelationship = getOwningRelationship();
		return owningRelationship instanceof Membership? (Membership)owningRelationship: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOwningMembership(Membership newOwningMembership, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningMembership, SysMLPackage.ELEMENT__OWNING_MEMBERSHIP, msgs);
//		Resource.Internal eInternalResource = eInternalResource();
//		if (eInternalResource == null || !eInternalResource.isLoading()) {
//			if (newOwningMembership != null) {
//				Relationship owningRelationship = getOwningRelationship();
//				if (newOwningMembership != owningRelationship) {
//					setOwningRelationship(newOwningMembership);
//				}
//			}
//		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningMembership(Membership newOwningMembership) {
		if (newOwningMembership != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.ELEMENT__OWNING_MEMBERSHIP && newOwningMembership != null)) {
			if (EcoreUtil.isAncestor(this, newOwningMembership))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
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
	public EList<Annotation> getOwnedAnnotation_comp() {
		if (ownedAnnotation_comp == null) {
			ownedAnnotation_comp = new EObjectContainmentWithInverseEList<Annotation>(Annotation.class, this, SysMLPackage.ELEMENT__OWNED_ANNOTATION_COMP, SysMLPackage.ANNOTATION__OWNING_ANNOTATED_ELEMENT);
		}
		return ownedAnnotation_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAliasId() {
		if (aliasId == null) {
			aliasId = new SubsetSupersetEDataTypeUniqueEList<String>(String.class, this, SysMLPackage.ELEMENT__ALIAS_ID, null, ALIAS_ID_ESUBSETS);
		}
		return aliasId;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getAliasId() <em>Alias Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasId()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ALIAS_ID_ESUBSETS = new int[] {SysMLPackage.ELEMENT__HUMAN_ID};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getOwningNamespace() {
		Namespace owningNamespace = basicGetOwningNamespace();
		return owningNamespace != null && owningNamespace.eIsProxy() ? (Namespace)eResolveProxy((InternalEObject)owningNamespace) : owningNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Namespace basicGetOwningNamespace() {
		Membership membership = this.getOwningMembership();
		return membership == null? null: membership.getMembershipOwningNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOwningNamespace(Namespace newOwningNamespace) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BasicEList<Element> getOwnedElement() {
		BasicEList<Element> ownedElements = new NonNotifyingEObjectEList<>(Element.class, this, SysMLPackage.ELEMENT__OWNED_ELEMENT);
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
	public EList<Documentation> getDocumentation_comp() {
		if (documentation_comp == null) {
			documentation_comp = new EObjectContainmentWithInverseEList<Documentation>(Documentation.class, this, SysMLPackage.ELEMENT__DOCUMENTATION_COMP, SysMLPackage.DOCUMENTATION__OWNING_DOCUMENTED_ELEMENT);
		}
		return documentation_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Comment> getDocumentationComment() {
		EList<Comment> documentationComments = new NonNotifyingEObjectEList<>(Comment.class, this, SysMLPackage.ELEMENT__DOCUMENTATION_COMMENT);
		getDocumentation().stream().
			map(Documentation::getDocumentingComment).
			forEachOrdered(documentationComments::add);
		return documentationComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOTe
	 */
	@Override
	public EList<TextualRepresentation> getOwnedTextualRepresentation() {
		EList<TextualRepresentation> ownedTextualRepresentations = new NonNotifyingEObjectEList<>(TextualRepresentation.class, this, SysMLPackage.ELEMENT__OWNED_TEXTUAL_REPRESENTATION);
		getOwnedAnnotation().stream().
			map(Annotation::getAnnotatingElement).
			filter(TextualRepresentation.class::isInstance).
			map(TextualRepresentation.class::cast).
			forEachOrdered(ownedTextualRepresentations::add);
		return ownedTextualRepresentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHumanId() {
		return humanId;
	}
	
	@Override
	public void setHumanId(String newHumanId) {
		setHumanIdGen(unescapeString(newHumanId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumanIdGen(String newHumanId) {
		String oldHumanId = humanId;
		humanId = newHumanId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT__HUMAN_ID, oldHumanId, humanId));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newHumanId != null) {
				EList<String> aliasId = getAliasId();
				if (!aliasId.contains(newHumanId)) {
					aliasId.add(newHumanId);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * If no identifier has been set, then generate a random UUID and set the identifier to that.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getIdentifier() {
		if (identifier == null) {
			identifier = UUID.randomUUID().toString();
		}
		return identifier;
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
	 * @generated NOT
	 */
	@Override
	public EList<Relationship> getOwnedRelationship() {
		EList<Relationship> ownedRelationships = new NonNotifyingEObjectEList<>(Relationship.class, this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP);
		ownedRelationships.addAll(getOwnedRelationship_comp());
		ownedRelationships.addAll(getOwnedAnnotation());
		return ownedRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Documentation> getDocumentation() {
		EList<Documentation> documentation = new NonNotifyingEObjectEList<>(Documentation.class, this, SysMLPackage.ELEMENT__DOCUMENTATION);
		documentation.addAll(getDocumentation_comp());
		return documentation;
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getDocumentation() <em>Documentation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final int[] DOCUMENTATION_ESUPERSETS = new int[] {SysMLPackage.ELEMENT__OWNED_ANNOTATION_COMP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Annotation> getOwnedAnnotation() {
		EList<Annotation> ownedAnnotations = new NonNotifyingEObjectEList<>(Annotation.class, this, SysMLPackage.ELEMENT__OWNED_ANNOTATION);
		ownedAnnotations.addAll(getOwnedAnnotation_comp());
		ownedAnnotations.addAll(getDocumentation());
		return ownedAnnotations;
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedAnnotation() <em>Owned Annotation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAnnotation()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ANNOTATION_ESUPERSETS = new int[] {SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP};


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getQualifiedName() {
		Namespace owningNamespace = getOwningNamespace();
		if (owningNamespace == null) {
			return null;
		} else if (owningNamespace.getOwner() == null) {
			return escapedName();
		} else {
			String qualification = ((ElementImpl)owningNamespace).getQualifiedName();
			if (qualification == null) {
				return null;
			} else {
				return qualification + "::" + escapedName();
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setQualifiedName(String newQualifiedName) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String escapedName() {
		return escapeName(getName());
	}

	public static String escapeName(String name) {
		return (name == null || name.isEmpty() || isIdentifier(name))? name:
			   "'" + ElementImpl.escapeString(name) + "'";	
	}
	
	public static boolean isIdentifier(String name) {
		return name.matches("[a-zA-Z_]\\w*");
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
	
	/**
	 * Get the effective name for this element, which by default is just its regular name.
	 */
	public String getEffectiveName() {
		return getName();
	}
	
	/**
	 * Get documentation text for this element, as given by the body of the first documentation comment
	 * annotating the element (if any).
	 */
	public String getDocumentationText() {
		return getDocumentationComment().stream().
				map(Comment::getBody).
				findFirst().orElse(null);
	}
	
	/**
	 * Get all the AnnotatingFeatures relevant to this Element. By default, these are just those that
	 * are related to the Element by ownedAnnotations.
	 */
	public List<AnnotatingFeature> getAllAnnotatingFeatures() {
		return getOwnedAnnotation().stream().
				map(Annotation::getAnnotatingElement).
				filter(AnnotatingFeature.class::isInstance).
				map(AnnotatingFeature.class::cast).
				collect(Collectors.toList());
	}

	
	/**
	 * Clear cached member derivations.
	 */
	public void clearCaches() {		
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
			case SysMLPackage.ELEMENT__OWNING_RELATIONSHIP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelationship((Relationship)otherEnd, msgs);
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedAnnotation_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningMembership((Membership)otherEnd, msgs);
			case SysMLPackage.ELEMENT__DOCUMENTATION_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentation_comp()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<?>)getOwnedRelationship_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION_COMP:
				return ((InternalEList<?>)getOwnedAnnotation_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				return basicSetOwningMembership(null, msgs);
			case SysMLPackage.ELEMENT__DOCUMENTATION_COMP:
				return ((InternalEList<?>)getDocumentation_comp()).basicRemove(otherEnd, msgs);
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
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP, Membership.class, msgs);
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
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP:
				return getOwnedRelationship_comp();
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION_COMP:
				return getOwnedAnnotation_comp();
			case SysMLPackage.ELEMENT__ALIAS_ID:
				return getAliasId();
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				return getOwningMembership();
			case SysMLPackage.ELEMENT__IDENTIFIER:
				return getIdentifier();
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				if (resolve) return getOwningNamespace();
				return basicGetOwningNamespace();
			case SysMLPackage.ELEMENT__NAME:
				return getName();
			case SysMLPackage.ELEMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				return getOwnedElement();
			case SysMLPackage.ELEMENT__DOCUMENTATION_COMP:
				return getDocumentation_comp();
			case SysMLPackage.ELEMENT__DOCUMENTATION_COMMENT:
				return getDocumentationComment();
			case SysMLPackage.ELEMENT__OWNED_TEXTUAL_REPRESENTATION:
				return getOwnedTextualRepresentation();
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				return getQualifiedName();
			case SysMLPackage.ELEMENT__HUMAN_ID:
				return getHumanId();
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				return getOwnedRelationship();
			case SysMLPackage.ELEMENT__DOCUMENTATION:
				return getDocumentation();
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION:
				return getOwnedAnnotation();
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
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP:
				getOwnedRelationship_comp().clear();
				getOwnedRelationship_comp().addAll((Collection<? extends Relationship>)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION_COMP:
				getOwnedAnnotation_comp().clear();
				getOwnedAnnotation_comp().addAll((Collection<? extends Annotation>)newValue);
				return;
			case SysMLPackage.ELEMENT__ALIAS_ID:
				getAliasId().clear();
				getAliasId().addAll((Collection<? extends String>)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				setOwningMembership((Membership)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				setOwningNamespace((Namespace)newValue);
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
			case SysMLPackage.ELEMENT__DOCUMENTATION_COMP:
				getDocumentation_comp().clear();
				getDocumentation_comp().addAll((Collection<? extends Documentation>)newValue);
				return;
			case SysMLPackage.ELEMENT__DOCUMENTATION_COMMENT:
				getDocumentationComment().clear();
				getDocumentationComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNED_TEXTUAL_REPRESENTATION:
				getOwnedTextualRepresentation().clear();
				getOwnedTextualRepresentation().addAll((Collection<? extends TextualRepresentation>)newValue);
				return;
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case SysMLPackage.ELEMENT__HUMAN_ID:
				setHumanId((String)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				getOwnedRelationship().clear();
				getOwnedRelationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case SysMLPackage.ELEMENT__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				getOwnedAnnotation().addAll((Collection<? extends Annotation>)newValue);
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
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP:
				getOwnedRelationship_comp().clear();
				return;
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION_COMP:
				getOwnedAnnotation_comp().clear();
				return;
			case SysMLPackage.ELEMENT__ALIAS_ID:
				getAliasId().clear();
				return;
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				setOwningMembership((Membership)null);
				return;
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				setOwningNamespace((Namespace)null);
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
			case SysMLPackage.ELEMENT__DOCUMENTATION_COMP:
				getDocumentation_comp().clear();
				return;
			case SysMLPackage.ELEMENT__DOCUMENTATION_COMMENT:
				getDocumentationComment().clear();
				return;
			case SysMLPackage.ELEMENT__OWNED_TEXTUAL_REPRESENTATION:
				getOwnedTextualRepresentation().clear();
				return;
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case SysMLPackage.ELEMENT__HUMAN_ID:
				setHumanId(HUMAN_ID_EDEFAULT);
				return;
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				getOwnedRelationship().clear();
				return;
			case SysMLPackage.ELEMENT__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
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
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP:
				return ownedRelationship_comp != null && !ownedRelationship_comp.isEmpty();
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION_COMP:
				return ownedAnnotation_comp != null && !ownedAnnotation_comp.isEmpty();
			case SysMLPackage.ELEMENT__ALIAS_ID:
				return aliasId != null && !aliasId.isEmpty();
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				return getOwningMembership() != null;
			case SysMLPackage.ELEMENT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				return basicGetOwningNamespace() != null;
			case SysMLPackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case SysMLPackage.ELEMENT__OWNER:
				return basicGetOwner() != null;
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				return !getOwnedElement().isEmpty();
			case SysMLPackage.ELEMENT__DOCUMENTATION_COMP:
				return documentation_comp != null && !documentation_comp.isEmpty();
			case SysMLPackage.ELEMENT__DOCUMENTATION_COMMENT:
				return !getDocumentationComment().isEmpty();
			case SysMLPackage.ELEMENT__OWNED_TEXTUAL_REPRESENTATION:
				return !getOwnedTextualRepresentation().isEmpty();
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case SysMLPackage.ELEMENT__HUMAN_ID:
				return HUMAN_ID_EDEFAULT == null ? humanId != null : !HUMAN_ID_EDEFAULT.equals(humanId);
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				return !getOwnedRelationship().isEmpty();
			case SysMLPackage.ELEMENT__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION:
				return !getOwnedAnnotation().isEmpty();
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", aliasId: ");
		result.append(aliasId);
		result.append(", humanId: ");
		result.append(humanId);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
