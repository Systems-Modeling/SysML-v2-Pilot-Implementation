/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>SubjectMembership</code> is a <code>ParameterMembership</code> that indicates that its <code>ownedSubjectParameter</code> is the subject of its <code>owningType</code>. The <code>owningType</code> of a <code>SubjectMembership</code> must be a <code>RequirementDefinition</code>, <code>RequirementUsage</code>, <code>CaseDefinition</code>, or <code>CaseUsage</code>.</p>
 * owningType.oclIsType(RequirementDefinition) or
 * owningType.oclIsType(RequiremenCaseRequirementDefinition) or
 * owningType.oclIsType(CaseDefinition) or
 * owningType.oclIsType(CaseUsage)
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.SubjectMembership#getOwnedSubjectParameter <em>Owned Subject Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubjectMembership()
 * @model
 * @generated
 */
public interface SubjectMembership extends ParameterMembership {
	/**
	 * Returns the value of the '<em><b>Owned Subject Parameter</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ParameterMembership#getOwnedMemberParameter() <em>Owned Member Parameter</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Usage</code< that is the <code>ownedMemberParameter</code> of this <code>SubjectMembership</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subject Parameter</em>' reference.
	 * @see #setOwnedSubjectParameter(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubjectMembership_OwnedSubjectParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningSubjectMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Usage getOwnedSubjectParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.SubjectMembership#getOwnedSubjectParameter <em>Owned Subject Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Subject Parameter</em>' reference.
	 * @see #getOwnedSubjectParameter()
	 * @generated
	 */
	void setOwnedSubjectParameter(Usage value);

} // SubjectMembership
