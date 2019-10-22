/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Multiplicity</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Multiplicity#getLower_comp <em>Lower comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Multiplicity#getUpper_comp <em>Upper comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Multiplicity#getFeatureWithMultiplicity <em>Feature With Multiplicity</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Multiplicity#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Multiplicity#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends Relationship {
	/**
	 * Returns the value of the '<em><b>Lower comp</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Multiplicity#getLower() <em>Lower</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower comp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower comp</em>' containment reference.
	 * @see #setLower_comp(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity_Lower_comp()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='lowerMultiplicity'"
	 *        annotation="subsets"
	 * @generated
	 */
	Expression getLower_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Multiplicity#getLower_comp <em>Lower comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower comp</em>' containment reference.
	 * @see #getLower_comp()
	 * @generated
	 */
	void setLower_comp(Expression value);

	/**
	 * Returns the value of the '<em><b>Upper comp</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Multiplicity#getUpper() <em>Upper</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper comp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper comp</em>' containment reference.
	 * @see #setUpper_comp(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity_Upper_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='upperMultiplicity'"
	 *        annotation="subsets"
	 * @generated
	 */
	Expression getUpper_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Multiplicity#getUpper_comp <em>Upper comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper comp</em>' containment reference.
	 * @see #getUpper_comp()
	 * @generated
	 */
	void setUpper_comp(Expression value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement() <em>Owned Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' reference.
	 * @see #setLower(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity_Lower()
	 * @model annotation="subsets"
	 * @generated
	 */
	Expression getLower();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Multiplicity#getLower <em>Lower</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' reference.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Expression value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement() <em>Owned Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' reference.
	 * @see #setUpper(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity_Upper()
	 * @model required="true"
	 *        annotation="subsets"
	 * @generated
	 */
	Expression getUpper();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Multiplicity#getUpper <em>Upper</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Expression value);

	/**
	 * Returns the value of the '<em><b>Feature With Multiplicity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getMultiplicity_comp <em>Multiplicity comp</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature With Multiplicity</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature With Multiplicity</em>' container reference.
	 * @see #setFeatureWithMultiplicity(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity_FeatureWithMultiplicity()
	 * @see org.omg.sysml.lang.sysml.Feature#getMultiplicity_comp
	 * @model opposite="multiplicity_comp" transient="false" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 * @generated
	 */
	Feature getFeatureWithMultiplicity();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Multiplicity#getFeatureWithMultiplicity <em>Feature With Multiplicity</em>}' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Feature With Multiplicity</em>' container reference.
	 * @see #getFeatureWithMultiplicity()
	 * @generated
	 */
	void setFeatureWithMultiplicity(Feature value);

} // Multiplicity
