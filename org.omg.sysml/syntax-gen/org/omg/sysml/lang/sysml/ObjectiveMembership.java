/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An ObjectiveMembership is a FeatureMembership that indicates that its <code>ownedObjectiveRequirement</code> is the objective RequirementUsage for its <code>owningType</code>. The <code>owningType</code> of an ObjectiveMembership must be a CaseDefinition or CaseUsage.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ObjectiveMembership#getOwnedObjectiveRequirement <em>Owned Objective Requirement</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getObjectiveMembership()
 * @model
 * @generated
 */
public interface ObjectiveMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Owned Objective Requirement</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature_comp() <em>Owned Member Feature comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The RequirementUsage that is the <p>ownedMemberFeature</p> of this RequirementUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Objective Requirement</em>' reference.
	 * @see #setOwnedObjectiveRequirement(RequirementUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getObjectiveMembership_OwnedObjectiveRequirement()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningObjectiveMembership'"
	 *        annotation="redefines"
	 * @generated
	 */
	RequirementUsage getOwnedObjectiveRequirement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ObjectiveMembership#getOwnedObjectiveRequirement <em>Owned Objective Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Objective Requirement</em>' reference.
	 * @see #getOwnedObjectiveRequirement()
	 * @generated
	 */
	void setOwnedObjectiveRequirement(RequirementUsage value);

} // ObjectiveMembership
