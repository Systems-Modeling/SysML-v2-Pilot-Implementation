/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An IfActionUsage is an ActionUsage that is typed, directly or indirectly, by the ActionDefinition <em>IfThenAction</em> from the Systems model library, or, more specifically, by <em>IfThenElseAction<em>, if it has an <code>elseAction</code>. It specifies that the <code>thenClause</code> ActionUsage should be performed if the result of the <code>ifArgument</code> Expression is true. It may also optionally specify a <code>elseClause</code> ActionUsage that is performed if the resultof the <code>ifArgument</code> is false.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.IfActionUsage#getElseAction <em>Else Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.IfActionUsage#getThenAction <em>Then Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.IfActionUsage#getIfArgument <em>If Argument</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIfActionUsage()
 * @model
 * @generated
 */
public interface IfActionUsage extends ActionUsage {
	/**
	 * Returns the value of the '<em><b>Else Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ActionUsage that is to be performed if the result of the <code>ifArgument</code> is false. Derived as the FeatureValue for the redefined <em><code>elseClause</code><em> parameter of the IfActionUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Else Action</em>' reference.
	 * @see #setElseAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIfActionUsage_ElseAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ifElseAction'"
	 * @generated
	 */
	ActionUsage getElseAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.IfActionUsage#getElseAction <em>Else Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Action</em>' reference.
	 * @see #getElseAction()
	 * @generated
	 */
	void setElseAction(ActionUsage value);

	/**
	 * Returns the value of the '<em><b>Then Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ActionUsage that is to be performed if the result of the <code>ifArgument</code> is true. Derived as the FeatureValue for the redefined <em><code>thenClause</code><em> parameter of the IfActionUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Then Action</em>' reference.
	 * @see #setThenAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIfActionUsage_ThenAction()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ifthenAction'"
	 * @generated
	 */
	ActionUsage getThenAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.IfActionUsage#getThenAction <em>Then Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Action</em>' reference.
	 * @see #getThenAction()
	 * @generated
	 */
	void setThenAction(ActionUsage value);

	/**
	 * Returns the value of the '<em><b>If Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Expression whose result determines whether the <code>thenAction</code> or (optionally) the <code>elseAction</code> is performed. Derived as the FeatureValue for the redefined <em><code>ifTest</code><em> parameter of the IfActionUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>If Argument</em>' reference.
	 * @see #setIfArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIfActionUsage_IfArgument()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ifAction'"
	 * @generated
	 */
	Expression getIfArgument();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.IfActionUsage#getIfArgument <em>If Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Argument</em>' reference.
	 * @see #getIfArgument()
	 * @generated
	 */
	void setIfArgument(Expression value);

} // IfActionUsage
