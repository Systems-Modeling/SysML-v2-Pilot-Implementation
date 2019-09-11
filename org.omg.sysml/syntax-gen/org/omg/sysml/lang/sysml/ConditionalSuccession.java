/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Succession</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ConditionalSuccession is a Succession with an added guard Expression. Sucession between the source and target of a ConditionalSuccession is only asserted if the guard is true. The source of a ConditionalSuccession must be a DecisionNode.
 * 
 * A ConditionalSuccession must subset the base "conditionalSucessions"  property from the Systems model library, which implies that it is typed by ConditionalHappensBefore or some subtype of it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ConditionalSuccession#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConditionalSuccession()
 * @model
 * @generated
 */
public interface ConditionalSuccession extends Succession {

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConditionalSuccession_Guard()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='conditionalSuccession'"
	 *        annotation="subsets"
	 * @generated
	 */
	Expression getGuard();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConditionalSuccession#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Expression value);
} // ConditionalSuccession
