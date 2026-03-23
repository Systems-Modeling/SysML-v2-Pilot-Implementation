/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculation Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>CalculationDefinition</code> is an <coed>ActionDefinition</code> that also defines a <code>Function</code> producing a <code>result</code>.</p>
 * specializesFromLibrary('Calculations::Calculation')
 * calculation = action->selectByKind(CalculationUsage)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.CalculationDefinition#getCalculation <em>Calculation</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCalculationDefinition()
 * @model
 * @generated
 */
public interface CalculationDefinition extends ActionDefinition, Function {
	/**
	 * Returns the value of the '<em><b>Calculation</b></em>' reference list.
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
	 * <p>The <code>actions</code> of this <code>CalculationDefinition</code> that are <code>CalculationUsages</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calculation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCalculationDefinition_Calculation()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringCalculationDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<CalculationUsage> getCalculation();

} // CalculationDefinition
