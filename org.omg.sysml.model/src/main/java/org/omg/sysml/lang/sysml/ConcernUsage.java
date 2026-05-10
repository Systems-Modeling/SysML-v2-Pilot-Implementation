/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ConcernUsage</code> is a <code>Usage</code> of a <code>ConcernDefinition</code>.</p>
 * 
 *  The <code>ownedStakeholder</code> features of the ConcernUsage shall all subset the <em><code>ConcernCheck::concernedStakeholders</code> </em>feature. If the ConcernUsage is an <code>ownedFeature</code> of a StakeholderDefinition or StakeholderUsage, then the ConcernUsage shall have an <code>ownedStakeholder</code> feature that is bound to the <em><code>self</code></em> feature of its owner.</p>
 * 
 * specializesFromLibrary('Requirements::concernChecks')
 * owningFeatureMembership <> null and
 * owningFeatureMembership.oclIsKindOf(FramedConcernMembership) implies
 *     specializesFromLibrary('Requirements::RequirementCheck::concerns')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ConcernUsage#getConcernDefinition <em>Concern Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConcernUsage()
 * @model
 * @generated
 */
public interface ConcernUsage extends RequirementUsage {
	/**
	 * Returns the value of the '<em><b>Concern Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.RequirementUsage#getRequirementDefinition() <em>Requirement Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ConcernDefinition that is the single type of this ConcernUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concern Definition</em>' reference.
	 * @see #setConcernDefinition(ConcernDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConcernUsage_ConcernDefinition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedConcern'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ConcernDefinition getConcernDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConcernUsage#getConcernDefinition <em>Concern Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concern Definition</em>' reference.
	 * @see #getConcernDefinition()
	 * @generated
	 */
	void setConcernDefinition(ConcernDefinition value);

} // ConcernUsage
