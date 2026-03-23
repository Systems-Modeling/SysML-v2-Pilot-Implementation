/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ReferenceUsage</code> is a <code>Usage</code> that specifies a non-compositional (<code>isComposite = false</code>) reference to something. The <code>definition</code> of a <code>ReferenceUsage</code> can be any kind of <code>Classifier</code>, with the default being the top-level <code>Classifier</code> <code><em>Base::Anything</em></code> from the Kernel Semantic Library. This allows the specification of a generic reference without distinguishing if the thing referenced is an attribute value, item, action, etc.</p>
 * isReference
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getReferenceUsage()
 * @model
 * @generated
 */
public interface ReferenceUsage extends Usage {
} // ReferenceUsage
