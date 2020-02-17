/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Constraint Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An AssertConstraintUsage is a ConstraintUsage that is also an Invariant and, so, is asserted to be true. The asserted ConstraintUsage (which may be the AssertConstraintUsage itself) is related to the AssertConstraintUsage by a Subsetting relationship.</p>
 * 
 * <p>If the AssertConstraintUsage is owned by a Part, then it also subsets the assertedConstraints property of that Part (as defined in the library model for Part), otherwise it subsets either "constraints", as required for a regular ConstraintUsage.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.AssertConstraintUsage#getAssertedConstraint <em>Asserted Constraint</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssertConstraintUsage()
 * @model
 * @generated
 */
public interface AssertConstraintUsage extends ConstraintUsage, Invariant {
	/**
	 * Returns the value of the '<em><b>Asserted Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ConstraintUsage to be performed by the AssertConstraintUsage. It is the subsetted element of the first owned Subsetting relationship of the AssertConstraintUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asserted Constraint</em>' reference.
	 * @see #setAssertedConstraint(ConstraintUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssertConstraintUsage_AssertedConstraint()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ConstraintUsage getAssertedConstraint();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.AssertConstraintUsage#getAssertedConstraint <em>Asserted Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asserted Constraint</em>' reference.
	 * @see #getAssertedConstraint()
	 * @generated
	 */
	void setAssertedConstraint(ConstraintUsage value);

} // AssertConstraintUsage
