/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>ActorMembership</code> is a <code>ParameterMembership</code> that identifies a <code>PartUsage</code> as an <em>actor</em> <code>parameter</code>, which specifies a role played by an external entity in interaction with the <code>owningType</code> of the <code>ActorMembership</code>.</p>
 * owningType.oclIsKindOf(RequirementUsage) or
 * owningType.oclIsKindOf(RequirementDefinition) or
 * owningType.oclIsKindOf(CaseDefinition) or
 * owningType.oclIsKindOf(CaseUsage)
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ActorMembership#getOwnedActorParameter <em>Owned Actor Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getActorMembership()
 * @model
 * @generated
 */
public interface ActorMembership extends ParameterMembership {
	/**
	 * Returns the value of the '<em><b>Owned Actor Parameter</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ParameterMembership#getOwnedMemberParameter() <em>Owned Member Parameter</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>PartUsage</code> specifying the actor.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Actor Parameter</em>' reference.
	 * @see #setOwnedActorParameter(PartUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getActorMembership_OwnedActorParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningActorMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	PartUsage getOwnedActorParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ActorMembership#getOwnedActorParameter <em>Owned Actor Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Actor Parameter</em>' reference.
	 * @see #getOwnedActorParameter()
	 * @generated
	 */
	void setOwnedActorParameter(PartUsage value);

} // ActorMembership
