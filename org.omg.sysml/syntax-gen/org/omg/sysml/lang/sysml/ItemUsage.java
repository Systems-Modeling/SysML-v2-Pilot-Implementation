/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An ItemUsage is a Usage whose type is a Class. Nominally, if the type is an ItemDefinition, an ItemUsage is a Usage of that ItemDefinition within a system. However, other types of Kernel Classes are also allowed, to permit use of Classes from the Kernel Library.</p>
 * 
 * <p>An ItemUsage must subset, directly or indirectly, the base ItemUsage <code>items</code> from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemUsage#getItemDefinition <em>Item Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemUsage()
 * @model
 * @generated
 */
public interface ItemUsage extends Usage {
	/**
	 * Returns the value of the '<em><b>Item Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Class}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Classes that are the types of this ItemUsage. Nominally, these are ItemDefinitions, but other kinds of Kernel Classes are also allowed, to permit use of Classes from the Kernel Library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemUsage_ItemDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedItem'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<org.omg.sysml.lang.sysml.Class> getItemDefinition();

} // ItemUsage
