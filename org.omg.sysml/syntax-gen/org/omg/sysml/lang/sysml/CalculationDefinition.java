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
 * <p>A CalculationDefinition is an ActionDefinition that also defines a Function producing a <code>result</code>.</p>
 * 
 * <p>A CalculationDefinition must subclass, directly or indirectly, the base CalculationDefinition Calculation from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.CalculationDefinition#getCalculationUsage <em>Calculation Usage</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCalculationDefinition()
 * @model
 * @generated
 */
public interface CalculationDefinition extends ActionDefinition, Function {
	/**
	 * Returns the value of the '<em><b>Calculation Usage</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.CalculationUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ActionDefinition#getAction() <em>Action</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Function#getExpression() <em>Expression</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The CalculationUsage that are <code>actions</code> in this CalculationDefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calculation Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCalculationDefinition_CalculationUsage()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringCalculationDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<CalculationUsage> getCalculationUsage();

} // FunctionDefinition
