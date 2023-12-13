/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>IfActionUsage</code> is an <code>ActionUsage</code> that specifies that the <code>thenAction</code> <code>ActionUsage</code> should be performed if the result of the <code>ifArgument</code> <code>Expression</code> is true. It may also optionally specify an <code>elseAction</code> <code>ActionUsage</code> that is performed if the result of the <code>ifArgument</code> is false.</p>
 * thenAction = 
 *     let parameter : Feature = inputParameter(2) in
 *     if parameter <> null and parameter.oclIsKindOf(ActionUsage) then
 *         parameter.oclAsType(ActionUsage)
 *     else
 *         null
 *     endif
 * isSubactionUsage() implies
 *     specializesFromLibrary('Actions::Action::ifSubactions')
 * if elseAction = null then
 *     specializesFromLibrary('Actions::ifThenActions')
 * else
 *     specializesFromLibrary('Actions::ifThenElseActions')
 * endif
 * ifArgument = 
 *     let parameter : Feature = inputParameter(1) in
 *     if parameter <> null and parameter.oclIsKindOf(Expression) then
 *         parameter.oclAsType(Expression)
 *     else
 *         null
 *     endif
 * elseAction = 
 *     let parameter : Feature = inputParameter(3) in
 *     if parameter <> null and parameter.oclIsKindOf(ActionUsage) then
 *         parameter.oclAsType(ActionUsage)
 *     else
 *         null
 *     endif
 * inputParameters()->size() >= 2
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
	 * <p>The <code>ActionUsage</code> that is to be performed if the result of the <code>ifArgument</code> is false. It is the (optional) third <code>parameter</code> of the <code>IfActionUsage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Else Action</em>' reference.
	 * @see #setElseAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIfActionUsage_ElseAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ifElseAction'"
	 *        annotation="http://www.omg.org/spec/SysML"
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
	 * <p>The <code>ActionUsage</code> that is to be performed if the result of the <code>ifArgument</code> is true. It is the second <code>parameter<code> of the <code>IfActionUsage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Then Action</em>' reference.
	 * @see #setThenAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIfActionUsage_ThenAction()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ifThenAction'"
	 *        annotation="http://www.omg.org/spec/SysML"
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
	 * <p>The <code>Expression</code> whose result determines whether the <code>thenAction</code> or (optionally) the <code>elseAction</code> is performed. It is the first <code>parameter<code> of the <code>IfActionUsage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>If Argument</em>' reference.
	 * @see #setIfArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIfActionUsage_IfArgument()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ifAction'"
	 *        annotation="http://www.omg.org/spec/SysML"
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
