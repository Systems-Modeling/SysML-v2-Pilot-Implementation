/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A MetadataFeature is an <code>ownedFeature</code> of an AnnotatingFeature that redefines a Feature of the <code>metadataType</code> and binds a value to it.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.MetadataFeature#getMetadataFeatureValue_comp <em>Metadata Feature Value comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.MetadataFeature#getMetadataFeatureValue <em>Metadata Feature Value</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeature()
 * @model
 * @generated
 */
public interface MetadataFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Metadata Feature Value comp</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.MetadataFeatureValue#getOwningMetadataFeature <em>Owning Metadata Feature</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMembership_comp() <em>Owned Membership comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Feature Value comp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The required MetadataFeatureValue for this MetadataFeature that gives the <code>metadataValue</code> for it in the context of its owning AnnotatingFeature.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata Feature Value comp</em>' containment reference.
	 * @see #setMetadataFeatureValue_comp(MetadataFeatureValue)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeature_MetadataFeatureValue_comp()
	 * @see org.omg.sysml.lang.sysml.MetadataFeatureValue#getOwningMetadataFeature
	 * @model opposite="owningMetadataFeature" containment="true" required="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	MetadataFeatureValue getMetadataFeatureValue_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MetadataFeature#getMetadataFeatureValue_comp <em>Metadata Feature Value comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Feature Value comp</em>' containment reference.
	 * @see #getMetadataFeatureValue_comp()
	 * @generated
	 */
	void setMetadataFeatureValue_comp(MetadataFeatureValue value);

	/**
	 * Returns the value of the '<em><b>Metadata Feature Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Feature Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Feature Value</em>' reference.
	 * @see #setMetadataFeatureValue(MetadataFeatureValue)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeature_MetadataFeatureValue()
	 * @model required="true" transient="true" volatile="true" derived="true"
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
