/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>VariantMembership</code> is a <code>Membership</code> between a variation point <code>Definition</code> or <code>Usage</code> and a <code>Usage</code> that represents a variant in the context of that variation. The <code>membershipOwningNamespace</code> for the <code>VariantMembership</code> must be either a Definition or a <code>Usage</code> with <code>isVariation = true</code>.</p>
 * membershipOwningNamespace.oclIsKindOf(Definition) and
 *     membershipOwningNamespace.oclAsType(Definition).isVariation or
 * membershipOwningNamespace.oclIsKindOf(Usage) and
 *     membershipOwningNamespace.oclAsType(Usage).isVariation
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.VariantMembership#getOwnedVariantUsage <em>Owned Variant Usage</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getVariantMembership()
 * @model
 * @generated
 */
public interface VariantMembership extends OwningMembership {
	/**
	 * Returns the value of the '<em><b>Owned Variant Usage</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.OwningMembership#getOwnedMemberElement() <em>Owned Member Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Usage</code> that represents a variant in the context of the <code>owningVariationDefinition</code> or <code>owningVariationUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Variant Usage</em>' reference.
	 * @see #setOwnedVariantUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getVariantMembership_OwnedVariantUsage()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningVariantMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Usage getOwnedVariantUsage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.VariantMembership#getOwnedVariantUsage <em>Owned Variant Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Variant Usage</em>' reference.
	 * @see #getOwnedVariantUsage()
	 * @generated
	 */
	void setOwnedVariantUsage(Usage value);

} // VariantMembership
