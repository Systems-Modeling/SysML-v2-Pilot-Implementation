/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Ownership</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Ownership is a Relationship whose sole purpose is to model the ownership of one Element by another. As such, its two <tt>relatedElements</tt> consist of a single <tt>owningRelatedElement</tt> (the source) and a single <tt>ownedRelatedElement</tt> (the target). Note that it is <em>not</em> usually necessary to use an Ownership Relationship to model ownership in a model, as other Relationships can also have <tt>ownedRelatedElements</tt> (most notably Memberships, which can be used to model <tt>ownedMembers</tt> of a Package).</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Ownership#getOwningSource <em>Owning Source</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Ownership#getOwnedTarget_comp <em>Owned Target comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Ownership#getOwnedTarget <em>Owned Target</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwnership()
 * @model
 * @generated
 */
public interface Ownership extends Relationship {

	/**
	 * Returns the value of the '<em><b>Owning Source</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <tt>owningRelatedElement</tt> that is the <tt>source</tt> of this Ownership.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Source</em>' reference.
	 * @see #setOwningSource(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwnership_OwningSource()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sourceOwnership'"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 * @generated
	 */
	Element getOwningSource();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Ownership#getOwningSource <em>Owning Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Source</em>' reference.
	 * @see #getOwningSource()
	 * @generated
	 */
	void setOwningSource(Element value);

	/**
	 * Returns the value of the '<em><b>Owned Target comp</b></em>' containment reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Target comp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <tt>ownedRelatedElement</tt> that is the <tt>target</tt> of this Ownership.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Target comp</em>' containment reference.
	 * @see #setOwnedTarget_comp(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwnership_OwnedTarget_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='targetOwnership'"
	 *        annotation="redefines"
	 * @generated
	 */
	Element getOwnedTarget_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Ownership#getOwnedTarget_comp <em>Owned Target comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Target comp</em>' containment reference.
	 * @see #getOwnedTarget_comp()
	 * @generated
	 */
	void setOwnedTarget_comp(Element value);

	/**
	 * Returns the value of the '<em><b>Owned Target</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement_comp() <em>Owned Related Element comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Target</em>' reference.
	 * @see #setOwnedTarget(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwnership_OwnedTarget()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	Element getOwnedTarget();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Ownership#getOwnedTarget <em>Owned Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Target</em>' reference.
	 * @see #getOwnedTarget()
	 * @generated
	 */
	void setOwnedTarget(Element value);
} // Ownership
