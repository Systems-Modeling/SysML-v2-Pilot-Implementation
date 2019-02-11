/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Multiplicity#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Multiplicity#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Multiplicity#getFeatureWithMultiplicity <em>Feature With Multiplicity</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends Relationship {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' containment reference.
	 * @see #setLower(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity_Lower()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='lowerMultiplicity'"
	 * @generated
	 */
	Expression getLower();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Multiplicity#getLower <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' containment reference.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Expression value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' containment reference.
	 * @see #setUpper(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity_Upper()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='upperMultiplicity'"
	 * @generated
	 */
	Expression getUpper();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Multiplicity#getUpper <em>Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' containment reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Expression value);

	/**
	 * Returns the value of the '<em><b>Feature With Multiplicity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getMultiplicity <em>Multiplicity</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature With Multiplicity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature With Multiplicity</em>' container reference.
	 * @see #setFeatureWithMultiplicity(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity_FeatureWithMultiplicity()
	 * @see org.omg.sysml.lang.sysml.Feature#getMultiplicity
	 * @model opposite="multiplicity" transient="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName=' featureWith Multiplicity'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getFeatureWithMultiplicity();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Multiplicity#getFeatureWithMultiplicity <em>Feature With Multiplicity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature With Multiplicity</em>' container reference.
	 * @see #getFeatureWithMultiplicity()
	 * @generated
	 */
	void setFeatureWithMultiplicity(Feature value);

} // Multiplicity
