/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Association is a Relationship and a Class to enable classification of links between things (in the universe). The co-domains&nbsp;of the associationEnd Features are one of the relatedTypes as co-domain and participants (linked things) of an association identify each other.</p>
 * 
 * relatedTypes = associationEnd.type
 * let numend : Natural = associationEnd->size() in
 *     allSupertypes()->includes(
 *         if numend = 2 then Kernel Library::BinaryLink
 *         else Kernel Library::Link)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getRelatedType <em>Related Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getOwningConnector <em>Owning Connector</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getTargetType <em>Target Type</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends org.omg.sysml.lang.sysml.Class, Relationship {
	/**
	 * Returns the value of the '<em><b>Related Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Type}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getRelatedElement() <em>Related Element</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The types of the endFeatures of the Association, which are the relatedElements of the Association considered as a Relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_RelatedType()
	 * @model lower="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='association'"
	 *        annotation="union"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Type> getRelatedType();

	/**
	 * Returns the value of the '<em><b>Owning Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Connector#getOwnedAssociationType <em>Owned Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Where the Association is used as a Type for a Connector, it may optionally be owned by the Connector.</p>
	 * 
	 * <p>This is the Connector that owns the Association. This is used in the case where the Connector owns its Typing Association. Ownership is unique, so ownership by a Connector precludes ownership by other elements.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Connector</em>' reference.
	 * @see #setOwningConnector(Connector)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_OwningConnector()
	 * @see org.omg.sysml.lang.sysml.Connector#getOwnedAssociationType
	 * @model opposite="ownedAssociationType" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Connector getOwningConnector();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Association#getOwningConnector <em>Owning Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Connector</em>' reference.
	 * @see #getOwningConnector()
	 * @generated
	 */
	void setOwningConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>Association End</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getEndFeature() <em>End Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ends of an Association define the objects that can be related by it. When there are two values in this attribute, the Association is informally called "binary."</p>
	 * <p>The ends of the Association determine which elements are eligible to be related by instances of the Association.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association End</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_AssociationEnd()
	 * @model lower="2" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='associationWithEnd'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Feature> getAssociationEnd();

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Association#getRelatedType() <em>Related Type</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The source <code>relatedType</code> for this Association. If this is a binary Association, then the <code>sourceType</code> is the first <code>relatedType</code>, and the first end Feature of the Association must redefine the <code>source</code> Feature of the Association BinaryLink from the Kernel Library. If this Association is not binary, then it has no <code>sourceType</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Type</em>' reference.
	 * @see #setSourceType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_SourceType()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sourceAssociation'"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 * @generated
	 */
	Type getSourceType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Association#getSourceType <em>Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' reference.
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(Type value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Type}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Association#getRelatedType() <em>Related Type</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The target <code>relatedTypes</code> for this Association. This includes all the <code>relatedTypes</code> other than the <code>sourceType</code>. If this is a binary Association, then the end Features corresponding to the <code>relatedTypes</code> must all redefine the <code>target</code> Feature of the Association BinaryLink from the Kernel Library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_TargetType()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='targetAssociation'"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Type> getTargetType();

} // Association
