/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owning Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>OwningMembership</code> is a <code>Membership</code> that owns its <code>memberElement</code> as a <code>ownedRelatedElement</code>. The <code>ownedMemberElement</code> becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>.</p>
 * 
 * ownedMemberName = ownedMemberElement.name
 * ownedMemberShortName = ownedMemberElement.shortName
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.OwningMembership#getOwnedMemberElementId <em>Owned Member Element Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.OwningMembership#getOwnedMemberShortName <em>Owned Member Short Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.OwningMembership#getOwnedMemberName <em>Owned Member Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.OwningMembership#getOwnedMemberElement <em>Owned Member Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwningMembership()
 * @model
 * @generated
 */
public interface OwningMembership extends Membership {
	/**
	 * Returns the value of the '<em><b>Owned Member Element Id</b></em>' attribute.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getMemberElementId() <em>Member Element Id</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>elementId</code> of the <code>ownedMemberElement</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member Element Id</em>' attribute.
	 * @see #setOwnedMemberElementId(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwningMembership_OwnedMemberElementId()
	 * @model dataType="org.omg.sysml.lang.types.String" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	String getOwnedMemberElementId();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.OwningMembership#getOwnedMemberElementId <em>Owned Member Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Element Id</em>' attribute.
	 * @see #getOwnedMemberElementId()
	 * @generated
	 */
	void setOwnedMemberElementId(String value);

	/**
	 * Returns the value of the '<em><b>Owned Member Short Name</b></em>' attribute.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getMemberShortName() <em>Member Short Name</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>shortName</code> of the <code>ownedMemberElement</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member Short Name</em>' attribute.
	 * @see #setOwnedMemberShortName(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwningMembership_OwnedMemberShortName()
	 * @model dataType="org.omg.sysml.lang.types.String" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	String getOwnedMemberShortName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.OwningMembership#getOwnedMemberShortName <em>Owned Member Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Short Name</em>' attribute.
	 * @see #getOwnedMemberShortName()
	 * @generated
	 */
	void setOwnedMemberShortName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Member Name</b></em>' attribute.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getMemberName() <em>Member Name</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>name</code> of the <code>ownedMemberElement</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member Name</em>' attribute.
	 * @see #setOwnedMemberName(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwningMembership_OwnedMemberName()
	 * @model dataType="org.omg.sysml.lang.types.String" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	String getOwnedMemberName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.OwningMembership#getOwnedMemberName <em>Owned Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Name</em>' attribute.
	 * @see #getOwnedMemberName()
	 * @generated
	 */
	void setOwnedMemberName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Member Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwningMembership <em>Owning Membership</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement() <em>Owned Related Element</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getMemberElement() <em>Member Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Element</code> that becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code> due to this <code>OwningMembership</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member Element</em>' reference.
	 * @see #setOwnedMemberElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwningMembership_OwnedMemberElement()
	 * @see org.omg.sysml.lang.sysml.Element#getOwningMembership
	 * @model opposite="owningMembership" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Element getOwnedMemberElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.OwningMembership#getOwnedMemberElement <em>Owned Member Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Element</em>' reference.
	 * @see #getOwnedMemberElement()
	 * @generated
	 */
	void setOwnedMemberElement(Element value);

} // OwningMembership
