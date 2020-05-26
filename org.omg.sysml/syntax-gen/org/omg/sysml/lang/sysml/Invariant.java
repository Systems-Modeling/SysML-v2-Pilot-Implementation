/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Invariant is a BooleanExpression that is asserted to be true. This assertion is made by the Invariant having a BindingConnector as an owned Feature that binds the Invariant to the result of a LiteralBoolean with value "true".</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Invariant#getAssertionConnector <em>Assertion Connector</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInvariant()
 * @model
 * @generated
 */
public interface Invariant extends BooleanExpression {

	/**
	 * Returns the value of the '<em><b>Assertion Connector</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An owned Feature of the Invariant that is a BindingConnector between the Invariant and the result of a LiteralBoolean with value "true".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assertion Connector</em>' reference.
	 * @see #setAssertionConnector(BindingConnector)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInvariant_AssertionConnector()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='invariant'"
	 *        annotation="subsets"
	 * @generated
	 */
	BindingConnector getAssertionConnector();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Invariant#getAssertionConnector <em>Assertion Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion Connector</em>' reference.
	 * @see #getAssertionConnector()
	 * @generated
	 */
	void setAssertionConnector(BindingConnector value);
} // Invariant
