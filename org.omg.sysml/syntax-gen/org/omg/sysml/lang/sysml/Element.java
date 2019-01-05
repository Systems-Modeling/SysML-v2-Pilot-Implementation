/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * name = if owningNamespace = null then null
 * else owningNamespace.nameOf(self) endif
 * ownedElement = ownedRelationship.ownedRelatedElement
 * owner = owningRelationship.owningRelatedElement
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwningMembership <em>Owning Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwningRelationship <em>Owning Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwningNamespace <em>Owning Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship <em>Owned Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Membership</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement <em>Owned Member Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Membership</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Membership</em>' container reference.
	 * @see #setOwningMembership(Membership)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwningMembership()
	 * @see org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement
	 * @model opposite="ownedMemberElement" transient="false" ordered="false"
	 * @generated
	 */
	Membership getOwningMembership();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getOwningMembership <em>Owning Membership</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Membership</em>' container reference.
	 * @see #getOwningMembership()
	 * @generated
	 */
	void setOwningMembership(Membership value);

	/**
	 * Returns the value of the '<em><b>Owning Relationship</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement <em>Owned Related Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Relationship</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Relationship</em>' container reference.
	 * @see #setOwningRelationship(Relationship)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwningRelationship()
	 * @see org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement
	 * @model opposite="ownedRelatedElement" transient="false" ordered="false"
	 * @generated
	 */
	Relationship getOwningRelationship();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getOwningRelationship <em>Owning Relationship</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Relationship</em>' container reference.
	 * @see #getOwningRelationship()
	 * @generated
	 */
	void setOwningRelationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>Owning Namespace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Package#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Namespace</em>' reference.
	 * @see #setOwningNamespace(org.omg.sysml.lang.sysml.Package)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwningNamespace()
	 * @see org.omg.sysml.lang.sysml.Package#getOwnedMember
	 * @model opposite="ownedMember" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Package getOwningNamespace();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getOwningNamespace <em>Owning Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Namespace</em>' reference.
	 * @see #getOwningNamespace()
	 * @generated
	 */
	void setOwningNamespace(org.omg.sysml.lang.sysml.Package value);

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Element}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwnedElement()
	 * @see org.omg.sysml.lang.sysml.Element#getOwner
	 * @model opposite="owner" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Element> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_Owner()
	 * @see org.omg.sysml.lang.sysml.Element#getOwnedElement
	 * @model opposite="ownedElement" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Element getOwner();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Element value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_Identifier()
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_Name()
	 * @model dataType="org.omg.sysml.lang.types.String" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Relationship}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement <em>Owning Related Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Relationship</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwnedRelationship()
	 * @see org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement
	 * @model opposite="owningRelatedElement" containment="true" ordered="false"
	 * @generated
	 */
	EList<Relationship> getOwnedRelationship();
	
	// Additional operations
	
	/**
	 * This operation may be overridden to provide an effective union property for all owned Relationships, without introducing explicit subsetting.
	 * The regular ownedRelationship property can then still be used to add otherwise undifferentiated owned Relationships.
	 * @return the union of all owned relationships.
	 */
	default EList<Relationship> getAllOwnedRelationships() {
		return new UniqueEList<Relationship>(getOwnedRelationship());
	}

} // Element
