/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.MetadataFeature#getMetadataFeatureValue <em>Metadata Feature Value</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeature()
 * @model
 * @generated
 */
public interface MetadataFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Metadata Feature Value</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMembership_comp() <em>Owned Membership comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Feature Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Feature Value</em>' reference.
	 * @see #setMetadataFeatureValue(MetadataFeatureValue)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeature_MetadataFeatureValue()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningMetadataFeature'"
	 *        annotation="redefines"
	 * @generated
	 */
	MetadataFeatureValue getMetadataFeatureValue();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MetadataFeature#getMetadataFeatureValue <em>Metadata Feature Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Feature Value</em>' reference.
	 * @see #getMetadataFeatureValue()
	 * @generated
	 */
	void setMetadataFeatureValue(MetadataFeatureValue value);

} // MetadataFeature
