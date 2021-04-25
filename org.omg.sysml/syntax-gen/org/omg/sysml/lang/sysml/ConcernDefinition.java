/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ConcernDefinition is a RequirementDefinition that one or more stakeholders may be interested in having addressed. These stakeholders are identified by the <code>ownedStakeholders</code>of the ConcernDefinition.</p>
 * 
 * <p>A ConcernDefinition must subclass, directly or indirectly, the base ConcernDefinition ConcernCheck from the Systems model library. The <code>ownedStakeholder</code> features of a ConcernDefinition shall all subset the <code>ConcernCheck::concernedStakeholders</code> feature.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConcernDefinition()
 * @model
 * @generated
 */
public interface ConcernDefinition extends RequirementDefinition {
} // ConcernDefinition
