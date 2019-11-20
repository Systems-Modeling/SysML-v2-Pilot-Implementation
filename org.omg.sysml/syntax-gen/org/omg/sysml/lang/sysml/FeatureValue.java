/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Feature
 * Value</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A FeatureValue is a FeatureMembership that identifies a particular member Expression that provides the value of the Feature that owns the FeatureValue. A FeatureValue requires that there be a BindingConnector between the Feature and the result of the Expression, enforcing the intended  semantics. A Feature can have at most one FeatureValue.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureValue#getFeatureWithValue <em>Feature With Value</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureValue#getValueConnector <em>Value Connector</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureValue#getValue_comp <em>Value comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureValue()
 * @model
 * @generated
 */
public interface FeatureValue extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Value comp</b></em>' containment reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature_comp() <em>Owned Member Feature comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value comp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value comp</em>' containment reference.
	 * @see #setValue_comp(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureValue_Value_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='expressedValuation'"
	 *        annotation="redefines"
	 * @generated
	 */
	Expression getValue_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureValue#getValue_comp <em>Value comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value comp</em>' containment reference.
	 * @see #getValue_comp()
	 * @generated
	 */
	void setValue_comp(Expression value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureValue_Value()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Feature With Value</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwningType() <em>Owning Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature With Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature With Value</em>' reference.
	 * @see #setFeatureWithValue(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureValue_FeatureWithValue()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='valuation'"
	 *        annotation="subsets"
	 * @generated
	 */
	Feature getFeatureWithValue();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureValue#getFeatureWithValue <em>Feature With Value</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature With Value</em>' reference.
	 * @see #getFeatureWithValue()
	 * @generated
	 */
	void setFeatureWithValue(Feature value);

	/**
	 * Returns the value of the '<em><b>Value Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Connector</em>' reference.
	 * @see #setValueConnector(BindingConnector)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureValue_ValueConnector()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featureValue'"
	 * @generated
	 */
	BindingConnector getValueConnector();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureValue#getValueConnector <em>Value Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Connector</em>' reference.
	 * @see #getValueConnector()
	 * @generated
	 */
	void setValueConnector(BindingConnector value);

} // FeatureValue
