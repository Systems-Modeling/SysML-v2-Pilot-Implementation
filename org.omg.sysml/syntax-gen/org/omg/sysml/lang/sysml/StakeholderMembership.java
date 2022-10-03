/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stakeholder Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A StakeholderMembership is a ParameterMembership that identifies a PartUsage as a stakeholder parameter, which specifies a role played by an entity with Concerns framed by the parametered requirement.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.StakeholderMembership#getOwnedStakeholderParameter <em>Owned Stakeholder Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStakeholderMembership()
 * @model
 * @generated
 */
public interface StakeholderMembership extends ParameterMembership {
	/**
	 * Returns the value of the '<em><b>Owned Stakeholder Parameter</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ParameterMembership#getOwnedMemberParameter() <em>Owned Member Parameter</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The PartUsage specifying the stakeholder.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Stakeholder Parameter</em>' reference.
	 * @see #setOwnedStakeholderParameter(PartUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStakeholderMembership_OwnedStakeholderParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningStakeholderMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	PartUsage getOwnedStakeholderParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StakeholderMembership#getOwnedStakeholderParameter <em>Owned Stakeholder Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Stakeholder Parameter</em>' reference.
	 * @see #getOwnedStakeholderParameter()
	 * @generated
	 */
	void setOwnedStakeholderParameter(PartUsage value);

} // StakeholderMembership
