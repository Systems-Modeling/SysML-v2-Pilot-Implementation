/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ConstraintUsage is a Usage that is also a BooleanExpression, and, so, is typed by a Predicate. Nominally, if the type is a ConstraintDefinition, a ConstraintUsage is a Usage of that ConstraintDefinition. However, non-ConstraintDefinition Predicates are also allowed, to permit use of Predicates from the Kernel Library.</p>
 * 
 * <p>A ConstraintUsage (other than an AssertConstraintUsage owned by a Part) must subset, directly or indirectly, the base ConstraintUsage <tt>constraintChecks</tt> from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ConstraintUsage#getConstraintDefinition <em>Constraint Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ConstraintUsage#getConstraintOwningUsage <em>Constraint Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ConstraintUsage#getConstraintOwningDefinition <em>Constraint Owning Definition</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Constraint Owning Usage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getNestedConstraint <em>Nested Constraint</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage() <em>Owning Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Owning Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Usage in which this ConstraintUsage is nested (if any)</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Owning Usage</em>' reference.
	 * @see #setConstraintOwningUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConstraintUsage_ConstraintOwningUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getNestedConstraint
	 * @model opposite="nestedConstraint" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Usage getConstraintOwningUsage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConstraintUsage#getConstraintOwningUsage <em>Constraint Owning Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Owning Usage</em>' reference.
	 * @see #getConstraintOwningUsage()
	 * @generated
	 */
	void setConstraintOwningUsage(Usage value);

	/**
	 * Returns the value of the '<em><b>Constraint Owning Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Definition#getOwnedConstraint <em>Owned Constraint</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getOwningDefinition() <em>Owning Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Owning Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Definition that owns this ConstraintUsage (if any)</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Owning Definition</em>' reference.
	 * @see #setConstraintOwningDefinition(Definition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConstraintUsage_ConstraintOwningDefinition()
	 * @see org.omg.sysml.lang.sysml.Definition#getOwnedConstraint
	 * @model opposite="ownedConstraint" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Definition getConstraintOwningDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConstraintUsage#getConstraintOwningDefinition <em>Constraint Owning Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Owning Definition</em>' reference.
	 * @see #getConstraintOwningDefinition()
	 * @generated
	 */
	void setConstraintOwningDefinition(Definition value);

} // ConstraintUsage
