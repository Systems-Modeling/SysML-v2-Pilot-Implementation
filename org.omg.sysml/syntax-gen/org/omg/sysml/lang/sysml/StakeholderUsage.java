/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stakeholder Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A StakeholderUsage is a usage of a StakeholderDefinition. At least one of the types of a StakeholderUsage must be a StakeholderDefinition, but a StakeholderUsage may also be typed by PartDefinitions and ItemDefinitions that are not StakeholderDefinitions.</p>
 * 
 * <p>A StakeholderUsage must subset, directly or indirectly, the base StakeholderUsage <code>stakeholders</code> from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.StakeholderUsage#getStakeholderDefinition <em>Stakeholder Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStakeholderUsage()
 * @model
 * @generated
 */
public interface StakeholderUsage extends PartUsage {
	/**
	 * Returns the value of the '<em><b>Stakeholder Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.StakeholderDefinition}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.PartUsage#getPartDefinition() <em>Part Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>partDefinitions</code> of this StakeholderUsage that are StakeholderDefinitions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stakeholder Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStakeholderUsage_StakeholderDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedStakeholder'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<StakeholderDefinition> getStakeholderDefinition();

} // StakeholderUsage
