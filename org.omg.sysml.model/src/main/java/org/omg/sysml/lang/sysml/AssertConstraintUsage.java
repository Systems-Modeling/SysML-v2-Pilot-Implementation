/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Constraint Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>AssertConstraintUsage</code> is a <code>ConstraintUsage</code> that is also an <code>Invariant</code> and, so, is asserted to be true (by default). Unless it is the <code>AssertConstraintUsage</code> itself, the asserted <code>ConstraintUsage</code> is related to the <code>AssertConstraintUsage</code> by a ReferenceSubsetting <code>Relationship</code>.</p>
 * assertedConstraint =
 *     if referencedFeatureTarget() = null then self
 *     else if referencedFeatureTarget().oclIsKindOf(ConstraintUsage) then
 *         referencedFeatureTarget().oclAsType(ConstraintUsage)
 *     else null
 *     endif endif
 * if isNegated then
 *     specializesFromLibrary('Constraints::negatedConstraintChecks')
 * else
 *     specializesFromLibrary('Constraints::assertedConstraintChecks')
 * endif
 * referencedFeaureTarget() <> null implies
 *     referencedFeatureTarget().oclIsKindOf(ConstraintUsage)
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
	 * <p>The <code>ConstraintUsage</code> to be performed by the <code>AssertConstraintUsage</code>. It is the <code>referenceFeature</code> of the <code>ownedReferenceSubsetting</code> for the <code>AssertConstraintUsage</code>, if there is one, and, otherwise, the <code>AssertConstraintUsage</code> itself.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asserted Constraint</em>' reference.
	 * @see #setAssertedConstraint(ConstraintUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssertConstraintUsage_AssertedConstraint()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='constraintAssertion'"
	 *        annotation="http://www.omg.org/spec/SysML"
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
