/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Invariant is a Boolean-valued Expression whose type is the predicate Condition from the Base model library. It represents a logical condition that is asserted to always be true in the context of the evaluation of the Invariant.</p>
 * 
 * <p>An Invariant must subset, directly or indirectly, the Expression "conditions" from the Base model library which is typed by the base Predicate Condition. As a result, an Invariant must always be typed by Condition or a subclass of Condition. An Invariant must also have a FeatureValue binding it to the LiteralExpression true.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInvariant()
 * @model
 * @generated
 */
public interface Invariant extends BooleanExpression {
} // Invariant
