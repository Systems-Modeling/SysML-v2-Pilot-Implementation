/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A VariantMembership is a Membership between a variation point Definition or Usage and a Usage that represents a variant in the context of that variation. The <code>membershipOwningPackage</code> for the VariantMembership must be either a Definition or a Usage with <code>isVariation</code> = <code>true</code>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.VariantMembership#getOwnedVariantUsage_comp <em>Owned Variant Usage comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.VariantMembership#getOwnedVariantUsage <em>Owned Variant Usage</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getVariantMembership()
 * @model
 * @generated
 */
public interface VariantMembership extends Membership {
	/**
	 * Returns the value of the '<em><b>Owned Variant Usage comp</b></em>' containment reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement_comp() <em>Owned Member Element comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Usage that represents a variant in the context of the <code>owningVariationDefinition</code> or <code>owningVariationUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Variant Usage comp</em>' containment reference.
	 * @see #setOwnedVariantUsage_comp(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getVariantMembership_OwnedVariantUsage_comp()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningVariantMembership'"
	 *        annotation="redefines"
	 * @generated
	 */
	Usage getOwnedVariantUsage_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.VariantMembership#getOwnedVariantUsage_comp <em>Owned Variant Usage comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Variant Usage comp</em>' containment reference.
	 * @see #getOwnedVariantUsage_comp()
	 * @generated
	 */
	void setOwnedVariantUsage_comp(Usage value);

	/**
	 * Returns the value of the '<em><b>Owned Variant Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Variant Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Variant Usage</em>' reference.
	 * @see #setOwnedVariantUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getVariantMembership_OwnedVariantUsage()
	 * @model transient="true" volatile="true" derived="true"
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
