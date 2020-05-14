/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A FunctionDefinition is an Activity that also defines a Function producing a <code>result</code>.</p>
 * 
 * <p>An Activity must subclass, directly or indirectly, the base FunctionDefinition FunctionInvocation from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FunctionDefinition#getFunctionInvocation <em>Function Invocation</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFunctionDefinition()
 * @model
 * @generated
 */
public interface FunctionDefinition extends Activity, Function {
	/**
	 * Returns the value of the '<em><b>Function Invocation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FunctionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Activity#getAction() <em>Action</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Function#getExpression() <em>Expression</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The FunctionUsages that are <code>actions</code> in this FunctionDefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function Invocation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFunctionDefinition_FunctionInvocation()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringFunctionDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<FunctionUsage> getFunctionInvocation();

} // FunctionDefinition
