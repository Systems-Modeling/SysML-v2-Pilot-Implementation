/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A BlockProperty is a Usage whose type is a Class. Nominally, if the type is a Block, a BlockProperty is a Usage of that Block within a system. However, non-Block Classes are also allowed, to permit use of Classes from the Kernel Library. A BlockProperty must be a PartProperty or a ReferenceProperty.
 * 
 * A BlockProperty must subset, directly or indirectly, the base PartProperty "parts" from the Systems model library.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.BlockProperty#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getBlockProperty()
 * @model abstract="true"
 * @generated
 */
public interface BlockProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Class}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getBlockProperty_Block()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedProperty'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<org.omg.sysml.lang.sysml.Class> getBlock();

} // BlockProperty
