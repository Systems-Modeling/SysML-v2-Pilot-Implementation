/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Case Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A VerificationCaseUsage is a Usage of a VerificationCaseDefinition.</p>
 * 
 * <p>A VerificationCaseUsage must subset, directly or indirectly, either the base VerificationCaseUsage <code>verificationCases</code> from the Systems model library, if it is not owned by a VerificationCaseDefinition or VerificationCaseUsage, or the VerificationCaseUsage <code>subVerificationCases</code> inherited from its owner, otherwise.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.VerificationCaseUsage#getVerificationCaseDefinition <em>Verification Case Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getVerificationCaseUsage()
 * @model
 * @generated
 */
public interface VerificationCaseUsage extends CaseUsage {
	/**
	 * Returns the value of the '<em><b>Verification Case Definition</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.CaseUsage#getCaseDefinition() <em>Case Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The VerificationCase that defines this VerificationCaseUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification Case Definition</em>' reference.
	 * @see #setVerificationCaseDefinition(VerificationCaseDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getVerificationCaseUsage_VerificationCaseDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedVerificationCase'"
	 *        annotation="subsets"
	 * @generated
	 */
	VerificationCaseDefinition getVerificationCaseDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.VerificationCaseUsage#getVerificationCaseDefinition <em>Verification Case Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Case Definition</em>' reference.
	 * @see #getVerificationCaseDefinition()
	 * @generated
	 */
	void setVerificationCaseDefinition(VerificationCaseDefinition value);

} // VerificationCaseUsage
