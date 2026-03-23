/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Constraint Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>RequirementConstraintMembership</code> is a <code>FeatureMembership</code> for an assumed or required <code>ConstraintUsage</code> of a <code>RequirementDefinition</code> or <code>RequirementUsage<code>.</p>
 * referencedConstraint =
 *     let referencedFeature : Feature = 
 *         ownedConstraint.referencedFeatureTarget() in
 *     if referencedFeature = null then ownedConstraint
 *     else if referencedFeature.oclIsKindOf(ConstraintUsage) then
 *         refrencedFeature.oclAsType(ConstraintUsage)
 *     else null
 *     endif endif
 * owningType.oclIsKindOf(RequirementDefinition) or
 * owningType.oclIsKindOf(RequirementUsage)
 * ownedConstraint.isComposite
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getKind <em>Kind</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getReferencedConstraint <em>Referenced Constraint</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementConstraintMembership()
 * @model
 * @generated
 */
public interface RequirementConstraintMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.RequirementConstraintKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether the <code>RequirementConstraintMembership</code> is for an assumed or required <code>ConstraintUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.RequirementConstraintKind
	 * @see #setKind(RequirementConstraintKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementConstraintMembership_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RequirementConstraintKind getKind();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.RequirementConstraintKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(RequirementConstraintKind value);

	/**
	 * Returns the value of the '<em><b>Owned Constraint</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature() <em>Owned Member Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ConstraintUsage</code> that is the <code>ownedMemberFeature</code> of this <code>RequirementConstraintMembership</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Constraint</em>' reference.
	 * @see #setOwnedConstraint(ConstraintUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementConstraintMembership_OwnedConstraint()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requirementConstraintMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ConstraintUsage getOwnedConstraint();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getOwnedConstraint <em>Owned Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Constraint</em>' reference.
	 * @see #getOwnedConstraint()
	 * @generated
	 */
	void setOwnedConstraint(ConstraintUsage value);

	/**
	 * Returns the value of the '<em><b>Referenced Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p> The <code>ConstraintUsage</code> that is referenced through this <code>RequirementConstraintMembership</code>. It is the <code>referencedFeature</code> of the <code>ownedReferenceSubsetting</code> of the <code>ownedConstraint</code>, if there is one, and, otherwise, the <code>ownedConstraint</code> itself.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Constraint</em>' reference.
	 * @see #setReferencedConstraint(ConstraintUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementConstraintMembership_ReferencedConstraint()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referencingConstraintMembership'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ConstraintUsage getReferencedConstraint();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getReferencedConstraint <em>Referenced Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Constraint</em>' reference.
	 * @see #getReferencedConstraint()
	 * @generated
	 */
	void setReferencedConstraint(ConstraintUsage value);

} // RequirementConstraintMembership
