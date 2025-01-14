/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>IndexExpression</code> is an <code>OperatorExpression</code> whose operator is <code>"#"</code>, which resolves to the <code>Function</code> <em><code>BasicFunctions::'#'</code></em> from the Kernel Functions Library.</p>
 * operator = '#'
 * arguments->notEmpty() and 
 * not arguments->first().result.specializesFromLibrary('Collections::Array') implies
 *     result.specializes(arguments->first().result)
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIndexExpression()
 * @model
 * @generated
 */
public interface IndexExpression extends OperatorExpression {
} // IndexExpression
