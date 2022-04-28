/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owning Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An OwningMembership is a Membership that owns its <code>memberElement</code> as a <code>ownedRelatedElement</code>. The <code>ownedMemberElementM</code> becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>.
 * ownedMemberNames = ownedMember.elementNames
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.OwningMembership#getOwnedMemberNames <em>Owned Member Names</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.OwningMembership#getOwnedMemberElement <em>Owned Member Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwningMembership()
 * @model
 * @generated
 */
public interface OwningMembership extends Membership {
	/**
	 * Returns the value of the '<em><b>Owned Member Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getMemberNames() <em>Member Names</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The names of the <code>ownedMemberElement</code> in the <code>membershipOwningNamespace</code>, derived as the <code>memberNames</code> of the <code>ownedMemberElement</code>. This will include at least the <code>uuid</code> of the <code>ownedMemberElement</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member Names</em>' attribute list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwningMembership_OwnedMemberNames()
	 * @model dataType="org.omg.sysml.lang.types.String" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<String> getOwnedMemberNames();

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
	 * <p>The Element that becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code> due to this OwningMembership.</p>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member Element</em>' reference.
	 * @see #setOwnedMemberElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwningMembership_OwnedMemberElement()
	 * @see org.omg.sysml.lang.sysml.Element#getOwningMembership
	 * @model opposite="owningMembership" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
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
