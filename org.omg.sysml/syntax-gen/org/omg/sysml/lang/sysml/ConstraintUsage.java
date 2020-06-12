/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ConstraintUsage is a Usage that is also a BooleanExpression, and, so, is typed by a Predicate. Nominally, if the type is a ConstraintDefinition, a ConstraintUsage is a Usage of that ConstraintDefinition. However, other kinds of kernel Predicates are also allowed, to permit use of Predicates from the Kernel Library.</p>
 * 
 * <p>A ConstraintUsage (other than an AssertConstraintUsage owned by a Part) must subset, directly or indirectly, the base ConstraintUsage <code>constraintChecks</code> from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ConstraintUsage#getConstraintDefinition <em>Constraint Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConstraintUsage()
 * @model
 * @generated
 */
public interface ConstraintUsage extends Usage, BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Constraint Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.BooleanExpression#getPredicate() <em>Predicate</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The (single) Predicate the is the type of this Constraint Usage. Nominally, this will be ConstraintDefinition, but non-ConstraintDefinition Predicates are also allowed, to permit use of Predicates from the Kernel Library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Definition</em>' reference.
	 * @see #setConstraintDefinition(Predicate)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConstraintUsage_ConstraintDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedConstraint'"
	 *        annotation="redefines"
	 * @generated
	 */
	Predicate getConstraintDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConstraintUsage#getConstraintDefinition <em>Constraint Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Definition</em>' reference.
	 * @see #getConstraintDefinition()
	 * @generated
	 */
	void setConstraintDefinition(Predicate value);

} // ConstraintUsage
