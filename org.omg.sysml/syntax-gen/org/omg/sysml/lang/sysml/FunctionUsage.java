/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A FunctionUsage is an ActionUsage that is also an Expression, and, so, is typed by a Function. Nominally, if the type is a FunctionDefinition, a FuncitonUsage is a Usage of that FunctionDefinition within a system. However, non-FunctionDefinition Functions are also allowed, to permit use of Behaviors from the Kernel Library.</p>
 * 
 * <p>A FunctionUsage must subset, directly or indirectly, either the base FunctionUsage <code>funcitonInvocations</code> from the Systems model library, if it is not a composite feature, or the FunctionUsage <code>subfunctions</code> inherited from its owner, if it is a composite feature.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FunctionUsage#getFunctionDefinition <em>Function Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FunctionUsage#getFunctionOwningUsage <em>Function Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FunctionUsage#getFunctionOwningDefinition <em>Function Owning Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFunctionUsage()
 * @model
 * @generated
 */
public interface FunctionUsage extends ActionUsage, Expression {
	/**
	 * Returns the value of the '<em><b>Function Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Expression#getFunction() <em>Function</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ActionUsage#getActivity() <em>Activity</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Functions that are the types of this FunctionUsage. Nominally, these would be FunctionDefinitions, but non-FunctionDefinition Functions are also allowed, to permit use of Functions from the Kernel Library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function Definition</em>' reference.
	 * @see #setFunctionDefinition(Function)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFunctionUsage_FunctionDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='functionIUsage'"
	 *        annotation="redefines"
	 * @generated
	 */
	Function getFunctionDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FunctionUsage#getFunctionDefinition <em>Function Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Definition</em>' reference.
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	void setFunctionDefinition(Function value);

	/**
	 * Returns the value of the '<em><b>Function Owning Usage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getNestedFunction <em>Nested Function</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ActionUsage#getActionOwningUsage() <em>Action Owning Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Owning Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Owning Usage</em>' reference.
	 * @see #setFunctionOwningUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFunctionUsage_FunctionOwningUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getNestedFunction
	 * @model opposite="nestedFunction" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Usage getFunctionOwningUsage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FunctionUsage#getFunctionOwningUsage <em>Function Owning Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Owning Usage</em>' reference.
	 * @see #getFunctionOwningUsage()
	 * @generated
	 */
	void setFunctionOwningUsage(Usage value);

	/**
	 * Returns the value of the '<em><b>Function Owning Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Definition#getOwnedFunction <em>Owned Function</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ActionUsage#getActionOwningDefinition() <em>Action Owning Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Definition that owns this FunctionUsage (if any).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function Owning Definition</em>' reference.
	 * @see #setFunctionOwningDefinition(Definition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFunctionUsage_FunctionOwningDefinition()
	 * @see org.omg.sysml.lang.sysml.Definition#getOwnedFunction
	 * @model opposite="ownedFunction" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Definition getFunctionOwningDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FunctionUsage#getFunctionOwningDefinition <em>Function Owning Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Owning Definition</em>' reference.
	 * @see #getFunctionOwningDefinition()
	 * @generated
	 */
	void setFunctionOwningDefinition(Definition value);

} // FunctionUsage
