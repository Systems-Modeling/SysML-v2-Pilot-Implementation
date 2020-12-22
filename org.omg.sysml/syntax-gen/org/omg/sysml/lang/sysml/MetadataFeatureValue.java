/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Feature Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.MetadataFeatureValue#getMetadataValue_comp <em>Metadata Value comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.MetadataFeatureValue#getMetadataValue <em>Metadata Value</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeatureValue()
 * @model
 * @generated
 */
public interface MetadataFeatureValue extends FeatureValue {
	/**
	 * Returns the value of the '<em><b>Metadata Value comp</b></em>' containment reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureValue#getValue_comp() <em>Value comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Value comp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Value comp</em>' containment reference.
	 * @see #setMetadataValue_comp(MetadataExpression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeatureValue_MetadataValue_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='metadataValuation'"
	 *        annotation="redefines"
	 * @generated
	 */
	MetadataExpression getMetadataValue_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MetadataFeatureValue#getMetadataValue_comp <em>Metadata Value comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Value comp</em>' containment reference.
	 * @see #getMetadataValue_comp()
	 * @generated
	 */
	void setMetadataValue_comp(MetadataExpression value);

	/**
	 * Returns the value of the '<em><b>Metadata Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Value</em>' reference.
	 * @see #setMetadataValue(MetadataExpression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeatureValue_MetadataValue()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	MetadataExpression getMetadataValue();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MetadataFeatureValue#getMetadataValue <em>Metadata Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Value</em>' reference.
	 * @see #getMetadataValue()
	 * @generated
	 */
	void setMetadataValue(MetadataExpression value);

} // MetadataFeatureValue
