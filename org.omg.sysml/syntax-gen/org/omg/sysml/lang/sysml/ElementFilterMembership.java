/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Filter Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>ElementFilterMembership is a Mambership between a Namespace and a model-level evaluable Boolean Expression, asserting that imported <code>members</code> of the Namespace should be filtered using the <code>condition</code> Expression. A general Namespace does not define any specific filtering behavior, but such behavior may be defined for various specialized kinds of Namespaces.</p>
 * condition.isModelLevelEvaluable
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ElementFilterMembership#getCondition_comp <em>Condition comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ElementFilterMembership#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElementFilterMembership()
 * @model
 * @generated
 */
public interface ElementFilterMembership extends Membership {
	/**
	 * Returns the value of the '<em><b>Condition comp</b></em>' containment reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement_comp() <em>Owned Member Element comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The model-level evaluable Boolean Expression used to filter the <code>members</code> of the <code>membershipOwningNamespace</code> of this ElementFilterMembership.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition comp</em>' containment reference.
	 * @see #setCondition_comp(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElementFilterMembership_Condition_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningFilter'"
	 *        annotation="redefines"
	 * @generated
	 */
	Expression getCondition_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ElementFilterMembership#getCondition_comp <em>Condition comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition comp</em>' containment reference.
	 * @see #getCondition_comp()
	 * @generated
	 */
	void setCondition_comp(Expression value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElementFilterMembership_Condition()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ElementFilterMembership#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

} // ElementFilterMembership
