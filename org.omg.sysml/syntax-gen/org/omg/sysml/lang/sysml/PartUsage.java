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
 * <p>A PartUsage is a usage of a PartDefinition to represent a composite part of a system. At least one of the types of the PartUsage must be a PartDefinition.</p>
 * 
 * <p>A PartUsage must subset, directly or indirectly, the base PartUsage <code>parts</code> from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.PartUsage#getPartDefinition <em>Part Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPartUsage()
 * @model
 * @generated
 */
public interface PartUsage extends ItemUsage {
	/**
	 * Returns the value of the '<em><b>Part Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PartDefinition}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ItemUsage#getItemDefinition() <em>Item Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>itemDefinitions</code> of this PartUsage that are PartDefinitions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPartUsage_PartDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedPart'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<PartDefinition> getPartDefinition();

} // BlockProperty
