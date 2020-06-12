/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ReferenceUsage is a Usage that specifies a non-compositional (<code>isComposite</code> = <code>false</code>) reference to something. The type of a ReferenceUsage can be any kind of Classifier, with the default being the top-level Classifier Anything from the Kernel library. This allows the specification of a generic reference without distinguishing if the thing referenced is an attribute value, item, action, etc. All <code>features</code> of a ReferenceUsage must also have <code>isComposite</code> = <code>false</code>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ReferenceUsage#getReferenceType <em>Reference Type</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getReferenceUsage()
 * @model
 * @generated
 */
public interface ReferenceUsage extends Usage {

	/**
	 * Returns the value of the '<em><b>Reference Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Classifier}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The types of this ReferenceUsage, which must all be Classifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getReferenceUsage_ReferenceType()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedReference'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Classifier> getReferenceType();
} // ReferenceProperty
