/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>AttributeDefinition</code> is a <code>Definition</code> and a <code>DataType</code> of information about a quality or characteristic of a system or part of a system that has no independent identity other than its value. All <code>features</code> of an <code>AttributeDefinition</code> must be referential (non-composite).</p>
 * 
 * <p>As a <code>DataType</code>, an <code>AttributeDefinition</code> must specialize, directly or indirectly, the base <code>DataType</code> <code><em>Base::DataValue</em></code> from the Kernel Semantic Library.</p>
 * feature->forAll(not isComposite)
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAttributeDefinition()
 * @model
 * @generated
 */
public interface AttributeDefinition extends Definition, DataType {
} // AttributeDefinition
