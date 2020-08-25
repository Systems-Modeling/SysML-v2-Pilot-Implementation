/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Dependency is a Relationship that indicates that one or more <code>client</code> Elements require one more <code>supplier</code> Elements for their complete specification. In general, this means that a change to one of the <code>supplier</code> Elements may necessitate a change to, or re-specification of, the <code>client</code> Elements.</p>
 * 
 * <p>Note that a Dependency is entirely a model-level Relationship, without instance-level semantics.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Dependency#getClient <em>Client</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Dependency#getSupplier <em>Supplier</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends Relationship {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Element}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Element or Elements dependent on the <code>supplier</code> elements.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDependency_Client()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='clientDependency'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Element> getClient();

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Element}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Element or Elements on which the <code>client</code> Elements depend in some respect.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDependency_Supplier()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='supplierDependency'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Element> getSupplier();

} // Dependency
