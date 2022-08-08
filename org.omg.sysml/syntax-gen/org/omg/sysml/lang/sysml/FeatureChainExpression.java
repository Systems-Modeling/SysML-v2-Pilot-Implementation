/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Chain Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A FeatureChainExpression is an OperatorExpression whose operator is <code>"."</code>, which resolves to the library Function <em><code>ControlFunctions::'.'</code></em>. It evaluates to the result of chaining the <code>result</code> Feature of its single <code>argument</code> Expression with its <code>targetFeature</code>.</p>
 * 
 * <p>The first two <code>members</code> of a FeatureChainExpression must be its single <code>argument</code> Expression and its <code>targetFeature</code>. Its only other <code>members</code> shall be those necessary to complete it as an InvocationExpression.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureChainExpression#getTargetFeature <em>Target Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureChainExpression()
 * @model
 * @generated
 */
public interface FeatureChainExpression extends OperatorExpression {

	/**
	 * Returns the value of the '<em><b>Target Feature</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getMember() <em>Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Feature that is accessed by this FeatureChainExpression, derived as its second <code>member</code> Feature (the first being its one <code>argument</code> Expression). This Feature must redefine the <em><code>target</code> Feature of the Function <em><code>ControlFunctions::'.'</code></em>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Feature</em>' reference.
	 * @see #setTargetFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureChainExpression_TargetFeature()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='chainExpression'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getTargetFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureChainExpression#getTargetFeature <em>Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Feature</em>' reference.
	 * @see #getTargetFeature()
	 * @generated
	 */
	void setTargetFeature(Feature value);
} // FeatureChainExpression
