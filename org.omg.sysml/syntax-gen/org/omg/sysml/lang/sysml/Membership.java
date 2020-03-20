/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Membership</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Membership is a Relationship between a Package and an Element that indicates the Element is a <tt>member</tt> of (i.e., is contained in) the Package. The Membership may define a <tt>memberName</tt> for the Element as a member of the Package and specifies whether or not the Element is publicly visible as a member of the Package from outside the Package. The Element may be owned by the Membership, in which case it is an <tt>ownedMember</tt> of the Package, or it may be referenced but not owned, in which case it is effectively individually imported into the Package.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getMemberName <em>Member Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getMemberElement <em>Member Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningPackage <em>Membership Owning Package</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement_comp <em>Owned Member Element comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement <em>Owned Member Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership()
 * @model
 * @generated
 */
public interface Membership extends Relationship {
	/**
	 * Returns the value of the '<em><b>Member Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Member Name</em>' attribute.
	 * @see #setMemberName(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_MemberName()
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false"
	 * @generated
	 */
	String getMemberName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Membership#getMemberName <em>Member Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Name</em>' attribute.
	 * @see #getMemberName()
	 * @generated
	 */
	void setMemberName(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"public"</code>.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_Visibility()
	 * @model default="public" required="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the
	 * '{@link org.omg.sysml.lang.sysml.Membership#getVisibility
	 * <em>Visibility</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Member Element</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Element</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Element that becomes a <tt>member</tt> of the <tt>membershipOwningPackage</tt> due to this Membership.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member Element</em>' reference.
	 * @see #setMemberElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_MemberElement()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='membership'"
	 *        annotation="redefines"
	 * @generated
	 */
	Element getMemberElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Membership#getMemberElement <em>Member Element</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Element</em>' reference.
	 * @see #getMemberElement()
	 * @generated
	 */
	void setMemberElement(Element value);

	/**
	 * Returns the value of the '<em><b>Membership Owning Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Package#getOwnedMembership_comp <em>Owned Membership comp</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Membership Owning Package</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Package of which the <tt>memberElement</tt> becomes a <tt>member</tt> due to this Membership.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Membership Owning Package</em>' container reference.
	 * @see #setMembershipOwningPackage(org.omg.sysml.lang.sysml.Package)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_MembershipOwningPackage()
	 * @see org.omg.sysml.lang.sysml.Package#getOwnedMembership_comp
	 * @model opposite="ownedMembership_comp" transient="false" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Package getMembershipOwningPackage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningPackage <em>Membership Owning Package</em>}' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Membership Owning Package</em>' container reference.
	 * @see #getMembershipOwningPackage()
	 * @generated
	 */
	void setMembershipOwningPackage(org.omg.sysml.lang.sysml.Package value);

	/**
	 * Returns the value of the '<em><b>Owned Member Element comp</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwningMembership <em>Owning Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member Element comp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <tt>memberElement</tt> of this Membership if it is owned by the Membership as an <tt>ownedRelatedElement</tt>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member Element comp</em>' containment reference.
	 * @see #setOwnedMemberElement_comp(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_OwnedMemberElement_comp()
	 * @see org.omg.sysml.lang.sysml.Element#getOwningMembership
	 * @model opposite="owningMembership" containment="true" ordered="false"
	 * @generated
	 */
	Element getOwnedMemberElement_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement_comp <em>Owned Member Element comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Element comp</em>' containment reference.
	 * @see #getOwnedMemberElement_comp()
	 * @generated
	 */
	void setOwnedMemberElement_comp(Element value);

	/**
	 * Returns the value of the '<em><b>Owned Member Element</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getMemberElement() <em>Member Element</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement_comp() <em>Owned Related Element comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member Element</em>' reference.
	 * @see #setOwnedMemberElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_OwnedMemberElement()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	Element getOwnedMemberElement();

	/**
	 * Sets the value of the
	 * '{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement <em>Owned
	 * Member Element</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Owned Member Element</em>' reference.
	 * @see #getOwnedMemberElement()
	 * @generated
	 */
	void setOwnedMemberElement(Element value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" otherRequired="true" otherOrdered="false"
	 * @generated
	 */
	boolean isDistinguishableFrom(Membership other);

} // Membership
