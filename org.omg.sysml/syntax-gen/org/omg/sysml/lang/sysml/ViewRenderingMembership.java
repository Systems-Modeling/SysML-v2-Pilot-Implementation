/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Rendering Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ViewRenderingMembership</code> is a <coed>FeatureMembership</code> that identifies the <code>viewRendering</code> of a <code>ViewDefinition</code> or <code>ViewUsage</code>.</p>
 * referencedRendering =
 *     let reference: ReferenceSubsetting = 
 *         ownedRendering.ownedReferenceSubsetting in
 *     if reference = null then ownedRendering
 *     else if not reference.referencedFeature.oclIsKindOf(RenderingUsage) then null
 *     else reference.referencedFeature.oclAsType(RenderingUsage)
 *     endif
 * owningType.oclIsKindOf(ViewDefinition) or
 * owningType.oclIsKindOf(ViewUsage)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewRenderingMembership#getOwnedRendering <em>Owned Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewRenderingMembership#getReferencedRendering <em>Referenced Rendering</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewRenderingMembership()
 * @model
 * @generated
 */
public interface ViewRenderingMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Owned Rendering</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature() <em>Owned Member Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Rendering</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The owned <code>RenderingUsage</code> that is either itself the <code>referencedRendering</code> or subsets the <code>referencedRendering</code>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Rendering</em>' reference.
	 * @see #setOwnedRendering(RenderingUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewRenderingMembership_OwnedRendering()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewRenderingMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	RenderingUsage getOwnedRendering();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ViewRenderingMembership#getOwnedRendering <em>Owned Rendering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Rendering</em>' reference.
	 * @see #getOwnedRendering()
	 * @generated
	 */
	void setOwnedRendering(RenderingUsage value);

	/**
	 * Returns the value of the '<em><b>Referenced Rendering</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p> The <code>RenderingUsage</code> that is referenced through this <code>ViewRenderingMembership</code>. It is the <code>referencedFeature</code> of the <code>ownedReferenceSubsetting</code> for the <code>ownedRendering</code>, if there is one, and, otherwise, the <code>ownedRendering</code> itself.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Rendering</em>' reference.
	 * @see #setReferencedRendering(RenderingUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewRenderingMembership_ReferencedRendering()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referencingRenderingMembership'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	RenderingUsage getReferencedRendering();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ViewRenderingMembership#getReferencedRendering <em>Referenced Rendering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Rendering</em>' reference.
	 * @see #getReferencedRendering()
	 * @generated
	 */
	void setReferencedRendering(RenderingUsage value);

} // ViewRenderingMembership
