/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Function</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Function represents the performance of a calculation that has a singular result. The calculation may be composed of multiple steps.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Function#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Function#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Behavior {

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Behavior#getStep() <em>Step</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The set of expressions that represent computational steps or parts of a system of equations within the Function.</p>
	 * <p>The set of expressions that represent computational steps or parts of a system of equations within the Function.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFunction_Expression()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='computedFunction'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Expression> getExpression();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Behavior#getParameter() <em>Parameter</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOutput() <em>Output</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The object or value that is the result of evaluating the Function.</p>
	 * 
	 * <p>The object or value that is the result of evaluating the Function.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(Parameter)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFunction_Result()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='computingFunction'"
	 *        annotation="subsets"
	 * @generated
	 */
	Parameter getResult();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Function#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Parameter value);
} // Function
