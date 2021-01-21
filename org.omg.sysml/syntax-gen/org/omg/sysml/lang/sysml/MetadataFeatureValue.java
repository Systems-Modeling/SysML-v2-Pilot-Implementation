/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Feature Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A MetadataFeatureValue is a FeatureValue that binds a MetadataFeature to a <code>metadataValue</code> given by a model-level evaluable Expression.</p>
 * metadataValue.isModelLevelEvaluable
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.MetadataFeatureValue#getMetadataValue_comp <em>Metadata Value comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.MetadataFeatureValue#getOwningMetadataFeature <em>Owning Metadata Feature</em>}</li>
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
	 * <!-- begin-model-doc -->
	 * <p>The <code>value</code> of this MetadataFeatureValue, which must be given by a model-level evaluable Expression.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata Value comp</em>' containment reference.
	 * @see #setMetadataValue_comp(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeatureValue_MetadataValue_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='metadataValuation'"
	 *        annotation="redefines"
	 * @generated
	 */
	Expression getMetadataValue_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MetadataFeatureValue#getMetadataValue_comp <em>Metadata Value comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Value comp</em>' containment reference.
	 * @see #getMetadataValue_comp()
	 * @generated
	 */
	void setMetadataValue_comp(Expression value);

	/**
	 * Returns the value of the '<em><b>Owning Metadata Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.MetadataFeature#getMetadataFeatureValue_comp <em>Metadata Feature Value comp</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureValue#getFeatureWithValue() <em>Feature With Value</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningNamespace() <em>Membership Owning Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Metadata Feature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The MetadataFeature that owns a certain <code>metadataFeatureValue</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Metadata Feature</em>' container reference.
	 * @see #setOwningMetadataFeature(MetadataFeature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeatureValue_OwningMetadataFeature()
	 * @see org.omg.sysml.lang.sysml.MetadataFeature#getMetadataFeatureValue_comp
	 * @model opposite="metadataFeatureValue_comp" transient="false" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	MetadataFeature getOwningMetadataFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MetadataFeatureValue#getOwningMetadataFeature <em>Owning Metadata Feature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Metadata Feature</em>' container reference.
	 * @see #getOwningMetadataFeature()
	 * @generated
	 */
	void setOwningMetadataFeature(MetadataFeature value);

	/**
	 * Returns the value of the '<em><b>Metadata Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Value</em>' reference.
	 * @see #setMetadataValue(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeatureValue_MetadataValue()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Expression getMetadataValue();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MetadataFeatureValue#getMetadataValue <em>Metadata Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Value</em>' reference.
	 * @see #getMetadataValue()
	 * @generated
	 */
	void setMetadataValue(Expression value);

} // MetadataFeatureValue
